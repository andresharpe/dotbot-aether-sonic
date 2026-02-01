# JBL PartyBox Stage 320 - Complete BLE Protocol Test
# Based on decompiled APK analysis

$ErrorActionPreference = "Stop"

# Load WinRT types for PowerShell 7+
Add-Type -AssemblyName System.Runtime.WindowsRuntime

$asTaskGeneric = ([System.WindowsRuntimeSystemExtensions].GetMethods() | Where-Object { $_.Name -eq 'AsTask' -and $_.GetParameters().Count -eq 1 -and $_.GetParameters()[0].ParameterType.Name -eq 'IAsyncOperation`1' })[0]
function Await($WinRTTask, $ResultType) {
    $asTask = $asTaskGeneric.MakeGenericMethod($ResultType)
    $netTask = $asTask.Invoke($null, @($WinRTTask))
    $netTask.Wait(-1) | Out-Null
    $netTask.Result
}

[Windows.Devices.Bluetooth.BluetoothLEDevice, Windows.Devices.Bluetooth, ContentType = WindowsRuntime] | Out-Null
[Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcher, Windows.Devices.Bluetooth, ContentType = WindowsRuntime] | Out-Null
[Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic, Windows.Devices.Bluetooth, ContentType = WindowsRuntime] | Out-Null
[Windows.Storage.Streams.DataWriter, Windows.Storage.Streams, ContentType = WindowsRuntime] | Out-Null

# Correct UUIDs from AppConfig.java
$SERVICE_UUID = "65786365-6C70-6F69-6E74-2E636F6D0000"  # excelpoint.com service
$RX_UUID = "65786365-6C70-6F69-6E74-2E636F6D0001"      # Write to speaker
$TX_UUID = "65786365-6C70-6F69-6E74-2E636F6D0002"      # Read from speaker
$DESCRIPTOR_UUID = "00002902-0000-1000-8000-00805F9B34FB"  # CCCD

# Protocol constants from BaseCommand.java
$IDENTIFIER = 0xAA  # -86 signed
$CMD_SET_LIGHT = 0x33  # 51 decimal
$CMD_LIGHT_INFO = 0x31  # 49 decimal

# Device type - Stage 320 specific
# From Wireshark capture: all commands use 0x00 as first payload byte
$DEVICE_INDEX = 0x00

# Light patterns from LightPattern.java
$PATTERNS = @{
    OFF = 0
    ROCK = 1
    NEON = 2
    CLUB = 3
    FLOW = 4
    RIPPLE = 5
    CROSS = 6
    FLASH = 7
    CUSTOM = 8
    LOOP = 9
    BOUNCE = 10
    TRIM = 11
    SWITCH = 12
    FREEZE = 13
}

function Build-Command {
    param(
        [byte]$Command,
        [byte[]]$Payload
    )
    
    $length = if ($Payload) { $Payload.Length } else { 0 }
    $frame = @($IDENTIFIER, $Command, $length) + $Payload
    return $frame
}

function Build-SetColorCommand {
    param(
        [int]$Red,
        [int]$Green,
        [int]$Blue
    )
    
    # From i.java line 88: [device_type, 0x36, 0x01, 0x01, 0x32, 0x03, R, G, B]
    $payload = @(
        $DEVICE_INDEX,
        0x36,  # Color setting sub-command
        0x01,  # Length
        0x01,  # Static color mode
        0x32,  # RGB mode indicator (50 decimal)
        0x03,  # RGB length
        $Red,
        $Green,
        $Blue
    )
    
    return Build-Command -Command $CMD_SET_LIGHT -Payload $payload
}

function Build-SetPatternCommand {
    param(
        [int]$PatternId
    )
    
    # From i.java line 104: [device_type, 0x31, 0x01, pattern_id]
    $payload = @(
        $DEVICE_INDEX,
        0x31,  # Pattern sub-command  
        0x01,  # Length
        $PatternId
    )
    
    return Build-Command -Command $CMD_SET_LIGHT -Payload $payload
}

function Build-LightOnOffCommand {
    param(
        [bool]$On
    )
    
    # From i.java line 182: [device_type, 0x99, 0x01, on_off]
    $payload = @(
        $DEVICE_INDEX,
        0x99,  # Main light switch (-103 signed = 0x99 = 153 unsigned)
        0x01,  # Length
        (if ($On) { 0x01 } else { 0x00 })
    )
    
    return Build-Command -Command $CMD_SET_LIGHT -Payload $payload
}

