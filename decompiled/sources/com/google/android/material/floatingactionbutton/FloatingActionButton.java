package com.google.android.material.floatingactionbutton;

import T0.a;
import a1.InterfaceC0555a;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.D;
import androidx.annotation.InterfaceC0559b;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.W;
import androidx.annotation.i0;
import androidx.appcompat.widget.C0599l;
import androidx.appcompat.widget.C0604q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.u;
import androidx.core.view.C0823k0;
import androidx.core.view.InterfaceC0814h0;
import androidx.core.widget.w;
import com.google.android.material.animation.h;
import com.google.android.material.animation.k;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.google.android.material.internal.C1783d;
import com.google.android.material.internal.F;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes2.dex */
public class FloatingActionButton extends F implements InterfaceC0814h0, w, InterfaceC0555a, s, CoordinatorLayout.b {

    /* renamed from: V, reason: collision with root package name */
    private static final String f32334V = "FloatingActionButton";

    /* renamed from: W, reason: collision with root package name */
    private static final String f32335W = "expandableWidgetHelper";

    /* renamed from: a0, reason: collision with root package name */
    private static final int f32336a0 = a.n.ee;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f32337b0 = 1;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f32338c0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f32339d0 = -1;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f32340e0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f32341f0 = 470;

    /* renamed from: F, reason: collision with root package name */
    @P
    private ColorStateList f32342F;

    /* renamed from: G, reason: collision with root package name */
    @P
    private PorterDuff.Mode f32343G;

    /* renamed from: H, reason: collision with root package name */
    @P
    private ColorStateList f32344H;

    /* renamed from: I, reason: collision with root package name */
    @P
    private PorterDuff.Mode f32345I;

    /* renamed from: J, reason: collision with root package name */
    @P
    private ColorStateList f32346J;

    /* renamed from: K, reason: collision with root package name */
    private int f32347K;

    /* renamed from: L, reason: collision with root package name */
    private int f32348L;

    /* renamed from: M, reason: collision with root package name */
    private int f32349M;

    /* renamed from: N, reason: collision with root package name */
    private int f32350N;

    /* renamed from: O, reason: collision with root package name */
    private int f32351O;

    /* renamed from: P, reason: collision with root package name */
    boolean f32352P;

    /* renamed from: Q, reason: collision with root package name */
    final Rect f32353Q;

    /* renamed from: R, reason: collision with root package name */
    private final Rect f32354R;

    /* renamed from: S, reason: collision with root package name */
    @N
    private final C0604q f32355S;

    /* renamed from: T, reason: collision with root package name */
    @N
    private final a1.c f32356T;

