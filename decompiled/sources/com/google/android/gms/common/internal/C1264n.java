package com.google.android.gms.common.internal;

import android.util.Log;

@I0.a
/* renamed from: com.google.android.gms.common.internal.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1264n {

    /* renamed from: a, reason: collision with root package name */
    private final String f28795a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.P
    private final String f28796b;

    @I0.a
    public C1264n(@androidx.annotation.N String str) {
        this(str, null);
    }

    private final String r(String str) {
        String str2 = this.f28796b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    @l1.h
    private final String s(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.f28796b;
        if (str2 == null) {
            return format;
        }
        return str2.concat(format);
    }

    @I0.a
    public boolean a(int i4) {
        return Log.isLoggable(this.f28795a, i4);
    }

    @I0.a
    public boolean b() {
        return false;
    }

    @I0.a
    public void c(@androidx.annotation.N String str, @androidx.annotation.N String str2) {
        if (a(3)) {
            Log.d(str, r(str2));
        }
    }

    @I0.a
    public void d(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N Throwable th) {
        if (a(3)) {
            Log.d(str, r(str2), th);
        }
    }

    @I0.a
    public void e(@androidx.annotation.N String str, @androidx.annotation.N String str2) {
        if (a(6)) {
            Log.e(str, r(str2));
        }
    }

    @I0.a
    public void f(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N Throwable th) {
        if (a(6)) {
            Log.e(str, r(str2), th);
        }
    }

    @l1.h
    @I0.a
    public void g(@androidx.annotation.N String str, @l1.i @androidx.annotation.N String str2, @androidx.annotation.N Object... objArr) {
        if (a(6)) {
            Log.e(str, s(str2, objArr));
        }
    }

    @I0.a
    public void h(@androidx.annotation.N String str, @androidx.annotation.N String str2) {
        if (a(4)) {
            Log.i(str, r(str2));
        }
    }

    @I0.a
    public void i(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N Throwable th) {
        if (a(4)) {
            Log.i(str, r(str2), th);
        }
    }

    @I0.a
    public void j(@androidx.annotation.N String str, @androidx.annotation.N String str2) {
    }

    @I0.a
    public void k(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N Throwable th) {
    }

    @I0.a
    public void l(@androidx.annotation.N String str, @androidx.annotation.N String str2) {
        if (a(2)) {
            Log.v(str, r(str2));
        }
    }

    @I0.a
    public void m(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N Throwable th) {
        if (a(2)) {
            Log.v(str, r(str2), th);
        }
    }

    @I0.a
    public void n(@androidx.annotation.N String str, @androidx.annotation.N String str2) {
        if (a(5)) {
            Log.w(str, r(str2));
        }
    }

    @I0.a
    public void o(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N Throwable th) {
        if (a(5)) {
            Log.w(str, r(str2), th);
        }
    }

    @l1.h
    @I0.a
    public void p(@androidx.annotation.N String str, @l1.i @androidx.annotation.N String str2, @androidx.annotation.N Object... objArr) {
        if (a(5)) {
            Log.w(this.f28795a, s(str2, objArr));
        }
    }

    @I0.a
    public void q(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N Throwable th) {
        if (a(7)) {
            Log.e(str, r(str2), th);
            Log.wtf(str, r(str2), th);
        }
    }

    @I0.a
    public C1264n(@androidx.annotation.N String str, @androidx.annotation.P String str2) {
        C1285y.m(str, "log tag cannot be null");
        C1285y.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f28795a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f28796b = null;
        } else {
            this.f28796b = str2;
        }
    }
}
