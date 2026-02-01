package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class Z6 extends AbstractC1427k {

    /* renamed from: G, reason: collision with root package name */
    private final I3 f29577G;

    /* renamed from: H, reason: collision with root package name */
    final Map f29578H;

    public Z6(I3 i32) {
        super("require");
        this.f29578H = new HashMap();
        this.f29577G = i32;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1427k
    public final r a(C1398g2 c1398g2, List list) {
        r rVar;
        H2.h("require", 1, list);
        String zzi = c1398g2.b((r) list.get(0)).zzi();
        if (this.f29578H.containsKey(zzi)) {
            return (r) this.f29578H.get(zzi);
        }
        I3 i32 = this.f29577G;
        if (i32.f29356a.containsKey(zzi)) {
            try {
                rVar = (r) ((Callable) i32.f29356a.get(zzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(zzi)));
            }
        } else {
            rVar = r.f29754h;
        }
        if (rVar instanceof AbstractC1427k) {
            this.f29578H.put(zzi, (AbstractC1427k) rVar);
        }
        return rVar;
    }
}
