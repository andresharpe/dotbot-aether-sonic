package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

@I0.a
/* loaded from: classes2.dex */
public class Y {

    /* renamed from: e, reason: collision with root package name */
    public static final int f36823e = -1;

    /* renamed from: f, reason: collision with root package name */
    @I0.a
    public static final int f36824f = 500;

    /* renamed from: g, reason: collision with root package name */
    static final int f36825g = 404;

    /* renamed from: h, reason: collision with root package name */
    static final int f36826h = 401;

    /* renamed from: i, reason: collision with root package name */
    static final int f36827i = 402;

    /* renamed from: j, reason: collision with root package name */
    static final int f36828j = 403;

    /* renamed from: k, reason: collision with root package name */
    static final String f36829k = "com.google.firebase.MESSAGING_EVENT";

    /* renamed from: l, reason: collision with root package name */
    private static final String f36830l = "wrapped_intent";

    /* renamed from: m, reason: collision with root package name */
    private static final String f36831m = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";

    /* renamed from: n, reason: collision with root package name */
    private static Y f36832n;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.P
    @androidx.annotation.B("this")
    private String f36833a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f36834b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f36835c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<Intent> f36836d = new ArrayDeque();

    private Y() {
    }

    private int a(Context context, Intent intent) {
        ComponentName startService;
        String f4 = f(context, intent);
        if (f4 != null) {
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "Restricting intent to a specific service: " + f4);
            }
            intent.setClassName(context.getPackageName(), f4);
        }
        try {
            if (e(context)) {
                startService = j0.k(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d(C1821f.f36920a, "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e(C1821f.f36920a, "Error while delivering the message: ServiceIntent not found.");
                return f36825g;
            }
            return -1;
        } catch (IllegalStateException e4) {
            Log.e(C1821f.f36920a, "Failed to start service while in background: " + e4);
            return 402;
        } catch (SecurityException e5) {
            Log.e(C1821f.f36920a, "Error while delivering the message to the serviceIntent", e5);
            return 401;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized Y b() {
        Y y3;
        synchronized (Y.class) {
            try {
                if (f36832n == null) {
                    f36832n = new Y();
                }
                y3 = f36832n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return y3;
    }

    @androidx.annotation.P
    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f36833a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f36833a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f36833a = serviceInfo.name;
                    }
                    return this.f36833a;
                }
                Log.e(C1821f.f36920a, "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e(C1821f.f36920a, "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @androidx.annotation.i0
    public static void g(Y y3) {
        f36832n = y3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.K
    public Intent c() {
        return this.f36836d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Context context) {
        boolean z3;
        if (this.f36835c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f36835c = Boolean.valueOf(z3);
        }
        if (!this.f36834b.booleanValue() && Log.isLoggable(C1821f.f36920a, 3)) {
            Log.d(C1821f.f36920a, "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f36835c.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(Context context) {
        boolean z3;
        if (this.f36834b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f36834b = Boolean.valueOf(z3);
        }
        if (!this.f36834b.booleanValue() && Log.isLoggable(C1821f.f36920a, 3)) {
            Log.d(C1821f.f36920a, "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f36834b.booleanValue();
    }

    @androidx.annotation.K
    public int h(Context context, Intent intent) {
        if (Log.isLoggable(C1821f.f36920a, 3)) {
            Log.d(C1821f.f36920a, "Starting service");
        }
        this.f36836d.offer(intent);
        Intent intent2 = new Intent(f36829k);
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
