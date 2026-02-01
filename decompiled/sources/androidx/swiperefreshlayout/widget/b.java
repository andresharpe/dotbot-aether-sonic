package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.core.util.u;
import androidx.core.view.C0823k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: M, reason: collision with root package name */
    public static final int f18474M = 0;

    /* renamed from: N, reason: collision with root package name */
    private static final float f18475N = 11.0f;

    /* renamed from: O, reason: collision with root package name */
    private static final float f18476O = 3.0f;

    /* renamed from: P, reason: collision with root package name */
    private static final int f18477P = 12;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f18478Q = 6;

    /* renamed from: R, reason: collision with root package name */
    public static final int f18479R = 1;

    /* renamed from: S, reason: collision with root package name */
    private static final float f18480S = 7.5f;

    /* renamed from: T, reason: collision with root package name */
    private static final float f18481T = 2.5f;

    /* renamed from: U, reason: collision with root package name */
    private static final int f18482U = 10;

    /* renamed from: V, reason: collision with root package name */
    private static final int f18483V = 5;

    /* renamed from: X, reason: collision with root package name */
    private static final float f18485X = 0.75f;

    /* renamed from: Y, reason: collision with root package name */
    private static final float f18486Y = 0.5f;

    /* renamed from: Z, reason: collision with root package name */
    private static final int f18487Z = 1332;

    /* renamed from: a0, reason: collision with root package name */
    private static final float f18488a0 = 216.0f;

    /* renamed from: b0, reason: collision with root package name */
    private static final float f18489b0 = 0.8f;

    /* renamed from: c0, reason: collision with root package name */
    private static final float f18490c0 = 0.01f;

    /* renamed from: d0, reason: collision with root package name */
    private static final float f18491d0 = 0.20999998f;

    /* renamed from: E, reason: collision with root package name */
    private final d f18492E;

    /* renamed from: F, reason: collision with root package name */
    private float f18493F;

    /* renamed from: G, reason: collision with root package name */
    private Resources f18494G;

    /* renamed from: H, reason: collision with root package name */
    private Animator f18495H;

    /* renamed from: I, reason: collision with root package name */
    float f18496I;

    /* renamed from: J, reason: collision with root package name */
    boolean f18497J;

    /* renamed from: K, reason: collision with root package name */
    private static final Interpolator f18472K = new LinearInterpolator();

    /* renamed from: L, reason: collision with root package name */
    private static final Interpolator f18473L = new androidx.interpolator.view.animation.b();

    /* renamed from: W, reason: collision with root package name */
    private static final int[] f18484W = {C0823k0.f13589t};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f18498a;

        a(d dVar) {
            this.f18498a = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.H(floatValue, this.f18498a);
            b.this.e(floatValue, this.f18498a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0177b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f18500a;

        C0177b(d dVar) {
            this.f18500a = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.e(1.0f, this.f18500a, true);
            this.f18500a.M();
            this.f18500a.v();
            b bVar = b.this;
            if (bVar.f18497J) {
                bVar.f18497J = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f18500a.I(false);
                return;
            }
            bVar.f18496I += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f18496I = 0.0f;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        final RectF f18502a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        final Paint f18503b;

        /* renamed from: c, reason: collision with root package name */
        final Paint f18504c;

        /* renamed from: d, reason: collision with root package name */
        final Paint f18505d;

        /* renamed from: e, reason: collision with root package name */
        float f18506e;

        /* renamed from: f, reason: collision with root package name */
        float f18507f;

        /* renamed from: g, reason: collision with root package name */
        float f18508g;

        /* renamed from: h, reason: collision with root package name */
        float f18509h;

        /* renamed from: i, reason: collision with root package name */
        int[] f18510i;

        /* renamed from: j, reason: collision with root package name */
        int f18511j;

        /* renamed from: k, reason: collision with root package name */
        float f18512k;

        /* renamed from: l, reason: collision with root package name */
        float f18513l;

        /* renamed from: m, reason: collision with root package name */
        float f18514m;

        /* renamed from: n, reason: collision with root package name */
        boolean f18515n;

        /* renamed from: o, reason: collision with root package name */
        Path f18516o;

        /* renamed from: p, reason: collision with root package name */
        float f18517p;

        /* renamed from: q, reason: collision with root package name */
        float f18518q;

        /* renamed from: r, reason: collision with root package name */
        int f18519r;

        /* renamed from: s, reason: collision with root package name */
        int f18520s;

        /* renamed from: t, reason: collision with root package name */
        int f18521t;

        /* renamed from: u, reason: collision with root package name */
        int f18522u;

        d() {
            Paint paint = new Paint();
            this.f18503b = paint;
            Paint paint2 = new Paint();
            this.f18504c = paint2;
            Paint paint3 = new Paint();
            this.f18505d = paint3;
            this.f18506e = 0.0f;
            this.f18507f = 0.0f;
            this.f18508g = 0.0f;
            this.f18509h = 5.0f;
            this.f18517p = 1.0f;
            this.f18521t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A(int i4) {
            this.f18505d.setColor(i4);
        }

        void B(float f4) {
            this.f18518q = f4;
        }

        void C(int i4) {
            this.f18522u = i4;
        }

        void D(ColorFilter colorFilter) {
            this.f18503b.setColorFilter(colorFilter);
        }

        void E(int i4) {
            this.f18511j = i4;
            this.f18522u = this.f18510i[i4];
        }

        void F(@N int[] iArr) {
            this.f18510i = iArr;
            E(0);
        }

        void G(float f4) {
            this.f18507f = f4;
        }

        void H(float f4) {
            this.f18508g = f4;
        }

        void I(boolean z3) {
            if (this.f18515n != z3) {
                this.f18515n = z3;
            }
        }

        void J(float f4) {
            this.f18506e = f4;
        }

        void K(Paint.Cap cap) {
            this.f18503b.setStrokeCap(cap);
        }

        void L(float f4) {
            this.f18509h = f4;
            this.f18503b.setStrokeWidth(f4);
        }

        void M() {
            this.f18512k = this.f18506e;
            this.f18513l = this.f18507f;
            this.f18514m = this.f18508g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f18502a;
            float f4 = this.f18518q;
            float f5 = (this.f18509h / 2.0f) + f4;
            if (f4 <= 0.0f) {
                f5 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f18519r * this.f18517p) / 2.0f, this.f18509h / 2.0f);
            }
            rectF.set(rect.centerX() - f5, rect.centerY() - f5, rect.centerX() + f5, rect.centerY() + f5);
            float f6 = this.f18506e;
            float f7 = this.f18508g;
            float f8 = (f6 + f7) * 360.0f;
            float f9 = ((this.f18507f + f7) * 360.0f) - f8;
            this.f18503b.setColor(this.f18522u);
            this.f18503b.setAlpha(this.f18521t);
            float f10 = this.f18509h / 2.0f;
            rectF.inset(f10, f10);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f18505d);
            float f11 = -f10;
            rectF.inset(f11, f11);
            canvas.drawArc(rectF, f8, f9, false, this.f18503b);
            b(canvas, f8, f9, rectF);
        }

        void b(Canvas canvas, float f4, float f5, RectF rectF) {
            if (this.f18515n) {
                Path path = this.f18516o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f18516o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f6 = (this.f18519r * this.f18517p) / 2.0f;
                this.f18516o.moveTo(0.0f, 0.0f);
                this.f18516o.lineTo(this.f18519r * this.f18517p, 0.0f);
                Path path3 = this.f18516o;
                float f7 = this.f18519r;
                float f8 = this.f18517p;
                path3.lineTo((f7 * f8) / 2.0f, this.f18520s * f8);
                this.f18516o.offset((min + rectF.centerX()) - f6, rectF.centerY() + (this.f18509h / 2.0f));
                this.f18516o.close();
                this.f18504c.setColor(this.f18522u);
                this.f18504c.setAlpha(this.f18521t);
                canvas.save();
                canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f18516o, this.f18504c);
                canvas.restore();
            }
        }

        int c() {
            return this.f18521t;
        }

        float d() {
            return this.f18520s;
        }

        float e() {
            return this.f18517p;
        }

        float f() {
            return this.f18519r;
        }

        int g() {
            return this.f18505d.getColor();
        }

        float h() {
            return this.f18518q;
        }

        int[] i() {
            return this.f18510i;
        }

        float j() {
            return this.f18507f;
        }

        int k() {
            return this.f18510i[l()];
        }

        int l() {
            return (this.f18511j + 1) % this.f18510i.length;
        }

        float m() {
            return this.f18508g;
        }

        boolean n() {
            return this.f18515n;
        }

        float o() {
            return this.f18506e;
        }

        int p() {
            return this.f18510i[this.f18511j];
        }

        float q() {
            return this.f18513l;
        }

        float r() {
            return this.f18514m;
        }

        float s() {
            return this.f18512k;
        }

        Paint.Cap t() {
            return this.f18503b.getStrokeCap();
        }

        float u() {
            return this.f18509h;
        }

        void v() {
            E(l());
        }

        void w() {
            this.f18512k = 0.0f;
            this.f18513l = 0.0f;
            this.f18514m = 0.0f;
            J(0.0f);
            G(0.0f);
            H(0.0f);
        }

        void x(int i4) {
            this.f18521t = i4;
        }

        void y(float f4, float f5) {
            this.f18519r = (int) f4;
            this.f18520s = (int) f5;
        }

        void z(float f4) {
            if (f4 != this.f18517p) {
                this.f18517p = f4;
            }
        }
    }

    public b(@N Context context) {
        this.f18494G = ((Context) u.l(context)).getResources();
        d dVar = new d();
        this.f18492E = dVar;
        dVar.F(f18484W);
        E(f18481T);
        G();
    }

    private void A(float f4) {
        this.f18493F = f4;
    }

    private void B(float f4, float f5, float f6, float f7) {
        d dVar = this.f18492E;
        float f8 = this.f18494G.getDisplayMetrics().density;
        dVar.L(f5 * f8);
        dVar.B(f4 * f8);
        dVar.E(0);
        dVar.y(f6 * f8, f7 * f8);
    }

    private void G() {
        d dVar = this.f18492E;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f18472K);
        ofFloat.addListener(new C0177b(dVar));
        this.f18495H = ofFloat;
    }

    private void a(float f4, d dVar) {
        H(f4, dVar);
        float floor = (float) (Math.floor(dVar.r() / f18489b0) + 1.0d);
        dVar.J(dVar.s() + (((dVar.q() - f18490c0) - dVar.s()) * f4));
        dVar.G(dVar.q());
        dVar.H(dVar.r() + ((floor - dVar.r()) * f4));
    }

    private int f(float f4, int i4, int i5) {
        return ((((i4 >> 24) & 255) + ((int) ((((i5 >> 24) & 255) - r0) * f4))) << 24) | ((((i4 >> 16) & 255) + ((int) ((((i5 >> 16) & 255) - r1) * f4))) << 16) | ((((i4 >> 8) & 255) + ((int) ((((i5 >> 8) & 255) - r2) * f4))) << 8) | ((i4 & 255) + ((int) (f4 * ((i5 & 255) - r8))));
    }

    private float p() {
        return this.f18493F;
    }

    public void C(float f4, float f5) {
        this.f18492E.J(f4);
        this.f18492E.G(f5);
        invalidateSelf();
    }

    public void D(@N Paint.Cap cap) {
        this.f18492E.K(cap);
        invalidateSelf();
    }

    public void E(float f4) {
        this.f18492E.L(f4);
        invalidateSelf();
    }

    public void F(int i4) {
        if (i4 == 0) {
            B(f18475N, f18476O, 12.0f, 6.0f);
        } else {
            B(f18480S, f18481T, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void H(float f4, d dVar) {
        if (f4 > 0.75f) {
            dVar.C(f((f4 - 0.75f) / 0.25f, dVar.p(), dVar.k()));
        } else {
            dVar.C(dVar.p());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f18493F, bounds.exactCenterX(), bounds.exactCenterY());
        this.f18492E.a(canvas, bounds);
        canvas.restore();
    }

    void e(float f4, d dVar, boolean z3) {
        float interpolation;
        float f5;
        if (this.f18497J) {
            a(f4, dVar);
            return;
        }
        if (f4 != 1.0f || z3) {
            float r4 = dVar.r();
            if (f4 < 0.5f) {
                interpolation = dVar.s();
                f5 = (f18473L.getInterpolation(f4 / 0.5f) * 0.79f) + f18490c0 + interpolation;
            } else {
                float s4 = dVar.s() + 0.79f;
                interpolation = s4 - (((1.0f - f18473L.getInterpolation((f4 - 0.5f) / 0.5f)) * 0.79f) + f18490c0);
                f5 = s4;
            }
            float f6 = r4 + (f18491d0 * f4);
            float f7 = (f4 + this.f18496I) * f18488a0;
            dVar.J(interpolation);
            dVar.G(f5);
            dVar.H(f6);
            A(f7);
        }
    }

    public boolean g() {
        return this.f18492E.n();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18492E.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.f18492E.d();
    }

    public float i() {
        return this.f18492E.e();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f18495H.isRunning();
    }

    public float j() {
        return this.f18492E.f();
    }

    public int k() {
        return this.f18492E.g();
    }

    public float l() {
        return this.f18492E.h();
    }

    @N
    public int[] m() {
        return this.f18492E.i();
    }

    public float n() {
        return this.f18492E.j();
    }

    public float o() {
        return this.f18492E.m();
    }

    public float q() {
        return this.f18492E.o();
    }

    @N
    public Paint.Cap r() {
        return this.f18492E.t();
    }

    public float s() {
        return this.f18492E.u();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f18492E.x(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18492E.D(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f18495H.cancel();
        this.f18492E.M();
        if (this.f18492E.j() != this.f18492E.o()) {
            this.f18497J = true;
            this.f18495H.setDuration(666L);
            this.f18495H.start();
        } else {
            this.f18492E.E(0);
            this.f18492E.w();
            this.f18495H.setDuration(1332L);
            this.f18495H.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f18495H.cancel();
        A(0.0f);
        this.f18492E.I(false);
        this.f18492E.E(0);
        this.f18492E.w();
        invalidateSelf();
    }

    public void t(float f4, float f5) {
        this.f18492E.y(f4, f5);
        invalidateSelf();
    }

    public void u(boolean z3) {
        this.f18492E.I(z3);
        invalidateSelf();
    }

    public void v(float f4) {
        this.f18492E.z(f4);
        invalidateSelf();
    }

    public void w(int i4) {
        this.f18492E.A(i4);
        invalidateSelf();
    }

    public void x(float f4) {
        this.f18492E.B(f4);
        invalidateSelf();
    }

    public void y(@N int... iArr) {
        this.f18492E.F(iArr);
        this.f18492E.E(0);
        invalidateSelf();
    }

    public void z(float f4) {
        this.f18492E.H(f4);
        invalidateSelf();
    }
}
