function Set-PartyBoxLightColor {
    <#
    .SYNOPSIS
        Sets the light color on the PartyBox speaker.

    .DESCRIPTION
        Sends a simple color command (AA 33 06 00 32 03 [R] [G] [B]).
        Can specify RGB values directly or use a named color preset.
        By default, sets Static color mode and Freeze pattern for solid color display.

    .PARAMETER Red
        Red channel value (0-255).

    .PARAMETER Green
        Green channel value (0-255).

    .PARAMETER Blue
        Blue channel value (0-255).

    .PARAMETER Color
        A named color preset. Valid values: Red, Green, Blue, Orange, Yellow, Purple,
        Cyan, White, Pink, Lime, Teal, Magenta.

    .PARAMETER KeepCurrentPattern
        If specified, does not change the current pattern or color mode.
        By default, sets Static mode and Freeze pattern for solid color.

    .EXAMPLE
        Set-PartyBoxLightColor -Red 255 -Green 0 -Blue 0

    .EXAMPLE
        Set-PartyBoxLightColor -Color Red

    .EXAMPLE
        Set-PartyBoxLightColor -Color Blue -KeepCurrentPattern
    #>

    [CmdletBinding(DefaultParameterSetName = 'RGB')]
    param(
        [Parameter(Mandatory, ParameterSetName = 'RGB')]
        [ValidateRange(0, 255)]
        [int]$Red,

        [Parameter(Mandatory, ParameterSetName = 'RGB')]
        [ValidateRange(0, 255)]
        [int]$Green,

        [Parameter(Mandatory, ParameterSetName = 'RGB')]
        [ValidateRange(0, 255)]
        [int]$Blue,

        [Parameter(Mandatory, ParameterSetName = 'Preset', Position = 0)]
        [ValidateSet('Red', 'Green', 'Blue', 'Orange', 'Yellow', 'Purple', 'Cyan', 'White', 'Pink', 'Lime', 'Teal', 'Magenta')]
        [string]$Color,

        [Parameter()]
        [switch]$KeepCurrentPattern
    )

    Test-PartyBoxSession -Throw

    if ($PSCmdlet.ParameterSetName -eq 'Preset') {
        $rgb = $script:ColorPresets[$Color]
        $Red = $rgb[0]
        $Green = $rgb[1]
        $Blue = $rgb[2]
    }

    # Set Freeze pattern and Static mode for solid color unless keeping current
    if (-not $KeepCurrentPattern) {
        Write-Verbose "Setting Freeze pattern and Static mode for solid color"
        Set-PartyBoxLightPattern -Pattern Freeze
        Set-PartyBoxColorMode -Mode Static
    }

    Write-Verbose "Setting color to RGB($Red, $Green, $Blue)"

    # Simple color format: AA 33 06 00 32 03 R G B
    $frame = New-PartyBoxFrame -Command $script:CmdSetLight -Payload @(
        $script:DeviceIndex,
        0x32,        # RGB sub-command
        0x03,        # RGB length
        [byte]$Red,
        [byte]$Green,
        [byte]$Blue
    )

    Invoke-PartyBoxCommand -Data $frame
}
