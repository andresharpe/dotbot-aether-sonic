function Set-PartyBoxLightBrightness {
    <#
    .SYNOPSIS
        Sets the light brightness level on the PartyBox speaker.

    .DESCRIPTION
        Sends a brightness command (AA 33 04 00 45 01 [level]).

    .PARAMETER Level
        Brightness level from 0 (off) to 255 (maximum).

    .EXAMPLE
        Set-PartyBoxLightBrightness -Level 128

    .EXAMPLE
        Set-PartyBoxLightBrightness -Level 255
    #>

    [CmdletBinding()]
    param(
        [Parameter(Mandatory, Position = 0)]
        [ValidateRange(0, 255)]
        [int]$Level
    )

    Test-PartyBoxSession -Throw

    Write-Verbose "Setting brightness to $Level"

    $frame = New-PartyBoxFrame -Command $script:CmdSetLight -Payload @(
        $script:DeviceIndex,
        $script:LightElementIds.Brightness,
        0x01,
        [byte]$Level
    )

    Invoke-PartyBoxCommand -Data $frame
}
