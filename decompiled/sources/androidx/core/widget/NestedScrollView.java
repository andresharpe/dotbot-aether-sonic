package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.i0;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.InterfaceC0811g0;
import androidx.core.view.Q;
import androidx.core.view.T;
import androidx.core.view.V;
import androidx.core.view.X;
import androidx.core.view.Z;
import androidx.core.view.accessibility.M;
import java.util.ArrayList;
import m.C2356a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements X, T, InterfaceC0811g0 {

    /* renamed from: i0, reason: collision with root package name */
    static final int f13700i0 = 250;

    /* renamed from: j0, reason: collision with root package name */
    static final float f13701j0 = 0.5f;

    /* renamed from: k0, reason: collision with root package name */
    private static final String f13702k0 = "NestedScrollView";

    /* renamed from: l0, reason: collision with root package name */
    private static final int f13703l0 = 250;

    /* renamed from: m0, reason: collision with root package name */
    private static final float f13704m0 = 0.015f;

    /* renamed from: n0, reason: collision with root package name */
    private static final float f13705n0 = 0.35f;

    /* renamed from: p0, reason: collision with root package name */
    private static final float f13707p0 = 4.0f;

    /* renamed from: q0, reason: collision with root package name */
    private static final int f13708q0 = -1;

    /* renamed from: E, reason: collision with root package name */
    private final float f13711E;

    /* renamed from: F, reason: collision with root package name */
    private long f13712F;

    /* renamed from: G, reason: collision with root package name */
    private final Rect f13713G;

    /* renamed from: H, reason: collision with root package name */
    private OverScroller f13714H;

    /* renamed from: I, reason: collision with root package name */
    @i0
    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public EdgeEffect f13715I;

    /* renamed from: J, reason: collision with root package name */
    @i0
    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public EdgeEffect f13716J;

    /* renamed from: K, reason: collision with root package name */
    private int f13717K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f13718L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f13719M;

    /* renamed from: N, reason: collision with root package name */
    private View f13720N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f13721O;

    /* renamed from: P, reason: collision with root package name */
    private VelocityTracker f13722P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f13723Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f13724R;

    /* renamed from: S, reason: collision with root package name */
    private int f13725S;

    /* renamed from: T, reason: collision with root package name */
    private int f13726T;

    /* renamed from: U, reason: collision with root package name */
    private int f13727U;

    /* renamed from: V, reason: collision with root package name */
    private int f13728V;

    /* renamed from: W, reason: collision with root package name */
    private final int[] f13729W;

    /* renamed from: a0, reason: collision with root package name */
    private final int[] f13730a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f13731b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f13732c0;

    /* renamed from: d0, reason: collision with root package name */
    private d f13733d0;

    /* renamed from: e0, reason: collision with root package name */
    private final Z f13734e0;

    /* renamed from: f0, reason: collision with root package name */
    private final V f13735f0;

    /* renamed from: g0, reason: collision with root package name */
    private float f13736g0;

    /* renamed from: h0, reason: collision with root package name */
    private c f13737h0;

    /* renamed from: o0, reason: collision with root package name */
    private static final float f13706o0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: r0, reason: collision with root package name */
    private static final a f13709r0 = new a();

    /* renamed from: s0, reason: collision with root package name */
    private static final int[] f13710s0 = {R.attr.fillViewport};

    /* loaded from: classes.dex */
    static class a extends C0771a {
        a() {
        }

        @Override // androidx.core.view.C0771a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            boolean z3;
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            accessibilityEvent.setScrollable(z3);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            androidx.core.view.accessibility.T.N(accessibilityEvent, nestedScrollView.getScrollX());
            androidx.core.view.accessibility.T.P(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, M m4) {
            int scrollRange;
            super.g(view, m4);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            m4.Z0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                m4.I1(true);
                if (nestedScrollView.getScrollY() > 0) {
                    m4.b(M.a.f13384s);
                    m4.b(M.a.f13351D);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    m4.b(M.a.f13383r);
                    m4.b(M.a.f13353F);
                }
            }
        }

        @Override // androidx.core.view.C0771a
        public boolean j(View view, int i4, Bundle bundle) {
            if (super.j(view, i4, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i4 != 4096) {
                if (i4 != 8192 && i4 != 16908344) {
                    if (i4 != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.b0(0, max, true);
                    return true;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.b0(0, min, true);
            return true;
        }
    }

    @W(21)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(@N NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        public int f13738E;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i4) {
                return new d[i4];
            }
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        @N
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f13738E + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f13738E);
        }

        d(Parcel parcel) {
            super(parcel);
            this.f13738E = parcel.readInt();
        }
    }

    public NestedScrollView(@N Context context) {
        this(context, null);
    }

    private float A(int i4) {
        double log = Math.log((Math.abs(i4) * f13705n0) / (this.f13711E * f13704m0));
        float f4 = f13706o0;
        return (float) (this.f13711E * f13704m0 * Math.exp((f4 / (f4 - 1.0d)) * log));
    }

    private boolean B(int i4, int i5) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i5 < childAt.getTop() - scrollY || i5 >= childAt.getBottom() - scrollY || i4 < childAt.getLeft() || i4 >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    private void C() {
        VelocityTracker velocityTracker = this.f13722P;
        if (velocityTracker == null) {
            this.f13722P = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void D() {
        this.f13714H = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f13725S = viewConfiguration.getScaledTouchSlop();
        this.f13726T = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f13727U = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void E() {
        if (this.f13722P == null) {
            this.f13722P = VelocityTracker.obtain();
        }
    }

    private boolean G(View view) {
        return !J(view, 0, getHeight());
    }

    private static boolean I(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        if ((parent instanceof ViewGroup) && I((View) parent, view2)) {
            return true;
        }
        return false;
    }

    private boolean J(View view, int i4, int i5) {
        view.getDrawingRect(this.f13713G);
        offsetDescendantRectToMyCoords(view, this.f13713G);
        if (this.f13713G.bottom + i4 >= getScrollY() && this.f13713G.top - i4 <= getScrollY() + i5) {
            return true;
        }
        return false;
    }

    private void K(int i4, int i5, @P int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f13735f0.e(0, scrollY2, 0, i4 - scrollY2, null, i5, iArr);
    }

    private void L(MotionEvent motionEvent) {
        int i4;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f13728V) {
            if (actionIndex == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            this.f13717K = (int) motionEvent.getY(i4);
            this.f13728V = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f13722P;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void O() {
        VelocityTracker velocityTracker = this.f13722P;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f13722P = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int P(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f13715I
            float r0 = androidx.core.widget.j.d(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f13715I
            float r4 = -r4
            float r4 = androidx.core.widget.j.j(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f13715I
            float r5 = androidx.core.widget.j.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f13715I
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f13716J
            float r0 = androidx.core.widget.j.d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f13716J
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.j.j(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f13716J
            float r5 = androidx.core.widget.j.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f13716J
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.P(int, float):int");
    }

    private void Q(boolean z3) {
        if (z3) {
            f(2, 1);
        } else {
            g(1);
        }
        this.f13732c0 = getScrollY();
        C0823k0.n1(this);
    }

    private boolean R(int i4, int i5, int i6) {
        boolean z3;
        int i7;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        boolean z4 = false;
        if (i4 == 33) {
            z3 = true;
        } else {
            z3 = false;
        }
        View x3 = x(z3, i5, i6);
        if (x3 == null) {
            x3 = this;
        }
        if (i5 < scrollY || i6 > i8) {
            if (z3) {
                i7 = i5 - scrollY;
            } else {
                i7 = i6 - i8;
            }
            o(i7);
            z4 = true;
        }
        if (x3 != findFocus()) {
            x3.requestFocus(i4);
        }
        return z4;
    }

    private void S(View view) {
        view.getDrawingRect(this.f13713G);
        offsetDescendantRectToMyCoords(view, this.f13713G);
        int m4 = m(this.f13713G);
        if (m4 != 0) {
            scrollBy(0, m4);
        }
    }

    private boolean T(Rect rect, boolean z3) {
        boolean z4;
        int m4 = m(rect);
        if (m4 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (z3) {
                scrollBy(0, m4);
            } else {
                V(0, m4);
            }
        }
        return z4;
    }

    private boolean U(@N EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        if (A(-i4) < j.d(edgeEffect) * getHeight()) {
            return true;
        }
        return false;
    }

    private void X(int i4, int i5, int i6, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f13712F > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f13714H.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY, i6);
            Q(z3);
        } else {
            if (!this.f13714H.isFinished()) {
                h();
            }
            scrollBy(i4, i5);
        }
        this.f13712F = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean c0(MotionEvent motionEvent) {
        boolean z3;
        if (j.d(this.f13715I) != 0.0f) {
            j.j(this.f13715I, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        if (j.d(this.f13716J) != 0.0f) {
            j.j(this.f13716J, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z3;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f13736g0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.f13736g0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f13736g0;
    }

    private void h() {
        this.f13714H.abortAnimation();
        g(1);
    }

    private boolean j() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode == 1 && getScrollRange() > 0) {
            return true;
        }
        return false;
    }

    private boolean k() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin <= (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    private static int l(int i4, int i5, int i6) {
        if (i5 >= i6 || i4 < 0) {
            return 0;
        }
        return i5 + i4 > i6 ? i6 - i5 : i4;
    }

    private void o(int i4) {
        if (i4 != 0) {
            if (this.f13724R) {
                V(0, i4);
            } else {
                scrollBy(0, i4);
            }
        }
    }

    private boolean p(int i4) {
        if (j.d(this.f13715I) != 0.0f) {
            if (U(this.f13715I, i4)) {
                this.f13715I.onAbsorb(i4);
            } else {
                y(-i4);
            }
        } else if (j.d(this.f13716J) != 0.0f) {
            int i5 = -i4;
            if (U(this.f13716J, i5)) {
                this.f13716J.onAbsorb(i5);
            } else {
                y(i5);
            }
        } else {
            return false;
        }
        return true;
    }

    private void q() {
        this.f13721O = false;
        O();
        g(0);
        this.f13715I.onRelease();
        this.f13716J.onRelease();
    }

    private View x(boolean z3, int i4, int i5) {
        boolean z4;
        boolean z5;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                if (i4 < top && bottom < i5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (view == null) {
                    view = view2;
                    z6 = z4;
                } else {
                    if ((z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom())) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z6) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z6 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    public boolean F() {
        return this.f13723Q;
    }

    public boolean H() {
        return this.f13724R;
    }

    boolean M(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i12;
        int i13;
        boolean z8;
        boolean z9;
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z4)) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z5)) {
            z7 = false;
        } else {
            z7 = true;
        }
        int i14 = i6 + i4;
        if (!z6) {
            i12 = 0;
        } else {
            i12 = i10;
        }
        int i15 = i7 + i5;
        if (!z7) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        int i16 = -i12;
        int i17 = i12 + i8;
        int i18 = -i13;
        int i19 = i13 + i9;
        if (i14 > i17) {
            i14 = i17;
            z8 = true;
        } else if (i14 < i16) {
            z8 = true;
            i14 = i16;
        } else {
            z8 = false;
        }
        if (i15 > i19) {
            i15 = i19;
            z9 = true;
        } else if (i15 < i18) {
            z9 = true;
            i15 = i18;
        } else {
            z9 = false;
        }
        if (z9 && !d(1)) {
            this.f13714H.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i14, i15, z8, z9);
        if (!z8 && !z9) {
            return false;
        }
        return true;
    }

    public boolean N(int i4) {
        boolean z3;
        if (i4 == 130) {
            z3 = true;
        } else {
            z3 = false;
        }
        int height = getHeight();
        if (z3) {
            this.f13713G.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f13713G;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f13713G.top = getScrollY() - height;
            Rect rect2 = this.f13713G;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f13713G;
        int i5 = rect3.top;
        int i6 = height + i5;
        rect3.bottom = i6;
        return R(i4, i5, i6);
    }

    public final void V(int i4, int i5) {
        X(i4, i5, 250, false);
    }

    public final void W(int i4, int i5, int i6) {
        X(i4, i5, i6, false);
    }

    public final void Y(int i4, int i5) {
        a0(i4, i5, 250, false);
    }

    public final void Z(int i4, int i5, int i6) {
        a0(i4, i5, i6, false);
    }

    @Override // androidx.core.view.S
    public boolean a(int i4, int i5, int i6, int i7, @P int[] iArr, int i8) {
        return this.f13735f0.g(i4, i5, i6, i7, iArr, i8);
    }

    void a0(int i4, int i5, int i6, boolean z3) {
        X(i4 - getScrollX(), i5 - getScrollY(), i6, z3);
    }

    @Override // android.view.ViewGroup
    public void addView(@N View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // androidx.core.view.S
    public boolean b(int i4, int i5, @P int[] iArr, @P int[] iArr2, int i6) {
        return this.f13735f0.d(i4, i5, iArr, iArr2, i6);
    }

    void b0(int i4, int i5, boolean z3) {
        a0(i4, i5, 250, z3);
    }

    @Override // androidx.core.view.T
    public void c(int i4, int i5, int i6, int i7, @P int[] iArr, int i8, @N int[] iArr2) {
        this.f13735f0.e(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0811g0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0811g0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0811g0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f13714H.isFinished()) {
            return;
        }
        this.f13714H.computeScrollOffset();
        int currY = this.f13714H.getCurrY();
        int n4 = n(currY - this.f13732c0);
        this.f13732c0 = currY;
        int[] iArr = this.f13730a0;
        iArr[1] = 0;
        b(0, n4, iArr, null, 1);
        int i4 = n4 - this.f13730a0[1];
        int scrollRange = getScrollRange();
        if (i4 != 0) {
            int scrollY = getScrollY();
            M(0, i4, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i5 = i4 - scrollY2;
            int[] iArr2 = this.f13730a0;
            iArr2[1] = 0;
            c(0, scrollY2, 0, i5, this.f13729W, 1, iArr2);
            i4 = i5 - this.f13730a0[1];
        }
        if (i4 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i4 < 0) {
                    if (this.f13715I.isFinished()) {
                        this.f13715I.onAbsorb((int) this.f13714H.getCurrVelocity());
                    }
                } else if (this.f13716J.isFinished()) {
                    this.f13716J.onAbsorb((int) this.f13714H.getCurrVelocity());
                }
            }
            h();
        }
        if (!this.f13714H.isFinished()) {
            C0823k0.n1(this);
        } else {
            g(1);
        }
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0811g0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0811g0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0811g0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // androidx.core.view.S
    public boolean d(int i4) {
        return this.f13735f0.l(i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !w(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return this.f13735f0.a(f4, f5, z3);
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return this.f13735f0.b(f4, f5);
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean dispatchNestedPreScroll(int i4, int i5, @P int[] iArr, @P int[] iArr2) {
        return b(i4, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, @P int[] iArr) {
        return this.f13735f0.f(i4, i5, i6, i7, iArr);
    }

    @Override // android.view.View
    public void draw(@N Canvas canvas) {
        int i4;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i5 = 0;
        if (!this.f13715I.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i4 = getPaddingLeft();
            } else {
                i4 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i4, min);
            this.f13715I.setSize(width, height);
            if (this.f13715I.draw(canvas)) {
                C0823k0.n1(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f13716J.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i5 = getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i5 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f13716J.setSize(width2, height2);
            if (this.f13716J.draw(canvas)) {
                C0823k0.n1(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // androidx.core.view.X
    public void e(@N View view, int i4, int i5, int i6, int i7, int i8, @N int[] iArr) {
        K(i7, i8, iArr);
    }

    @Override // androidx.core.view.S
    public boolean f(int i4, int i5) {
        return this.f13735f0.s(i4, i5);
    }

    @Override // androidx.core.view.S
    public void g(int i4) {
        this.f13735f0.u(i4);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, androidx.core.view.Y
    public int getNestedScrollAxes() {
        return this.f13734e0.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean hasNestedScrollingParent() {
        return d(0);
    }

    public boolean i(int i4) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && J(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f13713G);
            offsetDescendantRectToMyCoords(findNextFocus, this.f13713G);
            o(m(this.f13713G));
            findNextFocus.requestFocus(i4);
        } else {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            o(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && G(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean isNestedScrollingEnabled() {
        return this.f13735f0.m();
    }

    protected int m(Rect rect) {
        int i4;
        int i5;
        int i6;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i4 = i7 - verticalFadingEdgeLength;
        } else {
            i4 = i7;
        }
        int i8 = rect.bottom;
        if (i8 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i6 = rect.top - scrollY;
            } else {
                i6 = rect.bottom - i4;
            }
            return Math.min(i6, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i8 >= i4) {
            return 0;
        }
        if (rect.height() > height) {
            i5 = 0 - (i4 - rect.bottom);
        } else {
            i5 = 0 - (scrollY - rect.top);
        }
        return Math.max(i5, -getScrollY());
    }

    @Override // android.view.ViewGroup
    protected void measureChild(@N View view, int i4, int i5) {
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    int n(int i4) {
        int height = getHeight();
        if (i4 > 0 && j.d(this.f13715I) != 0.0f) {
            int round = Math.round(((-height) / f13707p0) * j.j(this.f13715I, ((-i4) * f13707p0) / height, 0.5f));
            if (round != i4) {
                this.f13715I.finish();
            }
            return i4 - round;
        }
        if (i4 < 0 && j.d(this.f13716J) != 0.0f) {
            float f4 = height;
            int round2 = Math.round((f4 / f13707p0) * j.j(this.f13716J, (i4 * f13707p0) / f4, 0.5f));
            if (round2 != i4) {
                this.f13716J.finish();
            }
            return i4 - round2;
        }
        return i4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13719M = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onGenericMotionEvent(@N MotionEvent motionEvent) {
        float f4;
        boolean z3;
        int i4 = 0;
        if (motionEvent.getAction() == 8 && !this.f13721O) {
            if (Q.l(motionEvent, 2)) {
                f4 = motionEvent.getAxisValue(9);
            } else if (Q.l(motionEvent, 4194304)) {
                f4 = motionEvent.getAxisValue(26);
            } else {
                f4 = 0.0f;
            }
            if (f4 != 0.0f) {
                int verticalScrollFactorCompat = (int) (f4 * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i5 = scrollY - verticalScrollFactorCompat;
                if (i5 < 0) {
                    if (j() && !Q.l(motionEvent, 8194)) {
                        j.j(this.f13715I, (-i5) / getHeight(), 0.5f);
                        this.f13715I.onRelease();
                        invalidate();
                        z3 = 1;
                    } else {
                        z3 = 0;
                    }
                } else if (i5 > scrollRange) {
                    if (j() && !Q.l(motionEvent, 8194)) {
                        j.j(this.f13716J, (i5 - scrollRange) / getHeight(), 0.5f);
                        this.f13716J.onRelease();
                        invalidate();
                        i4 = 1;
                    }
                    z3 = i4;
                    i4 = scrollRange;
                } else {
                    z3 = 0;
                    i4 = i5;
                }
                if (i4 != scrollY) {
                    super.scrollTo(getScrollX(), i4);
                    return true;
                }
                return z3;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@N MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f13721O) {
            return true;
        }
        int i4 = action & 255;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 6) {
                            L(motionEvent);
                        }
                    }
                } else {
                    int i5 = this.f13728V;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            Log.e(f13702k0, "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.f13717K) > this.f13725S && (2 & getNestedScrollAxes()) == 0) {
                                this.f13721O = true;
                                this.f13717K = y3;
                                E();
                                this.f13722P.addMovement(motionEvent);
                                this.f13731b0 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f13721O = false;
            this.f13728V = -1;
            O();
            if (this.f13714H.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0823k0.n1(this);
            }
            g(0);
        } else {
            int y4 = (int) motionEvent.getY();
            if (!B((int) motionEvent.getX(), y4)) {
                if (!c0(motionEvent) && this.f13714H.isFinished()) {
                    z3 = false;
                }
                this.f13721O = z3;
                O();
            } else {
                this.f13717K = y4;
                this.f13728V = motionEvent.getPointerId(0);
                C();
                this.f13722P.addMovement(motionEvent);
                this.f13714H.computeScrollOffset();
                if (!c0(motionEvent) && this.f13714H.isFinished()) {
                    z3 = false;
                }
                this.f13721O = z3;
                f(2, 0);
            }
        }
        return this.f13721O;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        int i8 = 0;
        this.f13718L = false;
        View view = this.f13720N;
        if (view != null && I(view, this)) {
            S(this.f13720N);
        }
        this.f13720N = null;
        if (!this.f13719M) {
            if (this.f13733d0 != null) {
                scrollTo(getScrollX(), this.f13733d0.f13738E);
                this.f13733d0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i8 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int l4 = l(scrollY, paddingTop, i8);
            if (l4 != scrollY) {
                scrollTo(getScrollX(), l4);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f13719M = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f13723Q && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onNestedFling(@N View view, float f4, float f5, boolean z3) {
        if (!z3) {
            dispatchNestedFling(0.0f, f5, true);
            y((int) f5);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onNestedPreFling(@N View view, float f4, float f5) {
        return dispatchNestedPreFling(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onNestedPreScroll(@N View view, int i4, int i5, @N int[] iArr) {
        v(view, i4, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onNestedScroll(@N View view, int i4, int i5, int i6, int i7) {
        K(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onNestedScrollAccepted(@N View view, @N View view2, int i4) {
        t(view, view2, i4, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i4, int i5, boolean z3, boolean z4) {
        super.scrollTo(i4, i5);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i4, Rect rect) {
        View findNextFocusFromRect;
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i4);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        }
        if (findNextFocusFromRect == null || G(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i4, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f13733d0 = dVar;
        requestLayout();
    }

    @Override // android.view.View
    @N
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f13738E = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        c cVar = this.f13737h0;
        if (cVar != null) {
            cVar.a(this, i4, i5, i6, i7);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && J(findFocus, 0, i7)) {
            findFocus.getDrawingRect(this.f13713G);
            offsetDescendantRectToMyCoords(findFocus, this.f13713G);
            o(m(this.f13713G));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public boolean onStartNestedScroll(@N View view, @N View view2, int i4) {
        return s(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.Y
    public void onStopNestedScroll(@N View view) {
        u(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@N MotionEvent motionEvent) {
        ViewParent parent;
        boolean z3;
        boolean z4;
        E();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f13731b0 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f13731b0);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                L(motionEvent);
                                this.f13717K = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f13728V));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f13717K = (int) motionEvent.getY(actionIndex);
                            this.f13728V = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.f13721O && getChildCount() > 0 && this.f13714H.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            C0823k0.n1(this);
                        }
                        this.f13728V = -1;
                        q();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f13728V);
                    if (findPointerIndex == -1) {
                        Log.e(f13702k0, "Invalid pointerId=" + this.f13728V + " in onTouchEvent");
                    } else {
                        int y3 = (int) motionEvent.getY(findPointerIndex);
                        int i4 = this.f13717K - y3;
                        int P3 = i4 - P(i4, motionEvent.getX(findPointerIndex));
                        if (!this.f13721O && Math.abs(P3) > this.f13725S) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f13721O = true;
                            P3 = P3 > 0 ? P3 - this.f13725S : P3 + this.f13725S;
                        }
                        int i5 = P3;
                        if (this.f13721O) {
                            if (b(0, i5, this.f13730a0, this.f13729W, 0)) {
                                i5 -= this.f13730a0[1];
                                this.f13731b0 += this.f13729W[1];
                            }
                            int i6 = i5;
                            this.f13717K = y3 - this.f13729W[1];
                            int scrollY = getScrollY();
                            int scrollRange = getScrollRange();
                            int overScrollMode = getOverScrollMode();
                            if (overScrollMode != 0 && (overScrollMode != 1 || scrollRange <= 0)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (M(0, i6, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !d(0)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            int scrollY2 = getScrollY() - scrollY;
                            int[] iArr = this.f13730a0;
                            iArr[1] = 0;
                            c(0, scrollY2, 0, i6 - scrollY2, this.f13729W, 0, iArr);
                            int i7 = this.f13717K;
                            int i8 = this.f13729W[1];
                            this.f13717K = i7 - i8;
                            this.f13731b0 += i8;
                            if (z3) {
                                int i9 = i6 - this.f13730a0[1];
                                int i10 = scrollY + i9;
                                if (i10 < 0) {
                                    j.j(this.f13715I, (-i9) / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                                    if (!this.f13716J.isFinished()) {
                                        this.f13716J.onRelease();
                                    }
                                } else if (i10 > scrollRange) {
                                    j.j(this.f13716J, i9 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                                    if (!this.f13715I.isFinished()) {
                                        this.f13715I.onRelease();
                                    }
                                }
                                if (!this.f13715I.isFinished() || !this.f13716J.isFinished()) {
                                    C0823k0.n1(this);
                                }
                            }
                            if (z4) {
                                this.f13722P.clear();
                            }
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker = this.f13722P;
                velocityTracker.computeCurrentVelocity(1000, this.f13727U);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f13728V);
                if (Math.abs(yVelocity) >= this.f13726T) {
                    if (!p(yVelocity)) {
                        int i11 = -yVelocity;
                        float f4 = i11;
                        if (!dispatchNestedPreFling(0.0f, f4)) {
                            dispatchNestedFling(0.0f, f4, true);
                            y(i11);
                        }
                    }
                } else if (this.f13714H.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0823k0.n1(this);
                }
                this.f13728V = -1;
                q();
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f13721O && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f13714H.isFinished()) {
                h();
            }
            this.f13717K = (int) motionEvent.getY();
            this.f13728V = motionEvent.getPointerId(0);
            f(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f13722P;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // androidx.core.view.W
    public void r(@N View view, int i4, int i5, int i6, int i7, int i8) {
        K(i7, i8, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f13718L) {
            S(view2);
        } else {
            this.f13720N = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@N View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return T(rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        if (z3) {
            O();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f13718L = true;
        super.requestLayout();
    }

    @Override // androidx.core.view.W
    public boolean s(@N View view, @N View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int l4 = l(i4, width, width2);
            int l5 = l(i5, height, height2);
            if (l4 != getScrollX() || l5 != getScrollY()) {
                super.scrollTo(l4, l5);
            }
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f13723Q) {
            this.f13723Q = z3;
            requestLayout();
        }
    }

    @Override // android.view.View, androidx.core.view.U
    public void setNestedScrollingEnabled(boolean z3) {
        this.f13735f0.p(z3);
    }

    public void setOnScrollChangeListener(@P c cVar) {
        this.f13737h0 = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f13724R = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean startNestedScroll(int i4) {
        return f(i4, 0);
    }

    @Override // android.view.View, androidx.core.view.U
    public void stopNestedScroll() {
        g(0);
    }

    @Override // androidx.core.view.W
    public void t(@N View view, @N View view2, int i4, int i5) {
        this.f13734e0.c(view, view2, i4, i5);
        f(2, i5);
    }

    @Override // androidx.core.view.W
    public void u(@N View view, int i4) {
        this.f13734e0.e(view, i4);
        g(i4);
    }

    @Override // androidx.core.view.W
    public void v(@N View view, int i4, int i5, @N int[] iArr, int i6) {
        b(i4, i5, iArr, null, i6);
    }

    public boolean w(@N KeyEvent keyEvent) {
        this.f13713G.setEmpty();
        int i4 = 130;
        if (!k()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19) {
            if (keyCode != 20) {
                if (keyCode != 62) {
                    return false;
                }
                if (keyEvent.isShiftPressed()) {
                    i4 = 33;
                }
                N(i4);
                return false;
            }
            if (!keyEvent.isAltPressed()) {
                return i(130);
            }
            return z(130);
        }
        if (!keyEvent.isAltPressed()) {
            return i(33);
        }
        return z(33);
    }

    public void y(int i4) {
        if (getChildCount() > 0) {
            this.f13714H.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            Q(true);
        }
    }

    public boolean z(int i4) {
        boolean z3;
        int childCount;
        if (i4 == 130) {
            z3 = true;
        } else {
            z3 = false;
        }
        int height = getHeight();
        Rect rect = this.f13713G;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f13713G.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f13713G;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f13713G;
        return R(i4, rect3.top, rect3.bottom);
    }

    public NestedScrollView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, C2356a.C0511a.f54855n);
    }

    public NestedScrollView(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f13713G = new Rect();
        this.f13718L = true;
        this.f13719M = false;
        this.f13720N = null;
        this.f13721O = false;
        this.f13724R = true;
        this.f13728V = -1;
        this.f13729W = new int[2];
        this.f13730a0 = new int[2];
        this.f13715I = j.a(context, attributeSet);
        this.f13716J = j.a(context, attributeSet);
        this.f13711E = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        D();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13710s0, i4, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f13734e0 = new Z(this);
        this.f13735f0 = new V(this);
        setNestedScrollingEnabled(true);
        C0823k0.B1(this, f13709r0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4) {
        if (getChildCount() <= 0) {
            super.addView(view, i4);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
