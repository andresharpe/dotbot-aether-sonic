function Get-PartyBoxConfiguration {
    <#
    .SYNOPSIS
        Returns the current PartyBox session information.

    .DESCRIPTION
        Returns a PSCustomObject with the device name, device ID, connection state,
        initialization state, and last contact timestamp.

    .EXAMPLE
        Get-PartyBoxConfiguration

        DeviceName  : JBL PartyBox Stage 320
        DeviceId    : Bluetooth#Bluetooth00:11:22:33:44:55-...
        Connected   : True
        Initialized : True
        LastContact : 1/31/2026 10:30:00 AM

    .OUTPUTS
        PSCustomObject with session details, or $null if not connected.
    #>

    [CmdletBinding()]
    param()

    if (-not $script:PartyBoxSession) {
        Write-Verbose "No active PartyBox session"
        return $null
    }

    [PSCustomObject]@{
        PSTypeName  = 'JblPartyBox.Configuration'
        DeviceName  = $script:PartyBoxSession.DeviceName
        DeviceId    = $script:PartyBoxSession.DeviceId
        Connected   = $script:PartyBoxSession.Connected
        Initialized = $script:PartyBoxSession.Initialized
        LastContact = $script:PartyBoxSession.LastContact
    }
}
