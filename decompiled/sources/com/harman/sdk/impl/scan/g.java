package com.harman.sdk.impl.scan;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.impl.scan.f;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nDiscoveryBaseImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscoveryBaseImpl.kt\ncom/harman/sdk/impl/scan/DiscoveryBaseImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* loaded from: classes2.dex */
public abstract class g implements f {

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    public static final String f48072Q = "DiscoveryBaseImpl";

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private BluetoothAdapter f48074E;

    /* renamed from: F, reason: collision with root package name */
    private long f48075F = 15000;

    /* renamed from: G, reason: collision with root package name */
    private long f48076G = 2000;

    /* renamed from: H, reason: collision with root package name */
    @l3.e
    private Context f48077H;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private Handler f48078I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private AtomicBoolean f48079J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private AtomicBoolean f48080K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private B2.b f48081L;

    /* renamed from: M, reason: collision with root package name */
    @l3.e
    private h f48082M;

    /* renamed from: N, reason: collision with root package name */
    @l3.e
    private Timer f48083N;

    /* renamed from: O, reason: collision with root package name */
    @l3.e
    private TimerTask f48084O;

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    public static final a f48071P = new a(null);

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    private static final com.harman.sdk.concurrent.c<HmDevice> f48073R = new com.harman.sdk.concurrent.c<>();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final com.harman.sdk.concurrent.c<HmDevice> a() {
            return g.f48073R;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            g.this.l();
        }
    }

    public g() {
        Handler handler;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            handler = new Handler(myLooper);
        } else {
            handler = null;
        }
        this.f48078I = handler;
        this.f48079J = new AtomicBoolean(false);
        this.f48080K = new AtomicBoolean(false);
        this.f48081L = new e();
    }

    private final void G() {
        com.harman.log.f.a(f48072Q, "BLE_LOG stopDeviceOfflineCheck");
        Timer timer = this.f48083N;
        if (timer != null) {
            timer.cancel();
        }
        this.f48083N = null;
        TimerTask timerTask = this.f48084O;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.f48084O = null;
    }

    protected final void A(@l3.e Handler handler) {
        this.f48078I = handler;
    }

    protected final void B(@l3.d B2.b bVar) {
        F.p(bVar, "<set-?>");
        this.f48081L = bVar;
    }

    protected final void C(long j4) {
        this.f48076G = j4;
    }

    protected final void D(long j4) {
        this.f48075F = j4;
    }

    protected final void E(@l3.d AtomicBoolean atomicBoolean) {
        F.p(atomicBoolean, "<set-?>");
        this.f48079J = atomicBoolean;
    }

    public final void F() {
        com.harman.log.f.a(f48072Q, "BLE_LOG startDeviceOfflineCheck refresh interval : " + com.harman.sdk.utils.d.j().h());
        G();
        this.f48084O = new b();
        Timer timer = new Timer();
        this.f48083N = timer;
        timer.schedule(this.f48084O, com.harman.sdk.utils.d.j().h(), com.harman.sdk.utils.d.j().h());
    }

    @Override // com.harman.sdk.impl.scan.f
    public void a(boolean z3) {
        f.a.b(this, z3);
    }

    @Override // com.harman.sdk.impl.scan.f
    public void c(@l3.d Context context) {
        F.p(context, "context");
        this.f48077H = context.getApplicationContext();
        v();
    }

    @Override // com.harman.sdk.impl.scan.f
    public void e() {
        f.a.a(this);
    }

    @Override // com.harman.sdk.impl.scan.f
    public void f(@l3.e B2.b bVar) {
        if (bVar == null) {
            bVar = new e();
        }
        this.f48081L = bVar;
        i();
        this.f48075F = com.harman.sdk.utils.d.j().c() * 1000;
        this.f48076G = com.harman.sdk.utils.d.j().b() * 1000;
        this.f48079J.set(true);
        F();
    }

    @Override // com.harman.sdk.impl.scan.f
    public void g(@l3.e h hVar) {
        this.f48082M = hVar;
    }

    @Override // com.harman.sdk.impl.scan.f
    public void i() {
        com.harman.log.f.a(f48072Q, " BLE_LOG stopScan");
        this.f48079J.set(false);
        G();
    }

    protected final void l() {
        com.harman.log.f.a(f48072Q, "BLE_LOG doValidateDevice");
        long currentTimeMillis = System.currentTimeMillis();
        for (HmDevice hmDevice : f48073R.a()) {
            long z3 = currentTimeMillis - hmDevice.z();
            com.harman.log.f.a(f48072Q, "MAC[" + hmDevice.n() + "] BLE.connect[" + hmDevice.R() + "] Adv.interval[" + z3 + "]ms");
            if (!hmDevice.R() && z3 > com.harman.sdk.utils.d.j().h()) {
                com.harman.log.f.a(f48072Q, "BLE_LOG doValidateDevice onDeviceOffline[" + hmDevice.n() + "] device = " + hmDevice);
                hmDevice.V(false);
                hmDevice.g0(false);
                f48073R.remove(hmDevice);
                h hVar = this.f48082M;
                if (hVar != null) {
                    F.m(hmDevice);
                    hVar.d(hmDevice);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final AtomicBoolean m() {
        return this.f48080K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.e
    public final BluetoothAdapter n() {
        return this.f48074E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.e
    public final Context o() {
        return this.f48077H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.e
    public final h p() {
        return this.f48082M;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.e
    public final Handler q() {
        return this.f48078I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final B2.b r() {
        return this.f48081L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long s() {
        return this.f48076G;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long t() {
        return this.f48075F;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final AtomicBoolean u() {
        return this.f48079J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v() {
        boolean z3;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f48074E = defaultAdapter;
        AtomicBoolean atomicBoolean = this.f48080K;
        if (defaultAdapter != null) {
            z3 = defaultAdapter.isEnabled();
        } else {
            z3 = false;
        }
        atomicBoolean.set(z3);
    }

    protected final void w(@l3.d AtomicBoolean atomicBoolean) {
        F.p(atomicBoolean, "<set-?>");
        this.f48080K = atomicBoolean;
    }

    protected final void x(@l3.e BluetoothAdapter bluetoothAdapter) {
        this.f48074E = bluetoothAdapter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(@l3.e Context context) {
        this.f48077H = context;
    }

    protected final void z(@l3.e h hVar) {
        this.f48082M = hVar;
    }
}
