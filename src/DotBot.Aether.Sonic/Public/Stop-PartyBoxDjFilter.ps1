function Stop-PartyBoxDjFilter {
    <#
    .SYNOPSIS
        Stops any active DJ audio filter on the PartyBox speaker.

    .DESCRIPTION
        Sends the cancel filter command (AA 57 02 00 00) to stop any
        currently active audio filter effect.

    .EXAMPLE
        Stop-PartyBoxDjFilter
    #>

    [CmdletBinding()]
    param()

    Test-PartyBoxSession -Throw

    Write-Verbose "Stopping DJ filter"

    $frame = New-PartyBoxFrame -Command $script:CmdDjFilter -Payload @(
        [byte]$script:DjFilterIds.Cancel,
        [byte]0x00
    )

    Invoke-PartyBoxCommand -Data $frame
}
