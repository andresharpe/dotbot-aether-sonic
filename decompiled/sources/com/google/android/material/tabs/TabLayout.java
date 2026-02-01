package com.google.android.material.tabs;

import T0.a;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.I;
import androidx.annotation.InterfaceC0565h;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.c0;
import androidx.annotation.r;
import androidx.appcompat.widget.k0;
import androidx.core.util.t;
import androidx.core.view.C;
import androidx.core.view.C0805e0;
import androidx.core.view.C0823k0;
import androidx.core.view.H;
import androidx.core.view.accessibility.M;
import androidx.viewpager.widget.d;
import com.google.android.material.internal.E;
import e.C2046a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@d.e
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: A0, reason: collision with root package name */
    @r(unit = 0)
    static final int f33455A0 = 8;

    /* renamed from: B0, reason: collision with root package name */
    @r(unit = 0)
    private static final int f33456B0 = 48;

    /* renamed from: C0, reason: collision with root package name */
    @r(unit = 0)
    private static final int f33457C0 = 56;

    /* renamed from: D0, reason: collision with root package name */
    @r(unit = 0)
    static final int f33458D0 = 16;

    /* renamed from: E0, reason: collision with root package name */
    private static final int f33459E0 = -1;

    /* renamed from: F0, reason: collision with root package name */
    private static final int f33460F0 = 300;

    /* renamed from: H0, reason: collision with root package name */
    private static final String f33462H0 = "TabLayout";

    /* renamed from: I0, reason: collision with root package name */
    public static final int f33463I0 = 0;

    /* renamed from: J0, reason: collision with root package name */
    public static final int f33464J0 = 1;

    /* renamed from: K0, reason: collision with root package name */
    public static final int f33465K0 = 2;

    /* renamed from: L0, reason: collision with root package name */
    public static final int f33466L0 = 0;

    /* renamed from: M0, reason: collision with root package name */
    public static final int f33467M0 = 1;

    /* renamed from: N0, reason: collision with root package name */
    public static final int f33468N0 = 0;

    /* renamed from: O0, reason: collision with root package name */
    public static final int f33469O0 = 1;

    /* renamed from: P0, reason: collision with root package name */
    public static final int f33470P0 = 2;

    /* renamed from: Q0, reason: collision with root package name */
    public static final int f33471Q0 = 0;

    /* renamed from: R0, reason: collision with root package name */
    public static final int f33472R0 = 1;

    /* renamed from: S0, reason: collision with root package name */
    public static final int f33473S0 = 2;

    /* renamed from: T0, reason: collision with root package name */
    public static final int f33474T0 = 3;

    /* renamed from: U0, reason: collision with root package name */
    public static final int f33475U0 = 0;

    /* renamed from: V0, reason: collision with root package name */
    public static final int f33476V0 = 1;

    /* renamed from: W0, reason: collision with root package name */
    public static final int f33477W0 = 2;

    /* renamed from: z0, reason: collision with root package name */
    @r(unit = 0)
    private static final int f33479z0 = 72;

    /* renamed from: E, reason: collision with root package name */
    private final ArrayList<i> f33480E;

    /* renamed from: F, reason: collision with root package name */
    @P
    private i f33481F;

    /* renamed from: G, reason: collision with root package name */
    @N
    final h f33482G;

    /* renamed from: H, reason: collision with root package name */
    int f33483H;

    /* renamed from: I, reason: collision with root package name */
    int f33484I;

    /* renamed from: J, reason: collision with root package name */
    int f33485J;

    /* renamed from: K, reason: collision with root package name */
    int f33486K;

    /* renamed from: L, reason: collision with root package name */
    int f33487L;

    /* renamed from: M, reason: collision with root package name */
    ColorStateList f33488M;

    /* renamed from: N, reason: collision with root package name */
    ColorStateList f33489N;

    /* renamed from: O, reason: collision with root package name */
    ColorStateList f33490O;

    /* renamed from: P, reason: collision with root package name */
    @N
    Drawable f33491P;

    /* renamed from: Q, reason: collision with root package name */
    private int f33492Q;

    /* renamed from: R, reason: collision with root package name */
    PorterDuff.Mode f33493R;

    /* renamed from: S, reason: collision with root package name */
    float f33494S;

    /* renamed from: T, reason: collision with root package name */
    float f33495T;

    /* renamed from: U, reason: collision with root package name */
    final int f33496U;

    /* renamed from: V, reason: collision with root package name */
    int f33497V;

    /* renamed from: W, reason: collision with root package name */
    private final int f33498W;

    /* renamed from: a0, reason: collision with root package name */
    private final int f33499a0;

    /* renamed from: b0, reason: collision with root package name */
    private final int f33500b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f33501c0;

    /* renamed from: d0, reason: collision with root package name */
    int f33502d0;

    /* renamed from: e0, reason: collision with root package name */
    int f33503e0;

    /* renamed from: f0, reason: collision with root package name */
    int f33504f0;

    /* renamed from: g0, reason: collision with root package name */
    int f33505g0;

    /* renamed from: h0, reason: collision with root package name */
    boolean f33506h0;

    /* renamed from: i0, reason: collision with root package name */
    boolean f33507i0;

    /* renamed from: j0, reason: collision with root package name */
    int f33508j0;

    /* renamed from: k0, reason: collision with root package name */
    int f33509k0;

    /* renamed from: l0, reason: collision with root package name */
    boolean f33510l0;

    /* renamed from: m0, reason: collision with root package name */
    private com.google.android.material.tabs.c f33511m0;

    /* renamed from: n0, reason: collision with root package name */
    @P
    private c f33512n0;

    /* renamed from: o0, reason: collision with root package name */
    private final ArrayList<c> f33513o0;

    /* renamed from: p0, reason: collision with root package name */
    @P
    private c f33514p0;

    /* renamed from: q0, reason: collision with root package name */
    private ValueAnimator f33515q0;

    /* renamed from: r0, reason: collision with root package name */
    @P
    androidx.viewpager.widget.d f33516r0;

    /* renamed from: s0, reason: collision with root package name */
    @P
    private androidx.viewpager.widget.a f33517s0;

    /* renamed from: t0, reason: collision with root package name */
    private DataSetObserver f33518t0;

    /* renamed from: u0, reason: collision with root package name */
    private m f33519u0;

    /* renamed from: v0, reason: collision with root package name */
    private b f33520v0;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f33521w0;

    /* renamed from: x0, reason: collision with root package name */
    private final t.a<n> f33522x0;

    /* renamed from: y0, reason: collision with root package name */
    private static final int f33478y0 = a.n.ie;

    /* renamed from: G0, reason: collision with root package name */
    private static final t.a<i> f33461G0 = new t.c(16);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b implements d.i {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33524a;

        b() {
        }

        void a(boolean z3) {
            this.f33524a = z3;
        }

        @Override // androidx.viewpager.widget.d.i
        public void b(@N androidx.viewpager.widget.d dVar, @P androidx.viewpager.widget.a aVar, @P androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f33516r0 == dVar) {
                tabLayout.P(aVar2, this.f33524a);
            }
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface c<T extends i> {
        void a(T t3);

        void b(T t3);

        void c(T t3);
    }

    /* loaded from: classes2.dex */
    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface e {
    }

    /* loaded from: classes2.dex */
    public interface f extends c<i> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class g extends DataSetObserver {
        g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.F();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h extends LinearLayout {

        /* renamed from: E, reason: collision with root package name */
        ValueAnimator f33527E;

        /* renamed from: F, reason: collision with root package name */
        int f33528F;

        /* renamed from: G, reason: collision with root package name */
        float f33529G;

        /* renamed from: H, reason: collision with root package name */
        private int f33530H;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f33532a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f33533b;

            a(View view, View view2) {
                this.f33532a = view;
                this.f33533b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
                h.this.i(this.f33532a, this.f33533b, valueAnimator.getAnimatedFraction());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f33535a;

            b(int i4) {
                this.f33535a = i4;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                h.this.f33528F = this.f33535a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                h.this.f33528F = this.f33535a;
            }
        }

        h(Context context) {
            super(context);
            this.f33528F = -1;
            this.f33530H = -1;
            setWillNotDraw(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            View childAt = getChildAt(this.f33528F);
            com.google.android.material.tabs.c cVar = TabLayout.this.f33511m0;
            TabLayout tabLayout = TabLayout.this;
            cVar.c(tabLayout, childAt, tabLayout.f33491P);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(View view, View view2, float f4) {
            if (view != null && view.getWidth() > 0) {
                com.google.android.material.tabs.c cVar = TabLayout.this.f33511m0;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f4, tabLayout.f33491P);
            } else {
                Drawable drawable = TabLayout.this.f33491P;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f33491P.getBounds().bottom);
            }
            C0823k0.n1(this);
        }

        private void j(boolean z3, int i4, int i5) {
            View childAt = getChildAt(this.f33528F);
            View childAt2 = getChildAt(i4);
            if (childAt2 == null) {
                f();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (z3) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f33527E = valueAnimator;
                valueAnimator.setInterpolator(com.google.android.material.animation.a.f31208b);
                valueAnimator.setDuration(i5);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new b(i4));
                valueAnimator.start();
                return;
            }
            this.f33527E.removeAllUpdateListeners();
            this.f33527E.addUpdateListener(aVar);
        }

        void c(int i4, int i5) {
            ValueAnimator valueAnimator = this.f33527E;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f33527E.cancel();
            }
            j(true, i4, i5);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(@N Canvas canvas) {
            int height;
            int height2 = TabLayout.this.f33491P.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.f33491P.getIntrinsicHeight();
            }
            int i4 = TabLayout.this.f33504f0;
            if (i4 != 0) {
                if (i4 != 1) {
                    height = 0;
                    if (i4 != 2) {
                        if (i4 != 3) {
                            height2 = 0;
                        } else {
                            height2 = getHeight();
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
            } else {
                height = getHeight() - height2;
                height2 = getHeight();
            }
            if (TabLayout.this.f33491P.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f33491P.getBounds();
                TabLayout.this.f33491P.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f33491P;
                if (tabLayout.f33492Q != 0) {
                    drawable = androidx.core.graphics.drawable.d.r(drawable);
                    androidx.core.graphics.drawable.d.n(drawable, TabLayout.this.f33492Q);
                } else {
                    androidx.core.graphics.drawable.d.o(drawable, null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        float e() {
            return this.f33528F + this.f33529G;
        }

        void g(int i4, float f4) {
            ValueAnimator valueAnimator = this.f33527E;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f33527E.cancel();
            }
            this.f33528F = i4;
            this.f33529G = f4;
            i(getChildAt(i4), getChildAt(this.f33528F + 1), this.f33529G);
        }

        void h(int i4) {
            Rect bounds = TabLayout.this.f33491P.getBounds();
            TabLayout.this.f33491P.setBounds(bounds.left, 0, bounds.right, i4);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
            super.onLayout(z3, i4, i5, i6, i7);
            ValueAnimator valueAnimator = this.f33527E;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                j(false, this.f33528F, -1);
            } else {
                f();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i4, int i5) {
            super.onMeasure(i4, i5);
            if (View.MeasureSpec.getMode(i4) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f33502d0 == 1 || tabLayout.f33505g0 == 2) {
                int childCount = getChildCount();
                int i6 = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() == 0) {
                        i6 = Math.max(i6, childAt.getMeasuredWidth());
                    }
                }
                if (i6 <= 0) {
                    return;
                }
                if (i6 * childCount <= getMeasuredWidth() - (((int) E.e(getContext(), 16)) * 2)) {
                    boolean z3 = false;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i8).getLayoutParams();
                        if (layoutParams.width != i6 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i6;
                            layoutParams.weight = 0.0f;
                            z3 = true;
                        }
                    }
                    if (!z3) {
                        return;
                    }
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f33502d0 = 0;
                    tabLayout2.X(false);
                }
                super.onMeasure(i4, i5);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i4) {
            super.onRtlPropertiesChanged(i4);
        }
    }

    /* loaded from: classes2.dex */
    public static class i {

        /* renamed from: k, reason: collision with root package name */
        public static final int f33537k = -1;

        /* renamed from: a, reason: collision with root package name */
        @P
        private Object f33538a;

        /* renamed from: b, reason: collision with root package name */
        @P
        private Drawable f33539b;

        /* renamed from: c, reason: collision with root package name */
        @P
        private CharSequence f33540c;

        /* renamed from: d, reason: collision with root package name */
        @P
        private CharSequence f33541d;

        /* renamed from: f, reason: collision with root package name */
        @P
        private View f33543f;

        /* renamed from: h, reason: collision with root package name */
        @P
        public TabLayout f33545h;

        /* renamed from: i, reason: collision with root package name */
        @N
        public n f33546i;

        /* renamed from: e, reason: collision with root package name */
        private int f33542e = -1;

        /* renamed from: g, reason: collision with root package name */
        @d
        private int f33544g = 1;

        /* renamed from: j, reason: collision with root package name */
        private int f33547j = -1;

        @N
        public i A(@d int i4) {
            this.f33544g = i4;
            TabLayout tabLayout = this.f33545h;
            if (tabLayout.f33502d0 == 1 || tabLayout.f33505g0 == 2) {
                tabLayout.X(true);
            }
            E();
            if (com.google.android.material.badge.d.f31429a && this.f33546i.o() && this.f33546i.f33555I.isVisible()) {
                this.f33546i.invalidate();
            }
            return this;
        }

        @N
        public i B(@P Object obj) {
            this.f33538a = obj;
            return this;
        }

        @N
        public i C(@c0 int i4) {
            TabLayout tabLayout = this.f33545h;
            if (tabLayout != null) {
                return D(tabLayout.getResources().getText(i4));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @N
        public i D(@P CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f33541d) && !TextUtils.isEmpty(charSequence)) {
                this.f33546i.setContentDescription(charSequence);
            }
            this.f33540c = charSequence;
            E();
            return this;
        }

        void E() {
            n nVar = this.f33546i;
            if (nVar != null) {
                nVar.x();
            }
        }

        @P
        public com.google.android.material.badge.a e() {
            return this.f33546i.getBadge();
        }

        @P
        public CharSequence f() {
            n nVar = this.f33546i;
            if (nVar == null) {
                return null;
            }
            return nVar.getContentDescription();
        }

        @P
        public View g() {
            return this.f33543f;
        }

        @P
        public Drawable h() {
            return this.f33539b;
        }

        public int i() {
            return this.f33547j;
        }

        @N
        public com.google.android.material.badge.a j() {
            return this.f33546i.getOrCreateBadge();
        }

        public int k() {
            return this.f33542e;
        }

        @d
        public int l() {
            return this.f33544g;
        }

        @P
        public Object m() {
            return this.f33538a;
        }

        @P
        public CharSequence n() {
            return this.f33540c;
        }

        public boolean o() {
            TabLayout tabLayout = this.f33545h;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == this.f33542e) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void p() {
            this.f33546i.r();
        }

        void q() {
            this.f33545h = null;
            this.f33546i = null;
            this.f33538a = null;
            this.f33539b = null;
            this.f33547j = -1;
            this.f33540c = null;
            this.f33541d = null;
            this.f33542e = -1;
            this.f33543f = null;
        }

        public void r() {
            TabLayout tabLayout = this.f33545h;
            if (tabLayout != null) {
                tabLayout.N(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @N
        public i s(@c0 int i4) {
            TabLayout tabLayout = this.f33545h;
            if (tabLayout != null) {
                return t(tabLayout.getResources().getText(i4));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @N
        public i t(@P CharSequence charSequence) {
            this.f33541d = charSequence;
            E();
            return this;
        }

        @N
        public i u(@I int i4) {
            return v(LayoutInflater.from(this.f33546i.getContext()).inflate(i4, (ViewGroup) this.f33546i, false));
        }

        @N
        public i v(@P View view) {
            this.f33543f = view;
            E();
            return this;
        }

        @N
        public i w(@InterfaceC0578v int i4) {
            TabLayout tabLayout = this.f33545h;
            if (tabLayout != null) {
                return x(C2046a.b(tabLayout.getContext(), i4));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @N
        public i x(@P Drawable drawable) {
            this.f33539b = drawable;
            TabLayout tabLayout = this.f33545h;
            if (tabLayout.f33502d0 == 1 || tabLayout.f33505g0 == 2) {
                tabLayout.X(true);
            }
            E();
            if (com.google.android.material.badge.d.f31429a && this.f33546i.o() && this.f33546i.f33555I.isVisible()) {
                this.f33546i.invalidate();
            }
            return this;
        }

        @N
        public i y(int i4) {
            this.f33547j = i4;
            n nVar = this.f33546i;
            if (nVar != null) {
                nVar.setId(i4);
            }
            return this;
        }

        void z(int i4) {
            this.f33542e = i4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface j {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface l {
    }

    /* loaded from: classes2.dex */
    public static class m implements d.j {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final WeakReference<TabLayout> f33548a;

        /* renamed from: b, reason: collision with root package name */
        private int f33549b;

        /* renamed from: c, reason: collision with root package name */
        private int f33550c;

        public m(TabLayout tabLayout) {
            this.f33548a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.d.j
        public void a(int i4, float f4, int i5) {
            boolean z3;
            TabLayout tabLayout = this.f33548a.get();
            if (tabLayout != null) {
                int i6 = this.f33550c;
                boolean z4 = false;
                if (i6 == 2 && this.f33549b != 1) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (i6 != 2 || this.f33549b != 0) {
                    z4 = true;
                }
                tabLayout.R(i4, f4, z3, z4);
            }
        }

        void b() {
            this.f33550c = 0;
            this.f33549b = 0;
        }

        @Override // androidx.viewpager.widget.d.j
        public void c(int i4) {
            this.f33549b = this.f33550c;
            this.f33550c = i4;
        }

        @Override // androidx.viewpager.widget.d.j
        public void d(int i4) {
            boolean z3;
            TabLayout tabLayout = this.f33548a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i4 && i4 < tabLayout.getTabCount()) {
                int i5 = this.f33550c;
                if (i5 != 0 && (i5 != 2 || this.f33549b != 0)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                tabLayout.O(tabLayout.z(i4), z3);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class n extends LinearLayout {

        /* renamed from: E, reason: collision with root package name */
        private i f33551E;

        /* renamed from: F, reason: collision with root package name */
        private TextView f33552F;

        /* renamed from: G, reason: collision with root package name */
        private ImageView f33553G;

        /* renamed from: H, reason: collision with root package name */
        @P
        private View f33554H;

        /* renamed from: I, reason: collision with root package name */
        @P
        private com.google.android.material.badge.a f33555I;

        /* renamed from: J, reason: collision with root package name */
        @P
        private View f33556J;

        /* renamed from: K, reason: collision with root package name */
        @P
        private TextView f33557K;

        /* renamed from: L, reason: collision with root package name */
        @P
        private ImageView f33558L;

        /* renamed from: M, reason: collision with root package name */
        @P
        private Drawable f33559M;

        /* renamed from: N, reason: collision with root package name */
        private int f33560N;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements View.OnLayoutChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f33562a;

            a(View view) {
                this.f33562a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                if (this.f33562a.getVisibility() == 0) {
                    n.this.w(this.f33562a);
                }
            }
        }

        public n(@N Context context) {
            super(context);
            this.f33560N = 2;
            y(context);
            C0823k0.d2(this, TabLayout.this.f33483H, TabLayout.this.f33484I, TabLayout.this.f33485J, TabLayout.this.f33486K);
            setGravity(17);
            setOrientation(!TabLayout.this.f33506h0 ? 1 : 0);
            setClickable(true);
            C0823k0.g2(this, C0805e0.c(getContext(), 1002));
        }

        private void A(@P TextView textView, @P ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            int i4;
            i iVar = this.f33551E;
            CharSequence charSequence2 = null;
            if (iVar != null && iVar.h() != null) {
                drawable = androidx.core.graphics.drawable.d.r(this.f33551E.h()).mutate();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                androidx.core.graphics.drawable.d.o(drawable, TabLayout.this.f33489N);
                PorterDuff.Mode mode = TabLayout.this.f33493R;
                if (mode != null) {
                    androidx.core.graphics.drawable.d.p(drawable, mode);
                }
            }
            i iVar2 = this.f33551E;
            if (iVar2 != null) {
                charSequence = iVar2.n();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z3 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z3) {
                    textView.setText(charSequence);
                    if (this.f33551E.f33544g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z3 && imageView.getVisibility() == 0) {
                    i4 = (int) E.e(getContext(), 8);
                } else {
                    i4 = 0;
                }
                if (TabLayout.this.f33506h0) {
                    if (i4 != H.b(marginLayoutParams)) {
                        H.g(marginLayoutParams, i4);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i4 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i4;
                    H.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            i iVar3 = this.f33551E;
            if (iVar3 != null) {
                charSequence2 = iVar3.f33541d;
            }
            if (!z3) {
                charSequence = charSequence2;
            }
            k0.a(this, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @P
        public com.google.android.material.badge.a getBadge() {
            return this.f33555I;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @N
        public com.google.android.material.badge.a getOrCreateBadge() {
            if (this.f33555I == null) {
                this.f33555I = com.google.android.material.badge.a.d(getContext());
            }
            v();
            com.google.android.material.badge.a aVar = this.f33555I;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private void i(@P View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float j(@N Layout layout, int i4, float f4) {
            return layout.getLineWidth(i4) * (f4 / layout.getPaint().getTextSize());
        }

        private void k(boolean z3) {
            setClipChildren(z3);
            setClipToPadding(z3);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z3);
                viewGroup.setClipToPadding(z3);
            }
        }

        @N
        private FrameLayout l() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(@N Canvas canvas) {
            Drawable drawable = this.f33559M;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f33559M.draw(canvas);
            }
        }

        @P
        private FrameLayout n(@N View view) {
            if ((view != this.f33553G && view != this.f33552F) || !com.google.android.material.badge.d.f31429a) {
                return null;
            }
            return (FrameLayout) view.getParent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o() {
            if (this.f33555I != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void p() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.d.f31429a) {
                frameLayout = l();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(a.k.f2932H, (ViewGroup) frameLayout, false);
            this.f33553G = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void q() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.d.f31429a) {
                frameLayout = l();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(a.k.f2934I, (ViewGroup) frameLayout, false);
            this.f33552F = textView;
            frameLayout.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r() {
            if (this.f33554H != null) {
                u();
            }
            this.f33555I = null;
        }

        private void t(@P View view) {
            if (o() && view != null) {
                k(false);
                com.google.android.material.badge.d.d(this.f33555I, view, n(view));
                this.f33554H = view;
            }
        }

        private void u() {
            if (!o()) {
                return;
            }
            k(true);
            View view = this.f33554H;
            if (view != null) {
                com.google.android.material.badge.d.j(this.f33555I, view);
                this.f33554H = null;
            }
        }

        private void v() {
            i iVar;
            i iVar2;
            if (!o()) {
                return;
            }
            if (this.f33556J != null) {
                u();
                return;
            }
            if (this.f33553G != null && (iVar2 = this.f33551E) != null && iVar2.h() != null) {
                View view = this.f33554H;
                ImageView imageView = this.f33553G;
                if (view != imageView) {
                    u();
                    t(this.f33553G);
                    return;
                } else {
                    w(imageView);
                    return;
                }
            }
            if (this.f33552F != null && (iVar = this.f33551E) != null && iVar.l() == 1) {
                View view2 = this.f33554H;
                TextView textView = this.f33552F;
                if (view2 != textView) {
                    u();
                    t(this.f33552F);
                    return;
                } else {
                    w(textView);
                    return;
                }
            }
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(@N View view) {
            if (o() && view == this.f33554H) {
                com.google.android.material.badge.d.m(this.f33555I, view, n(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void y(Context context) {
            int i4 = TabLayout.this.f33496U;
            GradientDrawable gradientDrawable = null;
            if (i4 != 0) {
                Drawable b4 = C2046a.b(context, i4);
                this.f33559M = b4;
                if (b4 != null && b4.isStateful()) {
                    this.f33559M.setState(getDrawableState());
                }
            } else {
                this.f33559M = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.f33490O != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList a4 = com.google.android.material.ripple.b.a(TabLayout.this.f33490O);
                boolean z3 = TabLayout.this.f33510l0;
                if (z3) {
                    gradientDrawable2 = null;
                }
                if (!z3) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(a4, gradientDrawable2, gradientDrawable);
            }
            C0823k0.I1(this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f33559M;
            if (drawable != null && drawable.isStateful() && this.f33559M.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr = {this.f33552F, this.f33553G, this.f33556J};
            int i4 = 0;
            int i5 = 0;
            boolean z3 = false;
            for (int i6 = 0; i6 < 3; i6++) {
                View view = viewArr[i6];
                if (view != null && view.getVisibility() == 0) {
                    if (z3) {
                        i5 = Math.min(i5, view.getTop());
                    } else {
                        i5 = view.getTop();
                    }
                    if (z3) {
                        i4 = Math.max(i4, view.getBottom());
                    } else {
                        i4 = view.getBottom();
                    }
                    z3 = true;
                }
            }
            return i4 - i5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr = {this.f33552F, this.f33553G, this.f33556J};
            int i4 = 0;
            int i5 = 0;
            boolean z3 = false;
            for (int i6 = 0; i6 < 3; i6++) {
                View view = viewArr[i6];
                if (view != null && view.getVisibility() == 0) {
                    if (z3) {
                        i5 = Math.min(i5, view.getLeft());
                    } else {
                        i5 = view.getLeft();
                    }
                    if (z3) {
                        i4 = Math.max(i4, view.getRight());
                    } else {
                        i4 = view.getRight();
                    }
                    z3 = true;
                }
            }
            return i4 - i5;
        }

        @P
        public i getTab() {
            return this.f33551E;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            com.google.android.material.badge.a aVar = this.f33555I;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f33555I.o()));
            }
            M c22 = M.c2(accessibilityNodeInfo);
            c22.c1(M.d.h(0, 1, this.f33551E.k(), 1, false, isSelected()));
            if (isSelected()) {
                c22.a1(false);
                c22.N0(M.a.f13375j);
            }
            c22.G1(getResources().getString(a.m.f3067P));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i4, int i5) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i4);
            int mode = View.MeasureSpec.getMode(i4);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i4 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f33497V, Integer.MIN_VALUE);
            }
            super.onMeasure(i4, i5);
            if (this.f33552F != null) {
                float f4 = TabLayout.this.f33494S;
                int i6 = this.f33560N;
                ImageView imageView = this.f33553G;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i6 = 1;
                } else {
                    TextView textView = this.f33552F;
                    if (textView != null && textView.getLineCount() > 1) {
                        f4 = TabLayout.this.f33495T;
                    }
                }
                float textSize = this.f33552F.getTextSize();
                int lineCount = this.f33552F.getLineCount();
                int k4 = androidx.core.widget.r.k(this.f33552F);
                if (f4 != textSize || (k4 >= 0 && i6 != k4)) {
                    if (TabLayout.this.f33505g0 != 1 || f4 <= textSize || lineCount != 1 || ((layout = this.f33552F.getLayout()) != null && j(layout, 0, f4) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f33552F.setTextSize(0, f4);
                        this.f33552F.setMaxLines(i6);
                        super.onMeasure(i4, i5);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f33551E != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.f33551E.r();
                return true;
            }
            return performClick;
        }

        void s() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z3) {
            isSelected();
            super.setSelected(z3);
            TextView textView = this.f33552F;
            if (textView != null) {
                textView.setSelected(z3);
            }
            ImageView imageView = this.f33553G;
            if (imageView != null) {
                imageView.setSelected(z3);
            }
            View view = this.f33556J;
            if (view != null) {
                view.setSelected(z3);
            }
        }

        void setTab(@P i iVar) {
            if (iVar != this.f33551E) {
                this.f33551E = iVar;
                x();
            }
        }

        final void x() {
            View view;
            boolean z3;
            i iVar = this.f33551E;
            if (iVar != null) {
                view = iVar.g();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f33556J = view;
                TextView textView = this.f33552F;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f33553G;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f33553G.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.f33557K = textView2;
                if (textView2 != null) {
                    this.f33560N = androidx.core.widget.r.k(textView2);
                }
                this.f33558L = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view2 = this.f33556J;
                if (view2 != null) {
                    removeView(view2);
                    this.f33556J = null;
                }
                this.f33557K = null;
                this.f33558L = null;
            }
            if (this.f33556J == null) {
                if (this.f33553G == null) {
                    p();
                }
                if (this.f33552F == null) {
                    q();
                    this.f33560N = androidx.core.widget.r.k(this.f33552F);
                }
                androidx.core.widget.r.E(this.f33552F, TabLayout.this.f33487L);
                ColorStateList colorStateList = TabLayout.this.f33488M;
                if (colorStateList != null) {
                    this.f33552F.setTextColor(colorStateList);
                }
                A(this.f33552F, this.f33553G);
                v();
                i(this.f33553G);
                i(this.f33552F);
            } else {
                TextView textView3 = this.f33557K;
                if (textView3 != null || this.f33558L != null) {
                    A(textView3, this.f33558L);
                }
            }
            if (iVar != null && !TextUtils.isEmpty(iVar.f33541d)) {
                setContentDescription(iVar.f33541d);
            }
            if (iVar != null && iVar.o()) {
                z3 = true;
            } else {
                z3 = false;
            }
            setSelected(z3);
        }

        final void z() {
            setOrientation(!TabLayout.this.f33506h0 ? 1 : 0);
            TextView textView = this.f33557K;
            if (textView == null && this.f33558L == null) {
                A(this.f33552F, this.f33553G);
            } else {
                A(textView, this.f33558L);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class o implements f {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.viewpager.widget.d f33564a;

        public o(androidx.viewpager.widget.d dVar) {
            this.f33564a = dVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@N i iVar) {
            this.f33564a.setCurrentItem(iVar.k());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(i iVar) {
        }
    }

    public TabLayout(@N Context context) {
        this(context, null);
    }

    private boolean C() {
        if (getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return true;
    }

    private void M(int i4) {
        n nVar = (n) this.f33482G.getChildAt(i4);
        this.f33482G.removeViewAt(i4);
        if (nVar != null) {
            nVar.s();
            this.f33522x0.a(nVar);
        }
        requestLayout();
    }

    private void U(@P androidx.viewpager.widget.d dVar, boolean z3, boolean z4) {
        androidx.viewpager.widget.d dVar2 = this.f33516r0;
        if (dVar2 != null) {
            m mVar = this.f33519u0;
            if (mVar != null) {
                dVar2.O(mVar);
            }
            b bVar = this.f33520v0;
            if (bVar != null) {
                this.f33516r0.N(bVar);
            }
        }
        c cVar = this.f33514p0;
        if (cVar != null) {
            I(cVar);
            this.f33514p0 = null;
        }
        if (dVar != null) {
            this.f33516r0 = dVar;
            if (this.f33519u0 == null) {
                this.f33519u0 = new m(this);
            }
            this.f33519u0.b();
            dVar.c(this.f33519u0);
            o oVar = new o(dVar);
            this.f33514p0 = oVar;
            c(oVar);
            androidx.viewpager.widget.a adapter = dVar.getAdapter();
            if (adapter != null) {
                P(adapter, z3);
            }
            if (this.f33520v0 == null) {
                this.f33520v0 = new b();
            }
            this.f33520v0.a(z3);
            dVar.b(this.f33520v0);
            Q(dVar.getCurrentItem(), 0.0f, true);
        } else {
            this.f33516r0 = null;
            P(null, false);
        }
        this.f33521w0 = z4;
    }

    private void V() {
        int size = this.f33480E.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f33480E.get(i4).E();
        }
    }

    private void W(@N LinearLayout.LayoutParams layoutParams) {
        if (this.f33505g0 == 1 && this.f33502d0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    @r(unit = 0)
    private int getDefaultHeight() {
        int size = this.f33480E.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            i iVar = this.f33480E.get(i4);
            if (iVar != null && iVar.h() != null && !TextUtils.isEmpty(iVar.n())) {
                if (!this.f33506h0) {
                    return f33479z0;
                }
            } else {
                i4++;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i4 = this.f33498W;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f33505g0;
        if (i5 != 0 && i5 != 2) {
            return 0;
        }
        return this.f33500b0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f33482G.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void i(@N TabItem tabItem) {
        i E3 = E();
        CharSequence charSequence = tabItem.f33452E;
        if (charSequence != null) {
            E3.D(charSequence);
        }
        Drawable drawable = tabItem.f33453F;
        if (drawable != null) {
            E3.x(drawable);
        }
        int i4 = tabItem.f33454G;
        if (i4 != 0) {
            E3.u(i4);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            E3.t(tabItem.getContentDescription());
        }
        e(E3);
    }

    private void j(@N i iVar) {
        n nVar = iVar.f33546i;
        nVar.setSelected(false);
        nVar.setActivated(false);
        this.f33482G.addView(nVar, iVar.k(), s());
    }

    private void k(View view) {
        if (view instanceof TabItem) {
            i((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void l(int i4) {
        if (i4 == -1) {
            return;
        }
        if (getWindowToken() != null && C0823k0.U0(this) && !this.f33482G.d()) {
            int scrollX = getScrollX();
            int o4 = o(i4, 0.0f);
            if (scrollX != o4) {
                y();
                this.f33515q0.setIntValues(scrollX, o4);
                this.f33515q0.start();
            }
            this.f33482G.c(i4, this.f33503e0);
            return;
        }
        Q(i4, 0.0f, true);
    }

    private void m(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
            } else {
                this.f33482G.setGravity(1);
                return;
            }
        } else {
            Log.w(f33462H0, "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        this.f33482G.setGravity(C.f13101b);
    }

    private void n() {
        int max;
        int i4 = this.f33505g0;
        if (i4 != 0 && i4 != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.f33501c0 - this.f33483H);
        }
        C0823k0.d2(this.f33482G, max, 0, 0, 0);
        int i5 = this.f33505g0;
        if (i5 != 0) {
            if (i5 == 1 || i5 == 2) {
                if (this.f33502d0 == 2) {
                    Log.w(f33462H0, "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.f33482G.setGravity(1);
            }
        } else {
            m(this.f33502d0);
        }
        X(true);
    }

    private int o(int i4, float f4) {
        View childAt;
        View view;
        int i5 = this.f33505g0;
        int i6 = 0;
        if ((i5 != 0 && i5 != 2) || (childAt = this.f33482G.getChildAt(i4)) == null) {
            return 0;
        }
        int i7 = i4 + 1;
        if (i7 < this.f33482G.getChildCount()) {
            view = this.f33482G.getChildAt(i7);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i6 = view.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i8 = (int) ((width + i6) * 0.5f * f4);
        if (C0823k0.Z(this) == 0) {
            return left + i8;
        }
        return left - i8;
    }

    private void q(@N i iVar, int i4) {
        iVar.z(i4);
        this.f33480E.add(i4, iVar);
        int size = this.f33480E.size();
        while (true) {
            i4++;
            if (i4 < size) {
                this.f33480E.get(i4).z(i4);
            } else {
                return;
            }
        }
    }

    @N
    private static ColorStateList r(int i4, int i5) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i5, i4});
    }

    @N
    private LinearLayout.LayoutParams s() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        W(layoutParams);
        return layoutParams;
    }

    private void setSelectedTabView(int i4) {
        boolean z3;
        int childCount = this.f33482G.getChildCount();
        if (i4 < childCount) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = this.f33482G.getChildAt(i5);
                boolean z4 = true;
                if (i5 == i4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                childAt.setSelected(z3);
                if (i5 != i4) {
                    z4 = false;
                }
                childAt.setActivated(z4);
            }
        }
    }

    @N
    private n u(@N i iVar) {
        n nVar;
        t.a<n> aVar = this.f33522x0;
        if (aVar != null) {
            nVar = aVar.b();
        } else {
            nVar = null;
        }
        if (nVar == null) {
            nVar = new n(getContext());
        }
        nVar.setTab(iVar);
        nVar.setFocusable(true);
        nVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(iVar.f33541d)) {
            nVar.setContentDescription(iVar.f33540c);
        } else {
            nVar.setContentDescription(iVar.f33541d);
        }
        return nVar;
    }

    private void v(@N i iVar) {
        for (int size = this.f33513o0.size() - 1; size >= 0; size--) {
            this.f33513o0.get(size).a(iVar);
        }
    }

    private void w(@N i iVar) {
        for (int size = this.f33513o0.size() - 1; size >= 0; size--) {
            this.f33513o0.get(size).b(iVar);
        }
    }

    private void x(@N i iVar) {
        for (int size = this.f33513o0.size() - 1; size >= 0; size--) {
            this.f33513o0.get(size).c(iVar);
        }
    }

    private void y() {
        if (this.f33515q0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f33515q0 = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.animation.a.f31208b);
            this.f33515q0.setDuration(this.f33503e0);
            this.f33515q0.addUpdateListener(new a());
        }
    }

    public boolean A() {
        return this.f33510l0;
    }

    public boolean B() {
        return this.f33506h0;
    }

    public boolean D() {
        return this.f33507i0;
    }

    @N
    public i E() {
        i t3 = t();
        t3.f33545h = this;
        t3.f33546i = u(t3);
        if (t3.f33547j != -1) {
            t3.f33546i.setId(t3.f33547j);
        }
        return t3;
    }

    void F() {
        int currentItem;
        H();
        androidx.viewpager.widget.a aVar = this.f33517s0;
        if (aVar != null) {
            int e4 = aVar.e();
            for (int i4 = 0; i4 < e4; i4++) {
                h(E().D(this.f33517s0.g(i4)), false);
            }
            androidx.viewpager.widget.d dVar = this.f33516r0;
            if (dVar != null && e4 > 0 && (currentItem = dVar.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                N(z(currentItem));
            }
        }
    }

    protected boolean G(i iVar) {
        return f33461G0.a(iVar);
    }

    public void H() {
        for (int childCount = this.f33482G.getChildCount() - 1; childCount >= 0; childCount--) {
            M(childCount);
        }
        Iterator<i> it = this.f33480E.iterator();
        while (it.hasNext()) {
            i next = it.next();
            it.remove();
            next.q();
            G(next);
        }
        this.f33481F = null;
    }

    @Deprecated
    public void I(@P c cVar) {
        this.f33513o0.remove(cVar);
    }

    public void J(@N f fVar) {
        I(fVar);
    }

    public void K(@N i iVar) {
        if (iVar.f33545h == this) {
            L(iVar.k());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void L(int i4) {
        int i5;
        i iVar;
        i iVar2 = this.f33481F;
        if (iVar2 != null) {
            i5 = iVar2.k();
        } else {
            i5 = 0;
        }
        M(i4);
        i remove = this.f33480E.remove(i4);
        if (remove != null) {
            remove.q();
            G(remove);
        }
        int size = this.f33480E.size();
        for (int i6 = i4; i6 < size; i6++) {
            this.f33480E.get(i6).z(i6);
        }
        if (i5 == i4) {
            if (this.f33480E.isEmpty()) {
                iVar = null;
            } else {
                iVar = this.f33480E.get(Math.max(0, i4 - 1));
            }
            N(iVar);
        }
    }

    public void N(@P i iVar) {
        O(iVar, true);
    }

    public void O(@P i iVar, boolean z3) {
        int i4;
        i iVar2 = this.f33481F;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                v(iVar);
                l(iVar.k());
                return;
            }
            return;
        }
        if (iVar != null) {
            i4 = iVar.k();
        } else {
            i4 = -1;
        }
        if (z3) {
            if ((iVar2 == null || iVar2.k() == -1) && i4 != -1) {
                Q(i4, 0.0f, true);
            } else {
                l(i4);
            }
            if (i4 != -1) {
                setSelectedTabView(i4);
            }
        }
        this.f33481F = iVar;
        if (iVar2 != null) {
            x(iVar2);
        }
        if (iVar != null) {
            w(iVar);
        }
    }

    void P(@P androidx.viewpager.widget.a aVar, boolean z3) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f33517s0;
        if (aVar2 != null && (dataSetObserver = this.f33518t0) != null) {
            aVar2.u(dataSetObserver);
        }
        this.f33517s0 = aVar;
        if (z3 && aVar != null) {
            if (this.f33518t0 == null) {
                this.f33518t0 = new g();
            }
            aVar.m(this.f33518t0);
        }
        F();
    }

    public void Q(int i4, float f4, boolean z3) {
        R(i4, f4, z3, true);
    }

    public void R(int i4, float f4, boolean z3, boolean z4) {
        int o4;
        int round = Math.round(i4 + f4);
        if (round >= 0 && round < this.f33482G.getChildCount()) {
            if (z4) {
                this.f33482G.g(i4, f4);
            }
            ValueAnimator valueAnimator = this.f33515q0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f33515q0.cancel();
            }
            if (i4 < 0) {
                o4 = 0;
            } else {
                o4 = o(i4, f4);
            }
            scrollTo(o4, 0);
            if (z3) {
                setSelectedTabView(round);
            }
        }
    }

    public void S(int i4, int i5) {
        setTabTextColors(r(i4, i5));
    }

    public void T(@P androidx.viewpager.widget.d dVar, boolean z3) {
        U(dVar, z3, false);
    }

    void X(boolean z3) {
        for (int i4 = 0; i4 < this.f33482G.getChildCount(); i4++) {
            View childAt = this.f33482G.getChildAt(i4);
            childAt.setMinimumWidth(getTabMinWidth());
            W((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z3) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        k(view);
    }

    @Deprecated
    public void c(@P c cVar) {
        if (!this.f33513o0.contains(cVar)) {
            this.f33513o0.add(cVar);
        }
    }

    public void d(@N f fVar) {
        c(fVar);
    }

    public void e(@N i iVar) {
        h(iVar, this.f33480E.isEmpty());
    }

    public void f(@N i iVar, int i4) {
        g(iVar, i4, this.f33480E.isEmpty());
    }

    public void g(@N i iVar, int i4, boolean z3) {
        if (iVar.f33545h == this) {
            q(iVar, i4);
            j(iVar);
            if (z3) {
                iVar.r();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public int getSelectedTabPosition() {
        i iVar = this.f33481F;
        if (iVar != null) {
            return iVar.k();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f33480E.size();
    }

    public int getTabGravity() {
        return this.f33502d0;
    }

    @P
    public ColorStateList getTabIconTint() {
        return this.f33489N;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f33509k0;
    }

    public int getTabIndicatorGravity() {
        return this.f33504f0;
    }

    int getTabMaxWidth() {
        return this.f33497V;
    }

    public int getTabMode() {
        return this.f33505g0;
    }

    @P
    public ColorStateList getTabRippleColor() {
        return this.f33490O;
    }

    @N
    public Drawable getTabSelectedIndicator() {
        return this.f33491P;
    }

    @P
    public ColorStateList getTabTextColors() {
        return this.f33488M;
    }

    public void h(@N i iVar, boolean z3) {
        g(iVar, this.f33480E.size(), z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.k.e(this);
        if (this.f33516r0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof androidx.viewpager.widget.d) {
                U((androidx.viewpager.widget.d) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f33521w0) {
            setupWithViewPager(null);
            this.f33521w0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(@N Canvas canvas) {
        for (int i4 = 0; i4 < this.f33482G.getChildCount(); i4++) {
            View childAt = this.f33482G.getChildAt(i4);
            if (childAt instanceof n) {
                ((n) childAt).m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        M.c2(accessibilityNodeInfo).b1(M.c.f(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (C() && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int round = Math.round(E.e(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i5);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i5 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i5) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i4);
        if (View.MeasureSpec.getMode(i4) != 0) {
            int i6 = this.f33499a0;
            if (i6 <= 0) {
                i6 = (int) (size - E.e(getContext(), f33457C0));
            }
            this.f33497V = i6;
        }
        super.onMeasure(i4, i5);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i7 = this.f33505g0;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i5, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i5, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !C()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        this.f33513o0.clear();
    }

    @Override // android.view.View
    @W(21)
    public void setElevation(float f4) {
        super.setElevation(f4);
        com.google.android.material.shape.k.d(this, f4);
    }

    public void setInlineLabel(boolean z3) {
        if (this.f33506h0 != z3) {
            this.f33506h0 = z3;
            for (int i4 = 0; i4 < this.f33482G.getChildCount(); i4++) {
                View childAt = this.f33482G.getChildAt(i4);
                if (childAt instanceof n) {
                    ((n) childAt).z();
                }
            }
            n();
        }
    }

    public void setInlineLabelResource(@InterfaceC0565h int i4) {
        setInlineLabel(getResources().getBoolean(i4));
    }

    @Deprecated
    public void setOnTabSelectedListener(@P f fVar) {
        setOnTabSelectedListener((c) fVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        y();
        this.f33515q0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@P Drawable drawable) {
        if (this.f33491P != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f33491P = drawable;
            int i4 = this.f33508j0;
            if (i4 == -1) {
                i4 = drawable.getIntrinsicHeight();
            }
            this.f33482G.h(i4);
        }
    }

    public void setSelectedTabIndicatorColor(@InterfaceC0569l int i4) {
        this.f33492Q = i4;
        X(false);
    }

    public void setSelectedTabIndicatorGravity(int i4) {
        if (this.f33504f0 != i4) {
            this.f33504f0 = i4;
            C0823k0.n1(this.f33482G);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i4) {
        this.f33508j0 = i4;
        this.f33482G.h(i4);
    }

    public void setTabGravity(int i4) {
        if (this.f33502d0 != i4) {
            this.f33502d0 = i4;
            n();
        }
    }

    public void setTabIconTint(@P ColorStateList colorStateList) {
        if (this.f33489N != colorStateList) {
            this.f33489N = colorStateList;
            V();
        }
    }

    public void setTabIconTintResource(@InterfaceC0571n int i4) {
        setTabIconTint(C2046a.a(getContext(), i4));
    }

    public void setTabIndicatorAnimationMode(int i4) {
        this.f33509k0 = i4;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    this.f33511m0 = new com.google.android.material.tabs.b();
                    return;
                }
                throw new IllegalArgumentException(i4 + " is not a valid TabIndicatorAnimationMode");
            }
            this.f33511m0 = new com.google.android.material.tabs.a();
            return;
        }
        this.f33511m0 = new com.google.android.material.tabs.c();
    }

    public void setTabIndicatorFullWidth(boolean z3) {
        this.f33507i0 = z3;
        this.f33482G.f();
        C0823k0.n1(this.f33482G);
    }

    public void setTabMode(int i4) {
        if (i4 != this.f33505g0) {
            this.f33505g0 = i4;
            n();
        }
    }

    public void setTabRippleColor(@P ColorStateList colorStateList) {
        if (this.f33490O != colorStateList) {
            this.f33490O = colorStateList;
            for (int i4 = 0; i4 < this.f33482G.getChildCount(); i4++) {
                View childAt = this.f33482G.getChildAt(i4);
                if (childAt instanceof n) {
                    ((n) childAt).y(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@InterfaceC0571n int i4) {
        setTabRippleColor(C2046a.a(getContext(), i4));
    }

    public void setTabTextColors(@P ColorStateList colorStateList) {
        if (this.f33488M != colorStateList) {
            this.f33488M = colorStateList;
            V();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@P androidx.viewpager.widget.a aVar) {
        P(aVar, false);
    }

    public void setUnboundedRipple(boolean z3) {
        if (this.f33510l0 != z3) {
            this.f33510l0 = z3;
            for (int i4 = 0; i4 < this.f33482G.getChildCount(); i4++) {
                View childAt = this.f33482G.getChildAt(i4);
                if (childAt instanceof n) {
                    ((n) childAt).y(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@InterfaceC0565h int i4) {
        setUnboundedRipple(getResources().getBoolean(i4));
    }

    public void setupWithViewPager(@P androidx.viewpager.widget.d dVar) {
        T(dVar, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    protected i t() {
        i b4 = f33461G0.b();
        if (b4 == null) {
            return new i();
        }
        return b4;
    }

    @P
    public i z(int i4) {
        if (i4 >= 0 && i4 < getTabCount()) {
            return this.f33480E.get(i4);
        }
        return null;
    }

    public TabLayout(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Bf);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i4) {
        k(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@P c cVar) {
        c cVar2 = this.f33512n0;
        if (cVar2 != null) {
            I(cVar2);
        }
        this.f33512n0 = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TabLayout(@androidx.annotation.N android.content.Context r10, @androidx.annotation.P android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        k(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        k(view);
    }

    public void setSelectedTabIndicator(@InterfaceC0578v int i4) {
        if (i4 != 0) {
            setSelectedTabIndicator(C2046a.b(getContext(), i4));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
