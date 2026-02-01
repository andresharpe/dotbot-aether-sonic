package com.harman.jbl.partybox.ui.legal;

import X2.l;
import android.os.Bundle;
import android.view.View;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.M0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
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
import kotlin.text.z;

@E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0004R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/harman/jbl/partybox/ui/legal/OpenSourceLicenseFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/M0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "p0", "()Lcom/harman/jbl/partybox/databinding/M0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "q0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nOpenSourceLicenseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenSourceLicenseFragment.kt\ncom/harman/jbl/partybox/ui/legal/OpenSourceLicenseFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,67:1\n66#2,4:68\n*S KotlinDebug\n*F\n+ 1 OpenSourceLicenseFragment.kt\ncom/harman/jbl/partybox/ui/legal/OpenSourceLicenseFragment\n*L\n21#1:68,4\n*E\n"})
/* loaded from: classes2.dex */
public final class OpenSourceLicenseFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "OpenSourceLicenseFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43909Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f43910R0;

    /* renamed from: S0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f43908S0 = {N.u(new PropertyReference1Impl(OpenSourceLicenseFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentOpensourceLicenseBinding;", 0))};

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
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, M0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f43911N = new b();

        b() {
            super(1, M0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentOpensourceLicenseBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final M0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return M0.a(p02);
        }
    }

    public OpenSourceLicenseFragment() {
        super(j.i.f41367A0);
        this.f43909Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f43911N);
        this.f43910R0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    private final M0 p0() {
        return (M0) this.f43909Q0.a(this, f43908S0[0]);
    }

    private final o q0() {
        return (o) this.f43910R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(OpenSourceLicenseFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        boolean K12;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        p0().f38879F.f38735H.setText(getString(j.m.s8));
        p0().f38879F.f38734G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.legal.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OpenSourceLicenseFragment.r0(OpenSourceLicenseFragment.this, view2);
            }
        });
        String c4 = com.harman.jbl.partybox.utils.l.c(getContext(), S1.a.f1734b);
        F.o(c4, "getFromData(...)");
        K12 = z.K1(c4, "", true);
        if (K12) {
            c4 = com.harman.jbl.partybox.utils.l.b(getContext(), S1.a.f1734b);
            F.o(c4, "getFromAssets(...)");
        }
        p0().f38880G.setText(c4);
    }
}
