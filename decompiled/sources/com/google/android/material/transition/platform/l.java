package com.google.android.material.transition.platform;

import T0.a;
import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.D;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.d0;
import androidx.core.view.C0823k0;
import com.google.android.material.internal.E;
import com.google.android.material.transition.platform.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@W(21)
/* loaded from: classes2.dex */
public final class l extends Transition {

    /* renamed from: d0, reason: collision with root package name */
    public static final int f34219d0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f34220e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f34221f0 = 2;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f34222g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f34223h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f34224i0 = 2;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f34225j0 = 3;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f34226k0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    public static final int f34227l0 = 1;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f34228m0 = 2;

    /* renamed from: n0, reason: collision with root package name */
    private static final String f34229n0 = "l";

    /* renamed from: s0, reason: collision with root package name */
    private static final f f34234s0;

    /* renamed from: u0, reason: collision with root package name */
    private static final f f34236u0;

    /* renamed from: v0, reason: collision with root package name */
    private static final float f34237v0 = -1.0f;

    /* renamed from: E, reason: collision with root package name */
    private boolean f34238E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f34239F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f34240G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f34241H;

    /* renamed from: I, reason: collision with root package name */
    @D
    private int f34242I;

    /* renamed from: J, reason: collision with root package name */
    @D
    private int f34243J;

    /* renamed from: K, reason: collision with root package name */
    @D
    private int f34244K;

    /* renamed from: L, reason: collision with root package name */
    @InterfaceC0569l
    private int f34245L;

    /* renamed from: M, reason: collision with root package name */
    @InterfaceC0569l
    private int f34246M;

    /* renamed from: N, reason: collision with root package name */
    @InterfaceC0569l
    private int f34247N;

    /* renamed from: O, reason: collision with root package name */
    @InterfaceC0569l
    private int f34248O;

    /* renamed from: P, reason: collision with root package name */
    private int f34249P;

    /* renamed from: Q, reason: collision with root package name */
    private int f34250Q;

    /* renamed from: R, reason: collision with root package name */
    private int f34251R;

    /* renamed from: S, reason: collision with root package name */
    @P
    private View f34252S;

    /* renamed from: T, reason: collision with root package name */
    @P
    private View f34253T;

    /* renamed from: U, reason: collision with root package name */
    @P
    private com.google.android.material.shape.o f34254U;

    /* renamed from: V, reason: collision with root package name */
    @P
    private com.google.android.material.shape.o f34255V;

    /* renamed from: W, reason: collision with root package name */
    @P
    private e f34256W;

    /* renamed from: X, reason: collision with root package name */
    @P
    private e f34257X;

    /* renamed from: Y, reason: collision with root package name */
    @P
    private e f34258Y;

    /* renamed from: Z, reason: collision with root package name */
    @P
    private e f34259Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f34260a0;

    /* renamed from: b0, reason: collision with root package name */
    private float f34261b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f34262c0;

    /* renamed from: o0, reason: collision with root package name */
    private static final String f34230o0 = "materialContainerTransition:bounds";

    /* renamed from: p0, reason: collision with root package name */
    private static final String f34231p0 = "materialContainerTransition:shapeAppearance";

    /* renamed from: q0, reason: collision with root package name */
    private static final String[] f34232q0 = {f34230o0, f34231p0};

