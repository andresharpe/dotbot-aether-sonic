function Set-PartyBoxDjFilter {
    <#
    .SYNOPSIS
        Applies a DJ audio filter to the PartyBox speaker output.

    .DESCRIPTION
        Sends a DJ filter command (AA 57 02 [filterId] [level]) to apply a real-time
        audio effect to the currently playing music.

    .PARAMETER Filter
        The audio filter to apply. Valid values: Repeater, Filter, Gater, Echo, Wipeout.

    .PARAMETER Level
        The filter intensity from 0 (minimum) to 100 (maximum).

    .EXAMPLE
        Set-PartyBoxDjFilter -Filter Echo -Level 50

    .EXAMPLE
        Set-PartyBoxDjFilter -Filter Repeater -Level 100
    #>

    [CmdletBinding()]
    param(
        [Parameter(Mandatory, Position = 0)]
        [ValidateSet('Repeater', 'Filter', 'Gater', 'Echo', 'Wipeout')]
        [string]$Filter,

        [Parameter(Mandatory, Position = 1)]
        [ValidateRange(0, 100)]
        [int]$Level
    )

    Test-PartyBoxSession -Throw

    $filterId = $script:DjFilterIds[$Filter]
    Write-Verbose "Setting DJ filter: $Filter (ID: $filterId) at level $Level"

    $frame = New-PartyBoxFrame -Command $script:CmdDjFilter -Payload @(
        [byte]$filterId,
        [byte]$Level
    )

    Invoke-PartyBoxCommand -Data $frame
}
