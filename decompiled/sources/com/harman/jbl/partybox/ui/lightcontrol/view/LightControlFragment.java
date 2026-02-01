package com.harman.jbl.partybox.ui.lightcontrol.view;

import X2.l;
import a2.AbstractC0557b;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.content.C0669d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b2.C1004a;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.colorpicker.ColorPickerFragment;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.Color;
import com.harman.sdk.utils.ColorMode;
import com.harman.sdk.utils.LightElements;
import java.util.List;
import java.util.Map;
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
import kotlin.reflect.n;
import l3.d;

@E(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b0\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0004R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/harman/jbl/partybox/ui/lightcontrol/view/LightControlFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlin/H0;", "s0", "()V", "p0", "Lcom/harman/sdk/utils/Color;", v.b.f7402d, "Lcom/harman/sdk/utils/ColorMode;", "colorMode", "r0", "(Lcom/harman/sdk/utils/Color;Lcom/harman/sdk/utils/ColorMode;)V", "", "enabled", "o0", "(Z)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "Lcom/harman/jbl/partybox/databinding/C0;", "N0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "l0", "()Lcom/harman/jbl/partybox/databinding/C0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "O0", "Lkotlin/A;", "m0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lb2/a;", "P0", "n0", "()Lb2/a;", "viewModel", "Lcom/harman/jbl/partybox/ui/lightcontrol/b;", "Q0", "Lcom/harman/jbl/partybox/ui/lightcontrol/b;", "lightAdapter", "Landroid/content/BroadcastReceiver;", "R0", "Landroid/content/BroadcastReceiver;", "broadcastListener310", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nLightControlFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightControlFragment.kt\ncom/harman/jbl/partybox/ui/lightcontrol/view/LightControlFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n66#2,4:205\n56#3,10:209\n329#4,4:219\n1#5:223\n*S KotlinDebug\n*F\n+ 1 LightControlFragment.kt\ncom/harman/jbl/partybox/ui/lightcontrol/view/LightControlFragment\n*L\n34#1:205,4\n35#1:209,10\n71#1:219,4\n*E\n"})
/* loaded from: classes2.dex */
public final class LightControlFragment extends Fragment {

    @l3.d
    public static final String EVENT_LIGHT_CARD_CHANGED_310 = "310_light_card_change_event_100";

    @l3.d
    public static final String TAG = "LightControlFragment";

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43958N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final A f43959O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final A f43960P0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.lightcontrol.b f43961Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.e
    private BroadcastReceiver f43962R0;

    /* renamed from: S0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f43957S0 = {N.u(new PropertyReference1Impl(LightControlFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentLightControlBinding;", 0))};

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
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, C0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f43967N = new b();

        b() {
            super(1, C0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentLightControlBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C0.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements l<Map<LightElements, Boolean>, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Map<LightElements, Boolean> map) {
            c(map);
            return H0.f51801a;
        }

        public final void c(Map<LightElements, Boolean> map) {
            C1004a n02 = LightControlFragment.this.n0();
            F.m(map);
            n02.A(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements l<Pair<? extends Color, ? extends ColorMode>, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Pair<? extends Color, ? extends ColorMode> pair) {
            c(pair);
            return H0.f51801a;
        }

        public final void c(Pair<Color, ? extends ColorMode> pair) {
            LightControlFragment.this.r0(pair.a(), pair.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements l<Boolean, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            boolean z3;
            LightControlFragment lightControlFragment = LightControlFragment.this;
            F.m(bool);
            if (bool.booleanValue() && F.g(LightControlFragment.this.m0().S1().f(), Boolean.FALSE)) {
                z3 = true;
            } else {
                z3 = false;
            }
            lightControlFragment.o0(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements l<Boolean, H0> {
        f() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            LightControlFragment.this.o0(!bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @U({"SMAP\nLightControlFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightControlFragment.kt\ncom/harman/jbl/partybox/ui/lightcontrol/view/LightControlFragment$initObserver$5\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,204:1\n37#2,2:205\n*S KotlinDebug\n*F\n+ 1 LightControlFragment.kt\ncom/harman/jbl/partybox/ui/lightcontrol/view/LightControlFragment$initObserver$5\n*L\n127#1:205,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class g extends Lambda implements l<Pair<? extends List<Drawable>, ? extends Boolean>, H0> {
        g() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Pair<? extends List<Drawable>, ? extends Boolean> pair) {
            c(pair);
            return H0.f51801a;
        }

        public final void c(Pair<? extends List<Drawable>, Boolean> pair) {
            List<Drawable> a4 = pair.a();
            boolean booleanValue = pair.b().booleanValue();
            LightControlFragment.this.l0().f38514J.setImageDrawable(new LayerDrawable((Drawable[]) a4.toArray(new Drawable[0])));
            LightControlFragment.this.m0().U2(booleanValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class h extends Lambda implements l<List<? extends AbstractC0557b>, H0> {
        h() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends AbstractC0557b> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<? extends AbstractC0557b> list) {
            com.harman.jbl.partybox.ui.lightcontrol.b bVar = LightControlFragment.this.f43961Q0;
            if (bVar != null) {
                bVar.R(list);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class i extends Lambda implements l<AbstractC0557b, H0> {
        i() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(AbstractC0557b abstractC0557b) {
            c(abstractC0557b);
            return H0.f51801a;
        }

        public final void c(@l3.d AbstractC0557b selectedElement) {
            F.p(selectedElement, "selectedElement");
            LightControlFragment.this.n0().D(LightControlFragment.this.m0().k1(), selectedElement);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HmDevice f43976b;

        j(HmDevice hmDevice) {
            this.f43976b = hmDevice;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@l3.e Context context, @l3.e Intent intent) {
            LightControlFragment.this.n0().w(this.f43976b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class k implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f43977a;

        k(l function) {
            F.p(function, "function");
            this.f43977a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f43977a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f43977a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public LightControlFragment() {
        super(j.i.f41535q0);
        this.f43958N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f43967N);
        this.f43959O0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.lightcontrol.view.LightControlFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f43960P0 = FragmentViewModelLazyKt.c(this, N.d(C1004a.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.lightcontrol.view.LightControlFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.lightcontrol.view.LightControlFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @d
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

    /* JADX INFO: Access modifiers changed from: private */
    public final C0 l0() {
        return (C0) this.f43958N0.a(this, f43957S0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o m0() {
        return (o) this.f43959O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1004a n0() {
        return (C1004a) this.f43960P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(boolean z3) {
        Drawable drawable;
        if (z3) {
            Pair<Color, ColorMode> f4 = m0().X0().f();
            if (f4 != null) {
                r0(f4.e(), f4.f());
                return;
            }
            return;
        }
        C0 l02 = l0();
        CardView cardView = l02.f38510F;
        Context context = getContext();
        Drawable drawable2 = null;
        if (context != null) {
            drawable = C0669d.i(context, j.f.f41121x0);
        } else {
            drawable = null;
        }
        cardView.setForeground(drawable);
        l02.f38511G.setBackground(new ColorDrawable(android.graphics.Color.parseColor("#33000000")));
        ImageView imageView = l02.f38511G;
        Context context2 = getContext();
        if (context2 != null) {
            drawable2 = C0669d.i(context2, j.f.f40960N2);
        }
        imageView.setImageDrawable(drawable2);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void p0() {
        m0().j1().k(getViewLifecycleOwner(), new k(new c()));
        m0().X0().k(getViewLifecycleOwner(), new k(new d()));
        m0().X1().k(getViewLifecycleOwner(), new k(new e()));
        m0().S1().k(getViewLifecycleOwner(), new k(new f()));
        n0().x().k(getViewLifecycleOwner(), new k(new g()));
        n0().z().k(getViewLifecycleOwner(), new k(new h()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(LightControlFragment this$0, View view) {
        F.p(this$0, "this$0");
        if (this$0.n0().B() && F.g(this$0.m0().S1().f(), Boolean.FALSE)) {
            new ColorPickerFragment().show(this$0.getChildFragmentManager(), ColorPickerFragment.TAG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(Color color, ColorMode colorMode) {
        Drawable drawable;
        Drawable drawable2;
        C0 l02 = l0();
        Drawable drawable3 = null;
        if (colorMode == ColorMode.COLOR_LOOP) {
            CardView cardView = l02.f38510F;
            Context context = getContext();
            if (context != null) {
                drawable2 = C0669d.i(context, j.f.f40917D);
            } else {
                drawable2 = null;
            }
            cardView.setForeground(drawable2);
            l02.f38511G.setBackground(null);
            ImageView imageView = l02.f38511G;
            Context context2 = getContext();
            if (context2 != null) {
                drawable3 = C0669d.i(context2, j.f.f40951L1);
            }
            imageView.setImageDrawable(drawable3);
            return;
        }
        CardView cardView2 = l02.f38510F;
        Context context3 = getContext();
        if (context3 != null) {
            drawable = C0669d.i(context3, j.f.f41121x0);
        } else {
            drawable = null;
        }
        cardView2.setForeground(drawable);
        l02.f38511G.setBackground(new ColorDrawable(android.graphics.Color.rgb(color.h(), color.g(), color.f())));
        l02.f38511G.setImageDrawable(null);
    }

    private final void s0() {
        C0 l02 = l0();
        l02.f38517M.setText(getString(j.m.X7));
        l02.f38512H.setText(getString(j.m.E6));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        BroadcastReceiver broadcastReceiver;
        super.onDestroy();
        this.f43961Q0 = null;
        Context context = getContext();
        if (context != null && (broadcastReceiver = this.f43962R0) != null) {
            androidx.localbroadcastmanager.content.a.b(context).f(broadcastReceiver);
        }
        this.f43962R0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        s0();
        C0 l02 = l0();
        l02.f38510F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.lightcontrol.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LightControlFragment.q0(LightControlFragment.this, view2);
            }
        });
        RecyclerView recyclerView = l02.f38516L;
        com.harman.jbl.partybox.ui.lightcontrol.b bVar = new com.harman.jbl.partybox.ui.lightcontrol.b(new i());
        this.f43961Q0 = bVar;
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3));
        androidx.localbroadcastmanager.content.a aVar = null;
        recyclerView.setItemAnimator(null);
        p0();
        HmDevice k12 = m0().k1();
        if (k12 != null) {
            n0().w(k12);
            if (com.harman.sdk.utils.d.J(k12.q()) || com.harman.sdk.utils.d.L(k12.q())) {
                RecyclerView lightElementRecyclerView = l0().f38516L;
                F.o(lightElementRecyclerView, "lightElementRecyclerView");
                ViewGroup.LayoutParams layoutParams = lightElementRecyclerView.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(0, 50, 0, 0);
                    lightElementRecyclerView.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            this.f43962R0 = new j(k12);
            Context context = getContext();
            if (context != null) {
                aVar = androidx.localbroadcastmanager.content.a.b(context);
            }
            if (aVar != null) {
                BroadcastReceiver broadcastReceiver = this.f43962R0;
                F.n(broadcastReceiver, "null cannot be cast to non-null type android.content.BroadcastReceiver");
                aVar.c(broadcastReceiver, new IntentFilter(EVENT_LIGHT_CARD_CHANGED_310));
            }
        }
    }
}
