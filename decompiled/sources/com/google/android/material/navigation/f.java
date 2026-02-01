package com.google.android.material.navigation;

import T0.a;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.D;
import androidx.annotation.I;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.d0;
import androidx.annotation.r;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.g0;
import androidx.core.content.C0669d;
import androidx.core.view.C;
import androidx.core.view.C0823k0;
import androidx.core.view.Y0;
import com.google.android.material.internal.C1782c;
import com.google.android.material.internal.k;
import com.google.android.material.internal.l;
import com.google.android.material.internal.q;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;
import d.C2042a;
import e.C2046a;

/* loaded from: classes2.dex */
public class f extends q {

    /* renamed from: W, reason: collision with root package name */
    private static final int[] f32829W = {R.attr.state_checked};

    /* renamed from: a0, reason: collision with root package name */
    private static final int[] f32830a0 = {-16842910};

    /* renamed from: b0, reason: collision with root package name */
    private static final int f32831b0 = a.n.fe;

    /* renamed from: c0, reason: collision with root package name */
    private static final int f32832c0 = 1;

    /* renamed from: J, reason: collision with root package name */
    @N
    private final k f32833J;

    /* renamed from: K, reason: collision with root package name */
    private final l f32834K;

    /* renamed from: L, reason: collision with root package name */
    c f32835L;

    /* renamed from: M, reason: collision with root package name */
    private final int f32836M;

    /* renamed from: N, reason: collision with root package name */
    private final int[] f32837N;

    /* renamed from: O, reason: collision with root package name */
    private MenuInflater f32838O;

    /* renamed from: P, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f32839P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f32840Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f32841R;

    /* renamed from: S, reason: collision with root package name */
    private int f32842S;

    /* renamed from: T, reason: collision with root package name */
    @U
    private int f32843T;

    /* renamed from: U, reason: collision with root package name */
    @P
    private Path f32844U;

    /* renamed from: V, reason: collision with root package name */
    private final RectF f32845V;

    /* loaded from: classes2.dex */
    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            c cVar = f.this.f32835L;
            if (cVar != null && cVar.a(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            f fVar = f.this;
            fVar.getLocationOnScreen(fVar.f32837N);
            boolean z7 = true;
            if (f.this.f32837N[1] == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            f.this.f32834K.F(z3);
            f fVar2 = f.this;
            if (z3 && fVar2.m()) {
                z4 = true;
            } else {
                z4 = false;
            }
            fVar2.setDrawTopInsetForeground(z4);
            Activity a4 = C1782c.a(f.this.getContext());
            if (a4 != null) {
                if (a4.findViewById(R.id.content).getHeight() == f.this.getHeight()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (Color.alpha(a4.getWindow().getNavigationBarColor()) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                f fVar3 = f.this;
                if (!z5 || !z6 || !fVar3.l()) {
                    z7 = false;
                }
                fVar3.setDrawBottomInsetForeground(z7);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        boolean a(@N MenuItem menuItem);
    }

    public f(@N Context context) {
        this(context, null);
    }

    @P
    private ColorStateList e(int i4) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i4, typedValue, true)) {
            return null;
        }
        ColorStateList a4 = C2046a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C2042a.b.f49128J0, typedValue, true)) {
            return null;
        }
        int i5 = typedValue.data;
        int defaultColor = a4.getDefaultColor();
        int[] iArr = f32830a0;
        return new ColorStateList(new int[][]{iArr, f32829W, FrameLayout.EMPTY_STATE_SET}, new int[]{a4.getColorForState(iArr, defaultColor), i5, defaultColor});
    }

    @N
    private Drawable f(@N g0 g0Var) {
        return g(g0Var, com.google.android.material.resources.c.b(getContext(), g0Var, a.o.jp));
    }

    @N
    private Drawable g(@N g0 g0Var, @P ColorStateList colorStateList) {
        j jVar = new j(o.b(getContext(), g0Var.u(a.o.hp, 0), g0Var.u(a.o.ip, 0)).m());
        jVar.o0(colorStateList);
        return new InsetDrawable((Drawable) jVar, g0Var.g(a.o.mp, 0), g0Var.g(a.o.np, 0), g0Var.g(a.o.lp, 0), g0Var.g(a.o.kp, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.f32838O == null) {
            this.f32838O = new androidx.appcompat.view.g(getContext());
        }
        return this.f32838O;
    }

    private boolean i(@N g0 g0Var) {
        if (!g0Var.C(a.o.hp) && !g0Var.C(a.o.ip)) {
            return false;
        }
        return true;
    }

    private void n(@U int i4, @U int i5) {
        if ((getParent() instanceof androidx.drawerlayout.widget.a) && this.f32843T > 0 && (getBackground() instanceof j)) {
            j jVar = (j) getBackground();
            o.b v3 = jVar.getShapeAppearanceModel().v();
            if (C.d(this.f32842S, C0823k0.Z(this)) == 3) {
                v3.P(this.f32843T);
                v3.C(this.f32843T);
            } else {
                v3.K(this.f32843T);
                v3.x(this.f32843T);
            }
            jVar.setShapeAppearanceModel(v3.m());
            if (this.f32844U == null) {
                this.f32844U = new Path();
            }
            this.f32844U.reset();
            this.f32845V.set(0.0f, 0.0f, i4, i5);
            p.k().d(jVar.getShapeAppearanceModel(), jVar.z(), this.f32845V, this.f32844U);
            invalidate();
            return;
        }
        this.f32844U = null;
        this.f32845V.setEmpty();
    }

    private void p() {
        this.f32839P = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f32839P);
    }

