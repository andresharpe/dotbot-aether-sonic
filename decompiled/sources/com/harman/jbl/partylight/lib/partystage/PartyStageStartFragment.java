package com.harman.jbl.partylight.lib.partystage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.C0741d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.V;
import com.airbnb.lottie.LottieAnimationView;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment;
import com.harman.jbl.cd_biz_comm.widget.BottomSheetDialog;
import com.harman.jbl.partylight.lib.g;
import kotlin.A;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.KotlinNothingValueException;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.flow.InterfaceC2283j;
import kotlinx.coroutines.internal.B;

@E(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0005R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/harman/jbl/partylight/lib/partystage/PartyStageStartFragment;", "Lcom/harman/jbl/cd_biz_comm/base/BackDispatcherFragment;", "Lm2/u;", "Lkotlin/H0;", "onBtnBackClick", "()V", "createBinding", "()Lm2/u;", "initView", "observeModel", "handleOnBackPressed", "onDestroyView", "Lcom/harman/jbl/partylight/lib/partystage/q;", "P0", "Lkotlin/A;", "r0", "()Lcom/harman/jbl/partylight/lib/partystage/q;", "viewModel", "<init>", "Companion", "a", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPartyStageStartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyStageStartFragment.kt\ncom/harman/jbl/partylight/lib/partystage/PartyStageStartFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,145:1\n56#2,10:146\n254#3,2:156\n*S KotlinDebug\n*F\n+ 1 PartyStageStartFragment.kt\ncom/harman/jbl/partylight/lib/partystage/PartyStageStartFragment\n*L\n25#1:146,10\n42#1:156,2\n*E\n"})
/* loaded from: classes2.dex */
public final class PartyStageStartFragment extends BackDispatcherFragment<m2.u> {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "PartyStageStartFragment";

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final A f47413P0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.PartyStageStartFragment$observeModel$1", f = "PartyStageStartFragment.kt", i = {}, l = {B.f54416q}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47418I;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static final class a<T> implements InterfaceC2283j {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ PartyStageStartFragment f47420E;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.harman.jbl.partylight.lib.partystage.PartyStageStartFragment$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0424a extends Lambda implements X2.l<androidx.navigation.U, H0> {

                /* renamed from: F, reason: collision with root package name */
                public static final C0424a f47421F = new C0424a();

                C0424a() {
                    super(1);
                }

                @Override // X2.l
                public /* bridge */ /* synthetic */ H0 C(androidx.navigation.U u3) {
                    c(u3);
                    return H0.f51801a;
                }

