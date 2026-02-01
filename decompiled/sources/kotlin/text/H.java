package kotlin.text;

import kotlin.C2177j0;
import kotlin.D0;
import kotlin.InterfaceC2218t;
import kotlin.J0;
import kotlin.K0;
import kotlin.KotlinNothingValueException;
import kotlin.Y;
import kotlin.m0;
import kotlin.p0;
import kotlin.t0;
import kotlin.x0;

@W2.i(name = "UStringsKt")
/* loaded from: classes2.dex */
public final class H {
    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final String a(long j4, int i4) {
        int a4;
        a4 = C2220b.a(i4);
        return J0.l(j4, a4);
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final String b(byte b4, int i4) {
        int a4;
        a4 = C2220b.a(i4);
        String num = Integer.toString(b4 & 255, a4);
        kotlin.jvm.internal.F.o(num, "toString(...)");
        return num;
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final String c(int i4, int i5) {
        int a4;
        long j4 = i4 & 4294967295L;
        a4 = C2220b.a(i5);
        String l4 = Long.toString(j4, a4);
        kotlin.jvm.internal.F.o(l4, "toString(...)");
        return l4;
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final String d(short s4, int i4) {
        int a4;
        int i5 = s4 & D0.f51794H;
        a4 = C2220b.a(i4);
        String num = Integer.toString(i5, a4);
        kotlin.jvm.internal.F.o(num, "toString(...)");
        return num;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final byte e(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        p0 g4 = g(str);
        if (g4 != null) {
            return g4.j0();
        }
        y.U0(str);
        throw new KotlinNothingValueException();
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final byte f(@l3.d String str, int i4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        p0 h4 = h(str, i4);
        if (h4 != null) {
            return h4.j0();
        }
        y.U0(str);
        throw new KotlinNothingValueException();
    }

    @l3.e
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final p0 g(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return h(str, 10);
    }

    @l3.e
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final p0 h(@l3.d String str, int i4) {
        int compare;
        kotlin.jvm.internal.F.p(str, "<this>");
        t0 l4 = l(str, i4);
        if (l4 == null) {
            return null;
        }
        int l02 = l4.l0();
        compare = Integer.compare(l02 ^ Integer.MIN_VALUE, t0.l(255) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return p0.e(p0.l((byte) l02));
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final int i(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        t0 k4 = k(str);
        if (k4 != null) {
            return k4.l0();
        }
        y.U0(str);
        throw new KotlinNothingValueException();
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final int j(@l3.d String str, int i4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        t0 l4 = l(str, i4);
        if (l4 != null) {
            return l4.l0();
        }
        y.U0(str);
        throw new KotlinNothingValueException();
    }

    @l3.e
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final t0 k(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return l(str, 10);
    }

    @l3.e
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final t0 l(@l3.d String str, int i4) {
        int i5;
        int compare;
        int compare2;
        int compare3;
        kotlin.jvm.internal.F.p(str, "<this>");
        C2220b.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.F.t(charAt, 48) < 0) {
            i5 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i5 = 0;
        }
        int l4 = t0.l(i4);
        int i7 = 119304647;
        while (i5 < length) {
            int b4 = C2220b.b(str.charAt(i5), i4);
            if (b4 >= 0) {
                compare = Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE);
                if (compare > 0) {
                    if (i7 == 119304647) {
                        i7 = C2177j0.a(-1, l4);
                        compare3 = Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE);
                        if (compare3 > 0) {
                        }
                    }
                    return null;
                }
                int l5 = t0.l(i6 * l4);
                int l6 = t0.l(t0.l(b4) + l5);
                compare2 = Integer.compare(l6 ^ Integer.MIN_VALUE, l5 ^ Integer.MIN_VALUE);
                if (compare2 < 0) {
                    return null;
                }
                i5++;
                i6 = l6;
            } else {
                return null;
            }
        }
        return t0.e(i6);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final long m(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        x0 o4 = o(str);
        if (o4 != null) {
            return o4.l0();
        }
        y.U0(str);
        throw new KotlinNothingValueException();
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final long n(@l3.d String str, int i4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        x0 p4 = p(str, i4);
        if (p4 != null) {
            return p4.l0();
        }
        y.U0(str);
        throw new KotlinNothingValueException();
    }

    @l3.e
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final x0 o(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return p(str, 10);
    }

    @l3.e
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final x0 p(@l3.d String str, int i4) {
        int compare;
        int compare2;
        int compare3;
        kotlin.jvm.internal.F.p(str, "<this>");
        C2220b.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.F.t(charAt, 48) < 0) {
            i5 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long l4 = x0.l(i4);
        long j4 = 0;
        long j5 = 512409557603043100L;
        while (i5 < length) {
            if (C2220b.b(str.charAt(i5), i4) >= 0) {
                compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
                if (compare > 0) {
                    if (j5 == 512409557603043100L) {
                        j5 = m0.a(-1L, l4);
                        compare3 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
                        if (compare3 > 0) {
                        }
                    }
                    return null;
                }
                long l5 = x0.l(j4 * l4);
                long l6 = x0.l(x0.l(t0.l(r13) & 4294967295L) + l5);
                compare2 = Long.compare(l6 ^ Long.MIN_VALUE, l5 ^ Long.MIN_VALUE);
                if (compare2 < 0) {
                    return null;
                }
                i5++;
                j4 = l6;
            } else {
                return null;
            }
        }
        return x0.e(j4);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final short q(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        D0 s4 = s(str);
        if (s4 != null) {
            return s4.j0();
        }
        y.U0(str);
        throw new KotlinNothingValueException();
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final short r(@l3.d String str, int i4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        D0 t3 = t(str, i4);
        if (t3 != null) {
            return t3.j0();
        }
        y.U0(str);
        throw new KotlinNothingValueException();
    }

    @l3.e
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final D0 s(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return t(str, 10);
    }

    @l3.e
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final D0 t(@l3.d String str, int i4) {
        int compare;
        kotlin.jvm.internal.F.p(str, "<this>");
        t0 l4 = l(str, i4);
        if (l4 == null) {
            return null;
        }
        int l02 = l4.l0();
        compare = Integer.compare(l02 ^ Integer.MIN_VALUE, t0.l(65535) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return D0.e(D0.l((short) l02));
    }
}
