function Invoke-PartyBoxSoundEffect {
    <#
    .SYNOPSIS
        Plays a DJ sound effect on the PartyBox speaker.

    .DESCRIPTION
        Sends a sound effect command (AA 55 01 [toneId]) to trigger one of the
        19 built-in sound effects.

    .PARAMETER Effect
        The sound effect to play.

    .EXAMPLE
        Invoke-PartyBoxSoundEffect -Effect Horn

    .EXAMPLE
        Invoke-PartyBoxSoundEffect -Effect Party
    #>

    [CmdletBinding()]
    param(
        [Parameter(Mandatory, Position = 0)]
        [ValidateSet(
            'Horn', 'Clapping', 'Scratch1', 'Scratch2', 'Scratch3',
            'Barking', 'Like', 'Boo', 'Ready',
            'Disco1', 'Disco2', 'Disco3',
            'Game', 'Party', 'Hey', 'HandsUp',
            'OneTwoThree', 'Jump', 'LetsGo'
        )]
        [string]$Effect
    )

    Test-PartyBoxSession -Throw

    $toneId = $script:SoundEffectIds[$Effect]
    Write-Verbose "Playing sound effect: $Effect (ID: $toneId)"

    $frame = New-PartyBoxFrame -Command $script:CmdSoundEffect -Payload @([byte]$toneId)

    Invoke-PartyBoxCommand -Data $frame
}
