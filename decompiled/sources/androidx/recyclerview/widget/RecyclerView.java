package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.i0;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.C0832m0;
import androidx.core.view.InterfaceC0811g0;
import androidx.core.view.Q;
import androidx.core.view.S;
import androidx.core.view.T;
import androidx.core.view.V;
import androidx.core.view.accessibility.C0775b;
import androidx.core.view.accessibility.M;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.C0955a;
import androidx.recyclerview.widget.C0961g;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.K;
import androidx.recyclerview.widget.m;
import b0.C1002a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0811g0, S, T {

    /* renamed from: A1, reason: collision with root package name */
    static final int f17596A1 = 2000;

    /* renamed from: B1, reason: collision with root package name */
    static final String f17597B1 = "RV Scroll";

    /* renamed from: C1, reason: collision with root package name */
    private static final String f17598C1 = "RV OnLayout";

    /* renamed from: D1, reason: collision with root package name */
    private static final String f17599D1 = "RV FullInvalidate";

    /* renamed from: E1, reason: collision with root package name */
    private static final String f17600E1 = "RV PartialInvalidate";

    /* renamed from: F1, reason: collision with root package name */
    static final String f17601F1 = "RV OnBindView";

    /* renamed from: G1, reason: collision with root package name */
    static final String f17602G1 = "RV Prefetch";

    /* renamed from: H1, reason: collision with root package name */
    static final String f17603H1 = "RV Nested Prefetch";

    /* renamed from: I1, reason: collision with root package name */
    static final String f17604I1 = "RV CreateView";

    /* renamed from: J1, reason: collision with root package name */
    private static final Class<?>[] f17605J1;

    /* renamed from: K1, reason: collision with root package name */
    private static final int f17606K1 = -1;

    /* renamed from: L1, reason: collision with root package name */
    public static final int f17607L1 = 0;

    /* renamed from: M1, reason: collision with root package name */
    public static final int f17608M1 = 1;

    /* renamed from: N1, reason: collision with root package name */
    public static final int f17609N1 = 2;

    /* renamed from: O1, reason: collision with root package name */
    static final long f17610O1 = Long.MAX_VALUE;

    /* renamed from: P1, reason: collision with root package name */
    static final Interpolator f17611P1;

    /* renamed from: g1, reason: collision with root package name */
    static final String f17612g1 = "RecyclerView";

    /* renamed from: h1, reason: collision with root package name */
    static final boolean f17613h1 = false;

    /* renamed from: i1, reason: collision with root package name */
    static final boolean f17614i1 = false;

    /* renamed from: j1, reason: collision with root package name */
    private static final int[] f17615j1 = {R.attr.nestedScrollingEnabled};

    /* renamed from: k1, reason: collision with root package name */
    static final boolean f17616k1 = false;

    /* renamed from: l1, reason: collision with root package name */
    static final boolean f17617l1 = true;

    /* renamed from: m1, reason: collision with root package name */
    static final boolean f17618m1 = true;

    /* renamed from: n1, reason: collision with root package name */
    static final boolean f17619n1 = true;

    /* renamed from: o1, reason: collision with root package name */
    private static final boolean f17620o1 = false;

    /* renamed from: p1, reason: collision with root package name */
    private static final boolean f17621p1 = false;

    /* renamed from: q1, reason: collision with root package name */
    static final boolean f17622q1 = false;

    /* renamed from: r1, reason: collision with root package name */
    public static final int f17623r1 = 0;

    /* renamed from: s1, reason: collision with root package name */
    public static final int f17624s1 = 1;

    /* renamed from: t1, reason: collision with root package name */
    static final int f17625t1 = 1;

    /* renamed from: u1, reason: collision with root package name */
    public static final int f17626u1 = -1;

    /* renamed from: v1, reason: collision with root package name */
    public static final long f17627v1 = -1;

    /* renamed from: w1, reason: collision with root package name */
    public static final int f17628w1 = -1;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f17629x1 = 0;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f17630y1 = 1;

    /* renamed from: z1, reason: collision with root package name */
    public static final int f17631z1 = Integer.MIN_VALUE;

    /* renamed from: A0, reason: collision with root package name */
    private int f17632A0;

    /* renamed from: B0, reason: collision with root package name */
    private int f17633B0;

    /* renamed from: C0, reason: collision with root package name */
    private int f17634C0;

    /* renamed from: D0, reason: collision with root package name */
    private r f17635D0;

    /* renamed from: E, reason: collision with root package name */
    private final y f17636E;

    /* renamed from: E0, reason: collision with root package name */
    private final int f17637E0;

    /* renamed from: F, reason: collision with root package name */
    final w f17638F;

    /* renamed from: F0, reason: collision with root package name */
    private final int f17639F0;

    /* renamed from: G, reason: collision with root package name */
    z f17640G;

    /* renamed from: G0, reason: collision with root package name */
    private float f17641G0;

    /* renamed from: H, reason: collision with root package name */
    C0955a f17642H;

    /* renamed from: H0, reason: collision with root package name */
    private float f17643H0;

    /* renamed from: I, reason: collision with root package name */
    C0961g f17644I;

    /* renamed from: I0, reason: collision with root package name */
    private boolean f17645I0;

    /* renamed from: J, reason: collision with root package name */
    final K f17646J;

    /* renamed from: J0, reason: collision with root package name */
    final E f17647J0;

    /* renamed from: K, reason: collision with root package name */
    boolean f17648K;

    /* renamed from: K0, reason: collision with root package name */
    androidx.recyclerview.widget.m f17649K0;

    /* renamed from: L, reason: collision with root package name */
    final Runnable f17650L;

    /* renamed from: L0, reason: collision with root package name */
    m.b f17651L0;

    /* renamed from: M, reason: collision with root package name */
    final Rect f17652M;

    /* renamed from: M0, reason: collision with root package name */
    final C f17653M0;

    /* renamed from: N, reason: collision with root package name */
    private final Rect f17654N;

    /* renamed from: N0, reason: collision with root package name */
    private t f17655N0;

    /* renamed from: O, reason: collision with root package name */
    final RectF f17656O;

    /* renamed from: O0, reason: collision with root package name */
    private List<t> f17657O0;

    /* renamed from: P, reason: collision with root package name */
    Adapter f17658P;

    /* renamed from: P0, reason: collision with root package name */
    boolean f17659P0;

    /* renamed from: Q, reason: collision with root package name */
    @i0
    o f17660Q;

    /* renamed from: Q0, reason: collision with root package name */
    boolean f17661Q0;

    /* renamed from: R, reason: collision with root package name */
    x f17662R;

    /* renamed from: R0, reason: collision with root package name */
    private l.c f17663R0;

    /* renamed from: S, reason: collision with root package name */
    final List<x> f17664S;

    /* renamed from: S0, reason: collision with root package name */
    boolean f17665S0;

    /* renamed from: T, reason: collision with root package name */
    final ArrayList<n> f17666T;

    /* renamed from: T0, reason: collision with root package name */
    androidx.recyclerview.widget.A f17667T0;

    /* renamed from: U, reason: collision with root package name */
    private final ArrayList<s> f17668U;

    /* renamed from: U0, reason: collision with root package name */
    private j f17669U0;

    /* renamed from: V, reason: collision with root package name */
    private s f17670V;

    /* renamed from: V0, reason: collision with root package name */
    private final int[] f17671V0;

    /* renamed from: W, reason: collision with root package name */
    boolean f17672W;

    /* renamed from: W0, reason: collision with root package name */
    private V f17673W0;

    /* renamed from: X0, reason: collision with root package name */
    private final int[] f17674X0;

    /* renamed from: Y0, reason: collision with root package name */
    private final int[] f17675Y0;

    /* renamed from: Z0, reason: collision with root package name */
    final int[] f17676Z0;

    /* renamed from: a0, reason: collision with root package name */
    boolean f17677a0;

    /* renamed from: a1, reason: collision with root package name */
    @i0
    final List<F> f17678a1;

    /* renamed from: b0, reason: collision with root package name */
    boolean f17679b0;

    /* renamed from: b1, reason: collision with root package name */
    private Runnable f17680b1;

    /* renamed from: c0, reason: collision with root package name */
    @i0
    boolean f17681c0;

    /* renamed from: c1, reason: collision with root package name */
    private boolean f17682c1;

    /* renamed from: d0, reason: collision with root package name */
    private int f17683d0;

    /* renamed from: d1, reason: collision with root package name */
    private int f17684d1;

    /* renamed from: e0, reason: collision with root package name */
    boolean f17685e0;

    /* renamed from: e1, reason: collision with root package name */
    private int f17686e1;

    /* renamed from: f0, reason: collision with root package name */
    boolean f17687f0;

    /* renamed from: f1, reason: collision with root package name */
    private final K.b f17688f1;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f17689g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f17690h0;

    /* renamed from: i0, reason: collision with root package name */
    boolean f17691i0;

    /* renamed from: j0, reason: collision with root package name */
    private final AccessibilityManager f17692j0;

    /* renamed from: k0, reason: collision with root package name */
    private List<q> f17693k0;

    /* renamed from: l0, reason: collision with root package name */
    boolean f17694l0;

    /* renamed from: m0, reason: collision with root package name */
    boolean f17695m0;

    /* renamed from: n0, reason: collision with root package name */
    private int f17696n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f17697o0;

    /* renamed from: p0, reason: collision with root package name */
    @N
    private k f17698p0;

    /* renamed from: q0, reason: collision with root package name */
    private EdgeEffect f17699q0;

    /* renamed from: r0, reason: collision with root package name */
    private EdgeEffect f17700r0;

    /* renamed from: s0, reason: collision with root package name */
    private EdgeEffect f17701s0;

    /* renamed from: t0, reason: collision with root package name */
    private EdgeEffect f17702t0;

    /* renamed from: u0, reason: collision with root package name */
    l f17703u0;

    /* renamed from: v0, reason: collision with root package name */
    private int f17704v0;

    /* renamed from: w0, reason: collision with root package name */
    private int f17705w0;

    /* renamed from: x0, reason: collision with root package name */
    private VelocityTracker f17706x0;

    /* renamed from: y0, reason: collision with root package name */
    private int f17707y0;

    /* renamed from: z0, reason: collision with root package name */
    private int f17708z0;

    /* loaded from: classes.dex */
    public static class A implements s {
        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(@N RecyclerView recyclerView, @N MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean c(@N RecyclerView recyclerView, @N MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void e(boolean z3) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Adapter<VH extends F> {

        /* renamed from: a, reason: collision with root package name */
        private final h f17709a = new h();

        /* renamed from: b, reason: collision with root package name */
        private boolean f17710b = false;

        /* renamed from: c, reason: collision with root package name */
        private StateRestorationPolicy f17711c = StateRestorationPolicy.ALLOW;

        /* loaded from: classes.dex */
        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void A(int i4) {
            this.f17709a.g(i4, 1);
        }

        public void B(@N RecyclerView recyclerView) {
        }

        public abstract void C(@N VH vh, int i4);

        public void D(@N VH vh, int i4, @N List<Object> list) {
            C(vh, i4);
        }

        @N
        public abstract VH E(@N ViewGroup viewGroup, int i4);

        public void F(@N RecyclerView recyclerView) {
        }

        public boolean G(@N VH vh) {
            return false;
        }

        public void H(@N VH vh) {
        }

        public void I(@N VH vh) {
        }

        public void J(@N VH vh) {
        }

        public void K(@N i iVar) {
            this.f17709a.registerObserver(iVar);
        }

        public void L(boolean z3) {
            if (!p()) {
                this.f17710b = z3;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void M(@N StateRestorationPolicy stateRestorationPolicy) {
            this.f17711c = stateRestorationPolicy;
            this.f17709a.h();
        }

        public void N(@N i iVar) {
            this.f17709a.unregisterObserver(iVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void h(@N VH vh, int i4) {
            boolean z3;
            if (vh.f17788s == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                vh.f17772c = i4;
                if (q()) {
                    vh.f17774e = m(i4);
                }
                vh.J(1, 519);
                androidx.core.os.L.b(RecyclerView.f17601F1);
            }
            vh.f17788s = this;
            D(vh, i4, vh.s());
            if (z3) {
                vh.d();
                ViewGroup.LayoutParams layoutParams = vh.f17770a.getLayoutParams();
                if (layoutParams instanceof p) {
                    ((p) layoutParams).f17842c = true;
                }
                androidx.core.os.L.d();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean i() {
            int i4 = g.f17794a[this.f17711c.ordinal()];
            if (i4 == 1) {
                return false;
            }
            if (i4 == 2 && l() <= 0) {
                return false;
            }
            return true;
        }

        @N
        public final VH j(@N ViewGroup viewGroup, int i4) {
            try {
                androidx.core.os.L.b(RecyclerView.f17604I1);
                VH E3 = E(viewGroup, i4);
                if (E3.f17770a.getParent() == null) {
                    E3.f17775f = i4;
                    return E3;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                androidx.core.os.L.d();
            }
        }

        public int k(@N Adapter<? extends F> adapter, @N F f4, int i4) {
            if (adapter == this) {
                return i4;
            }
            return -1;
        }

        public abstract int l();

        public long m(int i4) {
            return -1L;
        }

        public int n(int i4) {
            return 0;
        }

        @N
        public final StateRestorationPolicy o() {
            return this.f17711c;
        }

        public final boolean p() {
            return this.f17709a.a();
        }

        public final boolean q() {
            return this.f17710b;
        }

        public final void r() {
            this.f17709a.b();
        }

        public final void s(int i4) {
            this.f17709a.d(i4, 1);
        }

        public final void t(int i4, @P Object obj) {
            this.f17709a.e(i4, 1, obj);
        }

        public final void u(int i4) {
            this.f17709a.f(i4, 1);
        }

        public final void v(int i4, int i5) {
            this.f17709a.c(i4, i5);
        }

        public final void w(int i4, int i5) {
            this.f17709a.d(i4, i5);
        }

        public final void x(int i4, int i5, @P Object obj) {
            this.f17709a.e(i4, i5, obj);
        }

        public final void y(int i4, int i5) {
            this.f17709a.f(i4, i5);
        }

        public final void z(int i4, int i5) {
            this.f17709a.g(i4, i5);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class B {

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView f17713b;

        /* renamed from: c, reason: collision with root package name */
        private o f17714c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f17715d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17716e;

        /* renamed from: f, reason: collision with root package name */
        private View f17717f;

        /* renamed from: h, reason: collision with root package name */
        private boolean f17719h;

        /* renamed from: a, reason: collision with root package name */
        private int f17712a = -1;

        /* renamed from: g, reason: collision with root package name */
        private final a f17718g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: h, reason: collision with root package name */
            public static final int f17720h = Integer.MIN_VALUE;

            /* renamed from: a, reason: collision with root package name */
            private int f17721a;

            /* renamed from: b, reason: collision with root package name */
            private int f17722b;

            /* renamed from: c, reason: collision with root package name */
            private int f17723c;

            /* renamed from: d, reason: collision with root package name */
            private int f17724d;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f17725e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f17726f;

            /* renamed from: g, reason: collision with root package name */
            private int f17727g;

            public a(@U int i4, @U int i5) {
                this(i4, i5, Integer.MIN_VALUE, null);
            }

            private void m() {
                if (this.f17725e != null && this.f17723c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f17723c >= 1) {
                } else {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public int a() {
                return this.f17723c;
            }

            @U
            public int b() {
                return this.f17721a;
            }

            @U
            public int c() {
                return this.f17722b;
            }

            @P
            public Interpolator d() {
                return this.f17725e;
            }

            boolean e() {
                if (this.f17724d >= 0) {
                    return true;
                }
                return false;
            }

            public void f(int i4) {
                this.f17724d = i4;
            }

            void g(RecyclerView recyclerView) {
                int i4 = this.f17724d;
                if (i4 >= 0) {
                    this.f17724d = -1;
                    recyclerView.Q0(i4);
                    this.f17726f = false;
                } else {
                    if (this.f17726f) {
                        m();
                        recyclerView.f17647J0.e(this.f17721a, this.f17722b, this.f17723c, this.f17725e);
                        int i5 = this.f17727g + 1;
                        this.f17727g = i5;
                        if (i5 > 10) {
                            Log.e(RecyclerView.f17612g1, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f17726f = false;
                        return;
                    }
                    this.f17727g = 0;
                }
            }

            public void h(int i4) {
                this.f17726f = true;
                this.f17723c = i4;
            }

            public void i(@U int i4) {
                this.f17726f = true;
                this.f17721a = i4;
            }

            public void j(@U int i4) {
                this.f17726f = true;
                this.f17722b = i4;
            }

            public void k(@P Interpolator interpolator) {
                this.f17726f = true;
                this.f17725e = interpolator;
            }

            public void l(@U int i4, @U int i5, int i6, @P Interpolator interpolator) {
                this.f17721a = i4;
                this.f17722b = i5;
                this.f17723c = i6;
                this.f17725e = interpolator;
                this.f17726f = true;
            }

            public a(@U int i4, @U int i5, int i6) {
                this(i4, i5, i6, null);
            }

            public a(@U int i4, @U int i5, int i6, @P Interpolator interpolator) {
                this.f17724d = -1;
                this.f17726f = false;
                this.f17727g = 0;
                this.f17721a = i4;
                this.f17722b = i5;
                this.f17723c = i6;
                this.f17725e = interpolator;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            @P
            PointF a(int i4);
        }

        @P
        public PointF a(int i4) {
            Object e4 = e();
            if (e4 instanceof b) {
                return ((b) e4).a(i4);
            }
            Log.w(RecyclerView.f17612g1, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i4) {
            return this.f17713b.f17660Q.J(i4);
        }

        public int c() {
            return this.f17713b.f17660Q.Q();
        }

        public int d(View view) {
            return this.f17713b.r0(view);
        }

        @P
        public o e() {
            return this.f17714c;
        }

        public int f() {
            return this.f17712a;
        }

        @Deprecated
        public void g(int i4) {
            this.f17713b.G1(i4);
        }

        public boolean h() {
            return this.f17715d;
        }

        public boolean i() {
            return this.f17716e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void j(@N PointF pointF) {
            float f4 = pointF.x;
            float f5 = pointF.y;
            float sqrt = (float) Math.sqrt((f4 * f4) + (f5 * f5));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void k(int i4, int i5) {
            PointF a4;
            RecyclerView recyclerView = this.f17713b;
            if (this.f17712a == -1 || recyclerView == null) {
                s();
            }
            if (this.f17715d && this.f17717f == null && this.f17714c != null && (a4 = a(this.f17712a)) != null) {
                float f4 = a4.x;
                if (f4 != 0.0f || a4.y != 0.0f) {
                    recyclerView.F1((int) Math.signum(f4), (int) Math.signum(a4.y), null);
                }
            }
            this.f17715d = false;
            View view = this.f17717f;
            if (view != null) {
                if (d(view) == this.f17712a) {
                    p(this.f17717f, recyclerView.f17653M0, this.f17718g);
                    this.f17718g.g(recyclerView);
                    s();
                } else {
                    Log.e(RecyclerView.f17612g1, "Passed over target position while smooth scrolling.");
                    this.f17717f = null;
                }
            }
            if (this.f17716e) {
                m(i4, i5, recyclerView.f17653M0, this.f17718g);
                boolean e4 = this.f17718g.e();
                this.f17718g.g(recyclerView);
                if (e4 && this.f17716e) {
                    this.f17715d = true;
                    recyclerView.f17647J0.d();
                }
            }
        }

        protected void l(View view) {
            if (d(view) == f()) {
                this.f17717f = view;
            }
        }

        protected abstract void m(@U int i4, @U int i5, @N C c4, @N a aVar);

        protected abstract void n();

        protected abstract void o();

        protected abstract void p(@N View view, @N C c4, @N a aVar);

        public void q(int i4) {
            this.f17712a = i4;
        }

        void r(RecyclerView recyclerView, o oVar) {
            recyclerView.f17647J0.f();
            if (this.f17719h) {
                Log.w(RecyclerView.f17612g1, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f17713b = recyclerView;
            this.f17714c = oVar;
            int i4 = this.f17712a;
            if (i4 != -1) {
                recyclerView.f17653M0.f17731a = i4;
                this.f17716e = true;
                this.f17715d = true;
                this.f17717f = b(f());
                n();
                this.f17713b.f17647J0.d();
                this.f17719h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void s() {
            if (!this.f17716e) {
                return;
            }
            this.f17716e = false;
            o();
            this.f17713b.f17653M0.f17731a = -1;
            this.f17717f = null;
            this.f17712a = -1;
            this.f17715d = false;
            this.f17714c.w1(this);
            this.f17714c = null;
            this.f17713b = null;
        }
    }

    /* loaded from: classes.dex */
    public static class C {

        /* renamed from: r, reason: collision with root package name */
        static final int f17728r = 1;

        /* renamed from: s, reason: collision with root package name */
        static final int f17729s = 2;

        /* renamed from: t, reason: collision with root package name */
        static final int f17730t = 4;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f17732b;

        /* renamed from: m, reason: collision with root package name */
        int f17743m;

        /* renamed from: n, reason: collision with root package name */
        long f17744n;

        /* renamed from: o, reason: collision with root package name */
        int f17745o;

        /* renamed from: p, reason: collision with root package name */
        int f17746p;

        /* renamed from: q, reason: collision with root package name */
        int f17747q;

        /* renamed from: a, reason: collision with root package name */
        int f17731a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f17733c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f17734d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f17735e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f17736f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f17737g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f17738h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f17739i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f17740j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f17741k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f17742l = false;

        void a(int i4) {
            if ((this.f17735e & i4) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i4) + " but it is " + Integer.toBinaryString(this.f17735e));
        }

        public boolean b() {
            return this.f17737g;
        }

        public <T> T c(int i4) {
            SparseArray<Object> sparseArray = this.f17732b;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i4);
        }

        public int d() {
            if (this.f17738h) {
                return this.f17733c - this.f17734d;
            }
            return this.f17736f;
        }

        public int e() {
            return this.f17746p;
        }

        public int f() {
            return this.f17747q;
        }

        public int g() {
            return this.f17731a;
        }

        public boolean h() {
            if (this.f17731a != -1) {
                return true;
            }
            return false;
        }

        public boolean i() {
            return this.f17740j;
        }

        public boolean j() {
            return this.f17738h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void k(Adapter adapter) {
            this.f17735e = 1;
            this.f17736f = adapter.l();
            this.f17738h = false;
            this.f17739i = false;
            this.f17740j = false;
        }

        public void l(int i4, Object obj) {
            if (this.f17732b == null) {
                this.f17732b = new SparseArray<>();
            }
            this.f17732b.put(i4, obj);
        }

        public void m(int i4) {
            SparseArray<Object> sparseArray = this.f17732b;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i4);
        }

        public boolean n() {
            return this.f17742l;
        }

        public boolean o() {
            return this.f17741k;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f17731a + ", mData=" + this.f17732b + ", mItemCount=" + this.f17736f + ", mIsMeasuring=" + this.f17740j + ", mPreviousLayoutItemCount=" + this.f17733c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f17734d + ", mStructureChanged=" + this.f17737g + ", mInPreLayout=" + this.f17738h + ", mRunSimpleAnimations=" + this.f17741k + ", mRunPredictiveAnimations=" + this.f17742l + '}';
        }
    }

    /* loaded from: classes.dex */
    public static abstract class D {
        @P
        public abstract View a(@N w wVar, int i4, int i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class E implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        private int f17748E;

        /* renamed from: F, reason: collision with root package name */
        private int f17749F;

        /* renamed from: G, reason: collision with root package name */
        OverScroller f17750G;

        /* renamed from: H, reason: collision with root package name */
        Interpolator f17751H;

        /* renamed from: I, reason: collision with root package name */
        private boolean f17752I;

        /* renamed from: J, reason: collision with root package name */
        private boolean f17753J;

        E() {
            Interpolator interpolator = RecyclerView.f17611P1;
            this.f17751H = interpolator;
            this.f17752I = false;
            this.f17753J = false;
            this.f17750G = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i4, int i5) {
            boolean z3;
            int height;
            int abs = Math.abs(i4);
            int abs2 = Math.abs(i5);
            if (abs > abs2) {
                z3 = true;
            } else {
                z3 = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z3) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z3) {
                abs = abs2;
            }
            return Math.min((int) (((abs / height) + 1.0f) * 300.0f), RecyclerView.f17596A1);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            C0823k0.p1(RecyclerView.this, this);
        }

        public void b(int i4, int i5) {
            RecyclerView.this.setScrollState(2);
            this.f17749F = 0;
            this.f17748E = 0;
            Interpolator interpolator = this.f17751H;
            Interpolator interpolator2 = RecyclerView.f17611P1;
            if (interpolator != interpolator2) {
                this.f17751H = interpolator2;
                this.f17750G = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f17750G.fling(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f17752I) {
                this.f17753J = true;
            } else {
                c();
            }
        }

        public void e(int i4, int i5, int i6, @P Interpolator interpolator) {
            if (i6 == Integer.MIN_VALUE) {
                i6 = a(i4, i5);
            }
            int i7 = i6;
            if (interpolator == null) {
                interpolator = RecyclerView.f17611P1;
            }
            if (this.f17751H != interpolator) {
                this.f17751H = interpolator;
                this.f17750G = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f17749F = 0;
            this.f17748E = 0;
            RecyclerView.this.setScrollState(2);
            this.f17750G.startScroll(0, 0, i4, i5, i7);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f17750G.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4;
            int i5;
            boolean z3;
            boolean z4;
            boolean z5;
            int i6;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f17660Q == null) {
                f();
                return;
            }
            this.f17753J = false;
            this.f17752I = true;
            recyclerView.F();
            OverScroller overScroller = this.f17750G;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i7 = currX - this.f17748E;
                int i8 = currY - this.f17749F;
                this.f17748E = currX;
                this.f17749F = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f17676Z0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.b(i7, i8, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f17676Z0;
                    i7 -= iArr2[0];
                    i8 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.E(i7, i8);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f17658P != null) {
                    int[] iArr3 = recyclerView3.f17676Z0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.F1(i7, i8, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f17676Z0;
                    i5 = iArr4[0];
                    i4 = iArr4[1];
                    i7 -= i5;
                    i8 -= i4;
                    B b4 = recyclerView4.f17660Q.f17822g;
                    if (b4 != null && !b4.h() && b4.i()) {
                        int d4 = RecyclerView.this.f17653M0.d();
                        if (d4 == 0) {
                            b4.s();
                        } else if (b4.f() >= d4) {
                            b4.q(d4 - 1);
                            b4.k(i5, i4);
                        } else {
                            b4.k(i5, i4);
                        }
                    }
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (!RecyclerView.this.f17666T.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f17676Z0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.c(i5, i4, i7, i8, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f17676Z0;
                int i9 = i7 - iArr6[0];
                int i10 = i8 - iArr6[1];
                if (i5 != 0 || i4 != 0) {
                    recyclerView6.R(i5, i4);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!overScroller.isFinished() && ((!z3 && i9 == 0) || (!z4 && i10 == 0))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                B b5 = RecyclerView.this.f17660Q.f17822g;
                if ((b5 == null || !b5.h()) && z5) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i9 < 0) {
                            i6 = -currVelocity;
                        } else if (i9 > 0) {
                            i6 = currVelocity;
                        } else {
                            i6 = 0;
                        }
                        if (i10 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i10 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.h(i6, currVelocity);
                    }
                    if (RecyclerView.f17619n1) {
                        RecyclerView.this.f17651L0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.m mVar = recyclerView7.f17649K0;
                    if (mVar != null) {
                        mVar.f(recyclerView7, i5, i4);
                    }
                }
            }
            B b6 = RecyclerView.this.f17660Q.f17822g;
            if (b6 != null && b6.h()) {
                b6.k(0, 0);
            }
            this.f17752I = false;
            if (this.f17753J) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.g(1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class F {

        /* renamed from: A, reason: collision with root package name */
        static final int f17755A = 256;

        /* renamed from: B, reason: collision with root package name */
        static final int f17756B = 512;

        /* renamed from: C, reason: collision with root package name */
        static final int f17757C = 1024;

        /* renamed from: D, reason: collision with root package name */
        static final int f17758D = 2048;

        /* renamed from: E, reason: collision with root package name */
        static final int f17759E = 4096;

        /* renamed from: F, reason: collision with root package name */
        static final int f17760F = -1;

        /* renamed from: G, reason: collision with root package name */
        static final int f17761G = 8192;

        /* renamed from: H, reason: collision with root package name */
        private static final List<Object> f17762H = Collections.emptyList();

        /* renamed from: t, reason: collision with root package name */
        static final int f17763t = 1;

        /* renamed from: u, reason: collision with root package name */
        static final int f17764u = 2;

        /* renamed from: v, reason: collision with root package name */
        static final int f17765v = 4;

        /* renamed from: w, reason: collision with root package name */
        static final int f17766w = 8;

        /* renamed from: x, reason: collision with root package name */
        static final int f17767x = 16;

        /* renamed from: y, reason: collision with root package name */
        static final int f17768y = 32;

        /* renamed from: z, reason: collision with root package name */
        static final int f17769z = 128;

        /* renamed from: a, reason: collision with root package name */
        @N
        public final View f17770a;

        /* renamed from: b, reason: collision with root package name */
        WeakReference<RecyclerView> f17771b;

        /* renamed from: j, reason: collision with root package name */
        int f17779j;

        /* renamed from: r, reason: collision with root package name */
        RecyclerView f17787r;

        /* renamed from: s, reason: collision with root package name */
        Adapter<? extends F> f17788s;

        /* renamed from: c, reason: collision with root package name */
        int f17772c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f17773d = -1;

        /* renamed from: e, reason: collision with root package name */
        long f17774e = -1;

        /* renamed from: f, reason: collision with root package name */
        int f17775f = -1;

        /* renamed from: g, reason: collision with root package name */
        int f17776g = -1;

        /* renamed from: h, reason: collision with root package name */
        F f17777h = null;

        /* renamed from: i, reason: collision with root package name */
        F f17778i = null;

        /* renamed from: k, reason: collision with root package name */
        List<Object> f17780k = null;

        /* renamed from: l, reason: collision with root package name */
        List<Object> f17781l = null;

        /* renamed from: m, reason: collision with root package name */
        private int f17782m = 0;

        /* renamed from: n, reason: collision with root package name */
        w f17783n = null;

        /* renamed from: o, reason: collision with root package name */
        boolean f17784o = false;

        /* renamed from: p, reason: collision with root package name */
        private int f17785p = 0;

        /* renamed from: q, reason: collision with root package name */
        @i0
        int f17786q = -1;

        public F(@N View view) {
            if (view != null) {
                this.f17770a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void g() {
            if (this.f17780k == null) {
                ArrayList arrayList = new ArrayList();
                this.f17780k = arrayList;
                this.f17781l = Collections.unmodifiableList(arrayList);
            }
        }

        boolean A() {
            if (this.f17783n != null) {
                return true;
            }
            return false;
        }

        boolean B() {
            if ((this.f17779j & 256) != 0) {
                return true;
            }
            return false;
        }

        boolean C() {
            if ((this.f17779j & 2) != 0) {
                return true;
            }
            return false;
        }

        boolean D() {
            if ((this.f17779j & 2) != 0) {
                return true;
            }
            return false;
        }

        void E(int i4, boolean z3) {
            if (this.f17773d == -1) {
                this.f17773d = this.f17772c;
            }
            if (this.f17776g == -1) {
                this.f17776g = this.f17772c;
            }
            if (z3) {
                this.f17776g += i4;
            }
            this.f17772c += i4;
            if (this.f17770a.getLayoutParams() != null) {
                ((p) this.f17770a.getLayoutParams()).f17842c = true;
            }
        }

        void F(RecyclerView recyclerView) {
            int i4 = this.f17786q;
            if (i4 != -1) {
                this.f17785p = i4;
            } else {
                this.f17785p = C0823k0.V(this.f17770a);
            }
            recyclerView.I1(this, 4);
        }

        void G(RecyclerView recyclerView) {
            recyclerView.I1(this, this.f17785p);
            this.f17785p = 0;
        }

        void H() {
            this.f17779j = 0;
            this.f17772c = -1;
            this.f17773d = -1;
            this.f17774e = -1L;
            this.f17776g = -1;
            this.f17782m = 0;
            this.f17777h = null;
            this.f17778i = null;
            d();
            this.f17785p = 0;
            this.f17786q = -1;
            RecyclerView.A(this);
        }

        void I() {
            if (this.f17773d == -1) {
                this.f17773d = this.f17772c;
            }
        }

        void J(int i4, int i5) {
            this.f17779j = (i4 & i5) | (this.f17779j & (~i5));
        }

        public final void K(boolean z3) {
            int i4;
            int i5 = this.f17782m;
            if (z3) {
                i4 = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
            this.f17782m = i4;
            if (i4 < 0) {
                this.f17782m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z3 && i4 == 1) {
                this.f17779j |= 16;
            } else if (z3 && i4 == 0) {
                this.f17779j &= -17;
            }
        }

        void L(w wVar, boolean z3) {
            this.f17783n = wVar;
            this.f17784o = z3;
        }

        boolean M() {
            if ((this.f17779j & 16) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean N() {
            if ((this.f17779j & 128) != 0) {
                return true;
            }
            return false;
        }

        void O() {
            this.f17779j &= -129;
        }

        void P() {
            this.f17783n.K(this);
        }

        boolean Q() {
            if ((this.f17779j & 32) != 0) {
                return true;
            }
            return false;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f17779j) == 0) {
                g();
                this.f17780k.add(obj);
            }
        }

        void b(int i4) {
            this.f17779j = i4 | this.f17779j;
        }

        void c() {
            this.f17773d = -1;
            this.f17776g = -1;
        }

        void d() {
            List<Object> list = this.f17780k;
            if (list != null) {
                list.clear();
            }
            this.f17779j &= -1025;
        }

        void e() {
            this.f17779j &= -33;
        }

        void f() {
            this.f17779j &= -257;
        }

        boolean h() {
            if ((this.f17779j & 16) == 0 && C0823k0.M0(this.f17770a)) {
                return true;
            }
            return false;
        }

        void i(int i4, int i5, boolean z3) {
            b(8);
            E(i5, z3);
            this.f17772c = i4;
        }

        public final int j() {
            RecyclerView recyclerView = this.f17787r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.n0(this);
        }

        @Deprecated
        public final int k() {
            return m();
        }

        @P
        public final Adapter<? extends F> l() {
            return this.f17788s;
        }

        public final int m() {
            RecyclerView recyclerView;
            Adapter adapter;
            int n02;
            if (this.f17788s == null || (recyclerView = this.f17787r) == null || (adapter = recyclerView.getAdapter()) == null || (n02 = this.f17787r.n0(this)) == -1) {
                return -1;
            }
            return adapter.k(this.f17788s, this, n02);
        }

        public final long n() {
            return this.f17774e;
        }

        public final int o() {
            return this.f17775f;
        }

        public final int p() {
            int i4 = this.f17776g;
            if (i4 == -1) {
                return this.f17772c;
            }
            return i4;
        }

        public final int q() {
            return this.f17773d;
        }

        @Deprecated
        public final int r() {
            int i4 = this.f17776g;
            if (i4 == -1) {
                return this.f17772c;
            }
            return i4;
        }

        List<Object> s() {
            if ((this.f17779j & 1024) == 0) {
                List<Object> list = this.f17780k;
                if (list != null && list.size() != 0) {
                    return this.f17781l;
                }
                return f17762H;
            }
            return f17762H;
        }

        boolean t(int i4) {
            if ((i4 & this.f17779j) != 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f17772c + " id=" + this.f17774e + ", oldPos=" + this.f17773d + ", pLpos:" + this.f17776g);
            if (A()) {
                sb.append(" scrap ");
                if (this.f17784o) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb.append(str);
            }
            if (x()) {
                sb.append(" invalid");
            }
            if (!w()) {
                sb.append(" unbound");
            }
            if (D()) {
                sb.append(" update");
            }
            if (z()) {
                sb.append(" removed");
            }
            if (N()) {
                sb.append(" ignored");
            }
            if (B()) {
                sb.append(" tmpDetached");
            }
            if (!y()) {
                sb.append(" not recyclable(" + this.f17782m + ")");
            }
            if (u()) {
                sb.append(" undefined adapter position");
            }
            if (this.f17770a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        boolean u() {
            if ((this.f17779j & 512) == 0 && !x()) {
                return false;
            }
            return true;
        }

        boolean v() {
            if (this.f17770a.getParent() != null && this.f17770a.getParent() != this.f17787r) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean w() {
            if ((this.f17779j & 1) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean x() {
            if ((this.f17779j & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean y() {
            if ((this.f17779j & 16) == 0 && !C0823k0.M0(this.f17770a)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean z() {
            if ((this.f17779j & 8) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    class RunnableC0949a implements Runnable {
        RunnableC0949a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f17681c0 && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f17672W) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f17687f0) {
                    recyclerView2.f17685e0 = true;
                } else {
                    recyclerView2.F();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    class RunnableC0950b implements Runnable {
        RunnableC0950b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.f17703u0;
            if (lVar != null) {
                lVar.x();
            }
            RecyclerView.this.f17665S0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    class InterpolatorC0951c implements Interpolator {
        InterpolatorC0951c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    class C0952d implements K.b {
        C0952d() {
        }

        @Override // androidx.recyclerview.widget.K.b
        public void a(F f4) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f17660Q.F1(f4.f17770a, recyclerView.f17638F);
        }

        @Override // androidx.recyclerview.widget.K.b
        public void b(F f4, l.d dVar, l.d dVar2) {
            RecyclerView.this.t(f4, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.K.b
        public void c(F f4, @N l.d dVar, @P l.d dVar2) {
            RecyclerView.this.f17638F.K(f4);
            RecyclerView.this.v(f4, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.K.b
        public void d(F f4, @N l.d dVar, @N l.d dVar2) {
            f4.K(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f17694l0) {
                if (recyclerView.f17703u0.b(f4, f4, dVar, dVar2)) {
                    RecyclerView.this.i1();
                }
            } else if (recyclerView.f17703u0.d(f4, dVar, dVar2)) {
                RecyclerView.this.i1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$e, reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public class C0953e implements C0961g.b {
        C0953e() {
        }

        @Override // androidx.recyclerview.widget.C0961g.b
        public View a(int i4) {
            return RecyclerView.this.getChildAt(i4);
        }

        @Override // androidx.recyclerview.widget.C0961g.b
        public void b(View view) {
            F u02 = RecyclerView.u0(view);
            if (u02 != null) {
                u02.F(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0961g.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C0961g.b
        public void d() {
            int c4 = c();
            for (int i4 = 0; i4 < c4; i4++) {
                View a4 = a(i4);
                RecyclerView.this.K(a4);
                a4.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C0961g.b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C0961g.b
        public F f(View view) {
            return RecyclerView.u0(view);
        }

        @Override // androidx.recyclerview.widget.C0961g.b
        public void g(int i4) {
            F u02;
            View a4 = a(i4);
            if (a4 != null && (u02 = RecyclerView.u0(a4)) != null) {
                if (u02.B() && !u02.N()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + u02 + RecyclerView.this.Y());
                }
                u02.b(256);
            }
            RecyclerView.this.detachViewFromParent(i4);
        }

        @Override // androidx.recyclerview.widget.C0961g.b
        public void h(View view) {
            F u02 = RecyclerView.u0(view);
            if (u02 != null) {
                u02.G(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0961g.b
        public void i(View view, int i4) {
            RecyclerView.this.addView(view, i4);
            RecyclerView.this.J(view);
        }

        @Override // androidx.recyclerview.widget.C0961g.b
        public void j(int i4) {
            View childAt = RecyclerView.this.getChildAt(i4);
            if (childAt != null) {
                RecyclerView.this.K(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i4);
        }

        @Override // androidx.recyclerview.widget.C0961g.b
        public void k(View view, int i4, ViewGroup.LayoutParams layoutParams) {
            F u02 = RecyclerView.u0(view);
            if (u02 != null) {
                if (!u02.B() && !u02.N()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + u02 + RecyclerView.this.Y());
                }
                u02.f();
            }
            RecyclerView.this.attachViewToParent(view, i4, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$f, reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public class C0954f implements C0955a.InterfaceC0168a {
        C0954f() {
        }

        @Override // androidx.recyclerview.widget.C0955a.InterfaceC0168a
        public void a(int i4, int i5) {
            RecyclerView.this.Y0(i4, i5);
            RecyclerView.this.f17659P0 = true;
        }

        @Override // androidx.recyclerview.widget.C0955a.InterfaceC0168a
        public void b(C0955a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0955a.InterfaceC0168a
        public void c(int i4, int i5, Object obj) {
            RecyclerView.this.U1(i4, i5, obj);
            RecyclerView.this.f17661Q0 = true;
        }

        @Override // androidx.recyclerview.widget.C0955a.InterfaceC0168a
        public void d(C0955a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0955a.InterfaceC0168a
        public F e(int i4) {
            F l02 = RecyclerView.this.l0(i4, true);
            if (l02 == null || RecyclerView.this.f17644I.n(l02.f17770a)) {
                return null;
            }
            return l02;
        }

        @Override // androidx.recyclerview.widget.C0955a.InterfaceC0168a
        public void f(int i4, int i5) {
            RecyclerView.this.Z0(i4, i5, false);
            RecyclerView.this.f17659P0 = true;
        }

        @Override // androidx.recyclerview.widget.C0955a.InterfaceC0168a
        public void g(int i4, int i5) {
            RecyclerView.this.X0(i4, i5);
            RecyclerView.this.f17659P0 = true;
        }

        @Override // androidx.recyclerview.widget.C0955a.InterfaceC0168a
        public void h(int i4, int i5) {
            RecyclerView.this.Z0(i4, i5, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f17659P0 = true;
            recyclerView.f17653M0.f17734d += i5;
        }

        void i(C0955a.b bVar) {
            int i4 = bVar.f17948a;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 == 8) {
                            RecyclerView recyclerView = RecyclerView.this;
                            recyclerView.f17660Q.k1(recyclerView, bVar.f17949b, bVar.f17951d, 1);
                            return;
                        }
                        return;
                    }
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.f17660Q.n1(recyclerView2, bVar.f17949b, bVar.f17951d, bVar.f17950c);
                    return;
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f17660Q.l1(recyclerView3, bVar.f17949b, bVar.f17951d);
                return;
            }
            RecyclerView recyclerView4 = RecyclerView.this;
            recyclerView4.f17660Q.i1(recyclerView4, bVar.f17949b, bVar.f17951d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17794a;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f17794a = iArr;
            try {
                iArr[Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17794a[Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h extends Observable<i> {
        h() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i4, int i5) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).e(i4, i5, 1);
            }
        }

        public void d(int i4, int i5) {
            e(i4, i5, null);
        }

        public void e(int i4, int i5, @P Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).c(i4, i5, obj);
            }
        }

        public void f(int i4, int i5) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).d(i4, i5);
            }
        }

        public void g(int i4, int i5) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).f(i4, i5);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void a() {
        }

        public void b(int i4, int i5) {
        }

        public void c(int i4, int i5, @P Object obj) {
            b(i4, i5);
        }

        public void d(int i4, int i5) {
        }

        public void e(int i4, int i5, int i6) {
        }

        public void f(int i4, int i5) {
        }

        public void g() {
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        int a(int i4, int i5);
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public static final int f17795a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f17796b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f17797c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f17798d = 3;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        @N
        protected EdgeEffect a(@N RecyclerView recyclerView, int i4) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {

        /* renamed from: g, reason: collision with root package name */
        public static final int f17799g = 2;

        /* renamed from: h, reason: collision with root package name */
        public static final int f17800h = 8;

        /* renamed from: i, reason: collision with root package name */
        public static final int f17801i = 4;

        /* renamed from: j, reason: collision with root package name */
        public static final int f17802j = 2048;

        /* renamed from: k, reason: collision with root package name */
        public static final int f17803k = 4096;

        /* renamed from: a, reason: collision with root package name */
        private c f17804a = null;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<b> f17805b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        private long f17806c = 120;

        /* renamed from: d, reason: collision with root package name */
        private long f17807d = 120;

        /* renamed from: e, reason: collision with root package name */
        private long f17808e = 250;

        /* renamed from: f, reason: collision with root package name */
        private long f17809f = 250;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        /* loaded from: classes.dex */
        public interface b {
            void a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface c {
            void a(@N F f4);
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f17810a;

            /* renamed from: b, reason: collision with root package name */
            public int f17811b;

            /* renamed from: c, reason: collision with root package name */
            public int f17812c;

            /* renamed from: d, reason: collision with root package name */
            public int f17813d;

            /* renamed from: e, reason: collision with root package name */
            public int f17814e;

            @N
            public d a(@N F f4) {
                return b(f4, 0);
            }

            @N
            public d b(@N F f4, int i4) {
                View view = f4.f17770a;
                this.f17810a = view.getLeft();
                this.f17811b = view.getTop();
                this.f17812c = view.getRight();
                this.f17813d = view.getBottom();
                return this;
            }
        }

        static int e(F f4) {
            int i4 = f4.f17779j;
            int i5 = i4 & 14;
            if (f4.x()) {
                return 4;
            }
            if ((i4 & 4) == 0) {
                int q4 = f4.q();
                int j4 = f4.j();
                if (q4 != -1 && j4 != -1 && q4 != j4) {
                    return i5 | 2048;
                }
                return i5;
            }
            return i5;
        }

        void A(c cVar) {
            this.f17804a = cVar;
        }

        public void B(long j4) {
            this.f17808e = j4;
        }

        public void C(long j4) {
            this.f17807d = j4;
        }

        public abstract boolean a(@N F f4, @P d dVar, @N d dVar2);

        public abstract boolean b(@N F f4, @N F f5, @N d dVar, @N d dVar2);

        public abstract boolean c(@N F f4, @N d dVar, @P d dVar2);

        public abstract boolean d(@N F f4, @N d dVar, @N d dVar2);

        public boolean f(@N F f4) {
            return true;
        }

        public boolean g(@N F f4, @N List<Object> list) {
            return f(f4);
        }

        public final void h(@N F f4) {
            t(f4);
            c cVar = this.f17804a;
            if (cVar != null) {
                cVar.a(f4);
            }
        }

        public final void i(@N F f4) {
            u(f4);
        }

        public final void j() {
            int size = this.f17805b.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f17805b.get(i4).a();
            }
            this.f17805b.clear();
        }

        public abstract void k(@N F f4);

        public abstract void l();

        public long m() {
            return this.f17806c;
        }

        public long n() {
            return this.f17809f;
        }

        public long o() {
            return this.f17808e;
        }

        public long p() {
            return this.f17807d;
        }

        public abstract boolean q();

        public final boolean r(@P b bVar) {
            boolean q4 = q();
            if (bVar != null) {
                if (!q4) {
                    bVar.a();
                } else {
                    this.f17805b.add(bVar);
                }
            }
            return q4;
        }

        @N
        public d s() {
            return new d();
        }

        public void t(@N F f4) {
        }

        public void u(@N F f4) {
        }

        @N
        public d v(@N C c4, @N F f4) {
            return s().a(f4);
        }

        @N
        public d w(@N C c4, @N F f4, int i4, @N List<Object> list) {
            return s().a(f4);
        }

        public abstract void x();

        public void y(long j4) {
            this.f17806c = j4;
        }

        public void z(long j4) {
            this.f17809f = j4;
        }
    }

    /* loaded from: classes.dex */
    private class m implements l.c {
        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.c
        public void a(F f4) {
            f4.K(true);
            if (f4.f17777h != null && f4.f17778i == null) {
                f4.f17777h = null;
            }
            f4.f17778i = null;
            if (!f4.M() && !RecyclerView.this.r1(f4.f17770a) && f4.B()) {
                RecyclerView.this.removeDetachedView(f4.f17770a, false);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {
        @Deprecated
        public void f(@N Rect rect, int i4, @N RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(@N Rect rect, @N View view, @N RecyclerView recyclerView, @N C c4) {
            f(rect, ((p) view.getLayoutParams()).d(), recyclerView);
        }

        @Deprecated
        public void h(@N Canvas canvas, @N RecyclerView recyclerView) {
        }

        public void i(@N Canvas canvas, @N RecyclerView recyclerView, @N C c4) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void j(@N Canvas canvas, @N RecyclerView recyclerView) {
        }

        public void k(@N Canvas canvas, @N RecyclerView recyclerView, @N C c4) {
            j(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {

        /* renamed from: a, reason: collision with root package name */
        C0961g f17816a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView f17817b;

        /* renamed from: c, reason: collision with root package name */
        private final J.b f17818c;

        /* renamed from: d, reason: collision with root package name */
        private final J.b f17819d;

        /* renamed from: e, reason: collision with root package name */
        J f17820e;

        /* renamed from: f, reason: collision with root package name */
        J f17821f;

        /* renamed from: g, reason: collision with root package name */
        @P
        B f17822g;

        /* renamed from: h, reason: collision with root package name */
        boolean f17823h;

        /* renamed from: i, reason: collision with root package name */
        boolean f17824i;

        /* renamed from: j, reason: collision with root package name */
        boolean f17825j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f17826k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f17827l;

        /* renamed from: m, reason: collision with root package name */
        int f17828m;

        /* renamed from: n, reason: collision with root package name */
        boolean f17829n;

        /* renamed from: o, reason: collision with root package name */
        private int f17830o;

        /* renamed from: p, reason: collision with root package name */
        private int f17831p;

        /* renamed from: q, reason: collision with root package name */
        private int f17832q;

        /* renamed from: r, reason: collision with root package name */
        private int f17833r;

        /* loaded from: classes.dex */
        class a implements J.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.J.b
            public View a(int i4) {
                return o.this.P(i4);
            }

            @Override // androidx.recyclerview.widget.J.b
            public int b(View view) {
                return o.this.Y(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.J.b
            public int c() {
                return o.this.o0();
            }

            @Override // androidx.recyclerview.widget.J.b
            public int d() {
                return o.this.z0() - o.this.p0();
            }

            @Override // androidx.recyclerview.widget.J.b
            public int e(View view) {
                return o.this.b0(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        class b implements J.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.J.b
            public View a(int i4) {
                return o.this.P(i4);
            }

            @Override // androidx.recyclerview.widget.J.b
            public int b(View view) {
                return o.this.c0(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.J.b
            public int c() {
                return o.this.r0();
            }

            @Override // androidx.recyclerview.widget.J.b
            public int d() {
                return o.this.e0() - o.this.m0();
            }

            @Override // androidx.recyclerview.widget.J.b
            public int e(View view) {
                return o.this.W(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i4, int i5);
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f17836a;

            /* renamed from: b, reason: collision with root package name */
            public int f17837b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f17838c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f17839d;
        }

        public o() {
            a aVar = new a();
            this.f17818c = aVar;
            b bVar = new b();
            this.f17819d = bVar;
            this.f17820e = new J(aVar);
            this.f17821f = new J(bVar);
            this.f17823h = false;
            this.f17824i = false;
            this.f17825j = false;
            this.f17826k = true;
            this.f17827l = true;
        }

        private void E(int i4, @N View view) {
            this.f17816a.d(i4);
        }

        private boolean H0(RecyclerView recyclerView, int i4, int i5) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int o02 = o0();
            int r02 = r0();
            int z02 = z0() - p0();
            int e02 = e0() - m0();
            Rect rect = this.f17817b.f17652M;
            X(focusedChild, rect);
            if (rect.left - i4 >= z02 || rect.right - i4 <= o02 || rect.top - i5 >= e02 || rect.bottom - i5 <= r02) {
                return false;
            }
            return true;
        }

        private static boolean L0(int i4, int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            if (i6 > 0 && i4 != i6) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i4) {
                    return false;
                }
                return true;
            }
            if (size < i4) {
                return false;
            }
            return true;
        }

        private void P1(w wVar, int i4, View view) {
            F u02 = RecyclerView.u0(view);
            if (u02.N()) {
                return;
            }
            if (u02.x() && !u02.z() && !this.f17817b.f17658P.q()) {
                K1(i4);
                wVar.D(u02);
            } else {
                D(i4);
                wVar.E(view);
                this.f17817b.f17646J.k(u02);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int R(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.R(int, int, int, int, boolean):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
        
            if (r3 >= 0) goto L5;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int S(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L10
                if (r3 < 0) goto Le
            Lc:
                r2 = r0
                goto L1e
            Le:
                r3 = r2
                goto L1e
            L10:
                if (r3 < 0) goto L13
                goto Lc
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto Lc
            L18:
                r4 = -2
                if (r3 != r4) goto Le
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.S(int, int, int, boolean):int");
        }

        private int[] T(View view, Rect rect) {
            int[] iArr = new int[2];
            int o02 = o0();
            int r02 = r0();
            int z02 = z0() - p0();
            int e02 = e0() - m0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i4 = left - o02;
            int min = Math.min(0, i4);
            int i5 = top - r02;
            int min2 = Math.min(0, i5);
            int i6 = width - z02;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, height - e02);
            if (i0() == 1) {
                if (max == 0) {
                    max = Math.max(min, i6);
                }
            } else {
                if (min == 0) {
                    min = Math.min(i4, max);
                }
                max = min;
            }
            if (min2 == 0) {
                min2 = Math.min(i5, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private void g(View view, int i4, boolean z3) {
            F u02 = RecyclerView.u0(view);
            if (!z3 && !u02.z()) {
                this.f17817b.f17646J.p(u02);
            } else {
                this.f17817b.f17646J.b(u02);
            }
            p pVar = (p) view.getLayoutParams();
            if (!u02.Q() && !u02.A()) {
                if (view.getParent() == this.f17817b) {
                    int m4 = this.f17816a.m(view);
                    if (i4 == -1) {
                        i4 = this.f17816a.g();
                    }
                    if (m4 != -1) {
                        if (m4 != i4) {
                            this.f17817b.f17660Q.S0(m4, i4);
                        }
                    } else {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f17817b.indexOfChild(view) + this.f17817b.Y());
                    }
                } else {
                    this.f17816a.a(view, i4, false);
                    pVar.f17842c = true;
                    B b4 = this.f17822g;
                    if (b4 != null && b4.i()) {
                        this.f17822g.l(view);
                    }
                }
            } else {
                if (u02.A()) {
                    u02.P();
                } else {
                    u02.e();
                }
                this.f17816a.c(view, i4, view.getLayoutParams(), false);
            }
            if (pVar.f17843d) {
                u02.f17770a.invalidate();
                pVar.f17843d = false;
            }
        }

        public static int q(int i4, int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i5, i6);
                }
                return size;
            }
            return Math.min(size, Math.max(i5, i6));
        }

        public static d t0(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1002a.j.f21111P, i4, i5);
            dVar.f17836a = obtainStyledAttributes.getInt(C1002a.j.f21112Q, 1);
            dVar.f17837b = obtainStyledAttributes.getInt(C1002a.j.f21123a0, 1);
            dVar.f17838c = obtainStyledAttributes.getBoolean(C1002a.j.f21121Z, false);
            dVar.f17839d = obtainStyledAttributes.getBoolean(C1002a.j.f21125b0, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public void A(@N View view, @N w wVar) {
            P1(wVar, this.f17816a.m(view), view);
        }

        public int A0() {
            return this.f17830o;
        }

        public boolean A1(@N w wVar, @N C c4, @N View view, int i4, @P Bundle bundle) {
            return false;
        }

        public void B(int i4, @N w wVar) {
            P1(wVar, i4, P(i4));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean B0() {
            int Q3 = Q();
            for (int i4 = 0; i4 < Q3; i4++) {
                ViewGroup.LayoutParams layoutParams = P(i4).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void B1(Runnable runnable) {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                C0823k0.p1(recyclerView, runnable);
            }
        }

        public void C(@N View view) {
            int m4 = this.f17816a.m(view);
            if (m4 >= 0) {
                E(m4, view);
            }
        }

        public boolean C0() {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null && recyclerView.hasFocus()) {
                return true;
            }
            return false;
        }

        public void C1() {
            for (int Q3 = Q() - 1; Q3 >= 0; Q3--) {
                this.f17816a.q(Q3);
            }
        }

        public void D(int i4) {
            E(i4, P(i4));
        }

        public void D0(@N View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f17817b;
            if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
                F u02 = RecyclerView.u0(view);
                u02.b(128);
                this.f17817b.f17646J.q(u02);
            } else {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f17817b.Y());
            }
        }

        public void D1(@N w wVar) {
            for (int Q3 = Q() - 1; Q3 >= 0; Q3--) {
                if (!RecyclerView.u0(P(Q3)).N()) {
                    G1(Q3, wVar);
                }
            }
        }

        public boolean E0() {
            return this.f17824i;
        }

        void E1(w wVar) {
            int k4 = wVar.k();
            for (int i4 = k4 - 1; i4 >= 0; i4--) {
                View o4 = wVar.o(i4);
                F u02 = RecyclerView.u0(o4);
                if (!u02.N()) {
                    u02.K(false);
                    if (u02.B()) {
                        this.f17817b.removeDetachedView(o4, false);
                    }
                    l lVar = this.f17817b.f17703u0;
                    if (lVar != null) {
                        lVar.k(u02);
                    }
                    u02.K(true);
                    wVar.z(o4);
                }
            }
            wVar.f();
            if (k4 > 0) {
                this.f17817b.invalidate();
            }
        }

        void F(RecyclerView recyclerView) {
            this.f17824i = true;
            X0(recyclerView);
        }

        public boolean F0() {
            return this.f17825j;
        }

        public void F1(@N View view, @N w wVar) {
            J1(view);
            wVar.C(view);
        }

        void G(RecyclerView recyclerView, w wVar) {
            this.f17824i = false;
            Z0(recyclerView, wVar);
        }

        public boolean G0() {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null && recyclerView.isFocused()) {
                return true;
            }
            return false;
        }

        public void G1(int i4, @N w wVar) {
            View P3 = P(i4);
            K1(i4);
            wVar.C(P3);
        }

        public void H(View view) {
            l lVar = this.f17817b.f17703u0;
            if (lVar != null) {
                lVar.k(RecyclerView.u0(view));
            }
        }

        public boolean H1(Runnable runnable) {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @P
        public View I(@N View view) {
            View b02;
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView == null || (b02 = recyclerView.b0(view)) == null || this.f17816a.n(b02)) {
                return null;
            }
            return b02;
        }

        public final boolean I0() {
            return this.f17827l;
        }

        public void I1(@N View view) {
            this.f17817b.removeDetachedView(view, false);
        }

        @P
        public View J(int i4) {
            int Q3 = Q();
            for (int i5 = 0; i5 < Q3; i5++) {
                View P3 = P(i5);
                F u02 = RecyclerView.u0(P3);
                if (u02 != null && u02.p() == i4 && !u02.N() && (this.f17817b.f17653M0.j() || !u02.z())) {
                    return P3;
                }
            }
            return null;
        }

        public boolean J0(@N w wVar, @N C c4) {
            return false;
        }

        public void J1(View view) {
            this.f17816a.p(view);
        }

        public abstract p K();

        public boolean K0() {
            return this.f17826k;
        }

        public void K1(int i4) {
            if (P(i4) != null) {
                this.f17816a.q(i4);
            }
        }

        public p L(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public boolean L1(@N RecyclerView recyclerView, @N View view, @N Rect rect, boolean z3) {
            return M1(recyclerView, view, rect, z3, false);
        }

        public p M(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new p(layoutParams);
        }

        public boolean M0() {
            B b4 = this.f17822g;
            if (b4 != null && b4.i()) {
                return true;
            }
            return false;
        }

        public boolean M1(@N RecyclerView recyclerView, @N View view, @N Rect rect, boolean z3, boolean z4) {
            int[] T3 = T(view, rect);
            int i4 = T3[0];
            int i5 = T3[1];
            if ((z4 && !H0(recyclerView, i4, i5)) || (i4 == 0 && i5 == 0)) {
                return false;
            }
            if (z3) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.K1(i4, i5);
            }
            return true;
        }

        public int N() {
            return -1;
        }

        public boolean N0(@N View view, boolean z3, boolean z4) {
            boolean z5;
            if (this.f17820e.b(view, 24579) && this.f17821f.b(view, 24579)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z3) {
                return z5;
            }
            return !z5;
        }

        public void N1() {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int O(@N View view) {
            return ((p) view.getLayoutParams()).f17841b.bottom;
        }

        public void O0(@N View view, int i4, int i5, int i6, int i7) {
            Rect rect = ((p) view.getLayoutParams()).f17841b;
            view.layout(i4 + rect.left, i5 + rect.top, i6 - rect.right, i7 - rect.bottom);
        }

        public void O1() {
            this.f17823h = true;
        }

        @P
        public View P(int i4) {
            C0961g c0961g = this.f17816a;
            if (c0961g != null) {
                return c0961g.f(i4);
            }
            return null;
        }

        public void P0(@N View view, int i4, int i5, int i6, int i7) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f17841b;
            view.layout(i4 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i5 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i6 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i7 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public int Q() {
            C0961g c0961g = this.f17816a;
            if (c0961g != null) {
                return c0961g.g();
            }
            return 0;
        }

        public void Q0(@N View view, int i4, int i5) {
            p pVar = (p) view.getLayoutParams();
            Rect z02 = this.f17817b.z0(view);
            int i6 = i4 + z02.left + z02.right;
            int i7 = i5 + z02.top + z02.bottom;
            int R3 = R(z0(), A0(), o0() + p0() + i6, ((ViewGroup.MarginLayoutParams) pVar).width, n());
            int R4 = R(e0(), f0(), r0() + m0() + i7, ((ViewGroup.MarginLayoutParams) pVar).height, o());
            if (c2(view, R3, R4, pVar)) {
                view.measure(R3, R4);
            }
        }

        public int Q1(int i4, w wVar, C c4) {
            return 0;
        }

        public void R0(@N View view, int i4, int i5) {
            p pVar = (p) view.getLayoutParams();
            Rect z02 = this.f17817b.z0(view);
            int i6 = i4 + z02.left + z02.right;
            int i7 = i5 + z02.top + z02.bottom;
            int R3 = R(z0(), A0(), o0() + p0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i6, ((ViewGroup.MarginLayoutParams) pVar).width, n());
            int R4 = R(e0(), f0(), r0() + m0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) pVar).height, o());
            if (c2(view, R3, R4, pVar)) {
                view.measure(R3, R4);
            }
        }

        public void R1(int i4) {
        }

        public void S0(int i4, int i5) {
            View P3 = P(i4);
            if (P3 != null) {
                D(i4);
                k(P3, i5);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i4 + this.f17817b.toString());
            }
        }

        public int S1(int i4, w wVar, C c4) {
            return 0;
        }

        public void T0(@U int i4) {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                recyclerView.V0(i4);
            }
        }

        @Deprecated
        public void T1(boolean z3) {
            this.f17825j = z3;
        }

        public boolean U() {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null && recyclerView.f17648K) {
                return true;
            }
            return false;
        }

        public void U0(@U int i4) {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                recyclerView.W0(i4);
            }
        }

        void U1(RecyclerView recyclerView) {
            W1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int V(@N w wVar, @N C c4) {
            return -1;
        }

        public void V0(@P Adapter adapter, @P Adapter adapter2) {
        }

        public final void V1(boolean z3) {
            if (z3 != this.f17827l) {
                this.f17827l = z3;
                this.f17828m = 0;
                RecyclerView recyclerView = this.f17817b;
                if (recyclerView != null) {
                    recyclerView.f17638F.L();
                }
            }
        }

        public int W(@N View view) {
            return view.getBottom() + O(view);
        }

        public boolean W0(@N RecyclerView recyclerView, @N ArrayList<View> arrayList, int i4, int i5) {
            return false;
        }

        void W1(int i4, int i5) {
            this.f17832q = View.MeasureSpec.getSize(i4);
            int mode = View.MeasureSpec.getMode(i4);
            this.f17830o = mode;
            if (mode == 0 && !RecyclerView.f17617l1) {
                this.f17832q = 0;
            }
            this.f17833r = View.MeasureSpec.getSize(i5);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.f17831p = mode2;
            if (mode2 == 0 && !RecyclerView.f17617l1) {
                this.f17833r = 0;
            }
        }

        public void X(@N View view, @N Rect rect) {
            RecyclerView.w0(view, rect);
        }

        @InterfaceC0566i
        public void X0(RecyclerView recyclerView) {
        }

        public void X1(int i4, int i5) {
            this.f17817b.setMeasuredDimension(i4, i5);
        }

        public int Y(@N View view) {
            return view.getLeft() - j0(view);
        }

        @Deprecated
        public void Y0(RecyclerView recyclerView) {
        }

        public void Y1(Rect rect, int i4, int i5) {
            X1(q(i4, rect.width() + o0() + p0(), l0()), q(i5, rect.height() + r0() + m0(), k0()));
        }

        public int Z(@N View view) {
            Rect rect = ((p) view.getLayoutParams()).f17841b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        @InterfaceC0566i
        public void Z0(RecyclerView recyclerView, w wVar) {
            Y0(recyclerView);
        }

        void Z1(int i4, int i5) {
            int Q3 = Q();
            if (Q3 == 0) {
                this.f17817b.H(i4, i5);
                return;
            }
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MAX_VALUE;
            int i8 = Integer.MIN_VALUE;
            int i9 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < Q3; i10++) {
                View P3 = P(i10);
                Rect rect = this.f17817b.f17652M;
                X(P3, rect);
                int i11 = rect.left;
                if (i11 < i9) {
                    i9 = i11;
                }
                int i12 = rect.right;
                if (i12 > i6) {
                    i6 = i12;
                }
                int i13 = rect.top;
                if (i13 < i7) {
                    i7 = i13;
                }
                int i14 = rect.bottom;
                if (i14 > i8) {
                    i8 = i14;
                }
            }
            this.f17817b.f17652M.set(i9, i7, i6, i8);
            Y1(this.f17817b.f17652M, i4, i5);
        }

        public int a0(@N View view) {
            Rect rect = ((p) view.getLayoutParams()).f17841b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        @P
        public View a1(@N View view, int i4, @N w wVar, @N C c4) {
            return null;
        }

        public void a2(boolean z3) {
            this.f17826k = z3;
        }

        public int b0(@N View view) {
            return view.getRight() + u0(view);
        }

        public void b1(@N AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f17817b;
            c1(recyclerView.f17638F, recyclerView.f17653M0, accessibilityEvent);
        }

        void b2(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f17817b = null;
                this.f17816a = null;
                this.f17832q = 0;
                this.f17833r = 0;
            } else {
                this.f17817b = recyclerView;
                this.f17816a = recyclerView.f17644I;
                this.f17832q = recyclerView.getWidth();
                this.f17833r = recyclerView.getHeight();
            }
            this.f17830o = 1073741824;
            this.f17831p = 1073741824;
        }

        public void c(View view) {
            d(view, -1);
        }

        public int c0(@N View view) {
            return view.getTop() - x0(view);
        }

        public void c1(@N w wVar, @N C c4, @N AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z3 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f17817b.canScrollVertically(-1) && !this.f17817b.canScrollHorizontally(-1) && !this.f17817b.canScrollHorizontally(1)) {
                    z3 = false;
                }
                accessibilityEvent.setScrollable(z3);
                Adapter adapter = this.f17817b.f17658P;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.l());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c2(View view, int i4, int i5, p pVar) {
            if (!view.isLayoutRequested() && this.f17826k && L0(view.getWidth(), i4, ((ViewGroup.MarginLayoutParams) pVar).width) && L0(view.getHeight(), i5, ((ViewGroup.MarginLayoutParams) pVar).height)) {
                return false;
            }
            return true;
        }

        public void d(View view, int i4) {
            g(view, i4, true);
        }

        @P
        public View d0() {
            View focusedChild;
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f17816a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d1(M m4) {
            RecyclerView recyclerView = this.f17817b;
            e1(recyclerView.f17638F, recyclerView.f17653M0, m4);
        }

        boolean d2() {
            return false;
        }

        public void e(View view) {
            f(view, -1);
        }

        @U
        public int e0() {
            return this.f17833r;
        }

        public void e1(@N w wVar, @N C c4, @N M m4) {
            if (this.f17817b.canScrollVertically(-1) || this.f17817b.canScrollHorizontally(-1)) {
                m4.a(8192);
                m4.I1(true);
            }
            if (this.f17817b.canScrollVertically(1) || this.f17817b.canScrollHorizontally(1)) {
                m4.a(4096);
                m4.I1(true);
            }
            m4.b1(M.c.f(v0(wVar, c4), V(wVar, c4), J0(wVar, c4), w0(wVar, c4)));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean e2(View view, int i4, int i5, p pVar) {
            if (this.f17826k && L0(view.getMeasuredWidth(), i4, ((ViewGroup.MarginLayoutParams) pVar).width) && L0(view.getMeasuredHeight(), i5, ((ViewGroup.MarginLayoutParams) pVar).height)) {
                return false;
            }
            return true;
        }

        public void f(View view, int i4) {
            g(view, i4, false);
        }

        public int f0() {
            return this.f17831p;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void f1(View view, M m4) {
            F u02 = RecyclerView.u0(view);
            if (u02 != null && !u02.z() && !this.f17816a.n(u02.f17770a)) {
                RecyclerView recyclerView = this.f17817b;
                g1(recyclerView.f17638F, recyclerView.f17653M0, view, m4);
            }
        }

        public void f2(RecyclerView recyclerView, C c4, int i4) {
            Log.e(RecyclerView.f17612g1, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int g0() {
            Adapter adapter;
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter != null) {
                return adapter.l();
            }
            return 0;
        }

        public void g1(@N w wVar, @N C c4, @N View view, @N M m4) {
        }

        public void g2(B b4) {
            B b5 = this.f17822g;
            if (b5 != null && b4 != b5 && b5.i()) {
                this.f17822g.s();
            }
            this.f17822g = b4;
            b4.r(this.f17817b, this);
        }

        public void h(String str) {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                recyclerView.w(str);
            }
        }

        public int h0(@N View view) {
            return RecyclerView.u0(view).o();
        }

        @P
        public View h1(@N View view, int i4) {
            return null;
        }

        public void h2(@N View view) {
            F u02 = RecyclerView.u0(view);
            u02.O();
            u02.H();
            u02.b(4);
        }

        public void i(String str) {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                recyclerView.x(str);
            }
        }

        public int i0() {
            return C0823k0.Z(this.f17817b);
        }

        public void i1(@N RecyclerView recyclerView, int i4, int i5) {
        }

        void i2() {
            B b4 = this.f17822g;
            if (b4 != null) {
                b4.s();
            }
        }

        public void j(@N View view) {
            k(view, -1);
        }

        public int j0(@N View view) {
            return ((p) view.getLayoutParams()).f17841b.left;
        }

        public void j1(@N RecyclerView recyclerView) {
        }

        public boolean j2() {
            return false;
        }

        public void k(@N View view, int i4) {
            l(view, i4, (p) view.getLayoutParams());
        }

        @U
        public int k0() {
            return C0823k0.e0(this.f17817b);
        }

        public void k1(@N RecyclerView recyclerView, int i4, int i5, int i6) {
        }

        public void l(@N View view, int i4, p pVar) {
            F u02 = RecyclerView.u0(view);
            if (u02.z()) {
                this.f17817b.f17646J.b(u02);
            } else {
                this.f17817b.f17646J.p(u02);
            }
            this.f17816a.c(view, i4, pVar, u02.z());
        }

        @U
        public int l0() {
            return C0823k0.f0(this.f17817b);
        }

        public void l1(@N RecyclerView recyclerView, int i4, int i5) {
        }

        public void m(@N View view, @N Rect rect) {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.z0(view));
            }
        }

        @U
        public int m0() {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void m1(@N RecyclerView recyclerView, int i4, int i5) {
        }

        public boolean n() {
            return false;
        }

        @U
        public int n0() {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                return C0823k0.j0(recyclerView);
            }
            return 0;
        }

        public void n1(@N RecyclerView recyclerView, int i4, int i5, @P Object obj) {
            m1(recyclerView, i4, i5);
        }

        public boolean o() {
            return false;
        }

        @U
        public int o0() {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void o1(w wVar, C c4) {
            Log.e(RecyclerView.f17612g1, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean p(p pVar) {
            return pVar != null;
        }

        @U
        public int p0() {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void p1(C c4) {
        }

        @U
        public int q0() {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                return C0823k0.k0(recyclerView);
            }
            return 0;
        }

        public void q1(@N w wVar, @N C c4, int i4, int i5) {
            this.f17817b.H(i4, i5);
        }

        public void r(int i4, int i5, C c4, c cVar) {
        }

        @U
        public int r0() {
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        @Deprecated
        public boolean r1(@N RecyclerView recyclerView, @N View view, @P View view2) {
            if (!M0() && !recyclerView.N0()) {
                return false;
            }
            return true;
        }

        public void s(int i4, c cVar) {
        }

        public int s0(@N View view) {
            return ((p) view.getLayoutParams()).d();
        }

        public boolean s1(@N RecyclerView recyclerView, @N C c4, @N View view, @P View view2) {
            return r1(recyclerView, view, view2);
        }

        public int t(@N C c4) {
            return 0;
        }

        public void t1(Parcelable parcelable) {
        }

        public int u(@N C c4) {
            return 0;
        }

        public int u0(@N View view) {
            return ((p) view.getLayoutParams()).f17841b.right;
        }

        @P
        public Parcelable u1() {
            return null;
        }

        public int v(@N C c4) {
            return 0;
        }

        public int v0(@N w wVar, @N C c4) {
            return -1;
        }

        public void v1(int i4) {
        }

        public int w(@N C c4) {
            return 0;
        }

        public int w0(@N w wVar, @N C c4) {
            return 0;
        }

        void w1(B b4) {
            if (this.f17822g == b4) {
                this.f17822g = null;
            }
        }

        public int x(@N C c4) {
            return 0;
        }

        public int x0(@N View view) {
            return ((p) view.getLayoutParams()).f17841b.top;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean x1(int i4, @P Bundle bundle) {
            RecyclerView recyclerView = this.f17817b;
            return y1(recyclerView.f17638F, recyclerView.f17653M0, i4, bundle);
        }

        public int y(@N C c4) {
            return 0;
        }

        public void y0(@N View view, boolean z3, @N Rect rect) {
            Matrix matrix;
            if (z3) {
                Rect rect2 = ((p) view.getLayoutParams()).f17841b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f17817b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f17817b.f17656O;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean y1(@N w wVar, @N C c4, int i4, @P Bundle bundle) {
            int i5;
            int z02;
            int i6;
            int i7;
            RecyclerView recyclerView = this.f17817b;
            if (recyclerView == null) {
                return false;
            }
            if (i4 != 4096) {
                if (i4 != 8192) {
                    i7 = 0;
                    i6 = 0;
                } else {
                    if (recyclerView.canScrollVertically(-1)) {
                        i5 = -((e0() - r0()) - m0());
                    } else {
                        i5 = 0;
                    }
                    if (this.f17817b.canScrollHorizontally(-1)) {
                        z02 = -((z0() - o0()) - p0());
                        i6 = i5;
                        i7 = z02;
                    }
                    i6 = i5;
                    i7 = 0;
                }
            } else {
                if (recyclerView.canScrollVertically(1)) {
                    i5 = (e0() - r0()) - m0();
                } else {
                    i5 = 0;
                }
                if (this.f17817b.canScrollHorizontally(1)) {
                    z02 = (z0() - o0()) - p0();
                    i6 = i5;
                    i7 = z02;
                }
                i6 = i5;
                i7 = 0;
            }
            if (i6 == 0 && i7 == 0) {
                return false;
            }
            this.f17817b.N1(i7, i6, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void z(@N w wVar) {
            for (int Q3 = Q() - 1; Q3 >= 0; Q3--) {
                P1(wVar, Q3, P(Q3));
            }
        }

        @U
        public int z0() {
            return this.f17832q;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean z1(@N View view, int i4, @P Bundle bundle) {
            RecyclerView recyclerView = this.f17817b;
            return A1(recyclerView.f17638F, recyclerView.f17653M0, view, i4, bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        void b(@N View view);

        void d(@N View view);
    }

    /* loaded from: classes.dex */
    public static abstract class r {
        public abstract boolean a(int i4, int i5);
    }

    /* loaded from: classes.dex */
    public interface s {
        void a(@N RecyclerView recyclerView, @N MotionEvent motionEvent);

        boolean c(@N RecyclerView recyclerView, @N MotionEvent motionEvent);

        void e(boolean z3);
    }

    /* loaded from: classes.dex */
    public static abstract class t {
        public void a(@N RecyclerView recyclerView, int i4) {
        }

        public void b(@N RecyclerView recyclerView, int i4, int i5) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface u {
    }

    /* loaded from: classes.dex */
    public static class v {

        /* renamed from: c, reason: collision with root package name */
        private static final int f17844c = 5;

        /* renamed from: a, reason: collision with root package name */
        SparseArray<a> f17845a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        private int f17846b = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList<F> f17847a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            int f17848b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f17849c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f17850d = 0;

            a() {
            }
        }

        private a h(int i4) {
            a aVar = this.f17845a.get(i4);
            if (aVar == null) {
                a aVar2 = new a();
                this.f17845a.put(i4, aVar2);
                return aVar2;
            }
            return aVar;
        }

        void a() {
            this.f17846b++;
        }

        public void b() {
            for (int i4 = 0; i4 < this.f17845a.size(); i4++) {
                this.f17845a.valueAt(i4).f17847a.clear();
            }
        }

        void c() {
            this.f17846b--;
        }

        void d(int i4, long j4) {
            a h4 = h(i4);
            h4.f17850d = k(h4.f17850d, j4);
        }

        void e(int i4, long j4) {
            a h4 = h(i4);
            h4.f17849c = k(h4.f17849c, j4);
        }

        @P
        public F f(int i4) {
            a aVar = this.f17845a.get(i4);
            if (aVar != null && !aVar.f17847a.isEmpty()) {
                ArrayList<F> arrayList = aVar.f17847a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!arrayList.get(size).v()) {
                        return arrayList.remove(size);
                    }
                }
                return null;
            }
            return null;
        }

        public int g(int i4) {
            return h(i4).f17847a.size();
        }

        void i(Adapter adapter, Adapter adapter2, boolean z3) {
            if (adapter != null) {
                c();
            }
            if (!z3 && this.f17846b == 0) {
                b();
            }
            if (adapter2 != null) {
                a();
            }
        }

        public void j(F f4) {
            int o4 = f4.o();
            ArrayList<F> arrayList = h(o4).f17847a;
            if (this.f17845a.get(o4).f17848b <= arrayList.size()) {
                return;
            }
            f4.H();
            arrayList.add(f4);
        }

        long k(long j4, long j5) {
            if (j4 == 0) {
                return j5;
            }
            return ((j4 / 4) * 3) + (j5 / 4);
        }

        public void l(int i4, int i5) {
            a h4 = h(i4);
            h4.f17848b = i5;
            ArrayList<F> arrayList = h4.f17847a;
            while (arrayList.size() > i5) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        int m() {
            int i4 = 0;
            for (int i5 = 0; i5 < this.f17845a.size(); i5++) {
                ArrayList<F> arrayList = this.f17845a.valueAt(i5).f17847a;
                if (arrayList != null) {
                    i4 += arrayList.size();
                }
            }
            return i4;
        }

        boolean n(int i4, long j4, long j5) {
            long j6 = h(i4).f17850d;
            if (j6 != 0 && j4 + j6 >= j5) {
                return false;
            }
            return true;
        }

        boolean o(int i4, long j4, long j5) {
            long j6 = h(i4).f17849c;
            if (j6 != 0 && j4 + j6 >= j5) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public final class w {

        /* renamed from: j, reason: collision with root package name */
        static final int f17851j = 2;

        /* renamed from: a, reason: collision with root package name */
        final ArrayList<F> f17852a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<F> f17853b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<F> f17854c;

        /* renamed from: d, reason: collision with root package name */
        private final List<F> f17855d;

        /* renamed from: e, reason: collision with root package name */
        private int f17856e;

        /* renamed from: f, reason: collision with root package name */
        int f17857f;

        /* renamed from: g, reason: collision with root package name */
        v f17858g;

        /* renamed from: h, reason: collision with root package name */
        private D f17859h;

        public w() {
            ArrayList<F> arrayList = new ArrayList<>();
            this.f17852a = arrayList;
            this.f17853b = null;
            this.f17854c = new ArrayList<>();
            this.f17855d = Collections.unmodifiableList(arrayList);
            this.f17856e = 2;
            this.f17857f = 2;
        }

        private boolean I(@N F f4, int i4, int i5, long j4) {
            f4.f17788s = null;
            f4.f17787r = RecyclerView.this;
            int o4 = f4.o();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j4 != Long.MAX_VALUE && !this.f17858g.n(o4, nanoTime, j4)) {
                return false;
            }
            RecyclerView.this.f17658P.h(f4, i4);
            this.f17858g.d(f4.o(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f4);
            if (RecyclerView.this.f17653M0.j()) {
                f4.f17776g = i5;
                return true;
            }
            return true;
        }

        private void b(F f4) {
            if (RecyclerView.this.L0()) {
                View view = f4.f17770a;
                if (C0823k0.V(view) == 0) {
                    C0823k0.R1(view, 1);
                }
                androidx.recyclerview.widget.A a4 = RecyclerView.this.f17667T0;
                if (a4 == null) {
                    return;
                }
                C0771a n4 = a4.n();
                if (n4 instanceof A.a) {
                    ((A.a) n4).o(view);
                }
                C0823k0.B1(view, n4);
            }
        }

        private void r(ViewGroup viewGroup, boolean z3) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    r((ViewGroup) childAt, true);
                }
            }
            if (!z3) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void s(F f4) {
            View view = f4.f17770a;
            if (view instanceof ViewGroup) {
                r((ViewGroup) view, false);
            }
        }

        void A() {
            for (int size = this.f17854c.size() - 1; size >= 0; size--) {
                B(size);
            }
            this.f17854c.clear();
            if (RecyclerView.f17619n1) {
                RecyclerView.this.f17651L0.b();
            }
        }

        void B(int i4) {
            a(this.f17854c.get(i4), true);
            this.f17854c.remove(i4);
        }

        public void C(@N View view) {
            F u02 = RecyclerView.u0(view);
            if (u02.B()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (u02.A()) {
                u02.P();
            } else if (u02.Q()) {
                u02.e();
            }
            D(u02);
            if (RecyclerView.this.f17703u0 != null && !u02.y()) {
                RecyclerView.this.f17703u0.k(u02);
            }
        }

        void D(F f4) {
            boolean z3;
            boolean z4;
            boolean z5 = false;
            boolean z6 = true;
            if (!f4.A() && f4.f17770a.getParent() == null) {
                if (!f4.B()) {
                    if (!f4.N()) {
                        boolean h4 = f4.h();
                        Adapter adapter = RecyclerView.this.f17658P;
                        if (adapter != null && h4 && adapter.G(f4)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3 && !f4.y()) {
                            z6 = false;
                        } else {
                            if (this.f17857f > 0 && !f4.t(526)) {
                                int size = this.f17854c.size();
                                if (size >= this.f17857f && size > 0) {
                                    B(0);
                                    size--;
                                }
                                if (RecyclerView.f17619n1 && size > 0 && !RecyclerView.this.f17651L0.d(f4.f17772c)) {
                                    int i4 = size - 1;
                                    while (i4 >= 0) {
                                        if (!RecyclerView.this.f17651L0.d(this.f17854c.get(i4).f17772c)) {
                                            break;
                                        } else {
                                            i4--;
                                        }
                                    }
                                    size = i4 + 1;
                                }
                                this.f17854c.add(size, f4);
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                a(f4, true);
                            } else {
                                z6 = false;
                            }
                            z5 = z4;
                        }
                        RecyclerView.this.f17646J.q(f4);
                        if (!z5 && !z6 && h4) {
                            f4.f17788s = null;
                            f4.f17787r = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.Y());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f4 + RecyclerView.this.Y());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(f4.A());
            sb.append(" isAttached:");
            if (f4.f17770a.getParent() != null) {
                z5 = true;
            }
            sb.append(z5);
            sb.append(RecyclerView.this.Y());
            throw new IllegalArgumentException(sb.toString());
        }

        void E(View view) {
            F u02 = RecyclerView.u0(view);
            if (!u02.t(12) && u02.C() && !RecyclerView.this.y(u02)) {
                if (this.f17853b == null) {
                    this.f17853b = new ArrayList<>();
                }
                u02.L(this, true);
                this.f17853b.add(u02);
                return;
            }
            if (u02.x() && !u02.z() && !RecyclerView.this.f17658P.q()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.Y());
            }
            u02.L(this, false);
            this.f17852a.add(u02);
        }

        void F(v vVar) {
            v vVar2 = this.f17858g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.f17858g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f17858g.a();
            }
        }

        void G(D d4) {
            this.f17859h = d4;
        }

        public void H(int i4) {
            this.f17856e = i4;
            L();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0229 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x020d  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01d5  */
        @androidx.annotation.P
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.F J(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 616
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.J(int, boolean, long):androidx.recyclerview.widget.RecyclerView$F");
        }

        void K(F f4) {
            if (f4.f17784o) {
                this.f17853b.remove(f4);
            } else {
                this.f17852a.remove(f4);
            }
            f4.f17783n = null;
            f4.f17784o = false;
            f4.e();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void L() {
            int i4;
            o oVar = RecyclerView.this.f17660Q;
            if (oVar != null) {
                i4 = oVar.f17828m;
            } else {
                i4 = 0;
            }
            this.f17857f = this.f17856e + i4;
            for (int size = this.f17854c.size() - 1; size >= 0 && this.f17854c.size() > this.f17857f; size--) {
                B(size);
            }
        }

        boolean M(F f4) {
            if (f4.z()) {
                return RecyclerView.this.f17653M0.j();
            }
            int i4 = f4.f17772c;
            if (i4 >= 0 && i4 < RecyclerView.this.f17658P.l()) {
                if (!RecyclerView.this.f17653M0.j() && RecyclerView.this.f17658P.n(f4.f17772c) != f4.o()) {
                    return false;
                }
                if (RecyclerView.this.f17658P.q() && f4.n() != RecyclerView.this.f17658P.m(f4.f17772c)) {
                    return false;
                }
                return true;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f4 + RecyclerView.this.Y());
        }

        void N(int i4, int i5) {
            int i6;
            int i7 = i5 + i4;
            for (int size = this.f17854c.size() - 1; size >= 0; size--) {
                F f4 = this.f17854c.get(size);
                if (f4 != null && (i6 = f4.f17772c) >= i4 && i6 < i7) {
                    f4.b(2);
                    B(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(@N F f4, boolean z3) {
            C0771a c0771a;
            RecyclerView.A(f4);
            View view = f4.f17770a;
            androidx.recyclerview.widget.A a4 = RecyclerView.this.f17667T0;
            if (a4 != null) {
                C0771a n4 = a4.n();
                if (n4 instanceof A.a) {
                    c0771a = ((A.a) n4).n(view);
                } else {
                    c0771a = null;
                }
                C0823k0.B1(view, c0771a);
            }
            if (z3) {
                h(f4);
            }
            f4.f17788s = null;
            f4.f17787r = null;
            j().j(f4);
        }

        public void c(@N View view, int i4) {
            p pVar;
            F u02 = RecyclerView.u0(view);
            if (u02 != null) {
                int n4 = RecyclerView.this.f17642H.n(i4);
                if (n4 >= 0 && n4 < RecyclerView.this.f17658P.l()) {
                    I(u02, n4, i4, Long.MAX_VALUE);
                    ViewGroup.LayoutParams layoutParams = u02.f17770a.getLayoutParams();
                    if (layoutParams == null) {
                        pVar = (p) RecyclerView.this.generateDefaultLayoutParams();
                        u02.f17770a.setLayoutParams(pVar);
                    } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                        pVar = (p) RecyclerView.this.generateLayoutParams(layoutParams);
                        u02.f17770a.setLayoutParams(pVar);
                    } else {
                        pVar = (p) layoutParams;
                    }
                    boolean z3 = true;
                    pVar.f17842c = true;
                    pVar.f17840a = u02;
                    if (u02.f17770a.getParent() != null) {
                        z3 = false;
                    }
                    pVar.f17843d = z3;
                    return;
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i4 + "(offset:" + n4 + ").state:" + RecyclerView.this.f17653M0.d() + RecyclerView.this.Y());
            }
            throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.Y());
        }

        public void d() {
            this.f17852a.clear();
            A();
        }

        void e() {
            int size = this.f17854c.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f17854c.get(i4).c();
            }
            int size2 = this.f17852a.size();
            for (int i5 = 0; i5 < size2; i5++) {
                this.f17852a.get(i5).c();
            }
            ArrayList<F> arrayList = this.f17853b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    this.f17853b.get(i6).c();
                }
            }
        }

        void f() {
            this.f17852a.clear();
            ArrayList<F> arrayList = this.f17853b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int g(int i4) {
            if (i4 >= 0 && i4 < RecyclerView.this.f17653M0.d()) {
                if (!RecyclerView.this.f17653M0.j()) {
                    return i4;
                }
                return RecyclerView.this.f17642H.n(i4);
            }
            throw new IndexOutOfBoundsException("invalid position " + i4 + ". State item count is " + RecyclerView.this.f17653M0.d() + RecyclerView.this.Y());
        }

        void h(@N F f4) {
            x xVar = RecyclerView.this.f17662R;
            if (xVar != null) {
                xVar.a(f4);
            }
            int size = RecyclerView.this.f17664S.size();
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.this.f17664S.get(i4).a(f4);
            }
            Adapter adapter = RecyclerView.this.f17658P;
            if (adapter != null) {
                adapter.J(f4);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f17653M0 != null) {
                recyclerView.f17646J.q(f4);
            }
        }

        F i(int i4) {
            int size;
            int n4;
            ArrayList<F> arrayList = this.f17853b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    F f4 = this.f17853b.get(i5);
                    if (!f4.Q() && f4.p() == i4) {
                        f4.b(32);
                        return f4;
                    }
                }
                if (RecyclerView.this.f17658P.q() && (n4 = RecyclerView.this.f17642H.n(i4)) > 0 && n4 < RecyclerView.this.f17658P.l()) {
                    long m4 = RecyclerView.this.f17658P.m(n4);
                    for (int i6 = 0; i6 < size; i6++) {
                        F f5 = this.f17853b.get(i6);
                        if (!f5.Q() && f5.n() == m4) {
                            f5.b(32);
                            return f5;
                        }
                    }
                }
            }
            return null;
        }

        v j() {
            if (this.f17858g == null) {
                this.f17858g = new v();
            }
            return this.f17858g;
        }

        int k() {
            return this.f17852a.size();
        }

        @N
        public List<F> l() {
            return this.f17855d;
        }

        F m(long j4, int i4, boolean z3) {
            for (int size = this.f17852a.size() - 1; size >= 0; size--) {
                F f4 = this.f17852a.get(size);
                if (f4.n() == j4 && !f4.Q()) {
                    if (i4 == f4.o()) {
                        f4.b(32);
                        if (f4.z() && !RecyclerView.this.f17653M0.j()) {
                            f4.J(2, 14);
                        }
                        return f4;
                    }
                    if (!z3) {
                        this.f17852a.remove(size);
                        RecyclerView.this.removeDetachedView(f4.f17770a, false);
                        z(f4.f17770a);
                    }
                }
            }
            int size2 = this.f17854c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                F f5 = this.f17854c.get(size2);
                if (f5.n() == j4 && !f5.v()) {
                    if (i4 == f5.o()) {
                        if (!z3) {
                            this.f17854c.remove(size2);
                        }
                        return f5;
                    }
                    if (!z3) {
                        B(size2);
                        return null;
                    }
                }
            }
        }

        F n(int i4, boolean z3) {
            View e4;
            int size = this.f17852a.size();
            for (int i5 = 0; i5 < size; i5++) {
                F f4 = this.f17852a.get(i5);
                if (!f4.Q() && f4.p() == i4 && !f4.x() && (RecyclerView.this.f17653M0.f17738h || !f4.z())) {
                    f4.b(32);
                    return f4;
                }
            }
            if (!z3 && (e4 = RecyclerView.this.f17644I.e(i4)) != null) {
                F u02 = RecyclerView.u0(e4);
                RecyclerView.this.f17644I.s(e4);
                int m4 = RecyclerView.this.f17644I.m(e4);
                if (m4 != -1) {
                    RecyclerView.this.f17644I.d(m4);
                    E(e4);
                    u02.b(8224);
                    return u02;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + u02 + RecyclerView.this.Y());
            }
            int size2 = this.f17854c.size();
            for (int i6 = 0; i6 < size2; i6++) {
                F f5 = this.f17854c.get(i6);
                if (!f5.x() && f5.p() == i4 && !f5.v()) {
                    if (!z3) {
                        this.f17854c.remove(i6);
                    }
                    return f5;
                }
            }
            return null;
        }

        View o(int i4) {
            return this.f17852a.get(i4).f17770a;
        }

        @N
        public View p(int i4) {
            return q(i4, false);
        }

        View q(int i4, boolean z3) {
            return J(i4, z3, Long.MAX_VALUE).f17770a;
        }

        void t() {
            int size = this.f17854c.size();
            for (int i4 = 0; i4 < size; i4++) {
                p pVar = (p) this.f17854c.get(i4).f17770a.getLayoutParams();
                if (pVar != null) {
                    pVar.f17842c = true;
                }
            }
        }

        void u() {
            int size = this.f17854c.size();
            for (int i4 = 0; i4 < size; i4++) {
                F f4 = this.f17854c.get(i4);
                if (f4 != null) {
                    f4.b(6);
                    f4.a(null);
                }
            }
            Adapter adapter = RecyclerView.this.f17658P;
            if (adapter == null || !adapter.q()) {
                A();
            }
        }

        void v(int i4, int i5) {
            int size = this.f17854c.size();
            for (int i6 = 0; i6 < size; i6++) {
                F f4 = this.f17854c.get(i6);
                if (f4 != null && f4.f17772c >= i4) {
                    f4.E(i5, false);
                }
            }
        }

        void w(int i4, int i5) {
            int i6;
            int i7;
            int i8;
            int i9;
            if (i4 < i5) {
                i6 = -1;
                i8 = i4;
                i7 = i5;
            } else {
                i6 = 1;
                i7 = i4;
                i8 = i5;
            }
            int size = this.f17854c.size();
            for (int i10 = 0; i10 < size; i10++) {
                F f4 = this.f17854c.get(i10);
                if (f4 != null && (i9 = f4.f17772c) >= i8 && i9 <= i7) {
                    if (i9 == i4) {
                        f4.E(i5 - i4, false);
                    } else {
                        f4.E(i6, false);
                    }
                }
            }
        }

        void x(int i4, int i5, boolean z3) {
            int i6 = i4 + i5;
            for (int size = this.f17854c.size() - 1; size >= 0; size--) {
                F f4 = this.f17854c.get(size);
                if (f4 != null) {
                    int i7 = f4.f17772c;
                    if (i7 >= i6) {
                        f4.E(-i5, z3);
                    } else if (i7 >= i4) {
                        f4.b(8);
                        B(size);
                    }
                }
            }
        }

        void y(Adapter adapter, Adapter adapter2, boolean z3) {
            d();
            j().i(adapter, adapter2, z3);
        }

        void z(View view) {
            F u02 = RecyclerView.u0(view);
            u02.f17783n = null;
            u02.f17784o = false;
            u02.e();
            D(u02);
        }
    }

    /* loaded from: classes.dex */
    public interface x {
        void a(@N F f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class y extends i {
        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            RecyclerView.this.x(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f17653M0.f17737g = true;
            recyclerView.l1(true);
            if (!RecyclerView.this.f17642H.q()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void c(int i4, int i5, Object obj) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.f17642H.s(i4, i5, obj)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void d(int i4, int i5) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.f17642H.t(i4, i5)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void e(int i4, int i5, int i6) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.f17642H.u(i4, i5, i6)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void f(int i4, int i5) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.f17642H.v(i4, i5)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void g() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f17640G != null && (adapter = recyclerView.f17658P) != null && adapter.i()) {
                RecyclerView.this.requestLayout();
            }
        }

        void h() {
            if (RecyclerView.f17618m1) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f17677a0 && recyclerView.f17672W) {
                    C0823k0.p1(recyclerView, recyclerView.f17650L);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f17691i0 = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        Class cls = Integer.TYPE;
        f17605J1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f17611P1 = new InterpolatorC0951c();
    }

    public RecyclerView(@N Context context) {
        this(context, null);
    }

    static void A(@N F f4) {
        WeakReference<RecyclerView> weakReference = f4.f17771b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f4.f17770a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            f4.f17771b = null;
        }
    }

    private void A1() {
        C c4 = this.f17653M0;
        c4.f17744n = -1L;
        c4.f17743m = -1;
        c4.f17745o = -1;
    }

    private void B0(long j4, F f4, F f5) {
        int g4 = this.f17644I.g();
        for (int i4 = 0; i4 < g4; i4++) {
            F u02 = u0(this.f17644I.f(i4));
            if (u02 != f4 && o0(u02) == j4) {
                Adapter adapter = this.f17658P;
                if (adapter != null && adapter.q()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + u02 + " \n View Holder 2:" + f4 + Y());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + u02 + " \n View Holder 2:" + f4 + Y());
            }
        }
        Log.e(f17612g1, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f5 + " cannot be found but it is necessary for " + f4 + Y());
    }

    private void B1() {
        VelocityTracker velocityTracker = this.f17706x0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        g(0);
        p1();
    }

    private void C1() {
        View view;
        long j4;
        int j5;
        F f4 = null;
        if (this.f17645I0 && hasFocus() && this.f17658P != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            f4 = c0(view);
        }
        if (f4 == null) {
            A1();
            return;
        }
        C c4 = this.f17653M0;
        if (this.f17658P.q()) {
            j4 = f4.n();
        } else {
            j4 = -1;
        }
        c4.f17744n = j4;
        C c5 = this.f17653M0;
        if (this.f17694l0) {
            j5 = -1;
        } else if (f4.z()) {
            j5 = f4.f17773d;
        } else {
            j5 = f4.j();
        }
        c5.f17743m = j5;
        this.f17653M0.f17745o = x0(f4.f17770a);
    }

    private boolean E0() {
        int g4 = this.f17644I.g();
        for (int i4 = 0; i4 < g4; i4++) {
            F u02 = u0(this.f17644I.f(i4));
            if (u02 != null && !u02.N() && u02.C()) {
                return true;
            }
        }
        return false;
    }

    private void G(Context context, String str, AttributeSet attributeSet, int i4, int i5) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String y02 = y0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(y02, false, classLoader).asSubclass(o.class);
                    try {
                        constructor = asSubclass.getConstructor(f17605J1);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i4), Integer.valueOf(i5)};
                    } catch (NoSuchMethodException e4) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e5) {
                            e5.initCause(e4);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + y02, e5);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(objArr));
                } catch (ClassCastException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + y02, e6);
                } catch (ClassNotFoundException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + y02, e7);
                } catch (IllegalAccessException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + y02, e8);
                } catch (InstantiationException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + y02, e9);
                } catch (InvocationTargetException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + y02, e10);
                }
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    private void G0() {
        if (C0823k0.W(this) == 0) {
            C0823k0.S1(this, 8);
        }
    }

    private void H0() {
        this.f17644I = new C0961g(new C0953e());
    }

    private void H1(@P Adapter adapter, boolean z3, boolean z4) {
        Adapter adapter2 = this.f17658P;
        if (adapter2 != null) {
            adapter2.N(this.f17636E);
            this.f17658P.F(this);
        }
        if (!z3 || z4) {
            q1();
        }
        this.f17642H.z();
        Adapter adapter3 = this.f17658P;
        this.f17658P = adapter;
        if (adapter != null) {
            adapter.K(this.f17636E);
            adapter.B(this);
        }
        o oVar = this.f17660Q;
        if (oVar != null) {
            oVar.V0(adapter3, this.f17658P);
        }
        this.f17638F.y(adapter3, this.f17658P, z3);
        this.f17653M0.f17737g = true;
    }

    private boolean I(int i4, int i5) {
        e0(this.f17671V0);
        int[] iArr = this.f17671V0;
        if (iArr[0] == i4 && iArr[1] == i5) {
            return false;
        }
        return true;
    }

    private void L() {
        int i4 = this.f17690h0;
        this.f17690h0 = 0;
        if (i4 != 0 && L0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0775b.i(obtain, i4);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void N() {
        boolean z3 = true;
        this.f17653M0.a(1);
        Z(this.f17653M0);
        this.f17653M0.f17740j = false;
        P1();
        this.f17646J.f();
        c1();
        k1();
        C1();
        C c4 = this.f17653M0;
        if (!c4.f17741k || !this.f17661Q0) {
            z3 = false;
        }
        c4.f17739i = z3;
        this.f17661Q0 = false;
        this.f17659P0 = false;
        c4.f17738h = c4.f17742l;
        c4.f17736f = this.f17658P.l();
        e0(this.f17671V0);
        if (this.f17653M0.f17741k) {
            int g4 = this.f17644I.g();
            for (int i4 = 0; i4 < g4; i4++) {
                F u02 = u0(this.f17644I.f(i4));
                if (!u02.N() && (!u02.x() || this.f17658P.q())) {
                    this.f17646J.e(u02, this.f17703u0.w(this.f17653M0, u02, l.e(u02), u02.s()));
                    if (this.f17653M0.f17739i && u02.C() && !u02.z() && !u02.N() && !u02.x()) {
                        this.f17646J.c(o0(u02), u02);
                    }
                }
            }
        }
        if (this.f17653M0.f17742l) {
            D1();
            C c5 = this.f17653M0;
            boolean z4 = c5.f17737g;
            c5.f17737g = false;
            this.f17660Q.o1(this.f17638F, c5);
            this.f17653M0.f17737g = z4;
            for (int i5 = 0; i5 < this.f17644I.g(); i5++) {
                F u03 = u0(this.f17644I.f(i5));
                if (!u03.N() && !this.f17646J.i(u03)) {
                    int e4 = l.e(u03);
                    boolean t3 = u03.t(8192);
                    if (!t3) {
                        e4 |= 4096;
                    }
                    l.d w3 = this.f17703u0.w(this.f17653M0, u03, e4, u03.s());
                    if (t3) {
                        n1(u03, w3);
                    } else {
                        this.f17646J.a(u03, w3);
                    }
                }
            }
            B();
        } else {
            B();
        }
        d1();
        Q1(false);
        this.f17653M0.f17735e = 2;
    }

    private void O() {
        boolean z3;
        P1();
        c1();
        this.f17653M0.a(6);
        this.f17642H.k();
        this.f17653M0.f17736f = this.f17658P.l();
        this.f17653M0.f17734d = 0;
        if (this.f17640G != null && this.f17658P.i()) {
            Parcelable parcelable = this.f17640G.f17862G;
            if (parcelable != null) {
                this.f17660Q.t1(parcelable);
            }
            this.f17640G = null;
        }
        C c4 = this.f17653M0;
        c4.f17738h = false;
        this.f17660Q.o1(this.f17638F, c4);
        C c5 = this.f17653M0;
        c5.f17737g = false;
        if (c5.f17741k && this.f17703u0 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        c5.f17741k = z3;
        c5.f17735e = 4;
        d1();
        Q1(false);
    }

    private void P() {
        this.f17653M0.a(4);
        P1();
        c1();
        C c4 = this.f17653M0;
        c4.f17735e = 1;
        if (c4.f17741k) {
            for (int g4 = this.f17644I.g() - 1; g4 >= 0; g4--) {
                F u02 = u0(this.f17644I.f(g4));
                if (!u02.N()) {
                    long o02 = o0(u02);
                    l.d v3 = this.f17703u0.v(this.f17653M0, u02);
                    F g5 = this.f17646J.g(o02);
                    if (g5 != null && !g5.N()) {
                        boolean h4 = this.f17646J.h(g5);
                        boolean h5 = this.f17646J.h(u02);
                        if (h4 && g5 == u02) {
                            this.f17646J.d(u02, v3);
                        } else {
                            l.d n4 = this.f17646J.n(g5);
                            this.f17646J.d(u02, v3);
                            l.d m4 = this.f17646J.m(u02);
                            if (n4 == null) {
                                B0(o02, u02, g5);
                            } else {
                                u(g5, u02, n4, m4, h4, h5);
                            }
                        }
                    } else {
                        this.f17646J.d(u02, v3);
                    }
                }
            }
            this.f17646J.o(this.f17688f1);
        }
        this.f17660Q.E1(this.f17638F);
        C c5 = this.f17653M0;
        c5.f17733c = c5.f17736f;
        this.f17694l0 = false;
        this.f17695m0 = false;
        c5.f17741k = false;
        c5.f17742l = false;
        this.f17660Q.f17823h = false;
        ArrayList<F> arrayList = this.f17638F.f17853b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.f17660Q;
        if (oVar.f17829n) {
            oVar.f17828m = 0;
            oVar.f17829n = false;
            this.f17638F.L();
        }
        this.f17660Q.p1(this.f17653M0);
        d1();
        Q1(false);
        this.f17646J.f();
        int[] iArr = this.f17671V0;
        if (I(iArr[0], iArr[1])) {
            R(0, 0);
        }
        o1();
        A1();
    }

    private boolean P0(View view, View view2, int i4) {
        int i5;
        int i6;
        if (view2 == null || view2 == this || view2 == view || b0(view2) == null) {
            return false;
        }
        if (view == null || b0(view) == null) {
            return true;
        }
        this.f17652M.set(0, 0, view.getWidth(), view.getHeight());
        this.f17654N.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f17652M);
        offsetDescendantRectToMyCoords(view2, this.f17654N);
        char c4 = 65535;
        if (this.f17660Q.i0() == 1) {
            i5 = -1;
        } else {
            i5 = 1;
        }
        Rect rect = this.f17652M;
        int i7 = rect.left;
        Rect rect2 = this.f17654N;
        int i8 = rect2.left;
        if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
            i6 = 1;
        } else {
            int i9 = rect.right;
            int i10 = rect2.right;
            if ((i9 > i10 || i7 >= i10) && i7 > i8) {
                i6 = -1;
            } else {
                i6 = 0;
            }
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
            c4 = 1;
        } else {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            if ((i13 <= i14 && i11 < i14) || i11 <= i12) {
                c4 = 0;
            }
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 17) {
                    if (i4 != 33) {
                        if (i4 != 66) {
                            if (i4 == 130) {
                                if (c4 <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            throw new IllegalArgumentException("Invalid direction: " + i4 + Y());
                        }
                        if (i6 <= 0) {
                            return false;
                        }
                        return true;
                    }
                    if (c4 >= 0) {
                        return false;
                    }
                    return true;
                }
                if (i6 >= 0) {
                    return false;
                }
                return true;
            }
            if (c4 <= 0 && (c4 != 0 || i6 * i5 <= 0)) {
                return false;
            }
            return true;
        }
        if (c4 >= 0 && (c4 != 0 || i6 * i5 >= 0)) {
            return false;
        }
        return true;
    }

    private void S1() {
        this.f17647J0.f();
        o oVar = this.f17660Q;
        if (oVar != null) {
            oVar.i2();
        }
    }

    private boolean T(MotionEvent motionEvent) {
        s sVar = this.f17670V;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return d0(motionEvent);
        }
        sVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f17670V = null;
        }
        return true;
    }

    private void U0(int i4, int i5, @P MotionEvent motionEvent, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        o oVar = this.f17660Q;
        if (oVar == null) {
            Log.e(f17612g1, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f17687f0) {
            return;
        }
        int[] iArr = this.f17676Z0;
        int i11 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean n4 = oVar.n();
        boolean o4 = this.f17660Q.o();
        if (o4) {
            i7 = (n4 ? 1 : 0) | 2;
        } else {
            i7 = n4 ? 1 : 0;
        }
        f(i7, i6);
        if (n4) {
            i8 = i4;
        } else {
            i8 = 0;
        }
        if (o4) {
            i9 = i5;
        } else {
            i9 = 0;
        }
        if (b(i8, i9, this.f17676Z0, this.f17674X0, i6)) {
            int[] iArr2 = this.f17676Z0;
            i4 -= iArr2[0];
            i5 -= iArr2[1];
        }
        if (n4) {
            i10 = i4;
        } else {
            i10 = 0;
        }
        if (o4) {
            i11 = i5;
        }
        E1(i10, i11, motionEvent, i6);
        androidx.recyclerview.widget.m mVar = this.f17649K0;
        if (mVar != null && (i4 != 0 || i5 != 0)) {
            mVar.f(this, i4, i5);
        }
        g(i6);
    }

    private boolean d0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f17668U.size();
        for (int i4 = 0; i4 < size; i4++) {
            s sVar = this.f17668U.get(i4);
            if (sVar.c(this, motionEvent) && action != 3) {
                this.f17670V = sVar;
                return true;
            }
        }
        return false;
    }

    private void e0(int[] iArr) {
        int g4 = this.f17644I.g();
        if (g4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < g4; i6++) {
            F u02 = u0(this.f17644I.f(i6));
            if (!u02.N()) {
                int p4 = u02.p();
                if (p4 < i4) {
                    i4 = p4;
                }
                if (p4 > i5) {
                    i5 = p4;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
    }

    @P
    static RecyclerView f0(@N View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            RecyclerView f02 = f0(viewGroup.getChildAt(i4));
            if (f02 != null) {
                return f02;
            }
        }
        return null;
    }

    private void f1(MotionEvent motionEvent) {
        int i4;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f17705w0) {
            if (actionIndex == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            this.f17705w0 = motionEvent.getPointerId(i4);
            int x3 = (int) (motionEvent.getX(i4) + 0.5f);
            this.f17632A0 = x3;
            this.f17707y0 = x3;
            int y3 = (int) (motionEvent.getY(i4) + 0.5f);
            this.f17633B0 = y3;
            this.f17708z0 = y3;
        }
    }

    @P
    private View g0() {
        F h02;
        C c4 = this.f17653M0;
        int i4 = c4.f17743m;
        if (i4 == -1) {
            i4 = 0;
        }
        int d4 = c4.d();
        for (int i5 = i4; i5 < d4; i5++) {
            F h03 = h0(i5);
            if (h03 == null) {
                break;
            }
            if (h03.f17770a.hasFocusable()) {
                return h03.f17770a;
            }
        }
        int min = Math.min(d4, i4);
        do {
            min--;
            if (min < 0 || (h02 = h0(min)) == null) {
                return null;
            }
        } while (!h02.f17770a.hasFocusable());
        return h02.f17770a;
    }

    private V getScrollingChildHelper() {
        if (this.f17673W0 == null) {
            this.f17673W0 = new V(this);
        }
        return this.f17673W0;
    }

    private boolean j1() {
        if (this.f17703u0 != null && this.f17660Q.j2()) {
            return true;
        }
        return false;
    }

    private void k1() {
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.f17694l0) {
            this.f17642H.z();
            if (this.f17695m0) {
                this.f17660Q.j1(this);
            }
        }
        if (j1()) {
            this.f17642H.x();
        } else {
            this.f17642H.k();
        }
        boolean z6 = true;
        if (!this.f17659P0 && !this.f17661Q0) {
            z3 = false;
        } else {
            z3 = true;
        }
        C c4 = this.f17653M0;
        if (this.f17681c0 && this.f17703u0 != null && (((z5 = this.f17694l0) || z3 || this.f17660Q.f17823h) && (!z5 || this.f17658P.q()))) {
            z4 = true;
        } else {
            z4 = false;
        }
        c4.f17741k = z4;
        C c5 = this.f17653M0;
        if (!c5.f17741k || !z3 || this.f17694l0 || !j1()) {
            z6 = false;
        }
        c5.f17742l = z6;
    }

    private void m(F f4) {
        boolean z3;
        View view = f4.f17770a;
        if (view.getParent() == this) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f17638F.K(t0(view));
        if (f4.B()) {
            this.f17644I.c(view, -1, view.getLayoutParams(), true);
        } else if (!z3) {
            this.f17644I.b(view, true);
        } else {
            this.f17644I.k(view);
        }
    }

    private void m1(float f4, float f5, float f6, float f7) {
        boolean z3 = true;
        if (f5 < 0.0f) {
            V();
            androidx.core.widget.j.g(this.f17699q0, (-f5) / getWidth(), 1.0f - (f6 / getHeight()));
        } else if (f5 > 0.0f) {
            W();
            androidx.core.widget.j.g(this.f17701s0, f5 / getWidth(), f6 / getHeight());
        } else {
            z3 = false;
        }
        if (f7 < 0.0f) {
            X();
            androidx.core.widget.j.g(this.f17700r0, (-f7) / getHeight(), f4 / getWidth());
        } else if (f7 > 0.0f) {
            U();
            androidx.core.widget.j.g(this.f17702t0, f7 / getHeight(), 1.0f - (f4 / getWidth()));
        } else if (!z3 && f5 == 0.0f && f7 == 0.0f) {
            return;
        }
        C0823k0.n1(this);
    }

    private void o1() {
        F f4;
        View findViewById;
        if (this.f17645I0 && this.f17658P != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (f17621p1 && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        if (this.f17644I.g() == 0) {
                            requestFocus();
                            return;
                        }
                    } else if (!this.f17644I.n(focusedChild)) {
                        return;
                    }
                }
                View view = null;
                if (this.f17653M0.f17744n != -1 && this.f17658P.q()) {
                    f4 = i0(this.f17653M0.f17744n);
                } else {
                    f4 = null;
                }
                if (f4 != null && !this.f17644I.n(f4.f17770a) && f4.f17770a.hasFocusable()) {
                    view = f4.f17770a;
                } else if (this.f17644I.g() > 0) {
                    view = g0();
                }
                if (view != null) {
                    int i4 = this.f17653M0.f17745o;
                    if (i4 != -1 && (findViewById = view.findViewById(i4)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void p1() {
        boolean z3;
        EdgeEffect edgeEffect = this.f17699q0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.f17699q0.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f17700r0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.f17700r0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f17701s0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.f17701s0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f17702t0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.f17702t0.isFinished();
        }
        if (z3) {
            C0823k0.n1(this);
        }
    }

    private void u(@N F f4, @N F f5, @N l.d dVar, @N l.d dVar2, boolean z3, boolean z4) {
        f4.K(false);
        if (z3) {
            m(f4);
        }
        if (f4 != f5) {
            if (z4) {
                m(f5);
            }
            f4.f17777h = f5;
            m(f4);
            this.f17638F.K(f4);
            f5.K(false);
            f5.f17778i = f4;
        }
        if (this.f17703u0.b(f4, f5, dVar, dVar2)) {
            i1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static F u0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f17840a;
    }

    static void w0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f17841b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int x0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String y0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void z() {
        B1();
        setScrollState(0);
    }

    private void z1(@N View view, @P View view2) {
        View view3;
        boolean z3;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f17652M.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f17842c) {
                Rect rect = pVar.f17841b;
                Rect rect2 = this.f17652M;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f17652M);
            offsetRectIntoDescendantCoords(view, this.f17652M);
        }
        o oVar = this.f17660Q;
        Rect rect3 = this.f17652M;
        boolean z4 = !this.f17681c0;
        if (view2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        oVar.M1(this, view, rect3, z4, z3);
    }

    @N
    public n A0(int i4) {
        int itemDecorationCount = getItemDecorationCount();
        if (i4 >= 0 && i4 < itemDecorationCount) {
            return this.f17666T.get(i4);
        }
        throw new IndexOutOfBoundsException(i4 + " is an invalid index for size " + itemDecorationCount);
    }

    void B() {
        int j4 = this.f17644I.j();
        for (int i4 = 0; i4 < j4; i4++) {
            F u02 = u0(this.f17644I.i(i4));
            if (!u02.N()) {
                u02.c();
            }
        }
        this.f17638F.e();
    }

    public void C() {
        List<q> list = this.f17693k0;
        if (list != null) {
            list.clear();
        }
    }

    public boolean C0() {
        return this.f17677a0;
    }

    public void D() {
        List<t> list = this.f17657O0;
        if (list != null) {
            list.clear();
        }
    }

    public boolean D0() {
        if (this.f17681c0 && !this.f17694l0 && !this.f17642H.q()) {
            return false;
        }
        return true;
    }

    void D1() {
        int j4 = this.f17644I.j();
        for (int i4 = 0; i4 < j4; i4++) {
            F u02 = u0(this.f17644I.i(i4));
            if (!u02.N()) {
                u02.I();
            }
        }
    }

    void E(int i4, int i5) {
        boolean z3;
        EdgeEffect edgeEffect = this.f17699q0;
        if (edgeEffect != null && !edgeEffect.isFinished() && i4 > 0) {
            this.f17699q0.onRelease();
            z3 = this.f17699q0.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f17701s0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.f17701s0.onRelease();
            z3 |= this.f17701s0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f17700r0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.f17700r0.onRelease();
            z3 |= this.f17700r0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f17702t0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.f17702t0.onRelease();
            z3 |= this.f17702t0.isFinished();
        }
        if (z3) {
            C0823k0.n1(this);
        }
    }

    boolean E1(int i4, int i5, MotionEvent motionEvent, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        F();
        if (this.f17658P != null) {
            int[] iArr = this.f17676Z0;
            iArr[0] = 0;
            iArr[1] = 0;
            F1(i4, i5, iArr);
            int[] iArr2 = this.f17676Z0;
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            i7 = i12;
            i8 = i11;
            i9 = i4 - i11;
            i10 = i5 - i12;
        } else {
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
        }
        if (!this.f17666T.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f17676Z0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        c(i8, i7, i9, i10, this.f17674X0, i6, iArr3);
        int[] iArr4 = this.f17676Z0;
        int i13 = iArr4[0];
        int i14 = i9 - i13;
        int i15 = iArr4[1];
        int i16 = i10 - i15;
        if (i13 == 0 && i15 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        int i17 = this.f17632A0;
        int[] iArr5 = this.f17674X0;
        int i18 = iArr5[0];
        this.f17632A0 = i17 - i18;
        int i19 = this.f17633B0;
        int i20 = iArr5[1];
        this.f17633B0 = i19 - i20;
        int[] iArr6 = this.f17675Y0;
        iArr6[0] = iArr6[0] + i18;
        iArr6[1] = iArr6[1] + i20;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !Q.l(motionEvent, 8194)) {
                m1(motionEvent.getX(), i14, motionEvent.getY(), i16);
            }
            E(i4, i5);
        }
        if (i8 != 0 || i7 != 0) {
            R(i8, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z3 || i8 != 0 || i7 != 0) {
            return true;
        }
        return false;
    }

    void F() {
        if (this.f17681c0 && !this.f17694l0) {
            if (!this.f17642H.q()) {
                return;
            }
            if (this.f17642H.p(4) && !this.f17642H.p(11)) {
                androidx.core.os.L.b(f17600E1);
                P1();
                c1();
                this.f17642H.x();
                if (!this.f17685e0) {
                    if (E0()) {
                        M();
                    } else {
                        this.f17642H.j();
                    }
                }
                Q1(true);
                d1();
                androidx.core.os.L.d();
                return;
            }
            if (this.f17642H.q()) {
                androidx.core.os.L.b(f17599D1);
                M();
                androidx.core.os.L.d();
                return;
            }
            return;
        }
        androidx.core.os.L.b(f17599D1);
        M();
        androidx.core.os.L.d();
    }

    void F0() {
        this.f17642H = new C0955a(new C0954f());
    }

    void F1(int i4, int i5, @P int[] iArr) {
        int i6;
        int i7;
        P1();
        c1();
        androidx.core.os.L.b(f17597B1);
        Z(this.f17653M0);
        if (i4 != 0) {
            i6 = this.f17660Q.Q1(i4, this.f17638F, this.f17653M0);
        } else {
            i6 = 0;
        }
        if (i5 != 0) {
            i7 = this.f17660Q.S1(i5, this.f17638F, this.f17653M0);
        } else {
            i7 = 0;
        }
        androidx.core.os.L.d();
        y1();
        d1();
        Q1(false);
        if (iArr != null) {
            iArr[0] = i6;
            iArr[1] = i7;
        }
    }

    public void G1(int i4) {
        if (this.f17687f0) {
            return;
        }
        R1();
        o oVar = this.f17660Q;
        if (oVar == null) {
            Log.e(f17612g1, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.R1(i4);
            awakenScrollBars();
        }
    }

    void H(int i4, int i5) {
        setMeasuredDimension(o.q(i4, getPaddingLeft() + getPaddingRight(), C0823k0.f0(this)), o.q(i5, getPaddingTop() + getPaddingBottom(), C0823k0.e0(this)));
    }

    @i0
    void I0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C0966l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C1002a.c.f20981h), resources.getDimensionPixelSize(C1002a.c.f20983j), resources.getDimensionPixelOffset(C1002a.c.f20982i));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + Y());
        }
    }

    @i0
    boolean I1(F f4, int i4) {
        if (N0()) {
            f4.f17786q = i4;
            this.f17678a1.add(f4);
            return false;
        }
        C0823k0.R1(f4.f17770a, i4);
        return true;
    }

    void J(View view) {
        F u02 = u0(view);
        a1(view);
        Adapter adapter = this.f17658P;
        if (adapter != null && u02 != null) {
            adapter.H(u02);
        }
        List<q> list = this.f17693k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f17693k0.get(size).d(view);
            }
        }
    }

    void J0() {
        this.f17702t0 = null;
        this.f17700r0 = null;
        this.f17701s0 = null;
        this.f17699q0 = null;
    }

    boolean J1(AccessibilityEvent accessibilityEvent) {
        int i4;
        int i5 = 0;
        if (!N0()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i4 = C0775b.d(accessibilityEvent);
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            i5 = i4;
        }
        this.f17690h0 |= i5;
        return true;
    }

    void K(View view) {
        F u02 = u0(view);
        b1(view);
        Adapter adapter = this.f17658P;
        if (adapter != null && u02 != null) {
            adapter.I(u02);
        }
        List<q> list = this.f17693k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f17693k0.get(size).b(view);
            }
        }
    }

    public void K0() {
        if (this.f17666T.size() == 0) {
            return;
        }
        o oVar = this.f17660Q;
        if (oVar != null) {
            oVar.i("Cannot invalidate item decorations during a scroll or layout");
        }
        R0();
        requestLayout();
    }

    public void K1(@U int i4, @U int i5) {
        L1(i4, i5, null);
    }

    boolean L0() {
        AccessibilityManager accessibilityManager = this.f17692j0;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return true;
        }
        return false;
    }

    public void L1(@U int i4, @U int i5, @P Interpolator interpolator) {
        M1(i4, i5, interpolator, Integer.MIN_VALUE);
    }

    void M() {
        boolean z3;
        if (this.f17658P == null) {
            Log.w(f17612g1, "No adapter attached; skipping layout");
            return;
        }
        if (this.f17660Q == null) {
            Log.e(f17612g1, "No layout manager attached; skipping layout");
            return;
        }
        this.f17653M0.f17740j = false;
        if (this.f17682c1 && (this.f17684d1 != getWidth() || this.f17686e1 != getHeight())) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f17684d1 = 0;
        this.f17686e1 = 0;
        this.f17682c1 = false;
        if (this.f17653M0.f17735e == 1) {
            N();
            this.f17660Q.U1(this);
            O();
        } else if (!this.f17642H.r() && !z3 && this.f17660Q.z0() == getWidth() && this.f17660Q.e0() == getHeight()) {
            this.f17660Q.U1(this);
        } else {
            this.f17660Q.U1(this);
            O();
        }
        P();
    }

    public boolean M0() {
        l lVar = this.f17703u0;
        if (lVar != null && lVar.q()) {
            return true;
        }
        return false;
    }

    public void M1(@U int i4, @U int i5, @P Interpolator interpolator, int i6) {
        N1(i4, i5, interpolator, i6, false);
    }

    public boolean N0() {
        if (this.f17696n0 > 0) {
            return true;
        }
        return false;
    }

    void N1(@U int i4, @U int i5, @P Interpolator interpolator, int i6, boolean z3) {
        o oVar = this.f17660Q;
        if (oVar == null) {
            Log.e(f17612g1, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f17687f0) {
            return;
        }
        int i7 = 0;
        if (!oVar.n()) {
            i4 = 0;
        }
        if (!this.f17660Q.o()) {
            i5 = 0;
        }
        if (i4 != 0 || i5 != 0) {
            if (i6 != Integer.MIN_VALUE && i6 <= 0) {
                scrollBy(i4, i5);
                return;
            }
            if (z3) {
                if (i4 != 0) {
                    i7 = 1;
                }
                if (i5 != 0) {
                    i7 |= 2;
                }
                f(i7, 1);
            }
            this.f17647J0.e(i4, i5, i6, interpolator);
        }
    }

    @Deprecated
    public boolean O0() {
        return isLayoutSuppressed();
    }

    public void O1(int i4) {
        if (this.f17687f0) {
            return;
        }
        o oVar = this.f17660Q;
        if (oVar == null) {
            Log.e(f17612g1, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.f2(this, this.f17653M0, i4);
        }
    }

    void P1() {
        int i4 = this.f17683d0 + 1;
        this.f17683d0 = i4;
        if (i4 == 1 && !this.f17687f0) {
            this.f17685e0 = false;
        }
    }

    void Q(int i4) {
        o oVar = this.f17660Q;
        if (oVar != null) {
            oVar.v1(i4);
        }
        g1(i4);
        t tVar = this.f17655N0;
        if (tVar != null) {
            tVar.a(this, i4);
        }
        List<t> list = this.f17657O0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f17657O0.get(size).a(this, i4);
            }
        }
    }

    void Q0(int i4) {
        if (this.f17660Q == null) {
            return;
        }
        setScrollState(2);
        this.f17660Q.R1(i4);
        awakenScrollBars();
    }

    void Q1(boolean z3) {
        if (this.f17683d0 < 1) {
            this.f17683d0 = 1;
        }
        if (!z3 && !this.f17687f0) {
            this.f17685e0 = false;
        }
        if (this.f17683d0 == 1) {
            if (z3 && this.f17685e0 && !this.f17687f0 && this.f17660Q != null && this.f17658P != null) {
                M();
            }
            if (!this.f17687f0) {
                this.f17685e0 = false;
            }
        }
        this.f17683d0--;
    }

    void R(int i4, int i5) {
        this.f17697o0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i4, scrollY - i5);
        h1(i4, i5);
        t tVar = this.f17655N0;
        if (tVar != null) {
            tVar.b(this, i4, i5);
        }
        List<t> list = this.f17657O0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f17657O0.get(size).b(this, i4, i5);
            }
        }
        this.f17697o0--;
    }

    void R0() {
        int j4 = this.f17644I.j();
        for (int i4 = 0; i4 < j4; i4++) {
            ((p) this.f17644I.i(i4).getLayoutParams()).f17842c = true;
        }
        this.f17638F.t();
    }

    public void R1() {
        setScrollState(0);
        S1();
    }

    void S() {
        int i4;
        for (int size = this.f17678a1.size() - 1; size >= 0; size--) {
            F f4 = this.f17678a1.get(size);
            if (f4.f17770a.getParent() == this && !f4.N() && (i4 = f4.f17786q) != -1) {
                C0823k0.R1(f4.f17770a, i4);
                f4.f17786q = -1;
            }
        }
        this.f17678a1.clear();
    }

    void S0() {
        int j4 = this.f17644I.j();
        for (int i4 = 0; i4 < j4; i4++) {
            F u02 = u0(this.f17644I.i(i4));
            if (u02 != null && !u02.N()) {
                u02.b(6);
            }
        }
        R0();
        this.f17638F.u();
    }

    public void T0(int i4, int i5) {
        U0(i4, i5, null, 1);
    }

    public void T1(@P Adapter adapter, boolean z3) {
        setLayoutFrozen(false);
        H1(adapter, true, z3);
        l1(true);
        requestLayout();
    }

    void U() {
        if (this.f17702t0 != null) {
            return;
        }
        EdgeEffect a4 = this.f17698p0.a(this, 3);
        this.f17702t0 = a4;
        if (this.f17648K) {
            a4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a4.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void U1(int i4, int i5, Object obj) {
        int i6;
        int j4 = this.f17644I.j();
        int i7 = i4 + i5;
        for (int i8 = 0; i8 < j4; i8++) {
            View i9 = this.f17644I.i(i8);
            F u02 = u0(i9);
            if (u02 != null && !u02.N() && (i6 = u02.f17772c) >= i4 && i6 < i7) {
                u02.b(2);
                u02.a(obj);
                ((p) i9.getLayoutParams()).f17842c = true;
            }
        }
        this.f17638F.N(i4, i5);
    }

    void V() {
        if (this.f17699q0 != null) {
            return;
        }
        EdgeEffect a4 = this.f17698p0.a(this, 0);
        this.f17699q0 = a4;
        if (this.f17648K) {
            a4.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a4.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void V0(@U int i4) {
        int g4 = this.f17644I.g();
        for (int i5 = 0; i5 < g4; i5++) {
            this.f17644I.f(i5).offsetLeftAndRight(i4);
        }
    }

    void W() {
        if (this.f17701s0 != null) {
            return;
        }
        EdgeEffect a4 = this.f17698p0.a(this, 2);
        this.f17701s0 = a4;
        if (this.f17648K) {
            a4.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a4.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void W0(@U int i4) {
        int g4 = this.f17644I.g();
        for (int i5 = 0; i5 < g4; i5++) {
            this.f17644I.f(i5).offsetTopAndBottom(i4);
        }
    }

    void X() {
        if (this.f17700r0 != null) {
            return;
        }
        EdgeEffect a4 = this.f17698p0.a(this, 1);
        this.f17700r0 = a4;
        if (this.f17648K) {
            a4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a4.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void X0(int i4, int i5) {
        int j4 = this.f17644I.j();
        for (int i6 = 0; i6 < j4; i6++) {
            F u02 = u0(this.f17644I.i(i6));
            if (u02 != null && !u02.N() && u02.f17772c >= i4) {
                u02.E(i5, false);
                this.f17653M0.f17737g = true;
            }
        }
        this.f17638F.v(i4, i5);
        requestLayout();
    }

    String Y() {
        return " " + super.toString() + ", adapter:" + this.f17658P + ", layout:" + this.f17660Q + ", context:" + getContext();
    }

    void Y0(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int j4 = this.f17644I.j();
        if (i4 < i5) {
            i8 = -1;
            i7 = i4;
            i6 = i5;
        } else {
            i6 = i4;
            i7 = i5;
            i8 = 1;
        }
        for (int i10 = 0; i10 < j4; i10++) {
            F u02 = u0(this.f17644I.i(i10));
            if (u02 != null && (i9 = u02.f17772c) >= i7 && i9 <= i6) {
                if (i9 == i4) {
                    u02.E(i5 - i4, false);
                } else {
                    u02.E(i8, false);
                }
                this.f17653M0.f17737g = true;
            }
        }
        this.f17638F.w(i4, i5);
        requestLayout();
    }

    final void Z(C c4) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f17647J0.f17750G;
            c4.f17746p = overScroller.getFinalX() - overScroller.getCurrX();
            c4.f17747q = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            c4.f17746p = 0;
            c4.f17747q = 0;
        }
    }

    void Z0(int i4, int i5, boolean z3) {
        int i6 = i4 + i5;
        int j4 = this.f17644I.j();
        for (int i7 = 0; i7 < j4; i7++) {
            F u02 = u0(this.f17644I.i(i7));
            if (u02 != null && !u02.N()) {
                int i8 = u02.f17772c;
                if (i8 >= i6) {
                    u02.E(-i5, z3);
                    this.f17653M0.f17737g = true;
                } else if (i8 >= i4) {
                    u02.i(i4 - 1, -i5, z3);
                    this.f17653M0.f17737g = true;
                }
            }
        }
        this.f17638F.x(i4, i5, z3);
        requestLayout();
    }

    @Override // androidx.core.view.S
    public boolean a(int i4, int i5, int i6, int i7, int[] iArr, int i8) {
        return getScrollingChildHelper().g(i4, i5, i6, i7, iArr, i8);
    }

    @P
    public View a0(float f4, float f5) {
        for (int g4 = this.f17644I.g() - 1; g4 >= 0; g4--) {
            View f6 = this.f17644I.f(g4);
            float translationX = f6.getTranslationX();
            float translationY = f6.getTranslationY();
            if (f4 >= f6.getLeft() + translationX && f4 <= f6.getRight() + translationX && f5 >= f6.getTop() + translationY && f5 <= f6.getBottom() + translationY) {
                return f6;
            }
        }
        return null;
    }

    public void a1(@N View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        o oVar = this.f17660Q;
        if (oVar == null || !oVar.W0(this, arrayList, i4, i5)) {
            super.addFocusables(arrayList, i4, i5);
        }
    }

    @Override // androidx.core.view.S
    public boolean b(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return getScrollingChildHelper().d(i4, i5, iArr, iArr2, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    @androidx.annotation.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View b0(@androidx.annotation.N android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.b0(android.view.View):android.view.View");
    }

    public void b1(@N View view) {
    }

    @Override // androidx.core.view.T
    public final void c(int i4, int i5, int i6, int i7, int[] iArr, int i8, @N int[] iArr2) {
        getScrollingChildHelper().e(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    @P
    public F c0(@N View view) {
        View b02 = b0(view);
        if (b02 == null) {
            return null;
        }
        return t0(b02);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c1() {
        this.f17696n0++;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof p) && this.f17660Q.p((p) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0811g0
    public int computeHorizontalScrollExtent() {
        o oVar = this.f17660Q;
        if (oVar == null || !oVar.n()) {
            return 0;
        }
        return this.f17660Q.t(this.f17653M0);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0811g0
    public int computeHorizontalScrollOffset() {
        o oVar = this.f17660Q;
        if (oVar == null || !oVar.n()) {
            return 0;
        }
        return this.f17660Q.u(this.f17653M0);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0811g0
    public int computeHorizontalScrollRange() {
        o oVar = this.f17660Q;
        if (oVar == null || !oVar.n()) {
            return 0;
        }
        return this.f17660Q.v(this.f17653M0);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0811g0
    public int computeVerticalScrollExtent() {
        o oVar = this.f17660Q;
        if (oVar == null || !oVar.o()) {
            return 0;
        }
        return this.f17660Q.w(this.f17653M0);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0811g0
    public int computeVerticalScrollOffset() {
        o oVar = this.f17660Q;
        if (oVar == null || !oVar.o()) {
            return 0;
        }
        return this.f17660Q.x(this.f17653M0);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0811g0
    public int computeVerticalScrollRange() {
        o oVar = this.f17660Q;
        if (oVar == null || !oVar.o()) {
            return 0;
        }
        return this.f17660Q.y(this.f17653M0);
    }

    @Override // androidx.core.view.S
    public boolean d(int i4) {
        return getScrollingChildHelper().l(i4);
    }

    void d1() {
        e1(true);
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return getScrollingChildHelper().a(f4, f5, z3);
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return getScrollingChildHelper().b(f4, f5);
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().f(i4, i5, i6, i7, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        int i5;
        super.draw(canvas);
        int size = this.f17666T.size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            this.f17666T.get(i6).k(canvas, this, this.f17653M0);
        }
        EdgeEffect edgeEffect = this.f17699q0;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f17648K) {
                i5 = getPaddingBottom();
            } else {
                i5 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i5, 0.0f);
            EdgeEffect edgeEffect2 = this.f17699q0;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect3 = this.f17700r0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f17648K) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f17700r0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z5 = true;
            } else {
                z5 = false;
            }
            z3 |= z5;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f17701s0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f17648K) {
                i4 = getPaddingTop();
            } else {
                i4 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i4, -width);
            EdgeEffect edgeEffect6 = this.f17701s0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z4 = true;
            } else {
                z4 = false;
            }
            z3 |= z4;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f17702t0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f17648K) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f17702t0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z6 = true;
            }
            z3 |= z6;
            canvas.restoreToCount(save4);
        }
        if ((!z3 && this.f17703u0 != null && this.f17666T.size() > 0 && this.f17703u0.q()) || z3) {
            C0823k0.n1(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1(boolean z3) {
        int i4 = this.f17696n0 - 1;
        this.f17696n0 = i4;
        if (i4 < 1) {
            this.f17696n0 = 0;
            if (z3) {
                L();
                S();
            }
        }
    }

    @Override // androidx.core.view.S
    public boolean f(int i4, int i5) {
        return getScrollingChildHelper().s(i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i4) {
        boolean z3;
        View view2;
        boolean z4;
        boolean z5;
        boolean z6;
        int i5;
        int i6;
        View h12 = this.f17660Q.h1(view, i4);
        if (h12 != null) {
            return h12;
        }
        boolean z7 = true;
        if (this.f17658P != null && this.f17660Q != null && !N0() && !this.f17687f0) {
            z3 = true;
        } else {
            z3 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i4 == 2 || i4 == 1)) {
            if (this.f17660Q.o()) {
                if (i4 == 2) {
                    i6 = 130;
                } else {
                    i6 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i6) == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (f17620o1) {
                    i4 = i6;
                }
            } else {
                z4 = false;
            }
            if (!z4 && this.f17660Q.n()) {
                if (this.f17660Q.i0() == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (i4 == 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z5 ^ z6) {
                    i5 = 66;
                } else {
                    i5 = 17;
                }
                if (focusFinder.findNextFocus(this, view, i5) != null) {
                    z7 = false;
                }
                if (f17620o1) {
                    i4 = i5;
                }
                z4 = z7;
            }
            if (z4) {
                F();
                if (b0(view) == null) {
                    return null;
                }
                P1();
                this.f17660Q.a1(view, i4, this.f17638F, this.f17653M0);
                Q1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i4);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i4);
            if (findNextFocus == null && z3) {
                F();
                if (b0(view) == null) {
                    return null;
                }
                P1();
                view2 = this.f17660Q.a1(view, i4, this.f17638F, this.f17653M0);
                Q1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i4);
            }
            z1(view2, null);
            return view;
        }
        if (!P0(view, view2, i4)) {
            return super.focusSearch(view, i4);
        }
        return view2;
    }

    @Override // androidx.core.view.S
    public void g(int i4) {
        getScrollingChildHelper().u(i4);
    }

    public void g1(int i4) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f17660Q;
        if (oVar != null) {
            return oVar.K();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Y());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f17660Q;
        if (oVar != null) {
            return oVar.L(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @P
    public Adapter getAdapter() {
        return this.f17658P;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.f17660Q;
        if (oVar != null) {
            return oVar.N();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        j jVar = this.f17669U0;
        if (jVar == null) {
            return super.getChildDrawingOrder(i4, i5);
        }
        return jVar.a(i4, i5);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f17648K;
    }

    @P
    public androidx.recyclerview.widget.A getCompatAccessibilityDelegate() {
        return this.f17667T0;
    }

    @N
    public k getEdgeEffectFactory() {
        return this.f17698p0;
    }

    @P
    public l getItemAnimator() {
        return this.f17703u0;
    }

    public int getItemDecorationCount() {
        return this.f17666T.size();
    }

    @P
    public o getLayoutManager() {
        return this.f17660Q;
    }

    public int getMaxFlingVelocity() {
        return this.f17639F0;
    }

    public int getMinFlingVelocity() {
        return this.f17637E0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f17619n1) {
            return System.nanoTime();
        }
        return 0L;
    }

    @P
    public r getOnFlingListener() {
        return this.f17635D0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f17645I0;
    }

    @N
    public v getRecycledViewPool() {
        return this.f17638F.j();
    }

    public int getScrollState() {
        return this.f17704v0;
    }

    void h(int i4, int i5) {
        if (i4 < 0) {
            V();
            if (this.f17699q0.isFinished()) {
                this.f17699q0.onAbsorb(-i4);
            }
        } else if (i4 > 0) {
            W();
            if (this.f17701s0.isFinished()) {
                this.f17701s0.onAbsorb(i4);
            }
        }
        if (i5 < 0) {
            X();
            if (this.f17700r0.isFinished()) {
                this.f17700r0.onAbsorb(-i5);
            }
        } else if (i5 > 0) {
            U();
            if (this.f17702t0.isFinished()) {
                this.f17702t0.onAbsorb(i5);
            }
        }
        if (i4 != 0 || i5 != 0) {
            C0823k0.n1(this);
        }
    }

    @P
    public F h0(int i4) {
        F f4 = null;
        if (this.f17694l0) {
            return null;
        }
        int j4 = this.f17644I.j();
        for (int i5 = 0; i5 < j4; i5++) {
            F u02 = u0(this.f17644I.i(i5));
            if (u02 != null && !u02.z() && n0(u02) == i4) {
                if (this.f17644I.n(u02.f17770a)) {
                    f4 = u02;
                } else {
                    return u02;
                }
            }
        }
        return f4;
    }

    public void h1(@U int i4, @U int i5) {
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public F i0(long j4) {
        Adapter adapter = this.f17658P;
        F f4 = null;
        if (adapter != null && adapter.q()) {
            int j5 = this.f17644I.j();
            for (int i4 = 0; i4 < j5; i4++) {
                F u02 = u0(this.f17644I.i(i4));
                if (u02 != null && !u02.z() && u02.n() == j4) {
                    if (this.f17644I.n(u02.f17770a)) {
                        f4 = u02;
                    } else {
                        return u02;
                    }
                }
            }
        }
        return f4;
    }

    void i1() {
        if (!this.f17665S0 && this.f17672W) {
            C0823k0.p1(this, this.f17680b1);
            this.f17665S0 = true;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f17672W;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f17687f0;
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    @P
    public F j0(int i4) {
        return l0(i4, false);
    }

    @P
    @Deprecated
    public F k0(int i4) {
        return l0(i4, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    @androidx.annotation.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.F l0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.g r0 = r5.f17644I
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.g r3 = r5.f17644I
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$F r3 = u0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.z()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f17772c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.p()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.g r1 = r5.f17644I
            android.view.View r4 = r3.f17770a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l0(int, boolean):androidx.recyclerview.widget.RecyclerView$F");
    }

    void l1(boolean z3) {
        this.f17695m0 = z3 | this.f17695m0;
        this.f17694l0 = true;
        S0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean m0(int i4, int i5) {
        boolean z3;
        o oVar = this.f17660Q;
        if (oVar == null) {
            Log.e(f17612g1, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f17687f0) {
            return false;
        }
        int n4 = oVar.n();
        boolean o4 = this.f17660Q.o();
        if (n4 == 0 || Math.abs(i4) < this.f17637E0) {
            i4 = 0;
        }
        if (!o4 || Math.abs(i5) < this.f17637E0) {
            i5 = 0;
        }
        if (i4 == 0 && i5 == 0) {
            return false;
        }
        float f4 = i4;
        float f5 = i5;
        if (!dispatchNestedPreFling(f4, f5)) {
            if (n4 == 0 && !o4) {
                z3 = false;
            } else {
                z3 = true;
            }
            dispatchNestedFling(f4, f5, z3);
            r rVar = this.f17635D0;
            if (rVar != null && rVar.a(i4, i5)) {
                return true;
            }
            if (z3) {
                if (o4) {
                    n4 = (n4 == true ? 1 : 0) | 2;
                }
                f(n4, 1);
                int i6 = this.f17639F0;
                int max = Math.max(-i6, Math.min(i4, i6));
                int i7 = this.f17639F0;
                this.f17647J0.b(max, Math.max(-i7, Math.min(i5, i7)));
                return true;
            }
        }
        return false;
    }

    public void n(@N n nVar) {
        o(nVar, -1);
    }

    int n0(F f4) {
        if (!f4.t(524) && f4.w()) {
            return this.f17642H.f(f4.f17772c);
        }
        return -1;
    }

    void n1(F f4, l.d dVar) {
        f4.J(0, 8192);
        if (this.f17653M0.f17739i && f4.C() && !f4.z() && !f4.N()) {
            this.f17646J.c(o0(f4), f4);
        }
        this.f17646J.e(f4, dVar);
    }

    public void o(@N n nVar, int i4) {
        o oVar = this.f17660Q;
        if (oVar != null) {
            oVar.i("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f17666T.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i4 < 0) {
            this.f17666T.add(nVar);
        } else {
            this.f17666T.add(i4, nVar);
        }
        R0();
        requestLayout();
    }

    long o0(F f4) {
        if (this.f17658P.q()) {
            return f4.n();
        }
        return f4.f17772c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f17696n0 = r0
            r1 = 1
            r5.f17672W = r1
            boolean r2 = r5.f17681c0
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f17681c0 = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r5.f17660Q
            if (r1 == 0) goto L1e
            r1.F(r5)
        L1e:
            r5.f17665S0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f17619n1
            if (r0 == 0) goto L61
            java.lang.ThreadLocal<androidx.recyclerview.widget.m> r0 = androidx.recyclerview.widget.m.f18181I
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.m r1 = (androidx.recyclerview.widget.m) r1
            r5.f17649K0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.m r1 = new androidx.recyclerview.widget.m
            r1.<init>()
            r5.f17649K0 = r1
            android.view.Display r1 = androidx.core.view.C0823k0.Q(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.m r2 = r5.f17649K0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f18185G = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.m r0 = r5.f17649K0
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.m mVar;
        super.onDetachedFromWindow();
        l lVar = this.f17703u0;
        if (lVar != null) {
            lVar.l();
        }
        R1();
        this.f17672W = false;
        o oVar = this.f17660Q;
        if (oVar != null) {
            oVar.G(this, this.f17638F);
        }
        this.f17678a1.clear();
        removeCallbacks(this.f17680b1);
        this.f17646J.j();
        if (f17619n1 && (mVar = this.f17649K0) != null) {
            mVar.j(this);
            this.f17649K0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f17666T.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f17666T.get(i4).i(canvas, this, this.f17653M0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f17660Q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f17687f0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f17660Q
            boolean r0 = r0.o()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f17660Q
            boolean r3 = r3.n()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f17660Q
            boolean r3 = r3.o()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f17660Q
            boolean r3 = r3.n()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.f17641G0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f17643H0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.U0(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        androidx.core.os.L.b(f17598C1);
        M();
        androidx.core.os.L.d();
        this.f17681c0 = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        o oVar = this.f17660Q;
        if (oVar == null) {
            H(i4, i5);
            return;
        }
        boolean z3 = false;
        if (oVar.F0()) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.f17660Q.q1(this.f17638F, this.f17653M0, i4, i5);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z3 = true;
            }
            this.f17682c1 = z3;
            if (!z3 && this.f17658P != null) {
                if (this.f17653M0.f17735e == 1) {
                    N();
                }
                this.f17660Q.W1(i4, i5);
                this.f17653M0.f17740j = true;
                O();
                this.f17660Q.Z1(i4, i5);
                if (this.f17660Q.d2()) {
                    this.f17660Q.W1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f17653M0.f17740j = true;
                    O();
                    this.f17660Q.Z1(i4, i5);
                }
                this.f17684d1 = getMeasuredWidth();
                this.f17686e1 = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.f17677a0) {
            this.f17660Q.q1(this.f17638F, this.f17653M0, i4, i5);
            return;
        }
        if (this.f17691i0) {
            P1();
            c1();
            k1();
            d1();
            C c4 = this.f17653M0;
            if (c4.f17742l) {
                c4.f17738h = true;
            } else {
                this.f17642H.k();
                this.f17653M0.f17738h = false;
            }
            this.f17691i0 = false;
            Q1(false);
        } else if (this.f17653M0.f17742l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.f17658P;
        if (adapter != null) {
            this.f17653M0.f17736f = adapter.l();
        } else {
            this.f17653M0.f17736f = 0;
        }
        P1();
        this.f17660Q.q1(this.f17638F, this.f17653M0, i4, i5);
        Q1(false);
        this.f17653M0.f17738h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (N0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f17640G = zVar;
        super.onRestoreInstanceState(zVar.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f17640G;
        if (zVar2 != null) {
            zVar.b(zVar2);
        } else {
            o oVar = this.f17660Q;
            if (oVar != null) {
                zVar.f17862G = oVar.u1();
            } else {
                zVar.f17862G = null;
            }
        }
        return zVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 != i6 || i5 != i7) {
            J0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(@N q qVar) {
        if (this.f17693k0 == null) {
            this.f17693k0 = new ArrayList();
        }
        this.f17693k0.add(qVar);
    }

    public int p0(@N View view) {
        F u02 = u0(view);
        if (u02 != null) {
            return u02.j();
        }
        return -1;
    }

    public void q(@N s sVar) {
        this.f17668U.add(sVar);
    }

    public long q0(@N View view) {
        F u02;
        Adapter adapter = this.f17658P;
        if (adapter == null || !adapter.q() || (u02 = u0(view)) == null) {
            return -1L;
        }
        return u02.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q1() {
        l lVar = this.f17703u0;
        if (lVar != null) {
            lVar.l();
        }
        o oVar = this.f17660Q;
        if (oVar != null) {
            oVar.D1(this.f17638F);
            this.f17660Q.E1(this.f17638F);
        }
        this.f17638F.d();
    }

    public void r(@N t tVar) {
        if (this.f17657O0 == null) {
            this.f17657O0 = new ArrayList();
        }
        this.f17657O0.add(tVar);
    }

    public int r0(@N View view) {
        F u02 = u0(view);
        if (u02 != null) {
            return u02.p();
        }
        return -1;
    }

    boolean r1(View view) {
        P1();
        boolean r4 = this.f17644I.r(view);
        if (r4) {
            F u02 = u0(view);
            this.f17638F.K(u02);
            this.f17638F.D(u02);
        }
        Q1(!r4);
        return r4;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z3) {
        F u02 = u0(view);
        if (u02 != null) {
            if (u02.B()) {
                u02.f();
            } else if (!u02.N()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + u02 + Y());
            }
        }
        view.clearAnimation();
        K(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f17660Q.s1(this, this.f17653M0, view, view2) && view2 != null) {
            z1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f17660Q.L1(this, view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        int size = this.f17668U.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f17668U.get(i4).e(z3);
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f17683d0 == 0 && !this.f17687f0) {
            super.requestLayout();
        } else {
            this.f17685e0 = true;
        }
    }

    public void s(@N x xVar) {
        boolean z3;
        if (xVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        androidx.core.util.u.b(z3, "'listener' arg cannot be null.");
        this.f17664S.add(xVar);
    }

    @Deprecated
    public int s0(@N View view) {
        return p0(view);
    }

    public void s1(@N n nVar) {
        boolean z3;
        o oVar = this.f17660Q;
        if (oVar != null) {
            oVar.i("Cannot remove item decoration during a scroll  or layout");
        }
        this.f17666T.remove(nVar);
        if (this.f17666T.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            setWillNotDraw(z3);
        }
        R0();
        requestLayout();
    }

    @Override // android.view.View
    public void scrollBy(int i4, int i5) {
        o oVar = this.f17660Q;
        if (oVar == null) {
            Log.e(f17612g1, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f17687f0) {
            return;
        }
        boolean n4 = oVar.n();
        boolean o4 = this.f17660Q.o();
        if (n4 || o4) {
            if (!n4) {
                i4 = 0;
            }
            if (!o4) {
                i5 = 0;
            }
            E1(i4, i5, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        Log.w(f17612g1, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (J1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@P androidx.recyclerview.widget.A a4) {
        this.f17667T0 = a4;
        C0823k0.B1(this, a4);
    }

    public void setAdapter(@P Adapter adapter) {
        setLayoutFrozen(false);
        H1(adapter, false, true);
        l1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@P j jVar) {
        boolean z3;
        if (jVar == this.f17669U0) {
            return;
        }
        this.f17669U0 = jVar;
        if (jVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        setChildrenDrawingOrderEnabled(z3);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.f17648K) {
            J0();
        }
        this.f17648K = z3;
        super.setClipToPadding(z3);
        if (this.f17681c0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@N k kVar) {
        androidx.core.util.u.l(kVar);
        this.f17698p0 = kVar;
        J0();
    }

    public void setHasFixedSize(boolean z3) {
        this.f17677a0 = z3;
    }

    public void setItemAnimator(@P l lVar) {
        l lVar2 = this.f17703u0;
        if (lVar2 != null) {
            lVar2.l();
            this.f17703u0.A(null);
        }
        this.f17703u0 = lVar;
        if (lVar != null) {
            lVar.A(this.f17663R0);
        }
    }

    public void setItemViewCacheSize(int i4) {
        this.f17638F.H(i4);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(@P o oVar) {
        if (oVar == this.f17660Q) {
            return;
        }
        R1();
        if (this.f17660Q != null) {
            l lVar = this.f17703u0;
            if (lVar != null) {
                lVar.l();
            }
            this.f17660Q.D1(this.f17638F);
            this.f17660Q.E1(this.f17638F);
            this.f17638F.d();
            if (this.f17672W) {
                this.f17660Q.G(this, this.f17638F);
            }
            this.f17660Q.b2(null);
            this.f17660Q = null;
        } else {
            this.f17638F.d();
        }
        this.f17644I.o();
        this.f17660Q = oVar;
        if (oVar != null) {
            if (oVar.f17817b == null) {
                oVar.b2(this);
                if (this.f17672W) {
                    this.f17660Q.F(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f17817b.Y());
            }
        }
        this.f17638F.L();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View, androidx.core.view.U
    public void setNestedScrollingEnabled(boolean z3) {
        getScrollingChildHelper().p(z3);
    }

    public void setOnFlingListener(@P r rVar) {
        this.f17635D0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(@P t tVar) {
        this.f17655N0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f17645I0 = z3;
    }

    public void setRecycledViewPool(@P v vVar) {
        this.f17638F.F(vVar);
    }

    @Deprecated
    public void setRecyclerListener(@P x xVar) {
        this.f17662R = xVar;
    }

    void setScrollState(int i4) {
        if (i4 == this.f17704v0) {
            return;
        }
        this.f17704v0 = i4;
        if (i4 != 2) {
            S1();
        }
        Q(i4);
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 != 1) {
                Log.w(f17612g1, "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
            } else {
                this.f17634C0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f17634C0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@P D d4) {
        this.f17638F.G(d4);
    }

    @Override // android.view.View, androidx.core.view.U
    public boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().r(i4);
    }

    @Override // android.view.View, androidx.core.view.U
    public void stopNestedScroll() {
        getScrollingChildHelper().t();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z3) {
        if (z3 != this.f17687f0) {
            x("Do not suppressLayout in layout or scroll");
            if (!z3) {
                this.f17687f0 = false;
                if (this.f17685e0 && this.f17660Q != null && this.f17658P != null) {
                    requestLayout();
                }
                this.f17685e0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f17687f0 = true;
            this.f17689g0 = true;
            R1();
        }
    }

    void t(@N F f4, @P l.d dVar, @N l.d dVar2) {
        f4.K(false);
        if (this.f17703u0.a(f4, dVar, dVar2)) {
            i1();
        }
    }

    public F t0(@N View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return u0(view);
    }

    public void t1(int i4) {
        int itemDecorationCount = getItemDecorationCount();
        if (i4 >= 0 && i4 < itemDecorationCount) {
            s1(A0(i4));
            return;
        }
        throw new IndexOutOfBoundsException(i4 + " is an invalid index for size " + itemDecorationCount);
    }

    public void u1(@N q qVar) {
        List<q> list = this.f17693k0;
        if (list == null) {
            return;
        }
        list.remove(qVar);
    }

    void v(@N F f4, @N l.d dVar, @P l.d dVar2) {
        m(f4);
        f4.K(false);
        if (this.f17703u0.c(f4, dVar, dVar2)) {
            i1();
        }
    }

    public void v0(@N View view, @N Rect rect) {
        w0(view, rect);
    }

    public void v1(@N s sVar) {
        this.f17668U.remove(sVar);
        if (this.f17670V == sVar) {
            this.f17670V = null;
        }
    }

    void w(String str) {
        if (!N0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + Y());
            }
            throw new IllegalStateException(str + Y());
        }
    }

    public void w1(@N t tVar) {
        List<t> list = this.f17657O0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    void x(String str) {
        if (N0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + Y());
            }
            throw new IllegalStateException(str);
        }
        if (this.f17697o0 > 0) {
            Log.w(f17612g1, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + Y()));
        }
    }

    public void x1(@N x xVar) {
        this.f17664S.remove(xVar);
    }

    boolean y(F f4) {
        l lVar = this.f17703u0;
        if (lVar != null && !lVar.g(f4, f4.s())) {
            return false;
        }
        return true;
    }

    void y1() {
        F f4;
        int g4 = this.f17644I.g();
        for (int i4 = 0; i4 < g4; i4++) {
            View f5 = this.f17644I.f(i4);
            F t02 = t0(f5);
            if (t02 != null && (f4 = t02.f17778i) != null) {
                View view = f4.f17770a;
                int left = f5.getLeft();
                int top = f5.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    Rect z0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f17842c) {
            return pVar.f17841b;
        }
        if (this.f17653M0.j() && (pVar.f() || pVar.h())) {
            return pVar.f17841b;
        }
        Rect rect = pVar.f17841b;
        rect.set(0, 0, 0, 0);
        int size = this.f17666T.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f17652M.set(0, 0, 0, 0);
            this.f17666T.get(i4).g(this.f17652M, view, this, this.f17653M0);
            int i5 = rect.left;
            Rect rect2 = this.f17652M;
            rect.left = i5 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f17842c = false;
        return rect;
    }

    public RecyclerView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, C1002a.C0193a.f20961r);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class z extends androidx.customview.view.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* renamed from: G, reason: collision with root package name */
        Parcelable f17862G;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<z> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i4) {
                return new z[i4];
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17862G = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        void b(z zVar) {
            this.f17862G = zVar.f17862G;
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeParcelable(this.f17862G, 0);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f17636E = new y();
        this.f17638F = new w();
        this.f17646J = new K();
        this.f17650L = new RunnableC0949a();
        this.f17652M = new Rect();
        this.f17654N = new Rect();
        this.f17656O = new RectF();
        this.f17664S = new ArrayList();
        this.f17666T = new ArrayList<>();
        this.f17668U = new ArrayList<>();
        this.f17683d0 = 0;
        this.f17694l0 = false;
        this.f17695m0 = false;
        this.f17696n0 = 0;
        this.f17697o0 = 0;
        this.f17698p0 = new k();
        this.f17703u0 = new C0963i();
        this.f17704v0 = 0;
        this.f17705w0 = -1;
        this.f17641G0 = Float.MIN_VALUE;
        this.f17643H0 = Float.MIN_VALUE;
        this.f17645I0 = true;
        this.f17647J0 = new E();
        this.f17651L0 = f17619n1 ? new m.b() : null;
        this.f17653M0 = new C();
        this.f17659P0 = false;
        this.f17661Q0 = false;
        this.f17663R0 = new m();
        this.f17665S0 = false;
        this.f17671V0 = new int[2];
        this.f17674X0 = new int[2];
        this.f17675Y0 = new int[2];
        this.f17676Z0 = new int[2];
        this.f17678a1 = new ArrayList();
        this.f17680b1 = new RunnableC0950b();
        this.f17684d1 = 0;
        this.f17686e1 = 0;
        this.f17688f1 = new C0952d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f17634C0 = viewConfiguration.getScaledTouchSlop();
        this.f17641G0 = C0832m0.b(viewConfiguration, context);
        this.f17643H0 = C0832m0.e(viewConfiguration, context);
        this.f17637E0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f17639F0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f17703u0.A(this.f17663R0);
        F0();
        H0();
        G0();
        if (C0823k0.V(this) == 0) {
            C0823k0.R1(this, 1);
        }
        this.f17692j0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.A(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1002a.j.f21111P, i4, 0);
        C0823k0.z1(this, context, C1002a.j.f21111P, attributeSet, obtainStyledAttributes, i4, 0);
        String string = obtainStyledAttributes.getString(C1002a.j.f21120Y);
        if (obtainStyledAttributes.getInt(C1002a.j.f21114S, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f17648K = obtainStyledAttributes.getBoolean(C1002a.j.f21113R, true);
        boolean z3 = obtainStyledAttributes.getBoolean(C1002a.j.f21115T, false);
        this.f17679b0 = z3;
        if (z3) {
            I0((StateListDrawable) obtainStyledAttributes.getDrawable(C1002a.j.f21118W), obtainStyledAttributes.getDrawable(C1002a.j.f21119X), (StateListDrawable) obtainStyledAttributes.getDrawable(C1002a.j.f21116U), obtainStyledAttributes.getDrawable(C1002a.j.f21117V));
        }
        obtainStyledAttributes.recycle();
        G(context, string, attributeSet, i4, 0);
        int[] iArr = f17615j1;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        C0823k0.z1(this, context, iArr, attributeSet, obtainStyledAttributes2, i4, 0);
        boolean z4 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z4);
    }

    /* loaded from: classes.dex */
    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        F f17840a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f17841b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17842c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17843d;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17841b = new Rect();
            this.f17842c = true;
            this.f17843d = false;
        }

        public int a() {
            return this.f17840a.j();
        }

        public int b() {
            return this.f17840a.m();
        }

        @Deprecated
        public int c() {
            return this.f17840a.m();
        }

        public int d() {
            return this.f17840a.p();
        }

        @Deprecated
        public int e() {
            return this.f17840a.r();
        }

        public boolean f() {
            return this.f17840a.C();
        }

        public boolean g() {
            return this.f17840a.z();
        }

        public boolean h() {
            return this.f17840a.x();
        }

        public boolean i() {
            return this.f17840a.D();
        }

        public p(int i4, int i5) {
            super(i4, i5);
            this.f17841b = new Rect();
            this.f17842c = true;
            this.f17843d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f17841b = new Rect();
            this.f17842c = true;
            this.f17843d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17841b = new Rect();
            this.f17842c = true;
            this.f17843d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f17841b = new Rect();
            this.f17842c = true;
            this.f17843d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f17660Q;
        if (oVar != null) {
            return oVar.M(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Y());
    }
}
