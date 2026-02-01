function Test-PartyBoxSession {
    <#
    .SYNOPSIS
        Checks whether a valid PartyBox session exists.

    .DESCRIPTION
        Returns $true if $script:PartyBoxSession is non-null and marked as Connected.
        With -Throw, throws a terminating error instead of returning $false.

    .PARAMETER Throw
        If specified, throws a terminating error when no valid session exists
        instead of returning $false.

    .OUTPUTS
        [bool] $true if a valid session exists, $false otherwise (unless -Throw is used).
    #>

    [CmdletBinding()]
    [OutputType([bool])]
    param(
        [Parameter()]
        [switch]$Throw
    )

    $valid = ($null -ne $script:PartyBoxSession -and $script:PartyBoxSession.Connected -eq $true)

    if (-not $valid -and $Throw) {
        Write-PartyBoxError -Message 'Not connected to a PartyBox speaker. Use Connect-PartyBoxDevice first.' `
                            -ErrorId 'PartyBoxSessionNotFound' `
                            -Category ConnectionError `
                            -Cmdlet $PSCmdlet
    }

    return $valid
}