    @Override // com.google.android.material.internal.q
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected void a(@N Y0 y02) {
        this.f32834K.k(y02);
    }

    public void d(@N View view) {
        this.f32834K.c(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@N Canvas canvas) {
        if (this.f32844U == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f32844U);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @P
    public MenuItem getCheckedItem() {
        return this.f32834K.o();
    }

    @U
    public int getDividerInsetEnd() {
        return this.f32834K.p();
    }

    @U
    public int getDividerInsetStart() {
        return this.f32834K.q();
    }

    public int getHeaderCount() {
        return this.f32834K.r();
    }

    @P
    public Drawable getItemBackground() {
        return this.f32834K.t();
    }

    @r
    public int getItemHorizontalPadding() {
        return this.f32834K.u();
    }

    @r
    public int getItemIconPadding() {
        return this.f32834K.v();
    }

    @P
    public ColorStateList getItemIconTintList() {
        return this.f32834K.y();
    }

    public int getItemMaxLines() {
        return this.f32834K.w();
    }

    @P
    public ColorStateList getItemTextColor() {
        return this.f32834K.x();
    }

    @U
    public int getItemVerticalPadding() {
        return this.f32834K.z();
    }

    @N
    public Menu getMenu() {
        return this.f32833J;
    }

    @U
    public int getSubheaderInsetEnd() {
        return this.f32834K.A();
    }

    @U
    public int getSubheaderInsetStart() {
        return this.f32834K.B();
    }

    public View h(int i4) {
        return this.f32834K.s(i4);
    }

    public View j(@I int i4) {
        return this.f32834K.C(i4);
    }

    public void k(int i4) {
        this.f32834K.Z(true);
        getMenuInflater().inflate(i4, this.f32833J);
        this.f32834K.Z(false);
        this.f32834K.d(false);
    }

    public boolean l() {
        return this.f32841R;
    }

    public boolean m() {
        return this.f32840Q;
    }

    public void o(@N View view) {
        this.f32834K.E(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.internal.q, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.k.e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.internal.q, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f32839P);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i4 = View.MeasureSpec.makeMeasureSpec(this.f32836M, 1073741824);
            }
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i4), this.f32836M), 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        this.f32833J.U(dVar.f32848G);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f32848G = bundle;
        this.f32833J.W(bundle);
        return dVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        n(i4, i5);
    }

    public void setBottomInsetScrimEnabled(boolean z3) {
        this.f32841R = z3;
    }

    public void setCheckedItem(@D int i4) {
        MenuItem findItem = this.f32833J.findItem(i4);
        if (findItem != null) {
            this.f32834K.G((androidx.appcompat.view.menu.j) findItem);
        }
    }

    public void setDividerInsetEnd(@U int i4) {
        this.f32834K.H(i4);
    }

    public void setDividerInsetStart(@U int i4) {
        this.f32834K.I(i4);
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        com.google.android.material.shape.k.d(this, f4);
    }

    public void setItemBackground(@P Drawable drawable) {
        this.f32834K.K(drawable);
    }

    public void setItemBackgroundResource(@InterfaceC0578v int i4) {
        setItemBackground(C0669d.i(getContext(), i4));
    }

    public void setItemHorizontalPadding(@r int i4) {
        this.f32834K.M(i4);
    }

    public void setItemHorizontalPaddingResource(@InterfaceC0574q int i4) {
        this.f32834K.M(getResources().getDimensionPixelSize(i4));
    }

    public void setItemIconPadding(@r int i4) {
        this.f32834K.N(i4);
    }

    public void setItemIconPaddingResource(int i4) {
        this.f32834K.N(getResources().getDimensionPixelSize(i4));
    }

    public void setItemIconSize(@r int i4) {
        this.f32834K.O(i4);
    }

    public void setItemIconTintList(@P ColorStateList colorStateList) {
        this.f32834K.P(colorStateList);
    }

    public void setItemMaxLines(int i4) {
        this.f32834K.Q(i4);
    }

    public void setItemTextAppearance(@d0 int i4) {
        this.f32834K.R(i4);
    }

    public void setItemTextColor(@P ColorStateList colorStateList) {
        this.f32834K.S(colorStateList);
    }

    public void setItemVerticalPadding(@U int i4) {
        this.f32834K.T(i4);
    }

    public void setItemVerticalPaddingResource(@InterfaceC0574q int i4) {
        this.f32834K.T(getResources().getDimensionPixelSize(i4));
    }

    public void setNavigationItemSelectedListener(@P c cVar) {
        this.f32835L = cVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i4) {
        super.setOverScrollMode(i4);
        l lVar = this.f32834K;
        if (lVar != null) {
            lVar.U(i4);
        }
    }

    public void setSubheaderInsetEnd(@U int i4) {
        this.f32834K.X(i4);
    }

    public void setSubheaderInsetStart(@U int i4) {
        this.f32834K.X(i4);
    }

    public void setTopInsetScrimEnabled(boolean z3) {
        this.f32840Q = z3;
    }

    /* loaded from: classes2.dex */
    public static class d extends androidx.customview.view.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: G, reason: collision with root package name */
        @P
        public Bundle f32848G;

        /* loaded from: classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @P
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(@N Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @N
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i4) {
                return new d[i4];
            }
        }

        public d(@N Parcel parcel, @P ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f32848G = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(@N Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeBundle(this.f32848G);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public f(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.mc);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(@androidx.annotation.N android.content.Context r17, @androidx.annotation.P android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.f.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(@N MenuItem menuItem) {
        MenuItem findItem = this.f32833J.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f32834K.G((androidx.appcompat.view.menu.j) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
