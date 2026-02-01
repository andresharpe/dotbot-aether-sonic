package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.C1773n;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36499a = "firebase_messaging_notification_delegation_enabled";

    private Q() {
    }

    private static boolean b(Context context) {
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public static void c(Context context) {
        if (S.b(context)) {
            return;
        }
        f(new androidx.profileinstaller.g(), context, g(context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Context context) {
        String notificationDelegate;
        if (!com.google.android.gms.common.util.v.p()) {
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "Platform doesn't support proxying.");
            }
            return false;
        }
        if (b(context)) {
            notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
            if (!"com.google.android.gms".equals(notificationDelegate)) {
                return false;
            }
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "GMS core is set for proxying");
                return true;
            }
            return true;
        }
        Log.e(C1821f.f36920a, "error retrieving notification delegate for package " + context.getPackageName());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Context context, boolean z3, C1771l c1771l) {
        String notificationDelegate;
        try {
            if (!b(context)) {
                Log.e(C1821f.f36920a, "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            S.c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z3) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            c1771l.e(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(ConstraintLayout.b.a.f9571D)
    public static AbstractC1770k<Void> f(Executor executor, final Context context, final boolean z3) {
        if (!com.google.android.gms.common.util.v.p()) {
            return C1773n.g(null);
        }
        final C1771l c1771l = new C1771l();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.P
            @Override // java.lang.Runnable
            public final void run() {
                Q.e(context, z3, c1771l);
            }
        });
        return c1771l.a();
    }

    private static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(f36499a)) {
                return applicationInfo.metaData.getBoolean(f36499a);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
