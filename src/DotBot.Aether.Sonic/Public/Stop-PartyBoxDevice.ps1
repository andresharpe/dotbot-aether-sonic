function Stop-PartyBoxDevice {
    <#
    .SYNOPSIS
        Powers off a JBL PartyBox speaker via BLE.

    .DESCRIPTION
        Scans for JBL PartyBox speakers via BLE and sends a GATT power-off command
        (AA 03 01 04) to put the speaker into standby. If currently connected via RFCOMM,
        disconnects first. Note that BLE MAC addresses are different from Classic Bluetooth.

    .PARAMETER BleMacAddress
        The BLE MAC address of the speaker (from a BLE scan, not Classic BT).
        If not provided, scans for JBL PartyBox devices and sends to all found.

    .PARAMETER ScanSeconds
        How long to scan for BLE devices (default: 5 seconds).

    .EXAMPLE
        Stop-PartyBoxDevice
        # Scans and powers off all found JBL PartyBox speakers

    .EXAMPLE
        Stop-PartyBoxDevice -BleMacAddress '45:e2:99:2a:e1:c7'
        # Powers off a specific speaker by BLE MAC
    #>

    [CmdletBinding()]
    param(
        [Parameter(Position = 0)]
        [string]$BleMacAddress,

        [Parameter()]
        [int]$ScanSeconds = 5
    )

    process {
        if (-not $script:BleHelperAvailable) {
            Write-PartyBoxError -Message 'BLE helper not available. Build with: dotnet build tools/jbl-ble-helper' `
                                -ErrorId 'BleHelperNotAvailable' `
                                -Category NotInstalled `
                                -Cmdlet $PSCmdlet
            return
        }

        # Disconnect any active RFCOMM session first
        if ($script:PartyBoxSession -and $script:PartyBoxSession.Connected) {
            Write-Verbose "Disconnecting RFCOMM session before power-off"
            Disconnect-PartyBoxDevice
        }

        $bleMacs = @()
        if ($BleMacAddress) {
            $bleMacs = @($BleMacAddress)
        }
        else {
            # Scan for JBL devices
            Write-Verbose "Scanning for JBL PartyBox devices via BLE..."
            $devices = script:Find-PartyBoxBleMac -ScanSeconds $ScanSeconds
            if (-not $devices -or $devices.Count -eq 0) {
                Write-PartyBoxError -Message 'No JBL PartyBox devices found via BLE scan. Ensure speakers are powered on and in range.' `
                                    -ErrorId 'NoDevicesFound' `
                                    -Category ObjectNotFound `
                                    -Cmdlet $PSCmdlet
                return
            }
            $bleMacs = $devices | ForEach-Object { $_.Mac }
            Write-Verbose "Found $($bleMacs.Count) JBL device(s): $($bleMacs -join ', ')"
        }

        foreach ($mac in $bleMacs) {
            Write-Verbose "Sending power-off command to $mac"
            $result = script:Invoke-PartyBoxBlePowerOff -BleMacAddress $mac
            if ($result) {
                Write-Verbose "Power-off command sent successfully to $mac"
                [PSCustomObject]@{
                    PSTypeName     = 'JblPartyBox.PowerResult'
                    BleMacAddress  = $mac
                    Action         = 'PowerOff'
                    Success        = $true
                }
            }
            else {
                Write-PartyBoxError -Message "Failed to power off $mac. Ensure the speaker is in BLE range." `
                                    -ErrorId 'PowerOffFailed' `
                                    -Category ConnectionError `
                                    -TargetObject $mac `
                                    -Cmdlet $PSCmdlet
            }
        }
    }
}
