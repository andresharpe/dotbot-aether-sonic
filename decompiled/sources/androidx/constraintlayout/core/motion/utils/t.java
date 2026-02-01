package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.utils.i;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: k, reason: collision with root package name */
    private static final String f7310k = "SplineSet";

    /* renamed from: l, reason: collision with root package name */
    protected static final int f7311l = 0;

    /* renamed from: m, reason: collision with root package name */
    protected static final int f7312m = 1;

    /* renamed from: n, reason: collision with root package name */
    protected static final int f7313n = 2;

    /* renamed from: o, reason: collision with root package name */
    protected static float f7314o = 6.2831855f;

    /* renamed from: a, reason: collision with root package name */
    protected androidx.constraintlayout.core.motion.utils.b f7315a;

    /* renamed from: e, reason: collision with root package name */
    protected int f7319e;

    /* renamed from: f, reason: collision with root package name */
    protected String f7320f;

    /* renamed from: i, reason: collision with root package name */
    protected long f7323i;

    /* renamed from: b, reason: collision with root package name */
    protected int f7316b = 0;

    /* renamed from: c, reason: collision with root package name */
    protected int[] f7317c = new int[10];

    /* renamed from: d, reason: collision with root package name */
    protected float[][] f7318d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: g, reason: collision with root package name */
    protected float[] f7321g = new float[3];

    /* renamed from: h, reason: collision with root package name */
    protected boolean f7322h = false;

    /* renamed from: j, reason: collision with root package name */
    protected float f7324j = Float.NaN;

    /* loaded from: classes.dex */
    public static class a extends t {

        /* renamed from: p, reason: collision with root package name */
        String f7325p;

        /* renamed from: q, reason: collision with root package name */
        i.a f7326q;

        /* renamed from: r, reason: collision with root package name */
        i.c f7327r = new i.c();

        /* renamed from: s, reason: collision with root package name */
        float[] f7328s;

        /* renamed from: t, reason: collision with root package name */
        float[] f7329t;

        public a(String str, i.a aVar) {
            this.f7325p = str.split(",")[1];
            this.f7326q = aVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void c(int i4, float f4, float f5, int i5, float f6) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void f(int i4) {
            int f4 = this.f7326q.f();
            int h4 = this.f7326q.g(0).h();
            double[] dArr = new double[f4];
            int i5 = h4 + 2;
            this.f7328s = new float[i5];
            this.f7329t = new float[h4];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, f4, i5);
            for (int i6 = 0; i6 < f4; i6++) {
                int d4 = this.f7326q.d(i6);
                CustomAttribute g4 = this.f7326q.g(i6);
                float[] g5 = this.f7327r.g(i6);
                dArr[i6] = d4 * 0.01d;
                g4.e(this.f7328s);
                int i7 = 0;
                while (true) {
                    if (i7 < this.f7328s.length) {
                        dArr2[i6][i7] = r7[i7];
                        i7++;
                    }
                }
                double[] dArr3 = dArr2[i6];
                dArr3[h4] = g5[0];
                dArr3[h4 + 1] = g5[1];
            }
            this.f7315a = androidx.constraintlayout.core.motion.utils.b.a(i4, dArr, dArr2);
        }

        public void g(int i4, CustomAttribute customAttribute, float f4, int i5, float f5) {
            this.f7326q.a(i4, customAttribute);
            this.f7327r.a(i4, new float[]{f4, f5});
            this.f7316b = Math.max(this.f7316b, i5);
        }

        public boolean h(androidx.constraintlayout.core.motion.e eVar, float f4, long j4, g gVar) {
            boolean z3;
            this.f7315a.e(f4, this.f7328s);
            float[] fArr = this.f7328s;
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            long j5 = j4 - this.f7323i;
            if (Float.isNaN(this.f7324j)) {
                float a4 = gVar.a(eVar, this.f7325p, 0);
                this.f7324j = a4;
                if (Float.isNaN(a4)) {
                    this.f7324j = 0.0f;
                }
            }
            float f7 = (float) ((this.f7324j + ((j5 * 1.0E-9d) * f5)) % 1.0d);
            this.f7324j = f7;
            this.f7323i = j4;
            float a5 = a(f7);
            this.f7322h = false;
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f7329t;
                if (i4 >= fArr2.length) {
                    break;
                }
                boolean z4 = this.f7322h;
                float f8 = this.f7328s[i4];
                if (f8 != com.google.firebase.remoteconfig.l.f37524n) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f7322h = z4 | z3;
                fArr2[i4] = (f8 * a5) + f6;
                i4++;
            }
            eVar.M(this.f7326q.g(0), this.f7329t);
            if (f5 != 0.0f) {
                this.f7322h = true;
            }
            return this.f7322h;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends t {

        /* renamed from: p, reason: collision with root package name */
        String f7330p;

        /* renamed from: q, reason: collision with root package name */
        i.b f7331q;

        /* renamed from: r, reason: collision with root package name */
        i.c f7332r = new i.c();

        /* renamed from: s, reason: collision with root package name */
        float[] f7333s;

        /* renamed from: t, reason: collision with root package name */
        float[] f7334t;

        public b(String str, i.b bVar) {
            this.f7330p = str.split(",")[1];
            this.f7331q = bVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void c(int i4, float f4, float f5, int i5, float f6) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void f(int i4) {
            int f4 = this.f7331q.f();
            int r4 = this.f7331q.g(0).r();
            double[] dArr = new double[f4];
            int i5 = r4 + 2;
            this.f7333s = new float[i5];
            this.f7334t = new float[r4];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, f4, i5);
            for (int i6 = 0; i6 < f4; i6++) {
                int d4 = this.f7331q.d(i6);
                androidx.constraintlayout.core.motion.a g4 = this.f7331q.g(i6);
                float[] g5 = this.f7332r.g(i6);
                dArr[i6] = d4 * 0.01d;
                g4.o(this.f7333s);
                int i7 = 0;
                while (true) {
                    if (i7 < this.f7333s.length) {
                        dArr2[i6][i7] = r7[i7];
                        i7++;
                    }
                }
                double[] dArr3 = dArr2[i6];
                dArr3[r4] = g5[0];
                dArr3[r4 + 1] = g5[1];
            }
            this.f7315a = androidx.constraintlayout.core.motion.utils.b.a(i4, dArr, dArr2);
        }

        public void g(int i4, androidx.constraintlayout.core.motion.a aVar, float f4, int i5, float f5) {
            this.f7331q.a(i4, aVar);
            this.f7332r.a(i4, new float[]{f4, f5});
            this.f7316b = Math.max(this.f7316b, i5);
        }

        public boolean h(androidx.constraintlayout.core.motion.e eVar, float f4, long j4, g gVar) {
            boolean z3;
            this.f7315a.e(f4, this.f7333s);
            float[] fArr = this.f7333s;
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            long j5 = j4 - this.f7323i;
            if (Float.isNaN(this.f7324j)) {
                float a4 = gVar.a(eVar, this.f7330p, 0);
                this.f7324j = a4;
                if (Float.isNaN(a4)) {
                    this.f7324j = 0.0f;
                }
            }
            float f7 = (float) ((this.f7324j + ((j5 * 1.0E-9d) * f5)) % 1.0d);
            this.f7324j = f7;
            this.f7323i = j4;
            float a5 = a(f7);
            this.f7322h = false;
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f7334t;
                if (i4 >= fArr2.length) {
                    break;
                }
                boolean z4 = this.f7322h;
                float f8 = this.f7333s[i4];
                if (f8 != com.google.firebase.remoteconfig.l.f37524n) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f7322h = z4 | z3;
                fArr2[i4] = (f8 * a5) + f6;
                i4++;
            }
            this.f7331q.g(0).w(eVar, this.f7334t);
            if (f5 != 0.0f) {
                this.f7322h = true;
            }
            return this.f7322h;
        }
    }

    /* loaded from: classes.dex */
    protected static class c {
        protected c() {
        }

        static void a(int[] iArr, float[][] fArr, int i4, int i5) {
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

        private static int b(int[] iArr, float[][] fArr, int i4, int i5) {
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

        private static void c(int[] iArr, float[][] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float[] fArr2 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = fArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float a(float f4) {
        float abs;
        switch (this.f7316b) {
            case 1:
                return Math.signum(f4 * f7314o);
            case 2:
                abs = Math.abs(f4);
                break;
            case 3:
                return (((f4 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f4 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f4 * f7314o);
            case 6:
                float abs2 = 1.0f - Math.abs(((f4 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f4 * f7314o);
        }
        return 1.0f - abs;
    }

    public androidx.constraintlayout.core.motion.utils.b b() {
        return this.f7315a;
    }

    public void c(int i4, float f4, float f5, int i5, float f6) {
        int[] iArr = this.f7317c;
        int i6 = this.f7319e;
        iArr[i6] = i4;
        float[] fArr = this.f7318d[i6];
        fArr[0] = f4;
        fArr[1] = f5;
        fArr[2] = f6;
        this.f7316b = Math.max(this.f7316b, i5);
        this.f7319e++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(long j4) {
        this.f7323i = j4;
    }

    public void e(String str) {
        this.f7320f = str;
    }

    public void f(int i4) {
        int i5 = this.f7319e;
        if (i5 == 0) {
            System.err.println("Error no points added to " + this.f7320f);
            return;
        }
        c.a(this.f7317c, this.f7318d, 0, i5 - 1);
        int i6 = 1;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f7317c;
            if (i6 >= iArr.length) {
                break;
            }
            if (iArr[i6] != iArr[i6 - 1]) {
                i7++;
            }
            i6++;
        }
        if (i7 == 0) {
            i7 = 1;
        }
        double[] dArr = new double[i7];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i7, 3);
        int i8 = 0;
        for (int i9 = 0; i9 < this.f7319e; i9++) {
            if (i9 > 0) {
                int[] iArr2 = this.f7317c;
                if (iArr2[i9] == iArr2[i9 - 1]) {
                }
            }
            dArr[i8] = this.f7317c[i9] * 0.01d;
            double[] dArr3 = dArr2[i8];
            float[] fArr = this.f7318d[i9];
            dArr3[0] = fArr[0];
            dArr3[1] = fArr[1];
            dArr3[2] = fArr[2];
            i8++;
        }
        this.f7315a = androidx.constraintlayout.core.motion.utils.b.a(i4, dArr, dArr2);
    }

    public String toString() {
        String str = this.f7320f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i4 = 0; i4 < this.f7319e; i4++) {
            str = str + "[" + this.f7317c[i4] + " , " + decimalFormat.format(this.f7318d[i4]) + "] ";
        }
        return str;
    }
}
