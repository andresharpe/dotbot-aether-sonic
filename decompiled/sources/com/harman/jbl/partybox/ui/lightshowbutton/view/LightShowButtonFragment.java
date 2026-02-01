package com.harman.jbl.partybox.ui.lightshowbutton.view;

import X2.l;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.D0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.lightshowbutton.c;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.widget.r;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.LightPattern;
import e2.C2049a;
import f2.C2054a;
import g2.C2058a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.collections.C2109w;
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

@E(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 B2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\bA\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J!\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020>0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010<¨\u0006D"}, d2 = {"Lcom/harman/jbl/partybox/ui/lightshowbutton/view/LightShowButtonFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "x0", "u0", "z0", "B0", "y0", "A0", "C0", "D0", "Lf2/a;", "selectedButton", "", "v0", "(Lf2/a;)Z", "Lcom/harman/sdk/utils/LightPattern;", "patternID", "enabled", "G0", "(Lcom/harman/sdk/utils/LightPattern;Z)V", "H0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "isVisibleLightShowButtonInfo", "()Z", "Lcom/harman/jbl/partybox/databinding/D0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "r0", "()Lcom/harman/jbl/partybox/databinding/D0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "s0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lg2/a;", "S0", "t0", "()Lg2/a;", "viewModel", "Lcom/harman/jbl/partybox/ui/lightshowbutton/c;", "T0", "Lcom/harman/jbl/partybox/ui/lightshowbutton/c;", "lightShowButtonAdapter", "Lcom/harman/jbl/partybox/ui/lightshowbutton/a;", "U0", "Lcom/harman/jbl/partybox/ui/lightshowbutton/a;", "activePatternAdapter", "", "V0", "Ljava/util/List;", "lightShowButtonList", "", "W0", "activePatternList", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nLightShowButtonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightShowButtonFragment.kt\ncom/harman/jbl/partybox/ui/lightshowbutton/view/LightShowButtonFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n66#2,4:240\n56#3,10:244\n1#4:254\n766#5:255\n857#5,2:256\n1549#5:258\n1620#5,3:259\n766#5:262\n857#5,2:263\n*S KotlinDebug\n*F\n+ 1 LightShowButtonFragment.kt\ncom/harman/jbl/partybox/ui/lightshowbutton/view/LightShowButtonFragment\n*L\n32#1:240,4\n33#1:244,10\n157#1:255\n157#1:256,2\n159#1:258\n159#1:259,3\n205#1:262\n205#1:263,2\n*E\n"})
/* loaded from: classes2.dex */
public final class LightShowButtonFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "LightShowButtonFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f44052Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f44053R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final A f44054S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.lightshowbutton.c f44055T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.lightshowbutton.a f44056U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private List<C2054a> f44057V0;

    /* renamed from: W0, reason: collision with root package name */
    @l3.d
    private List<Integer> f44058W0;

    /* renamed from: X0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f44051X0 = {N.u(new PropertyReference1Impl(LightShowButtonFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentLightShowButtonBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final LightShowButtonFragment a() {
            return new LightShowButtonFragment();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, D0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f44063N = new b();

        b() {
            super(1, D0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentLightShowButtonBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final D0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return D0.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements l<List<? extends C2054a>, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends C2054a> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<C2054a> list) {
            f.a(LightShowButtonFragment.TAG, "LightShowButtonFragment initObserver lightShowButtonList update:" + list);
            LightShowButtonFragment.this.f44057V0.clear();
            List list2 = LightShowButtonFragment.this.f44057V0;
            F.m(list);
            list2.addAll(list);
            LightShowButtonFragment.this.B0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f44065a;

        d(l function) {
            F.p(function, "function");
            this.f44065a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f44065a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f44065a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @U({"SMAP\nLightShowButtonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightShowButtonFragment.kt\ncom/harman/jbl/partybox/ui/lightshowbutton/view/LightShowButtonFragment$setupLightShowButtonView$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n1549#2:240\n1620#2,3:241\n*S KotlinDebug\n*F\n+ 1 LightShowButtonFragment.kt\ncom/harman/jbl/partybox/ui/lightshowbutton/view/LightShowButtonFragment$setupLightShowButtonView$1\n*L\n116#1:240\n116#1:241,3\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements l<C2054a, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(C2054a c2054a) {
            c(c2054a);
            return H0.f51801a;
        }

        public final void c(@l3.d C2054a selectedButton) {
            int b02;
            F.p(selectedButton, "selectedButton");
            if (LightShowButtonFragment.this.v0(selectedButton)) {
                LightShowButtonFragment.this.C0();
                return;
            }
            List<C2054a> list = LightShowButtonFragment.this.f44057V0;
            LightShowButtonFragment lightShowButtonFragment = LightShowButtonFragment.this;
            b02 = C2109w.b0(list, 10);
            ArrayList arrayList = new ArrayList(b02);
            for (C2054a c2054a : list) {
                if (F.g(c2054a, selectedButton)) {
                    if (selectedButton.g()) {
                        lightShowButtonFragment.G0(selectedButton.h(), false);
                        c2054a = C2054a.f(c2054a, null, 0, 0, false, 7, null);
                    } else {
                        lightShowButtonFragment.G0(selectedButton.h(), true);
                        c2054a = C2054a.f(c2054a, null, 0, 0, true, 7, null);
                    }
                }
                arrayList.add(c2054a);
            }
            com.harman.jbl.partybox.ui.lightshowbutton.c cVar = LightShowButtonFragment.this.f44055T0;
            if (cVar != null) {
                cVar.S(new ArrayList(arrayList));
            }
            LightShowButtonFragment.this.f44057V0.clear();
            LightShowButtonFragment.this.f44057V0.addAll(arrayList);
            LightShowButtonFragment.this.D0();
        }
    }

    public LightShowButtonFragment() {
        super(j.i.f41539r0);
        this.f44052Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f44063N);
        this.f44053R0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.lightshowbutton.view.LightShowButtonFragment$special$$inlined$viewModels$default$1
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
        this.f44054S0 = FragmentViewModelLazyKt.c(this, N.d(C2058a.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.lightshowbutton.view.LightShowButtonFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.lightshowbutton.view.LightShowButtonFragment$special$$inlined$viewModels$default$3
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
        this.f44057V0 = new ArrayList();
        this.f44058W0 = new ArrayList();
    }

    private final void A0() {
        com.harman.jbl.partybox.ui.lightshowbutton.a aVar = new com.harman.jbl.partybox.ui.lightshowbutton.a();
        this.f44056U0 = aVar;
        aVar.R(new ArrayList(this.f44058W0));
        D0 r02 = r0();
        r02.f38538G.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        r02.f38538G.setAdapter(this.f44056U0);
        r02.f38538G.setItemAnimator(null);
        RecyclerView recyclerView = r02.f38538G;
        Context requireContext = requireContext();
        F.o(requireContext, "requireContext(...)");
        int i4 = j.f.f40964O2;
        int i5 = j.e.f40874k0;
        recyclerView.n(new C2049a(requireContext, i4, 0, 0, i5, i5));
        com.harman.jbl.partybox.ui.lightshowbutton.a aVar2 = this.f44056U0;
        if (aVar2 != null) {
            aVar2.R(new ArrayList(this.f44058W0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0() {
        this.f44055T0 = new com.harman.jbl.partybox.ui.lightshowbutton.c(new c.C0387c(new e()));
        D0 r02 = r0();
        r02.f38542K.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        r02.f38542K.setAdapter(this.f44055T0);
        r02.f38542K.setItemAnimator(null);
        if (r02.f38542K.getItemDecorationCount() == 0) {
            r02.f38542K.n(new e2.b((int) getResources().getDimension(j.e.f40903z)));
        }
        D0();
        com.harman.jbl.partybox.ui.lightshowbutton.c cVar = this.f44055T0;
        if (cVar != null) {
            cVar.S(new ArrayList(this.f44057V0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0() {
        String string;
        r.a aVar = r.f46149K;
        ConstraintLayout d4 = r0().d();
        F.o(d4, "getRoot(...)");
        if (isVisibleLightShowButtonInfo()) {
            string = getString(j.m.r6);
        } else {
            string = getString(j.m.s6);
        }
        F.m(string);
        aVar.b(d4, string).g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0() {
        y0();
        com.harman.jbl.partybox.ui.lightshowbutton.a aVar = this.f44056U0;
        if (aVar != null) {
            aVar.S(new ArrayList(this.f44058W0), new Runnable() { // from class: com.harman.jbl.partybox.ui.lightshowbutton.view.b
                @Override // java.lang.Runnable
                public final void run() {
                    LightShowButtonFragment.E0(LightShowButtonFragment.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(final LightShowButtonFragment this$0) {
        F.p(this$0, "this$0");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.harman.jbl.partybox.ui.lightshowbutton.view.a
            @Override // java.lang.Runnable
            public final void run() {
                LightShowButtonFragment.F0(LightShowButtonFragment.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(LightShowButtonFragment this$0) {
        F.p(this$0, "this$0");
        this$0.r0().f38538G.K0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0(LightPattern lightPattern, boolean z3) {
        t0().z(s0().k1(), lightPattern, z3);
    }

    private final void H0() {
        if (isVisibleLightShowButtonInfo()) {
            r0().f38541J.setText(j.m.b8);
            r0().f38540I.setText(j.m.m9);
        }
    }

    @W2.n
    @l3.d
    public static final LightShowButtonFragment newInstance() {
        return Companion.a();
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    private final D0 r0() {
        return (D0) this.f44052Q0.a(this, f44051X0[0]);
    }

    private final o s0() {
        return (o) this.f44053R0.getValue();
    }

    private final C2058a t0() {
        return (C2058a) this.f44054S0.getValue();
    }

    private final void u0() {
        t0().w().k(getViewLifecycleOwner(), new d(new c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v0(C2054a c2054a) {
        Object h5;
        List<C2054a> list = this.f44057V0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C2054a) obj).g()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            h5 = D.h5(arrayList);
            if (((C2054a) h5).h() == c2054a.h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(LightShowButtonFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    private final void x0() {
        HmDevice k12 = s0().k1();
        if (k12 != null) {
            t0().x(k12);
        }
    }

    private final void y0() {
        int b02;
        List<Integer> Y5;
        f.a(TAG, "BLE_LOG setActivePatternData size : " + this.f44057V0.size());
        List<C2054a> list = this.f44057V0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C2054a) obj).g()) {
                arrayList.add(obj);
            }
        }
        b02 = C2109w.b0(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((C2054a) it.next()).j()));
        }
        Y5 = D.Y5(arrayList2);
        this.f44058W0 = Y5;
        com.harman.jbl.partybox.ui.lightshowbutton.a aVar = this.f44056U0;
        if (aVar != null) {
            aVar.r();
        }
    }

    private final void z0() {
        t0().y(s0().k1());
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    public final boolean isVisibleLightShowButtonInfo() {
        HmDevice k12 = s0().k1();
        if (k12 != null) {
            return com.harman.sdk.utils.d.m0(k12.q());
        }
        return false;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        u0();
        z0();
        y0();
        A0();
        r0().f38539H.f38611G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.lightshowbutton.view.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LightShowButtonFragment.w0(LightShowButtonFragment.this, view2);
            }
        });
        r0().f38539H.f38613I.setText(getString(j.m.f41812r1));
        H0();
    }
}
