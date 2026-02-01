package com.harman.jbl.partybox.ui.ota;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C0669d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.J3;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.core.PartyBoxDashboardActivity;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.ota.RemoteOTAConfig;
import java.util.Map;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.Pair;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;

@kotlin.E(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/harman/jbl/partybox/ui/ota/HmOTAWhatsNewFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "A0", "x0", "q0", "Lcom/harman/sdk/device/PartyBoxDevice;", "", "r0", "(Lcom/harman/sdk/device/PartyBoxDevice;)Z", "y0", "z0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/J3;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "s0", "()Lcom/harman/jbl/partybox/databinding/J3;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "t0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/ota/N;", "S0", "u0", "()Lcom/harman/jbl/partybox/ui/ota/N;", "sharedOtaViewModel", "", "T0", "Ljava/lang/String;", "currentLanguageString", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nHmOTAWhatsNewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HmOTAWhatsNewFragment.kt\ncom/harman/jbl/partybox/ui/ota/HmOTAWhatsNewFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,191:1\n66#2,4:192\n56#3,10:196\n*S KotlinDebug\n*F\n+ 1 HmOTAWhatsNewFragment.kt\ncom/harman/jbl/partybox/ui/ota/HmOTAWhatsNewFragment\n*L\n25#1:192,4\n26#1:196,10\n*E\n"})
/* loaded from: classes2.dex */
public final class HmOTAWhatsNewFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "HmOTAWhatsNewFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f44425Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f44426R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f44427S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private String f44428T0;

    /* renamed from: U0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f44424U0 = {kotlin.jvm.internal.N.u(new PropertyReference1Impl(HmOTAWhatsNewFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/OtaWhatsNewFragmentBinding;", 0))};

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
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, J3> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f44433N = new b();

        b() {
            super(1, J3.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/OtaWhatsNewFragmentBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final J3 C(@l3.d View p02) {
            kotlin.jvm.internal.F.p(p02, "p0");
            return J3.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.l<Pair<? extends Boolean, ? extends String>, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Pair<? extends Boolean, ? extends String> pair) {
            c(pair);
            return H0.f51801a;
        }

        public final void c(Pair<Boolean, String> pair) {
            String str;
            boolean booleanValue = pair.a().booleanValue();
            String b4 = pair.b();
            com.harman.log.f.a(HmOTAWhatsNewFragment.TAG, "otaLiveData observer, otaAvailable = " + booleanValue + ", version = " + b4);
            if (booleanValue) {
                HmOTAWhatsNewFragment.this.s0().f38795O.setText(b4);
                HmDevice k12 = HmOTAWhatsNewFragment.this.t0().k1();
                if (k12 != null) {
                    HmOTAWhatsNewFragment hmOTAWhatsNewFragment = HmOTAWhatsNewFragment.this;
                    if (hmOTAWhatsNewFragment.isAdded() && hmOTAWhatsNewFragment.isVisible()) {
                        com.harman.jbl.partybox.utils.m mVar = com.harman.jbl.partybox.utils.m.f46192a;
                        Resources resources = hmOTAWhatsNewFragment.getResources();
                        kotlin.jvm.internal.F.o(resources, "getResources(...)");
                        hmOTAWhatsNewFragment.f44428T0 = mVar.a(resources);
                        RemoteOTAConfig H3 = k12.H();
                        if (H3 != null) {
                            str = hmOTAWhatsNewFragment.u0().n0(hmOTAWhatsNewFragment.f44428T0, H3.g());
                        } else {
                            str = null;
                        }
                        com.harman.log.f.a(HmOTAWhatsNewFragment.TAG, "otaLiveData whatsNewStr is : " + str);
                        if (str != null && str.length() > 0) {
                            hmOTAWhatsNewFragment.s0().f38791K.setText(str);
                        } else {
                            hmOTAWhatsNewFragment.s0().f38791K.setText(j.m.m8);
                            hmOTAWhatsNewFragment.x0();
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.l<HmDevice, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(HmDevice hmDevice) {
            com.harman.log.f.a(HmOTAWhatsNewFragment.TAG, "connectDeviceLiveData observer, it = " + hmDevice);
            HmOTAWhatsNewFragment.this.q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.l<Map<String, ? extends RemoteOTAConfig.WhatsNewItem>, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Map<String, ? extends RemoteOTAConfig.WhatsNewItem> map) {
            c(map);
            return H0.f51801a;
        }

        public final void c(@l3.d Map<String, RemoteOTAConfig.WhatsNewItem> whatsNew) {
            kotlin.jvm.internal.F.p(whatsNew, "whatsNew");
            HmOTAWhatsNewFragment.this.A0();
        }
    }

    /* loaded from: classes2.dex */
    static final class f implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f44437a;

        f(X2.l function) {
            kotlin.jvm.internal.F.p(function, "function");
            this.f44437a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f44437a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return kotlin.jvm.internal.F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f44437a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public HmOTAWhatsNewFragment() {
        super(j.i.f41413L2);
        this.f44425Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f44433N);
        this.f44426R0 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.ota.HmOTAWhatsNewFragment$special$$inlined$viewModels$default$1
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
        this.f44427S0 = FragmentViewModelLazyKt.c(this, kotlin.jvm.internal.N.d(N.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.ota.HmOTAWhatsNewFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                kotlin.jvm.internal.F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.ota.HmOTAWhatsNewFragment$special$$inlined$viewModels$default$3
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
                kotlin.jvm.internal.F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
        this.f44428T0 = "en";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0() {
        String str;
        RemoteOTAConfig H3;
        if (isAdded()) {
            com.harman.jbl.partybox.utils.m mVar = com.harman.jbl.partybox.utils.m.f46192a;
            Resources resources = getResources();
            kotlin.jvm.internal.F.o(resources, "getResources(...)");
            this.f44428T0 = mVar.a(resources);
            HmDevice k12 = t0().k1();
            if (k12 != null && (H3 = k12.H()) != null) {
                str = u0().n0(this.f44428T0, H3.g());
            } else {
                str = null;
            }
            if (str != null) {
                s0().f38791K.setText(str);
            }
        }
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        com.harman.log.f.a(TAG, "changeButtonAccordingToBatteryStatus called");
        HmDevice k12 = t0().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            O o4 = O.f44533a;
            com.harman.log.f.a(TAG, "changeButtonAccordingToBatteryStatus isMockOTAFILEPATH = " + o4.k() + ", enableOTA = " + r0(partyBoxDevice));
            if (!o4.k() && !r0(partyBoxDevice)) {
                y0();
            } else {
                z0();
            }
        }
    }

    private final boolean r0(PartyBoxDevice partyBoxDevice) {
        BatteryInfo f4 = partyBoxDevice.f();
        if (f4 == null) {
            return false;
        }
        if (!f4.a() && !f4.d() && f4.c() < 30) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J3 s0() {
        return (J3) this.f44425Q0.a(this, f44424U0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o t0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f44426R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N u0() {
        return (N) this.f44427S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(HmOTAWhatsNewFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(HmOTAWhatsNewFragment this$0, View view) {
        boolean T22;
        kotlin.jvm.internal.F.p(this$0, "this$0");
        HmDevice k12 = this$0.t0().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            String q4 = com.harman.jbl.partybox.persistence.a.q("LOCAL_FILE_PATH", "");
            if (q4 != null) {
                T22 = kotlin.text.A.T2(q4, partyBoxDevice.Q0(), false, 2, null);
                if (T22) {
                    com.harman.log.f.b(TAG, "enter to upgradeFragment, so set autoBack = false");
                    PartyBoxDashboardActivity.f42403l0.c(false);
                    androidx.navigation.I a4 = C2027m.a();
                    kotlin.jvm.internal.F.o(a4, "actionWhatsNewToUpgradeFragment(...)");
                    com.harman.jbl.partybox.utils.q.f(this$0, a4);
                    return;
                }
            }
            com.harman.log.f.b(TAG, "BLE_LOG HmOTAWhatsNewFragment The OTA bin file not found before starting upgrade!!!!");
            androidx.navigation.fragment.f.a(this$0).r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0() {
        t0().F0(new e());
        com.harman.log.f.a(TAG, "requestWhatsNew called");
    }

    private final void y0() {
        com.harman.log.f.a(TAG, "showUpdateDisabledScreen called");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            s0().f38793M.setVisibility(0);
            s0().f38792L.setEnabled(false);
            s0().f38792L.setBackground(C0669d.i(activity, j.f.f41112v));
            s0().f38792L.setTextColor(C0669d.f(activity, j.d.f40755h1));
        }
    }

    private final void z0() {
        com.harman.log.f.a(TAG, "showUpdateEnabledScreen called");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            s0().f38793M.setVisibility(8);
            s0().f38792L.setEnabled(true);
            s0().f38792L.setBackground(C0669d.i(activity, j.f.f41104t));
            s0().f38792L.setTextColor(C0669d.f(activity, j.d.f40749f1));
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(view, "view");
        super.onViewCreated(view, bundle);
        J3 s02 = s0();
        s02.f38787G.f38735H.setText(getString(j.m.s9));
        s02.f38787G.f38734G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.ota.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HmOTAWhatsNewFragment.v0(HmOTAWhatsNewFragment.this, view2);
            }
        });
        ImageView imageView = s02.f38788H;
        HmDevice k12 = t0().k1();
        if (k12 != null) {
            kotlin.jvm.internal.F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            imageView.setImageResource(com.harman.sdk.utils.d.r(imageView.getContext(), k12.q(), k12.o()));
        }
        s02.f38792L.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.ota.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HmOTAWhatsNewFragment.w0(HmOTAWhatsNewFragment.this, view2);
            }
        });
        t0().p1().k(getViewLifecycleOwner(), new f(new c()));
        t0().Y0().k(getViewLifecycleOwner(), new f(new d()));
    }
}
