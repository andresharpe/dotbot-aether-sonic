package com.google.android.material.color;

/* loaded from: classes2.dex */
final class t {
    private t() {
    }

    static float a(float f4, float f5, float f6) {
        return Math.min(Math.max(f6, f4), f5);
    }

    public static float b(float f4, float f5) {
        return 180.0f - Math.abs(Math.abs(f4 - f5) - 180.0f);
    }

    public static float c(float f4, float f5, float f6) {
        return ((1.0f - f6) * f4) + (f6 * f5);
    }

    public static float d(float f4) {
        return f4 < 0.0f ? (f4 % 360.0f) + 360.0f : f4 >= 360.0f ? f4 % 360.0f : f4;
    }

    public static int e(int i4) {
        if (i4 < 0) {
            return (i4 % 360) + 360;
        }
        if (i4 >= 360) {
            return i4 % 360;
        }
        return i4;
    }

    static float f(float f4) {
        return (f4 * 180.0f) / 3.1415927f;
    }

    static float g(float f4) {
        return (f4 / 180.0f) * 3.1415927f;
    }
}
