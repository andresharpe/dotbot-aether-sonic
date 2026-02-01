# JBL PartyBox Stage 320 – BLE Lighting Control

**Purpose**
This document specifies how to programmatically control lighting effects on JBL PartyBox Stage 320 speakers from Windows using PowerShell (pwsh) via Bluetooth Low Energy (BLE). It is intended for automation agents / coding bots to implement discovery, targeting, and command execution without user interaction (no button presses).

---

## Scope
- Control **lighting modes/effects** (not audio playback)
- **PowerShell 7.x or newer only** (Core / cross-platform pwsh)
- Windows 10/11 host
- BLE (GATT) control plane
- No firmware modification
- No Android device required at runtime

### Implementation Conventions
All PowerShell code **must follow existing repository patterns** for:
- `repos\TextPrinter`
- `repos\Hue`
- `repos\Pixoo`

This includes:
- Module layout and naming conventions
- Logging and verbosity patterns
- Error handling and retry behavior
- HTTP/BLE abstraction style
- Configuration via hashtables or JSON where applicable

---

## Architecture Overview

```
Windows (PowerShell)
  └─ WinRT BLE APIs
      └─ GATT Write
          └─ JBL PartyBox Stage 320
              └─ Vendor Control Service (GAIA-style)
```

- Audio uses Bluetooth Classic (A2DP) and is **out of scope**
- Lighting uses **BLE GATT write-only commands**

---

## Device Discovery & Targeting

### Discovery
- Enumerate BLE devices via WinRT
- Filter by device name containing:
  - `JBL PARTYBOX`
  - `STAGE 320`

### Identification
- Each speaker has a unique BLE address (MAC)
- Maintain a static mapping for deterministic control:

```powershell
$PartyBoxMap = @{
  Left  = '74:13:86:11:1D:C8'
  Right = '5A:67:3D:51:EA:38'
}
```

### Notes
- Multiple speakers can be controlled independently
- Only **one BLE controller** should be active at a time (close JBL app / nRF tools)

---

## BLE GATT Specification

### Vendor Control Service

| Item | Value |
|----|----|
| Service UUID | `00001100-d102-11e1-9b23-00025b00a5a5` |
| Description | JBL/Harman vendor control service (GAIA-style) |

### Characteristics

| Purpose | UUID | Properties |
|----|----|----|
| **Command Input** | `00001101-d102-11e1-9b23-00025b00a5a5` | WRITE |
| State / Status (unused) | `00001102-d102-11e1-9b23-00025b00a5a5` | READ, NOTIFY |
| High-rate / sync (unused) | `00001103-d102-11e1-9b23-00025b00a5a5` | WRITE_NO_RESPONSE, NOTIFY |

> Only `00001101` is required for lighting control.

---

## Command Transport

- ATT **Write Request** (opcode `0x12`)
- Write target: **Characteristic `00001101`**
- No response or acknowledgment payload is required
- Rate limit writes to ~1 per second

---

## Command Payload Format

Commands observed via HCI snoop follow a GAIA-style binary frame.

### Example Captured Payload

```
02 01 00 08 00 04 00 12 30 00 11
```

### Interpretation (High Confidence)

| Byte(s) | Meaning |
|------|--------|
| `02` | Command group (lighting / effects) |
| `01` | Command ID (mode select) |
| `00` | Flags |
| `08 00` | Payload length |
| `04 00` | Feature / subcommand |
| `12 30 00 11` | Parameters (mode, speed, brightness, checksum/terminator) |

> Full semantic decoding is **not required** to replay commands.

---

## Command Replay Rule

To reproduce an effect:
- Send the **exact byte sequence** to characteristic `00001101`
- Do **not** prepend headers or frame metadata

### Valid Write (PowerShell Byte Array)

```powershell
@(0x02,0x01,0x00,0x08,0x00,0x04,0x00,0x12,0x30,0x00,0x11)
```

---

## PowerShell Implementation Requirements

### Runtime
- **PowerShell 7.x+ required** (`pwsh`, not Windows PowerShell 5.1)
- Use .NET / WinRT interop consistent with other repos

### APIs
- Use WinRT:
  - `Windows.Devices.Bluetooth.BluetoothLEDevice`
  - `Windows.Devices.Bluetooth.GenericAttributeProfile`

### Coding Style (Mandatory)
- Follow patterns established in:
  - `repos\TextPrinter`
  - `repos\Hue`
  - `repos\Pixoo`

Specifically:
- Functions are idempotent where possible
- Clear separation between:
  - device discovery
  - command construction
  - command transport
- No global state except explicit device maps
- Verbose / debug output gated behind switches

### Steps
1. Resolve BLE device by address or alias
2. Open GATT service `00001100`
3. Get characteristic `00001101`
4. Write payload bytes
5. Dispose device

### Error Handling
- If write fails or device disconnects:
  - Back off 1–2 seconds
  - Retry once
- Do not spam writes

---

## Example High-Level API

```powershell
Set-JBLStage320Light \
  -Device Left \
  -Payload @(0x02,0x01,0x00,0x08,0x00,0x04,0x00,0x12,0x30,0x00,0x11)
```

Optional abstraction:

```powershell
Set-JBLStage320Light -Device Left -Mode Pulse
```

(where `-Mode` maps to a known payload table)

---

## Payload Discovery (One-Time)

To discover additional modes:
- Enable **Bluetooth HCI snoop** on Android
- Change light modes in JBL PartyBox app
- Extract snoop via:

```
adb bugreport
```

- Path inside ZIP:

```
FS/data/log/bt/btsnoop_hci.log
```

- Inspect in Wireshark:

```
btatt.opcode == 0x12 || btatt.opcode == 0x52
```

- Capture payloads written to handle corresponding to `00001101`

---

## Security & Safety Notes

- No firmware flashing
- No authentication bypass
- Same control plane as official app
- Worst-case failure: BLE disconnect

---

## Non-Goals

- Audio playback control
- Firmware updates
- PartyBoost speaker grouping
- Cross-brand compatibility

---

## Status

- BLE service and characteristic **confirmed**
- Command replay **validated via HCI snoop**
- Windows PowerShell control **feasible and supported**

---

## Appendix A – UUID Reference

```text
Service:        00001100-d102-11e1-9b23-00025b00a5a5
Command Write:  00001101-d102-11e1-9b23-00025b00a5a5
```

---

**End of Spec**

