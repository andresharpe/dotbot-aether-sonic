package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;
import k1.InterfaceFutureC2077a;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f12164a = "PackageManagerCompat";

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f12165b = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    @W(30)
    /* loaded from: classes.dex */
    private static class a {
        private a() {
        }

        static boolean a(@androidx.annotation.N Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface b {
    }

    private J() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean a(@androidx.annotation.N PackageManager packageManager) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i4 < 30) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (b(packageManager) != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z3 && (!z4 || !z5)) {
            return false;
        }
        return true;
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String b(@androidx.annotation.N PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(f12165b).setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @androidx.annotation.N
    public static InterfaceFutureC2077a<Integer> c(@androidx.annotation.N Context context) {
        androidx.concurrent.futures.d<Integer> v3 = androidx.concurrent.futures.d.v();
        if (!androidx.core.os.O.a(context)) {
            v3.q(0);
            Log.e(f12164a, "User is in locked direct boot mode");
            return v3;
        }
        if (!a(context.getPackageManager())) {
            v3.q(1);
            return v3;
        }
        int i4 = context.getApplicationInfo().targetSdkVersion;
        if (i4 < 30) {
            v3.q(0);
            Log.e(f12164a, "Target SDK version below API 30");
            return v3;
        }
        int i5 = Build.VERSION.SDK_INT;
        int i6 = 2;
        int i7 = 4;
        if (i5 >= 31) {
            if (a.a(context)) {
                if (i4 >= 31) {
                    i7 = 5;
                }
                v3.q(Integer.valueOf(i7));
            } else {
                v3.q(2);
            }
            return v3;
        }
        if (i5 == 30) {
            if (a.a(context)) {
                i6 = 4;
            }
            v3.q(Integer.valueOf(i6));
            return v3;
        }
        final P p4 = new P(context);
        v3.f(new Runnable() { // from class: androidx.core.content.I
            @Override // java.lang.Runnable
            public final void run() {
                P.this.b();
            }
        }, Executors.newSingleThreadExecutor());
        p4.a(v3);
        return v3;
    }
}
