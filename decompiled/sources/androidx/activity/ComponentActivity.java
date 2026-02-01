package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.annotation.I;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.InterfaceC0572o;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.K;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.S;
import androidx.annotation.W;
import androidx.core.app.ActivityC0637l;
import androidx.core.app.C0617b;
import androidx.core.app.C0623e;
import androidx.core.app.C0658w;
import androidx.core.app.q1;
import androidx.core.app.r1;
import androidx.core.app.s1;
import androidx.core.app.u1;
import androidx.core.content.G;
import androidx.core.content.H;
import androidx.core.os.C0738a;
import androidx.core.util.InterfaceC0764e;
import androidx.core.view.J;
import androidx.core.view.M;
import androidx.lifecycle.A;
import androidx.lifecycle.E;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.X;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.savedstate.c;
import b.AbstractC1000a;
import b.C1001b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ComponentActivity extends ActivityC0637l implements androidx.activity.contextaware.a, E, q0, InterfaceC0919v, androidx.savedstate.e, o, androidx.activity.result.k, androidx.activity.result.c, G, H, r1, q1, s1, J {

    /* renamed from: X, reason: collision with root package name */
    private static final String f4434X = "android:support:activity-result";

    /* renamed from: G, reason: collision with root package name */
    final androidx.activity.contextaware.b f4435G;

    /* renamed from: H, reason: collision with root package name */
    private final M f4436H;

    /* renamed from: I, reason: collision with root package name */
    private final androidx.lifecycle.G f4437I;

    /* renamed from: J, reason: collision with root package name */
    final androidx.savedstate.d f4438J;

    /* renamed from: K, reason: collision with root package name */
    private p0 f4439K;

    /* renamed from: L, reason: collision with root package name */
    private m0.b f4440L;

    /* renamed from: M, reason: collision with root package name */
    private final OnBackPressedDispatcher f4441M;

    /* renamed from: N, reason: collision with root package name */
    @I
    private int f4442N;

    /* renamed from: O, reason: collision with root package name */
    private final AtomicInteger f4443O;

    /* renamed from: P, reason: collision with root package name */
    private final ActivityResultRegistry f4444P;

    /* renamed from: Q, reason: collision with root package name */
    private final CopyOnWriteArrayList<InterfaceC0764e<Configuration>> f4445Q;

    /* renamed from: R, reason: collision with root package name */
    private final CopyOnWriteArrayList<InterfaceC0764e<Integer>> f4446R;

    /* renamed from: S, reason: collision with root package name */
    private final CopyOnWriteArrayList<InterfaceC0764e<Intent>> f4447S;

    /* renamed from: T, reason: collision with root package name */
    private final CopyOnWriteArrayList<InterfaceC0764e<C0658w>> f4448T;

    /* renamed from: U, reason: collision with root package name */
    private final CopyOnWriteArrayList<InterfaceC0764e<u1>> f4449U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f4450V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f4451W;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e4) {
                if (TextUtils.equals(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                } else {
                    throw e4;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f4457E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ AbstractC1000a.C0190a f4458F;

            a(int i4, AbstractC1000a.C0190a c0190a) {
                this.f4457E = i4;
                this.f4458F = c0190a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f4457E, this.f4458F.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0037b implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f4460E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f4461F;

            RunnableC0037b(int i4, IntentSender.SendIntentException sendIntentException) {
                this.f4460E = i4;
                this.f4461F = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f4460E, 0, new Intent().setAction(C1001b.o.f20941b).putExtra(C1001b.o.f20943d, this.f4461F));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i4, @N AbstractC1000a<I, O> abstractC1000a, I i5, @P C0623e c0623e) {
            Bundle bundle;
            Bundle bundle2;
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC1000a.C0190a<O> b4 = abstractC1000a.b(componentActivity, i5);
            if (b4 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i4, b4));
                return;
            }
            Intent a4 = abstractC1000a.a(componentActivity, i5);
            if (a4.getExtras() != null && a4.getExtras().getClassLoader() == null) {
                a4.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a4.hasExtra(C1001b.n.f20939b)) {
                Bundle bundleExtra = a4.getBundleExtra(C1001b.n.f20939b);
                a4.removeExtra(C1001b.n.f20939b);
                bundle2 = bundleExtra;
            } else {
                if (c0623e != null) {
                    bundle = c0623e.l();
                } else {
                    bundle = null;
                }
                bundle2 = bundle;
            }
            if (C1001b.l.f20935b.equals(a4.getAction())) {
                String[] stringArrayExtra = a4.getStringArrayExtra(C1001b.l.f20936c);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C0617b.J(componentActivity, stringArrayExtra, i4);
                return;
            }
            if (C1001b.o.f20941b.equals(a4.getAction())) {
                androidx.activity.result.l lVar = (androidx.activity.result.l) a4.getParcelableExtra(C1001b.o.f20942c);
                try {
                    C0617b.R(componentActivity, lVar.d(), i4, lVar.a(), lVar.b(), lVar.c(), 0, bundle2);
                    return;
                } catch (IntentSender.SendIntentException e4) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0037b(i4, e4));
                    return;
                }
            }
            C0617b.Q(componentActivity, a4, i4, bundle2);
        }
    }

    @W(19)
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(33)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @InterfaceC0577u
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        Object f4463a;

        /* renamed from: b, reason: collision with root package name */
        p0 f4464b;

        e() {
        }
    }

    public ComponentActivity() {
        this.f4435G = new androidx.activity.contextaware.b();
        this.f4436H = new M(new Runnable() { // from class: androidx.activity.d
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.A();
            }
        });
        this.f4437I = new androidx.lifecycle.G(this);
        androidx.savedstate.d a4 = androidx.savedstate.d.a(this);
        this.f4438J = a4;
        this.f4441M = new OnBackPressedDispatcher(new a());
        this.f4443O = new AtomicInteger();
        this.f4444P = new b();
        this.f4445Q = new CopyOnWriteArrayList<>();
        this.f4446R = new CopyOnWriteArrayList<>();
        this.f4447S = new CopyOnWriteArrayList<>();
        this.f4448T = new CopyOnWriteArrayList<>();
        this.f4449U = new CopyOnWriteArrayList<>();
        this.f4450V = false;
        this.f4451W = false;
        if (getLifecycle() != null) {
            getLifecycle().a(new A() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.A
                public void f(@N E e4, @N Lifecycle.Event event) {
                    View view;
                    if (event == Lifecycle.Event.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            c.a(view);
                        }
                    }
                }
            });
            getLifecycle().a(new A() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.A
                public void f(@N E e4, @N Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ComponentActivity.this.f4435G.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                    }
                }
            });
            getLifecycle().a(new A() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.A
                public void f(@N E e4, @N Lifecycle.Event event) {
                    ComponentActivity.this.J();
                    ComponentActivity.this.getLifecycle().d(this);
                }
            });
            a4.c();
            b0.c(this);
            getSavedStateRegistry().j(f4434X, new c.InterfaceC0173c() { // from class: androidx.activity.e
                @Override // androidx.savedstate.c.InterfaceC0173c
                public final Bundle a() {
                    Bundle M3;
                    M3 = ComponentActivity.this.M();
                    return M3;
                }
            });
            z(new androidx.activity.contextaware.c() { // from class: androidx.activity.f
                @Override // androidx.activity.contextaware.c
                public final void a(Context context) {
                    ComponentActivity.this.N(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void L() {
        s0.b(getWindow().getDecorView(), this);
        u0.b(getWindow().getDecorView(), this);
        androidx.savedstate.g.b(getWindow().getDecorView(), this);
        t.b(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle M() {
        Bundle bundle = new Bundle();
        this.f4444P.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Context context) {
        Bundle b4 = getSavedStateRegistry().b(f4434X);
        if (b4 != null) {
            this.f4444P.g(b4);
        }
    }

    @Override // androidx.core.view.J
    public void A() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.q1
    public final void B(@N InterfaceC0764e<C0658w> interfaceC0764e) {
        this.f4448T.remove(interfaceC0764e);
    }

    void J() {
        if (this.f4439K == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f4439K = eVar.f4464b;
            }
            if (this.f4439K == null) {
                this.f4439K = new p0();
            }
        }
    }

    @P
    @Deprecated
    public Object K() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f4463a;
        }
        return null;
    }

    @P
    @Deprecated
    public Object O() {
        return null;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        L();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.J
    public void b(@N androidx.core.view.P p4, @N E e4) {
        this.f4436H.d(p4, e4);
    }

    @Override // androidx.activity.o
    @N
    public final OnBackPressedDispatcher d() {
        return this.f4441M;
    }

    @Override // androidx.core.view.J
    public void e(@N androidx.core.view.P p4) {
        this.f4436H.l(p4);
    }

    @Override // androidx.core.content.G
    public final void f(@N InterfaceC0764e<Configuration> interfaceC0764e) {
        this.f4445Q.add(interfaceC0764e);
    }

    @Override // androidx.lifecycle.InterfaceC0919v
    @N
    public m0.b getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.f4440L == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.f4440L = new e0(application, this, bundle);
        }
        return this.f4440L;
    }

    @Override // androidx.core.app.ActivityC0637l, androidx.lifecycle.E
    @N
    public Lifecycle getLifecycle() {
        return this.f4437I;
    }

    @Override // androidx.savedstate.e
    @N
    public final androidx.savedstate.c getSavedStateRegistry() {
        return this.f4438J.b();
    }

    @Override // androidx.lifecycle.q0
    @N
    public p0 getViewModelStore() {
        if (getApplication() != null) {
            J();
            return this.f4439K;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.core.app.s1
    public final void i(@N InterfaceC0764e<u1> interfaceC0764e) {
        this.f4449U.remove(interfaceC0764e);
    }

    @Override // androidx.core.content.H
    public final void j(@N InterfaceC0764e<Integer> interfaceC0764e) {
        this.f4446R.remove(interfaceC0764e);
    }

    @Override // androidx.activity.contextaware.a
    public final void k(@N androidx.activity.contextaware.c cVar) {
        this.f4435G.e(cVar);
    }

    @Override // androidx.lifecycle.InterfaceC0919v
    @InterfaceC0566i
    @N
    public R.a l() {
        R.e eVar = new R.e();
        if (getApplication() != null) {
            eVar.c(m0.a.f15679i, getApplication());
        }
        eVar.c(b0.f15571c, this);
        eVar.c(b0.f15572d, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            eVar.c(b0.f15573e, getIntent().getExtras());
        }
        return eVar;
    }

    @Override // androidx.activity.contextaware.a
    @P
    public Context m() {
        return this.f4435G.d();
    }

    @Override // androidx.core.app.s1
    public final void n(@N InterfaceC0764e<u1> interfaceC0764e) {
        this.f4449U.add(interfaceC0764e);
    }

    @Override // androidx.activity.result.k
    @N
    public final ActivityResultRegistry o() {
        return this.f4444P;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @InterfaceC0566i
    @Deprecated
    public void onActivityResult(int i4, int i5, @P Intent intent) {
        if (!this.f4444P.b(i4, i5, intent)) {
            super.onActivityResult(i4, i5, intent);
        }
    }

    @Override // android.app.Activity
    @K
    public void onBackPressed() {
        this.f4441M.g();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @InterfaceC0566i
    public void onConfigurationChanged(@N Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC0764e<Configuration>> it = this.f4445Q.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ActivityC0637l, android.app.Activity
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public void onCreate(@P Bundle bundle) {
        this.f4438J.d(bundle);
        this.f4435G.c(this);
        super.onCreate(bundle);
        X.g(this);
        if (C0738a.k()) {
            this.f4441M.h(d.a(this));
        }
        int i4 = this.f4442N;
        if (i4 != 0) {
            setContentView(i4);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i4, @N Menu menu) {
        if (i4 == 0) {
            super.onCreatePanelMenu(i4, menu);
            this.f4436H.h(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, @N MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 0) {
            return this.f4436H.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @InterfaceC0566i
    public void onMultiWindowModeChanged(boolean z3) {
        if (this.f4450V) {
            return;
        }
        Iterator<InterfaceC0764e<C0658w>> it = this.f4448T.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0658w(z3));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @InterfaceC0566i
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC0764e<Intent>> it = this.f4447S.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, @N Menu menu) {
        this.f4436H.i(menu);
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    @InterfaceC0566i
    public void onPictureInPictureModeChanged(boolean z3) {
        if (this.f4451W) {
            return;
        }
        Iterator<InterfaceC0764e<u1>> it = this.f4449U.iterator();
        while (it.hasNext()) {
            it.next().accept(new u1(z3));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i4, @P View view, @N Menu menu) {
        if (i4 == 0) {
            super.onPreparePanel(i4, view, menu);
            this.f4436H.k(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @InterfaceC0566i
    @Deprecated
    public void onRequestPermissionsResult(int i4, @N String[] strArr, @N int[] iArr) {
        if (!this.f4444P.b(i4, -1, new Intent().putExtra(C1001b.l.f20936c, strArr).putExtra(C1001b.l.f20937d, iArr))) {
            super.onRequestPermissionsResult(i4, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    @P
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object O3 = O();
        p0 p0Var = this.f4439K;
        if (p0Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            p0Var = eVar.f4464b;
        }
        if (p0Var == null && O3 == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f4463a = O3;
        eVar2.f4464b = p0Var;
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ActivityC0637l, android.app.Activity
    @InterfaceC0566i
    public void onSaveInstanceState(@N Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.G) {
            ((androidx.lifecycle.G) lifecycle).s(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f4438J.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @InterfaceC0566i
    public void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        Iterator<InterfaceC0764e<Integer>> it = this.f4446R.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i4));
        }
    }

    @Override // androidx.core.app.q1
    public final void p(@N InterfaceC0764e<C0658w> interfaceC0764e) {
        this.f4448T.add(interfaceC0764e);
    }

    @Override // androidx.core.app.r1
    public final void r(@N InterfaceC0764e<Intent> interfaceC0764e) {
        this.f4447S.remove(interfaceC0764e);
    }

    @Override // androidx.activity.result.c
    @N
    public final <I, O> androidx.activity.result.i<I> registerForActivityResult(@N AbstractC1000a<I, O> abstractC1000a, @N ActivityResultRegistry activityResultRegistry, @N androidx.activity.result.b<O> bVar) {
        return activityResultRegistry.i("activity_rq#" + this.f4443O.getAndIncrement(), this, abstractC1000a, bVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (androidx.tracing.c.h()) {
                androidx.tracing.c.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            androidx.tracing.c.f();
        } catch (Throwable th) {
            androidx.tracing.c.f();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@I int i4) {
        L();
        super.setContentView(i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@N Intent intent, int i4) {
        super.startActivityForResult(intent, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@N IntentSender intentSender, int i4, @P Intent intent, int i5, int i6, int i7) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7);
    }

    @Override // androidx.core.content.G
    public final void t(@N InterfaceC0764e<Configuration> interfaceC0764e) {
        this.f4445Q.remove(interfaceC0764e);
    }

    @Override // androidx.core.content.H
    public final void v(@N InterfaceC0764e<Integer> interfaceC0764e) {
        this.f4446R.add(interfaceC0764e);
    }

    @Override // androidx.core.app.r1
    public final void w(@N InterfaceC0764e<Intent> interfaceC0764e) {
        this.f4447S.add(interfaceC0764e);
    }

    @Override // androidx.core.view.J
    @SuppressLint({"LambdaLast"})
    public void x(@N androidx.core.view.P p4, @N E e4, @N Lifecycle.State state) {
        this.f4436H.e(p4, e4, state);
    }

    @Override // androidx.core.view.J
    public void y(@N androidx.core.view.P p4) {
        this.f4436H.c(p4);
    }

    @Override // androidx.activity.contextaware.a
    public final void z(@N androidx.activity.contextaware.c cVar) {
        this.f4435G.a(cVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@N Intent intent, int i4, @P Bundle bundle) {
        super.startActivityForResult(intent, i4, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@N IntentSender intentSender, int i4, @P Intent intent, int i5, int i6, int i7, @P Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        L();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    @InterfaceC0566i
    @W(api = 26)
    public void onMultiWindowModeChanged(boolean z3, @N Configuration configuration) {
        this.f4450V = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.f4450V = false;
            Iterator<InterfaceC0764e<C0658w>> it = this.f4448T.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0658w(z3, configuration));
            }
        } catch (Throwable th) {
            this.f4450V = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @InterfaceC0566i
    @W(api = 26)
    public void onPictureInPictureModeChanged(boolean z3, @N Configuration configuration) {
        this.f4451W = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.f4451W = false;
            Iterator<InterfaceC0764e<u1>> it = this.f4449U.iterator();
            while (it.hasNext()) {
                it.next().accept(new u1(z3, configuration));
            }
        } catch (Throwable th) {
            this.f4451W = false;
            throw th;
        }
    }

    @Override // androidx.activity.result.c
    @N
    public final <I, O> androidx.activity.result.i<I> registerForActivityResult(@N AbstractC1000a<I, O> abstractC1000a, @N androidx.activity.result.b<O> bVar) {
        return registerForActivityResult(abstractC1000a, this.f4444P, bVar);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        L();
        super.setContentView(view, layoutParams);
    }

    @InterfaceC0572o
    public ComponentActivity(@I int i4) {
        this();
        this.f4442N = i4;
    }
}
