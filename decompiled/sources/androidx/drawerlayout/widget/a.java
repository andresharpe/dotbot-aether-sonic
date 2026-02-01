package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.content.C0669d;
import androidx.core.graphics.E;
import androidx.core.view.C;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.Y0;
import androidx.core.view.accessibility.M;
import androidx.core.view.accessibility.U;
import androidx.customview.widget.d;
import java.util.ArrayList;
import java.util.List;
import w.C2429a;

/* loaded from: classes.dex */
public class a extends ViewGroup implements androidx.customview.widget.c {

    /* renamed from: A0, reason: collision with root package name */
    public static final int f14133A0 = 3;

    /* renamed from: B0, reason: collision with root package name */
    private static final int f14134B0 = 64;

    /* renamed from: C0, reason: collision with root package name */
    private static final int f14135C0 = -1728053248;

    /* renamed from: D0, reason: collision with root package name */
    private static final int f14136D0 = 160;

    /* renamed from: E0, reason: collision with root package name */
    private static final int f14137E0 = 400;

    /* renamed from: F0, reason: collision with root package name */
    private static final boolean f14138F0 = false;

    /* renamed from: G0, reason: collision with root package name */
    private static final boolean f14139G0 = true;

    /* renamed from: H0, reason: collision with root package name */
    private static final float f14140H0 = 1.0f;

    /* renamed from: J0, reason: collision with root package name */
    static final boolean f14142J0;

    /* renamed from: K0, reason: collision with root package name */
    private static final boolean f14143K0;

    /* renamed from: L0, reason: collision with root package name */
    private static final String f14144L0 = "androidx.drawerlayout.widget.DrawerLayout";

    /* renamed from: M0, reason: collision with root package name */
    private static boolean f14145M0 = false;

    /* renamed from: s0, reason: collision with root package name */
    private static final String f14146s0 = "DrawerLayout";

    /* renamed from: u0, reason: collision with root package name */
    public static final int f14148u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public static final int f14149v0 = 1;

    /* renamed from: w0, reason: collision with root package name */
    public static final int f14150w0 = 2;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f14151x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f14152y0 = 1;

    /* renamed from: z0, reason: collision with root package name */
    public static final int f14153z0 = 2;

    /* renamed from: E, reason: collision with root package name */
    private final d f14154E;

    /* renamed from: F, reason: collision with root package name */
    private float f14155F;

    /* renamed from: G, reason: collision with root package name */
    private int f14156G;

    /* renamed from: H, reason: collision with root package name */
    private int f14157H;

    /* renamed from: I, reason: collision with root package name */
    private float f14158I;

    /* renamed from: J, reason: collision with root package name */
    private Paint f14159J;

    /* renamed from: K, reason: collision with root package name */
    private final androidx.customview.widget.d f14160K;

    /* renamed from: L, reason: collision with root package name */
    private final androidx.customview.widget.d f14161L;

    /* renamed from: M, reason: collision with root package name */
    private final i f14162M;

    /* renamed from: N, reason: collision with root package name */
    private final i f14163N;

    /* renamed from: O, reason: collision with root package name */
    private int f14164O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f14165P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f14166Q;

    /* renamed from: R, reason: collision with root package name */
    private int f14167R;

    /* renamed from: S, reason: collision with root package name */
    private int f14168S;

    /* renamed from: T, reason: collision with root package name */
    private int f14169T;

    /* renamed from: U, reason: collision with root package name */
    private int f14170U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f14171V;

    /* renamed from: W, reason: collision with root package name */
    @P
    private e f14172W;

    /* renamed from: a0, reason: collision with root package name */
    private List<e> f14173a0;

    /* renamed from: b0, reason: collision with root package name */
    private float f14174b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f14175c0;

    /* renamed from: d0, reason: collision with root package name */
    private Drawable f14176d0;

    /* renamed from: e0, reason: collision with root package name */
    private Drawable f14177e0;

    /* renamed from: f0, reason: collision with root package name */
    private Drawable f14178f0;

    /* renamed from: g0, reason: collision with root package name */
    private CharSequence f14179g0;

    /* renamed from: h0, reason: collision with root package name */
    private CharSequence f14180h0;

    /* renamed from: i0, reason: collision with root package name */
    private Object f14181i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f14182j0;

    /* renamed from: k0, reason: collision with root package name */
    private Drawable f14183k0;

    /* renamed from: l0, reason: collision with root package name */
    private Drawable f14184l0;

    /* renamed from: m0, reason: collision with root package name */
    private Drawable f14185m0;

    /* renamed from: n0, reason: collision with root package name */
    private Drawable f14186n0;

    /* renamed from: o0, reason: collision with root package name */
    private final ArrayList<View> f14187o0;

    /* renamed from: p0, reason: collision with root package name */
    private Rect f14188p0;

    /* renamed from: q0, reason: collision with root package name */
    private Matrix f14189q0;

