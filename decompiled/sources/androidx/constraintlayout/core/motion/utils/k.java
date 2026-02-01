package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public class k extends b {

    /* renamed from: i, reason: collision with root package name */
    private static final String f7235i = "MonotonicCurveFit";

    /* renamed from: d, reason: collision with root package name */
    private double[] f7236d;

    /* renamed from: e, reason: collision with root package name */
    private double[][] f7237e;

    /* renamed from: f, reason: collision with root package name */
    private double[][] f7238f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7239g = true;

    /* renamed from: h, reason: collision with root package name */
    double[] f7240h;

    public k(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f7240h = new double[length2];
        int i4 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i4, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i5 = 0; i5 < length2; i5++) {
            int i6 = 0;
            while (i6 < i4) {
                int i7 = i6 + 1;
                double d4 = dArr[i7] - dArr[i6];
                double[] dArr5 = dArr3[i6];
                double d5 = (dArr2[i7][i5] - dArr2[i6][i5]) / d4;
                dArr5[i5] = d5;
                if (i6 == 0) {
                    dArr4[i6][i5] = d5;
                } else {
                    dArr4[i6][i5] = (dArr3[i6 - 1][i5] + d5) * 0.5d;
                }
                i6 = i7;
            }
            dArr4[i4][i5] = dArr3[length - 2][i5];
        }
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = 0; i9 < length2; i9++) {
                double d6 = dArr3[i8][i9];
                if (d6 == com.google.firebase.remoteconfig.l.f37524n) {
                    dArr4[i8][i9] = 0.0d;
                    dArr4[i8 + 1][i9] = 0.0d;
                } else {
                    double d7 = dArr4[i8][i9] / d6;
                    int i10 = i8 + 1;
                    double d8 = dArr4[i10][i9] / d6;
                    double hypot = Math.hypot(d7, d8);
                    if (hypot > 9.0d) {
                        double d9 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i8];
                        double[] dArr7 = dArr3[i8];
                        dArr6[i9] = d7 * d9 * dArr7[i9];
                        dArr4[i10][i9] = d9 * d8 * dArr7[i9];
                    }
                }
            }
        }
        this.f7236d = dArr;
        this.f7237e = dArr2;
        this.f7238f = dArr4;
    }

    public static k i(String str) {
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i4 = 0;
        while (indexOf2 != -1) {
            dArr[i4] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i4++;
        }
        dArr[i4] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        return j(Arrays.copyOf(dArr, i4 + 1));
    }

    private static k j(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d4 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            double d5 = dArr[i4];
            int i5 = i4 + length2;
            dArr2[i5][0] = d5;
            double d6 = i4 * d4;
            dArr3[i5] = d6;
            if (i4 > 0) {
                int i6 = (length2 * 2) + i4;
                dArr2[i6][0] = d5 + 1.0d;
                dArr3[i6] = d6 + 1.0d;
                int i7 = i4 - 1;
                dArr2[i7][0] = (d5 - 1.0d) - d4;
                dArr3[i7] = (d6 - 1.0d) - d4;
            }
        }
        return new k(dArr3, dArr2);
    }

    private static double k(double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d5 * d5;
        double d11 = d5 * 6.0d;
        double d12 = 3.0d * d4;
        return ((((((((((-6.0d) * d10) * d7) + (d11 * d7)) + ((6.0d * d10) * d6)) - (d11 * d6)) + ((d12 * d9) * d10)) + ((d12 * d8) * d10)) - (((2.0d * d4) * d9) * d5)) - (((4.0d * d4) * d8) * d5)) + (d4 * d8);
    }

    private static double l(double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d5 * d5;
        double d11 = d10 * d5;
        double d12 = 3.0d * d10;
        double d13 = ((((((-2.0d) * d11) * d7) + (d12 * d7)) + ((d11 * 2.0d) * d6)) - (d12 * d6)) + d6;
        double d14 = d4 * d9;
        double d15 = d4 * d8;
        return ((((d13 + (d14 * d11)) + (d11 * d15)) - (d14 * d10)) - (((d4 * 2.0d) * d8) * d10)) + (d15 * d5);
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double c(double d4, int i4) {
        double d5;
        double d6;
        double f4;
        double[] dArr = this.f7236d;
        int length = dArr.length;
        int i5 = 0;
        if (this.f7239g) {
            double d7 = dArr[0];
            if (d4 <= d7) {
                d5 = this.f7237e[0][i4];
                d6 = d4 - d7;
                f4 = f(d7, i4);
            } else {
                int i6 = length - 1;
                double d8 = dArr[i6];
                if (d4 >= d8) {
                    d5 = this.f7237e[i6][i4];
                    d6 = d4 - d8;
                    f4 = f(d8, i4);
                }
            }
            return d5 + (d6 * f4);
        }
        if (d4 <= dArr[0]) {
            return this.f7237e[0][i4];
        }
        int i7 = length - 1;
        if (d4 >= dArr[i7]) {
            return this.f7237e[i7][i4];
        }
        while (i5 < length - 1) {
            double[] dArr2 = this.f7236d;
            double d9 = dArr2[i5];
            if (d4 == d9) {
                return this.f7237e[i5][i4];
            }
            int i8 = i5 + 1;
            double d10 = dArr2[i8];
            if (d4 < d10) {
                double d11 = d10 - d9;
                double d12 = (d4 - d9) / d11;
                double[][] dArr3 = this.f7237e;
                double d13 = dArr3[i5][i4];
                double d14 = dArr3[i8][i4];
                double[][] dArr4 = this.f7238f;
                return l(d11, d12, d13, d14, dArr4[i5][i4], dArr4[i8][i4]);
            }
            i5 = i8;
        }
        return com.google.firebase.remoteconfig.l.f37524n;
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void d(double d4, double[] dArr) {
        double[] dArr2 = this.f7236d;
        int length = dArr2.length;
        int i4 = 0;
        int length2 = this.f7237e[0].length;
        if (this.f7239g) {
            double d5 = dArr2[0];
            if (d4 <= d5) {
                g(d5, this.f7240h);
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = this.f7237e[0][i5] + ((d4 - this.f7236d[0]) * this.f7240h[i5]);
                }
                return;
            }
            int i6 = length - 1;
            double d6 = dArr2[i6];
            if (d4 >= d6) {
                g(d6, this.f7240h);
                while (i4 < length2) {
                    dArr[i4] = this.f7237e[i6][i4] + ((d4 - this.f7236d[i6]) * this.f7240h[i4]);
                    i4++;
                }
                return;
            }
        } else {
            if (d4 <= dArr2[0]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f7237e[0][i7];
                }
                return;
            }
            int i8 = length - 1;
            if (d4 >= dArr2[i8]) {
                while (i4 < length2) {
                    dArr[i4] = this.f7237e[i8][i4];
                    i4++;
                }
                return;
            }
        }
        int i9 = 0;
        while (i9 < length - 1) {
            if (d4 == this.f7236d[i9]) {
                for (int i10 = 0; i10 < length2; i10++) {
                    dArr[i10] = this.f7237e[i9][i10];
                }
            }
            double[] dArr3 = this.f7236d;
            int i11 = i9 + 1;
            double d7 = dArr3[i11];
            if (d4 < d7) {
                double d8 = dArr3[i9];
                double d9 = d7 - d8;
                double d10 = (d4 - d8) / d9;
                while (i4 < length2) {
                    double[][] dArr4 = this.f7237e;
                    double d11 = dArr4[i9][i4];
                    double d12 = dArr4[i11][i4];
                    double[][] dArr5 = this.f7238f;
                    dArr[i4] = l(d9, d10, d11, d12, dArr5[i9][i4], dArr5[i11][i4]);
                    i4++;
                }
                return;
            }
            i9 = i11;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void e(double d4, float[] fArr) {
        double[] dArr = this.f7236d;
        int length = dArr.length;
        int i4 = 0;
        int length2 = this.f7237e[0].length;
        if (this.f7239g) {
            double d5 = dArr[0];
            if (d4 <= d5) {
                g(d5, this.f7240h);
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) (this.f7237e[0][i5] + ((d4 - this.f7236d[0]) * this.f7240h[i5]));
                }
                return;
            }
            int i6 = length - 1;
            double d6 = dArr[i6];
            if (d4 >= d6) {
                g(d6, this.f7240h);
                while (i4 < length2) {
                    fArr[i4] = (float) (this.f7237e[i6][i4] + ((d4 - this.f7236d[i6]) * this.f7240h[i4]));
                    i4++;
                }
                return;
            }
        } else {
            if (d4 <= dArr[0]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f7237e[0][i7];
                }
                return;
            }
            int i8 = length - 1;
            if (d4 >= dArr[i8]) {
                while (i4 < length2) {
                    fArr[i4] = (float) this.f7237e[i8][i4];
                    i4++;
                }
                return;
            }
        }
        int i9 = 0;
        while (i9 < length - 1) {
            if (d4 == this.f7236d[i9]) {
                for (int i10 = 0; i10 < length2; i10++) {
                    fArr[i10] = (float) this.f7237e[i9][i10];
                }
            }
            double[] dArr2 = this.f7236d;
            int i11 = i9 + 1;
            double d7 = dArr2[i11];
            if (d4 < d7) {
                double d8 = dArr2[i9];
                double d9 = d7 - d8;
                double d10 = (d4 - d8) / d9;
                while (i4 < length2) {
                    double[][] dArr3 = this.f7237e;
                    double d11 = dArr3[i9][i4];
                    double d12 = dArr3[i11][i4];
                    double[][] dArr4 = this.f7238f;
                    fArr[i4] = (float) l(d9, d10, d11, d12, dArr4[i9][i4], dArr4[i11][i4]);
                    i4++;
                }
                return;
            }
            i9 = i11;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double f(double d4, int i4) {
        double[] dArr = this.f7236d;
        int length = dArr.length;
        int i5 = 0;
        double d5 = dArr[0];
        if (d4 >= d5) {
            d5 = dArr[length - 1];
            if (d4 < d5) {
                d5 = d4;
            }
        }
        while (i5 < length - 1) {
            double[] dArr2 = this.f7236d;
            int i6 = i5 + 1;
            double d6 = dArr2[i6];
            if (d5 <= d6) {
                double d7 = dArr2[i5];
                double d8 = d6 - d7;
                double[][] dArr3 = this.f7237e;
                double d9 = dArr3[i5][i4];
                double d10 = dArr3[i6][i4];
                double[][] dArr4 = this.f7238f;
                return k(d8, (d5 - d7) / d8, d9, d10, dArr4[i5][i4], dArr4[i6][i4]) / d8;
            }
            i5 = i6;
        }
        return com.google.firebase.remoteconfig.l.f37524n;
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void g(double d4, double[] dArr) {
        double[] dArr2 = this.f7236d;
        int length = dArr2.length;
        int length2 = this.f7237e[0].length;
        double d5 = dArr2[0];
        if (d4 > d5) {
            d5 = dArr2[length - 1];
            if (d4 < d5) {
                d5 = d4;
            }
        }
        int i4 = 0;
        while (i4 < length - 1) {
            double[] dArr3 = this.f7236d;
            int i5 = i4 + 1;
            double d6 = dArr3[i5];
            if (d5 <= d6) {
                double d7 = dArr3[i4];
                double d8 = d6 - d7;
                double d9 = (d5 - d7) / d8;
                for (int i6 = 0; i6 < length2; i6++) {
                    double[][] dArr4 = this.f7237e;
                    double d10 = dArr4[i4][i6];
                    double d11 = dArr4[i5][i6];
                    double[][] dArr5 = this.f7238f;
                    dArr[i6] = k(d8, d9, d10, d11, dArr5[i4][i6], dArr5[i5][i6]) / d8;
                }
                return;
            }
            i4 = i5;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double[] h() {
        return this.f7236d;
    }
}
