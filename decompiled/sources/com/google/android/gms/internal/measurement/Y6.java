package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class Y6 extends AbstractC1427k {

    /* renamed from: G, reason: collision with root package name */
    private final c7 f29570G;

    public Y6(c7 c7Var) {
        super("internal.registerCallback");
        this.f29570G = c7Var;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1427k
    public final r a(C1398g2 c1398g2, List list) {
        int i4;
        H2.h(this.f29699E, 3, list);
        String zzi = c1398g2.b((r) list.get(0)).zzi();
        r b4 = c1398g2.b((r) list.get(1));
        if (b4 instanceof C1475q) {
            r b5 = c1398g2.b((r) list.get(2));
            if (b5 instanceof C1459o) {
                C1459o c1459o = (C1459o) b5;
                if (c1459o.b("type")) {
                    String zzi2 = c1459o.f("type").zzi();
                    if (c1459o.b("priority")) {
                        i4 = H2.b(c1459o.f("priority").zzh().doubleValue());
                    } else {
                        i4 = 1000;
                    }
                    this.f29570G.a(zzi, i4, (C1475q) b4, zzi2);
                    return r.f29754h;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
