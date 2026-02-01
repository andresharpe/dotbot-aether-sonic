package kotlin.time;

import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.time.e;

@U({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: classes2.dex */
public final class l {
    private static final long a(long j4, long j5, long j6) {
        if (e.d0(j5) && (j4 ^ j6) < 0) {
            throw new IllegalArgumentException("Summing infinities of different signs");
        }
        return j4;
    }

    private static final long b(long j4) {
        if (j4 < 0) {
            return e.f52872F.J();
        }
        return e.f52872F.q();
    }

    public static final boolean c(long j4) {
        return ((j4 - 1) | 1) == Long.MAX_VALUE;
    }

    public static final long d(long j4, @l3.d DurationUnit unit, long j5) {
        F.p(unit, "unit");
        long r02 = e.r0(j5, unit);
        if (((j4 - 1) | 1) == Long.MAX_VALUE) {
            return a(j4, j5, r02);
        }
        if ((1 | (r02 - 1)) == Long.MAX_VALUE) {
            return e(j4, unit, j5);
        }
        long j6 = j4 + r02;
        if (((j4 ^ j6) & (r02 ^ j6)) < 0) {
            if (j4 >= 0) {
                return Long.MAX_VALUE;
            }
            return Long.MIN_VALUE;
        }
        return j6;
    }

    private static final long e(long j4, DurationUnit durationUnit, long j5) {
        long p4 = e.p(j5, 2);
        long r02 = e.r0(p4, durationUnit);
        if ((1 | (r02 - 1)) == Long.MAX_VALUE) {
            return r02;
        }
        return d(d(j4, durationUnit, p4), durationUnit, e.g0(j5, p4));
    }

    public static final long f(long j4, long j5, @l3.d DurationUnit unit) {
        F.p(unit, "unit");
        if ((1 | (j5 - 1)) == Long.MAX_VALUE) {
            return e.y0(b(j5));
        }
        return g(j4, j5, unit);
    }

    private static final long g(long j4, long j5, DurationUnit durationUnit) {
        long j6 = j4 - j5;
        if (((j6 ^ j4) & (~(j6 ^ j5))) < 0) {
            DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
            if (durationUnit.compareTo(durationUnit2) < 0) {
                long b4 = i.b(1L, durationUnit2, durationUnit);
                long j7 = (j4 / b4) - (j5 / b4);
                long j8 = (j4 % b4) - (j5 % b4);
                e.a aVar = e.f52872F;
                return e.h0(g.n0(j7, durationUnit2), g.n0(j8, durationUnit));
            }
            return e.y0(b(j6));
        }
        return g.n0(j6, durationUnit);
    }

    public static final long h(long j4, long j5, @l3.d DurationUnit unit) {
        F.p(unit, "unit");
        if (((j5 - 1) | 1) == Long.MAX_VALUE) {
            if (j4 == j5) {
                return e.f52872F.W();
            }
            return e.y0(b(j5));
        }
        if ((1 | (j4 - 1)) == Long.MAX_VALUE) {
            return b(j4);
        }
        return g(j4, j5, unit);
    }
}
