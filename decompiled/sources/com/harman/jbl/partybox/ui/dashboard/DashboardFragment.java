package com.harman.jbl.partybox.ui.dashboard;

import android.animation.LayoutTransition;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.m0;
import com.blankj.utilcode.util.C1114y;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.InterfaceC1764e;
import com.google.firebase.messaging.C1821f;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.B3;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.bassboost.BassBoostFragment;
import com.harman.jbl.partybox.ui.core.PartyBoxDashboardActivity;
import com.harman.jbl.partybox.ui.dashboard.C2005p;
import com.harman.jbl.partybox.ui.dashboard.z0;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.equalizer.EQFragment;
import com.harman.jbl.partybox.ui.lightcontrol.view.LightControlFragment;
import com.harman.jbl.partybox.ui.lightshow.view.LightShowFragment;
import com.harman.jbl.partybox.ui.musiccontrol.MusicControlFragment;
import com.harman.jbl.partybox.ui.oobe.OnBoardingTutorialFragment;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoChannelFromPage;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType;
import com.harman.jbl.partybox.ui.widget.ForegroundMaskFrameLayout;
import com.harman.jbl.partybox.ui.widget.MatchWidthCardView;
import com.harman.jbl.partybox.ui.widget.r;
import com.harman.rating.model.RatingGuideType;
import com.harman.rating.model.UserAction;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.utils.DeviceRole;
import com.harman.sdk.utils.PartyConnectStatus;
import kotlin.InterfaceC2229v;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.flow.InterfaceC2283j;
import q2.b;
import s2.C2410a;

