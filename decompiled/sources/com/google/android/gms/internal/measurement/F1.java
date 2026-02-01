package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    final C1546z f29317a;

    /* renamed from: b, reason: collision with root package name */
    final C1398g2 f29318b;

    /* renamed from: c, reason: collision with root package name */
    final C1398g2 f29319c;

    /* renamed from: d, reason: collision with root package name */
    final I3 f29320d;

    public F1() {
        C1546z c1546z = new C1546z();
        this.f29317a = c1546z;
        C1398g2 c1398g2 = new C1398g2(null, c1546z);
        this.f29319c = c1398g2;
        this.f29318b = c1398g2.a();
        I3 i32 = new I3();
        this.f29320d = i32;
        c1398g2.g("require", new Z6(i32));
        i32.a("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.e1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new b7();
            }
        });
        c1398g2.g("runtime.counter", new C1419j(Double.valueOf(com.google.firebase.remoteconfig.l.f37524n)));
    }

    public final r a(C1398g2 c1398g2, E2... e2Arr) {
        r rVar = r.f29754h;
        for (E2 e22 : e2Arr) {
            rVar = C1415i3.a(e22);
            H2.c(this.f29319c);
            if ((rVar instanceof C1490s) || (rVar instanceof C1475q)) {
                rVar = this.f29317a.a(c1398g2, rVar);
            }
        }
        return rVar;
    }
}
