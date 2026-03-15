function Send-PartyBoxHeartbeat {
    <#
    .SYNOPSIS
        Sends a keepalive heartbeat to the PartyBox speaker.

    .DESCRIPTION
        Sends a heartbeat command (AA EA 00) to maintain the Bluetooth connection.

    .EXAMPLE
        Send-PartyBoxHeartbeat
    #>

    [CmdletBinding()]
    param()

    Test-PartyBoxSession -Throw

    Write-Verbose "Sending heartbeat"

    $frame = New-PartyBoxFrame -Command $script:CmdHeartbeat

    Invoke-PartyBoxCommand -Data $frame
}
