package com.harman.jbl.partybox.ui.dashboard;

import android.os.Bundle;
import android.view.View;
import androidx.core.os.C0741d;
import androidx.fragment.app.Fragment;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1941u0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import kotlin.C2122h0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;

@kotlin.E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "()V", "Lcom/harman/jbl/partybox/databinding/u0;", "N0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "k0", "()Lcom/harman/jbl/partybox/databinding/u0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "O0", "Lkotlin/A;", "l0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@kotlin.jvm.internal.U({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/HomeFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,48:1\n66#2,4:49\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/HomeFragment\n*L\n18#1:49,4\n*E\n"})
/* loaded from: classes2.dex */
public final class HomeFragment extends Fragment {

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private static final String f42984Q0 = "isFromSwitchSpeaker";

    @l3.d
    public static final String TAG = "HomeProductList";

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f42985N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f42986O0;

    /* renamed from: P0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f42983P0 = {kotlin.jvm.internal.N.u(new PropertyReference1Impl(HomeFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentHomeBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final HomeFragment a(boolean z3) {
            HomeFragment homeFragment = new HomeFragment();
            homeFragment.setArguments(C0741d.b(C2122h0.a(HomeFragment.f42984Q0, Boolean.valueOf(z3))));
            return homeFragment;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, C1941u0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f42987N = new b();

        b() {
            super(1, C1941u0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentHomeBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1941u0 C(@l3.d View p02) {
            kotlin.jvm.internal.F.p(p02, "p0");
            return C1941u0.a(p02);
        }
    }

    public HomeFragment() {
        super(j.i.f41507j0);
        this.f42985N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f42987N);
        this.f42986O0 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    private final C1941u0 k0() {
        return (C1941u0) this.f42985N0.a(this, f42983P0[0]);
    }

    private final com.harman.jbl.partybox.ui.main.o l0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f42986O0.getValue();
    }

    @W2.n
    @l3.d
    public static final HomeFragment newInstance(boolean z3) {
        return Companion.a(z3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        T1.a.a(" BLE_LOG HomeProductList onCreate called ");
        super.onCreate(bundle);
        l0().M2(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        T1.a.a(" BLE_LOG HomeProductList onResume called");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(view, "view");
        super.onViewCreated(view, bundle);
        T1.a.a("BLE_LOG HomeProductList onCreate");
    }
}
