# JBL PartyBox Stage 320 – Control Protocol Specification

**Version**: 4.0  
**Date**: 2026-02-01  
**Status**: VERIFIED - All commands tested on actual hardware

---

## Protocol Overview

The JBL PartyBox Stage 320 uses **Classic Bluetooth RFCOMM/SPP** for control (NOT Bluetooth Low Energy).

---

## Connection Method

### Transport
- **Classic Bluetooth RFCOMM** (Serial Port Profile)
- Service UUID: `00001101-0000-1000-8000-00805F9B34FB` (Standard SPP)
- The service appears as "GAIA" in Windows device enumeration

### Prerequisites
- Speaker must be **paired** with Windows via Settings > Bluetooth
- Only one controller (phone app OR Windows) should be active at a time
- Close JBL PartyBox app before connecting from Windows

---

## Command Frame Format

```
[0xAA] [Command] [PayloadLength] [Payload...]
```

| Field | Size | Description |
|-------|------|-------------|
| Identifier | 1 byte | `0xAA` - Start of frame marker |
| Command | 1 byte | Command type identifier |
| PayloadLength | 1 byte | Length of payload bytes (0-255) |
| Payload | 0-n bytes | Command-specific data |

---

## Command Reference

### Light Commands (0x33)

#### Main Switch
```
Lights ON:  AA 33 04 00 99 01 01
Lights OFF: AA 33 04 00 99 01 00
```

#### Light Patterns
```
AA 33 04 00 31 01 [pattern_id]
```

| ID | Pattern | Notes |
|----|---------|-------|
| 0 | OFF | Turns pattern off |
| 2 | NEON | Animated, good for initialization |
| 8 | CUSTOM | User-defined |
| 9 | LOOP | Animated |
| 10 | BOUNCE | Animated |
| 11 | TRIM | Animated |
| 12 | SWITCH | Requires ColorLoop mode |
| 13 | FREEZE | **Use for solid colors** |

**Not supported on Stage 320:** ROCK (1), CLUB (3), FLOW (4), RIPPLE (5), CROSS (6), FLASH (7)

#### Color Mode
```
AA 33 04 00 36 01 [mode]
```
| Mode | Value | Description |
|------|-------|-------------|
| ColorLoop | 0x00 | Cycles through colors |
| Static | 0x01 | Holds single color |

#### RGB Color (Simple Format)
```
AA 33 06 00 32 03 [R] [G] [B]
```
Sets RGB color directly. Works best with Freeze pattern + Static mode.

#### RGB Color (Full Format)
```
AA 33 09 00 36 01 01 32 03 [R] [G] [B]
```
Sets Static mode and RGB color in one command.

#### Brightness
```
AA 33 04 00 45 01 [level]
```
Level: 0-255 (0 = off, 255 = maximum)

#### Animation Speed
```
AA 33 04 00 46 01 [level]
```
Level: 0-255 (0 = slowest, 255 = fastest)

#### Light Zones
```
AA 33 04 00 [zone_id] 01 [on/off]
```
| Zone | ID | Description |
|------|----|-------------|
| Strobe | 0x33 | Strobe light |
| Eight | 0x38 | Figure-8 light |
| SideRing | 0x39 | Side ring dots |
| Stripe | 0x40 | Side panel strips |
| Star | 0x41 | Star light |
| StrobeUp | 0x42 | Upper strobe |
| StrobeDown | 0x43 | Lower strobe |
| Edge | 0x44 | Edge strip |

Value: 0x01 = ON, 0x00 = OFF

---

### DJ Sound Effects (0x55)

```
AA 55 01 [tone_id]
```

| ID | Effect | ID | Effect |
|----|--------|----|--------|
| 1 | Horn | 11 | Disco2 |
| 2 | Clapping | 12 | Disco3 |
| 3 | Scratch1 | 13 | Game |
| 4 | Scratch2 | 14 | Party |
| 5 | Scratch3 | 15 | Hey |
| 6 | Barking | 16 | HandsUp |
| 7 | Like | 17 | 1-2-3 |
| 8 | Boo | 18 | Jump |
| 9 | Ready | 19 | LetsGo |
| 10 | Disco1 | | |

---

### DJ Audio Filters (0x57)

```
AA 57 02 [filter_id] [level]
```

| ID | Filter | Description |
|----|--------|-------------|
| 0 | Cancel | Stop filter |
| 1 | Repeater | Beat repeat |
| 2 | Filter | Low-pass filter |
| 3 | Gater | Gate/stutter |
| 4 | Echo | Echo effect |
| 5 | Wipeout | Wipeout effect |

Level: 0-100 (intensity)

---

### System Commands

#### Light Status Request (0x31)
```
AA 31 00
```
Requests current light state. Speaker responds with status frame.

#### Heartbeat / Keepalive (0xEA)
```
AA EA 00
```
Send periodically to maintain connection.

---

## Usage Patterns

### Initialization Sequence (Required After Connect)
```
AA 33 04 00 99 01 00   # Lights OFF
AA 33 04 00 99 01 01   # Lights ON  
AA 33 04 00 31 01 02   # Pattern NEON (initializes light system)
```

### Setting a Solid Color
For reliable solid colors, set Freeze pattern + Static mode first:
```
AA 33 04 00 31 01 0D   # Pattern FREEZE
AA 33 04 00 36 01 01   # Mode STATIC
AA 33 06 00 32 03 FF 00 00   # Color RED
```

### Named Color Presets
| Color | R | G | B |
|-------|---|---|---|
| Red | FF | 00 | 00 |
| Green | 00 | FF | 00 |
| Blue | 00 | 00 | FF |
| Orange | FF | 80 | 00 |
| Yellow | FF | FF | 00 |
| Purple | 80 | 00 | FF |
| Cyan | 00 | FF | FF |
| White | FF | FF | FF |
| Pink | FF | 69 | B4 |
| Lime | 80 | FF | 00 |
| Teal | 00 | 80 | 80 |
| Magenta | FF | 00 | 80 |

---

## Implementation Notes

### Timing
- Allow ~300ms between commands for reliability
- Sound effects can be triggered in rapid succession

### Solid Color Tips
- Always use Freeze pattern + Static mode for predictable solid colors
- Order matters: Pattern first, then Mode, then Color
- The SWITCH pattern requires ColorLoop mode to animate

### Connection Tips  
- Close JBL PartyBox mobile app before connecting
- If connection fails, power cycle the speaker
- Speaker appears as "GAIA" service in Bluetooth enumeration

---

**End of Specification**
