package com.harman.jbl.cd_biz_comm.wireless_tech.bleconn;

import android.bluetooth.BluetoothDevice;
import java.util.Map;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: t, reason: collision with root package name */
    @l3.d
    public static final C0349a f38098t = C0349a.f38099a;

    /* renamed from: com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0349a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0349a f38099a = new C0349a();

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private static final a f38100b = g.f38116F;

        private C0349a() {
        }

        @l3.d
        public final a a() {
            return f38100b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static /* synthetic */ void a(a aVar, String str, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    str = null;
                }
                aVar.d(str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bleDisconnect");
        }

        public static void b(@l3.d a aVar, @l3.d com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b observer) {
            F.p(observer, "observer");
            if (!(!aVar.l().isEmpty())) {
                aVar.l().put(observer, observer);
                return;
            }
            throw new Exception("BleConnector can register only one observer");
        }

        public static long c(@l3.d a aVar) {
            return 20000L;
        }

        public static long d(@l3.d a aVar) {
            return com.harman.jbl.partybox.ui.ota.business.a.f44562c;
        }

        public static long e(@l3.d a aVar) {
            return 500L;
        }

        public static int f(@l3.d a aVar) {
            return 2;
        }
    }

    long a();

    long b();

    void c(@l3.d com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b bVar);

    void d(@l3.e String str);

    boolean e(@l3.d String str);

    @l3.e
    Object f(@l3.d String str, @l3.d byte[] bArr, @l3.d kotlin.coroutines.c<? super i> cVar);

    long g();

    int j();

    @l3.e
    Object k(@l3.d String str, @l3.d BluetoothDevice bluetoothDevice, @l3.d c cVar, @l3.d kotlin.coroutines.c<? super i> cVar2);

    @l3.d
    Map<com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b, com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.b> l();
}
