package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.annotation.InterfaceC0558a;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.InterfaceC0572o;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.c0;
import androidx.annotation.h0;
import androidx.core.app.C0623e;
import androidx.core.app.y1;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import b.AbstractC1000a;
import i.InterfaceC2064a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.E, q0, InterfaceC0919v, androidx.savedstate.e, androidx.activity.result.c {

    /* renamed from: D0, reason: collision with root package name */
    static final Object f14979D0 = new Object();

    /* renamed from: E0, reason: collision with root package name */
    static final int f14980E0 = -1;

    /* renamed from: F0, reason: collision with root package name */
    static final int f14981F0 = 0;

    /* renamed from: G0, reason: collision with root package name */
    static final int f14982G0 = 1;

    /* renamed from: H0, reason: collision with root package name */
    static final int f14983H0 = 2;

    /* renamed from: I0, reason: collision with root package name */
    static final int f14984I0 = 3;

    /* renamed from: J0, reason: collision with root package name */
    static final int f14985J0 = 4;

    /* renamed from: K0, reason: collision with root package name */
    static final int f14986K0 = 5;

    /* renamed from: L0, reason: collision with root package name */
    static final int f14987L0 = 6;

    /* renamed from: M0, reason: collision with root package name */
    static final int f14988M0 = 7;

    /* renamed from: A0, reason: collision with root package name */
    @androidx.annotation.I
    private int f14989A0;

    /* renamed from: B0, reason: collision with root package name */
    private final AtomicInteger f14990B0;

    /* renamed from: C0, reason: collision with root package name */
    private final ArrayList<k> f14991C0;

    /* renamed from: E, reason: collision with root package name */
    int f14992E;

    /* renamed from: F, reason: collision with root package name */
    Bundle f14993F;

    /* renamed from: G, reason: collision with root package name */
    SparseArray<Parcelable> f14994G;

    /* renamed from: H, reason: collision with root package name */
    Bundle f14995H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.P
    Boolean f14996I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.N
    String f14997J;

    /* renamed from: K, reason: collision with root package name */
    Bundle f14998K;

    /* renamed from: L, reason: collision with root package name */
    Fragment f14999L;

    /* renamed from: M, reason: collision with root package name */
    String f15000M;

    /* renamed from: N, reason: collision with root package name */
    int f15001N;

    /* renamed from: O, reason: collision with root package name */
    private Boolean f15002O;

    /* renamed from: P, reason: collision with root package name */
    boolean f15003P;

    /* renamed from: Q, reason: collision with root package name */
    boolean f15004Q;

    /* renamed from: R, reason: collision with root package name */
    boolean f15005R;

    /* renamed from: S, reason: collision with root package name */
    boolean f15006S;

    /* renamed from: T, reason: collision with root package name */
    boolean f15007T;

    /* renamed from: U, reason: collision with root package name */
    boolean f15008U;

    /* renamed from: V, reason: collision with root package name */
    boolean f15009V;

    /* renamed from: W, reason: collision with root package name */
    int f15010W;

    /* renamed from: X, reason: collision with root package name */
    FragmentManager f15011X;

    /* renamed from: Y, reason: collision with root package name */
    AbstractC0894l<?> f15012Y;

    /* renamed from: Z, reason: collision with root package name */
    @androidx.annotation.N
    FragmentManager f15013Z;

    /* renamed from: a0, reason: collision with root package name */
    Fragment f15014a0;

    /* renamed from: b0, reason: collision with root package name */
    int f15015b0;

    /* renamed from: c0, reason: collision with root package name */
    int f15016c0;

    /* renamed from: d0, reason: collision with root package name */
    String f15017d0;

    /* renamed from: e0, reason: collision with root package name */
    boolean f15018e0;

    /* renamed from: f0, reason: collision with root package name */
    boolean f15019f0;

    /* renamed from: g0, reason: collision with root package name */
    boolean f15020g0;

    /* renamed from: h0, reason: collision with root package name */
    boolean f15021h0;

    /* renamed from: i0, reason: collision with root package name */
    boolean f15022i0;

    /* renamed from: j0, reason: collision with root package name */
    boolean f15023j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f15024k0;

    /* renamed from: l0, reason: collision with root package name */
    ViewGroup f15025l0;

    /* renamed from: m0, reason: collision with root package name */
    View f15026m0;

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String mPreviousWho;

    /* renamed from: n0, reason: collision with root package name */
    boolean f15027n0;

    /* renamed from: o0, reason: collision with root package name */
    boolean f15028o0;

    /* renamed from: p0, reason: collision with root package name */
    i f15029p0;

    /* renamed from: q0, reason: collision with root package name */
    Runnable f15030q0;

    /* renamed from: r0, reason: collision with root package name */
    boolean f15031r0;

    /* renamed from: s0, reason: collision with root package name */
    LayoutInflater f15032s0;

    /* renamed from: t0, reason: collision with root package name */
    boolean f15033t0;

    /* renamed from: u0, reason: collision with root package name */
    Lifecycle.State f15034u0;

    /* renamed from: v0, reason: collision with root package name */
    androidx.lifecycle.G f15035v0;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.P
    K f15036w0;

    /* renamed from: x0, reason: collision with root package name */
    androidx.lifecycle.P<androidx.lifecycle.E> f15037x0;

    /* renamed from: y0, reason: collision with root package name */
    m0.b f15038y0;

    /* renamed from: z0, reason: collision with root package name */
    androidx.savedstate.d f15039z0;

    /* loaded from: classes.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@androidx.annotation.N String str, @androidx.annotation.P Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ M f15043E;

        c(M m4) {
            this.f15043E = m4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15043E.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends AbstractC0891i {
        d() {
        }

        @Override // androidx.fragment.app.AbstractC0891i
        @androidx.annotation.P
        public View c(int i4) {
            View view = Fragment.this.f15026m0;
            if (view != null) {
                return view.findViewById(i4);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC0891i
        public boolean e() {
            if (Fragment.this.f15026m0 != null) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class e implements InterfaceC2064a<Void, ActivityResultRegistry> {
        e() {
        }

        @Override // i.InterfaceC2064a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r32) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.f15012Y;
            if (obj instanceof androidx.activity.result.k) {
                return ((androidx.activity.result.k) obj).o();
            }
            return fragment.requireActivity().o();
        }
    }

    /* loaded from: classes.dex */
    class f implements InterfaceC2064a<Void, ActivityResultRegistry> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActivityResultRegistry f15047a;

        f(ActivityResultRegistry activityResultRegistry) {
            this.f15047a = activityResultRegistry;
        }

        @Override // i.InterfaceC2064a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r12) {
            return this.f15047a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2064a f15049a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f15050b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC1000a f15051c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.activity.result.b f15052d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC2064a interfaceC2064a, AtomicReference atomicReference, AbstractC1000a abstractC1000a, androidx.activity.result.b bVar) {
            super(null);
            this.f15049a = interfaceC2064a;
            this.f15050b = atomicReference;
            this.f15051c = abstractC1000a;
            this.f15052d = bVar;
        }

        @Override // androidx.fragment.app.Fragment.k
        void a() {
            String f4 = Fragment.this.f();
            this.f15050b.set(((ActivityResultRegistry) this.f15049a.apply(null)).i(f4, Fragment.this, this.f15051c, this.f15052d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class h<I> extends androidx.activity.result.i<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f15054a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1000a f15055b;

        h(AtomicReference atomicReference, AbstractC1000a abstractC1000a) {
            this.f15054a = atomicReference;
            this.f15055b = abstractC1000a;
        }

        @Override // androidx.activity.result.i
        @androidx.annotation.N
        public AbstractC1000a<I, ?> a() {
            return this.f15055b;
        }

        @Override // androidx.activity.result.i
        public void c(I i4, @androidx.annotation.P C0623e c0623e) {
            androidx.activity.result.i iVar = (androidx.activity.result.i) this.f15054a.get();
            if (iVar != null) {
                iVar.c(i4, c0623e);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        @Override // androidx.activity.result.i
        public void d() {
            androidx.activity.result.i iVar = (androidx.activity.result.i) this.f15054a.getAndSet(null);
            if (iVar != null) {
                iVar.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        View f15057a;

        /* renamed from: b, reason: collision with root package name */
        boolean f15058b;

        /* renamed from: c, reason: collision with root package name */
        @InterfaceC0558a
        int f15059c;

        /* renamed from: d, reason: collision with root package name */
        @InterfaceC0558a
        int f15060d;

        /* renamed from: e, reason: collision with root package name */
        @InterfaceC0558a
        int f15061e;

        /* renamed from: f, reason: collision with root package name */
        @InterfaceC0558a
        int f15062f;

        /* renamed from: g, reason: collision with root package name */
        int f15063g;

        /* renamed from: h, reason: collision with root package name */
        ArrayList<String> f15064h;

        /* renamed from: i, reason: collision with root package name */
        ArrayList<String> f15065i;

        /* renamed from: j, reason: collision with root package name */
        Object f15066j = null;

        /* renamed from: k, reason: collision with root package name */
        Object f15067k;

        /* renamed from: l, reason: collision with root package name */
        Object f15068l;

        /* renamed from: m, reason: collision with root package name */
        Object f15069m;

        /* renamed from: n, reason: collision with root package name */
        Object f15070n;

        /* renamed from: o, reason: collision with root package name */
        Object f15071o;

        /* renamed from: p, reason: collision with root package name */
        Boolean f15072p;

        /* renamed from: q, reason: collision with root package name */
        Boolean f15073q;

        /* renamed from: r, reason: collision with root package name */
        y1 f15074r;

        /* renamed from: s, reason: collision with root package name */
        y1 f15075s;

        /* renamed from: t, reason: collision with root package name */
        float f15076t;

        /* renamed from: u, reason: collision with root package name */
        View f15077u;

        /* renamed from: v, reason: collision with root package name */
        boolean f15078v;

        i() {
            Object obj = Fragment.f14979D0;
            this.f15067k = obj;
            this.f15068l = null;
            this.f15069m = obj;
            this.f15070n = null;
            this.f15071o = obj;
            this.f15074r = null;
            this.f15075s = null;
            this.f15076t = 1.0f;
            this.f15077u = null;
        }
    }

    @W(19)
    /* loaded from: classes.dex */
    static class j {
        private j() {
        }

        static void a(@androidx.annotation.N View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class k {
        private k() {
        }

        abstract void a();

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    public Fragment() {
        this.f14992E = -1;
        this.f14997J = UUID.randomUUID().toString();
        this.f15000M = null;
        this.f15002O = null;
        this.f15013Z = new r();
        this.f15023j0 = true;
        this.f15028o0 = true;
        this.f15030q0 = new a();
        this.f15034u0 = Lifecycle.State.RESUMED;
        this.f15037x0 = new androidx.lifecycle.P<>();
        this.f14990B0 = new AtomicInteger();
        this.f14991C0 = new ArrayList<>();
        w();
    }

    @androidx.annotation.N
    private <I, O> androidx.activity.result.i<I> Z(@androidx.annotation.N AbstractC1000a<I, O> abstractC1000a, @androidx.annotation.N InterfaceC2064a<Void, ActivityResultRegistry> interfaceC2064a, @androidx.annotation.N androidx.activity.result.b<O> bVar) {
        if (this.f14992E <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            a0(new g(interfaceC2064a, atomicReference, abstractC1000a, bVar));
            return new h(atomicReference, abstractC1000a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void a0(@androidx.annotation.N k kVar) {
        if (this.f14992E >= 0) {
            kVar.a();
        } else {
            this.f14991C0.add(kVar);
        }
    }

    private i c() {
        if (this.f15029p0 == null) {
            this.f15029p0 = new i();
        }
        return this.f15029p0;
    }

    private void c0() {
        if (FragmentManager.S0(3)) {
            Log.d(FragmentManager.f15087P, "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f15026m0 != null) {
            d0(this.f14993F);
        }
        this.f14993F = null;
    }

    @androidx.annotation.N
    @Deprecated
    public static Fragment instantiate(@androidx.annotation.N Context context, @androidx.annotation.N String str) {
        return instantiate(context, str, null);
    }

    private int n() {
        Lifecycle.State state = this.f15034u0;
        if (state != Lifecycle.State.INITIALIZED && this.f15014a0 != null) {
            return Math.min(state.ordinal(), this.f15014a0.n());
        }
        return state.ordinal();
    }

    @androidx.annotation.P
    private Fragment v(boolean z3) {
        String str;
        if (z3) {
            FragmentStrictMode.m(this);
        }
        Fragment fragment = this.f14999L;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.f15011X;
        if (fragmentManager != null && (str = this.f15000M) != null) {
            return fragmentManager.k0(str);
        }
        return null;
    }

    private void w() {
        this.f15035v0 = new androidx.lifecycle.G(this);
        this.f15039z0 = androidx.savedstate.d.a(this);
        this.f15038y0 = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        this.f15013Z.e1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(Bundle bundle) {
        this.f15013Z.e1();
        this.f14992E = 3;
        this.f15024k0 = false;
        onActivityCreated(bundle);
        if (this.f15024k0) {
            c0();
            this.f15013Z.B();
        } else {
            throw new O("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
        Iterator<k> it = this.f14991C0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f14991C0.clear();
        this.f15013Z.o(this.f15012Y, b(), this);
        this.f14992E = 0;
        this.f15024k0 = false;
        onAttach(this.f15012Y.g());
        if (this.f15024k0) {
            this.f15011X.L(this);
            this.f15013Z.C();
        } else {
            throw new O("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(@androidx.annotation.N Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f15013Z.D(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E(@androidx.annotation.N MenuItem menuItem) {
        if (!this.f15018e0) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            return this.f15013Z.E(menuItem);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(Bundle bundle) {
        this.f15013Z.e1();
        this.f14992E = 1;
        this.f15024k0 = false;
        this.f15035v0.a(new androidx.lifecycle.A() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.A
            public void f(@androidx.annotation.N androidx.lifecycle.E e4, @androidx.annotation.N Lifecycle.Event event) {
                View view;
                if (event == Lifecycle.Event.ON_STOP && (view = Fragment.this.f15026m0) != null) {
                    j.a(view);
                }
            }
        });
        this.f15039z0.d(bundle);
        onCreate(bundle);
        this.f15033t0 = true;
        if (this.f15024k0) {
            this.f15035v0.l(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new O("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G(@androidx.annotation.N Menu menu, @androidx.annotation.N MenuInflater menuInflater) {
        boolean z3 = false;
        if (this.f15018e0) {
            return false;
        }
        if (this.f15022i0 && this.f15023j0) {
            onCreateOptionsMenu(menu, menuInflater);
            z3 = true;
        }
        return z3 | this.f15013Z.G(menu, menuInflater);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, @androidx.annotation.P Bundle bundle) {
        this.f15013Z.e1();
        this.f15009V = true;
        this.f15036w0 = new K(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.f15026m0 = onCreateView;
        if (onCreateView != null) {
            this.f15036w0.b();
            s0.b(this.f15026m0, this.f15036w0);
            u0.b(this.f15026m0, this.f15036w0);
            androidx.savedstate.g.b(this.f15026m0, this.f15036w0);
            this.f15037x0.r(this.f15036w0);
            return;
        }
        if (!this.f15036w0.c()) {
            this.f15036w0 = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I() {
        this.f15013Z.H();
        this.f15035v0.l(Lifecycle.Event.ON_DESTROY);
        this.f14992E = 0;
        this.f15024k0 = false;
        this.f15033t0 = false;
        onDestroy();
        if (this.f15024k0) {
            return;
        }
        throw new O("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J() {
        this.f15013Z.I();
        if (this.f15026m0 != null && this.f15036w0.getLifecycle().b().e(Lifecycle.State.CREATED)) {
            this.f15036w0.a(Lifecycle.Event.ON_DESTROY);
        }
        this.f14992E = 1;
        this.f15024k0 = false;
        onDestroyView();
        if (this.f15024k0) {
            androidx.loader.app.a.d(this).h();
            this.f15009V = false;
        } else {
            throw new O("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K() {
        this.f14992E = -1;
        this.f15024k0 = false;
        onDetach();
        this.f15032s0 = null;
        if (this.f15024k0) {
            if (!this.f15013Z.R0()) {
                this.f15013Z.H();
                this.f15013Z = new r();
                return;
            }
            return;
        }
        throw new O("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public LayoutInflater L(@androidx.annotation.P Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.f15032s0 = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M() {
        onLowMemory();
        this.f15013Z.J();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(boolean z3) {
        onMultiWindowModeChanged(z3);
        this.f15013Z.K(z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean O(@androidx.annotation.N MenuItem menuItem) {
        if (!this.f15018e0) {
            if (this.f15022i0 && this.f15023j0 && onOptionsItemSelected(menuItem)) {
                return true;
            }
            return this.f15013Z.N(menuItem);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(@androidx.annotation.N Menu menu) {
        if (!this.f15018e0) {
            if (this.f15022i0 && this.f15023j0) {
                onOptionsMenuClosed(menu);
            }
            this.f15013Z.O(menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q() {
        this.f15013Z.Q();
        if (this.f15026m0 != null) {
            this.f15036w0.a(Lifecycle.Event.ON_PAUSE);
        }
        this.f15035v0.l(Lifecycle.Event.ON_PAUSE);
        this.f14992E = 6;
        this.f15024k0 = false;
        onPause();
        if (this.f15024k0) {
            return;
        }
        throw new O("Fragment " + this + " did not call through to super.onPause()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(boolean z3) {
        onPictureInPictureModeChanged(z3);
        this.f15013Z.R(z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean S(@androidx.annotation.N Menu menu) {
        boolean z3 = false;
        if (this.f15018e0) {
            return false;
        }
        if (this.f15022i0 && this.f15023j0) {
            onPrepareOptionsMenu(menu);
            z3 = true;
        }
        return z3 | this.f15013Z.S(menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T() {
        boolean W02 = this.f15011X.W0(this);
        Boolean bool = this.f15002O;
        if (bool == null || bool.booleanValue() != W02) {
            this.f15002O = Boolean.valueOf(W02);
            onPrimaryNavigationFragmentChanged(W02);
            this.f15013Z.T();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        this.f15013Z.e1();
        this.f15013Z.f0(true);
        this.f14992E = 7;
        this.f15024k0 = false;
        onResume();
        if (this.f15024k0) {
            androidx.lifecycle.G g4 = this.f15035v0;
            Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
            g4.l(event);
            if (this.f15026m0 != null) {
                this.f15036w0.a(event);
            }
            this.f15013Z.U();
            return;
        }
        throw new O("Fragment " + this + " did not call through to super.onResume()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.f15039z0.e(bundle);
        Parcelable H12 = this.f15013Z.H1();
        if (H12 != null) {
            bundle.putParcelable("android:support:fragments", H12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W() {
        this.f15013Z.e1();
        this.f15013Z.f0(true);
        this.f14992E = 5;
        this.f15024k0 = false;
        onStart();
        if (this.f15024k0) {
            androidx.lifecycle.G g4 = this.f15035v0;
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            g4.l(event);
            if (this.f15026m0 != null) {
                this.f15036w0.a(event);
            }
            this.f15013Z.V();
            return;
        }
        throw new O("Fragment " + this + " did not call through to super.onStart()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X() {
        this.f15013Z.X();
        if (this.f15026m0 != null) {
            this.f15036w0.a(Lifecycle.Event.ON_STOP);
        }
        this.f15035v0.l(Lifecycle.Event.ON_STOP);
        this.f14992E = 4;
        this.f15024k0 = false;
        onStop();
        if (this.f15024k0) {
            return;
        }
        throw new O("Fragment " + this + " did not call through to super.onStop()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y() {
        onViewCreated(this.f15026m0, this.f14993F);
        this.f15013Z.Y();
    }

    void a(boolean z3) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        i iVar = this.f15029p0;
        if (iVar != null) {
            iVar.f15078v = false;
        }
        if (this.f15026m0 != null && (viewGroup = this.f15025l0) != null && (fragmentManager = this.f15011X) != null) {
            M n4 = M.n(viewGroup, fragmentManager);
            n4.p();
            if (z3) {
                this.f15012Y.h().post(new c(n4));
            } else {
                n4.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public AbstractC0891i b() {
        return new d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(@androidx.annotation.P Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f15013Z.D1(parcelable);
            this.f15013Z.F();
        }
    }

    final void d0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f14994G;
        if (sparseArray != null) {
            this.f15026m0.restoreHierarchyState(sparseArray);
            this.f14994G = null;
        }
        if (this.f15026m0 != null) {
            this.f15036w0.e(this.f14995H);
            this.f14995H = null;
        }
        this.f15024k0 = false;
        onViewStateRestored(bundle);
        if (this.f15024k0) {
            if (this.f15026m0 != null) {
                this.f15036w0.a(Lifecycle.Event.ON_CREATE);
            }
        } else {
            throw new O("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void dump(@androidx.annotation.N String str, @androidx.annotation.P FileDescriptor fileDescriptor, @androidx.annotation.N PrintWriter printWriter, @androidx.annotation.P String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f15015b0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f15016c0));
        printWriter.print(" mTag=");
        printWriter.println(this.f15017d0);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f14992E);
        printWriter.print(" mWho=");
        printWriter.print(this.f14997J);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f15010W);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f15003P);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f15004Q);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f15006S);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f15007T);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f15018e0);
        printWriter.print(" mDetached=");
        printWriter.print(this.f15019f0);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f15023j0);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f15022i0);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f15020g0);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f15028o0);
        if (this.f15011X != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f15011X);
        }
        if (this.f15012Y != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f15012Y);
        }
        if (this.f15014a0 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f15014a0);
        }
        if (this.f14998K != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f14998K);
        }
        if (this.f14993F != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f14993F);
        }
        if (this.f14994G != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f14994G);
        }
        if (this.f14995H != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f14995H);
        }
        Fragment v3 = v(false);
        if (v3 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(v3);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f15001N);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(p());
        if (h() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(h());
        }
        if (j() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(j());
        }
        if (q() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(q());
        }
        if (r() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(r());
        }
        if (this.f15025l0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f15025l0);
        }
        if (this.f15026m0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f15026m0);
        }
        if (g() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(g());
        }
        if (getContext() != null) {
            androidx.loader.app.a.d(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f15013Z + ":");
        this.f15013Z.a0(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Fragment e(@androidx.annotation.N String str) {
        if (str.equals(this.f14997J)) {
            return this;
        }
        return this.f15013Z.p0(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0(@InterfaceC0558a int i4, @InterfaceC0558a int i5, @InterfaceC0558a int i6, @InterfaceC0558a int i7) {
        if (this.f15029p0 == null && i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return;
        }
        c().f15059c = i4;
        c().f15060d = i5;
        c().f15061e = i6;
        c().f15062f = i7;
    }

    public final boolean equals(@androidx.annotation.P Object obj) {
        return super.equals(obj);
    }

    @androidx.annotation.N
    String f() {
        return "fragment_" + this.f14997J + "_rq#" + this.f14990B0.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0(View view) {
        c().f15077u = view;
    }

    View g() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return null;
        }
        return iVar.f15057a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0(int i4) {
        if (this.f15029p0 == null && i4 == 0) {
            return;
        }
        c();
        this.f15029p0.f15063g = i4;
    }

    @androidx.annotation.P
    public final ActivityC0889g getActivity() {
        AbstractC0894l<?> abstractC0894l = this.f15012Y;
        if (abstractC0894l == null) {
            return null;
        }
        return (ActivityC0889g) abstractC0894l.f();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        i iVar = this.f15029p0;
        if (iVar != null && (bool = iVar.f15073q) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        i iVar = this.f15029p0;
        if (iVar != null && (bool = iVar.f15072p) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @androidx.annotation.P
    public final Bundle getArguments() {
        return this.f14998K;
    }

    @androidx.annotation.N
    public final FragmentManager getChildFragmentManager() {
        if (this.f15012Y != null) {
            return this.f15013Z;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @androidx.annotation.P
    public Context getContext() {
        AbstractC0894l<?> abstractC0894l = this.f15012Y;
        if (abstractC0894l == null) {
            return null;
        }
        return abstractC0894l.g();
    }

    @Override // androidx.lifecycle.InterfaceC0919v
    @androidx.annotation.N
    public m0.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.f15011X != null) {
            if (this.f15038y0 == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && FragmentManager.S0(3)) {
                    Log.d(FragmentManager.f15087P, "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.f15038y0 = new e0(application, this, getArguments());
            }
            return this.f15038y0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @androidx.annotation.P
    public Object getEnterTransition() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return null;
        }
        return iVar.f15066j;
    }

    @androidx.annotation.P
    public Object getExitTransition() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return null;
        }
        return iVar.f15068l;
    }

    @androidx.annotation.P
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.f15011X;
    }

    @androidx.annotation.P
    public final Object getHost() {
        AbstractC0894l<?> abstractC0894l = this.f15012Y;
        if (abstractC0894l == null) {
            return null;
        }
        return abstractC0894l.j();
    }

    public final int getId() {
        return this.f15015b0;
    }

    @androidx.annotation.N
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.f15032s0;
        return layoutInflater == null ? L(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.E
    @androidx.annotation.N
    public Lifecycle getLifecycle() {
        return this.f15035v0;
    }

    @androidx.annotation.N
    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.d(this);
    }

    @androidx.annotation.P
    public final Fragment getParentFragment() {
        return this.f15014a0;
    }

    @androidx.annotation.N
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.f15011X;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @androidx.annotation.P
    public Object getReenterTransition() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f15069m;
        if (obj == f14979D0) {
            return getExitTransition();
        }
        return obj;
    }

    @androidx.annotation.N
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.k(this);
        return this.f15020g0;
    }

    @androidx.annotation.P
    public Object getReturnTransition() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f15067k;
        if (obj == f14979D0) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // androidx.savedstate.e
    @androidx.annotation.N
    public final androidx.savedstate.c getSavedStateRegistry() {
        return this.f15039z0.b();
    }

    @androidx.annotation.P
    public Object getSharedElementEnterTransition() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return null;
        }
        return iVar.f15070n;
    }

    @androidx.annotation.P
    public Object getSharedElementReturnTransition() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f15071o;
        if (obj == f14979D0) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    @androidx.annotation.N
    public final String getString(@c0 int i4) {
        return getResources().getString(i4);
    }

    @androidx.annotation.P
    public final String getTag() {
        return this.f15017d0;
    }

    @androidx.annotation.P
    @Deprecated
    public final Fragment getTargetFragment() {
        return v(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.l(this);
        return this.f15001N;
    }

    @androidx.annotation.N
    public final CharSequence getText(@c0 int i4) {
        return getResources().getText(i4);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.f15028o0;
    }

    @androidx.annotation.P
    public View getView() {
        return this.f15026m0;
    }

    @androidx.annotation.N
    @androidx.annotation.K
    public androidx.lifecycle.E getViewLifecycleOwner() {
        K k4 = this.f15036w0;
        if (k4 != null) {
            return k4;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @androidx.annotation.N
    public LiveData<androidx.lifecycle.E> getViewLifecycleOwnerLiveData() {
        return this.f15037x0;
    }

    @Override // androidx.lifecycle.q0
    @androidx.annotation.N
    public p0 getViewModelStore() {
        if (this.f15011X != null) {
            if (n() != Lifecycle.State.INITIALIZED.ordinal()) {
                return this.f15011X.N0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0558a
    public int h() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return 0;
        }
        return iVar.f15059c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h0(boolean z3) {
        if (this.f15029p0 == null) {
            return;
        }
        c().f15058b = z3;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean hasOptionsMenu() {
        return this.f15022i0;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y1 i() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return null;
        }
        return iVar.f15074r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i0(float f4) {
        c().f15076t = f4;
    }

    public final boolean isAdded() {
        if (this.f15012Y != null && this.f15003P) {
            return true;
        }
        return false;
    }

    public final boolean isDetached() {
        return this.f15019f0;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        if (!this.f15018e0 && ((fragmentManager = this.f15011X) == null || !fragmentManager.U0(this.f15014a0))) {
            return false;
        }
        return true;
    }

    public final boolean isInLayout() {
        return this.f15007T;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        if (this.f15023j0 && ((fragmentManager = this.f15011X) == null || fragmentManager.V0(this.f15014a0))) {
            return true;
        }
        return false;
    }

    public final boolean isRemoving() {
        return this.f15004Q;
    }

    public final boolean isResumed() {
        if (this.f14992E >= 7) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.f15011X;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.Y0();
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.f15026m0) != null && view.getWindowToken() != null && this.f15026m0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0558a
    public int j() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return 0;
        }
        return iVar.f15060d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j0(@androidx.annotation.P ArrayList<String> arrayList, @androidx.annotation.P ArrayList<String> arrayList2) {
        c();
        i iVar = this.f15029p0;
        iVar.f15064h = arrayList;
        iVar.f15065i = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y1 k() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return null;
        }
        return iVar.f15075s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View m() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return null;
        }
        return iVar.f15077u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return 0;
        }
        return iVar.f15063g;
    }

    @InterfaceC0566i
    @androidx.annotation.K
    @Deprecated
    public void onActivityCreated(@androidx.annotation.P Bundle bundle) {
        this.f15024k0 = true;
    }

    @Deprecated
    public void onActivityResult(int i4, int i5, @androidx.annotation.P Intent intent) {
        if (FragmentManager.S0(2)) {
            Log.v(FragmentManager.f15087P, "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i4 + " resultCode: " + i5 + " data: " + intent);
        }
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void onAttach(@androidx.annotation.N Context context) {
        this.f15024k0 = true;
        AbstractC0894l<?> abstractC0894l = this.f15012Y;
        Activity f4 = abstractC0894l == null ? null : abstractC0894l.f();
        if (f4 != null) {
            this.f15024k0 = false;
            onAttach(f4);
        }
    }

    @androidx.annotation.K
    @Deprecated
    public void onAttachFragment(@androidx.annotation.N Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @InterfaceC0566i
    public void onConfigurationChanged(@androidx.annotation.N Configuration configuration) {
        this.f15024k0 = true;
    }

    @androidx.annotation.K
    public boolean onContextItemSelected(@androidx.annotation.N MenuItem menuItem) {
        return false;
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void onCreate(@androidx.annotation.P Bundle bundle) {
        this.f15024k0 = true;
        b0(bundle);
        if (!this.f15013Z.X0(1)) {
            this.f15013Z.F();
        }
    }

    @androidx.annotation.P
    @androidx.annotation.K
    public Animation onCreateAnimation(int i4, boolean z3, int i5) {
        return null;
    }

    @androidx.annotation.P
    @androidx.annotation.K
    public Animator onCreateAnimator(int i4, boolean z3, int i5) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @androidx.annotation.K
    public void onCreateContextMenu(@androidx.annotation.N ContextMenu contextMenu, @androidx.annotation.N View view, @androidx.annotation.P ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @androidx.annotation.K
    public void onCreateOptionsMenu(@androidx.annotation.N Menu menu, @androidx.annotation.N MenuInflater menuInflater) {
    }

    @androidx.annotation.P
    @androidx.annotation.K
    public View onCreateView(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, @androidx.annotation.P Bundle bundle) {
        int i4 = this.f14989A0;
        if (i4 != 0) {
            return layoutInflater.inflate(i4, viewGroup, false);
        }
        return null;
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void onDestroy() {
        this.f15024k0 = true;
    }

    @androidx.annotation.K
    public void onDestroyOptionsMenu() {
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void onDestroyView() {
        this.f15024k0 = true;
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void onDetach() {
        this.f15024k0 = true;
    }

    @androidx.annotation.N
    public LayoutInflater onGetLayoutInflater(@androidx.annotation.P Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @androidx.annotation.K
    public void onHiddenChanged(boolean z3) {
    }

    @InterfaceC0566i
    @h0
    public void onInflate(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet, @androidx.annotation.P Bundle bundle) {
        this.f15024k0 = true;
        AbstractC0894l<?> abstractC0894l = this.f15012Y;
        Activity f4 = abstractC0894l == null ? null : abstractC0894l.f();
        if (f4 != null) {
            this.f15024k0 = false;
            onInflate(f4, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @InterfaceC0566i
    @androidx.annotation.K
    public void onLowMemory() {
        this.f15024k0 = true;
    }

    public void onMultiWindowModeChanged(boolean z3) {
    }

    @androidx.annotation.K
    public boolean onOptionsItemSelected(@androidx.annotation.N MenuItem menuItem) {
        return false;
    }

    @androidx.annotation.K
    public void onOptionsMenuClosed(@androidx.annotation.N Menu menu) {
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void onPause() {
        this.f15024k0 = true;
    }

    public void onPictureInPictureModeChanged(boolean z3) {
    }

    @androidx.annotation.K
    public void onPrepareOptionsMenu(@androidx.annotation.N Menu menu) {
    }

    @androidx.annotation.K
    public void onPrimaryNavigationFragmentChanged(boolean z3) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i4, @androidx.annotation.N String[] strArr, @androidx.annotation.N int[] iArr) {
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void onResume() {
        this.f15024k0 = true;
    }

    @androidx.annotation.K
    public void onSaveInstanceState(@androidx.annotation.N Bundle bundle) {
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void onStart() {
        this.f15024k0 = true;
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void onStop() {
        this.f15024k0 = true;
    }

    @androidx.annotation.K
    public void onViewCreated(@androidx.annotation.N View view, @androidx.annotation.P Bundle bundle) {
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void onViewStateRestored(@androidx.annotation.P Bundle bundle) {
        this.f15024k0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return false;
        }
        return iVar.f15058b;
    }

    public void postponeEnterTransition() {
        c().f15078v = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0558a
    public int q() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return 0;
        }
        return iVar.f15061e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0558a
    public int r() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return 0;
        }
        return iVar.f15062f;
    }

    @Override // androidx.activity.result.c
    @androidx.annotation.N
    @androidx.annotation.K
    public final <I, O> androidx.activity.result.i<I> registerForActivityResult(@androidx.annotation.N AbstractC1000a<I, O> abstractC1000a, @androidx.annotation.N androidx.activity.result.b<O> bVar) {
        return Z(abstractC1000a, new e(), bVar);
    }

    public void registerForContextMenu(@androidx.annotation.N View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@androidx.annotation.N String[] strArr, int i4) {
        if (this.f15012Y != null) {
            getParentFragmentManager().a1(this, strArr, i4);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @androidx.annotation.N
    public final ActivityC0889g requireActivity() {
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @androidx.annotation.N
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @androidx.annotation.N
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @androidx.annotation.N
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @androidx.annotation.N
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    @androidx.annotation.N
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    @androidx.annotation.N
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float s() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f15076t;
    }

    public void setAllowEnterTransitionOverlap(boolean z3) {
        c().f15073q = Boolean.valueOf(z3);
    }

    public void setAllowReturnTransitionOverlap(boolean z3) {
        c().f15072p = Boolean.valueOf(z3);
    }

    public void setArguments(@androidx.annotation.P Bundle bundle) {
        if (this.f15011X != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f14998K = bundle;
    }

    public void setEnterSharedElementCallback(@androidx.annotation.P y1 y1Var) {
        c().f15074r = y1Var;
    }

    public void setEnterTransition(@androidx.annotation.P Object obj) {
        c().f15066j = obj;
    }

    public void setExitSharedElementCallback(@androidx.annotation.P y1 y1Var) {
        c().f15075s = y1Var;
    }

    public void setExitTransition(@androidx.annotation.P Object obj) {
        c().f15068l = obj;
    }

    public void setHasOptionsMenu(boolean z3) {
        if (this.f15022i0 != z3) {
            this.f15022i0 = z3;
            if (isAdded() && !isHidden()) {
                this.f15012Y.u();
            }
        }
    }

    public void setInitialSavedState(@androidx.annotation.P l lVar) {
        Bundle bundle;
        if (this.f15011X == null) {
            if (lVar == null || (bundle = lVar.f15079E) == null) {
                bundle = null;
            }
            this.f14993F = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z3) {
        if (this.f15023j0 != z3) {
            this.f15023j0 = z3;
            if (this.f15022i0 && isAdded() && !isHidden()) {
                this.f15012Y.u();
            }
        }
    }

    public void setReenterTransition(@androidx.annotation.P Object obj) {
        c().f15069m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z3) {
        FragmentStrictMode.o(this);
        this.f15020g0 = z3;
        FragmentManager fragmentManager = this.f15011X;
        if (fragmentManager != null) {
            if (z3) {
                fragmentManager.m(this);
                return;
            } else {
                fragmentManager.x1(this);
                return;
            }
        }
        this.f15021h0 = true;
    }

    public void setReturnTransition(@androidx.annotation.P Object obj) {
        c().f15067k = obj;
    }

    public void setSharedElementEnterTransition(@androidx.annotation.P Object obj) {
        c().f15070n = obj;
    }

    public void setSharedElementReturnTransition(@androidx.annotation.P Object obj) {
        c().f15071o = obj;
    }

    @Deprecated
    public void setTargetFragment(@androidx.annotation.P Fragment fragment, int i4) {
        FragmentManager fragmentManager;
        if (fragment != null) {
            FragmentStrictMode.p(this, fragment, i4);
        }
        FragmentManager fragmentManager2 = this.f15011X;
        if (fragment != null) {
            fragmentManager = fragment.f15011X;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 != null && fragmentManager != null && fragmentManager2 != fragmentManager) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.v(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.f15000M = null;
            this.f14999L = null;
        } else if (this.f15011X != null && fragment.f15011X != null) {
            this.f15000M = fragment.f14997J;
            this.f14999L = null;
        } else {
            this.f15000M = null;
            this.f14999L = fragment;
        }
        this.f15001N = i4;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z3) {
        boolean z4;
        FragmentStrictMode.q(this, z3);
        if (!this.f15028o0 && z3 && this.f14992E < 5 && this.f15011X != null && isAdded() && this.f15033t0) {
            FragmentManager fragmentManager = this.f15011X;
            fragmentManager.h1(fragmentManager.z(this));
        }
        this.f15028o0 = z3;
        if (this.f14992E < 5 && !z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f15027n0 = z4;
        if (this.f14993F != null) {
            this.f14996I = Boolean.valueOf(z3);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@androidx.annotation.N String str) {
        AbstractC0894l<?> abstractC0894l = this.f15012Y;
        if (abstractC0894l != null) {
            return abstractC0894l.q(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i4) {
        startActivityForResult(intent, i4, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, @androidx.annotation.P Intent intent, int i5, int i6, int i7, @androidx.annotation.P Bundle bundle) throws IntentSender.SendIntentException {
        if (this.f15012Y != null) {
            if (FragmentManager.S0(2)) {
                Log.v(FragmentManager.f15087P, "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i4 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            getParentFragmentManager().c1(this, intentSender, i4, intent, i5, i6, i7, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.f15029p0 != null && c().f15078v) {
            if (this.f15012Y == null) {
                c().f15078v = false;
            } else if (Looper.myLooper() != this.f15012Y.h().getLooper()) {
                this.f15012Y.h().postAtFrontOfQueue(new b());
            } else {
                a(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public ArrayList<String> t() {
        ArrayList<String> arrayList;
        i iVar = this.f15029p0;
        if (iVar != null && (arrayList = iVar.f15064h) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    @androidx.annotation.N
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f14997J);
        if (this.f15015b0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f15015b0));
        }
        if (this.f15017d0 != null) {
            sb.append(" tag=");
            sb.append(this.f15017d0);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public ArrayList<String> u() {
        ArrayList<String> arrayList;
        i iVar = this.f15029p0;
        if (iVar != null && (arrayList = iVar.f15065i) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public void unregisterForContextMenu(@androidx.annotation.N View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x() {
        w();
        this.mPreviousWho = this.f14997J;
        this.f14997J = UUID.randomUUID().toString();
        this.f15003P = false;
        this.f15004Q = false;
        this.f15006S = false;
        this.f15007T = false;
        this.f15008U = false;
        this.f15010W = 0;
        this.f15011X = null;
        this.f15013Z = new r();
        this.f15012Y = null;
        this.f15015b0 = 0;
        this.f15016c0 = 0;
        this.f15017d0 = null;
        this.f15018e0 = false;
        this.f15019f0 = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean y() {
        if (this.f15010W > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        i iVar = this.f15029p0;
        if (iVar == null) {
            return false;
        }
        return iVar.f15078v;
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class l implements Parcelable {

        @androidx.annotation.N
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        final Bundle f15079E;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<l> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i4) {
                return new l[i4];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public l(Bundle bundle) {
            this.f15079E = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
            parcel.writeBundle(this.f15079E);
        }

        l(@androidx.annotation.N Parcel parcel, @androidx.annotation.P ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f15079E = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    @androidx.annotation.N
    @Deprecated
    public static Fragment instantiate(@androidx.annotation.N Context context, @androidx.annotation.N String str, @androidx.annotation.P Bundle bundle) {
        try {
            Fragment newInstance = C0893k.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (java.lang.InstantiationException e5) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (NoSuchMethodException e6) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e6);
        } catch (InvocationTargetException e7) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e7);
        }
    }

    @androidx.annotation.N
    public final String getString(@c0 int i4, @androidx.annotation.P Object... objArr) {
        return getResources().getString(i4, objArr);
    }

    public final void postponeEnterTransition(long j4, @androidx.annotation.N TimeUnit timeUnit) {
        Handler handler;
        c().f15078v = true;
        FragmentManager fragmentManager = this.f15011X;
        if (fragmentManager != null) {
            handler = fragmentManager.F0().h();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.f15030q0);
        handler.postDelayed(this.f15030q0, timeUnit.toMillis(j4));
    }

    @Override // androidx.activity.result.c
    @androidx.annotation.N
    @androidx.annotation.K
    public final <I, O> androidx.activity.result.i<I> registerForActivityResult(@androidx.annotation.N AbstractC1000a<I, O> abstractC1000a, @androidx.annotation.N ActivityResultRegistry activityResultRegistry, @androidx.annotation.N androidx.activity.result.b<O> bVar) {
        return Z(abstractC1000a, new f(activityResultRegistry), bVar);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @androidx.annotation.P Bundle bundle) {
        AbstractC0894l<?> abstractC0894l = this.f15012Y;
        if (abstractC0894l != null) {
            abstractC0894l.s(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i4, @androidx.annotation.P Bundle bundle) {
        if (this.f15012Y != null) {
            getParentFragmentManager().b1(this, intent, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public LayoutInflater getLayoutInflater(@androidx.annotation.P Bundle bundle) {
        AbstractC0894l<?> abstractC0894l = this.f15012Y;
        if (abstractC0894l != null) {
            LayoutInflater k4 = abstractC0894l.k();
            androidx.core.view.F.d(k4, this.f15013Z.G0());
            return k4;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @InterfaceC0566i
    @androidx.annotation.K
    @Deprecated
    public void onAttach(@androidx.annotation.N Activity activity) {
        this.f15024k0 = true;
    }

    @InterfaceC0566i
    @h0
    @Deprecated
    public void onInflate(@androidx.annotation.N Activity activity, @androidx.annotation.N AttributeSet attributeSet, @androidx.annotation.P Bundle bundle) {
        this.f15024k0 = true;
    }

    @InterfaceC0572o
    public Fragment(@androidx.annotation.I int i4) {
        this();
        this.f14989A0 = i4;
    }
}
