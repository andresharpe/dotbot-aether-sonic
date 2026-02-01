package com.airbnb.lottie.utils;

import android.view.Choreographer;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.K;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.google.firebase.remoteconfig.l;

/* loaded from: classes.dex */
public class g extends c implements Choreographer.FrameCallback {

    /* renamed from: N, reason: collision with root package name */
    @P
    private com.airbnb.lottie.g f23293N;

    /* renamed from: G, reason: collision with root package name */
    private float f23286G = 1.0f;

    /* renamed from: H, reason: collision with root package name */
    private boolean f23287H = false;

    /* renamed from: I, reason: collision with root package name */
    private long f23288I = 0;

    /* renamed from: J, reason: collision with root package name */
    private float f23289J = 0.0f;

    /* renamed from: K, reason: collision with root package name */
    private int f23290K = 0;

    /* renamed from: L, reason: collision with root package name */
    private float f23291L = -2.14748365E9f;

    /* renamed from: M, reason: collision with root package name */
    private float f23292M = 2.14748365E9f;

    /* renamed from: O, reason: collision with root package name */
    @i0
    protected boolean f23294O = false;

    private void F() {
        if (this.f23293N == null) {
            return;
        }
        float f4 = this.f23289J;
        if (f4 >= this.f23291L && f4 <= this.f23292M) {
        } else {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f23291L), Float.valueOf(this.f23292M), Float.valueOf(this.f23289J)));
        }
    }

    private float k() {
        com.airbnb.lottie.g gVar = this.f23293N;
        if (gVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / gVar.i()) / Math.abs(this.f23286G);
    }

    private boolean p() {
        if (o() < 0.0f) {
            return true;
        }
        return false;
    }

    public void A(float f4) {
        if (this.f23289J == f4) {
            return;
        }
        this.f23289J = i.c(f4, n(), l());
        this.f23288I = 0L;
        f();
    }

    public void B(float f4) {
        C(this.f23291L, f4);
    }

    public void C(float f4, float f5) {
        float r4;
        float f6;
        if (f4 <= f5) {
            com.airbnb.lottie.g gVar = this.f23293N;
            if (gVar == null) {
                r4 = -3.4028235E38f;
            } else {
                r4 = gVar.r();
            }
            com.airbnb.lottie.g gVar2 = this.f23293N;
            if (gVar2 == null) {
                f6 = Float.MAX_VALUE;
            } else {
                f6 = gVar2.f();
            }
            float c4 = i.c(f4, r4, f6);
            float c5 = i.c(f5, r4, f6);
            if (c4 != this.f23291L || c5 != this.f23292M) {
                this.f23291L = c4;
                this.f23292M = c5;
                A((int) i.c(this.f23289J, c4, c5));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f4), Float.valueOf(f5)));
    }

    public void D(int i4) {
        C(i4, (int) this.f23292M);
    }

    public void E(float f4) {
        this.f23286G = f4;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @K
    public void cancel() {
        a();
        t();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j4) {
        float n4;
        float l4;
        s();
        if (this.f23293N != null && isRunning()) {
            com.airbnb.lottie.e.a("LottieValueAnimator#doFrame");
            long j5 = this.f23288I;
            long j6 = 0;
            if (j5 != 0) {
                j6 = j4 - j5;
            }
            float k4 = ((float) j6) / k();
            float f4 = this.f23289J;
            if (p()) {
                k4 = -k4;
            }
            float f5 = f4 + k4;
            this.f23289J = f5;
            boolean z3 = !i.e(f5, n(), l());
            this.f23289J = i.c(this.f23289J, n(), l());
            this.f23288I = j4;
            f();
            if (z3) {
                if (getRepeatCount() != -1 && this.f23290K >= getRepeatCount()) {
                    if (this.f23286G < 0.0f) {
                        l4 = n();
                    } else {
                        l4 = l();
                    }
                    this.f23289J = l4;
                    t();
                    b(p());
                } else {
                    d();
                    this.f23290K++;
                    if (getRepeatMode() == 2) {
                        this.f23287H = !this.f23287H;
                        x();
                    } else {
                        if (p()) {
                            n4 = l();
                        } else {
                            n4 = n();
                        }
                        this.f23289J = n4;
                    }
                    this.f23288I = j4;
                }
            }
            F();
            com.airbnb.lottie.e.b("LottieValueAnimator#doFrame");
        }
    }

    public void g() {
        this.f23293N = null;
        this.f23291L = -2.14748365E9f;
        this.f23292M = 2.14748365E9f;
    }

    @Override // android.animation.ValueAnimator
    @InterfaceC0580x(from = l.f37524n, to = 1.0d)
    public float getAnimatedFraction() {
        float n4;
        float l4;
        float n5;
        if (this.f23293N == null) {
            return 0.0f;
        }
        if (p()) {
            n4 = l() - this.f23289J;
            l4 = l();
            n5 = n();
        } else {
            n4 = this.f23289J - n();
            l4 = l();
            n5 = n();
        }
        return n4 / (l4 - n5);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(i());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        if (this.f23293N == null) {
            return 0L;
        }
        return r0.d();
    }

    @K
    public void h() {
        t();
        b(p());
    }

    @InterfaceC0580x(from = l.f37524n, to = 1.0d)
    public float i() {
        com.airbnb.lottie.g gVar = this.f23293N;
        if (gVar == null) {
            return 0.0f;
        }
        return (this.f23289J - gVar.r()) / (this.f23293N.f() - this.f23293N.r());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f23294O;
    }

    public float j() {
        return this.f23289J;
    }

    public float l() {
        com.airbnb.lottie.g gVar = this.f23293N;
        if (gVar == null) {
            return 0.0f;
        }
        float f4 = this.f23292M;
        if (f4 == 2.14748365E9f) {
            return gVar.f();
        }
        return f4;
    }

    public float n() {
        com.airbnb.lottie.g gVar = this.f23293N;
        if (gVar == null) {
            return 0.0f;
        }
        float f4 = this.f23291L;
        if (f4 == -2.14748365E9f) {
            return gVar.r();
        }
        return f4;
    }

    public float o() {
        return this.f23286G;
    }

    @K
    public void q() {
        t();
    }

    @K
    public void r() {
        float n4;
        this.f23294O = true;
        e(p());
        if (p()) {
            n4 = l();
        } else {
            n4 = n();
        }
        A((int) n4);
        this.f23288I = 0L;
        this.f23290K = 0;
        s();
    }

    protected void s() {
        if (isRunning()) {
            u(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i4) {
        super.setRepeatMode(i4);
        if (i4 != 2 && this.f23287H) {
            this.f23287H = false;
            x();
        }
    }

    @K
    protected void t() {
        u(true);
    }

    @K
    protected void u(boolean z3) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z3) {
            this.f23294O = false;
        }
    }

    @K
    public void w() {
        this.f23294O = true;
        s();
        this.f23288I = 0L;
        if (p() && j() == n()) {
            this.f23289J = l();
        } else if (!p() && j() == l()) {
            this.f23289J = n();
        }
    }

    public void x() {
        E(-o());
    }

    public void y(com.airbnb.lottie.g gVar) {
        boolean z3;
        if (this.f23293N == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f23293N = gVar;
        if (z3) {
            C((int) Math.max(this.f23291L, gVar.r()), (int) Math.min(this.f23292M, gVar.f()));
        } else {
            C((int) gVar.r(), (int) gVar.f());
        }
        float f4 = this.f23289J;
        this.f23289J = 0.0f;
        A((int) f4);
        f();
    }
}
