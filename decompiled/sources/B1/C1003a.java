package b1;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1003a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f21150a = 1.0E-4f;

    private C1003a() {
    }

    public static float a(float f4, float f5, float f6, float f7) {
        return (float) Math.hypot(f6 - f4, f7 - f5);
    }

    public static float b(float f4, float f5, float f6, float f7, float f8, float f9) {
        return g(a(f4, f5, f6, f7), a(f4, f5, f8, f7), a(f4, f5, f8, f9), a(f4, f5, f6, f9));
    }

    public static float c(float f4, int i4) {
        float f5 = i4;
        int i5 = (int) (f4 / f5);
        if (Math.signum(f4) * f5 < 0.0f && i5 * i4 != f4) {
            i5--;
        }
        return f4 - (i5 * i4);
    }

    public static int d(int i4, int i5) {
        int i6 = i4 / i5;
        if ((i4 ^ i5) < 0 && i6 * i5 != i4) {
            i6--;
        }
        return i4 - (i6 * i5);
    }

    public static boolean e(float f4, float f5, float f6) {
        if (f4 + f6 >= f5) {
            return true;
        }
        return false;
    }

    public static float f(float f4, float f5, float f6) {
        return ((1.0f - f6) * f4) + (f6 * f5);
    }

    private static float g(float f4, float f5, float f6, float f7) {
        if (f4 <= f5 || f4 <= f6 || f4 <= f7) {
            if (f5 > f6 && f5 > f7) {
                return f5;
            }
            if (f6 > f7) {
                return f6;
            }
            return f7;
        }
        return f4;
    }
}
