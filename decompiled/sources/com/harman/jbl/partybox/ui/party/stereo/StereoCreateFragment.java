package com.harman.jbl.partybox.ui.party.stereo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.C0937n;
import androidx.navigation.I;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.AbstractC1888j1;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoChannelFromPage;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoRenameFromPage;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType;
import com.harman.jbl.partybox.ui.party.stereo.q;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.L0;

@E(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\bA\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\fJ+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u0015\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u0004J\u0017\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/stereo/StereoCreateFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "r0", "()V", "s0", "w0", "u0", "t0", "Landroid/os/Bundle;", "bundle", "v0", "(Landroid/os/Bundle;)V", "", "tag", "()Ljava/lang/String;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "handleOnBackPressed", "onDestroy", "onBtnBackClick", "onPlacementBannerBtnClick", "Lcom/harman/sdk/utils/AudioChannel;", "channel", "onChannelSelected", "(Lcom/harman/sdk/utils/AudioChannel;)V", "onChannelSelectedBtnClick", "Lcom/harman/jbl/partybox/ui/dashboard/UiPage;", "page", "onMainDeviceA2DPDisconnected", "(Lcom/harman/jbl/partybox/ui/dashboard/UiPage;)V", "Lcom/harman/jbl/partybox/ui/party/stereo/s;", "Q0", "Lkotlin/A;", "q0", "()Lcom/harman/jbl/partybox/ui/party/stereo/s;", "stereoCreateViewModel", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "p0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/party/stereo/n;", "S0", "Landroidx/navigation/n;", "o0", "()Lcom/harman/jbl/partybox/ui/party/stereo/n;", "args", "Lcom/harman/jbl/partybox/databinding/j1;", "T0", "Lcom/harman/jbl/partybox/databinding/j1;", "binding", "Lkotlinx/coroutines/L0;", "U0", "Lkotlinx/coroutines/L0;", "selectChannelDelayJob", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nStereoCreateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoCreateFragment.kt\ncom/harman/jbl/partybox/ui/party/stereo/StereoCreateFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 4 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,280:1\n56#2,10:281\n66#3,4:291\n42#4,3:295\n*S KotlinDebug\n*F\n+ 1 StereoCreateFragment.kt\ncom/harman/jbl/partybox/ui/party/stereo/StereoCreateFragment\n*L\n53#1:281,10\n55#1:291,4\n57#1:295,3\n*E\n"})
/* loaded from: classes2.dex */
public final class StereoCreateFragment extends BackDispatcherFragment {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private static final String f45124V0 = "Party.Stereo.CreateFragment";

