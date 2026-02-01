package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.InterfaceC0577u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.X;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes.dex */
public final class W implements E {

    /* renamed from: N, reason: collision with root package name */
    public static final long f15524N = 700;

    /* renamed from: E, reason: collision with root package name */
    private int f15526E;

    /* renamed from: F, reason: collision with root package name */
    private int f15527F;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private Handler f15530I;

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    public static final b f15523M = new b(null);

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    private static final W f15525O = new W();

    /* renamed from: G, reason: collision with root package name */
    private boolean f15528G = true;

    /* renamed from: H, reason: collision with root package name */
    private boolean f15529H = true;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final G f15531J = new G(this);

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final Runnable f15532K = new Runnable() { // from class: androidx.lifecycle.V
        @Override // java.lang.Runnable
        public final void run() {
            W.j(W.this);
        }
    };

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private final X.a f15533L = new d();

    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final a f15534a = new a();

        private a() {
        }

        @W2.n
        @InterfaceC0577u
        public static final void a(@l3.d Activity activity, @l3.d Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.F.p(activity, "activity");
            kotlin.jvm.internal.F.p(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C2197u c2197u) {
            this();
        }

        @androidx.annotation.i0
        public static /* synthetic */ void b() {
        }

        @W2.n
        @l3.d
        public final E a() {
            return W.f15525O;
        }

        @W2.n
        public final void c(@l3.d Context context) {
            kotlin.jvm.internal.F.p(context, "context");
            W.f15525O.i(context);
        }

        private b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends C0914p {

        /* loaded from: classes.dex */
        public static final class a extends C0914p {
            final /* synthetic */ W this$0;

            a(W w3) {
                this.this$0 = w3;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@l3.d Activity activity) {
                kotlin.jvm.internal.F.p(activity, "activity");
                this.this$0.f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@l3.d Activity activity) {
                kotlin.jvm.internal.F.p(activity, "activity");
                this.this$0.g();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.C0914p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@l3.d Activity activity, @l3.e Bundle bundle) {
            kotlin.jvm.internal.F.p(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                X.f15548F.b(activity).h(W.this.f15533L);
            }
        }

        @Override // androidx.lifecycle.C0914p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
            W.this.e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
        public void onActivityPreCreated(@l3.d Activity activity, @l3.e Bundle bundle) {
            kotlin.jvm.internal.F.p(activity, "activity");
            a.a(activity, new a(W.this));
        }

        @Override // androidx.lifecycle.C0914p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@l3.d Activity activity) {
            kotlin.jvm.internal.F.p(activity, "activity");
            W.this.h();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements X.a {
        d() {
        }

        @Override // androidx.lifecycle.X.a
        public void b() {
            W.this.g();
        }

        @Override // androidx.lifecycle.X.a
        public void c() {
        }

        @Override // androidx.lifecycle.X.a
        public void e() {
            W.this.f();
        }
    }

    private W() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(W this$0) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.k();
        this$0.l();
    }

    @W2.n
    @l3.d
    public static final E m() {
        return f15523M.a();
    }

    @W2.n
    public static final void n(@l3.d Context context) {
        f15523M.c(context);
    }

    public final void e() {
        int i4 = this.f15527F - 1;
        this.f15527F = i4;
        if (i4 == 0) {
            Handler handler = this.f15530I;
            kotlin.jvm.internal.F.m(handler);
            handler.postDelayed(this.f15532K, 700L);
        }
    }

    public final void f() {
        int i4 = this.f15527F + 1;
        this.f15527F = i4;
        if (i4 == 1) {
            if (this.f15528G) {
                this.f15531J.l(Lifecycle.Event.ON_RESUME);
                this.f15528G = false;
            } else {
                Handler handler = this.f15530I;
                kotlin.jvm.internal.F.m(handler);
                handler.removeCallbacks(this.f15532K);
            }
        }
    }

    public final void g() {
        int i4 = this.f15526E + 1;
        this.f15526E = i4;
        if (i4 == 1 && this.f15529H) {
            this.f15531J.l(Lifecycle.Event.ON_START);
            this.f15529H = false;
        }
    }

    @Override // androidx.lifecycle.E
    @l3.d
    public Lifecycle getLifecycle() {
        return this.f15531J;
    }

    public final void h() {
        this.f15526E--;
        l();
    }

    public final void i(@l3.d Context context) {
        kotlin.jvm.internal.F.p(context, "context");
        this.f15530I = new Handler();
        this.f15531J.l(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.F.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void k() {
        if (this.f15527F == 0) {
            this.f15528G = true;
            this.f15531J.l(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void l() {
        if (this.f15526E == 0 && this.f15528G) {
            this.f15531J.l(Lifecycle.Event.ON_STOP);
            this.f15529H = true;
        }
    }
}
