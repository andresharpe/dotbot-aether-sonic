#Requires -Version 7.0

<#
.SYNOPSIS
    JblPartyBox PowerShell Module - Main module file

.DESCRIPTION
    PowerShell module for controlling JBL PartyBox Stage 320 speakers over
    Bluetooth RFCOMM. Provides light control, DJ sound effects, audio filters,
    and connection management.

.NOTES
    Author: JblPartyBox PowerShell Module Contributors
    Version: 1.0.0
    License: MIT
#>

# Initialize module-scoped session variable
$script:PartyBoxSession = $null

# ─── RFCOMM Helper Tool ───
# Path to the compiled C# helper that handles WinRT Bluetooth operations
$script:HelperExePath = $null
$script:HelperAvailable = $false

# BLE helper (for wake/power-on via GATT)
$script:BleHelperExePath = $null
$script:BleHelperAvailable = $false

# Look for helper in multiple locations
$helperLocations = @(
    (Join-Path $PSScriptRoot '..\..\tools\jbl-rfcomm-helper\bin\Release\net8.0-windows10.0.19041.0\win-x64\jbl-rfcomm-helper.exe')
    (Join-Path $PSScriptRoot '..\..\tools\jbl-rfcomm-helper\bin\Debug\net8.0-windows10.0.19041.0\win-x64\jbl-rfcomm-helper.exe')
    (Join-Path $PSScriptRoot '..\..\tools\jbl-rfcomm-helper\bin\Debug\net8.0-windows10.0.19041.0\jbl-rfcomm-helper.exe')
    (Join-Path $PSScriptRoot '..\..\tools\jbl-rfcomm-helper\bin\Release\net8.0-windows10.0.19041.0\jbl-rfcomm-helper.exe')
)

foreach ($path in $helperLocations) {
    if (Test-Path $path) {
        $script:HelperExePath = $path
        $script:HelperAvailable = $true
        Write-Verbose "Found RFCOMM helper at: $path"
        break
    }
}

# Locate BLE helper
$bleHelperLocations = @(
    (Join-Path $PSScriptRoot '..\..\tools\jbl-ble-helper\bin\Release\net8.0-windows10.0.19041.0\win-x64\jbl-ble-helper.exe')
    (Join-Path $PSScriptRoot '..\..\tools\jbl-ble-helper\bin\Debug\net8.0-windows10.0.19041.0\win-x64\jbl-ble-helper.exe')
    (Join-Path $PSScriptRoot '..\..\tools\jbl-ble-helper\bin\Debug\net8.0-windows10.0.19041.0\jbl-ble-helper.exe')
    (Join-Path $PSScriptRoot '..\..\tools\jbl-ble-helper\bin\Release\net8.0-windows10.0.19041.0\jbl-ble-helper.exe')
)

foreach ($path in $bleHelperLocations) {
    if (Test-Path $path) {
        $script:BleHelperExePath = $path
        $script:BleHelperAvailable = $true
        Write-Verbose "Found BLE helper at: $path"
        break
    }
}

if (-not $script:HelperAvailable) {
    Write-Warning "RFCOMM helper not found. Build the helper with: dotnet build tools/jbl-rfcomm-helper"
}
if (-not $script:BleHelperAvailable) {
    Write-Verbose "BLE helper not found (optional). Build with: dotnet build tools/jbl-ble-helper"
}

# ─── Helper Process Management ───

function script:Invoke-RfcommHelper {
    <#
    .SYNOPSIS
        Invokes the RFCOMM helper tool and returns its output.
    #>
    param(
        [Parameter(Mandatory)]
        [string[]]$Arguments,

        [int]$TimeoutSeconds = 30
    )

    if (-not $script:HelperAvailable) {
        throw "RFCOMM helper not available. Build with: dotnet build tools/jbl-rfcomm-helper"
    }

    $psi = [System.Diagnostics.ProcessStartInfo]::new()
    $psi.FileName = $script:HelperExePath
    $psi.Arguments = $Arguments -join ' '
    $psi.UseShellExecute = $false
    $psi.RedirectStandardOutput = $true
    $psi.RedirectStandardError = $true
    $psi.CreateNoWindow = $true

    $process = [System.Diagnostics.Process]::Start($psi)
    $stdout = $process.StandardOutput.ReadToEnd()
    $stderr = $process.StandardError.ReadToEnd()
    $process.WaitForExit($TimeoutSeconds * 1000) | Out-Null

    if ($process.ExitCode -ne 0) {
        throw "Helper failed (exit code $($process.ExitCode)): $stderr"
    }

    return $stdout
}