@kotlin.E(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 q2\u00020\u0001:\u0001rB\u0007¢\u0006\u0004\bp\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J9\u0010\u0015\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00112 \u0010\u0014\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010\u0004J#\u0010,\u001a\u00020+2\b\u0010)\u001a\u0004\u0018\u00010\b2\b\u0010*\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010/\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u0010\u0004J\u000f\u00100\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u0010\u0004J\u000f\u00101\u001a\u00020\u0002H\u0002¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\u0002H\u0002¢\u0006\u0004\b2\u0010\u0004J\u0019\u00105\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J!\u00109\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0002H\u0016¢\u0006\u0004\b;\u0010\u0004J\u000f\u0010<\u001a\u00020\u0002H\u0016¢\u0006\u0004\b<\u0010\u0004J\u000f\u0010=\u001a\u00020\u0002H\u0016¢\u0006\u0004\b=\u0010\u0004J\u000f\u0010>\u001a\u00020\u0002H\u0016¢\u0006\u0004\b>\u0010\u0004R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010GR\u001b\u0010L\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010E\u001a\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010ZR\u0016\u0010^\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010]R\u0016\u0010`\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010_R\u0016\u0010a\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010cR\u001b\u0010i\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010E\u001a\u0004\bg\u0010hR\u0016\u0010k\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010_R\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006s"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/DashboardFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "p1", "()V", "C0", "onBtnBackClick", "I0", "", "deviceMac", "n1", "(Ljava/lang/String;)V", "Lcom/harman/sdk/device/HmDevice;", "device", "Q0", "(Lcom/harman/sdk/device/HmDevice;)V", "R0", "Lcom/harman/sdk/device/PartyBoxDevice;", "Lkotlin/Triple;", "", C1821f.C0339f.a.f37006R, "m1", "(Lcom/harman/sdk/device/PartyBoxDevice;Lkotlin/Triple;)V", "deviceName", "Lcom/harman/sdk/message/BatteryInfo;", "batteryInfo", "q1", "(Ljava/lang/String;Lcom/harman/sdk/message/BatteryInfo;)V", "devicePid", "F0", "S0", "l1", "r1", "b1", "Y0", "", "Z0", "()Z", com.harman.sdk.utils.k.f48625V, "K0", "W0", "startColor", "endColor", "Landroid/graphics/drawable/GradientDrawable;", "N0", "(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;", "V0", "X0", "U0", "T0", "o1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "onResume", "onDestroyView", "onDestroy", "Lcom/harman/jbl/partybox/databinding/Z;", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "L0", "()Lcom/harman/jbl/partybox/databinding/Z;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "Lkotlin/A;", "O0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/dashboard/s;", "M0", "()Lcom/harman/jbl/partybox/ui/dashboard/s;", "dashboardViewModel", "Lcom/harman/jbl/partybox/ui/lightshow/view/LightShowFragment;", "Lcom/harman/jbl/partybox/ui/lightshow/view/LightShowFragment;", "lightShowFragment", "Lcom/harman/jbl/partybox/ui/lightcontrol/view/LightControlFragment;", "Lcom/harman/jbl/partybox/ui/lightcontrol/view/LightControlFragment;", "lightControlFragment", "Lcom/harman/jbl/partybox/ui/musiccontrol/MusicControlFragment;", "Lcom/harman/jbl/partybox/ui/musiccontrol/MusicControlFragment;", "musicControlFragment", "Lcom/harman/jbl/partybox/ui/equalizer/EQFragment;", "Lcom/harman/jbl/partybox/ui/equalizer/EQFragment;", "eqFragment", "Lcom/harman/jbl/partybox/ui/bassboost/BassBoostFragment;", "Lcom/harman/jbl/partybox/ui/bassboost/BassBoostFragment;", "bassBoostFragment", "", "J", "mLastClickTime", "Z", "isDaisyChainSecondaryEnabled", "isDaisyChainPrimaryEnabled", "Lcom/harman/jbl/partybox/ui/dashboard/RemoveProductDialogFragment;", "Lcom/harman/jbl/partybox/ui/dashboard/RemoveProductDialogFragment;", "removeProductDialogFragment", "Lcom/harman/jbl/partybox/ui/oobe/OnBoardingTutorialFragment;", com.harman.sdk.utils.k.f48619T, "P0", "()Lcom/harman/jbl/partybox/ui/oobe/OnBoardingTutorialFragment;", "onBoardingTutorialFragment", "d1", "isWaking", "Lkotlinx/coroutines/L0;", "e1", "Lkotlinx/coroutines/L0;", "refreshJob", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@kotlin.jvm.internal.U({"SMAP\nDashboardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DashboardFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/DashboardFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,732:1\n66#2,4:733\n56#3,10:737\n1#4:747\n262#5,2:748\n*S KotlinDebug\n*F\n+ 1 DashboardFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/DashboardFragment\n*L\n67#1:733,4\n68#1:737,10\n406#1:748,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DashboardFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "DashboardFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f42886Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f42887R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f42888S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.e
    private LightShowFragment f42889T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.e
    private LightControlFragment f42890U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.e
    private MusicControlFragment f42891V0;

    /* renamed from: W0, reason: collision with root package name */
    @l3.e
    private EQFragment f42892W0;

    /* renamed from: X0, reason: collision with root package name */
    @l3.e
    private BassBoostFragment f42893X0;

    /* renamed from: Y0, reason: collision with root package name */
    private long f42894Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private boolean f42895Z0;

    /* renamed from: a1, reason: collision with root package name */
    private boolean f42896a1;

    /* renamed from: b1, reason: collision with root package name */
    @l3.e
    private RemoveProductDialogFragment f42897b1;

    /* renamed from: c1, reason: collision with root package name */
    @l3.d
    private final kotlin.A f42898c1;

    /* renamed from: d1, reason: collision with root package name */
    private boolean f42899d1;

    /* renamed from: e1, reason: collision with root package name */
    @l3.e
    private kotlinx.coroutines.L0 f42900e1;

    /* renamed from: f1, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f42885f1 = {kotlin.jvm.internal.N.u(new PropertyReference1Impl(DashboardFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentDashboardBinding;", 0))};

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
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, com.harman.jbl.partybox.databinding.Z> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f42905N = new b();

        b() {
            super(1, com.harman.jbl.partybox.databinding.Z.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentDashboardBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final com.harman.jbl.partybox.databinding.Z C(@l3.d View p02) {
            kotlin.jvm.internal.F.p(p02, "p0");
            return com.harman.jbl.partybox.databinding.Z.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.DashboardFragment$initObserver$1", f = "DashboardFragment.kt", i = {}, l = {550}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f42906I;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static final class a<T> implements InterfaceC2283j {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ DashboardFragment f42908E;

            a(DashboardFragment dashboardFragment) {
                this.f42908E = dashboardFragment;
            }

            @l3.e
            public final Object a(boolean z3, @l3.d kotlin.coroutines.c<? super kotlin.H0> cVar) {
                T1.a.a("DashboardFragment BLEState currentDeviceBLEConnectStatus : observe callback " + z3);
                HmDevice k12 = this.f42908E.O0().k1();
                if (k12 != null) {
                    DashboardFragment dashboardFragment = this.f42908E;
                    if (!dashboardFragment.a1() && !k12.R() && !z3) {
                        dashboardFragment.handleOnBackPressed();
                    }
                }
                return kotlin.H0.f51801a;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2283j
            public /* bridge */ /* synthetic */ Object f(Object obj, kotlin.coroutines.c cVar) {
                return a(((Boolean) obj).booleanValue(), cVar);
            }
        }

        c(kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f42906I;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.W.n(obj);
            } else {
                kotlin.W.n(obj);
                kotlinx.coroutines.flow.s<Boolean> W3 = DashboardFragment.this.M0().W();
                a aVar = new a(DashboardFragment.this);
                this.f42906I = 1;
                if (W3.a(aVar, this) == l4) {
                    return l4;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((c) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements X2.l<Pair<? extends Boolean, ? extends String>, kotlin.H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Pair<? extends Boolean, ? extends String> pair) {
            c(pair);
            return kotlin.H0.f51801a;
        }

        public final void c(Pair<Boolean, String> pair) {
            boolean booleanValue = pair.a().booleanValue();
            pair.b();
            T1.a.a("BLE_LOG otaLiveData observer called and otaAvailable : " + booleanValue);
            if (!booleanValue) {
                DashboardFragment.this.S0();
                return;
            }
            if (DashboardFragment.this.O0().x1()) {
                DashboardFragment.this.o1();
            }
            DashboardFragment.this.L0().f39284Y.b(j.m.X9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.DashboardFragment$launchRefreshJob$1", f = "DashboardFragment.kt", i = {0}, l = {v.g.f7532o}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class e extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f42910I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f42911J;

        e(kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            kotlinx.coroutines.U u3;
            Object b4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f42910I;
            if (i4 != 0) {
                if (i4 == 1) {
                    u3 = (kotlinx.coroutines.U) this.f42911J;
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                u3 = (kotlinx.coroutines.U) this.f42911J;
            }
            while (kotlinx.coroutines.V.k(u3)) {
                DashboardFragment dashboardFragment = DashboardFragment.this;
                try {
                    Result.a aVar = Result.f51807F;
                    dashboardFragment.C0();
                    b4 = Result.b(kotlin.H0.f51801a);
                } catch (Throwable th) {
                    Result.a aVar2 = Result.f51807F;
                    b4 = Result.b(kotlin.W.a(th));
                }
                if (Result.e(b4) != null) {
                    System.out.println();
                }
                this.f42911J = u3;
                this.f42910I = 1;
                if (C2269d0.b(1000L, this) == l4) {
                    return l4;
                }
            }
            return kotlin.H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((e) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            e eVar = new e(cVar);
            eVar.f42911J = obj;
            return eVar;
        }
    }

    /* loaded from: classes2.dex */
    static final class f extends Lambda implements X2.a<OnBoardingTutorialFragment> {

        /* renamed from: F, reason: collision with root package name */
        public static final f f42913F = new f();

        f() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final OnBoardingTutorialFragment n() {
            return new OnBoardingTutorialFragment();
        }
    }

    /* loaded from: classes2.dex */
    static final class g extends Lambda implements X2.l<HmDevice, kotlin.H0> {
        g() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return kotlin.H0.f51801a;
        }

        public final void c(HmDevice hmDevice) {
            DashboardFragment dashboardFragment = DashboardFragment.this;
            kotlin.jvm.internal.F.m(hmDevice);
            dashboardFragment.Q0(hmDevice);
            HmDevice k12 = DashboardFragment.this.O0().k1();
            if (k12 != null) {
                DashboardFragment dashboardFragment2 = DashboardFragment.this;
                if (k12 instanceof PartyBoxDevice) {
                    dashboardFragment2.m1((PartyBoxDevice) k12, dashboardFragment2.M0().Y(k12));
                    dashboardFragment2.q1(hmDevice.p(), hmDevice.f());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class h implements androidx.lifecycle.Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f42915a;

        h(X2.l function) {
            kotlin.jvm.internal.F.p(function, "function");
            this.f42915a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f42915a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof androidx.lifecycle.Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return kotlin.jvm.internal.F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f42915a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class i extends Lambda implements X2.a<kotlin.H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ String f42916F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ DashboardFragment f42917G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, DashboardFragment dashboardFragment) {
            super(0);
            this.f42916F = str;
            this.f42917G = dashboardFragment;
        }

        public final void c() {
            T1.a.a("BLE_LOG StageDashboardFragment RemoveProductDialogFragment :click remove");
            U1.a.k(this.f42916F);
            this.f42917G.O0().x2();
            this.f42917G.requireActivity().finish();
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ kotlin.H0 n() {
            c();
            return kotlin.H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.DashboardFragment$startWakeupDevice$1$1", f = "DashboardFragment.kt", i = {}, l = {256}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.U({"SMAP\nDashboardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DashboardFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/DashboardFragment$startWakeupDevice$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,732:1\n262#2,2:733\n262#2,2:735\n*S KotlinDebug\n*F\n+ 1 DashboardFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/DashboardFragment$startWakeupDevice$1$1\n*L\n251#1:733,2\n263#1:735,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class j extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f42918I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f42920K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(HmDevice hmDevice, kotlin.coroutines.c<? super j> cVar) {
            super(2, cVar);
            this.f42920K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f42918I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                DashboardFragment.this.f42899d1 = true;
                ConstraintLayout layoutStandby = DashboardFragment.this.L0().f39275P;
                kotlin.jvm.internal.F.o(layoutStandby, "layoutStandby");
                layoutStandby.setVisibility(0);
                DashboardFragment.this.L0().f39268I.d().setForeground(new ColorDrawable(C1114y.a(j.d.f40746e1)));
                DashboardFragment.this.L0().f39268I.f38647F.setClickable(false);
                PartyBoxDashboardActivity.f42403l0.c(false);
                DashboardFragment.this.O0().N0(this.f42920K.n());
                C2007s M02 = DashboardFragment.this.M0();
                HmDevice hmDevice = this.f42920K;
                this.f42918I = 1;
                obj = M02.d0(hmDevice, this);
                if (obj == l4) {
                    return l4;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                DashboardFragment.this.O0().P0(this.f42920K.n());
            } else {
                DashboardFragment.this.O0().O0(this.f42920K.n());
            }
            PartyBoxDashboardActivity.f42403l0.c(true);
            ConstraintLayout layoutStandby2 = DashboardFragment.this.L0().f39275P;
            kotlin.jvm.internal.F.o(layoutStandby2, "layoutStandby");
            layoutStandby2.setVisibility(8);
            DashboardFragment.this.L0().f39268I.d().setForeground(null);
            DashboardFragment.this.L0().f39268I.f38647F.setClickable(true);
            DashboardFragment.this.f42899d1 = false;
            return kotlin.H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((j) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new j(this.f42920K, cVar);
        }
    }

    public DashboardFragment() {
        super(j.i.f41430Q);
        kotlin.A a4;
        this.f42886Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f42905N);
        this.f42887R0 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.dashboard.DashboardFragment$special$$inlined$viewModels$default$1
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
        this.f42888S0 = FragmentViewModelLazyKt.c(this, kotlin.jvm.internal.N.d(C2007s.class), new X2.a<androidx.lifecycle.p0>() { // from class: com.harman.jbl.partybox.ui.dashboard.DashboardFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.p0 n() {
                androidx.lifecycle.p0 viewModelStore = ((androidx.lifecycle.q0) X2.a.this.n()).getViewModelStore();
                kotlin.jvm.internal.F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.dashboard.DashboardFragment$special$$inlined$viewModels$default$3
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
        a4 = kotlin.C.a(f.f42913F);
        this.f42898c1 = a4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0() {
        int i4;
        ColorDrawable colorDrawable;
        int i5;
        com.harman.jbl.partybox.databinding.Z L02 = L0();
        if (this.f42899d1) {
            return;
        }
        ConstraintLayout d4 = L02.f39272M.d();
        int i6 = 8;
        if (Z0()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        d4.setVisibility(i4);
        d4.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardFragment.D0(DashboardFragment.this, view);
            }
        });
        ViewGroup.LayoutParams layoutParams = L02.f39269J.getLayoutParams();
        if (layoutParams != null) {
            kotlin.jvm.internal.F.m(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (Z0() && !a1()) {
                i5 = com.harman.jbl.partybox.utils.j.a(getContext(), 70.0f);
            } else {
                i5 = 0;
            }
            layoutParams2.setMargins(0, i5, 0, 0);
        }
        TextView textView = L02.f39281V;
        if (Z0()) {
            i6 = 0;
        }
        textView.setVisibility(i6);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardFragment.E0(DashboardFragment.this, view);
            }
        });
        if (!Z0() && !a1()) {
            com.harman.jbl.partybox.databinding.Z L03 = L0();
            int childCount = L03.f39274O.getChildCount() - 2;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = L03.f39274O.getChildAt(i7);
                if (childAt.getForeground() != null) {
                    childAt.setForeground(null);
                }
                kotlin.jvm.internal.F.m(childAt);
                com.harman.jbl.partybox.utils.s.a(childAt, true);
                if (childAt instanceof com.harman.jbl.partybox.ui.widget.l) {
                    ((com.harman.jbl.partybox.ui.widget.l) childAt).b();
                } else if (childAt instanceof ForegroundMaskFrameLayout) {
                    ((ForegroundMaskFrameLayout) childAt).b();
                }
            }
            L0().f39285Z.d().setForeground(null);
            return;
        }
        int childCount2 = L02.f39274O.getChildCount() - 2;
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = L02.f39274O.getChildAt(i8);
            if (childAt2 instanceof ForegroundMaskFrameLayout) {
                ((ForegroundMaskFrameLayout) childAt2).a();
            } else {
                Context context = getContext();
                if (context != null) {
                    colorDrawable = new ColorDrawable(context.getColor(j.d.f40746e1));
                } else {
                    colorDrawable = null;
                }
                childAt2.setForeground(colorDrawable);
                kotlin.jvm.internal.F.m(childAt2);
                com.harman.jbl.partybox.utils.s.a(childAt2, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(DashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        C2005p.a c4 = C2005p.g("").c(0);
        kotlin.jvm.internal.F.o(c4, "setIsFromProductList(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(DashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        HmDevice k12 = this$0.O0().k1();
        if (k12 != null) {
            this$0.n1(k12.n());
        }
    }

    private final void F0(String str) {
        b.a aVar = q2.b.f57366d;
        RatingGuideType b4 = aVar.a().b(str);
        aVar.a().i(str, C2410a.f57640c);
        com.harman.log.f.a(TAG, "ratingGuideType: " + b4);
        if (b4 != RatingGuideType.RATING_NONE) {
            final com.google.android.play.core.review.b a4 = com.google.android.play.core.review.c.a(requireContext());
            kotlin.jvm.internal.F.o(a4, "create(...)");
            a4.b().e(new InterfaceC1764e() { // from class: com.harman.jbl.partybox.ui.dashboard.i
                @Override // com.google.android.gms.tasks.InterfaceC1764e
                public final void a(AbstractC1770k abstractC1770k) {
                    DashboardFragment.G0(com.google.android.play.core.review.b.this, this, abstractC1770k);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(com.google.android.play.core.review.b reviewManager, DashboardFragment this$0, AbstractC1770k task) {
        kotlin.jvm.internal.F.p(reviewManager, "$reviewManager");
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(task, "task");
        if (task.v()) {
            com.harman.log.f.a(TAG, "launchReviewFlow");
            reviewManager.a(this$0.requireActivity(), (com.google.android.play.core.review.a) task.r()).e(new InterfaceC1764e() { // from class: com.harman.jbl.partybox.ui.dashboard.h
                @Override // com.google.android.gms.tasks.InterfaceC1764e
                public final void a(AbstractC1770k abstractC1770k) {
                    DashboardFragment.H0(abstractC1770k);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(AbstractC1770k it) {
        kotlin.jvm.internal.F.p(it, "it");
        q2.b.f57366d.a().j(UserAction.ACTION_RATE_US);
    }

    private final void I0() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.dashboard.a
            @Override // java.lang.Runnable
            public final void run() {
                DashboardFragment.J0(DashboardFragment.this);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(DashboardFragment this$0) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        com.harman.jbl.partybox.persistence.a aVar = com.harman.jbl.partybox.persistence.a.f42065a;
        boolean p4 = aVar.p();
        T1.a.a("DashboardFragment checkOnBoardingShownStatus shown:" + p4 + " ");
        aVar.H();
        if (!p4 && !this$0.P0().isAdded()) {
            Dialog dialog = this$0.P0().getDialog();
            if (dialog == null || true != dialog.isShowing()) {
                this$0.P0().show(this$0.getChildFragmentManager(), OnBoardingTutorialFragment.TAG);
            }
        }
    }

    private final void K0() {
        try {
            this.f42889T0 = null;
            this.f42890U0 = null;
            this.f42891V0 = null;
            this.f42892W0 = null;
            this.f42893X0 = null;
        } catch (Exception e4) {
            com.harman.log.f.a(TAG, e4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.databinding.Z L0() {
        return (com.harman.jbl.partybox.databinding.Z) this.f42886Q0.a(this, f42885f1[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2007s M0() {
        return (C2007s) this.f42888S0.getValue();
    }

    private final GradientDrawable N0(String str, String str2) {
        Float f4;
        Resources resources;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            f4 = Float.valueOf(resources.getDimension(j.e.f40885q));
        } else {
            f4 = null;
        }
        if (f4 != null) {
            gradientDrawable.setCornerRadius(f4.floatValue());
        }
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(new int[]{Color.parseColor(str), Color.parseColor(str2)});
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o O0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f42887R0.getValue();
    }

    private final OnBoardingTutorialFragment P0() {
        return (OnBoardingTutorialFragment) this.f42898c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(HmDevice hmDevice) {
        if (hmDevice != null) {
            if (((PartyBoxDevice) hmDevice).i1() == PartyConnectStatus.PARTY_CONNECT_WIRED) {
                DeviceRole J3 = hmDevice.J();
                DeviceRole.a aVar = DeviceRole.Companion;
                if (J3 == aVar.a(2)) {
                    this.f42895Z0 = true;
                } else if (hmDevice.J() == aVar.a(1)) {
                    this.f42896a1 = true;
                }
            } else {
                this.f42896a1 = false;
                this.f42895Z0 = false;
            }
            R0();
        }
    }

    private final void R0() {
        if (this.f42895Z0) {
            L0().f39270K.f39690F.setAlpha(0.5f);
        } else {
            L0().f39270K.f39690F.setAlpha(1.0f);
        }
        if (!this.f42896a1 && !this.f42895Z0) {
            L0().f39286a0.f38498H.setAlpha(1.0f);
        } else {
            L0().f39286a0.f38498H.setAlpha(0.5f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0() {
        L0().d().setLayoutTransition(new LayoutTransition());
        RelativeLayout d4 = L0().f39285Z.d();
        kotlin.jvm.internal.F.o(d4, "getRoot(...)");
        com.harman.jbl.partybox.utils.q.c(d4);
        L0().f39284Y.a();
    }

    private final void T0() {
        if (isAdded()) {
            T1.a.a("BLE_LOG create initBassBoostFragment");
            L0().f39265F.setVisibility(0);
            this.f42893X0 = new BassBoostFragment();
            androidx.fragment.app.F q4 = getParentFragmentManager().q();
            int i4 = j.h.f41280h1;
            BassBoostFragment bassBoostFragment = this.f42893X0;
            kotlin.jvm.internal.F.m(bassBoostFragment);
            q4.C(i4, bassBoostFragment).r();
        }
    }

    private final void U0() {
        HmDevice k12 = O0().k1();
        if (k12 != null) {
            if (((PartyBoxDevice) k12).P1()) {
                T1.a.a("BLE_LOG create EQFragment");
                this.f42892W0 = new EQFragment();
                androidx.fragment.app.F q4 = getParentFragmentManager().q();
                int i4 = j.h.x4;
                EQFragment eQFragment = this.f42892W0;
                kotlin.jvm.internal.F.m(eQFragment);
                q4.C(i4, eQFragment).r();
                return;
            }
            T1.a.a("BLE_LOG EQ is not supported");
            L0().f39271L.setVisibility(8);
        }
    }

    private final void V0() {
        T1.a.a("BLE_LOG create ListShow");
        if (O0().k1() != null) {
            this.f42890U0 = new LightControlFragment();
            androidx.fragment.app.F q4 = getParentFragmentManager().q();
            int i4 = j.h.ka;
            LightControlFragment lightControlFragment = this.f42890U0;
            kotlin.jvm.internal.F.m(lightControlFragment);
            q4.C(i4, lightControlFragment).r();
        }
    }

    private final void W0() {
        T1.a.a("BLE_LOG create ListShow");
        if (O0().k1() != null) {
            this.f42889T0 = new LightShowFragment();
            androidx.fragment.app.F q4 = getParentFragmentManager().q();
            int i4 = j.h.wa;
            LightShowFragment lightShowFragment = this.f42889T0;
            kotlin.jvm.internal.F.m(lightShowFragment);
            q4.C(i4, lightShowFragment).r();
        }
    }

    private final void X0() {
        T1.a.a("BLE_LOG create MusicControlFragment");
        this.f42891V0 = new MusicControlFragment();
        androidx.fragment.app.F q4 = getParentFragmentManager().q();
        int i4 = j.h.nb;
        MusicControlFragment musicControlFragment = this.f42891V0;
        kotlin.jvm.internal.F.m(musicControlFragment);
        q4.C(i4, musicControlFragment).r();
    }

    private final void Y0() {
        C2323l.f(androidx.lifecycle.F.a(this), null, null, new c(null), 3, null);
        O0().p1().k(getViewLifecycleOwner(), new h(new d()));
    }

    private final boolean Z0() {
        PartyBoxDevice partyBoxDevice;
        HmDevice k12 = O0().k1();
        if (k12 instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) k12;
        } else {
            partyBoxDevice = null;
        }
        boolean z3 = true;
        if (partyBoxDevice == null) {
            com.harman.log.f.a(TAG, "isDeviceOffline() >>> missing main device or not a PartyBox type");
            return true;
        }
        if ((partyBoxDevice.O() && partyBoxDevice.R()) || partyBoxDevice.F1()) {
            z3 = false;
        }
        com.harman.log.f.a(TAG, "isDeviceOffline() >>> MAC[" + partyBoxDevice.n() + "] Classic BT.connected[" + partyBoxDevice.O() + "] BLE.connected[" + partyBoxDevice.R() + "] standby[" + partyBoxDevice.F1() + "]");
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a1() {
        HmDevice k12 = O0().k1();
        if (k12 != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            T1.a.a("BLE_LOG StageDashboardFragment isDeviceStandby :" + partyBoxDevice.F1());
            return partyBoxDevice.F1();
        }
        T1.a.a("BLE_LOG StageDashboardFragment isDeviceStandby :false");
        return false;
    }

    private final void b1() {
        kotlinx.coroutines.L0 f4;
        f4 = C2323l.f(androidx.lifecycle.F.a(this), null, null, new e(null), 3, null);
        this.f42900e1 = f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c1(DashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (this$0.Z0()) {
            return;
        }
        androidx.navigation.I f4 = C2005p.f();
        kotlin.jvm.internal.F.o(f4, "actionDashboardFragmentToSupportFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d1(DashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (this$0.Z0()) {
            return;
        }
        if (!this$0.f42896a1 && !this$0.f42895Z0) {
            HmDevice k12 = this$0.O0().k1();
            if (k12 != null) {
                com.harman.jbl.partybox.ui.party.stereo.D d4 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a;
                if (d4.o(k12)) {
                    z0.b k4 = z0.k(k12, d4.h(k12), EnumStereoType.WIRELESS.g(), EnumStereoChannelFromPage.DASHBOARD.g());
                    kotlin.jvm.internal.F.o(k4, "actionToStereoChannelFragment(...)");
                    com.harman.jbl.partybox.utils.q.f(this$0, k4);
                    return;
                } else {
                    C2005p.c i4 = C2005p.i(k12, EnumStereoType.WIRELESS.g());
                    kotlin.jvm.internal.F.o(i4, "actionToStereoScanFragment(...)");
                    com.harman.jbl.partybox.utils.q.f(this$0, i4);
                    return;
                }
            }
            return;
        }
        r.a aVar = com.harman.jbl.partybox.ui.widget.r.f46149K;
        ConstraintLayout d5 = this$0.L0().d();
        kotlin.jvm.internal.F.o(d5, "getRoot(...)");
        String string = this$0.getString(j.m.ha);
        kotlin.jvm.internal.F.o(string, "getString(...)");
        aVar.b(d5, string).g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e1(DashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (this$0.Z0() && !this$0.a1()) {
            return;
        }
        if (com.harman.jbl.partybox.utils.g.c(1000L)) {
            T1.a.a("BLE_LOG turnOffButton fast clicked");
            return;
        }
        if (this$0.a1()) {
            this$0.p1();
        } else if (!this$0.Z0()) {
            androidx.navigation.I e4 = z0.e();
            kotlin.jvm.internal.F.o(e4, "actionDashboardFragmentToPowerOffFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this$0, e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f1(com.harman.jbl.partybox.databinding.Z this_apply, DashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this_apply, "$this_apply");
        kotlin.jvm.internal.F.p(this$0, "this$0");
        RelativeLayout d4 = this_apply.f39285Z.d();
        kotlin.jvm.internal.F.o(d4, "getRoot(...)");
        com.harman.jbl.partybox.utils.q.c(d4);
        this$0.O0().a3(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g1(DashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (this$0.Z0()) {
            return;
        }
        androidx.navigation.I d4 = C2005p.d();
        kotlin.jvm.internal.F.o(d4, "actionDashboardFragmentToOtaWhatsNew(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, d4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(DashboardFragment this$0, View view) {
        String q4;
        kotlin.jvm.internal.F.p(this$0, "this$0");
        T1.a.a("BLE_LOG karaokeLayout clicked");
        if (this$0.Z0()) {
            return;
        }
        HmDevice k12 = this$0.O0().k1();
        if (k12 != null && (q4 = k12.q()) != null) {
            com.harman.jbl.partybox.constants.a aVar = com.harman.jbl.partybox.constants.a.f38346a;
            com.harman.jbl.partybox.constants.a.f38353d0 = q4;
        }
        androidx.navigation.I c4 = C2005p.c();
        kotlin.jvm.internal.F.o(c4, "actionDashboardFragmentToKaraokeFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(DashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(DashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (this$0.Z0()) {
            return;
        }
        if (this$0.f42895Z0) {
            r.a aVar = com.harman.jbl.partybox.ui.widget.r.f46149K;
            ConstraintLayout d4 = this$0.L0().d();
            kotlin.jvm.internal.F.o(d4, "getRoot(...)");
            String string = this$0.getString(j.m.ga);
            kotlin.jvm.internal.F.o(string, "getString(...)");
            aVar.b(d4, string).g0();
            return;
        }
        T1.a.a("BLE_LOG djEffectLayout clicked");
        androidx.navigation.I b4 = C2005p.b();
        kotlin.jvm.internal.F.o(b4, "actionDashboardFragmentToDjEffectFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, b4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(DashboardFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (this$0.Z0()) {
            return;
        }
        androidx.navigation.I a4 = C2005p.a();
        kotlin.jvm.internal.F.o(a4, "actionDashboardFragmentT…ttonSettingsFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this$0, a4);
    }

    private final void l1() {
        T1.a.a("BLE_LOG retrieveInfoOnceConnected called");
        HmDevice k12 = O0().k1();
        if (k12 != null) {
            O0().P();
            M0().Y(k12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m1(PartyBoxDevice partyBoxDevice, Triple<Integer, Integer, Integer> triple) {
        String str;
        boolean z3;
        Integer h4;
        Integer g4;
        Integer f4;
        B3 b32 = L0().f39286a0;
        b32.f38501K.setText(getString(j.m.eb));
        TextView textView = b32.f38500J;
        if (triple != null && (f4 = triple.f()) != null) {
            str = getString(f4.intValue());
        } else {
            str = null;
        }
        textView.setText(str);
        if (triple != null && (g4 = triple.g()) != null) {
            b32.f38499I.setImageResource(g4.intValue());
        }
        if (triple != null && (h4 = triple.h()) != null) {
            b32.f38497G.setBackgroundResource(h4.intValue());
        }
        boolean V3 = M0().V(partyBoxDevice);
        View icNewDeviceRedDot = b32.f38496F;
        kotlin.jvm.internal.F.o(icNewDeviceRedDot, "icNewDeviceRedDot");
        int i4 = 0;
        if (V3 && !com.harman.jbl.partybox.ui.party.stereo.D.f45020a.o(partyBoxDevice)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            i4 = 8;
        }
        icNewDeviceRedDot.setVisibility(i4);
    }

    private final void n1(String str) {
        Dialog dialog;
        Boolean bool;
        Dialog dialog2;
        RemoveProductDialogFragment removeProductDialogFragment = this.f42897b1;
        if (removeProductDialogFragment != null && (dialog = removeProductDialogFragment.getDialog()) != null && dialog.isShowing()) {
            RemoveProductDialogFragment removeProductDialogFragment2 = this.f42897b1;
            if (removeProductDialogFragment2 != null && (dialog2 = removeProductDialogFragment2.getDialog()) != null) {
                bool = Boolean.valueOf(dialog2.isShowing());
            } else {
                bool = null;
            }
            T1.a.a("BLE_LOG StageDashboardFragment showRemoveProductDialog :" + bool);
            return;
        }
        RemoveProductDialogFragment removeProductDialogFragment3 = new RemoveProductDialogFragment(new i(str, this));
        this.f42897b1 = removeProductDialogFragment3;
        removeProductDialogFragment3.show(getChildFragmentManager(), RemoveProductDialogFragment.class.getSimpleName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o1() {
        RelativeLayout d4 = L0().f39285Z.d();
        kotlin.jvm.internal.F.o(d4, "getRoot(...)");
        com.harman.jbl.partybox.utils.q.i(d4);
        C0();
    }

    private final void onBtnBackClick() {
        T1.a.a("StageDashboardFragment updateUIPage:UiPage.PRODUCT_LIST>>>4");
        O0().x2();
        requireActivity().finish();
    }

    private final void p1() {
        HmDevice k12 = O0().k1();
        if (k12 != null) {
            C2323l.f(androidx.lifecycle.F.a(this), null, null, new j(k12, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q1(String str, BatteryInfo batteryInfo) {
        L0().f39268I.f38649H.setVisibility(0);
        L0().f39268I.f38649H.setText(str);
        if (L0().f39268I.f38650I.getVisibility() != 8 && batteryInfo != null) {
            L0().f39268I.f38651J.c(batteryInfo, "");
        }
    }

    private final void r1() {
        com.harman.jbl.partybox.databinding.Z L02 = L0();
        MatchWidthCardView matchWidthCardView = L02.f39283X;
        matchWidthCardView.getTitle().setText(getString(j.m.x6));
        matchWidthCardView.getDesc().setText(getString(j.m.y6));
        MatchWidthCardView matchWidthCardView2 = L02.f39284Y;
        matchWidthCardView2.getTitle().setText(getString(j.m.f41774j3));
        matchWidthCardView2.getDesc().setText(getString(j.m.B9));
        L02.f39270K.f39692H.setText(getString(j.m.W6));
        L02.f39273N.f40379H.setText(getString(j.m.f41737c1));
        if (O0().x1()) {
            L0().f39285Z.f39696H.setText(j.m.X9);
            T1.a.a("BLE_LOG DashboardFragment Selected String : " + getString(j.m.X9));
        }
        T1.a.a("BLE_LOG DashboardFragment Selected String : " + getString(j.m.W6));
        T1.a.a("BLE_LOG DashboardFragment Selected String : " + getString(j.m.f41737c1));
        T1.a.a("BLE_LOG DashboardFragment Selected String : " + getString(j.m.x6));
        T1.a.a("BLE_LOG DashboardFragment Selected String : " + getString(j.m.A9));
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        M0().a0(O0());
        K0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        kotlinx.coroutines.L0 l02 = this.f42900e1;
        if (l02 != null) {
            L0.a.b(l02, null, 1, null);
        }
        com.harman.jbl.partybox.ui.main.o.f44128m1.h(false);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onResume() {
        String q4;
        super.onResume();
        O0().T2(false);
        O0().c3(false);
        HmDevice k12 = O0().k1();
        if (k12 != null && (q4 = k12.q()) != null) {
            F0(q4);
        }
        l1();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        Integer num;
        boolean K12;
        kotlin.jvm.internal.F.p(view, "view");
        super.onViewCreated(view, bundle);
        HmDevice k12 = O0().k1();
        if (k12 != null) {
            com.harman.jbl.partybox.databinding.Z L02 = L0();
            L02.f39268I.f38649H.setText(k12.p());
            Context context = getContext();
            if (context != null) {
                num = Integer.valueOf(com.harman.sdk.utils.d.r(context, k12.q(), k12.o()));
            } else {
                num = null;
            }
            if (num != null) {
                L02.f39269J.setImageResource(num.intValue());
            }
            K12 = kotlin.text.z.K1(k12.q(), com.harman.jbl.partybox.constants.a.f38333N, true);
            if (K12) {
                L02.f39268I.f38650I.setVisibility(8);
            } else {
                L02.f39268I.f38650I.setVisibility(0);
            }
            if (com.harman.sdk.utils.d.Z(k12.q())) {
                L02.f39268I.f38653L.setVisibility(0);
            } else {
                L02.f39268I.f38653L.setVisibility(4);
            }
        }
        I0();
        final com.harman.jbl.partybox.databinding.Z L03 = L0();
        L03.f39285Z.f39694F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DashboardFragment.f1(com.harman.jbl.partybox.databinding.Z.this, this, view2);
            }
        });
        L03.f39285Z.d().setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DashboardFragment.g1(DashboardFragment.this, view2);
            }
        });
        L03.f39273N.f40377F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DashboardFragment.h1(DashboardFragment.this, view2);
            }
        });
        L03.f39268I.f38647F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DashboardFragment.i1(DashboardFragment.this, view2);
            }
        });
        L03.f39270K.f39690F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DashboardFragment.j1(DashboardFragment.this, view2);
            }
        });
        L03.f39283X.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DashboardFragment.k1(DashboardFragment.this, view2);
            }
        });
        L03.f39284Y.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DashboardFragment.c1(DashboardFragment.this, view2);
            }
        });
        L03.f39286a0.f38498H.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DashboardFragment.d1(DashboardFragment.this, view2);
            }
        });
        L03.f39268I.f38653L.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DashboardFragment.e1(DashboardFragment.this, view2);
            }
        });
        HmDevice k13 = O0().k1();
        if (k13 != null) {
            q1(k13.p(), k13.f());
        }
        O0().Y0().k(getViewLifecycleOwner(), new h(new g()));
        S0();
        com.harman.jbl.partybox.ui.main.o.G0(O0(), null, 1, null);
        r1();
        Y0();
        ActivityC0889g activity = getActivity();
        if (activity == null || !activity.isFinishing()) {
            W0();
            V0();
            X0();
            U0();
            T0();
        }
        HmDevice k14 = O0().k1();
        if (k14 != null && (k14 instanceof PartyBoxDevice)) {
            m1((PartyBoxDevice) k14, M0().Y(k14));
        }
        O0().g2();
        C0();
        b1();
    }
}
