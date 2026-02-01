# JBL PartyBox Stage 320 – Control Protocol Specification

**Version**: 3.0  
**Date**: 2026-01-31  
**Status**: VERIFIED - All commands tested on actual hardware

---

## Protocol Discovery Summary

The JBL PartyBox Stage 320 uses **Classic Bluetooth RFCOMM/SPP** for control, NOT Bluetooth Low Energy (BLE).

---

## Connection Method

### Transport
- **Classic Bluetooth RFCOMM** (Serial Port Profile)
- Service UUID: `00001101-0000-1000-8000-00805F9B34FB` (Standard SPP)
- The service appears as "GAIA" in Windows device enumeration

### Prerequisites
- Speakers must be **paired** with Windows via Settings > Bluetooth
- Only one controller (phone app OR Windows) should be active at a time

---

## Command Frame Format

```
[0xAA] [Command] [PayloadLength] [Payload...]
```

| Field | Size | Value | Description |
|-------|------|-------|-------------|
| Identifier | 1 byte | `0xAA` | Start of frame marker |
| Command | 1 byte | varies | Command type identifier |
| PayloadLength | 1 byte | 0-255 | Length of payload bytes |
| Payload | 0-n bytes | varies | Command-specific data |

---

## VERIFIED WORKING COMMANDS

### 1. Lights On/Off (Command 0x33)

```
Lights ON:  AA 33 04 00 99 01 01
Lights OFF: AA 33 04 00 99 01 00
```

### 2. Light Patterns (Command 0x33)

```
AA 33 04 00 31 01 [pattern_id]
```

**Stage 320 Supported Patterns:**
| ID | Pattern | Status |
|----|---------|--------|
| 2 | NEON | ✅ Working |
| 9 | LOOP | ✅ Working |
| 10 | BOUNCE | ✅ Working |
| 11 | TRIM | ✅ Working |
| 12 | SWITCH | ✅ Working |
| 13 | FREEZE | ✅ Working (use for solid colors) |

**NOT supported on Stage 320:** ROCK (1), CLUB (3), FLOW (4), RIPPLE (5), CROSS (6), FLASH (7)

### 3. Solid Colors (FREEZE + Color)

**Important:** To set a solid color, you MUST:
1. First initialize with a pattern (e.g., NEON)
2. Send FREEZE pattern (13)
3. Send the color command

**Initialization sequence (required once after connect):**
```
AA 33 04 00 99 01 00   (OFF)
AA 33 04 00 99 01 01   (ON)
AA 33 04 00 31 01 02   (NEON - initializes light system)
```

**To change solid colors:**
```
AA 33 04 00 31 01 0D                      (FREEZE)
AA 33 09 00 36 01 01 32 03 [R] [G] [B]    (Color)
```

**Color Examples:**
| Color | Command |
|-------|--------|
| Red | `AA 33 09 00 36 01 01 32 03 FF 00 00` |
| Green | `AA 33 09 00 36 01 01 32 03 00 FF 00` |
| Blue | `AA 33 09 00 36 01 01 32 03 00 00 FF` |
| Yellow | `AA 33 09 00 36 01 01 32 03 FF FF 00` |
| Cyan | `AA 33 09 00 36 01 01 32 03 00 FF FF` |
| Magenta | `AA 33 09 00 36 01 01 32 03 FF 00 FF` |
| White | `AA 33 09 00 36 01 01 32 03 FF FF FF` |
| Orange | `AA 33 09 00 36 01 01 32 03 FF 80 00` |

### 4. DJ Sound Effects (Command 0x55)

```
AA 55 01 [tone_id]
```

| ID | Sound Effect | Status |
|----|--------------|--------|
| 1 | HORN | ✅ Working |
| 2 | CLAPPING | ✅ Working |
| 3 | SCRATCH_1 | ✅ Working |
| 4 | SCRATCH_2 | ✅ Working |
| 5 | SCRATCH_3 | ✅ Working |
| 6 | BARKING | ✅ Working |
| 7 | LIKE | ✅ Working |
| 8 | BOO | ✅ Working |
| 9 | READY | ✅ Working |
| 10 | DISCO1 | ✅ Working |
| 11 | DISCO2 | ✅ Working |
| 12 | DISCO3 | ✅ Working |
| 13 | GAME | ✅ Working |
| 14 | PARTY | ✅ Working |
| 15 | HEY | ✅ Working |
| 16 | HANDS_UP | ✅ Working |
| 17 | 123 | ✅ Working |
| 18 | JUMP | ✅ Working |
| 19 | LETS_GO | ✅ Working |

---

## Quick Reference

### Minimal Working Example (C#)

```csharp
// Connect via RFCOMM to "GAIA" service
// Send these commands:

byte[] LightsOff = [0xaa, 0x33, 0x04, 0x00, 0x99, 0x01, 0x00];
byte[] LightsOn = [0xaa, 0x33, 0x04, 0x00, 0x99, 0x01, 0x01];
byte[] PatternNeon = [0xaa, 0x33, 0x04, 0x00, 0x31, 0x01, 0x02];
byte[] PatternFreeze = [0xaa, 0x33, 0x04, 0x00, 0x31, 0x01, 0x0d];
byte[] ColorRed = [0xaa, 0x33, 0x09, 0x00, 0x36, 0x01, 0x01, 0x32, 0x03, 0xff, 0x00, 0x00];
byte[] SoundHorn = [0xaa, 0x55, 0x01, 0x01];

// Initialize
Send(LightsOff);
Send(LightsOn);
Send(PatternNeon);  // Required to initialize light system

// Set solid red
Send(PatternFreeze);
Send(ColorRed);

// Play sound
Send(SoundHorn);
```

---

## Implementation Notes

### Timing
- Allow ~300ms between commands
- Send FREEZE immediately before each color change

### Solid Color Gotcha
- Colors will show as patterns (not solid) unless FREEZE is sent first
- FREEZE "locks" the current color state
- Must re-send FREEZE before each color change

---

**End of Specification**
