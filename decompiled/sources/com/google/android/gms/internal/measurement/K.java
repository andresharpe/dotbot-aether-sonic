package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class K extends AbstractC1538y {
    /* JADX INFO: Access modifiers changed from: protected */
    public K() {
        this.f29837a.add(zzbl.FOR_IN);
        this.f29837a.add(zzbl.FOR_IN_CONST);
        this.f29837a.add(zzbl.FOR_IN_LET);
        this.f29837a.add(zzbl.FOR_LET);
        this.f29837a.add(zzbl.FOR_OF);
        this.f29837a.add(zzbl.FOR_OF_CONST);
        this.f29837a.add(zzbl.FOR_OF_LET);
        this.f29837a.add(zzbl.WHILE);
    }

    private static r c(I i4, Iterator it, r rVar) {
        if (it != null) {
            while (it.hasNext()) {
                r c4 = i4.a((r) it.next()).c((C1387f) rVar);
                if (c4 instanceof C1403h) {
                    C1403h c1403h = (C1403h) c4;
                    if ("break".equals(c1403h.b())) {
                        return r.f29754h;
                    }
                    if ("return".equals(c1403h.b())) {
                        return c1403h;
                    }
                }
            }
        }
        return r.f29754h;
    }

    private static r d(I i4, r rVar, r rVar2) {
        return c(i4, rVar.zzl(), rVar2);
    }

    private static r e(I i4, r rVar, r rVar2) {
        if (rVar instanceof Iterable) {
            return c(i4, ((Iterable) rVar).iterator(), rVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1538y
    public final r a(String str, C1398g2 c1398g2, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = H2.e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    H2.h(zzbl.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C1514v) {
                        return d(new J(c1398g2, ((r) list.get(0)).zzi()), c1398g2.b((r) list.get(1)), c1398g2.b((r) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    H2.h(zzbl.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C1514v) {
                        return d(new G(c1398g2, ((r) list.get(0)).zzi()), c1398g2.b((r) list.get(1)), c1398g2.b((r) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    H2.h(zzbl.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C1514v) {
                        return d(new H(c1398g2, ((r) list.get(0)).zzi()), c1398g2.b((r) list.get(1)), c1398g2.b((r) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case ConstraintLayout.b.a.f9571D /* 29 */:
                    H2.h(zzbl.FOR_LET.name(), 4, list);
                    r b4 = c1398g2.b((r) list.get(0));
                    if (b4 instanceof C1387f) {
                        C1387f c1387f = (C1387f) b4;
                        r rVar = (r) list.get(1);
                        r rVar2 = (r) list.get(2);
                        r b5 = c1398g2.b((r) list.get(3));
                        C1398g2 a4 = c1398g2.a();
                        for (int i4 = 0; i4 < c1387f.j(); i4++) {
                            String zzi = c1387f.k(i4).zzi();
                            a4.g(zzi, c1398g2.d(zzi));
                        }
                        while (c1398g2.b(rVar).zzg().booleanValue()) {
                            r c4 = c1398g2.c((C1387f) b5);
                            if (c4 instanceof C1403h) {
                                C1403h c1403h = (C1403h) c4;
                                if ("break".equals(c1403h.b())) {
                                    return r.f29754h;
                                }
                                if ("return".equals(c1403h.b())) {
                                    return c1403h;
                                }
                            }
                            C1398g2 a5 = c1398g2.a();
                            for (int i5 = 0; i5 < c1387f.j(); i5++) {
                                String zzi2 = c1387f.k(i5).zzi();
                                a5.g(zzi2, a4.d(zzi2));
                            }
                            a5.b(rVar2);
                            a4 = a5;
                        }
                        return r.f29754h;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    H2.h(zzbl.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C1514v) {
                        return e(new J(c1398g2, ((r) list.get(0)).zzi()), c1398g2.b((r) list.get(1)), c1398g2.b((r) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case ConstraintLayout.b.a.f9573F /* 31 */:
                    H2.h(zzbl.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C1514v) {
                        return e(new G(c1398g2, ((r) list.get(0)).zzi()), c1398g2.b((r) list.get(1)), c1398g2.b((r) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    H2.h(zzbl.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C1514v) {
                        return e(new H(c1398g2, ((r) list.get(0)).zzi()), c1398g2.b((r) list.get(1)), c1398g2.b((r) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.b(str);
            }
        }
        H2.h(zzbl.WHILE.name(), 4, list);
        r rVar3 = (r) list.get(0);
        r rVar4 = (r) list.get(1);
        r rVar5 = (r) list.get(2);
        r b6 = c1398g2.b((r) list.get(3));
        if (c1398g2.b(rVar5).zzg().booleanValue()) {
            r c5 = c1398g2.c((C1387f) b6);
            if (c5 instanceof C1403h) {
                C1403h c1403h2 = (C1403h) c5;
                if ("break".equals(c1403h2.b())) {
                    return r.f29754h;
                }
                if ("return".equals(c1403h2.b())) {
                    return c1403h2;
                }
            }
        }
        while (c1398g2.b(rVar3).zzg().booleanValue()) {
            r c6 = c1398g2.c((C1387f) b6);
            if (c6 instanceof C1403h) {
                C1403h c1403h3 = (C1403h) c6;
                if ("break".equals(c1403h3.b())) {
                    return r.f29754h;
                }
                if ("return".equals(c1403h3.b())) {
                    return c1403h3;
                }
            }
            c1398g2.b(rVar4);
        }
        return r.f29754h;
    }
}
