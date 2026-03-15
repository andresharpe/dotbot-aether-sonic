function Connect-PartyBoxDevice {
    <#
    .SYNOPSIS
        Connects to a JBL PartyBox speaker over Bluetooth RFCOMM.

    .DESCRIPTION
        Launches the RFCOMM helper process in interactive mode and establishes
        a connection to the specified PartyBox speaker. Stores the session
        in $script:PartyBoxSession and automatically calls Initialize-PartyBoxLights.

    .PARAMETER DeviceId
        The Bluetooth device ID to connect to. Can be obtained from Find-PartyBoxDevice.

    .PARAMETER InputObject
        A device object from Find-PartyBoxDevice, accepted from the pipeline.

    .PARAMETER SkipInitialize
        If specified, skips the automatic light initialization sequence after connecting.

    .EXAMPLE
        Find-PartyBoxDevice | Connect-PartyBoxDevice

    .EXAMPLE
        Connect-PartyBoxDevice -DeviceId 'Bluetooth#Bluetooth00:11:22:33:44:55-...'
    #>

    [CmdletBinding(DefaultParameterSetName = 'ById')]
    param(
        [Parameter(Mandatory, ParameterSetName = 'ById', Position = 0)]
        [string]$DeviceId,

        [Parameter(Mandatory, ParameterSetName = 'ByPipeline', ValueFromPipeline)]
        [PSTypeName('JblPartyBox.DeviceInfo')]
        [object]$InputObject,

        [Parameter()]
        [switch]$SkipInitialize
    )

    process {
        if ($PSCmdlet.ParameterSetName -eq 'ByPipeline') {
            $DeviceId = $InputObject.DeviceId
            $DeviceName = $InputObject.Name
        }
        else {
            $DeviceName = 'JBL PartyBox'
        }

        # Disconnect existing session if any
        if ($script:PartyBoxSession -and $script:PartyBoxSession.Connected) {
            Write-Verbose "Disconnecting existing session"
            Disconnect-PartyBoxDevice
        }

        Write-Verbose "Connecting to device: $DeviceId"

        try {
            # Start helper process in interactive mode
            $process = script:Start-RfcommHelperProcess -DeviceId $DeviceId

            $script:PartyBoxSession = @{
                DeviceName     = $DeviceName
                DeviceId       = $DeviceId
                Connected      = $true
                LastContact    = [DateTime]::Now
                Initialized    = $false
                HelperProcess  = $process
            }

            Write-Verbose "Connected to $DeviceName"

            if (-not $SkipInitialize) {
                Initialize-PartyBoxLights
            }
        }
        catch {
            $errorMsg = $_.Exception.Message

            # Try auto power-on via BLE if likely powered off and helper is available
            $shouldTryBle = $false
            if ($script:BleHelperAvailable -and ($errorMsg -match 'DEVICE_NOT_AVAILABLE|DEVICE_NOT_FOUND|HOST_UNREACHABLE')) {
                $shouldTryBle = $true
            }

            if ($shouldTryBle) {
                Write-Verbose "Attempting BLE power-on for $DeviceName"
                $mac = script:Get-MacAddressFromRfcommDeviceId -RfcommDeviceId $DeviceId
                $powered = if ($mac) { script:Invoke-PartyBoxBlePowerOn -MacAddress $mac } else { $false }
                if ($powered) {
                    Start-Sleep -Seconds 3
                    Write-Verbose "Retrying RFCOMM connect after BLE power-on"
                    try {
                        $process = script:Start-RfcommHelperProcess -DeviceId $DeviceId
                        $script:PartyBoxSession = @{
                            DeviceName     = $DeviceName
                            DeviceId       = $DeviceId
                            Connected      = $true
                            LastContact    = [DateTime]::Now
                            Initialized    = $false
                            HelperProcess  = $process
                        }
                        if (-not $SkipInitialize) { Initialize-PartyBoxLights }
                        return
                    }
                    catch {
                        $errorMsg = $_.Exception.Message
                    }
                }
            }
            
            # Parse specific error codes from helper for user-friendly messages
            $userMessage = switch -Regex ($errorMsg) {
                'DEVICE_NOT_AVAILABLE'   { "Speaker is not powered on. Please turn on the speaker and try again." }
                'CONNECTION_REFUSED'     { "Speaker refused connection. Ensure it's powered on and not connected to the JBL app or another device." }
                'RESOURCE_IN_USE'        { "Speaker is already connected to another application. Close the JBL PartyBox app and try again." }
                'DEVICE_NOT_FOUND'       { "Speaker not found. Ensure it's powered on, paired to this PC, and within Bluetooth range." }
                'HOST_UNREACHABLE'       { "Cannot reach the speaker. Ensure it's powered on and within Bluetooth range." }
                default                  { "Failed to connect to PartyBox device: $errorMsg" }
            }
            
            Write-PartyBoxError -Message $userMessage `
                                -ErrorId 'PartyBoxConnectionFailed' `
                                -Category ConnectionError `
                                -TargetObject $DeviceId `
                                -Cmdlet $PSCmdlet
        }
    }
}
