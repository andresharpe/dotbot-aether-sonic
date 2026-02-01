function Enable-PartyBoxLight {
    <#
    .SYNOPSIS
        Turns the PartyBox speaker lights on.

    .DESCRIPTION
        Sends the light main switch ON command (AA 33 04 00 99 01 01).

    .EXAMPLE
        Enable-PartyBoxLight
    #>

    [CmdletBinding()]
    param()

    Test-PartyBoxSession -Throw

    $frame = New-PartyBoxFrame -Command $script:CmdSetLight -Payload @(
        $script:DeviceIndex,
        $script:LightElementIds.MainSwitch,
        0x01,  # length
        0x01   # ON
    )

    Invoke-PartyBoxCommand -Data $frame
}
