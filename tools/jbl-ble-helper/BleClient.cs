using System;
using System.Linq;
using System.Threading.Tasks;
using Windows.Devices.Bluetooth;
using Windows.Devices.Bluetooth.GenericAttributeProfile;
using Windows.Devices.Enumeration;
using Windows.Storage.Streams;

namespace JblBleHelper;

public class BleClient
{
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

    public static ulong ParseMac(string mac)
    {
        var hex = mac.Replace(":", string.Empty).Replace("-", string.Empty);
        return Convert.ToUInt64(hex, 16);
    }

    public static async Task<bool> PowerOnByAddressAsync(string mac)
    {
        var addr = ParseMac(mac);
        using var device = await BluetoothLEDevice.FromBluetoothAddressAsync(addr);
        if (device == null)
            throw new Exception("BLE_DEVICE_NOT_FOUND: Unable to open BluetoothLEDevice by address");

        // Try to get the vendor control service
        var serviceResult = await device.GetGattServicesForUuidAsync(VendorServiceUuid);
        if (serviceResult.Status != GattCommunicationStatus.Success || serviceResult.Services.Count == 0)
            throw new Exception("BLE_SERVICE_NOT_FOUND: Vendor control service 00001100 not available");

        var service = serviceResult.Services[0];
        try
        {
            var charResult = await service.GetCharacteristicsForUuidAsync(CommandCharUuid);
            if (charResult.Status != GattCommunicationStatus.Success || charResult.Characteristics.Count == 0)
                throw new Exception("BLE_CHAR_NOT_FOUND: Command characteristic 00001101 not available");

            var commandChar = charResult.Characteristics[0];

            // AA 03 01 05  => Power On
            byte[] payload = new byte[] { 0xAA, 0x03, 0x01, 0x05 };
            using var writer = new DataWriter();
            writer.WriteBytes(payload);
            IBuffer buf = writer.DetachBuffer();
            var writeResult = await commandChar.WriteValueAsync(buf, GattWriteOption.WriteWithResponse);
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
