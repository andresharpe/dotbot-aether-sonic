package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.D0;
import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.p0;
import kotlin.random.Random;
import kotlin.ranges.v;
import kotlin.ranges.y;
import kotlin.t0;
import kotlin.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class C {
    @Y(version = "1.7")
    public static final int A(@l3.d v vVar) {
        F.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.l();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @Y(version = "1.7")
    public static final long B(@l3.d y yVar) {
        F.p(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.l();
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @l3.e
    @Y(version = "1.7")
    public static final t0 C(@l3.d v vVar) {
        F.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return t0.e(vVar.l());
    }

    @l3.e
    @Y(version = "1.7")
    public static final x0 D(@l3.d y yVar) {
        F.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return x0.e(yVar.l());
    }

    @Y(version = "1.7")
    public static final int E(@l3.d v vVar) {
        F.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.m();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @Y(version = "1.7")
    public static final long F(@l3.d y yVar) {
        F.p(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.m();
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @l3.e
    @Y(version = "1.7")
    public static final t0 G(@l3.d v vVar) {
        F.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return t0.e(vVar.m());
    }

    @l3.e
    @Y(version = "1.7")
    public static final x0 H(@l3.d y yVar) {
        F.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return x0.e(yVar.m());
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int I(x xVar) {
        F.p(xVar, "<this>");
        return J(xVar, Random.f52425E);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final int J(@l3.d x xVar, @l3.d Random random) {
        F.p(xVar, "<this>");
        F.p(random, "random");
        try {
            return kotlin.random.g.h(random, xVar);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long K(A a4) {
        F.p(a4, "<this>");
        return L(a4, Random.f52425E);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final long L(@l3.d A a4, @l3.d Random random) {
        F.p(a4, "<this>");
        F.p(random, "random");
        try {
            return kotlin.random.g.l(random, a4);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @K0(markerClass = {kotlin.r.class, InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final t0 M(x xVar) {
        F.p(xVar, "<this>");
        return N(xVar, Random.f52425E);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class, InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final t0 N(@l3.d x xVar, @l3.d Random random) {
        F.p(xVar, "<this>");
        F.p(random, "random");
        if (xVar.isEmpty()) {
            return null;
        }
        return t0.e(kotlin.random.g.h(random, xVar));
    }

    @K0(markerClass = {kotlin.r.class, InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final x0 O(A a4) {
        F.p(a4, "<this>");
        return P(a4, Random.f52425E);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class, InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final x0 P(@l3.d A a4, @l3.d Random random) {
        F.p(a4, "<this>");
        F.p(random, "random");
        if (a4.isEmpty()) {
            return null;
        }
        return x0.e(kotlin.random.g.l(random, a4));
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final v Q(@l3.d v vVar) {
        F.p(vVar, "<this>");
        return v.f52489H.a(vVar.m(), vVar.l(), -vVar.n());
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final y R(@l3.d y yVar) {
        F.p(yVar, "<this>");
        return y.f52499H.a(yVar.m(), yVar.l(), -yVar.n());
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final v S(@l3.d v vVar, int i4) {
        boolean z3;
        F.p(vVar, "<this>");
        if (i4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        t.a(z3, Integer.valueOf(i4));
        v.a aVar = v.f52489H;
        int l4 = vVar.l();
        int m4 = vVar.m();
        if (vVar.n() <= 0) {
            i4 = -i4;
        }
        return aVar.a(l4, m4, i4);
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final y T(@l3.d y yVar, long j4) {
        boolean z3;
        F.p(yVar, "<this>");
        if (j4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        t.a(z3, Long.valueOf(j4));
        y.a aVar = y.f52499H;
        long l4 = yVar.l();
        long m4 = yVar.m();
        if (yVar.n() <= 0) {
            j4 = -j4;
        }
        return aVar.a(l4, m4, j4);
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final x U(short s4, short s5) {
        if (F.t(s5 & D0.f51794H, 0) <= 0) {
            return x.f52497I.a();
        }
        return new x(t0.l(s4 & D0.f51794H), t0.l(t0.l(r3) - 1), null);
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static x V(int i4, int i5) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            return x.f52497I.a();
        }
        return new x(i4, t0.l(i5 - 1), null);
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final x W(byte b4, byte b5) {
        if (F.t(b5 & 255, 0) <= 0) {
            return x.f52497I.a();
        }
        return new x(t0.l(b4 & 255), t0.l(t0.l(r3) - 1), null);
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static A X(long j4, long j5) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            return A.f52445I.a();
        }
        return new A(j4, x0.l(j5 - x0.l(1 & 4294967295L)), null);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final short a(short s4, short s5) {
        if (F.t(s4 & D0.f51794H, 65535 & s5) < 0) {
            return s5;
        }
        return s4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final int b(int i4, int i5) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        if (compare < 0) {
            return i5;
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final byte c(byte b4, byte b5) {
        if (F.t(b4 & 255, b5 & 255) < 0) {
            return b5;
        }
        return b4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final long d(long j4, long j5) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        if (compare < 0) {
            return j5;
        }
        return j4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final short e(short s4, short s5) {
        if (F.t(s4 & D0.f51794H, 65535 & s5) > 0) {
            return s5;
        }
        return s4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final int f(int i4, int i5) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return i5;
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final byte g(byte b4, byte b5) {
        if (F.t(b4 & 255, b5 & 255) > 0) {
            return b5;
        }
        return b4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final long h(long j4, long j5) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        if (compare > 0) {
            return j5;
        }
        return j4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final long i(long j4, @l3.d g<x0> range) {
        int compare;
        int compare2;
        F.p(range, "range");
        if (range instanceof f) {
            return ((x0) u.N(x0.e(j4), (f) range)).l0();
        }
        if (!range.isEmpty()) {
            compare = Long.compare(j4 ^ Long.MIN_VALUE, range.c().l0() ^ Long.MIN_VALUE);
            if (compare >= 0) {
                compare2 = Long.compare(j4 ^ Long.MIN_VALUE, range.k().l0() ^ Long.MIN_VALUE);
                if (compare2 > 0) {
                    return range.k().l0();
                }
                return j4;
            }
            return range.c().l0();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final short j(short s4, short s5, short s6) {
        int i4 = s5 & D0.f51794H;
        int i5 = s6 & D0.f51794H;
        if (F.t(i4, i5) <= 0) {
            int i6 = 65535 & s4;
            if (F.t(i6, i4) < 0) {
                return s5;
            }
            if (F.t(i6, i5) > 0) {
                return s6;
            }
            return s4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) D0.e0(s6)) + " is less than minimum " + ((Object) D0.e0(s5)) + '.');
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final int k(int i4, int i5, int i6) {
        int compare;
        int compare2;
        int compare3;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
            if (compare2 >= 0) {
                compare3 = Integer.compare(i4 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
                if (compare3 > 0) {
                    return i6;
                }
                return i4;
            }
            return i5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) t0.g0(i6)) + " is less than minimum " + ((Object) t0.g0(i5)) + '.');
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final byte l(byte b4, byte b5, byte b6) {
        int i4 = b5 & 255;
        int i5 = b6 & 255;
        if (F.t(i4, i5) <= 0) {
            int i6 = b4 & 255;
            if (F.t(i6, i4) < 0) {
                return b5;
            }
            if (F.t(i6, i5) > 0) {
                return b6;
            }
            return b4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) p0.e0(b6)) + " is less than minimum " + ((Object) p0.e0(b5)) + '.');
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final long m(long j4, long j5, long j6) {
        int compare;
        int compare2;
        int compare3;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            if (compare2 >= 0) {
                compare3 = Long.compare(j4 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
                if (compare3 > 0) {
                    return j6;
                }
                return j4;
            }
            return j5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) x0.g0(j6)) + " is less than minimum " + ((Object) x0.g0(j5)) + '.');
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final int n(int i4, @l3.d g<t0> range) {
        int compare;
        int compare2;
        F.p(range, "range");
        if (range instanceof f) {
            return ((t0) u.N(t0.e(i4), (f) range)).l0();
        }
        if (!range.isEmpty()) {
            compare = Integer.compare(i4 ^ Integer.MIN_VALUE, range.c().l0() ^ Integer.MIN_VALUE);
            if (compare >= 0) {
                compare2 = Integer.compare(i4 ^ Integer.MIN_VALUE, range.k().l0() ^ Integer.MIN_VALUE);
                if (compare2 > 0) {
                    return range.k().l0();
                }
                return i4;
            }
            return range.c().l0();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final boolean o(@l3.d x contains, byte b4) {
        F.p(contains, "$this$contains");
        return contains.p(t0.l(b4 & 255));
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final boolean p(A contains, x0 x0Var) {
        F.p(contains, "$this$contains");
        if (x0Var != null && contains.p(x0Var.l0())) {
            return true;
        }
        return false;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final boolean q(@l3.d A contains, int i4) {
        F.p(contains, "$this$contains");
        return contains.p(x0.l(i4 & 4294967295L));
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final boolean r(@l3.d A contains, byte b4) {
        F.p(contains, "$this$contains");
        return contains.p(x0.l(b4 & 255));
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final boolean s(@l3.d x contains, short s4) {
        F.p(contains, "$this$contains");
        return contains.p(t0.l(s4 & D0.f51794H));
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final boolean t(x contains, t0 t0Var) {
        F.p(contains, "$this$contains");
        if (t0Var != null && contains.p(t0Var.l0())) {
            return true;
        }
        return false;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final boolean u(@l3.d x contains, long j4) {
        F.p(contains, "$this$contains");
        if (x0.l(j4 >>> 32) == 0 && contains.p(t0.l((int) j4))) {
            return true;
        }
        return false;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final boolean v(@l3.d A contains, short s4) {
        F.p(contains, "$this$contains");
        return contains.p(x0.l(s4 & 65535));
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final v w(short s4, short s5) {
        return v.f52489H.a(t0.l(s4 & D0.f51794H), t0.l(s5 & D0.f51794H), -1);
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final v x(int i4, int i5) {
        return v.f52489H.a(i4, i5, -1);
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final v y(byte b4, byte b5) {
        return v.f52489H.a(t0.l(b4 & 255), t0.l(b5 & 255), -1);
    }

    @l3.d
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final y z(long j4, long j5) {
        return y.f52499H.a(j4, j5, -1L);
    }
}
