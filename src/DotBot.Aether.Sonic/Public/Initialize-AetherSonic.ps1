function Initialize-AetherSonic {
    <#
    .SYNOPSIS
        Initialize the Sonic conduit (JBL PartyBox).
    .DESCRIPTION
        Accepts configuration, validates hardware reachability, and prepares
        the Sonic conduit for event handling.
    .PARAMETER Config
        Hashtable of conduit configuration from dotbot settings.
    #>
    [CmdletBinding()]
    param(
        [Parameter(Mandatory)]
        [hashtable]$Config
    )
    Write-Verbose "Initializing Aether Sonic conduit..."
    $script:AetherConfig = $Config
    $result = Test-PartyBoxConnection -ErrorAction SilentlyContinue
    if ($result) {
        Write-Verbose "Aether Sonic conduit initialized successfully."
    }
    $result
}
