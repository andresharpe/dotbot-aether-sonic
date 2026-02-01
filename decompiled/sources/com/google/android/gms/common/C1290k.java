package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.C1282w0;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.InterfaceC1266o;
import com.google.android.gms.common.r;
import com.google.android.gms.common.util.C1304e;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

@com.google.android.gms.common.internal.D
@I0.a
/* renamed from: com.google.android.gms.common.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1290k {

    /* renamed from: a, reason: collision with root package name */
    @I0.a
    @Deprecated
    public static final int f28840a = 12451000;

    /* renamed from: b, reason: collision with root package name */
    @I0.a
    @androidx.annotation.N
    @Deprecated
    public static final String f28841b = "com.google.android.gms";

    /* renamed from: c, reason: collision with root package name */
    @I0.a
    @androidx.annotation.N
    public static final String f28842c = "com.google.android.play.games";

    /* renamed from: d, reason: collision with root package name */
    @I0.a
    @androidx.annotation.N
    public static final String f28843d = "com.android.vending";

    /* renamed from: e, reason: collision with root package name */
    @I0.a
    static final int f28844e = 39789;

    /* renamed from: f, reason: collision with root package name */
    @I0.a
    static final int f28845f = 10436;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f28847h = false;

    /* renamed from: i, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    static boolean f28848i = false;

    /* renamed from: g, reason: collision with root package name */
    @I0.a
    @com.google.android.gms.common.util.D
    static final AtomicBoolean f28846g = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicBoolean f28849j = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    @I0.a
    public C1290k() {
    }

    @I0.a
    @Deprecated
    public static void a(@androidx.annotation.N Context context) {
        if (f28846g.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(f28845f);
            }
        } catch (SecurityException unused) {
        }
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    public static void b() {
        f28849j.set(true);
    }

    @I0.a
    @Deprecated
    public static void c(@androidx.annotation.N Context context, int i4) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int k4 = C1237i.i().k(context, i4);
        if (k4 != 0) {
            Intent e4 = C1237i.i().e(context, k4, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + k4);
            if (e4 == null) {
                throw new GooglePlayServicesNotAvailableException(k4);
            }
            throw new GooglePlayServicesRepairableException(k4, "Google Play Services not available", e4);
        }
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    @Deprecated
    public static int d(@androidx.annotation.N Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    @Deprecated
    public static int e(@androidx.annotation.N Context context) {
        C1285y.r(true);
        return C1304e.a(context, context.getPackageName());
    }

    @androidx.annotation.P
    @I0.a
    @Deprecated
    public static PendingIntent f(int i4, @androidx.annotation.N Context context, int i5) {
        return C1237i.i().f(context, i4, i5);
    }

    @androidx.annotation.N
    @Deprecated
    @I0.a
    @com.google.android.gms.common.util.D
    public static String g(int i4) {
        return C1231c.z0(i4);
    }

    @androidx.annotation.P
    @com.google.android.gms.common.internal.D
    @Deprecated
    @I0.a
    public static Intent h(int i4) {
        return C1237i.i().e(null, i4, null);
    }

    @androidx.annotation.P
    @I0.a
    public static Context i(@androidx.annotation.N Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @androidx.annotation.P
    @I0.a
    public static Resources j(@androidx.annotation.N Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    public static boolean k(@androidx.annotation.N Context context) {
        try {
            if (!f28848i) {
                try {
                    PackageInfo f4 = com.google.android.gms.common.wrappers.e.a(context).f("com.google.android.gms", 64);
                    C1291l.a(context);
                    if (f4 != null && !C1291l.f(f4, false) && C1291l.f(f4, true)) {
                        f28847h = true;
                    } else {
                        f28847h = false;
                    }
                    f28848i = true;
                } catch (PackageManager.NameNotFoundException e4) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e4);
                    f28848i = true;
                }
            }
            if (!f28847h && com.google.android.gms.common.util.l.j()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            f28848i = true;
            throw th;
        }
    }

    @I0.a
    @InterfaceC1266o
    @Deprecated
    public static int l(@androidx.annotation.N Context context) {
        return m(context, f28840a);
    }

    @I0.a
    @Deprecated
    public static int m(@androidx.annotation.N Context context, int i4) {
        boolean z3;
        boolean z4;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(r.b.f28867a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f28849j.get()) {
            int a4 = C1282w0.a(context);
            if (a4 != 0) {
                if (a4 != f28840a) {
                    throw new GooglePlayServicesIncorrectManifestValueException(a4);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        if (!com.google.android.gms.common.util.l.l(context) && !com.google.android.gms.common.util.l.n(context)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i4 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        C1285y.a(z4);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z3) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C1291l.a(context);
            if (!C1291l.f(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (z3) {
                    C1285y.l(packageInfo);
                    if (!C1291l.f(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (z3 && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else {
                    if (com.google.android.gms.common.util.F.a(packageInfo2.versionCode) < com.google.android.gms.common.util.F.a(i4)) {
                        Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i4 + " but found " + packageInfo2.versionCode);
                        return 2;
                    }
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e4) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e4);
                            return 1;
                        }
                    }
                    if (applicationInfo.enabled) {
                        return 0;
                    }
                    return 3;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @I0.a
    @Deprecated
    public static boolean n(@androidx.annotation.N Context context, int i4) {
        return com.google.android.gms.common.util.C.a(context, i4);
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    @Deprecated
    public static boolean o(@androidx.annotation.N Context context, int i4) {
        if (i4 == 18) {
            return true;
        }
        if (i4 == 1) {
            return u(context, "com.google.android.gms");
        }
        return false;
    }

    @com.google.android.gms.common.internal.D
    @I0.a
    @Deprecated
    public static boolean p(@androidx.annotation.N Context context, int i4) {
        if (i4 == 9) {
            return u(context, "com.android.vending");
        }
        return false;
    }

    @I0.a
    @TargetApi(18)
    public static boolean q(@androidx.annotation.N Context context) {
        if (com.google.android.gms.common.util.v.g()) {
            Object systemService = context.getSystemService("user");
            C1285y.l(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && L1.a.f1650s3.equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @com.google.android.gms.common.internal.D
    @Deprecated
    @I0.a
    @com.google.android.gms.common.util.D
    public static boolean r(@androidx.annotation.N Context context) {
        return com.google.android.gms.common.util.l.f(context);
    }

    @I0.a
    @Deprecated
    public static boolean s(int i4) {
        return i4 == 1 || i4 == 2 || i4 == 3 || i4 == 9;
    }

    @I0.a
    @TargetApi(19)
    @Deprecated
    public static boolean t(@androidx.annotation.N Context context, int i4, @androidx.annotation.N String str) {
        return com.google.android.gms.common.util.C.b(context, i4, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    public static boolean u(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (com.google.android.gms.common.util.v.j()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        if (applicationInfo.enabled && !q(context)) {
            return true;
        }
        return false;
    }
}