function script:Invoke-BleHelper {
    <#
    .SYNOPSIS
        Invokes the BLE helper tool and returns its output.
    #>
    param(
        [Parameter(Mandatory)]
        [string[]]$Arguments,

        [int]$TimeoutSeconds = 20
    )

    if (-not $script:BleHelperAvailable) {
        throw "BLE helper not available. Build with: dotnet build tools/jbl-ble-helper"
    }

    $psi = [System.Diagnostics.ProcessStartInfo]::new()
    $psi.FileName = $script:BleHelperExePath
    $psi.Arguments = $Arguments -join ' '
    $psi.UseShellExecute = $false
    $psi.RedirectStandardOutput = $true
    $psi.RedirectStandardError = $true
    $psi.CreateNoWindow = $true

    $process = [System.Diagnostics.Process]::Start($psi)
    $stdout = $process.StandardOutput.ReadToEnd()
    $stderr = $process.StandardError.ReadToEnd()
    $process.WaitForExit($TimeoutSeconds * 1000) | Out-Null

    if ($process.ExitCode -ne 0) {
        throw "BLE helper failed (exit code $($process.ExitCode)): $stderr"
    }

    return $stdout
}

function script:Find-PartyBoxBleMac {
    <#
    .SYNOPSIS
        Scans for JBL PartyBox speakers via BLE and returns their BLE MAC addresses.
    #>
    param(
        [int]$ScanSeconds = 5
    )

    if (-not $script:BleHelperAvailable) {
        Write-Verbose "BLE helper not available"
        return @()
    }

    Write-Verbose "Scanning for BLE devices for $ScanSeconds seconds..."
    try {
        $out = script:Invoke-BleHelper -Arguments @('scan', $ScanSeconds) -TimeoutSeconds ($ScanSeconds + 10)
        # Parse JSON output (skip the "Scanning..." line)
        $jsonStart = $out.IndexOf('[')
        if ($jsonStart -ge 0) {
            $json = $out.Substring($jsonStart)
            $devices = $json | ConvertFrom-Json
            # Filter for JBL PartyBox devices
            $jblDevices = $devices | Where-Object { $_.Name -like '*JBL*PartyBox*' -or $_.Name -like '*PARTYBOX*' }
            return $jblDevices
        }
        return @()
    }
    catch {
        Write-Verbose "BLE scan failed: $($_.Exception.Message)"
        return @()
    }
}

function script:Invoke-PartyBoxBlePowerOn {
    <#
    .SYNOPSIS
        Attempts to power on the speaker via BLE using GATT write (AA 03 01 05).
    .PARAMETER BleMacAddress
        The BLE MAC address (from scan) to send the command to.
    #>
    param(
        [Parameter(Mandatory)]
        [string]$BleMacAddress
    )

    if (-not $script:BleHelperAvailable) {
        Write-Verbose "BLE helper not available; cannot auto power-on"
        return $false
    }

    Write-Verbose "Sending BLE power-on to $BleMacAddress"
    try {
        $out = script:Invoke-BleHelper -Arguments @('poweron', $BleMacAddress)
        Write-Verbose "BLE helper output: $out"
        return $out -match 'OK'
    }
    catch {
        Write-Verbose "BLE power-on failed: $($_.Exception.Message)"
        return $false
    }
}

function script:Invoke-PartyBoxBlePowerOff {
    <#
    .SYNOPSIS
        Attempts to power off the speaker via BLE using GATT write (AA 03 01 04).
    .PARAMETER BleMacAddress
        The BLE MAC address (from scan) to send the command to.
    #>
    param(
        [Parameter(Mandatory)]
        [string]$BleMacAddress
    )

    if (-not $script:BleHelperAvailable) {
        Write-Verbose "BLE helper not available; cannot power-off"
        return $false
    }

    Write-Verbose "Sending BLE power-off to $BleMacAddress"
    try {
        $out = script:Invoke-BleHelper -Arguments @('poweroff', $BleMacAddress)
        Write-Verbose "BLE helper output: $out"
        return $out -match 'OK'
    }
    catch {
        Write-Verbose "BLE power-off failed: $($_.Exception.Message)"
        return $false
    }
}

