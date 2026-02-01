package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.text.C0755c;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class N extends AbstractC1538y {
    /* JADX INFO: Access modifiers changed from: protected */
    public N() {
        this.f29837a.add(zzbl.ASSIGN);
        this.f29837a.add(zzbl.CONST);
        this.f29837a.add(zzbl.CREATE_ARRAY);
        this.f29837a.add(zzbl.CREATE_OBJECT);
        this.f29837a.add(zzbl.EXPRESSION_LIST);
        this.f29837a.add(zzbl.GET);
        this.f29837a.add(zzbl.GET_INDEX);
        this.f29837a.add(zzbl.GET_PROPERTY);
        this.f29837a.add(zzbl.NULL);
        this.f29837a.add(zzbl.SET_PROPERTY);
        this.f29837a.add(zzbl.TYPEOF);
        this.f29837a.add(zzbl.UNDEFINED);
        this.f29837a.add(zzbl.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1538y
    public final r a(String str, C1398g2 c1398g2, List list) {
        String str2;
        zzbl zzblVar = zzbl.ADD;
        int ordinal = H2.e(str).ordinal();
        int i4 = 0;
        if (ordinal == 3) {
            H2.h(zzbl.ASSIGN.name(), 2, list);
            r b4 = c1398g2.b((r) list.get(0));
            if (b4 instanceof C1514v) {
                if (c1398g2.h(b4.zzi())) {
                    r b5 = c1398g2.b((r) list.get(1));
                    c1398g2.g(b4.zzi(), b5);
                    return b5;
                }
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b4.zzi()));
            }
            throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b4.getClass().getCanonicalName()));
        }
        if (ordinal == 14) {
            H2.i(zzbl.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                while (i4 < list.size() - 1) {
                    r b6 = c1398g2.b((r) list.get(i4));
                    if (b6 instanceof C1514v) {
                        c1398g2.f(b6.zzi(), c1398g2.b((r) list.get(i4 + 1)));
                        i4 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b6.getClass().getCanonicalName()));
                    }
                }
                return r.f29754h;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        }
        if (ordinal == 24) {
            H2.i(zzbl.EXPRESSION_LIST.name(), 1, list);
            r rVar = r.f29754h;
            while (i4 < list.size()) {
                rVar = c1398g2.b((r) list.get(i4));
                if (rVar instanceof C1403h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i4++;
            }
            return rVar;
        }
        if (ordinal == 33) {
            H2.h(zzbl.GET.name(), 1, list);
            r b7 = c1398g2.b((r) list.get(0));
            if (b7 instanceof C1514v) {
                return c1398g2.d(b7.zzi());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b7.getClass().getCanonicalName()));
        }
        if (ordinal == 49) {
            H2.h(zzbl.NULL.name(), 0, list);
            return r.f29755i;
        }
        if (ordinal == 58) {
            H2.h(zzbl.SET_PROPERTY.name(), 3, list);
            r b8 = c1398g2.b((r) list.get(0));
            r b9 = c1398g2.b((r) list.get(1));
            r b10 = c1398g2.b((r) list.get(2));
            if (b8 != r.f29754h && b8 != r.f29755i) {
                if ((b8 instanceof C1387f) && (b9 instanceof C1419j)) {
                    ((C1387f) b8).r(b9.zzh().intValue(), b10);
                } else if (b8 instanceof InterfaceC1451n) {
                    ((InterfaceC1451n) b8).c(b9.zzi(), b10);
                }
                return b10;
            }
            throw new IllegalStateException(String.format("Can't set property %s of %s", b9.zzi(), b8.zzi()));
        }
        if (ordinal == 17) {
            if (list.isEmpty()) {
                return new C1387f();
            }
            C1387f c1387f = new C1387f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r b11 = c1398g2.b((r) it.next());
                if (!(b11 instanceof C1403h)) {
                    c1387f.r(i4, b11);
                    i4++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return c1387f;
        }
        if (ordinal == 18) {
            if (list.isEmpty()) {
                return new C1459o();
            }
            if (list.size() % 2 == 0) {
                C1459o c1459o = new C1459o();
                while (i4 < list.size() - 1) {
                    r b12 = c1398g2.b((r) list.get(i4));
                    r b13 = c1398g2.b((r) list.get(i4 + 1));
                    if (!(b12 instanceof C1403h) && !(b13 instanceof C1403h)) {
                        c1459o.c(b12.zzi(), b13);
                        i4 += 2;
                    } else {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                }
                return c1459o;
            }
            throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        }
        if (ordinal != 35 && ordinal != 36) {
            switch (ordinal) {
                case 62:
                    H2.h(zzbl.TYPEOF.name(), 1, list);
                    r b14 = c1398g2.b((r) list.get(0));
                    if (b14 instanceof C1522w) {
                        str2 = "undefined";
                    } else if (b14 instanceof C1395g) {
                        str2 = v.b.f7404f;
                    } else if (b14 instanceof C1419j) {
                        str2 = "number";
                    } else if (b14 instanceof C1514v) {
                        str2 = v.b.f7403e;
                    } else if (b14 instanceof C1475q) {
                        str2 = "function";
                    } else {
                        if ((b14 instanceof C1490s) || (b14 instanceof C1403h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b14));
                        }
                        str2 = "object";
                    }
                    return new C1514v(str2);
                case C0755c.f12913k /* 63 */:
                    H2.h(zzbl.UNDEFINED.name(), 0, list);
                    return r.f29754h;
                case 64:
                    H2.i(zzbl.VAR.name(), 1, list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        r b15 = c1398g2.b((r) it2.next());
                        if (b15 instanceof C1514v) {
                            c1398g2.e(b15.zzi(), r.f29754h);
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b15.getClass().getCanonicalName()));
                        }
                    }
                    return r.f29754h;
                default:
                    return super.b(str);
            }
        }
        H2.h(zzbl.GET_PROPERTY.name(), 2, list);
        r b16 = c1398g2.b((r) list.get(0));
        r b17 = c1398g2.b((r) list.get(1));
        if ((b16 instanceof C1387f) && H2.k(b17)) {
            return ((C1387f) b16).k(b17.zzh().intValue());
        }
        if (b16 instanceof InterfaceC1451n) {
            return ((InterfaceC1451n) b16).f(b17.zzi());
        }
        if (b16 instanceof C1514v) {
            if ("length".equals(b17.zzi())) {
                return new C1419j(Double.valueOf(b16.zzi().length()));
            }
            if (H2.k(b17) && b17.zzh().doubleValue() < b16.zzi().length()) {
                return new C1514v(String.valueOf(b16.zzi().charAt(b17.zzh().intValue())));
            }
        }
        return r.f29754h;
    }
}