    /* renamed from: r0, reason: collision with root package name */
    private final U f14190r0;

    /* renamed from: t0, reason: collision with root package name */
    private static final int[] f14147t0 = {R.attr.colorPrimaryDark};

    /* renamed from: I0, reason: collision with root package name */
    static final int[] f14141I0 = {R.attr.layout_gravity};

    /* renamed from: androidx.drawerlayout.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0121a implements U {
        C0121a() {
        }

        @Override // androidx.core.view.accessibility.U
        public boolean a(@N View view, @P U.a aVar) {
            if (a.this.D(view) && a.this.r(view) != 2) {
                a.this.f(view);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z3;
            a aVar = (a) view;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            aVar.S(windowInsets, z3);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* loaded from: classes.dex */
    class c extends C0771a {

        /* renamed from: d, reason: collision with root package name */
        private final Rect f14193d = new Rect();

        c() {
        }

        private void n(M m4, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (a.A(childAt)) {
                    m4.c(childAt);
                }
            }
        }

        private void o(M m4, M m5) {
            Rect rect = this.f14193d;
            m5.t(rect);
            m4.V0(rect);
            m4.a2(m5.E0());
            m4.A1(m5.O());
            m4.Z0(m5.w());
            m4.d1(m5.A());
            m4.j1(m5.q0());
            m4.m1(m5.s0());
            m4.R0(m5.i0());
            m4.J1(m5.A0());
            m4.a(m5.p());
        }

