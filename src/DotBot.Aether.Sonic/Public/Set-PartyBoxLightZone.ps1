function Set-PartyBoxLightZone {
    <#
    .SYNOPSIS
        Enables or disables a specific light zone on the PartyBox speaker.

    .DESCRIPTION
        Sends a light element on/off command (AA 33 04 00 [element] 01 [0/1]).
        Each zone can be independently toggled.

    .PARAMETER Zone
        The light zone to control. Valid values: Strobe, Eight, SideRing, Stripe,
        Star, StrobeUp, StrobeDown, Edge.

    .PARAMETER Enabled
        $true to enable the zone, $false to disable it.

    .EXAMPLE
        Set-PartyBoxLightZone -Zone Eight -Enabled $true

    .EXAMPLE
        Set-PartyBoxLightZone -Zone SideRing -Enabled $false
    #>

    [CmdletBinding()]
    param(
        [Parameter(Mandatory, Position = 0)]
        [ValidateSet('Strobe', 'Eight', 'SideRing', 'Stripe', 'Star', 'StrobeUp', 'StrobeDown', 'Edge')]
        [string]$Zone,

        [Parameter(Mandatory, Position = 1)]
        [bool]$Enabled
    )

    Test-PartyBoxSession -Throw

    $elementId = $script:LightElementIds[$Zone]
    $value = if ($Enabled) { 0x01 } else { 0x00 }

    Write-Verbose "Setting zone $Zone (0x$($elementId.ToString('X2'))) to $( if ($Enabled) { 'ON' } else { 'OFF' } )"

    $frame = New-PartyBoxFrame -Command $script:CmdSetLight -Payload @(
        $script:DeviceIndex,
        [byte]$elementId,
        0x01,
        [byte]$value
    )

    Invoke-PartyBoxCommand -Data $frame
}
