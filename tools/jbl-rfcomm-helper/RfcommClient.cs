// RFCOMM Client - Bluetooth Serial Port Profile connection handler
// Uses WinRT APIs for device discovery and RFCOMM socket communication

using Windows.Devices.Bluetooth.Rfcomm;
using Windows.Devices.Enumeration;
using Windows.Networking.Sockets;
using Windows.Storage.Streams;

namespace JblRfcommHelper;

/// <summary>
/// Device info returned from discovery
/// </summary>
public record DeviceInfo(string Id, string Name);

/// <summary>
/// RFCOMM client for JBL PartyBox speakers
/// </summary>
public class RfcommClient : IDisposable
{
    // Standard Serial Port Profile UUID
    private static readonly Guid SppUuid = Guid.Parse("00001101-0000-1000-8000-00805F9B34FB");
    
    private RfcommDeviceService? _service;
    private StreamSocket? _socket;
    private DataWriter? _writer;
    private DataReader? _reader;
    private bool _disposed;

    public bool IsConnected => _socket != null && _writer != null;

    /// <summary>
    /// Discover paired GAIA devices (JBL PartyBox speakers)
    /// </summary>
    public static async Task<DeviceInfo[]> DiscoverGaiaDevices()
    {
        var sppId = RfcommServiceId.FromUuid(SppUuid);
        var selector = RfcommDeviceService.GetDeviceSelector(sppId);
        var devices = await DeviceInformation.FindAllAsync(selector);

        return devices
            .Where(d => d.Name.Contains("GAIA", StringComparison.OrdinalIgnoreCase))
            .Select(d => new DeviceInfo(d.Id, d.Name))
            .ToArray();
    }

    /// <summary>
    /// Connect to a device by its ID
    /// </summary>
    public async Task ConnectAsync(string deviceId)
    {
        if (IsConnected)
            throw new InvalidOperationException("Already connected");

        _service = await RfcommDeviceService.FromIdAsync(deviceId);
        if (_service == null)
            throw new Exception("DEVICE_NOT_AVAILABLE: Cannot reach device - is the speaker powered on?");

        _socket = new StreamSocket();
        try
        {
            await _socket.ConnectAsync(_service.ConnectionHostName, _service.ConnectionServiceName);
        }
        catch (Exception ex) when (ex.HResult == unchecked((int)0x8007274D)) // Connection refused
        {
            throw new Exception("CONNECTION_REFUSED: Speaker is not accepting connections - is it powered on and not connected to another app?");
        }
        catch (Exception ex) when (ex.HResult == unchecked((int)0x80072740)) // Resource in use
        {
            throw new Exception("RESOURCE_IN_USE: Speaker is already connected to another application (JBL app, etc.)");
        }
        catch (Exception ex) when (ex.HResult == unchecked((int)0x80070490)) // Element not found
        {
            throw new Exception("DEVICE_NOT_FOUND: Speaker is not paired or is powered off");
        }
        catch (Exception ex) when (ex.HResult == unchecked((int)0x8007274C)) // Host unreachable
        {
            throw new Exception("HOST_UNREACHABLE: Cannot reach speaker - is it powered on and within range?");
        }

        _writer = new DataWriter(_socket.OutputStream);
        _reader = new DataReader(_socket.InputStream)
        {
            InputStreamOptions = InputStreamOptions.Partial
        };
    }

    /// <summary>
    /// Send data to the connected device
    /// </summary>
    public async Task SendAsync(byte[] data)
    {
        if (_writer == null)
            throw new InvalidOperationException("Not connected");

        _writer.WriteBytes(data);
        await _writer.StoreAsync();
    }

    /// <summary>
    /// Receive data from the connected device
    /// </summary>
    public async Task<byte[]?> ReceiveAsync(CancellationToken cancellationToken = default)
    {
        if (_reader == null)
            throw new InvalidOperationException("Not connected");

        try
        {
            // Try to read available data with timeout
            var loadTask = _reader.LoadAsync(256).AsTask(cancellationToken);
            var count = await loadTask;

            if (count > 0)
            {
                var buffer = new byte[count];
                _reader.ReadBytes(buffer);
                return buffer;
            }
        }
        catch (OperationCanceledException)
        {
            throw;
        }
        catch (Exception ex) when (ex.HResult == unchecked((int)0x80072746)) // Connection reset
        {
            throw new Exception("Connection closed by device");
        }

        return null;
    }

    /// <summary>
    /// Close the connection
    /// </summary>
    public void Disconnect()
    {
        _writer?.Dispose();
        _writer = null;

        _reader?.Dispose();
        _reader = null;

        _socket?.Dispose();
        _socket = null;

        _service?.Dispose();
        _service = null;
    }

    public void Dispose()
    {
        if (!_disposed)
        {
            Disconnect();
            _disposed = true;
        }
        GC.SuppressFinalize(this);
    }
}
