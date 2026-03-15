# BLE Power Control - Research Notes

## Status: Work in Progress
The BLE power on/off commands are being sent successfully but the speaker does not respond to them. Further investigation needed.

## What We Know

### BLE vs Classic Bluetooth
The JBL PartyBox Stage 320 uses **two different Bluetooth interfaces**:
- **Classic Bluetooth (RFCOMM)**: Used for audio streaming and the control protocol (lighting, sound effects, etc.)
- **Bluetooth Low Energy (BLE)**: Used by the JBL Portable app for power control and device discovery

**Important**: BLE and Classic BT use **different MAC addresses**. You cannot use the Classic BT MAC for BLE commands.

### BLE Discovery
Windows BLE enumeration (`BluetoothLEDevice.GetDeviceSelector()`) only shows paired BLE devices. To find JBL speakers, we use active BLE scanning via `BluetoothLEAdvertisementWatcher`.

Scan results show the speakers advertising as "JBL PartyBox Stage 320" with rotating random BLE addresses like:
- `XX:XX:XX:XX:XX:01`
- `XX:XX:XX:XX:XX:02`
- `XX:XX:XX:XX:XX:03`

### GATT Services Found
From BLE service discovery on a JBL PartyBox Stage 320:

```
Service: 00001100-d102-11e1-9b23-00025b00a5a5  (JBL Vendor Control)
  Char: 00001101-d102-11e1-9b23-00025b00a5a5 (Props: Write)
  Char: 00001102-d102-11e1-9b23-00025b00a5a5 (Props: Read, Notify)
  Char: 00001103-d102-11e1-9b23-00025b00a5a5 (Props: Read, WriteWithoutResponse, Notify)

Service: 0000eb10-d102-11e1-9b23-00025b00a5a5
  Char: 0000eb11-d102-11e1-9b23-00025b00a5a5 (Props: Read)
  Char: 0000eb12-d102-11e1-9b23-00025b00a5a5 (Props: Read)
  Char: 0000eb13-d102-11e1-9b23-00025b00a5a5 (Props: Write, Indicate)
  Char: 0000eb14-d102-11e1-9b23-00025b00a5a5 (Props: Write)

Service: 0000fd92-0000-1000-8000-00805f9b34fb
  Char: 0000eb20-d102-11e1-9b23-00025b00a5a5 (Props: Read, Notify)
  Char: 0000eb21-d102-11e1-9b23-00025b00a5a5 (Props: Write)
  Char: 0000eb22-d102-11e1-9b23-00025b00a5a5 (Props: Read, Notify)
```

### Power Commands from Decompiled JBL App
From decompiled JBL Portable APK (`com.harman.ble.jblportable`):
- **Power ON**: `AA 03 01 05` (ReqPowerOnCommand.java)
- **Power OFF**: `AA 03 01 04` (ReqPowerOffCommand.java)

### Wireshark Capture Analysis
Captured BLE traffic between Android JBL app and speaker shows:
- Commands sent to GATT handle `0x0042`
- Service UUID in capture: `00000211-b2d1-43f0-9b88-960cebf8b91e`
- Characteristic UUID: `00000213-b2d1-43f0-9b88-960cebf8b91e`

**Note**: This is a different service UUID than what Windows discovers (`00001100-...`). The Android app may use a phone-specific pairing service or the speaker may expose different services to paired vs unpaired devices.

### Current Implementation
The BLE helper (`tools/jbl-ble-helper/`) supports:
- `scan [seconds]` - Active BLE scan for devices
- `discover` - List paired BLE devices
- `discoverall` - List all paired BLE devices
- `services <mac>` - List GATT services on a device
- `poweron <mac>` - Send power on command (AA 03 01 05)
- `poweroff <mac>` - Send power off command (AA 03 01 04)

Commands are sent to characteristic `00001101-d102-11e1-9b23-00025b00a5a5` using `WriteWithoutResponse`.

### What's Not Working
- BLE commands send successfully (no errors) but speaker doesn't respond
- Possible causes:
  1. Need to pair/bond with the speaker first via BLE
  2. Need to send initialization/handshake commands first
  3. Different characteristic or service required
  4. Command format may need additional bytes (checksum, sequence number, etc.)
  5. May need to enable notifications on response characteristic first

## Next Steps to Investigate
1. **BLE Pairing**: Try pairing the speaker as a BLE device in Windows
2. **Capture More Traffic**: Get Wireshark captures of actual power on/off sequences
3. **Notification Subscription**: Subscribe to `00001102` notifications before sending commands
4. **Try Other Characteristics**: Test writing to `00001103` or `0000eb13`
5. **Command Format**: Compare full command sequences in Wireshark captures
6. **Handshake**: Look for initialization sequence in JBL app decompilation

## Files
- `tools/jbl-ble-helper/` - .NET BLE helper application
- `docs/wireshark-01.json` - Captured BLE traffic (JSON format)
- `docs/wireshark-01.txt` - Captured BLE traffic (text format)
