// JBL PartyBox Stage 320 - Interactive Command Test
// One command at a time for validation

using Windows.Devices.Bluetooth.Rfcomm;
using Windows.Devices.Enumeration;
using Windows.Storage.Streams;
using Windows.Networking.Sockets;

Console.WriteLine("JBL PartyBox Stage 320 - Interactive Command Test");
Console.WriteLine("=================================================\n");

// SPP UUID (Standard Serial Port Profile)
var sppUuid = RfcommServiceId.FromUuid(Guid.Parse("00001101-0000-1000-8000-00805F9B34FB"));

// Find paired speakers (they appear as "GAIA" service)
var selector = RfcommDeviceService.GetDeviceSelector(sppUuid);
var devices = await DeviceInformation.FindAllAsync(selector);
var speakers = devices.Where(d => d.Name.Contains("GAIA", StringComparison.OrdinalIgnoreCase)).ToList();

Console.WriteLine($"Found {speakers.Count} JBL PartyBox speakers.\n");

if (speakers.Count == 0)
{
    Console.WriteLine("No speakers found. Make sure they are:");
    Console.WriteLine("  1. Powered on");
    Console.WriteLine("  2. Paired with this computer via Windows Bluetooth settings");
    return;
}

// Use first speaker
var deviceInfo = speakers[0];
Console.WriteLine($"Connecting to: {deviceInfo.Name}");
Console.WriteLine($"Device ID: {deviceInfo.Id}\n");

RfcommDeviceService? service = null;
StreamSocket? socket = null;
DataWriter? writer = null;
DataReader? reader = null;

