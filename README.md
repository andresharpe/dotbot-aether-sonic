# JblPartyBox

PowerShell module for controlling JBL PartyBox Stage 320 speakers via Bluetooth.

## Features

- **Light Control** - Patterns, colors, brightness, speed, zones
- **DJ Sound Effects** - 19 built-in sounds (horn, scratch, party, etc.)
- **DJ Audio Filters** - Repeater, filter, gater, echo, wipeout
- **Full Automation** - No app required, scriptable control

## Requirements

- PowerShell 7.0+ (pwsh)
- Windows 10/11
- JBL PartyBox Stage 320 paired via Windows Bluetooth

## Installation

```powershell
# Clone the repository
git clone https://github.com/andresharpe/JblPartyBox.git

# Import the module
Import-Module ./src/JblPartyBox/JblPartyBox.psd1
```

## Quick Start

```powershell
# Import module
Import-Module ./src/JblPartyBox/JblPartyBox.psd1

# Find and connect to speaker
Find-PartyBoxDevice | Connect-PartyBoxDevice

# Set a solid color
Set-PartyBoxLightColor -Color Red

# Change to blue
Set-PartyBoxLightColor -Color Blue

# Play a sound effect
Invoke-PartyBoxSoundEffect -Effect Horn

# Set an animated pattern
Set-PartyBoxLightPattern -Pattern Neon

# Disconnect when done
Disconnect-PartyBoxDevice
```

## API Reference

### Connection

| Function | Description |
|----------|-------------|
| `Find-PartyBoxDevice` | Discover paired speakers |
| `Connect-PartyBoxDevice` | Connect to speaker |
| `Disconnect-PartyBoxDevice` | Disconnect |
| `Test-PartyBoxConnection` | Check connection status |

### Lights

| Function | Description |
|----------|-------------|
| `Enable-PartyBoxLight` | Turn lights on |
| `Disable-PartyBoxLight` | Turn lights off |
| `Set-PartyBoxLightPattern` | Set pattern (Off, Neon, Loop, Bounce, Trim, Switch, Freeze, Custom) |
| `Set-PartyBoxLightColor` | Set color by name or RGB |
| `Set-PartyBoxLightBrightness` | Set brightness (0-255) |
| `Set-PartyBoxLightSpeed` | Set animation speed (0-255) |
| `Set-PartyBoxLightZone` | Enable/disable light zones |
| `Set-PartyBoxColorMode` | Set ColorLoop or Static mode |

### Sound & DJ

| Function | Description |
|----------|-------------|
| `Invoke-PartyBoxSoundEffect` | Play sound (Horn, Scratch1-3, Party, etc.) |
| `Set-PartyBoxDjFilter` | Apply filter (Repeater, Filter, Gater, Echo, Wipeout) |
| `Stop-PartyBoxDjFilter` | Stop active filter |

## Examples

### Solid Colors

```powershell
# Set-PartyBoxLightColor automatically uses Freeze+Static for solid colors
Set-PartyBoxLightColor -Color Red
Set-PartyBoxLightColor -Color Blue
Set-PartyBoxLightColor -Color Purple

# Or use RGB values
Set-PartyBoxLightColor -Red 255 -Green 128 -Blue 0  # Orange
```

### Available Colors

Red, Green, Blue, Orange, Yellow, Purple, Cyan, White, Pink, Lime, Teal, Magenta

### Animated Patterns

```powershell
# Set pattern with color cycling
Set-PartyBoxLightPattern -Pattern Neon
Set-PartyBoxColorMode -Mode ColorLoop

# Or single color animation
Set-PartyBoxLightPattern -Pattern Loop
Set-PartyBoxLightColor -Color Blue -KeepCurrentPattern
```

### Light Zones

```powershell
# The Stage 320 has 4 main zones
Set-PartyBoxLightZone -Zone Eight -Enabled $true      # Figure-8 light
Set-PartyBoxLightZone -Zone SideRing -Enabled $true   # Side dots
Set-PartyBoxLightZone -Zone Edge -Enabled $true       # Edge strip
Set-PartyBoxLightZone -Zone Stripe -Enabled $true     # Side panels
```

### DJ Sound Effects

```powershell
Invoke-PartyBoxSoundEffect -Effect Horn
Invoke-PartyBoxSoundEffect -Effect Party
Invoke-PartyBoxSoundEffect -Effect Scratch1
Invoke-PartyBoxSoundEffect -Effect LetsGo
```

### DJ Audio Filters

```powershell
# Apply filter while music is playing
Set-PartyBoxDjFilter -Filter Echo -Level 50
Set-PartyBoxDjFilter -Filter Repeater -Level 75

# Stop filter
Stop-PartyBoxDjFilter
```

## Testing

```powershell
# Run all unit tests
Invoke-Pester ./tests/Unit

# Run integration tests (requires speaker)
Invoke-Pester ./tests/Integration

# Run integration without sound effects
Invoke-Pester ./tests/Integration -ExcludeTag 'Sound'
```

## Documentation

- [Protocol Specification](docs/jbl_partybox_stage_320_protocol_spec.md) - Complete command reference
- [Architecture](docs/architecture.md) - Module design and components

## Troubleshooting

**Speaker not found**
- Ensure speaker is paired in Windows Bluetooth settings
- Close JBL PartyBox mobile app (only one controller at a time)

**Connection fails**
- Power cycle the speaker
- Re-pair via Windows Bluetooth settings

**Colors not showing correctly**
- `Set-PartyBoxLightColor` automatically sets Freeze+Static mode
- Use `-KeepCurrentPattern` to preserve current pattern

## License

MIT
