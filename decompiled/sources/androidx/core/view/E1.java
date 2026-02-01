package androidx.core.view;

import android.R;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.E1;

/* loaded from: classes.dex */
public final class E1 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f13130b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13131c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13132d = 2;

    /* renamed from: a, reason: collision with root package name */
    private final e f13133a;

    @androidx.annotation.W(20)
    /* loaded from: classes.dex */
    private static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.N
        protected final Window f13134a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.N
        private final View f13135b;

        a(@androidx.annotation.N Window window, @androidx.annotation.N View view) {
            this.f13134a = window;
            this.f13135b = view;
        }

        private void m(int i4) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 8) {
                        ((InputMethodManager) this.f13134a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f13134a.getDecorView().getWindowToken(), 0);
                        return;
                    }
                    return;
                }
                o(2);
                return;
            }
            o(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void n(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        private void q(int i4) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 8) {
                        final View view = this.f13135b;
                        if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                            view = this.f13134a.getCurrentFocus();
                        } else {
                            view.requestFocus();
                        }
                        if (view == null) {
                            view = this.f13134a.findViewById(R.id.content);
                        }
                        if (view != null && view.hasWindowFocus()) {
                            view.post(new Runnable() { // from class: androidx.core.view.D1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    E1.a.n(view);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
                r(2);
                return;
            }
            r(4);
            s(1024);
        }

        @Override // androidx.core.view.E1.e
        void a(f fVar) {
        }

        @Override // androidx.core.view.E1.e
        void b(int i4, long j4, Interpolator interpolator, CancellationSignal cancellationSignal, M0 m02) {
        }

        @Override // androidx.core.view.E1.e
        int c() {
            return 0;
        }

        @Override // androidx.core.view.E1.e
        void d(int i4) {
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    m(i5);
                }
            }
        }

        @Override // androidx.core.view.E1.e
        void g(@androidx.annotation.N f fVar) {
        }

        @Override // androidx.core.view.E1.e
        void j(int i4) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        r(2048);
                        o(4096);
                        return;
                    }
                    return;
                }
                r(4096);
                o(2048);
                return;
            }
            r(6144);
        }

        @Override // androidx.core.view.E1.e
        void k(int i4) {
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    q(i5);
                }
            }
        }

        protected void o(int i4) {
            View decorView = this.f13134a.getDecorView();
            decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
        }

        protected void p(int i4) {
            this.f13134a.addFlags(i4);
        }

        protected void r(int i4) {
            View decorView = this.f13134a.getDecorView();
            decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
        }

        protected void s(int i4) {
            this.f13134a.clearFlags(i4);
        }
    }

    @androidx.annotation.W(23)
    /* loaded from: classes.dex */
    private static class b extends a {
        b(@androidx.annotation.N Window window, @androidx.annotation.P View view) {
            super(window, view);
        }

        @Override // androidx.core.view.E1.e
        public boolean f() {
            if ((this.f13134a.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.E1.e
        public void i(boolean z3) {
            if (z3) {
                s(67108864);
                p(Integer.MIN_VALUE);
                o(8192);
                return;
            }
            r(8192);
        }
    }

    @androidx.annotation.W(26)
    /* loaded from: classes.dex */
    private static class c extends b {
        c(@androidx.annotation.N Window window, @androidx.annotation.P View view) {
            super(window, view);
        }

        @Override // androidx.core.view.E1.e
        public boolean e() {
            if ((this.f13134a.getDecorView().getSystemUiVisibility() & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.E1.e
        public void h(boolean z3) {
            if (z3) {
                s(134217728);
                p(Integer.MIN_VALUE);
                o(16);
                return;
            }
            r(16);
        }
    }

    /* loaded from: classes.dex */
    private static class e {
        e() {
        }

        void a(f fVar) {
        }

        void b(int i4, long j4, Interpolator interpolator, CancellationSignal cancellationSignal, M0 m02) {
        }

        int c() {
            return 0;
        }

        void d(int i4) {
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        void g(@androidx.annotation.N f fVar) {
        }

        public void h(boolean z3) {
        }

        public void i(boolean z3) {
        }

        void j(int i4) {
        }

        void k(int i4) {
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(@androidx.annotation.N E1 e12, int i4);
    }

    @androidx.annotation.W(30)
    @Deprecated
    private E1(@androidx.annotation.N WindowInsetsController windowInsetsController) {
        this.f13133a = new d(windowInsetsController, this);
    }

    @androidx.annotation.N
    @androidx.annotation.W(30)
    @Deprecated
    public static E1 l(@androidx.annotation.N WindowInsetsController windowInsetsController) {
        return new E1(windowInsetsController);
    }

    public void a(@androidx.annotation.N f fVar) {
        this.f13133a.a(fVar);
    }

    public void b(int i4, long j4, @androidx.annotation.P Interpolator interpolator, @androidx.annotation.P CancellationSignal cancellationSignal, @androidx.annotation.N M0 m02) {
        this.f13133a.b(i4, j4, interpolator, cancellationSignal, m02);
    }

    @SuppressLint({"WrongConstant"})
    public int c() {
        return this.f13133a.c();
    }

    public void d(int i4) {
        this.f13133a.d(i4);
    }

    public boolean e() {
        return this.f13133a.e();
    }

    public boolean f() {
        return this.f13133a.f();
    }

    public void g(@androidx.annotation.N f fVar) {
        this.f13133a.g(fVar);
    }

    public void h(boolean z3) {
        this.f13133a.h(z3);
    }

    public void i(boolean z3) {
        this.f13133a.i(z3);
    }

    public void j(int i4) {
        this.f13133a.j(i4);
    }

    public void k(int i4) {
        this.f13133a.k(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(30)
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final E1 f13136a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f13137b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.collection.l<f, WindowInsetsController.OnControllableInsetsChangedListener> f13138c;

        /* renamed from: d, reason: collision with root package name */
        protected Window f13139d;

        /* loaded from: classes.dex */
        class a implements WindowInsetsAnimationControlListener {

            /* renamed from: a, reason: collision with root package name */
            private X0 f13140a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M0 f13141b;

            a(M0 m02) {
                this.f13141b = m02;
            }

            public void onCancelled(@androidx.annotation.P WindowInsetsAnimationController windowInsetsAnimationController) {
                X0 x02;
                M0 m02 = this.f13141b;
                if (windowInsetsAnimationController == null) {
                    x02 = null;
                } else {
                    x02 = this.f13140a;
                }
                m02.a(x02);
            }

            public void onFinished(@androidx.annotation.N WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f13141b.c(this.f13140a);
            }

            public void onReady(@androidx.annotation.N WindowInsetsAnimationController windowInsetsAnimationController, int i4) {
                X0 x02 = new X0(windowInsetsAnimationController);
                this.f13140a = x02;
                this.f13141b.b(x02, i4);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        d(@androidx.annotation.N android.view.Window r2, @androidx.annotation.N androidx.core.view.E1 r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.core.view.O1.a(r2)
                r1.<init>(r0, r3)
                r1.f13139d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.E1.d.<init>(android.view.Window, androidx.core.view.E1):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(f fVar, WindowInsetsController windowInsetsController, int i4) {
            if (this.f13137b == windowInsetsController) {
                fVar.a(this.f13136a, i4);
            }
        }

        @Override // androidx.core.view.E1.e
        void a(@androidx.annotation.N final f fVar) {
            if (this.f13138c.containsKey(fVar)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.Q1
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i4) {
                    E1.d.this.m(fVar, windowInsetsController, i4);
                }
            };
            this.f13138c.put(fVar, onControllableInsetsChangedListener);
            this.f13137b.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        @Override // androidx.core.view.E1.e
        void b(int i4, long j4, @androidx.annotation.P Interpolator interpolator, @androidx.annotation.P CancellationSignal cancellationSignal, @androidx.annotation.N M0 m02) {
            this.f13137b.controlWindowInsetsAnimation(i4, j4, interpolator, cancellationSignal, new a(m02));
        }

        @Override // androidx.core.view.E1.e
        @SuppressLint({"WrongConstant"})
        int c() {
            int systemBarsBehavior;
            systemBarsBehavior = this.f13137b.getSystemBarsBehavior();
            return systemBarsBehavior;
        }

        @Override // androidx.core.view.E1.e
        void d(int i4) {
            this.f13137b.hide(i4);
        }

        @Override // androidx.core.view.E1.e
        public boolean e() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f13137b.getSystemBarsAppearance();
            if ((systemBarsAppearance & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.E1.e
        public boolean f() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f13137b.getSystemBarsAppearance();
            if ((systemBarsAppearance & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.E1.e
        void g(@androidx.annotation.N f fVar) {
            WindowInsetsController.OnControllableInsetsChangedListener a4 = K1.a(this.f13138c.remove(fVar));
            if (a4 != null) {
                this.f13137b.removeOnControllableInsetsChangedListener(a4);
            }
        }

        @Override // androidx.core.view.E1.e
        public void h(boolean z3) {
            if (z3) {
                if (this.f13139d != null) {
                    n(16);
                }
                this.f13137b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f13139d != null) {
                    o(16);
                }
                this.f13137b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.E1.e
        public void i(boolean z3) {
            if (z3) {
                if (this.f13139d != null) {
                    n(8192);
                }
                this.f13137b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f13139d != null) {
                    o(8192);
                }
                this.f13137b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.E1.e
        void j(int i4) {
            this.f13137b.setSystemBarsBehavior(i4);
        }

        @Override // androidx.core.view.E1.e
        void k(int i4) {
            Window window = this.f13139d;
            if (window != null && (i4 & 8) != 0 && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f13137b.show(i4);
        }

        protected void n(int i4) {
            View decorView = this.f13139d.getDecorView();
            decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
        }

        protected void o(int i4) {
            View decorView = this.f13139d.getDecorView();
            decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
        }

        d(@androidx.annotation.N WindowInsetsController windowInsetsController, @androidx.annotation.N E1 e12) {
            this.f13138c = new androidx.collection.l<>();
            this.f13137b = windowInsetsController;
            this.f13136a = e12;
        }
    }

    public E1(@androidx.annotation.N Window window, @androidx.annotation.N View view) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f13133a = new d(window, this);
        } else if (i4 >= 26) {
            this.f13133a = new c(window, view);
        } else {
            this.f13133a = new b(window, view);
        }
    }
}
