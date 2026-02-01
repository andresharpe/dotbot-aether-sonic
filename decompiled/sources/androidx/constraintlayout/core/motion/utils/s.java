package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class s implements r {

    /* renamed from: p, reason: collision with root package name */
    private static final float f7294p = 1.0E-5f;

    /* renamed from: a, reason: collision with root package name */
    private float f7295a;

    /* renamed from: b, reason: collision with root package name */
    private float f7296b;

    /* renamed from: c, reason: collision with root package name */
    private float f7297c;

    /* renamed from: d, reason: collision with root package name */
    private float f7298d;

    /* renamed from: e, reason: collision with root package name */
    private float f7299e;

    /* renamed from: f, reason: collision with root package name */
    private float f7300f;

    /* renamed from: g, reason: collision with root package name */
    private float f7301g;

    /* renamed from: h, reason: collision with root package name */
    private float f7302h;

    /* renamed from: i, reason: collision with root package name */
    private float f7303i;

    /* renamed from: j, reason: collision with root package name */
    private int f7304j;

    /* renamed from: k, reason: collision with root package name */
    private String f7305k;

    /* renamed from: m, reason: collision with root package name */
    private float f7307m;

    /* renamed from: n, reason: collision with root package name */
    private float f7308n;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7306l = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f7309o = false;

    private float e(float f4) {
        this.f7309o = false;
        float f5 = this.f7298d;
        if (f4 <= f5) {
            float f6 = this.f7295a;
            return (f6 * f4) + ((((this.f7296b - f6) * f4) * f4) / (f5 * 2.0f));
        }
        int i4 = this.f7304j;
        if (i4 == 1) {
            return this.f7301g;
        }
        float f7 = f4 - f5;
        float f8 = this.f7299e;
        if (f7 < f8) {
            float f9 = this.f7301g;
            float f10 = this.f7296b;
            return f9 + (f10 * f7) + ((((this.f7297c - f10) * f7) * f7) / (f8 * 2.0f));
        }
        if (i4 == 2) {
            return this.f7302h;
        }
        float f11 = f7 - f8;
        float f12 = this.f7300f;
        if (f11 <= f12) {
            float f13 = this.f7302h;
            float f14 = this.f7297c;
            return (f13 + (f14 * f11)) - (((f14 * f11) * f11) / (f12 * 2.0f));
        }
        this.f7309o = true;
        return this.f7303i;
    }

    private void g(float f4, float f5, float f6, float f7, float f8) {
        this.f7309o = false;
        if (f4 == 0.0f) {
            f4 = 1.0E-4f;
        }
        this.f7295a = f4;
        float f9 = f4 / f6;
        float f10 = (f9 * f4) / 2.0f;
        if (f4 < 0.0f) {
            float sqrt = (float) Math.sqrt((f5 - ((((-f4) / f6) * f4) / 2.0f)) * f6);
            if (sqrt < f7) {
                this.f7305k = "backward accelerate, decelerate";
                this.f7304j = 2;
                this.f7295a = f4;
                this.f7296b = sqrt;
                this.f7297c = 0.0f;
                float f11 = (sqrt - f4) / f6;
                this.f7298d = f11;
                this.f7299e = sqrt / f6;
                this.f7301g = ((f4 + sqrt) * f11) / 2.0f;
                this.f7302h = f5;
                this.f7303i = f5;
                return;
            }
            this.f7305k = "backward accelerate cruse decelerate";
            this.f7304j = 3;
            this.f7295a = f4;
            this.f7296b = f7;
            this.f7297c = f7;
            float f12 = (f7 - f4) / f6;
            this.f7298d = f12;
            float f13 = f7 / f6;
            this.f7300f = f13;
            float f14 = ((f4 + f7) * f12) / 2.0f;
            float f15 = (f13 * f7) / 2.0f;
            this.f7299e = ((f5 - f14) - f15) / f7;
            this.f7301g = f14;
            this.f7302h = f5 - f15;
            this.f7303i = f5;
            return;
        }
        if (f10 >= f5) {
            this.f7305k = "hard stop";
            this.f7304j = 1;
            this.f7295a = f4;
            this.f7296b = 0.0f;
            this.f7301g = f5;
            this.f7298d = (2.0f * f5) / f4;
            return;
        }
        float f16 = f5 - f10;
        float f17 = f16 / f4;
        if (f17 + f9 < f8) {
            this.f7305k = "cruse decelerate";
            this.f7304j = 2;
            this.f7295a = f4;
            this.f7296b = f4;
            this.f7297c = 0.0f;
            this.f7301g = f16;
            this.f7302h = f5;
            this.f7298d = f17;
            this.f7299e = f9;
            return;
        }
        float sqrt2 = (float) Math.sqrt((f6 * f5) + ((f4 * f4) / 2.0f));
        float f18 = (sqrt2 - f4) / f6;
        this.f7298d = f18;
        float f19 = sqrt2 / f6;
        this.f7299e = f19;
        if (sqrt2 < f7) {
            this.f7305k = "accelerate decelerate";
            this.f7304j = 2;
            this.f7295a = f4;
            this.f7296b = sqrt2;
            this.f7297c = 0.0f;
            this.f7298d = f18;
            this.f7299e = f19;
            this.f7301g = ((f4 + sqrt2) * f18) / 2.0f;
            this.f7302h = f5;
            return;
        }
        this.f7305k = "accelerate cruse decelerate";
        this.f7304j = 3;
        this.f7295a = f4;
        this.f7296b = f7;
        this.f7297c = f7;
        float f20 = (f7 - f4) / f6;
        this.f7298d = f20;
        float f21 = f7 / f6;
        this.f7300f = f21;
        float f22 = ((f4 + f7) * f20) / 2.0f;
        float f23 = (f21 * f7) / 2.0f;
        this.f7299e = ((f5 - f22) - f23) / f7;
        this.f7301g = f22;
        this.f7302h = f5 - f23;
        this.f7303i = f5;
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float a() {
        if (this.f7306l) {
            return -c(this.f7308n);
        }
        return c(this.f7308n);
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public String b(String str, float f4) {
        String str2;
        String str3 = str + " ===== " + this.f7305k + "\n";
        if (this.f7306l) {
            str2 = "backwards";
        } else {
            str2 = "forward ";
        }
        String str4 = (str3 + str + str2 + " time = " + f4 + "  stages " + this.f7304j + "\n") + str + " dur " + this.f7298d + " vel " + this.f7295a + " pos " + this.f7301g + "\n";
        if (this.f7304j > 1) {
            str4 = str4 + str + " dur " + this.f7299e + " vel " + this.f7296b + " pos " + this.f7302h + "\n";
        }
        if (this.f7304j > 2) {
            str4 = str4 + str + " dur " + this.f7300f + " vel " + this.f7297c + " pos " + this.f7303i + "\n";
        }
        float f5 = this.f7298d;
        if (f4 <= f5) {
            return str4 + str + "stage 0\n";
        }
        int i4 = this.f7304j;
        if (i4 == 1) {
            return str4 + str + "end stage 0\n";
        }
        float f6 = f4 - f5;
        float f7 = this.f7299e;
        if (f6 < f7) {
            return str4 + str + " stage 1\n";
        }
        if (i4 == 2) {
            return str4 + str + "end stage 1\n";
        }
        if (f6 - f7 < this.f7300f) {
            return str4 + str + " stage 2\n";
        }
        return str4 + str + " end stage 2\n";
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float c(float f4) {
        float f5 = this.f7298d;
        if (f4 <= f5) {
            float f6 = this.f7295a;
            return f6 + (((this.f7296b - f6) * f4) / f5);
        }
        int i4 = this.f7304j;
        if (i4 == 1) {
            return 0.0f;
        }
        float f7 = f4 - f5;
        float f8 = this.f7299e;
        if (f7 < f8) {
            float f9 = this.f7296b;
            return f9 + (((this.f7297c - f9) * f7) / f8);
        }
        if (i4 == 2) {
            return this.f7302h;
        }
        float f10 = f7 - f8;
        float f11 = this.f7300f;
        if (f10 < f11) {
            float f12 = this.f7297c;
            return f12 - ((f10 * f12) / f11);
        }
        return this.f7303i;
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public boolean d() {
        if (a() < f7294p && Math.abs(this.f7303i - this.f7308n) < f7294p) {
            return true;
        }
        return false;
    }

    public void f(float f4, float f5, float f6, float f7, float f8, float f9) {
        boolean z3 = false;
        this.f7309o = false;
        this.f7307m = f4;
        if (f4 > f5) {
            z3 = true;
        }
        this.f7306l = z3;
        if (z3) {
            g(-f6, f4 - f5, f8, f9, f7);
        } else {
            g(f6, f5 - f4, f8, f9, f7);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.r
    public float getInterpolation(float f4) {
        float e4 = e(f4);
        this.f7308n = f4;
        if (this.f7306l) {
            return this.f7307m - e4;
        }
        return this.f7307m + e4;
    }
}
