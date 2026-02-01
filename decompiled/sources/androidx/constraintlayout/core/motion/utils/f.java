package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    int f7170a;

    /* renamed from: b, reason: collision with root package name */
    a[][] f7171b;

    /* renamed from: c, reason: collision with root package name */
    int f7172c;

    /* renamed from: d, reason: collision with root package name */
    double[] f7173d;

    /* renamed from: e, reason: collision with root package name */
    double f7174e;

    /* renamed from: f, reason: collision with root package name */
    double[][] f7175f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        double f7176a;

        /* renamed from: b, reason: collision with root package name */
        double f7177b;

        /* renamed from: c, reason: collision with root package name */
        double f7178c;

        /* renamed from: d, reason: collision with root package name */
        double f7179d;

        public a(double d4, double d5, double d6, double d7) {
            this.f7176a = d4;
            this.f7177b = d5;
            this.f7178c = d6;
            this.f7179d = d7;
        }

        public double a(double d4) {
            return (((((this.f7179d * d4) + this.f7178c) * d4) + this.f7177b) * d4) + this.f7176a;
        }

        public double b(double d4) {
            return (((this.f7179d * 3.0d * d4) + (this.f7178c * 2.0d)) * d4) + this.f7177b;
        }
    }

    public f(double[][] dArr) {
        g(dArr);
    }

    static a[] b(int i4, double[] dArr) {
        double[] dArr2 = new double[i4];
        double[] dArr3 = new double[i4];
        double[] dArr4 = new double[i4];
        int i5 = i4 - 1;
        int i6 = 0;
        dArr2[0] = 0.5d;
        int i7 = 1;
        for (int i8 = 1; i8 < i5; i8++) {
            dArr2[i8] = 1.0d / (4.0d - dArr2[i8 - 1]);
        }
        int i9 = i4 - 2;
        dArr2[i5] = 1.0d / (2.0d - dArr2[i9]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i7 < i5) {
            int i10 = i7 + 1;
            int i11 = i7 - 1;
            dArr3[i7] = (((dArr[i10] - dArr[i11]) * 3.0d) - dArr3[i11]) * dArr2[i7];
            i7 = i10;
        }
        double d4 = (((dArr[i5] - dArr[i9]) * 3.0d) - dArr3[i9]) * dArr2[i5];
        dArr3[i5] = d4;
        dArr4[i5] = d4;
        while (i9 >= 0) {
            dArr4[i9] = dArr3[i9] - (dArr2[i9] * dArr4[i9 + 1]);
            i9--;
        }
        a[] aVarArr = new a[i5];
        while (i6 < i5) {
            double d5 = dArr[i6];
            double d6 = dArr4[i6];
            int i12 = i6 + 1;
            double d7 = dArr[i12];
            double d8 = dArr4[i12];
            aVarArr[i6] = new a((float) d5, d6, (((d7 - d5) * 3.0d) - (d6 * 2.0d)) - d8, ((d5 - d7) * 2.0d) + d6 + d8);
            i6 = i12;
        }
        return aVarArr;
    }

    public double a(a[] aVarArr) {
        int i4;
        int length = aVarArr.length;
        double[] dArr = new double[aVarArr.length];
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        double d5 = 0.0d;
        double d6 = 0.0d;
        while (true) {
            i4 = 0;
            if (d5 >= 1.0d) {
                break;
            }
            double d7 = 0.0d;
            while (i4 < aVarArr.length) {
                double d8 = dArr[i4];
                double a4 = aVarArr[i4].a(d5);
                dArr[i4] = a4;
                double d9 = d8 - a4;
                d7 += d9 * d9;
                i4++;
            }
            if (d5 > com.google.firebase.remoteconfig.l.f37524n) {
                d6 += Math.sqrt(d7);
            }
            d5 += 0.1d;
        }
        while (i4 < aVarArr.length) {
            double d10 = dArr[i4];
            double a5 = aVarArr[i4].a(1.0d);
            dArr[i4] = a5;
            double d11 = d10 - a5;
            d4 += d11 * d11;
            i4++;
        }
        return d6 + Math.sqrt(d4);
    }

    public double c(double d4, int i4) {
        double[] dArr;
        double d5 = d4 * this.f7174e;
        int i5 = 0;
        while (true) {
            dArr = this.f7173d;
            if (i5 >= dArr.length - 1) {
                break;
            }
            double d6 = dArr[i5];
            if (d6 >= d5) {
                break;
            }
            d5 -= d6;
            i5++;
        }
        return this.f7171b[i4][i5].a(d5 / dArr[i5]);
    }

    public void d(double d4, double[] dArr) {
        double d5 = d4 * this.f7174e;
        int i4 = 0;
        while (true) {
            double[] dArr2 = this.f7173d;
            if (i4 >= dArr2.length - 1) {
                break;
            }
            double d6 = dArr2[i4];
            if (d6 >= d5) {
                break;
            }
            d5 -= d6;
            i4++;
        }
        for (int i5 = 0; i5 < dArr.length; i5++) {
            dArr[i5] = this.f7171b[i5][i4].a(d5 / this.f7173d[i4]);
        }
    }

    public void e(double d4, float[] fArr) {
        double d5 = d4 * this.f7174e;
        int i4 = 0;
        while (true) {
            double[] dArr = this.f7173d;
            if (i4 >= dArr.length - 1) {
                break;
            }
            double d6 = dArr[i4];
            if (d6 >= d5) {
                break;
            }
            d5 -= d6;
            i4++;
        }
        for (int i5 = 0; i5 < fArr.length; i5++) {
            fArr[i5] = (float) this.f7171b[i5][i4].a(d5 / this.f7173d[i4]);
        }
    }

    public void f(double d4, double[] dArr) {
        double d5 = d4 * this.f7174e;
        int i4 = 0;
        while (true) {
            double[] dArr2 = this.f7173d;
            if (i4 >= dArr2.length - 1) {
                break;
            }
            double d6 = dArr2[i4];
            if (d6 >= d5) {
                break;
            }
            d5 -= d6;
            i4++;
        }
        for (int i5 = 0; i5 < dArr.length; i5++) {
            dArr[i5] = this.f7171b[i5][i4].b(d5 / this.f7173d[i4]);
        }
    }

    public void g(double[][] dArr) {
        int i4;
        int length = dArr[0].length;
        this.f7172c = length;
        int length2 = dArr.length;
        this.f7170a = length2;
        this.f7175f = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.f7171b = new a[this.f7172c];
        for (int i5 = 0; i5 < this.f7172c; i5++) {
            for (int i6 = 0; i6 < this.f7170a; i6++) {
                this.f7175f[i5][i6] = dArr[i6][i5];
            }
        }
        int i7 = 0;
        while (true) {
            i4 = this.f7172c;
            if (i7 >= i4) {
                break;
            }
            a[][] aVarArr = this.f7171b;
            double[] dArr2 = this.f7175f[i7];
            aVarArr[i7] = b(dArr2.length, dArr2);
            i7++;
        }
        this.f7173d = new double[this.f7170a - 1];
        this.f7174e = com.google.firebase.remoteconfig.l.f37524n;
        a[] aVarArr2 = new a[i4];
        for (int i8 = 0; i8 < this.f7173d.length; i8++) {
            for (int i9 = 0; i9 < this.f7172c; i9++) {
                aVarArr2[i9] = this.f7171b[i9][i8];
            }
            double d4 = this.f7174e;
            double[] dArr3 = this.f7173d;
            double a4 = a(aVarArr2);
            dArr3[i8] = a4;
            this.f7174e = d4 + a4;
        }
    }

    public f() {
    }
}
