function Disconnect-AetherSonic {
    <#
    .SYNOPSIS
        Disconnect from JBL PartyBox hardware.
    .DESCRIPTION
        Clean shutdown of the Sonic conduit.
    #>
    [CmdletBinding()]
    param()
    Write-Verbose "Disconnecting Aether Sonic conduit..."
    Disconnect-PartyBoxDevice @PSBoundParameters
}
