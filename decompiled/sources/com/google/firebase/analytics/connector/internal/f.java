package com.google.firebase.analytics.connector.internal;

import N0.a;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.connector.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f implements a.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f34857a;

    public f(g gVar) {
        this.f34857a = gVar;
    }

    @Override // N0.a.c, com.google.android.gms.measurement.internal.H2
    public final void a(String str, String str2, Bundle bundle, long j4) {
        a.b bVar;
        if (str != null && !str.equals(AppMeasurement.f30086b) && c.k(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(a.C0015a.f1688b, str2);
            bundle2.putLong("timestampInMillis", j4);
            bundle2.putBundle("params", bundle);
            bVar = this.f34857a.f34858a;
            bVar.a(3, bundle2);
        }
    }
}
