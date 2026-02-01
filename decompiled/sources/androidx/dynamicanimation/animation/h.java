package androidx.dynamicanimation.animation;

import androidx.annotation.InterfaceC0580x;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.b;
import com.google.firebase.remoteconfig.l;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: k, reason: collision with root package name */
    public static final float f14278k = 10000.0f;

    /* renamed from: l, reason: collision with root package name */
    public static final float f14279l = 1500.0f;

    /* renamed from: m, reason: collision with root package name */
    public static final float f14280m = 200.0f;

    /* renamed from: n, reason: collision with root package name */
    public static final float f14281n = 50.0f;

    /* renamed from: o, reason: collision with root package name */
    public static final float f14282o = 0.2f;

    /* renamed from: p, reason: collision with root package name */
    public static final float f14283p = 0.5f;

    /* renamed from: q, reason: collision with root package name */
    public static final float f14284q = 0.75f;

    /* renamed from: r, reason: collision with root package name */
    public static final float f14285r = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    private static final double f14286s = 62.5d;

    /* renamed from: t, reason: collision with root package name */
    private static final double f14287t = Double.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    double f14288a;

    /* renamed from: b, reason: collision with root package name */
    double f14289b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14290c;

    /* renamed from: d, reason: collision with root package name */
    private double f14291d;

    /* renamed from: e, reason: collision with root package name */
    private double f14292e;

    /* renamed from: f, reason: collision with root package name */
    private double f14293f;

    /* renamed from: g, reason: collision with root package name */
    private double f14294g;

    /* renamed from: h, reason: collision with root package name */
    private double f14295h;

    /* renamed from: i, reason: collision with root package name */
    private double f14296i;

    /* renamed from: j, reason: collision with root package name */
    private final b.p f14297j;

    public h() {
        this.f14288a = Math.sqrt(1500.0d);
        this.f14289b = 0.5d;
        this.f14290c = false;
        this.f14296i = Double.MAX_VALUE;
        this.f14297j = new b.p();
    }

    private void f() {
        if (this.f14290c) {
            return;
        }
        if (this.f14296i != Double.MAX_VALUE) {
            double d4 = this.f14289b;
            if (d4 > 1.0d) {
                double d5 = this.f14288a;
                this.f14293f = ((-d4) * d5) + (d5 * Math.sqrt((d4 * d4) - 1.0d));
                double d6 = this.f14289b;
                double d7 = this.f14288a;
                this.f14294g = ((-d6) * d7) - (d7 * Math.sqrt((d6 * d6) - 1.0d));
            } else if (d4 >= l.f37524n && d4 < 1.0d) {
                this.f14295h = this.f14288a * Math.sqrt(1.0d - (d4 * d4));
            }
            this.f14290c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    @Override // androidx.dynamicanimation.animation.f
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean a(float f4, float f5) {
        if (Math.abs(f5) < this.f14292e && Math.abs(f4 - d()) < this.f14291d) {
            return true;
        }
        return false;
    }

    @Override // androidx.dynamicanimation.animation.f
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float b(float f4, float f5) {
        float d4 = f4 - d();
        double d5 = this.f14288a;
        return (float) (((-(d5 * d5)) * d4) - (((d5 * 2.0d) * this.f14289b) * f5));
    }

    public float c() {
        return (float) this.f14289b;
    }

    public float d() {
        return (float) this.f14296i;
    }

    public float e() {
        double d4 = this.f14288a;
        return (float) (d4 * d4);
    }

    public h g(@InterfaceC0580x(from = 0.0d) float f4) {
        if (f4 >= 0.0f) {
            this.f14289b = f4;
            this.f14290c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public h h(float f4) {
        this.f14296i = f4;
        return this;
    }

    public h i(@InterfaceC0580x(from = 0.0d, fromInclusive = false) float f4) {
        if (f4 > 0.0f) {
            this.f14288a = Math.sqrt(f4);
            this.f14290c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(double d4) {
        double abs = Math.abs(d4);
        this.f14291d = abs;
        this.f14292e = abs * f14286s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b.p k(double d4, double d5, long j4) {
        double cos;
        double d6;
        f();
        double d7 = j4 / 1000.0d;
        double d8 = d4 - this.f14296i;
        double d9 = this.f14289b;
        if (d9 > 1.0d) {
            double d10 = this.f14294g;
            double d11 = this.f14293f;
            double d12 = d8 - (((d10 * d8) - d5) / (d10 - d11));
            double d13 = ((d8 * d10) - d5) / (d10 - d11);
            d6 = (Math.pow(2.718281828459045d, d10 * d7) * d12) + (Math.pow(2.718281828459045d, this.f14293f * d7) * d13);
            double d14 = this.f14294g;
            double pow = d12 * d14 * Math.pow(2.718281828459045d, d14 * d7);
            double d15 = this.f14293f;
            cos = pow + (d13 * d15 * Math.pow(2.718281828459045d, d15 * d7));
        } else if (d9 == 1.0d) {
            double d16 = this.f14288a;
            double d17 = d5 + (d16 * d8);
            double d18 = d8 + (d17 * d7);
            d6 = Math.pow(2.718281828459045d, (-d16) * d7) * d18;
            double pow2 = d18 * Math.pow(2.718281828459045d, (-this.f14288a) * d7);
            double d19 = this.f14288a;
            cos = (d17 * Math.pow(2.718281828459045d, (-d19) * d7)) + (pow2 * (-d19));
        } else {
            double d20 = 1.0d / this.f14295h;
            double d21 = this.f14288a;
            double d22 = d20 * ((d9 * d21 * d8) + d5);
            double pow3 = Math.pow(2.718281828459045d, (-d9) * d21 * d7) * ((Math.cos(this.f14295h * d7) * d8) + (Math.sin(this.f14295h * d7) * d22));
            double d23 = this.f14288a;
            double d24 = this.f14289b;
            double d25 = (-d23) * pow3 * d24;
            double pow4 = Math.pow(2.718281828459045d, (-d24) * d23 * d7);
            double d26 = this.f14295h;
            double sin = (-d26) * d8 * Math.sin(d26 * d7);
            double d27 = this.f14295h;
            cos = d25 + (pow4 * (sin + (d22 * d27 * Math.cos(d27 * d7))));
            d6 = pow3;
        }
        b.p pVar = this.f14297j;
        pVar.f14263a = (float) (d6 + this.f14296i);
        pVar.f14264b = (float) cos;
        return pVar;
    }

    public h(float f4) {
        this.f14288a = Math.sqrt(1500.0d);
        this.f14289b = 0.5d;
        this.f14290c = false;
        this.f14296i = Double.MAX_VALUE;
        this.f14297j = new b.p();
        this.f14296i = f4;
    }
}
