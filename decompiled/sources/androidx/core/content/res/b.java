package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.N;
import androidx.core.graphics.C0734z;
import androidx.core.view.C0823k0;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    static final float[][] f12333a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    static final float[][] f12334b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    static final float[] f12335c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    static final float[][] f12336d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(float f4) {
        float f5;
        boolean z3;
        float f6;
        if (f4 < 1.0f) {
            return C0823k0.f13589t;
        }
        if (f4 > 99.0f) {
            return -1;
        }
        float f7 = (f4 + 16.0f) / 116.0f;
        if (f4 > 8.0f) {
            f5 = f7 * f7 * f7;
        } else {
            f5 = f4 / 903.2963f;
        }
        float f8 = f7 * f7 * f7;
        if (f8 > 0.008856452f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            f6 = f8;
        } else {
            f6 = ((f7 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z3) {
            f8 = ((f7 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f12335c;
        return C0734z.g(f6 * fArr[0], f5 * fArr[1], f8 * fArr[2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(int i4) {
        return c(g(i4));
    }

    static float c(float f4) {
        float f5 = f4 / 100.0f;
        if (f5 <= 0.008856452f) {
            return f5 * 903.2963f;
        }
        return (((float) Math.cbrt(f5)) * 116.0f) - 16.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(float f4, float f5, float f6) {
        return f4 + ((f5 - f4) * f6);
    }

    static float e(int i4) {
        float pow;
        float f4 = i4 / 255.0f;
        if (f4 <= 0.04045f) {
            pow = f4 / 12.92f;
        } else {
            pow = (float) Math.pow((f4 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static float[] f(int i4) {
        float e4 = e(Color.red(i4));
        float e5 = e(Color.green(i4));
        float e6 = e(Color.blue(i4));
        float[][] fArr = f12336d;
        float[] fArr2 = fArr[0];
        float f4 = (fArr2[0] * e4) + (fArr2[1] * e5) + (fArr2[2] * e6);
        float[] fArr3 = fArr[1];
        float f5 = (fArr3[0] * e4) + (fArr3[1] * e5) + (fArr3[2] * e6);
        float[] fArr4 = fArr[2];
        return new float[]{f4, f5, (e4 * fArr4[0]) + (e5 * fArr4[1]) + (e6 * fArr4[2])};
    }

    static float g(int i4) {
        float e4 = e(Color.red(i4));
        float e5 = e(Color.green(i4));
        float e6 = e(Color.blue(i4));
        float[] fArr = f12336d[1];
        return (e4 * fArr[0]) + (e5 * fArr[1]) + (e6 * fArr[2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float h(float f4) {
        float f5;
        if (f4 > 8.0f) {
            f5 = (float) Math.pow((f4 + 16.0d) / 116.0d, 3.0d);
        } else {
            f5 = f4 / 903.2963f;
        }
        return f5 * 100.0f;
    }
}
