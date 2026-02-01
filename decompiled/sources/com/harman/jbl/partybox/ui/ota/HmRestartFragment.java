package com.harman.jbl.partybox.ui.ota;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
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
import com.harman.jbl.partybox.databinding.H3;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.core.PartyBoxDashboardActivity;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.ota.x;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.ota.RemoteOTAConfig;
import com.harman.sdk.utils.DeviceProtocol;
import java.util.Arrays;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.W;

@kotlin.E(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 O2\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\bN\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0004R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00109\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00101R\u0016\u0010;\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u0016\u0010=\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00104R\u0016\u0010?\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00104R\u0016\u0010A\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00104R\u0016\u0010C\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00104R\u0016\u0010E\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010-R\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000b0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006Q"}, d2 = {"Lcom/harman/jbl/partybox/ui/ota/HmRestartFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "F0", "x0", "", "strMessage", "G0", "(Ljava/lang/String;)V", "", "isSetStartedLayout", "E0", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "onResume", "onPause", "onDestroy", "Lcom/harman/jbl/partybox/databinding/H3;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "u0", "()Lcom/harman/jbl/partybox/databinding/H3;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "v0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/ota/N;", "S0", "w0", "()Lcom/harman/jbl/partybox/ui/ota/N;", "sharedOtaViewModel", "T0", "Z", "isDeviceRespondedPostReboot", "", "U0", "I", "ESTIMATED_TIMER_DURATION", "V0", "Ljava/lang/String;", "time", "W0", "mUpgradeSpeakerMAC", "X0", "otaDeviceReconnectTime", "Y0", "serverVersion", "Z0", "devicePid", com.harman.sdk.utils.k.f48625V, "deviceMid", "b1", "productName", com.harman.sdk.utils.k.f48619T, "deviceVersion", "d1", "iSOTASuccessEventSent", "Landroid/os/Handler;", "e1", "Landroid/os/Handler;", "mHandler", "Landroidx/lifecycle/Q;", "f1", "Landroidx/lifecycle/Q;", "otaRestartObr", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nHmRestartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HmRestartFragment.kt\ncom/harman/jbl/partybox/ui/ota/HmRestartFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,380:1\n66#2,4:381\n56#3,10:385\n1#4:395\n*S KotlinDebug\n*F\n+ 1 HmRestartFragment.kt\ncom/harman/jbl/partybox/ui/ota/HmRestartFragment\n*L\n40#1:381,4\n41#1:385,10\n*E\n"})
/* loaded from: classes2.dex */
public final class HmRestartFragment extends BackDispatcherFragment {
    public static final int OTA_FAILED_TIMER_DURATION = 420000;

    @l3.d
    public static final String TAG = "HmRestartFragment";

    /* renamed from: h1, reason: collision with root package name */
    private static final int f44439h1 = 0;

    /* renamed from: i1, reason: collision with root package name */
    private static final int f44440i1 = 1;

    /* renamed from: j1, reason: collision with root package name */
    private static final int f44441j1 = 2;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f44442Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f44443R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f44444S0;

    /* renamed from: T0, reason: collision with root package name */
    private boolean f44445T0;

    /* renamed from: U0, reason: collision with root package name */
    private final int f44446U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private String f44447V0;

    /* renamed from: W0, reason: collision with root package name */
    @l3.d
    private String f44448W0;

    /* renamed from: X0, reason: collision with root package name */
    private int f44449X0;

    /* renamed from: Y0, reason: collision with root package name */
    @l3.d
    private String f44450Y0;

    /* renamed from: Z0, reason: collision with root package name */
    @l3.d
    private String f44451Z0;

    /* renamed from: a1, reason: collision with root package name */
    @l3.d
    private String f44452a1;

    /* renamed from: b1, reason: collision with root package name */
    @l3.d
    private String f44453b1;

    /* renamed from: c1, reason: collision with root package name */
    @l3.d
    private String f44454c1;

    /* renamed from: d1, reason: collision with root package name */
    private boolean f44455d1;

    /* renamed from: e1, reason: collision with root package name */
    @l3.d
    private final Handler f44456e1;

    /* renamed from: f1, reason: collision with root package name */
    @l3.d
    private final Q<Boolean> f44457f1;

    /* renamed from: g1, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f44438g1 = {kotlin.jvm.internal.N.u(new PropertyReference1Impl(HmRestartFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/OtaRestartFragmentBinding;", 0))};

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
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, H3> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f44462N = new b();

        b() {
            super(1, H3.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/OtaRestartFragmentBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final H3 C(@l3.d View p02) {
            kotlin.jvm.internal.F.p(p02, "p0");
            return H3.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@l3.d Message msg) {
            kotlin.jvm.internal.F.p(msg, "msg");
            super.handleMessage(msg);
            int i4 = msg.what;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        com.harman.log.f.a(HmRestartFragment.TAG, "HmRestartFragment  startScanAfterOTA");
                        HmRestartFragment.this.v0().i3();
                        HmDevice k12 = HmRestartFragment.this.v0().k1();
                        if (k12 != null) {
                            HmRestartFragment.this.w0().C0(k12);
                            return;
                        }
                        return;
                    }
                    return;
                }
                com.harman.log.f.a(HmRestartFragment.TAG, "HmRestartFragment MSG_ESTIMATED_TIMER_UPDATE ");
                HmRestartFragment.this.f44449X0 -= HmRestartFragment.this.f44446U0;
                if (HmRestartFragment.this.f44449X0 <= 0) {
                    HmRestartFragment.this.f44449X0 = 0;
                } else {
                    sendEmptyMessageDelayed(1, HmRestartFragment.this.f44446U0);
                }
                float f4 = HmRestartFragment.this.f44449X0 / 60000.0f;
                if (HmRestartFragment.this.getContext() != null) {
                    HmRestartFragment hmRestartFragment = HmRestartFragment.this;
                    hmRestartFragment.f44447V0 = f4 + " " + hmRestartFragment.getString(j.m.M9);
                    double d4 = (double) f4;
                    if (d4 < 1.0d) {
                        HmRestartFragment hmRestartFragment2 = HmRestartFragment.this;
                        hmRestartFragment2.f44447V0 = ((int) (f4 * 60)) + " " + hmRestartFragment2.getString(j.m.N9);
                    } else if (d4 == 1.0d || d4 == 2.0d) {
                        HmRestartFragment hmRestartFragment3 = HmRestartFragment.this;
                        hmRestartFragment3.f44447V0 = ((int) f4) + " " + hmRestartFragment3.getString(j.m.M9);
                    }
                    HmRestartFragment hmRestartFragment4 = HmRestartFragment.this;
                    String string = hmRestartFragment4.getString(j.m.L9, hmRestartFragment4.f44447V0);
                    kotlin.jvm.internal.F.o(string, "getString(...)");
                    HmRestartFragment.this.u0().f38697G.setText(string);
                    return;
                }
                return;
            }
            com.harman.log.f.a(HmRestartFragment.TAG, "HmRestartFragment MSG_OTA_FAILED ");
            if (!HmRestartFragment.this.f44445T0) {
                HmRestartFragment.this.G0("OTA_CONNECTION_FAILED");
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.l<UiPage, H0> {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44465a;

            static {
                int[] iArr = new int[UiPage.values().length];
                try {
                    iArr[UiPage.DISCOVERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f44465a = iArr;
            }
        }

        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(UiPage uiPage) {
            c(uiPage);
            return H0.f51801a;
        }

        public final void c(UiPage uiPage) {
            if (uiPage != null) {
                HmRestartFragment hmRestartFragment = HmRestartFragment.this;
                com.harman.log.f.a(HmRestartFragment.TAG, "BLE_LOG updateUiPage and page is : " + uiPage);
                if (a.f44465a[uiPage.ordinal()] == 1) {
                    com.harman.log.f.a(HmRestartFragment.TAG, "BLE_LOG Device disconnected during OTA, so display OTA fail");
                    hmRestartFragment.G0("OTA_CONNECTION_FAILED");
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class e implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f44466a;

        e(X2.l function) {
            kotlin.jvm.internal.F.p(function, "function");
            this.f44466a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f44466a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return kotlin.jvm.internal.F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f44466a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public HmRestartFragment() {
        super(j.i.f41405J2);
        this.f44442Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f44462N);
        this.f44443R0 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.ota.HmRestartFragment$special$$inlined$viewModels$default$1
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
        this.f44444S0 = FragmentViewModelLazyKt.c(this, kotlin.jvm.internal.N.d(N.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.ota.HmRestartFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.ota.HmRestartFragment$special$$inlined$viewModels$default$3
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
        this.f44446U0 = 30000;
        this.f44447V0 = "";
        this.f44448W0 = "";
        this.f44449X0 = OTA_FAILED_TIMER_DURATION;
        this.f44450Y0 = "";
        this.f44451Z0 = "";
        this.f44452a1 = "";
        this.f44453b1 = "";
        this.f44454c1 = "";
        this.f44456e1 = new c(Looper.getMainLooper());
        this.f44457f1 = new Q() { // from class: com.harman.jbl.partybox.ui.ota.t
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                HmRestartFragment.B0(HmRestartFragment.this, ((Boolean) obj).booleanValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(HmRestartFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        com.harman.log.f.a(TAG, "HmRestartFragment Done onClick ");
        com.harman.log.f.b(TAG, "ota success, so set autoBack = true");
        PartyBoxDashboardActivity.f42403l0.c(true);
        if (com.harman.sdk.utils.d.H(this$0.f44451Z0)) {
            androidx.navigation.I c4 = x.c();
            kotlin.jvm.internal.F.o(c4, "actionRestartFragmentToStageDashboardFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this$0, c4);
        } else {
            androidx.navigation.I a4 = x.a();
            kotlin.jvm.internal.F.o(a4, "actionRestartFragmentToDashboard(...)");
            com.harman.jbl.partybox.utils.q.f(this$0, a4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(final HmRestartFragment this$0, boolean z3) {
        String str;
        kotlin.jvm.internal.F.p(this$0, "this$0");
        com.harman.log.f.d(TAG, "otaRestartLiveData Observer, Device Connected back after OTA, so check for FW version");
        if (z3) {
            com.harman.log.f.a(TAG, "HmRestartFragment  setOtaRestartPhase to false");
            final HmDevice k12 = this$0.v0().k1();
            if (k12 != null) {
                PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
                RemoteOTAConfig H3 = k12.H();
                String str2 = null;
                if (H3 != null) {
                    str = H3.f();
                } else {
                    str = null;
                }
                com.harman.log.f.d(TAG, "HmRestartFragment Server Firmware version = " + str + ", Device Firmware version = " + k12.w());
                RemoteOTAConfig H4 = k12.H();
                if (H4 != null) {
                    str2 = H4.f();
                }
                if (com.harman.jbl.partybox.firmware.f.a(str2, k12.w()) == 0) {
                    com.harman.log.f.d(TAG, "show update ok");
                    partyBoxDevice.h2(false);
                    partyBoxDevice.x2(k12.w());
                    this$0.v0().R2();
                    if (this$0.v0().k1() != null) {
                        com.harman.log.f.a(TAG, "HmRestartFragment  setOtaRestartPhase to false");
                    }
                    if (this$0.getActivity() != null && this$0.isAdded()) {
                        this$0.requireActivity().runOnUiThread(new Runnable() { // from class: com.harman.jbl.partybox.ui.ota.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                HmRestartFragment.C0(HmRestartFragment.this);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (this$0.getActivity() != null && this$0.isAdded()) {
                    this$0.requireActivity().runOnUiThread(new Runnable() { // from class: com.harman.jbl.partybox.ui.ota.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            HmRestartFragment.D0(HmDevice.this, this$0);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(HmRestartFragment this$0) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.E0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(HmDevice dev, HmRestartFragment this$0) {
        kotlin.jvm.internal.F.p(dev, "$dev");
        kotlin.jvm.internal.F.p(this$0, "this$0");
        ((PartyBoxDevice) dev).h2(true);
        this$0.v0().R2();
        com.harman.log.f.d(TAG, "show update failed as FW did not match");
        this$0.G0(com.harman.jbl.partybox.constants.a.f38323D);
    }

    private final void E0(boolean z3) {
        if (this.f44448W0.length() > 0) {
            com.harman.jbl.partybox.persistence.a.t(com.harman.jbl.partybox.constants.a.f38327H, this.f44448W0);
        }
        this.f44445T0 = true;
        String str = null;
        this.f44456e1.removeCallbacksAndMessages(null);
        if (z3 && u0().f38696F.getVisibility() != 0) {
            com.harman.log.f.a(TAG, "HmRestartFragment setStartedLayout update OTA Success UI");
            requireActivity().getWindow().clearFlags(128);
            if (v0().k1() != null) {
                if (isAdded() && !this.f44455d1) {
                    this.f44455d1 = true;
                    v0().t2((int) w0().r0(), this.f44454c1, this.f44450Y0, "success");
                }
                H3 u02 = u0();
                u02.f38698H.f38734G.setVisibility(0);
                u02.f38702L.setVisibility(8);
                u02.f38696F.setVisibility(0);
                u02.f38705O.setVisibility(0);
                u02.f38705O.setText(getString(j.m.ia));
                HmDevice k12 = v0().k1();
                if (k12 != null) {
                    kotlin.jvm.internal.F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
                    str = ((PartyBoxDevice) k12).p1();
                }
                TextView textView = u02.f38704N;
                W w3 = W.f52310a;
                String string = getString(j.m.f41717Y);
                kotlin.jvm.internal.F.o(string, "getString(...)");
                Object[] objArr = new Object[1];
                if (str == null) {
                    str = this.f44450Y0;
                }
                objArr[0] = str;
                String format = String.format(string, Arrays.copyOf(objArr, 1));
                kotlin.jvm.internal.F.o(format, "format(...)");
                textView.setText(format);
                u02.f38706P.setVisibility(4);
                u02.f38697G.setVisibility(8);
                u02.f38700J.N();
                if (!com.harman.jbl.partybox.persistence.a.h("auto_ota_test")) {
                    com.harman.sdk.utils.f.g(com.harman.jbl.partybox.persistence.a.q("LOCAL_FILE_PATH", ""));
                }
            }
        }
    }

    private final void F0() {
        u0().f38700J.setProgress(100);
        u0().f38700J.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0(String str) {
        com.harman.log.f.a(TAG, "showFailedScreen  strMessage = " + str + ", devicePid =" + this.f44451Z0 + ", deviceMid = " + this.f44452a1);
        this.f44445T0 = true;
        this.f44456e1.removeCallbacksAndMessages(null);
        x.a j4 = x.b().k(this.f44451Z0).l(str).n(this.f44450Y0).g(this.f44454c1).m(this.f44453b1).j(this.f44452a1);
        kotlin.jvm.internal.F.o(j4, "setDeviceMid(...)");
        com.harman.jbl.partybox.utils.q.f(this, j4);
    }

    private final void onBtnBackClick() {
        com.harman.log.f.a(TAG, "HmRestartFragment onBtnBackClick onClick ");
        if (com.harman.sdk.utils.d.H(this.f44451Z0)) {
            androidx.navigation.I c4 = x.c();
            kotlin.jvm.internal.F.o(c4, "actionRestartFragmentToStageDashboardFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this, c4);
        } else {
            androidx.navigation.I a4 = x.a();
            kotlin.jvm.internal.F.o(a4, "actionRestartFragmentToDashboard(...)");
            com.harman.jbl.partybox.utils.q.f(this, a4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H3 u0() {
        return (H3) this.f44442Q0.a(this, f44438g1[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o v0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f44443R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N w0() {
        return (N) this.f44444S0.getValue();
    }

    private final void x0() {
        com.harman.log.f.a(TAG, "HmRestartFragment  onBackPressed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y0(HmRestartFragment this$0, View view, int i4, KeyEvent keyEvent) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (keyEvent.getAction() == 1 && i4 == 4) {
            com.harman.log.f.a(TAG, "restart back press !!!");
            this$0.x0();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(HmRestartFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        u uVar;
        String str;
        String str2;
        String str3;
        String str4;
        super.onCreate(bundle);
        requireActivity().getWindow().addFlags(128);
        Bundle arguments = getArguments();
        String str5 = null;
        if (arguments != null) {
            uVar = u.fromBundle(arguments);
        } else {
            uVar = null;
        }
        if (uVar != null) {
            str = uVar.c();
        } else {
            str = null;
        }
        String str6 = "";
        if (str == null) {
            str = "";
        }
        this.f44454c1 = str;
        if (uVar != null) {
            str2 = uVar.f();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        this.f44453b1 = str2;
        if (uVar != null) {
            str3 = uVar.g();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        this.f44450Y0 = str3;
        if (uVar != null) {
            str4 = uVar.e();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        this.f44451Z0 = str4;
        if (uVar != null) {
            str5 = uVar.d();
        }
        if (str5 != null) {
            str6 = str5;
        }
        this.f44452a1 = str6;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.harman.log.f.a(TAG, "HmRestartFragment  onDestroy");
        requireActivity().getWindow().clearFlags(128);
        w0().s0().p(this.f44457f1);
        this.f44456e1.removeMessages(2);
        com.harman.log.f.a(TAG, "HmRestartFragment  setOtaRestartPhase to false");
        super.onDestroy();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f44455d1) {
            return;
        }
        u0().f38700J.Q();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onResume() {
        Boolean bool;
        super.onResume();
        if (this.f44455d1) {
            return;
        }
        com.harman.log.f.a(TAG, "HmRestartFragment  onResume START");
        requireView().setFocusableInTouchMode(true);
        requireView().requestFocus();
        requireView().setOnKeyListener(new View.OnKeyListener() { // from class: com.harman.jbl.partybox.ui.ota.o
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                boolean y02;
                y02 = HmRestartFragment.y0(HmRestartFragment.this, view, i4, keyEvent);
                return y02;
            }
        });
        u0().f38700J.P();
        com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
        B2.c k4 = bVar.k();
        if (k4 != null) {
            bool = Boolean.valueOf(k4.k(DeviceProtocol.PROTOCOL_BLE));
        } else {
            bool = null;
        }
        com.harman.log.f.a(TAG, "HmRestartFragment  onResume isScanInProgress " + bool);
        B2.c k5 = bVar.k();
        if (k5 != null && !k5.k(DeviceProtocol.PROTOCOL_BLE)) {
            com.harman.log.f.a(TAG, "HmRestartFragment  postDelayed runnableStartScanAfterOTA");
            this.f44456e1.removeMessages(2);
            this.f44456e1.sendEmptyMessageDelayed(2, 10000L);
        }
        com.harman.log.f.a(TAG, "HmRestartFragment  onResume END");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c7, code lost:
    
        if (r5 == null) goto L17;
     */
    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(@l3.d android.view.View r4, @l3.e android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.ota.HmRestartFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
