package com.harman.jbl.partybox.ui.permissions;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0669d;
import androidx.core.content.pm.C0684c;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Q;
import androidx.navigation.I;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.C1589s;
import com.google.android.gms.location.C1591t;
import com.google.android.gms.location.C1593u;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.InterfaceC1764e;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.U0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0004R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/harman/jbl/partybox/ui/permissions/PermissionFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlin/H0;", "s0", "()V", "", "enabled", "t0", "(Z)V", "v0", "Landroid/app/Activity;", "activity", "p0", "(Landroid/app/Activity;)V", "q0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Lcom/harman/jbl/partybox/databinding/U0;", "N0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "n0", "()Lcom/harman/jbl/partybox/databinding/U0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "O0", "Lkotlin/A;", "o0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPermissionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionFragment.kt\ncom/harman/jbl/partybox/ui/permissions/PermissionFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,195:1\n66#2,4:196\n*S KotlinDebug\n*F\n+ 1 PermissionFragment.kt\ncom/harman/jbl/partybox/ui/permissions/PermissionFragment\n*L\n31#1:196,4\n*E\n"})
/* loaded from: classes2.dex */
public final class PermissionFragment extends Fragment {

    @l3.d
    public static final String TAG = "PermissionsFragment";

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f45461N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final A f45462O0;

    /* renamed from: P0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f45460P0 = {N.u(new PropertyReference1Impl(PermissionFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentPermissionsBinding;", 0))};

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
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, U0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f45463N = new b();

        b() {
            super(1, U0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentPermissionsBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final U0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return U0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.l<UiPage, H0> {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f45465a;

            static {
                int[] iArr = new int[UiPage.values().length];
                try {
                    iArr[UiPage.DISCOVERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UiPage.PERMISSION_INFO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f45465a = iArr;
            }
        }

        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(UiPage uiPage) {
            c(uiPage);
            return H0.f51801a;
        }

        public final void c(UiPage uiPage) {
            if (uiPage != null) {
                PermissionFragment permissionFragment = PermissionFragment.this;
                T1.a.a("BLE_LOG PermissionsFragment updateUiPage and page is : " + uiPage);
                int i4 = a.f45465a[uiPage.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        I b4 = l.b();
                        F.o(b4, "actionPermissionFragmentToPermissionInfo(...)");
                        com.harman.jbl.partybox.utils.q.f(permissionFragment, b4);
                        return;
                    }
                    return;
                }
                I a4 = l.a();
                F.o(a4, "actionPermissionFragmentToDiscoveryFragment(...)");
                com.harman.jbl.partybox.utils.q.f(permissionFragment, a4);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.l<Boolean, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            PermissionFragment permissionFragment = PermissionFragment.this;
            F.m(bool);
            permissionFragment.t0(bool.booleanValue());
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements X2.l<Boolean, H0> {
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
            PermissionFragment permissionFragment = PermissionFragment.this;
            if (permissionFragment.o0().J() && PermissionFragment.this.o0().K()) {
                z3 = true;
            } else {
                z3 = false;
            }
            permissionFragment.v0(z3);
        }
    }

    /* loaded from: classes2.dex */
    static final class f implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f45468a;

