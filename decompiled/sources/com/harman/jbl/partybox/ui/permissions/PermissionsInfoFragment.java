package com.harman.jbl.partybox.ui.permissions;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.core.os.C0741d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Q;
import androidx.navigation.I;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.W0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.PermissionUiType;
import kotlin.A;
import kotlin.C2122h0;
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

@E(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/harman/jbl/partybox/ui/permissions/PermissionsInfoFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/harman/jbl/partybox/ui/main/PermissionUiType;", "type", "Lkotlin/H0;", "o0", "(Lcom/harman/jbl/partybox/ui/main/PermissionUiType;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "()V", "Lcom/harman/jbl/partybox/databinding/W0;", "N0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "l0", "()Lcom/harman/jbl/partybox/databinding/W0;", "binding", "O0", "Lcom/harman/jbl/partybox/ui/main/PermissionUiType;", "Lcom/harman/jbl/partybox/ui/main/o;", "P0", "Lkotlin/A;", "m0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPermissionsInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionsInfoFragment.kt\ncom/harman/jbl/partybox/ui/permissions/PermissionsInfoFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,86:1\n66#2,4:87\n*S KotlinDebug\n*F\n+ 1 PermissionsInfoFragment.kt\ncom/harman/jbl/partybox/ui/permissions/PermissionsInfoFragment\n*L\n23#1:87,4\n*E\n"})
/* loaded from: classes2.dex */
public final class PermissionsInfoFragment extends Fragment {

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private static final String f45478R0 = "args";

    @l3.d
    public static final String TAG = "PermissionsInfoFragment";

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f45479N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private PermissionUiType f45480O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final A f45481P0;

    /* renamed from: Q0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f45477Q0 = {N.u(new PropertyReference1Impl(PermissionsInfoFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentPermissionsInfoBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final PermissionsInfoFragment a(@l3.d PermissionUiType type) {
            F.p(type, "type");
            PermissionsInfoFragment permissionsInfoFragment = new PermissionsInfoFragment();
            permissionsInfoFragment.setArguments(C0741d.b(C2122h0.a(PermissionsInfoFragment.f45478R0, type)));
            return permissionsInfoFragment;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45482a;

        static {
            int[] iArr = new int[PermissionUiType.values().length];
            try {
                iArr[PermissionUiType.LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionUiType.BLUETOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45482a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class c extends FunctionReferenceImpl implements X2.l<View, W0> {

        /* renamed from: N, reason: collision with root package name */
        public static final c f45483N = new c();

        c() {
            super(1, W0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentPermissionsInfoBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final W0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return W0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.l<UiPage, H0> {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f45485a;

            static {
                int[] iArr = new int[UiPage.values().length];
                try {
                    iArr[UiPage.DISCOVERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f45485a = iArr;
            }
        }

        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(UiPage uiPage) {
            c(uiPage);
            return H0.f51801a;
        }

        public final void c(UiPage uiPage) {
            if (uiPage != null) {
                PermissionsInfoFragment permissionsInfoFragment = PermissionsInfoFragment.this;
                T1.a.a("BLE_LOG PermissionsInfoFragment updateUiPage and page is : " + uiPage);
                if (a.f45485a[uiPage.ordinal()] == 1) {
                    I a4 = s.a();
                    F.o(a4, "actionPermissionsInfoFra…tToDiscoveryFragment(...)");
                    com.harman.jbl.partybox.utils.q.f(permissionsInfoFragment, a4);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class e implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f45486a;

        e(X2.l function) {
            F.p(function, "function");
            this.f45486a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45486a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45486a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public PermissionsInfoFragment() {
        super(j.i.f41407K0);
        this.f45479N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, c.f45483N);
        this.f45480O0 = PermissionUiType.LOCATION;
        this.f45481P0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    private final W0 l0() {
        return (W0) this.f45479N0.a(this, f45477Q0[0]);
    }

    private final com.harman.jbl.partybox.ui.main.o m0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f45481P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(PermissionsInfoFragment this$0, View view) {
        FragmentManager S3;
        F.p(this$0, "this$0");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("package:" + this$0.requireActivity().getPackageName()));
        this$0.startActivity(intent);
        ActivityC0889g activity = this$0.getActivity();
        if (activity != null && (S3 = activity.S()) != null) {
            S3.i1();
        }
    }

    @W2.n
    @l3.d
    public static final PermissionsInfoFragment newInstance(@l3.d PermissionUiType permissionUiType) {
        return Companion.a(permissionUiType);
    }

    private final void o0(PermissionUiType permissionUiType) {
        l0().f39172I.setText(j.m.H7);
        int i4 = b.f45482a[permissionUiType.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                l0().f39169F.setImageResource(j.f.t6);
                l0().f39170G.setText(j.m.u6);
                return;
            }
            return;
        }
        l0().f39169F.setImageResource(j.f.v6);
        l0().f39170G.setText(j.m.h8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m0().y0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey(f45478R0)) {
            Object obj = arguments.get(f45478R0);
            F.n(obj, "null cannot be cast to non-null type com.harman.jbl.partybox.ui.main.PermissionUiType");
            this.f45480O0 = (PermissionUiType) obj;
        }
        o0(this.f45480O0);
        l0().f39172I.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.permissions.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PermissionsInfoFragment.n0(PermissionsInfoFragment.this, view2);
            }
        });
        m0().G1().k(getViewLifecycleOwner(), new e(new d()));
    }
}
