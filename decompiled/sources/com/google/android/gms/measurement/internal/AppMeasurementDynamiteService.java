package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.AbstractBinderC1388f0;
import com.google.android.gms.internal.measurement.C1468p0;
import com.google.android.gms.internal.measurement.InterfaceC1420j0;
import com.google.android.gms.internal.measurement.InterfaceC1444m0;
import com.google.android.gms.internal.measurement.InterfaceC1460o0;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@DynamiteApi
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC1388f0 {

    /* renamed from: i, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    C1638f2 f30107i = null;

    /* renamed from: j, reason: collision with root package name */
    @androidx.annotation.B("listenerMap")
    private final Map f30108j = new androidx.collection.a();

    @EnsuresNonNull({"scion"})
    private final void A() {
        if (this.f30107i != null) {
        } else {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void G(InterfaceC1420j0 interfaceC1420j0, String str) {
        A();
        this.f30107i.L().H(interfaceC1420j0, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void beginAdUnitExposure(@androidx.annotation.N String str, long j4) throws RemoteException {
        A();
        this.f30107i.w().j(str, j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void clearConditionalUserProperty(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N Bundle bundle) throws RemoteException {
        A();
        this.f30107i.G().m(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void clearMeasurementEnabled(long j4) throws RemoteException {
        A();
        this.f30107i.G().G(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void endAdUnitExposure(@androidx.annotation.N String str, long j4) throws RemoteException {
        A();
        this.f30107i.w().k(str, j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void generateEventId(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        A();
        long p02 = this.f30107i.L().p0();
        A();
        this.f30107i.L().G(interfaceC1420j0, p02);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void getAppInstanceId(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        A();
        this.f30107i.a().x(new RunnableC1663j3(this, interfaceC1420j0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void getCachedAppInstanceId(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        A();
        G(interfaceC1420j0, this.f30107i.G().T());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void getConditionalUserProperties(String str, String str2, InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        A();
        this.f30107i.a().x(new V4(this, interfaceC1420j0, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void getCurrentScreenClass(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        A();
        G(interfaceC1420j0, this.f30107i.G().U());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void getCurrentScreenName(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        A();
        G(interfaceC1420j0, this.f30107i.G().V());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void getGmpAppId(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        String str;
        A();
        C1687n3 G3 = this.f30107i.G();
        if (G3.f31060a.M() != null) {
            str = G3.f31060a.M();
        } else {
            try {
                str = C1722t3.c(G3.f31060a.d(), "google_app_id", G3.f31060a.P());
            } catch (IllegalStateException e4) {
                G3.f31060a.b().p().b("getGoogleAppId failed with exception", e4);
                str = null;
            }
        }
        G(interfaceC1420j0, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void getMaxUserProperties(String str, InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        A();
        this.f30107i.G().O(str);
        A();
        this.f30107i.L().F(interfaceC1420j0, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void getTestFlag(InterfaceC1420j0 interfaceC1420j0, int i4) throws RemoteException {
        A();
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return;
                        }
                        this.f30107i.L().B(interfaceC1420j0, this.f30107i.G().P().booleanValue());
                        return;
                    }
                    this.f30107i.L().F(interfaceC1420j0, this.f30107i.G().R().intValue());
                    return;
                }
                U4 L3 = this.f30107i.L();
                double doubleValue = this.f30107i.G().Q().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    interfaceC1420j0.o(bundle);
                    return;
                } catch (RemoteException e4) {
                    L3.f31060a.b().u().b("Error returning double value to wrapper", e4);
                    return;
                }
            }
            this.f30107i.L().G(interfaceC1420j0, this.f30107i.G().S().longValue());
            return;
        }
        this.f30107i.L().H(interfaceC1420j0, this.f30107i.G().W());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void getUserProperties(String str, String str2, boolean z3, InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        A();
        this.f30107i.a().x(new RunnableC1676l4(this, interfaceC1420j0, str, str2, z3));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void initForTests(@androidx.annotation.N Map map) throws RemoteException {
        A();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void initialize(com.google.android.gms.dynamic.d dVar, C1468p0 c1468p0, long j4) throws RemoteException {
        C1638f2 c1638f2 = this.f30107i;
        if (c1638f2 == null) {
            this.f30107i = C1638f2.F((Context) C1285y.l((Context) com.google.android.gms.dynamic.f.G(dVar)), c1468p0, Long.valueOf(j4));
        } else {
            c1638f2.b().u().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void isDataCollectionEnabled(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        A();
        this.f30107i.a().x(new W4(this, interfaceC1420j0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void logEvent(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N Bundle bundle, boolean z3, boolean z4, long j4) throws RemoteException {
        A();
        this.f30107i.G().q(str, str2, bundle, z3, z4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1420j0 interfaceC1420j0, long j4) throws RemoteException {
        Bundle bundle2;
        A();
        C1285y.h(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", com.spotify.android.appremote.internal.l.f48821i);
        this.f30107i.a().x(new K3(this, interfaceC1420j0, new C1736w(str2, new C1724u(bundle), com.spotify.android.appremote.internal.l.f48821i, j4), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void logHealthData(int i4, @androidx.annotation.N String str, @androidx.annotation.N com.google.android.gms.dynamic.d dVar, @androidx.annotation.N com.google.android.gms.dynamic.d dVar2, @androidx.annotation.N com.google.android.gms.dynamic.d dVar3) throws RemoteException {
        Object G3;
        Object G4;
        A();
        Object obj = null;
        if (dVar == null) {
            G3 = null;
        } else {
            G3 = com.google.android.gms.dynamic.f.G(dVar);
        }
        if (dVar2 == null) {
            G4 = null;
        } else {
            G4 = com.google.android.gms.dynamic.f.G(dVar2);
        }
        if (dVar3 != null) {
            obj = com.google.android.gms.dynamic.f.G(dVar3);
        }
        this.f30107i.b().D(i4, true, false, str, G3, G4, obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void onActivityCreated(@androidx.annotation.N com.google.android.gms.dynamic.d dVar, @androidx.annotation.N Bundle bundle, long j4) throws RemoteException {
        A();
        C1681m3 c1681m3 = this.f30107i.G().f30873c;
        if (c1681m3 != null) {
            this.f30107i.G().n();
            c1681m3.onActivityCreated((Activity) com.google.android.gms.dynamic.f.G(dVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void onActivityDestroyed(@androidx.annotation.N com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException {
        A();
        C1681m3 c1681m3 = this.f30107i.G().f30873c;
        if (c1681m3 != null) {
            this.f30107i.G().n();
            c1681m3.onActivityDestroyed((Activity) com.google.android.gms.dynamic.f.G(dVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void onActivityPaused(@androidx.annotation.N com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException {
        A();
        C1681m3 c1681m3 = this.f30107i.G().f30873c;
        if (c1681m3 != null) {
            this.f30107i.G().n();
            c1681m3.onActivityPaused((Activity) com.google.android.gms.dynamic.f.G(dVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void onActivityResumed(@androidx.annotation.N com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException {
        A();
        C1681m3 c1681m3 = this.f30107i.G().f30873c;
        if (c1681m3 != null) {
            this.f30107i.G().n();
            c1681m3.onActivityResumed((Activity) com.google.android.gms.dynamic.f.G(dVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.d dVar, InterfaceC1420j0 interfaceC1420j0, long j4) throws RemoteException {
        A();
        C1681m3 c1681m3 = this.f30107i.G().f30873c;
        Bundle bundle = new Bundle();
        if (c1681m3 != null) {
            this.f30107i.G().n();
            c1681m3.onActivitySaveInstanceState((Activity) com.google.android.gms.dynamic.f.G(dVar), bundle);
        }
        try {
            interfaceC1420j0.o(bundle);
        } catch (RemoteException e4) {
            this.f30107i.b().u().b("Error returning bundle value to wrapper", e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void onActivityStarted(@androidx.annotation.N com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException {
        A();
        if (this.f30107i.G().f30873c != null) {
            this.f30107i.G().n();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void onActivityStopped(@androidx.annotation.N com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException {
        A();
        if (this.f30107i.G().f30873c != null) {
            this.f30107i.G().n();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void performAction(Bundle bundle, InterfaceC1420j0 interfaceC1420j0, long j4) throws RemoteException {
        A();
        interfaceC1420j0.o(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void registerOnMeasurementEventListener(InterfaceC1444m0 interfaceC1444m0) throws RemoteException {
        H2 h22;
        A();
        synchronized (this.f30108j) {
            try {
                h22 = (H2) this.f30108j.get(Integer.valueOf(interfaceC1444m0.zzd()));
                if (h22 == null) {
                    h22 = new Y4(this, interfaceC1444m0);
                    this.f30108j.put(Integer.valueOf(interfaceC1444m0.zzd()), h22);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f30107i.G().v(h22);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void resetAnalyticsData(long j4) throws RemoteException {
        A();
        this.f30107i.G().w(j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void setConditionalUserProperty(@androidx.annotation.N Bundle bundle, long j4) throws RemoteException {
        A();
        if (bundle == null) {
            this.f30107i.b().p().a("Conditional user property must not be null");
        } else {
            this.f30107i.G().C(bundle, j4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void setConsent(@androidx.annotation.N final Bundle bundle, final long j4) throws RemoteException {
        A();
        final C1687n3 G3 = this.f30107i.G();
        G3.f31060a.a().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.L2
            @Override // java.lang.Runnable
            public final void run() {
                C1687n3 c1687n3 = C1687n3.this;
                Bundle bundle2 = bundle;
                long j5 = j4;
                if (TextUtils.isEmpty(c1687n3.f31060a.z().r())) {
                    c1687n3.D(bundle2, 0, j5);
                } else {
                    c1687n3.f31060a.b().v().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void setConsentThirdParty(@androidx.annotation.N Bundle bundle, long j4) throws RemoteException {
        A();
        this.f30107i.G().D(bundle, -20, j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void setCurrentScreen(@androidx.annotation.N com.google.android.gms.dynamic.d dVar, @androidx.annotation.N String str, @androidx.annotation.N String str2, long j4) throws RemoteException {
        A();
        this.f30107i.I().B((Activity) com.google.android.gms.dynamic.f.G(dVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void setDataCollectionEnabled(boolean z3) throws RemoteException {
        A();
        C1687n3 G3 = this.f30107i.G();
        G3.g();
        G3.f31060a.a().x(new RunnableC1657i3(G3, z3));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void setDefaultEventParameters(@androidx.annotation.N Bundle bundle) {
        final Bundle bundle2;
        A();
        final C1687n3 G3 = this.f30107i.G();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        G3.f31060a.a().x(new Runnable() { // from class: com.google.android.gms.measurement.internal.M2
            @Override // java.lang.Runnable
            public final void run() {
                C1687n3.this.o(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void setEventInterceptor(InterfaceC1444m0 interfaceC1444m0) throws RemoteException {
        A();
        X4 x4 = new X4(this, interfaceC1444m0);
        if (this.f30107i.a().A()) {
            this.f30107i.G().F(x4);
        } else {
            this.f30107i.a().x(new M4(this, x4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void setInstanceIdProvider(InterfaceC1460o0 interfaceC1460o0) throws RemoteException {
        A();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void setMeasurementEnabled(boolean z3, long j4) throws RemoteException {
        A();
        this.f30107i.G().G(Boolean.valueOf(z3));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void setMinimumSessionDuration(long j4) throws RemoteException {
        A();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void setSessionTimeoutDuration(long j4) throws RemoteException {
        A();
        C1687n3 G3 = this.f30107i.G();
        G3.f31060a.a().x(new Q2(G3, j4));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void setUserId(@androidx.annotation.N final String str, long j4) throws RemoteException {
        A();
        final C1687n3 G3 = this.f30107i.G();
        if (str != null && TextUtils.isEmpty(str)) {
            G3.f31060a.b().u().a("User ID must be non-empty or null");
        } else {
            G3.f31060a.a().x(new Runnable() { // from class: com.google.android.gms.measurement.internal.N2
                @Override // java.lang.Runnable
                public final void run() {
                    C1687n3 c1687n3 = C1687n3.this;
                    if (c1687n3.f31060a.z().u(str)) {
                        c1687n3.f31060a.z().t();
                    }
                }
            });
            G3.J(null, "_id", str, true, j4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void setUserProperty(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N com.google.android.gms.dynamic.d dVar, boolean z3, long j4) throws RemoteException {
        A();
        this.f30107i.G().J(str, str2, com.google.android.gms.dynamic.f.G(dVar), z3, j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public void unregisterOnMeasurementEventListener(InterfaceC1444m0 interfaceC1444m0) throws RemoteException {
        H2 h22;
        A();
        synchronized (this.f30108j) {
            h22 = (H2) this.f30108j.remove(Integer.valueOf(interfaceC1444m0.zzd()));
        }
        if (h22 == null) {
            h22 = new Y4(this, interfaceC1444m0);
        }
        this.f30107i.G().L(h22);
    }
}