        @Override // androidx.core.view.C0771a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View p4 = a.this.p();
                if (p4 != null) {
                    CharSequence s4 = a.this.s(a.this.t(p4));
                    if (s4 != null) {
                        text.add(s4);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0771a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(a.f14144L0);
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, M m4) {
            if (a.f14142J0) {
                super.g(view, m4);
            } else {
                M I02 = M.I0(m4);
                super.g(view, I02);
                m4.L1(view);
                Object l02 = C0823k0.l0(view);
                if (l02 instanceof View) {
                    m4.C1((View) l02);
                }
                o(m4, I02);
                I02.L0();
                n(m4, (ViewGroup) view);
            }
            m4.Z0(a.f14144L0);
            m4.l1(false);
            m4.m1(false);
            m4.N0(M.a.f13371f);
            m4.N0(M.a.f13372g);
        }

        @Override // androidx.core.view.C0771a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!a.f14142J0 && !a.A(view)) {
                return false;
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    static final class d extends C0771a {
        d() {
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, M m4) {
            super.g(view, m4);
            if (!a.A(view)) {
                m4.C1(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(@N View view);

        void b(@N View view);

        void c(int i4);

        void d(@N View view, float f4);
    }

    /* loaded from: classes.dex */
    public static abstract class h implements e {
        @Override // androidx.drawerlayout.widget.a.e
        public void a(View view) {
        }

        @Override // androidx.drawerlayout.widget.a.e
        public void b(View view) {
        }

        @Override // androidx.drawerlayout.widget.a.e
        public void c(int i4) {
        }

        @Override // androidx.drawerlayout.widget.a.e
        public void d(View view, float f4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class i extends d.c {

        /* renamed from: a, reason: collision with root package name */
        private final int f14207a;

        /* renamed from: b, reason: collision with root package name */
        private androidx.customview.widget.d f14208b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f14209c = new RunnableC0123a();

        /* renamed from: androidx.drawerlayout.widget.a$i$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0123a implements Runnable {
            RunnableC0123a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.o();
            }
        }

        i(int i4) {
            this.f14207a = i4;
        }

        private void n() {
            int i4 = 3;
            if (this.f14207a == 3) {
                i4 = 5;
            }
            View n4 = a.this.n(i4);
            if (n4 != null) {
                a.this.f(n4);
            }
        }

        @Override // androidx.customview.widget.d.c
        public int a(View view, int i4, int i5) {
            if (a.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i4, 0));
            }
            int width = a.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i4, width));
        }

        @Override // androidx.customview.widget.d.c
        public int b(View view, int i4, int i5) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(View view) {
            if (a.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.d.c
        public void f(int i4, int i5) {
            View n4;
            if ((i4 & 1) == 1) {
                n4 = a.this.n(3);
            } else {
                n4 = a.this.n(5);
            }
            if (n4 != null && a.this.r(n4) == 0) {
                this.f14208b.d(n4, i5);
            }
        }

        @Override // androidx.customview.widget.d.c
        public boolean g(int i4) {
            return false;
        }

        @Override // androidx.customview.widget.d.c
        public void h(int i4, int i5) {
            a.this.postDelayed(this.f14209c, 160L);
        }

        @Override // androidx.customview.widget.d.c
        public void i(View view, int i4) {
            ((f) view.getLayoutParams()).f14200c = false;
            n();
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i4) {
            a.this.b0(i4, this.f14208b.z());
        }

        @Override // androidx.customview.widget.d.c
        public void k(View view, int i4, int i5, int i6, int i7) {
            float width;
            int i8;
            int width2 = view.getWidth();
            if (a.this.c(view, 3)) {
                width = i4 + width2;
            } else {
                width = a.this.getWidth() - i4;
            }
            float f4 = width / width2;
            a.this.Y(view, f4);
            if (f4 == 0.0f) {
                i8 = 4;
            } else {
                i8 = 0;
            }
            view.setVisibility(i8);
            a.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public void l(View view, float f4, float f5) {
            int i4;
            float u3 = a.this.u(view);
            int width = view.getWidth();
            if (a.this.c(view, 3)) {
                if (f4 <= 0.0f && (f4 != 0.0f || u3 <= 0.5f)) {
                    i4 = -width;
                } else {
                    i4 = 0;
                }
            } else {
                int width2 = a.this.getWidth();
                if (f4 < 0.0f || (f4 == 0.0f && u3 > 0.5f)) {
                    width2 -= width;
                }
                i4 = width2;
            }
            this.f14208b.V(i4, view.getTop());
            a.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i4) {
            if (a.this.E(view) && a.this.c(view, this.f14207a) && a.this.r(view) == 0) {
                return true;
            }
            return false;
        }

        void o() {
            boolean z3;
            View n4;
            int width;
            int B3 = this.f14208b.B();
            int i4 = 0;
            if (this.f14207a == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                n4 = a.this.n(3);
                if (n4 != null) {
                    i4 = -n4.getWidth();
                }
                width = i4 + B3;
            } else {
                n4 = a.this.n(5);
                width = a.this.getWidth() - B3;
            }
            if (n4 != null) {
                if (((z3 && n4.getLeft() < width) || (!z3 && n4.getLeft() > width)) && a.this.r(n4) == 0) {
                    f fVar = (f) n4.getLayoutParams();
                    this.f14208b.X(n4, width, n4.getTop());
                    fVar.f14200c = true;
                    a.this.invalidate();
                    n();
                    a.this.b();
                }
            }
        }

        public void p() {
            a.this.removeCallbacks(this.f14209c);
        }

        public void q(androidx.customview.widget.d dVar) {
            this.f14208b = dVar;
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        boolean z3 = true;
        f14142J0 = true;
        f14143K0 = true;
        if (i4 < 29) {
            z3 = false;
        }
        f14145M0 = z3;
    }

    public a(@N Context context) {
        this(context, null);
    }

    static boolean A(View view) {
        if (C0823k0.V(view) != 4 && C0823k0.V(view) != 2) {
            return true;
        }
        return false;
    }

    private boolean H(float f4, float f5, View view) {
        if (this.f14188p0 == null) {
            this.f14188p0 = new Rect();
        }
        view.getHitRect(this.f14188p0);
        return this.f14188p0.contains((int) f4, (int) f5);
    }

    private void I(Drawable drawable, int i4) {
        if (drawable != null && androidx.core.graphics.drawable.d.h(drawable)) {
            androidx.core.graphics.drawable.d.m(drawable, i4);
        }
    }

    private Drawable P() {
        int Z3 = C0823k0.Z(this);
        if (Z3 == 0) {
            Drawable drawable = this.f14183k0;
            if (drawable != null) {
                I(drawable, Z3);
                return this.f14183k0;
            }
        } else {
            Drawable drawable2 = this.f14184l0;
            if (drawable2 != null) {
                I(drawable2, Z3);
                return this.f14184l0;
            }
        }
        return this.f14185m0;
    }

    private Drawable Q() {
        int Z3 = C0823k0.Z(this);
        if (Z3 == 0) {
            Drawable drawable = this.f14184l0;
            if (drawable != null) {
                I(drawable, Z3);
                return this.f14184l0;
            }
        } else {
            Drawable drawable2 = this.f14183k0;
            if (drawable2 != null) {
                I(drawable2, Z3);
                return this.f14183k0;
            }
        }
        return this.f14186n0;
    }

    private void R() {
        if (f14143K0) {
            return;
        }
        this.f14177e0 = P();
        this.f14178f0 = Q();
    }

    private void Z(View view) {
        M.a aVar = M.a.f13391z;
        C0823k0.r1(view, aVar.b());
        if (D(view) && r(view) != 2) {
            C0823k0.u1(view, aVar, null, this.f14190r0);
        }
    }

    private void a0(View view, boolean z3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((!z3 && !E(childAt)) || (z3 && childAt == view)) {
                C0823k0.R1(childAt, 1);
            } else {
                C0823k0.R1(childAt, 4);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v3 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v3);
            v3.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f14189q0 == null) {
                this.f14189q0 = new Matrix();
            }
            matrix.invert(this.f14189q0);
            obtain.transform(this.f14189q0);
        }
        return obtain;
    }

    static String w(int i4) {
        if ((i4 & 3) == 3) {
            return "LEFT";
        }
        if ((i4 & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i4);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (((f) getChildAt(i4).getLayoutParams()).f14200c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        if (p() != null) {
            return true;
        }
        return false;
    }

    boolean B(View view) {
        if (((f) view.getLayoutParams()).f14198a == 0) {
            return true;
        }
        return false;
    }

    public boolean C(int i4) {
        View n4 = n(i4);
        if (n4 != null) {
            return D(n4);
        }
        return false;
    }

    public boolean D(@N View view) {
        if (E(view)) {
            if ((((f) view.getLayoutParams()).f14201d & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean E(View view) {
        int d4 = C.d(((f) view.getLayoutParams()).f14198a, C0823k0.Z(view));
        if ((d4 & 3) != 0 || (d4 & 5) != 0) {
            return true;
        }
        return false;
    }

    public boolean F(int i4) {
        View n4 = n(i4);
        if (n4 != null) {
            return G(n4);
        }
        return false;
    }

    public boolean G(@N View view) {
        if (E(view)) {
            if (((f) view.getLayoutParams()).f14199b > 0.0f) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void J(View view, float f4) {
        float u3 = u(view);
        float width = view.getWidth();
        int i4 = ((int) (width * f4)) - ((int) (u3 * width));
        if (!c(view, 3)) {
            i4 = -i4;
        }
        view.offsetLeftAndRight(i4);
        Y(view, f4);
    }

    public void K(int i4) {
        L(i4, true);
    }

    public void L(int i4, boolean z3) {
        View n4 = n(i4);
        if (n4 != null) {
            N(n4, z3);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i4));
    }

    public void M(@N View view) {
        N(view, true);
    }

    public void N(@N View view, boolean z3) {
        if (E(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f14166Q) {
                fVar.f14199b = 1.0f;
                fVar.f14201d = 1;
                a0(view, true);
                Z(view);
            } else if (z3) {
                fVar.f14201d |= 2;
                if (c(view, 3)) {
                    this.f14160K.X(view, 0, view.getTop());
                } else {
                    this.f14161L.X(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                J(view, 1.0f);
                b0(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void O(@N e eVar) {
        List<e> list;
        if (eVar == null || (list = this.f14173a0) == null) {
            return;
        }
        list.remove(eVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void S(Object obj, boolean z3) {
        boolean z4;
        this.f14181i0 = obj;
        this.f14182j0 = z3;
        if (!z3 && getBackground() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        setWillNotDraw(z4);
        requestLayout();
    }

    public void T(int i4, int i5) {
        View n4;
        androidx.customview.widget.d dVar;
        int d4 = C.d(i5, C0823k0.Z(this));
        if (i5 != 3) {
            if (i5 != 5) {
                if (i5 != 8388611) {
                    if (i5 == 8388613) {
                        this.f14170U = i4;
                    }
                } else {
                    this.f14169T = i4;
                }
            } else {
                this.f14168S = i4;
            }
        } else {
            this.f14167R = i4;
        }
        if (i4 != 0) {
            if (d4 == 3) {
                dVar = this.f14160K;
            } else {
                dVar = this.f14161L;
            }
            dVar.c();
        }
        if (i4 != 1) {
            if (i4 == 2 && (n4 = n(d4)) != null) {
                M(n4);
                return;
            }
            return;
        }
        View n5 = n(d4);
        if (n5 != null) {
            f(n5);
        }
    }

    public void U(int i4, @N View view) {
        if (E(view)) {
            T(i4, ((f) view.getLayoutParams()).f14198a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void V(@InterfaceC0578v int i4, int i5) {
        W(C0669d.i(getContext(), i4), i5);
    }

    public void W(Drawable drawable, int i4) {
        if (f14143K0) {
            return;
        }
        if ((i4 & C.f13101b) == 8388611) {
            this.f14183k0 = drawable;
        } else if ((i4 & C.f13102c) == 8388613) {
            this.f14184l0 = drawable;
        } else if ((i4 & 3) == 3) {
            this.f14185m0 = drawable;
        } else if ((i4 & 5) == 5) {
            this.f14186n0 = drawable;
        } else {
            return;
        }
        R();
        invalidate();
    }

    public void X(int i4, @P CharSequence charSequence) {
        int d4 = C.d(i4, C0823k0.Z(this));
        if (d4 == 3) {
            this.f14179g0 = charSequence;
        } else if (d4 == 5) {
            this.f14180h0 = charSequence;
        }
    }

    void Y(View view, float f4) {
        f fVar = (f) view.getLayoutParams();
        if (f4 == fVar.f14199b) {
            return;
        }
        fVar.f14199b = f4;
        l(view, f4);
    }

    public void a(@N e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f14173a0 == null) {
            this.f14173a0 = new ArrayList();
        }
        this.f14173a0.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (E(childAt)) {
                if (D(childAt)) {
                    childAt.addFocusables(arrayList, i4, i5);
                    z3 = true;
                }
            } else {
                this.f14187o0.add(childAt);
            }
        }
        if (!z3) {
            int size = this.f14187o0.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = this.f14187o0.get(i7);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i4, i5);
                }
            }
        }
        this.f14187o0.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (o() == null && !E(view)) {
            C0823k0.R1(view, 1);
        } else {
            C0823k0.R1(view, 4);
        }
        if (!f14142J0) {
            C0823k0.B1(view, this.f14154E);
        }
    }

    void b() {
        if (!this.f14171V) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                getChildAt(i4).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f14171V = true;
        }
    }

    void b0(int i4, View view) {
        int i5;
        int F3 = this.f14160K.F();
        int F4 = this.f14161L.F();
        if (F3 != 1 && F4 != 1) {
            i5 = 2;
            if (F3 != 2 && F4 != 2) {
                i5 = 0;
            }
        } else {
            i5 = 1;
        }
        if (view != null && i4 == 0) {
            float f4 = ((f) view.getLayoutParams()).f14199b;
            if (f4 == 0.0f) {
                j(view);
            } else if (f4 == 1.0f) {
                k(view);
            }
        }
        if (i5 != this.f14164O) {
            this.f14164O = i5;
            List<e> list = this.f14173a0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f14173a0.get(size).c(i5);
                }
            }
        }
    }

    boolean c(View view, int i4) {
        if ((t(view) & i4) == i4) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // androidx.customview.widget.c
    public void close() {
        d(C.f13101b);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f4 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            f4 = Math.max(f4, ((f) getChildAt(i4).getLayoutParams()).f14199b);
        }
        this.f14158I = f4;
        boolean o4 = this.f14160K.o(true);
        boolean o5 = this.f14161L.o(true);
        if (o4 || o5) {
            C0823k0.n1(this);
        }
    }

    public void d(int i4) {
        e(i4, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f14158I > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                for (int i4 = childCount - 1; i4 >= 0; i4--) {
                    View childAt = getChildAt(i4);
                    if (H(x3, y3, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        int height = getHeight();
        boolean B3 = B(view);
        int width = getWidth();
        int save = canvas.save();
        int i4 = 0;
        if (B3) {
            int childCount = getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i5) {
                            i5 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i5, 0, width, getHeight());
            i4 = i5;
        }
        boolean drawChild = super.drawChild(canvas, view, j4);
        canvas.restoreToCount(save);
        float f4 = this.f14158I;
        if (f4 > 0.0f && B3) {
            this.f14159J.setColor((this.f14157H & C0823k0.f13588s) | (((int) ((((-16777216) & r2) >>> 24) * f4)) << 24));
            canvas.drawRect(i4, 0.0f, width, getHeight(), this.f14159J);
        } else if (this.f14177e0 != null && c(view, 3)) {
            int intrinsicWidth = this.f14177e0.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f14160K.B(), 1.0f));
            this.f14177e0.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f14177e0.setAlpha((int) (max * 255.0f));
            this.f14177e0.draw(canvas);
        } else if (this.f14178f0 != null && c(view, 5)) {
            int intrinsicWidth2 = this.f14178f0.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f14161L.B(), 1.0f));
            this.f14178f0.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f14178f0.setAlpha((int) (max2 * 255.0f));
            this.f14178f0.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i4, boolean z3) {
        View n4 = n(i4);
        if (n4 != null) {
            g(n4, z3);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i4));
    }

    public void f(@N View view) {
        g(view, true);
    }

    public void g(@N View view, boolean z3) {
        if (E(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f14166Q) {
                fVar.f14199b = 0.0f;
                fVar.f14201d = 0;
            } else if (z3) {
                fVar.f14201d |= 4;
                if (c(view, 3)) {
                    this.f14160K.X(view, -view.getWidth(), view.getTop());
                } else {
                    this.f14161L.X(view, getWidth(), view.getTop());
                }
            } else {
                J(view, 0.0f);
                b0(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (f14143K0) {
            return this.f14155F;
        }
        return 0.0f;
    }

    @P
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f14176d0;
    }

    public void h() {
        i(false);
    }

    void i(boolean z3) {
        boolean X3;
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f fVar = (f) childAt.getLayoutParams();
            if (E(childAt) && (!z3 || fVar.f14200c)) {
                int width = childAt.getWidth();
                if (c(childAt, 3)) {
                    X3 = this.f14160K.X(childAt, -width, childAt.getTop());
                } else {
                    X3 = this.f14161L.X(childAt, getWidth(), childAt.getTop());
                }
                z4 |= X3;
                fVar.f14200c = false;
            }
        }
        this.f14162M.p();
        this.f14163N.p();
        if (z4) {
            invalidate();
        }
    }

    @Override // androidx.customview.widget.c
    public boolean isOpen() {
        return C(C.f13101b);
    }

    void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f14201d & 1) == 1) {
            fVar.f14201d = 0;
            List<e> list = this.f14173a0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f14173a0.get(size).b(view);
                }
            }
            a0(view, false);
            Z(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f14201d & 1) == 0) {
            fVar.f14201d = 1;
            List<e> list = this.f14173a0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f14173a0.get(size).a(view);
                }
            }
            a0(view, true);
            Z(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f4) {
        List<e> list = this.f14173a0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f14173a0.get(size).d(view, f4);
            }
        }
    }

    View n(int i4) {
        int d4 = C.d(i4, C0823k0.Z(this)) & 7;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((t(childAt) & 7) == d4) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((((f) childAt.getLayoutParams()).f14201d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14166Q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14166Q = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i4;
        super.onDraw(canvas);
        if (this.f14182j0 && this.f14176d0 != null) {
            Object obj = this.f14181i0;
            if (obj != null) {
                i4 = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                this.f14176d0.setBounds(0, 0, getWidth(), i4);
                this.f14176d0.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0 != 3) goto L13;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            androidx.customview.widget.d r1 = r6.f14160K
            boolean r1 = r1.W(r7)
            androidx.customview.widget.d r2 = r6.f14161L
            boolean r2 = r2.W(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            androidx.customview.widget.d r7 = r6.f14160K
            boolean r7 = r7.f(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.a$i r7 = r6.f14162M
            r7.p()
            androidx.drawerlayout.widget.a$i r7 = r6.f14163N
            r7.p()
            goto L36
        L31:
            r6.i(r2)
            r6.f14171V = r3
        L36:
            r7 = r3
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f14174b0 = r0
            r6.f14175c0 = r7
            float r4 = r6.f14158I
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            androidx.customview.widget.d r4 = r6.f14160K
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.v(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r6.f14171V = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.y()
            if (r7 != 0) goto L70
            boolean r7 = r6.f14171V
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.a.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && z()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            View p4 = p();
            if (p4 != null && r(p4) == 0) {
                h();
            }
            if (p4 != null) {
                return true;
            }
            return false;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        WindowInsets rootWindowInsets;
        float f4;
        int i8;
        boolean z4;
        int i9;
        boolean z5 = true;
        this.f14165P = true;
        int i10 = i6 - i4;
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i12 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i12, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i12, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f5 = measuredWidth;
                        i8 = (-measuredWidth) + ((int) (fVar.f14199b * f5));
                        f4 = (measuredWidth + i8) / f5;
                    } else {
                        float f6 = measuredWidth;
                        f4 = (i10 - r11) / f6;
                        i8 = i10 - ((int) (fVar.f14199b * f6));
                    }
                    if (f4 != fVar.f14199b) {
                        z4 = z5;
                    } else {
                        z4 = false;
                    }
                    int i13 = fVar.f14198a & 112;
                    if (i13 != 16) {
                        if (i13 != 80) {
                            int i14 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                            childAt.layout(i8, i14, measuredWidth + i8, measuredHeight + i14);
                        } else {
                            int i15 = i7 - i5;
                            childAt.layout(i8, (i15 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i8, i15 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        }
                    } else {
                        int i16 = i7 - i5;
                        int i17 = (i16 - measuredHeight) / 2;
                        int i18 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i17 < i18) {
                            i17 = i18;
                        } else {
                            int i19 = i17 + measuredHeight;
                            int i20 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i19 > i16 - i20) {
                                i17 = (i16 - i20) - measuredHeight;
                            }
                        }
                        childAt.layout(i8, i17, measuredWidth + i8, measuredHeight + i17);
                    }
                    if (z4) {
                        Y(childAt, f4);
                    }
                    if (fVar.f14199b > 0.0f) {
                        i9 = 0;
                    } else {
                        i9 = 4;
                    }
                    if (childAt.getVisibility() != i9) {
                        childAt.setVisibility(i9);
                    }
                }
            }
            i11++;
            z5 = true;
        }
        if (f14145M0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            E n4 = Y0.K(rootWindowInsets).n();
            androidx.customview.widget.d dVar = this.f14160K;
            dVar.S(Math.max(dVar.A(), n4.f12399a));
            androidx.customview.widget.d dVar2 = this.f14161L;
            dVar2.S(Math.max(dVar2.A(), n4.f12401c));
        }
        this.f14165P = false;
        this.f14166Q = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i4, int i5) {
        boolean z3;
        boolean z4;
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f14181i0 != null && C0823k0.U(this)) {
            z3 = true;
        } else {
            z3 = false;
        }
        int Z3 = C0823k0.Z(this);
        int childCount = getChildCount();
        boolean z5 = false;
        boolean z6 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z3) {
                    int d4 = C.d(fVar.f14198a, Z3);
                    if (C0823k0.U(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.f14181i0;
                        if (d4 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (d4 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.f14181i0;
                        if (d4 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (d4 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else if (E(childAt)) {
                    if (f14143K0) {
                        float R3 = C0823k0.R(childAt);
                        float f4 = this.f14155F;
                        if (R3 != f4) {
                            C0823k0.N1(childAt, f4);
                        }
                    }
                    int t3 = t(childAt) & 7;
                    if (t3 == 3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((z4 && z5) || (!z4 && z6)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t3) + " but this " + f14146s0 + " already has a drawer view along that edge");
                    }
                    if (z4) {
                        z5 = true;
                    } else {
                        z6 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i4, this.f14156G + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i5, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i6 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View n4;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        int i4 = gVar.f14202G;
        if (i4 != 0 && (n4 = n(i4)) != null) {
            M(n4);
        }
        int i5 = gVar.f14203H;
        if (i5 != 3) {
            T(i5, 3);
        }
        int i6 = gVar.f14204I;
        if (i6 != 3) {
            T(i6, 5);
        }
        int i7 = gVar.f14205J;
        if (i7 != 3) {
            T(i7, C.f13101b);
        }
        int i8 = gVar.f14206K;
        if (i8 != 3) {
            T(i8, C.f13102c);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i4) {
        R();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z3;
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            f fVar = (f) getChildAt(i4).getLayoutParams();
            int i5 = fVar.f14201d;
            boolean z4 = true;
            if (i5 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i5 != 2) {
                z4 = false;
            }
            if (z3 || z4) {
                gVar.f14202G = fVar.f14198a;
                break;
            }
        }
        gVar.f14203H = this.f14167R;
        gVar.f14204I = this.f14168S;
        gVar.f14205J = this.f14169T;
        gVar.f14206K = this.f14170U;
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.customview.widget.d r0 = r6.f14160K
            r0.M(r7)
            androidx.customview.widget.d r0 = r6.f14161L
            r0.M(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6d
        L1a:
            r6.i(r2)
            r6.f14171V = r1
            goto L6d
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            androidx.customview.widget.d r3 = r6.f14160K
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.v(r4, r5)
            if (r3 == 0) goto L5a
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L5a
            float r3 = r6.f14174b0
            float r0 = r0 - r3
            float r3 = r6.f14175c0
            float r7 = r7 - r3
            androidx.customview.widget.d r3 = r6.f14160K
            int r3 = r3.E()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L5a
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L5b
        L5a:
            r1 = r2
        L5b:
            r6.i(r1)
            goto L6d
        L5f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f14174b0 = r0
            r6.f14175c0 = r7
            r6.f14171V = r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.customview.widget.c
    public void open() {
        K(C.f13101b);
    }

    View p() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int Z3 = C0823k0.Z(this);
        if (i4 != 3) {
            if (i4 != 5) {
                if (i4 != 8388611) {
                    if (i4 == 8388613) {
                        int i9 = this.f14170U;
                        if (i9 != 3) {
                            return i9;
                        }
                        if (Z3 == 0) {
                            i8 = this.f14168S;
                        } else {
                            i8 = this.f14167R;
                        }
                        if (i8 != 3) {
                            return i8;
                        }
                        return 0;
                    }
                    return 0;
                }
                int i10 = this.f14169T;
                if (i10 != 3) {
                    return i10;
                }
                if (Z3 == 0) {
                    i7 = this.f14167R;
                } else {
                    i7 = this.f14168S;
                }
                if (i7 != 3) {
                    return i7;
                }
                return 0;
            }
            int i11 = this.f14168S;
            if (i11 != 3) {
                return i11;
            }
            if (Z3 == 0) {
                i6 = this.f14170U;
            } else {
                i6 = this.f14169T;
            }
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        int i12 = this.f14167R;
        if (i12 != 3) {
            return i12;
        }
        if (Z3 == 0) {
            i5 = this.f14169T;
        } else {
            i5 = this.f14170U;
        }
        if (i5 != 3) {
            return i5;
        }
        return 0;
    }

    public int r(@N View view) {
        if (E(view)) {
            return q(((f) view.getLayoutParams()).f14198a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (z3) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f14165P) {
            super.requestLayout();
        }
    }

    @P
    public CharSequence s(int i4) {
        int d4 = C.d(i4, C0823k0.Z(this));
        if (d4 == 3) {
            return this.f14179g0;
        }
        if (d4 == 5) {
            return this.f14180h0;
        }
        return null;
    }

    public void setDrawerElevation(float f4) {
        this.f14155F = f4;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (E(childAt)) {
                C0823k0.N1(childAt, this.f14155F);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f14172W;
        if (eVar2 != null) {
            O(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f14172W = eVar;
    }

    public void setDrawerLockMode(int i4) {
        T(i4, 3);
        T(i4, 5);
    }

    public void setScrimColor(@InterfaceC0569l int i4) {
        this.f14157H = i4;
        invalidate();
    }

    public void setStatusBarBackground(@P Drawable drawable) {
        this.f14176d0 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@InterfaceC0569l int i4) {
        this.f14176d0 = new ColorDrawable(i4);
        invalidate();
    }

    int t(View view) {
        return C.d(((f) view.getLayoutParams()).f14198a, C0823k0.Z(this));
    }

    float u(View view) {
        return ((f) view.getLayoutParams()).f14199b;
    }

    public a(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, C2429a.C0548a.f57892b);
    }

    public a(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f14154E = new d();
        this.f14157H = f14135C0;
        this.f14159J = new Paint();
        this.f14166Q = true;
        this.f14167R = 3;
        this.f14168S = 3;
        this.f14169T = 3;
        this.f14170U = 3;
        this.f14183k0 = null;
        this.f14184l0 = null;
        this.f14185m0 = null;
        this.f14186n0 = null;
        this.f14190r0 = new C0121a();
        setDescendantFocusability(262144);
        float f4 = getResources().getDisplayMetrics().density;
        this.f14156G = (int) ((64.0f * f4) + 0.5f);
        float f5 = f4 * 400.0f;
        i iVar = new i(3);
        this.f14162M = iVar;
        i iVar2 = new i(5);
        this.f14163N = iVar2;
        androidx.customview.widget.d p4 = androidx.customview.widget.d.p(this, 1.0f, iVar);
        this.f14160K = p4;
        p4.T(1);
        p4.U(f5);
        iVar.q(p4);
        androidx.customview.widget.d p5 = androidx.customview.widget.d.p(this, 1.0f, iVar2);
        this.f14161L = p5;
        p5.T(2);
        p5.U(f5);
        iVar2.q(p5);
        setFocusableInTouchMode(true);
        C0823k0.R1(this, 1);
        C0823k0.B1(this, new c());
        setMotionEventSplittingEnabled(false);
        if (C0823k0.U(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f14147t0);
            try {
                this.f14176d0 = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C2429a.j.f58050g, i4, 0);
        try {
            if (obtainStyledAttributes2.hasValue(C2429a.j.f58051h)) {
                this.f14155F = obtainStyledAttributes2.getDimension(C2429a.j.f58051h, 0.0f);
            } else {
                this.f14155F = getResources().getDimension(C2429a.c.f57916h);
            }
            obtainStyledAttributes2.recycle();
            this.f14187o0 = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i4) {
        this.f14176d0 = i4 != 0 ? C0669d.i(getContext(), i4) : null;
        invalidate();
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: e, reason: collision with root package name */
        private static final int f14195e = 1;

        /* renamed from: f, reason: collision with root package name */
        private static final int f14196f = 2;

        /* renamed from: g, reason: collision with root package name */
        private static final int f14197g = 4;

        /* renamed from: a, reason: collision with root package name */
        public int f14198a;

        /* renamed from: b, reason: collision with root package name */
        float f14199b;

        /* renamed from: c, reason: collision with root package name */
        boolean f14200c;

        /* renamed from: d, reason: collision with root package name */
        int f14201d;

        public f(@N Context context, @P AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14198a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f14141I0);
            this.f14198a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(int i4, int i5) {
            super(i4, i5);
            this.f14198a = 0;
        }

        public f(int i4, int i5, int i6) {
            this(i4, i5);
            this.f14198a = i6;
        }

        public f(@N f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f14198a = 0;
            this.f14198a = fVar.f14198a;
        }

        public f(@N ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14198a = 0;
        }

        public f(@N ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f14198a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class g extends androidx.customview.view.a {
        public static final Parcelable.Creator<g> CREATOR = new C0122a();

        /* renamed from: G, reason: collision with root package name */
        int f14202G;

        /* renamed from: H, reason: collision with root package name */
        int f14203H;

        /* renamed from: I, reason: collision with root package name */
        int f14204I;

        /* renamed from: J, reason: collision with root package name */
        int f14205J;

        /* renamed from: K, reason: collision with root package name */
        int f14206K;

        /* renamed from: androidx.drawerlayout.widget.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0122a implements Parcelable.ClassLoaderCreator<g> {
            C0122a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i4) {
                return new g[i4];
            }
        }

        public g(@N Parcel parcel, @P ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14202G = 0;
            this.f14202G = parcel.readInt();
            this.f14203H = parcel.readInt();
            this.f14204I = parcel.readInt();
            this.f14205J = parcel.readInt();
            this.f14206K = parcel.readInt();
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f14202G);
            parcel.writeInt(this.f14203H);
            parcel.writeInt(this.f14204I);
            parcel.writeInt(this.f14205J);
            parcel.writeInt(this.f14206K);
        }

        public g(@N Parcelable parcelable) {
            super(parcelable);
            this.f14202G = 0;
        }
    }
}
