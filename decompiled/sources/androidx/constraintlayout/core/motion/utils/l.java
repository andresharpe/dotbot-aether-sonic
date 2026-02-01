package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
public class l {

    /* renamed from: i, reason: collision with root package name */
    public static String f7241i = "Oscillator";

    /* renamed from: j, reason: collision with root package name */
    public static final int f7242j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f7243k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f7244l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static final int f7245m = 3;

    /* renamed from: n, reason: collision with root package name */
    public static final int f7246n = 4;

    /* renamed from: o, reason: collision with root package name */
    public static final int f7247o = 5;

    /* renamed from: p, reason: collision with root package name */
    public static final int f7248p = 6;

    /* renamed from: q, reason: collision with root package name */
    public static final int f7249q = 7;

    /* renamed from: c, reason: collision with root package name */
    double[] f7252c;

    /* renamed from: d, reason: collision with root package name */
    String f7253d;

    /* renamed from: e, reason: collision with root package name */
    k f7254e;

    /* renamed from: f, reason: collision with root package name */
    int f7255f;

    /* renamed from: a, reason: collision with root package name */
    float[] f7250a = new float[0];

    /* renamed from: b, reason: collision with root package name */
    double[] f7251b = new double[0];

    /* renamed from: g, reason: collision with root package name */
    double f7256g = 6.283185307179586d;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7257h = false;

    public void a(double d4, float f4) {
        int length = this.f7250a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f7251b, d4);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f7251b = Arrays.copyOf(this.f7251b, length);
        this.f7250a = Arrays.copyOf(this.f7250a, length);
        this.f7252c = new double[length];
        double[] dArr = this.f7251b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f7251b[binarySearch] = d4;
        this.f7250a[binarySearch] = f4;
        this.f7257h = false;
    }

    double b(double d4) {
        if (d4 <= com.google.firebase.remoteconfig.l.f37524n) {
            d4 = 1.0E-5d;
        } else if (d4 >= 1.0d) {
            d4 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f7251b, d4);
        if (binarySearch > 0 || binarySearch == 0) {
            return com.google.firebase.remoteconfig.l.f37524n;
        }
        int i4 = -binarySearch;
        int i5 = i4 - 1;
        float[] fArr = this.f7250a;
        float f4 = fArr[i5];
        int i6 = i4 - 2;
        float f5 = fArr[i6];
        double[] dArr = this.f7251b;
        double d5 = dArr[i5];
        double d6 = dArr[i6];
        double d7 = (f4 - f5) / (d5 - d6);
        return (d4 * d7) + (f5 - (d7 * d6));
    }

    double c(double d4) {
        if (d4 < com.google.firebase.remoteconfig.l.f37524n) {
            d4 = 0.0d;
        } else if (d4 > 1.0d) {
            d4 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f7251b, d4);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return com.google.firebase.remoteconfig.l.f37524n;
        }
        int i4 = -binarySearch;
        int i5 = i4 - 1;
        float[] fArr = this.f7250a;
        float f4 = fArr[i5];
        int i6 = i4 - 2;
        float f5 = fArr[i6];
        double[] dArr = this.f7251b;
        double d5 = dArr[i5];
        double d6 = dArr[i6];
        double d7 = (f4 - f5) / (d5 - d6);
        return this.f7252c[i6] + ((f5 - (d7 * d6)) * (d4 - d6)) + ((d7 * ((d4 * d4) - (d6 * d6))) / 2.0d);
    }

    public double d(double d4, double d5, double d6) {
        double c4 = d5 + c(d4);
        double b4 = b(d4) + d6;
        switch (this.f7255f) {
            case 1:
                return com.google.firebase.remoteconfig.l.f37524n;
            case 2:
                return b4 * 4.0d * Math.signum((((c4 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return b4 * 2.0d;
            case 4:
                return (-b4) * 2.0d;
            case 5:
                double d7 = this.f7256g;
                return (-d7) * b4 * Math.sin(d7 * c4);
            case 6:
                return b4 * 4.0d * ((((c4 * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f7254e.f(c4 % 1.0d, 0);
            default:
                double d8 = this.f7256g;
                return b4 * d8 * Math.cos(d8 * c4);
        }
    }

    public double e(double d4, double d5) {
        double abs;
        double c4 = c(d4) + d5;
        switch (this.f7255f) {
            case 1:
                return Math.signum(0.5d - (c4 % 1.0d));
            case 2:
                abs = Math.abs((((c4 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c4 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((c4 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f7256g * (d5 + c4));
            case 6:
                double abs2 = 1.0d - Math.abs(((c4 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f7254e.c(c4 % 1.0d, 0);
            default:
                return Math.sin(this.f7256g * c4);
        }
        return 1.0d - abs;
    }

    public void f() {
        double d4 = 0.0d;
        int i4 = 0;
        while (true) {
            if (i4 >= this.f7250a.length) {
                break;
            }
            d4 += r7[i4];
            i4++;
        }
        double d5 = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr = this.f7250a;
            if (i5 >= fArr.length) {
                break;
            }
            int i6 = i5 - 1;
            float f4 = (fArr[i6] + fArr[i5]) / 2.0f;
            double[] dArr = this.f7251b;
            d5 += (dArr[i5] - dArr[i6]) * f4;
            i5++;
        }
        int i7 = 0;
        while (true) {
            float[] fArr2 = this.f7250a;
            if (i7 >= fArr2.length) {
                break;
            }
            fArr2[i7] = (float) (fArr2[i7] * (d4 / d5));
            i7++;
        }
        this.f7252c[0] = 0.0d;
        int i8 = 1;
        while (true) {
            float[] fArr3 = this.f7250a;
            if (i8 < fArr3.length) {
                int i9 = i8 - 1;
                float f5 = (fArr3[i9] + fArr3[i8]) / 2.0f;
                double[] dArr2 = this.f7251b;
                double d6 = dArr2[i8] - dArr2[i9];
                double[] dArr3 = this.f7252c;
                dArr3[i8] = dArr3[i9] + (d6 * f5);
                i8++;
            } else {
                this.f7257h = true;
                return;
            }
        }
    }

    public void g(int i4, String str) {
        this.f7255f = i4;
        this.f7253d = str;
        if (str != null) {
            this.f7254e = k.i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f7251b) + " period=" + Arrays.toString(this.f7250a);
    }
}
