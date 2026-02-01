package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class A extends AbstractC1538y {
    public A() {
        this.f29837a.add(zzbl.EQUALS);
        this.f29837a.add(zzbl.GREATER_THAN);
        this.f29837a.add(zzbl.GREATER_THAN_EQUALS);
        this.f29837a.add(zzbl.IDENTITY_EQUALS);
        this.f29837a.add(zzbl.IDENTITY_NOT_EQUALS);
        this.f29837a.add(zzbl.LESS_THAN);
        this.f29837a.add(zzbl.LESS_THAN_EQUALS);
        this.f29837a.add(zzbl.NOT_EQUALS);
    }

    private static boolean c(r rVar, r rVar2) {
        if (rVar.getClass().equals(rVar2.getClass())) {
            if ((rVar instanceof C1522w) || (rVar instanceof C1467p)) {
                return true;
            }
            if (rVar instanceof C1419j) {
                if (Double.isNaN(rVar.zzh().doubleValue()) || Double.isNaN(rVar2.zzh().doubleValue()) || rVar.zzh().doubleValue() != rVar2.zzh().doubleValue()) {
                    return false;
                }
                return true;
            }
            if (rVar instanceof C1514v) {
                return rVar.zzi().equals(rVar2.zzi());
            }
            if (rVar instanceof C1395g) {
                return rVar.zzg().equals(rVar2.zzg());
            }
            if (rVar != rVar2) {
                return false;
            }
            return true;
        }
        if (((rVar instanceof C1522w) || (rVar instanceof C1467p)) && ((rVar2 instanceof C1522w) || (rVar2 instanceof C1467p))) {
            return true;
        }
        boolean z3 = rVar instanceof C1419j;
        if (z3 && (rVar2 instanceof C1514v)) {
            return c(rVar, new C1419j(rVar2.zzh()));
        }
        boolean z4 = rVar instanceof C1514v;
        if (z4 && (rVar2 instanceof C1419j)) {
            return c(new C1419j(rVar.zzh()), rVar2);
        }
        if (rVar instanceof C1395g) {
            return c(new C1419j(rVar.zzh()), rVar2);
        }
        if (rVar2 instanceof C1395g) {
            return c(rVar, new C1419j(rVar2.zzh()));
        }
        if ((!z4 && !z3) || !(rVar2 instanceof InterfaceC1451n)) {
            if (!(rVar instanceof InterfaceC1451n) || (!(rVar2 instanceof C1514v) && !(rVar2 instanceof C1419j))) {
                return false;
            }
            return c(new C1514v(rVar.zzi()), rVar2);
        }
        return c(rVar, new C1514v(rVar2.zzi()));
    }

    private static boolean d(r rVar, r rVar2) {
        if (rVar instanceof InterfaceC1451n) {
            rVar = new C1514v(rVar.zzi());
        }
        if (rVar2 instanceof InterfaceC1451n) {
            rVar2 = new C1514v(rVar2.zzi());
        }
        if ((rVar instanceof C1514v) && (rVar2 instanceof C1514v)) {
            if (rVar.zzi().compareTo(rVar2.zzi()) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = rVar.zzh().doubleValue();
        double doubleValue2 = rVar2.zzh().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != com.google.firebase.remoteconfig.l.f37524n || doubleValue2 != com.google.firebase.remoteconfig.l.f37524n) && ((doubleValue != com.google.firebase.remoteconfig.l.f37524n || doubleValue2 != com.google.firebase.remoteconfig.l.f37524n) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    private static boolean e(r rVar, r rVar2) {
        if (rVar instanceof InterfaceC1451n) {
            rVar = new C1514v(rVar.zzi());
        }
        if (rVar2 instanceof InterfaceC1451n) {
            rVar2 = new C1514v(rVar2.zzi());
        }
        if (((!(rVar instanceof C1514v) || !(rVar2 instanceof C1514v)) && (Double.isNaN(rVar.zzh().doubleValue()) || Double.isNaN(rVar2.zzh().doubleValue()))) || d(rVar2, rVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x003a. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.AbstractC1538y
    public final r a(String str, C1398g2 c1398g2, List list) {
        boolean c4;
        boolean c5;
        H2.h(H2.e(str).name(), 2, list);
        r b4 = c1398g2.b((r) list.get(0));
        r b5 = c1398g2.b((r) list.get(1));
        int ordinal = H2.e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal != 48) {
                if (ordinal != 42) {
                    if (ordinal != 43) {
                        switch (ordinal) {
                            case 37:
                                c4 = d(b5, b4);
                                break;
                            case 38:
                                c4 = e(b5, b4);
                                break;
                            case 39:
                                c4 = H2.l(b4, b5);
                                break;
                            case 40:
                                c5 = H2.l(b4, b5);
                                break;
                            default:
                                return super.b(str);
                        }
                    } else {
                        c4 = e(b4, b5);
                    }
                } else {
                    c4 = d(b4, b5);
                }
            } else {
                c5 = c(b4, b5);
            }
            c4 = !c5;
        } else {
            c4 = c(b4, b5);
        }
        if (c4) {
            return r.f29759m;
        }
        return r.f29760n;
    }
}
