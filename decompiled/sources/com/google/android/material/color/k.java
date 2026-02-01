package com.google.android.material.color;

import androidx.core.view.C0823k0;
import androidx.core.view.Q;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f32011a = {95.047f, 100.0f, 108.883f};

    private k() {
    }

    public static int a(int i4) {
        return i4 & 255;
    }

    public static float b(float f4) {
        if (f4 <= 0.0031308f) {
            return f4 * 12.92f;
        }
        return (((float) Math.pow(f4, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int c(int i4) {
        return (i4 & Q.f13201f) >> 8;
    }

    public static String d(int i4) {
        int m4 = m(i4);
        int a4 = a(i4);
        return String.format("#%02x%02x%02x", Integer.valueOf(m4), Integer.valueOf(c(i4)), Integer.valueOf(a4));
    }

    public static int e(double d4, double d5, double d6) {
        double d7;
        double d8 = (d4 + 16.0d) / 116.0d;
        double d9 = (d5 / 500.0d) + d8;
        double d10 = d8 - (d6 / 200.0d);
        double d11 = d9 * d9 * d9;
        if (d11 <= 0.008856451679035631d) {
            d11 = ((d9 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        if (d4 > 8.0d) {
            d7 = d8 * d8 * d8;
        } else {
            d7 = d4 / 903.2962962962963d;
        }
        double d12 = d10 * d10 * d10;
        if (d12 <= 0.008856451679035631d) {
            d12 = ((d10 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        float[] fArr = f32011a;
        return i((float) (d11 * fArr[0]), (float) (d7 * fArr[1]), (float) (d12 * fArr[2]));
    }

    public static int f(float f4) {
        boolean z3;
        float f5;
        float f6;
        float f7 = (f4 + 16.0f) / 116.0f;
        float f8 = f7 * f7 * f7;
        if (f8 > 0.008856452f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (f4 > 8.0f) {
            f5 = f8;
        } else {
            f5 = f4 / 903.2963f;
        }
        if (z3) {
            f6 = f8;
        } else {
            f6 = ((f7 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z3) {
            f8 = ((f7 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f32011a;
        return h(new float[]{f6 * fArr[0], f5 * fArr[1], f8 * fArr[2]});
    }

    public static int g(int i4, int i5, int i6) {
        return ((i4 & 255) << 16) | C0823k0.f13589t | ((i5 & 255) << 8) | (i6 & 255);
    }

    public static int h(float[] fArr) {
        return i(fArr[0], fArr[1], fArr[2]);
    }

    public static int i(float f4, float f5, float f6) {
        float f7 = f4 / 100.0f;
        float f8 = f5 / 100.0f;
        float f9 = f6 / 100.0f;
        float f10 = (3.2406f * f7) + ((-1.5372f) * f8) + ((-0.4986f) * f9);
        float f11 = ((-0.9689f) * f7) + (1.8758f * f8) + (0.0415f * f9);
        float f12 = (f7 * 0.0557f) + (f8 * (-0.204f)) + (f9 * 1.057f);
        return g(Math.max(Math.min(255, Math.round(b(f10) * 255.0f)), 0), Math.max(Math.min(255, Math.round(b(f11) * 255.0f)), 0), Math.max(Math.min(255, Math.round(b(f12) * 255.0f)), 0));
    }

    public static double[] j(int i4) {
        double d4;
        double d5;
        double d6;
        float[] o4 = o(i4);
        float f4 = o4[1];
        float[] fArr = f32011a;
        double d7 = f4 / fArr[1];
        if (d7 > 0.008856451679035631d) {
            d4 = Math.cbrt(d7);
        } else {
            d4 = ((d7 * 903.2962962962963d) + 16.0d) / 116.0d;
        }
        double d8 = o4[0] / fArr[0];
        if (d8 > 0.008856451679035631d) {
            d5 = Math.cbrt(d8);
        } else {
            d5 = ((d8 * 903.2962962962963d) + 16.0d) / 116.0d;
        }
        double d9 = o4[2] / fArr[2];
        if (d9 > 0.008856451679035631d) {
            d6 = Math.cbrt(d9);
        } else {
            d6 = ((d9 * 903.2962962962963d) + 16.0d) / 116.0d;
        }
        return new double[]{(116.0d * d4) - 16.0d, (d5 - d4) * 500.0d, (d4 - d6) * 200.0d};
    }

    public static float k(float f4) {
        if (f4 <= 0.04045f) {
            return f4 / 12.92f;
        }
        return (float) Math.pow((f4 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float l(int i4) {
        return (float) j(i4)[0];
    }

    public static int m(int i4) {
        return (i4 & 16711680) >> 16;
    }

    public static final float[] n() {
        return Arrays.copyOf(f32011a, 3);
    }

    public static float[] o(int i4) {
        float k4 = k(m(i4) / 255.0f) * 100.0f;
        float k5 = k(c(i4) / 255.0f) * 100.0f;
        float k6 = k(a(i4) / 255.0f) * 100.0f;
        return new float[]{(0.41233894f * k4) + (0.35762063f * k5) + (0.18051042f * k6), (0.2126f * k4) + (0.7152f * k5) + (0.0722f * k6), (k4 * 0.01932141f) + (k5 * 0.11916382f) + (k6 * 0.9503448f)};
    }

    public static float p(float f4) {
        float f5;
        if (f4 > 8.0f) {
            f5 = (float) Math.pow((f4 + 16.0d) / 116.0d, 3.0d);
        } else {
            f5 = f4 / 903.2963f;
        }
        return f5 * 100.0f;
    }
}
