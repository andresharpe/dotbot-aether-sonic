package com.harman.sdk;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import androidx.core.content.C0669d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.impl.j;
import com.harman.sdk.impl.k;
import com.harman.sdk.impl.scan.i;
import com.harman.sdk.setting.AppConfig;
import com.harman.sdk.setting.ProductConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.F;
import kotlin.text.z;
import l3.d;
import l3.e;
import z2.f;
import z2.g;
import z2.h;
import z2.l;
import z2.m;
import z2.n;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    @e
    private static Context f47609b;

    /* renamed from: c, reason: collision with root package name */
    @e
    private static com.harman.sdk.impl.c f47610c;

    /* renamed from: d, reason: collision with root package name */
    @e
    private static j f47611d;

    /* renamed from: e, reason: collision with root package name */
    @e
    private static k f47612e;

    /* renamed from: f, reason: collision with root package name */
    @e
    private static B2.c f47613f;

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final b f47608a = new b();

    /* renamed from: g, reason: collision with root package name */
    @d
    private static final AtomicBoolean f47614g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    @d
    private static final a f47615h = new a();

    /* loaded from: classes2.dex */
    public static final class a implements i {
        a() {
        }

        @Override // com.harman.sdk.impl.scan.i
        public void a(@d HmDevice device, @d String newBLEAddress) {
            F.p(device, "device");
            F.p(newBLEAddress, "newBLEAddress");
            com.harman.sdk.impl.connect.i c4 = b.f47608a.c(device);
            if (c4 != null) {
                c4.a(device, newBLEAddress);
            }
        }
    }

    private b() {
    }

    public static /* synthetic */ com.harman.sdk.impl.connect.i d(b bVar, HmDevice hmDevice, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            hmDevice = null;
        }
        return bVar.c(hmDevice);
    }

    private final boolean t(HmDevice hmDevice) {
        return com.harman.sdk.utils.d.g0(hmDevice);
    }

    @e
    public final z2.b a(@d HmDevice device) {
        com.harman.sdk.impl.c cVar;
        F.p(device, "device");
        if (!f47614g.get() || !t(device) || (cVar = f47610c) == null) {
            return null;
        }
        return cVar.e();
    }

    @e
    public final f b(@d HmDevice device) {
        com.harman.sdk.impl.c cVar;
        F.p(device, "device");
        if (!f47614g.get() || !t(device) || (cVar = f47610c) == null) {
            return null;
        }
        return cVar.j();
    }

    @e
    public final com.harman.sdk.impl.connect.i c(@e HmDevice hmDevice) {
        com.harman.sdk.impl.c cVar;
        if (!f47614g.get()) {
            return null;
        }
        if ((hmDevice != null && !t(hmDevice)) || (cVar = f47610c) == null) {
            return null;
        }
        return cVar.g();
    }

    @e
    public final z2.e e(@d HmDevice device) {
        com.harman.sdk.impl.c cVar;
        F.p(device, "device");
        if (!f47614g.get() || !t(device) || (cVar = f47610c) == null) {
            return null;
        }
        return cVar.h();
    }

    @e
    public final z2.c f(@d HmDevice device) {
        com.harman.sdk.impl.c cVar;
        F.p(device, "device");
        if (!f47614g.get() || !t(device) || (cVar = f47610c) == null) {
            return null;
        }
        return cVar.i();
    }

    @e
    public final h g(@d HmDevice device) {
        com.harman.sdk.impl.c cVar;
        F.p(device, "device");
        if (!f47614g.get() || !t(device) || (cVar = f47610c) == null) {
            return null;
        }
        return cVar.k();
    }

    @e
    public final z2.i h(@d HmDevice device) {
        com.harman.sdk.impl.c cVar;
        F.p(device, "device");
        if (!f47614g.get() || !t(device) || (cVar = f47610c) == null) {
            return null;
        }
        return cVar.l();
    }

    @e
    public final z2.j i(@d HmDevice device) {
        com.harman.sdk.impl.c cVar;
        F.p(device, "device");
        if (!f47614g.get() || !t(device) || (cVar = f47610c) == null) {
            return null;
        }
        return cVar.n();
    }

    @e
    public final l j(@d HmDevice device) {
        com.harman.sdk.impl.c cVar;
        F.p(device, "device");
        if (!f47614g.get() || !t(device) || (cVar = f47610c) == null) {
            return null;
        }
        return cVar.o();
    }

    @e
    public final B2.c k() {
        if (f47614g.get()) {
            return f47613f;
        }
        return null;
    }

    @e
    public final m l(@d HmDevice device) {
        com.harman.sdk.impl.c cVar;
        F.p(device, "device");
        if (!f47614g.get() || !t(device) || (cVar = f47610c) == null) {
            return null;
        }
        return cVar.p();
    }

    @e
    public final g m(@d HmDevice device) {
        com.harman.sdk.impl.c cVar;
        F.p(device, "device");
        if (!f47614g.get() || !t(device) || (cVar = f47610c) == null) {
            return null;
        }
        return cVar.q();
    }

    @e
    public final n n(@d HmDevice device) {
        com.harman.sdk.impl.c cVar;
        F.p(device, "device");
        if (!f47614g.get() || !t(device) || (cVar = f47610c) == null) {
            return null;
        }
        return cVar.r();
    }

    public final void o(@d Context context, @d ProductConfig productConfig) {
        F.p(context, "context");
        F.p(productConfig, "productConfig");
        if (!f47614g.getAndSet(true)) {
            com.harman.sdk.impl.scan.l lVar = new com.harman.sdk.impl.scan.l(context);
            f47613f = lVar;
            f47611d = new j(context);
            f47612e = new k(context);
            f47609b = context.getApplicationContext();
            com.harman.sdk.impl.c cVar = new com.harman.sdk.impl.c(context, lVar);
            f47610c = cVar;
            cVar.D(productConfig);
            lVar.p(f47615h);
        }
    }

    public final boolean p() {
        if (BluetoothAdapter.getDefaultAdapter() != null && BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        Context context = f47609b;
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        Object systemService = context.getSystemService(FirebaseAnalytics.b.f34811s);
        F.n(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
            return false;
        }
        return true;
    }

    public final boolean r(@d Context context) {
        boolean s22;
        F.p(context, "context");
        Object systemService = context.getSystemService(FirebaseAnalytics.b.f34811s);
        F.n(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        String MODEL = Build.MODEL;
        F.o(MODEL, "MODEL");
        s22 = z.s2(MODEL, "vivo", false, 2, null);
        if (s22) {
            return locationManager.isProviderEnabled("gps");
        }
        if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
            return false;
        }
        return true;
    }

    public final boolean s() {
        Context context = f47609b;
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            if (C0669d.a(context, "android.permission.BLUETOOTH_SCAN") != 0 || C0669d.a(context, "android.permission.BLUETOOTH_CONNECT") != 0) {
                return false;
            }
        } else if (C0669d.a(context, "android.permission.ACCESS_COARSE_LOCATION") != 0 || C0669d.a(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return false;
        }
        return true;
    }

    public final void u(@d c observer) {
        F.p(observer, "observer");
        com.harman.sdk.impl.c cVar = f47610c;
        if (cVar != null) {
            cVar.s(observer);
        }
        j jVar = f47611d;
        if (jVar != null) {
            jVar.c(observer);
        }
        k kVar = f47612e;
        if (kVar != null) {
            kVar.b(observer);
        }
    }

    public final void v(@e AppConfig appConfig) {
        com.harman.sdk.impl.c cVar;
        if (f47614g.get() && (cVar = f47610c) != null) {
            cVar.t(appConfig);
        }
    }

    public final void w(@d c observer) {
        F.p(observer, "observer");
        com.harman.sdk.impl.c cVar = f47610c;
        if (cVar != null) {
            cVar.F(observer);
        }
        j jVar = f47611d;
        if (jVar != null) {
            jVar.d(observer);
        }
        k kVar = f47612e;
        if (kVar != null) {
            kVar.c(observer);
        }
    }
}
