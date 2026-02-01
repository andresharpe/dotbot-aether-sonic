# JblPartyBox Module - Completion Guide

**Status**: All 40+ source files created. Module loads and exports 19 functions.
**Remaining**: Fix two issues that require a Windows 11 session with proper WinRT support.

---

## What's Done

### Module Structure (complete)
```
src/JblPartyBox/
  JblPartyBox.psd1          # Manifest (PS 7.0+, Core only)
  JblPartyBox.psm1          # Module loader, constants, WinRT types, async bridge
  Private/
    Invoke-PartyBoxCommand.ps1   # Core sender + Get-PartyBoxStream + Close-PartyBoxStream
    New-PartyBoxFrame.ps1        # Pure frame builder [0xAA, cmd, len, ...payload]
    Test-PartyBoxSession.ps1     # Session validator with -Throw switch
    Write-PartyBoxError.ps1      # Standardized ErrorRecord helper
  Public/
    Find-PartyBoxDevice.ps1      # WinRT device discovery (GAIA RFCOMM filter)
    Connect-PartyBoxDevice.ps1   # Opens RFCOMM socket, stores session, auto-inits lights
    Disconnect-PartyBoxDevice.ps1
    Test-PartyBoxConnection.ps1
    Get-PartyBoxConfiguration.ps1
    Enable-PartyBoxLight.ps1     # AA 33 04 00 99 01 01
    Disable-PartyBoxLight.ps1    # AA 33 04 00 99 01 00
    Set-PartyBoxLightPattern.ps1 # AA 33 04 00 31 01 [id]
    Set-PartyBoxLightColor.ps1   # AA 33 06 00 32 03 [R] [G] [B]
    Set-PartyBoxLightBrightness.ps1
    Set-PartyBoxLightSpeed.ps1
    Set-PartyBoxLightZone.ps1
    Set-PartyBoxColorMode.ps1
    Initialize-PartyBoxLights.ps1  # OFF -> ON -> NEON sequence
    Invoke-PartyBoxSoundEffect.ps1 # AA 55 01 [toneId]
    Set-PartyBoxDjFilter.ps1       # AA 57 02 [filterId] [level]
    Stop-PartyBoxDjFilter.ps1
    Get-PartyBoxLightStatus.ps1    # AA 31 00
    Send-PartyBoxHeartbeat.ps1     # AA EA 00

tests/
  TestHelpers.psm1
  Fixtures/MockResponses.ps1
  Unit/Private/  (4 test files)
  Unit/Public/   (19 test files)
  Integration/   (3 test files, gated by $env:PARTYBOX_INTEGRATION_TESTS)

examples/
  Quick-Start.ps1
  Light-Show.ps1
  Dj-Effects-Demo.ps1
```

### What Works Right Now
- `Import-Module ./src/JblPartyBox/JblPartyBox.psd1 -Force` loads cleanly (19 functions)
- All protocol constants are correct (verified against Program.cs test app)
- `New-PartyBoxFrame` unit tests pass (14 tests for frame building)
- Module OnRemove cleanup handler registered

---

## Issue 1: WinRT Type Loading in psm1

**File**: `src/JblPartyBox/JblPartyBox.psm1` lines 22-43

The current code uses `[Type]::GetType()` which returns `$null` silently instead of actually loading the WinRT types. On Windows 11 with full WinRT support, you need the **PowerShell type literal syntax**:

```powershell
# This is what actually works (from test-full-protocol.ps1):
[Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId, Windows.Devices.Bluetooth, ContentType = WindowsRuntime] | Out-Null
```

**Fix**: Replace the `[Type]::GetType()` loop with individual type literal statements wrapped in their own try/catch:

```powershell
$script:WinRTAvailable = $false
try {
    Add-Type -AssemblyName System.Runtime.WindowsRuntime -ErrorAction Stop
    [Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId, Windows.Devices.Bluetooth, ContentType = WindowsRuntime] | Out-Null
    [Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService, Windows.Devices.Bluetooth, ContentType = WindowsRuntime] | Out-Null
    [Windows.Devices.Enumeration.DeviceInformation, Windows.Devices.Enumeration, ContentType = WindowsRuntime] | Out-Null
    [Windows.Networking.Sockets.StreamSocket, Windows.Networking.Sockets, ContentType = WindowsRuntime] | Out-Null
    [Windows.Storage.Streams.DataWriter, Windows.Storage.Streams, ContentType = WindowsRuntime] | Out-Null
    [Windows.Storage.Streams.DataReader, Windows.Storage.Streams, ContentType = WindowsRuntime] | Out-Null
    $script:WinRTAvailable = $true
}
catch {
    Write-Warning "WinRT types not available. Bluetooth requires Windows 10/11."
}
```

On Windows 11 these type literals should resolve without error. The `$script:WinRTAvailable` flag isn't currently checked anywhere but is available for defensive use in `Find-PartyBoxDevice` etc.

---

## Issue 2: Unit Tests - Module Loading in Pester

**File**: `tests/TestHelpers.psm1`

