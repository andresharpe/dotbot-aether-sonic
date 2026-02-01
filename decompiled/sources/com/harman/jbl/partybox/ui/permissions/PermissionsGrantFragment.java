package com.harman.jbl.partybox.ui.permissions;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.core.os.C0741d;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.I;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.V0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import kotlin.A;
import kotlin.C;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b#\u0010\rJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/harman/jbl/partybox/ui/permissions/PermissionsGrantFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "p0", "(Landroidx/fragment/app/DialogFragment;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "()V", "Lcom/harman/jbl/partybox/databinding/V0;", "N0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "l0", "()Lcom/harman/jbl/partybox/databinding/V0;", "binding", "", "O0", "I", "from", "Lcom/harman/jbl/partybox/ui/main/o;", "P0", "Lkotlin/A;", "m0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/permissions/PermissionAndAccessFragment;", "Q0", "n0", "()Lcom/harman/jbl/partybox/ui/permissions/PermissionAndAccessFragment;", "permissionAndAccessFragment", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPermissionsGrantFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionsGrantFragment.kt\ncom/harman/jbl/partybox/ui/permissions/PermissionsGrantFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,68:1\n66#2,4:69\n*S KotlinDebug\n*F\n+ 1 PermissionsGrantFragment.kt\ncom/harman/jbl/partybox/ui/permissions/PermissionsGrantFragment\n*L\n20#1:69,4\n*E\n"})
/* loaded from: classes2.dex */
public final class PermissionsGrantFragment extends Fragment {

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private static final String f45470S0 = "from";

    @l3.d
    public static final String TAG = "PermissionsGrantFragment";

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f45471N0;

    /* renamed from: O0, reason: collision with root package name */
    private int f45472O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final A f45473P0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final A f45474Q0;

    /* renamed from: R0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f45469R0 = {N.u(new PropertyReference1Impl(PermissionsGrantFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentPermissionsGrantBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final PermissionsGrantFragment a(int i4) {
            PermissionsGrantFragment permissionsGrantFragment = new PermissionsGrantFragment();
            permissionsGrantFragment.setArguments(C0741d.b(C2122h0.a("from", Integer.valueOf(i4))));
            return permissionsGrantFragment;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, V0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f45475N = new b();

        b() {
            super(1, V0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentPermissionsGrantBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final V0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return V0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.a<PermissionAndAccessFragment> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f45476F = new c();

        c() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final PermissionAndAccessFragment n() {
            return new PermissionAndAccessFragment();
        }
    }

    public PermissionsGrantFragment() {
        super(j.i.f41403J0);
        A a4;
        this.f45471N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f45475N);
        this.f45473P0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        a4 = C.a(c.f45476F);
        this.f45474Q0 = a4;
    }

    private final V0 l0() {
        return (V0) this.f45471N0.a(this, f45469R0[0]);
    }

    private final com.harman.jbl.partybox.ui.main.o m0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f45473P0.getValue();
    }

    private final PermissionAndAccessFragment n0() {
        return (PermissionAndAccessFragment) this.f45474Q0.getValue();
    }

    @W2.n
    @l3.d
    public static final PermissionsGrantFragment newInstance(int i4) {
        return Companion.a(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(PermissionsGrantFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.p0(this$0.n0());
    }

    private final void p0(DialogFragment dialogFragment) {
        if (!dialogFragment.isAdded()) {
            Dialog dialog = dialogFragment.getDialog();
            if (dialog == null || !dialog.isShowing()) {
                String simpleName = dialogFragment.getClass().getSimpleName();
                T1.a.a("DialogFragment safeShow:" + simpleName);
                dialogFragment.show(getChildFragmentManager(), simpleName);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m0().T2(true);
        if (!m0().G()) {
            p0(n0());
        } else if (m0().G()) {
            I a4 = q.a();
            F.o(a4, "actionPermissionsGrantFr…tToDiscoveryFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this, a4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("from")) {
            Object obj = arguments.get("from");
            F.n(obj, "null cannot be cast to non-null type kotlin.Int");
            this.f45472O0 = ((Integer) obj).intValue();
        }
        l0().f39148F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.permissions.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PermissionsGrantFragment.o0(PermissionsGrantFragment.this, view2);
            }
        });
    }
}
