package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f28631f = new Uri.Builder().scheme(FirebaseAnalytics.b.f34769P).authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.P
    private final String f28632a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.P
    private final String f28633b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    private final ComponentName f28634c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28635d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f28636e;

    public N0(ComponentName componentName, int i4) {
        this.f28632a = null;
        this.f28633b = null;
        C1285y.l(componentName);
        this.f28634c = componentName;
        this.f28635d = i4;
        this.f28636e = false;
    }

    public final int a() {
        return this.f28635d;
    }

    @androidx.annotation.P
    public final ComponentName b() {
        return this.f28634c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.f28632a != null) {
            Intent intent = null;
            if (this.f28636e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f28632a);
                try {
                    bundle = context.getContentResolver().call(f28631f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e4) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e4.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f28632a)));
                }
            }
            if (intent == null) {
                return new Intent(this.f28632a).setPackage(this.f28633b);
            }
            return intent;
        }
        return new Intent().setComponent(this.f28634c);
    }

    @androidx.annotation.P
    public final String d() {
        return this.f28633b;
    }

    public final boolean equals(@androidx.annotation.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        if (C1281w.b(this.f28632a, n02.f28632a) && C1281w.b(this.f28633b, n02.f28633b) && C1281w.b(this.f28634c, n02.f28634c) && this.f28635d == n02.f28635d && this.f28636e == n02.f28636e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C1281w.c(this.f28632a, this.f28633b, this.f28634c, Integer.valueOf(this.f28635d), Boolean.valueOf(this.f28636e));
    }

    public final String toString() {
        String str = this.f28632a;
        if (str == null) {
            C1285y.l(this.f28634c);
            return this.f28634c.flattenToString();
        }
        return str;
    }

    public N0(String str, int i4, boolean z3) {
        this(str, "com.google.android.gms", i4, false);
    }

    public N0(String str, String str2, int i4, boolean z3) {
        C1285y.h(str);
        this.f28632a = str;
        C1285y.h(str2);
        this.f28633b = str2;
        this.f28634c = null;
        this.f28635d = i4;
        this.f28636e = z3;
    }
}
