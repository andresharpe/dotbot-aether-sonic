@{
    # Script module file associated with this manifest.
    RootModule = 'DotBot.Aether.Sonic.psm1'

    # Version number of this module.
    ModuleVersion = '1.0.0'

    # Supported PSEditions
    CompatiblePSEditions = @('Core')

    # ID used to uniquely identify this module
    GUID = 'a3b7c9d1-e5f2-4a6b-8c0d-1e2f3a4b5c6d'

    # Author of this module
    Author = 'Andre'

    # Company or vendor of this module
    CompanyName = 'DotBot'

    # Copyright statement for this module
    Copyright = '(c) 2026 Andre. All rights reserved.'

    # Description of the functionality provided by this module
    Description = 'DotBot Aether Sonic Conduit — JBL PartyBox Stage 320 control over Bluetooth RFCOMM. Part of the dotbot-aether conduit plugin collection.'

    # Minimum version of the PowerShell engine required by this module
    PowerShellVersion = '7.0'

    # Functions to export from this module
    FunctionsToExport = @(
        # Aether Interface Contract (6)
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
        # Convenience
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

    # Cmdlets to export from this module
    CmdletsToExport = @()

    # Variables to export from this module
    VariablesToExport = @()

    # Aliases to export from this module
    AliasesToExport = @()

    # Private data to pass to the module specified in RootModule
    PrivateData = @{
        PSData = @{
            Tags = @('DotBot', 'Aether', 'Sonic', 'JBL', 'PartyBox', 'Bluetooth', 'RFCOMM', 'Speaker', 'LED', 'DJ', 'Hardware')

            LicenseUri = 'https://github.com/andresharpe/dotbot-aether-sonic/blob/main/LICENSE'

            ProjectUri = 'https://github.com/andresharpe/dotbot-aether-sonic'

            ReleaseNotes = @'
v1.0.0 - Initial Release

PowerShell 7+ module for JBL PartyBox Stage 320 control:
- 19 public functions for speaker control over Bluetooth RFCOMM
- Device discovery and connection management
- Light patterns, colors, brightness, speed, and zone control
- DJ sound effects (19 built-in sounds)
- DJ audio filters (Repeater, Filter, Gater, Echo, Wipeout)
- Pipeline support (Find-PartyBoxDevice | Connect-PartyBoxDevice)
- Automatic retry with exponential backoff
- WinRT Bluetooth integration for Windows 10/11

See README.md for full details and examples.
'@
        }
    }
}
