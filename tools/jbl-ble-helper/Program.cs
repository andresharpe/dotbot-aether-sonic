using System;
using System.Linq;
using System.Text.Json;
using System.Threading.Tasks;

namespace JblBleHelper;

class Program
{
    static async Task<int> Main(string[] args)
    {
        if (args.Length == 0 || args[0] is "--help" or "-h")
        {
            PrintHelp();
            return 0;
        }

        try
        {
            switch (args[0].ToLowerInvariant())
            {
                case "discover":
                    var devices = await BleClient.DiscoverAsync();
                    var json = JsonSerializer.Serialize(devices.Select(d => new { d.Id, d.Name }), new JsonSerializerOptions { WriteIndented = true });
                    Console.WriteLine(json);
                    return 0;

                case "discoverall":
                    var allDevices = await BleClient.DiscoverAllAsync();
                    var allJson = JsonSerializer.Serialize(allDevices.Select(d => new { d.Id, d.Name }), new JsonSerializerOptions { WriteIndented = true });
                    Console.WriteLine(allJson);
                    return 0;

                case "scan":
                    int scanTime = args.Length > 1 && int.TryParse(args[1], out var s) ? s : 5;
                    Console.WriteLine($"Scanning for {scanTime} seconds...");
                    var scanned = await BleClient.ScanAsync(scanTime);
                    var scanJson = JsonSerializer.Serialize(
                        scanned.Select(d => new { Mac = BleClient.FormatMac(d.Address), d.Name }),
                        new JsonSerializerOptions { WriteIndented = true });
                    Console.WriteLine(scanJson);
                    return 0;

                case "services" when args.Length > 1:
                    var services = await BleClient.ListServicesAsync(args[1]);
                    foreach (var line in services)
                        Console.WriteLine(line);
                    return 0;

                case "poweron" when args.Length > 1:
                    {
                        var mac = args[1];
                        bool ok = await BleClient.PowerOnByAddressAsync(mac);
                        Console.WriteLine(ok ? "OK" : "ERROR");
                        return ok ? 0 : 1;
                    }

                case "poweroff" when args.Length > 1:
                    {
                        var mac = args[1];
                        bool ok = await BleClient.PowerOffByAddressAsync(mac);
                        Console.WriteLine(ok ? "OK" : "ERROR");
                        return ok ? 0 : 1;
                    }

                default:
                    Console.Error.WriteLine($"Error: Unknown command '{args[0]}'");
                    return 1;
            }
        }
        catch (Exception ex)
        {
            Console.Error.WriteLine($"Error: {ex.Message}");
            return 1;
        }
    }

    static void PrintHelp()
    {
        Console.WriteLine(@"JBL PartyBox BLE Helper
Usage:
  jbl-ble-helper discover                 # list BLE devices
  jbl-ble-helper poweron <MAC>            # send power-on via BLE GATT (AA 03 01 05)
  jbl-ble-helper poweroff <MAC>           # send power-off via BLE GATT (AA 03 01 04)
");
    }
}
