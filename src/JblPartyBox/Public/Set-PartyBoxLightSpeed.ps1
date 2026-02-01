function Set-PartyBoxLightSpeed {
    <#
    .SYNOPSIS
        Sets the light animation speed on the PartyBox speaker.

    .DESCRIPTION
        Sends a speed command (AA 33 04 00 46 01 [level]).

    .PARAMETER Level
        Speed level from 0 (slowest) to 255 (fastest).

    .EXAMPLE
        Set-PartyBoxLightSpeed -Level 128
    #>

    [CmdletBinding()]
    param(
        [Parameter(Mandatory, Position = 0)]
        [ValidateRange(0, 255)]
        [int]$Level
    )

    Test-PartyBoxSession -Throw

    Write-Verbose "Setting light speed to $Level"

    $frame = New-PartyBoxFrame -Command $script:CmdSetLight -Payload @(
        $script:DeviceIndex,
        $script:LightElementIds.Speed,
        0x01,
        [byte]$Level
    )

    Invoke-PartyBoxCommand -Data $frame
}
