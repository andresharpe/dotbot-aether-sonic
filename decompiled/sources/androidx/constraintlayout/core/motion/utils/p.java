package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class p implements r {

    /* renamed from: l, reason: collision with root package name */
    private static final double f7280l = Double.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private double f7283c;

    /* renamed from: d, reason: collision with root package name */
    private double f7284d;

    /* renamed from: e, reason: collision with root package name */
    private double f7285e;

    /* renamed from: f, reason: collision with root package name */
    private float f7286f;

    /* renamed from: g, reason: collision with root package name */
    private float f7287g;

    /* renamed from: h, reason: collision with root package name */
    private float f7288h;

    /* renamed from: i, reason: collision with root package name */
    private float f7289i;

    /* renamed from: j, reason: collision with root package name */
    private float f7290j;

    /* renamed from: a, reason: collision with root package name */
    double f7281a = 0.5d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7282b = false;

    /* renamed from: k, reason: collision with root package name */
    private int f7291k = 0;

    private void e(double d4) {
        if (d4 <= com.google.firebase.remoteconfig.l.f37524n) {
            return;
        }
        double d5 = this.f7283c;
        double d6 = this.f7281a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d5 / this.f7289i) * d4) * 4.0d)) + 1.0d);
        double d7 = d4 / sqrt;
        int i4 = 0;
        while (i4 < sqrt) {
            float f4 = this.f7287g;
            double d8 = this.f7284d;
            float f5 = this.f7288h;
            double d9 = d5;
            double d10 = ((-d5) * (f4 - d8)) - (f5 * d6);
            float f6 = this.f7289i;
            double d11 = d6;
            double d12 = f5 + (((d10 / f6) * d7) / 2.0d);
            double d13 = ((((-((f4 + ((d7 * d12) / 2.0d)) - d8)) * d9) - (d12 * d11)) / f6) * d7;
            float f7 = (float) (f5 + d13);
            this.f7288h = f7;
            float f8 = (float) (f4 + ((f5 + (d13 / 2.0d)) * d7));
            this.f7287g = f8;
            int i5 = this.f7291k;
            if (i5 > 0) {
                if (f8 < 0.0f && (i5 & 1) == 1) {
                    this.f7287g = -f8;
                    this.f7288h = -f7;
                }
                float f9 = this.f7287g;
                if (f9 > 1.0f && (i5 & 2) == 2) {
                    this.f7287g = 2.0f - f9;
                    this.f7288h = -this.f7288h;
                }
            }
            i4++;
            d5 = d9;
            d6 = d11;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float a() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public String b(String str, float f4) {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float c(float f4) {
        return this.f7288h;
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public boolean d() {
        double d4 = this.f7287g - this.f7284d;
        double d5 = this.f7283c;
        double d6 = this.f7288h;
        if (Math.sqrt((((d6 * d6) * this.f7289i) + ((d5 * d4) * d4)) / d5) <= this.f7290j) {
            return true;
        }
        return false;
    }

    public float f() {
        return ((float) (((-this.f7283c) * (this.f7287g - this.f7284d)) - (this.f7281a * this.f7288h))) / this.f7289i;
    }

    void g(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float getInterpolation(float f4) {
        e(f4 - this.f7286f);
        this.f7286f = f4;
        return this.f7287g;
    }

    public void h(float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i4) {
        this.f7284d = f5;
        this.f7281a = f9;
        this.f7282b = false;
        this.f7287g = f4;
        this.f7285e = f6;
        this.f7283c = f8;
        this.f7289i = f7;
        this.f7290j = f10;
        this.f7291k = i4;
        this.f7286f = 0.0f;
    }
}
