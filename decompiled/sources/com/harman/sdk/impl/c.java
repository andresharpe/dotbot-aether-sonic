package com.harman.sdk.impl;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.setting.AppConfig;
import com.harman.sdk.setting.ProductConfig;
import java.util.Collection;
import java.util.Iterator;
import kotlin.H0;
import kotlin.jvm.internal.F;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final B2.c f47868a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private z2.e f47869b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private z2.m f47870c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private z2.b f47871d;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private z2.h f47872e;

    /* renamed from: f, reason: collision with root package name */
    @l3.e
    private z2.f f47873f;

    /* renamed from: g, reason: collision with root package name */
    @l3.e
    private z2.l f47874g;

    /* renamed from: h, reason: collision with root package name */
    @l3.e
    private z2.j f47875h;

    /* renamed from: i, reason: collision with root package name */
    @l3.e
    private z2.c f47876i;

    /* renamed from: j, reason: collision with root package name */
    @l3.e
    private A2.b f47877j;

    /* renamed from: k, reason: collision with root package name */
    @l3.e
    private com.harman.sdk.impl.connect.i f47878k;

    /* renamed from: l, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.concurrent.c<com.harman.sdk.c> f47879l;

    /* renamed from: m, reason: collision with root package name */
    @l3.e
    private z2.i f47880m;

    /* renamed from: n, reason: collision with root package name */
    @l3.e
    private z2.n f47881n;

    /* renamed from: o, reason: collision with root package name */
    @l3.e
    private z2.g f47882o;

    /* renamed from: p, reason: collision with root package name */
    @l3.d
    private final BroadcastReceiver f47883p;

    /* loaded from: classes2.dex */
    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@l3.d Context context, @l3.d Intent intent) {
            F.p(context, "context");
            F.p(intent, "intent");
            String action = intent.getAction();
            if (F.g("android.bluetooth.adapter.action.STATE_CHANGED", action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                if (intExtra != 10) {
                    if (intExtra == 12) {
                        Iterator it = c.this.f47879l.a().iterator();
                        while (it.hasNext()) {
                            ((com.harman.sdk.c) it.next()).onBtEnabled(true);
                        }
                        return;
                    }
                    return;
                }
                c.this.f47868a.l();
                Iterator it2 = c.this.f47879l.a().iterator();
                while (it2.hasNext()) {
                    ((com.harman.sdk.c) it2.next()).onBtEnabled(false);
                }
                return;
            }
            if (F.g("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", action)) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice != null && bluetoothDevice.getAddress() != null) {
                    c cVar = c.this;
                    String address = bluetoothDevice.getAddress();
                    F.o(address, "getAddress(...)");
                    HmDevice f4 = cVar.f(address);
                    if (intExtra2 != 0) {
                        if (intExtra2 == 2) {
                            if (f4 != null) {
                                f4.V(true);
                            }
                            Iterator it3 = c.this.f47879l.a().iterator();
                            while (it3.hasNext()) {
                                ((com.harman.sdk.c) it3.next()).onA2DPConnected(bluetoothDevice.getAddress(), true);
                            }
                            return;
                        }
                        return;
                    }
                    if (f4 != null) {
                        f4.V(false);
                        com.harman.log.f.a("BLE_LOG", "disconnect the device : " + f4.n());
                        com.harman.sdk.impl.connect.i iVar = c.this.f47878k;
                        if (iVar != null) {
                            iVar.k(f4);
                        }
                    }
                    Iterator it4 = c.this.f47879l.a().iterator();
                    while (it4.hasNext()) {
                        ((com.harman.sdk.c) it4.next()).onA2DPConnected(bluetoothDevice.getAddress(), false);
                    }
                }
            }
        }
    }

    public c(@l3.d Context context, @l3.d B2.c scanManager) {
        com.harman.sdk.impl.connect.i iVar;
        com.harman.sdk.impl.connect.i iVar2;
        com.harman.sdk.impl.connect.i iVar3;
        com.harman.sdk.impl.connect.i iVar4;
        com.harman.sdk.impl.connect.i iVar5;
        com.harman.sdk.impl.connect.i iVar6;
        com.harman.sdk.impl.connect.i iVar7;
        com.harman.sdk.impl.connect.i iVar8;
        com.harman.sdk.impl.connect.i iVar9;
        com.harman.sdk.impl.connect.i iVar10;
        com.harman.sdk.impl.connect.i iVar11;
        F.p(context, "context");
        F.p(scanManager, "scanManager");
        this.f47868a = scanManager;
        this.f47879l = new com.harman.sdk.concurrent.c<>();
        a aVar = new a();
        this.f47883p = aVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(aVar, intentFilter, 2);
        } else {
            context.registerReceiver(aVar, intentFilter);
        }
        if (this.f47878k == null) {
            synchronized (c.class) {
                try {
                    if (this.f47878k == null) {
                        this.f47878k = new com.harman.sdk.impl.connect.i(context);
                    }
                    H0 h02 = H0.f51801a;
                } finally {
                }
            }
        }
        if (this.f47869b == null) {
            synchronized (c.class) {
                try {
                    if (this.f47869b == null && (iVar11 = this.f47878k) != null) {
                        this.f47869b = new e(context, iVar11);
                    }
                    H0 h03 = H0.f51801a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.f47872e == null) {
            synchronized (c.class) {
                try {
                    if (this.f47872e == null && (iVar10 = this.f47878k) != null) {
                        this.f47872e = new h(context, iVar10);
                    }
                    H0 h04 = H0.f51801a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (this.f47873f == null) {
            synchronized (c.class) {
                try {
                    if (this.f47873f == null && (iVar9 = this.f47878k) != null) {
                        this.f47873f = new f(context, iVar9);
                    }
                    H0 h05 = H0.f51801a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (this.f47874g == null) {
            synchronized (c.class) {
                try {
                    if (this.f47874g == null && (iVar8 = this.f47878k) != null) {
                        this.f47874g = new m(iVar8);
                    }
                    H0 h06 = H0.f51801a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        if (this.f47870c == null) {
            synchronized (c.class) {
                try {
                    if (this.f47870c == null && (iVar7 = this.f47878k) != null) {
                        this.f47870c = new n(context, iVar7);
                    }
                    H0 h07 = H0.f51801a;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
        if (this.f47871d == null) {
            synchronized (c.class) {
                try {
                    if (this.f47871d == null && (iVar6 = this.f47878k) != null) {
                        this.f47871d = new com.harman.sdk.impl.a(context, iVar6);
                    }
                    H0 h08 = H0.f51801a;
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }
        if (this.f47880m == null) {
            synchronized (c.class) {
                try {
                    if (this.f47880m == null && (iVar5 = this.f47878k) != null) {
                        this.f47880m = new i(context, iVar5);
                    }
                    H0 h09 = H0.f51801a;
                } catch (Throwable th7) {
                    throw th7;
                }
            }
        }
        if (this.f47881n == null) {
            synchronized (o.class) {
                try {
                    if (this.f47881n == null && (iVar4 = this.f47878k) != null) {
                        this.f47881n = new o(iVar4);
                    }
                    H0 h010 = H0.f51801a;
                } catch (Throwable th8) {
                    throw th8;
                }
            }
        }
        if (this.f47875h == null) {
            synchronized (l.class) {
                try {
                    if (this.f47875h == null && (iVar3 = this.f47878k) != null) {
                        this.f47875h = new l(context, iVar3);
                    }
                    H0 h011 = H0.f51801a;
                } catch (Throwable th9) {
                    throw th9;
                }
            }
        }
        if (this.f47876i == null) {
            synchronized (c.class) {
                try {
                    if (this.f47876i == null && (iVar2 = this.f47878k) != null) {
                        this.f47876i = new d(context, iVar2);
                    }
                    H0 h012 = H0.f51801a;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
        if (this.f47882o == null) {
            synchronized (c.class) {
                try {
                    if (this.f47882o == null && (iVar = this.f47878k) != null) {
                        this.f47882o = new g(iVar);
                    }
                    H0 h013 = H0.f51801a;
                } catch (Throwable th11) {
                    throw th11;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HmDevice f(String str) {
        boolean K12;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Collection<HmDevice> i4 = this.f47868a.i();
        if (i4.isEmpty()) {
            return null;
        }
        for (HmDevice hmDevice : i4) {
            if (!TextUtils.isEmpty(hmDevice.n())) {
                K12 = z.K1(str, hmDevice.n(), true);
                if (K12) {
                    return hmDevice;
                }
            }
        }
        return null;
    }

    public final void A(@l3.e z2.l lVar) {
        this.f47874g = lVar;
    }

    public final void B(@l3.e z2.m mVar) {
        this.f47870c = mVar;
    }

    public final void C(@l3.e z2.g gVar) {
        this.f47882o = gVar;
    }

    public final void D(@l3.e ProductConfig productConfig) {
        com.harman.sdk.utils.d.r0(productConfig);
    }

    public final void E(@l3.e z2.n nVar) {
        this.f47881n = nVar;
    }

    public final void F(@l3.d com.harman.sdk.c observer) {
        F.p(observer, "observer");
        this.f47879l.remove(observer);
    }

    @l3.e
    public final z2.b e() {
        return this.f47871d;
    }

    @l3.e
    public final com.harman.sdk.impl.connect.i g() {
        return this.f47878k;
    }

    @l3.e
    public final z2.e h() {
        return this.f47869b;
    }

    @l3.e
    public final z2.c i() {
        return this.f47876i;
    }

    @l3.e
    public final z2.f j() {
        return this.f47873f;
    }

    @l3.e
    public final z2.h k() {
        return this.f47872e;
    }

    @l3.e
    public final z2.i l() {
        return this.f47880m;
    }

    @l3.e
    public final A2.b m() {
        return this.f47877j;
    }

    @l3.e
    public final z2.j n() {
        return this.f47875h;
    }

    @l3.e
    public final z2.l o() {
        return this.f47874g;
    }

    @l3.e
    public final z2.m p() {
        return this.f47870c;
    }

    @l3.e
    public final z2.g q() {
        return this.f47882o;
    }

    @l3.e
    public final z2.n r() {
        return this.f47881n;
    }

    public final void s(@l3.d com.harman.sdk.c observer) {
        F.p(observer, "observer");
        this.f47879l.add(observer);
    }

    public final void t(@l3.e AppConfig appConfig) {
        if (appConfig != null) {
            com.harman.sdk.utils.d.p0(appConfig);
        }
    }

    public final void u(@l3.e z2.b bVar) {
        this.f47871d = bVar;
    }

    public final void v(@l3.e z2.c cVar) {
        this.f47876i = cVar;
    }

    public final void w(@l3.e z2.f fVar) {
        this.f47873f = fVar;
    }

    public final void x(@l3.e z2.h hVar) {
        this.f47872e = hVar;
    }

    public final void y(@l3.e z2.i iVar) {
        this.f47880m = iVar;
    }

    public final void z(@l3.e z2.j jVar) {
        this.f47875h = jVar;
    }
}
