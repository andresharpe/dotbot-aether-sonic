package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.utils.i;
import androidx.constraintlayout.core.motion.utils.v;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: f, reason: collision with root package name */
    private static final String f7266f = "SplineSet";

    /* renamed from: a, reason: collision with root package name */
    protected androidx.constraintlayout.core.motion.utils.b f7267a;

    /* renamed from: b, reason: collision with root package name */
    protected int[] f7268b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    protected float[] f7269c = new float[10];

    /* renamed from: d, reason: collision with root package name */
    private int f7270d;

    /* renamed from: e, reason: collision with root package name */
    private String f7271e;

    /* loaded from: classes.dex */
    private static class a extends o {

        /* renamed from: g, reason: collision with root package name */
        String f7272g;

        /* renamed from: h, reason: collision with root package name */
        long f7273h;

        a(String str, long j4) {
            this.f7272g = str;
            this.f7273h = j4;
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void h(v vVar, float f4) {
            vVar.c(vVar.a(this.f7272g), a(f4));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends o {

        /* renamed from: g, reason: collision with root package name */
        String f7274g;

        /* renamed from: h, reason: collision with root package name */
        i.a f7275h;

        /* renamed from: i, reason: collision with root package name */
        float[] f7276i;

        public b(String str, i.a aVar) {
            this.f7274g = str.split(",")[1];
            this.f7275h = aVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void g(int i4, float f4) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void j(int i4) {
            int f4 = this.f7275h.f();
            int h4 = this.f7275h.g(0).h();
            double[] dArr = new double[f4];
            this.f7276i = new float[h4];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, f4, h4);
            for (int i5 = 0; i5 < f4; i5++) {
                int d4 = this.f7275h.d(i5);
                CustomAttribute g4 = this.f7275h.g(i5);
                dArr[i5] = d4 * 0.01d;
                g4.e(this.f7276i);
                int i6 = 0;
                while (true) {
                    if (i6 < this.f7276i.length) {
                        dArr2[i5][i6] = r6[i6];
                        i6++;
                    }
                }
            }
            this.f7267a = androidx.constraintlayout.core.motion.utils.b.a(i4, dArr, dArr2);
        }

        public void k(int i4, CustomAttribute customAttribute) {
            this.f7275h.a(i4, customAttribute);
        }

        public void l(androidx.constraintlayout.core.state.s sVar, float f4) {
            this.f7267a.e(f4, this.f7276i);
            sVar.A(this.f7275h.g(0), this.f7276i);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends o {

        /* renamed from: g, reason: collision with root package name */
        String f7277g;

        /* renamed from: h, reason: collision with root package name */
        i.b f7278h;

        /* renamed from: i, reason: collision with root package name */
        float[] f7279i;

        public c(String str, i.b bVar) {
            this.f7277g = str.split(",")[1];
            this.f7278h = bVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void g(int i4, float f4) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void h(v vVar, float f4) {
            l((androidx.constraintlayout.core.motion.e) vVar, f4);
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void j(int i4) {
            int f4 = this.f7278h.f();
            int r4 = this.f7278h.g(0).r();
            double[] dArr = new double[f4];
            this.f7279i = new float[r4];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, f4, r4);
            for (int i5 = 0; i5 < f4; i5++) {
                int d4 = this.f7278h.d(i5);
                androidx.constraintlayout.core.motion.a g4 = this.f7278h.g(i5);
                dArr[i5] = d4 * 0.01d;
                g4.o(this.f7279i);
                int i6 = 0;
                while (true) {
                    if (i6 < this.f7279i.length) {
                        dArr2[i5][i6] = r6[i6];
                        i6++;
                    }
                }
            }
            this.f7267a = androidx.constraintlayout.core.motion.utils.b.a(i4, dArr, dArr2);
        }

        public void k(int i4, androidx.constraintlayout.core.motion.a aVar) {
            this.f7278h.a(i4, aVar);
        }

        public void l(androidx.constraintlayout.core.motion.e eVar, float f4) {
            this.f7267a.e(f4, this.f7279i);
            this.f7278h.g(0).w(eVar, this.f7279i);
        }
    }

    /* loaded from: classes.dex */
    private static class d {
        private d() {
        }

        static void a(int[] iArr, float[] fArr, int i4, int i5) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i5;
            iArr2[1] = i4;
            int i6 = 2;
            while (i6 > 0) {
                int i7 = iArr2[i6 - 1];
                int i8 = i6 - 2;
                int i9 = iArr2[i8];
                if (i7 < i9) {
                    int b4 = b(iArr, fArr, i7, i9);
                    iArr2[i8] = b4 - 1;
                    iArr2[i6 - 1] = i7;
                    int i10 = i6 + 1;
                    iArr2[i6] = i9;
                    i6 += 2;
                    iArr2[i10] = b4 + 1;
                } else {
                    i6 = i8;
                }
            }
        }

        private static int b(int[] iArr, float[] fArr, int i4, int i5) {
            int i6 = iArr[i5];
            int i7 = i4;
            while (i4 < i5) {
                if (iArr[i4] <= i6) {
                    c(iArr, fArr, i7, i4);
                    i7++;
                }
                i4++;
            }
            c(iArr, fArr, i7, i5);
            return i7;
        }

        private static void c(int[] iArr, float[] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float f4 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f4;
        }
    }

    public static o d(String str, i.a aVar) {
        return new b(str, aVar);
    }

    public static o e(String str, i.b bVar) {
        return new c(str, bVar);
    }

    public static o f(String str, long j4) {
        return new a(str, j4);
    }

    public float a(float f4) {
        return (float) this.f7267a.c(f4, 0);
    }

    public androidx.constraintlayout.core.motion.utils.b b() {
        return this.f7267a;
    }

    public float c(float f4) {
        return (float) this.f7267a.f(f4, 0);
    }

    public void g(int i4, float f4) {
        int[] iArr = this.f7268b;
        if (iArr.length < this.f7270d + 1) {
            this.f7268b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f7269c;
            this.f7269c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f7268b;
        int i5 = this.f7270d;
        iArr2[i5] = i4;
        this.f7269c[i5] = f4;
        this.f7270d = i5 + 1;
    }

    public void h(v vVar, float f4) {
        vVar.c(v.a.a(this.f7271e), a(f4));
    }

    public void i(String str) {
        this.f7271e = str;
    }

    public void j(int i4) {
        int i5 = this.f7270d;
        if (i5 == 0) {
            return;
        }
        d.a(this.f7268b, this.f7269c, 0, i5 - 1);
        int i6 = 1;
        for (int i7 = 1; i7 < this.f7270d; i7++) {
            int[] iArr = this.f7268b;
            if (iArr[i7 - 1] != iArr[i7]) {
                i6++;
            }
        }
        double[] dArr = new double[i6];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i6, 1);
        int i8 = 0;
        for (int i9 = 0; i9 < this.f7270d; i9++) {
            if (i9 > 0) {
                int[] iArr2 = this.f7268b;
                if (iArr2[i9] == iArr2[i9 - 1]) {
                }
            }
            dArr[i8] = this.f7268b[i9] * 0.01d;
            dArr2[i8][0] = this.f7269c[i9];
            i8++;
        }
        this.f7267a = androidx.constraintlayout.core.motion.utils.b.a(i4, dArr, dArr2);
    }

    public String toString() {
        String str = this.f7271e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i4 = 0; i4 < this.f7270d; i4++) {
            str = str + "[" + this.f7268b[i4] + " , " + decimalFormat.format(this.f7269c[i4]) + "] ";
        }
        return str;
    }
}