function Connect-JBLSpeaker {
    param([string]$DeviceId)
    
    Write-Host "Connecting to: $DeviceId"
    $device = [Windows.Devices.Bluetooth.BluetoothLEDevice]::FromIdAsync($DeviceId).GetAwaiter().GetResult()
    
    Write-Host "Getting GATT services..."
    $servicesResult = $device.GetGattServicesAsync().GetAwaiter().GetResult()
    
    $service = $servicesResult.Services | Where-Object { $_.Uuid.ToString() -eq $SERVICE_UUID }
    if (!$service) {
        throw "Service $SERVICE_UUID not found!"
    }
    
    Write-Host "Getting characteristics..."
    $charsResult = $service.GetCharacteristicsAsync().GetAwaiter().GetResult()
    
    $rxChar = $charsResult.Characteristics | Where-Object { $_.Uuid.ToString() -eq $RX_UUID }
    $txChar = $charsResult.Characteristics | Where-Object { $_.Uuid.ToString() -eq $TX_UUID }
    
    if (!$rxChar) { throw "RX characteristic not found!" }
    if (!$txChar) { throw "TX characteristic not found!" }
    
    # Enable notifications on TX
    Write-Host "Enabling notifications..."
    $status = $txChar.WriteClientCharacteristicConfigurationDescriptorAsync(
        [Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue]::Notify
    ).GetAwaiter().GetResult()
    
    Write-Host "Notification status: $status"
    
    return @{
        Device = $device
        RxChar = $rxChar
        TxChar = $txChar
    }
}

function Send-Command {
    param(
        $Connection,
        [byte[]]$Command
    )
    
    $hexStr = ($Command | ForEach-Object { $_.ToString("X2") }) -join " "
    Write-Host "`nSending: $hexStr"
    
    $writer = [Windows.Storage.Streams.DataWriter]::new()
    $writer.WriteBytes($Command)
    $buffer = $writer.DetachBuffer()
    
    $result = $Connection.RxChar.WriteValueAsync($buffer).GetAwaiter().GetResult()
    Write-Host "Write result: $result"
    
    Start-Sleep -Milliseconds 500
}

# Main test
Write-Host "=== JBL PartyBox Stage 320 BLE Protocol Test ==="
Write-Host ""
Write-Host "Scanning for speakers..."

$watcher = [Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcher]::new()
$watcher.ScanningMode = [Windows.Devices.Bluetooth.Advertisement.BluetoothLEScanningMode]::Active

$devices = @{}
$handler = {
    param($sender, $args)
    $name = $args.Advertisement.LocalName
    if ($name -like "*JBL*Stage*" -or $name -like "*PartyBox*") {
        $devices[$args.BluetoothAddress] = @{
            Name = $name
            Address = $args.BluetoothAddress
            Id = "BluetoothLE#BluetoothLE{0:x12}" -f $args.BluetoothAddress
        }
    }
}

$watcher.add_Received($handler)
$watcher.Start()
Start-Sleep -Seconds 5
$watcher.Stop()

if ($devices.Count -eq 0) {
    Write-Host "No JBL PartyBox speakers found!"
    exit 1
}

Write-Host "`nFound speakers:"
$devices.Values | ForEach-Object { Write-Host "- $($_.Name) [$($_.Id)]" }

# Connect to first speaker
$speaker = $devices.Values | Select-Object -First 1
$conn = Connect-JBLSpeaker -DeviceId $speaker.Id

Write-Host "`n=== Testing Commands ==="

# Test 1: Turn lights ON
Write-Host "`n1. Turning lights ON"
Send-Command -Connection $conn -Command (Build-LightOnOffCommand -On $true)

# Test 2: Set static RED
Write-Host "`n2. Setting color to RED"
Send-Command -Connection $conn -Command (Build-SetColorCommand -Red 255 -Green 0 -Blue 0)

Start-Sleep -Seconds 2

# Test 3: Set static GREEN  
Write-Host "`n3. Setting color to GREEN"
Send-Command -Connection $conn -Command (Build-SetColorCommand -Red 0 -Green 255 -Blue 0)

Start-Sleep -Seconds 2

# Test 4: Set static BLUE
Write-Host "`n4. Setting color to BLUE"
Send-Command -Connection $conn -Command (Build-SetColorCommand -Red 0 -Green 0 -Blue 255)

Start-Sleep -Seconds 2

# Test 5: Set pattern ROCK
Write-Host "`n5. Setting pattern to ROCK"
Send-Command -Connection $conn -Command (Build-SetPatternCommand -PatternId $PATTERNS.ROCK)

Start-Sleep -Seconds 3

# Test 6: Set pattern NEON
Write-Host "`n6. Setting pattern to NEON"
Send-Command -Connection $conn -Command (Build-SetPatternCommand -PatternId $PATTERNS.NEON)

Write-Host "`n=== Test Complete ==="
Write-Host "Did the lights change? If not, try different DEVICE_INDEX values (0x00, 0x01, etc.)"

$conn.Device.Dispose()