**Problem**: `Initialize-TestModule` uses `-ErrorAction SilentlyContinue` on `Import-Module`, which swallows the module registration when WinRT type literals produce non-terminating errors in the psm1. This causes all public function tests to fail with "not recognized as a name of a cmdlet".

**On Windows 11** (where WinRT loads cleanly), this should just work. But to be safe, change to:

```powershell
function Initialize-TestModule {
    param([switch]$MockSession)

    if (Get-Module JblPartyBox) {
        Remove-Module JblPartyBox -Force
    }

    $modulePath = Join-Path $PSScriptRoot '..\src\JblPartyBox\JblPartyBox.psd1'
    Import-Module $modulePath -Force -WarningAction SilentlyContinue

    if (-not (Get-Module JblPartyBox)) {
        throw "Failed to load JblPartyBox module from $modulePath"
    }

    if ($MockSession) { Set-MockSession }
}
```

**Also fix `Set-MockSession`** - the args passing pattern needs this form:

```powershell
function Set-MockSession {
    param(
        [bool]$Connected = $true,
        [bool]$Initialized = $true
    )
    $module = Get-Module JblPartyBox
    & $module {
        param($c, $i)
        $script:PartyBoxSession = @{
            DeviceName  = 'Mock JBL PartyBox Stage 320'
            DeviceId    = 'Bluetooth#MockDevice-00:11:22:33:44:55'
            Connected   = $c
            LastContact = [DateTime]::Now
            Initialized = $i
            Service     = $null
            Socket      = $null
            Writer      = $null
            Reader      = $null
        }
    } -Args @($Connected, $Initialized)
}
```

### Private function tests that use `& $module { }` pattern

Files: `tests/Unit/Private/Invoke-PartyBoxCommand.Tests.ps1`, `Test-PartyBoxSession.Tests.ps1`

The `& $module { ... }` pattern fails when `$module` is fetched before BeforeAll completes. Replace with InModuleScope:

```powershell
# Instead of:
$module = Get-Module JblPartyBox
{ & $module { Invoke-PartyBoxCommand -Data @(0xAA) } } | Should -Throw

# Use:
InModuleScope JblPartyBox {
    { Invoke-PartyBoxCommand -Data @(0xAA) -ErrorAction Stop } | Should -Throw '*Not connected*'
}
```

---

## Verification Steps (on Windows 11)

### Step 1: Module loads cleanly
```powershell
Import-Module ./src/JblPartyBox/JblPartyBox.psd1 -Force
(Get-Command -Module JblPartyBox).Count  # Should be 19
```

### Step 2: Unit tests pass
```powershell
Invoke-Pester ./tests/Unit -Output Detailed
# Target: 78 tests, all passing
```

### Step 3: Hardware integration (speaker paired and on)
```powershell
Import-Module ./src/JblPartyBox/JblPartyBox.psd1 -Force

# Discovery
Find-PartyBoxDevice

# Connect (auto-initializes lights with OFF -> ON -> NEON)
Find-PartyBoxDevice | Connect-PartyBoxDevice

# Light control
Set-PartyBoxLightPattern -Pattern Freeze
Set-PartyBoxLightColor -Color Red
Set-PartyBoxLightBrightness -Level 200
Set-PartyBoxLightColor -Color Blue

# Sound effects
Invoke-PartyBoxSoundEffect -Effect Horn
Invoke-PartyBoxSoundEffect -Effect Party

# DJ filter (requires music playing)
Set-PartyBoxDjFilter -Filter Echo -Level 50
Stop-PartyBoxDjFilter

# Cleanup
Disconnect-PartyBoxDevice
```

### Step 4: Integration tests
```powershell
$env:PARTYBOX_INTEGRATION_TESTS = '1'
Invoke-Pester ./tests/Integration -Output Detailed
```

---

## Protocol Reference (quick)

All commands start with `0xAA`. Verified byte sequences from `src/JblPartyBox.TestApp/Program.cs`:

| Command | Bytes |
|---------|-------|
| Lights ON | `AA 33 04 00 99 01 01` |
| Lights OFF | `AA 33 04 00 99 01 00` |
| Pattern [id] | `AA 33 04 00 31 01 [id]` |
| Color (simple) | `AA 33 06 00 32 03 [R] [G] [B]` |
| Color mode | `AA 33 04 00 36 01 [0=loop/1=static]` |
| Brightness | `AA 33 04 00 45 01 [level]` |
| Speed | `AA 33 04 00 46 01 [level]` |
| Zone on/off | `AA 33 04 00 [elementId] 01 [0/1]` |
| Sound effect | `AA 55 01 [toneId]` |
| DJ filter | `AA 57 02 [filterId] [level]` |
| Heartbeat | `AA EA 00` |
| Light status | `AA 31 00` |

Pattern IDs: Off=0, Neon=2, Custom=8, Loop=9, Bounce=10, Trim=11, Switch=12, Freeze=13
Zone element IDs: Strobe=0x33, Eight=0x38, SideRing=0x39, Stripe=0x40, Star=0x41, StrobeUp=0x42, StrobeDown=0x43, Edge=0x44
