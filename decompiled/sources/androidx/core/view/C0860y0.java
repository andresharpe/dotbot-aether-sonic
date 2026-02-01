package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.RestrictTo;
import androidx.core.view.Y0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import m.C2356a;

/* renamed from: androidx.core.view.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0860y0 {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f13663b = false;

    /* renamed from: c, reason: collision with root package name */
    private static final String f13664c = "WindowInsetsAnimCompat";

    /* renamed from: a, reason: collision with root package name */
    private e f13665a;

    /* renamed from: androidx.core.view.y0$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f13668c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final int f13669d = 1;

        /* renamed from: a, reason: collision with root package name */
        WindowInsets f13670a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13671b;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: androidx.core.view.y0$b$a */
        /* loaded from: classes.dex */
        public @interface a {
        }

        public b(int i4) {
            this.f13671b = i4;
        }

        public final int a() {
            return this.f13671b;
        }

        public void b(@androidx.annotation.N C0860y0 c0860y0) {
        }

        public void c(@androidx.annotation.N C0860y0 c0860y0) {
        }

        @androidx.annotation.N
        public abstract Y0 d(@androidx.annotation.N Y0 y02, @androidx.annotation.N List<C0860y0> list);

        @androidx.annotation.N
        public a e(@androidx.annotation.N C0860y0 c0860y0, @androidx.annotation.N a aVar) {
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(21)
    /* renamed from: androidx.core.view.y0$c */
    /* loaded from: classes.dex */
    public static class c extends e {

        /* JADX INFO: Access modifiers changed from: private */
        @androidx.annotation.W(21)
        /* renamed from: androidx.core.view.y0$c$a */
        /* loaded from: classes.dex */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: c, reason: collision with root package name */
            private static final int f13672c = 160;

            /* renamed from: a, reason: collision with root package name */
            final b f13673a;

            /* renamed from: b, reason: collision with root package name */
            private Y0 f13674b;

            /* renamed from: androidx.core.view.y0$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C0109a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C0860y0 f13675a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Y0 f13676b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Y0 f13677c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f13678d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f13679e;

                C0109a(C0860y0 c0860y0, Y0 y02, Y0 y03, int i4, View view) {
                    this.f13675a = c0860y0;
                    this.f13676b = y02;
                    this.f13677c = y03;
                    this.f13678d = i4;
                    this.f13679e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f13675a.i(valueAnimator.getAnimatedFraction());
                    c.n(this.f13679e, c.r(this.f13676b, this.f13677c, this.f13675a.d(), this.f13678d), Collections.singletonList(this.f13675a));
                }
            }

            /* renamed from: androidx.core.view.y0$c$a$b */
            /* loaded from: classes.dex */
            class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C0860y0 f13681a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f13682b;

                b(C0860y0 c0860y0, View view) {
                    this.f13681a = c0860y0;
                    this.f13682b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f13681a.i(1.0f);
                    c.l(this.f13682b, this.f13681a);
                }
            }

            /* renamed from: androidx.core.view.y0$c$a$c, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC0110c implements Runnable {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ View f13684E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ C0860y0 f13685F;

                /* renamed from: G, reason: collision with root package name */
                final /* synthetic */ a f13686G;

                /* renamed from: H, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f13687H;

                RunnableC0110c(View view, C0860y0 c0860y0, a aVar, ValueAnimator valueAnimator) {
                    this.f13684E = view;
                    this.f13685F = c0860y0;
                    this.f13686G = aVar;
                    this.f13687H = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.o(this.f13684E, this.f13685F, this.f13686G);
                    this.f13687H.start();
                }
            }

            a(@androidx.annotation.N View view, @androidx.annotation.N b bVar) {
                Y0 y02;
                this.f13673a = bVar;
                Y0 o02 = C0823k0.o0(view);
                if (o02 != null) {
                    y02 = new Y0.b(o02).a();
                } else {
                    y02 = null;
                }
                this.f13674b = y02;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f13674b = Y0.L(windowInsets, view);
                    return c.p(view, windowInsets);
                }
                Y0 L3 = Y0.L(windowInsets, view);
                if (this.f13674b == null) {
                    this.f13674b = C0823k0.o0(view);
                }
                if (this.f13674b == null) {
                    this.f13674b = L3;
                    return c.p(view, windowInsets);
                }
                b q4 = c.q(view);
                if (q4 != null && Objects.equals(q4.f13670a, windowInsets)) {
                    return c.p(view, windowInsets);
                }
                int i4 = c.i(L3, this.f13674b);
                if (i4 == 0) {
                    return c.p(view, windowInsets);
                }
                Y0 y02 = this.f13674b;
                C0860y0 c0860y0 = new C0860y0(i4, new DecelerateInterpolator(), 160L);
                c0860y0.i(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0860y0.b());
                a j4 = c.j(L3, y02, i4);
                c.m(view, c0860y0, windowInsets, false);
                duration.addUpdateListener(new C0109a(c0860y0, L3, y02, i4, view));
                duration.addListener(new b(c0860y0, view));
                ViewTreeObserverOnPreDrawListenerC0802d0.a(view, new RunnableC0110c(view, c0860y0, j4, duration));
                this.f13674b = L3;
                return c.p(view, windowInsets);
            }
        }

        c(int i4, @androidx.annotation.P Interpolator interpolator, long j4) {
            super(i4, interpolator, j4);
        }

        @SuppressLint({"WrongConstant"})
        static int i(@androidx.annotation.N Y0 y02, @androidx.annotation.N Y0 y03) {
            int i4 = 0;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if (!y02.f(i5).equals(y03.f(i5))) {
                    i4 |= i5;
                }
            }
            return i4;
        }

        @androidx.annotation.N
        static a j(@androidx.annotation.N Y0 y02, @androidx.annotation.N Y0 y03, int i4) {
            androidx.core.graphics.E f4 = y02.f(i4);
            androidx.core.graphics.E f5 = y03.f(i4);
            return new a(androidx.core.graphics.E.d(Math.min(f4.f12399a, f5.f12399a), Math.min(f4.f12400b, f5.f12400b), Math.min(f4.f12401c, f5.f12401c), Math.min(f4.f12402d, f5.f12402d)), androidx.core.graphics.E.d(Math.max(f4.f12399a, f5.f12399a), Math.max(f4.f12400b, f5.f12400b), Math.max(f4.f12401c, f5.f12401c), Math.max(f4.f12402d, f5.f12402d)));
        }

        @androidx.annotation.N
        private static View.OnApplyWindowInsetsListener k(@androidx.annotation.N View view, @androidx.annotation.N b bVar) {
            return new a(view, bVar);
        }

        static void l(@androidx.annotation.N View view, @androidx.annotation.N C0860y0 c0860y0) {
            b q4 = q(view);
            if (q4 != null) {
                q4.b(c0860y0);
                if (q4.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    l(viewGroup.getChildAt(i4), c0860y0);
                }
            }
        }

        static void m(View view, C0860y0 c0860y0, WindowInsets windowInsets, boolean z3) {
            b q4 = q(view);
            if (q4 != null) {
                q4.f13670a = windowInsets;
                if (!z3) {
                    q4.c(c0860y0);
                    if (q4.a() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    m(viewGroup.getChildAt(i4), c0860y0, windowInsets, z3);
                }
            }
        }

        static void n(@androidx.annotation.N View view, @androidx.annotation.N Y0 y02, @androidx.annotation.N List<C0860y0> list) {
            b q4 = q(view);
            if (q4 != null) {
                y02 = q4.d(y02, list);
                if (q4.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    n(viewGroup.getChildAt(i4), y02, list);
                }
            }
        }

        static void o(View view, C0860y0 c0860y0, a aVar) {
            b q4 = q(view);
            if (q4 != null) {
                q4.e(c0860y0, aVar);
                if (q4.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    o(viewGroup.getChildAt(i4), c0860y0, aVar);
                }
            }
        }

        @androidx.annotation.N
        static WindowInsets p(@androidx.annotation.N View view, @androidx.annotation.N WindowInsets windowInsets) {
            if (view.getTag(C2356a.e.f54938h0) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        @androidx.annotation.P
        static b q(View view) {
            Object tag = view.getTag(C2356a.e.f54954p0);
            if (tag instanceof a) {
                return ((a) tag).f13673a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        static Y0 r(Y0 y02, Y0 y03, float f4, int i4) {
            Y0.b bVar = new Y0.b(y02);
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) == 0) {
                    bVar.c(i5, y02.f(i5));
                } else {
                    androidx.core.graphics.E f5 = y02.f(i5);
                    androidx.core.graphics.E f6 = y03.f(i5);
                    float f7 = 1.0f - f4;
                    bVar.c(i5, Y0.z(f5, (int) (((f5.f12399a - f6.f12399a) * f7) + 0.5d), (int) (((f5.f12400b - f6.f12400b) * f7) + 0.5d), (int) (((f5.f12401c - f6.f12401c) * f7) + 0.5d), (int) (((f5.f12402d - f6.f12402d) * f7) + 0.5d)));
                }
            }
            return bVar.a();
        }

        static void s(@androidx.annotation.N View view, @androidx.annotation.P b bVar) {
            Object tag = view.getTag(C2356a.e.f54938h0);
            if (bVar == null) {
                view.setTag(C2356a.e.f54954p0, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener k4 = k(view, bVar);
            view.setTag(C2356a.e.f54954p0, k4);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(k4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.y0$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f13694a;

        /* renamed from: b, reason: collision with root package name */
        private float f13695b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.P
        private final Interpolator f13696c;

        /* renamed from: d, reason: collision with root package name */
        private final long f13697d;

        /* renamed from: e, reason: collision with root package name */
        private float f13698e;

        e(int i4, @androidx.annotation.P Interpolator interpolator, long j4) {
            this.f13694a = i4;
            this.f13696c = interpolator;
            this.f13697d = j4;
        }

        public float a() {
            return this.f13698e;
        }

        public long b() {
            return this.f13697d;
        }

        public float c() {
            return this.f13695b;
        }

        public float d() {
            Interpolator interpolator = this.f13696c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.f13695b);
            }
            return this.f13695b;
        }

        @androidx.annotation.P
        public Interpolator e() {
            return this.f13696c;
        }

        public int f() {
            return this.f13694a;
        }

        public void g(float f4) {
            this.f13698e = f4;
        }

        public void h(float f4) {
            this.f13695b = f4;
        }
    }

    public C0860y0(int i4, @androidx.annotation.P Interpolator interpolator, long j4) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f13665a = new d(i4, interpolator, j4);
        } else {
            this.f13665a = new c(i4, interpolator, j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(@androidx.annotation.N View view, @androidx.annotation.P b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.l(view, bVar);
        } else {
            c.s(view, bVar);
        }
    }

    @androidx.annotation.W(30)
    static C0860y0 j(WindowInsetsAnimation windowInsetsAnimation) {
        return new C0860y0(windowInsetsAnimation);
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
    public float a() {
        return this.f13665a.a();
    }

    public long b() {
        return this.f13665a.b();
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
    public float c() {
        return this.f13665a.c();
    }

    public float d() {
        return this.f13665a.d();
    }

    @androidx.annotation.P
    public Interpolator e() {
        return this.f13665a.e();
    }

    public int f() {
        return this.f13665a.f();
    }

    public void g(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f13665a.g(f4);
    }

    public void i(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f13665a.h(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(30)
    /* renamed from: androidx.core.view.y0$d */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: f, reason: collision with root package name */
        @androidx.annotation.N
        private final WindowInsetsAnimation f13689f;

        /* JADX INFO: Access modifiers changed from: private */
        @androidx.annotation.W(30)
        /* renamed from: androidx.core.view.y0$d$a */
        /* loaded from: classes.dex */
        public static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            private final b f13690a;

            /* renamed from: b, reason: collision with root package name */
            private List<C0860y0> f13691b;

            /* renamed from: c, reason: collision with root package name */
            private ArrayList<C0860y0> f13692c;

            /* renamed from: d, reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, C0860y0> f13693d;

            a(@androidx.annotation.N b bVar) {
                super(bVar.a());
                this.f13693d = new HashMap<>();
                this.f13690a = bVar;
            }

            @androidx.annotation.N
            private C0860y0 a(@androidx.annotation.N WindowInsetsAnimation windowInsetsAnimation) {
                C0860y0 c0860y0 = this.f13693d.get(windowInsetsAnimation);
                if (c0860y0 == null) {
                    C0860y0 j4 = C0860y0.j(windowInsetsAnimation);
                    this.f13693d.put(windowInsetsAnimation, j4);
                    return j4;
                }
                return c0860y0;
            }

            public void onEnd(@androidx.annotation.N WindowInsetsAnimation windowInsetsAnimation) {
                this.f13690a.b(a(windowInsetsAnimation));
                this.f13693d.remove(windowInsetsAnimation);
            }

            public void onPrepare(@androidx.annotation.N WindowInsetsAnimation windowInsetsAnimation) {
                this.f13690a.c(a(windowInsetsAnimation));
            }

            @androidx.annotation.N
            public WindowInsets onProgress(@androidx.annotation.N WindowInsets windowInsets, @androidx.annotation.N List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<C0860y0> arrayList = this.f13692c;
                if (arrayList == null) {
                    ArrayList<C0860y0> arrayList2 = new ArrayList<>(list.size());
                    this.f13692c = arrayList2;
                    this.f13691b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a4 = L0.a(list.get(size));
                    C0860y0 a5 = a(a4);
                    fraction = a4.getFraction();
                    a5.i(fraction);
                    this.f13692c.add(a5);
                }
                return this.f13690a.d(Y0.K(windowInsets), this.f13691b).J();
            }

            @androidx.annotation.N
            public WindowInsetsAnimation.Bounds onStart(@androidx.annotation.N WindowInsetsAnimation windowInsetsAnimation, @androidx.annotation.N WindowInsetsAnimation.Bounds bounds) {
                return this.f13690a.e(a(windowInsetsAnimation), a.e(bounds)).d();
            }
        }

        d(@androidx.annotation.N WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f13689f = windowInsetsAnimation;
        }

        @androidx.annotation.N
        public static WindowInsetsAnimation.Bounds i(@androidx.annotation.N a aVar) {
            B0.a();
            return A0.a(aVar.a().h(), aVar.b().h());
        }

        @androidx.annotation.N
        public static androidx.core.graphics.E j(@androidx.annotation.N WindowInsetsAnimation.Bounds bounds) {
            Insets upperBound;
            upperBound = bounds.getUpperBound();
            return androidx.core.graphics.E.g(upperBound);
        }

        @androidx.annotation.N
        public static androidx.core.graphics.E k(@androidx.annotation.N WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return androidx.core.graphics.E.g(lowerBound);
        }

        public static void l(@androidx.annotation.N View view, @androidx.annotation.P b bVar) {
            a aVar;
            if (bVar != null) {
                aVar = new a(bVar);
            } else {
                aVar = null;
            }
            view.setWindowInsetsAnimationCallback(aVar);
        }

        @Override // androidx.core.view.C0860y0.e
        public long b() {
            long durationMillis;
            durationMillis = this.f13689f.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.C0860y0.e
        public float c() {
            float fraction;
            fraction = this.f13689f.getFraction();
            return fraction;
        }

        @Override // androidx.core.view.C0860y0.e
        public float d() {
            float interpolatedFraction;
            interpolatedFraction = this.f13689f.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.C0860y0.e
        @androidx.annotation.P
        public Interpolator e() {
            Interpolator interpolator;
            interpolator = this.f13689f.getInterpolator();
            return interpolator;
        }

        @Override // androidx.core.view.C0860y0.e
        public int f() {
            int typeMask;
            typeMask = this.f13689f.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.C0860y0.e
        public void h(float f4) {
            this.f13689f.setFraction(f4);
        }

        d(int i4, Interpolator interpolator, long j4) {
            this(K0.a(i4, interpolator, j4));
        }
    }

    /* renamed from: androidx.core.view.y0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.core.graphics.E f13666a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.graphics.E f13667b;

        public a(@androidx.annotation.N androidx.core.graphics.E e4, @androidx.annotation.N androidx.core.graphics.E e5) {
            this.f13666a = e4;
            this.f13667b = e5;
        }

        @androidx.annotation.N
        @androidx.annotation.W(30)
        public static a e(@androidx.annotation.N WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        @androidx.annotation.N
        public androidx.core.graphics.E a() {
            return this.f13666a;
        }

        @androidx.annotation.N
        public androidx.core.graphics.E b() {
            return this.f13667b;
        }

        @androidx.annotation.N
        public a c(@androidx.annotation.N androidx.core.graphics.E e4) {
            return new a(Y0.z(this.f13666a, e4.f12399a, e4.f12400b, e4.f12401c, e4.f12402d), Y0.z(this.f13667b, e4.f12399a, e4.f12400b, e4.f12401c, e4.f12402d));
        }

        @androidx.annotation.N
        @androidx.annotation.W(30)
        public WindowInsetsAnimation.Bounds d() {
            return d.i(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f13666a + " upper=" + this.f13667b + "}";
        }

        @androidx.annotation.W(30)
        private a(@androidx.annotation.N WindowInsetsAnimation.Bounds bounds) {
            this.f13666a = d.k(bounds);
            this.f13667b = d.j(bounds);
        }
    }

    @androidx.annotation.W(30)
    private C0860y0(@androidx.annotation.N WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f13665a = new d(windowInsetsAnimation);
        }
    }
}
