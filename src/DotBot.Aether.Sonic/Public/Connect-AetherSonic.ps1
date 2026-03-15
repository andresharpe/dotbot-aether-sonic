function Connect-AetherSonic {
    <#
    .SYNOPSIS
        Connect to discovered JBL PartyBox hardware.
    .DESCRIPTION
        Delegates to the underlying hardware connection function.
    #>
    [CmdletBinding()]
    param()
    Write-Verbose "Connecting Aether Sonic conduit..."
    Connect-PartyBoxDevice @PSBoundParameters
}