                public final void c(@l3.d androidx.navigation.U navOptions) {
                    F.p(navOptions, "$this$navOptions");
                    androidx.navigation.U.k(navOptions, g.C0418g.f46826D0, null, 2, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.harman.jbl.partylight.lib.partystage.PartyStageStartFragment$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0425b extends Lambda implements X2.l<androidx.navigation.U, H0> {

                /* renamed from: F, reason: collision with root package name */
                public static final C0425b f47422F = new C0425b();

                C0425b() {
                    super(1);
                }

                @Override // X2.l
                public /* bridge */ /* synthetic */ H0 C(androidx.navigation.U u3) {
                    c(u3);
                    return H0.f51801a;
                }

                public final void c(@l3.d androidx.navigation.U navOptions) {
                    F.p(navOptions, "$this$navOptions");
                    androidx.navigation.U.k(navOptions, g.C0418g.f46826D0, null, 2, null);
                }
            }

            /* loaded from: classes2.dex */
            public /* synthetic */ class c {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f47423a;

                static {
                    int[] iArr = new int[StageSaveResult.values().length];
                    try {
                        iArr[StageSaveResult.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[StageSaveResult.NO_STICK_HANDEL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[StageSaveResult.NOT_ENOUGH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[StageSaveResult.OTHER_ERROR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f47423a = iArr;
                }
            }

            a(PartyStageStartFragment partyStageStartFragment) {
                this.f47420E = partyStageStartFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2283j
            @l3.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object f(@l3.d StageSaveResult stageSaveResult, @l3.d kotlin.coroutines.c<? super H0> cVar) {
                int i4 = c.f47423a[stageSaveResult.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 3) {
                        if (i4 == 4) {
                            PartyStageStartFragment partyStageStartFragment = this.f47420E;
                            String string = partyStageStartFragment.getString(g.l.f47150y);
                            F.o(string, "getString(...)");
                            com.harman.jbl.partylight.lib.main.c.d(partyStageStartFragment, string);
                        }
                    } else {
                        androidx.navigation.fragment.f.a(this.f47420E).Y(g.C0418g.f46850L0, C0741d.b(C2122h0.a(PartyStageEmptyFragment.keyEmptyDesc, this.f47420E.getString(g.l.f47145v0))), V.a(C0425b.f47422F));
                    }
                } else {
                    androidx.navigation.fragment.f.a(this.f47420E).Y(g.C0418g.f46847K0, null, V.a(C0424a.f47421F));
                }
                return H0.f51801a;
            }
        }

        b(kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47418I;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                W.n(obj);
            } else {
                W.n(obj);
                kotlinx.coroutines.flow.s<StageSaveResult> x3 = PartyStageStartFragment.this.r0().x();
                a aVar = new a(PartyStageStartFragment.this);
                this.f47418I = 1;
                if (x3.a(aVar, this) == l4) {
                    return l4;
                }
            }
            throw new KotlinNothingValueException();
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

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.l<Boolean, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            F.m(bool);
            if (bool.booleanValue()) {
                com.harman.jbl.partylight.lib.main.c.c(PartyStageStartFragment.this);
                CircularProgressIndicator progress = PartyStageStartFragment.access$getBinding(PartyStageStartFragment.this).f55243L;
                F.o(progress, "progress");
                com.harman.jbl.cd_biz_comm.utils.p.k(progress);
                return;
            }
            com.harman.jbl.partylight.lib.main.c.f(PartyStageStartFragment.this);
            CircularProgressIndicator progress2 = PartyStageStartFragment.access$getBinding(PartyStageStartFragment.this).f55243L;
            F.o(progress2, "progress");
            com.harman.jbl.cd_biz_comm.utils.p.f(progress2);
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.l<StageState, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(StageState stageState) {
            c(stageState);
            return H0.f51801a;
        }

        public final void c(StageState stageState) {
            TextView textView = PartyStageStartFragment.access$getBinding(PartyStageStartFragment.this).f55239H;
            StageState stageState2 = StageState.IDLE;
            F.m(textView);
            if (stageState == stageState2) {
                com.harman.jbl.cd_biz_comm.utils.p.k(textView);
            } else {
                com.harman.jbl.cd_biz_comm.utils.p.g(textView);
            }
            Group group = PartyStageStartFragment.access$getBinding(PartyStageStartFragment.this).f55240I;
            StageState stageState3 = StageState.STARTED;
            F.m(group);
            if (stageState == stageState3) {
                com.harman.jbl.cd_biz_comm.utils.p.k(group);
            } else {
                com.harman.jbl.cd_biz_comm.utils.p.g(group);
            }
            AppCompatTextView appCompatTextView = PartyStageStartFragment.access$getBinding(PartyStageStartFragment.this).f55244M;
            PartyStageStartFragment partyStageStartFragment = PartyStageStartFragment.this;
            if (stageState == stageState3) {
                appCompatTextView.setText(partyStageStartFragment.getString(g.l.f47103a0));
            } else {
                appCompatTextView.setText(partyStageStartFragment.getString(g.l.f47101Z));
            }
            LottieAnimationView lottieAnimationView = PartyStageStartFragment.access$getBinding(PartyStageStartFragment.this).f55242K;
            if (stageState == stageState2) {
                lottieAnimationView.setAnimation(g.k.f47056c);
                lottieAnimationView.z(false);
            } else {
                lottieAnimationView.setAnimation(g.k.f47057d);
                lottieAnimationView.z(true);
            }
            lottieAnimationView.B();
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements X2.l<String, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final e f47426F = new e();

        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(String str) {
            c(str);
            return H0.f51801a;
        }

        public final void c(String str) {
            ToastUtils.W(str, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements X2.a<H0> {
        f() {
            super(0);
        }

        public final void c() {
            PartyStageStartFragment.this.r0().v();
            androidx.navigation.fragment.f.a(PartyStageStartFragment.this).u0(g.C0418g.f46826D0, false);
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    static final class g implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f47428a;

        g(X2.l function) {
            F.p(function, "function");
            this.f47428a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f47428a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f47428a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public PartyStageStartFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partylight.lib.partystage.PartyStageStartFragment$special$$inlined$viewModels$default$1
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
        this.f47413P0 = FragmentViewModelLazyKt.c(this, N.d(q.class), new X2.a<p0>() { // from class: com.harman.jbl.partylight.lib.partystage.PartyStageStartFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partylight.lib.partystage.PartyStageStartFragment$special$$inlined$viewModels$default$3
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
    }

    public static final /* synthetic */ m2.u access$getBinding(PartyStageStartFragment partyStageStartFragment) {
        return partyStageStartFragment.l0();
    }

    private final void onBtnBackClick() {
        String string = getString(g.l.f47117h0);
        F.o(string, "getString(...)");
        String string2 = getString(g.l.f47130o);
        F.o(string2, "getString(...)");
        String string3 = getString(g.l.f47144v);
        F.o(string3, "getString(...)");
        new BottomSheetDialog(string, string2, string3, null, new f(), 8, null).show(getParentFragmentManager(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q r0() {
        return (q) this.f47413P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(PartyStageStartFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(PartyStageStartFragment this$0, View view) {
        F.p(this$0, "this$0");
        new PartyStageTipsDialogFragment(null, 1, null).show(this$0.getChildFragmentManager(), PartyStageTipsDialogFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(PartyStageStartFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.r0().D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(PartyStageStartFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.r0().A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(PartyStageStartFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.r0().B();
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void initView() {
        m2.u l02 = l0();
        l02.f55241J.f55031G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStageStartFragment.s0(PartyStageStartFragment.this, view);
            }
        });
        l02.f55241J.f55033I.setText(getString(g.l.f47094S));
        l02.f55241J.f55030F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStageStartFragment.t0(PartyStageStartFragment.this, view);
            }
        });
        l02.f55241J.f55030F.setImageResource(g.e.f46762E);
        ImageView action = l02.f55241J.f55030F;
        F.o(action, "action");
        action.setVisibility(0);
        l02.f55239H.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStageStartFragment.u0(PartyStageStartFragment.this, view);
            }
        });
        l02.f55238G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStageStartFragment.v0(PartyStageStartFragment.this, view);
            }
        });
        l02.f55237F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStageStartFragment.w0(PartyStageStartFragment.this, view);
            }
        });
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void observeModel() {
        super.observeModel();
        C2323l.f(androidx.lifecycle.F.a(this), null, null, new b(null), 3, null);
        r0().z().k(this, new g(new c()));
        r0().y().k(this, new g(new d()));
        r0().w().k(this, new g(e.f47426F));
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.harman.jbl.partylight.lib.main.c.f(this);
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    @l3.d
    public m2.u createBinding() {
        m2.u c4 = m2.u.c(getLayoutInflater());
        F.o(c4, "inflate(...)");
        return c4;
    }
}
