package com.harman.jbl.partybox.ui.buttonsettings;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.navigation.I;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.W;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.buttonsettings.ButtonSettingsFragment;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.widget.ButtonSettingsCard;
import com.harman.jbl.partybox.utils.q;
import com.harman.sdk.device.HmDevice;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.A;
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

@E(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J!\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'¨\u0006."}, d2 = {"Lcom/harman/jbl/partybox/ui/buttonsettings/ButtonSettingsFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "y0", "()V", "onBtnBackClick", "z0", "A0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/ui/main/o;", "Q0", "Lkotlin/A;", "s0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/databinding/W;", "R0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "r0", "()Lcom/harman/jbl/partybox/databinding/W;", "binding", "Lcom/harman/jbl/partybox/ui/djeffects/viewmodel/a;", "S0", "u0", "()Lcom/harman/jbl/partybox/ui/djeffects/viewmodel/a;", "viewModel", "Lcom/harman/jbl/partybox/ui/partybutton/h;", "T0", "t0", "()Lcom/harman/jbl/partybox/ui/partybutton/h;", "partyButtonViewModel", "", "U0", "Ljava/lang/String;", "devicePid", "V0", "deviceMid", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nButtonSettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonSettingsFragment.kt\ncom/harman/jbl/partybox/ui/buttonsettings/ButtonSettingsFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n66#2,4:151\n84#3,6:155\n84#3,6:161\n1#4:167\n*S KotlinDebug\n*F\n+ 1 ButtonSettingsFragment.kt\ncom/harman/jbl/partybox/ui/buttonsettings/ButtonSettingsFragment\n*L\n22#1:151,4\n25#1:155,6\n26#1:161,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ButtonSettingsFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "ButtonSettingsFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final A f42226Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f42227R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final A f42228S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private final A f42229T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.e
    private String f42230U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.e
    private String f42231V0;

    /* renamed from: W0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f42225W0 = {N.u(new PropertyReference1Impl(ButtonSettingsFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentButtonSettingsBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final ButtonSettingsFragment a() {
            return new ButtonSettingsFragment();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, W> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f42236N = new b();

        b() {
            super(1, W.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentButtonSettingsBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final W C(@l3.d View p02) {
            F.p(p02, "p0");
            return W.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f42237a;

        c(X2.l function) {
            F.p(function, "function");
            this.f42237a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f42237a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f42237a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements X2.l<List<? extends Integer>, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends Integer> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<Integer> list) {
            com.harman.log.f.a(ButtonSettingsFragment.TAG, "initObserver activePatterns observer cards = " + list);
            ButtonSettingsCard buttonSettingsCard = ButtonSettingsFragment.this.r0().f39166H;
            F.m(list);
            buttonSettingsCard.setContent(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.l<List<? extends Integer>, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends Integer> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<Integer> list) {
            ButtonSettingsCard buttonSettingsCard = ButtonSettingsFragment.this.r0().f39164F;
            F.m(list);
            buttonSettingsCard.setContent(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements X2.l<List<? extends com.harman.jbl.partybox.model.c>, H0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements X2.l<com.harman.jbl.partybox.model.c, Integer> {

            /* renamed from: F, reason: collision with root package name */
            public static final a f42241F = new a();

            a() {
                super(1);
            }

            @Override // X2.l
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Integer C(com.harman.jbl.partybox.model.c cVar) {
                return Integer.valueOf(cVar.j());
            }
        }

        f() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Integer e(X2.l tmp0, Object obj) {
            F.p(tmp0, "$tmp0");
            return (Integer) tmp0.C(obj);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends com.harman.jbl.partybox.model.c> list) {
            d(list);
            return H0.f51801a;
        }

        public final void d(List<com.harman.jbl.partybox.model.c> list) {
            Stream<com.harman.jbl.partybox.model.c> stream = list.stream();
            final a aVar = a.f42241F;
            List<Integer> list2 = (List) stream.map(new Function() { // from class: com.harman.jbl.partybox.ui.buttonsettings.d
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Integer e4;
                    e4 = ButtonSettingsFragment.f.e(X2.l.this, obj);
                    return e4;
                }
            }).collect(Collectors.toList());
            ButtonSettingsCard buttonSettingsCard = ButtonSettingsFragment.this.r0().f39164F;
            F.m(list2);
            buttonSettingsCard.setContent(list2);
        }
    }

    public ButtonSettingsFragment() {
        super(j.i.f41418N);
        this.f42226Q0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f42227R0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f42236N);
        this.f42228S0 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.djeffects.viewmodel.a.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.buttonsettings.ButtonSettingsFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                F.o(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.buttonsettings.ButtonSettingsFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                m0.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                F.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.f42229T0 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.partybutton.h.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.buttonsettings.ButtonSettingsFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                F.o(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.buttonsettings.ButtonSettingsFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                m0.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                F.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.f42230U0 = "";
    }

    private final void A0() {
        u0().b0().k(getViewLifecycleOwner(), new c(new e()));
        t0().c0().k(getViewLifecycleOwner(), new c(new f()));
    }

    @W2.n
    @l3.d
    public static final ButtonSettingsFragment newInstance() {
        return Companion.a();
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W r0() {
        return (W) this.f42227R0.a(this, f42225W0[0]);
    }

    private final o s0() {
        return (o) this.f42226Q0.getValue();
    }

    private final com.harman.jbl.partybox.ui.partybutton.h t0() {
        return (com.harman.jbl.partybox.ui.partybutton.h) this.f42229T0.getValue();
    }

    private final com.harman.jbl.partybox.ui.djeffects.viewmodel.a u0() {
        return (com.harman.jbl.partybox.ui.djeffects.viewmodel.a) this.f42228S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(ButtonSettingsFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(ButtonSettingsFragment this$0, View view) {
        F.p(this$0, "this$0");
        if (com.harman.sdk.utils.d.H(this$0.f42230U0)) {
            I c4 = com.harman.jbl.partybox.ui.buttonsettings.e.c();
            F.o(c4, "actionToPartyButtonFragment(...)");
            q.f(this$0, c4);
        } else {
            I a4 = com.harman.jbl.partybox.ui.buttonsettings.e.a();
            F.o(a4, "actionButtonSettingsFrag…ntToDjButtonFragment(...)");
            q.f(this$0, a4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(ButtonSettingsFragment this$0, View view) {
        F.p(this$0, "this$0");
        I b4 = com.harman.jbl.partybox.ui.buttonsettings.e.b();
        F.o(b4, "actionButtonSettingsFrag…htShowButtonFragment(...)");
        q.f(this$0, b4);
    }

    private final void y0() {
        HmDevice k12 = s0().k1();
        if (k12 != null) {
            u0().f0(k12);
        }
    }

    private final void z0() {
        HmDevice k12 = s0().k1();
        if (k12 != null) {
            u0().c0(k12);
        }
        u0().Y().k(getViewLifecycleOwner(), new c(new d()));
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        String str;
        String str2;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        r0().f39165G.f38611G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.buttonsettings.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ButtonSettingsFragment.v0(ButtonSettingsFragment.this, view2);
            }
        });
        HmDevice k12 = s0().k1();
        String str3 = null;
        if (k12 != null) {
            str = k12.q();
        } else {
            str = null;
        }
        this.f42230U0 = str;
        HmDevice k13 = s0().k1();
        if (k13 != null) {
            str2 = k13.o();
        } else {
            str2 = null;
        }
        this.f42231V0 = str2;
        HmDevice k14 = s0().k1();
        if (k14 != null) {
            if (com.harman.sdk.utils.d.H(this.f42230U0)) {
                t0().f0(k14);
                r0().f39165G.f38613I.setText(getString(j.m.f41667L1));
            } else {
                u0().e0(k14);
                r0().f39165G.f38613I.setText(getString(j.m.x6));
            }
        }
        r0().f39167I.setImageResource(com.harman.sdk.utils.d.y(requireContext(), this.f42230U0, this.f42231V0));
        if (s0().Z1()) {
            r0().f39164F.setFeatureIcon(j.f.f41003Y1);
            if (com.harman.sdk.utils.d.H(this.f42230U0)) {
                r0().f39164F.setTitle(j.m.f41813r2);
            } else {
                r0().f39164F.setTitle(j.m.V6);
            }
            r0().f39164F.setCardOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.buttonsettings.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ButtonSettingsFragment.w0(ButtonSettingsFragment.this, view2);
                }
            });
            A0();
        } else {
            r0().f39164F.setVisibility(8);
        }
        HmDevice k15 = s0().k1();
        if (k15 != null) {
            str3 = k15.q();
        }
        if (!com.harman.sdk.utils.d.L(str3)) {
            r0().f39166H.setFeatureIcon(j.f.f40956M2);
            r0().f39166H.setTitle(j.m.f41812r1);
            y0();
            z0();
            r0().f39166H.setCardOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.buttonsettings.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ButtonSettingsFragment.x0(ButtonSettingsFragment.this, view2);
                }
            });
            return;
        }
        r0().f39166H.setVisibility(8);
    }
}
