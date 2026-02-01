package com.harman.sdk.impl.connect;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.harman.sdk.command.HeartBeatCommand;
import com.harman.sdk.command.ReqPowerOffCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.AuracastInfo;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.AuracastSupport;
import com.harman.sdk.utils.DeviceProtocol;
import com.harman.sdk.utils.MessageID;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C0;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.L0;

@SuppressLint({"LongLogTag"})
@U({"SMAP\nGattControllerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GattControllerImpl.kt\ncom/harman/sdk/impl/connect/GattControllerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1350:1\n1#2:1351\n125#3:1352\n152#3,3:1353\n*S KotlinDebug\n*F\n+ 1 GattControllerImpl.kt\ncom/harman/sdk/impl/connect/GattControllerImpl\n*L\n1347#1:1352\n1347#1:1353,3\n*E\n"})
/* loaded from: classes2.dex */
public final class C extends AbstractC2035b {

    /* renamed from: A, reason: collision with root package name */
    @l3.d
    public static final a f47887A = new a(null);

    /* renamed from: B, reason: collision with root package name */
    @l3.d
    private static final String f47888B = "GattControllerImpl";

    /* renamed from: C, reason: collision with root package name */
    @l3.d
    private static final String f47889C = "GattControllerImplRW";

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.concurrent.d<D> f47890a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final AtomicBoolean f47891b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final Map<String, BluetoothGatt> f47892c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final Map<String, HmDevice> f47893d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final Map<String, BluetoothGattCharacteristic> f47894e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final Map<String, BluetoothGattCallback> f47895f;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private final Map<String, Integer> f47896g;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private final Map<String, Integer> f47897h;

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private final Map<String, Integer> f47898i;

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    private final Map<String, Boolean> f47899j;

    /* renamed from: k, reason: collision with root package name */
    @l3.d
    private final LinkedList<C2034a> f47900k;

    /* renamed from: l, reason: collision with root package name */
    @l3.d
    private final LinkedList<C2034a> f47901l;

    /* renamed from: m, reason: collision with root package name */
    private final ThreadPoolExecutor f47902m;

    /* renamed from: n, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.command.a f47903n;

    /* renamed from: o, reason: collision with root package name */
    @l3.d
    private final Context f47904o;

    /* renamed from: p, reason: collision with root package name */
    private int f47905p;

    /* renamed from: q, reason: collision with root package name */
    @l3.e
    private final Handler f47906q;

    /* renamed from: r, reason: collision with root package name */
    @l3.e
    private final Handler f47907r;

    /* renamed from: s, reason: collision with root package name */
    @l3.d
    private String f47908s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f47909t;

    /* renamed from: u, reason: collision with root package name */
    @l3.d
    private final Map<String, Long> f47910u;

    /* renamed from: v, reason: collision with root package name */
    @l3.d
    private final Map<String, String> f47911v;

    /* renamed from: w, reason: collision with root package name */
    @l3.d
    private final Runnable f47912w;

    /* renamed from: x, reason: collision with root package name */
    @l3.d
    private Runnable f47913x;

    /* renamed from: y, reason: collision with root package name */
    @l3.d
    private Map<HmDevice, L0> f47914y;

