package com.harman.jbl.partybox.ui.buttonsettings;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0669d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1857d0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.sdk.device.HmDevice;
import e.C2046a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.collections.C2109w;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ?2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b>\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J'\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010\u0004R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u0010058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lcom/harman/jbl/partybox/ui/buttonsettings/DjButtonFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "J0", "K0", "LY1/a;", "djSound", "Landroid/widget/ImageView;", "button", "Landroid/widget/TextView;", "text", "I0", "(LY1/a;Landroid/widget/ImageView;Landroid/widget/TextView;)V", "", "LV1/a;", "H0", "()Ljava/util/List;", "Lcom/harman/sdk/device/HmDevice;", "hmDevice", "z0", "(Lcom/harman/sdk/device/HmDevice;)V", "selectedDjSound", "", "position", "y0", "(LY1/a;I)V", "L0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/d0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "v0", "()Lcom/harman/jbl/partybox/databinding/d0;", "binding", "Lcom/harman/jbl/partybox/ui/djeffects/viewmodel/a;", "R0", "Lkotlin/A;", "x0", "()Lcom/harman/jbl/partybox/ui/djeffects/viewmodel/a;", "viewModel", "Lcom/harman/jbl/partybox/ui/buttonsettings/f;", "S0", "Lcom/harman/jbl/partybox/ui/buttonsettings/f;", "djButtonAdapter", "", "T0", "Ljava/util/List;", "selectedItemList", "Lcom/harman/jbl/partybox/ui/main/o;", "U0", "w0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nDjButtonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DjButtonFragment.kt\ncom/harman/jbl/partybox/ui/buttonsettings/DjButtonFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n84#2,6:209\n66#3,4:215\n1#4:219\n1549#5:220\n1620#5,3:221\n1549#5:224\n1620#5,3:225\n1549#5:228\n1620#5,3:229\n223#5,2:232\n223#5,2:234\n223#5,2:236\n*S KotlinDebug\n*F\n+ 1 DjButtonFragment.kt\ncom/harman/jbl/partybox/ui/buttonsettings/DjButtonFragment\n*L\n29#1:209,6\n180#1:215,4\n91#1:220\n91#1:221,3\n126#1:224\n126#1:225,3\n190#1:228\n190#1:229,3\n143#1:232,2\n157#1:234,2\n172#1:236,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DjButtonFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "DjButtonFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f42243Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f42244R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.e
    private f f42245S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private List<V1.a> f42246T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private final A f42247U0;

    /* renamed from: V0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f42242V0 = {N.u(new PropertyReference1Impl(DjButtonFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentDjButtonBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final DjButtonFragment a() {
            return new DjButtonFragment();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, C1857d0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f42250N = new b();

        b() {
            super(1, C1857d0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentDjButtonBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1857d0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1857d0.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f42251a;

        c(X2.l function) {
            F.p(function, "function");
            this.f42251a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f42251a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f42251a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements X2.l<List<? extends V1.a>, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends V1.a> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<V1.a> list) {
            DjButtonFragment.this.f42246T0.clear();
            List list2 = DjButtonFragment.this.f42246T0;
            F.m(list);
            list2.addAll(list);
            DjButtonFragment.this.K0();
            f fVar = DjButtonFragment.this.f42245S0;
            if (fVar != null) {
                fVar.R(DjButtonFragment.this.H0());
            }
        }
    }

    public DjButtonFragment() {
        super(j.i.f41446U);
        this.f42243Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f42250N);
        this.f42244R0 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.djeffects.viewmodel.a.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.buttonsettings.DjButtonFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                F.o(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.buttonsettings.DjButtonFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                m0.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                F.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.f42246T0 = new ArrayList();
        this.f42247U0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(DjButtonFragment this$0, HmDevice hmDevice, View view) {
        F.p(this$0, "this$0");
        F.p(hmDevice, "$hmDevice");
        for (V1.a aVar : this$0.f42246T0) {
            if (aVar.g() == 1) {
                this$0.x0().i0(aVar.f().j().g(), hmDevice);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B0(DjButtonFragment this$0, C1857d0 this_run, View view, DragEvent dragEvent) {
        F.p(this$0, "this$0");
        F.p(this_run, "$this_run");
        if (dragEvent.getAction() == 3) {
            Object localState = dragEvent.getLocalState();
            F.n(localState, "null cannot be cast to non-null type com.harman.jbl.partybox.ui.djeffects.model.DjSound");
            Y1.a aVar = (Y1.a) localState;
            ImageView imageButton2 = this_run.f39461P;
            F.o(imageButton2, "imageButton2");
            TextView typeButton2 = this_run.f39465T;
            F.o(typeButton2, "typeButton2");
            this$0.I0(aVar, imageButton2, typeButton2);
            this$0.y0(aVar, 2);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(DjButtonFragment this$0, HmDevice hmDevice, View view) {
        F.p(this$0, "this$0");
        F.p(hmDevice, "$hmDevice");
        for (V1.a aVar : this$0.f42246T0) {
            if (aVar.g() == 2) {
                this$0.x0().i0(aVar.f().j().g(), hmDevice);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D0(DjButtonFragment this$0, C1857d0 this_run, View view, DragEvent dragEvent) {
        F.p(this$0, "this$0");
        F.p(this_run, "$this_run");
        if (dragEvent.getAction() == 3) {
            Object localState = dragEvent.getLocalState();
            F.n(localState, "null cannot be cast to non-null type com.harman.jbl.partybox.ui.djeffects.model.DjSound");
            Y1.a aVar = (Y1.a) localState;
            ImageView imageButton3 = this_run.f39462Q;
            F.o(imageButton3, "imageButton3");
            TextView typeButton3 = this_run.f39466U;
            F.o(typeButton3, "typeButton3");
            this$0.I0(aVar, imageButton3, typeButton3);
            this$0.y0(aVar, 3);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(DjButtonFragment this$0, HmDevice hmDevice, View view) {
        F.p(this$0, "this$0");
        F.p(hmDevice, "$hmDevice");
        for (V1.a aVar : this$0.f42246T0) {
            if (aVar.g() == 3) {
                this$0.x0().i0(aVar.f().j().g(), hmDevice);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F0(DjButtonFragment this$0, C1857d0 this_run, View view, DragEvent dragEvent) {
        F.p(this$0, "this$0");
        F.p(this_run, "$this_run");
        if (dragEvent.getAction() == 3) {
            Object localState = dragEvent.getLocalState();
            F.n(localState, "null cannot be cast to non-null type com.harman.jbl.partybox.ui.djeffects.model.DjSound");
            Y1.a aVar = (Y1.a) localState;
            ImageView imageButton1 = this_run.f39460O;
            F.o(imageButton1, "imageButton1");
            TextView typeButton1 = this_run.f39464S;
            F.o(typeButton1, "typeButton1");
            this$0.I0(aVar, imageButton1, typeButton1);
            this$0.y0(aVar, 1);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(DjButtonFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<V1.a> H0() {
        int b02;
        Object obj;
        V1.a aVar;
        List<Y1.a> a4 = new com.harman.jbl.partybox.ui.djeffects.adapter.e().a();
        b02 = C2109w.b0(a4, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (Y1.a aVar2 : a4) {
            Iterator<T> it = this.f42246T0.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (F.g(((V1.a) obj).f(), aVar2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            V1.a aVar3 = (V1.a) obj;
            if (aVar3 != null) {
                aVar = new V1.a(aVar2, true, aVar3.g());
            } else {
                aVar = new V1.a(aVar2, false, -1);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    private final void I0(Y1.a aVar, ImageView imageView, TextView textView) {
        imageView.setImageDrawable(C2046a.b(requireContext(), aVar.h()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(aVar.g());
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke((int) getResources().getDimension(j.e.f40874k0), C0669d.f(requireContext(), j.d.f40689E0));
        gradientDrawable.setGradientType(0);
        imageView.setBackground(gradientDrawable);
        textView.setText(getString(aVar.i()));
    }

    private final void J0() {
        x0().Z().k(getViewLifecycleOwner(), new c(new d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0() {
        int b02;
        List<V1.a> list = this.f42246T0;
        b02 = C2109w.b0(list, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (V1.a aVar : list) {
            C1857d0 v02 = v0();
            int g4 = aVar.g();
            if (g4 != 1) {
                if (g4 != 2) {
                    if (g4 == 3) {
                        Y1.a f4 = aVar.f();
                        ImageView imageButton3 = v02.f39462Q;
                        F.o(imageButton3, "imageButton3");
                        TextView typeButton3 = v02.f39466U;
                        F.o(typeButton3, "typeButton3");
                        I0(f4, imageButton3, typeButton3);
                    }
                } else {
                    Y1.a f5 = aVar.f();
                    ImageView imageButton2 = v02.f39461P;
                    F.o(imageButton2, "imageButton2");
                    TextView typeButton2 = v02.f39465T;
                    F.o(typeButton2, "typeButton2");
                    I0(f5, imageButton2, typeButton2);
                }
            } else {
                Y1.a f6 = aVar.f();
                ImageView imageButton1 = v02.f39460O;
                F.o(imageButton1, "imageButton1");
                TextView typeButton1 = v02.f39464S;
                F.o(typeButton1, "typeButton1");
                I0(f6, imageButton1, typeButton1);
            }
            arrayList.add(H0.f51801a);
        }
    }

    private final void L0(Y1.a aVar, int i4) {
        int b02;
        List<V1.a> list = this.f42246T0;
        b02 = C2109w.b0(list, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (V1.a aVar2 : list) {
            if (aVar2.g() == i4) {
                aVar2 = new V1.a(aVar, true, i4);
            }
            arrayList.add(aVar2);
        }
        this.f42246T0.clear();
        this.f42246T0.addAll(arrayList);
    }

    @W2.n
    @l3.d
    public static final DjButtonFragment newInstance() {
        return Companion.a();
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    private final C1857d0 v0() {
        return (C1857d0) this.f42243Q0.a(this, f42242V0[0]);
    }

    private final o w0() {
        return (o) this.f42247U0.getValue();
    }

    private final com.harman.jbl.partybox.ui.djeffects.viewmodel.a x0() {
        return (com.harman.jbl.partybox.ui.djeffects.viewmodel.a) this.f42244R0.getValue();
    }

    private final void y0(Y1.a aVar, int i4) {
        HmDevice k12 = w0().k1();
        if (k12 != null) {
            x0().h0(i4, aVar.j().g(), k12);
        }
        L0(aVar, i4);
        f fVar = this.f42245S0;
        if (fVar != null) {
            fVar.R(H0());
        }
    }

    private final void z0(final HmDevice hmDevice) {
        final C1857d0 v02 = v0();
        v02.f39451F.setOnDragListener(new View.OnDragListener() { // from class: com.harman.jbl.partybox.ui.buttonsettings.i
            @Override // android.view.View.OnDragListener
            public final boolean onDrag(View view, DragEvent dragEvent) {
                boolean F02;
                F02 = DjButtonFragment.F0(DjButtonFragment.this, v02, view, dragEvent);
                return F02;
            }
        });
        v02.f39451F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.buttonsettings.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DjButtonFragment.A0(DjButtonFragment.this, hmDevice, view);
            }
        });
        v02.f39452G.setOnDragListener(new View.OnDragListener() { // from class: com.harman.jbl.partybox.ui.buttonsettings.k
            @Override // android.view.View.OnDragListener
            public final boolean onDrag(View view, DragEvent dragEvent) {
                boolean B02;
                B02 = DjButtonFragment.B0(DjButtonFragment.this, v02, view, dragEvent);
                return B02;
            }
        });
        v02.f39452G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.buttonsettings.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DjButtonFragment.C0(DjButtonFragment.this, hmDevice, view);
            }
        });
        v02.f39453H.setOnDragListener(new View.OnDragListener() { // from class: com.harman.jbl.partybox.ui.buttonsettings.m
            @Override // android.view.View.OnDragListener
            public final boolean onDrag(View view, DragEvent dragEvent) {
                boolean D02;
                D02 = DjButtonFragment.D0(DjButtonFragment.this, v02, view, dragEvent);
                return D02;
            }
        });
        v02.f39453H.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.buttonsettings.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DjButtonFragment.E0(DjButtonFragment.this, hmDevice, view);
            }
        });
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f42245S0 = null;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        J0();
        f fVar = new f();
        this.f42245S0 = fVar;
        fVar.R(H0());
        RecyclerView recyclerView = v0().f39454I;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3));
        recyclerView.setAdapter(this.f42245S0);
        recyclerView.setItemAnimator(null);
        recyclerView.n(new com.harman.jbl.partybox.ui.djeffects.adapter.c((int) recyclerView.getResources().getDimension(j.e.f40809H)));
        v0().f39456K.f38611G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.buttonsettings.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DjButtonFragment.G0(DjButtonFragment.this, view2);
            }
        });
        v0().f39456K.f38613I.setText(j.m.V6);
        HmDevice k12 = w0().k1();
        if (k12 != null) {
            z0(k12);
        }
    }
}
