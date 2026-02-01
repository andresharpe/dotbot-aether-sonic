package com.harman.jbl.partybox.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.os.C0741d;
import androidx.fragment.app.Fragment;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1852c0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.dashboard.A;
import com.harman.jbl.partybox.ui.dashboard.DiscoveryFragment;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.legal.InfoActivity;
import com.harman.sdk.device.HmDevice;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.C2122h0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;

@kotlin.E(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ;2\u00020\u0001:\u0002<=B\u0007¢\u0006\u0004\b:\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u0004R\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0018\u00105\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00100R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006>"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/DiscoveryFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlin/H0;", "y0", "()V", "Landroidx/navigation/I;", "action", "o0", "(Landroidx/navigation/I;)V", "t0", "n0", "q0", "A0", "x0", "z0", "p0", "", "isShowViewTwo", "isShowViewOne", "B0", "(II)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "hideHelpButton", "onPause", "onResume", "Lcom/harman/jbl/partybox/databinding/c0;", "N0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "r0", "()Lcom/harman/jbl/partybox/databinding/c0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "O0", "Lkotlin/A;", "s0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/dashboard/DiscoveryFragment$b;", "P0", "Lcom/harman/jbl/partybox/ui/dashboard/DiscoveryFragment$b;", "messageHandler", "Landroid/view/animation/Animation;", "Q0", "Landroid/view/animation/Animation;", "anim1", "R0", "anim2", "S0", "anim3", "Lcom/harman/jbl/partybox/ui/dashboard/DiscoveryUiType;", "T0", "Lcom/harman/jbl/partybox/ui/dashboard/DiscoveryUiType;", "type", "<init>", "Companion", "a", com.harman.log.b.f47574c, "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@kotlin.jvm.internal.U({"SMAP\nDiscoveryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscoveryFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/DiscoveryFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,312:1\n66#2,4:313\n*S KotlinDebug\n*F\n+ 1 DiscoveryFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/DiscoveryFragment\n*L\n29#1:313,4\n*E\n"})
/* loaded from: classes2.dex */
public final class DiscoveryFragment extends Fragment {

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private static final String f42922V0 = "DiscoveryFragment";

    /* renamed from: W0, reason: collision with root package name */
    @l3.d
    private static final String f42923W0 = "args";

    /* renamed from: X0, reason: collision with root package name */
    private static final int f42924X0 = 30000;

    /* renamed from: Y0, reason: collision with root package name */
    private static final int f42925Y0 = 6000;

    /* renamed from: Z0, reason: collision with root package name */
    private static final int f42926Z0 = 1000;

    /* renamed from: a1, reason: collision with root package name */
    private static final int f42927a1 = 256;

    /* renamed from: b1, reason: collision with root package name */
    private static final int f42928b1 = 512;

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f42929N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f42930O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final b f42931P0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.e
    private Animation f42932Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.e
    private Animation f42933R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.e
    private Animation f42934S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private DiscoveryUiType f42935T0;

    /* renamed from: U0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f42921U0 = {kotlin.jvm.internal.N.u(new PropertyReference1Impl(DiscoveryFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentDiscoveryBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final DiscoveryFragment a(@l3.d DiscoveryUiType type) {
            kotlin.jvm.internal.F.p(type, "type");
            DiscoveryFragment discoveryFragment = new DiscoveryFragment();
            discoveryFragment.setArguments(C0741d.b(C2122h0.a(DiscoveryFragment.f42923W0, type)));
            return discoveryFragment;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    private static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final WeakReference<DiscoveryFragment> f42936a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d DiscoveryFragment fragment) {
            super(Looper.getMainLooper());
            kotlin.jvm.internal.F.p(fragment, "fragment");
            this.f42936a = new WeakReference<>(fragment);
        }

        @Override // android.os.Handler
        public void handleMessage(@l3.d Message msg) {
            kotlin.jvm.internal.F.p(msg, "msg");
            DiscoveryFragment discoveryFragment = this.f42936a.get();
            if (discoveryFragment != null) {
                int i4 = msg.what;
                if (i4 == 256) {
                    T1.a.a("DiscoveryFragment CANNOT_FIND_SPEAKER_TIMEOUT timer expired");
                    discoveryFragment.p0();
                    discoveryFragment.z0();
                } else if (i4 == 512) {
                    T1.a.a("DiscoveryFragment SHOW_HELP_DELAY_TIME timer expired");
                    discoveryFragment.p0();
                    discoveryFragment.z0();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@l3.d Animation animation) {
            kotlin.jvm.internal.F.p(animation, "animation");
            DiscoveryFragment.this.A0();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@l3.d Animation animation) {
            kotlin.jvm.internal.F.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@l3.d Animation animation) {
            kotlin.jvm.internal.F.p(animation, "animation");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements Animation.AnimationListener {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DiscoveryFragment this$0) {
            kotlin.jvm.internal.F.p(this$0, "this$0");
            try {
                this$0.r0().f39388K.setVisibility(0);
                this$0.r0().f39388K.startAnimation(this$0.f42933R0);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@l3.d Animation animation) {
            kotlin.jvm.internal.F.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@l3.d Animation animation) {
            kotlin.jvm.internal.F.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@l3.d Animation animation) {
            kotlin.jvm.internal.F.p(animation, "animation");
            b bVar = DiscoveryFragment.this.f42931P0;
            final DiscoveryFragment discoveryFragment = DiscoveryFragment.this;
            bVar.postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.dashboard.w
                @Override // java.lang.Runnable
                public final void run() {
                    DiscoveryFragment.d.b(DiscoveryFragment.this);
                }
            }, 1000L);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements Animation.AnimationListener {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DiscoveryFragment this$0) {
            kotlin.jvm.internal.F.p(this$0, "this$0");
            try {
                this$0.r0().f39389L.setVisibility(0);
                this$0.r0().f39389L.startAnimation(this$0.f42934S0);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@l3.d Animation animation) {
            kotlin.jvm.internal.F.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@l3.d Animation animation) {
            kotlin.jvm.internal.F.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@l3.d Animation animation) {
            kotlin.jvm.internal.F.p(animation, "animation");
            b bVar = DiscoveryFragment.this.f42931P0;
            final DiscoveryFragment discoveryFragment = DiscoveryFragment.this;
            bVar.postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.dashboard.x
                @Override // java.lang.Runnable
                public final void run() {
                    DiscoveryFragment.e.b(DiscoveryFragment.this);
                }
            }, 1000L);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements Animation.AnimationListener {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DiscoveryFragment this$0) {
            kotlin.jvm.internal.F.p(this$0, "this$0");
            try {
                if (this$0.f42932Q0 != null) {
                    this$0.r0().f39387J.startAnimation(this$0.f42932Q0);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@l3.d Animation animation) {
            kotlin.jvm.internal.F.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@l3.d Animation animation) {
            kotlin.jvm.internal.F.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@l3.d Animation animation) {
            kotlin.jvm.internal.F.p(animation, "animation");
            b bVar = DiscoveryFragment.this.f42931P0;
            final DiscoveryFragment discoveryFragment = DiscoveryFragment.this;
            bVar.postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.dashboard.y
                @Override // java.lang.Runnable
                public final void run() {
                    DiscoveryFragment.f.b(DiscoveryFragment.this);
                }
            }, 1000L);
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class g extends FunctionReferenceImpl implements X2.l<View, C1852c0> {

        /* renamed from: N, reason: collision with root package name */
        public static final g f42941N = new g();

        g() {
            super(1, C1852c0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentDiscoveryBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1852c0 C(@l3.d View p02) {
            kotlin.jvm.internal.F.p(p02, "p0");
            return C1852c0.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class h extends Lambda implements X2.l<List<? extends HmDevice>, kotlin.H0> {
        h() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(List<? extends HmDevice> list) {
            c(list);
            return kotlin.H0.f51801a;
        }

        public final void c(List<? extends HmDevice> list) {
            if (list != null) {
                DiscoveryFragment discoveryFragment = DiscoveryFragment.this;
                com.harman.log.f.a(DiscoveryFragment.f42922V0, "deviceList Observer called and size is : " + list.size());
                if (!list.isEmpty()) {
                    T1.a.a("updateUiPage to product list");
                    discoveryFragment.s0().s3(UiPage.PRODUCT_LIST);
                    A.c d4 = A.d();
                    kotlin.jvm.internal.F.o(d4, "actionDiscoveryFragmentToProductListFragment(...)");
                    discoveryFragment.o0(d4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class i extends Lambda implements X2.l<UiPage, kotlin.H0> {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f42944a;

            static {
                int[] iArr = new int[UiPage.values().length];
                try {
                    iArr[UiPage.BLUETOOTH_PERMISSION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UiPage.LOCATION_PERMISSION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f42944a = iArr;
            }
        }

        i() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(UiPage uiPage) {
            c(uiPage);
            return kotlin.H0.f51801a;
        }

        public final void c(UiPage uiPage) {
            if (uiPage != null) {
                DiscoveryFragment discoveryFragment = DiscoveryFragment.this;
                T1.a.a("BLE_LOG DiscoveryFragment updateUiPage and page is : " + uiPage);
                int i4 = a.f42944a[uiPage.ordinal()];
                if ((i4 == 1 || i4 == 2) && !discoveryFragment.s0().G()) {
                    A.d e4 = A.e();
                    kotlin.jvm.internal.F.o(e4, "actionToPermissionAndAccessFragment(...)");
                    discoveryFragment.o0(e4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class j extends Lambda implements X2.l<Boolean, kotlin.H0> {
        j() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Boolean bool) {
            c(bool);
            return kotlin.H0.f51801a;
        }

        public final void c(Boolean bool) {
            DiscoveryFragment.this.p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class k implements androidx.lifecycle.Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f42946a;

        k(X2.l function) {
            kotlin.jvm.internal.F.p(function, "function");
            this.f42946a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f42946a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof androidx.lifecycle.Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return kotlin.jvm.internal.F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f42946a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public DiscoveryFragment() {
        super(j.i.f41442T);
        this.f42929N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, g.f42941N);
        this.f42930O0 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f42931P0 = new b(this);
        this.f42935T0 = DiscoveryUiType.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0() {
        try {
            r0().f39387J.setVisibility(0);
            r0().f39387J.startAnimation(this.f42932Q0);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private final void B0(int i4, int i5) {
        T1.a.a("DiscoveryFragment showSearchField isShowViewTwo=" + i4 + " isShowViewOne=" + i5);
        r0().f39392O.setVisibility(i4);
        r0().f39391N.setVisibility(i5);
    }

    private final void n0() {
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), j.a.f40565d);
            loadAnimation.setAnimationListener(new c());
            r0().f39390M.setAnimation(loadAnimation);
            loadAnimation.start();
            Animation animation = this.f42932Q0;
            if (animation != null) {
                animation.setAnimationListener(new d());
            }
            Animation animation2 = this.f42933R0;
            if (animation2 != null) {
                animation2.setAnimationListener(new e());
            }
            Animation animation3 = this.f42934S0;
            if (animation3 != null) {
                animation3.setAnimationListener(new f());
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @W2.n
    @l3.d
    public static final DiscoveryFragment newInstance(@l3.d DiscoveryUiType discoveryUiType) {
        return Companion.a(discoveryUiType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(androidx.navigation.I i4) {
        com.harman.jbl.partybox.utils.q.f(this, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        if (kotlin.jvm.internal.F.g(s0().I1().f(), Boolean.TRUE)) {
            B0(0, 8);
        } else {
            B0(8, 0);
        }
    }

    private final void q0() {
        C1852c0 r02 = r0();
        r02.f39390M.clearAnimation();
        r02.f39387J.clearAnimation();
        r02.f39388K.clearAnimation();
        r02.f39389L.clearAnimation();
        Animation animation = this.f42932Q0;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f42933R0;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f42934S0;
        if (animation3 != null) {
            animation3.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1852c0 r0() {
        return (C1852c0) this.f42929N0.a(this, f42921U0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o s0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f42930O0.getValue();
    }

    private final void t0() {
        s0().K0().k(getViewLifecycleOwner(), new k(new h()));
        s0().G1().k(getViewLifecycleOwner(), new k(new i()));
        s0().I1().k(getViewLifecycleOwner(), new k(new j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(DiscoveryFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.x0();
        this$0.y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(DiscoveryFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.x0();
        this$0.y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(DiscoveryFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.x0();
        this$0.y0();
    }

    private final void x0() {
        Intent intent = new Intent(getContext(), (Class<?>) InfoActivity.class);
        intent.putExtra("page", "ADD_PRODUCT");
        startActivity(intent);
    }

    private final void y0() {
        s0().l2(L1.a.f1634p2, C0741d.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0() {
        if (kotlin.jvm.internal.F.g(s0().I1().f(), Boolean.TRUE)) {
            r0().f39384G.setVisibility(0);
            r0().f39385H.setVisibility(8);
        } else {
            r0().f39385H.setVisibility(0);
            r0().f39384G.setVisibility(8);
        }
    }

    public final void hideHelpButton() {
        this.f42931P0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        q0();
        this.f42931P0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        s0().T2(true);
        n0();
        r0().f39384G.setVisibility(8);
        r0().f39385H.setVisibility(8);
        s0().c3(true);
        this.f42931P0.removeMessages(256);
        if (this.f42935T0 == DiscoveryUiType.DEFAULT && r0().f39384G.getVisibility() == 8) {
            this.f42931P0.sendEmptyMessageDelayed(256, 30000L);
            this.f42931P0.sendEmptyMessageDelayed(512, com.harman.jbl.partybox.ui.ota.business.a.f44562c);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        Object obj;
        kotlin.jvm.internal.F.p(view, "view");
        super.onViewCreated(view, bundle);
        if (!s0().G()) {
            A.d e4 = A.e();
            kotlin.jvm.internal.F.o(e4, "actionToPermissionAndAccessFragment(...)");
            o0(e4);
            return;
        }
        this.f42932Q0 = AnimationUtils.loadAnimation(getContext(), j.a.f40564c);
        this.f42933R0 = AnimationUtils.loadAnimation(getContext(), j.a.f40564c);
        this.f42934S0 = AnimationUtils.loadAnimation(getContext(), j.a.f40564c);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey(f42923W0)) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                obj = arguments2.get(f42923W0);
            } else {
                obj = null;
            }
            kotlin.jvm.internal.F.n(obj, "null cannot be cast to non-null type com.harman.jbl.partybox.ui.dashboard.DiscoveryUiType");
            this.f42935T0 = (DiscoveryUiType) obj;
        }
        C1852c0 r02 = r0();
        r02.f39383F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DiscoveryFragment.u0(DiscoveryFragment.this, view2);
            }
        });
        r02.f39385H.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DiscoveryFragment.v0(DiscoveryFragment.this, view2);
            }
        });
        r02.f39384G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DiscoveryFragment.w0(DiscoveryFragment.this, view2);
            }
        });
        t0();
        s0().h3();
    }
}
