package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1530x extends AbstractC1538y {
    public C1530x() {
        this.f29837a.add(zzbl.BITWISE_AND);
        this.f29837a.add(zzbl.BITWISE_LEFT_SHIFT);
        this.f29837a.add(zzbl.BITWISE_NOT);
        this.f29837a.add(zzbl.BITWISE_OR);
        this.f29837a.add(zzbl.BITWISE_RIGHT_SHIFT);
        this.f29837a.add(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f29837a.add(zzbl.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1538y
    public final r a(String str, C1398g2 c1398g2, List list) {
        zzbl zzblVar = zzbl.ADD;
        switch (H2.e(str).ordinal()) {
            case 4:
                H2.h(zzbl.BITWISE_AND.name(), 2, list);
                return new C1419j(Double.valueOf(H2.b(c1398g2.b((r) list.get(0)).zzh().doubleValue()) & H2.b(c1398g2.b((r) list.get(1)).zzh().doubleValue())));
            case 5:
                H2.h(zzbl.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C1419j(Double.valueOf(H2.b(c1398g2.b((r) list.get(0)).zzh().doubleValue()) << ((int) (H2.d(c1398g2.b((r) list.get(1)).zzh().doubleValue()) & 31))));
            case 6:
                H2.h(zzbl.BITWISE_NOT.name(), 1, list);
                return new C1419j(Double.valueOf(~H2.b(c1398g2.b((r) list.get(0)).zzh().doubleValue())));
            case 7:
                H2.h(zzbl.BITWISE_OR.name(), 2, list);
                return new C1419j(Double.valueOf(H2.b(c1398g2.b((r) list.get(0)).zzh().doubleValue()) | H2.b(c1398g2.b((r) list.get(1)).zzh().doubleValue())));
            case 8:
                H2.h(zzbl.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C1419j(Double.valueOf(H2.b(c1398g2.b((r) list.get(0)).zzh().doubleValue()) >> ((int) (H2.d(c1398g2.b((r) list.get(1)).zzh().doubleValue()) & 31))));
            case 9:
                H2.h(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C1419j(Double.valueOf(H2.d(c1398g2.b((r) list.get(0)).zzh().doubleValue()) >>> ((int) (H2.d(c1398g2.b((r) list.get(1)).zzh().doubleValue()) & 31))));
            case 10:
                H2.h(zzbl.BITWISE_XOR.name(), 2, list);
                return new C1419j(Double.valueOf(H2.b(c1398g2.b((r) list.get(0)).zzh().doubleValue()) ^ H2.b(c1398g2.b((r) list.get(1)).zzh().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
