package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.n;
import androidx.core.view.C0823k0;
import androidx.core.view.Y0;
import d.C2042a;

@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements F, androidx.core.view.Y, androidx.core.view.W, androidx.core.view.X {

    /* renamed from: m0, reason: collision with root package name */
    private static final String f5508m0 = "ActionBarOverlayLayout";

    /* renamed from: n0, reason: collision with root package name */
    private static final int f5509n0 = 600;

    /* renamed from: o0, reason: collision with root package name */
    static final int[] f5510o0 = {C2042a.b.f49210d, R.attr.windowContentOverlay};

    /* renamed from: E, reason: collision with root package name */
    private int f5511E;

    /* renamed from: F, reason: collision with root package name */
    private int f5512F;

    /* renamed from: G, reason: collision with root package name */
    private ContentFrameLayout f5513G;

    /* renamed from: H, reason: collision with root package name */
    ActionBarContainer f5514H;

    /* renamed from: I, reason: collision with root package name */
    private G f5515I;

    /* renamed from: J, reason: collision with root package name */
    private Drawable f5516J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f5517K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f5518L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f5519M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f5520N;

    /* renamed from: O, reason: collision with root package name */
    boolean f5521O;

    /* renamed from: P, reason: collision with root package name */
    private int f5522P;

    /* renamed from: Q, reason: collision with root package name */
    private int f5523Q;

    /* renamed from: R, reason: collision with root package name */
    private final Rect f5524R;

    /* renamed from: S, reason: collision with root package name */
    private final Rect f5525S;

    /* renamed from: T, reason: collision with root package name */
    private final Rect f5526T;

    /* renamed from: U, reason: collision with root package name */
    private final Rect f5527U;

    /* renamed from: V, reason: collision with root package name */
    private final Rect f5528V;

    /* renamed from: W, reason: collision with root package name */
    private final Rect f5529W;

    /* renamed from: a0, reason: collision with root package name */
    private final Rect f5530a0;

    /* renamed from: b0, reason: collision with root package name */
    @androidx.annotation.N
    private Y0 f5531b0;

    /* renamed from: c0, reason: collision with root package name */
    @androidx.annotation.N
    private Y0 f5532c0;

    /* renamed from: d0, reason: collision with root package name */
    @androidx.annotation.N
    private Y0 f5533d0;

    /* renamed from: e0, reason: collision with root package name */
    @androidx.annotation.N
    private Y0 f5534e0;

    /* renamed from: f0, reason: collision with root package name */
    private d f5535f0;

    /* renamed from: g0, reason: collision with root package name */
    private OverScroller f5536g0;

    /* renamed from: h0, reason: collision with root package name */
    ViewPropertyAnimator f5537h0;

    /* renamed from: i0, reason: collision with root package name */
    final AnimatorListenerAdapter f5538i0;

    /* renamed from: j0, reason: collision with root package name */
    private final Runnable f5539j0;

    /* renamed from: k0, reason: collision with root package name */
    private final Runnable f5540k0;

    /* renamed from: l0, reason: collision with root package name */
    private final androidx.core.view.Z f5541l0;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f5537h0 = null;
            actionBarOverlayLayout.f5521O = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f5537h0 = null;
            actionBarOverlayLayout.f5521O = false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.y();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f5537h0 = actionBarOverlayLayout.f5514H.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f5538i0);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.y();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f5537h0 = actionBarOverlayLayout.f5514H.animate().translationY(-ActionBarOverlayLayout.this.f5514H.getHeight()).setListener(ActionBarOverlayLayout.this.f5538i0);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c(boolean z3);

        void d();

        void e();

        void f(int i4);
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i4, int i5) {
            super(i4, i5);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ActionBarOverlayLayout(@androidx.annotation.N Context context) {
        this(context, null);
    }

    private void C() {
        y();
        postDelayed(this.f5540k0, 600L);
    }

    private void D() {
        y();
        postDelayed(this.f5539j0, 600L);
    }

    private void F() {
        y();
        this.f5539j0.run();
    }

    private boolean G(float f4) {
        this.f5536g0.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f5536g0.getFinalY() > this.f5514H.getHeight()) {
            return true;
        }
        return false;
    }

    private void a() {
        y();
        this.f5540k0.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(@androidx.annotation.N android.view.View r3, @androidx.annotation.N android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.b(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private G x(View view) {
        if (view instanceof G) {
            return (G) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void z(Context context) {
        boolean z3;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f5510o0);
        boolean z4 = false;
        this.f5511E = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f5516J = drawable;
        if (drawable == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        setWillNotDraw(z3);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z4 = true;
        }
        this.f5517K = z4;
        this.f5536g0 = new OverScroller(context);
    }

    public boolean A() {
        return this.f5520N;
    }

    public boolean B() {
        return this.f5518L;
    }

    void E() {
        if (this.f5513G == null) {
            this.f5513G = (ContentFrameLayout) findViewById(C2042a.g.f49618b);
            this.f5514H = (ActionBarContainer) findViewById(C2042a.g.f49620c);
            this.f5515I = x(findViewById(C2042a.g.f49616a));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.F
    public void d(Menu menu, n.a aVar) {
        E();
        this.f5515I.d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        if (this.f5516J != null && !this.f5517K) {
            if (this.f5514H.getVisibility() == 0) {
                i4 = (int) (this.f5514H.getBottom() + this.f5514H.getTranslationY() + 0.5f);
            } else {
                i4 = 0;
            }
            this.f5516J.setBounds(0, i4, getWidth(), this.f5516J.getIntrinsicHeight() + i4);
            this.f5516J.draw(canvas);
        }
    }

    @Override // androidx.core.view.X
    public void e(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        r(view, i4, i5, i6, i7, i8);
    }

    @Override // androidx.appcompat.widget.F
    public boolean f() {
        E();
        return this.f5515I.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.F
    public void g() {
        E();
        this.f5515I.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f5514H;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, androidx.core.view.Y
    public int getNestedScrollAxes() {
        return this.f5541l0.a();
    }

    @Override // androidx.appcompat.widget.F
    public CharSequence getTitle() {
        E();
        return this.f5515I.getTitle();
    }

    @Override // androidx.appcompat.widget.F
    public boolean h() {
        E();
        return this.f5515I.h();
    }

    @Override // androidx.appcompat.widget.F
    public boolean i() {
        E();
        return this.f5515I.i();
    }

    @Override // androidx.appcompat.widget.F
    public boolean j() {
        E();
        return this.f5515I.j();
    }

    @Override // androidx.appcompat.widget.F
    public boolean k() {
        E();
        return this.f5515I.k();
    }

    @Override // androidx.appcompat.widget.F
    public boolean l() {
        E();
        return this.f5515I.l();
    }

    @Override // androidx.appcompat.widget.F
    public boolean m() {
        E();
        return this.f5515I.m();
    }

    @Override // androidx.appcompat.widget.F
    public void n(SparseArray<Parcelable> sparseArray) {
        E();
        this.f5515I.y(sparseArray);
    }

    @Override // androidx.appcompat.widget.F
    public void o(int i4) {
        E();
        if (i4 != 2) {
            if (i4 != 5) {
                if (i4 == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            this.f5515I.T();
            return;
        }
        this.f5515I.R();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (r0 != false) goto L9;
     */
    @Override // android.view.View
    @androidx.annotation.W(21)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.WindowInsets onApplyWindowInsets(@androidx.annotation.N android.view.WindowInsets r8) {
        /*
            r7 = this;
            r7.E()
            androidx.core.view.Y0 r8 = androidx.core.view.Y0.L(r8, r7)
            android.graphics.Rect r2 = new android.graphics.Rect
            int r0 = r8.p()
            int r1 = r8.r()
            int r3 = r8.q()
            int r4 = r8.o()
            r2.<init>(r0, r1, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r7.f5514H
            r3 = 1
            r4 = 1
            r5 = 0
            r6 = 1
            r0 = r7
            boolean r0 = r0.b(r1, r2, r3, r4, r5, r6)
            android.graphics.Rect r1 = r7.f5524R
            androidx.core.view.C0823k0.o(r7, r8, r1)
            android.graphics.Rect r1 = r7.f5524R
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r1 = r1.bottom
            androidx.core.view.Y0 r1 = r8.x(r2, r3, r4, r1)
            r7.f5531b0 = r1
            androidx.core.view.Y0 r2 = r7.f5532c0
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L49
            androidx.core.view.Y0 r0 = r7.f5531b0
            r7.f5532c0 = r0
            r0 = 1
        L49:
            android.graphics.Rect r1 = r7.f5525S
            android.graphics.Rect r2 = r7.f5524R
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L5b
            android.graphics.Rect r0 = r7.f5525S
            android.graphics.Rect r1 = r7.f5524R
            r0.set(r1)
            goto L5d
        L5b:
            if (r0 == 0) goto L60
        L5d:
            r7.requestLayout()
        L60:
            androidx.core.view.Y0 r8 = r8.a()
            androidx.core.view.Y0 r8 = r8.c()
            androidx.core.view.Y0 r8 = r8.b()
            android.view.WindowInsets r8 = r8.J()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        z(getContext());
        C0823k0.v1(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        boolean z3;
        int measuredHeight;
        E();
        measureChildWithMargins(this.f5514H, i4, 0, i5, 0);
        e eVar = (e) this.f5514H.getLayoutParams();
        int max = Math.max(0, this.f5514H.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f5514H.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f5514H.getMeasuredState());
        if ((C0823k0.C0(this) & 256) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            measuredHeight = this.f5511E;
            if (this.f5519M && this.f5514H.getTabContainer() != null) {
                measuredHeight += this.f5511E;
            }
        } else {
            measuredHeight = this.f5514H.getVisibility() != 8 ? this.f5514H.getMeasuredHeight() : 0;
        }
        this.f5526T.set(this.f5524R);
        Y0 y02 = this.f5531b0;
        this.f5533d0 = y02;
        if (!this.f5518L && !z3) {
            Rect rect = this.f5526T;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f5533d0 = y02.x(0, measuredHeight, 0, 0);
        } else {
            this.f5533d0 = new Y0.b(this.f5533d0).h(androidx.core.graphics.E.d(y02.p(), this.f5533d0.r() + measuredHeight, this.f5533d0.q(), this.f5533d0.o())).a();
        }
        b(this.f5513G, this.f5526T, true, true, true, true);
        if (!this.f5534e0.equals(this.f5533d0)) {
            Y0 y03 = this.f5533d0;
            this.f5534e0 = y03;
            C0823k0.p(this.f5513G, y03);
        }
        measureChildWithMargins(this.f5513G, i4, 0, i5, 0);
        e eVar2 = (e) this.f5513G.getLayoutParams();
        int max3 = Math.max(max, this.f5513G.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f5513G.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f5513G.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        if (this.f5520N && z3) {
            if (G(f5)) {
                a();
            } else {
                F();
            }
            this.f5521O = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onNestedPreFling(View view, float f4, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        int i8 = this.f5522P + i5;
        this.f5522P = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        this.f5541l0.b(view, view2, i4);
        this.f5522P = getActionBarHideOffset();
        y();
        d dVar = this.f5535f0;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) != 0 && this.f5514H.getVisibility() == 0) {
            return this.f5520N;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onStopNestedScroll(View view) {
        if (this.f5520N && !this.f5521O) {
            if (this.f5522P <= this.f5514H.getHeight()) {
                D();
            } else {
                C();
            }
        }
        d dVar = this.f5535f0;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i4) {
        boolean z3;
        super.onWindowSystemUiVisibilityChanged(i4);
        E();
        int i5 = this.f5523Q ^ i4;
        this.f5523Q = i4;
        boolean z4 = false;
        if ((i4 & 4) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i4 & 256) != 0) {
            z4 = true;
        }
        d dVar = this.f5535f0;
        if (dVar != null) {
            dVar.c(!z4);
            if (!z3 && z4) {
                this.f5535f0.d();
            } else {
                this.f5535f0.a();
            }
        }
        if ((i5 & 256) != 0 && this.f5535f0 != null) {
            C0823k0.v1(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.f5512F = i4;
        d dVar = this.f5535f0;
        if (dVar != null) {
            dVar.f(i4);
        }
    }

    @Override // androidx.appcompat.widget.F
    public void p() {
        E();
        this.f5515I.o();
    }

    @Override // androidx.appcompat.widget.F
    public void q(SparseArray<Parcelable> sparseArray) {
        E();
        this.f5515I.L(sparseArray);
    }

    @Override // androidx.core.view.W
    public void r(View view, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i4, i5, i6, i7);
        }
    }

    @Override // androidx.core.view.W
    public boolean s(View view, View view2, int i4, int i5) {
        if (i5 == 0 && onStartNestedScroll(view, view2, i4)) {
            return true;
        }
        return false;
    }

    public void setActionBarHideOffset(int i4) {
        y();
        this.f5514H.setTranslationY(-Math.max(0, Math.min(i4, this.f5514H.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f5535f0 = dVar;
        if (getWindowToken() != null) {
            this.f5535f0.f(this.f5512F);
            int i4 = this.f5523Q;
            if (i4 != 0) {
                onWindowSystemUiVisibilityChanged(i4);
                C0823k0.v1(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f5519M = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f5520N) {
            this.f5520N = z3;
            if (!z3) {
                y();
                setActionBarHideOffset(0);
            }
        }
    }

    @Override // androidx.appcompat.widget.F
    public void setIcon(int i4) {
        E();
        this.f5515I.setIcon(i4);
    }

    @Override // androidx.appcompat.widget.F
    public void setLogo(int i4) {
        E();
        this.f5515I.setLogo(i4);
    }

    public void setOverlayMode(boolean z3) {
        boolean z4;
        this.f5518L = z3;
        if (z3 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f5517K = z4;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    @Override // androidx.appcompat.widget.F
    public void setUiOptions(int i4) {
    }

    @Override // androidx.appcompat.widget.F
    public void setWindowCallback(Window.Callback callback) {
        E();
        this.f5515I.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.F
    public void setWindowTitle(CharSequence charSequence) {
        E();
        this.f5515I.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.core.view.W
    public void t(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // androidx.core.view.W
    public void u(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.W
    public void v(View view, int i4, int i5, int[] iArr, int i6) {
        if (i6 == 0) {
            onNestedPreScroll(view, i4, i5, iArr);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void y() {
        removeCallbacks(this.f5539j0);
        removeCallbacks(this.f5540k0);
        ViewPropertyAnimator viewPropertyAnimator = this.f5537h0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public ActionBarOverlayLayout(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5512F = 0;
        this.f5524R = new Rect();
        this.f5525S = new Rect();
        this.f5526T = new Rect();
        this.f5527U = new Rect();
        this.f5528V = new Rect();
        this.f5529W = new Rect();
        this.f5530a0 = new Rect();
        Y0 y02 = Y0.f13232c;
        this.f5531b0 = y02;
        this.f5532c0 = y02;
        this.f5533d0 = y02;
        this.f5534e0 = y02;
        this.f5538i0 = new a();
        this.f5539j0 = new b();
        this.f5540k0 = new c();
        z(context);
        this.f5541l0 = new androidx.core.view.Z(this);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // androidx.appcompat.widget.F
    public void setIcon(Drawable drawable) {
        E();
        this.f5515I.setIcon(drawable);
    }
}
