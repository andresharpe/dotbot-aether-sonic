function Write-PartyBoxError {
    <#
    .SYNOPSIS
        Creates and throws a standardized terminating error for the JblPartyBox module.

    .DESCRIPTION
        Builds an ErrorRecord with a consistent format and throws it as a terminating error
        via the calling cmdlet's $PSCmdlet context.

    .PARAMETER Message
        The error message.

    .PARAMETER ErrorId
        A string identifier for the error (e.g., 'PartyBoxSessionNotFound').

    .PARAMETER Category
        The ErrorCategory enum value.

    .PARAMETER TargetObject
        Optional object that the error relates to.

    .PARAMETER Cmdlet
        The $PSCmdlet automatic variable from the calling function, used to throw
        the terminating error in the correct scope.
    #>

    [CmdletBinding()]
    param(
        [Parameter(Mandatory)]
        [string]$Message,

        [Parameter(Mandatory)]
        [string]$ErrorId,

        [Parameter(Mandatory)]
        [System.Management.Automation.ErrorCategory]$Category,

        [Parameter()]
        [object]$TargetObject,

        [Parameter(Mandatory)]
        [System.Management.Automation.PSCmdlet]$Cmdlet
    )

    $errorRecord = [System.Management.Automation.ErrorRecord]::new(
        [System.InvalidOperationException]::new($Message),
        $ErrorId,
        $Category,
        $TargetObject
    )

    $Cmdlet.ThrowTerminatingError($errorRecord)
}
