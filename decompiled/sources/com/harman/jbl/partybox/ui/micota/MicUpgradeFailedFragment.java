package com.harman.jbl.partybox.ui.micota;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.I;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.G0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.micota.v;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.widget.ProgressLayout;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.WirelessMicInfo;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.text.C2220b;

@E(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0019R\"\u0010(\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0012\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0019R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0012\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0019R\"\u00100\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u0019R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/harman/jbl/partybox/ui/micota/MicUpgradeFailedFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "v0", "()V", "u0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "onRetryClicked", "", "Q0", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "R0", "getFailedStatus", "setFailedStatus", "(Ljava/lang/String;)V", "failedStatus", "Lcom/harman/jbl/partybox/databinding/G0;", "S0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "getBinding", "()Lcom/harman/jbl/partybox/databinding/G0;", "binding", "T0", "getDeviceVersion", "setDeviceVersion", "deviceVersion", "U0", "getProductName", "setProductName", "productName", "V0", "getServerVersion", "setServerVersion", "serverVersion", "W0", "getDevicePid", "setDevicePid", "devicePid", "Lcom/harman/jbl/partybox/ui/main/o;", "X0", "Lkotlin/A;", "q0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/micota/l;", "Y0", "r0", "()Lcom/harman/jbl/partybox/ui/micota/l;", "micOTAViewModel", "<init>", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nMicUpgradeFailedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicUpgradeFailedFragment.kt\ncom/harman/jbl/partybox/ui/micota/MicUpgradeFailedFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n66#2,4:155\n56#3,10:159\n1#4:169\n*S KotlinDebug\n*F\n+ 1 MicUpgradeFailedFragment.kt\ncom/harman/jbl/partybox/ui/micota/MicUpgradeFailedFragment\n*L\n30#1:155,4\n31#1:159,10\n*E\n"})
/* loaded from: classes2.dex */
public final class MicUpgradeFailedFragment extends BackDispatcherFragment {

    /* renamed from: Z0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f44268Z0 = {N.u(new PropertyReference1Impl(MicUpgradeFailedFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentMicOtaUpgradeFailedBinding;", 0))};

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final String f44269Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.e
    private String f44270R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f44271S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private String f44272T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private String f44273U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private String f44274V0;

    /* renamed from: W0, reason: collision with root package name */
    @l3.d
    private String f44275W0;

    /* renamed from: X0, reason: collision with root package name */
    @l3.d
    private final A f44276X0;

    /* renamed from: Y0, reason: collision with root package name */
    @l3.d
    private final A f44277Y0;

