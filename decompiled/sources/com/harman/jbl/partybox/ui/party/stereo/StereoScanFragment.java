package com.harman.jbl.partybox.ui.party.stereo;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.K;
import androidx.core.os.C0741d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.C0937n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.harman.jbl.partybox.databinding.AbstractC1908n1;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.customviews.scrollpageindicator.ViewPagerIndicator;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.party.stereo.A;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoScanPageStyle;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType;
import com.harman.jbl.partybox.ui.party.stereo.ui.FindAnotherSpeakerDialog;
import com.harman.jbl.partybox.ui.party.stereo.ui.TwsExitDialogFragment;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\b*\u0001:\u0018\u0000 ?2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b>\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001f\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/stereo/StereoScanFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "", "tag", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "handleOnBackPressed", "()V", "onDestroy", "closeShowTips", "onBtnBackClick", "onDeviceTipClick", "onNextBtnClick", "onTwsGoOn", "Lcom/harman/jbl/partybox/ui/dashboard/UiPage;", "page", "onMainDeviceA2DPDisconnected", "(Lcom/harman/jbl/partybox/ui/dashboard/UiPage;)V", "Lcom/harman/jbl/partybox/ui/party/stereo/StereoScanViewModel;", "Q0", "Lkotlin/A;", "q0", "()Lcom/harman/jbl/partybox/ui/party/stereo/StereoScanViewModel;", "stereoScanViewModel", "Lcom/harman/jbl/partybox/databinding/n1;", "R0", "Lcom/harman/jbl/partybox/databinding/n1;", "binding", "Lcom/harman/jbl/partybox/ui/party/stereo/x;", "S0", "Landroidx/navigation/n;", "o0", "()Lcom/harman/jbl/partybox/ui/party/stereo/x;", "args", "Lcom/harman/jbl/partybox/ui/party/stereo/ui/c;", "T0", "Lcom/harman/jbl/partybox/ui/party/stereo/ui/c;", "scanDeviceAdapter", "Lcom/harman/jbl/partybox/ui/party/stereo/ui/FindAnotherSpeakerDialog;", "U0", "p0", "()Lcom/harman/jbl/partybox/ui/party/stereo/ui/FindAnotherSpeakerDialog;", "findAnotherSpeakerDialog", "", "V0", "Z", "isFirstLaunch", "com/harman/jbl/partybox/ui/party/stereo/StereoScanFragment$f", "W0", "Lcom/harman/jbl/partybox/ui/party/stereo/StereoScanFragment$f;", "pager2Observer", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nStereoScanFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoScanFragment.kt\ncom/harman/jbl/partybox/ui/party/stereo/StereoScanFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,263:1\n56#2,10:264\n42#3,3:274\n*S KotlinDebug\n*F\n+ 1 StereoScanFragment.kt\ncom/harman/jbl/partybox/ui/party/stereo/StereoScanFragment\n*L\n42#1:264,10\n46#1:274,3\n*E\n"})
/* loaded from: classes2.dex */
public final class StereoScanFragment extends BackDispatcherFragment {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: X0, reason: collision with root package name */
    @l3.d
    private static final String f45155X0 = "Stereo.ScanFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f45156Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.e
    private AbstractC1908n1 f45157R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final C0937n f45158S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.party.stereo.ui.c f45159T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f45160U0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f45161V0;

    /* renamed from: W0, reason: collision with root package name */
    @l3.d
    private final f f45162W0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.a<FindAnotherSpeakerDialog> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f45168F = new b();

