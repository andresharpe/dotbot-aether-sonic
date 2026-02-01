package com.harman.jbl.partybox.ui.effectlab;

import X2.p;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActivityC0587e;
import androidx.core.view.D;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Q;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$1;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$2;
import com.harman.jbl.partybox.databinding.C1846b;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.DJEffectBar2;
import com.harman.jbl.partybox.ui.djeffects.model.DJFilterName;
import com.harman.jbl.partybox.ui.effectlab.e;
import com.harman.jbl.partybox.ui.effectlab.o;
import com.harman.jbl.partybox.ui.toneshifter.ToneShifterConfirmDialogFragment;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import java.util.Iterator;
import java.util.List;
import kotlin.A;
import kotlin.C;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001<B\u0007¢\u0006\u0004\b:\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R&\u00109\u001a\u0014\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006="}, d2 = {"Lcom/harman/jbl/partybox/ui/effectlab/EffectLabActivity;", "Landroidx/appcompat/app/e;", "Landroid/view/View$OnClickListener;", "Lkotlin/H0;", "S0", "()V", "T0", "Landroid/content/Context;", "context", "R0", "(Landroid/content/Context;)V", "Lcom/harman/jbl/partybox/ui/customviews/DJEffectBar2;", "djEffectBar", "Lcom/harman/jbl/partybox/ui/djeffects/model/DJFilterName;", "O0", "(Lcom/harman/jbl/partybox/ui/customviews/DJEffectBar2;)Lcom/harman/jbl/partybox/ui/djeffects/model/DJFilterName;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/harman/jbl/partybox/databinding/b;", "h0", "Lkotlin/A;", "N0", "()Lcom/harman/jbl/partybox/databinding/b;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "i0", "P0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/effectlab/k;", "j0", "Q0", "()Lcom/harman/jbl/partybox/ui/effectlab/k;", "viewModel", "Lcom/harman/jbl/partybox/ui/effectlab/o;", "k0", "Lcom/harman/jbl/partybox/ui/effectlab/o;", "soundToneAdapter", "Lcom/harman/jbl/partybox/ui/effectlab/e;", "l0", "Lcom/harman/jbl/partybox/ui/effectlab/e;", "djVoiceAdapter", "Lkotlin/Function2;", "", "m0", "LX2/p;", "onLevelChange", "<init>", "n0", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nEffectLabActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EffectLabActivity.kt\ncom/harman/jbl/partybox/ui/effectlab/EffectLabActivity\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,194:1\n30#2,4:195\n75#3,13:199\n1855#4,2:212\n*S KotlinDebug\n*F\n+ 1 EffectLabActivity.kt\ncom/harman/jbl/partybox/ui/effectlab/EffectLabActivity\n*L\n33#1:195,4\n34#1:199,13\n115#1:212,2\n*E\n"})
/* loaded from: classes2.dex */
public final class EffectLabActivity extends ActivityC0587e implements View.OnClickListener {

    /* renamed from: n0, reason: collision with root package name */
    @l3.d
    public static final a f43418n0 = new a(null);

    /* renamed from: o0, reason: collision with root package name */
    @l3.d
    private static final String f43419o0;

    /* renamed from: h0, reason: collision with root package name */
    @l3.d
    private final A f43420h0;

    /* renamed from: i0, reason: collision with root package name */
    @l3.d
    private final A f43421i0;

    /* renamed from: j0, reason: collision with root package name */
    @l3.d
    private final A f43422j0;

    /* renamed from: k0, reason: collision with root package name */
    @l3.e
    private o f43423k0;

