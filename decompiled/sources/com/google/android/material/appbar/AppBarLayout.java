package com.google.android.material.appbar;

import T0.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.D;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.i0;
import androidx.annotation.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.p;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.InterfaceC0772a0;
import androidx.core.view.Y0;
import androidx.core.view.accessibility.M;
import androidx.core.view.accessibility.U;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import e.C2046a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q.C2394a;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: a0, reason: collision with root package name */
    static final int f31231a0 = 0;

    /* renamed from: b0, reason: collision with root package name */
    static final int f31232b0 = 1;

    /* renamed from: c0, reason: collision with root package name */
    static final int f31233c0 = 2;

    /* renamed from: d0, reason: collision with root package name */
    static final int f31234d0 = 4;

    /* renamed from: e0, reason: collision with root package name */
    static final int f31235e0 = 8;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f31236f0 = a.n.ae;

    /* renamed from: g0, reason: collision with root package name */
    private static final int f31237g0 = -1;

    /* renamed from: E, reason: collision with root package name */
    private int f31238E;

    /* renamed from: F, reason: collision with root package name */
    private int f31239F;

    /* renamed from: G, reason: collision with root package name */
    private int f31240G;

    /* renamed from: H, reason: collision with root package name */
    private int f31241H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f31242I;

    /* renamed from: J, reason: collision with root package name */
    private int f31243J;

    /* renamed from: K, reason: collision with root package name */
    @P
    private Y0 f31244K;

    /* renamed from: L, reason: collision with root package name */
    private List<c> f31245L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f31246M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f31247N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f31248O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f31249P;

    /* renamed from: Q, reason: collision with root package name */
    @D
    private int f31250Q;

    /* renamed from: R, reason: collision with root package name */
    @P
    private WeakReference<View> f31251R;

    /* renamed from: S, reason: collision with root package name */
    @P
    private ValueAnimator f31252S;

    /* renamed from: T, reason: collision with root package name */
    private final List<g> f31253T;

    /* renamed from: U, reason: collision with root package name */
    private int[] f31254U;

    /* renamed from: V, reason: collision with root package name */
    @P
    private Drawable f31255V;

    /* renamed from: W, reason: collision with root package name */
    private Behavior f31256W;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.b<T> {

        /* renamed from: s, reason: collision with root package name */
        private static final int f31257s = 600;

        /* renamed from: l, reason: collision with root package name */
        private int f31258l;

        /* renamed from: m, reason: collision with root package name */
        private int f31259m;

        /* renamed from: n, reason: collision with root package name */
        private ValueAnimator f31260n;

        /* renamed from: o, reason: collision with root package name */
        private f f31261o;

        /* renamed from: p, reason: collision with root package name */
        @P
        private WeakReference<View> f31262p;

        /* renamed from: q, reason: collision with root package name */
        private e f31263q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f31264r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f31265a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f31266b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f31265a = coordinatorLayout;
                this.f31266b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
                BaseBehavior.this.X(this.f31265a, this.f31266b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class b extends C0771a {
            b() {
            }

            @Override // androidx.core.view.C0771a
            public void g(View view, @N M m4) {
                super.g(view, m4);
                m4.I1(BaseBehavior.this.f31264r);
                m4.Z0(ScrollView.class.getName());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class c implements U {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f31269a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f31270b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f31271c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f31272d;

            c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4) {
                this.f31269a = coordinatorLayout;
                this.f31270b = appBarLayout;
                this.f31271c = view;
                this.f31272d = i4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.accessibility.U
            public boolean a(@N View view, @P U.a aVar) {
                BaseBehavior.this.r(this.f31269a, this.f31270b, this.f31271c, 0, this.f31272d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class d implements U {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f31274a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f31275b;

            d(AppBarLayout appBarLayout, boolean z3) {
                this.f31274a = appBarLayout;
                this.f31275b = z3;
            }

            @Override // androidx.core.view.accessibility.U
            public boolean a(@N View view, @P U.a aVar) {
                this.f31274a.setExpanded(this.f31275b);
                return true;
            }
        }

        /* loaded from: classes2.dex */
        public static abstract class e<T extends AppBarLayout> {
            public abstract boolean a(@N T t3);
        }

        public BaseBehavior() {
        }

        private boolean F0(@N CoordinatorLayout coordinatorLayout, @N T t3) {
            List<View> y3 = coordinatorLayout.y(t3);
            int size = y3.size();
            for (int i4 = 0; i4 < size; i4++) {
                CoordinatorLayout.c f4 = ((CoordinatorLayout.g) y3.get(i4).getLayoutParams()).f();
                if (f4 instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) f4).S() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        private void G0(CoordinatorLayout coordinatorLayout, @N T t3) {
            int topInset = t3.getTopInset() + t3.getPaddingTop();
            int U3 = U() - topInset;
            int m02 = m0(t3, U3);
            if (m02 >= 0) {
                View childAt = t3.getChildAt(m02);
                f fVar = (f) childAt.getLayoutParams();
                int c4 = fVar.c();
                if ((c4 & 17) == 17) {
                    int i4 = -childAt.getTop();
                    int i5 = -childAt.getBottom();
                    if (m02 == 0 && C0823k0.U(t3) && C0823k0.U(childAt)) {
                        i4 -= t3.getTopInset();
                    }
                    if (i0(c4, 2)) {
                        i5 += C0823k0.e0(childAt);
                    } else if (i0(c4, 5)) {
                        int e02 = C0823k0.e0(childAt) + i5;
                        if (U3 < e02) {
                            i4 = e02;
                        } else {
                            i5 = e02;
                        }
                    }
                    if (i0(c4, 32)) {
                        i4 += ((LinearLayout.LayoutParams) fVar).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) fVar).bottomMargin;
                    }
                    d0(coordinatorLayout, t3, C2394a.e(f0(U3, i5, i4) + topInset, -t3.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void H0(CoordinatorLayout coordinatorLayout, @N T t3) {
            View n02;
            C0823k0.r1(coordinatorLayout, M.a.f13383r.b());
            C0823k0.r1(coordinatorLayout, M.a.f13384s.b());
            if (t3.getTotalScrollRange() == 0 || (n02 = n0(coordinatorLayout)) == null || !j0(t3)) {
                return;
            }
            if (!C0823k0.G0(coordinatorLayout)) {
                C0823k0.B1(coordinatorLayout, new b());
            }
            this.f31264r = b0(coordinatorLayout, t3, n02);
        }

        private void I0(@N CoordinatorLayout coordinatorLayout, @N T t3, int i4, int i5, boolean z3) {
            View l02 = l0(t3, i4);
            boolean z4 = false;
            if (l02 != null) {
                int c4 = ((f) l02.getLayoutParams()).c();
                if ((c4 & 1) != 0) {
                    int e02 = C0823k0.e0(l02);
                    if (i5 <= 0 || (c4 & 12) == 0 ? !((c4 & 2) == 0 || (-i4) < (l02.getBottom() - e02) - t3.getTopInset()) : (-i4) >= (l02.getBottom() - e02) - t3.getTopInset()) {
                        z4 = true;
                    }
                }
            }
            if (t3.p()) {
                z4 = t3.F(k0(coordinatorLayout));
            }
            boolean C3 = t3.C(z4);
            if (z3 || (C3 && F0(coordinatorLayout, t3))) {
                t3.jumpDrawablesToCurrentState();
            }
        }

        private boolean b0(CoordinatorLayout coordinatorLayout, @N T t3, @N View view) {
            boolean z3 = false;
            if (U() != (-t3.getTotalScrollRange())) {
                c0(coordinatorLayout, t3, M.a.f13383r, false);
                z3 = true;
            }
            if (U() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i4 = -t3.getDownNestedPreScrollRange();
                    if (i4 != 0) {
                        C0823k0.u1(coordinatorLayout, M.a.f13384s, null, new c(coordinatorLayout, t3, view, i4));
                        return true;
                    }
                } else {
                    c0(coordinatorLayout, t3, M.a.f13384s, true);
                    return true;
                }
            }
            return z3;
        }

        private void c0(CoordinatorLayout coordinatorLayout, @N T t3, @N M.a aVar, boolean z3) {
            C0823k0.u1(coordinatorLayout, aVar, null, new d(t3, z3));
        }

        private void d0(CoordinatorLayout coordinatorLayout, @N T t3, int i4, float f4) {
            int height;
            int abs = Math.abs(U() - i4);
            float abs2 = Math.abs(f4);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t3.getHeight()) + 1.0f) * 150.0f);
            }
            e0(coordinatorLayout, t3, i4, height);
        }

        private void e0(CoordinatorLayout coordinatorLayout, T t3, int i4, int i5) {
            int U3 = U();
            if (U3 == i4) {
                ValueAnimator valueAnimator = this.f31260n;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f31260n.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f31260n;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f31260n = valueAnimator3;
                valueAnimator3.setInterpolator(com.google.android.material.animation.a.f31211e);
                this.f31260n.addUpdateListener(new a(coordinatorLayout, t3));
            } else {
                valueAnimator2.cancel();
            }
            this.f31260n.setDuration(Math.min(i5, 600));
            this.f31260n.setIntValues(U3, i4);
            this.f31260n.start();
        }

        private int f0(int i4, int i5, int i6) {
            if (i4 >= (i5 + i6) / 2) {
                return i6;
            }
            return i5;
        }

        private boolean h0(@N CoordinatorLayout coordinatorLayout, @N T t3, @N View view) {
            if (t3.n() && coordinatorLayout.getHeight() - view.getHeight() <= t3.getHeight()) {
                return true;
            }
            return false;
        }

        private static boolean i0(int i4, int i5) {
            return (i4 & i5) == i5;
        }

        private boolean j0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (((f) appBarLayout.getChildAt(i4).getLayoutParams()).f31300a != 0) {
                    return true;
                }
            }
            return false;
        }

        @P
        private View k0(@N CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if ((childAt instanceof androidx.core.view.U) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @P
        private static View l0(@N AppBarLayout appBarLayout, int i4) {
            int abs = Math.abs(i4);
            int childCount = appBarLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = appBarLayout.getChildAt(i5);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int m0(@N T t3, int i4) {
            int childCount = t3.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = t3.getChildAt(i5);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                f fVar = (f) childAt.getLayoutParams();
                if (i0(fVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) fVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) fVar).bottomMargin;
                }
                int i6 = -i4;
                if (top <= i6 && bottom >= i6) {
                    return i5;
                }
            }
            return -1;
        }

        @P
        private View n0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if (((CoordinatorLayout.g) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int q0(@N T t3, int i4) {
            int abs = Math.abs(i4);
            int childCount = t3.getChildCount();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    break;
                }
                View childAt = t3.getChildAt(i6);
                f fVar = (f) childAt.getLayoutParams();
                Interpolator d4 = fVar.d();
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    if (d4 != null) {
                        int c4 = fVar.c();
                        if ((c4 & 1) != 0) {
                            i5 = childAt.getHeight() + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                            if ((c4 & 2) != 0) {
                                i5 -= C0823k0.e0(childAt);
                            }
                        }
                        if (C0823k0.U(childAt)) {
                            i5 -= t3.getTopInset();
                        }
                        if (i5 > 0) {
                            float f4 = i5;
                            return Integer.signum(i4) * (childAt.getTop() + Math.round(f4 * d4.getInterpolation((abs - childAt.getTop()) / f4)));
                        }
                    }
                } else {
                    i6++;
                }
            }
            return i4;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public void D(CoordinatorLayout coordinatorLayout, @N T t3, View view, int i4) {
            if (this.f31259m == 0 || i4 == 1) {
                G0(coordinatorLayout, t3);
                if (t3.p()) {
                    t3.C(t3.F(view));
                }
            }
            this.f31262p = new WeakReference<>(view);
        }

        void B0(@P f fVar, boolean z3) {
            if (this.f31261o == null || z3) {
                this.f31261o = fVar;
            }
        }

        @P
        f C0(@P Parcelable parcelable, @N T t3) {
            boolean z3;
            boolean z4;
            int H3 = H();
            int childCount = t3.getChildCount();
            boolean z5 = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = t3.getChildAt(i4);
                int bottom = childAt.getBottom() + H3;
                if (childAt.getTop() + H3 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = androidx.customview.view.a.f13866F;
                    }
                    f fVar = new f(parcelable);
                    if (H3 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    fVar.f31278H = z3;
                    if (!z3 && (-H3) >= t3.getTotalScrollRange()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    fVar.f31277G = z4;
                    fVar.f31279I = i4;
                    if (bottom == C0823k0.e0(childAt) + t3.getTopInset()) {
                        z5 = true;
                    }
                    fVar.f31281K = z5;
                    fVar.f31280J = bottom / childAt.getHeight();
                    return fVar;
                }
            }
            return null;
        }

        public void D0(@P e eVar) {
            this.f31263q = eVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: E0, reason: merged with bridge method [inline-methods] */
        public int Y(@N CoordinatorLayout coordinatorLayout, @N T t3, int i4, int i5, int i6) {
            int i7;
            int U3 = U();
            int i8 = 0;
            if (i5 != 0 && U3 >= i5 && U3 <= i6) {
                int e4 = C2394a.e(i4, i5, i6);
                if (U3 != e4) {
                    if (t3.l()) {
                        i7 = q0(t3, e4);
                    } else {
                        i7 = e4;
                    }
                    boolean N3 = N(i7);
                    int i9 = U3 - e4;
                    this.f31258l = e4 - i7;
                    int i10 = 1;
                    if (N3) {
                        while (i8 < t3.getChildCount()) {
                            f fVar = (f) t3.getChildAt(i8).getLayoutParams();
                            d b4 = fVar.b();
                            if (b4 != null && (fVar.c() & 1) != 0) {
                                b4.a(t3, t3.getChildAt(i8), H());
                            }
                            i8++;
                        }
                    }
                    if (!N3 && t3.l()) {
                        coordinatorLayout.l(t3);
                    }
                    t3.r(H());
                    if (e4 < U3) {
                        i10 = -1;
                    }
                    I0(coordinatorLayout, t3, e4, i10, false);
                    i8 = i9;
                }
            } else {
                this.f31258l = 0;
            }
            H0(coordinatorLayout, t3);
            return i8;
        }

        @Override // com.google.android.material.appbar.b
        int U() {
            return H() + this.f31258l;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public boolean P(T t3) {
            e eVar = this.f31263q;
            if (eVar != null) {
                return eVar.a(t3);
            }
            WeakReference<View> weakReference = this.f31262p;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            if (view != null && view.isShown() && !view.canScrollVertically(-1)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public int S(@N T t3) {
            return -t3.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public int T(@N T t3) {
            return t3.getTotalScrollRange();
        }

        @i0
        boolean r0() {
            ValueAnimator valueAnimator = this.f31260n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void V(@N CoordinatorLayout coordinatorLayout, @N T t3) {
            G0(coordinatorLayout, t3);
            if (t3.p()) {
                t3.C(t3.F(k0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public boolean m(@N CoordinatorLayout coordinatorLayout, @N T t3, int i4) {
            boolean z3;
            int round;
            boolean m4 = super.m(coordinatorLayout, t3, i4);
            int pendingAction = t3.getPendingAction();
            f fVar = this.f31261o;
            if (fVar != null && (pendingAction & 8) == 0) {
                if (fVar.f31277G) {
                    X(coordinatorLayout, t3, -t3.getTotalScrollRange());
                } else if (fVar.f31278H) {
                    X(coordinatorLayout, t3, 0);
                } else {
                    View childAt = t3.getChildAt(fVar.f31279I);
                    int i5 = -childAt.getBottom();
                    if (this.f31261o.f31281K) {
                        round = C0823k0.e0(childAt) + t3.getTopInset();
                    } else {
                        round = Math.round(childAt.getHeight() * this.f31261o.f31280J);
                    }
                    X(coordinatorLayout, t3, i5 + round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i6 = -t3.getUpNestedPreScrollRange();
                    if (z3) {
                        d0(coordinatorLayout, t3, i6, 0.0f);
                    } else {
                        X(coordinatorLayout, t3, i6);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z3) {
                        d0(coordinatorLayout, t3, 0, 0.0f);
                    } else {
                        X(coordinatorLayout, t3, 0);
                    }
                }
            }
            t3.w();
            this.f31261o = null;
            N(C2394a.e(H(), -t3.getTotalScrollRange(), 0));
            I0(coordinatorLayout, t3, H(), 0, true);
            t3.r(H());
            H0(coordinatorLayout, t3);
            return m4;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean n(@N CoordinatorLayout coordinatorLayout, @N T t3, int i4, int i5, int i6, int i7) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) t3.getLayoutParams())).height == -2) {
                coordinatorLayout.Q(t3, i4, i5, View.MeasureSpec.makeMeasureSpec(0, 0), i7);
                return true;
            }
            return super.n(coordinatorLayout, t3, i4, i5, i6, i7);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void r(CoordinatorLayout coordinatorLayout, @N T t3, View view, int i4, int i5, int[] iArr, int i6) {
            int i7;
            int i8;
            if (i5 != 0) {
                if (i5 < 0) {
                    i7 = -t3.getTotalScrollRange();
                    i8 = t3.getDownNestedPreScrollRange() + i7;
                } else {
                    i7 = -t3.getUpNestedPreScrollRange();
                    i8 = 0;
                }
                int i9 = i7;
                int i10 = i8;
                if (i9 != i10) {
                    iArr[1] = W(coordinatorLayout, t3, i5, i9, i10);
                }
            }
            if (t3.p()) {
                t3.C(t3.F(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: w0, reason: merged with bridge method [inline-methods] */
        public void u(CoordinatorLayout coordinatorLayout, @N T t3, View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            if (i7 < 0) {
                iArr[1] = W(coordinatorLayout, t3, i7, -t3.getDownNestedScrollRange(), 0);
            }
            if (i7 == 0) {
                H0(coordinatorLayout, t3);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: x0, reason: merged with bridge method [inline-methods] */
        public void y(@N CoordinatorLayout coordinatorLayout, @N T t3, Parcelable parcelable) {
            if (parcelable instanceof f) {
                B0((f) parcelable, true);
                super.y(coordinatorLayout, t3, this.f31261o.a());
            } else {
                super.y(coordinatorLayout, t3, parcelable);
                this.f31261o = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public Parcelable z(@N CoordinatorLayout coordinatorLayout, @N T t3) {
            Parcelable z3 = super.z(coordinatorLayout, t3);
            f C02 = C0(z3, t3);
            if (C02 != null) {
                return C02;
            }
            return z3;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: z0, reason: merged with bridge method [inline-methods] */
        public boolean B(@N CoordinatorLayout coordinatorLayout, @N T t3, @N View view, View view2, int i4, int i5) {
            boolean z3;
            ValueAnimator valueAnimator;
            if ((i4 & 2) != 0 && (t3.p() || h0(coordinatorLayout, t3, view))) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && (valueAnimator = this.f31260n) != null) {
                valueAnimator.cancel();
            }
            this.f31262p = null;
            this.f31259m = i5;
            return z3;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes2.dex */
        public static class f extends androidx.customview.view.a {
            public static final Parcelable.Creator<f> CREATOR = new a();

            /* renamed from: G, reason: collision with root package name */
            boolean f31277G;

            /* renamed from: H, reason: collision with root package name */
            boolean f31278H;

            /* renamed from: I, reason: collision with root package name */
            int f31279I;

            /* renamed from: J, reason: collision with root package name */
            float f31280J;

            /* renamed from: K, reason: collision with root package name */
            boolean f31281K;

            /* loaded from: classes2.dex */
            class a implements Parcelable.ClassLoaderCreator<f> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                @P
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public f createFromParcel(@N Parcel parcel) {
                    return new f(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                @N
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public f createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                    return new f(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @N
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public f[] newArray(int i4) {
                    return new f[i4];
                }
            }

            public f(@N Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f31277G = parcel.readByte() != 0;
                this.f31278H = parcel.readByte() != 0;
                this.f31279I = parcel.readInt();
                this.f31280J = parcel.readFloat();
                this.f31281K = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.a, android.os.Parcelable
            public void writeToParcel(@N Parcel parcel, int i4) {
                super.writeToParcel(parcel, i4);
                parcel.writeByte(this.f31277G ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f31278H ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f31279I);
                parcel.writeFloat(this.f31280J);
                parcel.writeByte(this.f31281K ? (byte) 1 : (byte) 0);
            }

            public f(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* loaded from: classes2.dex */
        public static abstract class a extends BaseBehavior.e<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: A0 */
        public /* bridge */ /* synthetic */ void D(CoordinatorLayout coordinatorLayout, @N AppBarLayout appBarLayout, View view, int i4) {
            super.D(coordinatorLayout, appBarLayout, view, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void D0(@P BaseBehavior.e eVar) {
            super.D0(eVar);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean E(@N CoordinatorLayout coordinatorLayout, @N View view, @N MotionEvent motionEvent) {
            return super.E(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int G() {
            return super.G();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int H() {
            return super.H();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean I() {
            return super.I();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean J() {
            return super.J();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ void L(boolean z3) {
            super.L(z3);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean M(int i4) {
            return super.M(i4);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean N(int i4) {
            return super.N(i4);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ void O(boolean z3) {
            super.O(z3);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(@N CoordinatorLayout coordinatorLayout, @N View view, @N MotionEvent motionEvent) {
            return super.l(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: t0 */
        public /* bridge */ /* synthetic */ boolean m(@N CoordinatorLayout coordinatorLayout, @N AppBarLayout appBarLayout, int i4) {
            return super.m(coordinatorLayout, appBarLayout, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean n(@N CoordinatorLayout coordinatorLayout, @N AppBarLayout appBarLayout, int i4, int i5, int i6, int i7) {
            return super.n(coordinatorLayout, appBarLayout, i4, i5, i6, i7);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: v0 */
        public /* bridge */ /* synthetic */ void r(CoordinatorLayout coordinatorLayout, @N AppBarLayout appBarLayout, View view, int i4, int i5, int[] iArr, int i6) {
            super.r(coordinatorLayout, appBarLayout, view, i4, i5, iArr, i6);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: w0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, @N AppBarLayout appBarLayout, View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            super.u(coordinatorLayout, appBarLayout, view, i4, i5, i6, i7, i8, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: x0 */
        public /* bridge */ /* synthetic */ void y(@N CoordinatorLayout coordinatorLayout, @N AppBarLayout appBarLayout, Parcelable parcelable) {
            super.y(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: y0 */
        public /* bridge */ /* synthetic */ Parcelable z(@N CoordinatorLayout coordinatorLayout, @N AppBarLayout appBarLayout) {
            return super.z(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: z0 */
        public /* bridge */ /* synthetic */ boolean B(@N CoordinatorLayout coordinatorLayout, @N AppBarLayout appBarLayout, @N View view, View view2, int i4, int i5) {
            return super.B(coordinatorLayout, appBarLayout, view, view2, i4, i5);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends com.google.android.material.appbar.c {
        public ScrollingViewBehavior() {
        }

        private static int Z(@N AppBarLayout appBarLayout) {
            CoordinatorLayout.c f4 = ((CoordinatorLayout.g) appBarLayout.getLayoutParams()).f();
            if (f4 instanceof BaseBehavior) {
                return ((BaseBehavior) f4).U();
            }
            return 0;
        }

        private void a0(@N View view, @N View view2) {
            CoordinatorLayout.c f4 = ((CoordinatorLayout.g) view2.getLayoutParams()).f();
            if (f4 instanceof BaseBehavior) {
                C0823k0.f1(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f4).f31258l) + U()) - Q(view2));
            }
        }

        private void b0(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.p()) {
                    appBarLayout.C(appBarLayout.F(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int G() {
            return super.G();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int H() {
            return super.H();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean I() {
            return super.I();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean J() {
            return super.J();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ void L(boolean z3) {
            super.L(z3);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean M(int i4) {
            return super.M(i4);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean N(int i4) {
            return super.N(i4);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ void O(boolean z3) {
            super.O(z3);
        }

        @Override // com.google.android.material.appbar.c
        float R(View view) {
            int i4;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int Z3 = Z(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + Z3 > downNestedPreScrollRange) && (i4 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (Z3 / i4) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.c
        int T(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.T(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        @P
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public AppBarLayout P(@N List<View> list) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = list.get(i4);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(@N CoordinatorLayout coordinatorLayout, @N View view, @N View view2) {
            a0(view, view2);
            b0(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void j(@N CoordinatorLayout coordinatorLayout, @N View view, @N View view2) {
            if (view2 instanceof AppBarLayout) {
                C0823k0.r1(coordinatorLayout, M.a.f13383r.b());
                C0823k0.r1(coordinatorLayout, M.a.f13384s.b());
                C0823k0.B1(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(@N CoordinatorLayout coordinatorLayout, @N View view, int i4) {
            return super.m(coordinatorLayout, view, i4);
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean n(@N CoordinatorLayout coordinatorLayout, @N View view, int i4, int i5, int i6, int i7) {
            return super.n(coordinatorLayout, view, i4, i5, i6, i7);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean x(@N CoordinatorLayout coordinatorLayout, @N View view, @N Rect rect, boolean z3) {
            AppBarLayout P3 = P(coordinatorLayout.x(view));
            if (P3 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f31363d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    P3.x(false, !z3);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.Fq);
            W(obtainStyledAttributes.getDimensionPixelSize(a.o.Gq, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes2.dex */
    class a implements InterfaceC0772a0 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC0772a0
        public Y0 a(View view, Y0 y02) {
            return AppBarLayout.this.s(y02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f31283a;

        b(j jVar) {
            this.f31283a = jVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f31283a.n0(floatValue);
            if (AppBarLayout.this.f31255V instanceof j) {
                ((j) AppBarLayout.this.f31255V).n0(floatValue);
            }
            Iterator it = AppBarLayout.this.f31253T.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(floatValue, this.f31283a.D());
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c<T extends AppBarLayout> {
        void a(T t3, int i4);
    }

    /* loaded from: classes2.dex */
    public static abstract class d {
        public abstract void a(@N AppBarLayout appBarLayout, @N View view, float f4);
    }

    /* loaded from: classes2.dex */
    public static class e extends d {

        /* renamed from: c, reason: collision with root package name */
        private static final float f31285c = 0.3f;

        /* renamed from: a, reason: collision with root package name */
        private final Rect f31286a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        private final Rect f31287b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.d
        public void a(@N AppBarLayout appBarLayout, @N View view, float f4) {
            b(this.f31286a, appBarLayout, view);
            float abs = this.f31286a.top - Math.abs(f4);
            if (abs <= 0.0f) {
                float d4 = 1.0f - C2394a.d(Math.abs(abs / this.f31286a.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.f31286a.height() * f31285c) * (1.0f - (d4 * d4)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f31287b);
                this.f31287b.offset(0, (int) (-height));
                C0823k0.M1(view, this.f31287b);
                return;
            }
            C0823k0.M1(view, null);
            view.setTranslationY(0.0f);
        }
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(@r float f4, @InterfaceC0569l int i4);
    }

    /* loaded from: classes2.dex */
    public interface h extends c<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.c
        void a(AppBarLayout appBarLayout, int i4);
    }

    public AppBarLayout(@N Context context) {
        this(context, null);
    }

    private boolean A(boolean z3) {
        if (this.f31247N != z3) {
            this.f31247N = z3;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    private boolean E() {
        if (this.f31255V != null && getTopInset() > 0) {
            return true;
        }
        return false;
    }

    private boolean G() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || C0823k0.U(childAt)) {
            return false;
        }
        return true;
    }

    private void H(@N j jVar, boolean z3) {
        float f4;
        float dimension = getResources().getDimension(a.f.f2319P0);
        if (z3) {
            f4 = 0.0f;
        } else {
            f4 = dimension;
        }
        if (!z3) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f31252S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, dimension);
        this.f31252S = ofFloat;
        ofFloat.setDuration(getResources().getInteger(a.i.f2883c));
        this.f31252S.setInterpolator(com.google.android.material.animation.a.f31207a);
        this.f31252S.addUpdateListener(new b(jVar));
        this.f31252S.start();
    }

    private void I() {
        setWillNotDraw(!E());
    }

    private void g() {
        WeakReference<View> weakReference = this.f31251R;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f31251R = null;
    }

    @P
    private View h(@P View view) {
        int i4;
        View view2;
        if (this.f31251R == null && (i4 = this.f31250Q) != -1) {
            if (view != null) {
                view2 = view.findViewById(i4);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f31250Q);
            }
            if (view2 != null) {
                this.f31251R = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f31251R;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private boolean m() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (((f) getChildAt(i4).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void o() {
        BaseBehavior.f fVar;
        Behavior behavior = this.f31256W;
        if (behavior != null && this.f31239F != -1 && this.f31243J == 0) {
            fVar = behavior.C0(androidx.customview.view.a.f13866F, this);
        } else {
            fVar = null;
        }
        this.f31239F = -1;
        this.f31240G = -1;
        this.f31241H = -1;
        if (fVar != null) {
            this.f31256W.B0(fVar, false);
        }
    }

    private void y(boolean z3, boolean z4, boolean z5) {
        int i4;
        int i5;
        if (z3) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        int i6 = 0;
        if (z4) {
            i5 = 4;
        } else {
            i5 = 0;
        }
        int i7 = i4 | i5;
        if (z5) {
            i6 = 8;
        }
        this.f31243J = i7 | i6;
        requestLayout();
    }

    public boolean B(boolean z3) {
        return D(z3, true);
    }

    boolean C(boolean z3) {
        return D(z3, !this.f31246M);
    }

    boolean D(boolean z3, boolean z4) {
        if (z4 && this.f31248O != z3) {
            this.f31248O = z3;
            refreshDrawableState();
            if (this.f31249P && (getBackground() instanceof j)) {
                H((j) getBackground(), z3);
                return true;
            }
            return true;
        }
        return false;
    }

    boolean F(@P View view) {
        View h4 = h(view);
        if (h4 != null) {
            view = h4;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    public void c(@N g gVar) {
        this.f31253T.add(gVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    public void d(@P c cVar) {
        if (this.f31245L == null) {
            this.f31245L = new ArrayList();
        }
        if (cVar != null && !this.f31245L.contains(cVar)) {
            this.f31245L.add(cVar);
        }
    }

    @Override // android.view.View
    public void draw(@N Canvas canvas) {
        super.draw(canvas);
        if (E()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f31238E);
            this.f31255V.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f31255V;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public void e(h hVar) {
        d(hVar);
    }

    public void f() {
        this.f31253T.clear();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @N
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f31256W = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i4;
        int e02;
        int i5 = this.f31240G;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i7 = fVar.f31300a;
            if ((i7 & 5) == 5) {
                int i8 = ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                if ((i7 & 8) != 0) {
                    e02 = C0823k0.e0(childAt);
                } else if ((i7 & 2) != 0) {
                    e02 = measuredHeight - C0823k0.e0(childAt);
                } else {
                    i4 = i8 + measuredHeight;
                    if (childCount == 0 && C0823k0.U(childAt)) {
                        i4 = Math.min(i4, measuredHeight - getTopInset());
                    }
                    i6 += i4;
                }
                i4 = i8 + e02;
                if (childCount == 0) {
                    i4 = Math.min(i4, measuredHeight - getTopInset());
                }
                i6 += i4;
            } else if (i6 > 0) {
                break;
            }
        }
        int max = Math.max(0, i6);
        this.f31240G = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i4 = this.f31241H;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
            int i7 = fVar.f31300a;
            if ((i7 & 1) == 0) {
                break;
            }
            i6 += measuredHeight;
            if ((i7 & 2) != 0) {
                i6 -= C0823k0.e0(childAt);
                break;
            }
            i5++;
        }
        int max = Math.max(0, i6);
        this.f31241H = max;
        return max;
    }

    @D
    public int getLiftOnScrollTargetViewId() {
        return this.f31250Q;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int e02 = C0823k0.e0(this);
        if (e02 == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                e02 = C0823k0.e0(getChildAt(childCount - 1));
            } else {
                e02 = 0;
            }
            if (e02 == 0) {
                return getHeight() / 3;
            }
        }
        return (e02 * 2) + topInset;
    }

    int getPendingAction() {
        return this.f31243J;
    }

    @P
    public Drawable getStatusBarForeground() {
        return this.f31255V;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @i0
    final int getTopInset() {
        Y0 y02 = this.f31244K;
        if (y02 != null) {
            return y02.r();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i4 = this.f31239F;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i7 = fVar.f31300a;
            if ((i7 & 1) == 0) {
                break;
            }
            i6 += measuredHeight + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
            if (i5 == 0 && C0823k0.U(childAt)) {
                i6 -= getTopInset();
            }
            if ((i7 & 2) != 0) {
                i6 -= C0823k0.e0(childAt);
                break;
            }
            i5++;
        }
        int max = Math.max(0, i6);
        this.f31239F = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new f((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    boolean l() {
        return this.f31242I;
    }

    boolean n() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int i5;
        int i6;
        if (this.f31254U == null) {
            this.f31254U = new int[4];
        }
        int[] iArr = this.f31254U;
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + iArr.length);
        boolean z3 = this.f31247N;
        int i7 = a.c.De;
        if (!z3) {
            i7 = -i7;
        }
        iArr[0] = i7;
        if (z3 && this.f31248O) {
            i5 = a.c.Ee;
        } else {
            i5 = -a.c.Ee;
        }
        iArr[1] = i5;
        int i8 = a.c.Be;
        if (!z3) {
            i8 = -i8;
        }
        iArr[2] = i8;
        if (z3 && this.f31248O) {
            i6 = a.c.Ae;
        } else {
            i6 = -a.c.Ae;
        }
        iArr[3] = i6;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        boolean z4 = true;
        if (C0823k0.U(this) && G()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0823k0.f1(getChildAt(childCount), topInset);
            }
        }
        o();
        this.f31242I = false;
        int childCount2 = getChildCount();
        int i8 = 0;
        while (true) {
            if (i8 >= childCount2) {
                break;
            }
            if (((f) getChildAt(i8).getLayoutParams()).d() != null) {
                this.f31242I = true;
                break;
            }
            i8++;
        }
        Drawable drawable = this.f31255V;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f31246M) {
            if (!this.f31249P && !m()) {
                z4 = false;
            }
            A(z4);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i5);
        if (mode != 1073741824 && C0823k0.U(this) && G()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset();
                }
            } else {
                measuredHeight = C2394a.e(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i5));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    public boolean p() {
        return this.f31249P;
    }

    public boolean q() {
        return this.f31248O;
    }

    void r(int i4) {
        this.f31238E = i4;
        if (!willNotDraw()) {
            C0823k0.n1(this);
        }
        List<c> list = this.f31245L;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                c cVar = this.f31245L.get(i5);
                if (cVar != null) {
                    cVar.a(this, i4);
                }
            }
        }
    }

    Y0 s(Y0 y02) {
        Y0 y03;
        if (C0823k0.U(this)) {
            y03 = y02;
        } else {
            y03 = null;
        }
        if (!p.a(this.f31244K, y03)) {
            this.f31244K = y03;
            I();
            requestLayout();
        }
        return y02;
    }

    @Override // android.view.View
    @W(21)
    public void setElevation(float f4) {
        super.setElevation(f4);
        k.d(this, f4);
    }

    public void setExpanded(boolean z3) {
        x(z3, C0823k0.U0(this));
    }

    public void setLiftOnScroll(boolean z3) {
        this.f31249P = z3;
    }

    public void setLiftOnScrollTargetViewId(@D int i4) {
        this.f31250Q = i4;
        g();
    }

    public void setLiftableOverrideEnabled(boolean z3) {
        this.f31246M = z3;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i4) {
        if (i4 == 1) {
            super.setOrientation(i4);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(@P Drawable drawable) {
        boolean z3;
        Drawable drawable2 = this.f31255V;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f31255V = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f31255V.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.d.m(this.f31255V, C0823k0.Z(this));
                Drawable drawable4 = this.f31255V;
                if (getVisibility() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                drawable4.setVisible(z3, false);
                this.f31255V.setCallback(this);
            }
            I();
            C0823k0.n1(this);
        }
    }

    public void setStatusBarForegroundColor(@InterfaceC0569l int i4) {
        setStatusBarForeground(new ColorDrawable(i4));
    }

    public void setStatusBarForegroundResource(@InterfaceC0578v int i4) {
        setStatusBarForeground(C2046a.b(getContext(), i4));
    }

    @Deprecated
    public void setTargetElevation(float f4) {
        com.google.android.material.appbar.f.b(this, f4);
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
        Drawable drawable = this.f31255V;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
    }

    public boolean t(@N g gVar) {
        return this.f31253T.remove(gVar);
    }

    public void u(@P c cVar) {
        List<c> list = this.f31245L;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    public void v(h hVar) {
        u(hVar);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@N Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f31255V) {
            return false;
        }
        return true;
    }

    void w() {
        this.f31243J = 0;
    }

    public void x(boolean z3, boolean z4) {
        y(z3, z4, true);
    }

    public boolean z(boolean z3) {
        this.f31246M = true;
        return A(z3);
    }

    public AppBarLayout(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f1873S);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBarLayout(@androidx.annotation.N android.content.Context r10, @androidx.annotation.P android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.f31236f0
            android.content.Context r10 = d1.C2044a.c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f31239F = r10
            r9.f31240G = r10
            r9.f31241H = r10
            r6 = 0
            r9.f31243J = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f31253T = r0
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L2f
            com.google.android.material.appbar.f.a(r9)
        L2f:
            com.google.android.material.appbar.f.c(r9, r11, r12, r4)
            int[] r2 = T0.a.o.f3575r0
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.w.j(r0, r1, r2, r3, r4, r5)
            int r12 = T0.a.o.f3580s0
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            androidx.core.view.C0823k0.I1(r9, r12)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            boolean r12 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L6a
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12
            com.google.android.material.shape.j r0 = new com.google.android.material.shape.j
            r0.<init>()
            int r12 = r12.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r0.o0(r12)
            r0.Z(r7)
            androidx.core.view.C0823k0.I1(r9, r0)
        L6a:
            int r12 = T0.a.o.f3597w0
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L7b
            int r12 = T0.a.o.f3597w0
            boolean r12 = r11.getBoolean(r12, r6)
            r9.y(r12, r6, r6)
        L7b:
            int r12 = T0.a.o.f3593v0
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L8d
            int r12 = T0.a.o.f3593v0
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.f.b(r9, r12)
        L8d:
            r12 = 26
            if (r8 < r12) goto Lb3
            int r12 = T0.a.o.f3589u0
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto La2
            int r12 = T0.a.o.f3589u0
            boolean r12 = r11.getBoolean(r12, r6)
            com.google.android.material.appbar.a.a(r9, r12)
        La2:
            int r12 = T0.a.o.f3585t0
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto Lb3
            int r12 = T0.a.o.f3585t0
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        Lb3:
            int r12 = T0.a.o.f3601x0
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f31249P = r12
            int r12 = T0.a.o.f3605y0
            int r10 = r11.getResourceId(r12, r10)
            r9.f31250Q = r10
            int r10 = T0.a.o.f3609z0
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            androidx.core.view.C0823k0.a2(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* loaded from: classes2.dex */
    public static class f extends LinearLayout.LayoutParams {

        /* renamed from: d, reason: collision with root package name */
        public static final int f31288d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f31289e = 1;

        /* renamed from: f, reason: collision with root package name */
        public static final int f31290f = 2;

        /* renamed from: g, reason: collision with root package name */
        public static final int f31291g = 4;

        /* renamed from: h, reason: collision with root package name */
        public static final int f31292h = 8;

        /* renamed from: i, reason: collision with root package name */
        public static final int f31293i = 16;

        /* renamed from: j, reason: collision with root package name */
        public static final int f31294j = 32;

        /* renamed from: k, reason: collision with root package name */
        static final int f31295k = 5;

        /* renamed from: l, reason: collision with root package name */
        static final int f31296l = 17;

        /* renamed from: m, reason: collision with root package name */
        static final int f31297m = 10;

        /* renamed from: n, reason: collision with root package name */
        private static final int f31298n = 0;

        /* renamed from: o, reason: collision with root package name */
        private static final int f31299o = 1;

        /* renamed from: a, reason: collision with root package name */
        int f31300a;

        /* renamed from: b, reason: collision with root package name */
        private d f31301b;

        /* renamed from: c, reason: collision with root package name */
        Interpolator f31302c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes2.dex */
        public @interface a {
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f31300a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.f3406F0);
            this.f31300a = obtainStyledAttributes.getInt(a.o.f3414H0, 0);
            f(a(obtainStyledAttributes.getInt(a.o.f3410G0, 0)));
            if (obtainStyledAttributes.hasValue(a.o.f3418I0)) {
                this.f31302c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(a.o.f3418I0, 0));
            }
            obtainStyledAttributes.recycle();
        }

        @P
        private d a(int i4) {
            if (i4 != 1) {
                return null;
            }
            return new e();
        }

        @P
        public d b() {
            return this.f31301b;
        }

        public int c() {
            return this.f31300a;
        }

        public Interpolator d() {
            return this.f31302c;
        }

        boolean e() {
            int i4 = this.f31300a;
            if ((i4 & 1) == 1 && (i4 & 10) != 0) {
                return true;
            }
            return false;
        }

        public void f(@P d dVar) {
            this.f31301b = dVar;
        }

        public void g(int i4) {
            this.f31300a = i4;
        }

        public void h(Interpolator interpolator) {
            this.f31302c = interpolator;
        }

        public f(int i4, int i5) {
            super(i4, i5);
            this.f31300a = 1;
        }

        public f(int i4, int i5, float f4) {
            super(i4, i5, f4);
            this.f31300a = 1;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f31300a = 1;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f31300a = 1;
        }

        @W(19)
        public f(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f31300a = 1;
        }

        @W(19)
        public f(@N f fVar) {
            super((LinearLayout.LayoutParams) fVar);
            this.f31300a = 1;
            this.f31300a = fVar.f31300a;
            this.f31302c = fVar.f31302c;
        }
    }
}
