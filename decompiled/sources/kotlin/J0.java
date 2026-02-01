package kotlin;

import kotlin.text.C2220b;

@W2.i(name = "UnsignedKt")
/* loaded from: classes2.dex */
public final class J0 {
    @U
    public static final int a(double d4) {
        if (Double.isNaN(d4) || d4 <= f(0)) {
            return 0;
        }
        if (d4 >= f(-1)) {
            return -1;
        }
        if (d4 <= 2.147483647E9d) {
            return t0.l((int) d4);
        }
        return t0.l(t0.l((int) (d4 - Integer.MAX_VALUE)) + t0.l(Integer.MAX_VALUE));
    }

    @U
    public static final long b(double d4) {
        if (Double.isNaN(d4) || d4 <= j(0L)) {
            return 0L;
        }
        if (d4 >= j(-1L)) {
            return -1L;
        }
        if (d4 < 9.223372036854776E18d) {
            return x0.l((long) d4);
        }
        return x0.l(x0.l((long) (d4 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @U
    public static final int c(int i4, int i5) {
        return kotlin.jvm.internal.F.t(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
    }

    @U
    public static final int d(int i4, int i5) {
        return t0.l((int) ((i4 & 4294967295L) / (i5 & 4294967295L)));
    }

    @U
    public static final int e(int i4, int i5) {
        return t0.l((int) ((i4 & 4294967295L) % (i5 & 4294967295L)));
    }

    @U
    public static final double f(int i4) {
        return (Integer.MAX_VALUE & i4) + (((i4 >>> 31) << 30) * 2);
    }

    @U
    public static final int g(long j4, long j5) {
        return kotlin.jvm.internal.F.u(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
    }

    @U
    public static final long h(long j4, long j5) {
        int compare;
        int compare2;
        if (j5 < 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return x0.l(0L);
            }
            return x0.l(1L);
        }
        if (j4 >= 0) {
            return x0.l(j4 / j5);
        }
        int i4 = 1;
        long j6 = ((j4 >>> 1) / j5) << 1;
        compare = Long.compare(x0.l(j4 - (j6 * j5)) ^ Long.MIN_VALUE, x0.l(j5) ^ Long.MIN_VALUE);
        if (compare < 0) {
            i4 = 0;
        }
        return x0.l(j6 + i4);
    }

    @U
    public static final long i(long j4, long j5) {
        int compare;
        int compare2;
        if (j5 < 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            if (compare2 >= 0) {
                return x0.l(j4 - j5);
            }
            return j4;
        }
        if (j4 >= 0) {
            return x0.l(j4 % j5);
        }
        long j6 = j4 - ((((j4 >>> 1) / j5) << 1) * j5);
        compare = Long.compare(x0.l(j6) ^ Long.MIN_VALUE, x0.l(j5) ^ Long.MIN_VALUE);
        if (compare < 0) {
            j5 = 0;
        }
        return x0.l(j6 - j5);
    }

    @U
    public static final double j(long j4) {
        return ((j4 >>> 11) * 2048) + (j4 & 2047);
    }

    @l3.d
    public static final String k(long j4) {
        return l(j4, 10);
    }

    @l3.d
    public static final String l(long j4, int i4) {
        int a4;
        int a5;
        int a6;
        if (j4 >= 0) {
            a6 = C2220b.a(i4);
            String l4 = Long.toString(j4, a6);
            kotlin.jvm.internal.F.o(l4, "toString(...)");
            return l4;
        }
        long j5 = i4;
        long j6 = ((j4 >>> 1) / j5) << 1;
        long j7 = j4 - (j6 * j5);
        if (j7 >= j5) {
            j7 -= j5;
            j6++;
        }
        StringBuilder sb = new StringBuilder();
        a4 = C2220b.a(i4);
        String l5 = Long.toString(j6, a4);
        kotlin.jvm.internal.F.o(l5, "toString(...)");
        sb.append(l5);
        a5 = C2220b.a(i4);
        String l6 = Long.toString(j7, a5);
        kotlin.jvm.internal.F.o(l6, "toString(...)");
        sb.append(l6);
        return sb.toString();
    }
}
