package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.b;
import com.google.firebase.remoteconfig.l;

/* loaded from: classes.dex */
public final class g extends b<g> {

    /* renamed from: J, reason: collision with root package name */
    private static final float f14274J = Float.MAX_VALUE;

    /* renamed from: G, reason: collision with root package name */
    private h f14275G;

    /* renamed from: H, reason: collision with root package name */
    private float f14276H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f14277I;

    public g(e eVar) {
        super(eVar);
        this.f14275G = null;
        this.f14276H = Float.MAX_VALUE;
        this.f14277I = false;
    }

    private void C() {
        h hVar = this.f14275G;
        if (hVar != null) {
            double d4 = hVar.d();
            if (d4 <= this.f14255g) {
                if (d4 >= this.f14256h) {
                    return;
                } else {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public boolean A() {
        if (this.f14275G.f14289b > l.f37524n) {
            return true;
        }
        return false;
    }

    public h B() {
        return this.f14275G;
    }

    public g D(h hVar) {
        this.f14275G = hVar;
        return this;
    }

    public void E() {
        if (A()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f14254f) {
                    this.f14277I = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }

    @Override // androidx.dynamicanimation.animation.b
    float f(float f4, float f5) {
        return this.f14275G.b(f4, f5);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean j(float f4, float f5) {
        return this.f14275G.a(f4, f5);
    }

    @Override // androidx.dynamicanimation.animation.b
    void v(float f4) {
    }

    @Override // androidx.dynamicanimation.animation.b
    public void w() {
        C();
        this.f14275G.j(i());
        super.w();
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean y(long j4) {
        if (this.f14277I) {
            float f4 = this.f14276H;
            if (f4 != Float.MAX_VALUE) {
                this.f14275G.h(f4);
                this.f14276H = Float.MAX_VALUE;
            }
            this.f14250b = this.f14275G.d();
            this.f14249a = 0.0f;
            this.f14277I = false;
            return true;
        }
        if (this.f14276H != Float.MAX_VALUE) {
            this.f14275G.d();
            long j5 = j4 / 2;
            b.p k4 = this.f14275G.k(this.f14250b, this.f14249a, j5);
            this.f14275G.h(this.f14276H);
            this.f14276H = Float.MAX_VALUE;
            b.p k5 = this.f14275G.k(k4.f14263a, k4.f14264b, j5);
            this.f14250b = k5.f14263a;
            this.f14249a = k5.f14264b;
        } else {
            b.p k6 = this.f14275G.k(this.f14250b, this.f14249a, j4);
            this.f14250b = k6.f14263a;
            this.f14249a = k6.f14264b;
        }
        float max = Math.max(this.f14250b, this.f14256h);
        this.f14250b = max;
        float min = Math.min(max, this.f14255g);
        this.f14250b = min;
        if (!j(min, this.f14249a)) {
            return false;
        }
        this.f14250b = this.f14275G.d();
        this.f14249a = 0.0f;
        return true;
    }

    public void z(float f4) {
        if (k()) {
            this.f14276H = f4;
            return;
        }
        if (this.f14275G == null) {
            this.f14275G = new h(f4);
        }
        this.f14275G.h(f4);
        w();
    }

    public <K> g(K k4, d<K> dVar) {
        super(k4, dVar);
        this.f14275G = null;
        this.f14276H = Float.MAX_VALUE;
        this.f14277I = false;
    }

    public <K> g(K k4, d<K> dVar, float f4) {
        super(k4, dVar);
        this.f14275G = null;
        this.f14276H = Float.MAX_VALUE;
        this.f14277I = false;
        this.f14275G = new h(f4);
    }
}
