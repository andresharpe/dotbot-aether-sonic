package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7140a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7141b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7142c = 2;

    /* loaded from: classes.dex */
    static class a extends b {

        /* renamed from: d, reason: collision with root package name */
        double f7143d;

        /* renamed from: e, reason: collision with root package name */
        double[] f7144e;

        a(double d4, double[] dArr) {
            this.f7143d = d4;
            this.f7144e = dArr;
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public double c(double d4, int i4) {
            return this.f7144e[i4];
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public void d(double d4, double[] dArr) {
            double[] dArr2 = this.f7144e;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public void e(double d4, float[] fArr) {
            int i4 = 0;
            while (true) {
                double[] dArr = this.f7144e;
                if (i4 < dArr.length) {
                    fArr[i4] = (float) dArr[i4];
                    i4++;
                } else {
                    return;
                }
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public double f(double d4, int i4) {
            return com.google.firebase.remoteconfig.l.f37524n;
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public void g(double d4, double[] dArr) {
            for (int i4 = 0; i4 < this.f7144e.length; i4++) {
                dArr[i4] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public double[] h() {
            return new double[]{this.f7143d};
        }
    }

    public static b a(int i4, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i4 = 2;
        }
        if (i4 != 0) {
            if (i4 != 2) {
                return new j(dArr, dArr2);
            }
            return new a(dArr[0], dArr2[0]);
        }
        return new k(dArr, dArr2);
    }

    public static b b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new androidx.constraintlayout.core.motion.utils.a(iArr, dArr, dArr2);
    }

    public abstract double c(double d4, int i4);

    public abstract void d(double d4, double[] dArr);

    public abstract void e(double d4, float[] fArr);

    public abstract double f(double d4, int i4);

    public abstract void g(double d4, double[] dArr);

    public abstract double[] h();
}