try
{
    service = await RfcommDeviceService.FromIdAsync(deviceInfo.Id);
    if (service == null) throw new Exception("Failed to get RFCOMM service");
    
    socket = new StreamSocket();
    await socket.ConnectAsync(service.ConnectionHostName, service.ConnectionServiceName);
    Console.WriteLine("Connected!\n");
    
    writer = new DataWriter(socket.OutputStream);
    reader = new DataReader(socket.InputStream) { InputStreamOptions = InputStreamOptions.Partial };
    
    // Background reader for responses
    _ = Task.Run(async () =>
    {
        try
        {
            while (true)
            {
                var count = await reader.LoadAsync(256);
                if (count > 0)
                {
                    var bytes = new byte[count];
                    reader.ReadBytes(bytes);
                    Console.WriteLine($"<< RECV: {BitConverter.ToString(bytes).Replace("-", " ")}");
                }
            }
        }
        catch { }
    });
    
    // Helper to send commands
    async Task Send(string name, byte[] cmd)
    {
        Console.WriteLine($">> {name}: {BitConverter.ToString(cmd).Replace("-", " ")}");
        writer.WriteBytes(cmd);
        await writer.StoreAsync();
        await Task.Delay(300);
    }
    
    // ==================== COMMAND BUILDERS ====================
    
    // ----- SYSTEM COMMANDS -----
    byte[] Keepalive() => [0xaa, 0xea, 0x00];
    byte[] GetLightStatus() => [0xaa, 0x31, 0x00];  // Command 0x31 = LightInfoReqCommand
    byte[] GetDjEffectStatus() => [0xaa, 0x51, 0x00];  // Command 0x51 = ReqDjEffectCommand
    
    // ----- LIGHT COMMANDS (Command 0x33 = SetLightCmdCommand) -----
    byte[] LightsOn() => [0xaa, 0x33, 0x04, 0x00, 0x99, 0x01, 0x01];  // Element 0x99 = MAIN_SWITCH, value = 1
    byte[] LightsOff() => [0xaa, 0x33, 0x04, 0x00, 0x99, 0x01, 0x00]; // Element 0x99 = MAIN_SWITCH, value = 0
    // Simple 4-byte pattern (P method)
    byte[] Pattern(int id) => [0xaa, 0x33, 0x04, 0x00, 0x31, 0x01, (byte)id];
    // Extended 7-byte pattern with flag (J method): [devId, 0x31, 1, pattern, 0x37, 1, flag]
    byte[] PatternExt(int id, bool flag = true) => [0xaa, 0x33, 0x07, 0x00, 0x31, 0x01, (byte)id, 0x37, 0x01, (byte)(flag ? 1 : 0)];
    
    // Color mode: 0x36 sub-command controls color loop vs static
    // j0 method: [devId, 0x36, 0x01, mode] where mode: 0=COLOR_LOOP, 1=STATIC
    byte[] ColorModeLoop() => [0xaa, 0x33, 0x04, 0x00, 0x36, 0x01, 0x00];
    byte[] ColorModeStatic() => [0xaa, 0x33, 0x04, 0x00, 0x36, 0x01, 0x01];
    
    // Full color command (L method): [devId, 0x36, 0x01, 0x01(static), 0x32, 0x03, R, G, B]
    byte[] Color(byte r, byte g, byte b) => [0xaa, 0x33, 0x09, 0x00, 0x36, 0x01, 0x01, 0x32, 0x03, r, g, b];
    // Simpler: just RGB bytes with element 0x32
    byte[] ColorSimple(byte r, byte g, byte b) => [0xaa, 0x33, 0x06, 0x00, 0x32, 0x03, r, g, b];
    byte[] Brightness(byte level) => [0xaa, 0x33, 0x04, 0x00, 0x45, 0x01, level]; // Element 0x45 (69) = LIGHT_BRIGHTNESS
    byte[] LightSpeed(byte level) => [0xaa, 0x33, 0x04, 0x00, 0x46, 0x01, level]; // Element 0x46 (70) = LIGHT_MOVEMENT_SPEED
    
    // Individual light element control (from LightElements.java)
    // Format: [0xaa, 0x33, 0x04, 0x00, element_id, 0x01, on_off]
    byte[] LightElement(byte elementId, bool on) => [0xaa, 0x33, 0x04, 0x00, elementId, 0x01, (byte)(on ? 1 : 0)];
    byte[] StrobeOn() => LightElement(0x33, true);   // 51 = LIGHT_STROBE
    byte[] StrobeOff() => LightElement(0x33, false);
    byte[] EightOn() => LightElement(0x38, true);    // 56 = LIGHT_EIGHT  
    byte[] EightOff() => LightElement(0x38, false);
    byte[] SideRingOn() => LightElement(0x39, true); // 57 = LIGHT_SIDE_RING
    byte[] SideRingOff() => LightElement(0x39, false);
    byte[] StripeOn() => LightElement(0x40, true);   // 64 = LIGHT_STRIPE
    byte[] StripeOff() => LightElement(0x40, false);
    byte[] StarOn() => LightElement(0x41, true);     // 65 = LIGHT_STAR
    byte[] StarOff() => LightElement(0x41, false);
    byte[] StrobeUpOn() => LightElement(0x42, true); // 66 = LIGHT_STROBE_UP
    byte[] StrobeUpOff() => LightElement(0x42, false);
    byte[] StrobeDownOn() => LightElement(0x43, true);  // 67 = LIGHT_STROBE_DOWN
    byte[] StrobeDownOff() => LightElement(0x43, false);
    byte[] EdgeOn() => LightElement(0x44, true);     // 68 = LIGHT_EDGE
    byte[] EdgeOff() => LightElement(0x44, false);
    
    // ----- DJ SOUND EFFECT COMMANDS -----
    // Command 0x55 = SetDjEffectToneCommand (play sound effect once)
    byte[] PlaySoundEffect(int toneId) => [0xaa, 0x55, 0x01, (byte)toneId];
    // Command 0x53 = SetDjEffectToneWithOptionCommand (play with option)
    byte[] PlaySoundEffectWithOption(int toneId, int option) => [0xaa, 0x53, 0x02, (byte)option, (byte)toneId];
    
    // ----- DJ AUDIO FILTER COMMANDS -----
    // Command 0x57 = SetDJFilterCommand (audio effects)
    // filter_id: 0=CANCEL, 1=REPEATER, 2=FILTER, 3=GATER, 4=ECHO, 5=WIPEOUT
    // level: 0-100 (slider value)
    byte[] DjFilter(int filterId, int level) => [0xaa, 0x57, 0x02, (byte)filterId, (byte)level];
    byte[] DjFilterOff() => DjFilter(0, 0);  // CANCEL
    byte[] DjRepeater(int level) => DjFilter(1, level);
    byte[] DjFilterEffect(int level) => DjFilter(2, level);
    byte[] DjGater(int level) => DjFilter(3, level);
    byte[] DjEcho(int level) => DjFilter(4, level);
    byte[] DjWipeout(int level) => DjFilter(5, level);
    
    // Pattern names (from LightPattern.java)
    var patterns = new[] { "OFF", "ROCK", "NEON", "CLUB", "FLOW", "RIPPLE", "CROSS", "FLASH", "CUSTOM", "LOOP", "BOUNCE", "TRIM", "SWITCH", "FREEZE" };
    
    // Sound effect names (from DjEffectToneId.java)
    var soundEffects = new[] { "UNKNOWN", "HORN", "CLAPPING", "SCRATCH_1", "SCRATCH_2", "SCRATCH_3", "BARKING", "LIKE", "BOO", "READY", "DISCO1", "DISCO2", "DISCO3", "GAME", "PARTY", "HEY", "HANDS_UP", "123", "JUMP", "LETS_GO" };
    
    // ==================== ONE-BY-ONE TEST ====================
    
    async Task TestCmd(string name, byte[] cmd)
    {
        await Send(name, cmd);
        await Task.Delay(500);
    }
    
    // ==================== INTERACTIVE MENU ====================
    
    void ShowMenu()
    {
        Console.WriteLine("\n========== JBL PartyBox Stage 320 Control ==========");
        Console.WriteLine("LIGHTS:");
        Console.WriteLine("  1  = Lights ON          2  = Lights OFF");
        Console.WriteLine("  3  = NEON pattern       4  = LOOP pattern");
        Console.WriteLine("  5  = BOUNCE pattern     6  = TRIM pattern");
        Console.WriteLine("  7  = SWITCH pattern     8  = FREEZE");
        Console.WriteLine();
        Console.WriteLine("COLORS (applies to current pattern):");
        Console.WriteLine("  40 = Red       41 = Green     42 = Blue      43 = Orange");
        Console.WriteLine("  44 = Yellow    45 = Purple    46 = Cyan      47 = White");
        Console.WriteLine("  48 = Pink      49 = Lime      50 = Teal      51 = Magenta");
        Console.WriteLine();
        Console.WriteLine("LIGHT ZONES (toggle on/off):");
        Console.WriteLine("  e1 = Eight ON       e0 = Eight OFF       (figure-8 light)");
        Console.WriteLine("  s1 = SideRing ON    s0 = SideRing OFF    (side dots)");
        Console.WriteLine("  d1 = Edge ON        d0 = Edge OFF        (edge strip)");
        Console.WriteLine("  t1 = Stripe ON      t0 = Stripe OFF      (side panels)");
        Console.WriteLine();
        Console.WriteLine("SOUND EFFECTS:");
        Console.WriteLine("  10 = Horn               11 = Clap");
        Console.WriteLine("  12 = Scratch 1          13 = Scratch 2          14 = Scratch 3");
        Console.WriteLine("  15 = Barking            16 = Like (pac-man)     17 = Boo");
        Console.WriteLine("  18 = Ready              19 = Disco 1            20 = Disco 2");
        Console.WriteLine("  21 = Disco 3            22 = GAME (pac-man)     23 = PARTY!");
        Console.WriteLine("  24 = HEY                25 = HANDS UP           26 = 1-2-3");
        Console.WriteLine("  27 = JUMP               28 = LET'S GO");
        Console.WriteLine();
        Console.WriteLine("DJ AUDIO FILTERS (applied to music):");
        Console.WriteLine("  30 = Filter OFF         31 = Repeater 50%       32 = Repeater 100%");
        Console.WriteLine("  33 = Filter 50%         34 = Gater 50%          35 = Echo 50%");
        Console.WriteLine("  36 = Wipeout 50%");
        Console.WriteLine();
        Console.WriteLine("  Q = Quit");
        Console.WriteLine("=====================================================");
        Console.Write("Choice: ");
    }
    
    var running = true;
    while (running)
    {
        ShowMenu();
        var input = Console.ReadLine()?.Trim().ToLower();
        
        switch (input)
        {
            // Lights
            case "1": await Send("Lights ON", LightsOn()); break;
            case "2": await Send("Lights OFF", LightsOff()); break;
            case "3": await Send("NEON", Pattern(2)); break;
            case "4": await Send("LOOP", Pattern(9)); break;
            case "5": await Send("BOUNCE", Pattern(10)); break;
            case "6": await Send("TRIM", Pattern(11)); break;
            case "7":
                // SWITCH needs color loop mode to show its animation
                await Send("Color Loop Mode", ColorModeLoop());
                await Send("SWITCH", Pattern(12));
                break;
            case "8": await Send("FREEZE", Pattern(13)); break;
            
            // Colors (just RGB, no mode change - keeps pattern animation)
            case "40": await Send("RED", ColorSimple(255, 0, 0)); break;
            case "41": await Send("GREEN", ColorSimple(0, 255, 0)); break;
            case "42": await Send("BLUE", ColorSimple(0, 0, 255)); break;
            case "43": await Send("ORANGE", ColorSimple(255, 128, 0)); break;
            case "44": await Send("YELLOW", ColorSimple(255, 255, 0)); break;
            case "45": await Send("PURPLE", ColorSimple(128, 0, 255)); break;
            case "46": await Send("CYAN", ColorSimple(0, 255, 255)); break;
            case "47": await Send("WHITE", ColorSimple(255, 255, 255)); break;
            case "48": await Send("PINK", ColorSimple(255, 105, 180)); break;
            case "49": await Send("LIME", ColorSimple(128, 255, 0)); break;
            case "50": await Send("TEAL", ColorSimple(0, 128, 128)); break;
            case "51": await Send("MAGENTA", ColorSimple(255, 0, 128)); break;
            
            // Light Zone Controls
            case "e1": await Send("Eight ON", EightOn()); break;
            case "e0": await Send("Eight OFF", EightOff()); break;
            case "s1": await Send("SideRing ON", SideRingOn()); break;
            case "s0": await Send("SideRing OFF", SideRingOff()); break;
            case "d1": await Send("Edge ON", EdgeOn()); break;
            case "d0": await Send("Edge OFF", EdgeOff()); break;
            case "t1": await Send("Stripe ON", StripeOn()); break;
            case "t0": await Send("Stripe OFF", StripeOff()); break;
            
            // Sound Effects (IDs 1-19)
            case "10": await Send("HORN", PlaySoundEffect(1)); break;
            case "11": await Send("CLAP", PlaySoundEffect(2)); break;
            case "12": await Send("SCRATCH 1", PlaySoundEffect(3)); break;
            case "13": await Send("SCRATCH 2", PlaySoundEffect(4)); break;
            case "14": await Send("SCRATCH 3", PlaySoundEffect(5)); break;
            case "15": await Send("BARKING", PlaySoundEffect(6)); break;
            case "16": await Send("LIKE", PlaySoundEffect(7)); break;
            case "17": await Send("BOO", PlaySoundEffect(8)); break;
            case "18": await Send("READY", PlaySoundEffect(9)); break;
            case "19": await Send("DISCO 1", PlaySoundEffect(10)); break;
            case "20": await Send("DISCO 2", PlaySoundEffect(11)); break;
            case "21": await Send("DISCO 3", PlaySoundEffect(12)); break;
            case "22": await Send("GAME", PlaySoundEffect(13)); break;
            case "23": await Send("PARTY", PlaySoundEffect(14)); break;
            case "24": await Send("HEY", PlaySoundEffect(15)); break;
            case "25": await Send("HANDS UP", PlaySoundEffect(16)); break;
            case "26": await Send("1-2-3", PlaySoundEffect(17)); break;
            case "27": await Send("JUMP", PlaySoundEffect(18)); break;
            case "28": await Send("LET'S GO", PlaySoundEffect(19)); break;
            
            // DJ Audio Filters
            case "30": await Send("Filter OFF", DjFilterOff()); break;
            case "31": await Send("Repeater 50%", DjRepeater(50)); break;
            case "32": await Send("Repeater 100%", DjRepeater(100)); break;
            case "33": await Send("Filter 50%", DjFilterEffect(50)); break;
            case "34": await Send("Gater 50%", DjGater(50)); break;
            case "35": await Send("Echo 50%", DjEcho(50)); break;
            case "36": await Send("Wipeout 50%", DjWipeout(50)); break;
            
            case "q": running = false; break;
            default: Console.WriteLine("Unknown option"); break;
        }
    }
    
    Console.WriteLine("\nExiting...");
}
catch (Exception ex)
{
    Console.WriteLine($"Error: {ex.Message}");
}
finally
{
    writer?.Dispose();
    reader?.Dispose();
    socket?.Dispose();
    service?.Dispose();
}
