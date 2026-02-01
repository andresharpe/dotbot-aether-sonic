package com.google.android.material.appbar;

import T0.a;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.d0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0669d;
import androidx.core.util.p;
import androidx.core.view.C0823k0;
import androidx.core.view.InterfaceC0772a0;
import androidx.core.view.Y0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C1781b;
import com.google.android.material.internal.C1783d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import q.C2394a;

/* loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: k0, reason: collision with root package name */
    private static final int f31303k0 = a.n.de;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f31304l0 = 600;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f31305m0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f31306n0 = 1;

    /* renamed from: E, reason: collision with root package name */
    private boolean f31307E;

    /* renamed from: F, reason: collision with root package name */
    private int f31308F;

    /* renamed from: G, reason: collision with root package name */
    @P
    private ViewGroup f31309G;

    /* renamed from: H, reason: collision with root package name */
    @P
    private View f31310H;

    /* renamed from: I, reason: collision with root package name */
    private View f31311I;

    /* renamed from: J, reason: collision with root package name */
    private int f31312J;

    /* renamed from: K, reason: collision with root package name */
    private int f31313K;

    /* renamed from: L, reason: collision with root package name */
    private int f31314L;

    /* renamed from: M, reason: collision with root package name */
    private int f31315M;

    /* renamed from: N, reason: collision with root package name */
    private final Rect f31316N;

    /* renamed from: O, reason: collision with root package name */
    @N
    final C1781b f31317O;

    /* renamed from: P, reason: collision with root package name */
    @N
    final Z0.a f31318P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f31319Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f31320R;

    /* renamed from: S, reason: collision with root package name */
    @P
    private Drawable f31321S;

    /* renamed from: T, reason: collision with root package name */
    @P
    Drawable f31322T;

    /* renamed from: U, reason: collision with root package name */
    private int f31323U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f31324V;

    /* renamed from: W, reason: collision with root package name */
    private ValueAnimator f31325W;

    /* renamed from: a0, reason: collision with root package name */
    private long f31326a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f31327b0;

    /* renamed from: c0, reason: collision with root package name */
    private AppBarLayout.h f31328c0;

    /* renamed from: d0, reason: collision with root package name */
    int f31329d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f31330e0;

    /* renamed from: f0, reason: collision with root package name */
    @P
    Y0 f31331f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f31332g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f31333h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f31334i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f31335j0;

    /* loaded from: classes2.dex */
    class a implements InterfaceC0772a0 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC0772a0
        public Y0 a(View view, @N Y0 y02) {
            return CollapsingToolbarLayout.this.r(y02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* loaded from: classes2.dex */
    private class d implements AppBarLayout.h {
        d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.h, com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int i4) {
            int i5;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f31329d0 = i4;
            Y0 y02 = collapsingToolbarLayout.f31331f0;
            if (y02 != null) {
                i5 = y02.r();
            } else {
                i5 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i6);
                c cVar = (c) childAt.getLayoutParams();
                com.google.android.material.appbar.e j4 = CollapsingToolbarLayout.j(childAt);
                int i7 = cVar.f31342a;
                if (i7 != 1) {
                    if (i7 == 2) {
                        j4.k(Math.round((-i4) * cVar.f31343b));
                    }
                } else {
                    j4.k(C2394a.e(-i4, 0, CollapsingToolbarLayout.this.h(childAt)));
                }
            }
            CollapsingToolbarLayout.this.z();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f31322T != null && i5 > 0) {
                C0823k0.n1(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - C0823k0.e0(CollapsingToolbarLayout.this)) - i5;
            float f4 = height;
            CollapsingToolbarLayout.this.f31317O.B0(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f4));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f31317O.o0(collapsingToolbarLayout3.f31329d0 + height);
            CollapsingToolbarLayout.this.f31317O.z0(Math.abs(i4) / f4);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface e {
    }

    public CollapsingToolbarLayout(@N Context context) {
        this(context, null);
    }

    private void A(int i4, int i5, int i6, int i7, boolean z3) {
        View view;
        boolean z4;
        int i8;
        int i9;
        if (this.f31319Q && (view = this.f31311I) != null) {
            boolean z5 = false;
            if (C0823k0.O0(view) && this.f31311I.getVisibility() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f31320R = z4;
            if (z4 || z3) {
                if (C0823k0.Z(this) == 1) {
                    z5 = true;
                }
                u(z5);
                C1781b c1781b = this.f31317O;
                if (z5) {
                    i8 = this.f31314L;
                } else {
                    i8 = this.f31312J;
                }
                int i10 = this.f31316N.top + this.f31313K;
                int i11 = i6 - i4;
                if (z5) {
                    i9 = this.f31312J;
                } else {
                    i9 = this.f31314L;
                }
                c1781b.p0(i8, i10, i11 - i9, (i7 - i5) - this.f31315M);
                this.f31317O.d0(z3);
            }
        }
    }

    private void B() {
        if (this.f31309G != null && this.f31319Q && TextUtils.isEmpty(this.f31317O.P())) {
            setTitle(i(this.f31309G));
        }
    }

    private void a(int i4) {
        TimeInterpolator timeInterpolator;
        c();
        ValueAnimator valueAnimator = this.f31325W;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f31325W = valueAnimator2;
            if (i4 > this.f31323U) {
                timeInterpolator = com.google.android.material.animation.a.f31209c;
            } else {
                timeInterpolator = com.google.android.material.animation.a.f31210d;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.f31325W.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.f31325W.cancel();
        }
        this.f31325W.setDuration(this.f31326a0);
        this.f31325W.setIntValues(this.f31323U, i4);
        this.f31325W.start();
    }

    private void b(AppBarLayout appBarLayout) {
        if (n()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void c() {
        if (!this.f31307E) {
            return;
        }
        ViewGroup viewGroup = null;
        this.f31309G = null;
        this.f31310H = null;
        int i4 = this.f31308F;
        if (i4 != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i4);
            this.f31309G = viewGroup2;
            if (viewGroup2 != null) {
                this.f31310H = d(viewGroup2);
            }
        }
        if (this.f31309G == null) {
            int childCount = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i5);
                if (p(childAt)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
                i5++;
            }
            this.f31309G = viewGroup;
        }
        y();
        this.f31307E = false;
    }

    @N
    private View d(@N View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private static int g(@N View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    private static CharSequence i(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @N
    static com.google.android.material.appbar.e j(@N View view) {
        com.google.android.material.appbar.e eVar = (com.google.android.material.appbar.e) view.getTag(a.h.i6);
        if (eVar == null) {
            com.google.android.material.appbar.e eVar2 = new com.google.android.material.appbar.e(view);
            view.setTag(a.h.i6, eVar2);
            return eVar2;
        }
        return eVar;
    }

    private boolean n() {
        if (this.f31330e0 == 1) {
            return true;
        }
        return false;
    }

    private static boolean p(View view) {
        if (!(view instanceof Toolbar) && !(view instanceof android.widget.Toolbar)) {
            return false;
        }
        return true;
    }

    private boolean q(View view) {
        View view2 = this.f31310H;
        if (view2 != null && view2 != this) {
            if (view != view2) {
                return false;
            }
        } else if (view != this.f31309G) {
            return false;
        }
        return true;
    }

    private void u(boolean z3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        View view = this.f31310H;
        if (view == null) {
            view = this.f31309G;
        }
        int h4 = h(view);
        C1783d.a(this, this.f31311I, this.f31316N);
        ViewGroup viewGroup = this.f31309G;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i4 = toolbar.getTitleMarginStart();
            i6 = toolbar.getTitleMarginEnd();
            i7 = toolbar.getTitleMarginTop();
            i5 = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i4 = toolbar2.getTitleMarginStart();
            i6 = toolbar2.getTitleMarginEnd();
            i7 = toolbar2.getTitleMarginTop();
            i5 = toolbar2.getTitleMarginBottom();
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        C1781b c1781b = this.f31317O;
        Rect rect = this.f31316N;
        int i9 = rect.left;
        if (z3) {
            i8 = i6;
        } else {
            i8 = i4;
        }
        int i10 = i9 + i8;
        int i11 = rect.top + h4 + i7;
        int i12 = rect.right;
        if (!z3) {
            i4 = i6;
        }
        c1781b.f0(i10, i11, i12 - i4, (rect.bottom + h4) - i5);
    }

    private void v() {
        setContentDescription(getTitle());
    }

    private void w(@N Drawable drawable, int i4, int i5) {
        x(drawable, this.f31309G, i4, i5);
    }

    private void x(@N Drawable drawable, @P View view, int i4, int i5) {
        if (n() && view != null && this.f31319Q) {
            i5 = view.getBottom();
        }
        drawable.setBounds(0, 0, i4, i5);
    }

    private void y() {
        View view;
        if (!this.f31319Q && (view = this.f31311I) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f31311I);
            }
        }
        if (this.f31319Q && this.f31309G != null) {
            if (this.f31311I == null) {
                this.f31311I = new View(getContext());
            }
            if (this.f31311I.getParent() == null) {
                this.f31309G.addView(this.f31311I, -1, -1);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public void draw(@N Canvas canvas) {
        int i4;
        Drawable drawable;
        super.draw(canvas);
        c();
        if (this.f31309G == null && (drawable = this.f31321S) != null && this.f31323U > 0) {
            drawable.mutate().setAlpha(this.f31323U);
            this.f31321S.draw(canvas);
        }
        if (this.f31319Q && this.f31320R) {
            if (this.f31309G != null && this.f31321S != null && this.f31323U > 0 && n() && this.f31317O.G() < this.f31317O.H()) {
                int save = canvas.save();
                canvas.clipRect(this.f31321S.getBounds(), Region.Op.DIFFERENCE);
                this.f31317O.l(canvas);
                canvas.restoreToCount(save);
            } else {
                this.f31317O.l(canvas);
            }
        }
        if (this.f31322T != null && this.f31323U > 0) {
            Y0 y02 = this.f31331f0;
            if (y02 != null) {
                i4 = y02.r();
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                this.f31322T.setBounds(0, -this.f31329d0, getWidth(), i4 - this.f31329d0);
                this.f31322T.mutate().setAlpha(this.f31323U);
                this.f31322T.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        boolean z3;
        if (this.f31321S != null && this.f31323U > 0 && q(view)) {
            x(this.f31321S, view, getWidth(), getHeight());
            this.f31321S.mutate().setAlpha(this.f31323U);
            this.f31321S.draw(canvas);
            z3 = true;
        } else {
            z3 = false;
        }
        if (super.drawChild(canvas, view, j4) || z3) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean z3;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f31322T;
        if (drawable != null && drawable.isStateful()) {
            z3 = drawable.setState(drawableState);
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.f31321S;
        if (drawable2 != null && drawable2.isStateful()) {
            z3 |= drawable2.setState(drawableState);
        }
        C1781b c1781b = this.f31317O;
        if (c1781b != null) {
            z3 |= c1781b.J0(drawableState);
        }
        if (z3) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f31317O.q();
    }

    @N
    public Typeface getCollapsedTitleTypeface() {
        return this.f31317O.v();
    }

    @P
    public Drawable getContentScrim() {
        return this.f31321S;
    }

    public int getExpandedTitleGravity() {
        return this.f31317O.C();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f31315M;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f31314L;
    }

    public int getExpandedTitleMarginStart() {
        return this.f31312J;
    }

    public int getExpandedTitleMarginTop() {
        return this.f31313K;
    }

    @N
    public Typeface getExpandedTitleTypeface() {
        return this.f31317O.F();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @W(23)
    public int getHyphenationFrequency() {
        return this.f31317O.I();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.f31317O.J();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @W(23)
    public float getLineSpacingAdd() {
        return this.f31317O.K();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @W(23)
    public float getLineSpacingMultiplier() {
        return this.f31317O.L();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f31317O.M();
    }

    int getScrimAlpha() {
        return this.f31323U;
    }

    public long getScrimAnimationDuration() {
        return this.f31326a0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i4;
        int i5 = this.f31327b0;
        if (i5 >= 0) {
            return i5 + this.f31332g0 + this.f31334i0;
        }
        Y0 y02 = this.f31331f0;
        if (y02 != null) {
            i4 = y02.r();
        } else {
            i4 = 0;
        }
        int e02 = C0823k0.e0(this);
        if (e02 > 0) {
            return Math.min((e02 * 2) + i4, getHeight());
        }
        return getHeight() / 3;
    }

    @P
    public Drawable getStatusBarScrim() {
        return this.f31322T;
    }

    @P
    public CharSequence getTitle() {
        if (this.f31319Q) {
            return this.f31317O.P();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f31330e0;
    }

    @P
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f31317O.O();
    }

    final int h(@N View view) {
        return ((getHeight() - j(view).c()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean k() {
        return this.f31335j0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean l() {
        return this.f31333h0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean m() {
        return this.f31317O.V();
    }

    public boolean o() {
        return this.f31319Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            b(appBarLayout);
            C0823k0.O1(this, C0823k0.U(appBarLayout));
            if (this.f31328c0 == null) {
                this.f31328c0 = new d();
            }
            appBarLayout.e(this.f31328c0);
            C0823k0.v1(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@N Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f31317O.Z(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.h hVar = this.f31328c0;
        if (hVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).v(hVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        Y0 y02 = this.f31331f0;
        if (y02 != null) {
            int r4 = y02.r();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (!C0823k0.U(childAt) && childAt.getTop() < r4) {
                    C0823k0.f1(childAt, r4);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            j(getChildAt(i9)).h();
        }
        A(i4, i5, i6, i7, false);
        B();
        z();
        int childCount3 = getChildCount();
        for (int i10 = 0; i10 < childCount3; i10++) {
            j(getChildAt(i10)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        c();
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i5);
        Y0 y02 = this.f31331f0;
        if (y02 != null) {
            i6 = y02.r();
        } else {
            i6 = 0;
        }
        if ((mode == 0 || this.f31333h0) && i6 > 0) {
            this.f31332g0 = i6;
            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i6, 1073741824));
        }
        if (this.f31335j0 && this.f31317O.M() > 1) {
            B();
            A(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int z3 = this.f31317O.z();
            if (z3 > 1) {
                this.f31334i0 = Math.round(this.f31317O.B()) * (z3 - 1);
                super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f31334i0, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f31309G;
        if (viewGroup != null) {
            View view = this.f31310H;
            if (view != null && view != this) {
                setMinimumHeight(g(view));
            } else {
                setMinimumHeight(g(viewGroup));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        Drawable drawable = this.f31321S;
        if (drawable != null) {
            w(drawable, i4, i5);
        }
    }

    Y0 r(@N Y0 y02) {
        Y0 y03;
        if (C0823k0.U(this)) {
            y03 = y02;
        } else {
            y03 = null;
        }
        if (!p.a(this.f31331f0, y03)) {
            this.f31331f0 = y03;
            requestLayout();
        }
        return y02.c();
    }

    public void s(int i4, int i5, int i6, int i7) {
        this.f31312J = i4;
        this.f31313K = i5;
        this.f31314L = i6;
        this.f31315M = i7;
        requestLayout();
    }

    public void setCollapsedTitleGravity(int i4) {
        this.f31317O.k0(i4);
    }

    public void setCollapsedTitleTextAppearance(@d0 int i4) {
        this.f31317O.h0(i4);
    }

    public void setCollapsedTitleTextColor(@InterfaceC0569l int i4) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setCollapsedTitleTypeface(@P Typeface typeface) {
        this.f31317O.m0(typeface);
    }

    public void setContentScrim(@P Drawable drawable) {
        Drawable drawable2 = this.f31321S;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f31321S = drawable3;
            if (drawable3 != null) {
                w(drawable3, getWidth(), getHeight());
                this.f31321S.setCallback(this);
                this.f31321S.setAlpha(this.f31323U);
            }
            C0823k0.n1(this);
        }
    }

    public void setContentScrimColor(@InterfaceC0569l int i4) {
        setContentScrim(new ColorDrawable(i4));
    }

    public void setContentScrimResource(@InterfaceC0578v int i4) {
        setContentScrim(C0669d.i(getContext(), i4));
    }

    public void setExpandedTitleColor(@InterfaceC0569l int i4) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setExpandedTitleGravity(int i4) {
        this.f31317O.v0(i4);
    }

    public void setExpandedTitleMarginBottom(int i4) {
        this.f31315M = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i4) {
        this.f31314L = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i4) {
        this.f31312J = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i4) {
        this.f31313K = i4;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@d0 int i4) {
        this.f31317O.s0(i4);
    }

    public void setExpandedTitleTextColor(@N ColorStateList colorStateList) {
        this.f31317O.u0(colorStateList);
    }

    public void setExpandedTitleTypeface(@P Typeface typeface) {
        this.f31317O.x0(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z3) {
        this.f31335j0 = z3;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z3) {
        this.f31333h0 = z3;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @W(23)
    public void setHyphenationFrequency(int i4) {
        this.f31317O.C0(i4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @W(23)
    public void setLineSpacingAdd(float f4) {
        this.f31317O.E0(f4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @W(23)
    public void setLineSpacingMultiplier(@InterfaceC0580x(from = 0.0d) float f4) {
        this.f31317O.F0(f4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i4) {
        this.f31317O.G0(i4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z3) {
        this.f31317O.I0(z3);
    }

    void setScrimAlpha(int i4) {
        ViewGroup viewGroup;
        if (i4 != this.f31323U) {
            if (this.f31321S != null && (viewGroup = this.f31309G) != null) {
                C0823k0.n1(viewGroup);
            }
            this.f31323U = i4;
            C0823k0.n1(this);
        }
    }

    public void setScrimAnimationDuration(@F(from = 0) long j4) {
        this.f31326a0 = j4;
    }

    public void setScrimVisibleHeightTrigger(@F(from = 0) int i4) {
        if (this.f31327b0 != i4) {
            this.f31327b0 = i4;
            z();
        }
    }

    public void setScrimsShown(boolean z3) {
        boolean z4;
        if (C0823k0.U0(this) && !isInEditMode()) {
            z4 = true;
        } else {
            z4 = false;
        }
        t(z3, z4);
    }

    public void setStatusBarScrim(@P Drawable drawable) {
        boolean z3;
        Drawable drawable2 = this.f31322T;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f31322T = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f31322T.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.d.m(this.f31322T, C0823k0.Z(this));
                Drawable drawable4 = this.f31322T;
                if (getVisibility() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                drawable4.setVisible(z3, false);
                this.f31322T.setCallback(this);
                this.f31322T.setAlpha(this.f31323U);
            }
            C0823k0.n1(this);
        }
    }

    public void setStatusBarScrimColor(@InterfaceC0569l int i4) {
        setStatusBarScrim(new ColorDrawable(i4));
    }

    public void setStatusBarScrimResource(@InterfaceC0578v int i4) {
        setStatusBarScrim(C0669d.i(getContext(), i4));
    }

    public void setTitle(@P CharSequence charSequence) {
        this.f31317O.K0(charSequence);
        v();
    }

    public void setTitleCollapseMode(int i4) {
        this.f31330e0 = i4;
        boolean n4 = n();
        this.f31317O.A0(n4);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            b((AppBarLayout) parent);
        }
        if (n4 && this.f31321S == null) {
            setContentScrimColor(this.f31318P.g(getResources().getDimension(a.f.f2319P0)));
        }
    }

    public void setTitleEnabled(boolean z3) {
        if (z3 != this.f31319Q) {
            this.f31319Q = z3;
            v();
            y();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@P TimeInterpolator timeInterpolator) {
        this.f31317O.H0(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        boolean z3;
        super.setVisibility(i4);
        if (i4 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable = this.f31322T;
        if (drawable != null && drawable.isVisible() != z3) {
            this.f31322T.setVisible(z3, false);
        }
        Drawable drawable2 = this.f31321S;
        if (drawable2 != null && drawable2.isVisible() != z3) {
            this.f31321S.setVisible(z3, false);
        }
    }

    public void t(boolean z3, boolean z4) {
        if (this.f31324V != z3) {
            int i4 = 0;
            if (z4) {
                if (z3) {
                    i4 = 255;
                }
                a(i4);
            } else {
                if (z3) {
                    i4 = 255;
                }
                setScrimAlpha(i4);
            }
            this.f31324V = z3;
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@N Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f31321S && drawable != this.f31322T) {
            return false;
        }
        return true;
    }

    final void z() {
        boolean z3;
        if (this.f31321S != null || this.f31322T != null) {
            if (getHeight() + this.f31329d0 < getScrimVisibleHeightTrigger()) {
                z3 = true;
            } else {
                z3 = false;
            }
            setScrimsShown(z3);
        }
    }

    public CollapsingToolbarLayout(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f1824F2);
    }

    public void setCollapsedTitleTextColor(@N ColorStateList colorStateList) {
        this.f31317O.j0(colorStateList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CollapsingToolbarLayout(@androidx.annotation.N android.content.Context r11, @androidx.annotation.P android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* loaded from: classes2.dex */
    public static class c extends FrameLayout.LayoutParams {

        /* renamed from: c, reason: collision with root package name */
        private static final float f31338c = 0.5f;

        /* renamed from: d, reason: collision with root package name */
        public static final int f31339d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f31340e = 1;

        /* renamed from: f, reason: collision with root package name */
        public static final int f31341f = 2;

        /* renamed from: a, reason: collision with root package name */
        int f31342a;

        /* renamed from: b, reason: collision with root package name */
        float f31343b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f31342a = 0;
            this.f31343b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.e7);
            this.f31342a = obtainStyledAttributes.getInt(a.o.f7, 0);
            d(obtainStyledAttributes.getFloat(a.o.g7, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.f31342a;
        }

        public float b() {
            return this.f31343b;
        }

        public void c(int i4) {
            this.f31342a = i4;
        }

        public void d(float f4) {
            this.f31343b = f4;
        }

        public c(int i4, int i5) {
            super(i4, i5);
            this.f31342a = 0;
            this.f31343b = 0.5f;
        }

        public c(int i4, int i5, int i6) {
            super(i4, i5, i6);
            this.f31342a = 0;
            this.f31343b = 0.5f;
        }

        public c(@N ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f31342a = 0;
            this.f31343b = 0.5f;
        }

        public c(@N ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f31342a = 0;
            this.f31343b = 0.5f;
        }

        @W(19)
        public c(@N FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f31342a = 0;
            this.f31343b = 0.5f;
        }
    }
}
