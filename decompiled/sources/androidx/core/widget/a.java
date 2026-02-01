package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.N;
import androidx.core.view.C0823k0;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: V, reason: collision with root package name */
    public static final float f13748V = 0.0f;

    /* renamed from: W, reason: collision with root package name */
    public static final float f13749W = Float.MAX_VALUE;

    /* renamed from: X, reason: collision with root package name */
    public static final float f13750X = 0.0f;

    /* renamed from: Y, reason: collision with root package name */
    public static final int f13751Y = 0;

    /* renamed from: Z, reason: collision with root package name */
    public static final int f13752Z = 1;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f13753a0 = 2;

    /* renamed from: b0, reason: collision with root package name */
    private static final int f13754b0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    private static final int f13755c0 = 1;

    /* renamed from: d0, reason: collision with root package name */
    private static final int f13756d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    private static final int f13757e0 = 315;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f13758f0 = 1575;

    /* renamed from: g0, reason: collision with root package name */
    private static final float f13759g0 = Float.MAX_VALUE;

    /* renamed from: h0, reason: collision with root package name */
    private static final float f13760h0 = 0.2f;

    /* renamed from: i0, reason: collision with root package name */
    private static final float f13761i0 = 1.0f;

    /* renamed from: j0, reason: collision with root package name */
    private static final int f13762j0 = ViewConfiguration.getTapTimeout();

    /* renamed from: k0, reason: collision with root package name */
    private static final int f13763k0 = 500;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f13764l0 = 500;

    /* renamed from: G, reason: collision with root package name */
    final View f13767G;

    /* renamed from: H, reason: collision with root package name */
    private Runnable f13768H;

    /* renamed from: K, reason: collision with root package name */
    private int f13771K;

    /* renamed from: L, reason: collision with root package name */
    private int f13772L;

    /* renamed from: P, reason: collision with root package name */
    private boolean f13776P;

    /* renamed from: Q, reason: collision with root package name */
    boolean f13777Q;

    /* renamed from: R, reason: collision with root package name */
    boolean f13778R;

    /* renamed from: S, reason: collision with root package name */
    boolean f13779S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f13780T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f13781U;

    /* renamed from: E, reason: collision with root package name */
    final C0111a f13765E = new C0111a();

    /* renamed from: F, reason: collision with root package name */
    private final Interpolator f13766F = new AccelerateInterpolator();

    /* renamed from: I, reason: collision with root package name */
    private float[] f13769I = {0.0f, 0.0f};

    /* renamed from: J, reason: collision with root package name */
    private float[] f13770J = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: M, reason: collision with root package name */
    private float[] f13773M = {0.0f, 0.0f};

    /* renamed from: N, reason: collision with root package name */
    private float[] f13774N = {0.0f, 0.0f};

    /* renamed from: O, reason: collision with root package name */
    private float[] f13775O = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0111a {

        /* renamed from: a, reason: collision with root package name */
        private int f13782a;

        /* renamed from: b, reason: collision with root package name */
        private int f13783b;

        /* renamed from: c, reason: collision with root package name */
        private float f13784c;

        /* renamed from: d, reason: collision with root package name */
        private float f13785d;

        /* renamed from: j, reason: collision with root package name */
        private float f13791j;

        /* renamed from: k, reason: collision with root package name */
        private int f13792k;

        /* renamed from: e, reason: collision with root package name */
        private long f13786e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f13790i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f13787f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f13788g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f13789h = 0;

        C0111a() {
        }

        private float e(long j4) {
            long j5 = this.f13786e;
            if (j4 < j5) {
                return 0.0f;
            }
            long j6 = this.f13790i;
            if (j6 >= 0 && j4 >= j6) {
                float f4 = this.f13791j;
                return (1.0f - f4) + (f4 * a.e(((float) (j4 - j6)) / this.f13792k, 0.0f, 1.0f));
            }
            return a.e(((float) (j4 - j5)) / this.f13782a, 0.0f, 1.0f) * 0.5f;
        }

        private float g(float f4) {
            return ((-4.0f) * f4 * f4) + (f4 * 4.0f);
        }

        public void a() {
            if (this.f13787f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g4 = g(e(currentAnimationTimeMillis));
                long j4 = currentAnimationTimeMillis - this.f13787f;
                this.f13787f = currentAnimationTimeMillis;
                float f4 = ((float) j4) * g4;
                this.f13788g = (int) (this.f13784c * f4);
                this.f13789h = (int) (f4 * this.f13785d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f13788g;
        }

        public int c() {
            return this.f13789h;
        }

        public int d() {
            float f4 = this.f13784c;
            return (int) (f4 / Math.abs(f4));
        }

        public int f() {
            float f4 = this.f13785d;
            return (int) (f4 / Math.abs(f4));
        }

        public boolean h() {
            if (this.f13790i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f13790i + this.f13792k) {
                return true;
            }
            return false;
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f13792k = a.f((int) (currentAnimationTimeMillis - this.f13786e), 0, this.f13783b);
            this.f13791j = e(currentAnimationTimeMillis);
            this.f13790i = currentAnimationTimeMillis;
        }

        public void j(int i4) {
            this.f13783b = i4;
        }

        public void k(int i4) {
            this.f13782a = i4;
        }

        public void l(float f4, float f5) {
            this.f13784c = f4;
            this.f13785d = f5;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f13786e = currentAnimationTimeMillis;
            this.f13790i = -1L;
            this.f13787f = currentAnimationTimeMillis;
            this.f13791j = 0.5f;
            this.f13788g = 0;
            this.f13789h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (!aVar.f13779S) {
                return;
            }
            if (aVar.f13777Q) {
                aVar.f13777Q = false;
                aVar.f13765E.m();
            }
            C0111a c0111a = a.this.f13765E;
            if (!c0111a.h() && a.this.x()) {
                a aVar2 = a.this;
                if (aVar2.f13778R) {
                    aVar2.f13778R = false;
                    aVar2.c();
                }
                c0111a.a();
                a.this.l(c0111a.b(), c0111a.c());
                C0823k0.p1(a.this.f13767G, this);
                return;
            }
            a.this.f13779S = false;
        }
    }

    public a(@N View view) {
        this.f13767G = view;
        float f4 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = (int) ((1575.0f * f4) + 0.5f);
        r(f5, f5);
        float f6 = (int) ((f4 * 315.0f) + 0.5f);
        s(f6, f6);
        n(1);
        q(Float.MAX_VALUE, Float.MAX_VALUE);
        v(0.2f, 0.2f);
        w(1.0f, 1.0f);
        m(f13762j0);
        u(500);
        t(500);
    }

    private float d(int i4, float f4, float f5, float f6) {
        float h4 = h(this.f13769I[i4], f5, this.f13770J[i4], f4);
        if (h4 == 0.0f) {
            return 0.0f;
        }
        float f7 = this.f13773M[i4];
        float f8 = this.f13774N[i4];
        float f9 = this.f13775O[i4];
        float f10 = f7 * f6;
        if (h4 > 0.0f) {
            return e(h4 * f10, f8, f9);
        }
        return -e((-h4) * f10, f8, f9);
    }

    static float e(float f4, float f5, float f6) {
        return f4 > f6 ? f6 : f4 < f5 ? f5 : f4;
    }

    static int f(int i4, int i5, int i6) {
        return i4 > i6 ? i6 : i4 < i5 ? i5 : i4;
    }

    private float g(float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        int i4 = this.f13771K;
        if (i4 != 0 && i4 != 1) {
            if (i4 == 2 && f4 < 0.0f) {
                return f4 / (-f5);
            }
        } else if (f4 < f5) {
            if (f4 >= 0.0f) {
                return 1.0f - (f4 / f5);
            }
            if (this.f13779S && i4 == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    private float h(float f4, float f5, float f6, float f7) {
        float interpolation;
        float e4 = e(f4 * f5, 0.0f, f6);
        float g4 = g(f5 - f7, e4) - g(f7, e4);
        if (g4 < 0.0f) {
            interpolation = -this.f13766F.getInterpolation(-g4);
        } else {
            if (g4 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f13766F.getInterpolation(g4);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void k() {
        if (this.f13777Q) {
            this.f13779S = false;
        } else {
            this.f13765E.i();
        }
    }

    private void y() {
        int i4;
        if (this.f13768H == null) {
            this.f13768H = new b();
        }
        this.f13779S = true;
        this.f13777Q = true;
        if (!this.f13776P && (i4 = this.f13772L) > 0) {
            C0823k0.q1(this.f13767G, this.f13768H, i4);
        } else {
            this.f13768H.run();
        }
        this.f13776P = true;
    }

    public abstract boolean a(int i4);

    public abstract boolean b(int i4);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f13767G.onTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean i() {
        return this.f13780T;
    }

    public boolean j() {
        return this.f13781U;
    }

    public abstract void l(int i4, int i5);

    @N
    public a m(int i4) {
        this.f13772L = i4;
        return this;
    }

    @N
    public a n(int i4) {
        this.f13771K = i4;
        return this;
    }

    public a o(boolean z3) {
        if (this.f13780T && !z3) {
            k();
        }
        this.f13780T = z3;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f13780T
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.k()
            goto L58
        L1a:
            r5.f13778R = r2
            r5.f13776P = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f13767G
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f13767G
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f13765E
            r7.l(r0, r6)
            boolean r6 = r5.f13779S
            if (r6 != 0) goto L58
            boolean r6 = r5.x()
            if (r6 == 0) goto L58
            r5.y()
        L58:
            boolean r6 = r5.f13781U
            if (r6 == 0) goto L61
            boolean r6 = r5.f13779S
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(boolean z3) {
        this.f13781U = z3;
        return this;
    }

    @N
    public a q(float f4, float f5) {
        float[] fArr = this.f13770J;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    @N
    public a r(float f4, float f5) {
        float[] fArr = this.f13775O;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    @N
    public a s(float f4, float f5) {
        float[] fArr = this.f13774N;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    @N
    public a t(int i4) {
        this.f13765E.j(i4);
        return this;
    }

    @N
    public a u(int i4) {
        this.f13765E.k(i4);
        return this;
    }

    @N
    public a v(float f4, float f5) {
        float[] fArr = this.f13769I;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    @N
    public a w(float f4, float f5) {
        float[] fArr = this.f13773M;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    boolean x() {
        C0111a c0111a = this.f13765E;
        int f4 = c0111a.f();
        int d4 = c0111a.d();
        if ((f4 != 0 && b(f4)) || (d4 != 0 && a(d4))) {
            return true;
        }
        return false;
    }
}
