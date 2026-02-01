package com.harman.jbl.partybox.ui.micota;

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
import androidx.navigation.I;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.F0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.micota.j;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.widget.ProgressLayout;
import com.harman.sdk.command.MicOTAResultCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.WirelessMicInfo;
import java.util.Arrays;
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
import kotlin.jvm.internal.W;
import kotlin.text.C2220b;

@E(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\bH\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u0004R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082D¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00103R\u0016\u0010;\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u0016\u0010=\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u0016\u0010?\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00106R\u0016\u0010A\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00106R\u0016\u0010C\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010/R\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006K"}, d2 = {"Lcom/harman/jbl/partybox/ui/micota/MicOTAUpgradeFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "z0", "u0", "", "strMessage", "A0", "(Ljava/lang/String;)V", "", "isSetStartedLayout", "y0", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "reqCancelMicOTA", "handleOnBackPressed", "onResume", "onPause", "onDestroy", "Lcom/harman/jbl/partybox/databinding/F0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "r0", "()Lcom/harman/jbl/partybox/databinding/F0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "s0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/micota/l;", "S0", "t0", "()Lcom/harman/jbl/partybox/ui/micota/l;", "micOTAViewModel", "T0", "Z", "isDeviceRespondedPostReboot", "", "U0", "I", "ESTIMATED_TIMER_DURATION", "V0", "Ljava/lang/String;", "time", "W0", "otaDeviceReconnectTime", "X0", "serverVersion", "Y0", "devicePid", "Z0", "productName", com.harman.sdk.utils.k.f48625V, "deviceVersion", "b1", "iSOTASuccessEventSent", "Landroid/os/Handler;", com.harman.sdk.utils.k.f48619T, "Landroid/os/Handler;", "mHandler", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nMicOTAUpgradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicOTAUpgradeFragment.kt\ncom/harman/jbl/partybox/ui/micota/MicOTAUpgradeFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n66#2,4:326\n56#3,10:330\n1#4:340\n*S KotlinDebug\n*F\n+ 1 MicOTAUpgradeFragment.kt\ncom/harman/jbl/partybox/ui/micota/MicOTAUpgradeFragment\n*L\n35#1:326,4\n36#1:330,10\n*E\n"})
/* loaded from: classes2.dex */
public final class MicOTAUpgradeFragment extends BackDispatcherFragment {
    public static final int OTA_FAILED_TIMER_DURATION_2 = 60000;
    public static final int OTA_FAILED_TIMER_DURATION_3 = 120000;

    @l3.d
    public static final String TAG = "MicOTAUpgradeFragment";

    /* renamed from: e1, reason: collision with root package name */
    private static final int f44229e1 = 0;

    /* renamed from: f1, reason: collision with root package name */
    private static final int f44230f1 = 1;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f44231Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f44232R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final A f44233S0;

    /* renamed from: T0, reason: collision with root package name */
    private boolean f44234T0;

    /* renamed from: U0, reason: collision with root package name */
    private final int f44235U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private String f44236V0;

    /* renamed from: W0, reason: collision with root package name */
    private int f44237W0;

    /* renamed from: X0, reason: collision with root package name */
    @l3.d
    private String f44238X0;

    /* renamed from: Y0, reason: collision with root package name */
    @l3.d
    private String f44239Y0;

    /* renamed from: Z0, reason: collision with root package name */
    @l3.d
    private String f44240Z0;

    /* renamed from: a1, reason: collision with root package name */
    @l3.d
    private String f44241a1;

    /* renamed from: b1, reason: collision with root package name */
    private boolean f44242b1;

    /* renamed from: c1, reason: collision with root package name */
    @l3.d
    private final Handler f44243c1;

    /* renamed from: d1, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f44228d1 = {N.u(new PropertyReference1Impl(MicOTAUpgradeFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentMicOtaUpgradeBinding;", 0))};

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
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, F0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f44248N = new b();

        b() {
            super(1, F0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentMicOtaUpgradeBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final F0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return F0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@l3.d Message msg) {
            F.p(msg, "msg");
            super.handleMessage(msg);
            int i4 = msg.what;
            if (i4 != 0) {
                if (i4 == 1) {
                    com.harman.log.f.a(MicOTAUpgradeFragment.TAG, "HmRestartFragment MSG_ESTIMATED_TIMER_UPDATE ");
                    MicOTAUpgradeFragment.this.f44237W0 -= MicOTAUpgradeFragment.this.f44235U0;
                    if (MicOTAUpgradeFragment.this.f44237W0 <= 0) {
                        MicOTAUpgradeFragment.this.f44237W0 = 0;
                    } else {
                        sendEmptyMessageDelayed(1, MicOTAUpgradeFragment.this.f44235U0);
                    }
                    float f4 = MicOTAUpgradeFragment.this.f44237W0 / 60000.0f;
                    if (MicOTAUpgradeFragment.this.getContext() != null) {
                        MicOTAUpgradeFragment.this.f44236V0 = String.valueOf(f4);
                        if (f4 < 1.0d) {
                            f4 = 1.0f;
                        }
                        MicOTAUpgradeFragment.this.f44236V0 = String.valueOf((int) f4);
                        TextView textView = MicOTAUpgradeFragment.this.r0().f38599G;
                        MicOTAUpgradeFragment micOTAUpgradeFragment = MicOTAUpgradeFragment.this;
                        textView.setText(micOTAUpgradeFragment.getString(j.m.M3, micOTAUpgradeFragment.f44236V0));
                        return;
                    }
                    return;
                }
                return;
            }
            com.harman.log.f.a(MicOTAUpgradeFragment.TAG, "HmRestartFragment MSG_OTA_FAILED ");
            if (!MicOTAUpgradeFragment.this.f44234T0) {
                MicOTAUpgradeFragment.this.A0("OTA_CONNECTION_FAILED");
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.l<Boolean, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            T1.a.a("MicOTAUpgradeFragment BLE_LOG requestResultLiveData : on observer");
            MicOTAUpgradeFragment micOTAUpgradeFragment = MicOTAUpgradeFragment.this;
            I b4 = j.b();
            F.o(b4, "actionMicOTAUpgradeFragm…ageDashboardFragment(...)");
            com.harman.jbl.partybox.utils.q.f(micOTAUpgradeFragment, b4);
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements X2.l<MicOTAResultCommand, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(MicOTAResultCommand micOTAResultCommand) {
            c(micOTAResultCommand);
            return H0.f51801a;
        }

        public final void c(MicOTAResultCommand micOTAResultCommand) {
            T1.a.a("MicOTAUpgradeFragment BLE_LOG oTAResultLiveData : on observer");
            if (micOTAResultCommand.z() == 1) {
                MicOTAUpgradeFragment.this.y0(true);
            } else if (micOTAResultCommand.z() == 2) {
                MicOTAUpgradeFragment.this.A0("OTA_CONNECTION_FAILED");
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class f implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f44252a;

        f(X2.l function) {
            F.p(function, "function");
            this.f44252a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f44252a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f44252a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public MicOTAUpgradeFragment() {
        super(j.i.f41547t0);
        this.f44231Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f44248N);
        this.f44232R0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.micota.MicOTAUpgradeFragment$special$$inlined$viewModels$default$1
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
        this.f44233S0 = FragmentViewModelLazyKt.c(this, N.d(l.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.micota.MicOTAUpgradeFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.micota.MicOTAUpgradeFragment$special$$inlined$viewModels$default$3
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
        this.f44235U0 = 30000;
        this.f44236V0 = "";
        this.f44237W0 = OTA_FAILED_TIMER_DURATION_3;
        this.f44238X0 = "";
        this.f44239Y0 = "";
        this.f44240Z0 = "";
        this.f44241a1 = "";
        this.f44243c1 = new c(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(String str) {
        if (isAdded() && isVisible()) {
            this.f44234T0 = true;
            this.f44243c1.removeCallbacksAndMessages(null);
            j.a g4 = j.a().g(this.f44239Y0).j(str).l(this.f44238X0).f(this.f44241a1).k(this.f44240Z0).g(this.f44239Y0);
            F.o(g4, "setDevicePid(...)");
            com.harman.jbl.partybox.utils.q.f(this, g4);
        }
    }

    private final void onBtnBackClick() {
        if (!com.harman.jbl.partybox.utils.g.c(1000L) && isAdded() && isVisible()) {
            MicOTAExitDialogFragment.Companion.a().show(getChildFragmentManager(), MicOTAExitDialogFragment.TAG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F0 r0() {
        return (F0) this.f44231Q0.a(this, f44228d1[0]);
    }

    private final com.harman.jbl.partybox.ui.main.o s0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f44232R0.getValue();
    }

    private final l t0() {
        return (l) this.f44233S0.getValue();
    }

    private final void u0() {
        com.harman.log.f.a(TAG, "HmRestartFragment  onBackPressed");
        onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v0(MicOTAUpgradeFragment this$0, View view, int i4, KeyEvent keyEvent) {
        F.p(this$0, "this$0");
        if (keyEvent.getAction() == 1 && i4 == 4) {
            com.harman.log.f.a(TAG, "restart back press !!!");
            this$0.u0();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(MicOTAUpgradeFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(MicOTAUpgradeFragment this$0, View view) {
        F.p(this$0, "this$0");
        com.harman.log.f.a(TAG, "HmRestartFragment Done onClick ");
        I b4 = j.b();
        F.o(b4, "actionMicOTAUpgradeFragm…ageDashboardFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, b4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(boolean z3) {
        this.f44234T0 = true;
        String str = null;
        this.f44243c1.removeCallbacksAndMessages(null);
        if (z3 && r0().f38598F.getVisibility() != 0) {
            com.harman.log.f.a(TAG, "HmRestartFragment setStartedLayout update OTA Success UI");
            requireActivity().getWindow().clearFlags(128);
            if (s0().k1() != null) {
                if (isAdded() && !this.f44242b1) {
                    this.f44242b1 = true;
                }
                F0 r02 = r0();
                r02.f38604L.setVisibility(8);
                r02.f38598F.setVisibility(0);
                r02.f38607O.setVisibility(0);
                r02.f38607O.setText(getString(j.m.ia));
                HmDevice k12 = s0().k1();
                if (k12 != null) {
                    F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
                    WirelessMicInfo v12 = ((PartyBoxDevice) k12).v1();
                    if (v12 != null) {
                        str = v12.b();
                    }
                }
                TextView textView = r02.f38606N;
                W w3 = W.f52310a;
                String string = getString(j.m.f41717Y);
                F.o(string, "getString(...)");
                Object[] objArr = new Object[1];
                if (str == null) {
                    str = this.f44238X0;
                }
                objArr[0] = str;
                String format = String.format(string, Arrays.copyOf(objArr, 1));
                F.o(format, "format(...)");
                textView.setText(format);
                r02.f38608P.setVisibility(4);
                r02.f38599G.setVisibility(8);
                r02.f38602J.N();
            }
        }
    }

    private final void z0() {
        r0().f38602J.setProgress(100);
        r0().f38602J.P();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r1 == null) goto L25;
     */
    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@l3.e android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            androidx.fragment.app.g r4 = r3.requireActivity()
            android.view.Window r4 = r4.getWindow()
            r0 = 128(0x80, float:1.794E-43)
            r4.addFlags(r0)
            android.os.Bundle r4 = r3.getArguments()
            r0 = 0
            if (r4 == 0) goto L1c
            com.harman.jbl.partybox.ui.micota.g r4 = com.harman.jbl.partybox.ui.micota.g.fromBundle(r4)
            goto L1d
        L1c:
            r4 = r0
        L1d:
            if (r4 == 0) goto L24
            java.lang.String r1 = r4.c()
            goto L25
        L24:
            r1 = r0
        L25:
            java.lang.String r2 = ""
            if (r1 != 0) goto L2a
            r1 = r2
        L2a:
            r3.f44241a1 = r1
            if (r4 == 0) goto L33
            java.lang.String r1 = r4.e()
            goto L34
        L33:
            r1 = r0
        L34:
            if (r1 != 0) goto L37
            r1 = r2
        L37:
            r3.f44240Z0 = r1
            com.harman.jbl.partybox.ui.main.o r1 = r3.s0()
            com.harman.sdk.device.HmDevice r1 = r1.k1()
            if (r1 == 0) goto L53
            com.harman.sdk.device.PartyBoxDevice r1 = (com.harman.sdk.device.PartyBoxDevice) r1
            com.harman.sdk.message.WirelessMicInfo r1 = r1.v1()
            if (r1 == 0) goto L50
            java.lang.String r1 = r1.b()
            goto L51
        L50:
            r1 = r0
        L51:
            if (r1 != 0) goto L54
        L53:
            r1 = r2
        L54:
            r3.f44238X0 = r1
            if (r4 == 0) goto L5c
            java.lang.String r0 = r4.d()
        L5c:
            if (r0 != 0) goto L5f
            goto L60
        L5f:
            r2 = r0
        L60:
            r3.f44239Y0 = r2
            com.harman.jbl.partybox.ui.micota.l r4 = r3.t0()
            com.harman.jbl.partybox.ui.main.o r0 = r3.s0()
            com.harman.sdk.device.HmDevice r0 = r0.k1()
            r4.Y(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.micota.MicOTAUpgradeFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.harman.log.f.a(TAG, "HmRestartFragment  onDestroy");
        requireActivity().getWindow().clearFlags(128);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f44243c1.removeCallbacksAndMessages(null);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onPause() {
        com.harman.log.f.a(TAG, "HmRestartFragment  onPause");
        super.onPause();
        if (this.f44242b1) {
            com.harman.log.f.a(TAG, "HmRestartFragment  onPause iSOTASuccessEventSent = true");
        } else {
            com.harman.log.f.a(TAG, "HmRestartFragment  onPause progressLayout.stopAnimate()");
            r0().f38602J.Q();
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onResume() {
        com.harman.log.f.a(TAG, "HmRestartFragment  onResume");
        super.onResume();
        if (this.f44242b1) {
            return;
        }
        com.harman.log.f.a(TAG, "HmRestartFragment  onResume START");
        requireView().setFocusableInTouchMode(true);
        requireView().requestFocus();
        requireView().setOnKeyListener(new View.OnKeyListener() { // from class: com.harman.jbl.partybox.ui.micota.d
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                boolean v02;
                v02 = MicOTAUpgradeFragment.v0(MicOTAUpgradeFragment.this, view, i4, keyEvent);
                return v02;
            }
        });
        r0().f38602J.P();
        com.harman.log.f.a(TAG, "HmRestartFragment  onResume END");
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        PartyBoxDevice partyBoxDevice;
        int i4;
        PartyBoxDevice partyBoxDevice2;
        int a4;
        Integer num;
        int a5;
        Integer num2;
        int a6;
        WirelessMicInfo v12;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        z0();
        HmDevice k12 = s0().k1();
        Integer num3 = null;
        if (k12 instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) k12;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null && (v12 = partyBoxDevice.v1()) != null && com.harman.jbl.partybox.firmware.d.f40541a.d(v12) == 1) {
            this.f44236V0 = "1 " + getString(j.m.M9);
            i4 = 60000;
        } else {
            this.f44236V0 = "2 " + getString(j.m.M9);
            i4 = OTA_FAILED_TIMER_DURATION_3;
        }
        this.f44237W0 = i4;
        F0 r02 = r0();
        r02.f38600H.f38734G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.micota.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MicOTAUpgradeFragment.w0(MicOTAUpgradeFragment.this, view2);
            }
        });
        r02.f38600H.f38735H.setText(getString(j.m.b4));
        r02.f38598F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.micota.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MicOTAUpgradeFragment.x0(MicOTAUpgradeFragment.this, view2);
            }
        });
        r02.f38598F.setVisibility(4);
        r02.f38599G.setText(getString(j.m.M3, this.f44236V0));
        HmDevice k13 = s0().k1();
        if (k13 instanceof PartyBoxDevice) {
            partyBoxDevice2 = (PartyBoxDevice) k13;
        } else {
            partyBoxDevice2 = null;
        }
        if (partyBoxDevice2 != null) {
            WirelessMicInfo v13 = partyBoxDevice2.v1();
            if (v13 != null && com.harman.jbl.partybox.firmware.d.f40541a.a(v13)) {
                ProgressLayout progressLayout = r02.f38602J;
                WirelessMicInfo v14 = partyBoxDevice2.v1();
                if (v14 != null) {
                    num2 = Integer.valueOf(v14.e());
                } else {
                    num2 = null;
                }
                String o4 = partyBoxDevice2.o();
                if (o4 != null) {
                    a6 = C2220b.a(16);
                    num3 = Integer.valueOf(Integer.parseInt(o4, a6));
                }
                progressLayout.setCenterImage(w.a(num2, num3));
            } else {
                WirelessMicInfo v15 = partyBoxDevice2.v1();
                if (v15 != null && com.harman.jbl.partybox.firmware.d.f40541a.b(v15)) {
                    ProgressLayout progressLayout2 = r02.f38602J;
                    WirelessMicInfo v16 = partyBoxDevice2.v1();
                    if (v16 != null) {
                        num = Integer.valueOf(v16.j());
                    } else {
                        num = null;
                    }
                    String o5 = partyBoxDevice2.o();
                    if (o5 != null) {
                        a5 = C2220b.a(16);
                        num3 = Integer.valueOf(Integer.parseInt(o5, a5));
                    }
                    progressLayout2.setCenterImage(w.a(num, num3));
                } else {
                    ProgressLayout progressLayout3 = r02.f38602J;
                    String o6 = partyBoxDevice2.o();
                    if (o6 != null) {
                        a4 = C2220b.a(16);
                        num3 = Integer.valueOf(Integer.parseInt(o6, a4));
                    }
                    progressLayout3.setCenterImage(w.a(3, num3));
                }
            }
        }
        this.f44243c1.sendEmptyMessageDelayed(1, this.f44235U0);
        this.f44243c1.sendEmptyMessageDelayed(0, this.f44237W0);
        com.harman.log.f.a(TAG, "HmRestartFragment  onCreateView END");
        t0().g0().k(getViewLifecycleOwner(), new f(new d()));
        t0().f0().k(getViewLifecycleOwner(), new f(new e()));
    }

    public final void reqCancelMicOTA() {
        HmDevice k12 = s0().k1();
        if (k12 != null) {
            t0().j0(k12);
        }
    }
}
