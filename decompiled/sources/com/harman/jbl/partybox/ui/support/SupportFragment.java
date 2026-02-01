package com.harman.jbl.partybox.ui.support;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.harman.jbl.partybox.databinding.C1918p1;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.WirelessMicInfo;
import com.harman.sdk.setting.ProductConfig;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.Pair;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.text.C2220b;

@E(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 52\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b4\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0004R\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010.R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102¨\u00067"}, d2 = {"Lcom/harman/jbl/partybox/ui/support/SupportFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "initData", "()V", "initView", "Lcom/harman/sdk/message/WirelessMicInfo;", "wirelessMicInfo", "O0", "(Lcom/harman/sdk/message/WirelessMicInfo;)V", "U0", "V0", "W0", "", "A0", "()Z", "onBtnBackClick", "P0", "isUpdateAvailable", "S0", "(Z)V", "Q0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "onBtnLEAudioClick", "Lcom/harman/jbl/partybox/databinding/p1;", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "B0", "()Lcom/harman/jbl/partybox/databinding/p1;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "C0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/support/x;", "D0", "()Lcom/harman/jbl/partybox/ui/support/x;", "viewModel", "T0", "Z", "showUsageSummary", "showAuracastSQ", "Lcom/harman/jbl/partybox/utils/r;", "Lcom/harman/jbl/partybox/utils/r;", "viewUtils", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nSupportFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportFragment.kt\ncom/harman/jbl/partybox/ui/support/SupportFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,454:1\n66#2,4:455\n56#3,10:459\n262#4,2:469\n262#4,2:471\n262#4,2:473\n262#4,2:475\n262#4,2:477\n262#4,2:479\n262#4,2:481\n262#4,2:483\n262#4,2:485\n262#4,2:487\n262#4,2:489\n262#4,2:491\n*S KotlinDebug\n*F\n+ 1 SupportFragment.kt\ncom/harman/jbl/partybox/ui/support/SupportFragment\n*L\n42#1:455,4\n43#1:459,10\n119#1:469,2\n120#1:471,2\n121#1:473,2\n233#1:475,2\n239#1:477,2\n245#1:479,2\n248#1:481,2\n251#1:483,2\n254#1:485,2\n278#1:487,2\n287#1:489,2\n296#1:491,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SupportFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "SupportFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f45588Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f45589R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final A f45590S0;

    /* renamed from: T0, reason: collision with root package name */
    private boolean f45591T0;

    /* renamed from: U0, reason: collision with root package name */
    private boolean f45592U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.partybox.utils.r f45593V0;

    /* renamed from: W0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f45587W0 = {N.u(new PropertyReference1Impl(SupportFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentSupportBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final SupportFragment a() {
            return new SupportFragment();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, C1918p1> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f45598N = new b();

        b() {
            super(1, C1918p1.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentSupportBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1918p1 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1918p1.a(p02);
        }
    }

    @U({"SMAP\nSupportFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportFragment.kt\ncom/harman/jbl/partybox/ui/support/SupportFragment$initView$1$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,454:1\n262#2,2:455\n262#2,2:457\n*S KotlinDebug\n*F\n+ 1 SupportFragment.kt\ncom/harman/jbl/partybox/ui/support/SupportFragment$initView$1$2$1\n*L\n93#1:455,2\n99#1:457,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class c implements View.OnClickListener {

        /* renamed from: E, reason: collision with root package name */
        private int f45599E;

        /* renamed from: F, reason: collision with root package name */
        private long f45600F;

        /* renamed from: G, reason: collision with root package name */
        private final int f45601G = 500;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ HmDevice f45603I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ C1918p1 f45604J;

        c(HmDevice hmDevice, C1918p1 c1918p1) {
            this.f45603I = hmDevice;
            this.f45604J = c1918p1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@l3.e View view) {
            this.f45599E++;
            if (this.f45600F == 0) {
                this.f45600F = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f45600F <= this.f45601G) {
                int i4 = this.f45599E;
                int i5 = 8;
                if (i4 == 2) {
                    if (SupportFragment.this.C0().k1() != null) {
                        SupportFragment supportFragment = SupportFragment.this;
                        C1918p1 c1918p1 = this.f45604J;
                        supportFragment.f45591T0 = true;
                        ConstraintLayout usageSummaryContainer = c1918p1.f40021s0;
                        F.o(usageSummaryContainer, "usageSummaryContainer");
                        if (supportFragment.f45591T0) {
                            i5 = 0;
                        }
                        usageSummaryContainer.setVisibility(i5);
                    }
                } else if (i4 == 7 && ((PartyBoxDevice) this.f45603I).G1() && SupportFragment.this.C0().k1() != null) {
                    SupportFragment supportFragment2 = SupportFragment.this;
                    C1918p1 c1918p12 = this.f45604J;
                    supportFragment2.f45592U0 = true;
                    ConstraintLayout auracastSQContainer = c1918p12.f39983G;
                    F.o(auracastSQContainer, "auracastSQContainer");
                    if (supportFragment2.f45592U0) {
                        i5 = 0;
                    }
                    auracastSQContainer.setVisibility(i5);
                }
            } else {
                this.f45599E = 1;
            }
            this.f45600F = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f45605a;

        d(X2.l function) {
            F.p(function, "function");
            this.f45605a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45605a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45605a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.l<H0, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(H0 h02) {
            c(h02);
            return H0.f51801a;
        }

        public final void c(H0 h02) {
            T1.a.a("BLE_LOG SupportFragment deviceFeatureLiveData : " + h02);
            HmDevice k12 = SupportFragment.this.C0().k1();
            if (k12 != null) {
                SupportFragment supportFragment = SupportFragment.this;
                PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
                if (partyBoxDevice.J1()) {
                    supportFragment.U0();
                    supportFragment.D0().A(k12);
                }
                if (partyBoxDevice.K1()) {
                    supportFragment.V0();
                    supportFragment.D0().C(k12);
                }
                if (partyBoxDevice.L1()) {
                    supportFragment.W0();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements X2.l<Pair<? extends Boolean, ? extends String>, H0> {
        f() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Pair<? extends Boolean, ? extends String> pair) {
            c(pair);
            return H0.f51801a;
        }

        public final void c(Pair<Boolean, String> pair) {
            boolean booleanValue = pair.a().booleanValue();
            pair.b();
            SupportFragment.this.S0(booleanValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class g extends Lambda implements X2.l<H0, H0> {
        g() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(H0 h02) {
            c(h02);
            return H0.f51801a;
        }

        public final void c(H0 h02) {
            int i4;
            T1.a.a("BLE_LOG SupportFragment feedbackToneStatus : " + h02);
            HmDevice k12 = SupportFragment.this.C0().k1();
            if (k12 != null) {
                SupportFragment supportFragment = SupportFragment.this;
                boolean z3 = true;
                if (k12.v() != 1) {
                    z3 = false;
                }
                ImageView imageView = supportFragment.B0().f40012j0;
                if (z3) {
                    i4 = j.f.i4;
                } else {
                    i4 = j.f.h4;
                }
                imageView.setImageResource(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class h extends Lambda implements X2.l<H0, H0> {
        h() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(H0 h02) {
            c(h02);
            return H0.f51801a;
        }

        public final void c(H0 h02) {
            int i4;
            T1.a.a("BLE_LOG SupportFragment le audio status : " + h02);
            HmDevice k12 = SupportFragment.this.C0().k1();
            if (k12 != null) {
                ImageView imageView = SupportFragment.this.B0().f39990N;
                if (((PartyBoxDevice) k12).Z0()) {
                    i4 = j.f.i4;
                } else {
                    i4 = j.f.h4;
                }
                imageView.setImageResource(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class i extends Lambda implements X2.l<H0, H0> {
        i() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(H0 h02) {
            c(h02);
            return H0.f51801a;
        }

        public final void c(H0 h02) {
            int i4;
            T1.a.a("BLE_LOG SupportFragment lock Panel status : " + h02);
            HmDevice k12 = SupportFragment.this.C0().k1();
            if (k12 != null) {
                ImageView imageView = SupportFragment.this.B0().f39992P;
                if (((PartyBoxDevice) k12).b1()) {
                    i4 = j.f.i4;
                } else {
                    i4 = j.f.h4;
                }
                imageView.setImageResource(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class j extends Lambda implements X2.l<WirelessMicInfo, H0> {
        j() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(WirelessMicInfo wirelessMicInfo) {
            c(wirelessMicInfo);
            return H0.f51801a;
        }

        public final void c(WirelessMicInfo wirelessMicInfo) {
            SupportFragment.this.O0(wirelessMicInfo);
        }
    }

    public SupportFragment() {
        super(j.i.f41459X0);
        this.f45588Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f45598N);
        this.f45589R0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.support.SupportFragment$special$$inlined$viewModels$default$1
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
        this.f45590S0 = FragmentViewModelLazyKt.c(this, N.d(x.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.support.SupportFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.support.SupportFragment$special$$inlined$viewModels$default$3
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
        this.f45593V0 = new com.harman.jbl.partybox.utils.r();
    }

    private final boolean A0() {
        BluetoothAdapter defaultAdapter;
        int isLeAudioSupported;
        if (Build.VERSION.SDK_INT >= 33 && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
            isLeAudioSupported = defaultAdapter.isLeAudioSupported();
            if (isLeAudioSupported != 10) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1918p1 B0() {
        return (C1918p1) this.f45588Q0.a(this, f45587W0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o C0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f45589R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x D0() {
        return (x) this.f45590S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(SupportFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(SupportFragment this$0, View view) {
        F.p(this$0, "this$0");
        F.n(view, "null cannot be cast to non-null type android.widget.ImageView");
        this$0.f45593V0.a(view);
        if (this$0.C0().k1() != null) {
            boolean z3 = true;
            if (!(!((PartyBoxDevice) r2).Z0())) {
                z3 = false;
            }
            if (this$0.isAdded() && this$0.isVisible()) {
                LEAudioConfirmDialogFragment.Companion.a(z3).show(this$0.getChildFragmentManager(), LEAudioConfirmDialogFragment.TAG);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(SupportFragment this$0, View view) {
        F.p(this$0, "this$0");
        I d4 = w.d();
        F.o(d4, "actionSupportFragmentToRenameDeviceFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, d4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(SupportFragment this$0, View view) {
        F.p(this$0, "this$0");
        I c4 = w.c();
        F.o(c4, "actionSupportFragmentToOtaWhatsNew(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(SupportFragment this$0, View view) {
        F.p(this$0, "this$0");
        I e4 = w.e();
        F.o(e4, "actionToDeviceUsageSummaryFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, e4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(SupportFragment this$0, View view) {
        F.p(this$0, "this$0");
        I b4 = w.b();
        F.o(b4, "actionSupportFragmentToAuracastSQFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, b4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(SupportFragment this$0, View view) {
        F.p(this$0, "this$0");
        I f4 = w.f();
        F.o(f4, "toFactoryResetFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(SupportFragment this$0, View view) {
        int a4;
        String str;
        F.p(this$0, "this$0");
        HmDevice k12 = this$0.C0().k1();
        if (k12 != null) {
            String q4 = k12.q();
            a4 = C2220b.a(16);
            int parseInt = Integer.parseInt(q4, a4);
            if (parseInt != 8031) {
                if (parseInt != 8033) {
                    if (parseInt != 8290) {
                        if (parseInt != 8291) {
                            ProductConfig.ProductItem u3 = com.harman.sdk.utils.d.u(k12.q());
                            if (u3 != null) {
                                str = u3.k();
                            } else {
                                str = null;
                            }
                        } else {
                            str = com.harman.jbl.partybox.constants.a.f38358g;
                        }
                    } else {
                        str = com.harman.jbl.partybox.constants.a.f38360h;
                    }
                } else {
                    str = com.harman.jbl.partybox.constants.a.f38356f;
                }
            } else {
                str = com.harman.jbl.partybox.constants.a.f38352d;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(this$0.requireContext().getPackageManager(), 65536);
            if (resolveActivityInfo != null && resolveActivityInfo.exported) {
                this$0.startActivity(intent);
            } else {
                T1.a.a("SupportFragment app did not find any browser");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(SupportFragment this$0, View view) {
        int i4;
        int i5;
        F.p(this$0, "this$0");
        F.n(view, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) view;
        this$0.f45593V0.a(view);
        HmDevice k12 = this$0.C0().k1();
        if (k12 != null) {
            if (k12.v() == 1) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            k12.s0((byte) i4);
            if (i4 == 1) {
                i5 = j.f.i4;
            } else {
                i5 = j.f.h4;
            }
            imageView.setImageResource(i5);
            this$0.D0().I(k12, k12.v());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(SupportFragment this$0, View view) {
        int i4;
        F.p(this$0, "this$0");
        F.n(view, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) view;
        this$0.f45593V0.a(view);
        HmDevice k12 = this$0.C0().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            boolean z3 = !partyBoxDevice.b1();
            partyBoxDevice.l2(z3);
            if (z3) {
                i4 = j.f.i4;
            } else {
                i4 = j.f.h4;
            }
            imageView.setImageResource(i4);
            this$0.D0().K(k12, partyBoxDevice.b1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(WirelessMicInfo wirelessMicInfo) {
        H0 h02;
        boolean z3;
        boolean z4;
        C1918p1 B02 = B0();
        if (wirelessMicInfo != null) {
            if (wirelessMicInfo.m() == 0) {
                ConstraintLayout micUpdateLayout = B02.f39999W;
                F.o(micUpdateLayout, "micUpdateLayout");
                com.harman.jbl.partybox.utils.q.c(micUpdateLayout);
            } else {
                ConstraintLayout micUpdateLayout2 = B02.f39999W;
                F.o(micUpdateLayout2, "micUpdateLayout");
                com.harman.jbl.partybox.utils.q.i(micUpdateLayout2);
                int d4 = com.harman.jbl.partybox.firmware.d.f40541a.d(wirelessMicInfo);
                int m4 = wirelessMicInfo.m();
                int i4 = 8;
                String str = "";
                boolean z5 = true;
                if (m4 != 1) {
                    if (m4 != 2) {
                        if (m4 == 3) {
                            if (!TextUtils.isEmpty(wirelessMicInfo.f()) && wirelessMicInfo.e() > 2 && !TextUtils.isEmpty(wirelessMicInfo.k()) && wirelessMicInfo.j() > 2) {
                                TextView micSoftwareVersion = B02.f39996T;
                                F.o(micSoftwareVersion, "micSoftwareVersion");
                                micSoftwareVersion.setVisibility(0);
                                TextView textView = B02.f39996T;
                                int i5 = j.m.Q3;
                                Object[] objArr = new Object[2];
                                String f4 = wirelessMicInfo.f();
                                if (f4 == null) {
                                    f4 = "";
                                }
                                objArr[0] = f4;
                                String k4 = wirelessMicInfo.k();
                                if (k4 != null) {
                                    str = k4;
                                }
                                objArr[1] = str;
                                textView.setText(getString(i5, objArr));
                            } else if (!TextUtils.isEmpty(wirelessMicInfo.f()) && wirelessMicInfo.e() > 2) {
                                TextView micSoftwareVersion2 = B02.f39996T;
                                F.o(micSoftwareVersion2, "micSoftwareVersion");
                                micSoftwareVersion2.setVisibility(0);
                                TextView textView2 = B02.f39996T;
                                int i6 = j.m.t9;
                                Object[] objArr2 = new Object[1];
                                String f5 = wirelessMicInfo.f();
                                if (f5 != null) {
                                    str = f5;
                                }
                                objArr2[0] = str;
                                textView2.setText(getString(i6, objArr2));
                            } else if (!TextUtils.isEmpty(wirelessMicInfo.k()) && wirelessMicInfo.e() > 2) {
                                TextView micSoftwareVersion3 = B02.f39996T;
                                F.o(micSoftwareVersion3, "micSoftwareVersion");
                                micSoftwareVersion3.setVisibility(0);
                                TextView textView3 = B02.f39996T;
                                int i7 = j.m.t9;
                                Object[] objArr3 = new Object[1];
                                String k5 = wirelessMicInfo.k();
                                if (k5 != null) {
                                    str = k5;
                                }
                                objArr3[0] = str;
                                textView3.setText(getString(i7, objArr3));
                            } else {
                                TextView micSoftwareVersion4 = B02.f39996T;
                                F.o(micSoftwareVersion4, "micSoftwareVersion");
                                micSoftwareVersion4.setVisibility(8);
                            }
                            if (d4 != 1) {
                                if (d4 == 2) {
                                    B02.f39998V.setVisibility(0);
                                    B02.f39998V.setText(getString(j.m.c4));
                                }
                            } else {
                                B02.f39998V.setVisibility(0);
                                B02.f39998V.setText(getString(j.m.f4));
                            }
                        }
                    } else {
                        B02.f39998V.setVisibility(8);
                        TextView micSoftwareVersion5 = B02.f39996T;
                        F.o(micSoftwareVersion5, "micSoftwareVersion");
                        if (!TextUtils.isEmpty(wirelessMicInfo.k()) && wirelessMicInfo.j() > 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            i4 = 0;
                        }
                        micSoftwareVersion5.setVisibility(i4);
                        TextView textView4 = B02.f39996T;
                        int i8 = j.m.t9;
                        Object[] objArr4 = new Object[1];
                        String k6 = wirelessMicInfo.k();
                        if (k6 != null) {
                            str = k6;
                        }
                        objArr4[0] = str;
                        textView4.setText(getString(i8, objArr4));
                    }
                } else {
                    B02.f39998V.setVisibility(8);
                    TextView micSoftwareVersion6 = B02.f39996T;
                    F.o(micSoftwareVersion6, "micSoftwareVersion");
                    if (!TextUtils.isEmpty(wirelessMicInfo.f()) && wirelessMicInfo.e() > 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i4 = 0;
                    }
                    micSoftwareVersion6.setVisibility(i4);
                    TextView textView5 = B02.f39996T;
                    int i9 = j.m.t9;
                    Object[] objArr5 = new Object[1];
                    String f6 = wirelessMicInfo.f();
                    if (f6 != null) {
                        str = f6;
                    }
                    objArr5[0] = str;
                    textView5.setText(getString(i9, objArr5));
                }
                if (d4 <= 0) {
                    z5 = false;
                }
                Q0(z5);
            }
            h02 = H0.f51801a;
        } else {
            h02 = null;
        }
        if (h02 == null) {
            ConstraintLayout micUpdateLayout3 = B02.f39999W;
            F.o(micUpdateLayout3, "micUpdateLayout");
            com.harman.jbl.partybox.utils.q.c(micUpdateLayout3);
        }
    }

    private final void P0() {
        D0().z().k(getViewLifecycleOwner(), new d(new e()));
        C0().p1().k(getViewLifecycleOwner(), new d(new f()));
        D0().B().k(getViewLifecycleOwner(), new d(new g()));
        D0().D().k(getViewLifecycleOwner(), new d(new h()));
        D0().E().k(getViewLifecycleOwner(), new d(new i()));
        D0().F().k(getViewLifecycleOwner(), new d(new j()));
    }

    private final void Q0(boolean z3) {
        C1918p1 B02 = B0();
        if (z3) {
            B02.f39997U.setVisibility(0);
            B02.f39999W.setClickable(true);
            B02.f39995S.setVisibility(8);
            B02.f39999W.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SupportFragment.R0(SupportFragment.this, view);
                }
            });
            return;
        }
        B02.f39997U.setVisibility(8);
        B02.f39999W.setClickable(false);
        B02.f39998V.setVisibility(8);
        B02.f39995S.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R0(SupportFragment this$0, View view) {
        F.p(this$0, "this$0");
        I a4 = w.a();
        F.o(a4, "actionDashboardFragmentToMicOtaWhatsNew(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, a4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(boolean z3) {
        C1918p1 B02 = B0();
        if (z3) {
            B02.f40019q0.setVisibility(0);
            B02.f40006d0.setClickable(true);
            B02.f40007e0.setVisibility(8);
            B02.f40020r0.setVisibility(8);
            B02.f40009g0.setVisibility(8);
            B02.f40006d0.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SupportFragment.T0(SupportFragment.this, view);
                }
            });
            return;
        }
        B02.f40019q0.setVisibility(8);
        B02.f40006d0.setClickable(false);
        B02.f40007e0.setVisibility(0);
        B02.f40020r0.setVisibility(8);
        B02.f40009g0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(SupportFragment this$0, View view) {
        F.p(this$0, "this$0");
        I c4 = w.c();
        F.o(c4, "actionSupportFragmentToOtaWhatsNew(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0() {
        int i4;
        ConstraintLayout constraintLayout = B0().f39982F;
        HmDevice k12 = C0().k1();
        if (k12 != null) {
            F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            F.m(constraintLayout);
            if (((PartyBoxDevice) k12).J1()) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            constraintLayout.setVisibility(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0() {
        boolean z3;
        ConstraintLayout constraintLayout = B0().f39989M;
        HmDevice k12 = C0().k1();
        if (k12 != null) {
            F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            F.m(constraintLayout);
            int i4 = 0;
            if (((PartyBoxDevice) k12).K1() && A0()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                i4 = 8;
            }
            constraintLayout.setVisibility(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0() {
        int i4;
        ConstraintLayout constraintLayout = B0().f39991O;
        HmDevice k12 = C0().k1();
        if (k12 != null) {
            F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            F.m(constraintLayout);
            if (((PartyBoxDevice) k12).L1()) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            constraintLayout.setVisibility(i4);
        }
    }

    private final void initData() {
        HmDevice k12 = C0().k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            if (!partyBoxDevice.C1()) {
                T1.a.a("BLE_LOG SupportFragment getDeviceFeatureInfo ");
                z2.e e4 = com.harman.sdk.b.f47608a.e(k12);
                if (e4 != null) {
                    e4.a0(k12, null);
                }
            }
            if (partyBoxDevice.J1()) {
                D0().A(k12);
            }
            if (partyBoxDevice.K1()) {
                D0().C(k12);
            }
        }
    }

    private final void initView() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C1918p1 B02 = B0();
        B02.f39987K.f38611G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportFragment.E0(SupportFragment.this, view);
            }
        });
        B02.f39987K.f38613I.setText(getString(j.m.f41774j3));
        HmDevice k12 = C0().k1();
        if (k12 != null) {
            F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            if (com.harman.sdk.utils.d.G(k12)) {
                B02.f39987K.f38613I.setOnClickListener(new c(k12, B02));
            }
            U0();
            V0();
            W0();
            ImageView imageView = B02.f40012j0;
            boolean z3 = true;
            if (k12.v() == 1) {
                i4 = j.f.i4;
            } else {
                i4 = j.f.h4;
            }
            imageView.setImageResource(i4);
            ImageView imageView2 = B02.f39992P;
            if (partyBoxDevice.b1()) {
                i5 = j.f.i4;
            } else {
                i5 = j.f.h4;
            }
            imageView2.setImageResource(i5);
            ImageView imageView3 = B02.f39990N;
            if (partyBoxDevice.Z0()) {
                i6 = j.f.i4;
            } else {
                i6 = j.f.h4;
            }
            imageView3.setImageResource(i6);
            ConstraintLayout usageSummaryContainer = B02.f40021s0;
            F.o(usageSummaryContainer, "usageSummaryContainer");
            int i9 = 8;
            if (this.f45591T0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            usageSummaryContainer.setVisibility(i7);
            ConstraintLayout auracastSQContainer = B02.f39983G;
            F.o(auracastSQContainer, "auracastSQContainer");
            if (!this.f45592U0 && !partyBoxDevice.O0()) {
                z3 = false;
            }
            if (z3) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            auracastSQContainer.setVisibility(i8);
            ConstraintLayout layoutFactoryReset = B02.f39988L;
            F.o(layoutFactoryReset, "layoutFactoryReset");
            if (com.harman.sdk.utils.d.G(k12)) {
                i9 = 0;
            }
            layoutFactoryReset.setVisibility(i9);
            B02.f40002Z.setText(com.harman.sdk.utils.d.v(k12.q()));
            B02.f40005c0.setText(partyBoxDevice.n1());
            B02.f40010h0.setText(getString(j.m.t9, k12.w()));
            O0(partyBoxDevice.v1());
        }
        B02.f39986J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportFragment.L0(SupportFragment.this, view);
            }
        });
        B02.f40012j0.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportFragment.M0(SupportFragment.this, view);
            }
        });
        B02.f39992P.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportFragment.N0(SupportFragment.this, view);
            }
        });
        B02.f39990N.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportFragment.F0(SupportFragment.this, view);
            }
        });
        B02.f40004b0.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportFragment.G0(SupportFragment.this, view);
            }
        });
        B02.f40019q0.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportFragment.H0(SupportFragment.this, view);
            }
        });
        B02.f40021s0.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportFragment.I0(SupportFragment.this, view);
            }
        });
        B02.f39983G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportFragment.J0(SupportFragment.this, view);
            }
        });
        B02.f39988L.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportFragment.K0(SupportFragment.this, view);
            }
        });
    }

    @W2.n
    @l3.d
    public static final SupportFragment newInstance() {
        return Companion.a();
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    public final void onBtnLEAudioClick() {
        boolean z3;
        int i4;
        HmDevice k12 = C0().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            int i5 = !partyBoxDevice.Z0() ? 1 : 0;
            if (i5 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            partyBoxDevice.j2(z3);
            ImageView imageView = B0().f39990N;
            if (i5 == 1) {
                i4 = j.f.i4;
            } else {
                i4 = j.f.h4;
            }
            imageView.setImageResource(i4);
            D0().J(partyBoxDevice, i5);
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        D0().v(C0().k1());
        initView();
        initData();
        P0();
    }
}
