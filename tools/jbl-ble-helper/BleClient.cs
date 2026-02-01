using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Windows.Devices.Bluetooth;
using Windows.Devices.Bluetooth.Advertisement;
using Windows.Devices.Bluetooth.GenericAttributeProfile;
using Windows.Devices.Enumeration;
using Windows.Storage.Streams;

namespace JblBleHelper;

public class BleClient
{
    // JBL vendor control service
    private static readonly Guid VendorServiceUuid = Guid.Parse("00001100-d102-11e1-9b23-00025b00a5a5");
    private static readonly Guid CommandCharUuid   = Guid.Parse("00001101-d102-11e1-9b23-00025b00a5a5");

    public static async Task<DeviceInformation[]> DiscoverAsync()
    {
        string selector = BluetoothLEDevice.GetDeviceSelector();
        var devices = await DeviceInformation.FindAllAsync(selector);
        return devices
            .Where(d => (d.Name?.IndexOf("JBL", StringComparison.OrdinalIgnoreCase) ?? -1) >= 0
                     || (d.Name?.IndexOf("PARTYBOX", StringComparison.OrdinalIgnoreCase) ?? -1) >= 0
                     || (d.Name?.IndexOf("STAGE 320", StringComparison.OrdinalIgnoreCase) ?? -1) >= 0)
            .ToArray();
    }

    public static async Task<DeviceInformation[]> DiscoverAllAsync()
    {
        string selector = BluetoothLEDevice.GetDeviceSelector();
        var devices = await DeviceInformation.FindAllAsync(selector);
        return devices.ToArray();
    }

    public static async Task<List<(ulong Address, string Name)>> ScanAsync(int seconds = 10)
    {
        var found = new Dictionary<ulong, string>();
        var watcher = new BluetoothLEAdvertisementWatcher
        {
            ScanningMode = BluetoothLEScanningMode.Active
        };

        var tcs = new TaskCompletionSource<bool>();

        watcher.Received += (sender, args) =>
        {
            var addr = args.BluetoothAddress;
            var name = args.Advertisement.LocalName ?? "";
            if (!found.ContainsKey(addr))
            {
                found[addr] = name;
            }
            else if (!string.IsNullOrEmpty(name) && string.IsNullOrEmpty(found[addr]))
            {
                found[addr] = name;
            }
        };

        watcher.Start();
        await Task.Delay(TimeSpan.FromSeconds(seconds));
        watcher.Stop();

        return found.Select(kv => (kv.Key, kv.Value)).ToList();
    }

    public static string FormatMac(ulong address)
    {
        var bytes = BitConverter.GetBytes(address);
        return $"{bytes[5]:x2}:{bytes[4]:x2}:{bytes[3]:x2}:{bytes[2]:x2}:{bytes[1]:x2}:{bytes[0]:x2}";
    }

    public static async Task<List<string>> ListServicesAsync(string mac)
    {
        var addr = ParseMac(mac);
        using var device = await BluetoothLEDevice.FromBluetoothAddressAsync(addr);
        if (device == null)
            throw new Exception("BLE_DEVICE_NOT_FOUND: Unable to open BluetoothLEDevice by address");

        var result = new List<string>();
        var servicesResult = await device.GetGattServicesAsync();
        if (servicesResult.Status == GattCommunicationStatus.Success)
        {
            foreach (var svc in servicesResult.Services)
            {
                result.Add($"Service: {svc.Uuid}");
                var charsResult = await svc.GetCharacteristicsAsync();
                if (charsResult.Status == GattCommunicationStatus.Success)
                {
                    foreach (var chr in charsResult.Characteristics)
                    {
                        result.Add($"  Char: {chr.Uuid} (Props: {chr.CharacteristicProperties})");
                    }
                }
                svc.Dispose();
            }
        }
        else
        {
            result.Add($"Failed to get services: {servicesResult.Status}");
        }
        return result;
    }

    public static ulong ParseMac(string mac)
    {
        var hex = mac.Replace(":", string.Empty).Replace("-", string.Empty);
        return Convert.ToUInt64(hex, 16);
    }

    public static async Task<bool> PowerOnByAddressAsync(string mac)
    {
        return await SendPowerCommandAsync(mac, 0x05); // Power On
    }

    public static async Task<bool> PowerOffByAddressAsync(string mac)
    {
        return await SendPowerCommandAsync(mac, 0x04); // Power Off
    }

    private static async Task<bool> SendPowerCommandAsync(string mac, byte powerState)
    {
        var addr = ParseMac(mac);
        using var device = await BluetoothLEDevice.FromBluetoothAddressAsync(addr);
        if (device == null)
            throw new Exception("BLE_DEVICE_NOT_FOUND: Unable to open BluetoothLEDevice by address");

        // Try to get the vendor control service
        var serviceResult = await device.GetGattServicesForUuidAsync(VendorServiceUuid);
        if (serviceResult.Status != GattCommunicationStatus.Success || serviceResult.Services.Count == 0)
            throw new Exception($"BLE_SERVICE_NOT_FOUND: Vendor control service {VendorServiceUuid} not available");

        var service = serviceResult.Services[0];
        try
        {
            var charResult = await service.GetCharacteristicsForUuidAsync(CommandCharUuid);
            if (charResult.Status != GattCommunicationStatus.Success || charResult.Characteristics.Count == 0)
                throw new Exception("BLE_CHAR_NOT_FOUND: Command characteristic 00001101 not available");

            var commandChar = charResult.Characteristics[0];

            // AA 03 01 [05=On / 04=Off]
            byte[] payload = new byte[] { 0xAA, 0x03, 0x01, powerState };
            using var writer = new DataWriter();
            writer.WriteBytes(payload);
            IBuffer buf = writer.DetachBuffer();
            var writeResult = await commandChar.WriteValueAsync(buf, GattWriteOption.WriteWithoutResponse);
            if (writeResult != GattCommunicationStatus.Success)
                throw new Exception($"BLE_WRITE_FAILED: {writeResult}");

            return true;
        }
        finally
        {
            service?.Dispose();
        }
    }
}
