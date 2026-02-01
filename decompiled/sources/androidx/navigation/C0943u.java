package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.RestrictTo;
import androidx.core.app.z1;
import androidx.core.os.C0741d;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.C0945w;
import androidx.navigation.D;
import androidx.navigation.F;
import androidx.navigation.T;
import androidx.navigation.c0;
import androidx.navigation.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C2122h0;
import kotlin.H0;
import kotlin.collections.C2096k;
import kotlin.collections.C2101p;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2185h;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C2284k;
import kotlinx.coroutines.flow.InterfaceC2282i;

/* renamed from: androidx.navigation.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0943u {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private static final String f16548H = "NavController";

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private static final String f16549I = "android-support-nav:controller:navigatorState";

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private static final String f16550J = "android-support-nav:controller:navigatorState:names";

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private static final String f16551K = "android-support-nav:controller:backStack";

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private static final String f16552L = "android-support-nav:controller:backStackDestIds";

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private static final String f16553M = "android-support-nav:controller:backStackIds";

    /* renamed from: N, reason: collision with root package name */
    @l3.d
    private static final String f16554N = "android-support-nav:controller:backStackStates";

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    private static final String f16555O = "android-support-nav:controller:backStackStates:";

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f16556P = "android-support-nav:controller:deepLinkIds";

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f16557Q = "android-support-nav:controller:deepLinkArgs";

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f16558R = "android-support-nav:controller:deepLinkExtras";

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f16559S = "android-support-nav:controller:deepLinkHandled";

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    public static final String f16560T = "android-support-nav:controller:deepLinkIntent";

    /* renamed from: A, reason: collision with root package name */
    @l3.d
    private final Map<r, Boolean> f16562A;

    /* renamed from: B, reason: collision with root package name */
    private int f16563B;

    /* renamed from: C, reason: collision with root package name */
    @l3.d
    private final List<r> f16564C;

    /* renamed from: D, reason: collision with root package name */
    @l3.d
    private final kotlin.A f16565D;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.flow.s<r> f16566E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final InterfaceC2282i<r> f16567F;

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Context f16568a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private Activity f16569b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private S f16570c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private J f16571d;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private Bundle f16572e;

    /* renamed from: f, reason: collision with root package name */
    @l3.e
    private Parcelable[] f16573f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16574g;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private final C2096k<r> f16575h;

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.flow.t<List<r>> f16576i;

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.flow.H<List<r>> f16577j;

    /* renamed from: k, reason: collision with root package name */
    @l3.d
    private final Map<r, r> f16578k;

    /* renamed from: l, reason: collision with root package name */
    @l3.d
    private final Map<r, AtomicInteger> f16579l;

    /* renamed from: m, reason: collision with root package name */
    @l3.d
    private final Map<Integer, String> f16580m;

    /* renamed from: n, reason: collision with root package name */
    @l3.d
    private final Map<String, C2096k<C0941s>> f16581n;

    /* renamed from: o, reason: collision with root package name */
    @l3.e
    private androidx.lifecycle.E f16582o;

    /* renamed from: p, reason: collision with root package name */
    @l3.e
    private OnBackPressedDispatcher f16583p;

    /* renamed from: q, reason: collision with root package name */
    @l3.e
    private C0945w f16584q;

    /* renamed from: r, reason: collision with root package name */
    @l3.d
    private final CopyOnWriteArrayList<c> f16585r;

    /* renamed from: s, reason: collision with root package name */
    @l3.d
    private Lifecycle.State f16586s;

    /* renamed from: t, reason: collision with root package name */
    @l3.d
    private final androidx.lifecycle.D f16587t;

    /* renamed from: u, reason: collision with root package name */
    @l3.d
    private final androidx.activity.j f16588u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f16589v;

    /* renamed from: w, reason: collision with root package name */
    @l3.d
    private d0 f16590w;

    /* renamed from: x, reason: collision with root package name */
    @l3.d
    private final Map<c0<? extends F>, b> f16591x;

    /* renamed from: y, reason: collision with root package name */
    @l3.e
    private X2.l<? super r, H0> f16592y;

    /* renamed from: z, reason: collision with root package name */
    @l3.e
    private X2.l<? super r, H0> f16593z;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final a f16547G = new a(null);

    /* renamed from: U, reason: collision with root package name */
    private static boolean f16561U = true;

    /* renamed from: androidx.navigation.u$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public static /* synthetic */ void b() {
        }

        @W2.n
        @E
        public final void a(boolean z3) {
            C0943u.f16561U = z3;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.navigation.u$b */
    /* loaded from: classes.dex */
    public final class b extends f0 {

        /* renamed from: g, reason: collision with root package name */
        @l3.d
        private final c0<? extends F> f16594g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C0943u f16595h;

        /* renamed from: androidx.navigation.u$b$a */
        /* loaded from: classes.dex */
        static final class a extends Lambda implements X2.a<H0> {

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ r f16597G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ boolean f16598H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, boolean z3) {
                super(0);
                this.f16597G = rVar;
                this.f16598H = z3;
            }

            public final void c() {
                b.super.g(this.f16597G, this.f16598H);
            }

            @Override // X2.a
            public /* bridge */ /* synthetic */ H0 n() {
                c();
                return H0.f51801a;
            }
        }

        public b(@l3.d C0943u this$0, c0<? extends F> navigator) {
            kotlin.jvm.internal.F.p(this$0, "this$0");
            kotlin.jvm.internal.F.p(navigator, "navigator");
            this.f16595h = this$0;
            this.f16594g = navigator;
        }

        @Override // androidx.navigation.f0
        @l3.d
        public r a(@l3.d F destination, @l3.e Bundle bundle) {
            kotlin.jvm.internal.F.p(destination, "destination");
            return r.a.b(r.f16524R, this.f16595h.F(), destination, bundle, this.f16595h.L(), this.f16595h.f16584q, null, null, 96, null);
        }

        @Override // androidx.navigation.f0
        public void e(@l3.d r entry) {
            C0945w c0945w;
            kotlin.jvm.internal.F.p(entry, "entry");
            boolean g4 = kotlin.jvm.internal.F.g(this.f16595h.f16562A.get(entry), Boolean.TRUE);
            super.e(entry);
            this.f16595h.f16562A.remove(entry);
            if (!this.f16595h.C().contains(entry)) {
                this.f16595h.W0(entry);
                if (entry.getLifecycle().b().e(Lifecycle.State.CREATED)) {
                    entry.o(Lifecycle.State.DESTROYED);
                }
                C2096k<r> C3 = this.f16595h.C();
                if (!(C3 instanceof Collection) || !C3.isEmpty()) {
                    Iterator<r> it = C3.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.F.g(it.next().h(), entry.h())) {
                            break;
                        }
                    }
                }
                if (!g4 && (c0945w = this.f16595h.f16584q) != null) {
                    c0945w.v(entry.h());
                }
                this.f16595h.X0();
                this.f16595h.f16576i.j(this.f16595h.G0());
                return;
            }
            if (!d()) {
                this.f16595h.X0();
                this.f16595h.f16576i.j(this.f16595h.G0());
            }
        }

        @Override // androidx.navigation.f0
        public void g(@l3.d r popUpTo, boolean z3) {
            kotlin.jvm.internal.F.p(popUpTo, "popUpTo");
            c0 f4 = this.f16595h.f16590w.f(popUpTo.g().v());
            if (kotlin.jvm.internal.F.g(f4, this.f16594g)) {
                X2.l lVar = this.f16595h.f16593z;
                if (lVar != null) {
                    lVar.C(popUpTo);
                    super.g(popUpTo, z3);
                    return;
                } else {
                    this.f16595h.z0(popUpTo, new a(popUpTo, z3));
                    return;
                }
            }
            Object obj = this.f16595h.f16591x.get(f4);
            kotlin.jvm.internal.F.m(obj);
            ((b) obj).g(popUpTo, z3);
        }

        @Override // androidx.navigation.f0
        public void h(@l3.d r popUpTo, boolean z3) {
            kotlin.jvm.internal.F.p(popUpTo, "popUpTo");
            super.h(popUpTo, z3);
            this.f16595h.f16562A.put(popUpTo, Boolean.valueOf(z3));
        }

        @Override // androidx.navigation.f0
        public void i(@l3.d r backStackEntry) {
            kotlin.jvm.internal.F.p(backStackEntry, "backStackEntry");
            c0 f4 = this.f16595h.f16590w.f(backStackEntry.g().v());
            if (kotlin.jvm.internal.F.g(f4, this.f16594g)) {
                X2.l lVar = this.f16595h.f16592y;
                if (lVar != null) {
                    lVar.C(backStackEntry);
                    m(backStackEntry);
                    return;
                }
                Log.i(C0943u.f16548H, "Ignoring add of destination " + backStackEntry.g() + " outside of the call to navigate(). ");
                return;
            }
            Object obj = this.f16595h.f16591x.get(f4);
            if (obj != null) {
                ((b) obj).i(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.g().v() + " should already be created").toString());
        }

        public final void m(@l3.d r backStackEntry) {
            kotlin.jvm.internal.F.p(backStackEntry, "backStackEntry");
            super.i(backStackEntry);
        }

        @l3.d
        public final c0<? extends F> n() {
            return this.f16594g;
        }
    }

    /* renamed from: androidx.navigation.u$c */
    /* loaded from: classes.dex */
    public interface c {
        void a(@l3.d C0943u c0943u, @l3.d F f4, @l3.e Bundle bundle);
    }

    /* renamed from: androidx.navigation.u$d */
    /* loaded from: classes.dex */
    static final class d extends Lambda implements X2.l<Context, Context> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f16599F = new d();

        d() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Context C(@l3.d Context it) {
            kotlin.jvm.internal.F.p(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.u$e */
    /* loaded from: classes.dex */
    public static final class e extends Lambda implements X2.l<U, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ F f16600F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ C0943u f16601G;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.navigation.u$e$a */
        /* loaded from: classes.dex */
        public static final class a extends Lambda implements X2.l<C0930g, H0> {

            /* renamed from: F, reason: collision with root package name */
            public static final a f16602F = new a();

            a() {
                super(1);
            }

            @Override // X2.l
            public /* bridge */ /* synthetic */ H0 C(C0930g c0930g) {
                c(c0930g);
                return H0.f51801a;
            }

            public final void c(@l3.d C0930g anim) {
                kotlin.jvm.internal.F.p(anim, "$this$anim");
                anim.e(0);
                anim.f(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.navigation.u$e$b */
        /* loaded from: classes.dex */
        public static final class b extends Lambda implements X2.l<h0, H0> {

            /* renamed from: F, reason: collision with root package name */
            public static final b f16603F = new b();

            b() {
                super(1);
            }

            @Override // X2.l
            public /* bridge */ /* synthetic */ H0 C(h0 h0Var) {
                c(h0Var);
                return H0.f51801a;
            }

            public final void c(@l3.d h0 popUpTo) {
                kotlin.jvm.internal.F.p(popUpTo, "$this$popUpTo");
                popUpTo.d(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(F f4, C0943u c0943u) {
            super(1);
            this.f16600F = f4;
            this.f16601G = c0943u;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(U u3) {
            c(u3);
            return H0.f51801a;
        }

        public final void c(@l3.d U navOptions) {
            J w3;
            kotlin.jvm.internal.F.p(navOptions, "$this$navOptions");
            navOptions.a(a.f16602F);
            F f4 = this.f16600F;
            if (f4 instanceof J) {
                kotlin.sequences.m<F> c4 = F.f16277N.c(f4);
                C0943u c0943u = this.f16601G;
                for (F f5 : c4) {
                    F I3 = c0943u.I();
                    if (I3 == null) {
                        w3 = null;
                    } else {
                        w3 = I3.w();
                    }
                    if (kotlin.jvm.internal.F.g(f5, w3)) {
                        return;
                    }
                }
                if (C0943u.f16561U) {
                    navOptions.i(J.f16301T.a(this.f16601G.K()).t(), b.f16603F);
                }
            }
        }
    }

    /* renamed from: androidx.navigation.u$f */
    /* loaded from: classes.dex */
    static final class f extends Lambda implements X2.a<S> {
        f() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final S n() {
            S s4 = C0943u.this.f16570c;
            if (s4 == null) {
                return new S(C0943u.this.F(), C0943u.this.f16590w);
            }
            return s4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.u$g */
    /* loaded from: classes.dex */
    public static final class g extends Lambda implements X2.l<r, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f16605F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ C0943u f16606G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ F f16607H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ Bundle f16608I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Ref.BooleanRef booleanRef, C0943u c0943u, F f4, Bundle bundle) {
            super(1);
            this.f16605F = booleanRef;
            this.f16606G = c0943u;
            this.f16607H = f4;
            this.f16608I = bundle;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(r rVar) {
            c(rVar);
            return H0.f51801a;
        }

        public final void c(@l3.d r it) {
            kotlin.jvm.internal.F.p(it, "it");
            this.f16605F.f52294E = true;
            C0943u.p(this.f16606G, this.f16607H, this.f16608I, it, null, 8, null);
        }
    }

    /* renamed from: androidx.navigation.u$h */
    /* loaded from: classes.dex */
    static final class h extends Lambda implements X2.l<r, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final h f16609F = new h();

        h() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(r rVar) {
            c(rVar);
            return H0.f51801a;
        }

        public final void c(@l3.d r it) {
            kotlin.jvm.internal.F.p(it, "it");
        }
    }

    /* renamed from: androidx.navigation.u$i */
    /* loaded from: classes.dex */
    public static final class i extends androidx.activity.j {
        i() {
            super(false);
        }

        @Override // androidx.activity.j
        public void e() {
            C0943u.this.t0();
        }
    }

    /* renamed from: androidx.navigation.u$j */
    /* loaded from: classes.dex */
    static final class j extends Lambda implements X2.l<r, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final j f16611F = new j();

        j() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(r rVar) {
            c(rVar);
            return H0.f51801a;
        }

        public final void c(@l3.d r it) {
            kotlin.jvm.internal.F.p(it, "it");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.u$k */
    /* loaded from: classes.dex */
    public static final class k extends Lambda implements X2.l<r, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f16612F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f16613G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ C0943u f16614H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f16615I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ C2096k<C0941s> f16616J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, C0943u c0943u, boolean z3, C2096k<C0941s> c2096k) {
            super(1);
            this.f16612F = booleanRef;
            this.f16613G = booleanRef2;
            this.f16614H = c0943u;
            this.f16615I = z3;
            this.f16616J = c2096k;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(r rVar) {
            c(rVar);
            return H0.f51801a;
        }

        public final void c(@l3.d r entry) {
            kotlin.jvm.internal.F.p(entry, "entry");
            this.f16612F.f52294E = true;
            this.f16613G.f52294E = true;
            this.f16614H.E0(entry, this.f16615I, this.f16616J);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.u$l */
    /* loaded from: classes.dex */
    public static final class l extends Lambda implements X2.l<F, F> {

        /* renamed from: F, reason: collision with root package name */
        public static final l f16617F = new l();

        l() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final F C(@l3.d F destination) {
            kotlin.jvm.internal.F.p(destination, "destination");
            J w3 = destination.w();
            if (w3 != null && w3.c0() == destination.t()) {
                return destination.w();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.u$m */
    /* loaded from: classes.dex */
    public static final class m extends Lambda implements X2.l<F, Boolean> {
        m() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d F destination) {
            kotlin.jvm.internal.F.p(destination, "destination");
            return Boolean.valueOf(!C0943u.this.f16580m.containsKey(Integer.valueOf(destination.t())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.u$n */
    /* loaded from: classes.dex */
    public static final class n extends Lambda implements X2.l<F, F> {

        /* renamed from: F, reason: collision with root package name */
        public static final n f16619F = new n();

        n() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final F C(@l3.d F destination) {
            kotlin.jvm.internal.F.p(destination, "destination");
            J w3 = destination.w();
            if (w3 != null && w3.c0() == destination.t()) {
                return destination.w();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.u$o */
    /* loaded from: classes.dex */
    public static final class o extends Lambda implements X2.l<F, Boolean> {
        o() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d F destination) {
            kotlin.jvm.internal.F.p(destination, "destination");
            return Boolean.valueOf(!C0943u.this.f16580m.containsKey(Integer.valueOf(destination.t())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.u$p */
    /* loaded from: classes.dex */
    public static final class p extends Lambda implements X2.l<String, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ String f16621F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(1);
            this.f16621F = str;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.e String str) {
            return Boolean.valueOf(kotlin.jvm.internal.F.g(str, this.f16621F));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.navigation.u$q */
    /* loaded from: classes.dex */
    public static final class q extends Lambda implements X2.l<r, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f16622F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ List<r> f16623G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f16624H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ C0943u f16625I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ Bundle f16626J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Ref.BooleanRef booleanRef, List<r> list, Ref.IntRef intRef, C0943u c0943u, Bundle bundle) {
            super(1);
            this.f16622F = booleanRef;
            this.f16623G = list;
            this.f16624H = intRef;
            this.f16625I = c0943u;
            this.f16626J = bundle;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(r rVar) {
            c(rVar);
            return H0.f51801a;
        }

        public final void c(@l3.d r entry) {
            List<r> H3;
            kotlin.jvm.internal.F.p(entry, "entry");
            this.f16622F.f52294E = true;
            int indexOf = this.f16623G.indexOf(entry);
            if (indexOf == -1) {
                H3 = CollectionsKt__CollectionsKt.H();
            } else {
                int i4 = indexOf + 1;
                H3 = this.f16623G.subList(this.f16624H.f52299E, i4);
                this.f16624H.f52299E = i4;
            }
            this.f16625I.o(entry.g(), this.f16626J, entry, H3);
        }
    }

    public C0943u(@l3.d Context context) {
        kotlin.sequences.m n4;
        Object obj;
        List H3;
        kotlin.A a4;
        kotlin.jvm.internal.F.p(context, "context");
        this.f16568a = context;
        n4 = kotlin.sequences.s.n(context, d.f16599F);
        Iterator it = n4.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f16569b = (Activity) obj;
        this.f16575h = new C2096k<>();
        H3 = CollectionsKt__CollectionsKt.H();
        kotlinx.coroutines.flow.t<List<r>> a5 = kotlinx.coroutines.flow.J.a(H3);
        this.f16576i = a5;
        this.f16577j = C2284k.m(a5);
        this.f16578k = new LinkedHashMap();
        this.f16579l = new LinkedHashMap();
        this.f16580m = new LinkedHashMap();
        this.f16581n = new LinkedHashMap();
        this.f16585r = new CopyOnWriteArrayList<>();
        this.f16586s = Lifecycle.State.INITIALIZED;
        this.f16587t = new androidx.lifecycle.A() { // from class: androidx.navigation.t
            @Override // androidx.lifecycle.A
            public final void f(androidx.lifecycle.E e4, Lifecycle.Event event) {
                C0943u.U(C0943u.this, e4, event);
            }
        };
        this.f16588u = new i();
        this.f16589v = true;
        this.f16590w = new d0();
        this.f16591x = new LinkedHashMap();
        this.f16562A = new LinkedHashMap();
        d0 d0Var = this.f16590w;
        d0Var.b(new N(d0Var));
        this.f16590w.b(new C0926c(this.f16568a));
        this.f16564C = new ArrayList();
        a4 = kotlin.C.a(new f());
        this.f16565D = a4;
        kotlinx.coroutines.flow.s<r> b4 = kotlinx.coroutines.flow.z.b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.f16566E = b4;
        this.f16567F = C2284k.l(b4);
    }

    private final void A0(c0<? extends F> c0Var, r rVar, boolean z3, X2.l<? super r, H0> lVar) {
        this.f16593z = lVar;
        c0Var.j(rVar, z3);
        this.f16593z = null;
    }

    private final String B(int[] iArr) {
        J j4 = this.f16571d;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            F f4 = null;
            if (i4 >= length) {
                return null;
            }
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            if (i4 == 0) {
                J j5 = this.f16571d;
                kotlin.jvm.internal.F.m(j5);
                if (j5.t() == i6) {
                    f4 = this.f16571d;
                }
            } else {
                kotlin.jvm.internal.F.m(j4);
                f4 = j4.U(i6);
            }
            if (f4 == null) {
                return F.f16277N.b(this.f16568a, i6);
            }
            if (i4 != iArr.length - 1 && (f4 instanceof J)) {
                j4 = (J) f4;
                while (true) {
                    kotlin.jvm.internal.F.m(j4);
                    if (j4.U(j4.c0()) instanceof J) {
                        j4 = (J) j4.U(j4.c0());
                    }
                }
            }
            i4 = i5;
        }
    }

    @androidx.annotation.K
    private final boolean B0(@androidx.annotation.D int i4, boolean z3, boolean z4) {
        List X4;
        F f4;
        kotlin.sequences.m n4;
        kotlin.sequences.m Z22;
        kotlin.sequences.m n5;
        kotlin.sequences.m<F> Z23;
        String c4;
        if (C().isEmpty()) {
            return false;
        }
        ArrayList<c0<? extends F>> arrayList = new ArrayList();
        X4 = kotlin.collections.D.X4(C());
        Iterator it = X4.iterator();
        while (true) {
            if (it.hasNext()) {
                F g4 = ((r) it.next()).g();
                c0 f5 = this.f16590w.f(g4.v());
                if (z3 || g4.t() != i4) {
                    arrayList.add(f5);
                }
                if (g4.t() == i4) {
                    f4 = g4;
                    break;
                }
            } else {
                f4 = null;
                break;
            }
        }
        if (f4 == null) {
            Log.i(f16548H, "Ignoring popBackStack to destination " + F.f16277N.b(this.f16568a, i4) + " as it was not found on the current back stack");
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        C2096k<C0941s> c2096k = new C2096k<>();
        for (c0<? extends F> c0Var : arrayList) {
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            A0(c0Var, C().t(), z4, new k(booleanRef2, booleanRef, this, z4, c2096k));
            if (!booleanRef2.f52294E) {
                break;
            }
        }
        if (z4) {
            if (!z3) {
                n5 = kotlin.sequences.s.n(f4, l.f16617F);
                Z23 = SequencesKt___SequencesKt.Z2(n5, new m());
                for (F f6 : Z23) {
                    Map<Integer, String> map = this.f16580m;
                    Integer valueOf = Integer.valueOf(f6.t());
                    C0941s o4 = c2096k.o();
                    if (o4 == null) {
                        c4 = null;
                    } else {
                        c4 = o4.c();
                    }
                    map.put(valueOf, c4);
                }
            }
            if (!c2096k.isEmpty()) {
                C0941s n6 = c2096k.n();
                n4 = kotlin.sequences.s.n(y(n6.b()), n.f16619F);
                Z22 = SequencesKt___SequencesKt.Z2(n4, new o());
                Iterator it2 = Z22.iterator();
                while (it2.hasNext()) {
                    this.f16580m.put(Integer.valueOf(((F) it2.next()).t()), n6.c());
                }
                this.f16581n.put(n6.c(), c2096k);
            }
        }
        Y0();
        return booleanRef.f52294E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void C0(C0943u c0943u, c0 c0Var, r rVar, boolean z3, X2.l lVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 4) != 0) {
                lVar = j.f16611F;
            }
            c0943u.A0(c0Var, rVar, z3, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    static /* synthetic */ boolean D0(C0943u c0943u, int i4, boolean z3, boolean z4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 4) != 0) {
                z4 = false;
            }
            return c0943u.B0(i4, z3, z4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(r rVar, boolean z3, C2096k<C0941s> c2096k) {
        C0945w c0945w;
        kotlinx.coroutines.flow.H<Set<r>> c4;
        Set<r> value;
        r t3 = C().t();
        if (kotlin.jvm.internal.F.g(t3, rVar)) {
            C().removeLast();
            b bVar = this.f16591x.get(N().f(t3.g().v()));
            boolean z4 = true;
            if ((bVar == null || (c4 = bVar.c()) == null || (value = c4.getValue()) == null || !value.contains(t3)) && !this.f16579l.containsKey(t3)) {
                z4 = false;
            }
            Lifecycle.State b4 = t3.getLifecycle().b();
            Lifecycle.State state = Lifecycle.State.CREATED;
            if (b4.e(state)) {
                if (z3) {
                    t3.o(state);
                    c2096k.addFirst(new C0941s(t3));
                }
                if (!z4) {
                    t3.o(Lifecycle.State.DESTROYED);
                    W0(t3);
                } else {
                    t3.o(state);
                }
            }
            if (!z3 && !z4 && (c0945w = this.f16584q) != null) {
                c0945w.v(t3.h());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + rVar.g() + ", which is not the top of the back stack (" + t3.g() + ')').toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void F0(C0943u c0943u, r rVar, boolean z3, C2096k c2096k, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z3 = false;
            }
            if ((i4 & 4) != 0) {
                c2096k = new C2096k();
            }
            c0943u.E0(rVar, z3, c2096k);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    private final int J() {
        C2096k<r> C3 = C();
        int i4 = 0;
        if (!(C3 instanceof Collection) || !C3.isEmpty()) {
            Iterator<r> it = C3.iterator();
            while (it.hasNext()) {
                if ((!(it.next().g() instanceof J)) && (i4 = i4 + 1) < 0) {
                    CollectionsKt__CollectionsKt.Y();
                }
            }
        }
        return i4;
    }

    private final boolean J0(int i4, Bundle bundle, T t3, c0.a aVar) {
        Object B22;
        Object v3;
        List S3;
        Object p32;
        F g4;
        if (!this.f16580m.containsKey(Integer.valueOf(i4))) {
            return false;
        }
        String str = this.f16580m.get(Integer.valueOf(i4));
        kotlin.collections.A.G0(this.f16580m.values(), new p(str));
        List<r> T3 = T(this.f16581n.remove(str));
        ArrayList<List<r>> arrayList = new ArrayList();
        ArrayList<r> arrayList2 = new ArrayList();
        for (Object obj : T3) {
            if (!(((r) obj).g() instanceof J)) {
                arrayList2.add(obj);
            }
        }
        for (r rVar : arrayList2) {
            v3 = kotlin.collections.D.v3(arrayList);
            List list = (List) v3;
            String str2 = null;
            if (list != null) {
                p32 = kotlin.collections.D.p3(list);
                r rVar2 = (r) p32;
                if (rVar2 != null && (g4 = rVar2.g()) != null) {
                    str2 = g4.v();
                }
            }
            if (!kotlin.jvm.internal.F.g(str2, rVar.g().v())) {
                S3 = CollectionsKt__CollectionsKt.S(rVar);
                arrayList.add(S3);
            } else {
                list.add(rVar);
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List<r> list2 : arrayList) {
            d0 d0Var = this.f16590w;
            B22 = kotlin.collections.D.B2(list2);
            p0(d0Var.f(((r) B22).g().v()), list2, t3, aVar, new q(booleanRef, T3, new Ref.IntRef(), this, bundle));
        }
        return booleanRef.f52294E;
    }

    @InterfaceC0946x
    public static /* synthetic */ void R() {
    }

    private final List<r> T(C2096k<C0941s> c2096k) {
        F g4;
        ArrayList arrayList = new ArrayList();
        r u3 = C().u();
        if (u3 == null) {
            g4 = null;
        } else {
            g4 = u3.g();
        }
        if (g4 == null) {
            g4 = K();
        }
        if (c2096k != null) {
            for (C0941s c0941s : c2096k) {
                F z3 = z(g4, c0941s.b());
                if (z3 != null) {
                    arrayList.add(c0941s.e(F(), z3, L(), this.f16584q));
                    g4 = z3;
                } else {
                    throw new IllegalStateException(("Restore State failed: destination " + F.f16277N.b(F(), c0941s.b()) + " cannot be found from the current destination " + g4).toString());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(C0943u this$0, androidx.lifecycle.E noName_0, Lifecycle.Event event) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(noName_0, "$noName_0");
        kotlin.jvm.internal.F.p(event, "event");
        Lifecycle.State g4 = event.g();
        kotlin.jvm.internal.F.o(g4, "event.targetState");
        this$0.f16586s = g4;
        if (this$0.f16571d != null) {
            Iterator<r> it = this$0.C().iterator();
            while (it.hasNext()) {
                it.next().k(event);
            }
        }
    }

    private final boolean U0() {
        List Ry;
        Object O02;
        Bundle bundle;
        Object O03;
        int i4 = 0;
        if (!this.f16574g) {
            return false;
        }
        Activity activity = this.f16569b;
        kotlin.jvm.internal.F.m(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        kotlin.jvm.internal.F.m(extras);
        int[] intArray = extras.getIntArray(f16556P);
        kotlin.jvm.internal.F.m(intArray);
        kotlin.jvm.internal.F.o(intArray, "extras!!.getIntArray(KEY_DEEP_LINK_IDS)!!");
        Ry = C2101p.Ry(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(f16557Q);
        O02 = kotlin.collections.A.O0(Ry);
        int intValue = ((Number) O02).intValue();
        if (parcelableArrayList != null) {
            O03 = kotlin.collections.A.O0(parcelableArrayList);
        }
        if (Ry.isEmpty()) {
            return false;
        }
        F z3 = z(K(), intValue);
        if (z3 instanceof J) {
            intValue = J.f16301T.a((J) z3).t();
        }
        F I3 = I();
        if (I3 == null || intValue != I3.t()) {
            return false;
        }
        C0948z u3 = u();
        Bundle b4 = C0741d.b(C2122h0.a(f16560T, intent));
        Bundle bundle2 = extras.getBundle(f16558R);
        if (bundle2 != null) {
            b4.putAll(bundle2);
        }
        u3.k(b4);
        for (Object obj : Ry) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Z();
            }
            int intValue2 = ((Number) obj).intValue();
            if (parcelableArrayList == null) {
                bundle = null;
            } else {
                bundle = (Bundle) parcelableArrayList.get(i4);
            }
            u3.b(intValue2, bundle);
            i4 = i5;
        }
        u3.h().r();
        Activity activity2 = this.f16569b;
        if (activity2 != null) {
            activity2.finish();
            return true;
        }
        return true;
    }

    private final void V(r rVar, r rVar2) {
        this.f16578k.put(rVar, rVar2);
        if (this.f16579l.get(rVar2) == null) {
            this.f16579l.put(rVar2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.f16579l.get(rVar2);
        kotlin.jvm.internal.F.m(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    private final boolean V0() {
        F I3 = I();
        kotlin.jvm.internal.F.m(I3);
        int t3 = I3.t();
        for (J w3 = I3.w(); w3 != null; w3 = w3.w()) {
            if (w3.c0() != t3) {
                Bundle bundle = new Bundle();
                Activity activity = this.f16569b;
                if (activity != null) {
                    kotlin.jvm.internal.F.m(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f16569b;
                        kotlin.jvm.internal.F.m(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f16569b;
                            kotlin.jvm.internal.F.m(activity3);
                            bundle.putParcelable(f16560T, activity3.getIntent());
                            J j4 = this.f16571d;
                            kotlin.jvm.internal.F.m(j4);
                            Activity activity4 = this.f16569b;
                            kotlin.jvm.internal.F.m(activity4);
                            Intent intent = activity4.getIntent();
                            kotlin.jvm.internal.F.o(intent, "activity!!.intent");
                            F.c A3 = j4.A(new D(intent));
                            if (A3 != null) {
                                bundle.putAll(A3.e().k(A3.f()));
                            }
                        }
                    }
                }
                C0948z.r(new C0948z(this), w3.t(), null, 2, null).k(bundle).h().r();
                Activity activity5 = this.f16569b;
                if (activity5 != null) {
                    activity5.finish();
                    return true;
                }
                return true;
            }
            t3 = w3.t();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (J() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Y0() {
        /*
            r3 = this;
            androidx.activity.j r0 = r3.f16588u
            boolean r1 = r3.f16589v
            if (r1 == 0) goto Le
            int r1 = r3.J()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.i(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C0943u.Y0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0112 A[LOOP:1: B:20:0x010c->B:22:0x0112, LOOP_END] */
    @androidx.annotation.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g0(androidx.navigation.F r21, android.os.Bundle r22, androidx.navigation.T r23, androidx.navigation.c0.a r24) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C0943u.g0(androidx.navigation.F, android.os.Bundle, androidx.navigation.T, androidx.navigation.c0$a):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x027b, code lost:
    
        r2.m(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02a4, code lost:
    
        throw new java.lang.IllegalStateException(("NavigatorBackStack for " + r31.v() + " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a5, code lost:
    
        C().addAll(r10);
        C().add(r8);
        r0 = kotlin.collections.D.E4(r10, r8);
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02bf, code lost:
    
        if (r0.hasNext() == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02c1, code lost:
    
        r1 = (androidx.navigation.r) r0.next();
        r2 = r1.g().w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02cf, code lost:
    
        if (r2 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02d1, code lost:
    
        V(r1, D(r2.t()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02dd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f0, code lost:
    
        r0 = r0.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0114, code lost:
    
        r0 = ((androidx.navigation.r) r10.n()).g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00eb, code lost:
    
        r12 = r0;
        r13 = r2;
        r9 = r4;
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00ab, code lost:
    
        r19 = r12;
        r0 = r13;
        r8 = r14;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0082, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00f0, code lost:
    
        r9 = r4;
        r10 = r5;
        r19 = r12;
        r12 = r13;
        r8 = r14;
        r13 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0105, code lost:
    
        r10 = r5;
        r19 = r12;
        r12 = r13;
        r8 = r14;
        r13 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r5 = new kotlin.collections.C2096k();
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if ((r31 instanceof androidx.navigation.J) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        kotlin.jvm.internal.F.m(r0);
        r4 = r0.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r4 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        r0 = r13.listIterator(r34.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r0.hasPrevious() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r1 = r0.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (kotlin.jvm.internal.F.g(r1.g(), r4) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        r19 = r12;
        r0 = r13;
        r2 = r15;
        r8 = r14;
        r1 = androidx.navigation.r.a.b(androidx.navigation.r.f16524R, r30.f16568a, r4, r32, L(), r30.f16584q, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        r5.addFirst(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if ((!C().isEmpty()) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0010, code lost:
    
        if ((r12 instanceof androidx.navigation.InterfaceC0931h) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
    
        if (C().t().g() != r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
    
        r12 = r0;
        r13 = r2;
        r9 = r4;
        r10 = r5;
        F0(r30, C().t(), false, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        if (r9 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f9, code lost:
    
        if (r9 != r31) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fc, code lost:
    
        r14 = r8;
        r0 = r9;
        r5 = r10;
        r15 = r13;
        r13 = r12;
        r12 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010f, code lost:
    
        if (r10.isEmpty() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011e, code lost:
    
        if (r0 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
    
        if (y(r0.t()) != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012a, code lost:
    
        r0 = r0.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012e, code lost:
    
        if (r0 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0130, code lost:
    
        r1 = r12.listIterator(r34.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013c, code lost:
    
        if (r1.hasPrevious() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013e, code lost:
    
        r2 = r1.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (C().isEmpty() != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014d, code lost:
    
        if (kotlin.jvm.internal.F.g(r2.g(), r0) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0152, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0154, code lost:
    
        if (r2 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0156, code lost:
    
        r2 = androidx.navigation.r.a.b(androidx.navigation.r.f16524R, r30.f16568a, r0, r0.k(r13), L(), r30.f16584q, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0176, code lost:
    
        r10.addFirst(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0150, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017e, code lost:
    
        if (r10.isEmpty() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0181, code lost:
    
        r19 = ((androidx.navigation.r) r10.t()).g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0195, code lost:
    
        if (C().isEmpty() != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if ((C().t().g() instanceof androidx.navigation.InterfaceC0931h) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a7, code lost:
    
        if ((C().t().g() instanceof androidx.navigation.J) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c2, code lost:
    
        if (((androidx.navigation.J) C().t().g()).V(r19.t(), false) != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c4, code lost:
    
        F0(r30, C().t(), false, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d9, code lost:
    
        r0 = C().o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e3, code lost:
    
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e5, code lost:
    
        r0 = (androidx.navigation.r) r10.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01eb, code lost:
    
        if (r0 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ed, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01fa, code lost:
    
        if (kotlin.jvm.internal.F.g(r0, r30.f16571d) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fc, code lost:
    
        r0 = r12.listIterator(r34.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0208, code lost:
    
        if (r0.hasPrevious() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020a, code lost:
    
        r1 = r0.previous();
        r2 = r1.g();
        r3 = r30.f16571d;
        kotlin.jvm.internal.F.m(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021e, code lost:
    
        if (kotlin.jvm.internal.F.g(r2, r3) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0220, code lost:
    
        r18 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0222, code lost:
    
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (D0(r30, C().t().g().t(), true, false, 4, null) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0224, code lost:
    
        if (r18 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0226, code lost:
    
        r19 = androidx.navigation.r.f16524R;
        r0 = r30.f16568a;
        r1 = r30.f16571d;
        kotlin.jvm.internal.F.m(r1);
        r2 = r30.f16571d;
        kotlin.jvm.internal.F.m(r2);
        r18 = androidx.navigation.r.a.b(r19, r0, r1, r2.k(r13), L(), r30.f16584q, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0250, code lost:
    
        r10.addFirst(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0255, code lost:
    
        r0 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x025d, code lost:
    
        if (r0.hasNext() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025f, code lost:
    
        r1 = (androidx.navigation.r) r0.next();
        r2 = r30.f16591x.get(r30.f16590w.f(r1.g().v()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0279, code lost:
    
        if (r2 == null) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(androidx.navigation.F r31, android.os.Bundle r32, androidx.navigation.r r33, java.util.List<androidx.navigation.r> r34) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C0943u.o(androidx.navigation.F, android.os.Bundle, androidx.navigation.r, java.util.List):void");
    }

    public static /* synthetic */ void o0(C0943u c0943u, String str, T t3, c0.a aVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                t3 = null;
            }
            if ((i4 & 4) != 0) {
                aVar = null;
            }
            c0943u.n0(str, t3, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void p(C0943u c0943u, F f4, Bundle bundle, r rVar, List list, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 8) != 0) {
                list = CollectionsKt__CollectionsKt.H();
            }
            c0943u.o(f4, bundle, rVar, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    private final void p0(c0<? extends F> c0Var, List<r> list, T t3, c0.a aVar, X2.l<? super r, H0> lVar) {
        this.f16592y = lVar;
        c0Var.e(list, t3, aVar);
        this.f16592y = null;
    }

    static /* synthetic */ void q0(C0943u c0943u, c0 c0Var, List list, T t3, c0.a aVar, X2.l lVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 8) != 0) {
                lVar = h.f16609F;
            }
            c0943u.p0(c0Var, list, t3, aVar, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
    }

    @androidx.annotation.K
    private final void s0(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f16572e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList(f16550J)) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String name = it.next();
                d0 d0Var = this.f16590w;
                kotlin.jvm.internal.F.o(name, "name");
                c0 f4 = d0Var.f(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    f4.h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f16573f;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i4 = 0;
            while (i4 < length) {
                Parcelable parcelable = parcelableArr[i4];
                i4++;
                C0941s c0941s = (C0941s) parcelable;
                F y3 = y(c0941s.b());
                if (y3 != null) {
                    r e4 = c0941s.e(F(), y3, L(), this.f16584q);
                    c0<? extends F> f5 = this.f16590w.f(y3.v());
                    Map<c0<? extends F>, b> map = this.f16591x;
                    b bVar = map.get(f5);
                    if (bVar == null) {
                        bVar = new b(this, f5);
                        map.put(f5, bVar);
                    }
                    C().add(e4);
                    bVar.m(e4);
                    J w3 = e4.g().w();
                    if (w3 != null) {
                        V(e4, D(w3.t()));
                    }
                } else {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + F.f16277N.b(F(), c0941s.b()) + " cannot be found from the current destination " + I());
                }
            }
            Y0();
            this.f16573f = null;
        }
        Collection<c0<? extends F>> values = this.f16590w.g().values();
        ArrayList<c0<? extends F>> arrayList = new ArrayList();
        for (Object obj : values) {
            if (!((c0) obj).c()) {
                arrayList.add(obj);
            }
        }
        for (c0<? extends F> c0Var : arrayList) {
            Map<c0<? extends F>, b> map2 = this.f16591x;
            b bVar2 = map2.get(c0Var);
            if (bVar2 == null) {
                bVar2 = new b(this, c0Var);
                map2.put(c0Var, bVar2);
            }
            c0Var.f(bVar2);
        }
        if (this.f16571d != null && C().isEmpty()) {
            if (!this.f16574g && (activity = this.f16569b) != null) {
                kotlin.jvm.internal.F.m(activity);
                if (S(activity.getIntent())) {
                    return;
                }
            }
            J j4 = this.f16571d;
            kotlin.jvm.internal.F.m(j4);
            g0(j4, bundle, null, null);
            return;
        }
        v();
    }

    @androidx.annotation.K
    private final boolean t(@androidx.annotation.D int i4) {
        Iterator<T> it = this.f16591x.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).k(true);
        }
        boolean J02 = J0(i4, null, null, null);
        Iterator<T> it2 = this.f16591x.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).k(false);
        }
        if (J02 && B0(i4, true, false)) {
            return true;
        }
        return false;
    }

    private final boolean v() {
        List<r> Y5;
        while (!C().isEmpty() && (C().t().g() instanceof J)) {
            F0(this, C().t(), false, null, 6, null);
        }
        r u3 = C().u();
        if (u3 != null) {
            this.f16564C.add(u3);
        }
        this.f16563B++;
        X0();
        int i4 = this.f16563B - 1;
        this.f16563B = i4;
        if (i4 == 0) {
            Y5 = kotlin.collections.D.Y5(this.f16564C);
            this.f16564C.clear();
            for (r rVar : Y5) {
                Iterator<c> it = this.f16585r.iterator();
                while (it.hasNext()) {
                    it.next().a(this, rVar.g(), rVar.e());
                }
                this.f16566E.j(rVar);
            }
            this.f16576i.j(G0());
        }
        if (u3 != null) {
            return true;
        }
        return false;
    }

    @W2.n
    @E
    public static final void w(boolean z3) {
        f16547G.a(z3);
    }

    public static /* synthetic */ boolean y0(C0943u c0943u, String str, boolean z3, boolean z4, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 4) != 0) {
                z4 = false;
            }
            return c0943u.x0(str, z3, z4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    private final F z(F f4, @androidx.annotation.D int i4) {
        J w3;
        if (f4.t() == i4) {
            return f4;
        }
        if (f4 instanceof J) {
            w3 = (J) f4;
        } else {
            w3 = f4.w();
            kotlin.jvm.internal.F.m(w3);
        }
        return w3.U(i4);
    }

    @l3.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final F A(@l3.d String destinationRoute) {
        J w3;
        kotlin.jvm.internal.F.p(destinationRoute, "destinationRoute");
        J j4 = this.f16571d;
        J j5 = null;
        if (j4 == null) {
            return null;
        }
        kotlin.jvm.internal.F.m(j4);
        if (kotlin.jvm.internal.F.g(j4.x(), destinationRoute)) {
            return this.f16571d;
        }
        r u3 = C().u();
        if (u3 != null) {
            j5 = u3.g();
        }
        if (j5 == null) {
            j5 = this.f16571d;
            kotlin.jvm.internal.F.m(j5);
        }
        if (j5 instanceof J) {
            w3 = j5;
        } else {
            w3 = j5.w();
            kotlin.jvm.internal.F.m(w3);
        }
        return w3.W(destinationRoute);
    }

    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C2096k<r> C() {
        return this.f16575h;
    }

    @l3.d
    public r D(@androidx.annotation.D int i4) {
        r rVar;
        C2096k<r> C3 = C();
        ListIterator<r> listIterator = C3.listIterator(C3.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                rVar = listIterator.previous();
                if (rVar.g().t() == i4) {
                    break;
                }
            } else {
                rVar = null;
                break;
            }
        }
        r rVar2 = rVar;
        if (rVar2 != null) {
            return rVar2;
        }
        throw new IllegalArgumentException(("No destination with ID " + i4 + " is on the NavController's back stack. The current destination is " + I()).toString());
    }

    @l3.d
    public final r E(@l3.d String route) {
        r rVar;
        kotlin.jvm.internal.F.p(route, "route");
        C2096k<r> C3 = C();
        ListIterator<r> listIterator = C3.listIterator(C3.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                rVar = listIterator.previous();
                if (kotlin.jvm.internal.F.g(rVar.g().x(), route)) {
                    break;
                }
            } else {
                rVar = null;
                break;
            }
        }
        r rVar2 = rVar;
        if (rVar2 != null) {
            return rVar2;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + I()).toString());
    }

    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Context F() {
        return this.f16568a;
    }

    @l3.e
    public r G() {
        return C().u();
    }

    @l3.d
    public final List<r> G0() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f16591x.values().iterator();
        while (it.hasNext()) {
            Set<r> value = ((b) it.next()).c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                r rVar = (r) obj;
                if (!arrayList.contains(rVar) && !rVar.getLifecycle().b().e(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            kotlin.collections.A.q0(arrayList, arrayList2);
        }
        C2096k<r> C3 = C();
        ArrayList arrayList3 = new ArrayList();
        for (r rVar2 : C3) {
            r rVar3 = rVar2;
            if (!arrayList.contains(rVar3) && rVar3.getLifecycle().b().e(Lifecycle.State.STARTED)) {
                arrayList3.add(rVar2);
            }
        }
        kotlin.collections.A.q0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((r) obj2).g() instanceof J)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    @l3.d
    public final InterfaceC2282i<r> H() {
        return this.f16567F;
    }

    public void H0(@l3.d c listener) {
        kotlin.jvm.internal.F.p(listener, "listener");
        this.f16585r.remove(listener);
    }

    @l3.e
    public F I() {
        r G3 = G();
        if (G3 == null) {
            return null;
        }
        return G3.g();
    }

    @InterfaceC0566i
    public void I0(@l3.e Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f16568a.getClassLoader());
        this.f16572e = bundle.getBundle(f16549I);
        this.f16573f = bundle.getParcelableArray(f16551K);
        this.f16581n.clear();
        int[] intArray = bundle.getIntArray(f16552L);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f16553M);
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = intArray[i4];
                i4++;
                this.f16580m.put(Integer.valueOf(i6), stringArrayList.get(i5));
                i5++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(f16554N);
        if (stringArrayList2 != null) {
            for (String id : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(kotlin.jvm.internal.F.C(f16555O, id));
                if (parcelableArray != null) {
                    Map<String, C2096k<C0941s>> map = this.f16581n;
                    kotlin.jvm.internal.F.o(id, "id");
                    C2096k<C0941s> c2096k = new C2096k<>(parcelableArray.length);
                    Iterator a4 = C2185h.a(parcelableArray);
                    while (a4.hasNext()) {
                        Parcelable parcelable = (Parcelable) a4.next();
                        if (parcelable != null) {
                            c2096k.add((C0941s) parcelable);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        }
                    }
                    H0 h02 = H0.f51801a;
                    map.put(id, c2096k);
                }
            }
        }
        this.f16574g = bundle.getBoolean(f16559S);
    }

    @l3.d
    @androidx.annotation.K
    public J K() {
        J j4 = this.f16571d;
        if (j4 != null) {
            if (j4 != null) {
                return j4;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    @l3.e
    @InterfaceC0566i
    public Bundle K0() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, c0<? extends F>> entry : this.f16590w.g().entrySet()) {
            String key = entry.getKey();
            Bundle i4 = entry.getValue().i();
            if (i4 != null) {
                arrayList.add(key);
                bundle2.putBundle(key, i4);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList(f16550J, arrayList);
            bundle.putBundle(f16549I, bundle2);
        } else {
            bundle = null;
        }
        if (!C().isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[C().size()];
            Iterator<r> it = C().iterator();
            int i5 = 0;
            while (it.hasNext()) {
                parcelableArr[i5] = new C0941s(it.next());
                i5++;
            }
            bundle.putParcelableArray(f16551K, parcelableArr);
        }
        if (!this.f16580m.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f16580m.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i6 = 0;
            for (Map.Entry<Integer, String> entry2 : this.f16580m.entrySet()) {
                int intValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i6] = intValue;
                arrayList2.add(value);
                i6++;
            }
            bundle.putIntArray(f16552L, iArr);
            bundle.putStringArrayList(f16553M, arrayList2);
        }
        if (!this.f16581n.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, C2096k<C0941s>> entry3 : this.f16581n.entrySet()) {
                String key2 = entry3.getKey();
                C2096k<C0941s> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i7 = 0;
                for (C0941s c0941s : value2) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt__CollectionsKt.Z();
                    }
                    parcelableArr2[i7] = c0941s;
                    i7 = i8;
                }
                bundle.putParcelableArray(kotlin.jvm.internal.F.C(f16555O, key2), parcelableArr2);
            }
            bundle.putStringArrayList(f16554N, arrayList3);
        }
        if (this.f16574g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(f16559S, this.f16574g);
        }
        return bundle;
    }

    @l3.d
    public final Lifecycle.State L() {
        if (this.f16582o == null) {
            return Lifecycle.State.CREATED;
        }
        return this.f16586s;
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void L0(@androidx.annotation.M int i4) {
        O0(M().b(i4), null);
    }

    @l3.d
    public S M() {
        return (S) this.f16565D.getValue();
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void M0(@androidx.annotation.M int i4, @l3.e Bundle bundle) {
        O0(M().b(i4), bundle);
    }

    @l3.d
    public d0 N() {
        return this.f16590w;
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void N0(@l3.d J graph) {
        kotlin.jvm.internal.F.p(graph, "graph");
        O0(graph, null);
    }

    @l3.e
    public r O() {
        List X4;
        kotlin.sequences.m e4;
        Object obj;
        X4 = kotlin.collections.D.X4(C());
        Iterator it = X4.iterator();
        if (it.hasNext()) {
            it.next();
        }
        e4 = kotlin.sequences.s.e(it);
        Iterator it2 = e4.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (!(((r) obj).g() instanceof J)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (r) obj;
    }

    @InterfaceC0566i
    @androidx.annotation.K
    public void O0(@l3.d J graph, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(graph, "graph");
        if (!kotlin.jvm.internal.F.g(this.f16571d, graph)) {
            J j4 = this.f16571d;
            if (j4 != null) {
                for (Integer id : new ArrayList(this.f16580m.keySet())) {
                    kotlin.jvm.internal.F.o(id, "id");
                    t(id.intValue());
                }
                D0(this, j4.t(), true, false, 4, null);
            }
            this.f16571d = graph;
            s0(bundle);
            return;
        }
        int B3 = graph.Z().B();
        int i4 = 0;
        while (i4 < B3) {
            int i5 = i4 + 1;
            F newDestination = graph.Z().C(i4);
            J j5 = this.f16571d;
            kotlin.jvm.internal.F.m(j5);
            j5.Z().x(i4, newDestination);
            C2096k<r> C3 = C();
            ArrayList<r> arrayList = new ArrayList();
            for (r rVar : C3) {
                int t3 = rVar.g().t();
                if (newDestination != null && t3 == newDestination.t()) {
                    arrayList.add(rVar);
                }
            }
            for (r rVar2 : arrayList) {
                kotlin.jvm.internal.F.o(newDestination, "newDestination");
                rVar2.n(newDestination);
            }
            i4 = i5;
        }
    }

    @l3.d
    public q0 P(@androidx.annotation.D int i4) {
        if (this.f16584q != null) {
            r D3 = D(i4);
            if (D3.g() instanceof J) {
                return D3;
            }
            throw new IllegalArgumentException(("No NavGraph with ID " + i4 + " is on the NavController's back stack").toString());
        }
        throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().".toString());
    }

    public final void P0(@l3.d Lifecycle.State state) {
        kotlin.jvm.internal.F.p(state, "<set-?>");
        this.f16586s = state;
    }

    @l3.d
    public final kotlinx.coroutines.flow.H<List<r>> Q() {
        return this.f16577j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void Q0(@l3.d androidx.lifecycle.E owner) {
        Lifecycle lifecycle;
        kotlin.jvm.internal.F.p(owner, "owner");
        if (kotlin.jvm.internal.F.g(owner, this.f16582o)) {
            return;
        }
        androidx.lifecycle.E e4 = this.f16582o;
        if (e4 != null && (lifecycle = e4.getLifecycle()) != null) {
            lifecycle.d(this.f16587t);
        }
        this.f16582o = owner;
        owner.getLifecycle().a(this.f16587t);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void R0(@l3.d d0 navigatorProvider) {
        kotlin.jvm.internal.F.p(navigatorProvider, "navigatorProvider");
        if (C().isEmpty()) {
            this.f16590w = navigatorProvider;
            return;
        }
        throw new IllegalStateException("NavigatorProvider must be set before setGraph call".toString());
    }

    @androidx.annotation.K
    public boolean S(@l3.e Intent intent) {
        int[] intArray;
        ArrayList parcelableArrayList;
        Bundle bundle;
        int[] iArr;
        F U3;
        Bundle bundle2;
        int i4 = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            intArray = null;
        } else {
            intArray = extras.getIntArray(f16556P);
        }
        if (extras == null) {
            parcelableArrayList = null;
        } else {
            parcelableArrayList = extras.getParcelableArrayList(f16557Q);
        }
        Bundle bundle3 = new Bundle();
        if (extras == null) {
            bundle = null;
        } else {
            bundle = extras.getBundle(f16558R);
        }
        if (bundle != null) {
            bundle3.putAll(bundle);
        }
        if (intArray == null || intArray.length == 0) {
            J j4 = this.f16571d;
            kotlin.jvm.internal.F.m(j4);
            F.c A3 = j4.A(new D(intent));
            if (A3 != null) {
                F e4 = A3.e();
                int[] n4 = F.n(e4, null, 1, null);
                Bundle k4 = e4.k(A3.f());
                if (k4 != null) {
                    bundle3.putAll(k4);
                }
                iArr = n4;
                parcelableArrayList = null;
                if (iArr != null || iArr.length == 0) {
                    return false;
                }
                String B3 = B(iArr);
                if (B3 != null) {
                    Log.i(f16548H, "Could not find destination " + ((Object) B3) + " in the navigation graph, ignoring the deep link from " + intent);
                    return false;
                }
                bundle3.putParcelable(f16560T, intent);
                int length = iArr.length;
                Bundle[] bundleArr = new Bundle[length];
                int i5 = 0;
                while (i5 < length) {
                    int i6 = i5 + 1;
                    Bundle bundle4 = new Bundle();
                    bundle4.putAll(bundle3);
                    if (parcelableArrayList != null && (bundle2 = (Bundle) parcelableArrayList.get(i5)) != null) {
                        bundle4.putAll(bundle2);
                    }
                    bundleArr[i5] = bundle4;
                    i5 = i6;
                }
                int flags = intent.getFlags();
                int i7 = 268435456 & flags;
                if (i7 != 0 && (flags & 32768) == 0) {
                    intent.addFlags(32768);
                    z1 c4 = z1.j(this.f16568a).c(intent);
                    kotlin.jvm.internal.F.o(c4, "create(context)\n        …ntWithParentStack(intent)");
                    c4.r();
                    Activity activity = this.f16569b;
                    if (activity != null) {
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                    }
                    return true;
                }
                if (i7 != 0) {
                    if (!C().isEmpty()) {
                        J j5 = this.f16571d;
                        kotlin.jvm.internal.F.m(j5);
                        D0(this, j5.t(), true, false, 4, null);
                    }
                    while (i4 < iArr.length) {
                        int i8 = iArr[i4];
                        int i9 = i4 + 1;
                        Bundle bundle5 = bundleArr[i4];
                        F y3 = y(i8);
                        if (y3 != null) {
                            g0(y3, bundle5, V.a(new e(y3, this)), null);
                            i4 = i9;
                        } else {
                            throw new IllegalStateException("Deep Linking failed: destination " + F.f16277N.b(this.f16568a, i8) + " cannot be found from the current destination " + I());
                        }
                    }
                    return true;
                }
                J j6 = this.f16571d;
                int length2 = iArr.length;
                int i10 = 0;
                while (i10 < length2) {
                    int i11 = i10 + 1;
                    int i12 = iArr[i10];
                    Bundle bundle6 = bundleArr[i10];
                    if (i10 == 0) {
                        U3 = this.f16571d;
                    } else {
                        kotlin.jvm.internal.F.m(j6);
                        U3 = j6.U(i12);
                    }
                    if (U3 != null) {
                        if (i10 != iArr.length - 1) {
                            if (U3 instanceof J) {
                                j6 = (J) U3;
                                while (true) {
                                    kotlin.jvm.internal.F.m(j6);
                                    if (j6.U(j6.c0()) instanceof J) {
                                        j6 = (J) j6.U(j6.c0());
                                    }
                                }
                            }
                        } else {
                            T.a aVar = new T.a();
                            J j7 = this.f16571d;
                            kotlin.jvm.internal.F.m(j7);
                            g0(U3, bundle6, T.a.k(aVar, j7.t(), true, false, 4, null).b(0).c(0).a(), null);
                        }
                        i10 = i11;
                    } else {
                        throw new IllegalStateException("Deep Linking failed: destination " + F.f16277N.b(this.f16568a, i12) + " cannot be found in graph " + j6);
                    }
                }
                this.f16574g = true;
                return true;
            }
        }
        iArr = intArray;
        if (iArr != null) {
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void S0(@l3.d OnBackPressedDispatcher dispatcher) {
        kotlin.jvm.internal.F.p(dispatcher, "dispatcher");
        if (kotlin.jvm.internal.F.g(dispatcher, this.f16583p)) {
            return;
        }
        androidx.lifecycle.E e4 = this.f16582o;
        if (e4 != null) {
            this.f16588u.g();
            this.f16583p = dispatcher;
            dispatcher.c(e4, this.f16588u);
            Lifecycle lifecycle = e4.getLifecycle();
            lifecycle.d(this.f16587t);
            lifecycle.a(this.f16587t);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void T0(@l3.d p0 viewModelStore) {
        kotlin.jvm.internal.F.p(viewModelStore, "viewModelStore");
        C0945w c0945w = this.f16584q;
        C0945w.b bVar = C0945w.f16627I;
        if (kotlin.jvm.internal.F.g(c0945w, bVar.a(viewModelStore))) {
            return;
        }
        if (C().isEmpty()) {
            this.f16584q = bVar.a(viewModelStore);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
    }

    @androidx.annotation.K
    public void W(@androidx.annotation.D int i4) {
        X(i4, null);
    }

    @l3.e
    public final r W0(@l3.d r child) {
        kotlin.jvm.internal.F.p(child, "child");
        r remove = this.f16578k.remove(child);
        Integer num = null;
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.f16579l.get(remove);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            b bVar = this.f16591x.get(this.f16590w.f(remove.g().v()));
            if (bVar != null) {
                bVar.e(remove);
            }
            this.f16579l.remove(remove);
        }
        return remove;
    }

    @androidx.annotation.K
    public void X(@androidx.annotation.D int i4, @l3.e Bundle bundle) {
        Y(i4, bundle, null);
    }

    public final void X0() {
        List<r> Y5;
        Object p32;
        F f4;
        List<r> X4;
        kotlinx.coroutines.flow.H<Set<r>> c4;
        Set<r> value;
        Boolean valueOf;
        AtomicInteger atomicInteger;
        List X42;
        Y5 = kotlin.collections.D.Y5(C());
        if (!Y5.isEmpty()) {
            p32 = kotlin.collections.D.p3(Y5);
            F g4 = ((r) p32).g();
            if (g4 instanceof InterfaceC0931h) {
                X42 = kotlin.collections.D.X4(Y5);
                Iterator it = X42.iterator();
                while (it.hasNext()) {
                    f4 = ((r) it.next()).g();
                    if (!(f4 instanceof J) && !(f4 instanceof InterfaceC0931h)) {
                        break;
                    }
                }
            }
            f4 = null;
            HashMap hashMap = new HashMap();
            X4 = kotlin.collections.D.X4(Y5);
            for (r rVar : X4) {
                Lifecycle.State i4 = rVar.i();
                F g5 = rVar.g();
                if (g4 != null && g5.t() == g4.t()) {
                    Lifecycle.State state = Lifecycle.State.RESUMED;
                    if (i4 != state) {
                        b bVar = this.f16591x.get(N().f(rVar.g().v()));
                        if (bVar == null || (c4 = bVar.c()) == null || (value = c4.getValue()) == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(value.contains(rVar));
                        }
                        if (!kotlin.jvm.internal.F.g(valueOf, Boolean.TRUE) && ((atomicInteger = this.f16579l.get(rVar)) == null || atomicInteger.get() != 0)) {
                            hashMap.put(rVar, state);
                        } else {
                            hashMap.put(rVar, Lifecycle.State.STARTED);
                        }
                    }
                    g4 = g4.w();
                } else if (f4 != null && g5.t() == f4.t()) {
                    if (i4 == Lifecycle.State.RESUMED) {
                        rVar.o(Lifecycle.State.STARTED);
                    } else {
                        Lifecycle.State state2 = Lifecycle.State.STARTED;
                        if (i4 != state2) {
                            hashMap.put(rVar, state2);
                        }
                    }
                    f4 = f4.w();
                } else {
                    rVar.o(Lifecycle.State.CREATED);
                }
            }
            for (r rVar2 : Y5) {
                Lifecycle.State state3 = (Lifecycle.State) hashMap.get(rVar2);
                if (state3 != null) {
                    rVar2.o(state3);
                } else {
                    rVar2.p();
                }
            }
        }
    }

    @androidx.annotation.K
    public void Y(@androidx.annotation.D int i4, @l3.e Bundle bundle, @l3.e T t3) {
        Z(i4, bundle, t3, null);
    }

    @androidx.annotation.K
    public void Z(@androidx.annotation.D int i4, @l3.e Bundle bundle, @l3.e T t3, @l3.e c0.a aVar) {
        F g4;
        int i5;
        if (C().isEmpty()) {
            g4 = this.f16571d;
        } else {
            g4 = C().t().g();
        }
        if (g4 != null) {
            C0934k o4 = g4.o(i4);
            Bundle bundle2 = null;
            if (o4 != null) {
                if (t3 == null) {
                    t3 = o4.c();
                }
                i5 = o4.b();
                Bundle a4 = o4.a();
                if (a4 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(a4);
                }
            } else {
                i5 = i4;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i5 == 0 && t3 != null && t3.f() != -1) {
                u0(t3.f(), t3.h());
                return;
            }
            if (i5 != 0) {
                F y3 = y(i5);
                if (y3 == null) {
                    F.b bVar = F.f16277N;
                    String b4 = bVar.b(this.f16568a, i5);
                    if (o4 == null) {
                        throw new IllegalArgumentException("Navigation action/destination " + b4 + " cannot be found from the current destination " + g4);
                    }
                    throw new IllegalArgumentException(("Navigation destination " + b4 + " referenced from action " + bVar.b(F(), i4) + " cannot be found from the current destination " + g4).toString());
                }
                g0(y3, bundle2, t3, aVar);
                return;
            }
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        throw new IllegalStateException("no current navigation node");
    }

    @androidx.annotation.K
    public void a0(@l3.d Uri deepLink) {
        kotlin.jvm.internal.F.p(deepLink, "deepLink");
        d0(new D(deepLink, null, null));
    }

    @androidx.annotation.K
    public void b0(@l3.d Uri deepLink, @l3.e T t3) {
        kotlin.jvm.internal.F.p(deepLink, "deepLink");
        f0(new D(deepLink, null, null), t3, null);
    }

    @androidx.annotation.K
    public void c0(@l3.d Uri deepLink, @l3.e T t3, @l3.e c0.a aVar) {
        kotlin.jvm.internal.F.p(deepLink, "deepLink");
        f0(new D(deepLink, null, null), t3, aVar);
    }

    @androidx.annotation.K
    public void d0(@l3.d D request) {
        kotlin.jvm.internal.F.p(request, "request");
        e0(request, null);
    }

    @androidx.annotation.K
    public void e0(@l3.d D request, @l3.e T t3) {
        kotlin.jvm.internal.F.p(request, "request");
        f0(request, t3, null);
    }

    @androidx.annotation.K
    public void f0(@l3.d D request, @l3.e T t3, @l3.e c0.a aVar) {
        kotlin.jvm.internal.F.p(request, "request");
        J j4 = this.f16571d;
        kotlin.jvm.internal.F.m(j4);
        F.c A3 = j4.A(request);
        if (A3 != null) {
            Bundle k4 = A3.e().k(A3.f());
            if (k4 == null) {
                k4 = new Bundle();
            }
            F e4 = A3.e();
            Intent intent = new Intent();
            intent.setDataAndType(request.c(), request.b());
            intent.setAction(request.a());
            k4.putParcelable(f16560T, intent);
            g0(e4, k4, t3, aVar);
            return;
        }
        throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this.f16571d);
    }

    @androidx.annotation.K
    public void h0(@l3.d I directions) {
        kotlin.jvm.internal.F.p(directions, "directions");
        Y(directions.i(), directions.h(), null);
    }

    @androidx.annotation.K
    public void i0(@l3.d I directions, @l3.e T t3) {
        kotlin.jvm.internal.F.p(directions, "directions");
        Y(directions.i(), directions.h(), t3);
    }

    @androidx.annotation.K
    public void j0(@l3.d I directions, @l3.d c0.a navigatorExtras) {
        kotlin.jvm.internal.F.p(directions, "directions");
        kotlin.jvm.internal.F.p(navigatorExtras, "navigatorExtras");
        Z(directions.i(), directions.h(), null, navigatorExtras);
    }

    @W2.j
    public final void k0(@l3.d String route) {
        kotlin.jvm.internal.F.p(route, "route");
        o0(this, route, null, null, 6, null);
    }

    public final void l0(@l3.d String route, @l3.d X2.l<? super U, H0> builder) {
        kotlin.jvm.internal.F.p(route, "route");
        kotlin.jvm.internal.F.p(builder, "builder");
        o0(this, route, V.a(builder), null, 4, null);
    }

    @W2.j
    public final void m0(@l3.d String route, @l3.e T t3) {
        kotlin.jvm.internal.F.p(route, "route");
        o0(this, route, t3, null, 4, null);
    }

    @W2.j
    public final void n0(@l3.d String route, @l3.e T t3, @l3.e c0.a aVar) {
        kotlin.jvm.internal.F.p(route, "route");
        D.a.C0154a c0154a = D.a.f16273d;
        Uri parse = Uri.parse(F.f16277N.a(route));
        kotlin.jvm.internal.F.h(parse, "Uri.parse(this)");
        f0(c0154a.c(parse).a(), t3, aVar);
    }

    public void q(@l3.d c listener) {
        kotlin.jvm.internal.F.p(listener, "listener");
        this.f16585r.add(listener);
        if (!C().isEmpty()) {
            r t3 = C().t();
            listener.a(this, t3.g(), t3.e());
        }
    }

    @androidx.annotation.K
    public final boolean r(@androidx.annotation.D int i4) {
        if (t(i4) && v()) {
            return true;
        }
        return false;
    }

    @androidx.annotation.K
    public boolean r0() {
        Intent intent;
        Bundle extras;
        if (J() == 1) {
            Activity activity = this.f16569b;
            int[] iArr = null;
            if (activity == null || (intent = activity.getIntent()) == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            if (extras != null) {
                iArr = extras.getIntArray(f16556P);
            }
            if (iArr != null) {
                return U0();
            }
            return V0();
        }
        return t0();
    }

    @androidx.annotation.K
    public final boolean s(@l3.d String route) {
        kotlin.jvm.internal.F.p(route, "route");
        return r(F.f16277N.a(route).hashCode());
    }

    @androidx.annotation.K
    public boolean t0() {
        if (C().isEmpty()) {
            return false;
        }
        F I3 = I();
        kotlin.jvm.internal.F.m(I3);
        return u0(I3.t(), true);
    }

    @l3.d
    public C0948z u() {
        return new C0948z(this);
    }

    @androidx.annotation.K
    public boolean u0(@androidx.annotation.D int i4, boolean z3) {
        return v0(i4, z3, false);
    }

    @androidx.annotation.K
    public boolean v0(@androidx.annotation.D int i4, boolean z3, boolean z4) {
        if (B0(i4, z3, z4) && v()) {
            return true;
        }
        return false;
    }

    @W2.j
    @androidx.annotation.K
    public final boolean w0(@l3.d String route, boolean z3) {
        kotlin.jvm.internal.F.p(route, "route");
        return y0(this, route, z3, false, 4, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void x(boolean z3) {
        this.f16589v = z3;
        Y0();
    }

    @W2.j
    @androidx.annotation.K
    public final boolean x0(@l3.d String route, boolean z3, boolean z4) {
        kotlin.jvm.internal.F.p(route, "route");
        return v0(F.f16277N.a(route).hashCode(), z3, z4);
    }

    @l3.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final F y(@androidx.annotation.D int i4) {
        J j4 = this.f16571d;
        F f4 = null;
        if (j4 == null) {
            return null;
        }
        kotlin.jvm.internal.F.m(j4);
        if (j4.t() == i4) {
            return this.f16571d;
        }
        r u3 = C().u();
        if (u3 != null) {
            f4 = u3.g();
        }
        if (f4 == null) {
            f4 = this.f16571d;
            kotlin.jvm.internal.F.m(f4);
        }
        return z(f4, i4);
    }

    public final void z0(@l3.d r popUpTo, @l3.d X2.a<H0> onComplete) {
        kotlin.jvm.internal.F.p(popUpTo, "popUpTo");
        kotlin.jvm.internal.F.p(onComplete, "onComplete");
        int indexOf = C().indexOf(popUpTo);
        if (indexOf < 0) {
            Log.i(f16548H, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i4 = indexOf + 1;
        if (i4 != C().size()) {
            B0(C().get(i4).g().t(), true, false);
        }
        F0(this, popUpTo, false, null, 6, null);
        onComplete.n();
        Y0();
        v();
    }
}
