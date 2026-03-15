function Disable-PartyBoxLight {
    <#
    .SYNOPSIS
        Turns the PartyBox speaker lights off.

    .DESCRIPTION
        Sends the light main switch OFF command (AA 33 04 00 99 01 00).

    .EXAMPLE
        Disable-PartyBoxLight
    #>

    [CmdletBinding()]
    param()

    Test-PartyBoxSession -Throw

    $frame = New-PartyBoxFrame -Command $script:CmdSetLight -Payload @(
        $script:DeviceIndex,
        $script:LightElementIds.MainSwitch,
        0x01,  # length
        0x00   # OFF
    )

    Invoke-PartyBoxCommand -Data $frame
}
