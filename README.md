# DotBot.Aether.Sonic

Aether **Sonic** conduit — JBL PartyBox Stage 320 integration for [dotbot](https://github.com/andresharpe/dotbot-v3). Part of the [dotbot-aether](https://github.com/andresharpe/dotbot-aether) conduit plugin collection.

[![PowerShell 7.0+](https://img.shields.io/badge/PowerShell-7.0%2B-blue.svg)](https://github.com/PowerShell/PowerShell)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

## What It Does

Translates dotbot event bus events into JBL PartyBox light effects and sound cues. Controls light patterns (Neon, Loop, Bounce, Trim, Switch, Freeze, Custom), solid colors, brightness, speed, 4 light zones, 19 DJ sound effects, and 5 DJ audio filters — all via Bluetooth serial.

**Platform:** Windows only (Bluetooth serial requirement).

## Quick Start

```powershell
Import-Module ./src/DotBot.Aether.Sonic/DotBot.Aether.Sonic.psd1

# Discover and connect
Find-AetherSonic | Connect-AetherSonic

# Or use the native PartyBox functions directly
Find-PartyBoxDevice | Connect-PartyBoxDevice
Set-PartyBoxLightColor -Color Red
Invoke-PartyBoxSoundEffect -Effect Horn
Set-PartyBoxLightPattern -Pattern Neon
```

## Aether Contract Functions

Every Aether conduit exports these standard lifecycle functions:

- `Initialize-AetherSonic` — validate config and hardware reachability
- `Find-AetherSonic` — discover paired PartyBox speakers
- `Connect-AetherSonic` — bond to a discovered speaker
- `Disconnect-AetherSonic` — clean shutdown
- `Test-AetherSonic` — health check
- `Invoke-AetherSonicEvent` — handle an event bus event (the sink entry point)

## Native Functions (21)

### Connection
`Find-PartyBoxDevice`, `Connect-PartyBoxDevice`, `Disconnect-PartyBoxDevice`, `Test-PartyBoxConnection`, `Get-PartyBoxConfiguration`, `Start-PartyBoxDevice`, `Stop-PartyBoxDevice`, `Send-PartyBoxHeartbeat`

### Light Control
`Enable-PartyBoxLight`, `Disable-PartyBoxLight`, `Initialize-PartyBoxLights`, `Set-PartyBoxLightPattern`, `Set-PartyBoxLightColor`, `Set-PartyBoxLightBrightness`, `Set-PartyBoxLightSpeed`, `Set-PartyBoxLightZone`, `Set-PartyBoxColorMode`, `Get-PartyBoxLightStatus`

### Sound & DJ
`Invoke-PartyBoxSoundEffect`, `Set-PartyBoxDjFilter`, `Stop-PartyBoxDjFilter`

## Documentation

- [Protocol Specification](docs/jbl_partybox_stage_320_protocol_spec.md)
- [Architecture](docs/architecture.md)
- [BLE Power Control](docs/ble-power-control.md)

## Testing

```powershell
Invoke-Pester ./tests/Unit
Invoke-Pester ./tests/Integration           # requires speaker
Invoke-Pester ./tests/Integration -ExcludeTag 'Sound'  # lights only
```

## License

MIT — see [LICENSE](LICENSE)