    /* renamed from: r0, reason: collision with root package name */
    private static final f f34233r0 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);

    /* renamed from: t0, reason: collision with root package name */
    private static final f f34235t0 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f34263a;

        a(h hVar) {
            this.f34263a = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34263a.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* loaded from: classes2.dex */
    class b extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34265a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f34266b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f34267c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f34268d;

        b(View view, h hVar, View view2, View view3) {
            this.f34265a = view;
            this.f34266b = hVar;
            this.f34267c = view2;
            this.f34268d = view3;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(@N Transition transition) {
            l.this.removeListener(this);
            if (l.this.f34239F) {
                return;
            }
            this.f34267c.setAlpha(1.0f);
            this.f34268d.setAlpha(1.0f);
            E.i(this.f34265a).b(this.f34266b);
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(@N Transition transition) {
            E.i(this.f34265a).a(this.f34266b);
            this.f34267c.setAlpha(0.0f);
            this.f34268d.setAlpha(0.0f);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface d {
    }

    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
        private final float f34270a;

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
        private final float f34271b;

        public e(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5) {
            this.f34270a = f4;
            this.f34271b = f5;
        }

        @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
        public float c() {
            return this.f34271b;
        }

        @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
        public float d() {
            return this.f34270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final e f34272a;

        /* renamed from: b, reason: collision with root package name */
        @N
        private final e f34273b;

        /* renamed from: c, reason: collision with root package name */
        @N
        private final e f34274c;

        /* renamed from: d, reason: collision with root package name */
        @N
        private final e f34275d;

        /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        private f(@N e eVar, @N e eVar2, @N e eVar3, @N e eVar4) {
            this.f34272a = eVar;
            this.f34273b = eVar2;
            this.f34274c = eVar3;
            this.f34275d = eVar4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface g {
    }

    /* loaded from: classes2.dex */
    private static final class h extends Drawable {

        /* renamed from: M, reason: collision with root package name */
        private static final int f34276M = 754974720;

        /* renamed from: N, reason: collision with root package name */
        private static final int f34277N = -7829368;

        /* renamed from: O, reason: collision with root package name */
        private static final float f34278O = 0.3f;

        /* renamed from: P, reason: collision with root package name */
        private static final float f34279P = 1.5f;

        /* renamed from: A, reason: collision with root package name */
        private final f f34280A;

        /* renamed from: B, reason: collision with root package name */
        private final com.google.android.material.transition.platform.a f34281B;

        /* renamed from: C, reason: collision with root package name */
        private final com.google.android.material.transition.platform.f f34282C;

        /* renamed from: D, reason: collision with root package name */
        private final boolean f34283D;

        /* renamed from: E, reason: collision with root package name */
        private final Paint f34284E;

        /* renamed from: F, reason: collision with root package name */
        private final Path f34285F;

        /* renamed from: G, reason: collision with root package name */
        private com.google.android.material.transition.platform.c f34286G;

        /* renamed from: H, reason: collision with root package name */
        private com.google.android.material.transition.platform.h f34287H;

        /* renamed from: I, reason: collision with root package name */
        private RectF f34288I;

        /* renamed from: J, reason: collision with root package name */
        private float f34289J;

        /* renamed from: K, reason: collision with root package name */
        private float f34290K;

        /* renamed from: L, reason: collision with root package name */
        private float f34291L;

        /* renamed from: a, reason: collision with root package name */
        private final View f34292a;

        /* renamed from: b, reason: collision with root package name */
        private final RectF f34293b;

        /* renamed from: c, reason: collision with root package name */
        private final com.google.android.material.shape.o f34294c;

        /* renamed from: d, reason: collision with root package name */
        private final float f34295d;

        /* renamed from: e, reason: collision with root package name */
        private final View f34296e;

        /* renamed from: f, reason: collision with root package name */
        private final RectF f34297f;

        /* renamed from: g, reason: collision with root package name */
        private final com.google.android.material.shape.o f34298g;

        /* renamed from: h, reason: collision with root package name */
        private final float f34299h;

        /* renamed from: i, reason: collision with root package name */
        private final Paint f34300i;

        /* renamed from: j, reason: collision with root package name */
        private final Paint f34301j;

        /* renamed from: k, reason: collision with root package name */
        private final Paint f34302k;

        /* renamed from: l, reason: collision with root package name */
        private final Paint f34303l;

        /* renamed from: m, reason: collision with root package name */
        private final Paint f34304m;

        /* renamed from: n, reason: collision with root package name */
        private final j f34305n;

        /* renamed from: o, reason: collision with root package name */
        private final PathMeasure f34306o;

        /* renamed from: p, reason: collision with root package name */
        private final float f34307p;

        /* renamed from: q, reason: collision with root package name */
        private final float[] f34308q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f34309r;

        /* renamed from: s, reason: collision with root package name */
        private final float f34310s;

        /* renamed from: t, reason: collision with root package name */
        private final float f34311t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f34312u;

        /* renamed from: v, reason: collision with root package name */
        private final com.google.android.material.shape.j f34313v;

        /* renamed from: w, reason: collision with root package name */
        private final RectF f34314w;

        /* renamed from: x, reason: collision with root package name */
        private final RectF f34315x;

        /* renamed from: y, reason: collision with root package name */
        private final RectF f34316y;

        /* renamed from: z, reason: collision with root package name */
        private final RectF f34317z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements v.c {
            a() {
            }

            @Override // com.google.android.material.transition.platform.v.c
            public void a(Canvas canvas) {
                h.this.f34292a.draw(canvas);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class b implements v.c {
            b() {
            }

            @Override // com.google.android.material.transition.platform.v.c
            public void a(Canvas canvas) {
                h.this.f34296e.draw(canvas);
            }
        }

        /* synthetic */ h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.o oVar, float f4, View view2, RectF rectF2, com.google.android.material.shape.o oVar2, float f5, int i4, int i5, int i6, int i7, boolean z3, boolean z4, com.google.android.material.transition.platform.a aVar, com.google.android.material.transition.platform.f fVar, f fVar2, boolean z5, a aVar2) {
            this(pathMotion, view, rectF, oVar, f4, view2, rectF2, oVar2, f5, i4, i5, i6, i7, z3, z4, aVar, fVar, fVar2, z5);
        }

        private static float d(RectF rectF, float f4) {
            return ((rectF.centerX() / (f4 / 2.0f)) - 1.0f) * f34278O;
        }

        private static float e(RectF rectF, float f4) {
            return (rectF.centerY() / f4) * f34279P;
        }

        private void f(Canvas canvas, RectF rectF, Path path, @InterfaceC0569l int i4) {
            PointF m4 = m(rectF);
            if (this.f34291L == 0.0f) {
                path.reset();
                path.moveTo(m4.x, m4.y);
            } else {
                path.lineTo(m4.x, m4.y);
                this.f34284E.setColor(i4);
                canvas.drawPath(path, this.f34284E);
            }
        }

        private void g(Canvas canvas, RectF rectF, @InterfaceC0569l int i4) {
            this.f34284E.setColor(i4);
            canvas.drawRect(rectF, this.f34284E);
        }

        private void h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f34305n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        private void i(Canvas canvas) {
            com.google.android.material.shape.j jVar = this.f34313v;
            RectF rectF = this.f34288I;
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f34313v.n0(this.f34289J);
            this.f34313v.B0((int) this.f34290K);
            this.f34313v.setShapeAppearanceModel(this.f34305n.c());
            this.f34313v.draw(canvas);
        }

        private void j(Canvas canvas) {
            com.google.android.material.shape.o c4 = this.f34305n.c();
            if (c4.u(this.f34288I)) {
                float a4 = c4.r().a(this.f34288I);
                canvas.drawRoundRect(this.f34288I, a4, a4, this.f34303l);
            } else {
                canvas.drawPath(this.f34305n.d(), this.f34303l);
            }
        }

        private void k(Canvas canvas) {
            n(canvas, this.f34302k);
            Rect bounds = getBounds();
            RectF rectF = this.f34316y;
            v.w(canvas, bounds, rectF.left, rectF.top, this.f34287H.f34209b, this.f34286G.f34187b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.f34301j);
            Rect bounds = getBounds();
            RectF rectF = this.f34314w;
            v.w(canvas, bounds, rectF.left, rectF.top, this.f34287H.f34208a, this.f34286G.f34186a, new a());
        }

        private static PointF m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        private void n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(float f4) {
            if (this.f34291L != f4) {
                p(f4);
            }
        }

        private void p(float f4) {
            float k4;
            float f5;
            float f6;
            RectF rectF;
            this.f34291L = f4;
            Paint paint = this.f34304m;
            if (this.f34309r) {
                k4 = v.k(0.0f, 255.0f, f4);
            } else {
                k4 = v.k(255.0f, 0.0f, f4);
            }
            paint.setAlpha((int) k4);
            this.f34306o.getPosTan(this.f34307p * f4, this.f34308q, null);
            float[] fArr = this.f34308q;
            float f7 = fArr[0];
            float f8 = fArr[1];
            if (f4 > 1.0f || f4 < 0.0f) {
                if (f4 > 1.0f) {
                    f6 = (f4 - 1.0f) / 0.00999999f;
                    f5 = 0.99f;
                } else {
                    f5 = 0.01f;
                    f6 = (f4 / 0.01f) * l.f34237v0;
                }
                this.f34306o.getPosTan(this.f34307p * f5, fArr, null);
                float[] fArr2 = this.f34308q;
                f7 += (f7 - fArr2[0]) * f6;
                f8 += (f8 - fArr2[1]) * f6;
            }
            float f9 = f7;
            float f10 = f8;
            com.google.android.material.transition.platform.h a4 = this.f34282C.a(f4, ((Float) androidx.core.util.u.l(Float.valueOf(this.f34280A.f34273b.f34270a))).floatValue(), ((Float) androidx.core.util.u.l(Float.valueOf(this.f34280A.f34273b.f34271b))).floatValue(), this.f34293b.width(), this.f34293b.height(), this.f34297f.width(), this.f34297f.height());
            this.f34287H = a4;
            RectF rectF2 = this.f34314w;
            float f11 = a4.f34210c;
            rectF2.set(f9 - (f11 / 2.0f), f10, (f11 / 2.0f) + f9, a4.f34211d + f10);
            RectF rectF3 = this.f34316y;
            com.google.android.material.transition.platform.h hVar = this.f34287H;
            float f12 = hVar.f34212e;
            rectF3.set(f9 - (f12 / 2.0f), f10, f9 + (f12 / 2.0f), hVar.f34213f + f10);
            this.f34315x.set(this.f34314w);
            this.f34317z.set(this.f34316y);
            float floatValue = ((Float) androidx.core.util.u.l(Float.valueOf(this.f34280A.f34274c.f34270a))).floatValue();
            float floatValue2 = ((Float) androidx.core.util.u.l(Float.valueOf(this.f34280A.f34274c.f34271b))).floatValue();
            boolean b4 = this.f34282C.b(this.f34287H);
            if (b4) {
                rectF = this.f34315x;
            } else {
                rectF = this.f34317z;
            }
            float l4 = v.l(0.0f, 1.0f, floatValue, floatValue2, f4);
            if (!b4) {
                l4 = 1.0f - l4;
            }
            this.f34282C.c(rectF, l4, this.f34287H);
            this.f34288I = new RectF(Math.min(this.f34315x.left, this.f34317z.left), Math.min(this.f34315x.top, this.f34317z.top), Math.max(this.f34315x.right, this.f34317z.right), Math.max(this.f34315x.bottom, this.f34317z.bottom));
            this.f34305n.b(f4, this.f34294c, this.f34298g, this.f34314w, this.f34315x, this.f34317z, this.f34280A.f34275d);
            this.f34289J = v.k(this.f34295d, this.f34299h, f4);
            float d4 = d(this.f34288I, this.f34310s);
            float e4 = e(this.f34288I, this.f34311t);
            float f13 = this.f34289J;
            float f14 = (int) (e4 * f13);
            this.f34290K = f14;
            this.f34303l.setShadowLayer(f13, (int) (d4 * f13), f14, f34276M);
            this.f34286G = this.f34281B.a(f4, ((Float) androidx.core.util.u.l(Float.valueOf(this.f34280A.f34272a.f34270a))).floatValue(), ((Float) androidx.core.util.u.l(Float.valueOf(this.f34280A.f34272a.f34271b))).floatValue(), 0.35f);
            if (this.f34301j.getColor() != 0) {
                this.f34301j.setAlpha(this.f34286G.f34186a);
            }
            if (this.f34302k.getColor() != 0) {
                this.f34302k.setAlpha(this.f34286G.f34187b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@N Canvas canvas) {
            int i4;
            if (this.f34304m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f34304m);
            }
            if (this.f34283D) {
                i4 = canvas.save();
            } else {
                i4 = -1;
            }
            if (this.f34312u && this.f34289J > 0.0f) {
                h(canvas);
            }
            this.f34305n.a(canvas);
            n(canvas, this.f34300i);
            if (this.f34286G.f34188c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.f34283D) {
                canvas.restoreToCount(i4);
                f(canvas, this.f34314w, this.f34285F, -65281);
                g(canvas, this.f34315x, androidx.core.view.D.f13124u);
                g(canvas, this.f34314w, -16711936);
                g(canvas, this.f34317z, -16711681);
                g(canvas, this.f34316y, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i4) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@P ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        private h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.o oVar, float f4, View view2, RectF rectF2, com.google.android.material.shape.o oVar2, float f5, @InterfaceC0569l int i4, @InterfaceC0569l int i5, @InterfaceC0569l int i6, int i7, boolean z3, boolean z4, com.google.android.material.transition.platform.a aVar, com.google.android.material.transition.platform.f fVar, f fVar2, boolean z5) {
            Paint paint = new Paint();
            this.f34300i = paint;
            Paint paint2 = new Paint();
            this.f34301j = paint2;
            Paint paint3 = new Paint();
            this.f34302k = paint3;
            this.f34303l = new Paint();
            Paint paint4 = new Paint();
            this.f34304m = paint4;
            this.f34305n = new j();
            this.f34308q = r7;
            com.google.android.material.shape.j jVar = new com.google.android.material.shape.j();
            this.f34313v = jVar;
            Paint paint5 = new Paint();
            this.f34284E = paint5;
            this.f34285F = new Path();
            this.f34292a = view;
            this.f34293b = rectF;
            this.f34294c = oVar;
            this.f34295d = f4;
            this.f34296e = view2;
            this.f34297f = rectF2;
            this.f34298g = oVar2;
            this.f34299h = f5;
            this.f34309r = z3;
            this.f34312u = z4;
            this.f34281B = aVar;
            this.f34282C = fVar;
            this.f34280A = fVar2;
            this.f34283D = z5;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f34310s = r12.widthPixels;
            this.f34311t = r12.heightPixels;
            paint.setColor(i4);
            paint2.setColor(i5);
            paint3.setColor(i6);
            jVar.o0(ColorStateList.valueOf(0));
            jVar.x0(2);
            jVar.u0(false);
            jVar.v0(f34277N);
            RectF rectF3 = new RectF(rectF);
            this.f34314w = rectF3;
            this.f34315x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f34316y = rectF4;
            this.f34317z = new RectF(rectF4);
            PointF m4 = m(rectF);
            PointF m5 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m4.x, m4.y, m5.x, m5.y), false);
            this.f34306o = pathMeasure;
            this.f34307p = pathMeasure.getLength();
            float[] fArr = {rectF.centerX(), rectF.top};
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(v.c(i7));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    static {
        a aVar = null;
        f34234s0 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), aVar);
        f34236u0 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), aVar);
    }

    public l() {
        this.f34238E = false;
        this.f34239F = false;
        this.f34240G = false;
        this.f34241H = false;
        this.f34242I = R.id.content;
        this.f34243J = -1;
        this.f34244K = -1;
        this.f34245L = 0;
        this.f34246M = 0;
        this.f34247N = 0;
        this.f34248O = 1375731712;
        this.f34249P = 0;
        this.f34250Q = 0;
        this.f34251R = 0;
        this.f34260a0 = Build.VERSION.SDK_INT >= 28;
        this.f34261b0 = f34237v0;
        this.f34262c0 = f34237v0;
    }

    private f E(boolean z3, f fVar, f fVar2) {
        if (!z3) {
            fVar = fVar2;
        }
        return new f((e) v.d(this.f34256W, fVar.f34272a), (e) v.d(this.f34257X, fVar.f34273b), (e) v.d(this.f34258Y, fVar.f34274c), (e) v.d(this.f34259Z, fVar.f34275d), null);
    }

    @d0
    private static int G(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{a.c.Ph});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean J(@N RectF rectF, @N RectF rectF2) {
        int i4 = this.f34249P;
        if (i4 != 0) {
            if (i4 == 1) {
                return true;
            }
            if (i4 == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.f34249P);
        }
        if (v.a(rectF2) <= v.a(rectF)) {
            return false;
        }
        return true;
    }

    private void L(Context context, boolean z3) {
        int i4;
        v.r(this, context, a.c.Wb, com.google.android.material.animation.a.f31208b);
        if (z3) {
            i4 = a.c.Mb;
        } else {
            i4 = a.c.Pb;
        }
        v.q(this, context, i4);
        if (!this.f34240G) {
            v.s(this, context, a.c.Yb);
        }
    }

    private f b(boolean z3) {
        PathMotion pathMotion = getPathMotion();
        if (!(pathMotion instanceof ArcMotion) && !(pathMotion instanceof k)) {
            return E(z3, f34233r0, f34234s0);
        }
        return E(z3, f34235t0, f34236u0);
    }

    private static RectF d(View view, @P View view2, float f4, float f5) {
        if (view2 != null) {
            RectF g4 = v.g(view2);
            g4.offset(f4, f5);
            return g4;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    private static com.google.android.material.shape.o e(@N View view, @N RectF rectF, @P com.google.android.material.shape.o oVar) {
        return v.b(w(view, oVar), rectF);
    }

    private static void f(@N TransitionValues transitionValues, @P View view, @D int i4, @P com.google.android.material.shape.o oVar) {
        RectF g4;
        if (i4 != -1) {
            transitionValues.view = v.f(transitionValues.view, i4);
        } else if (view != null) {
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(a.h.f2820r3) instanceof View) {
            View view2 = (View) transitionValues.view.getTag(a.h.f2820r3);
            transitionValues.view.setTag(a.h.f2820r3, null);
            transitionValues.view = view2;
        }
        View view3 = transitionValues.view;
        if (C0823k0.U0(view3) || view3.getWidth() != 0 || view3.getHeight() != 0) {
            if (view3.getParent() == null) {
                g4 = v.h(view3);
            } else {
                g4 = v.g(view3);
            }
            transitionValues.values.put(f34230o0, g4);
            transitionValues.values.put(f34231p0, e(view3, g4, oVar));
        }
    }

    private static float i(float f4, View view) {
        if (f4 == f34237v0) {
            return C0823k0.R(view);
        }
        return f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.o w(@N View view, @P com.google.android.material.shape.o oVar) {
        if (oVar != null) {
            return oVar;
        }
        if (view.getTag(a.h.f2820r3) instanceof com.google.android.material.shape.o) {
            return (com.google.android.material.shape.o) view.getTag(a.h.f2820r3);
        }
        Context context = view.getContext();
        int G3 = G(context);
        if (G3 != -1) {
            return com.google.android.material.shape.o.b(context, G3, 0).m();
        }
        if (view instanceof com.google.android.material.shape.s) {
            return ((com.google.android.material.shape.s) view).getShapeAppearanceModel();
        }
        return com.google.android.material.shape.o.a().m();
    }

    public float A() {
        return this.f34261b0;
    }

    @P
    public com.google.android.material.shape.o B() {
        return this.f34254U;
    }

    @P
    public View C() {
        return this.f34252S;
    }

    @D
    public int D() {
        return this.f34243J;
    }

    public int F() {
        return this.f34249P;
    }

    public boolean H() {
        return this.f34238E;
    }

    public boolean I() {
        return this.f34260a0;
    }

    public boolean K() {
        return this.f34239F;
    }

    public void M(@InterfaceC0569l int i4) {
        this.f34245L = i4;
        this.f34246M = i4;
        this.f34247N = i4;
    }

    public void N(@InterfaceC0569l int i4) {
        this.f34245L = i4;
    }

    public void O(boolean z3) {
        this.f34238E = z3;
    }

    public void P(@D int i4) {
        this.f34242I = i4;
    }

    public void Q(boolean z3) {
        this.f34260a0 = z3;
    }

    public void R(@InterfaceC0569l int i4) {
        this.f34247N = i4;
    }

    public void S(float f4) {
        this.f34262c0 = f4;
    }

    public void T(@P com.google.android.material.shape.o oVar) {
        this.f34255V = oVar;
    }

    public void U(@P View view) {
        this.f34253T = view;
    }

    public void V(@D int i4) {
        this.f34244K = i4;
    }

    public void W(int i4) {
        this.f34250Q = i4;
    }

    public void X(@P e eVar) {
        this.f34256W = eVar;
    }

    public void Y(int i4) {
        this.f34251R = i4;
    }

    public void Z(boolean z3) {
        this.f34239F = z3;
    }

    public void a0(@P e eVar) {
        this.f34258Y = eVar;
    }

    public void b0(@P e eVar) {
        this.f34257X = eVar;
    }

    public void c0(@InterfaceC0569l int i4) {
        this.f34248O = i4;
    }

    @Override // android.transition.Transition
    public void captureEndValues(@N TransitionValues transitionValues) {
        f(transitionValues, this.f34253T, this.f34244K, this.f34255V);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@N TransitionValues transitionValues) {
        f(transitionValues, this.f34252S, this.f34243J, this.f34254U);
    }

    @Override // android.transition.Transition
    @P
    public Animator createAnimator(@N ViewGroup viewGroup, @P TransitionValues transitionValues, @P TransitionValues transitionValues2) {
        View view;
        View e4;
        View view2;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get(f34230o0);
            com.google.android.material.shape.o oVar = (com.google.android.material.shape.o) transitionValues.values.get(f34231p0);
            if (rectF != null && oVar != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get(f34230o0);
                com.google.android.material.shape.o oVar2 = (com.google.android.material.shape.o) transitionValues2.values.get(f34231p0);
                if (rectF2 != null && oVar2 != null) {
                    View view3 = transitionValues.view;
                    View view4 = transitionValues2.view;
                    if (view4.getParent() != null) {
                        view = view4;
                    } else {
                        view = view3;
                    }
                    if (this.f34242I == view.getId()) {
                        e4 = (View) view.getParent();
                        view2 = view;
                    } else {
                        e4 = v.e(view, this.f34242I);
                        view2 = null;
                    }
                    RectF g4 = v.g(e4);
                    float f4 = -g4.left;
                    float f5 = -g4.top;
                    RectF d4 = d(e4, view2, f4, f5);
                    rectF.offset(f4, f5);
                    rectF2.offset(f4, f5);
                    boolean J3 = J(rectF, rectF2);
                    if (!this.f34241H) {
                        L(view.getContext(), J3);
                    }
                    h hVar = new h(getPathMotion(), view3, rectF, oVar, i(this.f34261b0, view3), view4, rectF2, oVar2, i(this.f34262c0, view4), this.f34245L, this.f34246M, this.f34247N, this.f34248O, J3, this.f34260a0, com.google.android.material.transition.platform.b.a(this.f34250Q, J3), com.google.android.material.transition.platform.g.a(this.f34251R, J3, rectF, rectF2), b(J3), this.f34238E, null);
                    hVar.setBounds(Math.round(d4.left), Math.round(d4.top), Math.round(d4.right), Math.round(d4.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new a(hVar));
                    addListener(new b(e4, hVar, view3, view4));
                    return ofFloat;
                }
                Log.w(f34229n0, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                return null;
            }
            Log.w(f34229n0, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    public void d0(@P e eVar) {
        this.f34259Z = eVar;
    }

    public void e0(@InterfaceC0569l int i4) {
        this.f34246M = i4;
    }

    public void f0(float f4) {
        this.f34261b0 = f4;
    }

    @InterfaceC0569l
    public int g() {
        return this.f34245L;
    }

    public void g0(@P com.google.android.material.shape.o oVar) {
        this.f34254U = oVar;
    }

    @Override // android.transition.Transition
    @P
    public String[] getTransitionProperties() {
        return f34232q0;
    }

    @D
    public int h() {
        return this.f34242I;
    }

    public void h0(@P View view) {
        this.f34252S = view;
    }

    public void i0(@D int i4) {
        this.f34243J = i4;
    }

    @InterfaceC0569l
    public int j() {
        return this.f34247N;
    }

    public void j0(int i4) {
        this.f34249P = i4;
    }

    public float k() {
        return this.f34262c0;
    }

    @P
    public com.google.android.material.shape.o l() {
        return this.f34255V;
    }

    @P
    public View n() {
        return this.f34253T;
    }

    @D
    public int o() {
        return this.f34244K;
    }

    public int p() {
        return this.f34250Q;
    }

    @P
    public e q() {
        return this.f34256W;
    }

    public int r() {
        return this.f34251R;
    }

    @P
    public e s() {
        return this.f34258Y;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@P PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f34240G = true;
    }

    @P
    public e t() {
        return this.f34257X;
    }

    @InterfaceC0569l
    public int u() {
        return this.f34248O;
    }

    @P
    public e x() {
        return this.f34259Z;
    }

    @InterfaceC0569l
    public int y() {
        return this.f34246M;
    }

    public l(@N Context context, boolean z3) {
        this.f34238E = false;
        this.f34239F = false;
        this.f34240G = false;
        this.f34241H = false;
        this.f34242I = R.id.content;
        this.f34243J = -1;
        this.f34244K = -1;
        this.f34245L = 0;
        this.f34246M = 0;
        this.f34247N = 0;
        this.f34248O = 1375731712;
        this.f34249P = 0;
        this.f34250Q = 0;
        this.f34251R = 0;
        this.f34260a0 = Build.VERSION.SDK_INT >= 28;
        this.f34261b0 = f34237v0;
        this.f34262c0 = f34237v0;
        L(context, z3);
        this.f34241H = true;
    }
}
