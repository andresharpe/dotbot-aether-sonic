package kotlin.random;

import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.ranges.l;
import kotlin.ranges.o;

@U({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes2.dex */
public final class f {
    @l3.d
    @Y(version = "1.3")
    public static final Random a(int i4) {
        return new XorWowRandom(i4, i4 >> 31);
    }

    @l3.d
    @Y(version = "1.3")
    public static final Random b(long j4) {
        return new XorWowRandom((int) j4, (int) (j4 >> 32));
    }

    @l3.d
    public static final String c(@l3.d Object from, @l3.d Object until) {
        F.p(from, "from");
        F.p(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void d(double d4, double d5) {
        if (d5 > d4) {
        } else {
            throw new IllegalArgumentException(c(Double.valueOf(d4), Double.valueOf(d5)).toString());
        }
    }

    public static final void e(int i4, int i5) {
        if (i5 > i4) {
        } else {
            throw new IllegalArgumentException(c(Integer.valueOf(i4), Integer.valueOf(i5)).toString());
        }
    }

    public static final void f(long j4, long j5) {
        if (j5 > j4) {
        } else {
            throw new IllegalArgumentException(c(Long.valueOf(j4), Long.valueOf(j5)).toString());
        }
    }

    public static final int g(int i4) {
        return 31 - Integer.numberOfLeadingZeros(i4);
    }

    @Y(version = "1.3")
    public static final int h(@l3.d Random random, @l3.d l range) {
        F.p(random, "<this>");
        F.p(range, "range");
        if (!range.isEmpty()) {
            if (range.m() < Integer.MAX_VALUE) {
                return random.n(range.l(), range.m() + 1);
            }
            if (range.l() > Integer.MIN_VALUE) {
                return random.n(range.l() - 1, range.m()) + 1;
            }
            return random.l();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @Y(version = "1.3")
    public static final long i(@l3.d Random random, @l3.d o range) {
        F.p(random, "<this>");
        F.p(range, "range");
        if (!range.isEmpty()) {
            if (range.m() < Long.MAX_VALUE) {
                return random.q(range.l(), range.m() + 1);
            }
            if (range.l() > Long.MIN_VALUE) {
                return random.q(range.l() - 1, range.m()) + 1;
            }
            return random.o();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int j(int i4, int i5) {
        return (i4 >>> (32 - i5)) & ((-i5) >> 31);
    }
}
