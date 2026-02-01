package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class x implements y {

    /* renamed from: g, reason: collision with root package name */
    public static final String f35203g = "0.0";

    /* renamed from: h, reason: collision with root package name */
    static final String f35204h = "crashlytics.advertising.id";

    /* renamed from: i, reason: collision with root package name */
    static final String f35205i = "crashlytics.installation.id";

    /* renamed from: j, reason: collision with root package name */
    static final String f35206j = "firebase.installation.id";

    /* renamed from: k, reason: collision with root package name */
    static final String f35207k = "crashlytics.installation.id";

    /* renamed from: m, reason: collision with root package name */
    private static final String f35209m = "SYN_";

    /* renamed from: a, reason: collision with root package name */
    private final z f35211a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f35212b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35213c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.installations.j f35214d;

    /* renamed from: e, reason: collision with root package name */
    private final C1812u f35215e;

    /* renamed from: f, reason: collision with root package name */
    private String f35216f;

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f35208l = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: n, reason: collision with root package name */
    private static final String f35210n = Pattern.quote("/");

    public x(Context context, String str, com.google.firebase.installations.j jVar, C1812u c1812u) {
        if (context != null) {
            if (str != null) {
                this.f35212b = context;
                this.f35213c = str;
                this.f35214d = jVar;
                this.f35215e = c1812u;
                this.f35211a = new z();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    @androidx.annotation.N
    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e4;
        e4 = e(UUID.randomUUID().toString());
        com.google.firebase.crashlytics.internal.f.f().k("Created new Crashlytics installation ID: " + e4 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e4).putString(f35206j, str).apply();
        return e4;
    }

    static String c() {
        return f35209m + UUID.randomUUID().toString();
    }

    @androidx.annotation.P
    private String d() {
        try {
            return (String) V.b(this.f35214d.getId());
        } catch (Exception e4) {
            com.google.firebase.crashlytics.internal.f.f().n("Failed to retrieve Firebase Installations ID.", e4);
            return null;
        }
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return f35208l.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        if (str != null && str.startsWith(f35209m)) {
            return true;
        }
        return false;
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f35210n, "");
    }

    @Override // com.google.firebase.crashlytics.internal.common.y
    @androidx.annotation.N
    public synchronized String a() {
        try {
            String str = this.f35216f;
            if (str != null) {
                return str;
            }
            com.google.firebase.crashlytics.internal.f.f().k("Determining Crashlytics installation ID...");
            SharedPreferences s4 = C1799g.s(this.f35212b);
            String string = s4.getString(f35206j, null);
            com.google.firebase.crashlytics.internal.f.f().k("Cached Firebase Installation ID: " + string);
            if (this.f35215e.d()) {
                String d4 = d();
                com.google.firebase.crashlytics.internal.f.f().k("Fetched Firebase Installation ID: " + d4);
                if (d4 == null) {
                    if (string == null) {
                        d4 = c();
                    } else {
                        d4 = string;
                    }
                }
                if (d4.equals(string)) {
                    this.f35216f = l(s4);
                } else {
                    this.f35216f = b(d4, s4);
                }
            } else if (k(string)) {
                this.f35216f = l(s4);
            } else {
                this.f35216f = b(c(), s4);
            }
            if (this.f35216f == null) {
                com.google.firebase.crashlytics.internal.f.f().m("Unable to determine Crashlytics Install Id, creating a new one.");
                this.f35216f = b(c(), s4);
            }
            com.google.firebase.crashlytics.internal.f.f().k("Crashlytics installation ID: " + this.f35216f);
            return this.f35216f;
        } catch (Throwable th) {
            throw th;
        }
    }

    public String f() {
        return this.f35213c;
    }

    public String g() {
        return this.f35211a.a(this.f35212b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
