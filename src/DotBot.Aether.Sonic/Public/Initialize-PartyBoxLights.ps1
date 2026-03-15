function Initialize-PartyBoxLights {
    <#
    .SYNOPSIS
        Initializes the PartyBox light system.

    .DESCRIPTION
        Sends the OFF, ON, NEON sequence required to initialize the light subsystem
        on the PartyBox speaker. This is automatically called by Connect-PartyBoxDevice
        but can also be called manually to re-initialize.

        Sequence:
          1. AA 33 04 00 99 01 00  (Lights OFF)
          2. AA 33 04 00 99 01 01  (Lights ON)
          3. AA 33 04 00 31 01 02  (Pattern NEON - initializes light system)

    .EXAMPLE
        Initialize-PartyBoxLights
    #>

    [CmdletBinding()]
    param()

    Test-PartyBoxSession -Throw

    Write-Verbose "Initializing light system (OFF -> ON -> NEON)"

    Disable-PartyBoxLight
    Enable-PartyBoxLight
    Set-PartyBoxLightPattern -Pattern Neon

    $script:PartyBoxSession.Initialized = $true

    Write-Verbose "Light system initialized"
}
