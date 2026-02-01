package androidx.core.net;

import android.net.TrafficStats;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.W;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* loaded from: classes.dex */
public final class d {

    @W(24)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        @InterfaceC0577u
        static void b(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    private d() {
    }

    @Deprecated
    public static void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int b() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void c(int i4) {
        TrafficStats.incrementOperationCount(i4);
    }

    @Deprecated
    public static void d(int i4, int i5) {
        TrafficStats.incrementOperationCount(i4, i5);
    }

    @Deprecated
    public static void e(int i4) {
        TrafficStats.setThreadStatsTag(i4);
    }

    public static void f(@N DatagramSocket datagramSocket) throws SocketException {
        a.a(datagramSocket);
    }

    @Deprecated
    public static void g(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    public static void h(@N DatagramSocket datagramSocket) throws SocketException {
        a.b(datagramSocket);
    }

    @Deprecated
    public static void i(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }
}
