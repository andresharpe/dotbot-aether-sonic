package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.analytics.connector.a;
import java.util.Locale;

/* loaded from: classes2.dex */
class f implements a.b {

    /* renamed from: c, reason: collision with root package name */
    static final String f34962c = "_o";

    /* renamed from: d, reason: collision with root package name */
    static final String f34963d = "name";

    /* renamed from: e, reason: collision with root package name */
    static final String f34964e = "params";

    /* renamed from: f, reason: collision with root package name */
    static final String f34965f = "clx";

    /* renamed from: a, reason: collision with root package name */
    private com.google.firebase.crashlytics.internal.analytics.b f34966a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.firebase.crashlytics.internal.analytics.b f34967b;

    private static void b(@P com.google.firebase.crashlytics.internal.analytics.b bVar, @N String str, @N Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.E(str, bundle);
    }

    private void c(@N String str, @N Bundle bundle) {
        com.google.firebase.crashlytics.internal.analytics.b bVar;
        if (f34965f.equals(bundle.getString(f34962c))) {
            bVar = this.f34966a;
        } else {
            bVar = this.f34967b;
        }
        b(bVar, str, bundle);
    }

    @Override // com.google.firebase.analytics.connector.a.b
    public void a(int i4, @P Bundle bundle) {
        String string;
        com.google.firebase.crashlytics.internal.f.f().k(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i4), bundle));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle(f34964e);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            c(string, bundle2);
        }
    }

    public void d(@P com.google.firebase.crashlytics.internal.analytics.b bVar) {
        this.f34967b = bVar;
    }

    public void e(@P com.google.firebase.crashlytics.internal.analytics.b bVar) {
        this.f34966a = bVar;
    }
}
