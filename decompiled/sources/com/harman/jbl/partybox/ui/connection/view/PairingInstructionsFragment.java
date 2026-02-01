package com.harman.jbl.partybox.ui.connection.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.P0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import kotlin.A;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;

@E(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0004R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/harman/jbl/partybox/ui/connection/view/PairingInstructionsFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "onResume", "Lcom/harman/jbl/partybox/databinding/P0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "q0", "()Lcom/harman/jbl/partybox/databinding/P0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "r0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "", "S0", "Z", "showDiscovery", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPairingInstructionsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PairingInstructionsFragment.kt\ncom/harman/jbl/partybox/ui/connection/view/PairingInstructionsFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,72:1\n66#2,4:73\n*S KotlinDebug\n*F\n+ 1 PairingInstructionsFragment.kt\ncom/harman/jbl/partybox/ui/connection/view/PairingInstructionsFragment\n*L\n22#1:73,4\n*E\n"})
/* loaded from: classes2.dex */
public final class PairingInstructionsFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "PairingInstructionsFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f42356Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f42357R0;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f42358S0;

    /* renamed from: T0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f42355T0 = {N.u(new PropertyReference1Impl(PairingInstructionsFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentPairingInstructionsBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final PairingInstructionsFragment a() {
            return new PairingInstructionsFragment();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, P0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f42359N = new b();

        b() {
            super(1, P0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentPairingInstructionsBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final P0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return P0.a(p02);
        }
    }

    public PairingInstructionsFragment() {
        super(j.i.f41379D0);
        this.f42356Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f42359N);
        this.f42357R0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    @W2.n
    @l3.d
    public static final PairingInstructionsFragment newInstance() {
        return Companion.a();
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    private final P0 q0() {
        return (P0) this.f42356Q0.a(this, f42355T0[0]);
    }

    private final com.harman.jbl.partybox.ui.main.o r0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f42357R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(PairingInstructionsFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(PairingInstructionsFragment this$0, View view) {
        F.p(this$0, "this$0");
        T1.a.a("BLE_LOG updateUIPagetoDiscovery from Pairing instruction screen");
        this$0.f42358S0 = true;
        this$0.startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        P0 q02 = q0();
        q02.f38952H.f38613I.setText(getString(j.m.x8));
        q02.f38952H.f38611G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.connection.view.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PairingInstructionsFragment.s0(PairingInstructionsFragment.this, view2);
            }
        });
        q02.f38951G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.connection.view.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PairingInstructionsFragment.t0(PairingInstructionsFragment.this, view2);
            }
        });
    }
}
