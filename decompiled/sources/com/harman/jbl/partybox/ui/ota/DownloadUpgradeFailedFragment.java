package com.harman.jbl.partybox.ui.ota;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0889g;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1867f0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.core.PartyBoxDashboardActivity;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;

@kotlin.E(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0019R\"\u0010(\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0012\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0019R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0012\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0019R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0012R\u0016\u00100\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u0012R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/harman/jbl/partybox/ui/ota/DownloadUpgradeFailedFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "u0", "()V", "t0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "onRetryClicked", "", "Q0", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "R0", "getFailedStatus", "setFailedStatus", "(Ljava/lang/String;)V", "failedStatus", "Lcom/harman/jbl/partybox/databinding/f0;", "S0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "getBinding", "()Lcom/harman/jbl/partybox/databinding/f0;", "binding", "T0", "getDeviceVersion", "setDeviceVersion", "deviceVersion", "U0", "getProductName", "setProductName", "productName", "V0", "getServerVersion", "setServerVersion", "serverVersion", "W0", "devicePid", "X0", "deviceMid", "Lcom/harman/jbl/partybox/ui/main/o;", "Y0", "Lkotlin/A;", "q0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "", "Z0", "Z", "isOTAFailEventSent", "<init>", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nDownloadUpgradeFailedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadUpgradeFailedFragment.kt\ncom/harman/jbl/partybox/ui/ota/DownloadUpgradeFailedFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n66#2,4:198\n1#3:202\n*S KotlinDebug\n*F\n+ 1 DownloadUpgradeFailedFragment.kt\ncom/harman/jbl/partybox/ui/ota/DownloadUpgradeFailedFragment\n*L\n34#1:198,4\n*E\n"})
/* loaded from: classes2.dex */
public final class DownloadUpgradeFailedFragment extends BackDispatcherFragment {

    /* renamed from: a1, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f44409a1 = {kotlin.jvm.internal.N.u(new PropertyReference1Impl(DownloadUpgradeFailedFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentDownloadUpgradeBinding;", 0))};

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final String f44410Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.e
    private String f44411R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f44412S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private String f44413T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private String f44414U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private String f44415V0;

    /* renamed from: W0, reason: collision with root package name */
    @l3.d
    private String f44416W0;

    /* renamed from: X0, reason: collision with root package name */
    @l3.d
    private String f44417X0;

    /* renamed from: Y0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f44418Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private boolean f44419Z0;

    /* loaded from: classes2.dex */
    /* synthetic */ class a extends FunctionReferenceImpl implements X2.l<View, C1867f0> {

        /* renamed from: N, reason: collision with root package name */
        public static final a f44420N = new a();

        a() {
            super(1, C1867f0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentDownloadUpgradeBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1867f0 C(@l3.d View p02) {
            kotlin.jvm.internal.F.p(p02, "p0");
            return C1867f0.a(p02);
        }
    }

    public DownloadUpgradeFailedFragment() {
        super(j.i.f41454W);
        this.f44410Q0 = "HmPbDownloadUpgradeFailedFragment";
        this.f44412S0 = com.harman.jbl.partybox.ui.delegate.b.a(this, a.f44420N);
        this.f44413T0 = "";
        this.f44414U0 = "";
        this.f44415V0 = "";
        this.f44416W0 = "";
        this.f44417X0 = "";
        this.f44418Y0 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    private final com.harman.jbl.partybox.ui.main.o q0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f44418Y0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(DownloadUpgradeFailedFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.onRetryClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(DownloadUpgradeFailedFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.t0();
    }

    private final void t0() {
        PartyBoxDevice partyBoxDevice;
        ActivityC0889g activity;
        ActivityC0889g activity2;
        com.harman.log.f.b(HmOTAWhatsNewFragment.TAG, "popToDashboard, so set autoBack = true");
        PartyBoxDashboardActivity.f42403l0.c(true);
        T1.a.c(this.f44410Q0 + " mainViewModel popToDashboard,pid=  " + this.f44416W0 + "$");
        HmDevice k12 = q0().k1();
        if (k12 != null) {
            partyBoxDevice = (PartyBoxDevice) k12;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null && partyBoxDevice.O()) {
            if (com.harman.sdk.utils.d.H(this.f44416W0)) {
                androidx.navigation.I b4 = C2022h.b();
                kotlin.jvm.internal.F.o(b4, "actionDownloadUpgradeFai…ageDashboardFragment(...)");
                com.harman.jbl.partybox.utils.q.f(this, b4);
                return;
            } else {
                androidx.navigation.I a4 = C2022h.a();
                kotlin.jvm.internal.F.o(a4, "actionDownloadUpgradeFai…tToDashboardFragment(...)");
                com.harman.jbl.partybox.utils.q.f(this, a4);
                return;
            }
        }
        if (isAdded() && (activity = getActivity()) != null && !activity.isFinishing() && (activity2 = getActivity()) != null) {
            activity2.finish();
        }
    }

    private final void u0() {
        T1.a.c(this.f44410Q0 + " mainViewModel retryOrContinueToDownloadFirmware,pid=  " + this.f44416W0 + "$");
        androidx.navigation.I c4 = C2022h.c();
        kotlin.jvm.internal.F.o(c4, "actionToUpgradeFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this, c4);
    }

    @l3.d
    public final C1867f0 getBinding() {
        return (C1867f0) this.f44412S0.a(this, f44409a1[0]);
    }

    @l3.d
    public final String getDeviceVersion() {
        return this.f44413T0;
    }

    @l3.e
    public final String getFailedStatus() {
        return this.f44411R0;
    }

    @l3.d
    public final String getProductName() {
        return this.f44414U0;
    }

    @l3.d
    public final String getServerVersion() {
        return this.f44415V0;
    }

    @l3.d
    public final String getTAG() {
        return this.f44410Q0;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        t0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        C2020f c2020f;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str6 = null;
        if (arguments != null) {
            c2020f = C2020f.fromBundle(arguments);
        } else {
            c2020f = null;
        }
        if (c2020f != null) {
            str = c2020f.c();
        } else {
            str = null;
        }
        String str7 = "";
        if (str == null) {
            str = "";
        }
        this.f44413T0 = str;
        if (c2020f != null) {
            str2 = c2020f.g();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        this.f44414U0 = str2;
        if (c2020f == null || (str3 = c2020f.f()) == null) {
            str3 = "";
        }
        this.f44411R0 = str3;
        if (c2020f != null) {
            str4 = c2020f.h();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        this.f44415V0 = str4;
        if (c2020f != null) {
            str5 = c2020f.e();
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str5 = "";
        }
        this.f44416W0 = str5;
        if (c2020f != null) {
            str6 = c2020f.d();
        }
        if (str6 != null) {
            str7 = str6;
        }
        this.f44417X0 = str7;
        com.harman.log.f.a(this.f44410Q0, "onCreate>>> deviceVersion = " + this.f44413T0 + ", devicePid = " + this.f44416W0 + ", deviceMid = " + str7);
        if (!this.f44419Z0) {
            this.f44419Z0 = true;
            q0().t2(0, this.f44413T0, this.f44415V0, L1.a.f1625n3);
        }
    }

    public final void onRetryClicked() {
        if (q0().k1() != null) {
            HmDevice k12 = q0().k1();
            kotlin.jvm.internal.F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            T1.a.c(this.f44410Q0 + " mainViewModel device = " + this.f44416W0 + "," + partyBoxDevice);
            if (partyBoxDevice.O() && (partyBoxDevice.S0() > 30 || partyBoxDevice.T0() == 1)) {
                u0();
                return;
            } else {
                t0();
                return;
            }
        }
        T1.a.c(this.f44410Q0 + " mainViewModel device is null,pid=  " + this.f44416W0 + "$");
        t0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x006d, code lost:
    
        if (r3 == null) goto L12;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x00a4. Please report as an issue. */
    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(@l3.d android.view.View r3, @l3.e android.os.Bundle r4) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.ota.DownloadUpgradeFailedFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void setDeviceVersion(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<set-?>");
        this.f44413T0 = str;
    }

    public final void setFailedStatus(@l3.e String str) {
        this.f44411R0 = str;
    }

    public final void setProductName(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<set-?>");
        this.f44414U0 = str;
    }

    public final void setServerVersion(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<set-?>");
        this.f44415V0 = str;
    }
}
