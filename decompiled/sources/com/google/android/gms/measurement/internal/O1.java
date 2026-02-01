package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes2.dex */
public final class O1 {

    /* renamed from: a, reason: collision with root package name */
    private final N1 f30353a;

    public O1(N1 n12) {
        C1285y.l(n12);
        this.f30353a = n12;
    }

    @androidx.annotation.K
    public final void a(Context context, Intent intent) {
        C1638f2 F3 = C1638f2.F(context, null, null);
        C1720t1 b4 = F3.b();
        if (intent == null) {
            b4.u().a("Receiver called with null intent");
            return;
        }
        F3.zzaw();
        String action = intent.getAction();
        b4.t().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            b4.t().a("Starting wakeful intent.");
            this.f30353a.a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            b4.u().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
