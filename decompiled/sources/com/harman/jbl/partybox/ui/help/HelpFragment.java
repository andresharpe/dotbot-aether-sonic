package com.harman.jbl.partybox.ui.help;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0889g;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1931s0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.help.e;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import kotlin.A;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;

@E(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/harman/jbl/partybox/ui/help/HelpFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "", "screenType", "t0", "(Ljava/lang/String;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/s0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "r0", "()Lcom/harman/jbl/partybox/databinding/s0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "s0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nHelpFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpFragment.kt\ncom/harman/jbl/partybox/ui/help/HelpFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,67:1\n66#2,4:68\n*S KotlinDebug\n*F\n+ 1 HelpFragment.kt\ncom/harman/jbl/partybox/ui/help/HelpFragment\n*L\n21#1:68,4\n*E\n"})
/* loaded from: classes2.dex */
public final class HelpFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "HelpFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43764Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f43765R0;

    /* renamed from: S0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f43763S0 = {N.u(new PropertyReference1Impl(HelpFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentHelpBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final HelpFragment a() {
            return new HelpFragment();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, C1931s0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f43766N = new b();

        b() {
            super(1, C1931s0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentHelpBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1931s0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1931s0.a(p02);
        }
    }

    public HelpFragment() {
        super(j.i.f41499h0);
        this.f43764Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f43766N);
        this.f43765R0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    @W2.n
    @l3.d
    public static final HelpFragment newInstance() {
        return Companion.a();
    }

    private final void onBtnBackClick() {
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final C1931s0 r0() {
        return (C1931s0) this.f43764Q0.a(this, f43763S0[0]);
    }

    private final o s0() {
        return (o) this.f43765R0.getValue();
    }

    private final void t0(String str) {
        e.a a4 = e.a(str);
        F.o(a4, "actionHelpFragmentToSupportedDevicesFragment(...)");
        androidx.navigation.fragment.f.a(this).h0(a4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(HelpFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(HelpFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.t0(SupportedDevicesFragment.CONNECT_SPEAKER);
        this$0.s0().k2(L1.a.f1624n2, new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(HelpFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.t0(SupportedDevicesFragment.QSG);
        this$0.s0().k2(L1.a.f1619m2, new Bundle());
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        C1931s0 r02 = r0();
        r0().f40113I.f38613I.setText(getString(j.m.M7));
        r02.f40113I.f38611G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.help.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HelpFragment.u0(HelpFragment.this, view2);
            }
        });
        r02.f40110F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.help.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HelpFragment.v0(HelpFragment.this, view2);
            }
        });
        r02.f40114J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.help.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HelpFragment.w0(HelpFragment.this, view2);
            }
        });
    }
}
