package com.harman.jbl.partybox.ui.party.stereo;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.annotation.K;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.C0741d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.h0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.C0937n;
import androidx.navigation.I;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.AbstractC1878h1;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoChannelConnectState;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoChannelFromPage;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType;
import com.harman.jbl.partybox.ui.widget.r;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.utils.AudioChannel;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;

@E(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u0001kB\u0007¢\u0006\u0004\bi\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\tJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\tJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\tJ\u0019\u0010&\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b&\u0010\u001eJ\r\u0010'\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\tJ\r\u0010(\u001a\u00020\u0005¢\u0006\u0004\b(\u0010\tJ\u0015\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0005H\u0016¢\u0006\u0004\b-\u0010\tJ\u0017\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00130=8\u0006¢\u0006\f\n\u0004\bI\u0010?\u001a\u0004\bJ\u0010AR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00130=8\u0006¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\bM\u0010AR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00130Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010VR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\\R\u0014\u0010a\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010\\R\u0014\u0010c\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010\\R\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00130d8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00130d8F¢\u0006\u0006\u001a\u0004\bh\u0010f¨\u0006l"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/stereo/StereoChannelFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lcom/harman/jbl/partybox/ui/party/stereo/g;", "Lcom/harman/jbl/partybox/databinding/h1;", "binding", "Lkotlin/H0;", "z0", "(Lcom/harman/jbl/partybox/databinding/h1;)V", "y0", "()V", "E0", "r0", "F0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "", "v0", "(Landroid/view/View;)F", "w0", "", "isParty", "C0", "(Z)V", "D0", "", "tag", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "handleOnBackPressed", "onViewStateRestored", "onBtnBackClick", "onSwipeClick", "Lcom/harman/sdk/utils/AudioChannel;", "channel", "onFlashBtnClick", "(Lcom/harman/sdk/utils/AudioChannel;)V", "onUnGroupClick", "Lcom/harman/jbl/partybox/ui/dashboard/UiPage;", "page", "onMainDeviceA2DPDisconnected", "(Lcom/harman/jbl/partybox/ui/dashboard/UiPage;)V", "Lcom/harman/jbl/partybox/ui/party/stereo/StereoChannelViewModel;", "Q0", "Lkotlin/A;", "x0", "()Lcom/harman/jbl/partybox/ui/party/stereo/StereoChannelViewModel;", "viewModel", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "u0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Landroidx/lifecycle/N;", "S0", "Landroidx/lifecycle/N;", "getTitle", "()Landroidx/lifecycle/N;", "title", "Lcom/harman/jbl/partybox/ui/party/stereo/k;", "T0", "Landroidx/navigation/n;", "t0", "()Lcom/harman/jbl/partybox/ui/party/stereo/k;", "args", "U0", "getFlashIconVisible", "flashIconVisible", "V0", "getAuracastTipsVisible", "auracastTipsVisible", "W0", "Lcom/harman/jbl/partybox/databinding/h1;", "Landroidx/lifecycle/P;", "X0", "Landroidx/lifecycle/P;", "_isSwitching", "Y0", "Z", "firstTimeMeasure", "Z0", "isAnimReverse", "Landroid/graphics/PointF;", com.harman.sdk.utils.k.f48625V, "Landroid/graphics/PointF;", "leftImgPoint", "b1", "leftTxtPoint", com.harman.sdk.utils.k.f48619T, "rightImgPoint", "d1", "rightTxtPoint", "Landroidx/lifecycle/LiveData;", "getSwipeBtnClickable", "()Landroidx/lifecycle/LiveData;", "swipeBtnClickable", "isSwitching", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nStereoChannelFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoChannelFragment.kt\ncom/harman/jbl/partybox/ui/party/stereo/StereoChannelFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 4 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,438:1\n56#2,10:439\n66#3,4:449\n42#4,3:453\n262#5,2:456\n*S KotlinDebug\n*F\n+ 1 StereoChannelFragment.kt\ncom/harman/jbl/partybox/ui/party/stereo/StereoChannelFragment\n*L\n55#1:439,10\n57#1:449,4\n61#1:453,3\n145#1:456,2\n*E\n"})
/* loaded from: classes2.dex */
public final class StereoChannelFragment extends BackDispatcherFragment implements com.harman.jbl.partybox.ui.party.stereo.g {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: e1, reason: collision with root package name */
    @l3.d
    private static final String f45038e1 = "Party.Stereo.ChannelFragment";

    /* renamed from: f1, reason: collision with root package name */
    private static final long f45039f1 = 1000;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f45040Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f45041R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final N<String> f45042S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private final C0937n f45043T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private final N<Boolean> f45044U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private final N<Boolean> f45045V0;

    /* renamed from: W0, reason: collision with root package name */
    @l3.e
    private AbstractC1878h1 f45046W0;

    /* renamed from: X0, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f45047X0;

    /* renamed from: Y0, reason: collision with root package name */
    private boolean f45048Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private boolean f45049Z0;

    /* renamed from: a1, reason: collision with root package name */
    @l3.d
    private final PointF f45050a1;

    /* renamed from: b1, reason: collision with root package name */
    @l3.d
    private final PointF f45051b1;

    /* renamed from: c1, reason: collision with root package name */
    @l3.d
    private final PointF f45052c1;

    /* renamed from: d1, reason: collision with root package name */
    @l3.d
    private final PointF f45053d1;

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
    public static final class b extends Lambda implements X2.l<HmDevice, H0> {
        b() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(HmDevice hmDevice) {
            if (com.harman.jbl.partybox.ui.party.b.f44881a.o(hmDevice, StereoChannelFragment.this.x0().A())) {
                D d4 = D.f45020a;
                F.m(hmDevice);
                if (!d4.o(hmDevice)) {
                    StereoChannelFragment.this.onBtnBackClick();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<Boolean, H0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoChannelFragment$initWirelessView$3$1$1", f = "StereoChannelFragment.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f45061I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ StereoChannelFragment f45062J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(StereoChannelFragment stereoChannelFragment, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f45062J = stereoChannelFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f45061I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    this.f45061I = 1;
                    if (C2269d0.b(500L, this) == l4) {
                        return l4;
                    }
                }
                this.f45062J.C0(true);
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
                return new a(this.f45062J, cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoChannelFragment$initWirelessView$3$1$2", f = "StereoChannelFragment.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f45063I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ StereoChannelFragment f45064J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(StereoChannelFragment stereoChannelFragment, kotlin.coroutines.c<? super b> cVar) {
                super(2, cVar);
                this.f45064J = stereoChannelFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f45063I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    this.f45063I = 1;
                    if (C2269d0.b(500L, this) == l4) {
                        return l4;
                    }
                }
                this.f45064J.C0(false);
                return H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((b) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new b(this.f45064J, cVar);
            }
        }

        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            T1.a.a("BLE_LOG Party.Stereo.ChannelFragment activeChannelChangeLiveData.observe called");
            HmDevice k12 = StereoChannelFragment.this.u0().k1();
            if (k12 != null) {
                StereoChannelFragment stereoChannelFragment = StereoChannelFragment.this;
                AudioChannel i4 = ((PartyBoxDevice) k12).i();
                T1.a.a("BLE_LOG Party.Stereo.ChannelFragment activeChannelChangeLiveData channelInfo : " + i4);
                if (i4 == AudioChannel.NONE_CHANNEL) {
                    T1.a.a("BLE_LOG Party.Stereo.ChannelFragment activeChannelChangeLiveData channelInfo is ACTIVE_CHANNEL_PARTY, call moveView");
                    C2323l.f(androidx.lifecycle.F.a(stereoChannelFragment), null, null, new a(stereoChannelFragment, null), 3, null);
                } else {
                    T1.a.a("BLE_LOG Party.Stereo.ChannelFragment activeChannelChangeLiveData channelInfo is Stereo, call moveView");
                    C2323l.f(androidx.lifecycle.F.a(stereoChannelFragment), null, null, new b(stereoChannelFragment, null), 3, null);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.l<EnumStereoChannelConnectState, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<String> f45065F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ StereoChannelFragment f45066G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(N<String> n4, StereoChannelFragment stereoChannelFragment) {
            super(1);
            this.f45065F = n4;
            this.f45066G = stereoChannelFragment;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(EnumStereoChannelConnectState enumStereoChannelConnectState) {
            c(enumStereoChannelConnectState);
            return H0.f51801a;
        }

        public final void c(@l3.d EnumStereoChannelConnectState state) {
            String string;
            F.p(state, "state");
            N<String> n4 = this.f45065F;
            if (EnumStereoType.WIRELESS == this.f45066G.x0().B().f()) {
                string = this.f45066G.getResources().getString(j.m.eb);
            } else if (EnumStereoType.TWS == this.f45066G.x0().B().f()) {
                string = this.f45066G.getResources().getString(j.m.h5);
            } else if (EnumStereoChannelConnectState.CONNECTED == state && EnumStereoType.STEREO == this.f45066G.x0().B().f()) {
                string = this.f45066G.getResources().getString(j.m.f41645G);
            } else {
                string = this.f45066G.getResources().getString(j.m.f41645G);
            }
            n4.r(string);
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements X2.l<EnumStereoType, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<String> f45067F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ StereoChannelFragment f45068G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(N<String> n4, StereoChannelFragment stereoChannelFragment) {
            super(1);
            this.f45067F = n4;
            this.f45068G = stereoChannelFragment;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(EnumStereoType enumStereoType) {
            c(enumStereoType);
            return H0.f51801a;
        }

        public final void c(@l3.d EnumStereoType type) {
            String string;
            F.p(type, "type");
            N<String> n4 = this.f45067F;
            if (EnumStereoType.WIRELESS == this.f45068G.x0().B().f()) {
                string = this.f45068G.getResources().getString(j.m.eb);
            } else if (EnumStereoType.TWS == type) {
                string = this.f45068G.getResources().getString(j.m.h5);
            } else if (EnumStereoChannelConnectState.CONNECTED == this.f45068G.x0().y().f() && EnumStereoType.STEREO == type) {
                string = this.f45068G.getResources().getString(j.m.f41645G);
            } else {
                string = this.f45068G.getResources().getString(j.m.f41645G);
            }
            n4.r(string);
        }
    }

    /* loaded from: classes2.dex */
    static final class f extends Lambda implements X2.l<EnumStereoChannelConnectState, H0> {
        f() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(EnumStereoChannelConnectState enumStereoChannelConnectState) {
            c(enumStereoChannelConnectState);
            return H0.f51801a;
        }

        public final void c(@l3.d EnumStereoChannelConnectState state) {
            boolean z3;
            F.p(state, "state");
            N<Boolean> flashIconVisible = StereoChannelFragment.this.getFlashIconVisible();
            if (EnumStereoChannelConnectState.CONNECTED == state && EnumStereoType.STEREO == StereoChannelFragment.this.x0().B().f()) {
                z3 = true;
            } else {
                z3 = false;
            }
            flashIconVisible.r(Boolean.valueOf(z3));
        }
    }

    /* loaded from: classes2.dex */
    static final class g extends Lambda implements X2.l<EnumStereoChannelConnectState, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<Boolean> f45070F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ StereoChannelFragment f45071G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(N<Boolean> n4, StereoChannelFragment stereoChannelFragment) {
            super(1);
            this.f45070F = n4;
            this.f45071G = stereoChannelFragment;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(EnumStereoChannelConnectState enumStereoChannelConnectState) {
            c(enumStereoChannelConnectState);
            return H0.f51801a;
        }

        public final void c(@l3.d EnumStereoChannelConnectState state) {
            boolean z3;
            F.p(state, "state");
            N<Boolean> n4 = this.f45070F;
            if (EnumStereoChannelConnectState.UNCONNECTED == state && EnumStereoType.STEREO == this.f45071G.x0().B().f()) {
                z3 = true;
            } else {
                z3 = false;
            }
            n4.r(Boolean.valueOf(z3));
        }
    }

    /* loaded from: classes2.dex */
    static final class h extends Lambda implements X2.l<EnumStereoType, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<Boolean> f45072F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ StereoChannelFragment f45073G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(N<Boolean> n4, StereoChannelFragment stereoChannelFragment) {
            super(1);
            this.f45072F = n4;
            this.f45073G = stereoChannelFragment;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(EnumStereoType enumStereoType) {
            c(enumStereoType);
            return H0.f51801a;
        }

        public final void c(@l3.d EnumStereoType type) {
            boolean z3;
            F.p(type, "type");
            N<Boolean> n4 = this.f45072F;
            if (EnumStereoChannelConnectState.UNCONNECTED == this.f45073G.x0().y().f() && EnumStereoType.STEREO == type) {
                z3 = true;
            } else {
                z3 = false;
            }
            n4.r(Boolean.valueOf(z3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoChannelFragment$onSwipeClick$1", f = "StereoChannelFragment.kt", i = {}, l = {279, 281}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class i extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45074I;

        i(kotlin.coroutines.c<? super i> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f45074I;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        W.n(obj);
                        StereoChannelFragment.this.f45047X0.r(kotlin.coroutines.jvm.internal.a.a(false));
                        return H0.f51801a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                W.n(obj);
            } else {
                W.n(obj);
                if (F.g(kotlin.coroutines.jvm.internal.a.a(true), StereoChannelFragment.this.f45047X0.f())) {
                    return H0.f51801a;
                }
                StereoChannelFragment.this.f45047X0.r(kotlin.coroutines.jvm.internal.a.a(true));
                StereoChannelFragment.this.D0();
                StereoChannelViewModel x02 = StereoChannelFragment.this.x0();
                this.f45074I = 1;
                obj = x02.G(this);
                if (obj == l4) {
                    return l4;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                StereoChannelFragment.this.F0();
                this.f45074I = 2;
                if (C2269d0.b(1000L, this) == l4) {
                    return l4;
                }
            }
            StereoChannelFragment.this.f45047X0.r(kotlin.coroutines.jvm.internal.a.a(false));
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((i) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new i(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoChannelFragment$onUnGroupClick$1", f = "StereoChannelFragment.kt", i = {}, l = {301, 304}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class j extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45076I;

        j(kotlin.coroutines.c<? super j> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            HmCustomFontTextView hmCustomFontTextView;
            ImageView imageView;
            ImageView imageView2;
            AbstractC1878h1 abstractC1878h1;
            ImageView imageView3;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f45076I;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        W.n(obj);
                        abstractC1878h1 = StereoChannelFragment.this.f45046W0;
                        if (abstractC1878h1 != null && (imageView3 = abstractC1878h1.f39654q0) != null) {
                            com.harman.jbl.partybox.ui.party.a.E(imageView3);
                        }
                        StereoChannelFragment stereoChannelFragment = StereoChannelFragment.this;
                        I b4 = m.b();
                        F.o(b4, "toStageDashboardFragment(...)");
                        com.harman.jbl.partybox.utils.q.f(stereoChannelFragment, b4);
                        return H0.f51801a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                W.n(obj);
            } else {
                W.n(obj);
                StereoChannelViewModel x02 = StereoChannelFragment.this.x0();
                this.f45076I = 1;
                obj = x02.H(this);
                if (obj == l4) {
                    return l4;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                int f4 = StereoChannelFragment.this.t0().f();
                if (f4 == EnumStereoType.TWS.g()) {
                    this.f45076I = 2;
                    if (C2269d0.b(2000L, this) == l4) {
                        return l4;
                    }
                    abstractC1878h1 = StereoChannelFragment.this.f45046W0;
                    if (abstractC1878h1 != null) {
                        com.harman.jbl.partybox.ui.party.a.E(imageView3);
                    }
                    StereoChannelFragment stereoChannelFragment2 = StereoChannelFragment.this;
                    I b42 = m.b();
                    F.o(b42, "toStageDashboardFragment(...)");
                    com.harman.jbl.partybox.utils.q.f(stereoChannelFragment2, b42);
                } else if (f4 == EnumStereoType.STEREO.g()) {
                    StereoChannelFragment stereoChannelFragment3 = StereoChannelFragment.this;
                    I b5 = m.b();
                    F.o(b5, "toStageDashboardFragment(...)");
                    com.harman.jbl.partybox.utils.q.f(stereoChannelFragment3, b5);
                } else if (f4 == EnumStereoType.WIRELESS.g()) {
                    StereoChannelFragment stereoChannelFragment4 = StereoChannelFragment.this;
                    I a4 = m.a();
                    F.o(a4, "toDashboardFragment(...)");
                    com.harman.jbl.partybox.utils.q.f(stereoChannelFragment4, a4);
                }
            } else if (StereoChannelFragment.this.t0().f() == EnumStereoType.TWS.g()) {
                AbstractC1878h1 abstractC1878h12 = StereoChannelFragment.this.f45046W0;
                ImageView imageView4 = null;
                if (abstractC1878h12 != null) {
                    hmCustomFontTextView = abstractC1878h12.f39639Q0;
                } else {
                    hmCustomFontTextView = null;
                }
                if (hmCustomFontTextView != null) {
                    hmCustomFontTextView.setVisibility(0);
                }
                AbstractC1878h1 abstractC1878h13 = StereoChannelFragment.this.f45046W0;
                if (abstractC1878h13 != null) {
                    imageView = abstractC1878h13.f39660w0;
                } else {
                    imageView = null;
                }
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                AbstractC1878h1 abstractC1878h14 = StereoChannelFragment.this.f45046W0;
                if (abstractC1878h14 != null) {
                    imageView4 = abstractC1878h14.f39654q0;
                }
                if (imageView4 != null) {
                    imageView4.setVisibility(4);
                }
                AbstractC1878h1 abstractC1878h15 = StereoChannelFragment.this.f45046W0;
                if (abstractC1878h15 != null && (imageView2 = abstractC1878h15.f39654q0) != null) {
                    com.harman.jbl.partybox.ui.party.a.E(imageView2);
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((j) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new j(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class k implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f45078a;

        k(X2.l function) {
            F.p(function, "function");
            this.f45078a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45078a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45078a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class l extends Lambda implements X2.l<EnumStereoChannelConnectState, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        public static final l f45079F = new l();

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f45080a;

            static {
                int[] iArr = new int[EnumStereoChannelConnectState.values().length];
                try {
                    iArr[EnumStereoChannelConnectState.CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f45080a = iArr;
            }
        }

        l() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d EnumStereoChannelConnectState style) {
            F.p(style, "style");
            boolean z3 = true;
            if (a.f45080a[style.ordinal()] != 1) {
                z3 = false;
            }
            return Boolean.valueOf(z3);
        }
    }

    public StereoChannelFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoChannelFragment$special$$inlined$viewModels$default$1
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
        this.f45040Q0 = FragmentViewModelLazyKt.c(this, kotlin.jvm.internal.N.d(StereoChannelViewModel.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoChannelFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoChannelFragment$special$$inlined$viewModels$default$3
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
        this.f45041R0 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f45042S0 = new N<>();
        this.f45043T0 = new C0937n(kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.party.stereo.k.class), new X2.a<Bundle>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoChannelFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Bundle n() {
                Bundle arguments = Fragment.this.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + Fragment.this + " has null arguments");
            }
        });
        this.f45044U0 = new N<>();
        this.f45045V0 = new N<>();
        this.f45047X0 = new P<>(Boolean.FALSE);
        this.f45048Y0 = true;
        this.f45050a1 = new PointF();
        this.f45051b1 = new PointF();
        this.f45052c1 = new PointF();
        this.f45053d1 = new PointF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(StereoChannelFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.r0();
        HmDevice A3 = this$0.x0().A();
        if (A3 != null) {
            this$0.x0().I(A3, AudioChannel.NONE_CHANNEL);
            this$0.u0().m2(L1.a.f1644r2, "party", new Bundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(StereoChannelFragment this$0, AbstractC1878h1 binding, View view) {
        F.p(this$0, "this$0");
        F.p(binding, "$binding");
        if (!this$0.x0().v()) {
            r.a aVar = com.harman.jbl.partybox.ui.widget.r.f46149K;
            View d4 = binding.d();
            F.o(d4, "getRoot(...)");
            String string = this$0.getString(j.m.z9);
            F.o(string, "getString(...)");
            aVar.b(d4, string).g0();
            return;
        }
        this$0.r0();
        this$0.E0();
        this$0.u0().m2(L1.a.f1644r2, "stereo", new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(boolean z3) {
        AbstractC1878h1 abstractC1878h1;
        T1.a.a("BLE_LOG Party.Stereo.ChannelFragment moveView isParty is " + z3);
        if (isAdded() && isVisible() && (abstractC1878h1 = this.f45046W0) != null) {
            Drawable drawable = null;
            if (z3) {
                this.f45044U0.r(Boolean.FALSE);
                View view = abstractC1878h1.f39629G0;
                Context context = getContext();
                if (context != null) {
                    drawable = context.getDrawable(j.f.f8);
                }
                view.setBackground(drawable);
                T1.a.a("BLE_LOG Party.Stereo.ChannelFragment moveView isParty nextActionGlowButton animate called for Party ");
                ViewPropertyAnimator animate = abstractC1878h1.f39629G0.animate();
                if (animate != null) {
                    animate.translationX(-((abstractC1878h1.f39643U0.getMeasuredWidth() / 2) - 20));
                    return;
                }
                return;
            }
            this.f45044U0.r(Boolean.TRUE);
            View view2 = abstractC1878h1.f39629G0;
            Context context2 = getContext();
            if (context2 != null) {
                drawable = context2.getDrawable(j.f.f40989V);
            }
            view2.setBackground(drawable);
            T1.a.a("BLE_LOG Party.Stereo.ChannelFragment moveView isParty nextActionGlowButton animate called for Stereo ");
            ViewPropertyAnimator animate2 = abstractC1878h1.f39629G0.animate();
            if (animate2 != null) {
                animate2.translationX(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0() {
        u0().k2(L1.a.f1614l2, C0741d.a());
    }

    private final void E0() {
        AudioChannel audioChannel;
        HmDevice A3 = x0().A();
        if (A3 != null) {
            if (F.g(x0().A(), x0().z())) {
                audioChannel = AudioChannel.STEREO_LEFT;
            } else {
                audioChannel = AudioChannel.STEREO_RIGHT;
            }
            x0().I(A3, audioChannel);
            u0().k2(L1.a.f1614l2, C0741d.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @K
    public final void F0() {
        ConstraintLayout constraintLayout;
        HmCustomFontTextView hmCustomFontTextView;
        ConstraintLayout constraintLayout2;
        HmCustomFontTextView hmCustomFontTextView2;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        AbstractC1878h1 abstractC1878h1 = this.f45046W0;
        if (abstractC1878h1 != null && (constraintLayout = abstractC1878h1.f39663z0) != null && abstractC1878h1 != null && (hmCustomFontTextView = abstractC1878h1.f39636N0) != null && abstractC1878h1 != null && (constraintLayout2 = abstractC1878h1.f39628F0) != null && abstractC1878h1 != null && (hmCustomFontTextView2 = abstractC1878h1.f39637O0) != null) {
            if (this.f45048Y0) {
                this.f45048Y0 = false;
                this.f45050a1.set(v0(constraintLayout), w0(constraintLayout));
                this.f45051b1.set(v0(hmCustomFontTextView), w0(hmCustomFontTextView));
                this.f45052c1.set(v0(constraintLayout2), w0(constraintLayout2));
                this.f45053d1.set(v0(hmCustomFontTextView2), w0(hmCustomFontTextView2));
            }
            boolean z3 = !this.f45049Z0;
            this.f45049Z0 = z3;
            if (z3) {
                PointF pointF = this.f45052c1;
                float f9 = pointF.x;
                PointF pointF2 = this.f45050a1;
                f4 = f9 - pointF2.x;
                f5 = pointF.y - pointF2.y;
                PointF pointF3 = this.f45053d1;
                float f10 = pointF3.x;
                PointF pointF4 = this.f45051b1;
                f6 = f10 - pointF4.x;
                f7 = pointF3.y;
                f8 = pointF4.y;
            } else {
                PointF pointF5 = this.f45050a1;
                float f11 = pointF5.x;
                PointF pointF6 = this.f45052c1;
                f4 = f11 - pointF6.x;
                f5 = pointF5.y - pointF6.y;
                PointF pointF7 = this.f45051b1;
                float f12 = pointF7.x;
                PointF pointF8 = this.f45053d1;
                f6 = f12 - pointF8.x;
                f7 = pointF7.y;
                f8 = pointF8.y;
            }
            float f13 = f7 - f8;
            constraintLayout.animate().xBy(f4).yBy(f5).setDuration(1000L);
            hmCustomFontTextView.animate().xBy(f6).yBy(f13).setDuration(1000L);
            constraintLayout2.animate().xBy(-f4).yBy(-f5).setDuration(1000L);
            hmCustomFontTextView2.animate().xBy(-f6).yBy(-f13).setDuration(1000L);
        }
    }

    private final void r0() {
        final AbstractC1878h1 abstractC1878h1 = this.f45046W0;
        if (abstractC1878h1 != null) {
            abstractC1878h1.f39633K0.setClickable(false);
            abstractC1878h1.f39631I0.setClickable(false);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.party.stereo.j
                @Override // java.lang.Runnable
                public final void run() {
                    StereoChannelFragment.s0(AbstractC1878h1.this);
                }
            }, 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(AbstractC1878h1 this_apply) {
        F.p(this_apply, "$this_apply");
        this_apply.f39633K0.setClickable(true);
        this_apply.f39631I0.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final com.harman.jbl.partybox.ui.party.stereo.k t0() {
        return (com.harman.jbl.partybox.ui.party.stereo.k) this.f45043T0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o u0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f45041R0.getValue();
    }

    private final float v0(View view) {
        View view2;
        if (view == null) {
            return 0.0f;
        }
        if (view.getParent() == view.getRootView()) {
            return view.getX();
        }
        float x3 = view.getX();
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        return v0(view2) + x3;
    }

    private final float w0(View view) {
        View view2;
        if (view == null) {
            return 0.0f;
        }
        if (view.getParent() == view.getRootView()) {
            return view.getY();
        }
        float y3 = view.getY();
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        return w0(view2) + y3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StereoChannelViewModel x0() {
        return (StereoChannelViewModel) this.f45040Q0.getValue();
    }

    private final void y0() {
        u0().Y0().k(this, new k(new b()));
    }

    private final void z0(final AbstractC1878h1 abstractC1878h1) {
        if (t0().f() == EnumStereoType.WIRELESS.g()) {
            abstractC1878h1.f39639Q0.setText(getString(j.m.n5));
            if (x0().v()) {
                ConstraintLayout twsModeLayout = abstractC1878h1.f39640R0;
                F.o(twsModeLayout, "twsModeLayout");
                twsModeLayout.setVisibility(0);
                abstractC1878h1.f39631I0.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.party.stereo.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StereoChannelFragment.A0(StereoChannelFragment.this, view);
                    }
                });
                abstractC1878h1.f39633K0.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.party.stereo.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StereoChannelFragment.B0(StereoChannelFragment.this, abstractC1878h1, view);
                    }
                });
                u0().S0().k(getViewLifecycleOwner(), new k(new c()));
                u0().O2(true);
                return;
            }
            return;
        }
        if (t0().f() == EnumStereoType.TWS.g()) {
            abstractC1878h1.f39639Q0.setText(getString(j.m.n5));
        }
    }

    @l3.d
    public final N<Boolean> getAuracastTipsVisible() {
        return this.f45045V0;
    }

    @l3.d
    public final N<Boolean> getFlashIconVisible() {
        return this.f45044U0;
    }

    @l3.d
    public final LiveData<Boolean> getSwipeBtnClickable() {
        return h0.b(x0().y(), l.f45079F);
    }

    @l3.d
    public final N<String> getTitle() {
        return this.f45042S0;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @l3.d
    public final LiveData<Boolean> isSwitching() {
        return this.f45047X0;
    }

    public final void onBtnBackClick() {
        if (t0().d() == EnumStereoChannelFromPage.STEREO_CREATE.g()) {
            int f4 = t0().f();
            if (f4 == EnumStereoType.STEREO.g()) {
                I b4 = m.b();
                F.o(b4, "toStageDashboardFragment(...)");
                com.harman.jbl.partybox.utils.q.f(this, b4);
                return;
            } else if (f4 == EnumStereoType.TWS.g()) {
                I b5 = m.b();
                F.o(b5, "toStageDashboardFragment(...)");
                com.harman.jbl.partybox.utils.q.f(this, b5);
                return;
            } else {
                I a4 = m.a();
                F.o(a4, "toDashboardFragment(...)");
                com.harman.jbl.partybox.utils.q.f(this, a4);
                return;
            }
        }
        androidx.navigation.fragment.f.a(this).t0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().a(x0());
        x0().u(t0());
        N<String> n4 = this.f45042S0;
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        bVar.l(n4, x0().y(), new k(new d(n4, this)));
        bVar.l(n4, x0().B(), new k(new e(n4, this)));
        bVar.l(this.f45044U0, x0().y(), new k(new f()));
        N<Boolean> n5 = this.f45045V0;
        bVar.l(n5, x0().y(), new k(new g(n5, this)));
        bVar.l(n5, x0().B(), new k(new h(n5, this)));
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        AbstractC1878h1 t12 = AbstractC1878h1.t1(inflater, viewGroup, false);
        F.o(t12, "inflate(...)");
        t12.w1(this);
        t12.x1(x0());
        t12.M0(this);
        this.f45046W0 = t12;
        z0(t12);
        y0();
        this.f45048Y0 = true;
        return t12.d();
    }

    public final void onFlashBtnClick(@l3.d AudioChannel channel) {
        F.p(channel, "channel");
        x0().E(channel);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void onMainDeviceA2DPDisconnected(@l3.d UiPage page) {
        F.p(page, "page");
        com.harman.log.f.a(f45038e1, "onMainDeviceA2DPDisconnected() >>> page[" + page.name() + "]");
    }

    public final void onSwipeClick() {
        C2323l.f(androidx.lifecycle.F.a(this), C2322k0.e(), null, new i(null), 2, null);
    }

    @Override // com.harman.jbl.partybox.ui.party.stereo.g
    public void onUnGroupClick() {
        HmCustomFontTextView hmCustomFontTextView;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        if (t0().f() == EnumStereoType.TWS.g()) {
            AbstractC1878h1 abstractC1878h1 = this.f45046W0;
            if (abstractC1878h1 != null) {
                hmCustomFontTextView = abstractC1878h1.f39639Q0;
            } else {
                hmCustomFontTextView = null;
            }
            if (hmCustomFontTextView != null) {
                hmCustomFontTextView.setVisibility(4);
            }
            AbstractC1878h1 abstractC1878h12 = this.f45046W0;
            if (abstractC1878h12 != null) {
                imageView = abstractC1878h12.f39660w0;
            } else {
                imageView = null;
            }
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            AbstractC1878h1 abstractC1878h13 = this.f45046W0;
            if (abstractC1878h13 != null) {
                imageView2 = abstractC1878h13.f39654q0;
            } else {
                imageView2 = null;
            }
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            AbstractC1878h1 abstractC1878h14 = this.f45046W0;
            if (abstractC1878h14 != null && (imageView3 = abstractC1878h14.f39654q0) != null) {
                com.harman.jbl.partybox.ui.party.a.D(imageView3);
            }
        }
        C2323l.f(androidx.lifecycle.F.a(this), C2322k0.e(), null, new j(null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@l3.e Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.f45048Y0 = true;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    @l3.d
    public String tag() {
        return f45038e1;
    }
}
