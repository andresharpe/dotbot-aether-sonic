package kotlin.comparisons;

import kotlin.Y;
import kotlin.jvm.internal.F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class h extends g {
    @Y(version = "1.1")
    @kotlin.internal.f
    private static final byte I(byte b4, byte b5) {
        return (byte) Math.max((int) b4, (int) b5);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final byte J(byte b4, byte b5, byte b6) {
        return (byte) Math.max((int) b4, Math.max((int) b5, (int) b6));
    }

    @Y(version = "1.4")
    public static final byte K(byte b4, @l3.d byte... other) {
        F.p(other, "other");
        for (byte b5 : other) {
            b4 = (byte) Math.max((int) b4, (int) b5);
        }
        return b4;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final double L(double d4, double d5) {
        return Math.max(d4, d5);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final double M(double d4, double d5, double d6) {
        return Math.max(d4, Math.max(d5, d6));
    }

    @Y(version = "1.4")
    public static final double N(double d4, @l3.d double... other) {
        F.p(other, "other");
        for (double d5 : other) {
            d4 = Math.max(d4, d5);
        }
        return d4;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final float O(float f4, float f5) {
        return Math.max(f4, f5);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final float P(float f4, float f5, float f6) {
        return Math.max(f4, Math.max(f5, f6));
    }

    @Y(version = "1.4")
    public static final float Q(float f4, @l3.d float... other) {
        F.p(other, "other");
        for (float f5 : other) {
            f4 = Math.max(f4, f5);
        }
        return f4;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final int R(int i4, int i5) {
        return Math.max(i4, i5);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final int S(int i4, int i5, int i6) {
        return Math.max(i4, Math.max(i5, i6));
    }

    @Y(version = "1.4")
    public static final int T(int i4, @l3.d int... other) {
        F.p(other, "other");
        for (int i5 : other) {
            i4 = Math.max(i4, i5);
        }
        return i4;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final long U(long j4, long j5) {
        return Math.max(j4, j5);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final long V(long j4, long j5, long j6) {
        return Math.max(j4, Math.max(j5, j6));
    }

    @Y(version = "1.4")
    public static final long W(long j4, @l3.d long... other) {
        F.p(other, "other");
        for (long j5 : other) {
            j4 = Math.max(j4, j5);
        }
        return j4;
    }

    @l3.d
    @Y(version = "1.1")
    public static <T extends Comparable<? super T>> T X(@l3.d T a4, @l3.d T b4) {
        F.p(a4, "a");
        F.p(b4, "b");
        if (a4.compareTo(b4) < 0) {
            return b4;
        }
        return a4;
    }

    @l3.d
    @Y(version = "1.1")
    public static final <T extends Comparable<? super T>> T Y(@l3.d T a4, @l3.d T b4, @l3.d T c4) {
        F.p(a4, "a");
        F.p(b4, "b");
        F.p(c4, "c");
        return (T) a.X(a4, a.X(b4, c4));
    }

    @l3.d
    @Y(version = "1.4")
    public static final <T extends Comparable<? super T>> T Z(@l3.d T a4, @l3.d T... other) {
        F.p(a4, "a");
        F.p(other, "other");
        for (T t3 : other) {
            a4 = (T) a.X(a4, t3);
        }
        return a4;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final short a0(short s4, short s5) {
        return (short) Math.max((int) s4, (int) s5);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final short b0(short s4, short s5, short s6) {
        return (short) Math.max((int) s4, Math.max((int) s5, (int) s6));
    }

    @Y(version = "1.4")
    public static final short c0(short s4, @l3.d short... other) {
        F.p(other, "other");
        for (short s5 : other) {
            s4 = (short) Math.max((int) s4, (int) s5);
        }
        return s4;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final byte d0(byte b4, byte b5) {
        return (byte) Math.min((int) b4, (int) b5);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final byte e0(byte b4, byte b5, byte b6) {
        return (byte) Math.min((int) b4, Math.min((int) b5, (int) b6));
    }

    @Y(version = "1.4")
    public static final byte f0(byte b4, @l3.d byte... other) {
        F.p(other, "other");
        for (byte b5 : other) {
            b4 = (byte) Math.min((int) b4, (int) b5);
        }
        return b4;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final double g0(double d4, double d5) {
        return Math.min(d4, d5);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final double h0(double d4, double d5, double d6) {
        return Math.min(d4, Math.min(d5, d6));
    }

    @Y(version = "1.4")
    public static final double i0(double d4, @l3.d double... other) {
        F.p(other, "other");
        for (double d5 : other) {
            d4 = Math.min(d4, d5);
        }
        return d4;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final float j0(float f4, float f5) {
        return Math.min(f4, f5);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final float k0(float f4, float f5, float f6) {
        return Math.min(f4, Math.min(f5, f6));
    }

    @Y(version = "1.4")
    public static final float l0(float f4, @l3.d float... other) {
        F.p(other, "other");
        for (float f5 : other) {
            f4 = Math.min(f4, f5);
        }
        return f4;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final int m0(int i4, int i5) {
        return Math.min(i4, i5);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final int n0(int i4, int i5, int i6) {
        return Math.min(i4, Math.min(i5, i6));
    }

    @Y(version = "1.4")
    public static final int o0(int i4, @l3.d int... other) {
        F.p(other, "other");
        for (int i5 : other) {
            i4 = Math.min(i4, i5);
        }
        return i4;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final long p0(long j4, long j5) {
        return Math.min(j4, j5);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final long q0(long j4, long j5, long j6) {
        return Math.min(j4, Math.min(j5, j6));
    }

    @Y(version = "1.4")
    public static final long r0(long j4, @l3.d long... other) {
        F.p(other, "other");
        for (long j5 : other) {
            j4 = Math.min(j4, j5);
        }
        return j4;
    }

    @l3.d
    @Y(version = "1.1")
    public static final <T extends Comparable<? super T>> T s0(@l3.d T a4, @l3.d T b4) {
        F.p(a4, "a");
        F.p(b4, "b");
        if (a4.compareTo(b4) > 0) {
            return b4;
        }
        return a4;
    }

    @l3.d
    @Y(version = "1.1")
    public static final <T extends Comparable<? super T>> T t0(@l3.d T a4, @l3.d T b4, @l3.d T c4) {
        F.p(a4, "a");
        F.p(b4, "b");
        F.p(c4, "c");
        return (T) s0(a4, s0(b4, c4));
    }

    @l3.d
    @Y(version = "1.4")
    public static final <T extends Comparable<? super T>> T u0(@l3.d T a4, @l3.d T... other) {
        F.p(a4, "a");
        F.p(other, "other");
        for (T t3 : other) {
            a4 = (T) s0(a4, t3);
        }
        return a4;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final short v0(short s4, short s5) {
        return (short) Math.min((int) s4, (int) s5);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final short w0(short s4, short s5, short s6) {
        return (short) Math.min((int) s4, Math.min((int) s5, (int) s6));
    }

    @Y(version = "1.4")
    public static final short x0(short s4, @l3.d short... other) {
        F.p(other, "other");
        for (short s5 : other) {
            s4 = (short) Math.min((int) s4, (int) s5);
        }
        return s4;
    }
}