        b() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final FindAnotherSpeakerDialog n() {
            return new FindAnotherSpeakerDialog();
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.l<EnumStereoScanPageStyle, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(EnumStereoScanPageStyle enumStereoScanPageStyle) {
            c(enumStereoScanPageStyle);
            return H0.f51801a;
        }

        public final void c(EnumStereoScanPageStyle enumStereoScanPageStyle) {
            LottieAnimationView lottieAnimationView;
            AbstractC1908n1 abstractC1908n1 = StereoScanFragment.this.f45157R0;
            if (abstractC1908n1 != null && (lottieAnimationView = abstractC1908n1.f39891p0) != null) {
                if (EnumStereoScanPageStyle.NO_DEVICE == enumStereoScanPageStyle) {
                    lottieAnimationView.setAnimation(j.l.f41606l);
                    lottieAnimationView.B();
                } else {
                    lottieAnimationView.m();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.l<List<? extends HmDevice>, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends HmDevice> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<? extends HmDevice> list) {
            AbstractC1908n1 abstractC1908n1;
            ViewPagerIndicator viewPagerIndicator;
            Integer f4 = StereoScanFragment.this.q0().g0().f();
            if (f4 != null && f4.intValue() >= list.size() && (abstractC1908n1 = StereoScanFragment.this.f45157R0) != null && (viewPagerIndicator = abstractC1908n1.f39886k0) != null) {
                viewPagerIndicator.n();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoScanFragment$onDeviceTipClick$1", f = "StereoScanFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class e extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45171I;

        e(kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f45171I == 0) {
                W.n(obj);
                StereoScanFragment.this.p0().setArguments(C0741d.b(C2122h0.a(FindAnotherSpeakerDialog.BundleEnumStereoType, kotlin.coroutines.jvm.internal.a.f(StereoScanFragment.this.o0().d()))));
                StereoScanFragment.this.p0().show(StereoScanFragment.this.getChildFragmentManager(), StereoScanFragment.f45155X0);
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((e) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new e(cVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends ViewPager2.j {
        f() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i4) {
            super.c(i4);
            StereoScanFragment.this.q0().n0(i4);
        }
    }

    /* loaded from: classes2.dex */
    static final class g implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f45174a;

        g(X2.l function) {
            F.p(function, "function");
            this.f45174a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45174a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45174a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public StereoScanFragment() {
        kotlin.A a4;
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoScanFragment$special$$inlined$viewModels$default$1
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
        this.f45156Q0 = FragmentViewModelLazyKt.c(this, N.d(StereoScanViewModel.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoScanFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoScanFragment$special$$inlined$viewModels$default$3
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
        this.f45158S0 = new C0937n(N.d(x.class), new X2.a<Bundle>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoScanFragment$special$$inlined$navArgs$1
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
        a4 = kotlin.C.a(b.f45168F);
        this.f45160U0 = a4;
        this.f45161V0 = true;
        this.f45162W0 = new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final x o0() {
        return (x) this.f45158S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FindAnotherSpeakerDialog p0() {
        return (FindAnotherSpeakerDialog) this.f45160U0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StereoScanViewModel q0() {
        return (StereoScanViewModel) this.f45156Q0.getValue();
    }

    @K
    public final void closeShowTips() {
        q0().h0().r(Boolean.FALSE);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @K
    public final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).t0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        q0().a0(o0());
        q0().f0().k(this, new g(new c()));
        getLifecycle().a(q0());
        q0().e0().k(this, new g(new d()));
    }

    @Override // androidx.fragment.app.Fragment
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        RecyclerView recyclerView;
        F.p(inflater, "inflater");
        AbstractC1908n1 t12 = AbstractC1908n1.t1(inflater, viewGroup, false);
        F.o(t12, "inflate(...)");
        this.f45157R0 = t12;
        com.harman.jbl.partybox.ui.party.stereo.ui.c cVar = new com.harman.jbl.partybox.ui.party.stereo.ui.c(this, q0());
        this.f45159T0 = cVar;
        t12.M0(this);
        t12.w1(this);
        t12.x1(q0());
        ViewPager2 viewPager2 = t12.f39899x0;
        viewPager2.setAdapter(cVar);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setPageTransformer(new com.harman.jbl.partybox.ui.party.stereo.ui.b(getResources().getDimension(j.e.f40798B0), getResources().getDimension(j.e.f40888r0), 0.0f, 0.0f, 12, null));
        View childAt = viewPager2.getChildAt(0);
        PartyBoxDevice partyBoxDevice = null;
        if (childAt instanceof RecyclerView) {
            recyclerView = (RecyclerView) childAt;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        viewPager2.n(this.f45162W0);
        F.o(viewPager2, "also(...)");
        t12.f39886k0.c(viewPager2);
        int d4 = o0().d();
        if (d4 == EnumStereoType.TWS.g()) {
            t12.f39898w0.setText(j.m.h5);
            if (this.f45161V0) {
                HmCustomFontTextView hmCustomFontTextView = t12.f39897v0;
                kotlin.jvm.internal.W w3 = kotlin.jvm.internal.W.f52310a;
                String format = String.format(Locale.CHINA, "%s%s", Arrays.copyOf(new Object[]{getString(j.m.i5), "PartyBox 110, 310, 710, Encore, Encore Essential"}, 2));
                F.o(format, "format(...)");
                hmCustomFontTextView.setText(format);
                this.f45161V0 = false;
            } else {
                q0().h0().r(Boolean.TRUE);
                t12.f39897v0.setText(getString(j.m.j5));
            }
        } else if (d4 == EnumStereoType.WIRELESS.g()) {
            t12.f39898w0.setText(j.m.eb);
            HmDevice b02 = q0().b0();
            if (b02 != null) {
                if (com.harman.sdk.utils.d.H(b02.q())) {
                    if (b02 instanceof PartyBoxDevice) {
                        partyBoxDevice = (PartyBoxDevice) b02;
                    }
                    if (partyBoxDevice != null && !partyBoxDevice.H1()) {
                        if (!this.f45161V0) {
                            q0().h0().r(Boolean.TRUE);
                            t12.f39897v0.setText(getString(j.m.j5));
                        }
                    }
                }
                q0().h0().r(Boolean.FALSE);
            }
            if (this.f45161V0) {
                this.f45161V0 = false;
            }
        } else if (d4 == EnumStereoType.STEREO.g()) {
            t12.f39898w0.setText(j.m.f41701U);
        }
        View d5 = t12.d();
        F.o(d5, "getRoot(...)");
        return d5;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ViewPager2 viewPager2;
        super.onDestroy();
        AbstractC1908n1 abstractC1908n1 = this.f45157R0;
        if (abstractC1908n1 != null && (viewPager2 = abstractC1908n1.f39899x0) != null) {
            viewPager2.x(this.f45162W0);
        }
        Dialog dialog = p0().getDialog();
        if (dialog != null && true == dialog.isShowing()) {
            p0().dismiss();
        }
    }

    @K
    public final void onDeviceTipClick() {
        Dialog dialog = p0().getDialog();
        if (dialog == null || true != dialog.isShowing()) {
            androidx.lifecycle.F.a(this).e(new e(null));
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void onMainDeviceA2DPDisconnected(@l3.d UiPage page) {
        F.p(page, "page");
        com.harman.log.f.a(f45155X0, "onMainDeviceA2DPDisconnected() >>> page[" + page.name() + "]");
    }

    @K
    public final void onNextBtnClick() {
        boolean z3;
        HmDevice f4 = q0().d0().f();
        HmDevice b02 = q0().b0();
        if (f4 != null && b02 != null) {
            D d4 = D.f45020a;
            if (d4.o(f4) && !d4.l(f4)) {
                if (isAdded() && isVisible()) {
                    TwsExitDialogFragment.Companion.a().show(getChildFragmentManager(), TwsExitDialogFragment.TAG);
                    return;
                }
                return;
            }
            A.a a4 = A.a(f4, b02, o0().d());
            F.o(a4, "toStereoCreateFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this, a4);
            return;
        }
        boolean z4 = false;
        if (f4 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b02 == null) {
            z4 = true;
        }
        com.harman.log.f.b(f45155X0, "onNextBtnClick() >>> missing main[" + z3 + "] or co[" + z4 + "] device");
    }

    public final void onTwsGoOn() {
        boolean z3;
        HmDevice f4 = q0().d0().f();
        HmDevice b02 = q0().b0();
        if (f4 != null && b02 != null) {
            A.a a4 = A.a(f4, b02, o0().d());
            F.o(a4, "toStereoCreateFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this, a4);
            return;
        }
        boolean z4 = false;
        if (f4 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b02 == null) {
            z4 = true;
        }
        com.harman.log.f.b(f45155X0, "onTwsGoOn() >>> missing main[" + z3 + "] or co[" + z4 + "] device");
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    @l3.d
    public String tag() {
        return f45155X0;
    }
}
