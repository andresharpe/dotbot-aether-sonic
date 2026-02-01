package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.InterfaceC0566i;
import androidx.core.view.C0823k0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.fragment.k;
import androidx.navigation.i0;
import androidx.slidingpanelayout.widget.a;
import kotlin.E;
import kotlin.H0;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b/\u00100J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u001d\u0010\u001bR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0011\u0010,\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b-\u0010\u0015¨\u00062"}, d2 = {"Landroidx/navigation/fragment/AbstractListDetailFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreateListPaneView", "Landroidx/navigation/fragment/NavHostFragment;", "onCreateDetailPaneNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onListPaneViewCreated", "onViewStateRestored", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroidx/activity/j;", "N0", "Landroidx/activity/j;", "onBackPressedCallback", "O0", "Landroidx/navigation/fragment/NavHostFragment;", "_detailPaneNavHostFragment", "", "P0", "I", "graphId", "Landroidx/slidingpanelayout/widget/a;", "getSlidingPaneLayout", "()Landroidx/slidingpanelayout/widget/a;", "slidingPaneLayout", "getDetailPaneNavHostFragment", "detailPaneNavHostFragment", "<init>", "()V", "a", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class AbstractListDetailFragment extends Fragment {

    /* renamed from: N0, reason: collision with root package name */
    @l3.e
    private androidx.activity.j f16430N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.e
    private NavHostFragment f16431O0;

    /* renamed from: P0, reason: collision with root package name */
    private int f16432P0;

    /* loaded from: classes.dex */
    private static final class a extends androidx.activity.j implements a.f {

        /* renamed from: d, reason: collision with root package name */
        @l3.d
        private final androidx.slidingpanelayout.widget.a f16433d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@l3.d androidx.slidingpanelayout.widget.a slidingPaneLayout) {
            super(true);
            F.p(slidingPaneLayout, "slidingPaneLayout");
            this.f16433d = slidingPaneLayout;
            slidingPaneLayout.a(this);
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
            this.f16433d.d();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.slidingpanelayout.widget.a f16435b;

        public b(androidx.slidingpanelayout.widget.a aVar) {
            this.f16435b = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@l3.d View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            boolean z3;
            F.q(view, "view");
            view.removeOnLayoutChangeListener(this);
            androidx.activity.j jVar = AbstractListDetailFragment.this.f16430N0;
            F.m(jVar);
            if (this.f16435b.o() && this.f16435b.isOpen()) {
                z3 = true;
            } else {
                z3 = false;
            }
            jVar.i(z3);
        }
    }

    @l3.d
    public final NavHostFragment getDetailPaneNavHostFragment() {
        NavHostFragment navHostFragment = this.f16431O0;
        if (navHostFragment != null) {
            if (navHostFragment != null) {
                return navHostFragment;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        }
        throw new IllegalStateException(("Fragment " + this + " was called before onCreateView().").toString());
    }

    @l3.d
    public final androidx.slidingpanelayout.widget.a getSlidingPaneLayout() {
        return (androidx.slidingpanelayout.widget.a) requireView();
    }

    @l3.d
    public NavHostFragment onCreateDetailPaneNavHostFragment() {
        int i4 = this.f16432P0;
        if (i4 != 0) {
            return NavHostFragment.a.c(NavHostFragment.Companion, i4, null, 2, null);
        }
        return new NavHostFragment();
    }

    @l3.d
    public abstract View onCreateListPaneView(@l3.d LayoutInflater layoutInflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    @InterfaceC0566i
    @l3.d
    public final View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        NavHostFragment onCreateDetailPaneNavHostFragment;
        F.p(inflater, "inflater");
        if (bundle != null) {
            this.f16432P0 = bundle.getInt(NavHostFragment.KEY_GRAPH_ID);
        }
        androidx.slidingpanelayout.widget.a aVar = new androidx.slidingpanelayout.widget.a(inflater.getContext());
        aVar.setId(k.c.f16469c);
        View onCreateListPaneView = onCreateListPaneView(inflater, aVar, bundle);
        if (!F.g(onCreateListPaneView, aVar) && !F.g(onCreateListPaneView.getParent(), aVar)) {
            aVar.addView(onCreateListPaneView);
        }
        Context context = inflater.getContext();
        F.o(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(k.c.f16468b);
        a.e eVar = new a.e(inflater.getContext().getResources().getDimensionPixelSize(k.b.f16466a), -1);
        eVar.f18446a = 1.0f;
        aVar.addView(fragmentContainerView, eVar);
        Fragment n02 = getChildFragmentManager().n0(k.c.f16468b);
        boolean z3 = true;
        if (n02 != null) {
            onCreateDetailPaneNavHostFragment = (NavHostFragment) n02;
        } else {
            onCreateDetailPaneNavHostFragment = onCreateDetailPaneNavHostFragment();
            FragmentManager childFragmentManager = getChildFragmentManager();
            F.o(childFragmentManager, "childFragmentManager");
            androidx.fragment.app.F q4 = childFragmentManager.q();
            F.o(q4, "beginTransaction()");
            q4.Q(true);
            q4.f(k.c.f16468b, onCreateDetailPaneNavHostFragment);
            q4.q();
        }
        this.f16431O0 = onCreateDetailPaneNavHostFragment;
        this.f16430N0 = new a(aVar);
        if (C0823k0.U0(aVar) && !aVar.isLayoutRequested()) {
            androidx.activity.j jVar = this.f16430N0;
            F.m(jVar);
            if (!aVar.o() || !aVar.isOpen()) {
                z3 = false;
            }
            jVar.i(z3);
        } else {
            aVar.addOnLayoutChangeListener(new b(aVar));
        }
        OnBackPressedDispatcher d4 = requireActivity().d();
        androidx.lifecycle.E viewLifecycleOwner = getViewLifecycleOwner();
        androidx.activity.j jVar2 = this.f16430N0;
        F.m(jVar2);
        d4.c(viewLifecycleOwner, jVar2);
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC0566i
    public void onInflate(@l3.d Context context, @l3.d AttributeSet attrs, @l3.e Bundle bundle) {
        F.p(context, "context");
        F.p(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, i0.c.f16497g);
        F.o(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(i0.c.f16498h, 0);
        if (resourceId != 0) {
            this.f16432P0 = resourceId;
        }
        H0 h02 = H0.f51801a;
        obtainStyledAttributes.recycle();
    }

    public void onListPaneViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC0566i
    public void onSaveInstanceState(@l3.d Bundle outState) {
        F.p(outState, "outState");
        super.onSaveInstanceState(outState);
        int i4 = this.f16432P0;
        if (i4 != 0) {
            outState.putInt(NavHostFragment.KEY_GRAPH_ID, i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC0566i
    public final void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        View listPaneView = getSlidingPaneLayout().getChildAt(0);
        F.o(listPaneView, "listPaneView");
        onListPaneViewCreated(listPaneView, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC0566i
    public void onViewStateRestored(@l3.e Bundle bundle) {
        boolean z3;
        super.onViewStateRestored(bundle);
        androidx.activity.j jVar = this.f16430N0;
        F.m(jVar);
        if (getSlidingPaneLayout().o() && getSlidingPaneLayout().isOpen()) {
            z3 = true;
        } else {
            z3 = false;
        }
        jVar.i(z3);
    }
}
