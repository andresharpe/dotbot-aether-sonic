package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.F;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.W;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import androidx.core.view.accessibility.U;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k0.C2076a;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: b0, reason: collision with root package name */
    public static final int f20637b0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f20638c0 = 1;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f20639d0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f20640e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f20641f0 = 2;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f20642g0 = -1;

    /* renamed from: h0, reason: collision with root package name */
    static boolean f20643h0 = true;

    /* renamed from: E, reason: collision with root package name */
    private final Rect f20644E;

    /* renamed from: F, reason: collision with root package name */
    private final Rect f20645F;

    /* renamed from: G, reason: collision with root package name */
    private androidx.viewpager2.widget.b f20646G;

    /* renamed from: H, reason: collision with root package name */
    int f20647H;

    /* renamed from: I, reason: collision with root package name */
    boolean f20648I;

    /* renamed from: J, reason: collision with root package name */
    private RecyclerView.i f20649J;

    /* renamed from: K, reason: collision with root package name */
    private LinearLayoutManager f20650K;

    /* renamed from: L, reason: collision with root package name */
    private int f20651L;

    /* renamed from: M, reason: collision with root package name */
    private Parcelable f20652M;

    /* renamed from: N, reason: collision with root package name */
    RecyclerView f20653N;

    /* renamed from: O, reason: collision with root package name */
    private z f20654O;

    /* renamed from: P, reason: collision with root package name */
    androidx.viewpager2.widget.g f20655P;

    /* renamed from: Q, reason: collision with root package name */
    private androidx.viewpager2.widget.b f20656Q;

    /* renamed from: R, reason: collision with root package name */
    private androidx.viewpager2.widget.d f20657R;

    /* renamed from: S, reason: collision with root package name */
    private androidx.viewpager2.widget.f f20658S;

    /* renamed from: T, reason: collision with root package name */
    private RecyclerView.l f20659T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f20660U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f20661V;

    /* renamed from: W, reason: collision with root package name */
    private int f20662W;

    /* renamed from: a0, reason: collision with root package name */
    e f20663a0;

    /* loaded from: classes.dex */
    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f20648I = true;
            viewPager2.f20655P.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends j {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void a(int i4) {
            if (i4 == 0) {
                ViewPager2.this.y();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i4) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f20647H != i4) {
                viewPager2.f20647H = i4;
                viewPager2.f20663a0.q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends j {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i4) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f20653N.requestFocus(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements RecyclerView.q {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void b(@N View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void d(@N View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) pVar).width == -1 && ((ViewGroup.MarginLayoutParams) pVar).height == -1) {
            } else {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class e {
        private e() {
        }

        boolean a() {
            return false;
        }

        boolean b(int i4) {
            return false;
        }

        boolean c(int i4, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(@P RecyclerView.Adapter<?> adapter) {
        }

        void f(@P RecyclerView.Adapter<?> adapter) {
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        void h(@N androidx.viewpager2.widget.b bVar, @N RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(@N M m4) {
        }

        boolean k(int i4) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean l(int i4, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void m() {
        }

        CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        void o(@N AccessibilityEvent accessibilityEvent) {
        }

        void p() {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends e {
        f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i4) {
            if ((i4 == 8192 || i4 == 4096) && !ViewPager2.this.l()) {
                return true;
            }
            return false;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(@N M m4) {
            if (!ViewPager2.this.l()) {
                m4.N0(M.a.f13384s);
                m4.N0(M.a.f13383r);
                m4.I1(false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean k(int i4) {
            if (b(i4)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    private static abstract class g extends RecyclerView.i {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b(int i4, int i5) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i4, int i5, @P Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i4, int i5) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i4, int i5, int i6) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i4, int i5) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean M1(@N RecyclerView recyclerView, @N View view, @N Rect rect, boolean z3, boolean z4) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void e1(@N RecyclerView.w wVar, @N RecyclerView.C c4, @N M m4) {
            super.e1(wVar, c4, m4);
            ViewPager2.this.f20663a0.j(m4);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void k2(@N RecyclerView.C c4, @N int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.k2(c4, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean y1(@N RecyclerView.w wVar, @N RecyclerView.C c4, int i4, @P Bundle bundle) {
            if (ViewPager2.this.f20663a0.b(i4)) {
                return ViewPager2.this.f20663a0.k(i4);
            }
            return super.y1(wVar, c4, i4, bundle);
        }
    }

    @F(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface i {
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public void a(int i4) {
        }

        public void b(int i4, float f4, @U int i5) {
        }

        public void c(int i4) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface k {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class l extends e {

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.view.accessibility.U f20671b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.core.view.accessibility.U f20672c;

        /* renamed from: d, reason: collision with root package name */
        private RecyclerView.i f20673d;

        /* loaded from: classes.dex */
        class a implements androidx.core.view.accessibility.U {
            a() {
            }

            @Override // androidx.core.view.accessibility.U
            public boolean a(@N View view, @P U.a aVar) {
                l.this.v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        class b implements androidx.core.view.accessibility.U {
            b() {
            }

            @Override // androidx.core.view.accessibility.U
            public boolean a(@N View view, @P U.a aVar) {
                l.this.v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.i
            public void a() {
                l.this.w();
            }
        }

        l() {
            super(ViewPager2.this, null);
            this.f20671b = new a();
            this.f20672c = new b();
        }

        private void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i4;
            int i5;
            if (ViewPager2.this.getAdapter() != null) {
                if (ViewPager2.this.getOrientation() == 1) {
                    i4 = ViewPager2.this.getAdapter().l();
                    i5 = 0;
                } else {
                    i5 = ViewPager2.this.getAdapter().l();
                    i4 = 0;
                }
            } else {
                i4 = 0;
                i5 = 0;
            }
            M.c2(accessibilityNodeInfo).b1(M.c.f(i4, i5, false, 0));
        }

        private void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int l4;
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (l4 = adapter.l()) != 0 && ViewPager2.this.l()) {
                if (ViewPager2.this.f20647H > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.f20647H < l4 - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i4, Bundle bundle) {
            return i4 == 8192 || i4 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(@P RecyclerView.Adapter<?> adapter) {
            w();
            if (adapter != null) {
                adapter.K(this.f20673d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(@P RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.N(this.f20673d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(@N androidx.viewpager2.widget.b bVar, @N RecyclerView recyclerView) {
            C0823k0.R1(recyclerView, 2);
            this.f20673d = new c();
            if (C0823k0.V(ViewPager2.this) == 0) {
                C0823k0.R1(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            u(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i4, Bundle bundle) {
            int currentItem;
            if (c(i4, bundle)) {
                if (i4 == 8192) {
                    currentItem = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    currentItem = ViewPager2.this.getCurrentItem() + 1;
                }
                v(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void m() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void o(@N AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            w();
        }

        void v(int i4) {
            if (ViewPager2.this.l()) {
                ViewPager2.this.t(i4, true);
            }
        }

        void w() {
            int l4;
            int i4;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i5 = R.id.accessibilityActionPageLeft;
            C0823k0.r1(viewPager2, R.id.accessibilityActionPageLeft);
            C0823k0.r1(viewPager2, R.id.accessibilityActionPageRight);
            C0823k0.r1(viewPager2, R.id.accessibilityActionPageUp);
            C0823k0.r1(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (l4 = ViewPager2.this.getAdapter().l()) == 0 || !ViewPager2.this.l()) {
                return;
            }
            if (ViewPager2.this.getOrientation() == 0) {
                boolean k4 = ViewPager2.this.k();
                if (k4) {
                    i4 = 16908360;
                } else {
                    i4 = 16908361;
                }
                if (k4) {
                    i5 = 16908361;
                }
                if (ViewPager2.this.f20647H < l4 - 1) {
                    C0823k0.u1(viewPager2, new M.a(i4, null), null, this.f20671b);
                }
                if (ViewPager2.this.f20647H > 0) {
                    C0823k0.u1(viewPager2, new M.a(i5, null), null, this.f20672c);
                    return;
                }
                return;
            }
            if (ViewPager2.this.f20647H < l4 - 1) {
                C0823k0.u1(viewPager2, new M.a(R.id.accessibilityActionPageDown, null), null, this.f20671b);
            }
            if (ViewPager2.this.f20647H > 0) {
                C0823k0.u1(viewPager2, new M.a(R.id.accessibilityActionPageUp, null), null, this.f20672c);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface m {
        void a(@N View view, float f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class n extends z {
        n() {
        }

        @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.D
        @P
        public View h(RecyclerView.o oVar) {
            if (ViewPager2.this.j()) {
                return null;
            }
            return super.h(oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class o extends RecyclerView {
        o(@N Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @W(23)
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.f20663a0.d()) {
                return ViewPager2.this.f20663a0.n();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@N AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f20647H);
            accessibilityEvent.setToIndex(ViewPager2.this.f20647H);
            ViewPager2.this.f20663a0.o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.l() && super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.l() && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface q {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class r implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        private final int f20683E;

        /* renamed from: F, reason: collision with root package name */
        private final RecyclerView f20684F;

        r(int i4, RecyclerView recyclerView) {
            this.f20683E = i4;
            this.f20684F = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20684F.O1(this.f20683E);
        }
    }

    public ViewPager2(@N Context context) {
        super(context);
        this.f20644E = new Rect();
        this.f20645F = new Rect();
        this.f20646G = new androidx.viewpager2.widget.b(3);
        this.f20648I = false;
        this.f20649J = new a();
        this.f20651L = -1;
        this.f20659T = null;
        this.f20660U = false;
        this.f20661V = true;
        this.f20662W = -1;
        h(context, null);
    }

    private RecyclerView.q e() {
        return new d();
    }

    private void h(Context context, AttributeSet attributeSet) {
        e fVar;
        if (f20643h0) {
            fVar = new l();
        } else {
            fVar = new f();
        }
        this.f20663a0 = fVar;
        o oVar = new o(context);
        this.f20653N = oVar;
        oVar.setId(C0823k0.D());
        this.f20653N.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f20650K = hVar;
        this.f20653N.setLayoutManager(hVar);
        this.f20653N.setScrollingTouchSlop(1);
        u(context, attributeSet);
        this.f20653N.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f20653N.p(e());
        androidx.viewpager2.widget.g gVar = new androidx.viewpager2.widget.g(this);
        this.f20655P = gVar;
        this.f20657R = new androidx.viewpager2.widget.d(this, gVar, this.f20653N);
        n nVar = new n();
        this.f20654O = nVar;
        nVar.b(this.f20653N);
        this.f20653N.r(this.f20655P);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f20656Q = bVar;
        this.f20655P.r(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f20656Q.d(bVar2);
        this.f20656Q.d(cVar);
        this.f20663a0.h(this.f20656Q, this.f20653N);
        this.f20656Q.d(this.f20646G);
        androidx.viewpager2.widget.f fVar2 = new androidx.viewpager2.widget.f(this.f20650K);
        this.f20658S = fVar2;
        this.f20656Q.d(fVar2);
        RecyclerView recyclerView = this.f20653N;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void m(@P RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.K(this.f20649J);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r() {
        RecyclerView.Adapter adapter;
        if (this.f20651L == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f20652M;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                ((androidx.viewpager2.adapter.b) adapter).c(parcelable);
            }
            this.f20652M = null;
        }
        int max = Math.max(0, Math.min(this.f20651L, adapter.l() - 1));
        this.f20647H = max;
        this.f20651L = -1;
        this.f20653N.G1(max);
        this.f20663a0.m();
    }

    private void u(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2076a.j.f51755c0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C2076a.j.f51755c0, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C2076a.j.f51757d0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void w(@P RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.N(this.f20649J);
        }
    }

    public void a(@N RecyclerView.n nVar) {
        this.f20653N.n(nVar);
    }

    public void b(@N RecyclerView.n nVar, int i4) {
        this.f20653N.o(nVar, i4);
    }

    public boolean c() {
        return this.f20657R.b();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        return this.f20653N.canScrollHorizontally(i4);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i4) {
        return this.f20653N.canScrollVertically(i4);
    }

    public boolean d() {
        return this.f20657R.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof p) {
            int i4 = ((p) parcelable).f20680E;
            sparseArray.put(this.f20653N.getId(), sparseArray.get(i4));
            sparseArray.remove(i4);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        r();
    }

    public boolean f(@androidx.annotation.U @SuppressLint({"SupportAnnotationUsage"}) float f4) {
        return this.f20657R.e(f4);
    }

    @N
    public RecyclerView.n g(int i4) {
        return this.f20653N.A0(i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    @W(23)
    public CharSequence getAccessibilityClassName() {
        if (this.f20663a0.a()) {
            return this.f20663a0.g();
        }
        return super.getAccessibilityClassName();
    }

    @P
    public RecyclerView.Adapter getAdapter() {
        return this.f20653N.getAdapter();
    }

    public int getCurrentItem() {
        return this.f20647H;
    }

    public int getItemDecorationCount() {
        return this.f20653N.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f20662W;
    }

    public int getOrientation() {
        return this.f20650K.M2();
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f20653N;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f20655P.h();
    }

    public void i() {
        this.f20653N.K0();
    }

    public boolean j() {
        return this.f20657R.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        if (this.f20650K.i0() == 1) {
            return true;
        }
        return false;
    }

    public boolean l() {
        return this.f20661V;
    }

    public void n(@N j jVar) {
        this.f20646G.d(jVar);
    }

    public void o(@N RecyclerView.n nVar) {
        this.f20653N.s1(nVar);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f20663a0.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int measuredWidth = this.f20653N.getMeasuredWidth();
        int measuredHeight = this.f20653N.getMeasuredHeight();
        this.f20644E.left = getPaddingLeft();
        this.f20644E.right = (i6 - i4) - getPaddingRight();
        this.f20644E.top = getPaddingTop();
        this.f20644E.bottom = (i7 - i5) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f20644E, this.f20645F);
        RecyclerView recyclerView = this.f20653N;
        Rect rect = this.f20645F;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f20648I) {
            y();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        measureChild(this.f20653N, i4, i5);
        int measuredWidth = this.f20653N.getMeasuredWidth();
        int measuredHeight = this.f20653N.getMeasuredHeight();
        int measuredState = this.f20653N.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i4, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i5, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.getSuperState());
        this.f20651L = pVar.f20681F;
        this.f20652M = pVar.f20682G;
    }

    @Override // android.view.View
    @P
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f20680E = this.f20653N.getId();
        int i4 = this.f20651L;
        if (i4 == -1) {
            i4 = this.f20647H;
        }
        pVar.f20681F = i4;
        Parcelable parcelable = this.f20652M;
        if (parcelable != null) {
            pVar.f20682G = parcelable;
        } else {
            Object adapter = this.f20653N.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                pVar.f20682G = ((androidx.viewpager2.adapter.b) adapter).a();
            }
        }
        return pVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public void p(int i4) {
        this.f20653N.t1(i4);
    }

    @Override // android.view.View
    @W(16)
    public boolean performAccessibilityAction(int i4, Bundle bundle) {
        if (this.f20663a0.c(i4, bundle)) {
            return this.f20663a0.l(i4, bundle);
        }
        return super.performAccessibilityAction(i4, bundle);
    }

    public void q() {
        if (this.f20658S.d() == null) {
            return;
        }
        double g4 = this.f20655P.g();
        int i4 = (int) g4;
        float f4 = (float) (g4 - i4);
        this.f20658S.b(i4, f4, Math.round(getPageSize() * f4));
    }

    public void s(int i4, boolean z3) {
        if (!j()) {
            t(i4, z3);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public void setAdapter(@P RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f20653N.getAdapter();
        this.f20663a0.f(adapter2);
        w(adapter2);
        this.f20653N.setAdapter(adapter);
        this.f20647H = 0;
        r();
        this.f20663a0.e(adapter);
        m(adapter);
    }

    public void setCurrentItem(int i4) {
        s(i4, true);
    }

    @Override // android.view.View
    @W(17)
    public void setLayoutDirection(int i4) {
        super.setLayoutDirection(i4);
        this.f20663a0.p();
    }

    public void setOffscreenPageLimit(int i4) {
        if (i4 < 1 && i4 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f20662W = i4;
        this.f20653N.requestLayout();
    }

    public void setOrientation(int i4) {
        this.f20650K.f3(i4);
        this.f20663a0.r();
    }

    public void setPageTransformer(@P m mVar) {
        if (mVar != null) {
            if (!this.f20660U) {
                this.f20659T = this.f20653N.getItemAnimator();
                this.f20660U = true;
            }
            this.f20653N.setItemAnimator(null);
        } else if (this.f20660U) {
            this.f20653N.setItemAnimator(this.f20659T);
            this.f20659T = null;
            this.f20660U = false;
        }
        if (mVar == this.f20658S.d()) {
            return;
        }
        this.f20658S.e(mVar);
        q();
    }

    public void setUserInputEnabled(boolean z3) {
        this.f20661V = z3;
        this.f20663a0.s();
    }

    void t(int i4, boolean z3) {
        int i5;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f20651L != -1) {
                this.f20651L = Math.max(i4, 0);
                return;
            }
            return;
        }
        if (adapter.l() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i4, 0), adapter.l() - 1);
        if (min == this.f20647H && this.f20655P.k()) {
            return;
        }
        int i6 = this.f20647H;
        if (min == i6 && z3) {
            return;
        }
        double d4 = i6;
        this.f20647H = min;
        this.f20663a0.q();
        if (!this.f20655P.k()) {
            d4 = this.f20655P.g();
        }
        this.f20655P.p(min, z3);
        if (!z3) {
            this.f20653N.G1(min);
            return;
        }
        double d5 = min;
        if (Math.abs(d5 - d4) > 3.0d) {
            RecyclerView recyclerView = this.f20653N;
            if (d5 > d4) {
                i5 = min - 3;
            } else {
                i5 = min + 3;
            }
            recyclerView.G1(i5);
            RecyclerView recyclerView2 = this.f20653N;
            recyclerView2.post(new r(min, recyclerView2));
            return;
        }
        this.f20653N.O1(min);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        View h4 = this.f20654O.h(this.f20650K);
        if (h4 == null) {
            return;
        }
        int[] c4 = this.f20654O.c(this.f20650K, h4);
        int i4 = c4[0];
        if (i4 != 0 || c4[1] != 0) {
            this.f20653N.K1(i4, c4[1]);
        }
    }

    public void x(@N j jVar) {
        this.f20646G.e(jVar);
    }

    void y() {
        z zVar = this.f20654O;
        if (zVar != null) {
            View h4 = zVar.h(this.f20650K);
            if (h4 == null) {
                return;
            }
            int s02 = this.f20650K.s0(h4);
            if (s02 != this.f20647H && getScrollState() == 0) {
                this.f20656Q.c(s02);
            }
            this.f20648I = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class p extends View.BaseSavedState {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        int f20680E;

        /* renamed from: F, reason: collision with root package name */
        int f20681F;

        /* renamed from: G, reason: collision with root package name */
        Parcelable f20682G;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<p> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i4) {
                return new p[i4];
            }
        }

        @W(24)
        p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f20680E = parcel.readInt();
            this.f20681F = parcel.readInt();
            this.f20682G = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f20680E);
            parcel.writeInt(this.f20681F);
            parcel.writeParcelable(this.f20682G, i4);
        }

        p(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20644E = new Rect();
        this.f20645F = new Rect();
        this.f20646G = new androidx.viewpager2.widget.b(3);
        this.f20648I = false;
        this.f20649J = new a();
        this.f20651L = -1;
        this.f20659T = null;
        this.f20660U = false;
        this.f20661V = true;
        this.f20662W = -1;
        h(context, attributeSet);
    }

    public ViewPager2(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f20644E = new Rect();
        this.f20645F = new Rect();
        this.f20646G = new androidx.viewpager2.widget.b(3);
        this.f20648I = false;
        this.f20649J = new a();
        this.f20651L = -1;
        this.f20659T = null;
        this.f20660U = false;
        this.f20661V = true;
        this.f20662W = -1;
        h(context, attributeSet);
    }

    @W(21)
    public ViewPager2(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f20644E = new Rect();
        this.f20645F = new Rect();
        this.f20646G = new androidx.viewpager2.widget.b(3);
        this.f20648I = false;
        this.f20649J = new a();
        this.f20651L = -1;
        this.f20659T = null;
        this.f20660U = false;
        this.f20661V = true;
        this.f20662W = -1;
        h(context, attributeSet);
    }
}
