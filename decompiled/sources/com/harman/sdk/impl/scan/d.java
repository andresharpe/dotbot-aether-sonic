package com.harman.sdk.impl.scan;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.LocationManager;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.content.C0669d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.impl.scan.g;
import com.harman.sdk.message.AuracastInfo;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.utils.AuracastStatus;
import com.harman.sdk.utils.AuracastSupport;
import com.harman.sdk.utils.DeviceProtocol;
import com.harman.sdk.utils.DeviceRole;
import com.harman.sdk.utils.PartyConnectStatus;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.H0;
import kotlin.KotlinNothingValueException;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.V;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC2283j;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.z;

@U({"SMAP\nBleDiscoveryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleDiscoveryImpl.kt\ncom/harman/sdk/impl/scan/BleDiscoveryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1855#2,2:615\n1#3:617\n*S KotlinDebug\n*F\n+ 1 BleDiscoveryImpl.kt\ncom/harman/sdk/impl/scan/BleDiscoveryImpl\n*L\n138#1:615,2\n*E\n"})
/* loaded from: classes2.dex */
public final class d extends com.harman.sdk.impl.scan.g implements kotlinx.coroutines.U {

    /* renamed from: b0, reason: collision with root package name */
    @l3.d
    public static final a f48045b0 = new a(null);

    /* renamed from: c0, reason: collision with root package name */
    @l3.d
    private static final String f48046c0 = "BleDiscoveryImpl";

    /* renamed from: V, reason: collision with root package name */
    @l3.e
    private HmDevice f48050V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f48051W;

    /* renamed from: S, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.U f48047S = V.a(C2322k0.c());

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    private final s<ScanResult> f48048T = z.a(0, 1000, BufferOverflow.DROP_LATEST);

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    private B2.a f48049U = new m();

    /* renamed from: X, reason: collision with root package name */
    @l3.d
    private final HashMap<String, String> f48052X = new HashMap<>();

    /* renamed from: Y, reason: collision with root package name */
    @l3.d
    private final Runnable f48053Y = new Runnable() { // from class: com.harman.sdk.impl.scan.b
        @Override // java.lang.Runnable
        public final void run() {
            d.d0(d.this);
        }
    };

    /* renamed from: Z, reason: collision with root package name */
    @l3.d
    private final Runnable f48054Z = new Runnable() { // from class: com.harman.sdk.impl.scan.c
        @Override // java.lang.Runnable
        public final void run() {
            d.e0(d.this);
        }
    };

