package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class F extends AbstractC1538y {
    /* JADX INFO: Access modifiers changed from: protected */
    public F() {
        this.f29837a.add(zzbl.AND);
        this.f29837a.add(zzbl.NOT);
        this.f29837a.add(zzbl.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1538y
    public final r a(String str, C1398g2 c1398g2, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = H2.e(str).ordinal();
        if (ordinal != 1) {
            if (ordinal != 47) {
                if (ordinal != 50) {
                    return super.b(str);
                }
                H2.h(zzbl.OR.name(), 2, list);
                r b4 = c1398g2.b((r) list.get(0));
                if (b4.zzg().booleanValue()) {
                    return b4;
                }
                return c1398g2.b((r) list.get(1));
            }
            H2.h(zzbl.NOT.name(), 1, list);
            return new C1395g(Boolean.valueOf(!c1398g2.b((r) list.get(0)).zzg().booleanValue()));
        }
        H2.h(zzbl.AND.name(), 2, list);
        r b5 = c1398g2.b((r) list.get(0));
        if (!b5.zzg().booleanValue()) {
            return b5;
        }
        return c1398g2.b((r) list.get(1));
    }
}
