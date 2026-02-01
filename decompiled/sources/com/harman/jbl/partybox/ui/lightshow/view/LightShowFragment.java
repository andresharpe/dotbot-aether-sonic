package com.harman.jbl.partybox.ui.lightshow.view;

import X2.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c2.C1008a;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.E0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.freestyle.FreeStyleFragment;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.widget.p;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.LightElements;
import com.harman.sdk.utils.LightPattern;
import d2.C2045a;
import java.util.List;
import java.util.Map;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;
import l3.d;

@E(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0006\u0010\u0004J!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/harman/jbl/partybox/ui/lightshow/view/LightShowFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlin/H0;", "r0", "()V", "q0", "o0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "Lcom/harman/jbl/partybox/databinding/E0;", "N0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "l0", "()Lcom/harman/jbl/partybox/databinding/E0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "O0", "Lkotlin/A;", "m0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Ld2/a;", "P0", "n0", "()Ld2/a;", "viewModel", "Lcom/harman/jbl/partybox/ui/lightshow/b;", "Q0", "Lcom/harman/jbl/partybox/ui/lightshow/b;", "lightShowAdapter", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nLightShowFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightShowFragment.kt\ncom/harman/jbl/partybox/ui/lightshow/view/LightShowFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,124:1\n66#2,4:125\n56#3,10:129\n*S KotlinDebug\n*F\n+ 1 LightShowFragment.kt\ncom/harman/jbl/partybox/ui/lightshow/view/LightShowFragment\n*L\n26#1:125,4\n27#1:129,10\n*E\n"})
/* loaded from: classes2.dex */
public final class LightShowFragment extends Fragment {

    @l3.d
    public static final String TAG = "LightShowFragment";

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f44021N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final A f44022O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final A f44023P0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.lightshow.b f44024Q0;

    /* renamed from: R0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f44020R0 = {N.u(new PropertyReference1Impl(LightShowFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentLightshowBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, E0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f44029N = new b();

        b() {
            super(1, E0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentLightshowBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final E0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return E0.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements l<Map<LightElements, Boolean>, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Map<LightElements, Boolean> map) {
            c(map);
            return H0.f51801a;
        }

        public final void c(Map<LightElements, Boolean> map) {
            if (LightShowFragment.this.isAdded()) {
                LightShowFragment.this.n0().y(LightShowFragment.this.m0().k1());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements l<Boolean, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            if (LightShowFragment.this.isAdded()) {
                E0 l02 = LightShowFragment.this.l0();
                LightShowFragment lightShowFragment = LightShowFragment.this;
                F.m(bool);
                if (bool.booleanValue()) {
                    lightShowFragment.n0().K(false);
                    l02.f38567F.setVisibility(8);
                    l02.f38570I.setAlpha(1.0f);
                    l02.f38568G.setClickable(true);
                    l02.f38568G.setAlpha(1.0f);
                } else {
                    lightShowFragment.n0().K(true);
                    l02.f38567F.setVisibility(0);
                    l02.f38567F.setText(j.m.R9);
                    l02.f38570I.setAlpha(0.3f);
                    l02.f38568G.setClickable(false);
                    l02.f38568G.setAlpha(0.3f);
                    lightShowFragment.n0().G(lightShowFragment.m0().k1());
                }
                lightShowFragment.n0().y(lightShowFragment.m0().k1());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements l<List<? extends C1008a>, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends C1008a> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<C1008a> list) {
            com.harman.jbl.partybox.ui.lightshow.b bVar;
            List Y5;
            if (LightShowFragment.this.isAdded() && (bVar = LightShowFragment.this.f44024Q0) != null) {
                F.m(list);
                Y5 = D.Y5(list);
                bVar.R(Y5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements l<Boolean, H0> {
        f() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            com.harman.jbl.partybox.ui.lightshow.b bVar;
            if (LightShowFragment.this.isAdded()) {
                F.m(bool);
                if (bool.booleanValue() && (bVar = LightShowFragment.this.f44024Q0) != null) {
                    bVar.Y();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends RecyclerView.A {
        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.A, androidx.recyclerview.widget.RecyclerView.s
        public boolean c(@l3.d RecyclerView rv, @l3.d MotionEvent e4) {
            F.p(rv, "rv");
            F.p(e4, "e");
            return LightShowFragment.this.n0().A();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class h implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f44035a;

        h(l function) {
            F.p(function, "function");
            this.f44035a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f44035a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f44035a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class i extends Lambda implements l<C1008a, H0> {
        i() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(C1008a c1008a) {
            c(c1008a);
            return H0.f51801a;
        }

        public final void c(@l3.d C1008a selectedLightShowCard) {
            F.p(selectedLightShowCard, "selectedLightShowCard");
            boolean z3 = true;
            o.f44128m1.h(true);
            LightShowFragment.this.n0().C(selectedLightShowCard, LightShowFragment.this.m0().k1());
            o m02 = LightShowFragment.this.m0();
            if (selectedLightShowCard.j() != LightPattern.CUSTOM) {
                z3 = false;
            }
            m02.Q2(z3);
        }
    }

    public LightShowFragment() {
        super(j.i.f41543s0);
        this.f44021N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f44029N);
        this.f44022O0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.lightshow.view.LightShowFragment$special$$inlined$viewModels$default$1
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
        this.f44023P0 = FragmentViewModelLazyKt.c(this, N.d(C2045a.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.lightshow.view.LightShowFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.lightshow.view.LightShowFragment$special$$inlined$viewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final E0 l0() {
        return (E0) this.f44021N0.a(this, f44020R0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o m0() {
        return (o) this.f44022O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2045a n0() {
        return (C2045a) this.f44023P0.getValue();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void o0() {
        m0().j1().k(getViewLifecycleOwner(), new h(new c()));
        m0().X1().k(getViewLifecycleOwner(), new h(new d()));
        n0().x().k(getViewLifecycleOwner(), new h(new e()));
        n0().w().k(getViewLifecycleOwner(), new h(new f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(LightShowFragment this$0, View view) {
        F.p(this$0, "this$0");
        new FreeStyleFragment().show(this$0.getChildFragmentManager(), FreeStyleFragment.TAG);
    }

    private final void q0() {
        String str;
        HmDevice k12 = m0().k1();
        if (k12 != null) {
            str = k12.q();
        } else {
            str = null;
        }
        this.f44024Q0 = new com.harman.jbl.partybox.ui.lightshow.b(str, new i());
    }

    private final void r0() {
        E0 l02 = l0();
        l02.f38569H.setText(getString(j.m.z7));
        l02.f38571J.setText(getString(j.m.Y7));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f44024Q0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        r0();
        q0();
        E0 l02 = l0();
        l02.f38568G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.lightshow.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LightShowFragment.p0(LightShowFragment.this, view2);
            }
        });
        RecyclerView recyclerView = l02.f38570I;
        recyclerView.setAdapter(this.f44024Q0);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.q(new g());
        recyclerView.setItemAnimator(null);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.n(new p((int) recyclerView.getResources().getDimension(j.e.f40903z), (int) recyclerView.getResources().getDimension(j.e.f40903z), (int) recyclerView.getResources().getDimension(j.e.f40885q)));
        }
        o0();
        n0().y(m0().k1());
    }
}
