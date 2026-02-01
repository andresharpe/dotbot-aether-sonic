package kotlin.internal;

import kotlin.C2204k0;
import kotlin.C2206l0;
import kotlin.U;
import kotlin.Y;
import kotlin.t0;
import kotlin.x0;

/* loaded from: classes2.dex */
public final class q {
    private static final int a(int i4, int i5, int i6) {
        int compare;
        int a4 = C2204k0.a(i4, i6);
        int a5 = C2204k0.a(i5, i6);
        compare = Integer.compare(a4 ^ Integer.MIN_VALUE, a5 ^ Integer.MIN_VALUE);
        int l4 = t0.l(a4 - a5);
        if (compare < 0) {
            return t0.l(l4 + i6);
        }
        return l4;
    }

    private static final long b(long j4, long j5, long j6) {
        int compare;
        long a4 = C2206l0.a(j4, j6);
        long a5 = C2206l0.a(j5, j6);
        compare = Long.compare(a4 ^ Long.MIN_VALUE, a5 ^ Long.MIN_VALUE);
        long l4 = x0.l(a4 - a5);
        if (compare < 0) {
            return x0.l(l4 + j6);
        }
        return l4;
    }

    @U
    @Y(version = "1.3")
    public static final long c(long j4, long j5, long j6) {
        int compare;
        int compare2;
        if (j6 > 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return x0.l(j5 - b(j5, j4, x0.l(j6)));
            }
            return j5;
        }
        if (j6 < 0) {
            compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            if (compare > 0) {
                return x0.l(j5 + b(j4, j5, x0.l(-j6)));
            }
            return j5;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @U
    @Y(version = "1.3")
    public static final int d(int i4, int i5, int i6) {
        int compare;
        int compare2;
        if (i6 > 0) {
            compare2 = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return t0.l(i5 - a(i5, i4, t0.l(i6)));
            }
            return i5;
        }
        if (i6 < 0) {
            compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                return t0.l(i5 + a(i4, i5, t0.l(-i6)));
            }
            return i5;
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