    /* renamed from: U, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.d f32357U;

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean b(@N CoordinatorLayout coordinatorLayout, @N FloatingActionButton floatingActionButton, @N Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean H() {
            return super.H();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: K */
        public /* bridge */ /* synthetic */ boolean i(CoordinatorLayout coordinatorLayout, @N FloatingActionButton floatingActionButton, View view) {
            return super.i(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: L */
        public /* bridge */ /* synthetic */ boolean m(@N CoordinatorLayout coordinatorLayout, @N FloatingActionButton floatingActionButton, int i4) {
            return super.m(coordinatorLayout, floatingActionButton, i4);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void M(boolean z3) {
            super.M(z3);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        @i0
        public /* bridge */ /* synthetic */ void N(b bVar) {
            super.N(bVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void h(@N CoordinatorLayout.g gVar) {
            super.h(gVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements d.k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f32362a;

        a(b bVar) {
            this.f32362a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.k
        public void a() {
            this.f32362a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.k
        public void b() {
            this.f32362a.a(FloatingActionButton.this);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c implements com.google.android.material.shadow.c {
        c() {
        }

        @Override // com.google.android.material.shadow.c
        public void a(int i4, int i5, int i6, int i7) {
            FloatingActionButton.this.f32353Q.set(i4, i5, i6, i7);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i4 + floatingActionButton.f32350N, i5 + FloatingActionButton.this.f32350N, i6 + FloatingActionButton.this.f32350N, i7 + FloatingActionButton.this.f32350N);
        }

        @Override // com.google.android.material.shadow.c
        public void b(@P Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.google.android.material.shadow.c
        public boolean c() {
            return FloatingActionButton.this.f32352P;
        }

        @Override // com.google.android.material.shadow.c
        public float d() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface d {
    }

    /* loaded from: classes2.dex */
    class e<T extends FloatingActionButton> implements d.j {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final k<T> f32365a;

        e(@N k<T> kVar) {
            this.f32365a = kVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void a() {
            this.f32365a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void b() {
            this.f32365a.a(FloatingActionButton.this);
        }

        public boolean equals(@P Object obj) {
            if ((obj instanceof e) && ((e) obj).f32365a.equals(this.f32365a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f32365a.hashCode();
        }
    }

    public FloatingActionButton(@N Context context) {
        this(context, null);
    }

    @P
    private d.k C(@P b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    private com.google.android.material.floatingactionbutton.d getImpl() {
        if (this.f32357U == null) {
            this.f32357U = j();
        }
        return this.f32357U;
    }

    @N
    private com.google.android.material.floatingactionbutton.d j() {
        return new com.google.android.material.floatingactionbutton.e(this, new c());
    }

    private int m(int i4) {
        int i5 = this.f32349M;
        if (i5 != 0) {
            return i5;
        }
        Resources resources = getResources();
        if (i4 != -1) {
            if (i4 != 1) {
                return resources.getDimensionPixelSize(a.f.f2409j1);
            }
            return resources.getDimensionPixelSize(a.f.f2404i1);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < f32341f0) {
            return m(1);
        }
        return m(0);
    }

    private void s(@N Rect rect) {
        int i4 = rect.left;
        Rect rect2 = this.f32353Q;
        rect.left = i4 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void t() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f32344H;
        if (colorStateList == null) {
            androidx.core.graphics.drawable.d.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f32345I;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0599l.e(colorForState, mode));
    }

    private static int x(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i4;
        }
        return Math.min(i4, size);
    }

    public void A(@P b bVar) {
        B(bVar, true);
    }

    void B(@P b bVar, boolean z3) {
        getImpl().f0(C(bVar), z3);
    }

    @Override // a1.b
    public boolean a(boolean z3) {
        return this.f32356T.f(z3);
    }

    @Override // a1.b
    public boolean b() {
        return this.f32356T.c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void f(@N Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void g(@N Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    @Override // android.view.View
    @P
    public ColorStateList getBackgroundTintList() {
        return this.f32342F;
    }

    @Override // android.view.View
    @P
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f32343G;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @N
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().t();
    }

    @P
    public Drawable getContentBackground() {
        return getImpl().m();
    }

    @U
    public int getCustomSize() {
        return this.f32349M;
    }

    @Override // a1.InterfaceC0555a
    public int getExpandedComponentIdHint() {
        return this.f32356T.b();
    }

    @P
    public h getHideMotionSpec() {
        return getImpl().p();
    }

    @InterfaceC0569l
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f32346J;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @P
    public ColorStateList getRippleColorStateList() {
        return this.f32346J;
    }

    @Override // com.google.android.material.shape.s
    @N
    public o getShapeAppearanceModel() {
        return (o) u.l(getImpl().u());
    }

    @P
    public h getShowMotionSpec() {
        return getImpl().v();
    }

    public int getSize() {
        return this.f32348L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m(this.f32348L);
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @P
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @P
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.w
    @P
    public ColorStateList getSupportImageTintList() {
        return this.f32344H;
    }

    @Override // androidx.core.widget.w
    @P
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f32345I;
    }

    public boolean getUseCompatPadding() {
        return this.f32352P;
    }

    public void h(@N k<? extends FloatingActionButton> kVar) {
        getImpl().g(new e(kVar));
    }

    public void i() {
        setCustomSize(0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    @Deprecated
    public boolean k(@N Rect rect) {
        if (!C0823k0.U0(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        s(rect);
        return true;
    }

    public void l(@N Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        s(rect);
    }

    public void n() {
        o(null);
    }

    public void o(@P b bVar) {
        p(bVar, true);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        int sizeDimension = getSizeDimension();
        this.f32350N = (sizeDimension - this.f32351O) / 2;
        getImpl().i0();
        int min = Math.min(x(sizeDimension, i4), x(sizeDimension, i5));
        Rect rect = this.f32353Q;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.stateful.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.stateful.a aVar = (com.google.android.material.stateful.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        this.f32356T.d((Bundle) u.l(aVar.f33445G.get(f32335W)));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        com.google.android.material.stateful.a aVar = new com.google.android.material.stateful.a(onSaveInstanceState);
        aVar.f33445G.put(f32335W, this.f32356T.e());
        return aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@N MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && k(this.f32354R) && !this.f32354R.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    void p(@P b bVar, boolean z3) {
        getImpl().w(C(bVar), z3);
    }

    public boolean q() {
        return getImpl().y();
    }

    public boolean r() {
        return getImpl().z();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Log.i(f32334V, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i(f32334V, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        Log.i(f32334V, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@P ColorStateList colorStateList) {
        if (this.f32342F != colorStateList) {
            this.f32342F = colorStateList;
            getImpl().O(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@P PorterDuff.Mode mode) {
        if (this.f32343G != mode) {
            this.f32343G = mode;
            getImpl().P(mode);
        }
    }

    public void setCompatElevation(float f4) {
        getImpl().Q(f4);
    }

    public void setCompatElevationResource(@InterfaceC0574q int i4) {
        setCompatElevation(getResources().getDimension(i4));
    }

    public void setCompatHoveredFocusedTranslationZ(float f4) {
        getImpl().T(f4);
    }

    public void setCompatHoveredFocusedTranslationZResource(@InterfaceC0574q int i4) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i4));
    }

    public void setCompatPressedTranslationZ(float f4) {
        getImpl().X(f4);
    }

    public void setCompatPressedTranslationZResource(@InterfaceC0574q int i4) {
        setCompatPressedTranslationZ(getResources().getDimension(i4));
    }

    public void setCustomSize(@U int i4) {
        if (i4 >= 0) {
            if (i4 != this.f32349M) {
                this.f32349M = i4;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    @W(21)
    public void setElevation(float f4) {
        super.setElevation(f4);
        getImpl().j0(f4);
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        if (z3 != getImpl().o()) {
            getImpl().R(z3);
            requestLayout();
        }
    }

    @Override // a1.InterfaceC0555a
    public void setExpandedComponentIdHint(@D int i4) {
        this.f32356T.g(i4);
    }

    public void setHideMotionSpec(@P h hVar) {
        getImpl().S(hVar);
    }

    public void setHideMotionSpecResource(@InterfaceC0559b int i4) {
        setHideMotionSpec(h.d(getContext(), i4));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@P Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().h0();
            if (this.f32344H != null) {
                t();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@InterfaceC0578v int i4) {
        this.f32355S.i(i4);
        t();
    }

    public void setMaxImageSize(int i4) {
        this.f32351O = i4;
        getImpl().V(i4);
    }

    public void setRippleColor(@InterfaceC0569l int i4) {
        setRippleColor(ColorStateList.valueOf(i4));
    }

    @Override // android.view.View
    public void setScaleX(float f4) {
        super.setScaleX(f4);
        getImpl().I();
    }

    @Override // android.view.View
    public void setScaleY(float f4) {
        super.setScaleY(f4);
        getImpl().I();
    }

    @i0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowPaddingEnabled(boolean z3) {
        getImpl().Z(z3);
    }

    @Override // com.google.android.material.shape.s
    public void setShapeAppearanceModel(@N o oVar) {
        getImpl().a0(oVar);
    }

    public void setShowMotionSpec(@P h hVar) {
        getImpl().b0(hVar);
    }

    public void setShowMotionSpecResource(@InterfaceC0559b int i4) {
        setShowMotionSpec(h.d(getContext(), i4));
    }

    public void setSize(int i4) {
        this.f32349M = 0;
        if (i4 != this.f32348L) {
            this.f32348L = i4;
            requestLayout();
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    public void setSupportBackgroundTintList(@P ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.InterfaceC0814h0
    public void setSupportBackgroundTintMode(@P PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.w
    public void setSupportImageTintList(@P ColorStateList colorStateList) {
        if (this.f32344H != colorStateList) {
            this.f32344H = colorStateList;
            t();
        }
    }

    @Override // androidx.core.widget.w
    public void setSupportImageTintMode(@P PorterDuff.Mode mode) {
        if (this.f32345I != mode) {
            this.f32345I = mode;
            t();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f4) {
        super.setTranslationX(f4);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f4) {
        super.setTranslationY(f4);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f4) {
        super.setTranslationZ(f4);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z3) {
        if (this.f32352P != z3) {
            this.f32352P = z3;
            getImpl().C();
        }
    }

    @Override // com.google.android.material.internal.F, android.widget.ImageView, android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
    }

    public void u(@N Animator.AnimatorListener animatorListener) {
        getImpl().K(animatorListener);
    }

    public void v(@N Animator.AnimatorListener animatorListener) {
        getImpl().L(animatorListener);
    }

    public void w(@N k<? extends FloatingActionButton> kVar) {
        getImpl().M(new e(kVar));
    }

    public boolean y() {
        return getImpl().o();
    }

    public void z() {
        A(null);
    }

    /* loaded from: classes2.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: d, reason: collision with root package name */
        private static final boolean f32358d = true;

        /* renamed from: a, reason: collision with root package name */
        private Rect f32359a;

        /* renamed from: b, reason: collision with root package name */
        private b f32360b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f32361c;

        public BaseBehavior() {
            this.f32361c = true;
        }

        private static boolean I(@N View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                return ((CoordinatorLayout.g) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void J(@N CoordinatorLayout coordinatorLayout, @N FloatingActionButton floatingActionButton) {
            int i4;
            Rect rect = floatingActionButton.f32353Q;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.g gVar = (CoordinatorLayout.g) floatingActionButton.getLayoutParams();
                int i5 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) gVar).rightMargin) {
                    i4 = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) gVar).leftMargin) {
                    i4 = -rect.left;
                } else {
                    i4 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) {
                    i5 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) gVar).topMargin) {
                    i5 = -rect.top;
                }
                if (i5 != 0) {
                    C0823k0.f1(floatingActionButton, i5);
                }
                if (i4 != 0) {
                    C0823k0.e1(floatingActionButton, i4);
                }
            }
        }

        private boolean O(@N View view, @N FloatingActionButton floatingActionButton) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) floatingActionButton.getLayoutParams();
            if (!this.f32361c || gVar.e() != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            return true;
        }

        private boolean P(CoordinatorLayout coordinatorLayout, @N AppBarLayout appBarLayout, @N FloatingActionButton floatingActionButton) {
            if (!O(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f32359a == null) {
                this.f32359a = new Rect();
            }
            Rect rect = this.f32359a;
            C1783d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.p(this.f32360b, false);
                return true;
            }
            floatingActionButton.B(this.f32360b, false);
            return true;
        }

        private boolean Q(@N View view, @N FloatingActionButton floatingActionButton) {
            if (!O(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.p(this.f32360b, false);
                return true;
            }
            floatingActionButton.B(this.f32360b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public boolean b(@N CoordinatorLayout coordinatorLayout, @N FloatingActionButton floatingActionButton, @N Rect rect) {
            Rect rect2 = floatingActionButton.f32353Q;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public boolean H() {
            return this.f32361c;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public boolean i(CoordinatorLayout coordinatorLayout, @N FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                P(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (I(view)) {
                Q(view, floatingActionButton);
                return false;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean m(@N CoordinatorLayout coordinatorLayout, @N FloatingActionButton floatingActionButton, int i4) {
            List<View> x3 = coordinatorLayout.x(floatingActionButton);
            int size = x3.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = x3.get(i5);
                if (view instanceof AppBarLayout) {
                    if (P(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (I(view) && Q(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.P(floatingActionButton, i4);
            J(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void M(boolean z3) {
            this.f32361c = z3;
        }

        @i0
        public void N(b bVar) {
            this.f32360b = bVar;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void h(@N CoordinatorLayout.g gVar) {
            if (gVar.f11490h == 0) {
                gVar.f11490h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.Gf);
            this.f32361c = obtainStyledAttributes.getBoolean(a.o.Hf, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.w6);
    }

    public void setRippleColor(@P ColorStateList colorStateList) {
        if (this.f32346J != colorStateList) {
            this.f32346J = colorStateList;
            getImpl().Y(this.f32346J);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FloatingActionButton(@androidx.annotation.N android.content.Context r11, @androidx.annotation.P android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
