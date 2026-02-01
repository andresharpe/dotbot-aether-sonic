package androidx.navigation.fragment;

import W2.n;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.M;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.C0943u;
import androidx.navigation.O;
import androidx.navigation.P;
import androidx.navigation.b0;
import androidx.navigation.c0;
import androidx.navigation.d0;
import androidx.navigation.fragment.g;
import androidx.navigation.fragment.k;
import androidx.navigation.i0;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000f\b\u0016\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001DB\u0007¢\u0006\u0004\bB\u0010-J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018H\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b$\u0010%J)\u0010(\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\bH\u0017¢\u0006\u0004\b+\u0010\u000bJ\u000f\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010-R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/O;", "Landroid/content/Context;", "context", "Lkotlin/H0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/navigation/P;", "navHostController", "n0", "(Landroidx/navigation/P;)V", "Landroidx/navigation/u;", "navController", "m0", "(Landroidx/navigation/u;)V", "", "isPrimaryNavigationFragment", "onPrimaryNavigationFragmentChanged", "(Z)V", "Landroidx/navigation/c0;", "Landroidx/navigation/fragment/g$b;", "k0", "()Landroidx/navigation/c0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/util/AttributeSet;", "attrs", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onDestroyView", "()V", "N0", "Landroidx/navigation/P;", "O0", "Ljava/lang/Boolean;", "isPrimaryBeforeOnCreate", "P0", "Landroid/view/View;", "viewParent", "", "Q0", "I", "graphId", "R0", "Z", "defaultNavHost", "l0", "()I", "containerId", "getNavController", "()Landroidx/navigation/u;", "<init>", "Companion", "a", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class NavHostFragment extends Fragment implements O {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_GRAPH_ID = "android-support-nav:fragment:graphId";

    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_START_DESTINATION_ARGS = "android-support-nav:fragment:startDestinationArgs";

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private static final String f16437S0 = "android-support-nav:fragment:navControllerState";

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private static final String f16438T0 = "android-support-nav:fragment:defaultHost";

    /* renamed from: N0, reason: collision with root package name */
    @l3.e
    private P f16439N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.e
    private Boolean f16440O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.e
    private View f16441P0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f16442Q0;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f16443R0;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public static /* synthetic */ NavHostFragment c(a aVar, int i4, Bundle bundle, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                bundle = null;
            }
            return aVar.b(i4, bundle);
        }

        @W2.j
        @n
        @l3.d
        public final NavHostFragment a(@M int i4) {
            return c(this, i4, null, 2, null);
        }

        @W2.j
        @n
        @l3.d
        public final NavHostFragment b(@M int i4, @l3.e Bundle bundle) {
            Bundle bundle2;
            if (i4 != 0) {
                bundle2 = new Bundle();
                bundle2.putInt(NavHostFragment.KEY_GRAPH_ID, i4);
            } else {
                bundle2 = null;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putBundle(NavHostFragment.KEY_START_DESTINATION_ARGS, bundle);
            }
            NavHostFragment navHostFragment = new NavHostFragment();
            if (bundle2 != null) {
                navHostFragment.setArguments(bundle2);
            }
            return navHostFragment;
        }

        @n
        @l3.d
        public final C0943u d(@l3.d Fragment fragment) {
            DialogFragment dialogFragment;
            Dialog dialog;
            Window window;
            F.p(fragment, "fragment");
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
                if (fragment2 instanceof NavHostFragment) {
                    P p4 = ((NavHostFragment) fragment2).f16439N0;
                    if (p4 != null) {
                        return p4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
                Fragment J02 = fragment2.getParentFragmentManager().J0();
                if (J02 instanceof NavHostFragment) {
                    P p5 = ((NavHostFragment) J02).f16439N0;
                    if (p5 != null) {
                        return p5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return b0.k(view);
            }
            View view2 = null;
            if (fragment instanceof DialogFragment) {
                dialogFragment = (DialogFragment) fragment;
            } else {
                dialogFragment = null;
            }
            if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
                view2 = window.getDecorView();
            }
            if (view2 != null) {
                return b0.k(view2);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }

        private a() {
        }
    }

    @W2.j
    @n
    @l3.d
    public static final NavHostFragment create(@M int i4) {
        return Companion.a(i4);
    }

    @n
    @l3.d
    public static final C0943u findNavController(@l3.d Fragment fragment) {
        return Companion.d(fragment);
    }

    private final int l0() {
        int id = getId();
        if (id == 0 || id == -1) {
            return k.c.f16467a;
        }
        return id;
    }

    @Override // androidx.navigation.O
    @l3.d
    public final C0943u getNavController() {
        P p4 = this.f16439N0;
        if (p4 != null) {
            if (p4 != null) {
                return p4;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavHostController");
        }
        throw new IllegalStateException("NavController is not available before onCreate()".toString());
    }

    @l3.d
    @InterfaceC2205l(message = "Use {@link #onCreateNavController(NavController)}")
    protected c0<? extends g.b> k0() {
        Context requireContext = requireContext();
        F.o(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        F.o(childFragmentManager, "childFragmentManager");
        return new g(requireContext, childFragmentManager, l0());
    }

    @InterfaceC0566i
    @InterfaceC2205l(message = "Override {@link #onCreateNavHostController(NavHostController)} to gain\n      access to the full {@link NavHostController} that is created by this NavHostFragment.")
    protected void m0(@l3.d C0943u navController) {
        F.p(navController, "navController");
        d0 N3 = navController.N();
        Context requireContext = requireContext();
        F.o(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        F.o(childFragmentManager, "childFragmentManager");
        N3.b(new c(requireContext, childFragmentManager));
        navController.N().b(k0());
    }

    @InterfaceC0566i
    protected void n0(@l3.d P navHostController) {
        F.p(navHostController, "navHostController");
        m0(navHostController);
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC0566i
    public void onAttach(@l3.d Context context) {
        F.p(context, "context");
        super.onAttach(context);
        if (this.f16443R0) {
            getParentFragmentManager().q().P(this).q();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.InterfaceC0566i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@l3.e android.os.Bundle r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.requireContext()
            java.lang.String r1 = "requireContext()"
            kotlin.jvm.internal.F.o(r0, r1)
            androidx.navigation.P r1 = new androidx.navigation.P
            r1.<init>(r0)
            r6.f16439N0 = r1
            kotlin.jvm.internal.F.m(r1)
            r1.Q0(r6)
        L16:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L3e
            boolean r1 = r0 instanceof androidx.activity.o
            if (r1 == 0) goto L32
            androidx.navigation.P r1 = r6.f16439N0
            kotlin.jvm.internal.F.m(r1)
            androidx.activity.o r0 = (androidx.activity.o) r0
            androidx.activity.OnBackPressedDispatcher r0 = r0.d()
            java.lang.String r2 = "context as OnBackPressed…).onBackPressedDispatcher"
            kotlin.jvm.internal.F.o(r0, r2)
            r1.S0(r0)
            goto L3e
        L32:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            java.lang.String r1 = "context.baseContext"
            kotlin.jvm.internal.F.o(r0, r1)
            goto L16
        L3e:
            androidx.navigation.P r0 = r6.f16439N0
            kotlin.jvm.internal.F.m(r0)
            java.lang.Boolean r1 = r6.f16440O0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L5b
            if (r1 == 0) goto L53
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L5b
            r1 = r2
            goto L5c
        L53:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            r7.<init>(r0)
            throw r7
        L5b:
            r1 = r3
        L5c:
            r0.x(r1)
            r0 = 0
            r6.f16440O0 = r0
            androidx.navigation.P r1 = r6.f16439N0
            kotlin.jvm.internal.F.m(r1)
            androidx.lifecycle.p0 r4 = r6.getViewModelStore()
            java.lang.String r5 = "viewModelStore"
            kotlin.jvm.internal.F.o(r4, r5)
            r1.T0(r4)
            androidx.navigation.P r1 = r6.f16439N0
            kotlin.jvm.internal.F.m(r1)
            r6.n0(r1)
            java.lang.String r1 = "android-support-nav:fragment:graphId"
            if (r7 == 0) goto La5
            java.lang.String r4 = "android-support-nav:fragment:navControllerState"
            android.os.Bundle r4 = r7.getBundle(r4)
            java.lang.String r5 = "android-support-nav:fragment:defaultHost"
            boolean r5 = r7.getBoolean(r5, r3)
            if (r5 == 0) goto L9e
            r6.f16443R0 = r2
            androidx.fragment.app.FragmentManager r2 = r6.getParentFragmentManager()
            androidx.fragment.app.F r2 = r2.q()
            androidx.fragment.app.F r2 = r2.P(r6)
            r2.q()
        L9e:
            int r2 = r7.getInt(r1)
            r6.f16442Q0 = r2
            goto La6
        La5:
            r4 = r0
        La6:
            if (r4 == 0) goto Lb0
            androidx.navigation.P r2 = r6.f16439N0
            kotlin.jvm.internal.F.m(r2)
            r2.I0(r4)
        Lb0:
            int r2 = r6.f16442Q0
            if (r2 == 0) goto Lbf
            androidx.navigation.P r0 = r6.f16439N0
            kotlin.jvm.internal.F.m(r0)
            int r1 = r6.f16442Q0
            r0.L0(r1)
            goto Ldd
        Lbf:
            android.os.Bundle r2 = r6.getArguments()
            if (r2 != 0) goto Lc6
            goto Lca
        Lc6:
            int r3 = r2.getInt(r1)
        Lca:
            if (r2 != 0) goto Lcd
            goto Ld3
        Lcd:
            java.lang.String r0 = "android-support-nav:fragment:startDestinationArgs"
            android.os.Bundle r0 = r2.getBundle(r0)
        Ld3:
            if (r3 == 0) goto Ldd
            androidx.navigation.P r1 = r6.f16439N0
            kotlin.jvm.internal.F.m(r1)
            r1.M0(r3, r0)
        Ldd:
            super.onCreate(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.NavHostFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        Context context = inflater.getContext();
        F.o(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(l0());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f16441P0;
        if (view != null && b0.k(view) == this.f16439N0) {
            b0.n(view, null);
        }
        this.f16441P0 = null;
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
            this.f16442Q0 = resourceId;
        }
        H0 h02 = H0.f51801a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, k.d.f16474e);
        F.o(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(k.d.f16475f, false)) {
            this.f16443R0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC0566i
    public void onPrimaryNavigationFragmentChanged(boolean z3) {
        P p4 = this.f16439N0;
        if (p4 != null) {
            if (p4 != null) {
                p4.x(z3);
                return;
            }
            return;
        }
        this.f16440O0 = Boolean.valueOf(z3);
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC0566i
    public void onSaveInstanceState(@l3.d Bundle outState) {
        F.p(outState, "outState");
        super.onSaveInstanceState(outState);
        P p4 = this.f16439N0;
        F.m(p4);
        Bundle K02 = p4.K0();
        if (K02 != null) {
            outState.putBundle(f16437S0, K02);
        }
        if (this.f16443R0) {
            outState.putBoolean(f16438T0, true);
        }
        int i4 = this.f16442Q0;
        if (i4 != 0) {
            outState.putInt(KEY_GRAPH_ID, i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            b0.n(view, this.f16439N0);
            if (view.getParent() != null) {
                Object parent = view.getParent();
                if (parent != null) {
                    View view2 = (View) parent;
                    this.f16441P0 = view2;
                    F.m(view2);
                    if (view2.getId() == getId()) {
                        View view3 = this.f16441P0;
                        F.m(view3);
                        b0.n(view3, this.f16439N0);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }

    @W2.j
    @n
    @l3.d
    public static final NavHostFragment create(@M int i4, @l3.e Bundle bundle) {
        return Companion.b(i4, bundle);
    }
}
