function Test-AetherSonic {
    <#
    .SYNOPSIS
        Health check for the Sonic conduit.
    .DESCRIPTION
        Returns $true if the JBL PartyBox hardware is reachable.
    #>
    [CmdletBinding()]
    param()
    Write-Verbose "Testing Aether Sonic conduit health..."
    Test-PartyBoxConnection @PSBoundParameters
}
