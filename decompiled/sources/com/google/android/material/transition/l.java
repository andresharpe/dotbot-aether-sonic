package com.google.android.material.transition;

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
import androidx.annotation.d0;
import androidx.core.view.C0823k0;
import androidx.transition.AbstractC0991z;
import androidx.transition.C0968b;
import androidx.transition.J;
import androidx.transition.S;
import com.google.android.material.internal.E;
import com.google.android.material.transition.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class l extends J {

    /* renamed from: Y0, reason: collision with root package name */
    public static final int f34064Y0 = 0;

    /* renamed from: Z0, reason: collision with root package name */
    public static final int f34065Z0 = 1;

    /* renamed from: a1, reason: collision with root package name */
    public static final int f34066a1 = 2;

    /* renamed from: b1, reason: collision with root package name */
    public static final int f34067b1 = 0;

    /* renamed from: c1, reason: collision with root package name */
    public static final int f34068c1 = 1;

    /* renamed from: d1, reason: collision with root package name */
    public static final int f34069d1 = 2;

    /* renamed from: e1, reason: collision with root package name */
    public static final int f34070e1 = 3;

    /* renamed from: f1, reason: collision with root package name */
    public static final int f34071f1 = 0;

    /* renamed from: g1, reason: collision with root package name */
    public static final int f34072g1 = 1;

    /* renamed from: h1, reason: collision with root package name */
    public static final int f34073h1 = 2;

    /* renamed from: i1, reason: collision with root package name */
    private static final String f34074i1 = "l";

    /* renamed from: n1, reason: collision with root package name */
    private static final f f34079n1;

    /* renamed from: p1, reason: collision with root package name */
    private static final f f34081p1;

    /* renamed from: q1, reason: collision with root package name */
    private static final float f34082q1 = -1.0f;

    /* renamed from: A0, reason: collision with root package name */
    private boolean f34083A0;

    /* renamed from: B0, reason: collision with root package name */
    private boolean f34084B0;

    /* renamed from: C0, reason: collision with root package name */
    private boolean f34085C0;

    /* renamed from: D0, reason: collision with root package name */
    @D
    private int f34086D0;

    /* renamed from: E0, reason: collision with root package name */
    @D
    private int f34087E0;

    /* renamed from: F0, reason: collision with root package name */
    @D
    private int f34088F0;

    /* renamed from: G0, reason: collision with root package name */
    @InterfaceC0569l
    private int f34089G0;

    /* renamed from: H0, reason: collision with root package name */
    @InterfaceC0569l
    private int f34090H0;

    /* renamed from: I0, reason: collision with root package name */
    @InterfaceC0569l
    private int f34091I0;

    /* renamed from: J0, reason: collision with root package name */
    @InterfaceC0569l
    private int f34092J0;

    /* renamed from: K0, reason: collision with root package name */
    private int f34093K0;

    /* renamed from: L0, reason: collision with root package name */
    private int f34094L0;

    /* renamed from: M0, reason: collision with root package name */
    private int f34095M0;

    /* renamed from: N0, reason: collision with root package name */
    @P
    private View f34096N0;

    /* renamed from: O0, reason: collision with root package name */
    @P
    private View f34097O0;

    /* renamed from: P0, reason: collision with root package name */
    @P
    private com.google.android.material.shape.o f34098P0;

    /* renamed from: Q0, reason: collision with root package name */
    @P
    private com.google.android.material.shape.o f34099Q0;

    /* renamed from: R0, reason: collision with root package name */
    @P
    private e f34100R0;

    /* renamed from: S0, reason: collision with root package name */
    @P
    private e f34101S0;

    /* renamed from: T0, reason: collision with root package name */
    @P
    private e f34102T0;

    /* renamed from: U0, reason: collision with root package name */
    @P
    private e f34103U0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f34104V0;

    /* renamed from: W0, reason: collision with root package name */
    private float f34105W0;

    /* renamed from: X0, reason: collision with root package name */
    private float f34106X0;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f34107z0;

    /* renamed from: j1, reason: collision with root package name */
    private static final String f34075j1 = "materialContainerTransition:bounds";

    /* renamed from: k1, reason: collision with root package name */
    private static final String f34076k1 = "materialContainerTransition:shapeAppearance";

    /* renamed from: l1, reason: collision with root package name */
    private static final String[] f34077l1 = {f34075j1, f34076k1};

    /* renamed from: m1, reason: collision with root package name */
    private static final f f34078m1 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);

    /* renamed from: o1, reason: collision with root package name */
    private static final f f34080o1 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f34108a;

        a(h hVar) {
            this.f34108a = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34108a.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* loaded from: classes2.dex */
    class b extends t {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34110a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f34111b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f34112c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f34113d;

        b(View view, h hVar, View view2, View view3) {
            this.f34110a = view;
            this.f34111b = hVar;
            this.f34112c = view2;
            this.f34113d = view3;
        }

        @Override // com.google.android.material.transition.t, androidx.transition.J.h
        public void a(@N J j4) {
            E.i(this.f34110a).a(this.f34111b);
            this.f34112c.setAlpha(0.0f);
            this.f34113d.setAlpha(0.0f);
        }

        @Override // com.google.android.material.transition.t, androidx.transition.J.h
        public void c(@N J j4) {
            l.this.m0(this);
            if (l.this.f34083A0) {
                return;
            }
            this.f34112c.setAlpha(1.0f);
            this.f34113d.setAlpha(1.0f);
            E.i(this.f34110a).b(this.f34111b);
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
        private final float f34115a;

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
        private final float f34116b;

        public e(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5) {
            this.f34115a = f4;
            this.f34116b = f5;
        }

        @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
        public float c() {
            return this.f34116b;
        }

        @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
        public float d() {
            return this.f34115a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final e f34117a;

        /* renamed from: b, reason: collision with root package name */
        @N
        private final e f34118b;

        /* renamed from: c, reason: collision with root package name */
        @N
        private final e f34119c;

        /* renamed from: d, reason: collision with root package name */
        @N
        private final e f34120d;

        /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        private f(@N e eVar, @N e eVar2, @N e eVar3, @N e eVar4) {
            this.f34117a = eVar;
            this.f34118b = eVar2;
            this.f34119c = eVar3;
            this.f34120d = eVar4;
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
        private static final int f34121M = 754974720;

        /* renamed from: N, reason: collision with root package name */
        private static final int f34122N = -7829368;

        /* renamed from: O, reason: collision with root package name */
        private static final float f34123O = 0.3f;

        /* renamed from: P, reason: collision with root package name */
        private static final float f34124P = 1.5f;

        /* renamed from: A, reason: collision with root package name */
        private final f f34125A;

        /* renamed from: B, reason: collision with root package name */
        private final com.google.android.material.transition.a f34126B;

        /* renamed from: C, reason: collision with root package name */
        private final com.google.android.material.transition.f f34127C;

        /* renamed from: D, reason: collision with root package name */
        private final boolean f34128D;

        /* renamed from: E, reason: collision with root package name */
        private final Paint f34129E;

        /* renamed from: F, reason: collision with root package name */
        private final Path f34130F;

        /* renamed from: G, reason: collision with root package name */
        private com.google.android.material.transition.c f34131G;

        /* renamed from: H, reason: collision with root package name */
        private com.google.android.material.transition.h f34132H;

        /* renamed from: I, reason: collision with root package name */
        private RectF f34133I;

        /* renamed from: J, reason: collision with root package name */
        private float f34134J;

        /* renamed from: K, reason: collision with root package name */
        private float f34135K;

        /* renamed from: L, reason: collision with root package name */
        private float f34136L;

        /* renamed from: a, reason: collision with root package name */
        private final View f34137a;

        /* renamed from: b, reason: collision with root package name */
        private final RectF f34138b;

        /* renamed from: c, reason: collision with root package name */
        private final com.google.android.material.shape.o f34139c;

        /* renamed from: d, reason: collision with root package name */
        private final float f34140d;

        /* renamed from: e, reason: collision with root package name */
        private final View f34141e;

        /* renamed from: f, reason: collision with root package name */
        private final RectF f34142f;

        /* renamed from: g, reason: collision with root package name */
        private final com.google.android.material.shape.o f34143g;

        /* renamed from: h, reason: collision with root package name */
        private final float f34144h;

        /* renamed from: i, reason: collision with root package name */
        private final Paint f34145i;

        /* renamed from: j, reason: collision with root package name */
        private final Paint f34146j;

        /* renamed from: k, reason: collision with root package name */
        private final Paint f34147k;

        /* renamed from: l, reason: collision with root package name */
        private final Paint f34148l;

        /* renamed from: m, reason: collision with root package name */
        private final Paint f34149m;

        /* renamed from: n, reason: collision with root package name */
        private final j f34150n;

        /* renamed from: o, reason: collision with root package name */
        private final PathMeasure f34151o;

        /* renamed from: p, reason: collision with root package name */
        private final float f34152p;

        /* renamed from: q, reason: collision with root package name */
        private final float[] f34153q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f34154r;

        /* renamed from: s, reason: collision with root package name */
        private final float f34155s;

        /* renamed from: t, reason: collision with root package name */
        private final float f34156t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f34157u;

        /* renamed from: v, reason: collision with root package name */
        private final com.google.android.material.shape.j f34158v;

        /* renamed from: w, reason: collision with root package name */
        private final RectF f34159w;

        /* renamed from: x, reason: collision with root package name */
        private final RectF f34160x;

        /* renamed from: y, reason: collision with root package name */
        private final RectF f34161y;

        /* renamed from: z, reason: collision with root package name */
        private final RectF f34162z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements u.c {
            a() {
            }

            @Override // com.google.android.material.transition.u.c
            public void a(Canvas canvas) {
                h.this.f34137a.draw(canvas);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class b implements u.c {
            b() {
            }

            @Override // com.google.android.material.transition.u.c
            public void a(Canvas canvas) {
                h.this.f34141e.draw(canvas);
            }
        }

        /* synthetic */ h(AbstractC0991z abstractC0991z, View view, RectF rectF, com.google.android.material.shape.o oVar, float f4, View view2, RectF rectF2, com.google.android.material.shape.o oVar2, float f5, int i4, int i5, int i6, int i7, boolean z3, boolean z4, com.google.android.material.transition.a aVar, com.google.android.material.transition.f fVar, f fVar2, boolean z5, a aVar2) {
            this(abstractC0991z, view, rectF, oVar, f4, view2, rectF2, oVar2, f5, i4, i5, i6, i7, z3, z4, aVar, fVar, fVar2, z5);
        }

        private static float d(RectF rectF, float f4) {
            return ((rectF.centerX() / (f4 / 2.0f)) - 1.0f) * f34123O;
        }

        private static float e(RectF rectF, float f4) {
            return (rectF.centerY() / f4) * f34124P;
        }

        private void f(Canvas canvas, RectF rectF, Path path, @InterfaceC0569l int i4) {
            PointF m4 = m(rectF);
            if (this.f34136L == 0.0f) {
                path.reset();
                path.moveTo(m4.x, m4.y);
            } else {
                path.lineTo(m4.x, m4.y);
                this.f34129E.setColor(i4);
                canvas.drawPath(path, this.f34129E);
            }
        }

        private void g(Canvas canvas, RectF rectF, @InterfaceC0569l int i4) {
            this.f34129E.setColor(i4);
            canvas.drawRect(rectF, this.f34129E);
        }

        private void h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f34150n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        private void i(Canvas canvas) {
            com.google.android.material.shape.j jVar = this.f34158v;
            RectF rectF = this.f34133I;
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f34158v.n0(this.f34134J);
            this.f34158v.B0((int) this.f34135K);
            this.f34158v.setShapeAppearanceModel(this.f34150n.c());
            this.f34158v.draw(canvas);
        }

        private void j(Canvas canvas) {
            com.google.android.material.shape.o c4 = this.f34150n.c();
            if (c4.u(this.f34133I)) {
                float a4 = c4.r().a(this.f34133I);
                canvas.drawRoundRect(this.f34133I, a4, a4, this.f34148l);
            } else {
                canvas.drawPath(this.f34150n.d(), this.f34148l);
            }
        }

        private void k(Canvas canvas) {
            n(canvas, this.f34147k);
            Rect bounds = getBounds();
            RectF rectF = this.f34161y;
            u.w(canvas, bounds, rectF.left, rectF.top, this.f34132H.f34054b, this.f34131G.f34032b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.f34146j);
            Rect bounds = getBounds();
            RectF rectF = this.f34159w;
            u.w(canvas, bounds, rectF.left, rectF.top, this.f34132H.f34053a, this.f34131G.f34031a, new a());
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
            if (this.f34136L != f4) {
                p(f4);
            }
        }

        private void p(float f4) {
            float k4;
            float f5;
            float f6;
            RectF rectF;
            this.f34136L = f4;
            Paint paint = this.f34149m;
            if (this.f34154r) {
                k4 = u.k(0.0f, 255.0f, f4);
            } else {
                k4 = u.k(255.0f, 0.0f, f4);
            }
            paint.setAlpha((int) k4);
            this.f34151o.getPosTan(this.f34152p * f4, this.f34153q, null);
            float[] fArr = this.f34153q;
            float f7 = fArr[0];
            float f8 = fArr[1];
            if (f4 > 1.0f || f4 < 0.0f) {
                if (f4 > 1.0f) {
                    f6 = (f4 - 1.0f) / 0.00999999f;
                    f5 = 0.99f;
                } else {
                    f5 = 0.01f;
                    f6 = (f4 / 0.01f) * l.f34082q1;
                }
                this.f34151o.getPosTan(this.f34152p * f5, fArr, null);
                float[] fArr2 = this.f34153q;
                f7 += (f7 - fArr2[0]) * f6;
                f8 += (f8 - fArr2[1]) * f6;
            }
            float f9 = f7;
            float f10 = f8;
            com.google.android.material.transition.h a4 = this.f34127C.a(f4, ((Float) androidx.core.util.u.l(Float.valueOf(this.f34125A.f34118b.f34115a))).floatValue(), ((Float) androidx.core.util.u.l(Float.valueOf(this.f34125A.f34118b.f34116b))).floatValue(), this.f34138b.width(), this.f34138b.height(), this.f34142f.width(), this.f34142f.height());
            this.f34132H = a4;
            RectF rectF2 = this.f34159w;
            float f11 = a4.f34055c;
            rectF2.set(f9 - (f11 / 2.0f), f10, (f11 / 2.0f) + f9, a4.f34056d + f10);
            RectF rectF3 = this.f34161y;
            com.google.android.material.transition.h hVar = this.f34132H;
            float f12 = hVar.f34057e;
            rectF3.set(f9 - (f12 / 2.0f), f10, f9 + (f12 / 2.0f), hVar.f34058f + f10);
            this.f34160x.set(this.f34159w);
            this.f34162z.set(this.f34161y);
            float floatValue = ((Float) androidx.core.util.u.l(Float.valueOf(this.f34125A.f34119c.f34115a))).floatValue();
            float floatValue2 = ((Float) androidx.core.util.u.l(Float.valueOf(this.f34125A.f34119c.f34116b))).floatValue();
            boolean b4 = this.f34127C.b(this.f34132H);
            if (b4) {
                rectF = this.f34160x;
            } else {
                rectF = this.f34162z;
            }
            float l4 = u.l(0.0f, 1.0f, floatValue, floatValue2, f4);
            if (!b4) {
                l4 = 1.0f - l4;
            }
            this.f34127C.c(rectF, l4, this.f34132H);
            this.f34133I = new RectF(Math.min(this.f34160x.left, this.f34162z.left), Math.min(this.f34160x.top, this.f34162z.top), Math.max(this.f34160x.right, this.f34162z.right), Math.max(this.f34160x.bottom, this.f34162z.bottom));
            this.f34150n.b(f4, this.f34139c, this.f34143g, this.f34159w, this.f34160x, this.f34162z, this.f34125A.f34120d);
            this.f34134J = u.k(this.f34140d, this.f34144h, f4);
            float d4 = d(this.f34133I, this.f34155s);
            float e4 = e(this.f34133I, this.f34156t);
            float f13 = this.f34134J;
            float f14 = (int) (e4 * f13);
            this.f34135K = f14;
            this.f34148l.setShadowLayer(f13, (int) (d4 * f13), f14, f34121M);
            this.f34131G = this.f34126B.a(f4, ((Float) androidx.core.util.u.l(Float.valueOf(this.f34125A.f34117a.f34115a))).floatValue(), ((Float) androidx.core.util.u.l(Float.valueOf(this.f34125A.f34117a.f34116b))).floatValue(), 0.35f);
            if (this.f34146j.getColor() != 0) {
                this.f34146j.setAlpha(this.f34131G.f34031a);
            }
            if (this.f34147k.getColor() != 0) {
                this.f34147k.setAlpha(this.f34131G.f34032b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@N Canvas canvas) {
            int i4;
            if (this.f34149m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f34149m);
            }
            if (this.f34128D) {
                i4 = canvas.save();
            } else {
                i4 = -1;
            }
            if (this.f34157u && this.f34134J > 0.0f) {
                h(canvas);
            }
            this.f34150n.a(canvas);
            n(canvas, this.f34145i);
            if (this.f34131G.f34033c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.f34128D) {
                canvas.restoreToCount(i4);
                f(canvas, this.f34159w, this.f34130F, -65281);
                g(canvas, this.f34160x, androidx.core.view.D.f13124u);
                g(canvas, this.f34159w, -16711936);
                g(canvas, this.f34162z, -16711681);
                g(canvas, this.f34161y, -16776961);
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

        private h(AbstractC0991z abstractC0991z, View view, RectF rectF, com.google.android.material.shape.o oVar, float f4, View view2, RectF rectF2, com.google.android.material.shape.o oVar2, float f5, @InterfaceC0569l int i4, @InterfaceC0569l int i5, @InterfaceC0569l int i6, int i7, boolean z3, boolean z4, com.google.android.material.transition.a aVar, com.google.android.material.transition.f fVar, f fVar2, boolean z5) {
            Paint paint = new Paint();
            this.f34145i = paint;
            Paint paint2 = new Paint();
            this.f34146j = paint2;
            Paint paint3 = new Paint();
            this.f34147k = paint3;
            this.f34148l = new Paint();
            Paint paint4 = new Paint();
            this.f34149m = paint4;
            this.f34150n = new j();
            this.f34153q = r7;
            com.google.android.material.shape.j jVar = new com.google.android.material.shape.j();
            this.f34158v = jVar;
            Paint paint5 = new Paint();
            this.f34129E = paint5;
            this.f34130F = new Path();
            this.f34137a = view;
            this.f34138b = rectF;
            this.f34139c = oVar;
            this.f34140d = f4;
            this.f34141e = view2;
            this.f34142f = rectF2;
            this.f34143g = oVar2;
            this.f34144h = f5;
            this.f34154r = z3;
            this.f34157u = z4;
            this.f34126B = aVar;
            this.f34127C = fVar;
            this.f34125A = fVar2;
            this.f34128D = z5;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f34155s = r12.widthPixels;
            this.f34156t = r12.heightPixels;
            paint.setColor(i4);
            paint2.setColor(i5);
            paint3.setColor(i6);
            jVar.o0(ColorStateList.valueOf(0));
            jVar.x0(2);
            jVar.u0(false);
            jVar.v0(f34122N);
            RectF rectF3 = new RectF(rectF);
            this.f34159w = rectF3;
            this.f34160x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f34161y = rectF4;
            this.f34162z = new RectF(rectF4);
            PointF m4 = m(rectF);
            PointF m5 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(abstractC0991z.a(m4.x, m4.y, m5.x, m5.y), false);
            this.f34151o = pathMeasure;
            this.f34152p = pathMeasure.getLength();
            float[] fArr = {rectF.centerX(), rectF.top};
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(u.c(i7));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    static {
        a aVar = null;
        f34079n1 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), aVar);
        f34081p1 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), aVar);
    }

    public l() {
        this.f34107z0 = false;
        this.f34083A0 = false;
        this.f34084B0 = false;
        this.f34085C0 = false;
        this.f34086D0 = R.id.content;
        this.f34087E0 = -1;
        this.f34088F0 = -1;
        this.f34089G0 = 0;
        this.f34090H0 = 0;
        this.f34091I0 = 0;
        this.f34092J0 = 1375731712;
        this.f34093K0 = 0;
        this.f34094L0 = 0;
        this.f34095M0 = 0;
        this.f34104V0 = Build.VERSION.SDK_INT >= 28;
        this.f34105W0 = f34082q1;
        this.f34106X0 = f34082q1;
    }

    private f F0(boolean z3) {
        AbstractC0991z Q3 = Q();
        if (!(Q3 instanceof C0968b) && !(Q3 instanceof k)) {
            return e1(z3, f34078m1, f34079n1);
        }
        return e1(z3, f34080o1, f34081p1);
    }

    private static RectF G0(View view, @P View view2, float f4, float f5) {
        if (view2 != null) {
            RectF g4 = u.g(view2);
            g4.offset(f4, f5);
            return g4;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    private static com.google.android.material.shape.o H0(@N View view, @N RectF rectF, @P com.google.android.material.shape.o oVar) {
        return u.b(X0(view, oVar), rectF);
    }

    private static void I0(@N S s4, @P View view, @D int i4, @P com.google.android.material.shape.o oVar) {
        RectF g4;
        if (i4 != -1) {
            s4.f19960b = u.f(s4.f19960b, i4);
        } else if (view != null) {
            s4.f19960b = view;
        } else if (s4.f19960b.getTag(a.h.f2820r3) instanceof View) {
            View view2 = (View) s4.f19960b.getTag(a.h.f2820r3);
            s4.f19960b.setTag(a.h.f2820r3, null);
            s4.f19960b = view2;
        }
        View view3 = s4.f19960b;
        if (C0823k0.U0(view3) || view3.getWidth() != 0 || view3.getHeight() != 0) {
            if (view3.getParent() == null) {
                g4 = u.h(view3);
            } else {
                g4 = u.g(view3);
            }
            s4.f19959a.put(f34075j1, g4);
            s4.f19959a.put(f34076k1, H0(view3, g4, oVar));
        }
    }

    private static float L0(float f4, View view) {
        if (f4 == f34082q1) {
            return C0823k0.R(view);
        }
        return f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.o X0(@N View view, @P com.google.android.material.shape.o oVar) {
        if (oVar != null) {
            return oVar;
        }
        if (view.getTag(a.h.f2820r3) instanceof com.google.android.material.shape.o) {
            return (com.google.android.material.shape.o) view.getTag(a.h.f2820r3);
        }
        Context context = view.getContext();
        int g12 = g1(context);
        if (g12 != -1) {
            return com.google.android.material.shape.o.b(context, g12, 0).m();
        }
        if (view instanceof com.google.android.material.shape.s) {
            return ((com.google.android.material.shape.s) view).getShapeAppearanceModel();
        }
        return com.google.android.material.shape.o.a().m();
    }

    private f e1(boolean z3, f fVar, f fVar2) {
        if (!z3) {
            fVar = fVar2;
        }
        return new f((e) u.d(this.f34100R0, fVar.f34117a), (e) u.d(this.f34101S0, fVar.f34118b), (e) u.d(this.f34102T0, fVar.f34119c), (e) u.d(this.f34103U0, fVar.f34120d), null);
    }

    @d0
    private static int g1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{a.c.Ph});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean j1(@N RectF rectF, @N RectF rectF2) {
        int i4 = this.f34093K0;
        if (i4 != 0) {
            if (i4 == 1) {
                return true;
            }
            if (i4 == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.f34093K0);
        }
        if (u.a(rectF2) <= u.a(rectF)) {
            return false;
        }
        return true;
    }

    private void l1(Context context, boolean z3) {
        int i4;
        u.r(this, context, a.c.Wb, com.google.android.material.animation.a.f31208b);
        if (z3) {
            i4 = a.c.Mb;
        } else {
            i4 = a.c.Pb;
        }
        u.q(this, context, i4);
        if (!this.f34084B0) {
            u.s(this, context, a.c.Yb);
        }
    }

    public void A1(@P e eVar) {
        this.f34102T0 = eVar;
    }

    public void B1(@P e eVar) {
        this.f34101S0 = eVar;
    }

    public void C1(@InterfaceC0569l int i4) {
        this.f34092J0 = i4;
    }

    public void D1(@P e eVar) {
        this.f34103U0 = eVar;
    }

    public void E1(@InterfaceC0569l int i4) {
        this.f34090H0 = i4;
    }

    public void F1(float f4) {
        this.f34105W0 = f4;
    }

    public void G1(@P com.google.android.material.shape.o oVar) {
        this.f34098P0 = oVar;
    }

    public void H1(@P View view) {
        this.f34096N0 = view;
    }

    public void I1(@D int i4) {
        this.f34087E0 = i4;
    }

    @InterfaceC0569l
    public int J0() {
        return this.f34089G0;
    }

    public void J1(int i4) {
        this.f34093K0 = i4;
    }

    @D
    public int K0() {
        return this.f34086D0;
    }

    @InterfaceC0569l
    public int M0() {
        return this.f34091I0;
    }

    public float N0() {
        return this.f34106X0;
    }

    @P
    public com.google.android.material.shape.o O0() {
        return this.f34099Q0;
    }

    @P
    public View P0() {
        return this.f34097O0;
    }

    @D
    public int Q0() {
        return this.f34088F0;
    }

    public int R0() {
        return this.f34094L0;
    }

    @P
    public e S0() {
        return this.f34100R0;
    }

    public int T0() {
        return this.f34095M0;
    }

    @P
    public e U0() {
        return this.f34102T0;
    }

    @P
    public e V0() {
        return this.f34101S0;
    }

    @InterfaceC0569l
    public int W0() {
        return this.f34092J0;
    }

    @Override // androidx.transition.J
    @P
    public String[] Y() {
        return f34077l1;
    }

    @P
    public e Y0() {
        return this.f34103U0;
    }

    @InterfaceC0569l
    public int Z0() {
        return this.f34090H0;
    }

    public float a1() {
        return this.f34105W0;
    }

    @P
    public com.google.android.material.shape.o b1() {
        return this.f34098P0;
    }

    @P
    public View c1() {
        return this.f34096N0;
    }

    @D
    public int d1() {
        return this.f34087E0;
    }

    public int f1() {
        return this.f34093K0;
    }

    public boolean h1() {
        return this.f34107z0;
    }

    public boolean i1() {
        return this.f34104V0;
    }

    public boolean k1() {
        return this.f34083A0;
    }

    @Override // androidx.transition.J
    public void l(@N S s4) {
        I0(s4, this.f34097O0, this.f34088F0, this.f34099Q0);
    }

    public void m1(@InterfaceC0569l int i4) {
        this.f34089G0 = i4;
        this.f34090H0 = i4;
        this.f34091I0 = i4;
    }

    public void n1(@InterfaceC0569l int i4) {
        this.f34089G0 = i4;
    }

    public void o1(boolean z3) {
        this.f34107z0 = z3;
    }

    @Override // androidx.transition.J
    public void p(@N S s4) {
        I0(s4, this.f34096N0, this.f34087E0, this.f34098P0);
    }

    public void p1(@D int i4) {
        this.f34086D0 = i4;
    }

    public void q1(boolean z3) {
        this.f34104V0 = z3;
    }

    public void r1(@InterfaceC0569l int i4) {
        this.f34091I0 = i4;
    }

    public void s1(float f4) {
        this.f34106X0 = f4;
    }

    @Override // androidx.transition.J
    @P
    public Animator t(@N ViewGroup viewGroup, @P S s4, @P S s5) {
        View view;
        View e4;
        View view2;
        if (s4 != null && s5 != null) {
            RectF rectF = (RectF) s4.f19959a.get(f34075j1);
            com.google.android.material.shape.o oVar = (com.google.android.material.shape.o) s4.f19959a.get(f34076k1);
            if (rectF != null && oVar != null) {
                RectF rectF2 = (RectF) s5.f19959a.get(f34075j1);
                com.google.android.material.shape.o oVar2 = (com.google.android.material.shape.o) s5.f19959a.get(f34076k1);
                if (rectF2 != null && oVar2 != null) {
                    View view3 = s4.f19960b;
                    View view4 = s5.f19960b;
                    if (view4.getParent() != null) {
                        view = view4;
                    } else {
                        view = view3;
                    }
                    if (this.f34086D0 == view.getId()) {
                        e4 = (View) view.getParent();
                        view2 = view;
                    } else {
                        e4 = u.e(view, this.f34086D0);
                        view2 = null;
                    }
                    RectF g4 = u.g(e4);
                    float f4 = -g4.left;
                    float f5 = -g4.top;
                    RectF G02 = G0(e4, view2, f4, f5);
                    rectF.offset(f4, f5);
                    rectF2.offset(f4, f5);
                    boolean j12 = j1(rectF, rectF2);
                    if (!this.f34085C0) {
                        l1(view.getContext(), j12);
                    }
                    h hVar = new h(Q(), view3, rectF, oVar, L0(this.f34105W0, view3), view4, rectF2, oVar2, L0(this.f34106X0, view4), this.f34089G0, this.f34090H0, this.f34091I0, this.f34092J0, j12, this.f34104V0, com.google.android.material.transition.b.a(this.f34094L0, j12), com.google.android.material.transition.g.a(this.f34095M0, j12, rectF, rectF2), F0(j12), this.f34107z0, null);
                    hVar.setBounds(Math.round(G02.left), Math.round(G02.top), Math.round(G02.right), Math.round(G02.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new a(hVar));
                    a(new b(e4, hVar, view3, view4));
                    return ofFloat;
                }
                Log.w(f34074i1, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                return null;
            }
            Log.w(f34074i1, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    public void t1(@P com.google.android.material.shape.o oVar) {
        this.f34099Q0 = oVar;
    }

    public void u1(@P View view) {
        this.f34097O0 = view;
    }

    public void v1(@D int i4) {
        this.f34088F0 = i4;
    }

    public void w1(int i4) {
        this.f34094L0 = i4;
    }

    public void x1(@P e eVar) {
        this.f34100R0 = eVar;
    }

    public void y1(int i4) {
        this.f34095M0 = i4;
    }

    @Override // androidx.transition.J
    public void z0(@P AbstractC0991z abstractC0991z) {
        super.z0(abstractC0991z);
        this.f34084B0 = true;
    }

    public void z1(boolean z3) {
        this.f34083A0 = z3;
    }

    public l(@N Context context, boolean z3) {
        this.f34107z0 = false;
        this.f34083A0 = false;
        this.f34084B0 = false;
        this.f34085C0 = false;
        this.f34086D0 = R.id.content;
        this.f34087E0 = -1;
        this.f34088F0 = -1;
        this.f34089G0 = 0;
        this.f34090H0 = 0;
        this.f34091I0 = 0;
        this.f34092J0 = 1375731712;
        this.f34093K0 = 0;
        this.f34094L0 = 0;
        this.f34095M0 = 0;
        this.f34104V0 = Build.VERSION.SDK_INT >= 28;
        this.f34105W0 = f34082q1;
        this.f34106X0 = f34082q1;
        l1(context, z3);
        this.f34085C0 = true;
    }
}
