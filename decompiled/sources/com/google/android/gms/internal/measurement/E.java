package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class E {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static r a(String str, C1387f c1387f, C1398g2 c1398g2, List list) {
        String str2;
        char c4;
        double d4;
        String str3;
        double d5;
        double min;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c4 = 18;
                    break;
                }
                c4 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c4 = 0;
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c4 = 2;
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c4 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c4 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    str2 = "toString";
                    c4 = 3;
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c4 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c4 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c4 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c4 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c4 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c4 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c4 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c4 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c4 = 1;
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c4 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c4 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c4 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c4 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c4 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c4 = 65535;
                break;
            default:
                str2 = "toString";
                c4 = 65535;
                break;
        }
        AbstractC1427k abstractC1427k = null;
        switch (c4) {
            case 0:
                r zzd = c1387f.zzd();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r b4 = c1398g2.b((r) it.next());
                        if (!(b4 instanceof C1403h)) {
                            C1387f c1387f2 = (C1387f) zzd;
                            int j4 = c1387f2.j();
                            if (b4 instanceof C1387f) {
                                C1387f c1387f3 = (C1387f) b4;
                                Iterator m4 = c1387f3.m();
                                while (m4.hasNext()) {
                                    Integer num = (Integer) m4.next();
                                    c1387f2.r(num.intValue() + j4, c1387f3.k(num.intValue()));
                                }
                            } else {
                                c1387f2.r(j4, b4);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return zzd;
            case 1:
                H2.h("every", 1, list);
                r b5 = c1398g2.b((r) list.get(0));
                if (b5 instanceof C1475q) {
                    if (c1387f.j() != 0 && b(c1387f, c1398g2, (C1475q) b5, Boolean.FALSE, Boolean.TRUE).j() != c1387f.j()) {
                        return r.f29760n;
                    }
                    return r.f29759m;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                H2.h("filter", 1, list);
                r b6 = c1398g2.b((r) list.get(0));
                if (b6 instanceof C1475q) {
                    if (c1387f.g() == 0) {
                        return new C1387f();
                    }
                    r zzd2 = c1387f.zzd();
                    C1387f b7 = b(c1387f, c1398g2, (C1475q) b6, null, Boolean.TRUE);
                    C1387f c1387f4 = new C1387f();
                    Iterator m5 = b7.m();
                    while (m5.hasNext()) {
                        c1387f4.r(c1387f4.j(), ((C1387f) zzd2).k(((Integer) m5.next()).intValue()));
                    }
                    return c1387f4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                H2.h("forEach", 1, list);
                r b8 = c1398g2.b((r) list.get(0));
                if (b8 instanceof C1475q) {
                    if (c1387f.g() == 0) {
                        return r.f29754h;
                    }
                    b(c1387f, c1398g2, (C1475q) b8, null, null);
                    return r.f29754h;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 4:
                H2.j("indexOf", 2, list);
                r rVar = r.f29754h;
                if (!list.isEmpty()) {
                    rVar = c1398g2.b((r) list.get(0));
                }
                if (list.size() > 1) {
                    d4 = H2.a(c1398g2.b((r) list.get(1)).zzh().doubleValue());
                    if (d4 >= c1387f.j()) {
                        return new C1419j(Double.valueOf(-1.0d));
                    }
                    if (d4 < com.google.firebase.remoteconfig.l.f37524n) {
                        d4 += c1387f.j();
                    }
                } else {
                    d4 = 0.0d;
                }
                Iterator m6 = c1387f.m();
                while (m6.hasNext()) {
                    int intValue = ((Integer) m6.next()).intValue();
                    double d6 = intValue;
                    if (d6 >= d4 && H2.l(c1387f.k(intValue), rVar)) {
                        return new C1419j(Double.valueOf(d6));
                    }
                }
                return new C1419j(Double.valueOf(-1.0d));
            case 5:
                H2.j("join", 1, list);
                if (c1387f.j() == 0) {
                    return r.f29761o;
                }
                if (list.isEmpty()) {
                    str3 = ",";
                } else {
                    r b9 = c1398g2.b((r) list.get(0));
                    if (!(b9 instanceof C1467p) && !(b9 instanceof C1522w)) {
                        str3 = b9.zzi();
                    } else {
                        str3 = "";
                    }
                }
                return new C1514v(c1387f.l(str3));
            case 6:
                H2.j("lastIndexOf", 2, list);
                r rVar2 = r.f29754h;
                if (!list.isEmpty()) {
                    rVar2 = c1398g2.b((r) list.get(0));
                }
                double j5 = c1387f.j() - 1;
                if (list.size() > 1) {
                    r b10 = c1398g2.b((r) list.get(1));
                    j5 = Double.isNaN(b10.zzh().doubleValue()) ? c1387f.j() - 1 : H2.a(b10.zzh().doubleValue());
                    d5 = com.google.firebase.remoteconfig.l.f37524n;
                    if (j5 < com.google.firebase.remoteconfig.l.f37524n) {
                        j5 += c1387f.j();
                    }
                } else {
                    d5 = com.google.firebase.remoteconfig.l.f37524n;
                }
                if (j5 < d5) {
                    return new C1419j(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(c1387f.j(), j5); min2 >= 0; min2--) {
                    if (c1387f.s(min2) && H2.l(c1387f.k(min2), rVar2)) {
                        return new C1419j(Double.valueOf(min2));
                    }
                }
                return new C1419j(Double.valueOf(-1.0d));
            case 7:
                H2.h("map", 1, list);
                r b11 = c1398g2.b((r) list.get(0));
                if (b11 instanceof C1475q) {
                    if (c1387f.j() == 0) {
                        return new C1387f();
                    }
                    return b(c1387f, c1398g2, (C1475q) b11, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                H2.h("pop", 0, list);
                int j6 = c1387f.j();
                if (j6 == 0) {
                    return r.f29754h;
                }
                int i4 = j6 - 1;
                r k4 = c1387f.k(i4);
                c1387f.q(i4);
                return k4;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c1387f.r(c1387f.j(), c1398g2.b((r) it2.next()));
                    }
                }
                return new C1419j(Double.valueOf(c1387f.j()));
            case '\n':
                return c(c1387f, c1398g2, list, true);
            case 11:
                return c(c1387f, c1398g2, list, false);
            case '\f':
                H2.h("reverse", 0, list);
                int j7 = c1387f.j();
                if (j7 != 0) {
                    for (int i5 = 0; i5 < j7 / 2; i5++) {
                        if (c1387f.s(i5)) {
                            r k5 = c1387f.k(i5);
                            c1387f.r(i5, null);
                            int i6 = (j7 - 1) - i5;
                            if (c1387f.s(i6)) {
                                c1387f.r(i5, c1387f.k(i6));
                            }
                            c1387f.r(i6, k5);
                        }
                    }
                }
                return c1387f;
            case '\r':
                H2.h("shift", 0, list);
                if (c1387f.j() == 0) {
                    return r.f29754h;
                }
                r k6 = c1387f.k(0);
                c1387f.q(0);
                return k6;
            case 14:
                H2.j("slice", 2, list);
                if (list.isEmpty()) {
                    return c1387f.zzd();
                }
                double j8 = c1387f.j();
                double a4 = H2.a(c1398g2.b((r) list.get(0)).zzh().doubleValue());
                if (a4 < com.google.firebase.remoteconfig.l.f37524n) {
                    min = Math.max(a4 + j8, com.google.firebase.remoteconfig.l.f37524n);
                } else {
                    min = Math.min(a4, j8);
                }
                if (list.size() == 2) {
                    double a5 = H2.a(c1398g2.b((r) list.get(1)).zzh().doubleValue());
                    if (a5 < com.google.firebase.remoteconfig.l.f37524n) {
                        j8 = Math.max(j8 + a5, com.google.firebase.remoteconfig.l.f37524n);
                    } else {
                        j8 = Math.min(j8, a5);
                    }
                }
                C1387f c1387f5 = new C1387f();
                for (int i7 = (int) min; i7 < j8; i7++) {
                    c1387f5.r(c1387f5.j(), c1387f.k(i7));
                }
                return c1387f5;
            case 15:
                H2.h("some", 1, list);
                r b12 = c1398g2.b((r) list.get(0));
                if (b12 instanceof AbstractC1427k) {
                    if (c1387f.j() == 0) {
                        return r.f29760n;
                    }
                    AbstractC1427k abstractC1427k2 = (AbstractC1427k) b12;
                    Iterator m7 = c1387f.m();
                    while (m7.hasNext()) {
                        int intValue2 = ((Integer) m7.next()).intValue();
                        if (c1387f.s(intValue2) && abstractC1427k2.a(c1398g2, Arrays.asList(c1387f.k(intValue2), new C1419j(Double.valueOf(intValue2)), c1387f)).zzg().booleanValue()) {
                            return r.f29759m;
                        }
                    }
                    return r.f29760n;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 16:
                H2.j("sort", 1, list);
                if (c1387f.j() >= 2) {
                    List n4 = c1387f.n();
                    if (!list.isEmpty()) {
                        r b13 = c1398g2.b((r) list.get(0));
                        if (b13 instanceof AbstractC1427k) {
                            abstractC1427k = (AbstractC1427k) b13;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    }
                    Collections.sort(n4, new D(abstractC1427k, c1398g2));
                    c1387f.o();
                    Iterator it3 = n4.iterator();
                    int i8 = 0;
                    while (it3.hasNext()) {
                        c1387f.r(i8, (r) it3.next());
                        i8++;
                    }
                }
                return c1387f;
            case 17:
                if (list.isEmpty()) {
                    return new C1387f();
                }
                int a6 = (int) H2.a(c1398g2.b((r) list.get(0)).zzh().doubleValue());
                if (a6 < 0) {
                    a6 = Math.max(0, a6 + c1387f.j());
                } else if (a6 > c1387f.j()) {
                    a6 = c1387f.j();
                }
                int j9 = c1387f.j();
                C1387f c1387f6 = new C1387f();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) H2.a(c1398g2.b((r) list.get(1)).zzh().doubleValue()));
                    if (max > 0) {
                        for (int i9 = a6; i9 < Math.min(j9, a6 + max); i9++) {
                            c1387f6.r(c1387f6.j(), c1387f.k(a6));
                            c1387f.q(a6);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i10 = 2; i10 < list.size(); i10++) {
                            r b14 = c1398g2.b((r) list.get(i10));
                            if (!(b14 instanceof C1403h)) {
                                c1387f.p((a6 + i10) - 2, b14);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                } else {
                    while (a6 < j9) {
                        c1387f6.r(c1387f6.j(), c1387f.k(a6));
                        c1387f.r(a6, null);
                        a6++;
                    }
                }
                return c1387f6;
            case 18:
                H2.h(str2, 0, list);
                return new C1514v(c1387f.l(","));
            case 19:
                if (!list.isEmpty()) {
                    C1387f c1387f7 = new C1387f();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        r b15 = c1398g2.b((r) it4.next());
                        if (!(b15 instanceof C1403h)) {
                            c1387f7.r(c1387f7.j(), b15);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int j10 = c1387f7.j();
                    Iterator m8 = c1387f.m();
                    while (m8.hasNext()) {
                        Integer num2 = (Integer) m8.next();
                        c1387f7.r(num2.intValue() + j10, c1387f.k(num2.intValue()));
                    }
                    c1387f.o();
                    Iterator m9 = c1387f7.m();
                    while (m9.hasNext()) {
                        Integer num3 = (Integer) m9.next();
                        c1387f.r(num3.intValue(), c1387f7.k(num3.intValue()));
                    }
                }
                return new C1419j(Double.valueOf(c1387f.j()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static C1387f b(C1387f c1387f, C1398g2 c1398g2, AbstractC1427k abstractC1427k, Boolean bool, Boolean bool2) {
        C1387f c1387f2 = new C1387f();
        Iterator m4 = c1387f.m();
        while (m4.hasNext()) {
            int intValue = ((Integer) m4.next()).intValue();
            if (c1387f.s(intValue)) {
                r a4 = abstractC1427k.a(c1398g2, Arrays.asList(c1387f.k(intValue), new C1419j(Double.valueOf(intValue)), c1387f));
                if (a4.zzg().equals(bool)) {
                    return c1387f2;
                }
                if (bool2 == null || a4.zzg().equals(bool2)) {
                    c1387f2.r(intValue, a4);
                }
            }
        }
        return c1387f2;
    }

    private static r c(C1387f c1387f, C1398g2 c1398g2, List list, boolean z3) {
        r rVar;
        int i4;
        int i5;
        int i6 = -1;
        H2.i("reduce", 1, list);
        H2.j("reduce", 2, list);
        r b4 = c1398g2.b((r) list.get(0));
        if (b4 instanceof AbstractC1427k) {
            if (list.size() == 2) {
                rVar = c1398g2.b((r) list.get(1));
                if (rVar instanceof C1403h) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (c1387f.j() != 0) {
                rVar = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            AbstractC1427k abstractC1427k = (AbstractC1427k) b4;
            int j4 = c1387f.j();
            if (z3) {
                i4 = 0;
            } else {
                i4 = j4 - 1;
            }
            if (z3) {
                i5 = j4 - 1;
            } else {
                i5 = 0;
            }
            if (true == z3) {
                i6 = 1;
            }
            if (rVar == null) {
                rVar = c1387f.k(i4);
                i4 += i6;
            }
            while ((i5 - i4) * i6 >= 0) {
                if (c1387f.s(i4)) {
                    rVar = abstractC1427k.a(c1398g2, Arrays.asList(rVar, c1387f.k(i4), new C1419j(Double.valueOf(i4)), c1387f));
                    if (rVar instanceof C1403h) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i4 += i6;
                } else {
                    i4 += i6;
                }
            }
            return rVar;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
