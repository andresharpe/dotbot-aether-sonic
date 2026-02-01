package com.harman.jbl.partybox.ui.ota;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.harman.jbl.partybox.utils.FirmwareCurrentOperation;

/* loaded from: classes2.dex */
public final class OtaManager {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final OtaManager f44545a = new OtaManager();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f44546b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private static Handler f44547c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private static C2028n f44548d;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private static b f44549e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/harman/jbl/partybox/ui/ota/OtaManager$PbSppConnectionStatus;", "", "(Ljava/lang/String;I)V", "PB_SPP_CONNECTED", "PB_SPP_DISCONNECTED", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class PbSppConnectionStatus {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ PbSppConnectionStatus[] $VALUES;
        public static final PbSppConnectionStatus PB_SPP_CONNECTED = new PbSppConnectionStatus("PB_SPP_CONNECTED", 0);
        public static final PbSppConnectionStatus PB_SPP_DISCONNECTED = new PbSppConnectionStatus("PB_SPP_DISCONNECTED", 1);

        static {
            PbSppConnectionStatus[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private PbSppConnectionStatus(String str, int i4) {
        }

        private static final /* synthetic */ PbSppConnectionStatus[] b() {
            return new PbSppConnectionStatus[]{PB_SPP_CONNECTED, PB_SPP_DISCONNECTED};
        }

        @l3.d
        public static kotlin.enums.a<PbSppConnectionStatus> e() {
            return $ENTRIES;
        }

        public static PbSppConnectionStatus valueOf(String str) {
            return (PbSppConnectionStatus) Enum.valueOf(PbSppConnectionStatus.class, str);
        }

        public static PbSppConnectionStatus[] values() {
            return (PbSppConnectionStatus[]) $VALUES.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final a f44550a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f44551b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f44552c = 4;

        /* renamed from: d, reason: collision with root package name */
        public static final int f44553d = 6;

        /* renamed from: e, reason: collision with root package name */
        @l3.d
        public static final String f44554e = "aa24";

        /* renamed from: f, reason: collision with root package name */
        @l3.d
        public static final String f44555f = "aa27";

        /* renamed from: g, reason: collision with root package name */
        @l3.d
        public static final String f44556g = "aa29";

        /* renamed from: h, reason: collision with root package name */
        @l3.d
        public static final String f44557h = "aa00";

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(@l3.d String str, int i4);

        void b();

        void c();

        void d(@l3.d FirmwareCurrentOperation firmwareCurrentOperation);

        void e(@l3.d PbSppConnectionStatus pbSppConnectionStatus);

        void f();

        void g(@l3.d String str);
    }

    /* loaded from: classes2.dex */
    public static final class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@l3.d Message msg) {
            kotlin.jvm.internal.F.p(msg, "msg");
            super.handleMessage(msg);
            int i4 = msg.what;
            O o4 = O.f44533a;
            if (i4 == o4.e()) {
                Object obj = msg.obj;
                kotlin.jvm.internal.F.n(obj, "null cannot be cast to non-null type kotlin.String");
                OtaManager.f44545a.i((String) obj);
                return;
            }
            if (i4 == o4.f()) {
                int i5 = msg.arg1;
                if (i5 != 0) {
                    if (i5 == 3) {
                        T1.a.a("OTA_LOG STATE_SPP_CONNECTED");
                        b bVar = OtaManager.f44549e;
                        if (bVar != null) {
                            bVar.e(PbSppConnectionStatus.PB_SPP_CONNECTED);
                            return;
                        }
                        return;
                    }
                    return;
                }
                T1.a.a("OTA_LOG STATE_SPP_NONE");
                b bVar2 = OtaManager.f44549e;
                if (bVar2 != null) {
                    bVar2.e(PbSppConnectionStatus.PB_SPP_DISCONNECTED);
                }
            }
        }
    }

