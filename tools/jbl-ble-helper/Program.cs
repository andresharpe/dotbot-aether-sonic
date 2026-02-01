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

                case "poweron" when args.Length > 1:
                    var mac = args[1];
                    bool ok = await BleClient.PowerOnByAddressAsync(mac);
                    Console.WriteLine(ok ? "OK" : "ERROR");
                    return ok ? 0 : 1;

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
");
    }
}
