package com.harman.jbl.partybox.ui.oobe;

import X2.l;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.os.C0741d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import com.harman.jbl.partybox.databinding.K3;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import kotlin.A;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;

@E(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/harman/jbl/partybox/ui/oobe/OnBoardingPagerFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/harman/jbl/partybox/databinding/K3;", "N0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "k0", "()Lcom/harman/jbl/partybox/databinding/K3;", "binding", "Lcom/harman/jbl/partybox/ui/oobe/f;", "O0", "Lkotlin/A;", "l0", "()Lcom/harman/jbl/partybox/ui/oobe/f;", "onBoardingViewModel", "<init>", "()V", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nOnBoardingPagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBoardingPagerFragment.kt\ncom/harman/jbl/partybox/ui/oobe/OnBoardingPagerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,44:1\n84#2,6:45\n*S KotlinDebug\n*F\n+ 1 OnBoardingPagerFragment.kt\ncom/harman/jbl/partybox/ui/oobe/OnBoardingPagerFragment\n*L\n15#1:45,6\n*E\n"})
/* loaded from: classes2.dex */
public final class OnBoardingPagerFragment extends Fragment {

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private static final String f44376Q0 = "ARGS";

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f44377N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final A f44378O0;

    /* renamed from: P0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f44375P0 = {N.u(new PropertyReference1Impl(OnBoardingPagerFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/PagerTutorialBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final OnBoardingPagerFragment a(int i4) {
            OnBoardingPagerFragment onBoardingPagerFragment = new OnBoardingPagerFragment();
            onBoardingPagerFragment.setArguments(C0741d.b(C2122h0.a(OnBoardingPagerFragment.f44376Q0, Integer.valueOf(i4))));
            return onBoardingPagerFragment;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, K3> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f44381N = new b();

        b() {
            super(1, K3.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/PagerTutorialBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final K3 C(@l3.d View p02) {
            F.p(p02, "p0");
            return K3.a(p02);
        }
    }

    public OnBoardingPagerFragment() {
        super(j.i.f41417M2);
        this.f44377N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f44381N);
        this.f44378O0 = FragmentViewModelLazyKt.c(this, N.d(f.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.oobe.OnBoardingPagerFragment$special$$inlined$activityViewModels$default$1
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.oobe.OnBoardingPagerFragment$special$$inlined$activityViewModels$default$2
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
    }

    private final K3 k0() {
        return (K3) this.f44377N0.a(this, f44375P0[0]);
    }

    private final f l0() {
        return (f) this.f44378O0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        Object obj;
        Window window;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = arguments.get(f44376Q0);
        } else {
            obj = null;
        }
        F.n(obj, "null cannot be cast to non-null type kotlin.Int");
        com.harman.jbl.partybox.ui.oobe.b v3 = l0().v(((Integer) obj).intValue());
        k0().f38840H.setText(v3.h());
        k0().f38839G.setText(v3.g());
        k0().f38838F.setAnimation(v3.f());
        k0().f38838F.B();
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            int color = activity.getColor(j.d.f40753h);
            ActivityC0889g activity2 = getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                window.setStatusBarColor(color);
            }
        }
    }
}
