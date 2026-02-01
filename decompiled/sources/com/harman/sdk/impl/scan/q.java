package com.harman.sdk.impl.scan;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.Handler;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.DeviceProtocol;
import com.harman.sdk.utils.DeviceRole;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.A;
import kotlin.text.C2220b;
import kotlin.text.z;

@U({"SMAP\nSppDiscoveryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SppDiscoveryImpl.kt\ncom/harman/sdk/impl/scan/SppDiscoveryImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,475:1\n37#2,2:476\n37#2,2:480\n13309#3,2:478\n13309#3,2:482\n*S KotlinDebug\n*F\n+ 1 SppDiscoveryImpl.kt\ncom/harman/sdk/impl/scan/SppDiscoveryImpl\n*L\n464#1:476,2\n246#1:480,2\n467#1:478,2\n246#1:482,2\n*E\n"})
/* loaded from: classes2.dex */
public final class q extends g {

    /* renamed from: V, reason: collision with root package name */
    @l3.d
    public static final a f48120V = new a(null);

    /* renamed from: W, reason: collision with root package name */
    @l3.d
    private static final String f48121W = "SppDiscoveryImpl";

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    private final AtomicBoolean f48122S = new AtomicBoolean(false);

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    private final Runnable f48123T = new Runnable() { // from class: com.harman.sdk.impl.scan.p
        @Override // java.lang.Runnable
        public final void run() {
            q.V(q.this);
        }
    };

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    private final BluetoothProfile.ServiceListener f48124U = new b();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements BluetoothProfile.ServiceListener {
        b() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i4, @l3.d BluetoothProfile proxy) {
            String str;
            String str2;
            boolean s22;
            boolean s23;
            boolean s24;
            F.p(proxy, "proxy");
            int i5 = 2;
            if (i4 == 2) {
                List<BluetoothDevice> connectedDevices = proxy.getConnectedDevices();
                q qVar = q.this;
                F.m(connectedDevices);
                qVar.a0(connectedDevices);
                for (BluetoothDevice bluetoothDevice : connectedDevices) {
                    bluetoothDevice.getName();
                    ParcelUuid[] uuids = bluetoothDevice.getUuids();
                    F.o(uuids, "getUuids(...)");
                    int length = uuids.length;
                    boolean z3 = false;
                    int i6 = 0;
                    while (i6 < length) {
                        ParcelUuid parcelUuid = uuids[i6];
                        String uuid = parcelUuid.getUuid().toString();
                        F.o(uuid, "toString(...)");
                        if (uuid.length() > 26) {
                            String substring = uuid.substring(26);
                            F.o(substring, "substring(...)");
                            s22 = z.s2(substring, "04ff", false, i5, null);
                            if (s22) {
                                str = substring.substring(4);
                                F.o(str, "substring(...)");
                                str2 = parcelUuid.getUuid().toString();
                                F.o(str2, "toString(...)");
                            } else {
                                String substring2 = uuid.substring(6);
                                F.o(substring2, "substring(...)");
                                s23 = z.s2(substring2, "ff-04", false, 2, null);
                                if (s23) {
                                    String U3 = q.this.U(uuid);
                                    com.harman.log.f.a(q.f48121W, "reverseUUID : " + U3);
                                    String substring3 = U3.substring(26);
                                    F.o(substring3, "substring(...)");
                                    s24 = z.s2(substring3, "04ff", false, 2, null);
                                    if (s24) {
                                        str = substring3.substring(4);
                                        F.o(str, "substring(...)");
                                        str2 = U3;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            z3 = true;
                            break;
                        }
                        i6++;
                        i5 = 2;
                    }
                    str = "";
                    str2 = "";
                    q qVar2 = q.this;
                    F.m(bluetoothDevice);
                    HmDevice Z3 = qVar2.Z(bluetoothDevice);
                    if (Z3 == null && !z3) {
                        q.this.X(bluetoothDevice);
                    } else if (z3) {
                        q.this.W(bluetoothDevice, str, str2, Z3);
                    }
                    i5 = 2;
                }
                BluetoothAdapter n4 = q.this.n();
                if (n4 != null) {
                    n4.closeProfileProxy(2, proxy);
                }
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i4) {
        }
    }

    private final BluetoothSocket O(BluetoothDevice bluetoothDevice) {
        BluetoothSocket bluetoothSocket = null;
        try {
            BluetoothSocket createRfcommSocketToServiceRecord = bluetoothDevice.createRfcommSocketToServiceRecord(UUID.fromString(com.harman.sdk.utils.d.j().s()));
            if (createRfcommSocketToServiceRecord == null) {
                return null;
            }
            try {
                createRfcommSocketToServiceRecord.connect();
                return createRfcommSocketToServiceRecord;
            } catch (Exception unused) {
                bluetoothSocket = createRfcommSocketToServiceRecord;
                return bluetoothSocket;
            }
        } catch (Exception unused2) {
        }
    }

    private final void P(BluetoothDevice bluetoothDevice, String str) {
        boolean s22;
        boolean s23;
        boolean s24;
        int a4;
        boolean K12;
        HmDevice hmDevice = null;
        s22 = z.s2(str, "aa12", false, 2, null);
        if (s22) {
            s23 = z.s2(str, "aa1203", false, 2, null);
            if (!s23) {
                s24 = z.s2(str, "aa1208", false, 2, null);
                if (s24) {
                    return;
                }
                String substring = str.substring(6);
                F.o(substring, "substring(...)");
                String substring2 = substring.substring(0, 2);
                F.o(substring2, "substring(...)");
                a4 = C2220b.a(16);
                int parseInt = Integer.parseInt(substring2, a4);
                Iterator<HmDevice> it = g.f48071P.a().a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    HmDevice next = it.next();
                    K12 = z.K1(bluetoothDevice.getAddress(), next.n(), true);
                    if (K12) {
                        hmDevice = next;
                        break;
                    }
                }
                if (hmDevice == null) {
                    hmDevice = new HmDevice();
                    String address = bluetoothDevice.getAddress();
                    F.o(address, "getAddress(...)");
                    hmDevice.k0(address);
                    String name = bluetoothDevice.getName();
                    F.o(name, "getName(...)");
                    hmDevice.m0(name);
                    hmDevice.V(true);
                    hmDevice.F0(DeviceProtocol.PROTOCOL_SPP);
                    hmDevice.j0(parseInt);
                    hmDevice.E0(com.harman.sdk.utils.d.f48541s);
                    String substring3 = substring.substring(2);
                    F.o(substring3, "substring(...)");
                    T(hmDevice, substring3);
                }
                g.f48071P.a().add(hmDevice);
                h p4 = p();
                if (p4 != null) {
                    p4.e(hmDevice);
                }
            }
        }
    }

    private final synchronized void Q() {
        try {
            v();
            if (u().get() && m().get()) {
                BluetoothAdapter n4 = n();
                if (n4 != null) {
                    n4.getProfileProxy(o(), this.f48124U, 2);
                }
                Handler q4 = q();
                if (q4 != null) {
                    q4.removeCallbacks(this.f48123T);
                    q4.postDelayed(this.f48123T, s());
                }
            }
        } finally {
        }
    }

    private final synchronized void R() {
        Handler q4 = q();
        if (q4 != null) {
            q4.removeCallbacks(this.f48123T);
        }
    }

    private final byte[] S(String str) {
        List R4;
        int a4;
        R4 = A.R4(str, new String[]{":"}, false, 0, 6, null);
        int i4 = 0;
        String[] strArr = (String[]) R4.toArray(new String[0]);
        byte[] bArr = new byte[6];
        int length = strArr.length;
        int i5 = 0;
        while (i4 < length) {
            String str2 = strArr[i4];
            a4 = C2220b.a(16);
            bArr[i5] = (byte) Integer.parseInt(str2, a4);
            i4++;
            i5++;
        }
        return bArr;
    }

    private final void T(HmDevice hmDevice, String str) {
        boolean K12;
        boolean K13;
        boolean K14;
        boolean K15;
        boolean K16;
        boolean K17;
        boolean K18;
        boolean K19;
        int i4;
        AudioChannel audioChannel;
        if (str.length() < 2) {
            return;
        }
        String substring = str.substring(0, 2);
        F.o(substring, "substring(...)");
        while (!TextUtils.isEmpty(substring)) {
            K12 = z.K1(substring, com.harman.sdk.utils.k.f48571D, true);
            if (!K12) {
                K13 = z.K1(substring, com.harman.sdk.utils.k.f48568C, true);
                if (!K13) {
                    K14 = z.K1(substring, com.harman.sdk.utils.k.f48565B, true);
                    if (!K14) {
                        K15 = z.K1(substring, com.harman.sdk.utils.k.f48562A, true);
                        if (!K15) {
                            K16 = z.K1(substring, com.harman.sdk.utils.k.f48733z, true);
                            if (!K16) {
                                K17 = z.K1(substring, com.harman.sdk.utils.k.f48730y, true);
                                if (!K17) {
                                    K18 = z.K1(substring, com.harman.sdk.utils.k.f48727x, true);
                                    if (!K18) {
                                        K19 = z.K1(substring, com.harman.sdk.utils.k.f48619T, true);
                                        if (K19) {
                                            String substring2 = str.substring(2);
                                            F.o(substring2, "substring(...)");
                                            String substring3 = substring2.substring(0, 2);
                                            F.o(substring3, "substring(...)");
                                            Integer valueOf = Integer.valueOf(substring3, 16);
                                            String substring4 = substring2.substring(2, (valueOf.intValue() * 2) + 2);
                                            F.o(substring4, "substring(...)");
                                            String k4 = com.harman.sdk.utils.g.k(substring4);
                                            if (k4 == null) {
                                                k4 = "";
                                            }
                                            hmDevice.m0(k4);
                                            int intValue = (valueOf.intValue() * 2) + 4;
                                            com.harman.log.f.a(f48121W, "deviceName : " + k4);
                                            i4 = intValue;
                                        } else {
                                            return;
                                        }
                                    } else {
                                        i4 = 6;
                                        try {
                                            String substring5 = str.substring(2, 6);
                                            F.o(substring5, "substring(...)");
                                            hmDevice.n0(substring5);
                                            com.harman.log.f.a(f48121W, "pid : " + substring5);
                                        } catch (Exception unused) {
                                            i4 = str.length() + 1;
                                        }
                                    }
                                } else {
                                    String substring6 = str.substring(2, 4);
                                    F.o(substring6, "substring(...)");
                                    hmDevice.l0(substring6);
                                    com.harman.log.f.a(f48121W, "mid : " + substring6);
                                }
                            } else {
                                String substring7 = str.substring(2, 4);
                                F.o(substring7, "substring(...)");
                                int l4 = com.harman.sdk.utils.g.l(substring7, com.harman.sdk.utils.k.f48733z);
                                BatteryInfo batteryInfo = new BatteryInfo();
                                if (l4 >= 128) {
                                    batteryInfo.h(l4 - 128);
                                    batteryInfo.g(true);
                                } else {
                                    batteryInfo.h(l4);
                                    batteryInfo.g(false);
                                }
                                hmDevice.a0(batteryInfo);
                                com.harman.log.f.a(f48121W, "batteryStatus : " + substring7);
                            }
                        } else {
                            String substring8 = str.substring(2, 4);
                            F.o(substring8, "substring(...)");
                            int l5 = com.harman.sdk.utils.g.l(substring8, com.harman.sdk.utils.k.f48562A);
                            if (com.harman.sdk.utils.d.i0(hmDevice) && l5 == 1 && hmDevice.m() == 0) {
                                hmDevice.J0(DeviceRole.TWS_MASTER);
                            }
                        }
                    } else {
                        String substring9 = str.substring(2, 4);
                        F.o(substring9, "substring(...)");
                        if (!TextUtils.isEmpty(substring9)) {
                            audioChannel = com.harman.sdk.utils.d.o0(substring9);
                        } else {
                            audioChannel = AudioChannel.NONE_CHANNEL;
                        }
                        F.m(audioChannel);
                        hmDevice.e0(audioChannel);
                        com.harman.log.f.a(f48121W, "activeChannels : " + audioChannel);
                    }
                } else {
                    String substring10 = str.substring(2, 4);
                    F.o(substring10, "substring(...)");
                    int l6 = com.harman.sdk.utils.g.l(substring10, com.harman.sdk.utils.k.f48568C);
                    hmDevice.X(l6);
                    com.harman.log.f.a(f48121W, "audio : " + l6);
                }
                i4 = 4;
            } else {
                i4 = 14;
            }
            if (i4 > str.length()) {
                substring = "";
            } else {
                str = str.substring(i4);
                F.o(str, "substring(...)");
                try {
                    substring = str.substring(0, 2);
                    F.o(substring, "substring(...)");
                } catch (Exception unused2) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String U(String str) {
        String i22;
        i22 = z.i2(str, "-", "", false, 4, null);
        StringBuilder sb = new StringBuilder();
        int length = i22.length() - 2;
        int c4 = kotlin.internal.n.c(length, 0, -2);
        if (c4 <= length) {
            while (true) {
                String substring = i22.substring(length, length + 2);
                F.o(substring, "substring(...)");
                sb.append(substring);
                if (length == 12 || length == 16 || length == 20 || length == 24) {
                    sb.append("-");
                }
                if (length == c4) {
                    break;
                }
                length -= 2;
            }
        }
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(q this$0) {
        F.p(this$0, "this$0");
        this$0.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(BluetoothDevice bluetoothDevice, String str, String str2, HmDevice hmDevice) {
        String substring = str.substring(0, 4);
        F.o(substring, "substring(...)");
        String b4 = com.harman.sdk.utils.n.b(substring);
        String substring2 = str.substring(4, 6);
        F.o(substring2, "substring(...)");
        if (com.harman.sdk.utils.d.h0(b4)) {
            if (hmDevice == null) {
                hmDevice = new HmDevice();
            }
            F.m(b4);
            hmDevice.n0(b4);
            hmDevice.l0(substring2);
            String address = bluetoothDevice.getAddress();
            F.o(address, "getAddress(...)");
            hmDevice.k0(address);
            String name = bluetoothDevice.getName();
            F.o(name, "getName(...)");
            hmDevice.m0(name);
            hmDevice.V(true);
            hmDevice.r0(HmDevice.f47760O0, str2);
            hmDevice.F0(DeviceProtocol.PROTOCOL_GATT_BR_EDR);
            String p4 = com.harman.sdk.utils.d.p(b4);
            F.o(p4, "getPlatformConfig(...)");
            hmDevice.E0(p4);
            hmDevice.A0(com.harman.sdk.utils.d.j().n());
            hmDevice.y0(true);
            hmDevice.u0(System.currentTimeMillis());
            hmDevice.w0(hmDevice.x());
            g.f48071P.a().add(hmDevice);
            h p5 = p();
            if (p5 != null) {
                p5.e(hmDevice);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(final BluetoothDevice bluetoothDevice) {
        com.harman.sdk.concurrent.a.a().execute(new Runnable() { // from class: com.harman.sdk.impl.scan.o
            @Override // java.lang.Runnable
            public final void run() {
                q.Y(q.this, bluetoothDevice);
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x00df
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(com.harman.sdk.impl.scan.q r17, android.bluetooth.BluetoothDevice r18) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.sdk.impl.scan.q.Y(com.harman.sdk.impl.scan.q, android.bluetooth.BluetoothDevice):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HmDevice Z(BluetoothDevice bluetoothDevice) {
        boolean K12;
        boolean K13;
        for (HmDevice hmDevice : g.f48071P.a().a()) {
            K12 = z.K1(bluetoothDevice.getAddress(), hmDevice.n(), true);
            if (!K12) {
                K13 = z.K1(null, (String) hmDevice.u(HmDevice.f47761P0), true);
                if (K13) {
                    return hmDevice;
                }
            } else {
                hmDevice.w0(System.currentTimeMillis());
                return hmDevice;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(List<BluetoothDevice> list) {
        boolean K12;
        for (HmDevice hmDevice : g.f48071P.a().a()) {
            if (hmDevice.F() == DeviceProtocol.PROTOCOL_SPP || hmDevice.F() == DeviceProtocol.PROTOCOL_GATT_BR_EDR) {
                Iterator<BluetoothDevice> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        K12 = z.K1(hmDevice.n(), it.next().getAddress(), true);
                        if (K12) {
                            break;
                        }
                    } else {
                        g.f48071P.a().remove(hmDevice);
                        h p4 = p();
                        if (p4 != null) {
                            F.m(hmDevice);
                            p4.d(hmDevice);
                        }
                    }
                }
            }
        }
    }

    @Override // com.harman.sdk.impl.scan.f
    public void b(@l3.d HmDevice device) {
        F.p(device, "device");
    }

    @Override // com.harman.sdk.impl.scan.g, com.harman.sdk.impl.scan.f
    public void c(@l3.d Context context) {
        F.p(context, "context");
        y(context.getApplicationContext());
        v();
    }

    @Override // com.harman.sdk.impl.scan.f
    public void d() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.harman.sdk.impl.scan.g, com.harman.sdk.impl.scan.f
    public void f(@l3.e B2.b bVar) {
        super.f(bVar);
        Q();
    }

    @Override // com.harman.sdk.impl.scan.g, com.harman.sdk.impl.scan.f
    public void i() {
        super.i();
        R();
    }

    @Override // com.harman.sdk.impl.scan.f
    public void j() {
    }
}