    /* renamed from: l0, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.effectlab.e f43424l0;

    /* renamed from: m0, reason: collision with root package name */
    @l3.d
    private final p<Integer, DJEffectBar2, H0> f43425m0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final String a() {
            return EffectLabActivity.f43419o0;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.a<C1846b> {
        b() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C1846b n() {
            return C1846b.c(EffectLabActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<Pair<? extends String, ? extends Boolean>, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Pair<? extends String, ? extends Boolean> pair) {
            c(pair);
            return H0.f51801a;
        }

        public final void c(Pair<String, Boolean> pair) {
            T1.a.a(EffectLabActivity.f43418n0.a() + " BLEState btConnectStatusLiveData call:" + pair);
            HmDevice k12 = EffectLabActivity.this.P0().k1();
            if (k12 != null) {
                EffectLabActivity effectLabActivity = EffectLabActivity.this;
                if (F.g(k12.n(), pair.e()) && !k12.R()) {
                    effectLabActivity.finish();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = EffectLabActivity.this.N0().f39356P.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            int height = EffectLabActivity.this.N0().f39356P.getHeight();
            Log.d("RecyclerViewItemHeight", "soundToneRecycleView Height: " + height);
            EffectLabActivity effectLabActivity = EffectLabActivity.this;
            o oVar = effectLabActivity.f43423k0;
            if (oVar != null) {
                oVar.X(height);
            }
            effectLabActivity.N0().f39356P.setAdapter(effectLabActivity.f43423k0);
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements p<Integer, DJEffectBar2, H0> {
        e() {
            super(2);
        }

        public final void c(int i4, @l3.d DJEffectBar2 v3) {
            ToneShifterConfirmDialogFragment toneShifterConfirmDialogFragment;
            Dialog dialog;
            F.p(v3, "v");
            DJFilterName O02 = EffectLabActivity.this.O0(v3);
            a aVar = EffectLabActivity.f43418n0;
            com.harman.log.f.a(aVar.a(), "conLevelChange level = " + i4 + ", name = " + O02);
            HmDevice k12 = EffectLabActivity.this.P0().k1();
            if (k12 != null) {
                EffectLabActivity effectLabActivity = EffectLabActivity.this;
                if (k12 instanceof PartyBoxDevice) {
                    PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
                    if (partyBoxDevice.N1() && partyBoxDevice.q1() != 0) {
                        Fragment o02 = effectLabActivity.S().o0(ToneShifterConfirmDialogFragment.TAG);
                        if (o02 instanceof ToneShifterConfirmDialogFragment) {
                            toneShifterConfirmDialogFragment = (ToneShifterConfirmDialogFragment) o02;
                        } else {
                            toneShifterConfirmDialogFragment = null;
                        }
                        if ((toneShifterConfirmDialogFragment != null && toneShifterConfirmDialogFragment.isAdded()) || (toneShifterConfirmDialogFragment != null && (dialog = toneShifterConfirmDialogFragment.getDialog()) != null && true == dialog.isShowing())) {
                            com.harman.log.f.a(aVar.a(), "ToneShifterConfirmDialogFragment return");
                            return;
                        }
                        if (toneShifterConfirmDialogFragment != null) {
                            toneShifterConfirmDialogFragment.dismissAllowingStateLoss();
                        }
                        ToneShifterConfirmDialogFragment.Companion.a().show(effectLabActivity.S(), ToneShifterConfirmDialogFragment.TAG);
                        return;
                    }
                }
                effectLabActivity.Q0().b0(k12, O02, i4);
            }
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(Integer num, DJEffectBar2 dJEffectBar2) {
            c(num.intValue(), dJEffectBar2);
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f43434a;

        f(X2.l function) {
            F.p(function, "function");
            this.f43434a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f43434a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f43434a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    static {
        String simpleName = EffectLabActivity.class.getSimpleName();
        F.o(simpleName, "getSimpleName(...)");
        f43419o0 = simpleName;
    }

    public EffectLabActivity() {
        A a4;
        a4 = C.a(new b());
        this.f43420h0 = a4;
        this.f43421i0 = ApplicationViewModelLazyKt.e(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$1(this), new ApplicationViewModelLazyKt$applicationViewModels$2(this));
        final X2.a aVar = null;
        this.f43422j0 = new l0(N.d(k.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.effectlab.EffectLabActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ComponentActivity.this.getViewModelStore();
                F.o(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.effectlab.EffectLabActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
                F.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new X2.a<R.a>() { // from class: com.harman.jbl.partybox.ui.effectlab.EffectLabActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final R.a n() {
                R.a aVar2;
                X2.a aVar3 = X2.a.this;
                if (aVar3 == null || (aVar2 = (R.a) aVar3.n()) == null) {
                    R.a l4 = this.l();
                    F.o(l4, "this.defaultViewModelCreationExtras");
                    return l4;
                }
                return aVar2;
            }
        });
        this.f43425m0 = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1846b N0() {
        return (C1846b) this.f43420h0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DJFilterName O0(DJEffectBar2 dJEffectBar2) {
        DJFilterName dJFilterName = DJFilterName.REPEATER;
        int id = dJEffectBar2.getId();
        if (id != j.h.i4) {
            if (id == j.h.g4) {
                return DJFilterName.FILTER;
            }
            if (id == j.h.h4) {
                return DJFilterName.GATER;
            }
            if (id == j.h.f4) {
                return DJFilterName.ECHO;
            }
            if (id == j.h.j4) {
                return DJFilterName.WIPEOUT;
            }
            return dJFilterName;
        }
        return dJFilterName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o P0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f43421i0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k Q0() {
        return (k) this.f43422j0.getValue();
    }

    private final void R0(Context context) {
        F.n(context, "null cannot be cast to non-null type android.app.Activity");
        View decorView = ((Activity) context).getWindow().getDecorView();
        F.o(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(D.f13115l);
    }

    private final void S0() {
        P0().V0().k(this, new f(new c()));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void T0() {
        List O3;
        findViewById(j.h.Y6).setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.effectlab.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EffectLabActivity.U0(EffectLabActivity.this, view);
            }
        });
        o oVar = new o(this, Q0().Z());
        this.f43423k0 = oVar;
        oVar.W(new o.a() { // from class: com.harman.jbl.partybox.ui.effectlab.g
            @Override // com.harman.jbl.partybox.ui.effectlab.o.a
            public final void a(int i4) {
                EffectLabActivity.V0(EffectLabActivity.this, i4);
            }
        });
        N0().f39356P.setLayoutManager(new GridLayoutManager(this, 4));
        int itemDecorationCount = N0().f39356P.getItemDecorationCount();
        if (itemDecorationCount == 0) {
            N0().f39356P.n(new com.harman.jbl.partybox.ui.widget.n(4, com.harman.jbl.partybox.utils.j.a(this, 9.0f), com.harman.jbl.partybox.utils.j.a(this, 9.0f)));
        }
        ViewTreeObserver viewTreeObserver = N0().f39356P.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new d());
        }
        com.harman.jbl.partybox.ui.effectlab.e eVar = new com.harman.jbl.partybox.ui.effectlab.e(this, Q0().X());
        this.f43424l0 = eVar;
        eVar.W(new e.b() { // from class: com.harman.jbl.partybox.ui.effectlab.h
            @Override // com.harman.jbl.partybox.ui.effectlab.e.b
            public final void a(int i4) {
                EffectLabActivity.W0(EffectLabActivity.this, i4);
            }
        });
        RecyclerView recyclerView = N0().f39355O;
        recyclerView.setLayoutManager(new GridLayoutManager(this, 5));
        if (itemDecorationCount == 0) {
            int a4 = com.harman.jbl.partybox.utils.j.a(this, 9.0f);
            recyclerView.n(new com.harman.jbl.partybox.ui.widget.n(5, a4, a4));
        }
        recyclerView.setAdapter(this.f43424l0);
        O3 = CollectionsKt__CollectionsKt.O(N0().f39349I, N0().f39347G, N0().f39348H, N0().f39346F, N0().f39350J);
        Iterator it = O3.iterator();
        while (it.hasNext()) {
            ((DJEffectBar2) it.next()).setOnLevelChanged(this.f43425m0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(EffectLabActivity this$0, View v3) {
        F.p(this$0, "this$0");
        F.p(v3, "v");
        this$0.onClick(v3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V0(EffectLabActivity this$0, int i4) {
        F.p(this$0, "this$0");
        Log.d(f43419o0, "play sound tone sendValue: " + i4);
        HmDevice k12 = this$0.P0().k1();
        if (k12 != null) {
            this$0.Q0().c0(k12, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(EffectLabActivity this$0, int i4) {
        F.p(this$0, "this$0");
        HmDevice k12 = this$0.P0().k1();
        if (k12 != null) {
            this$0.Q0().d0(k12, i4);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@l3.d View v3) {
        F.p(v3, "v");
        if (v3.getId() == j.h.Y6) {
            setResult(-1);
            finish();
        }
    }

    @Override // androidx.appcompat.app.ActivityC0587e, androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    @SuppressLint({"NotifyDataSetChanged"})
    public void onConfigurationChanged(@l3.d Configuration newConfig) {
        F.p(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Log.d(f43419o0, "onConfigurationChanged");
        o oVar = this.f43423k0;
        if (oVar != null) {
            oVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setContentView(N0().d());
        T0();
        R0(this);
        S0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onResume() {
        super.onResume();
        Log.d(f43419o0, "onResume");
    }
}
