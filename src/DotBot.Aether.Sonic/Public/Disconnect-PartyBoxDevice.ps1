function Disconnect-PartyBoxDevice {
    <#
    .SYNOPSIS
        Disconnects from the currently connected JBL PartyBox speaker.

    .DESCRIPTION
        Gracefully terminates the RFCOMM helper process and clears $script:PartyBoxSession.

    .EXAMPLE
        Disconnect-PartyBoxDevice
    #>

    [CmdletBinding()]
    param()

    if (-not $script:PartyBoxSession) {
        Write-Verbose "No active PartyBox session to disconnect"
        return
    }

    $deviceName = $script:PartyBoxSession.DeviceName
    Write-Verbose "Disconnecting from $deviceName"

    Close-PartyBoxStream

    $script:PartyBoxSession = $null

    Write-Verbose "Disconnected from $deviceName"
}
