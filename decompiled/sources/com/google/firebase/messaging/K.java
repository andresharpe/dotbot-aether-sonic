package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class K {

    /* renamed from: f, reason: collision with root package name */
    private static final String f36477f = "com.google.android.c2dm.permission.SEND";

    /* renamed from: g, reason: collision with root package name */
    static final String f36478g = "com.google.android.gms";

    /* renamed from: h, reason: collision with root package name */
    private static final String f36479h = "com.google.iid.TOKEN_REQUEST";

    /* renamed from: i, reason: collision with root package name */
    private static final String f36480i = "com.google.android.c2dm.intent.REGISTER";

    /* renamed from: j, reason: collision with root package name */
    static final int f36481j = 0;

    /* renamed from: k, reason: collision with root package name */
    static final int f36482k = 1;

    /* renamed from: l, reason: collision with root package name */
    static final int f36483l = 2;

    /* renamed from: a, reason: collision with root package name */
    private final Context f36484a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.B("this")
    private String f36485b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.B("this")
    private String f36486c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.B("this")
    private int f36487d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.B("this")
    private int f36488e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(Context context) {
        this.f36484a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(com.google.firebase.e eVar) {
        String m4 = eVar.s().m();
        if (m4 != null) {
            return m4;
        }
        String j4 = eVar.s().j();
        if (!j4.startsWith("1:")) {
            return j4;
        }
        String[] split = j4.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f36484a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w(C1821f.f36920a, "Failed to find package " + e4);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f4 = f(this.f36484a.getPackageName());
        if (f4 != null) {
            this.f36485b = Integer.toString(f4.versionCode);
            this.f36486c = f4.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a() {
        try {
            if (this.f36485b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f36485b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String b() {
        try {
            if (this.f36486c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f36486c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f4;
        try {
            if (this.f36487d == 0 && (f4 = f("com.google.android.gms")) != null) {
                this.f36487d = f4.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f36487d;
    }

    synchronized int e() {
        int i4 = this.f36488e;
        if (i4 != 0) {
            return i4;
        }
        PackageManager packageManager = this.f36484a.getPackageManager();
        if (packageManager.checkPermission(f36477f, "com.google.android.gms") == -1) {
            Log.e(C1821f.f36920a, "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.v.n()) {
            Intent intent = new Intent(f36480i);
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f36488e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent(f36479h);
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f36488e = 2;
            return 2;
        }
        Log.w(C1821f.f36920a, "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.v.n()) {
            this.f36488e = 2;
        } else {
            this.f36488e = 1;
        }
        return this.f36488e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        if (e() != 0) {
            return true;
        }
        return false;
    }
}
