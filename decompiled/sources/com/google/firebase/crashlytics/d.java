package com.google.firebase.crashlytics;

import C1.a;
import android.os.Bundle;
import androidx.annotation.B;
import androidx.annotation.N;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.connector.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import n1.InterfaceC2373a;
import o1.C2381c;
import o1.InterfaceC2379a;
import o1.InterfaceC2380b;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final C1.a<com.google.firebase.analytics.connector.a> f34952a;

    /* renamed from: b, reason: collision with root package name */
    private volatile com.google.firebase.crashlytics.internal.analytics.a f34953b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InterfaceC2380b f34954c;

    /* renamed from: d, reason: collision with root package name */
    @B("this")
    private final List<InterfaceC2379a> f34955d;

    public d(C1.a<com.google.firebase.analytics.connector.a> aVar) {
        this(aVar, new C2381c(), new com.google.firebase.crashlytics.internal.analytics.f());
    }

    private void f() {
        this.f34952a.a(new a.InterfaceC0003a() { // from class: com.google.firebase.crashlytics.c
            @Override // C1.a.InterfaceC0003a
            public final void a(C1.b bVar) {
                d.this.i(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f34953b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(InterfaceC2379a interfaceC2379a) {
        synchronized (this) {
            try {
                if (this.f34954c instanceof C2381c) {
                    this.f34955d.add(interfaceC2379a);
                }
                this.f34954c.a(interfaceC2379a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(C1.b bVar) {
        com.google.firebase.crashlytics.internal.f.f().b("AnalyticsConnector now available.");
        com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) bVar.get();
        com.google.firebase.crashlytics.internal.analytics.e eVar = new com.google.firebase.crashlytics.internal.analytics.e(aVar);
        f fVar = new f();
        if (j(aVar, fVar) != null) {
            com.google.firebase.crashlytics.internal.f.f().b("Registered Firebase Analytics listener.");
            com.google.firebase.crashlytics.internal.analytics.d dVar = new com.google.firebase.crashlytics.internal.analytics.d();
            com.google.firebase.crashlytics.internal.analytics.c cVar = new com.google.firebase.crashlytics.internal.analytics.c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                try {
                    Iterator<InterfaceC2379a> it = this.f34955d.iterator();
                    while (it.hasNext()) {
                        dVar.a(it.next());
                    }
                    fVar.d(dVar);
                    fVar.e(cVar);
                    this.f34954c = dVar;
                    this.f34953b = cVar;
                } finally {
                }
            }
            return;
        }
        com.google.firebase.crashlytics.internal.f.f().m("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    @InterfaceC2373a
    private static a.InterfaceC0309a j(@N com.google.firebase.analytics.connector.a aVar, @N f fVar) {
        a.InterfaceC0309a g4 = aVar.g("clx", fVar);
        if (g4 == null) {
            com.google.firebase.crashlytics.internal.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            g4 = aVar.g(AppMeasurement.f30086b, fVar);
            if (g4 != null) {
                com.google.firebase.crashlytics.internal.f.f().m("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return g4;
    }

    public com.google.firebase.crashlytics.internal.analytics.a d() {
        return new com.google.firebase.crashlytics.internal.analytics.a() { // from class: com.google.firebase.crashlytics.b
            @Override // com.google.firebase.crashlytics.internal.analytics.a
            public final void a(String str, Bundle bundle) {
                d.this.g(str, bundle);
            }
        };
    }

    public InterfaceC2380b e() {
        return new InterfaceC2380b() { // from class: com.google.firebase.crashlytics.a
            @Override // o1.InterfaceC2380b
            public final void a(InterfaceC2379a interfaceC2379a) {
                d.this.h(interfaceC2379a);
            }
        };
    }

    public d(C1.a<com.google.firebase.analytics.connector.a> aVar, @N InterfaceC2380b interfaceC2380b, @N com.google.firebase.crashlytics.internal.analytics.a aVar2) {
        this.f34952a = aVar;
        this.f34954c = interfaceC2380b;
        this.f34955d = new ArrayList();
        this.f34953b = aVar2;
        f();
    }
}