    /* loaded from: classes2.dex */
    /* synthetic */ class a extends FunctionReferenceImpl implements X2.l<View, G0> {

        /* renamed from: N, reason: collision with root package name */
        public static final a f44282N = new a();

        a() {
            super(1, G0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentMicOtaUpgradeFailedBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final G0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return G0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.l<Boolean, H0> {
        b() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            MicUpgradeFailedFragment.this.v0();
        }
    }

    /* loaded from: classes2.dex */
    static final class c implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f44284a;

        c(X2.l function) {
            F.p(function, "function");
            this.f44284a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f44284a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f44284a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public MicUpgradeFailedFragment() {
        super(j.i.f41551u0);
        this.f44269Q0 = "MicUpgradeFailedFragment";
        this.f44271S0 = com.harman.jbl.partybox.ui.delegate.b.a(this, a.f44282N);
        this.f44272T0 = "";
        this.f44273U0 = "";
        this.f44274V0 = "";
        this.f44275W0 = "";
        this.f44276X0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.micota.MicUpgradeFailedFragment$special$$inlined$viewModels$default$1
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
        this.f44277Y0 = FragmentViewModelLazyKt.c(this, N.d(l.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.micota.MicUpgradeFailedFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.micota.MicUpgradeFailedFragment$special$$inlined$viewModels$default$3
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
    }

    private final com.harman.jbl.partybox.ui.main.o q0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f44276X0.getValue();
    }

    private final l r0() {
        return (l) this.f44277Y0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(MicUpgradeFailedFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onRetryClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(MicUpgradeFailedFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.u0();
    }

    private final void u0() {
        PartyBoxDevice partyBoxDevice;
        ActivityC0889g activity;
        ActivityC0889g activity2;
        T1.a.c(this.f44269Q0 + " mainViewModel popToDashboard,pid=  " + this.f44275W0 + "$");
        HmDevice k12 = q0().k1();
        if (k12 != null) {
            partyBoxDevice = (PartyBoxDevice) k12;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null && partyBoxDevice.O()) {
            I b4 = v.b();
            F.o(b4, "actionMicUpgradeFailedFr…ageDashboardFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this, b4);
        } else if (isAdded() && (activity = getActivity()) != null && !activity.isFinishing() && (activity2 = getActivity()) != null) {
            activity2.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0() {
        T1.a.c(this.f44269Q0 + " mainViewModel retryOrContinueToUpgradeFirmware,pid=  " + this.f44275W0 + "$");
        v.a a4 = v.a();
        F.o(a4, "actionMicUpgradeFailedFr…icOTAUpgradeFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this, a4);
    }

    @l3.d
    public final G0 getBinding() {
        return (G0) this.f44271S0.a(this, f44268Z0[0]);
    }

    @l3.d
    public final String getDevicePid() {
        return this.f44275W0;
    }

    @l3.d
    public final String getDeviceVersion() {
        return this.f44272T0;
    }

    @l3.e
    public final String getFailedStatus() {
        return this.f44270R0;
    }

    @l3.d
    public final String getProductName() {
        return this.f44273U0;
    }

    @l3.d
    public final String getServerVersion() {
        return this.f44274V0;
    }

    @l3.d
    public final String getTAG() {
        return this.f44269Q0;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        u0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        s sVar;
        String str;
        String str2;
        String str3;
        String str4;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str5 = null;
        if (arguments != null) {
            sVar = s.fromBundle(arguments);
        } else {
            sVar = null;
        }
        if (sVar != null) {
            str = sVar.c();
        } else {
            str = null;
        }
        String str6 = "";
        if (str == null) {
            str = "";
        }
        this.f44272T0 = str;
        if (sVar != null) {
            str2 = sVar.f();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        this.f44273U0 = str2;
        if (sVar == null || (str3 = sVar.e()) == null) {
            str3 = "";
        }
        this.f44270R0 = str3;
        if (sVar != null) {
            str4 = sVar.g();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        this.f44274V0 = str4;
        if (sVar != null) {
            str5 = sVar.d();
        }
        if (str5 != null) {
            str6 = str5;
        }
        this.f44275W0 = str6;
    }

    public final void onRetryClicked() {
        T1.a.c(this.f44269Q0 + " failedStatus = " + this.f44270R0);
        if (q0().k1() != null) {
            HmDevice k12 = q0().k1();
            F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            T1.a.c(this.f44269Q0 + " mainViewModel device = " + this.f44275W0 + "," + partyBoxDevice);
            if (partyBoxDevice.R() && (partyBoxDevice.S0() > 30 || partyBoxDevice.T0() == 1)) {
                r0().k0(partyBoxDevice);
                return;
            } else {
                u0();
                return;
            }
        }
        T1.a.c(this.f44269Q0 + " mainViewModel device is null,pid=  " + this.f44275W0 + "$");
        u0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        PartyBoxDevice partyBoxDevice;
        int a4;
        Integer num;
        int a5;
        Integer num2;
        int a6;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        HmDevice k12 = q0().k1();
        Integer num3 = null;
        if (k12 instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) k12;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null) {
            WirelessMicInfo v12 = partyBoxDevice.v1();
            if (v12 != null && com.harman.jbl.partybox.firmware.d.f40541a.a(v12)) {
                ProgressLayout progressLayout = getBinding().f38639I;
                WirelessMicInfo v13 = partyBoxDevice.v1();
                if (v13 != null) {
                    num2 = Integer.valueOf(v13.e());
                } else {
                    num2 = null;
                }
                String o4 = partyBoxDevice.o();
                if (o4 != null) {
                    a6 = C2220b.a(16);
                    num3 = Integer.valueOf(Integer.parseInt(o4, a6));
                }
                progressLayout.setCenterImage(w.a(num2, num3));
            } else {
                WirelessMicInfo v14 = partyBoxDevice.v1();
                if (v14 != null && com.harman.jbl.partybox.firmware.d.f40541a.b(v14)) {
                    ProgressLayout progressLayout2 = getBinding().f38639I;
                    WirelessMicInfo v15 = partyBoxDevice.v1();
                    if (v15 != null) {
                        num = Integer.valueOf(v15.j());
                    } else {
                        num = null;
                    }
                    String o5 = partyBoxDevice.o();
                    if (o5 != null) {
                        a5 = C2220b.a(16);
                        num3 = Integer.valueOf(Integer.parseInt(o5, a5));
                    }
                    progressLayout2.setCenterImage(w.a(num, num3));
                } else {
                    ProgressLayout progressLayout3 = getBinding().f38639I;
                    String o6 = partyBoxDevice.o();
                    if (o6 != null) {
                        a4 = C2220b.a(16);
                        num3 = Integer.valueOf(Integer.parseInt(o6, a4));
                    }
                    progressLayout3.setCenterImage(w.a(3, num3));
                }
            }
        }
        getBinding().f38636F.f38735H.setText(getString(j.m.b4));
        getBinding().f38640J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.micota.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MicUpgradeFailedFragment.s0(MicUpgradeFailedFragment.this, view2);
            }
        });
        getBinding().f38636F.f38734G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.micota.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MicUpgradeFailedFragment.t0(MicUpgradeFailedFragment.this, view2);
            }
        });
        getBinding().f38636F.f38734G.setVisibility(0);
        getBinding().f38642L.setVisibility(4);
        getBinding().f38638H.setVisibility(0);
        getBinding().f38643M.setVisibility(0);
        getBinding().f38644N.setText(j.m.F9);
        getBinding().f38643M.setText(j.m.e4);
        getBinding().f38640J.setVisibility(0);
        getBinding().f38640J.setText(j.m.Fa);
        r0().g0().k(getViewLifecycleOwner(), new c(new b()));
    }

    public final void setDevicePid(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f44275W0 = str;
    }

    public final void setDeviceVersion(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f44272T0 = str;
    }

    public final void setFailedStatus(@l3.e String str) {
        this.f44270R0 = str;
    }

    public final void setProductName(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f44273U0 = str;
    }

    public final void setServerVersion(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f44274V0 = str;
    }
}
