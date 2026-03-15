function New-PartyBoxFrame {
    <#
    .SYNOPSIS
        Builds a raw byte frame for the JBL PartyBox protocol.

    .DESCRIPTION
        Pure function that takes a command byte and payload bytes, then returns
        the complete frame: [0xAA, Command, PayloadLength, ...Payload].

    .PARAMETER Command
        The command byte (e.g., 0x33 for light commands, 0x55 for sound effects).

    .PARAMETER Payload
        Optional payload bytes to include after the length byte.

    .EXAMPLE
        # Lights ON: AA 33 04 00 99 01 01
        New-PartyBoxFrame -Command 0x33 -Payload @(0x00, 0x99, 0x01, 0x01)

    .EXAMPLE
        # Heartbeat: AA EA 00
        New-PartyBoxFrame -Command 0xEA

    .OUTPUTS
        [byte[]] The complete frame ready to send over RFCOMM.
    #>

    [CmdletBinding()]
    [OutputType([byte[]])]
    param(
        [Parameter(Mandatory)]
        [byte]$Command,

        [Parameter()]
        [byte[]]$Payload
    )

    $length = if ($Payload) { $Payload.Length } else { 0 }

    if ($Payload) {
        [byte[]]$frame = @([byte]$script:FrameIdentifier, [byte]$Command, [byte]$length) + $Payload
    }
    else {
        [byte[]]$frame = @([byte]$script:FrameIdentifier, [byte]$Command, [byte]0)
    }

    return $frame
}