    private OtaManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(String str) {
        boolean T22;
        boolean T23;
        String i22;
        try {
            String substring = str.substring(0, 4);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            switch (substring.hashCode()) {
                case 2984480:
                    if (substring.equals(a.f44557h)) {
                        String substring2 = str.substring(6, str.length());
                        kotlin.jvm.internal.F.o(substring2, "substring(...)");
                        T1.a.a("OTA_LOG cmdIdAck " + substring2);
                        T22 = kotlin.text.A.T2(substring2, "2a", false, 2, null);
                        if (!T22) {
                            T23 = kotlin.text.A.T2(substring2, "28", false, 2, null);
                            if (T23) {
                                Handler handler = f44547c;
                                if (handler != null) {
                                    handler.removeCallbacksAndMessages(null);
                                }
                                C2028n c2028n = f44548d;
                                if (c2028n != null) {
                                    c2028n.q();
                                }
                                b bVar = f44549e;
                                if (bVar != null) {
                                    bVar.c();
                                }
                                f44549e = null;
                                return;
                            }
                            return;
                        }
                        b bVar2 = f44549e;
                        if (bVar2 != null) {
                            bVar2.b();
                            return;
                        }
                        return;
                    }
                    return;
                case 2984546:
                    if (substring.equals(a.f44554e)) {
                        f44546b = true;
                        String substring3 = str.substring(6, 12);
                        kotlin.jvm.internal.F.o(substring3, "substring(...)");
                        String substring4 = str.substring(12, str.length());
                        kotlin.jvm.internal.F.o(substring4, "substring(...)");
                        int parseInt = Integer.parseInt(substring4, 16);
                        b bVar3 = f44549e;
                        if (bVar3 != null) {
                            bVar3.a(substring3, parseInt);
                            return;
                        }
                        return;
                    }
                    return;
                case 2984549:
                    if (substring.equals(a.f44555f)) {
                        i22 = kotlin.text.z.i2(str, a.f44555f, "", false, 4, null);
                        b bVar4 = f44549e;
                        if (bVar4 != null) {
                            bVar4.g(i22);
                            return;
                        }
                        return;
                    }
                    return;
                case 2984551:
                    if (substring.equals(a.f44556g)) {
                        b bVar5 = f44549e;
                        if (bVar5 != null) {
                            bVar5.f();
                        }
                        b bVar6 = f44549e;
                        if (bVar6 != null) {
                            bVar6.b();
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Exception e4) {
            T1.a.b("OTA_LOG Exception while processEachOTAResponseCommand + " + e4.getMessage());
        }
    }

    public final void c(@l3.d String bleAddress) {
        kotlin.jvm.internal.F.p(bleAddress, "bleAddress");
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(bleAddress);
        C2028n c2028n = f44548d;
        if (c2028n != null && c2028n.o() == 3) {
            Message message = new Message();
            message.arg1 = 3;
            message.what = O.f44533a.f();
            Handler handler = f44547c;
            kotlin.jvm.internal.F.m(handler);
            handler.sendMessageDelayed(message, 500L);
            return;
        }
        C2028n c2028n2 = f44548d;
        if (c2028n2 != null) {
            c2028n2.k(remoteDevice, true);
        }
    }

    @l3.e
    public final C2028n d() {
        return f44548d;
    }

    @l3.e
    public final Handler e() {
        return f44547c;
    }

    public final void f() {
        if (f44547c == null && Looper.myLooper() != null) {
            Looper myLooper = Looper.myLooper();
            kotlin.jvm.internal.F.m(myLooper);
            f44547c = new c(myLooper);
        }
    }

    public final void g(@l3.d b statusListener) {
        kotlin.jvm.internal.F.p(statusListener, "statusListener");
        f44549e = statusListener;
        f();
        if (f44548d == null) {
            f44548d = new C2028n(f44547c);
        }
    }

    public final boolean h() {
        return f44546b;
    }

    public final void j(boolean z3) {
        f44546b = z3;
    }

    public final void k(@l3.e C2028n c2028n) {
        f44548d = c2028n;
    }

    public final void l(@l3.e Handler handler) {
        f44547c = handler;
    }

    public final void m() {
        C2028n c2028n = f44548d;
        if (c2028n != null) {
            kotlin.jvm.internal.F.m(c2028n);
            if (c2028n.o() == 0) {
                C2028n c2028n2 = f44548d;
                kotlin.jvm.internal.F.m(c2028n2);
                c2028n2.p();
            }
        }
    }

    public final void n() {
        C2028n c2028n = f44548d;
        if (c2028n != null) {
            c2028n.q();
        }
        f44548d = null;
        f44549e = null;
    }
}
