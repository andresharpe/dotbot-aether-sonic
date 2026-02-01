package com.harman.jbl.partybox.ui.welcome;

import X2.l;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.os.C0741d;
import androidx.core.view.C0823k0;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.I;
import com.harman.jbl.partybox.databinding.AbstractC1942u1;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.MainActivityNav;
import com.harman.jbl.partybox.utils.q;
import com.harman.log.f;
import kotlin.A;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;
import l3.d;
import l3.e;

@E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0004R#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/harman/jbl/partybox/ui/welcome/WelcomeFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlin/H0;", "m0", "()V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "getStartedButtonClick", "Lcom/harman/jbl/partybox/databinding/u1;", "kotlin.jvm.PlatformType", "N0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "k0", "()Lcom/harman/jbl/partybox/databinding/u1;", "binding", "Lcom/harman/jbl/partybox/ui/welcome/b;", "O0", "Lkotlin/A;", "l0", "()Lcom/harman/jbl/partybox/ui/welcome/b;", "viewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nWelcomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeFragment.kt\ncom/harman/jbl/partybox/ui/welcome/WelcomeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,78:1\n56#2,10:79\n*S KotlinDebug\n*F\n+ 1 WelcomeFragment.kt\ncom/harman/jbl/partybox/ui/welcome/WelcomeFragment\n*L\n23#1:79,10\n*E\n"})
/* loaded from: classes2.dex */
public final class WelcomeFragment extends Fragment {

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private static final String f45697Q0 = "showAgreement";

    @l3.d
    public static final String TAG = "WelcomeFragment";

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f45698N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final A f45699O0;

    /* renamed from: P0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f45696P0 = {N.u(new PropertyReference1Impl(WelcomeFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentWelcomeBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final WelcomeFragment a(boolean z3) {
            WelcomeFragment welcomeFragment = new WelcomeFragment();
            welcomeFragment.setArguments(C0741d.b(C2122h0.a(WelcomeFragment.f45697Q0, Boolean.valueOf(z3))));
            return welcomeFragment;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, AbstractC1942u1> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f45704N = new b();

        b() {
            super(1, AbstractC1942u1.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentWelcomeBinding;", 0);
        }

        @Override // X2.l
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final AbstractC1942u1 C(@l3.d View p02) {
            F.p(p02, "p0");
            return AbstractC1942u1.o1(p02);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements l<UiPage, H0> {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f45706a;

            static {
                int[] iArr = new int[UiPage.values().length];
                try {
                    iArr[UiPage.DISCOVERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f45706a = iArr;
            }
        }

        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(UiPage uiPage) {
            c(uiPage);
            return H0.f51801a;
        }

        public final void c(UiPage uiPage) {
            if (uiPage != null && a.f45706a[uiPage.ordinal()] == 1) {
                WelcomeFragment.this.m0();
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class d implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f45707a;

        d(l function) {
            F.p(function, "function");
            this.f45707a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45707a;
        }

        public final boolean equals(@e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45707a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public WelcomeFragment() {
        super(j.i.f41480c1);
        this.f45698N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f45704N);
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.welcome.WelcomeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f45699O0 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.welcome.b.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.welcome.WelcomeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.welcome.WelcomeFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                InterfaceC0919v interfaceC0919v;
                Object n4 = X2.a.this.n();
                m0.b bVar = null;
                if (n4 instanceof InterfaceC0919v) {
                    interfaceC0919v = (InterfaceC0919v) n4;
                } else {
                    interfaceC0919v = null;
                }
                if (interfaceC0919v != null) {
                    bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
                }
                if (bVar == null) {
                    bVar = this.getDefaultViewModelProviderFactory();
                }
                F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
    }

    private final AbstractC1942u1 k0() {
        return (AbstractC1942u1) this.f45698N0.a(this, f45696P0[0]);
    }

    private final com.harman.jbl.partybox.ui.welcome.b l0() {
        return (com.harman.jbl.partybox.ui.welcome.b) this.f45699O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        startActivity(new Intent(getActivity(), (Class<?>) MainActivityNav.class));
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @W2.n
    @l3.d
    public static final WelcomeFragment newInstance(boolean z3) {
        return Companion.a(z3);
    }

    public final void getStartedButtonClick() {
        I a4 = com.harman.jbl.partybox.ui.welcome.a.a();
        F.o(a4, "actionWelcomeFragmentToAgreementFragment(...)");
        q.f(this, a4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @e Bundle bundle) {
        Object obj;
        F.p(view, "view");
        T1.a.a("BLE_LOG WelcomeFragment onViewCreated ");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Window window = null;
        boolean z3 = false;
        if (arguments != null && arguments.containsKey(f45697Q0)) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                obj = arguments2.get(f45697Q0);
            } else {
                obj = null;
            }
            F.n(obj, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) obj).intValue() == 1) {
                z3 = true;
            }
            f.a(TAG, "BLE_LOG WelcomeFragment shouldShowAgreement is " + z3);
        }
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            window = activity.getWindow();
        }
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (window != null) {
            window.setStatusBarColor(C0823k0.f13589t);
        }
        l0().u().k(getViewLifecycleOwner(), new d(new c()));
        k0().v1(this);
        if (z3) {
            f.a(TAG, "BLE_LOG WelcomeFragment Show agreement screen directly");
            I a4 = com.harman.jbl.partybox.ui.welcome.a.a();
            F.o(a4, "actionWelcomeFragmentToAgreementFragment(...)");
            q.f(this, a4);
        }
    }
}
