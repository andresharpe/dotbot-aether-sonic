function Invoke-PartyBoxCommand {
    <#
    .SYNOPSIS
        Core function for sending commands to the PartyBox speaker over RFCOMM.

    .DESCRIPTION
        Sends raw byte arrays to the speaker via the RFCOMM helper process
        stored in $script:PartyBoxSession. Includes retry logic with exponential
        backoff for transient failures.

    .PARAMETER Data
        Byte array containing the command frame to send.

    .PARAMETER MaxRetries
        Maximum number of retry attempts for transient failures. Default is 3.

    .EXAMPLE
        $frame = New-PartyBoxFrame -Command 0x33 -Payload @(0x00, 0x99, 0x01, 0x01)
        Invoke-PartyBoxCommand -Data $frame
    #>

    [CmdletBinding()]
    param(
        [Parameter(Mandatory)]
        [byte[]]$Data,

        [Parameter()]
        [ValidateRange(1, 10)]
        [int]$MaxRetries = 3
    )

    begin {
        Write-Verbose "Starting $($MyInvocation.MyCommand)"

        if (-not (Test-PartyBoxSession)) {
            Write-PartyBoxError -Message 'Not connected to a PartyBox speaker. Use Connect-PartyBoxDevice first.' `
                                -ErrorId 'PartyBoxSessionNotFound' `
                                -Category ConnectionError `
                                -Cmdlet $PSCmdlet
        }
    }

    process {
        $attempt = 0
        $lastError = $null

        while ($attempt -lt $MaxRetries) {
            $attempt++

            try {
                $session = $script:PartyBoxSession
                $process = $session.HelperProcess

                if (-not $process -or $process.HasExited) {
                    throw "Helper process is not running"
                }

                $hexStr = ($Data | ForEach-Object { $_.ToString("X2") }) -join ""
                Write-Verbose "Attempt $attempt of $MaxRetries - Sending: $hexStr"

                $response = script:Send-RfcommHelperCommand -Process $process -Command "SEND $hexStr"

                if ($response -eq 'OK') {
                    # Update last contact timestamp
                    $session.LastContact = [DateTime]::Now

                    # Inter-command delay
                    Start-Sleep -Milliseconds $script:CommandDelayMs

                    Write-Verbose "Data sent successfully"
                    return $true
                }
                elseif ($response -like 'ERROR*') {
                    throw $response.Substring(6).Trim()
                }
                else {
                    throw "Unexpected response: $response"
                }
            }
            catch {
                $lastError = $_
                Write-Verbose "Error on attempt $attempt : $($_.Exception.Message)"

                # Don't retry on permanent errors
                if ($_.Exception.Message -match 'not exist|not found|invalid|access denied') {
                    break
                }

                if ($attempt -ge $MaxRetries) {
                    break
                }

                # Exponential backoff: 1s, 2s, 4s
                $backoffSeconds = [Math]::Pow(2, $attempt - 1)
                Write-Verbose "Waiting $backoffSeconds seconds before retry..."
                Start-Sleep -Seconds $backoffSeconds
            }
        }

        # All retries exhausted
        if ($lastError) {
            Write-PartyBoxError -Message "Failed to send command after $attempt attempt(s): $($lastError.Exception.Message)" `
                                -ErrorId 'PartyBoxCommandFailed' `
                                -Category ConnectionError `
                                -TargetObject $Data `
                                -Cmdlet $PSCmdlet
        }
    }

    end {
        Write-Verbose "Completed $($MyInvocation.MyCommand)"
    }
}

function Get-PartyBoxStream {
    <#
    .SYNOPSIS
        Returns the helper process from the session if available.
    #>
    [CmdletBinding()]
    param()

    $session = $script:PartyBoxSession
    if (-not $session) { return $null }

    if ($session.HelperProcess -and -not $session.HelperProcess.HasExited) {
        return $session.HelperProcess
    }

    return $null
}

function Close-PartyBoxStream {
    <#
    .SYNOPSIS
        Gracefully terminates the helper process in the current session.
    #>
    [CmdletBinding()]
    param()

    $session = $script:PartyBoxSession
    if (-not $session) { return }

    script:Stop-RfcommHelperProcess -Process $session.HelperProcess
    $session.HelperProcess = $null
    $session.Connected = $false
}
