package com.google.android.material.badge;

import T0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.T;
import androidx.annotation.U;
import androidx.annotation.c0;
import androidx.annotation.d0;
import androidx.annotation.k0;
import androidx.core.view.C0823k0;
import com.google.android.material.badge.b;
import com.google.android.material.internal.t;
import com.google.android.material.internal.w;
import com.google.android.material.shape.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public class a extends Drawable implements t.b {

    /* renamed from: R, reason: collision with root package name */
    public static final int f31378R = 8388661;

    /* renamed from: S, reason: collision with root package name */
    public static final int f31379S = 8388659;

    /* renamed from: T, reason: collision with root package name */
    public static final int f31380T = 8388693;

    /* renamed from: U, reason: collision with root package name */
    public static final int f31381U = 8388691;

    /* renamed from: V, reason: collision with root package name */
    private static final int f31382V = 9;

    /* renamed from: W, reason: collision with root package name */
    @d0
    private static final int f31383W = a.n.dh;

    /* renamed from: X, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f31384X = a.c.f1996s0;

    /* renamed from: Y, reason: collision with root package name */
    static final String f31385Y = "+";

    /* renamed from: E, reason: collision with root package name */
    @N
    private final WeakReference<Context> f31386E;

    /* renamed from: F, reason: collision with root package name */
    @N
    private final j f31387F;

    /* renamed from: G, reason: collision with root package name */
    @N
    private final t f31388G;

    /* renamed from: H, reason: collision with root package name */
    @N
    private final Rect f31389H;

    /* renamed from: I, reason: collision with root package name */
    @N
    private final com.google.android.material.badge.b f31390I;

    /* renamed from: J, reason: collision with root package name */
    private float f31391J;

    /* renamed from: K, reason: collision with root package name */
    private float f31392K;

    /* renamed from: L, reason: collision with root package name */
    private int f31393L;

    /* renamed from: M, reason: collision with root package name */
    private float f31394M;

    /* renamed from: N, reason: collision with root package name */
    private float f31395N;

    /* renamed from: O, reason: collision with root package name */
    private float f31396O;

    /* renamed from: P, reason: collision with root package name */
    @P
    private WeakReference<View> f31397P;

    /* renamed from: Q, reason: collision with root package name */
    @P
    private WeakReference<FrameLayout> f31398Q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.badge.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0274a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View f31399E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ FrameLayout f31400F;

        RunnableC0274a(View view, FrameLayout frameLayout) {
            this.f31399E = view;
            this.f31400F = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.i0(this.f31399E, this.f31400F);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    private a(@N Context context, @k0 int i4, @InterfaceC0563f int i5, @d0 int i6, @P b.a aVar) {
        this.f31386E = new WeakReference<>(context);
        w.c(context);
        this.f31389H = new Rect();
        this.f31387F = new j();
        t tVar = new t(this);
        this.f31388G = tVar;
        tVar.e().setTextAlign(Paint.Align.CENTER);
        Z(a.n.n8);
        this.f31390I = new com.google.android.material.badge.b(context, i4, i5, i6, aVar);
        J();
    }

    private void C() {
        this.f31388G.e().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void D() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f31390I.f());
        if (this.f31387F.y() != valueOf) {
            this.f31387F.o0(valueOf);
            invalidateSelf();
        }
    }

    private void E() {
        FrameLayout frameLayout;
        WeakReference<View> weakReference = this.f31397P;
        if (weakReference != null && weakReference.get() != null) {
            View view = this.f31397P.get();
            WeakReference<FrameLayout> weakReference2 = this.f31398Q;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            } else {
                frameLayout = null;
            }
            i0(view, frameLayout);
        }
    }

    private void F() {
        this.f31388G.e().setColor(this.f31390I.h());
        invalidateSelf();
    }

    private void G() {
        k0();
        this.f31388G.j(true);
        j0();
        invalidateSelf();
    }

    private void H() {
        this.f31388G.j(true);
        j0();
        invalidateSelf();
    }

    private void I() {
        boolean u3 = this.f31390I.u();
        setVisible(u3, false);
        if (d.f31429a && p() != null && !u3) {
            ((ViewGroup) p().getParent()).invalidate();
        }
    }

    private void J() {
        G();
        H();
        C();
        D();
        F();
        E();
        j0();
        I();
    }

    private void Y(@P com.google.android.material.resources.d dVar) {
        Context context;
        if (this.f31388G.d() == dVar || (context = this.f31386E.get()) == null) {
            return;
        }
        this.f31388G.i(dVar, context);
        j0();
    }

    private void Z(@d0 int i4) {
        Context context = this.f31386E.get();
        if (context == null) {
            return;
        }
        Y(new com.google.android.material.resources.d(context, i4));
    }

    private void b(@N Context context, @N Rect rect, @N View view) {
        int i4;
        float f4;
        float f5;
        float f6;
        int x3 = x();
        int g4 = this.f31390I.g();
        if (g4 != 8388691 && g4 != 8388693) {
            this.f31392K = rect.top + x3;
        } else {
            this.f31392K = rect.bottom - x3;
        }
        if (u() <= 9) {
            if (!B()) {
                f6 = this.f31390I.f31406c;
            } else {
                f6 = this.f31390I.f31407d;
            }
            this.f31394M = f6;
            this.f31396O = f6;
            this.f31395N = f6;
        } else {
            float f7 = this.f31390I.f31407d;
            this.f31394M = f7;
            this.f31396O = f7;
            this.f31395N = (this.f31388G.f(m()) / 2.0f) + this.f31390I.f31408e;
        }
        Resources resources = context.getResources();
        if (B()) {
            i4 = a.f.Z5;
        } else {
            i4 = a.f.W5;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i4);
        int w3 = w();
        int g5 = this.f31390I.g();
        if (g5 != 8388659 && g5 != 8388691) {
            if (C0823k0.Z(view) == 0) {
                f5 = ((rect.right + this.f31395N) - dimensionPixelSize) - w3;
            } else {
                f5 = (rect.left - this.f31395N) + dimensionPixelSize + w3;
            }
            this.f31391J = f5;
            return;
        }
        if (C0823k0.Z(view) == 0) {
            f4 = (rect.left - this.f31395N) + dimensionPixelSize + w3;
        } else {
            f4 = ((rect.right + this.f31395N) - dimensionPixelSize) - w3;
        }
        this.f31391J = f4;
    }

    @N
    public static a d(@N Context context) {
        return new a(context, 0, f31384X, f31383W, null);
    }

    @N
    public static a e(@N Context context, @k0 int i4) {
        return new a(context, i4, f31384X, f31383W, null);
    }

    private void e0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != a.h.f2760f3) {
            WeakReference<FrameLayout> weakReference = this.f31398Q;
            if (weakReference != null && weakReference.get() == viewGroup) {
                return;
            }
            f0(view);
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setId(a.h.f2760f3);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(view.getLayoutParams());
            frameLayout.setMinimumWidth(view.getWidth());
            frameLayout.setMinimumHeight(view.getHeight());
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(indexOfChild);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(view);
            viewGroup.addView(frameLayout, indexOfChild);
            this.f31398Q = new WeakReference<>(frameLayout);
            frameLayout.post(new RunnableC0274a(view, frameLayout));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static a f(@N Context context, @N b.a aVar) {
        return new a(context, 0, f31384X, f31383W, aVar);
    }

    private static void f0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void g(Canvas canvas) {
        Rect rect = new Rect();
        String m4 = m();
        this.f31388G.e().getTextBounds(m4, 0, m4.length(), rect);
        canvas.drawText(m4, this.f31391J, this.f31392K + (rect.height() / 2), this.f31388G.e());
    }

    private void j0() {
        View view;
        Context context = this.f31386E.get();
        WeakReference<View> weakReference = this.f31397P;
        FrameLayout frameLayout = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f31389H);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f31398Q;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            }
            if (frameLayout != null || d.f31429a) {
                if (frameLayout == null) {
                    frameLayout = (ViewGroup) view.getParent();
                }
                frameLayout.offsetDescendantRectToMyCoords(view, rect2);
            }
            b(context, rect2, view);
            d.o(this.f31389H, this.f31391J, this.f31392K, this.f31395N, this.f31396O);
            this.f31387F.k0(this.f31394M);
            if (!rect.equals(this.f31389H)) {
                this.f31387F.setBounds(this.f31389H);
            }
        }
    }

    private void k0() {
        this.f31393L = ((int) Math.pow(10.0d, t() - 1.0d)) - 1;
    }

    @N
    private String m() {
        if (u() <= this.f31393L) {
            return NumberFormat.getInstance(this.f31390I.p()).format(u());
        }
        Context context = this.f31386E.get();
        if (context == null) {
            return "";
        }
        return String.format(this.f31390I.p(), context.getString(a.m.f3044D0), Integer.valueOf(this.f31393L), f31385Y);
    }

    private int w() {
        int m4;
        if (B()) {
            m4 = this.f31390I.l();
        } else {
            m4 = this.f31390I.m();
        }
        return m4 + this.f31390I.c();
    }

    private int x() {
        int s4;
        if (B()) {
            s4 = this.f31390I.r();
        } else {
            s4 = this.f31390I.s();
        }
        return s4 + this.f31390I.d();
    }

    @U
    public int A() {
        return this.f31390I.s();
    }

    public boolean B() {
        return this.f31390I.t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(int i4) {
        this.f31390I.w(i4);
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(@U int i4) {
        this.f31390I.x(i4);
        j0();
    }

    public void M(@InterfaceC0569l int i4) {
        this.f31390I.z(i4);
        D();
    }

    public void N(int i4) {
        if (this.f31390I.g() != i4) {
            this.f31390I.A(i4);
            E();
        }
    }

    public void O(@N Locale locale) {
        if (!locale.equals(this.f31390I.p())) {
            this.f31390I.J(locale);
            invalidateSelf();
        }
    }

    public void P(@InterfaceC0569l int i4) {
        if (this.f31388G.e().getColor() != i4) {
            this.f31390I.B(i4);
            F();
        }
    }

    public void Q(@c0 int i4) {
        this.f31390I.C(i4);
    }

    public void R(CharSequence charSequence) {
        this.f31390I.D(charSequence);
    }

    public void S(@T int i4) {
        this.f31390I.E(i4);
    }

    public void T(int i4) {
        V(i4);
        U(i4);
    }

    public void U(@U int i4) {
        this.f31390I.F(i4);
        j0();
    }

    public void V(@U int i4) {
        this.f31390I.G(i4);
        j0();
    }

    public void W(int i4) {
        if (this.f31390I.n() != i4) {
            this.f31390I.H(i4);
            G();
        }
    }

    public void X(int i4) {
        int max = Math.max(0, i4);
        if (this.f31390I.o() != max) {
            this.f31390I.I(max);
            H();
        }
    }

    @Override // com.google.android.material.internal.t.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void a() {
        invalidateSelf();
    }

    public void a0(int i4) {
        c0(i4);
        b0(i4);
    }

    public void b0(@U int i4) {
        this.f31390I.K(i4);
        j0();
    }

    public void c() {
        if (B()) {
            this.f31390I.a();
            H();
        }
    }

    public void c0(@U int i4) {
        this.f31390I.L(i4);
        j0();
    }

    public void d0(boolean z3) {
        this.f31390I.M(z3);
        I();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@N Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f31387F.draw(canvas);
            if (B()) {
                g(canvas);
            }
        }
    }

    public void g0(@N View view) {
        i0(view, null);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f31390I.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f31389H.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f31389H.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    int h() {
        return this.f31390I.c();
    }

    @Deprecated
    public void h0(@N View view, @P ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            i0(view, (FrameLayout) viewGroup);
            return;
        }
        throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
    }

    @U
    int i() {
        return this.f31390I.d();
    }

    public void i0(@N View view, @P FrameLayout frameLayout) {
        this.f31397P = new WeakReference<>(view);
        boolean z3 = d.f31429a;
        if (z3 && frameLayout == null) {
            e0(view);
        } else {
            this.f31398Q = new WeakReference<>(frameLayout);
        }
        if (!z3) {
            f0(view);
        }
        j0();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @InterfaceC0569l
    public int j() {
        return this.f31387F.y().getDefaultColor();
    }

    public int k() {
        return this.f31390I.g();
    }

    @N
    public Locale l() {
        return this.f31390I.p();
    }

    @InterfaceC0569l
    public int n() {
        return this.f31388G.e().getColor();
    }

    @P
    public CharSequence o() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (B()) {
            if (this.f31390I.k() == 0 || (context = this.f31386E.get()) == null) {
                return null;
            }
            if (u() <= this.f31393L) {
                return context.getResources().getQuantityString(this.f31390I.k(), u(), Integer.valueOf(u()));
            }
            return context.getString(this.f31390I.i(), Integer.valueOf(this.f31393L));
        }
        return this.f31390I.j();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.t.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @P
    public FrameLayout p() {
        WeakReference<FrameLayout> weakReference = this.f31398Q;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int q() {
        return this.f31390I.m();
    }

    @U
    public int r() {
        return this.f31390I.l();
    }

    @U
    public int s() {
        return this.f31390I.m();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f31390I.y(i4);
        C();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int t() {
        return this.f31390I.n();
    }

    public int u() {
        if (B()) {
            return this.f31390I.o();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public b.a v() {
        return this.f31390I.q();
    }

    public int y() {
        return this.f31390I.s();
    }

    @U
    public int z() {
        return this.f31390I.r();
    }
}