        f(X2.l function) {
            F.p(function, "function");
            this.f45468a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45468a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45468a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public PermissionFragment() {
        super(j.i.f41399I0);
        this.f45461N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f45463N);
        this.f45462O0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    private final U0 n0() {
        return (U0) this.f45461N0.a(this, f45460P0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o o0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f45462O0.getValue();
    }

    private final void p0(Activity activity) {
        long j4 = 0;
        try {
            j4 = C0684c.c(activity.getPackageManager().getPackageInfo("com.google.android.gms", 0));
            T1.a.a("PermissionsFragment Version from package info is " + j4);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        T1.a.a("PermissionsFragment google play service version is " + j4);
        if (j4 >= 300000000) {
            q0(activity);
        } else {
            activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
    }

    private final void q0(final Activity activity) {
        T1.a.a("PermissionsFragment showEnableLocationDialog");
        LocationRequest c02 = LocationRequest.c0();
        c02.f1(30000L);
        c02.a1(15000L);
        c02.j1(102);
        F.o(c02, "also(...)");
        C1591t.a e4 = new C1591t.a().b(c02).e(true);
        F.o(e4, "setNeedBle(...)");
        AbstractC1770k<C1593u> A3 = C1589s.e(activity).A(e4.c());
        F.o(A3, "checkLocationSettings(...)");
        A3.e(new InterfaceC1764e() { // from class: com.harman.jbl.partybox.ui.permissions.k
            @Override // com.google.android.gms.tasks.InterfaceC1764e
            public final void a(AbstractC1770k abstractC1770k) {
                PermissionFragment.r0(activity, abstractC1770k);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(Activity activity, AbstractC1770k it) {
        F.p(activity, "$activity");
        F.p(it, "it");
        try {
            it.s(ApiException.class);
            T1.a.a("PermissionsFragment task1.getResult ApiException");
        } catch (ApiException e4) {
            T1.a.a("PermissionsFragment e.statusCode = " + e4.b());
            int b4 = e4.b();
            if (b4 != 6 && b4 != 16) {
                if (b4 == 17) {
                    activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                }
                return;
            }
            try {
                F.n(e4, "null cannot be cast to non-null type com.google.android.gms.common.api.ResolvableApiException");
                ((ResolvableApiException) e4).e(activity, 2);
                T1.a.a("PermissionsFragment resolvableApiException.startResolutionForResult");
            } catch (Exception e5) {
                T1.a.a("PermissionsFragment showEnableLocationDialog " + e5);
            }
        }
    }

    private final void s0() {
        if (Build.VERSION.SDK_INT >= 31) {
            U0 n02 = n0();
            n02.f39116J.setImageResource(j.f.f41110u1);
            n02.f39118L.setText(j.m.p6);
            n02.f39119M.setText(j.m.q6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(boolean z3) {
        TextView textView = n0().f39114H;
        if (z3) {
            textView.setText(getString(j.m.S9));
            textView.setTextColor(C0669d.f(requireContext(), j.d.f40752g1));
        } else {
            textView.setTextColor(C0669d.f(requireContext(), j.d.f40762k));
            textView.setText(getString(j.m.Q9));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.permissions.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PermissionFragment.u0(PermissionFragment.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(PermissionFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(boolean z3) {
        TextView textView = n0().f39117K;
        if (z3) {
            textView.setText(getString(j.m.g6));
            textView.setTextColor(C0669d.f(requireContext(), j.d.f40752g1));
        } else {
            textView.setText(getString(j.m.f6));
            textView.setTextColor(C0669d.f(requireContext(), j.d.f40762k));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.permissions.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PermissionFragment.w0(PermissionFragment.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(PermissionFragment this$0, View view) {
        F.p(this$0, "this$0");
        if (this$0.o0().J()) {
            this$0.o0().L2();
            return;
        }
        ActivityC0889g requireActivity = this$0.requireActivity();
        F.o(requireActivity, "requireActivity(...)");
        this$0.p0(requireActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        boolean z3 = true;
        o0().T2(true);
        o0().y0();
        t0(o0().I());
        if (!o0().J() || !o0().K()) {
            z3 = false;
        }
        v0(z3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        s0();
        if (o0().J() && o0().K() && o0().I()) {
            I a4 = l.a();
            F.o(a4, "actionPermissionFragmentToDiscoveryFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this, a4);
        }
        o0().G1().k(getViewLifecycleOwner(), new f(new c()));
        o0().t1().k(getViewLifecycleOwner(), new f(new d()));
        o0().u1().k(getViewLifecycleOwner(), new f(new e()));
    }
}
