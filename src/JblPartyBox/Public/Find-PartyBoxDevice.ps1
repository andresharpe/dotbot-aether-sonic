function Find-PartyBoxDevice {
    <#
    .SYNOPSIS
        Discovers paired JBL PartyBox speakers via Bluetooth RFCOMM.

    .DESCRIPTION
        Enumerates paired Bluetooth devices using the RFCOMM helper tool,
        filtering for devices with the "GAIA" service name used by JBL PartyBox speakers.

    .EXAMPLE
        Find-PartyBoxDevice

        Name                DeviceId
        ----                --------
        GAIA                Bluetooth#Bluetooth00:11:22:33:44:55-...

    .EXAMPLE
        Find-PartyBoxDevice | Connect-PartyBoxDevice

    .OUTPUTS
        PSCustomObject with Name and DeviceId properties for each discovered speaker.
    #>

    [CmdletBinding()]
    param()

    Write-Verbose "Searching for paired JBL PartyBox speakers..."

    try {
        $json = script:Invoke-RfcommHelper -Arguments @('discover')
        $devices = $json | ConvertFrom-Json

        Write-Verbose "Found $($devices.Count) GAIA devices"

        if (-not $devices -or $devices.Count -eq 0) {
            Write-Warning "No JBL PartyBox speakers found. Ensure the speaker is paired via Windows Bluetooth settings."
            return
        }

        foreach ($device in $devices) {
            [PSCustomObject]@{
                PSTypeName = 'JblPartyBox.DeviceInfo'
                Name       = $device.Name
                DeviceId   = $device.Id
            }
        }
    }
    catch {
        Write-PartyBoxError -Message "Failed to discover PartyBox devices: $($_.Exception.Message)" `
                            -ErrorId 'PartyBoxDiscoveryFailed' `
                            -Category ObjectNotFound `
                            -Cmdlet $PSCmdlet
    }
}
