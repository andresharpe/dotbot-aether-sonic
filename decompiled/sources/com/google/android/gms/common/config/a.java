package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.util.D;

@I0.a
/* loaded from: classes.dex */
public abstract class a<T> {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f28500d = new Object();

    /* renamed from: a, reason: collision with root package name */
    @N
    protected final String f28501a;

    /* renamed from: b, reason: collision with root package name */
    @N
    protected final Object f28502b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private Object f28503c = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(@N String str, @N Object obj) {
        this.f28501a = str;
        this.f28502b = obj;
    }

    @I0.a
    public static boolean c() {
        synchronized (f28500d) {
        }
        return false;
    }

    @I0.a
    @N
    public static a<Float> f(@N String str, @N Float f4) {
        return new e(str, f4);
    }

    @I0.a
    @N
    public static a<Integer> g(@N String str, @N Integer num) {
        return new d(str, num);
    }

    @I0.a
    @N
    public static a<Long> h(@N String str, @N Long l4) {
        return new c(str, l4);
    }

    @I0.a
    @N
    public static a<String> i(@N String str, @N String str2) {
        return new f(str, str2);
    }

    @I0.a
    @N
    public static a<Boolean> j(@N String str, boolean z3) {
        return new b(str, Boolean.valueOf(z3));
    }

    @I0.a
    @N
    public final T a() {
        T t3 = (T) this.f28503c;
        if (t3 != null) {
            return t3;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = f28500d;
        synchronized (obj) {
        }
        synchronized (obj) {
            try {
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th;
            }
        }
        try {
            T t4 = (T) k(this.f28501a);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return t4;
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                T t5 = (T) k(this.f28501a);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return t5;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    @I0.a
    @N
    @Deprecated
    public final T b() {
        return a();
    }

    @I0.a
    @D
    public void d(@N T t3) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.f28503c = t3;
        Object obj = f28500d;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    @I0.a
    @D
    public void e() {
        this.f28503c = null;
    }

    @N
    protected abstract Object k(@N String str);
}
