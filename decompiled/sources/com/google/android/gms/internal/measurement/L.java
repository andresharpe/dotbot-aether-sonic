package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class L extends AbstractC1538y {
    /* JADX INFO: Access modifiers changed from: protected */
    public L() {
        this.f29837a.add(zzbl.ADD);
        this.f29837a.add(zzbl.DIVIDE);
        this.f29837a.add(zzbl.MODULUS);
        this.f29837a.add(zzbl.MULTIPLY);
        this.f29837a.add(zzbl.NEGATE);
        this.f29837a.add(zzbl.POST_DECREMENT);
        this.f29837a.add(zzbl.POST_INCREMENT);
        this.f29837a.add(zzbl.PRE_DECREMENT);
        this.f29837a.add(zzbl.PRE_INCREMENT);
        this.f29837a.add(zzbl.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1538y
    public final r a(String str, C1398g2 c1398g2, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = H2.e(str).ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                if (ordinal != 59) {
                    if (ordinal != 52 && ordinal != 53) {
                        if (ordinal != 55 && ordinal != 56) {
                            switch (ordinal) {
                                case 44:
                                    H2.h(zzbl.MODULUS.name(), 2, list);
                                    return new C1419j(Double.valueOf(c1398g2.b((r) list.get(0)).zzh().doubleValue() % c1398g2.b((r) list.get(1)).zzh().doubleValue()));
                                case 45:
                                    H2.h(zzbl.MULTIPLY.name(), 2, list);
                                    return new C1419j(Double.valueOf(c1398g2.b((r) list.get(0)).zzh().doubleValue() * c1398g2.b((r) list.get(1)).zzh().doubleValue()));
                                case 46:
                                    H2.h(zzbl.NEGATE.name(), 1, list);
                                    return new C1419j(Double.valueOf(-c1398g2.b((r) list.get(0)).zzh().doubleValue()));
                                default:
                                    return super.b(str);
                            }
                        }
                        H2.h(str, 1, list);
                        return c1398g2.b((r) list.get(0));
                    }
                    H2.h(str, 2, list);
                    r b4 = c1398g2.b((r) list.get(0));
                    c1398g2.b((r) list.get(1));
                    return b4;
                }
                H2.h(zzbl.SUBTRACT.name(), 2, list);
                return new C1419j(Double.valueOf(c1398g2.b((r) list.get(0)).zzh().doubleValue() + new C1419j(Double.valueOf(-c1398g2.b((r) list.get(1)).zzh().doubleValue())).zzh().doubleValue()));
            }
            H2.h(zzbl.DIVIDE.name(), 2, list);
            return new C1419j(Double.valueOf(c1398g2.b((r) list.get(0)).zzh().doubleValue() / c1398g2.b((r) list.get(1)).zzh().doubleValue()));
        }
        H2.h(zzblVar.name(), 2, list);
        r b5 = c1398g2.b((r) list.get(0));
        r b6 = c1398g2.b((r) list.get(1));
        if (!(b5 instanceof InterfaceC1451n) && !(b5 instanceof C1514v) && !(b6 instanceof InterfaceC1451n) && !(b6 instanceof C1514v)) {
            return new C1419j(Double.valueOf(b5.zzh().doubleValue() + b6.zzh().doubleValue()));
        }
        return new C1514v(String.valueOf(b5.zzi()).concat(String.valueOf(b6.zzi())));
    }
}
