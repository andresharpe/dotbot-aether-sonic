package com.google.android.gms.common;

import H0.a;
import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.C0;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C0;
import com.google.android.gms.common.api.internal.C1175c;
import com.google.android.gms.common.api.internal.C1193i;
import com.google.android.gms.common.api.internal.D0;
import com.google.android.gms.common.api.internal.InterfaceC1203m;
import com.google.android.gms.common.api.internal.J0;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.InterfaceC1266o;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1769j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.gms.common.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1236h extends C1237i {

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.N
    public static final String f28549i = "com.google.android.gms";

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.B("mLock")
    private String f28552g;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f28550j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private static final C1236h f28551k = new C1236h();

    /* renamed from: h, reason: collision with root package name */
    public static final int f28548h = C1237i.f28553a;

    @androidx.annotation.N
    public static final AbstractC1770k<Map<C1175c<?>, String>> M(@androidx.annotation.N com.google.android.gms.common.api.j<?> jVar, @androidx.annotation.N com.google.android.gms.common.api.j<?>... jVarArr) {
        C1285y.m(jVar, "Requested API must not be null.");
        for (com.google.android.gms.common.api.j<?> jVar2 : jVarArr) {
            C1285y.m(jVar2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(jVarArr.length + 1);
        arrayList.add(jVar);
        arrayList.addAll(Arrays.asList(jVarArr));
        return C1193i.y().B(arrayList);
    }

    @androidx.annotation.N
    public static C1236h x() {
        return f28551k;
    }

    public boolean A(@androidx.annotation.N Activity activity, int i4, int i5) {
        return B(activity, i4, i5, null);
    }

    public boolean B(@androidx.annotation.N Activity activity, int i4, int i5, @androidx.annotation.P DialogInterface.OnCancelListener onCancelListener) {
        Dialog t3 = t(activity, i4, i5, onCancelListener);
        if (t3 == null) {
            return false;
        }
        H(activity, t3, C1289j.f28836k, onCancelListener);
        return true;
    }

    public void C(@androidx.annotation.N Context context, int i4) {
        I(context, i4, null, g(context, i4, 0, "n"));
    }

    public void D(@androidx.annotation.N Context context, @androidx.annotation.N C1231c c1231c) {
        I(context, c1231c.c0(), null, w(context, c1231c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public final Dialog E(@androidx.annotation.N Context context, int i4, com.google.android.gms.common.internal.V v3, @androidx.annotation.P DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i4 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.Q.d(context, i4));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c4 = com.google.android.gms.common.internal.Q.c(context, i4);
        if (c4 != null) {
            builder.setPositiveButton(c4, v3);
        }
        String g4 = com.google.android.gms.common.internal.Q.g(context, i4);
        if (g4 != null) {
            builder.setTitle(g4);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i4)), new IllegalArgumentException());
        return builder.create();
    }

    @androidx.annotation.N
    public final Dialog F(@androidx.annotation.N Activity activity, @androidx.annotation.N DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.Q.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        H(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @androidx.annotation.P
    public final D0 G(Context context, C0 c02) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        D0 d02 = new D0(c02);
        context.registerReceiver(d02, intentFilter);
        d02.a(context);
        if (!n(context, "com.google.android.gms")) {
            c02.a();
            d02.b();
            return null;
        }
        return d02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(Activity activity, Dialog dialog, String str, @androidx.annotation.P DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC0889g) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((ActivityC0889g) activity).S(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC1232d.b(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    final void I(Context context, int i4, @androidx.annotation.P String str, @androidx.annotation.P PendingIntent pendingIntent) {
        int i5;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i4), null), new IllegalArgumentException());
        if (i4 == 18) {
            J(context);
            return;
        }
        if (pendingIntent == null) {
            if (i4 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String f4 = com.google.android.gms.common.internal.Q.f(context, i4);
        String e4 = com.google.android.gms.common.internal.Q.e(context, i4);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) C1285y.l(context.getSystemService("notification"));
        C0.g z02 = new C0.g(context).e0(true).D(true).P(f4).z0(new C0.e().A(e4));
        if (com.google.android.gms.common.util.l.k(context)) {
            C1285y.r(com.google.android.gms.common.util.v.i());
            z02.t0(context.getApplicationInfo().icon).k0(2);
            if (com.google.android.gms.common.util.l.l(context)) {
                z02.a(a.c.f848a, resources.getString(a.e.f892o), pendingIntent);
            } else {
                z02.N(pendingIntent);
            }
        } else {
            z02.t0(R.drawable.stat_sys_warning).B0(resources.getString(a.e.f885h)).H0(System.currentTimeMillis()).N(pendingIntent).O(e4);
        }
        if (com.google.android.gms.common.util.v.n()) {
            C1285y.r(com.google.android.gms.common.util.v.n());
            synchronized (f28550j) {
                str2 = this.f28552g;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String b4 = com.google.android.gms.common.internal.Q.b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(androidx.core.app.T.a("com.google.android.gms.availability", b4, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!b4.contentEquals(name)) {
                        notificationChannel.setName(b4);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            z02.H(str2);
        }
        Notification h4 = z02.h();
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            i5 = 39789;
        } else {
            C1290k.f28846g.set(false);
            i5 = 10436;
        }
        notificationManager.notify(i5, h4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(Context context) {
        new HandlerC1309w(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean K(@androidx.annotation.N Activity activity, @androidx.annotation.N InterfaceC1203m interfaceC1203m, int i4, int i5, @androidx.annotation.P DialogInterface.OnCancelListener onCancelListener) {
        Dialog E3 = E(activity, i4, com.google.android.gms.common.internal.V.d(interfaceC1203m, e(activity, i4, "d"), 2), onCancelListener);
        if (E3 == null) {
            return false;
        }
        H(activity, E3, C1289j.f28836k, onCancelListener);
        return true;
    }

    public final boolean L(@androidx.annotation.N Context context, @androidx.annotation.N C1231c c1231c, int i4) {
        PendingIntent w3;
        if (com.google.android.gms.common.wrappers.b.a(context) || (w3 = w(context, c1231c)) == null) {
            return false;
        }
        I(context, c1231c.c0(), null, com.google.android.gms.internal.base.l.a(context, 0, GoogleApiActivity.a(context, w3, i4, true), com.google.android.gms.internal.base.l.f29121a | 134217728));
        return true;
    }

    @Override // com.google.android.gms.common.C1237i
    @com.google.android.gms.common.internal.D
    @I0.a
    public int c(@androidx.annotation.N Context context) {
        return super.c(context);
    }

    @Override // com.google.android.gms.common.C1237i
    @androidx.annotation.P
    @com.google.android.gms.common.internal.D
    @I0.a
    public Intent e(@androidx.annotation.P Context context, int i4, @androidx.annotation.P String str) {
        return super.e(context, i4, str);
    }

    @Override // com.google.android.gms.common.C1237i
    @androidx.annotation.P
    public PendingIntent f(@androidx.annotation.N Context context, int i4, int i5) {
        return super.f(context, i4, i5);
    }

    @Override // com.google.android.gms.common.C1237i
    @androidx.annotation.N
    public final String h(int i4) {
        return super.h(i4);
    }

    @Override // com.google.android.gms.common.C1237i
    @InterfaceC1266o
    public int j(@androidx.annotation.N Context context) {
        return super.j(context);
    }

    @Override // com.google.android.gms.common.C1237i
    @com.google.android.gms.common.internal.D
    @I0.a
    public int k(@androidx.annotation.N Context context, int i4) {
        return super.k(context, i4);
    }

    @Override // com.google.android.gms.common.C1237i
    public final boolean o(int i4) {
        return super.o(i4);
    }

    @androidx.annotation.N
    public AbstractC1770k<Void> q(@androidx.annotation.N com.google.android.gms.common.api.h<?> hVar, @androidx.annotation.N com.google.android.gms.common.api.h<?>... hVarArr) {
        return M(hVar, hVarArr).w(new InterfaceC1769j() { // from class: com.google.android.gms.common.v
            @Override // com.google.android.gms.tasks.InterfaceC1769j
            public final AbstractC1770k a(Object obj) {
                int i4 = C1236h.f28548h;
                return C1773n.g(null);
            }
        });
    }

    @androidx.annotation.N
    public AbstractC1770k<Void> r(@androidx.annotation.N com.google.android.gms.common.api.j<?> jVar, @androidx.annotation.N com.google.android.gms.common.api.j<?>... jVarArr) {
        return M(jVar, jVarArr).w(new InterfaceC1769j() { // from class: com.google.android.gms.common.u
            @Override // com.google.android.gms.tasks.InterfaceC1769j
            public final AbstractC1770k a(Object obj) {
                int i4 = C1236h.f28548h;
                return C1773n.g(null);
            }
        });
    }

    @androidx.annotation.P
    public Dialog s(@androidx.annotation.N Activity activity, int i4, int i5) {
        return t(activity, i4, i5, null);
    }

    @androidx.annotation.P
    public Dialog t(@androidx.annotation.N Activity activity, int i4, int i5, @androidx.annotation.P DialogInterface.OnCancelListener onCancelListener) {
        return E(activity, i4, com.google.android.gms.common.internal.V.b(activity, e(activity, i4, "d"), i5), onCancelListener);
    }

    @androidx.annotation.P
    public Dialog u(@androidx.annotation.N Fragment fragment, int i4, int i5) {
        return v(fragment, i4, i5, null);
    }

    @androidx.annotation.P
    public Dialog v(@androidx.annotation.N Fragment fragment, int i4, int i5, @androidx.annotation.P DialogInterface.OnCancelListener onCancelListener) {
        return E(fragment.requireContext(), i4, com.google.android.gms.common.internal.V.c(fragment, e(fragment.requireContext(), i4, "d"), i5), onCancelListener);
    }

    @androidx.annotation.P
    public PendingIntent w(@androidx.annotation.N Context context, @androidx.annotation.N C1231c c1231c) {
        if (c1231c.u0()) {
            return c1231c.i0();
        }
        return f(context, c1231c.c0(), 0);
    }

    @androidx.annotation.N
    @androidx.annotation.K
    public AbstractC1770k<Void> y(@androidx.annotation.N Activity activity) {
        int i4 = f28548h;
        C1285y.g("makeGooglePlayServicesAvailable must be called from the main thread");
        int k4 = k(activity, i4);
        if (k4 == 0) {
            return C1773n.g(null);
        }
        J0 u3 = J0.u(activity);
        u3.t(new C1231c(k4, null), 0);
        return u3.v();
    }

    @TargetApi(26)
    public void z(@androidx.annotation.N Context context, @androidx.annotation.N String str) {
        NotificationChannel notificationChannel;
        if (com.google.android.gms.common.util.v.n()) {
            notificationChannel = ((NotificationManager) C1285y.l(context.getSystemService("notification"))).getNotificationChannel(str);
            C1285y.l(notificationChannel);
        }
        synchronized (f28550j) {
            this.f28552g = str;
        }
    }
}
