package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    public static final String f35226c = "FirebaseCrashlytics";

    /* renamed from: d, reason: collision with root package name */
    static final f f35227d = new f(f35226c);

    /* renamed from: a, reason: collision with root package name */
    private final String f35228a;

    /* renamed from: b, reason: collision with root package name */
    private int f35229b = 4;

    public f(String str) {
        this.f35228a = str;
    }

    private boolean a(int i4) {
        if (this.f35229b > i4 && !Log.isLoggable(this.f35228a, i4)) {
            return false;
        }
        return true;
    }

    public static f f() {
        return f35227d;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f35228a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f35228a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f35228a, str, th);
        }
    }

    public void i(int i4, String str) {
        j(i4, str, false);
    }

    public void j(int i4, String str, boolean z3) {
        if (z3 || a(i4)) {
            Log.println(i4, this.f35228a, str);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f35228a, str, th);
        }
    }

    public void m(String str) {
        n(str, null);
    }

    public void n(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f35228a, str, th);
        }
    }
}