    /* renamed from: W0, reason: collision with root package name */
    private static final long f45125W0 = 180000;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f45126Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f45127R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final C0937n f45128S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.e
    private AbstractC1888j1 f45129T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.e
    private L0 f45130U0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoCreateFragment$launchSelectChannelDelayJob$1", f = "StereoCreateFragment.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45136I;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f45136I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                this.f45136I = 1;
                if (C2269d0.b(StereoCreateFragment.f45125W0, this) == l4) {
                    return l4;
                }
            }
            StereoCreateFragment.this.q0().J();
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
            return new b(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends FunctionReferenceImpl implements X2.l<Bundle, H0> {
        c(Object obj) {
            super(1, obj, StereoCreateFragment.class, "reportActionTwsConnect", "reportActionTwsConnect(Landroid/os/Bundle;)V", 0);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Bundle bundle) {
            C0(bundle);
            return H0.f51801a;
        }

        public final void C0(@l3.d Bundle p02) {
            F.p(p02, "p0");
            ((StereoCreateFragment) this.f52262F).v0(p02);
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class d extends FunctionReferenceImpl implements X2.l<Bundle, H0> {
        d(Object obj) {
            super(1, obj, StereoCreateFragment.class, "reportActionTwsConnect", "reportActionTwsConnect(Landroid/os/Bundle;)V", 0);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Bundle bundle) {
            C0(bundle);
            return H0.f51801a;
        }

        public final void C0(@l3.d Bundle p02) {
            F.p(p02, "p0");
            ((StereoCreateFragment) this.f52262F).v0(p02);
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements X2.l<com.harman.jbl.partybox.ui.party.stereo.state.create.e, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(com.harman.jbl.partybox.ui.party.stereo.state.create.e eVar) {
            c(eVar);
            return H0.f51801a;
        }

        public final void c(com.harman.jbl.partybox.ui.party.stereo.state.create.e eVar) {
            LottieAnimationView lottieAnimationView;
            LottieAnimationView lottieAnimationView2;
            LottieAnimationView lottieAnimationView3;
            LottieAnimationView lottieAnimationView4;
            LottieAnimationView lottieAnimationView5;
            LottieAnimationView lottieAnimationView6;
            LottieAnimationView lottieAnimationView7;
            LottieAnimationView lottieAnimationView8;
            if (F.g(eVar, com.harman.jbl.partybox.ui.party.stereo.state.create.d.f45289a)) {
                StereoCreateFragment.this.q0().E();
                StereoCreateFragment.this.r0();
                return;
            }
            if (F.g(eVar, com.harman.jbl.partybox.ui.party.stereo.state.create.c.f45288a)) {
                AbstractC1888j1 abstractC1888j1 = StereoCreateFragment.this.f45129T0;
                if (abstractC1888j1 != null && (lottieAnimationView8 = abstractC1888j1.f39713q0) != null) {
                    lottieAnimationView8.m();
                }
                StereoCreateFragment.this.q0().F();
                StereoCreateFragment.this.q0().x();
                StereoCreateFragment.this.s0();
                return;
            }
            if (F.g(eVar, com.harman.jbl.partybox.ui.party.stereo.state.create.g.f45320a)) {
                AbstractC1888j1 abstractC1888j12 = StereoCreateFragment.this.f45129T0;
                if (abstractC1888j12 != null && (lottieAnimationView7 = abstractC1888j12.f39713q0) != null) {
                    lottieAnimationView7.m();
                }
                StereoCreateFragment.this.q0().x();
                StereoCreateFragment.this.w0();
                StereoCreateFragment.this.u0();
                return;
            }
            HmCustomFontTextView hmCustomFontTextView = null;
            if (F.g(eVar, com.harman.jbl.partybox.ui.party.stereo.state.create.f.f45292a)) {
                L0 l02 = StereoCreateFragment.this.f45130U0;
                if (l02 != null) {
                    L0.a.b(l02, null, 1, null);
                }
                AbstractC1888j1 abstractC1888j13 = StereoCreateFragment.this.f45129T0;
                if (abstractC1888j13 != null) {
                    hmCustomFontTextView = abstractC1888j13.f39717u0;
                }
                if (hmCustomFontTextView != null) {
                    hmCustomFontTextView.setText(StereoCreateFragment.this.getString(j.m.f41674N0));
                }
                AbstractC1888j1 abstractC1888j14 = StereoCreateFragment.this.f45129T0;
                if (abstractC1888j14 != null && (lottieAnimationView6 = abstractC1888j14.f39713q0) != null) {
                    lottieAnimationView6.setAnimation(j.l.f41607m);
                    lottieAnimationView6.B();
                    return;
                }
                return;
            }
            if (F.g(eVar, com.harman.jbl.partybox.ui.party.stereo.state.create.i.f45322a)) {
                L0 l03 = StereoCreateFragment.this.f45130U0;
                if (l03 != null) {
                    L0.a.b(l03, null, 1, null);
                }
                AbstractC1888j1 abstractC1888j15 = StereoCreateFragment.this.f45129T0;
                if (abstractC1888j15 != null) {
                    hmCustomFontTextView = abstractC1888j15.f39717u0;
                }
                if (hmCustomFontTextView != null) {
                    hmCustomFontTextView.setText(StereoCreateFragment.this.getString(j.m.I6));
                }
                AbstractC1888j1 abstractC1888j16 = StereoCreateFragment.this.f45129T0;
                if (abstractC1888j16 != null && (lottieAnimationView5 = abstractC1888j16.f39713q0) != null) {
                    lottieAnimationView5.setAnimation(j.l.f41607m);
                    lottieAnimationView5.B();
                    return;
                }
                return;
            }
            if (F.g(eVar, com.harman.jbl.partybox.ui.party.stereo.state.create.h.f45321a)) {
                AbstractC1888j1 abstractC1888j17 = StereoCreateFragment.this.f45129T0;
                if (abstractC1888j17 != null && (lottieAnimationView4 = abstractC1888j17.f39713q0) != null) {
                    lottieAnimationView4.m();
                }
                androidx.navigation.fragment.f.a(StereoCreateFragment.this).t0();
                return;
            }
            if (F.g(eVar, com.harman.jbl.partybox.ui.party.stereo.state.create.b.f45287a)) {
                AbstractC1888j1 abstractC1888j18 = StereoCreateFragment.this.f45129T0;
                if (abstractC1888j18 != null && (lottieAnimationView3 = abstractC1888j18.f39713q0) != null) {
                    lottieAnimationView3.m();
                    return;
                }
                return;
            }
            if (F.g(eVar, com.harman.jbl.partybox.ui.party.stereo.state.create.a.f45286a)) {
                AbstractC1888j1 abstractC1888j19 = StereoCreateFragment.this.f45129T0;
                if (abstractC1888j19 != null && (lottieAnimationView2 = abstractC1888j19.f39713q0) != null) {
                    lottieAnimationView2.m();
                }
                StereoCreateFragment.this.t0();
                return;
            }
            AbstractC1888j1 abstractC1888j110 = StereoCreateFragment.this.f45129T0;
            if (abstractC1888j110 != null && (lottieAnimationView = abstractC1888j110.f39713q0) != null) {
                lottieAnimationView.m();
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class f implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f45139a;

        f(X2.l function) {
            F.p(function, "function");
            this.f45139a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45139a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45139a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public StereoCreateFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoCreateFragment$special$$inlined$viewModels$default$1
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
        this.f45126Q0 = FragmentViewModelLazyKt.c(this, N.d(s.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoCreateFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoCreateFragment$special$$inlined$viewModels$default$3
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
        this.f45127R0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f45128S0 = new C0937n(N.d(n.class), new X2.a<Bundle>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoCreateFragment$special$$inlined$navArgs$1
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final n o0() {
        return (n) this.f45128S0.getValue();
    }

    private final com.harman.jbl.partybox.ui.main.o p0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f45127R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s q0() {
        return (s) this.f45126Q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0() {
        L0 f4;
        L0 l02 = this.f45130U0;
        if (l02 != null) {
            L0.a.b(l02, null, 1, null);
        }
        f4 = C2323l.f(androidx.lifecycle.F.a(this), C2322k0.e(), null, new b(null), 2, null);
        this.f45130U0 = f4;
        com.harman.log.f.d(f45124V0, "launchSelectChannelDelayJob() >>> start timeout delay job");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0() {
        HmDevice f4 = q0().A().f();
        if (f4 == null) {
            com.harman.log.f.b(f45124V0, "portalRenamePage() >>> fail to get main device");
            onBtnBackClick();
        } else {
            com.harman.log.f.d(f45124V0, "portalRenamePage() >>> portal");
            q.b c4 = q.c(f4, q0().z().f(), EnumStereoRenameFromPage.STEREO_CREATE.i());
            F.o(c4, "toStereoRenameFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this, c4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0() {
        com.harman.log.f.d(f45124V0, "portalStageDashboardFragment() >>> ");
        I a4 = q.a();
        F.o(a4, "toStageDashboardFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this, a4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0() {
        boolean z3;
        HmDevice f4 = q0().A().f();
        HmDevice f5 = q0().z().f();
        if (f4 != null && f5 != null) {
            com.harman.log.f.d(f45124V0, "portalTWSChannelPage() >>> portal");
            q.a b4 = q.b(f4, f5, o0().e(), EnumStereoChannelFromPage.STEREO_CREATE.g());
            F.o(b4, "toStereoChannelFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this, b4);
            return;
        }
        boolean z4 = false;
        if (f4 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (f5 == null) {
            z4 = true;
        }
        com.harman.log.f.b(f45124V0, "portalTWSChannelPage() >>> fail to get main device[" + z3 + "] or co device[" + z4 + "]");
        androidx.navigation.fragment.f.a(this).t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(Bundle bundle) {
        bundle.putString("di_action_type", L1.a.f1649s2);
        bundle.putInt(L1.a.u3, com.harman.jbl.partybox.c.f38305O);
        K1.a.a(L1.a.f1514P1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0() {
        PartyBoxDevice partyBoxDevice;
        HmDevice f4;
        HmDevice k12 = p0().k1();
        if (k12 instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) k12;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice == null || (f4 = q0().z().f()) == null) {
            return;
        }
        partyBoxDevice.l1().put("Mac_Address", f4.n());
        partyBoxDevice.v2(f4.n());
        com.harman.log.f.d(f45124V0, "updateSecondaryInfo() >>> set secondary mac address[" + f4.n() + "] for main device[" + partyBoxDevice.n() + "]");
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
    }

    public final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).t0();
    }

    public final void onChannelSelected(@l3.d AudioChannel channel) {
        F.p(channel, "channel");
        q0().G(channel);
    }

    public final void onChannelSelectedBtnClick() {
        s q02 = q0();
        Context requireContext = requireContext();
        F.o(requireContext, "requireContext(...)");
        q02.H(requireContext, new c(this));
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        boolean z3;
        super.onCreate(bundle);
        if (bundle != null) {
            z3 = bundle.getBoolean("isSaveState");
        } else {
            z3 = false;
        }
        q0().v(o0(), !z3, new d(this));
        q0().C().k(this, new f(new e()));
    }

    @Override // androidx.fragment.app.Fragment
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        AbstractC1888j1 t12 = AbstractC1888j1.t1(inflater, viewGroup, false);
        F.o(t12, "inflate(...)");
        this.f45129T0 = t12;
        t12.M0(this);
        t12.w1(this);
        t12.x1(q0());
        int e4 = o0().e();
        if (e4 == EnumStereoType.TWS.g()) {
            t12.f39718v0.setText(j.m.h5);
        } else if (e4 == EnumStereoType.WIRELESS.g()) {
            t12.f39718v0.setText(j.m.eb);
        } else if (e4 == EnumStereoType.STEREO.g()) {
            t12.f39718v0.setText(j.m.f41701U);
        }
        View d4 = t12.d();
        F.o(d4, "getRoot(...)");
        return d4;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        L0 l02 = this.f45130U0;
        if (l02 != null) {
            L0.a.b(l02, null, 1, null);
        }
        q0().F();
        q0().x();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void onMainDeviceA2DPDisconnected(@l3.d UiPage page) {
        F.p(page, "page");
        com.harman.log.f.a(f45124V0, "onMainDeviceA2DPDisconnected() >>> page[" + page.name() + "]");
    }

    public final void onPlacementBannerBtnClick() {
        q0().I();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@l3.d Bundle outState) {
        F.p(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("isSaveState", true);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    @l3.d
    public String tag() {
        return f45124V0;
    }
}