    /* renamed from: a0, reason: collision with root package name */
    @l3.d
    private final ScanCallback f48055a0 = new C0430d();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends TypeToken<HashMap<String, String>> {
        b() {
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.sdk.impl.scan.BleDiscoveryImpl$init$1", f = "BleDiscoveryImpl.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class c extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f48056I;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static final class a<T> implements InterfaceC2283j {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ d f48058E;

            a(d dVar) {
                this.f48058E = dVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2283j
            @l3.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object f(@l3.d ScanResult scanResult, @l3.d kotlin.coroutines.c<? super H0> cVar) {
                this.f48058E.b0(scanResult);
                com.harman.jbl.partylight.lib.f.f46571a.a().a(scanResult);
                return H0.f51801a;
            }
        }

        c(kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f48056I;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                W.n(obj);
            } else {
                W.n(obj);
                s sVar = d.this.f48048T;
                a aVar = new a(d.this);
                this.f48056I = 1;
                if (sVar.a(aVar, this) == l4) {
                    return l4;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((c) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(cVar);
        }
    }

    /* renamed from: com.harman.sdk.impl.scan.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0430d extends ScanCallback {
        C0430d() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(@l3.d List<ScanResult> results) {
            F.p(results, "results");
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i4) {
            super.onScanFailed(i4);
            com.harman.log.f.a(d.f48046c0, "onScanFailed code is " + i4);
            if (2 != i4) {
                d.this.R();
                return;
            }
            d.this.i();
            h p4 = d.this.p();
            if (p4 != null) {
                p4.b(2, "Restart your device!");
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i4, @l3.d ScanResult result) {
            F.p(result, "result");
            d.this.f48048T.j(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.l<BatteryInfo, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f48060F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z3) {
            super(1);
            this.f48060F = z3;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(BatteryInfo batteryInfo) {
            c(batteryInfo);
            return H0.f51801a;
        }

        public final void c(@l3.d BatteryInfo info) {
            F.p(info, "info");
            info.e(this.f48060F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements X2.l<BatteryInfo, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f48061F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i4) {
            super(1);
            this.f48061F = i4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(BatteryInfo batteryInfo) {
            c(batteryInfo);
            return H0.f51801a;
        }

        public final void c(@l3.d BatteryInfo info) {
            F.p(info, "info");
            info.h(this.f48061F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class g extends Lambda implements X2.l<BatteryInfo, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f48062F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i4) {
            super(1);
            this.f48062F = i4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(BatteryInfo batteryInfo) {
            c(batteryInfo);
            return H0.f51801a;
        }

        public final void c(@l3.d BatteryInfo info) {
            F.p(info, "info");
            boolean z3 = true;
            if (1 != this.f48062F) {
                z3 = false;
            }
            info.g(z3);
        }
    }

    private final void M(String str, Map<String, String> map, ScanRecord scanRecord, String str2, boolean z3, boolean z4, boolean z5, boolean z6, int i4, AuracastInfo auracastInfo, TWSInfo tWSInfo) {
        HmDevice hmDevice;
        HmDevice hmDevice2;
        String str3;
        String str4;
        String str5;
        String str6;
        PartyBoxDevice partyBoxDevice;
        Integer num;
        AuracastStatus c4;
        AuracastSupport b4;
        boolean K12;
        boolean K13;
        String str7 = map.get(com.harman.sdk.utils.d.f48545w);
        if (str7 == null) {
            str7 = com.harman.sdk.utils.g.g(scanRecord.getBytes());
        }
        g.a aVar = com.harman.sdk.impl.scan.g.f48071P;
        com.harman.log.f.a(f48046c0, "deviceList size is : " + aVar.a().size());
        Iterator<HmDevice> it = aVar.a().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                hmDevice = null;
                break;
            }
            hmDevice = it.next();
            K12 = kotlin.text.z.K1(str, hmDevice.g(), true);
            if (K12) {
                break;
            }
            if (!TextUtils.isEmpty(hmDevice.n())) {
                K13 = kotlin.text.z.K1(hmDevice.n(), str2, true);
                if (K13) {
                    break;
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (hmDevice == null) {
            PartyBoxDevice partyBoxDevice2 = new PartyBoxDevice();
            partyBoxDevice2.F0(DeviceProtocol.PROTOCOL_BLE);
            partyBoxDevice2.b0(str);
            String deviceName = scanRecord.getDeviceName();
            if (deviceName == null) {
                deviceName = "";
            } else {
                F.m(deviceName);
            }
            partyBoxDevice2.m0(deviceName);
            partyBoxDevice2.u0(currentTimeMillis);
            partyBoxDevice2.y2(z3);
            partyBoxDevice2.f2(z4);
            partyBoxDevice2.n2(i4);
            partyBoxDevice2.k0(str2);
            partyBoxDevice2.Y(auracastInfo);
            partyBoxDevice2.M0(tWSInfo);
            com.harman.sdk.impl.scan.g.f48071P.a().add(partyBoxDevice2);
            com.harman.log.f.a(f48046c0, "addToDeviceList() >>> new device MAC[" + str2 + "] BLE[" + str + "]");
            hmDevice2 = partyBoxDevice2;
        } else {
            PartyBoxDevice partyBoxDevice3 = (PartyBoxDevice) hmDevice;
            partyBoxDevice3.y2(z3);
            partyBoxDevice3.f2(z4);
            partyBoxDevice3.n2(i4);
            partyBoxDevice3.k0(str2);
            partyBoxDevice3.Y(auracastInfo);
            if (!partyBoxDevice3.R()) {
                partyBoxDevice3.M0(tWSInfo);
            }
            com.harman.log.f.a(f48046c0, "addT2oDeviceList() >>> exist device MAC[" + str2 + "] BLE[" + str + "]");
            hmDevice2 = hmDevice;
        }
        PartyBoxDevice partyBoxDevice4 = (PartyBoxDevice) hmDevice2;
        partyBoxDevice4.w0(currentTimeMillis);
        f0(partyBoxDevice4, map);
        String n4 = partyBoxDevice4.n();
        String g4 = partyBoxDevice4.g();
        String r4 = partyBoxDevice4.r();
        String q4 = partyBoxDevice4.q();
        String E3 = partyBoxDevice4.E();
        DeviceRole J3 = partyBoxDevice4.J();
        String o4 = partyBoxDevice4.o();
        String k4 = partyBoxDevice4.k();
        boolean Q3 = partyBoxDevice4.Q();
        int f12 = partyBoxDevice4.f1();
        PartyConnectStatus i12 = partyBoxDevice4.i1();
        HmDevice hmDevice3 = hmDevice2;
        int t12 = partyBoxDevice4.t1();
        TWSInfo M3 = partyBoxDevice4.M();
        if (M3 != null) {
            String a4 = M3.a();
            str3 = str7;
            str4 = a4;
        } else {
            str3 = str7;
            str4 = null;
        }
        TWSInfo M4 = partyBoxDevice4.M();
        if (M4 != null) {
            String b5 = M4.b();
            str5 = f48046c0;
            str6 = b5;
        } else {
            str5 = f48046c0;
            str6 = null;
        }
        AuracastInfo d4 = partyBoxDevice4.d();
        Integer valueOf = (d4 == null || (b4 = d4.b()) == null) ? null : Integer.valueOf(b4.j());
        AuracastInfo d5 = partyBoxDevice4.d();
        if (d5 == null || (c4 = d5.c()) == null) {
            partyBoxDevice = partyBoxDevice4;
            num = null;
        } else {
            num = Integer.valueOf(c4.j());
            partyBoxDevice = partyBoxDevice4;
        }
        com.harman.log.f.a(str5, "add device:\nMAC[" + n4 + "] BLE[" + g4 + "] vid[" + r4 + "] pid[" + q4 + "] platform[" + E3 + "] role[" + J3 + "] mid[" + o4 + "] crc[" + k4 + "] connectable[" + Q3 + "] mute[" + f12 + "] partyConnectMode[" + i12 + "] volume[" + t12 + "] TWS[id[" + str4 + "] name[" + str6 + "]] Auracast[support[" + valueOf + "] status[" + num + "]]");
        partyBoxDevice.G0(str3);
        h p4 = p();
        if (p4 != null) {
            p4.e(hmDevice3);
        }
    }

    static /* synthetic */ void N(d dVar, String str, Map map, ScanRecord scanRecord, String str2, boolean z3, boolean z4, boolean z5, boolean z6, int i4, AuracastInfo auracastInfo, TWSInfo tWSInfo, int i5, Object obj) {
        String str3;
        int i6;
        if ((i5 & 8) != 0) {
            str3 = "";
        } else {
            str3 = str2;
        }
        if ((i5 & 256) != 0) {
            i6 = 0;
        } else {
            i6 = i4;
        }
        dVar.M(str, map, scanRecord, str3, z3, z4, z5, z6, i6, auracastInfo, tWSInfo);
    }

    private final boolean O(String str) {
        SharedPreferences sharedPreferences;
        String string;
        String json = new Gson().toJson(new HashMap());
        Context o4 = o();
        boolean z3 = false;
        if (o4 != null && (sharedPreferences = o4.getSharedPreferences("com.jbl.partybox_app_preference", 0)) != null && (string = sharedPreferences.getString("PREFERENCE_KEY_DEVICE_MAC_ADDRESS", json)) != null) {
            json = string;
        }
        HashMap hashMap = (HashMap) new Gson().fromJson(json, new b().getType());
        if (hashMap != null && hashMap.get(str) != null) {
            z3 = true;
        }
        com.harman.log.f.a(f48046c0, "BLE_LOG Device is EverConnected : " + z3);
        return z3;
    }

    private final void P(String str, Map<String, String> map) {
        String str2 = "";
        for (String str3 : map.keySet()) {
            str2 = str2 + str3 + " : " + ((Object) map.get(str3)) + ", ";
        }
        com.harman.log.f.a(f48046c0, str + " Device Details : " + str2);
    }

    @SuppressLint({"MissingPermission"})
    private final synchronized void Q() {
        BluetoothLeScanner bluetoothLeScanner;
        try {
            com.harman.log.f.a(f48046c0, "doStartBleScan");
            v();
            if (u().get() && m().get()) {
                ScanSettings build = new ScanSettings.Builder().setScanMode(2).build();
                Handler q4 = q();
                if (q4 != null) {
                    q4.removeCallbacks(this.f48053Y);
                }
                BluetoothAdapter n4 = n();
                if (n4 != null && (bluetoothLeScanner = n4.getBluetoothLeScanner()) != null) {
                    com.harman.log.f.a(f48046c0, "doStartBleScan do startScan");
                    bluetoothLeScanner.startScan((List<ScanFilter>) null, build, this.f48055a0);
                    Handler q5 = q();
                    if (q5 != null) {
                        q5.postDelayed(this.f48054Z, t());
                    }
                } else {
                    u().set(false);
                }
                return;
            }
            com.harman.log.f.a(f48046c0, "doStartBleScan !isScanning.get() = " + (!u().get()) + ", !adapterEnabled.get() = " + (!m().get()));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final synchronized void R() {
        Handler q4;
        try {
            BluetoothAdapter n4 = n();
            if (n4 != null) {
                Handler q5 = q();
                if (q5 != null) {
                    q5.removeCallbacks(this.f48054Z);
                }
                BluetoothLeScanner bluetoothLeScanner = n4.getBluetoothLeScanner();
                if (bluetoothLeScanner != null && this.f48055a0 != null && n4.getState() == 12) {
                    bluetoothLeScanner.stopScan(this.f48055a0);
                    if (u().get() && (q4 = q()) != null) {
                        q4.postDelayed(this.f48053Y, s());
                    }
                } else {
                    u().set(false);
                }
            }
            Context o4 = o();
            if (o4 != null && (!W(o4) || !X(o4))) {
                Collection<HmDevice> a4 = com.harman.sdk.impl.scan.g.f48071P.a().a();
                F.o(a4, "getSnapshot(...)");
                Iterator<T> it = a4.iterator();
                while (it.hasNext()) {
                    ((HmDevice) it.next()).F();
                    DeviceProtocol deviceProtocol = DeviceProtocol.PROTOCOL_BLE;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final HmDevice S(String str, String str2) {
        boolean K12;
        boolean z3;
        boolean K13;
        for (HmDevice hmDevice : com.harman.sdk.impl.scan.g.f48071P.a().a()) {
            K12 = kotlin.text.z.K1(str, hmDevice.g(), true);
            if (str2.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = K12 | z3;
            K13 = kotlin.text.z.K1(str2, hmDevice.n(), true);
            if (z4 & K13) {
                return hmDevice;
            }
        }
        return null;
    }

    static /* synthetic */ HmDevice T(d dVar, String str, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = "";
        }
        return dVar.S(str, str2);
    }

    private final void U(String str, Map<String, String> map, ScanRecord scanRecord, boolean z3, boolean z4, boolean z5, String str2, String str3, String str4, boolean z6, int i4, String str5, AuracastInfo auracastInfo, TWSInfo tWSInfo) {
        if (F.g(str3, com.harman.jbl.partybox.ui.effectlab.a.f43472q) && com.harman.sdk.utils.d.J(str4)) {
            com.harman.log.f.a(f48046c0, "BLE_LOG It is 110 without the ble standby support. So do not show it in the list : " + str);
            return;
        }
        if (F.g(str2, "1") || com.harman.sdk.utils.d.O(str4) || (F.g(str2, com.harman.jbl.partybox.ui.effectlab.a.f43472q) && com.harman.sdk.utils.d.H(str4))) {
            com.harman.log.f.a(f48046c0, "BLE_LOG Battery is On/710 and Show Power On. batteryCharging = " + str2 + ", productId = " + str4);
            M(str, map, scanRecord, str5, z3, z4, z5, z6, i4, auracastInfo, tWSInfo);
        }
    }

    static /* synthetic */ void V(d dVar, String str, Map map, ScanRecord scanRecord, boolean z3, boolean z4, boolean z5, String str2, String str3, String str4, boolean z6, int i4, String str5, AuracastInfo auracastInfo, TWSInfo tWSInfo, int i5, Object obj) {
        int i6;
        String str6;
        if ((i5 & 1024) != 0) {
            i6 = 0;
        } else {
            i6 = i4;
        }
        if ((i5 & 2048) != 0) {
            str6 = "";
        } else {
            str6 = str5;
        }
        dVar.U(str, map, scanRecord, z3, z4, z5, str2, str3, str4, z6, i6, str6, auracastInfo, tWSInfo);
    }

    private final boolean W(Context context) {
        Object systemService = context.getSystemService(FirebaseAnalytics.b.f34811s);
        F.n(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
            return false;
        }
        return true;
    }

    private final boolean X(Context context) {
        if (C0669d.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 && C0669d.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    private final void Y(HmDevice hmDevice, String str) {
        boolean S12;
        boolean K12;
        String g4 = hmDevice.g();
        S12 = kotlin.text.z.S1(str);
        if (!S12) {
            K12 = kotlin.text.z.K1(g4, str, true);
            if (!K12) {
                com.harman.log.f.d(f48046c0, "onScannedWhileConnected() >>> device[" + hmDevice.n() + "].BLE updated from [" + hmDevice.g() + "] to [" + str + "]");
                h p4 = p();
                if (p4 != null) {
                    p4.a(hmDevice, str);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r0 = kotlin.text.y.X0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        r0 = kotlin.text.y.X0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        r8 = kotlin.text.y.X0(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (r8.intValue() == 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r0 = kotlin.text.y.X0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r0 = kotlin.text.y.X0(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.harman.sdk.message.AuracastInfo Z(java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r7 = this;
            com.harman.sdk.message.AuracastInfo r6 = new com.harman.sdk.message.AuracastInfo
            java.lang.String r0 = "Aurocast_Support"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L18
            java.lang.Integer r0 = kotlin.text.q.X0(r0)
            if (r0 == 0) goto L18
            int r0 = r0.intValue()
        L16:
            r1 = r0
            goto L1f
        L18:
            com.harman.sdk.utils.AuracastSupport r0 = com.harman.sdk.utils.AuracastSupport.DONT_SUPPORT
            int r0 = r0.j()
            goto L16
        L1f:
            java.lang.String r0 = "Aurocast_Status"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L35
            java.lang.Integer r0 = kotlin.text.q.X0(r0)
            if (r0 == 0) goto L35
            int r0 = r0.intValue()
        L33:
            r2 = r0
            goto L3c
        L35:
            com.harman.sdk.utils.AuracastStatus r0 = com.harman.sdk.utils.AuracastStatus.NORMAL_MODE
            int r0 = r0.j()
            goto L33
        L3c:
            java.lang.String r0 = "Aurocast_Spotify_Quick_Access_Trig"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L52
            java.lang.Integer r0 = kotlin.text.q.X0(r0)
            if (r0 == 0) goto L52
            int r0 = r0.intValue()
        L50:
            r3 = r0
            goto L59
        L52:
            com.harman.sdk.utils.SpotifyQuickAccess r0 = com.harman.sdk.utils.SpotifyQuickAccess.DEFAULT
            int r0 = r0.j()
            goto L50
        L59:
            java.lang.String r0 = "Auracast_Forbidden_JOIN_AURACAST"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L6f
            java.lang.Integer r0 = kotlin.text.q.X0(r0)
            if (r0 == 0) goto L6f
            int r0 = r0.intValue()
        L6d:
            r4 = r0
            goto L76
        L6f:
            com.harman.sdk.utils.AuracastForbiddenStatus r0 = com.harman.sdk.utils.AuracastForbiddenStatus.STATUS_NORMAL
            int r0 = r0.j()
            goto L6d
        L76:
            java.lang.String r0 = "Aurocast_Has_Button"
            java.lang.Object r8 = r8.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            r0 = 0
            if (r8 == 0) goto L90
            java.lang.Integer r8 = kotlin.text.q.X0(r8)
            if (r8 != 0) goto L88
            goto L90
        L88:
            int r8 = r8.intValue()
            r5 = 1
            if (r8 != r5) goto L90
            goto L91
        L90:
            r5 = r0
        L91:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.sdk.impl.scan.d.Z(java.util.Map):com.harman.sdk.message.AuracastInfo");
    }

    private final TWSInfo a0(Map<String, String> map) {
        return new TWSInfo(map.getOrDefault("Tws_Stereo_Group_ID", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(android.bluetooth.le.ScanResult r20) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.sdk.impl.scan.d.b0(android.bluetooth.le.ScanResult):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(d this$0) {
        F.p(this$0, "this$0");
        this$0.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(d this$0) {
        F.p(this$0, "this$0");
        this$0.R();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0177, code lost:
    
        if (r0 != false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f0(com.harman.sdk.device.PartyBoxDevice r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.sdk.impl.scan.d.f0(com.harman.sdk.device.PartyBoxDevice, java.util.Map):void");
    }

    private final void g0(HmDevice hmDevice, X2.l<? super BatteryInfo, H0> lVar) {
        BatteryInfo f4 = hmDevice.f();
        if (f4 == null) {
            f4 = new BatteryInfo();
        }
        lVar.C(f4);
        hmDevice.a0(f4);
    }

    @Override // com.harman.sdk.impl.scan.g, com.harman.sdk.impl.scan.f
    public void a(boolean z3) {
    }

    @Override // com.harman.sdk.impl.scan.f
    public void b(@l3.d HmDevice device) {
        F.p(device, "device");
        com.harman.log.f.a(f48046c0, "setCurrentDevice to " + device.n());
        this.f48050V = device;
    }

    @Override // com.harman.sdk.impl.scan.g, com.harman.sdk.impl.scan.f
    public void c(@l3.d Context context) {
        F.p(context, "context");
        y(context.getApplicationContext());
        C2323l.f(this, null, null, new c(null), 3, null);
    }

    public final void c0(@l3.e B2.a aVar) {
        if (aVar != null) {
            this.f48049U = aVar;
        }
    }

    @Override // com.harman.sdk.impl.scan.f
    public void d() {
        com.harman.log.f.a(f48046c0, "resetDiscoverToNormalState");
        this.f48051W = false;
    }

    @Override // com.harman.sdk.impl.scan.g, com.harman.sdk.impl.scan.f
    public void e() {
    }

    @Override // com.harman.sdk.impl.scan.g, com.harman.sdk.impl.scan.f
    public void f(@l3.e B2.b bVar) {
        super.f(bVar);
        Q();
    }

    @Override // kotlinx.coroutines.U
    @l3.d
    public kotlin.coroutines.f getCoroutineContext() {
        return this.f48047S.getCoroutineContext();
    }

    @Override // com.harman.sdk.impl.scan.g, com.harman.sdk.impl.scan.f
    public void i() {
        super.i();
        R();
        this.f48052X.clear();
    }

    @Override // com.harman.sdk.impl.scan.f
    public void j() {
        com.harman.log.f.a(f48046c0, "setStandbyDeviceRoleBitCheckOn");
    }
}
