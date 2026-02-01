package com.harman.jbl.partybox.ui.freestyle;

import W2.n;
import X2.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0669d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.internal.C;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1917p0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.utils.r;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.SoloPattern;
import com.harman.sdk.utils.SoloPatternMode;
import java.util.List;
import java.util.Locale;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import kotlin.text.C2220b;

@E(d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\b*\u0001X\u0018\u0000 ]2\u00020\u0001:\u0001^B\u0007¢\u0006\u0004\b\\\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J'\u0010\u0012\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J-\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020#2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0004J!\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010\u0004R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010FR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006_"}, d2 = {"Lcom/harman/jbl/partybox/ui/freestyle/FreeStyleFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "initView", "()V", "H0", "Landroid/view/View;", "v", "A0", "(Landroid/view/View;)V", "z0", "v0", "Lcom/airbnb/lottie/LottieAnimationView;", "animationView", "Landroid/widget/ImageView;", "imageView", "", "isShowAnimation", "E0", "(Lcom/airbnb/lottie/LottieAnimationView;Landroid/widget/ImageView;Z)V", "F0", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "G0", "(Lcom/airbnb/lottie/LottieAnimationView;Landroid/widget/ImageView;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onPause", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/harman/jbl/partybox/ui/freestyle/e;", C.a.f28602a, "setListener", "(Lcom/harman/jbl/partybox/ui/freestyle/e;)V", "onDestroyView", "Lcom/harman/jbl/partybox/databinding/p0;", "k1", "Lcom/harman/jbl/partybox/databinding/p0;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "l1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "m1", "Landroid/view/View;", "currentView", "n1", "Z", "isLongPress", "Landroid/os/Handler;", "o1", "Landroid/os/Handler;", "mainHandler", "Lcom/harman/sdk/utils/SoloPattern;", "p1", "Lcom/harman/sdk/utils/SoloPattern;", "currentPattern", "q1", "Lcom/harman/jbl/partybox/ui/freestyle/e;", "Lcom/harman/jbl/partybox/ui/main/o;", "r1", "Lkotlin/A;", "x0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/freestyle/f;", "s1", "y0", "()Lcom/harman/jbl/partybox/ui/freestyle/f;", "viewModel", "Landroid/view/View$OnTouchListener;", "t1", "Landroid/view/View$OnTouchListener;", "freeStyleTouchListener", "u1", "freeStyleListener", "com/harman/jbl/partybox/ui/freestyle/FreeStyleFragment$c", "v1", "Lcom/harman/jbl/partybox/ui/freestyle/FreeStyleFragment$c;", "mLongPressed", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nFreeStyleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FreeStyleFragment.kt\ncom/harman/jbl/partybox/ui/freestyle/FreeStyleFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n66#2,4:354\n56#3,10:358\n1#4:368\n*S KotlinDebug\n*F\n+ 1 FreeStyleFragment.kt\ncom/harman/jbl/partybox/ui/freestyle/FreeStyleFragment\n*L\n45#1:354,4\n46#1:358,10\n*E\n"})
/* loaded from: classes2.dex */
public final class FreeStyleFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "FreeStyleFragment";

    /* renamed from: w1, reason: collision with root package name */
    private static final long f43695w1 = 3000;

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private C1917p0 f43696k1;

    /* renamed from: l1, reason: collision with root package name */
    private BitmapDrawable f43697l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.e
    private View f43698m1;

    /* renamed from: n1, reason: collision with root package name */
    private boolean f43699n1;

    /* renamed from: p1, reason: collision with root package name */
    @l3.e
    private SoloPattern f43701p1;

    /* renamed from: q1, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.freestyle.e f43702q1;

    /* renamed from: s1, reason: collision with root package name */
    @l3.d
    private final A f43704s1;

    /* renamed from: t1, reason: collision with root package name */
    @l3.d
    private final View.OnTouchListener f43705t1;

    /* renamed from: u1, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.partybox.ui.freestyle.e f43706u1;

    /* renamed from: v1, reason: collision with root package name */
    @l3.d
    private final c f43707v1;

    /* renamed from: o1, reason: collision with root package name */
    @l3.d
    private final Handler f43700o1 = new Handler(Looper.getMainLooper());

    /* renamed from: r1, reason: collision with root package name */
    @l3.d
    private final A f43703r1 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @l3.d
        public final FreeStyleFragment a() {
            return new FreeStyleFragment();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements com.harman.jbl.partybox.ui.freestyle.e {
        b() {
        }

        @Override // com.harman.jbl.partybox.ui.freestyle.e
        public void a() {
        }

        @Override // com.harman.jbl.partybox.ui.freestyle.e
        public void b(@l3.d SoloPattern pattern, int i4) {
            F.p(pattern, "pattern");
            if (FreeStyleFragment.this.isAdded()) {
                FreeStyleFragment.this.y0().u(FreeStyleFragment.this.x0().k1(), pattern, i4);
                Bundle bundle = new Bundle();
                FreeStyleFragment freeStyleFragment = FreeStyleFragment.this;
                String i5 = pattern.i();
                Locale ENGLISH = Locale.ENGLISH;
                F.o(ENGLISH, "ENGLISH");
                String lowerCase = i5.toLowerCase(ENGLISH);
                F.o(lowerCase, "toLowerCase(...)");
                bundle.putString(L1.a.f1522R1, L1.a.f1458B1 + lowerCase);
                bundle.putInt(L1.a.u3, freeStyleFragment.x0().T0());
                freeStyleFragment.x0().l2(L1.a.f1534U1, bundle);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.harman.jbl.partybox.ui.freestyle.e eVar;
            FreeStyleFragment.this.f43699n1 = true;
            T1.a.a("FreeStyleFragment longPressed");
            SoloPattern soloPattern = FreeStyleFragment.this.f43701p1;
            if (soloPattern != null && (eVar = FreeStyleFragment.this.f43702q1) != null) {
                eVar.b(soloPattern, SoloPatternMode.TAP_AND_HOLD.g());
            }
            FreeStyleFragment.this.f43700o1.postDelayed(this, FreeStyleFragment.f43695w1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f43714a;

        d(l function) {
            F.p(function, "function");
            this.f43714a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f43714a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f43714a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f43716b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f43717c;

        e(LottieAnimationView lottieAnimationView, ImageView imageView) {
            this.f43716b = lottieAnimationView;
            this.f43717c = imageView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@l3.d Animator animation) {
            F.p(animation, "animation");
            FreeStyleFragment.this.E0(this.f43716b, this.f43717c, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements l<List<? extends Drawable>, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C1917p0 f43718F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C1917p0 c1917p0) {
            super(1);
            this.f43718F = c1917p0;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends Drawable> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<? extends Drawable> list) {
            if (list.size() == 9) {
                this.f43718F.f39954L.setImageDrawable(list.get(0));
                this.f43718F.f39957O.setImageDrawable(list.get(1));
                this.f43718F.f39960R.setImageDrawable(list.get(2));
                this.f43718F.f39963U.setImageDrawable(list.get(3));
                this.f43718F.f39966X.setImageDrawable(list.get(4));
                this.f43718F.f39969a0.setImageDrawable(list.get(5));
                this.f43718F.f39972d0.setImageDrawable(list.get(6));
                this.f43718F.f39975g0.setImageDrawable(list.get(7));
                this.f43718F.f39978j0.setImageDrawable(list.get(8));
            }
        }
    }

    public FreeStyleFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.freestyle.FreeStyleFragment$special$$inlined$viewModels$default$1
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
        this.f43704s1 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.freestyle.f.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.freestyle.FreeStyleFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.freestyle.FreeStyleFragment$special$$inlined$viewModels$default$3
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
        this.f43705t1 = new View.OnTouchListener() { // from class: com.harman.jbl.partybox.ui.freestyle.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean w02;
                w02 = FreeStyleFragment.w0(FreeStyleFragment.this, view, motionEvent);
                return w02;
            }
        };
        this.f43706u1 = new b();
        this.f43707v1 = new c();
    }

    private final void A0(View view) {
        SoloPattern soloPattern;
        com.harman.jbl.partybox.ui.freestyle.e eVar;
        if (view != null) {
            if (!this.f43699n1 && (soloPattern = this.f43701p1) != null && (eVar = this.f43702q1) != null) {
                eVar.b(soloPattern, SoloPatternMode.TAP.g());
            }
            v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(final FreeStyleFragment this$0, View view) {
        F.p(this$0, "this$0");
        C1917p0 c1917p0 = this$0.f43696k1;
        if (c1917p0 != null) {
            c1917p0.f39948F.setVisibility(8);
            c1917p0.f39951I.setVisibility(8);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.freestyle.d
                @Override // java.lang.Runnable
                public final void run() {
                    FreeStyleFragment.C0(FreeStyleFragment.this);
                }
            }, 100L);
        }
        this$0.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(FreeStyleFragment this$0) {
        F.p(this$0, "this$0");
        this$0.v0();
        com.harman.jbl.partybox.ui.freestyle.e eVar = this$0.f43702q1;
        if (eVar != null) {
            eVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(FreeStyleFragment this$0) {
        ImageView imageView;
        ConstraintLayout constraintLayout;
        F.p(this$0, "this$0");
        C1917p0 c1917p0 = this$0.f43696k1;
        BitmapDrawable bitmapDrawable = null;
        if (c1917p0 != null) {
            imageView = c1917p0.f39951I;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        C1917p0 c1917p02 = this$0.f43696k1;
        if (c1917p02 != null) {
            constraintLayout = c1917p02.f39948F;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f43697l1;
            if (bitmapDrawable2 == null) {
                F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            constraintLayout.setBackground(bitmapDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(LottieAnimationView lottieAnimationView, ImageView imageView, boolean z3) {
        if (z3) {
            lottieAnimationView.setVisibility(0);
            imageView.setVisibility(4);
        } else {
            lottieAnimationView.setVisibility(4);
            imageView.setVisibility(0);
        }
    }

    private final void F0(LottieAnimationView lottieAnimationView) {
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.B();
    }

    private final void G0(LottieAnimationView lottieAnimationView, ImageView imageView) {
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.g(new e(lottieAnimationView, imageView));
    }

    private final void H0() {
        int a4;
        HmDevice k12 = x0().k1();
        if (k12 != null) {
            String q4 = k12.q();
            a4 = C2220b.a(16);
            int parseInt = Integer.parseInt(q4, a4);
            y0().w(Integer.valueOf(parseInt));
            C1917p0 c1917p0 = this.f43696k1;
            if (c1917p0 != null) {
                y0().v().k(getViewLifecycleOwner(), new d(new f(c1917p0)));
                if (parseInt != 8029) {
                    if (parseInt != 8031) {
                        if (parseInt != 8033) {
                            if (parseInt != 8290 && parseInt != 8291) {
                                return;
                            }
                        } else {
                            c1917p0.f39953K.setAnimation(j.l.f41609o);
                            c1917p0.f39956N.setAnimation(j.l.f41614t);
                            c1917p0.f39959Q.setAnimation(j.l.f41589B);
                            c1917p0.f39962T.setAnimation(j.l.f41590C);
                            c1917p0.f39965W.setAnimation(j.l.f41611q);
                            c1917p0.f39968Z.setAnimation(j.l.f41618x);
                            c1917p0.f39971c0.setAnimation(j.l.f41591D);
                            c1917p0.f39974f0.setAnimation(j.l.f41592E);
                            c1917p0.f39977i0.setAnimation(j.l.f41593F);
                            return;
                        }
                    } else {
                        c1917p0.f39953K.setAnimation(j.l.f41609o);
                        c1917p0.f39956N.setAnimation(j.l.f41614t);
                        c1917p0.f39959Q.setAnimation(j.l.f41610p);
                        c1917p0.f39962T.setAnimation(j.l.f41616v);
                        c1917p0.f39965W.setAnimation(j.l.f41611q);
                        c1917p0.f39968Z.setAnimation(j.l.f41618x);
                        c1917p0.f39971c0.setAnimation(j.l.f41619y);
                        c1917p0.f39974f0.setAnimation(j.l.f41620z);
                        c1917p0.f39977i0.setAnimation(j.l.f41612r);
                        return;
                    }
                }
                c1917p0.f39953K.setAnimation(j.l.f41613s);
                c1917p0.f39956N.setAnimation(j.l.f41614t);
                c1917p0.f39959Q.setAnimation(j.l.f41615u);
                c1917p0.f39962T.setAnimation(j.l.f41616v);
                c1917p0.f39965W.setAnimation(j.l.f41617w);
                c1917p0.f39968Z.setAnimation(j.l.f41618x);
                c1917p0.f39971c0.setAnimation(j.l.f41619y);
                c1917p0.f39974f0.setAnimation(j.l.f41620z);
                c1917p0.f39977i0.setAnimation(j.l.f41588A);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initView() {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout3;
        RelativeLayout relativeLayout4;
        RelativeLayout relativeLayout5;
        RelativeLayout relativeLayout6;
        RelativeLayout relativeLayout7;
        RelativeLayout relativeLayout8;
        RelativeLayout relativeLayout9;
        ImageView imageView;
        H0();
        C1917p0 c1917p0 = this.f43696k1;
        if (c1917p0 != null && (imageView = c1917p0.f39949G) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.freestyle.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FreeStyleFragment.B0(FreeStyleFragment.this, view);
                }
            });
        }
        C1917p0 c1917p02 = this.f43696k1;
        if (c1917p02 != null && (relativeLayout9 = c1917p02.f39952J) != null) {
            relativeLayout9.setOnTouchListener(this.f43705t1);
        }
        C1917p0 c1917p03 = this.f43696k1;
        if (c1917p03 != null && (relativeLayout8 = c1917p03.f39955M) != null) {
            relativeLayout8.setOnTouchListener(this.f43705t1);
        }
        C1917p0 c1917p04 = this.f43696k1;
        if (c1917p04 != null && (relativeLayout7 = c1917p04.f39958P) != null) {
            relativeLayout7.setOnTouchListener(this.f43705t1);
        }
        C1917p0 c1917p05 = this.f43696k1;
        if (c1917p05 != null && (relativeLayout6 = c1917p05.f39961S) != null) {
            relativeLayout6.setOnTouchListener(this.f43705t1);
        }
        C1917p0 c1917p06 = this.f43696k1;
        if (c1917p06 != null && (relativeLayout5 = c1917p06.f39964V) != null) {
            relativeLayout5.setOnTouchListener(this.f43705t1);
        }
        C1917p0 c1917p07 = this.f43696k1;
        if (c1917p07 != null && (relativeLayout4 = c1917p07.f39967Y) != null) {
            relativeLayout4.setOnTouchListener(this.f43705t1);
        }
        C1917p0 c1917p08 = this.f43696k1;
        if (c1917p08 != null && (relativeLayout3 = c1917p08.f39970b0) != null) {
            relativeLayout3.setOnTouchListener(this.f43705t1);
        }
        C1917p0 c1917p09 = this.f43696k1;
        if (c1917p09 != null && (relativeLayout2 = c1917p09.f39973e0) != null) {
            relativeLayout2.setOnTouchListener(this.f43705t1);
        }
        C1917p0 c1917p010 = this.f43696k1;
        if (c1917p010 != null && (relativeLayout = c1917p010.f39976h0) != null) {
            relativeLayout.setOnTouchListener(this.f43705t1);
        }
    }

    @n
    @l3.d
    public static final FreeStyleFragment newInstance() {
        return Companion.a();
    }

    private final void v0() {
        SoloPattern soloPattern;
        com.harman.jbl.partybox.ui.freestyle.e eVar;
        View view = this.f43698m1;
        if (view != null) {
            if (this.f43699n1 && (soloPattern = this.f43701p1) != null && (eVar = this.f43702q1) != null) {
                eVar.b(soloPattern, SoloPatternMode.OFF.g());
            }
            ViewGroup viewGroup = (ViewGroup) view;
            View childAt = viewGroup.getChildAt(0);
            F.n(childAt, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
            View childAt2 = viewGroup.getChildAt(1);
            F.n(childAt2, "null cannot be cast to non-null type android.widget.ImageView");
            G0((LottieAnimationView) childAt, (ImageView) childAt2);
            this.f43700o1.removeCallbacks(this.f43707v1);
            this.f43699n1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w0(FreeStyleFragment this$0, View view, MotionEvent motionEvent) {
        SoloPattern soloPattern;
        F.p(this$0, "this$0");
        if (view != null && motionEvent != null) {
            if (view.getTag() != null) {
                this$0.f43698m1 = view;
                Object tag = view.getTag();
                F.n(tag, "null cannot be cast to non-null type kotlin.String");
                switch (Integer.parseInt((String) tag)) {
                    case 0:
                        soloPattern = SoloPattern.PATTERN_OFF;
                        break;
                    case 1:
                        soloPattern = SoloPattern.PATTERN_1;
                        break;
                    case 2:
                        soloPattern = SoloPattern.PATTERN_2;
                        break;
                    case 3:
                        soloPattern = SoloPattern.PATTERN_3;
                        break;
                    case 4:
                        soloPattern = SoloPattern.PATTERN_4;
                        break;
                    case 5:
                        soloPattern = SoloPattern.PATTERN_5;
                        break;
                    case 6:
                        soloPattern = SoloPattern.PATTERN_6;
                        break;
                    case 7:
                        soloPattern = SoloPattern.PATTERN_7;
                        break;
                    case 8:
                        soloPattern = SoloPattern.PATTERN_8;
                        break;
                    case 9:
                        soloPattern = SoloPattern.PATTERN_9;
                        break;
                    default:
                        soloPattern = null;
                        break;
                }
                this$0.f43701p1 = soloPattern;
            }
            if (motionEvent.getAction() == 1) {
                this$0.A0(view);
                view.performClick();
            } else if (motionEvent.getAction() == 0) {
                this$0.z0(view);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o x0() {
        return (o) this.f43703r1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.freestyle.f y0() {
        return (com.harman.jbl.partybox.ui.freestyle.f) this.f43704s1.getValue();
    }

    private final void z0(View view) {
        F.n(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        View childAt = viewGroup.getChildAt(0);
        F.n(childAt, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        View childAt2 = viewGroup.getChildAt(1);
        F.n(childAt2, "null cannot be cast to non-null type android.widget.ImageView");
        E0((LottieAnimationView) childAt, (ImageView) childAt2, true);
        View childAt3 = viewGroup.getChildAt(0);
        F.n(childAt3, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        F0((LottieAnimationView) childAt3);
        new r().a(view);
        this.f43700o1.postDelayed(this.f43707v1, 300L);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, j.n.f41884f);
    }

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@l3.e Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        F.o(onCreateDialog, "onCreateDialog(...)");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            int f4 = C0669d.f(activity, j.d.f40732a);
            Window window = onCreateDialog.getWindow();
            if (window != null) {
                window.setNavigationBarColor(f4);
            }
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        Resources resources;
        F.p(inflater, "inflater");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f43697l1 = new BitmapDrawable(resources, com.harman.jbl.partybox.utils.d.f46171a.b(getActivity()));
        this.f43696k1 = C1917p0.c(inflater);
        initView();
        C1917p0 c1917p0 = this.f43696k1;
        if (c1917p0 == null) {
            return null;
        }
        return c1917p0.d();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f43696k1 = null;
        this.f43702q1 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f43699n1) {
            A0(this.f43698m1);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.freestyle.c
            @Override // java.lang.Runnable
            public final void run() {
                FreeStyleFragment.D0(FreeStyleFragment.this);
            }
        }, 200L);
        setListener(this.f43706u1);
    }

    public final void setListener(@l3.d com.harman.jbl.partybox.ui.freestyle.e listener) {
        F.p(listener, "listener");
        this.f43702q1 = listener;
    }
}
