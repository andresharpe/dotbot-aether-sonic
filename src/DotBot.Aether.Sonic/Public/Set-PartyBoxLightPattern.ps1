function Set-PartyBoxLightPattern {
    <#
    .SYNOPSIS
        Sets the light pattern on the PartyBox speaker.

    .DESCRIPTION
        Sends a pattern command (AA 33 04 00 31 01 [id]). For the Switch pattern,
        automatically sends ColorModeLoop first as required by the protocol.

    .PARAMETER Pattern
        The light pattern name. Valid values: Off, Neon, Custom, Loop, Bounce, Trim, Switch, Freeze.

    .EXAMPLE
        Set-PartyBoxLightPattern -Pattern Neon

    .EXAMPLE
        Set-PartyBoxLightPattern -Pattern Freeze
    #>

    [CmdletBinding()]
    param(
        [Parameter(Mandatory, Position = 0)]
        [ValidateSet('Off', 'Neon', 'Custom', 'Loop', 'Bounce', 'Trim', 'Switch', 'Freeze')]
        [string]$Pattern
    )

    Test-PartyBoxSession -Throw

    # Switch pattern requires ColorModeLoop to show its animation
    if ($Pattern -eq 'Switch') {
        Write-Verbose "Setting ColorModeLoop for Switch pattern"
        Set-PartyBoxColorMode -Mode ColorLoop
    }

    $patternId = $script:PatternIds[$Pattern]
    Write-Verbose "Setting pattern to $Pattern (ID: $patternId)"

    $frame = New-PartyBoxFrame -Command $script:CmdSetLight -Payload @(
        $script:DeviceIndex,
        0x31,  # Pattern sub-command
        0x01,  # length
        [byte]$patternId
    )

    Invoke-PartyBoxCommand -Data $frame
}
