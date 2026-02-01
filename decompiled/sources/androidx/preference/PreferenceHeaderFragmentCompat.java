package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.InterfaceC0566i;
import androidx.core.view.C0823k0;
import androidx.fragment.app.C0893k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.q;
import androidx.slidingpanelayout.widget.a;
import kotlin.E;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b2\u00103J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H&¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0011\u00101\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat;", "Landroidx/fragment/app/Fragment;", "Landroidx/preference/PreferenceFragmentCompat$f;", "Landroid/view/LayoutInflater;", "inflater", "Landroidx/slidingpanelayout/widget/a;", "l0", "(Landroid/view/LayoutInflater;)Landroidx/slidingpanelayout/widget/a;", "Landroidx/preference/Preference;", "header", "Lkotlin/H0;", "o0", "(Landroidx/preference/Preference;)V", "Landroid/content/Intent;", "intent", "n0", "(Landroid/content/Intent;)V", "Landroidx/preference/PreferenceFragmentCompat;", "caller", "pref", "", "onPreferenceStartFragment", "(Landroidx/preference/PreferenceFragmentCompat;Landroidx/preference/Preference;)Z", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreatePreferenceHeader", "()Landroidx/preference/PreferenceFragmentCompat;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onViewStateRestored", "(Landroid/os/Bundle;)V", "onCreateInitialDetailFragment", "()Landroidx/fragment/app/Fragment;", "Landroidx/activity/j;", "N0", "Landroidx/activity/j;", "onBackPressedCallback", "getSlidingPaneLayout", "()Landroidx/slidingpanelayout/widget/a;", "slidingPaneLayout", "<init>", "()V", "a", "preference_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class PreferenceHeaderFragmentCompat extends Fragment implements PreferenceFragmentCompat.f {

    /* renamed from: N0, reason: collision with root package name */
    @l3.e
    private androidx.activity.j f16813N0;

    /* loaded from: classes.dex */
    private static final class a extends androidx.activity.j implements a.f {

        /* renamed from: d, reason: collision with root package name */
        @l3.d
        private final PreferenceHeaderFragmentCompat f16814d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@l3.d PreferenceHeaderFragmentCompat caller) {
            super(true);
            F.p(caller, "caller");
            this.f16814d = caller;
            caller.getSlidingPaneLayout().a(this);
        }

        @Override // androidx.slidingpanelayout.widget.a.f
        public void a(@l3.d View panel, float f4) {
            F.p(panel, "panel");
        }

        @Override // androidx.slidingpanelayout.widget.a.f
        public void b(@l3.d View panel) {
            F.p(panel, "panel");
            i(true);
        }

        @Override // androidx.slidingpanelayout.widget.a.f
        public void c(@l3.d View panel) {
            F.p(panel, "panel");
            i(false);
        }

        @Override // androidx.activity.j
        public void e() {
            this.f16814d.getSlidingPaneLayout().d();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@l3.d View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            boolean z3;
            F.q(view, "view");
            view.removeOnLayoutChangeListener(this);
            androidx.activity.j jVar = PreferenceHeaderFragmentCompat.this.f16813N0;
            F.m(jVar);
            if (PreferenceHeaderFragmentCompat.this.getSlidingPaneLayout().o() && PreferenceHeaderFragmentCompat.this.getSlidingPaneLayout().isOpen()) {
                z3 = true;
            } else {
                z3 = false;
            }
            jVar.i(z3);
        }
    }

    private final androidx.slidingpanelayout.widget.a l0(LayoutInflater layoutInflater) {
        androidx.slidingpanelayout.widget.a aVar = new androidx.slidingpanelayout.widget.a(layoutInflater.getContext());
        aVar.setId(q.f.f17047d);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(q.f.f17046c);
        a.e eVar = new a.e(getResources().getDimensionPixelSize(q.d.f17041g), -1);
        eVar.f18446a = getResources().getInteger(q.g.f17054b);
        aVar.addView(fragmentContainerView, eVar);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView2.setId(q.f.f17045b);
        a.e eVar2 = new a.e(getResources().getDimensionPixelSize(q.d.f17040f), -1);
        eVar2.f18446a = getResources().getInteger(q.g.f17053a);
        aVar.addView(fragmentContainerView2, eVar2);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(PreferenceHeaderFragmentCompat this$0) {
        boolean z3;
        F.p(this$0, "this$0");
        androidx.activity.j jVar = this$0.f16813N0;
        F.m(jVar);
        if (this$0.getChildFragmentManager().x0() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        jVar.i(z3);
    }

    private final void n0(Intent intent) {
        if (intent == null) {
            return;
        }
        startActivity(intent);
    }

    private final void o0(Preference preference) {
        Fragment a4;
        if (preference.q() == null) {
            n0(preference.t());
            return;
        }
        String q4 = preference.q();
        if (q4 == null) {
            a4 = null;
        } else {
            a4 = getChildFragmentManager().C0().a(requireContext().getClassLoader(), q4);
        }
        if (a4 != null) {
            a4.setArguments(preference.o());
        }
        if (getChildFragmentManager().x0() > 0) {
            FragmentManager.i w02 = getChildFragmentManager().w0(0);
            F.o(w02, "childFragmentManager.getBackStackEntryAt(0)");
            getChildFragmentManager().j1(w02.getId(), 1);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        F.o(childFragmentManager, "childFragmentManager");
        androidx.fragment.app.F q5 = childFragmentManager.q();
        F.o(q5, "beginTransaction()");
        q5.Q(true);
        int i4 = q.f.f17045b;
        F.m(a4);
        q5.C(i4, a4);
        if (getSlidingPaneLayout().isOpen()) {
            q5.R(androidx.fragment.app.F.f14941K);
        }
        getSlidingPaneLayout().r();
        q5.q();
    }

    @l3.d
    public final androidx.slidingpanelayout.widget.a getSlidingPaneLayout() {
        return (androidx.slidingpanelayout.widget.a) requireView();
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC0566i
    public void onAttach(@l3.d Context context) {
        F.p(context, "context");
        super.onAttach(context);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        F.o(parentFragmentManager, "parentFragmentManager");
        androidx.fragment.app.F q4 = parentFragmentManager.q();
        F.o(q4, "beginTransaction()");
        q4.P(this);
        q4.q();
    }

    @l3.e
    public Fragment onCreateInitialDetailFragment() {
        Fragment n02 = getChildFragmentManager().n0(q.f.f17046c);
        if (n02 != null) {
            PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) n02;
            if (preferenceFragmentCompat.getPreferenceScreen().s1() <= 0) {
                return null;
            }
            int s12 = preferenceFragmentCompat.getPreferenceScreen().s1();
            int i4 = 0;
            while (i4 < s12) {
                int i5 = i4 + 1;
                Preference r12 = preferenceFragmentCompat.getPreferenceScreen().r1(i4);
                F.o(r12, "headerFragment.preferenc…reen.getPreference(index)");
                if (r12.q() == null) {
                    i4 = i5;
                } else {
                    String q4 = r12.q();
                    if (q4 == null) {
                        return null;
                    }
                    return getChildFragmentManager().C0().a(requireContext().getClassLoader(), q4);
                }
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
    }

    @l3.d
    public abstract PreferenceFragmentCompat onCreatePreferenceHeader();

    @Override // androidx.fragment.app.Fragment
    @InterfaceC0566i
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        androidx.slidingpanelayout.widget.a l02 = l0(inflater);
        if (getChildFragmentManager().n0(q.f.f17046c) == null) {
            PreferenceFragmentCompat onCreatePreferenceHeader = onCreatePreferenceHeader();
            FragmentManager childFragmentManager = getChildFragmentManager();
            F.o(childFragmentManager, "childFragmentManager");
            androidx.fragment.app.F q4 = childFragmentManager.q();
            F.o(q4, "beginTransaction()");
            q4.Q(true);
            q4.f(q.f.f17046c, onCreatePreferenceHeader);
            q4.q();
        }
        l02.setLockMode(3);
        return l02;
    }

    @Override // androidx.preference.PreferenceFragmentCompat.f
    @InterfaceC0566i
    public boolean onPreferenceStartFragment(@l3.d PreferenceFragmentCompat caller, @l3.d Preference pref) {
        F.p(caller, "caller");
        F.p(pref, "pref");
        if (caller.getId() == q.f.f17046c) {
            o0(pref);
            return true;
        }
        if (caller.getId() == q.f.f17045b) {
            C0893k C02 = getChildFragmentManager().C0();
            ClassLoader classLoader = requireContext().getClassLoader();
            String q4 = pref.q();
            F.m(q4);
            Fragment a4 = C02.a(classLoader, q4);
            F.o(a4, "childFragmentManager.fra….fragment!!\n            )");
            a4.setArguments(pref.o());
            FragmentManager childFragmentManager = getChildFragmentManager();
            F.o(childFragmentManager, "childFragmentManager");
            androidx.fragment.app.F q5 = childFragmentManager.q();
            F.o(q5, "beginTransaction()");
            q5.Q(true);
            q5.C(q.f.f17045b, a4);
            q5.R(androidx.fragment.app.F.f14941K);
            q5.o(null);
            q5.q();
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC0566i
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        androidx.activity.o oVar;
        boolean z3;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        this.f16813N0 = new a(this);
        androidx.slidingpanelayout.widget.a slidingPaneLayout = getSlidingPaneLayout();
        if (C0823k0.U0(slidingPaneLayout) && !slidingPaneLayout.isLayoutRequested()) {
            androidx.activity.j jVar = this.f16813N0;
            F.m(jVar);
            if (getSlidingPaneLayout().o() && getSlidingPaneLayout().isOpen()) {
                z3 = true;
            } else {
                z3 = false;
            }
            jVar.i(z3);
        } else {
            slidingPaneLayout.addOnLayoutChangeListener(new b());
        }
        getChildFragmentManager().l(new FragmentManager.o() { // from class: androidx.preference.l
            @Override // androidx.fragment.app.FragmentManager.o
            public final void a() {
                PreferenceHeaderFragmentCompat.m0(PreferenceHeaderFragmentCompat.this);
            }
        });
        Object requireContext = requireContext();
        if (requireContext instanceof androidx.activity.o) {
            oVar = (androidx.activity.o) requireContext;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            OnBackPressedDispatcher d4 = oVar.d();
            androidx.lifecycle.E viewLifecycleOwner = getViewLifecycleOwner();
            androidx.activity.j jVar2 = this.f16813N0;
            F.m(jVar2);
            d4.c(viewLifecycleOwner, jVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@l3.e Bundle bundle) {
        Fragment onCreateInitialDetailFragment;
        super.onViewStateRestored(bundle);
        if (bundle == null && (onCreateInitialDetailFragment = onCreateInitialDetailFragment()) != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            F.o(childFragmentManager, "childFragmentManager");
            androidx.fragment.app.F q4 = childFragmentManager.q();
            F.o(q4, "beginTransaction()");
            q4.Q(true);
            q4.C(q.f.f17045b, onCreateInitialDetailFragment);
            q4.q();
        }
    }
}
