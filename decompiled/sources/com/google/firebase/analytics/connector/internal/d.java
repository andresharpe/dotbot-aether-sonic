package com.google.firebase.analytics.connector.internal;

import N0.a;
import android.os.Bundle;
import com.google.firebase.analytics.connector.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d implements a.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f34852a;

    public d(e eVar) {
        this.f34852a = eVar;
    }

    @Override // N0.a.c, com.google.android.gms.measurement.internal.H2
    public final void a(String str, String str2, Bundle bundle, long j4) {
        a.b bVar;
        if (!this.f34852a.f34853a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("events", c.c(str2));
        bVar = this.f34852a.f34854b;
        bVar.a(2, bundle2);
    }
}
