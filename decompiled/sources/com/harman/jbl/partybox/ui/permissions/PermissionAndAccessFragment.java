package com.harman.jbl.partybox.ui.permissions;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0669d;
import androidx.core.content.pm.C0684c;
import androidx.core.os.C0741d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.C1589s;
import com.google.android.gms.location.C1591t;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.InterfaceC1764e;
import com.google.firebase.messaging.C1821f;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.T0;
import com.harman.jbl.partybox.j;
import java.util.ArrayList;
import kotlin.A;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001NB\u0007¢\u0006\u0004\bL\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u0005J-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010\u0005J!\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b*\u0010+J)\u00101\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J-\u00108\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,2\f\u00105\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006O"}, d2 = {"Lcom/harman/jbl/partybox/ui/permissions/PermissionAndAccessFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/View$OnClickListener;", "Lkotlin/H0;", "z0", "()V", "I0", "G0", "F0", "H0", "v0", "", "isLocationGranted", "L0", "(Z)V", "Landroid/app/Activity;", "activity", "E0", "(Landroid/app/Activity;)V", "J0", "D0", "y0", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "v", "onClick", "(Landroid/view/View;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", C1821f.C0339f.a.f37006R, "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/harman/jbl/partybox/databinding/T0;", "k1", "Lcom/harman/jbl/partybox/databinding/T0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "l1", "Lkotlin/A;", "x0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/a;", "m1", "w0", "()Lcom/harman/jbl/partybox/a;", "appViewModel", "n1", "I", "isFromHomePage", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPermissionAndAccessFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionAndAccessFragment.kt\ncom/harman/jbl/partybox/ui/permissions/PermissionAndAccessFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,443:1\n66#2,4:444\n66#2,4:448\n1#3:452\n37#4,2:453\n37#4,2:455\n37#4,2:457\n37#4,2:459\n37#4,2:461\n*S KotlinDebug\n*F\n+ 1 PermissionAndAccessFragment.kt\ncom/harman/jbl/partybox/ui/permissions/PermissionAndAccessFragment\n*L\n50#1:444,4\n51#1:448,4\n245#1:453,2\n264#1:455,2\n274#1:457,2\n381#1:459,2\n385#1:461,2\n*E\n"})
/* loaded from: classes2.dex */
public final class PermissionAndAccessFragment extends DialogFragment implements View.OnClickListener {

    @l3.d
    public static final a Companion = new a(null);
    public static final int REQUEST_LOCATION_CODE = 10002;
    public static final int REQUEST_NEARBY_DEVICE = 10001;

    @l3.d
    public static final String TAG = "PermissionAndAccessDialogFragment";

    /* renamed from: o1, reason: collision with root package name */
    @l3.d
    private static final String f45455o1 = "from";

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private T0 f45456k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.d
    private final A f45457l1 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    private final A f45458m1 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.a.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));

    /* renamed from: n1, reason: collision with root package name */
    private int f45459n1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final PermissionAndAccessFragment a(int i4) {
            PermissionAndAccessFragment permissionAndAccessFragment = new PermissionAndAccessFragment();
            permissionAndAccessFragment.setArguments(C0741d.b(C2122h0.a("from", Integer.valueOf(i4))));
            return permissionAndAccessFragment;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(PermissionAndAccessFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(PermissionAndAccessFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(PermissionAndAccessFragment this$0, View view) {
        F.p(this$0, "this$0");
        ActivityC0889g requireActivity = this$0.requireActivity();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("package:" + requireActivity.getPackageName()));
        requireActivity.startActivity(intent);
    }

    private final void D0() {
        ActivityC0889g requireActivity = requireActivity();
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        if (intent.resolveActivity(requireActivity.getPackageManager()) != null) {
            requireActivity.startActivity(intent);
        }
    }

    private final void E0(Activity activity) {
        long j4 = 0;
        try {
            j4 = C0684c.c(activity.getPackageManager().getPackageInfo("com.google.android.gms", 0));
            T1.a.a("PermissionAndAccessDialogFragment Version from package info is " + j4);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        T1.a.a("PermissionAndAccessDialogFragment google play service version is " + j4);
        if (j4 >= 300000000) {
            J0(activity);
        } else {
            activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
    }

    private final void F0() {
        int i4;
        com.harman.jbl.partybox.a w02 = w0();
        Context requireContext = requireContext();
        F.o(requireContext, "requireContext(...)");
        boolean B3 = w02.B(requireContext);
        T0 t02 = this.f45456k1;
        if (t02 != null) {
            int i5 = 0;
            t02.f39075T.setVisibility(0);
            t02.f39076U.setOnClickListener(this);
            TextView textView = t02.f39084c0;
            if (B3) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            textView.setVisibility(i4);
            ImageView imageView = t02.f39069N;
            if (!B3) {
                i5 = 8;
            }
            imageView.setVisibility(i5);
        }
    }

    private final void G0() {
        int i4;
        int i5;
        com.harman.jbl.partybox.a w02 = w0();
        Context requireContext = requireContext();
        F.o(requireContext, "requireContext(...)");
        boolean C3 = w02.C(requireContext);
        boolean g4 = com.harman.jbl.partybox.persistence.a.g("did_user_deny_location_access_forever");
        if (Build.VERSION.SDK_INT >= 31) {
            com.harman.jbl.partybox.a w03 = w0();
            Context requireContext2 = requireContext();
            F.o(requireContext2, "requireContext(...)");
            C3 = w03.A(requireContext2);
            g4 = com.harman.jbl.partybox.persistence.a.g(com.harman.jbl.partybox.persistence.a.f42076l);
        }
        T0 t02 = this.f45456k1;
        if (t02 != null) {
            TextView textView = t02.f39081Z;
            int i6 = 8;
            if (C3) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            textView.setVisibility(i4);
            if (g4) {
                i5 = j.m.f41646G0;
            } else {
                i5 = j.m.Q9;
            }
            textView.setText(getString(i5));
            LinearLayout linearLayout = t02.f39077V;
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(this);
            ImageView imageView = t02.f39071P;
            if (C3) {
                i6 = 0;
            }
            imageView.setVisibility(i6);
        }
    }

    private final void H0() {
        int i4;
        int i5;
        boolean I3 = x0().I();
        boolean g4 = com.harman.jbl.partybox.persistence.a.g(com.harman.jbl.partybox.persistence.a.f42076l);
        T0 t02 = this.f45456k1;
        if (t02 != null) {
            LinearLayout linearLayout = t02.f39073R;
            int i6 = 0;
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(this);
            TextView textView = t02.f39080Y;
            if (I3) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            textView.setVisibility(i4);
            if (g4) {
                i5 = j.m.f41646G0;
            } else {
                i5 = j.m.Q9;
            }
            textView.setText(getString(i5));
            ImageView imageView = t02.f39066K;
            if (!I3) {
                i6 = 8;
            }
            imageView.setVisibility(i6);
        }
    }

    private final void I0() {
        if (Build.VERSION.SDK_INT >= 31) {
            H0();
            G0();
        } else {
            H0();
            G0();
            F0();
        }
    }

    private final void J0(final Activity activity) {
        com.harman.log.f.a(TAG, "showEnableLocationDialog");
        LocationRequest c02 = LocationRequest.c0();
        c02.f1(30000L);
        c02.a1(15000L);
        c02.j1(102);
        F.o(c02, "also(...)");
        C1591t.a b4 = new C1591t.a().b(c02);
        F.o(b4, "addLocationRequest(...)");
        C1589s.e(activity).A(b4.c()).e(new InterfaceC1764e() { // from class: com.harman.jbl.partybox.ui.permissions.a
            @Override // com.google.android.gms.tasks.InterfaceC1764e
            public final void a(AbstractC1770k abstractC1770k) {
                PermissionAndAccessFragment.K0(activity, this, abstractC1770k);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(Activity activity, PermissionAndAccessFragment this$0, AbstractC1770k task1) {
        F.p(activity, "$activity");
        F.p(this$0, "this$0");
        F.p(task1, "task1");
        try {
            task1.s(ApiException.class);
            com.harman.log.f.a(TAG, "task1.getResult ApiException");
        } catch (ApiException e4) {
            com.harman.log.f.a(TAG, "e.statusCode = " + e4.b());
            int b4 = e4.b();
            if (b4 != 6) {
                if (b4 != 17) {
                    if (b4 == 8502) {
                        this$0.D0();
                        return;
                    }
                    return;
                }
                this$0.D0();
                return;
            }
            try {
                F.n(e4, "null cannot be cast to non-null type com.google.android.gms.common.api.ResolvableApiException");
                ((ResolvableApiException) e4).e(activity, 10002);
                com.harman.log.f.a(TAG, "resolvableApiException.startResolutionForResult");
            } catch (Exception e5) {
                com.harman.log.f.c(TAG, "showEnableLocationDialog", e5);
                this$0.D0();
            }
        }
    }

    private final void L0(boolean z3) {
        int i4;
        T0 t02 = this.f45456k1;
        if (t02 != null) {
            t02.f39078W.setVisibility(8);
            t02.f39074S.setVisibility(0);
            t02.f39083b0.setText(getString(j.m.f41654I0));
            t02.f39062G.setText(getString(j.m.f41658J0));
            ImageView imageView = t02.f39067L;
            if (z3) {
                i4 = j.f.f41111u2;
            } else {
                i4 = j.f.f41115v2;
            }
            imageView.setImageResource(i4);
            t02.f39072Q.setVisibility(8);
        }
    }

    @W2.n
    @l3.d
    public static final PermissionAndAccessFragment newInstance(int i4) {
        return Companion.a(i4);
    }

    private final void v0() {
        dismiss();
    }

    private final com.harman.jbl.partybox.a w0() {
        return (com.harman.jbl.partybox.a) this.f45458m1.getValue();
    }

    private final com.harman.jbl.partybox.ui.main.o x0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f45457l1.getValue();
    }

    private final void y0(Activity activity) {
        com.harman.jbl.partybox.a w02 = w0();
        Context applicationContext = activity.getApplicationContext();
        F.o(applicationContext, "getApplicationContext(...)");
        if (!w02.y(applicationContext)) {
            if (!w0().x(activity) && com.harman.jbl.partybox.persistence.a.g("did_user_deny_location_access_forever")) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setFlags(268435456);
                intent.setData(Uri.parse("package:" + requireActivity().getPackageName()));
                requireActivity().startActivity(intent);
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 31) {
                arrayList.add("android.permission.BLUETOOTH_SCAN");
                arrayList.add("android.permission.BLUETOOTH_CONNECT");
                activity.requestPermissions((String[]) arrayList.toArray(new String[0]), 10001);
            } else {
                arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                activity.requestPermissions((String[]) arrayList.toArray(new String[0]), 10002);
            }
        }
    }

    private final void z0() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i4, int i5, @l3.e Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 10002 && i5 == -1) {
            ActivityC0889g requireActivity = requireActivity();
            F.o(requireActivity, "requireActivity(...)");
            y0(requireActivity);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@l3.e View view) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        T0 t02 = this.f45456k1;
        LinearLayout linearLayout3 = null;
        if (t02 != null) {
            linearLayout = t02.f39073R;
        } else {
            linearLayout = null;
        }
        if (F.g(view, linearLayout)) {
            if (com.harman.jbl.partybox.utils.g.c(300L)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                com.harman.jbl.partybox.a w02 = w0();
                Context requireContext = requireContext();
                F.o(requireContext, "requireContext(...)");
                if (w02.A(requireContext) && !w0().z()) {
                    startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
                    return;
                }
                if (com.harman.jbl.partybox.persistence.a.g(com.harman.jbl.partybox.persistence.a.f42076l)) {
                    L0(false);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add("android.permission.BLUETOOTH_SCAN");
                arrayList.add("android.permission.BLUETOOTH_CONNECT");
                requireActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 10001);
                return;
            }
            startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
            return;
        }
        T0 t03 = this.f45456k1;
        if (t03 != null) {
            linearLayout2 = t03.f39077V;
        } else {
            linearLayout2 = null;
        }
        if (F.g(view, linearLayout2)) {
            if (com.harman.jbl.partybox.utils.g.c(300L)) {
                return;
            }
            com.harman.log.f.a(TAG, "layoutGrantNearby click called");
            if (Build.VERSION.SDK_INT >= 31) {
                if (com.harman.jbl.partybox.persistence.a.g(com.harman.jbl.partybox.persistence.a.f42076l)) {
                    L0(false);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("android.permission.BLUETOOTH_SCAN");
                arrayList2.add("android.permission.BLUETOOTH_CONNECT");
                requireActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 10001);
                return;
            }
            if (com.harman.jbl.partybox.persistence.a.g("did_user_deny_location_access_forever")) {
                L0(true);
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add("android.permission.ACCESS_COARSE_LOCATION");
            arrayList3.add("android.permission.ACCESS_FINE_LOCATION");
            requireActivity().requestPermissions((String[]) arrayList3.toArray(new String[0]), 10002);
            return;
        }
        T0 t04 = this.f45456k1;
        if (t04 != null) {
            linearLayout3 = t04.f39076U;
        }
        if (!F.g(view, linearLayout3) || com.harman.jbl.partybox.utils.g.c(300L)) {
            return;
        }
        com.harman.log.f.a(TAG, "layoutGpsTurnOn click called");
        ActivityC0889g requireActivity = requireActivity();
        F.o(requireActivity, "requireActivity(...)");
        J0(requireActivity);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, j.n.f41884f);
    }

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@l3.e Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        F.o(onCreateDialog, "onCreateDialog(...)");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            int f4 = C0669d.f(activity, j.d.f40732a);
            Window window = onCreateDialog.getWindow();
            if (window != null) {
                window.setNavigationBarColor(f4);
            }
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        T0 c4 = T0.c(inflater);
        this.f45456k1 = c4;
        if (c4 != null) {
            c4.f39063H.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.permissions.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PermissionAndAccessFragment.A0(PermissionAndAccessFragment.this, view);
                }
            });
            c4.f39082a0.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.permissions.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PermissionAndAccessFragment.B0(PermissionAndAccessFragment.this, view);
                }
            });
            c4.f39079X.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.permissions.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PermissionAndAccessFragment.C0(PermissionAndAccessFragment.this, view);
                }
            });
        }
        z0();
        T0 t02 = this.f45456k1;
        if (t02 != null) {
            return t02.d();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i4, @l3.d String[] permissions, @l3.d int[] grantResults) {
        F.p(permissions, "permissions");
        F.p(grantResults, "grantResults");
        com.harman.log.f.a(TAG, "onRequestPermissionsResult requestCode= " + i4 + " permissions =" + permissions + " grantResults= " + grantResults);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            if (w0().w(context)) {
                v0();
            } else {
                I0();
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        Object obj;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("from")) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                obj = arguments2.get("from");
            } else {
                obj = null;
            }
            F.n(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            this.f45459n1 = intValue;
            com.harman.log.f.a(TAG, "BLE_LOG shouldShowSwitchSpeaker is " + intValue);
        }
    }
}
