package kotlin.random;

import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.q0;
import kotlin.ranges.A;
import kotlin.ranges.x;
import kotlin.t0;
import kotlin.x0;

@U({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
/* loaded from: classes2.dex */
public final class g {
    public static final void a(int i4, int i5) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
        if (compare > 0) {
        } else {
            throw new IllegalArgumentException(f.c(t0.e(i4), t0.e(i5)).toString());
        }
    }

    public static final void b(long j4, long j5) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
        if (compare > 0) {
        } else {
            throw new IllegalArgumentException(f.c(x0.e(j4), x0.e(j5)).toString());
        }
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final byte[] c(@l3.d Random random, int i4) {
        F.p(random, "<this>");
        return q0.j(random.d(i4));
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final byte[] d(@l3.d Random nextUBytes, @l3.d byte[] array) {
        F.p(nextUBytes, "$this$nextUBytes");
        F.p(array, "array");
        nextUBytes.e(array);
        return array;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final byte[] e(@l3.d Random nextUBytes, @l3.d byte[] array, int i4, int i5) {
        F.p(nextUBytes, "$this$nextUBytes");
        F.p(array, "array");
        nextUBytes.f(array, i4, i5);
        return array;
    }

    public static /* synthetic */ byte[] f(Random random, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = q0.r(bArr);
        }
        return e(random, bArr, i4, i5);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final int g(@l3.d Random random) {
        F.p(random, "<this>");
        return t0.l(random.l());
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final int h(@l3.d Random random, @l3.d x range) {
        int compare;
        int compare2;
        F.p(random, "<this>");
        F.p(range, "range");
        if (!range.isEmpty()) {
            compare = Integer.compare(range.m() ^ Integer.MIN_VALUE, (-1) ^ Integer.MIN_VALUE);
            if (compare >= 0) {
                compare2 = Integer.compare(range.l() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
                if (compare2 > 0) {
                    return t0.l(i(random, t0.l(range.l() - 1), range.m()) + 1);
                }
                return g(random);
            }
            return i(random, range.l(), t0.l(range.m() + 1));
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final int i(@l3.d Random nextUInt, int i4, int i5) {
        F.p(nextUInt, "$this$nextUInt");
        a(i4, i5);
        return t0.l(nextUInt.n(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final int j(@l3.d Random nextUInt, int i4) {
        F.p(nextUInt, "$this$nextUInt");
        return i(nextUInt, 0, i4);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final long k(@l3.d Random random) {
        F.p(random, "<this>");
        return x0.l(random.o());
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final long l(@l3.d Random random, @l3.d A range) {
        int compare;
        int compare2;
        F.p(random, "<this>");
        F.p(range, "range");
        if (!range.isEmpty()) {
            compare = Long.compare(range.m() ^ Long.MIN_VALUE, (-1) ^ Long.MIN_VALUE);
            if (compare >= 0) {
                compare2 = Long.compare(range.l() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
                if (compare2 > 0) {
                    long j4 = 1 & 4294967295L;
                    return x0.l(n(random, x0.l(range.l() - x0.l(j4)), range.m()) + x0.l(j4));
                }
                return k(random);
            }
            return n(random, range.l(), x0.l(range.m() + x0.l(1 & 4294967295L)));
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final long m(@l3.d Random nextULong, long j4) {
        F.p(nextULong, "$this$nextULong");
        return n(nextULong, 0L, j4);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final long n(@l3.d Random nextULong, long j4, long j5) {
        F.p(nextULong, "$this$nextULong");
        b(j4, j5);
        return x0.l(nextULong.q(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}
