function Get-PartyBoxLightStatus {
    <#
    .SYNOPSIS
        Requests the current light status from the PartyBox speaker.

    .DESCRIPTION
        Sends a light info request command (AA 31 00) and reads the response.
        Returns the raw response bytes for inspection.

    .EXAMPLE
        Get-PartyBoxLightStatus
    #>

    [CmdletBinding()]
    param()

    Test-PartyBoxSession -Throw

    Write-Verbose "Requesting light status"

    $frame = New-PartyBoxFrame -Command $script:CmdLightInfo

    Invoke-PartyBoxCommand -Data $frame

    # Attempt to read response
    try {
        $reader = $script:PartyBoxSession.Reader
        if ($reader) {
            $loadTask = $reader.LoadAsync(256)
            $loaded = script:Await $loadTask ([uint32])

            if ($loaded -gt 0) {
                $bytes = [byte[]]::new($loaded)
                $reader.ReadBytes($bytes)

                $hexStr = ($bytes | ForEach-Object { $_.ToString("X2") }) -join " "
                Write-Verbose "Light status response: $hexStr"

                [PSCustomObject]@{
                    PSTypeName    = 'JblPartyBox.LightStatus'
                    RawBytes      = $bytes
                    HexString     = $hexStr
                    ByteCount     = $loaded
                }
            }
            else {
                Write-Verbose "No response received for light status request"
            }
        }
    }
    catch {
        Write-Verbose "Error reading light status response: $($_.Exception.Message)"
    }
}
