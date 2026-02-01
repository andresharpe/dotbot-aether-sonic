# JblPartyBox Module Architecture

**Version**: 1.0  
**Date**: 2026-02-01

---

## Overview

The JblPartyBox PowerShell module provides programmatic control of JBL PartyBox Stage 320 speakers via Classic Bluetooth RFCOMM.

---

## System Architecture

```
PowerShell Module (JblPartyBox)
    │
    ├── Public Functions (19 cmdlets)
    │   └── User-facing API
    │
    ├── Private Functions
    │   └── Frame building, session management, error handling
    │
    └── RFCOMM Helper (jbl-rfcomm-helper.exe)
        │
        └── Classic Bluetooth RFCOMM/SPP
            │
            └── JBL PartyBox Stage 320
                └── GAIA Protocol Service
```

---

## Components

### PowerShell Module (`src/JblPartyBox/`)

| File | Purpose |
|------|---------|
| `JblPartyBox.psd1` | Module manifest (PS 7.0+, Windows only) |
| `JblPartyBox.psm1` | Module loader, constants, type definitions |

### Public Functions (`Public/`)

| Function | Description |
|----------|-------------|
| `Find-PartyBoxDevice` | Discover paired speakers |
| `Connect-PartyBoxDevice` | Establish RFCOMM connection |
| `Disconnect-PartyBoxDevice` | Close connection |
| `Test-PartyBoxConnection` | Check if connected |
| `Get-PartyBoxConfiguration` | Get session info |
| `Enable-PartyBoxLight` | Turn lights on |
| `Disable-PartyBoxLight` | Turn lights off |
| `Set-PartyBoxLightPattern` | Set light animation pattern |
| `Set-PartyBoxLightColor` | Set RGB color (auto Freeze+Static) |
| `Set-PartyBoxLightBrightness` | Set brightness level |
| `Set-PartyBoxLightSpeed` | Set animation speed |
| `Set-PartyBoxLightZone` | Enable/disable light zones |
| `Set-PartyBoxColorMode` | Set ColorLoop or Static mode |
| `Initialize-PartyBoxLights` | Initialize light subsystem |
| `Invoke-PartyBoxSoundEffect` | Play DJ sound effect |
| `Set-PartyBoxDjFilter` | Apply audio filter |
| `Stop-PartyBoxDjFilter` | Stop audio filter |
| `Get-PartyBoxLightStatus` | Query light state |
| `Send-PartyBoxHeartbeat` | Send keepalive |

### Private Functions (`Private/`)

| Function | Purpose |
|----------|---------|
| `New-PartyBoxFrame` | Build protocol frame bytes |
| `Invoke-PartyBoxCommand` | Send command via helper |
| `Test-PartyBoxSession` | Validate active session |
| `Write-PartyBoxError` | Standardized error handling |

### RFCOMM Helper (`tools/jbl-rfcomm-helper/`)

A .NET console application that handles Bluetooth RFCOMM communication:
- Device discovery via WinRT APIs
- RFCOMM socket connection management
- Bidirectional byte stream communication
- Runs as subprocess, communicates via stdin/stdout

---

## Connection Flow

```
1. Find-PartyBoxDevice
   └── Invokes helper with 'discover' command
   └── Returns devices with "GAIA" service name

2. Connect-PartyBoxDevice
   └── Starts helper process in interactive mode
   └── Establishes RFCOMM socket to speaker
   └── Automatically calls Initialize-PartyBoxLights

3. Initialize-PartyBoxLights
   └── Sends: OFF → ON → NEON sequence
   └── Required to activate light subsystem

4. [User commands...]
   └── Commands sent via helper stdin
   └── Responses read from helper stdout

5. Disconnect-PartyBoxDevice
   └── Terminates helper process
   └── Clears session state
```

---

## Protocol Details

See [jbl_partybox_stage_320_protocol_spec.md](./jbl_partybox_stage_320_protocol_spec.md) for complete command reference.

### Key Points

- All commands start with `0xAA` identifier byte
- Frame format: `[0xAA] [Command] [Length] [Payload...]`
- For solid colors: use Freeze pattern + Static mode + RGB color
- Order matters: Pattern → Mode → Color

---

## Testing

### Unit Tests (`tests/Unit/`)
- Mock-based tests for all public and private functions
- No hardware required

### Integration Tests (`tests/Integration/`)
- Requires actual PartyBox speaker
- Run with: `Invoke-Pester ./tests/Integration`
- Exclude sound: `-ExcludeTag 'Sound'`

---

## Requirements

- PowerShell 7.0 or later (pwsh)
- Windows 10/11
- .NET 8.0 Runtime (for RFCOMM helper)
- JBL PartyBox Stage 320 paired via Windows Bluetooth

---

**End of Architecture Document**
