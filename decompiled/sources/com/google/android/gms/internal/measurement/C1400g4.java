package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.g4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1400g4 extends AbstractC1427k {

    /* renamed from: G, reason: collision with root package name */
    private final C1363c f29658G;

    public C1400g4(C1363c c1363c) {
        super("internal.eventLogger");
        this.f29658G = c1363c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1427k
    public final r a(C1398g2 c1398g2, List list) {
        Map hashMap;
        H2.h(this.f29699E, 3, list);
        String zzi = c1398g2.b((r) list.get(0)).zzi();
        long a4 = (long) H2.a(c1398g2.b((r) list.get(1)).zzh().doubleValue());
        r b4 = c1398g2.b((r) list.get(2));
        if (b4 instanceof C1459o) {
            hashMap = H2.g((C1459o) b4);
        } else {
            hashMap = new HashMap();
        }
        this.f29658G.e(zzi, a4, hashMap);
        return r.f29754h;
    }
}
