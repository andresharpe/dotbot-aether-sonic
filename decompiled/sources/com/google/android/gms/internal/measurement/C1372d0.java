package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1372d0 {

    /* renamed from: a, reason: collision with root package name */
    final F1 f29615a;

    /* renamed from: b, reason: collision with root package name */
    C1398g2 f29616b;

    /* renamed from: c, reason: collision with root package name */
    final C1363c f29617c;

    /* renamed from: d, reason: collision with root package name */
    private final c7 f29618d;

    public C1372d0() {
        F1 f12 = new F1();
        this.f29615a = f12;
        this.f29616b = f12.f29318b.a();
        this.f29617c = new C1363c();
        this.f29618d = new c7();
        f12.f29320d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1372d0.this.b();
            }
        });
        f12.f29320d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.C
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C1400g4(C1372d0.this.f29617c);
            }
        });
    }

    public final C1363c a() {
        return this.f29617c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ AbstractC1427k b() throws Exception {
        return new Y6(this.f29618d);
    }

    public final void c(C1549z2 c1549z2) throws zzd {
        AbstractC1427k abstractC1427k;
        try {
            this.f29616b = this.f29615a.f29318b.a();
            if (!(this.f29615a.a(this.f29616b, (E2[]) c1549z2.C().toArray(new E2[0])) instanceof C1403h)) {
                for (C1533x2 c1533x2 : c1549z2.A().D()) {
                    List C3 = c1533x2.C();
                    String B3 = c1533x2.B();
                    Iterator it = C3.iterator();
                    while (it.hasNext()) {
                        r a4 = this.f29615a.a(this.f29616b, (E2) it.next());
                        if (a4 instanceof C1459o) {
                            C1398g2 c1398g2 = this.f29616b;
                            if (!c1398g2.h(B3)) {
                                abstractC1427k = null;
                            } else {
                                r d4 = c1398g2.d(B3);
                                if (d4 instanceof AbstractC1427k) {
                                    abstractC1427k = (AbstractC1427k) d4;
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(B3)));
                                }
                            }
                            if (abstractC1427k != null) {
                                abstractC1427k.a(this.f29616b, Collections.singletonList(a4));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(B3)));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final void d(String str, Callable callable) {
        this.f29615a.f29320d.a(str, callable);
    }

    public final boolean e(C1355b c1355b) throws zzd {
        try {
            this.f29617c.d(c1355b);
            this.f29615a.f29319c.g("runtime.counter", new C1419j(Double.valueOf(com.google.firebase.remoteconfig.l.f37524n)));
            this.f29618d.b(this.f29616b.a(), this.f29617c);
            if (!g()) {
                if (!f()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean f() {
        if (!this.f29617c.c().isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        C1363c c1363c = this.f29617c;
        if (!c1363c.b().equals(c1363c.a())) {
            return true;
        }
        return false;
    }
}
