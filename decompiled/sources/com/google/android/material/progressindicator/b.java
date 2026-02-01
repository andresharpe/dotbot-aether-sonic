package com.google.android.material.progressindicator;

import T0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.d0;
import androidx.annotation.i0;
import androidx.core.view.C0823k0;
import androidx.vectordrawable.graphics.drawable.b;
import com.google.android.material.color.s;
import com.google.android.material.internal.w;
import com.google.android.material.progressindicator.c;
import d1.C2044a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class b<S extends com.google.android.material.progressindicator.c> extends ProgressBar {

    /* renamed from: S, reason: collision with root package name */
    public static final int f32864S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static final int f32865T = 1;

    /* renamed from: U, reason: collision with root package name */
    public static final int f32866U = 2;

    /* renamed from: V, reason: collision with root package name */
    public static final int f32867V = 0;

    /* renamed from: W, reason: collision with root package name */
    public static final int f32868W = 1;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f32869a0 = 2;

    /* renamed from: b0, reason: collision with root package name */
    static final int f32870b0 = a.n.Bi;

    /* renamed from: c0, reason: collision with root package name */
    static final float f32871c0 = 0.2f;

    /* renamed from: d0, reason: collision with root package name */
    static final int f32872d0 = 255;

    /* renamed from: e0, reason: collision with root package name */
    static final int f32873e0 = 1000;

    /* renamed from: E, reason: collision with root package name */
    S f32874E;

    /* renamed from: F, reason: collision with root package name */
    private int f32875F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f32876G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f32877H;

    /* renamed from: I, reason: collision with root package name */
    private final int f32878I;

    /* renamed from: J, reason: collision with root package name */
    private final int f32879J;

    /* renamed from: K, reason: collision with root package name */
    private long f32880K;

    /* renamed from: L, reason: collision with root package name */
    com.google.android.material.progressindicator.a f32881L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f32882M;

    /* renamed from: N, reason: collision with root package name */
    private int f32883N;

    /* renamed from: O, reason: collision with root package name */
    private final Runnable f32884O;

    /* renamed from: P, reason: collision with root package name */
    private final Runnable f32885P;

    /* renamed from: Q, reason: collision with root package name */
    private final b.a f32886Q;

    /* renamed from: R, reason: collision with root package name */
    private final b.a f32887R;

    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.l();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0293b implements Runnable {
        RunnableC0293b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.k();
            b.this.f32880K = -1L;
        }
    }

    /* loaded from: classes2.dex */
    class c extends b.a {
        c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void b(Drawable drawable) {
            b.this.setIndeterminate(false);
            b bVar = b.this;
            bVar.p(bVar.f32875F, b.this.f32876G);
        }
    }

    /* loaded from: classes2.dex */
    class d extends b.a {
        d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void b(Drawable drawable) {
            super.b(drawable);
            if (!b.this.f32882M) {
                b bVar = b.this;
                bVar.setVisibility(bVar.f32883N);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface f {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        super(C2044a.c(context, attributeSet, i4, f32870b0), attributeSet, i4);
        this.f32880K = -1L;
        this.f32882M = false;
        this.f32883N = 4;
        this.f32884O = new a();
        this.f32885P = new RunnableC0293b();
        this.f32886Q = new c();
        this.f32887R = new d();
        Context context2 = getContext();
        this.f32874E = i(context2, attributeSet);
        TypedArray j4 = w.j(context2, attributeSet, a.o.j4, i4, i5, new int[0]);
        this.f32878I = j4.getInt(a.o.p4, -1);
        this.f32879J = Math.min(j4.getInt(a.o.n4, -1), 1000);
        j4.recycle();
        this.f32881L = new com.google.android.material.progressindicator.a();
        this.f32877H = true;
    }

    @P
    private i<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().A();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ((h) getCurrentDrawable()).v(false, false, true);
        if (n()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f32879J > 0) {
            this.f32880K = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean n() {
        if ((getProgressDrawable() != null && getProgressDrawable().isVisible()) || (getIndeterminateDrawable() != null && getIndeterminateDrawable().isVisible())) {
            return false;
        }
        return true;
    }

    private void o() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().z().d(this.f32886Q);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().b(this.f32887R);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b(this.f32887R);
        }
    }

    private void r() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().d(this.f32887R);
            getIndeterminateDrawable().z().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().d(this.f32887R);
        }
    }

    @Override // android.widget.ProgressBar
    @P
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f32874E.f32897f;
    }

    @N
    public int[] getIndicatorColor() {
        return this.f32874E.f32894c;
    }

    public int getShowAnimationBehavior() {
        return this.f32874E.f32896e;
    }

    @InterfaceC0569l
    public int getTrackColor() {
        return this.f32874E.f32895d;
    }

    @U
    public int getTrackCornerRadius() {
        return this.f32874E.f32893b;
    }

    @U
    public int getTrackThickness() {
        return this.f32874E.f32892a;
    }

    protected void h(boolean z3) {
        if (!this.f32877H) {
            return;
        }
        ((h) getCurrentDrawable()).v(s(), false, z3);
    }

    abstract S i(@N Context context, @N AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public void j() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f32884O);
            return;
        }
        removeCallbacks(this.f32885P);
        long uptimeMillis = SystemClock.uptimeMillis() - this.f32880K;
        int i4 = this.f32879J;
        if (uptimeMillis >= i4) {
            this.f32885P.run();
        } else {
            postDelayed(this.f32885P, i4 - uptimeMillis);
        }
    }

    boolean m() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() != 0) {
                    return false;
                }
                return true;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        o();
        if (s()) {
            l();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f32885P);
        removeCallbacks(this.f32884O);
        ((h) getCurrentDrawable()).l();
        r();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(@N Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i4, int i5) {
        int paddingLeft;
        int paddingTop;
        try {
            super.onMeasure(i4, i5);
            i<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            int e4 = currentDrawingDelegate.e();
            int d4 = currentDrawingDelegate.d();
            if (e4 < 0) {
                paddingLeft = getMeasuredWidth();
            } else {
                paddingLeft = e4 + getPaddingLeft() + getPaddingRight();
            }
            if (d4 < 0) {
                paddingTop = getMeasuredHeight();
            } else {
                paddingTop = d4 + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(paddingLeft, paddingTop);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@N View view, int i4) {
        boolean z3;
        super.onVisibilityChanged(view, i4);
        if (i4 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        h(z3);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        h(false);
    }

    public void p(int i4, boolean z3) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f32875F = i4;
                this.f32876G = z3;
                this.f32882M = true;
                if (getIndeterminateDrawable().isVisible() && this.f32881L.a(getContext().getContentResolver()) != 0.0f) {
                    getIndeterminateDrawable().z().f();
                    return;
                } else {
                    this.f32886Q.b(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i4);
        if (getProgressDrawable() != null && !z3) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    public void q() {
        if (this.f32878I > 0) {
            removeCallbacks(this.f32884O);
            postDelayed(this.f32884O, this.f32878I);
        } else {
            this.f32884O.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        if (C0823k0.O0(this) && getWindowVisibility() == 0 && m()) {
            return true;
        }
        return false;
    }

    @i0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setAnimatorDurationScaleProvider(@N com.google.android.material.progressindicator.a aVar) {
        this.f32881L = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f32942G = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f32942G = aVar;
        }
    }

    public void setHideAnimationBehavior(int i4) {
        this.f32874E.f32897f = i4;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z3) {
        try {
            if (z3 == isIndeterminate()) {
                return;
            }
            h hVar = (h) getCurrentDrawable();
            if (hVar != null) {
                hVar.l();
            }
            super.setIndeterminate(z3);
            h hVar2 = (h) getCurrentDrawable();
            if (hVar2 != null) {
                hVar2.v(s(), false, false);
            }
            if ((hVar2 instanceof k) && s()) {
                ((k) hVar2).z().g();
            }
            this.f32882M = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@P Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (drawable instanceof k) {
                ((h) drawable).l();
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(@InterfaceC0569l int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{s.b(getContext(), a.c.f1934f3, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f32874E.f32894c = iArr;
            getIndeterminateDrawable().z().c();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i4) {
        if (isIndeterminate()) {
            return;
        }
        p(i4, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@P Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof g) {
                g gVar = (g) drawable;
                gVar.l();
                super.setProgressDrawable(gVar);
                gVar.H(getProgress() / getMax());
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i4) {
        this.f32874E.f32896e = i4;
        invalidate();
    }

    public void setTrackColor(@InterfaceC0569l int i4) {
        S s4 = this.f32874E;
        if (s4.f32895d != i4) {
            s4.f32895d = i4;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@U int i4) {
        S s4 = this.f32874E;
        if (s4.f32893b != i4) {
            s4.f32893b = Math.min(i4, s4.f32892a / 2);
        }
    }

    public void setTrackThickness(@U int i4) {
        S s4 = this.f32874E;
        if (s4.f32892a != i4) {
            s4.f32892a = i4;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i4) {
        if (i4 != 0 && i4 != 4 && i4 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f32883N = i4;
    }

    @Override // android.widget.ProgressBar
    @P
    public k<S> getIndeterminateDrawable() {
        return (k) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @P
    public g<S> getProgressDrawable() {
        return (g) super.getProgressDrawable();
    }
}
