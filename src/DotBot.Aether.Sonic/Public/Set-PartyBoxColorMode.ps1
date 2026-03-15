function Set-PartyBoxColorMode {
    <#
    .SYNOPSIS
        Sets the color mode on the PartyBox speaker.

    .DESCRIPTION
        Sends a color mode command (AA 33 04 00 36 01 [0/1]).
        ColorLoop cycles through colors, Static holds one color.

    .PARAMETER Mode
        The color mode. Valid values: ColorLoop, Static.

    .EXAMPLE
        Set-PartyBoxColorMode -Mode Static

    .EXAMPLE
        Set-PartyBoxColorMode -Mode ColorLoop
    #>

    [CmdletBinding()]
    param(
        [Parameter(Mandatory, Position = 0)]
        [ValidateSet('ColorLoop', 'Static')]
        [string]$Mode
    )

    Test-PartyBoxSession -Throw

    $value = if ($Mode -eq 'ColorLoop') { 0x00 } else { 0x01 }

    Write-Verbose "Setting color mode to $Mode ($value)"

    $frame = New-PartyBoxFrame -Command $script:CmdSetLight -Payload @(
        $script:DeviceIndex,
        0x36,  # Color mode sub-command
        0x01,
        [byte]$value
    )

    Invoke-PartyBoxCommand -Data $frame
}
