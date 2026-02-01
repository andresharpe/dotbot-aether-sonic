package com.harman.sdk.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Build;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.jvm.internal.F;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.concurrent.c<com.harman.sdk.c> f48007a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final LocationManager f48008b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final BroadcastReceiver f48009c;

    /* loaded from: classes2.dex */
    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@l3.d Context context, @l3.d Intent intent) {
            boolean K12;
            F.p(context, "context");
            F.p(intent, "intent");
            K12 = z.K1("android.location.PROVIDERS_CHANGED", intent.getAction(), true);
            if (K12) {
                if (!j.this.f48008b.isProviderEnabled("gps") && !j.this.f48008b.isProviderEnabled("network")) {
                    Iterator it = j.this.f48007a.a().iterator();
                    while (it.hasNext()) {
                        ((com.harman.sdk.c) it.next()).onLocationEnabled(false);
                    }
                } else {
                    Iterator it2 = j.this.f48007a.a().iterator();
                    while (it2.hasNext()) {
                        ((com.harman.sdk.c) it2.next()).onLocationEnabled(true);
                    }
                }
            }
        }
    }

    public j(@l3.d Context context) {
        F.p(context, "context");
        this.f48007a = new com.harman.sdk.concurrent.c<>();
        Object systemService = context.getSystemService(FirebaseAnalytics.b.f34811s);
        F.n(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.f48008b = (LocationManager) systemService;
        a aVar = new a();
        this.f48009c = aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(aVar, new IntentFilter("android.location.PROVIDERS_CHANGED"), 2);
        } else {
            context.registerReceiver(aVar, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        }
    }

    public final void c(@l3.d com.harman.sdk.c observer) {
        F.p(observer, "observer");
        this.f48007a.add(observer);
    }

    public final void d(@l3.e com.harman.sdk.c cVar) {
        this.f48007a.remove(cVar);
    }
}
