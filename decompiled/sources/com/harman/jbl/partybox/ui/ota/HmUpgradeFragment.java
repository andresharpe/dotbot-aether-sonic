package com.harman.jbl.partybox.ui.ota;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.harman.jbl.partybox.databinding.I3;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.core.PartyBoxDashboardActivity;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.ota.C2024j;
import com.harman.jbl.partybox.ui.ota.CancelUpdateDialogFragment;
import com.harman.jbl.partybox.ui.ota.K;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.widget.ProgressLayout;
import com.harman.sdk.device.HmDevice;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.w1;

@kotlin.E(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 V2\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\bU\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u0019\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010\u0004J\r\u0010%\u001a\u00020\u0002¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0004R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010A\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\u0016\u0010C\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010<R\u0016\u0010E\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010<R\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000b0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006X"}, d2 = {"Lcom/harman/jbl/partybox/ui/ota/HmUpgradeFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "l0", "()V", "z0", "", "x0", "()Z", "t0", "w0", "", "remainTime", "F0", "(I)V", "progress", "E0", "D0", "s0", "y0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "onResume", "onPause", "onBackButtonClick", "onDestroy", "Lcom/harman/jbl/partybox/databinding/I3;", "Q0", "Lcom/harman/jbl/partybox/databinding/I3;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "u0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/ota/N;", "S0", "v0", "()Lcom/harman/jbl/partybox/ui/ota/N;", "sharedOtaViewModel", "Lcom/harman/jbl/partybox/ui/ota/CancelUpdateDialogFragment;", "T0", "Lcom/harman/jbl/partybox/ui/ota/CancelUpdateDialogFragment;", "cancelUpdateDialogFragment", "", "U0", "Ljava/lang/String;", "devicePid", "V0", "deviceMid", "W0", "serverVersion", "X0", "productName", "Y0", "deviceVersion", "", "Z0", "J", "lastOTAFailedReportTime", com.harman.sdk.utils.k.f48625V, "Z", "isOTAStartEventSent", "Lcom/harman/jbl/partybox/ui/ota/CancelUpdateDialogFragment$a;", "b1", "Lcom/harman/jbl/partybox/ui/ota/CancelUpdateDialogFragment$a;", "updateCancelListener", "Landroidx/lifecycle/Q;", com.harman.sdk.utils.k.f48619T, "Landroidx/lifecycle/Q;", "upgradeProgressObr", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nHmUpgradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HmUpgradeFragment.kt\ncom/harman/jbl/partybox/ui/ota/HmUpgradeFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,326:1\n66#2,4:327\n56#3,10:331\n1#4:341\n*S KotlinDebug\n*F\n+ 1 HmUpgradeFragment.kt\ncom/harman/jbl/partybox/ui/ota/HmUpgradeFragment\n*L\n34#1:327,4\n35#1:331,10\n*E\n"})
/* loaded from: classes2.dex */
public final class HmUpgradeFragment extends BackDispatcherFragment {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "HmUpgradeFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.e
    private I3 f44473Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f44474R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f44475S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.e
    private CancelUpdateDialogFragment f44476T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private String f44477U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private String f44478V0;

    /* renamed from: W0, reason: collision with root package name */
    @l3.d
    private String f44479W0;

    /* renamed from: X0, reason: collision with root package name */
    @l3.d
    private String f44480X0;

    /* renamed from: Y0, reason: collision with root package name */
    @l3.d
    private String f44481Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private long f44482Z0;

    /* renamed from: a1, reason: collision with root package name */
    private boolean f44483a1;

    /* renamed from: b1, reason: collision with root package name */
    @l3.d
    private final CancelUpdateDialogFragment.a f44484b1;

    /* renamed from: c1, reason: collision with root package name */
    @l3.d
    private final Q<Integer> f44485c1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.l<Long, H0> {
        b() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Long l4) {
            c(l4);
            return H0.f51801a;
        }

        public final void c(Long l4) {
            int i4;
            int i5 = 0;
            if (l4 != null && ((int) l4.longValue()) > 0) {
                if (l4 != null) {
                    i4 = (int) l4.longValue();
                } else {
                    i4 = 0;
                }
                com.harman.log.f.a(HmUpgradeFragment.TAG, "remainingTime observer called and it is " + l4 + ", total remaining time is: " + (i4 + HmRestartFragment.OTA_FAILED_TIMER_DURATION));
                HmUpgradeFragment hmUpgradeFragment = HmUpgradeFragment.this;
                if (l4 != null) {
                    i5 = (int) l4.longValue();
                }
                hmUpgradeFragment.F0(i5 + HmRestartFragment.OTA_FAILED_TIMER_DURATION);
                return;
            }
            com.harman.log.f.a(HmUpgradeFragment.TAG, "remainingTime observer called and it is " + l4);
            HmUpgradeFragment hmUpgradeFragment2 = HmUpgradeFragment.this;
            if (l4 != null) {
                i5 = (int) l4.longValue();
            }
            hmUpgradeFragment2.F0(i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<Integer, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Integer num) {
            c(num);
            return H0.f51801a;
        }

        public final void c(Integer num) {
            com.harman.log.f.a(HmUpgradeFragment.TAG, "progressBarValue observer called and it is " + num);
            HmUpgradeFragment hmUpgradeFragment = HmUpgradeFragment.this;
            kotlin.jvm.internal.F.m(num);
            hmUpgradeFragment.E0(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements X2.l<Boolean, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            kotlin.jvm.internal.F.m(bool);
            if (bool.booleanValue()) {
                com.harman.log.f.a(HmUpgradeFragment.TAG, "OTA Upgrade started, so stop all scans!");
                com.harman.log.f.a(HmUpgradeFragment.TAG, "stopScan 8");
                HmUpgradeFragment.this.u0().j3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f44493a;

        e(X2.l function) {
            kotlin.jvm.internal.F.p(function, "function");
            this.f44493a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f44493a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return kotlin.jvm.internal.F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f44493a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements CancelUpdateDialogFragment.a {

        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.HmUpgradeFragment$updateCancelListener$1$OnUpgradeCancel$1", f = "HmUpgradeFragment.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f44495I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ HmUpgradeFragment f44496J;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.HmUpgradeFragment$updateCancelListener$1$OnUpgradeCancel$1$1", f = "HmUpgradeFragment.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.harman.jbl.partybox.ui.ota.HmUpgradeFragment$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0388a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

                /* renamed from: I, reason: collision with root package name */
                int f44497I;

                /* renamed from: J, reason: collision with root package name */
                final /* synthetic */ HmUpgradeFragment f44498J;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0388a(HmUpgradeFragment hmUpgradeFragment, kotlin.coroutines.c<? super C0388a> cVar) {
                    super(2, cVar);
                    this.f44498J = hmUpgradeFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.e
                public final Object D(@l3.d Object obj) {
                    Object l4;
                    l4 = kotlin.coroutines.intrinsics.b.l();
                    int i4 = this.f44497I;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            W.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        W.n(obj);
                        N v02 = this.f44498J.v0();
                        this.f44497I = 1;
                        if (v02.k0(this) == l4) {
                            return l4;
                        }
                    }
                    return H0.f51801a;
                }

                @Override // X2.p
                @l3.e
                /* renamed from: R, reason: merged with bridge method [inline-methods] */
                public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                    return ((C0388a) v(u3, cVar)).D(H0.f51801a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.d
                public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                    return new C0388a(this.f44498J, cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HmUpgradeFragment hmUpgradeFragment, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f44496J = hmUpgradeFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f44495I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    C0388a c0388a = new C0388a(this.f44496J, null);
                    this.f44495I = 1;
                    if (w1.e(3000L, c0388a, this) == l4) {
                        return l4;
                    }
                }
                com.harman.log.f.b(HmUpgradeFragment.TAG, "ota cancel, so set autoBack = true");
                PartyBoxDashboardActivity.f42403l0.c(true);
                HmDevice k12 = this.f44496J.u0().k1();
                if (k12 != null) {
                    HmUpgradeFragment hmUpgradeFragment = this.f44496J;
                    if (com.harman.sdk.utils.d.G(k12)) {
                        androidx.navigation.I d4 = K.d();
                        kotlin.jvm.internal.F.o(d4, "actionUpgradeFragmentToStageDashboardFragment(...)");
                        com.harman.jbl.partybox.utils.q.f(hmUpgradeFragment, d4);
                    } else {
                        androidx.navigation.I a4 = K.a();
                        kotlin.jvm.internal.F.o(a4, "actionUpgradeFragmentToDashboardFragment(...)");
                        com.harman.jbl.partybox.utils.q.f(hmUpgradeFragment, a4);
                    }
                }
                return H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f44496J, cVar);
            }
        }

        f() {
        }

        @Override // com.harman.jbl.partybox.ui.ota.CancelUpdateDialogFragment.a
        public void a() {
            ActivityC0889g activity;
            if (HmUpgradeFragment.this.isAdded() && (activity = HmUpgradeFragment.this.getActivity()) != null && !activity.isFinishing()) {
                com.harman.log.f.a(HmUpgradeFragment.TAG, "OnUpgradeCancel called");
                C2323l.f(androidx.lifecycle.F.a(HmUpgradeFragment.this), null, null, new a(HmUpgradeFragment.this, null), 3, null);
            }
        }
    }

    public HmUpgradeFragment() {
        super(j.i.f41409K2);
        this.f44474R0 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.ota.HmUpgradeFragment$special$$inlined$viewModels$default$1
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
        this.f44475S0 = FragmentViewModelLazyKt.c(this, kotlin.jvm.internal.N.d(N.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.ota.HmUpgradeFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.ota.HmUpgradeFragment$special$$inlined$viewModels$default$3
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
        this.f44477U0 = "";
        this.f44478V0 = "";
        this.f44479W0 = "";
        this.f44480X0 = "";
        this.f44481Y0 = "";
        this.f44484b1 = new f();
        this.f44485c1 = new Q() { // from class: com.harman.jbl.partybox.ui.ota.H
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                HmUpgradeFragment.G0(HmUpgradeFragment.this, ((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A0(HmUpgradeFragment this$0, View view, int i4, KeyEvent event) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(event, "event");
        if (event.getAction() == 1 && i4 == 4) {
            this$0.z0();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(HmUpgradeFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.onBackButtonClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(HmUpgradeFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.onBackButtonClick();
    }

    private final void D0(int i4) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(j.e.f40832S0);
        String valueOf = String.valueOf(i4);
        SpannableString spannableString = new SpannableString(valueOf);
        spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize), 0, valueOf.length(), 18);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(j.e.f40818L0);
        SpannableString spannableString2 = new SpannableString("%");
        spannableString2.setSpan(new AbsoluteSizeSpan(dimensionPixelSize2), 0, 1, 18);
        TextUtils.concat(spannableString, spannableString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(int i4) {
        ProgressLayout progressLayout;
        com.harman.log.f.a(TAG, "OTA_UPGRADE updateProgressValue() Download Length UI update current " + i4);
        if (i4 < 0) {
            i4 = 0;
        }
        I3 i32 = this.f44473Q0;
        if (i32 != null && (progressLayout = i32.f38746K) != null) {
            progressLayout.setProgress(i4);
        }
        D0(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0(int i4) {
        int i5;
        HmCustomFontTextView hmCustomFontTextView;
        int i6 = i4 / 1000;
        if (i6 < 60) {
            i5 = j.m.N9;
        } else {
            i5 = j.m.M9;
            i6 /= 60;
        }
        if (i6 > 0) {
            I3 i32 = this.f44473Q0;
            HmCustomFontTextView hmCustomFontTextView2 = null;
            if (i32 != null) {
                hmCustomFontTextView = i32.f38743H;
            } else {
                hmCustomFontTextView = null;
            }
            if (hmCustomFontTextView != null) {
                hmCustomFontTextView.setVisibility(0);
            }
            String string = getString(j.m.L9, i6 + " " + getString(i5));
            kotlin.jvm.internal.F.o(string, "getString(...)");
            I3 i33 = this.f44473Q0;
            if (i33 != null) {
                hmCustomFontTextView2 = i33.f38743H;
            }
            if (hmCustomFontTextView2 != null) {
                hmCustomFontTextView2.setText(string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(HmUpgradeFragment this$0, int i4) {
        String str;
        String str2;
        kotlin.jvm.internal.F.p(this$0, "this$0");
        com.harman.log.f.a(TAG, "updateProgress observer called and it is " + i4);
        if (i4 == C2024j.d.OTA_SUCCESS.ordinal()) {
            com.harman.log.f.a(TAG, "OTA  Complete finish");
            this$0.v0().D0();
            com.harman.jbl.partybox.persistence.a aVar = com.harman.jbl.partybox.persistence.a.f42065a;
            HmDevice k12 = this$0.u0().k1();
            if (k12 == null || (str = k12.n()) == null) {
                str = "";
            }
            HmDevice k13 = this$0.u0().k1();
            if (k13 != null) {
                str2 = k13.w();
            } else {
                str2 = null;
            }
            aVar.G(com.harman.jbl.partybox.constants.a.f38327H, str, str2);
            CancelUpdateDialogFragment cancelUpdateDialogFragment = this$0.f44476T0;
            if (cancelUpdateDialogFragment != null) {
                kotlin.jvm.internal.F.m(cancelUpdateDialogFragment);
                if (cancelUpdateDialogFragment.isVisible()) {
                    CancelUpdateDialogFragment cancelUpdateDialogFragment2 = this$0.f44476T0;
                    kotlin.jvm.internal.F.m(cancelUpdateDialogFragment2);
                    cancelUpdateDialogFragment2.dismiss();
                    this$0.f44476T0 = null;
                }
            }
            this$0.y0();
            return;
        }
        if (i4 == C2024j.d.OTA_FAIL.ordinal()) {
            com.harman.log.f.a(TAG, "OTA  Fail");
            CancelUpdateDialogFragment cancelUpdateDialogFragment3 = this$0.f44476T0;
            if (cancelUpdateDialogFragment3 != null) {
                kotlin.jvm.internal.F.m(cancelUpdateDialogFragment3);
                if (cancelUpdateDialogFragment3.isVisible()) {
                    CancelUpdateDialogFragment cancelUpdateDialogFragment4 = this$0.f44476T0;
                    kotlin.jvm.internal.F.m(cancelUpdateDialogFragment4);
                    cancelUpdateDialogFragment4.dismiss();
                    this$0.f44476T0 = null;
                }
            }
            this$0.v0().m0();
            K.a j4 = K.b().k(this$0.f44477U0).j(this$0.f44478V0);
            kotlin.jvm.internal.F.o(j4, "setDeviceMid(...)");
            j4.l(com.harman.jbl.partybox.constants.a.f38322C).n(this$0.f44479W0).g(this$0.f44481Y0).m(this$0.f44480X0);
            com.harman.jbl.partybox.utils.q.f(this$0, j4);
            if (System.currentTimeMillis() - this$0.f44482Z0 > 500) {
                this$0.f44482Z0 = System.currentTimeMillis();
            }
        }
    }

    private final void l0() {
        v0().u0().k(getViewLifecycleOwner(), new e(new b()));
        v0().t0().k(getViewLifecycleOwner(), new e(new c()));
        v0().v0().l(this.f44485c1);
        v0().y0().k(getViewLifecycleOwner(), new e(new d()));
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            v0().V(activity);
        }
    }

    private final void s0() {
        K.c c4 = K.e().d(this.f44477U0).c(this.f44478V0);
        kotlin.jvm.internal.F.o(c4, "setDeviceMid(...)");
        com.harman.jbl.partybox.utils.q.f(this, c4);
    }

    private final void t0() {
        com.harman.log.f.a(TAG, "checkAndUpdateOTAFail() >>> OTA state[" + v0().v0().f() + "]");
        if (x0()) {
            com.harman.log.f.d(TAG, "checkAndUpdateOTAFail() >>> OTA SUCCESS");
            y0();
        } else if (u0().k1() == null) {
            com.harman.log.f.a(TAG, "OTA_UPGRADE Main Device is null so display Fail screen. ");
            s0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o u0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f44474R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N v0() {
        return (N) this.f44475S0.getValue();
    }

    private final void w0() {
        Integer num;
        I3 i32;
        ProgressLayout progressLayout;
        if (getActivity() == null) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            num = Integer.valueOf(com.harman.sdk.utils.d.r(context, this.f44477U0, this.f44478V0));
        } else {
            num = null;
        }
        if (num != null && (i32 = this.f44473Q0) != null && (progressLayout = i32.f38746K) != null) {
            progressLayout.setCenterImage(num.intValue());
        }
        E0(0);
    }

    private final boolean x0() {
        int ordinal = C2024j.d.OTA_SUCCESS.ordinal();
        Integer f4 = v0().v0().f();
        if (f4 != null && ordinal == f4.intValue()) {
            return true;
        }
        return false;
    }

    private final void y0() {
        com.harman.log.f.d(TAG, "naviToRestartFragment() >>> ");
        K.b k4 = K.c().j(this.f44477U0).l(this.f44479W0).f(this.f44481Y0).k(this.f44480X0);
        kotlin.jvm.internal.F.o(k4, "setProductNameKey(...)");
        com.harman.jbl.partybox.utils.q.f(this, k4);
    }

    private final void z0() {
        t0();
        if (u0().k1() != null) {
            CancelUpdateDialogFragment cancelUpdateDialogFragment = this.f44476T0;
            if (cancelUpdateDialogFragment != null) {
                kotlin.jvm.internal.F.m(cancelUpdateDialogFragment);
                if (cancelUpdateDialogFragment.isVisible()) {
                    return;
                }
            }
            CancelUpdateDialogFragment cancelUpdateDialogFragment2 = new CancelUpdateDialogFragment(this.f44484b1);
            this.f44476T0 = cancelUpdateDialogFragment2;
            kotlin.jvm.internal.F.m(cancelUpdateDialogFragment2);
            cancelUpdateDialogFragment2.show(getParentFragmentManager(), TAG);
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBackButtonClick();
    }

    public final void onBackButtonClick() {
        if (u0().k1() != null) {
            CancelUpdateDialogFragment cancelUpdateDialogFragment = new CancelUpdateDialogFragment(this.f44484b1);
            this.f44476T0 = cancelUpdateDialogFragment;
            kotlin.jvm.internal.F.m(cancelUpdateDialogFragment);
            cancelUpdateDialogFragment.show(getParentFragmentManager(), TAG);
            return;
        }
        t0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        com.harman.log.f.a(TAG, "onCreate initSppService");
        HmDevice k12 = u0().k1();
        if (k12 != null) {
            v0().x0(k12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(inflater, "inflater");
        this.f44473Q0 = I3.c(inflater);
        l0();
        I3 i32 = this.f44473Q0;
        if (i32 != null) {
            return i32.d();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        v0().v0().p(this.f44485c1);
        v0().D0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        requireActivity().getWindow().clearFlags(128);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requireActivity().getWindow().addFlags(128);
        requireView().setFocusableInTouchMode(true);
        requireView().requestFocus();
        requireView().setOnKeyListener(new View.OnKeyListener() { // from class: com.harman.jbl.partybox.ui.ota.I
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                boolean A02;
                A02 = HmUpgradeFragment.A0(HmUpgradeFragment.this, view, i4, keyEvent);
                return A02;
            }
        });
        t0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        String str;
        String str2;
        I3 i32;
        HmCustomFontTextView hmCustomFontTextView;
        String q02;
        kotlin.jvm.internal.F.p(view, "view");
        super.onViewCreated(view, bundle);
        I3 i33 = this.f44473Q0;
        if (i33 != null) {
            i33.f38744I.f38735H.setText(getString(j.m.s9));
            i33.f38744I.f38734G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.ota.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HmUpgradeFragment.B0(HmUpgradeFragment.this, view2);
                }
            });
            i33.f38741F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.ota.G
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HmUpgradeFragment.C0(HmUpgradeFragment.this, view2);
                }
            });
        }
        HmDevice k12 = u0().k1();
        String str3 = "";
        if (k12 == null || (str = k12.q()) == null) {
            str = "";
        }
        this.f44477U0 = str;
        HmDevice k13 = u0().k1();
        if (k13 == null || (str2 = k13.o()) == null) {
            str2 = "";
        }
        this.f44478V0 = str2;
        HmDevice k14 = u0().k1();
        if (k14 != null && (q02 = v0().q0(k14)) != null) {
            str3 = q02;
        }
        this.f44479W0 = str3;
        String d4 = com.harman.jbl.partybox.utils.l.d(u0().k1());
        kotlin.jvm.internal.F.o(d4, "getProductName(...)");
        this.f44480X0 = d4;
        String a4 = com.harman.jbl.partybox.utils.l.a(u0().k1());
        kotlin.jvm.internal.F.o(a4, "getFirmwareVersion(...)");
        this.f44481Y0 = a4;
        if (!this.f44483a1) {
            this.f44483a1 = true;
            u0().u2();
        }
        if (com.harman.sdk.utils.d.H(this.f44477U0) && (i32 = this.f44473Q0) != null && (hmCustomFontTextView = i32.f38748M) != null) {
            hmCustomFontTextView.setText(j.m.o4);
        }
        w0();
        v0().w0();
    }
}
