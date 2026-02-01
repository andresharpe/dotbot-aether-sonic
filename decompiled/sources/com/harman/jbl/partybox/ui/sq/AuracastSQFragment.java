package com.harman.jbl.partybox.ui.sq;

import X2.l;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.Q;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.utils.g;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
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
import kotlin.reflect.n;

@E(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004J\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0004R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/harman/jbl/partybox/ui/sq/AuracastSQFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "t0", "()V", "w0", "onBtnBackClick", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "openSQ", "", SQExitDialogFragment.ARG_BACK_UP, "closeSQ", "(Z)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/Q;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "q0", "()Lcom/harman/jbl/partybox/databinding/Q;", "binding", "Lcom/harman/jbl/partybox/ui/sq/c;", "R0", "Lkotlin/A;", "s0", "()Lcom/harman/jbl/partybox/ui/sq/c;", "viewModel", "Lcom/harman/jbl/partybox/ui/main/o;", "S0", "r0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nAuracastSQFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastSQFragment.kt\ncom/harman/jbl/partybox/ui/sq/AuracastSQFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,158:1\n56#2,10:159\n66#3,4:169\n*S KotlinDebug\n*F\n+ 1 AuracastSQFragment.kt\ncom/harman/jbl/partybox/ui/sq/AuracastSQFragment\n*L\n26#1:159,10\n27#1:169,4\n*E\n"})
/* loaded from: classes2.dex */
public final class AuracastSQFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "AuracastSQFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f45537Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f45538R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final A f45539S0;

    /* renamed from: T0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f45536T0 = {N.u(new PropertyReference1Impl(AuracastSQFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentAuracastSqBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final AuracastSQFragment a() {
            return new AuracastSQFragment();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, Q> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f45544N = new b();

        b() {
            super(1, Q.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentAuracastSqBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final Q C(@l3.d View p02) {
            F.p(p02, "p0");
            return Q.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements l<PartyBoxDevice, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(PartyBoxDevice partyBoxDevice) {
            c(partyBoxDevice);
            return H0.f51801a;
        }

        public final void c(PartyBoxDevice partyBoxDevice) {
            T1.a.a(" AuracastSQFragment connectDeviceLiveData initSQStatusView");
            AuracastSQFragment.this.t0();
        }
    }

    /* loaded from: classes2.dex */
    static final class d implements androidx.lifecycle.Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f45546a;

        d(l function) {
            F.p(function, "function");
            this.f45546a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45546a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof androidx.lifecycle.Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45546a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public AuracastSQFragment() {
        super(j.i.f41398I);
        this.f45537Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f45544N);
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.sq.AuracastSQFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f45538R0 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.sq.c.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.sq.AuracastSQFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.sq.AuracastSQFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
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
        this.f45539S0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    private final void onBtnBackClick() {
        HmDevice k12;
        PartyBoxDevice partyBoxDevice;
        com.harman.log.f.a(TAG, "onBtnBackClick called");
        if (!g.c(200L) && (k12 = r0().k1()) != null) {
            boolean z3 = k12 instanceof PartyBoxDevice;
            Boolean bool = null;
            if (z3) {
                partyBoxDevice = (PartyBoxDevice) k12;
            } else {
                partyBoxDevice = null;
            }
            if (partyBoxDevice != null) {
                bool = Boolean.valueOf(partyBoxDevice.O0());
            }
            com.harman.log.f.a(TAG, "onBtnBackClick auracastSQEnable = " + bool);
            if (z3 && ((PartyBoxDevice) k12).O0()) {
                if (isAdded() && isVisible()) {
                    SQExitDialogFragment.Companion.a(true).show(getChildFragmentManager(), SQExitDialogFragment.TAG);
                    return;
                } else {
                    com.harman.log.f.a(TAG, "onBtnBackClick isAdded && isVisible else");
                    return;
                }
            }
            androidx.navigation.fragment.f.a(this).r0();
        }
    }

    private final Q q0() {
        return (Q) this.f45537Q0.a(this, f45536T0[0]);
    }

    private final o r0() {
        return (o) this.f45539S0.getValue();
    }

    private final com.harman.jbl.partybox.ui.sq.c s0() {
        return (com.harman.jbl.partybox.ui.sq.c) this.f45538R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0() {
        HmDevice k12 = r0().k1();
        if (k12 != null) {
            if ((k12 instanceof PartyBoxDevice) && ((PartyBoxDevice) k12).O0()) {
                q0().f38977F.setText(getString(j.m.C4));
                q0().f38977F.setTextColor(getResources().getColor(j.d.f40739c0));
                q0().f38977F.setBackgroundResource(j.f.W9);
            } else {
                q0().f38977F.setText(getString(j.m.F4));
                q0().f38977F.setTextColor(getResources().getColor(j.d.f40750g));
                q0().f38977F.setBackgroundResource(j.f.f40905A);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(AuracastSQFragment this$0, View view) {
        F.p(this$0, "this$0");
        Log.d(TAG, "back Click called");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(AuracastSQFragment this$0, View view) {
        F.p(this$0, "this$0");
        if (g.c(200L)) {
            return;
        }
        this$0.w0();
    }

    private final void w0() {
        com.harman.log.f.a(TAG, "switchSQStatus called");
        HmDevice k12 = r0().k1();
        if (k12 != null) {
            if ((k12 instanceof PartyBoxDevice) && ((PartyBoxDevice) k12).O0()) {
                if (isAdded() && isVisible()) {
                    SQExitDialogFragment.Companion.a(false).show(getChildFragmentManager(), SQExitDialogFragment.TAG);
                    return;
                }
                return;
            }
            openSQ();
        }
    }

    public final void closeSQ(boolean z3) {
        com.harman.log.f.a(TAG, "closeSQ called backUp = " + z3);
        HmDevice k12 = r0().k1();
        if (k12 != null) {
            s0().X(k12);
        }
        if (z3) {
            androidx.navigation.fragment.f.a(this).r0();
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        HmDevice k12 = r0().k1();
        if (k12 != null) {
            s0().Z(k12);
        }
        q0().f38978G.f38613I.setText(getString(j.m.N4));
        q0().f38978G.f38611G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.sq.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AuracastSQFragment.u0(AuracastSQFragment.this, view2);
            }
        });
        t0();
        q0().f38977F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.sq.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AuracastSQFragment.v0(AuracastSQFragment.this, view2);
            }
        });
        s0().Y().k(getViewLifecycleOwner(), new d(new c()));
    }

    public final void openSQ() {
        com.harman.log.f.a(TAG, "openSQ called");
        HmDevice k12 = r0().k1();
        if (k12 != null) {
            s0().a0(k12);
        }
    }
}
