package kotlin;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class I extends H {
    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int J(byte b4, byte b5) {
        int i4 = b4 / b5;
        if ((b4 ^ b5) < 0 && b5 * i4 != b4) {
            return i4 - 1;
        }
        return i4;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int K(byte b4, int i4) {
        int i5 = b4 / i4;
        if ((b4 ^ i4) < 0 && i4 * i5 != b4) {
            return i5 - 1;
        }
        return i5;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int L(byte b4, short s4) {
        int i4 = b4 / s4;
        if ((b4 ^ s4) < 0 && s4 * i4 != b4) {
            return i4 - 1;
        }
        return i4;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int M(int i4, byte b4) {
        int i5 = i4 / b4;
        if ((i4 ^ b4) < 0 && b4 * i5 != i4) {
            return i5 - 1;
        }
        return i5;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int N(int i4, int i5) {
        int i6 = i4 / i5;
        if ((i4 ^ i5) < 0 && i5 * i6 != i4) {
            return i6 - 1;
        }
        return i6;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int O(int i4, short s4) {
        int i5 = i4 / s4;
        if ((i4 ^ s4) < 0 && s4 * i5 != i4) {
            return i5 - 1;
        }
        return i5;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int P(short s4, byte b4) {
        int i4 = s4 / b4;
        if ((s4 ^ b4) < 0 && b4 * i4 != s4) {
            return i4 - 1;
        }
        return i4;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int Q(short s4, int i4) {
        int i5 = s4 / i4;
        if ((s4 ^ i4) < 0 && i4 * i5 != s4) {
            return i5 - 1;
        }
        return i5;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int R(short s4, short s5) {
        int i4 = s4 / s5;
        if ((s4 ^ s5) < 0 && s5 * i4 != s4) {
            return i4 - 1;
        }
        return i4;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long S(byte b4, long j4) {
        long j5 = b4;
        long j6 = j5 / j4;
        if ((j5 ^ j4) < 0 && j4 * j6 != j5) {
            return j6 - 1;
        }
        return j6;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long T(int i4, long j4) {
        long j5 = i4;
        long j6 = j5 / j4;
        if ((j5 ^ j4) < 0 && j4 * j6 != j5) {
            return j6 - 1;
        }
        return j6;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long U(long j4, byte b4) {
        long j5 = b4;
        long j6 = j4 / j5;
        if ((j4 ^ j5) < 0 && j5 * j6 != j4) {
            return j6 - 1;
        }
        return j6;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long V(long j4, int i4) {
        long j5 = i4;
        long j6 = j4 / j5;
        if ((j4 ^ j5) < 0 && j5 * j6 != j4) {
            return j6 - 1;
        }
        return j6;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long W(long j4, long j5) {
        long j6 = j4 / j5;
        if ((j4 ^ j5) < 0 && j5 * j6 != j4) {
            return j6 - 1;
        }
        return j6;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long X(long j4, short s4) {
        long j5 = s4;
        long j6 = j4 / j5;
        if ((j4 ^ j5) < 0 && j5 * j6 != j4) {
            return j6 - 1;
        }
        return j6;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long Y(short s4, long j4) {
        long j5 = s4;
        long j6 = j5 / j4;
        if ((j5 ^ j4) < 0 && j4 * j6 != j5) {
            return j6 - 1;
        }
        return j6;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final byte Z(byte b4, byte b5) {
        int i4 = b4 % b5;
        return (byte) (i4 + (b5 & (((i4 ^ b5) & ((-i4) | i4)) >> 31)));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final byte a0(int i4, byte b4) {
        int i5 = i4 % b4;
        return (byte) (i5 + (b4 & (((i5 ^ b4) & ((-i5) | i5)) >> 31)));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final byte b0(long j4, byte b4) {
        long j5 = j4 % b4;
        return (byte) (j5 + (r0 & (((j5 ^ r0) & ((-j5) | j5)) >> 63)));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final byte c0(short s4, byte b4) {
        int i4 = s4 % b4;
        return (byte) (i4 + (b4 & (((i4 ^ b4) & ((-i4) | i4)) >> 31)));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final double d0(double d4, double d5) {
        double d6 = d4 % d5;
        if (d6 != com.google.firebase.remoteconfig.l.f37524n && Math.signum(d6) != Math.signum(d5)) {
            return d6 + d5;
        }
        return d6;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final double e0(double d4, float f4) {
        double d5 = f4;
        double d6 = d4 % d5;
        if (d6 != com.google.firebase.remoteconfig.l.f37524n && Math.signum(d6) != Math.signum(d5)) {
            return d6 + d5;
        }
        return d6;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final double f0(float f4, double d4) {
        double d5 = f4 % d4;
        if (d5 != com.google.firebase.remoteconfig.l.f37524n && Math.signum(d5) != Math.signum(d4)) {
            return d5 + d4;
        }
        return d5;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final float g0(float f4, float f5) {
        float f6 = f4 % f5;
        if (f6 != 0.0f && Math.signum(f6) != Math.signum(f5)) {
            return f6 + f5;
        }
        return f6;
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int h0(byte b4, int i4) {
        int i5 = b4 % i4;
        return i5 + (i4 & (((i5 ^ i4) & ((-i5) | i5)) >> 31));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int i0(int i4, int i5) {
        int i6 = i4 % i5;
        return i6 + (i5 & (((i6 ^ i5) & ((-i6) | i6)) >> 31));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int j0(long j4, int i4) {
        long j5 = i4;
        long j6 = j4 % j5;
        return (int) (j6 + (j5 & (((j6 ^ j5) & ((-j6) | j6)) >> 63)));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int k0(short s4, int i4) {
        int i5 = s4 % i4;
        return i5 + (i4 & (((i5 ^ i4) & ((-i5) | i5)) >> 31));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long l0(byte b4, long j4) {
        long j5 = b4 % j4;
        return j5 + (j4 & (((j5 ^ j4) & ((-j5) | j5)) >> 63));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long m0(int i4, long j4) {
        long j5 = i4 % j4;
        return j5 + (j4 & (((j5 ^ j4) & ((-j5) | j5)) >> 63));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long n0(long j4, long j5) {
        long j6 = j4 % j5;
        return j6 + (j5 & (((j6 ^ j5) & ((-j6) | j6)) >> 63));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long o0(short s4, long j4) {
        long j5 = s4 % j4;
        return j5 + (j4 & (((j5 ^ j4) & ((-j5) | j5)) >> 63));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final short p0(byte b4, short s4) {
        int i4 = b4 % s4;
        return (short) (i4 + (s4 & (((i4 ^ s4) & ((-i4) | i4)) >> 31)));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final short q0(int i4, short s4) {
        int i5 = i4 % s4;
        return (short) (i5 + (s4 & (((i5 ^ s4) & ((-i5) | i5)) >> 31)));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final short r0(long j4, short s4) {
        long j5 = j4 % s4;
        return (short) (j5 + (r0 & (((j5 ^ r0) & ((-j5) | j5)) >> 63)));
    }

    @kotlin.internal.g
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final short s0(short s4, short s5) {
        int i4 = s4 % s5;
        return (short) (i4 + (s5 & (((i4 ^ s5) & ((-i4) | i4)) >> 31)));
    }
}
