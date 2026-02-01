package com.harman.jbl.partybox.ui.connection.view;

import android.os.Bundle;
import android.view.View;
import androidx.core.os.C0741d;
import androidx.navigation.I;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.Y;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.connection.view.p;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import kotlin.A;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;

@E(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/harman/jbl/partybox/ui/connection/view/ConnectionGuideFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "Landroidx/navigation/I;", "action", "s0", "(Landroidx/navigation/I;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/Y;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "t0", "()Lcom/harman/jbl/partybox/databinding/Y;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "u0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nConnectionGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionGuideFragment.kt\ncom/harman/jbl/partybox/ui/connection/view/ConnectionGuideFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,99:1\n66#2,4:100\n*S KotlinDebug\n*F\n+ 1 ConnectionGuideFragment.kt\ncom/harman/jbl/partybox/ui/connection/view/ConnectionGuideFragment\n*L\n22#1:100,4\n*E\n"})
/* loaded from: classes2.dex */
public final class ConnectionGuideFragment extends BackDispatcherFragment {

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private static final String f42351T0 = "isFromSwitchSpeaker";

    @l3.d
    public static final String TAG = "ConnectionGuideFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f42352Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f42353R0;

    /* renamed from: S0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f42350S0 = {N.u(new PropertyReference1Impl(ConnectionGuideFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentConnectionGuideBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final ConnectionGuideFragment a(boolean z3) {
            ConnectionGuideFragment connectionGuideFragment = new ConnectionGuideFragment();
            connectionGuideFragment.setArguments(C0741d.b(C2122h0.a(ConnectionGuideFragment.f42351T0, Boolean.valueOf(z3))));
            return connectionGuideFragment;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, Y> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f42354N = new b();

        b() {
            super(1, Y.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentConnectionGuideBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final Y C(@l3.d View p02) {
            F.p(p02, "p0");
            return Y.a(p02);
        }
    }

    public ConnectionGuideFragment() {
        super(j.i.f41426P);
        this.f42352Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f42354N);
        this.f42353R0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    @W2.n
    @l3.d
    public static final ConnectionGuideFragment newInstance(boolean z3) {
        return Companion.a(z3);
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    private final void s0(I i4) {
        com.harman.jbl.partybox.utils.q.f(this, i4);
    }

    private final Y t0() {
        return (Y) this.f42352Q0.a(this, f42350S0[0]);
    }

    private final com.harman.jbl.partybox.ui.main.o u0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f42353R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(ConnectionGuideFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(ConnectionGuideFragment this$0, View view) {
        F.p(this$0, "this$0");
        I c4 = p.c();
        F.o(c4, "actionConnectionGuideFra…ortedDevicesFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(ConnectionGuideFragment this$0, View view) {
        F.p(this$0, "this$0");
        I c4 = p.c();
        F.o(c4, "actionConnectionGuideFra…ortedDevicesFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(ConnectionGuideFragment this$0, View view) {
        F.p(this$0, "this$0");
        p.a a4 = p.a("");
        F.o(a4, "actionConnectionGuideFra…kerBluetoothFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, a4);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        Object obj;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey(f42351T0)) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                obj = arguments2.get(f42351T0);
            } else {
                obj = null;
            }
            F.n(obj, "null cannot be cast to non-null type kotlin.Int");
            boolean z3 = true;
            if (((Integer) obj).intValue() != 1) {
                z3 = false;
            }
            com.harman.log.f.a(TAG, "BLE_LOG isFromSwitchSpeaker is " + z3);
        }
        Y t02 = t0();
        t02.f39233I.f38735H.setText(getString(j.m.n8));
        t02.f39233I.f38734G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.connection.view.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConnectionGuideFragment.v0(ConnectionGuideFragment.this, view2);
            }
        });
        t02.f39231G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.connection.view.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConnectionGuideFragment.w0(ConnectionGuideFragment.this, view2);
            }
        });
        t02.f39230F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.connection.view.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConnectionGuideFragment.x0(ConnectionGuideFragment.this, view2);
            }
        });
        t02.f39232H.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.connection.view.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConnectionGuideFragment.y0(ConnectionGuideFragment.this, view2);
            }
        });
    }
}
