package androidx.dynamicanimation.animation;

import androidx.annotation.InterfaceC0580x;
import androidx.dynamicanimation.animation.b;

/* loaded from: classes.dex */
public final class c extends b<c> {

    /* renamed from: G, reason: collision with root package name */
    private final a f14265G;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements f {

        /* renamed from: d, reason: collision with root package name */
        private static final float f14266d = -4.2f;

        /* renamed from: e, reason: collision with root package name */
        private static final float f14267e = 62.5f;

        /* renamed from: b, reason: collision with root package name */
        private float f14269b;

        /* renamed from: a, reason: collision with root package name */
        private float f14268a = f14266d;

        /* renamed from: c, reason: collision with root package name */
        private final b.p f14270c = new b.p();

        a() {
        }

        @Override // androidx.dynamicanimation.animation.f
        public boolean a(float f4, float f5) {
            if (Math.abs(f5) < this.f14269b) {
                return true;
            }
            return false;
        }

        @Override // androidx.dynamicanimation.animation.f
        public float b(float f4, float f5) {
            return f5 * this.f14268a;
        }

        float c() {
            return this.f14268a / f14266d;
        }

        void d(float f4) {
            this.f14268a = f4 * f14266d;
        }

        void e(float f4) {
            this.f14269b = f4 * f14267e;
        }

        b.p f(float f4, float f5, long j4) {
            float f6 = (float) j4;
            this.f14270c.f14264b = (float) (f5 * Math.exp((f6 / 1000.0f) * this.f14268a));
            b.p pVar = this.f14270c;
            float f7 = this.f14268a;
            pVar.f14263a = (float) ((f4 - (f5 / f7)) + ((f5 / f7) * Math.exp((f7 * f6) / 1000.0f)));
            b.p pVar2 = this.f14270c;
            if (a(pVar2.f14263a, pVar2.f14264b)) {
                this.f14270c.f14264b = 0.0f;
            }
            return this.f14270c;
        }
    }

    public c(e eVar) {
        super(eVar);
        a aVar = new a();
        this.f14265G = aVar;
        aVar.e(i());
    }

    public c A(@InterfaceC0580x(from = 0.0d, fromInclusive = false) float f4) {
        if (f4 > 0.0f) {
            this.f14265G.d(f4);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    @Override // androidx.dynamicanimation.animation.b
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public c p(float f4) {
        super.p(f4);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public c q(float f4) {
        super.q(f4);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public c u(float f4) {
        super.u(f4);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    float f(float f4, float f5) {
        return this.f14265G.b(f4, f5);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean j(float f4, float f5) {
        if (f4 < this.f14255g && f4 > this.f14256h && !this.f14265G.a(f4, f5)) {
            return false;
        }
        return true;
    }

    @Override // androidx.dynamicanimation.animation.b
    void v(float f4) {
        this.f14265G.e(f4);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean y(long j4) {
        b.p f4 = this.f14265G.f(this.f14250b, this.f14249a, j4);
        float f5 = f4.f14263a;
        this.f14250b = f5;
        float f6 = f4.f14264b;
        this.f14249a = f6;
        float f7 = this.f14256h;
        if (f5 < f7) {
            this.f14250b = f7;
            return true;
        }
        float f8 = this.f14255g;
        if (f5 > f8) {
            this.f14250b = f8;
            return true;
        }
        if (j(f5, f6)) {
            return true;
        }
        return false;
    }

    public float z() {
        return this.f14265G.c();
    }

    public <K> c(K k4, d<K> dVar) {
        super(k4, dVar);
        a aVar = new a();
        this.f14265G = aVar;
        aVar.e(i());
    }
}