function script:Get-MacAddressFromRfcommDeviceId {
    <#
    .SYNOPSIS
        Extracts the remote MAC address from an RFCOMM DeviceId.
    #>
    param(
        [Parameter(Mandatory)]
        [string]$RfcommDeviceId
    )

    # Pattern: Bluetooth#Bluetooth<local>-<remote>#RFCOMM...
    if ($RfcommDeviceId -match '(?i)Bluetooth#Bluetooth[0-9a-f:]+-([0-9a-f:]+)#RFCOMM') {
        return $Matches[1]
    }
    return $null
}

function script:Start-RfcommHelperProcess {
    <#
    .SYNOPSIS
        Starts the RFCOMM helper in interactive mode for a device.
    #>
    param(
        [Parameter(Mandatory)]
        [string]$DeviceId
    )

    if (-not $script:HelperAvailable) {
        throw "RFCOMM helper not available. Build with: dotnet build tools/jbl-rfcomm-helper"
    }

    $psi = [System.Diagnostics.ProcessStartInfo]::new()
    $psi.FileName = $script:HelperExePath
    $psi.Arguments = "connect `"$DeviceId`""
    $psi.UseShellExecute = $false
    $psi.RedirectStandardInput = $true
    $psi.RedirectStandardOutput = $true
    $psi.RedirectStandardError = $true
    $psi.CreateNoWindow = $true

    $process = [System.Diagnostics.Process]::Start($psi)

    # Wait for CONNECTED response
    $response = $process.StandardOutput.ReadLine()
    if ($response -ne 'CONNECTED') {
        $error = $process.StandardError.ReadToEnd()
        $process.Kill()
        throw "Failed to connect: $error"
    }

    return $process
}

function script:Send-RfcommHelperCommand {
    <#
    .SYNOPSIS
        Sends a command to the running helper process.
    #>
    param(
        [Parameter(Mandatory)]
        [System.Diagnostics.Process]$Process,

        [Parameter(Mandatory)]
        [string]$Command
    )

    $Process.StandardInput.WriteLine($Command)
    $Process.StandardInput.Flush()

    $response = $Process.StandardOutput.ReadLine()
    return $response
}

function script:Stop-RfcommHelperProcess {
    <#
    .SYNOPSIS
        Gracefully stops the helper process.
    #>
    param(
        [System.Diagnostics.Process]$Process
    )

    if ($Process -and -not $Process.HasExited) {
        try {
            $Process.StandardInput.WriteLine('QUIT')
            $Process.StandardInput.Flush()
            $Process.WaitForExit(2000) | Out-Null
        }
        catch { }

        if (-not $Process.HasExited) {
            $Process.Kill()
        }
    }
}

# ─── Protocol Constants ───

# Light patterns (from LightPattern.java)
$script:PatternIds = @{
    Off    = 0
    Neon   = 2
    Custom = 8
    Loop   = 9
    Bounce = 10
    Trim   = 11
    Switch = 12
    Freeze = 13
}

# Light element sub-commands (from LightElements.java)
$script:LightElementIds = @{
    Strobe     = 0x33
    Eight      = 0x38
    SideRing   = 0x39
    Stripe     = 0x40
    Star       = 0x41
    StrobeUp   = 0x42
    StrobeDown = 0x43
    Edge       = 0x44
    Brightness = 0x45
    Speed      = 0x46
    MainSwitch = 0x99
}

# DJ Filter IDs (from DjFilterId.java)
$script:DjFilterIds = @{
    Cancel   = 0
    Repeater = 1
    Filter   = 2
    Gater    = 3
    Echo     = 4
    Wipeout  = 5
}

# Sound effect IDs (from DjEffectToneId.java)
$script:SoundEffectIds = @{
    Horn        = 1
    Clapping    = 2
    Scratch1    = 3
    Scratch2    = 4
    Scratch3    = 5
    Barking     = 6
    Like        = 7
    Boo         = 8
    Ready       = 9
    Disco1      = 10
    Disco2      = 11
    Disco3      = 12
    Game        = 13
    Party       = 14
    Hey         = 15
    HandsUp     = 16
    OneTwoThree = 17
    Jump        = 18
    LetsGo      = 19
}

# Color presets (named colors mapped to RGB)
$script:ColorPresets = @{
    Red     = @(255, 0, 0)
    Green   = @(0, 255, 0)
    Blue    = @(0, 0, 255)
    Orange  = @(255, 128, 0)
    Yellow  = @(255, 255, 0)
    Purple  = @(128, 0, 255)
    Cyan    = @(0, 255, 255)
    White   = @(255, 255, 255)
    Pink    = @(255, 105, 180)
    Lime    = @(128, 255, 0)
    Teal    = @(0, 128, 128)
    Magenta = @(255, 0, 128)
}

# Protocol frame identifier
$script:FrameIdentifier = 0xAA

# Device index (Stage 320 uses 0x00)
$script:DeviceIndex = 0x00

# Command bytes
$script:CmdSetLight    = 0x33
$script:CmdLightInfo   = 0x31
$script:CmdSoundEffect = 0x55
$script:CmdDjFilter    = 0x57
$script:CmdHeartbeat   = 0xEA

# Inter-command delay in milliseconds
$script:CommandDelayMs = 300

# ─── Load Functions ───

$PrivatePath = Join-Path -Path $PSScriptRoot -ChildPath 'Private'
$PublicPath = Join-Path -Path $PSScriptRoot -ChildPath 'Public'

# Dot-source all private functions
if (Test-Path -Path $PrivatePath) {
    $PrivateFunctions = Get-ChildItem -Path $PrivatePath -Filter '*.ps1' -Recurse -ErrorAction SilentlyContinue
    foreach ($Function in $PrivateFunctions) {
        try {
            . $Function.FullName
            Write-Verbose "Imported private function: $($Function.BaseName)"
        }
        catch {
            Write-Error "Failed to import private function $($Function.FullName): $_"
        }
    }
}

# Dot-source all public functions
if (Test-Path -Path $PublicPath) {
    $PublicFunctions = Get-ChildItem -Path $PublicPath -Filter '*.ps1' -Recurse -ErrorAction SilentlyContinue
    foreach ($Function in $PublicFunctions) {
        try {
            . $Function.FullName
            Write-Verbose "Imported public function: $($Function.BaseName)"
        }
        catch {
            Write-Error "Failed to import public function $($Function.FullName): $_"
        }
    }
}

# ─── Module Cleanup ───

$MyInvocation.MyCommand.ScriptBlock.Module.OnRemove = {
    if ($script:PartyBoxSession) {
        Write-Verbose "Closing PartyBox connection on module removal"
        try { Close-PartyBoxStream } catch { }
        $script:PartyBoxSession = $null
    }
}

# ─── Export Public Functions ───

Export-ModuleMember -Function @(
    # Aether Interface Contract
    'Initialize-AetherSonic'
    'Find-AetherSonic'
    'Connect-AetherSonic'
    'Disconnect-AetherSonic'
    'Test-AetherSonic'
    'Invoke-AetherSonicEvent'
    # Connection & Discovery
    'Find-PartyBoxDevice',
    'Connect-PartyBoxDevice',
    'Disconnect-PartyBoxDevice',
    'Test-PartyBoxConnection',
    'Get-PartyBoxConfiguration',
    # Power Control via BLE
    'Start-PartyBoxDevice',
    'Stop-PartyBoxDevice',
    # Light Control
    'Enable-PartyBoxLight',
    'Disable-PartyBoxLight',
    'Set-PartyBoxLightPattern',
    'Set-PartyBoxLightColor',
    'Set-PartyBoxLightBrightness',
    'Set-PartyBoxLightSpeed',
    'Set-PartyBoxLightZone',
    'Set-PartyBoxColorMode',
    'Initialize-PartyBoxLights',
    # DJ Sound Effects
    'Invoke-PartyBoxSoundEffect',
    # DJ Audio Filters
    'Set-PartyBoxDjFilter',
    'Stop-PartyBoxDjFilter',
    # Status & Utility
    'Get-PartyBoxLightStatus',
    'Send-PartyBoxHeartbeat'
)
