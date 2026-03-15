function Find-AetherSonic {
    <#
    .SYNOPSIS
        Discover JBL PartyBox hardware on network/bus.
    .DESCRIPTION
        Delegates to the underlying hardware discovery function.
    #>
    [CmdletBinding()]
    param()
    Write-Verbose "Discovering Aether Sonic hardware..."
    Find-PartyBoxDevice @PSBoundParameters
}
