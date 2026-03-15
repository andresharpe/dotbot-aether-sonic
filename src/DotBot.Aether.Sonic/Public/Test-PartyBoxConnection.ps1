function Test-PartyBoxConnection {
    <#
    .SYNOPSIS
        Tests whether the current PartyBox connection is active.

    .DESCRIPTION
        Returns $true if a session exists and the stream is writable, $false otherwise.

    .EXAMPLE
        if (Test-PartyBoxConnection) { Enable-PartyBoxLight }

    .OUTPUTS
        [bool]
    #>

    [CmdletBinding()]
    [OutputType([bool])]
    param()

    if (-not $script:PartyBoxSession) {
        return $false
    }

    if (-not $script:PartyBoxSession.Connected) {
        return $false
    }

    # Check if helper process is still running
    if (-not $script:PartyBoxSession.HelperProcess -or $script:PartyBoxSession.HelperProcess.HasExited) {
        return $false
    }

    return $true
}
