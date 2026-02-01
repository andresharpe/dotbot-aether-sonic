package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27948a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private int f27949b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private int f27950c = 0;

    public y(Context context) {
        this.f27948a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f27949b == 0) {
            try {
                packageInfo = com.google.android.gms.common.wrappers.e.a(this.f27948a).f("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e4) {
                String valueOf = String.valueOf(e4);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to find package ");
                sb.append(valueOf);
                Log.w("Metadata", sb.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f27949b = packageInfo.versionCode;
            }
        }
        return this.f27949b;
    }

    public final synchronized int b() {
        int i4 = this.f27950c;
        if (i4 != 0) {
            return i4;
        }
        PackageManager packageManager = this.f27948a.getPackageManager();
        if (com.google.android.gms.common.wrappers.e.a(this.f27948a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i5 = 1;
        if (!com.google.android.gms.common.util.v.n()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f27950c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f27950c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.v.n()) {
            this.f27950c = 2;
            i5 = 2;
        } else {
            this.f27950c = 1;
        }
        return i5;
    }
}