    /* renamed from: z, reason: collision with root package name */
    @l3.d
    private final Runnable f47915z;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.l<C2034a, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ HmDevice f47916F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(HmDevice hmDevice) {
            super(1);
            this.f47916F = hmDevice;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d C2034a it) {
            kotlin.jvm.internal.F.p(it, "it");
            return Boolean.valueOf(kotlin.jvm.internal.F.g(it.b(), this.f47916F));
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.l<C2034a, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ HmDevice f47917F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(HmDevice hmDevice) {
            super(1);
            this.f47917F = hmDevice;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d C2034a it) {
            kotlin.jvm.internal.F.p(it, "it");
            return Boolean.valueOf(kotlin.jvm.internal.F.g(it.b(), this.f47917F));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends BluetoothGattCallback {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f47919b;

        d(String str) {
            this.f47919b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x01c1 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:21:0x0153, B:23:0x015d, B:60:0x0195, B:61:0x019e, B:29:0x01c1, B:32:0x01cb, B:34:0x01d1, B:36:0x01de, B:37:0x01e5, B:39:0x0214, B:49:0x01f2, B:51:0x01fa, B:54:0x0203, B:68:0x020c), top: B:20:0x0153 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x022b A[LOOP:1: B:42:0x0225->B:44:0x022b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01f2 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:21:0x0153, B:23:0x015d, B:60:0x0195, B:61:0x019e, B:29:0x01c1, B:32:0x01cb, B:34:0x01d1, B:36:0x01de, B:37:0x01e5, B:39:0x0214, B:49:0x01f2, B:51:0x01fa, B:54:0x0203, B:68:0x020c), top: B:20:0x0153 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0195 A[Catch: all -> 0x019a, TryCatch #1 {all -> 0x019a, blocks: (B:21:0x0153, B:23:0x015d, B:60:0x0195, B:61:0x019e, B:29:0x01c1, B:32:0x01cb, B:34:0x01d1, B:36:0x01de, B:37:0x01e5, B:39:0x0214, B:49:0x01f2, B:51:0x01fa, B:54:0x0203, B:68:0x020c), top: B:20:0x0153 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x019d  */
        @Override // android.bluetooth.BluetoothGattCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCharacteristicChanged(@l3.d android.bluetooth.BluetoothGatt r13, @l3.d android.bluetooth.BluetoothGattCharacteristic r14) {
            /*
                Method dump skipped, instructions count: 568
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.sdk.impl.connect.C.d.onCharacteristicChanged(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattCharacteristic):void");
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(@l3.d BluetoothGatt gatt, @l3.d BluetoothGattCharacteristic characteristic, int i4) {
            com.harman.sdk.a aVar;
            kotlin.jvm.internal.F.p(gatt, "gatt");
            kotlin.jvm.internal.F.p(characteristic, "characteristic");
            HmDevice hmDevice = (HmDevice) C.this.f47893d.get(this.f47919b);
            String h4 = com.harman.sdk.utils.g.h(characteristic.getValue(), true);
            com.harman.log.f.a(C.f47888B, this.f47919b + ": onCharacteristicWrite buffer : " + h4 + " ; status : " + i4);
            LinkedList linkedList = C.this.f47901l;
            C c4 = C.this;
            synchronized (linkedList) {
                try {
                    if (!c4.f47901l.isEmpty()) {
                        aVar = ((C2034a) c4.f47901l.getFirst()).a();
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && !aVar.s()) {
                        com.harman.log.f.d(C.f47888B, "onCharacteristicWrite() >>> withResponse == false, remove callback");
                        Handler handler = c4.f47907r;
                        if (handler != null) {
                            handler.removeCallbacks(c4.f47912w);
                        }
                        kotlin.collections.A.M0(c4.f47901l);
                        c4.W();
                    }
                    H0 h02 = H0.f51801a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (aVar != null && hmDevice != null) {
                Iterator it = C.this.f47890a.a().iterator();
                while (it.hasNext()) {
                    ((D) it.next()).g(hmDevice, aVar, h4, i4);
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(@l3.d BluetoothGatt gatt, int i4, int i5) {
            kotlin.jvm.internal.F.p(gatt, "gatt");
            C.this.k0(this.f47919b, gatt, i4, i5);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(@l3.d BluetoothGatt gatt, int i4, int i5) {
            kotlin.jvm.internal.F.p(gatt, "gatt");
            com.harman.log.f.a(C.f47888B, "GattControllerImpl.requestMtu.onMtuChanged() >>> received: " + i5 + " new mtu: " + i4);
            String str = this.f47919b;
            HmDevice hmDevice = (HmDevice) C.this.f47893d.get(this.f47919b);
            if (hmDevice == null) {
                hmDevice = null;
            }
            com.harman.log.f.a(C.f47888B, "GattControllerImpl.requestMtu.onMtuChanged() >>> received: macKey:" + str + ",device:" + hmDevice);
            HmDevice hmDevice2 = (HmDevice) C.this.f47893d.get(this.f47919b);
            if (hmDevice2 == null) {
                return;
            }
            if (i4 >= 100 && !TextUtils.isEmpty(hmDevice2.g())) {
                com.harman.log.f.d(C.f47888B, "GattControllerImpl.requestMtu.onMtuChanged() >>> status[" + i5 + "] mtu[" + i4 + "] " + C.this.t0(hmDevice2));
                C.this.f47899j.put(hmDevice2.g(), Boolean.TRUE);
            }
            hmDevice2.P().set(false);
            for (D d4 : C.this.f47890a.a()) {
                int i6 = 250;
                if (i4 < 250) {
                    i6 = i4;
                }
                hmDevice2.A0(i6);
                d4.a(hmDevice2, hmDevice2.C());
            }
            C.this.W();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(@l3.d BluetoothGatt gatt, int i4) {
            kotlin.jvm.internal.F.p(gatt, "gatt");
            com.harman.log.f.a(C.f47888B, "onServicesDiscovered status: " + i4);
            if (i4 == 0) {
                C.this.p0(this.f47919b, gatt);
            } else {
                C.this.f47894e.remove(this.f47919b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.sdk.impl.connect.GattControllerImpl$launchHeartBeatJob$1", f = "GattControllerImpl.kt", i = {0}, l = {548}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class e extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47920I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f47921J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f47922K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ C f47923L;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.sdk.impl.connect.GattControllerImpl$launchHeartBeatJob$1$1", f = "GattControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f47924I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ C f47925J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f47926K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C c4, HmDevice hmDevice, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f47925J = c4;
                this.f47926K = hmDevice;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f47924I == 0) {
                    W.n(obj);
                    this.f47925J.j(this.f47926K, new HeartBeatCommand());
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f47925J, this.f47926K, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(HmDevice hmDevice, C c4, kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
            this.f47922K = hmDevice;
            this.f47923L = c4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            kotlinx.coroutines.U u3;
            L0 f4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47920I;
            if (i4 != 0) {
                if (i4 == 1) {
                    u3 = (kotlinx.coroutines.U) this.f47921J;
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                u3 = (kotlinx.coroutines.U) this.f47921J;
            }
            while (this.f47922K.R()) {
                Map map = this.f47923L.f47914y;
                HmDevice hmDevice = this.f47922K;
                f4 = C2323l.f(u3, null, CoroutineStart.DEFAULT, new a(this.f47923L, hmDevice, null), 1, null);
                map.put(hmDevice, f4);
                L0 l02 = (L0) this.f47923L.f47914y.get(this.f47922K);
                if (l02 != null) {
                    kotlin.coroutines.jvm.internal.a.a(l02.start());
                }
                long l5 = this.f47922K.l();
                this.f47921J = u3;
                this.f47920I = 1;
                if (C2269d0.b(l5, this) == l4) {
                    return l4;
                }
            }
            this.f47923L.f47914y.remove(this.f47922K);
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((e) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            e eVar = new e(this.f47922K, this.f47923L, cVar);
            eVar.f47921J = obj;
            return eVar;
        }
    }

    public C(@l3.d Context context) {
        Handler handler;
        kotlin.jvm.internal.F.p(context, "context");
        this.f47890a = new com.harman.sdk.concurrent.c();
        this.f47891b = new AtomicBoolean(false);
        this.f47892c = new ConcurrentHashMap();
        this.f47893d = new ConcurrentHashMap();
        this.f47894e = new ConcurrentHashMap();
        this.f47895f = new ConcurrentHashMap();
        this.f47896g = new HashMap();
        this.f47897h = new HashMap();
        this.f47898i = new HashMap();
        this.f47899j = new ConcurrentHashMap();
        this.f47900k = new LinkedList<>();
        this.f47901l = new LinkedList<>();
        this.f47902m = com.harman.sdk.concurrent.a.a();
        this.f47903n = new com.harman.sdk.command.a();
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.F.o(applicationContext, "getApplicationContext(...)");
        this.f47904o = applicationContext;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            handler = new Handler(myLooper);
        } else {
            handler = null;
        }
        this.f47906q = handler;
        Looper myLooper2 = Looper.myLooper();
        this.f47907r = myLooper2 != null ? new Handler(myLooper2) : null;
        this.f47908s = "";
        this.f47910u = new ConcurrentHashMap();
        this.f47911v = new ConcurrentHashMap();
        this.f47912w = new Runnable() { // from class: com.harman.sdk.impl.connect.z
            @Override // java.lang.Runnable
            public final void run() {
                C.L0(C.this);
            }
        };
        this.f47913x = new Runnable() { // from class: com.harman.sdk.impl.connect.A
            @Override // java.lang.Runnable
            public final void run() {
                C.J0(C.this);
            }
        };
        this.f47914y = new LinkedHashMap();
        this.f47915z = new Runnable() { // from class: com.harman.sdk.impl.connect.B
            @Override // java.lang.Runnable
            public final void run() {
                C.x0(C.this);
            }
        };
    }

    private final void A0(final PartyBoxDevice partyBoxDevice) {
        com.harman.log.f.a(f47888B, "onDeviceConnected() >>> MAC[" + partyBoxDevice.n() + "] BLE[" + partyBoxDevice.g() + "]");
        String t02 = t0(partyBoxDevice);
        StringBuilder sb = new StringBuilder();
        sb.append("GattControllerImpl.onDeviceConnected() >>> isConnected[true] ");
        sb.append(t02);
        com.harman.log.f.d(f47888B, sb.toString());
        partyBoxDevice.g0(true);
        y0(partyBoxDevice);
        Handler handler = this.f47906q;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.u
                @Override // java.lang.Runnable
                public final void run() {
                    C.C0(C.this, partyBoxDevice);
                }
            }, 1000L);
        }
        if (partyBoxDevice.F() == DeviceProtocol.PROTOCOL_GATT_BR_EDR) {
            this.f47899j.put(partyBoxDevice.n(), Boolean.TRUE);
            partyBoxDevice.P().set(false);
            com.harman.log.f.d(f47888B, "onDeviceConnected() >>> PROTOCOL_GATT_BR_EDR " + t0(partyBoxDevice));
            return;
        }
        com.harman.log.f.d(f47888B, "onDeviceConnected() >>> start req MTU. cur.adr[" + this.f47908s + "] dev:" + t0(partyBoxDevice));
        Handler handler2 = this.f47906q;
        if (handler2 != null) {
            handler2.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.v
                @Override // java.lang.Runnable
                public final void run() {
                    C.B0(C.this, partyBoxDevice);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(C this$0, PartyBoxDevice it) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(it, "$it");
        this$0.H0(it, 512);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(C this$0, PartyBoxDevice device) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(device, "$device");
        com.harman.log.f.a(f47888B, "GattControllerImpl.onConnectChanged() >>> notify all. " + this$0.t0(device));
        for (D d4 : this$0.f47890a.a()) {
            if (device != null) {
                com.harman.log.f.a(f47888B, "onConnectChanged STATE_CONNECTED : " + device.j());
                d4.b(device, 2, null);
            }
        }
    }

    private final void D0(BluetoothGatt bluetoothGatt, String str, int i4) {
        com.harman.log.f.a(f47888B, "processStateDisconnected() >>> MAC[" + str + "] status[" + i4 + "] isOTARestartPhase[" + this.f47909t + "]");
        if (i4 == 133) {
            com.harman.log.f.a(f47888B, "attemptReconnect : " + str);
            R(str);
            return;
        }
        n0(this, str, null, false, 4, null);
    }

    private final void E0(HmDevice hmDevice, com.harman.sdk.a aVar) {
        byte[] n4;
        Integer num;
        synchronized (this.f47901l) {
            try {
                C2034a c2034a = new C2034a(hmDevice, aVar);
                if (aVar instanceof ReqPowerOffCommand) {
                    com.harman.log.f.d(f47888B, "meet ReqPowerOffCommand clear waitingCommandList");
                    this.f47901l.clear();
                    this.f47900k.clear();
                }
                for (int size = this.f47900k.size() - 1; -1 < size; size--) {
                    if (this.f47900k.get(size).a().k() == aVar.k() && aVar.k() != 85 && aVar.k() != 86 && aVar.k() != 87) {
                        com.harman.log.f.d(f47888B, "remove waitingCommand: " + this.f47900k.get(size));
                        this.f47900k.remove(size);
                    } else if (this.f47900k.get(size).a().k() == aVar.k() && aVar.k() == 87 && aVar.l() >= 2 && (n4 = aVar.n()) != null && n4[1] == 0 && this.f47900k.get(size).a().l() >= 2) {
                        byte[] n5 = this.f47900k.get(size).a().n();
                        Integer num2 = null;
                        if (n5 != null) {
                            num = Integer.valueOf(n5[0]);
                        } else {
                            num = null;
                        }
                        byte[] n6 = aVar.n();
                        if (n6 != null) {
                            num2 = Integer.valueOf(n6[0]);
                        }
                        if (kotlin.jvm.internal.F.g(num, num2)) {
                            com.harman.log.f.d(f47888B, "remove waitingCommand: " + this.f47900k.get(size));
                            this.f47900k.remove(size);
                        }
                    }
                }
                com.harman.log.f.d(f47888B, "putWaitingCommand() >>> insert cmd[" + aVar + "] waiting queue");
                this.f47900k.add(c2034a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean F0(BluetoothGatt bluetoothGatt) {
        com.harman.log.f.a(f47888B, "refreshDeviceCache called");
        try {
            Method method = bluetoothGatt.getClass().getMethod("refresh", new Class[0]);
            if (method != null) {
                Object invoke = method.invoke(bluetoothGatt, new Object[0]);
                kotlin.jvm.internal.F.n(invoke, "null cannot be cast to non-null type kotlin.Boolean");
                return ((Boolean) invoke).booleanValue();
            }
        } catch (Exception e4) {
            com.harman.log.f.a(f47888B, " An exception occured while refreshing device");
            e4.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(C this$0, HmDevice it) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(it, "$it");
        this$0.H0(it, 512);
    }

    @SuppressLint({"MissingPermission"})
    private final void H0(HmDevice hmDevice, int i4) {
        String j4 = hmDevice.j();
        com.harman.log.f.d(f47888B, "GattControllerImpl.requestMtu() >>> " + t0(hmDevice) + " val[" + i4 + "]");
        BluetoothGatt bluetoothGatt = this.f47892c.get(j4);
        if (bluetoothGatt != null && bluetoothGatt.requestMtu(i4)) {
            com.harman.log.f.d(f47888B, "GattControllerImpl.requestMtu() succeed");
        } else {
            com.harman.log.f.d(f47888B, "GattControllerImpl.requestMtu() failed");
        }
    }

    private final BluetoothDevice I0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object systemService = this.f47904o.getSystemService("bluetooth");
        kotlin.jvm.internal.F.n(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        BluetoothAdapter adapter = ((BluetoothManager) systemService).getAdapter();
        if (adapter == null) {
            return null;
        }
        return adapter.getRemoteDevice(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(C this$0) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        C2034a w02 = this$0.w0();
        if (w02 != null) {
            this$0.o0(w02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(C this$0, C2034a c2034a) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.o0(c2034a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(C this$0) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        synchronized (this$0.f47901l) {
            try {
                com.harman.log.f.a(f47888B, "write command timeout, clear sending list.");
                Iterator<C2034a> it = this$0.f47901l.iterator();
                while (it.hasNext()) {
                    C2034a next = it.next();
                    com.harman.log.f.g(f47888B, "GattControllerImpl. Sending Timeout Runnable >>> CMD[" + next.a() + "] dev:" + this$0.t0(next.b()));
                    for (D d4 : this$0.f47890a.a()) {
                        HmDevice b4 = next.b();
                        com.harman.sdk.a a4 = next.a();
                        BaseMessage baseMessage = new BaseMessage();
                        baseMessage.f(MessageID.TIMEOUT_STATUS);
                        H0 h02 = H0.f51801a;
                        d4.d(b4, null, a4, baseMessage);
                    }
                }
                this$0.f47901l.clear();
                this$0.W();
                H0 h03 = H0.f51801a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean O0(HmDevice hmDevice) {
        AuracastSupport auracastSupport;
        AuracastSupport auracastSupport2 = AuracastSupport.SUPPORT;
        AuracastInfo d4 = hmDevice.d();
        if (d4 != null) {
            auracastSupport = d4.b();
        } else {
            auracastSupport = null;
        }
        if (auracastSupport2 == auracastSupport) {
            return true;
        }
        return false;
    }

    private final void P0(HmDevice hmDevice) {
        String remove = this.f47911v.remove(hmDevice.n());
        if (remove == null) {
            return;
        }
        com.harman.log.f.d(f47888B, "updateBLEAddressAfterDisconnected() >>> device[" + hmDevice.n() + "].BLE updated from [" + hmDevice.g() + "] to [" + remove + "]");
        hmDevice.b0(remove);
    }

    private final void R(final String str) {
        int i4;
        int l4 = com.harman.sdk.utils.d.j().l();
        Integer num = this.f47896g.get(str);
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        com.harman.log.f.a(f47888B, "attemptReconnect temp/ reConnectIndex[mac]: " + num);
        com.harman.log.f.a(f47888B, "attemptReconnect index : " + i4 + " for mac : " + str);
        StringBuilder sb = new StringBuilder();
        sb.append("attemptReconnect maxCount : ");
        sb.append(l4);
        sb.append(" ");
        com.harman.log.f.a(f47888B, sb.toString());
        if (i4 >= l4) {
            com.harman.log.f.a(f47888B, "Still failed after tried : " + l4 + "  times");
            n0(this, str, "Still failed after tried " + l4 + " times.", false, 4, null);
            return;
        }
        if (this.f47909t) {
            Handler handler = this.f47906q;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        C.S(C.this, str);
                    }
                }, 8000L);
                return;
            }
            return;
        }
        Handler handler2 = this.f47906q;
        if (handler2 != null) {
            handler2.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.o
                @Override // java.lang.Runnable
                public final void run() {
                    C.U(C.this, str);
                }
            }, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(final C this$0, final String mac) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(mac, "$mac");
        this$0.f47902m.execute(new Runnable() { // from class: com.harman.sdk.impl.connect.w
            @Override // java.lang.Runnable
            public final void run() {
                C.T(mac, this$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(String mac, C this$0) {
        kotlin.jvm.internal.F.p(mac, "$mac");
        kotlin.jvm.internal.F.p(this$0, "this$0");
        com.harman.log.f.a(f47888B, "attemptReconnect() >>> RefreshDeviceCache and try to connect again during OTA Restart [" + mac + "]");
        BluetoothGatt bluetoothGatt = this$0.f47892c.get(mac);
        if (bluetoothGatt != null) {
            this$0.F0(bluetoothGatt);
        }
        this$0.h0(mac);
        this$0.j0(mac);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(final C this$0, final String mac) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(mac, "$mac");
        this$0.f47902m.execute(new Runnable() { // from class: com.harman.sdk.impl.connect.m
            @Override // java.lang.Runnable
            public final void run() {
                C.V(mac, this$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(String mac, C this$0) {
        kotlin.jvm.internal.F.p(mac, "$mac");
        kotlin.jvm.internal.F.p(this$0, "this$0");
        com.harman.log.f.a(f47888B, "attemptReconnect() >>> RefreshDeviceCache and try to connect again [" + mac + "]");
        BluetoothGatt bluetoothGatt = this$0.f47892c.get(mac);
        if (bluetoothGatt != null) {
            this$0.F0(bluetoothGatt);
        }
        this$0.h0(mac);
        this$0.j0(mac);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        Handler handler = this.f47906q;
        if (handler != null) {
            handler.removeCallbacks(this.f47913x);
            handler.postDelayed(this.f47913x, 80L);
        }
    }

    private final void X(final String str, final byte[] bArr, final String str2) {
        int i4;
        Handler handler;
        int i5 = this.f47905p + 1;
        this.f47905p = i5;
        com.harman.log.f.g(f47888B, str + ", attemptToReWriteCharacteristic : " + i5);
        int m4 = com.harman.sdk.utils.d.j().m();
        Integer num = this.f47897h.get(str);
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        if (i4 >= m4) {
            r0(str, str2);
        } else if (bArr != null && (handler = this.f47906q) != null) {
            handler.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.q
                @Override // java.lang.Runnable
                public final void run() {
                    C.Y(C.this, str, bArr, str2);
                }
            }, 80L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(C this$0, String mac, byte[] it, String str) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(mac, "$mac");
        kotlin.jvm.internal.F.p(it, "$it");
        this$0.q0(mac, it, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a0(X2.l tmp0, Object obj) {
        kotlin.jvm.internal.F.p(tmp0, "$tmp0");
        return ((Boolean) tmp0.C(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b0(X2.l tmp0, Object obj) {
        kotlin.jvm.internal.F.p(tmp0, "$tmp0");
        return ((Boolean) tmp0.C(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(HmDevice hmDevice) {
        L0 l02 = this.f47914y.get(hmDevice);
        if (l02 != null) {
            L0.a.b(l02, null, 1, null);
        }
    }

    private final void d0(String str) {
        boolean K12;
        synchronized (this.f47901l) {
            try {
                Iterator<C2034a> it = this.f47900k.iterator();
                kotlin.jvm.internal.F.o(it, "iterator(...)");
                while (it.hasNext()) {
                    C2034a next = it.next();
                    kotlin.jvm.internal.F.o(next, "next(...)");
                    C2034a c2034a = next;
                    if (TextUtils.isEmpty(c2034a.b().j())) {
                        K12 = kotlin.text.z.K1(c2034a.b().j(), str, true);
                        if (K12) {
                        }
                    }
                    it.remove();
                }
                H0 h02 = H0.f51801a;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.harman.log.f.d(f47888B, "GattControllerImpl.cleanWaitingCommand() >>> target addr[" + str + "], send.queue.left[" + this.f47901l.size() + "], wait.queue.left[" + this.f47900k.size() + "]");
        int size = this.f47901l.size();
        StringBuilder sb = new StringBuilder();
        sb.append("after clean: sendingCommandList size : ");
        sb.append(size);
        com.harman.log.f.a(f47888B, sb.toString());
    }

    private final BluetoothGattCallback g0(String str) {
        d dVar = new d(str);
        this.f47895f.put(str, dVar);
        return dVar;
    }

    @SuppressLint({"MissingPermission"})
    private final void i0(BluetoothGatt bluetoothGatt, String str) {
        com.harman.log.f.a(f47888B, "discoverServices " + str);
        if (bluetoothGatt != null && !bluetoothGatt.discoverServices()) {
            com.harman.log.f.a(f47888B, "discoverServices false ");
            n0(this, str, null, false, 4, null);
        }
    }

    @SuppressLint({"MissingPermission"})
    private final boolean j0(String str) {
        int i4;
        BluetoothGatt connectGatt;
        int i5;
        AtomicBoolean P3;
        BluetoothGatt bluetoothGatt = this.f47892c.get(str);
        BluetoothDevice I02 = I0(str);
        Integer num = this.f47896g.get(str);
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        com.harman.log.f.a(f47888B, "isSwitchSpeaker On, so call createGattCallback");
        com.harman.log.f.a(f47888B, "doConnectGatt temp/ reConnectIndex[mac]: " + num);
        com.harman.log.f.a(f47888B, "doConnectGatt index : " + i4 + " for mac : " + str);
        if (I02 == null) {
            HmDevice hmDevice = this.f47893d.get(str);
            if (hmDevice != null) {
                com.harman.log.f.d(f47888B, "GattControllerImpl.doConnectGatt() >>> " + t0(hmDevice));
                hmDevice.P().set(false);
            }
            this.f47891b.set(false);
            return false;
        }
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
            bluetoothGatt.close();
        }
        this.f47896g.put(str, Integer.valueOf(i4 + 1));
        com.harman.log.f.a(f47888B, "doConnectGatt Increment reConnectIndex");
        com.harman.log.f.a(f47888B, "doConnectGatt reConnectIndex[macKey]: " + this.f47896g.get(str));
        com.harman.log.f.d(f47888B, "doConnectGatt() >>> BLE.addr[" + str + "] re.index[" + this.f47896g.get(str) + "]");
        HmDevice hmDevice2 = this.f47893d.get(str);
        if (hmDevice2 != null && (P3 = hmDevice2.P()) != null) {
            P3.set(true);
        }
        if (hmDevice2 != null) {
            if (hmDevice2.F() == DeviceProtocol.PROTOCOL_GATT_BR_EDR) {
                i5 = 1;
            } else {
                i5 = 2;
            }
            com.harman.log.f.a(f47888B, "isSwitchSpeaker Off, so call createGattCallbackOrg");
            Context context = this.f47904o;
            String address = I02.getAddress();
            kotlin.jvm.internal.F.o(address, "getAddress(...)");
            connectGatt = I02.connectGatt(context, false, g0(address), i5);
        } else {
            Context context2 = this.f47904o;
            String address2 = I02.getAddress();
            kotlin.jvm.internal.F.o(address2, "getAddress(...)");
            connectGatt = I02.connectGatt(context2, false, g0(address2));
            if (connectGatt != null) {
                connectGatt.requestConnectionPriority(1);
            }
        }
        if (connectGatt != null) {
            this.f47892c.put(str, connectGatt);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void k0(final String str, final BluetoothGatt bluetoothGatt, int i4, int i5) {
        if (i5 != 0) {
            if (i5 != 2) {
                if (bluetoothGatt != null) {
                    bluetoothGatt.disconnect();
                    bluetoothGatt.close();
                }
                HmDevice hmDevice = this.f47893d.get(str);
                if (hmDevice != null) {
                    com.harman.log.f.d(f47888B, "doConnectionStateChange() >>> else " + t0(hmDevice));
                    hmDevice.P().set(false);
                }
                this.f47891b.set(false);
                return;
            }
            com.harman.log.f.a(f47888B, "doConnectionStateChange() >>> MAC[" + str + "] STATE_CONNECTED");
            this.f47891b.set(false);
            d0(str);
            HmDevice hmDevice2 = this.f47893d.get(str);
            if (hmDevice2 != null && com.harman.sdk.utils.d.I(hmDevice2.q())) {
                i0(bluetoothGatt, str);
                return;
            }
            Handler handler = this.f47906q;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        C.l0(C.this, bluetoothGatt, str);
                    }
                }, 600L);
                return;
            }
            return;
        }
        HmDevice hmDevice3 = this.f47893d.get(str);
        if (hmDevice3 != null) {
            com.harman.log.f.d(f47888B, "doConnectionStateChange() >>> STATE_DISCONNECTED " + t0(hmDevice3));
            hmDevice3.P().set(false);
        }
        if (bluetoothGatt != null) {
            com.harman.log.f.a(f47888B, "doConnectionStateChange() >>> STATE_DISCONNECTED, gatt.disconnect() is called for :" + str);
            bluetoothGatt.disconnect();
            bluetoothGatt.close();
        }
        D0(bluetoothGatt, str, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(C this$0, BluetoothGatt bluetoothGatt, String macKey) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(macKey, "$macKey");
        this$0.i0(bluetoothGatt, macKey);
    }

    private final void m0(String str, String str2, boolean z3) {
        com.harman.log.f.a(f47888B, "doProcessStateDisconnected remove : " + str);
        this.f47892c.remove(str);
        this.f47894e.remove(str);
        this.f47895f.remove(str);
        com.harman.log.f.a(f47888B, "doProcessStateDisconnected remove reConnectIndex : " + str);
        this.f47896g.remove(str);
        this.f47898i.remove(str);
        HmDevice remove = this.f47893d.remove(str);
        synchronized (this.f47901l) {
            this.f47900k.clear();
            H0 h02 = H0.f51801a;
        }
        com.harman.log.f.d(f47888B, "GattControllerImpl.doProcessStateDisconnected() >>> isConnected[false] clear waiting cmd queue");
        if (remove != null) {
            remove.g0(false);
            if (!TextUtils.isEmpty(remove.j())) {
                com.harman.log.f.d(f47888B, "doProcessStateDisconnected() >>> remove MTU flag for " + t0(remove));
                this.f47899j.put(remove.j(), Boolean.FALSE);
                d0(remove.j());
            }
            P0(remove);
            if (z3) {
                Iterator<D> it = this.f47890a.a().iterator();
                while (it.hasNext()) {
                    it.next().b(remove, 0, str2);
                }
            }
        }
        HmDevice hmDevice = this.f47893d.get(str);
        if (hmDevice != null) {
            com.harman.log.f.d(f47888B, "GattControllerImpl.doProcessStateDisconnected() >>> " + t0(hmDevice));
            hmDevice.P().set(false);
        }
        this.f47891b.set(false);
    }

    static /* synthetic */ void n0(C c4, String str, String str2, boolean z3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = true;
        }
        c4.m0(str, str2, z3);
    }

    private final void o0(C2034a c2034a) {
        String a4 = c2034a.a().a();
        com.harman.log.f.a(f47888B, "doSendCacheCommand() >>> MAC[" + c2034a.b().j() + "] CMD[" + a4 + "]");
        byte[] b4 = c2034a.a().b();
        if (b4 != null) {
            q0(c2034a.b().j(), b4, a4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void p0(String str, BluetoothGatt bluetoothGatt) {
        Object obj;
        UUID fromString;
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        boolean K12;
        Integer num;
        DeviceProtocol deviceProtocol;
        String str2;
        String str3;
        String str4;
        String str5;
        Boolean bool;
        DeviceProtocol deviceProtocol2;
        UUID fromString2 = UUID.fromString(com.harman.sdk.utils.d.j().r());
        UUID fromString3 = UUID.fromString(com.harman.sdk.utils.d.j().t());
        UUID fromString4 = UUID.fromString(com.harman.sdk.utils.d.j().g());
        this.f47896g.put(str, 0);
        com.harman.log.f.a(f47888B, "doServicesDiscovered set reConnectIndex to " + this.f47896g.get(str) + " : " + str);
        if (bluetoothGatt.getServices().size() == 0) {
            R(str);
            return;
        }
        HmDevice hmDevice = this.f47893d.get(str);
        if (hmDevice != null) {
            obj = hmDevice.u(HmDevice.f47760O0);
        } else {
            obj = null;
        }
        String str6 = (String) obj;
        if (!TextUtils.isEmpty(str6)) {
            fromString = UUID.fromString(str6);
        } else {
            fromString = UUID.fromString(com.harman.sdk.utils.d.j().a());
        }
        BluetoothGattService service = bluetoothGatt.getService(fromString);
        if (service != null) {
            com.harman.log.f.a(f47888B, "Found gattService with : " + fromString);
            bluetoothGattCharacteristic = service.getCharacteristic(fromString3);
            com.harman.log.f.a(f47888B, "characteristicTx is : " + bluetoothGattCharacteristic);
        } else {
            com.harman.log.f.a(f47888B, "Can't found gattService with  : " + fromString);
            bluetoothGattCharacteristic = null;
        }
        if (service == null || bluetoothGattCharacteristic == null) {
            K12 = kotlin.text.z.K1(com.harman.sdk.utils.d.j().a(), str6, true);
            if (!K12) {
                UUID fromString5 = UUID.fromString(com.harman.sdk.utils.d.j().a());
                service = bluetoothGatt.getService(fromString5);
                if (service != null) {
                    com.harman.log.f.a(f47888B, "Found gattService with : " + fromString5);
                    bluetoothGattCharacteristic = service.getCharacteristic(fromString3);
                    com.harman.log.f.a(f47888B, "characteristicTx is : " + bluetoothGattCharacteristic);
                } else {
                    com.harman.log.f.a(f47888B, "Can't found gattService with  : " + fromString5);
                }
            }
        }
        if (service == null || bluetoothGattCharacteristic == null) {
            service = bluetoothGatt.getService(UUID.fromString(com.harman.sdk.utils.d.j().i()));
            if (service != null) {
                com.harman.log.f.a(f47888B, "Found gattService with : " + com.harman.sdk.utils.d.j().i());
            } else {
                com.harman.log.f.a(f47888B, "Can't found gattService with  : " + com.harman.sdk.utils.d.j().i());
            }
        }
        if (service != null) {
            service.getCharacteristics().size();
            if (service.getCharacteristics().isEmpty()) {
                this.f47894e.remove(str);
            }
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(fromString2);
            BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(fromString3);
            if (com.harman.sdk.utils.d.a0(hmDevice)) {
                characteristic = service.getCharacteristic(fromString3);
            }
            if (characteristic != null) {
                bluetoothGatt.setCharacteristicNotification(characteristic, true);
                BluetoothGattDescriptor descriptor = characteristic.getDescriptor(fromString4);
                if (descriptor != null) {
                    kotlin.jvm.internal.F.m(descriptor);
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                    bluetoothGatt.writeDescriptor(descriptor);
                }
            } else {
                com.harman.log.f.g(f47888B, "characteristicRx with : " + com.harman.sdk.utils.d.j().r() + " is null!");
            }
            if (characteristic2 != null) {
                if (hmDevice != null) {
                    deviceProtocol2 = hmDevice.F();
                } else {
                    deviceProtocol2 = null;
                }
                if (deviceProtocol2 == DeviceProtocol.PROTOCOL_GATT_BR_EDR) {
                    characteristic2.setWriteType(1);
                }
                this.f47894e.put(str, characteristic2);
            } else {
                com.harman.log.f.g(f47888B, "characteristicTx with : " + com.harman.sdk.utils.d.j().t() + " is null!");
            }
            if (hmDevice != null) {
                num = Integer.valueOf(hmDevice.C());
            } else {
                num = null;
            }
            com.harman.log.f.a(f47888B, "original MTU : " + num);
            if (hmDevice != null) {
                deviceProtocol = hmDevice.F();
            } else {
                deviceProtocol = null;
            }
            com.harman.log.f.a(f47888B, "preferredProtocol : " + deviceProtocol);
            if (hmDevice != null) {
                str2 = hmDevice.n();
            } else {
                str2 = null;
            }
            com.harman.log.f.a(f47888B, "MAC : " + str2);
            if (hmDevice != null) {
                str3 = hmDevice.g();
            } else {
                str3 = null;
            }
            com.harman.log.f.a(f47888B, "device?.bleAddress : " + str3);
            if (hmDevice != null) {
                str4 = hmDevice.j();
            } else {
                str4 = null;
            }
            com.harman.log.f.a(f47888B, "connectAddress : " + str4);
            if (hmDevice != null) {
                str5 = hmDevice.q();
            } else {
                str5 = null;
            }
            com.harman.log.f.a(f47888B, "pid : " + str5);
            if (hmDevice != null) {
                bool = Boolean.valueOf(O0(hmDevice));
            } else {
                bool = null;
            }
            com.harman.log.f.a(f47888B, "support Auracast : " + bool);
            if (hmDevice != null && (hmDevice instanceof PartyBoxDevice)) {
                if (O0(hmDevice)) {
                    A0((PartyBoxDevice) hmDevice);
                    return;
                }
                PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
                if (partyBoxDevice.F1()) {
                    com.harman.log.f.a(f47888B, "The device is in Standby mode : " + partyBoxDevice.F1());
                    hmDevice.g0(true);
                    this.f47899j.put(hmDevice.g(), Boolean.TRUE);
                    for (D d4 : this.f47890a.a()) {
                        com.harman.log.f.a(f47888B, "onStandbyDeviceBLEConnected : " + hmDevice.j());
                        d4.c(hmDevice);
                    }
                    Handler handler = this.f47906q;
                    if (handler != null) {
                        handler.postDelayed(this.f47915z, 1000L);
                        return;
                    }
                    return;
                }
                A0(partyBoxDevice);
                return;
            }
            return;
        }
        com.harman.log.f.a(f47888B, "gattService is null!");
    }

    @SuppressLint({"MissingPermission"})
    private final void q0(String str, byte[] bArr, String str2) {
        int i4;
        boolean writeCharacteristic;
        String str3;
        int writeCharacteristic2;
        String str4;
        com.harman.log.f.g(f47888B, "bluetoothGattMap size is : " + this.f47892c.size());
        com.harman.log.f.d(f47888B, "doWriteCharacteristic() >>> try to send cmd to addr[" + str + "] content:" + str2);
        Iterator<Map.Entry<String, BluetoothGatt>> it = this.f47892c.entrySet().iterator();
        while (it.hasNext()) {
            com.harman.log.f.g(f47888B, "Gatt Map of device: " + ((Object) it.next().getKey()));
        }
        BluetoothGatt bluetoothGatt = this.f47892c.get(str);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && bluetoothGatt != null) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f47894e.get(str);
            int m4 = com.harman.sdk.utils.d.j().m();
            Integer num = this.f47897h.get(str);
            if (num != null) {
                i4 = num.intValue();
            } else {
                i4 = 0;
            }
            this.f47897h.put(str, Integer.valueOf(i4 + 1));
            if (bluetoothGattCharacteristic != null) {
                byte[] value = bluetoothGattCharacteristic.getValue();
                if (Build.VERSION.SDK_INT >= 33) {
                    writeCharacteristic2 = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, bluetoothGattCharacteristic.getWriteType());
                    if (str2 == null) {
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
                        str4 = com.harman.sdk.utils.g.h(copyOf, true);
                    } else {
                        str4 = str2;
                    }
                    com.harman.log.f.b(f47889C, str + ": new writeCharacteristic result : " + str4 + ", result = " + writeCharacteristic2);
                    if (writeCharacteristic2 == 0) {
                        writeCharacteristic = true;
                    } else {
                        writeCharacteristic = false;
                    }
                } else {
                    bluetoothGattCharacteristic.setValue(bArr);
                    writeCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
                }
                if (!writeCharacteristic) {
                    if (str2 == null) {
                        byte[] copyOf2 = Arrays.copyOf(bArr, bArr.length);
                        kotlin.jvm.internal.F.o(copyOf2, "copyOf(...)");
                        str3 = com.harman.sdk.utils.g.h(copyOf2, true);
                    } else {
                        str3 = str2;
                    }
                    com.harman.log.f.b(f47889C, str + ": writeCharacteristic failed : " + str3 + ", writeResult = " + writeCharacteristic);
                    bluetoothGattCharacteristic.setValue(value);
                    synchronized (this.f47901l) {
                        try {
                            if (!this.f47901l.isEmpty()) {
                                com.harman.sdk.a a4 = this.f47901l.get(0).a();
                                if (m4 > i4 && bArr.length > 1 && a4.h()) {
                                    X(str, bArr, str2);
                                } else {
                                    r0(str, str2);
                                }
                            } else {
                                r0(str, str2);
                                H0 h02 = H0.f51801a;
                            }
                        } finally {
                        }
                    }
                    return;
                }
                byte[] copyOf3 = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.F.o(copyOf3, "copyOf(...)");
                com.harman.log.f.a(f47889C, str + ": writeCharacteristic success : " + com.harman.sdk.utils.g.h(copyOf3, true));
                Handler handler = this.f47906q;
                if (handler != null) {
                    handler.removeCallbacks(this.f47913x);
                }
                this.f47897h.remove(str);
                synchronized (this.f47901l) {
                    try {
                        Handler handler2 = this.f47907r;
                        if (handler2 != null) {
                            handler2.removeCallbacks(this.f47912w);
                        }
                        com.harman.log.f.a(f47888B, "doWriteCharacteristic() >>> remove callback, remain sending[" + this.f47901l.size() + "]");
                        if (!this.f47901l.isEmpty()) {
                            com.harman.sdk.a a5 = this.f47901l.get(0).a();
                            if (a5.f()) {
                                com.harman.log.f.a(f47888B, "doWriteCharacteristic() isFinished >>> remove callback in 50ms ");
                                Handler handler3 = this.f47907r;
                                if (handler3 != null) {
                                    handler3.postDelayed(this.f47912w, a5.t());
                                }
                            } else {
                                com.harman.log.f.a(f47888B, "doWriteCharacteristic() >>> remove callback in " + com.harman.sdk.utils.d.j().d() + "ms");
                                Handler handler4 = this.f47907r;
                                if (handler4 != null) {
                                    handler4.postDelayed(this.f47912w, com.harman.sdk.utils.d.j().d());
                                }
                            }
                        }
                        H0 h03 = H0.f51801a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            r0(str, str2);
            return;
        }
        com.harman.log.f.g(f47888B, "BluetoothAdapter not initialized");
        com.harman.log.f.g(f47888B, "bluetoothAdapter : " + defaultAdapter);
        com.harman.log.f.g(f47888B, "bluetoothGatt : " + bluetoothGatt);
        r0(str, str2);
    }

    private final void r0(String str, String str2) {
        com.harman.sdk.a aVar;
        synchronized (this.f47901l) {
            try {
                if (!this.f47901l.isEmpty()) {
                    aVar = this.f47901l.getFirst().a();
                } else {
                    aVar = null;
                }
                this.f47901l.clear();
                H0 h02 = H0.f51801a;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.harman.log.f.g(f47888B, "doWriteCharacteristicFailed() >>> MAC[" + str + "] send command failed: " + str2);
        this.f47897h.remove(str);
        HmDevice hmDevice = this.f47893d.get(str);
        if (hmDevice != null) {
            Iterator<D> it = this.f47890a.a().iterator();
            while (it.hasNext()) {
                it.next().g(hmDevice, aVar, str2, 257);
            }
        }
        com.harman.sdk.concurrent.a.a().execute(new Runnable() { // from class: com.harman.sdk.impl.connect.x
            @Override // java.lang.Runnable
            public final void run() {
                C.s0(C.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(C this$0) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String t0(HmDevice hmDevice) {
        String str = "MAC[" + hmDevice.n() + "]BLE[" + hmDevice.g() + "]Connect[" + hmDevice.j() + "]";
        kotlin.jvm.internal.F.o(str, "toString(...)");
        return str;
    }

    private final C2034a w0() {
        synchronized (this.f47901l) {
            boolean isEmpty = this.f47901l.isEmpty();
            boolean isEmpty2 = this.f47900k.isEmpty();
            com.harman.log.f.d(f47888B, "getSendingCommand() >>> send.size[" + this.f47901l.size() + "] wait.size[" + this.f47900k.size() + "]");
            if (isEmpty && !isEmpty2) {
                C2034a first = this.f47900k.getFirst();
                com.harman.log.f.d(f47888B, "getSendingCommand() >>> " + t0(first.b()) + "mtu.flag[" + this.f47899j.get(first.b().j()) + "]");
                if (!TextUtils.isEmpty(first.b().j()) && kotlin.jvm.internal.F.g(this.f47899j.get(first.b().j()), Boolean.TRUE)) {
                    com.harman.log.f.d(f47888B, "getSendingCommand() >>> send cmd suc [" + com.harman.jbl.cd_biz_comm.utils.i.c(first.a().k()) + "]");
                    kotlin.collections.A.M0(this.f47900k);
                    this.f47901l.add(first);
                    return first;
                }
            } else {
                com.harman.log.f.g(f47888B, "GattControllerImpl.getSendingCommand() >>> no waiting cmd or had sending cmd");
            }
            H0 h02 = H0.f51801a;
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(C this$0) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        com.harman.log.f.a(f47888B, "handleGATTFailureDuringStandby so send DevInfo command");
        HmDevice hmDevice = this$0.f47893d.get(this$0.f47908s);
        for (D d4 : this$0.f47890a.a()) {
            if (hmDevice != null) {
                d4.e(hmDevice);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private final void y0(HmDevice hmDevice) {
        if (!com.harman.sdk.utils.d.I(hmDevice.q()) || !this.f47914y.containsKey(hmDevice)) {
            C2323l.f(C0.f52916E, C2322k0.e(), null, new e(hmDevice, this, null), 2, null);
        }
    }

    public final void M0(@l3.d String deviceAddress, @l3.d String secondaryAddress) {
        kotlin.jvm.internal.F.p(deviceAddress, "deviceAddress");
        kotlin.jvm.internal.F.p(secondaryAddress, "secondaryAddress");
        com.harman.log.f.d(f47888B, "setCurrentDeviceAddress() >>> update addr[" + deviceAddress + "] 2nd[" + secondaryAddress + "]");
        m0(secondaryAddress, null, false);
        this.f47908s = deviceAddress;
        this.f47899j.put(deviceAddress, Boolean.TRUE);
    }

    public final void N0(boolean z3) {
        this.f47909t = z3;
    }

    public final void Z(@l3.d HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        synchronized (this.f47901l) {
            LinkedList<C2034a> linkedList = this.f47900k;
            final b bVar = new b(device);
            linkedList.removeIf(new Predicate() { // from class: com.harman.sdk.impl.connect.r
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean a02;
                    a02 = C.a0(X2.l.this, obj);
                    return a02;
                }
            });
            LinkedList<C2034a> linkedList2 = this.f47901l;
            final c cVar = new c(device);
            linkedList2.removeIf(new Predicate() { // from class: com.harman.sdk.impl.connect.s
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean b02;
                    b02 = C.b0(X2.l.this, obj);
                    return b02;
                }
            });
            Handler handler = this.f47907r;
            if (handler != null) {
                handler.removeCallbacks(this.f47912w);
                H0 h02 = H0.f51801a;
            }
        }
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    public void b(@l3.d HmDevice device, @l3.d com.harman.sdk.a command) {
        kotlin.jvm.internal.F.p(device, "device");
        kotlin.jvm.internal.F.p(command, "command");
        synchronized (this.f47901l) {
            C2034a c2034a = new C2034a(device, command);
            this.f47900k.remove(c2034a);
            this.f47901l.remove(c2034a);
            com.harman.log.f.d(f47888B, "cancelCommand() >>> remove callback cmd[" + c2034a.a() + "] waiting queue");
            Handler handler = this.f47907r;
            if (handler != null) {
                handler.removeCallbacks(this.f47912w);
                H0 h02 = H0.f51801a;
            }
        }
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    public void c(@l3.d HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        String j4 = device.j();
        device.P().set(true);
        com.harman.log.f.d(f47888B, "GattControllerImpl.connect() >>> " + t0(device));
        if (TextUtils.isEmpty(j4)) {
            for (D d4 : this.f47890a.a()) {
                device.g0(false);
                device.P().set(false);
                com.harman.log.f.g(f47888B, "GattControllerImpl.connect() >>> isConnected[false] empty addr. " + t0(device));
                d4.b(device, 0, "Can't find BLE address in given HmDevice");
            }
            return;
        }
        if (this.f47891b.getAndSet(true)) {
            com.harman.log.f.a(f47888B, j4 + " isGattConnecting");
            for (D d5 : this.f47890a.a()) {
                device.g0(false);
                d5.b(device, 1, "Device is connecting");
            }
            return;
        }
        if (this.f47892c.containsKey(j4)) {
            device.g0(true);
            this.f47891b.set(false);
            Iterator<D> it = this.f47890a.a().iterator();
            while (it.hasNext()) {
                it.next().b(device, 2, "Device Connected");
            }
            com.harman.log.f.a(f47888B, j4 + " was connected already");
            return;
        }
        this.f47908s = j4;
        com.harman.log.f.d(f47888B, "connect() >>> update current addr[" + j4 + "]");
        this.f47893d.put(j4, device);
        j0(j4);
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    @SuppressLint({"MissingPermission"})
    public void d(@l3.d HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        com.harman.log.f.d(f47888B, "disconnect() >>> " + t0(device));
        device.P().set(false);
        if (!this.f47909t) {
            BluetoothGatt bluetoothGatt = this.f47892c.get(device.j());
            if (bluetoothGatt != null) {
                bluetoothGatt.disconnect();
                bluetoothGatt.close();
            }
            f0(device.j());
            com.harman.log.f.d(f47888B, "disconnect() >>> remove MTU flag for " + t0(device));
            this.f47892c.remove(device.j());
            this.f47891b.getAndSet(false);
            device.g0(false);
            this.f47899j.put(device.j(), Boolean.FALSE);
            P0(device);
            Iterator<D> it = this.f47890a.a().iterator();
            while (it.hasNext()) {
                it.next().b(device, 0, null);
            }
        }
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    @l3.e
    public BluetoothGatt e(@l3.d HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        return f(device.j());
    }

    @SuppressLint({"MissingPermission"})
    public final void e0() {
        for (Map.Entry<String, BluetoothGatt> entry : this.f47892c.entrySet()) {
            kotlin.jvm.internal.F.n(entry, "null cannot be cast to non-null type kotlin.collections.Map.Entry<*, *>");
            BluetoothGatt value = entry.getValue();
            kotlin.jvm.internal.F.n(value, "null cannot be cast to non-null type android.bluetooth.BluetoothGatt");
            BluetoothGatt bluetoothGatt = value;
            bluetoothGatt.disconnect();
            bluetoothGatt.close();
        }
        com.harman.log.f.d(f47888B, "GattControllerImpl.close() >>> ");
        this.f47908s = "";
        this.f47893d.clear();
        this.f47895f.clear();
        this.f47894e.clear();
        this.f47892c.clear();
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    @l3.e
    public BluetoothGatt f(@l3.d String macKey) {
        kotlin.jvm.internal.F.p(macKey, "macKey");
        return this.f47892c.get(macKey);
    }

    public final void f0(@l3.e String str) {
        if (str == null) {
            this.f47892c.clear();
            this.f47894e.clear();
            return;
        }
        if (this.f47892c.get(str) != null) {
            this.f47892c.remove(str);
        }
        if (this.f47894e.get(str) != null) {
            this.f47894e.remove(str);
        }
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    public void g(@l3.d D observer) {
        kotlin.jvm.internal.F.p(observer, "observer");
        this.f47890a.add(observer);
    }

    @SuppressLint({"MissingPermission"})
    public final void h0(@l3.d String address) {
        kotlin.jvm.internal.F.p(address, "address");
        BluetoothGatt bluetoothGatt = this.f47892c.get(address);
        if (BluetoothAdapter.getDefaultAdapter() != null && bluetoothGatt != null) {
            com.harman.log.f.a(f47888B, " BLE GATT disconnect() called for address=" + address);
            this.f47892c.remove(address);
            bluetoothGatt.disconnect();
            bluetoothGatt.close();
            f0(address);
            return;
        }
        com.harman.log.f.a(f47888B, " device already BLE disconnected");
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    public void i(@l3.d final HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        com.harman.log.f.a(f47888B, "requestMTUForStandbyDevice : " + device.g());
        if (this.f47908s.equals(device.g())) {
            if (device.F() == DeviceProtocol.PROTOCOL_GATT_BR_EDR) {
                this.f47899j.put(device.n(), Boolean.TRUE);
                return;
            }
            Handler handler = this.f47906q;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        C.G0(C.this, device);
                    }
                }, 500L);
            }
        }
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    public boolean j(@l3.d HmDevice device, @l3.d com.harman.sdk.a command) {
        kotlin.jvm.internal.F.p(device, "device");
        kotlin.jvm.internal.F.p(command, "command");
        E0(device, command);
        final C2034a w02 = w0();
        if (w02 != null) {
            if (w02.a() instanceof ReqPowerOffCommand) {
                com.harman.log.f.g(f47888B, "sendCommand power off command at once: " + w02.a());
                o0(w02);
            } else {
                com.harman.log.f.g(f47888B, "sendCommand 80ms later : " + command);
                Handler handler = this.f47906q;
                if (handler != null) {
                    handler.postDelayed(new Runnable() { // from class: com.harman.sdk.impl.connect.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            C.K0(C.this, w02);
                        }
                    }, 80L);
                }
            }
            return true;
        }
        com.harman.log.f.g(f47888B, "Command cached : " + command);
        return false;
    }

    @Override // com.harman.sdk.impl.connect.AbstractC2035b
    public void k(@l3.d D observer) {
        kotlin.jvm.internal.F.p(observer, "observer");
        this.f47890a.remove(observer);
    }

    @l3.d
    public final List<HmDevice> u0() {
        Map<String, HmDevice> map = this.f47893d;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, HmDevice>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public final boolean v0() {
        return this.f47909t;
    }

    public final void z0(@l3.d HmDevice device, @l3.d String newBLEAddress) {
        H0 h02;
        boolean K12;
        kotlin.jvm.internal.F.p(device, "device");
        kotlin.jvm.internal.F.p(newBLEAddress, "newBLEAddress");
        String str = this.f47911v.get(device.n());
        if (str != null) {
            K12 = kotlin.text.z.K1(str, newBLEAddress, true);
            if (!K12) {
                com.harman.log.f.d(f47888B, "onBLEAddressChanged() >>> device[" + device.n() + "].BLE updated from [" + str + "] to [" + newBLEAddress + "]");
            }
            h02 = H0.f51801a;
        } else {
            h02 = null;
        }
        if (h02 == null) {
            com.harman.log.f.d(f47888B, "onBLEAddressChanged() >>> device[" + device.n() + "].BLE updated from [" + device.g() + "] to [" + newBLEAddress + "]");
        }
        this.f47911v.put(device.n(), newBLEAddress);
    }
}
