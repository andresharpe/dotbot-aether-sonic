package q;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2394a {
    private C2394a() {
    }

    public static int a(int i4, int i5) {
        int i6 = i4 + i5;
        if (((i4 ^ i6) & (i5 ^ i6)) >= 0) {
            return i6;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long b(long j4, long j5) {
        long j6 = j4 + j5;
        if (((j4 ^ j6) & (j5 ^ j6)) >= 0) {
            return j6;
        }
        throw new ArithmeticException("long overflow");
    }

    public static double c(double d4, double d5, double d6) {
        if (d4 < d5) {
            return d5;
        }
        if (d4 > d6) {
            return d6;
        }
        return d4;
    }

    public static float d(float f4, float f5, float f6) {
        if (f4 < f5) {
            return f5;
        }
        if (f4 > f6) {
            return f6;
        }
        return f4;
    }

    public static int e(int i4, int i5, int i6) {
        if (i4 < i5) {
            return i5;
        }
        if (i4 > i6) {
            return i6;
        }
        return i4;
    }

    public static long f(long j4, long j5, long j6) {
        if (j4 < j5) {
            return j5;
        }
        if (j4 > j6) {
            return j6;
        }
        return j4;
    }

    public static int g(int i4) {
        if (i4 != Integer.MIN_VALUE) {
            return i4 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long h(long j4) {
        if (j4 != Long.MIN_VALUE) {
            return j4 - 1;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int i(int i4) {
        if (i4 != Integer.MAX_VALUE) {
            return i4 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long j(long j4) {
        if (j4 != Long.MAX_VALUE) {
            return j4 + 1;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int k(int i4, int i5) {
        long j4 = i4 * i5;
        int i6 = (int) j4;
        if (i6 == j4) {
            return i6;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long l(long j4, long j5) {
        long j6 = j4 * j5;
        if (((Math.abs(j4) | Math.abs(j5)) >>> 31) != 0 && ((j5 != 0 && j6 / j5 != j4) || (j4 == Long.MIN_VALUE && j5 == -1))) {
            throw new ArithmeticException("long overflow");
        }
        return j6;
    }

    public static int m(int i4) {
        if (i4 != Integer.MIN_VALUE) {
            return -i4;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long n(long j4) {
        if (j4 != Long.MIN_VALUE) {
            return -j4;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int o(int i4, int i5) {
        int i6 = i4 - i5;
        if (((i4 ^ i6) & (i5 ^ i4)) >= 0) {
            return i6;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long p(long j4, long j5) {
        long j6 = j4 - j5;
        if (((j4 ^ j6) & (j5 ^ j4)) >= 0) {
            return j6;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int q(long j4) {
        int i4 = (int) j4;
        if (i4 == j4) {
            return i4;
        }
        throw new ArithmeticException("integer overflow");
    }
}
