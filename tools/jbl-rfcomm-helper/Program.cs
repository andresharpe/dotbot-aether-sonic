// JBL PartyBox RFCOMM Helper - Bluetooth RFCOMM client for PowerShell module
// Handles WinRT Bluetooth operations and communicates via stdin/stdout
// Usage: jbl-rfcomm-helper <command> [args...]
//   discover              - List paired GAIA devices (JSON output)
//   connect <deviceId>    - Connect to device, enter interactive mode
//   --help                - Show help

using System.Text.Json;

namespace JblRfcommHelper;

class Program
{
    static async Task<int> Main(string[] args)
    {
        if (args.Length == 0 || args[0] == "--help" || args[0] == "-h")
        {
            PrintHelp();
            return 0;
        }

        var command = args[0].ToLower();

        try
        {
            return command switch
            {
                "discover" => await DiscoverDevices(),
                "connect" when args.Length > 1 => await ConnectAndServe(args[1]),
                "connect" => Error("connect requires a device ID"),
                _ => Error($"Unknown command: {command}")
            };
        }
        catch (Exception ex)
        {
            Console.Error.WriteLine($"Error: {ex.Message}");
            return 1;
        }
    }

    static void PrintHelp()
    {
        Console.WriteLine(@"
JBL PartyBox RFCOMM Helper - Bluetooth RFCOMM client

Usage: jbl-rfcomm-helper <command> [args...]

Commands:
  discover              List paired GAIA/JBL devices as JSON array
  connect <deviceId>    Connect to device and enter interactive mode

Interactive Mode Commands (via stdin, one per line):
  SEND <hex>            Send bytes to device (hex string, spaces allowed)
  PING                  Check connection status
  QUIT                  Close connection and exit

Output Format:
  CONNECTED             Sent when connection established
  RECV <hex>            Data received from device
  OK                    Command succeeded
  ERROR <message>       Command failed
");
    }

    static int Error(string message)
    {
        Console.Error.WriteLine($"Error: {message}");
        return 1;
    }

    static async Task<int> DiscoverDevices()
    {
        var devices = await RfcommClient.DiscoverGaiaDevices();
        
        var json = JsonSerializer.Serialize(devices, new JsonSerializerOptions 
        { 
            WriteIndented = true 
        });
        
        Console.WriteLine(json);
        return 0;
    }

    static async Task<int> ConnectAndServe(string deviceId)
    {
        using var client = new RfcommClient();
        
        await client.ConnectAsync(deviceId);
        Console.WriteLine("CONNECTED");
        Console.Out.Flush();

        // Start background reader for incoming data
        var readerCts = new CancellationTokenSource();
        var readerTask = Task.Run(async () =>
        {
            try
            {
                while (!readerCts.Token.IsCancellationRequested)
                {
                    var data = await client.ReceiveAsync(readerCts.Token);
                    if (data != null && data.Length > 0)
                    {
                        var hex = BitConverter.ToString(data).Replace("-", " ");
                        Console.WriteLine($"RECV {hex}");
                        Console.Out.Flush();
                    }
                }
            }
            catch (OperationCanceledException) { }
            catch (Exception ex)
            {
                Console.Error.WriteLine($"Reader error: {ex.Message}");
            }
        });

        // Process commands from stdin
        string? line;
        while ((line = Console.ReadLine()) != null)
        {
            var parts = line.Trim().Split(' ', 2, StringSplitOptions.RemoveEmptyEntries);
            if (parts.Length == 0) continue;

            var cmd = parts[0].ToUpper();

            try
            {
                switch (cmd)
                {
                    case "SEND" when parts.Length > 1:
                        var hexData = parts[1].Replace(" ", "");
                        var bytes = Convert.FromHexString(hexData);
                        await client.SendAsync(bytes);
                        Console.WriteLine("OK");
                        break;

                    case "SEND":
                        Console.WriteLine("ERROR Missing hex data");
                        break;

                    case "PING":
                        Console.WriteLine(client.IsConnected ? "OK" : "ERROR Not connected");
                        break;

                    case "QUIT":
                    case "EXIT":
                        readerCts.Cancel();
                        return 0;

                    default:
                        Console.WriteLine($"ERROR Unknown command: {cmd}");
                        break;
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine($"ERROR {ex.Message}");
            }

            Console.Out.Flush();
        }

        readerCts.Cancel();
        await readerTask;
        return 0;
    }
}
