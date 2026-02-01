package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;

/* renamed from: com.google.firebase.crashlytics.internal.common.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1812u {

    /* renamed from: i, reason: collision with root package name */
    private static final String f35182i = "firebase_crashlytics_collection_enabled";

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f35183a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.e f35184b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f35185c;

    /* renamed from: d, reason: collision with root package name */
    C1771l<Void> f35186d;

    /* renamed from: e, reason: collision with root package name */
    boolean f35187e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f35188f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.P
    private Boolean f35189g;

    /* renamed from: h, reason: collision with root package name */
    private final C1771l<Void> f35190h;

    public C1812u(com.google.firebase.e eVar) {
        Object obj = new Object();
        this.f35185c = obj;
        this.f35186d = new C1771l<>();
        this.f35187e = false;
        this.f35188f = false;
        this.f35190h = new C1771l<>();
        Context n4 = eVar.n();
        this.f35184b = eVar;
        this.f35183a = C1799g.s(n4);
        Boolean b4 = b();
        this.f35189g = b4 == null ? a(n4) : b4;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f35186d.e(null);
                    this.f35187e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.P
    private Boolean a(Context context) {
        Boolean f4 = f(context);
        if (f4 == null) {
            this.f35188f = false;
            return null;
        }
        this.f35188f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f4));
    }

    @androidx.annotation.P
    private Boolean b() {
        if (this.f35183a.contains(f35182i)) {
            this.f35188f = false;
            return Boolean.valueOf(this.f35183a.getBoolean(f35182i, true));
        }
        return null;
    }

    private void e(boolean z3) {
        String str;
        String str2;
        if (z3) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f35189g == null) {
            str2 = "global Firebase setting";
        } else if (this.f35188f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        com.google.firebase.crashlytics.internal.f.f().b(String.format("Crashlytics automatic data collection %s by %s.", str, str2));
    }

    @androidx.annotation.P
    private static Boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(f35182i)) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(f35182i));
            }
            return null;
        } catch (PackageManager.NameNotFoundException e4) {
            com.google.firebase.crashlytics.internal.f.f().e("Could not read data collection permission from manifest", e4);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private static void h(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean(f35182i, bool.booleanValue());
        } else {
            edit.remove(f35182i);
        }
        edit.commit();
    }

    public void c(boolean z3) {
        if (z3) {
            this.f35190h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean A3;
        try {
            Boolean bool = this.f35189g;
            if (bool != null) {
                A3 = bool.booleanValue();
            } else {
                A3 = this.f35184b.A();
            }
            e(A3);
        } catch (Throwable th) {
            throw th;
        }
        return A3;
    }

    public synchronized void g(@androidx.annotation.P Boolean bool) {
        Boolean a4;
        if (bool != null) {
            try {
                this.f35188f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a4 = bool;
        } else {
            a4 = a(this.f35184b.n());
        }
        this.f35189g = a4;
        h(this.f35183a, bool);
        synchronized (this.f35185c) {
            try {
                if (d()) {
                    if (!this.f35187e) {
                        this.f35186d.e(null);
                        this.f35187e = true;
                    }
                } else if (this.f35187e) {
                    this.f35186d = new C1771l<>();
                    this.f35187e = false;
                }
            } finally {
            }
        }
    }

    public AbstractC1770k<Void> i() {
        AbstractC1770k<Void> a4;
        synchronized (this.f35185c) {
            a4 = this.f35186d.a();
        }
        return a4;
    }

    public AbstractC1770k<Void> j() {
        return V.e(this.f35190h.a(), i());
    }
}
