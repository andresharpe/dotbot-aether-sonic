package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.N;
import com.google.android.gms.common.internal.C1264n;
import java.util.Locale;

@I0.a
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f28854a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28855b;

    /* renamed from: c, reason: collision with root package name */
    private final C1264n f28856c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28857d;

    @I0.a
    public a(@N String str, @N String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.f28855b = sb;
        this.f28854a = str;
        this.f28856c = new C1264n(str);
        int i4 = 2;
        while (i4 <= 7 && !Log.isLoggable(this.f28854a, i4)) {
            i4++;
        }
        this.f28857d = i4;
    }

    @I0.a
    public void a(@N String str, @N Object... objArr) {
        if (g(3)) {
            Log.d(this.f28854a, d(str, objArr));
        }
    }

    @I0.a
    public void b(@N String str, @N Throwable th, @N Object... objArr) {
        Log.e(this.f28854a, d(str, objArr), th);
    }

    @I0.a
    public void c(@N String str, @N Object... objArr) {
        Log.e(this.f28854a, d(str, objArr));
    }

    @I0.a
    @N
    protected String d(@N String str, @N Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f28855b.concat(str);
    }

    @I0.a
    @N
    public String e() {
        return this.f28854a;
    }

    @I0.a
    public void f(@N String str, @N Object... objArr) {
        Log.i(this.f28854a, d(str, objArr));
    }

    @I0.a
    public boolean g(int i4) {
        return this.f28857d <= i4;
    }

    @I0.a
    public void h(@N String str, @N Throwable th, @N Object... objArr) {
        if (g(2)) {
            Log.v(this.f28854a, d(str, objArr), th);
        }
    }

    @I0.a
    public void i(@N String str, @N Object... objArr) {
        if (g(2)) {
            Log.v(this.f28854a, d(str, objArr));
        }
    }

    @I0.a
    public void j(@N String str, @N Object... objArr) {
        Log.w(this.f28854a, d(str, objArr));
    }

    @I0.a
    public void k(@N String str, @N Throwable th, @N Object... objArr) {
        Log.wtf(this.f28854a, d(str, objArr), th);
    }

    @I0.a
    public void l(@N Throwable th) {
        Log.wtf(this.f28854a, th);
    }
}
