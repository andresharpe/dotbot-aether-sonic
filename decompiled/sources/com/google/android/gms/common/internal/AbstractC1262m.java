package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

@I0.a
/* renamed from: com.google.android.gms.common.internal.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1262m {

    /* renamed from: a, reason: collision with root package name */
    private static int f28786a = 4225;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f28787b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    private static S0 f28788c = null;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.P
    @com.google.android.gms.common.util.D
    static HandlerThread f28789d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f28790e = false;

    @I0.a
    public static int c() {
        return f28786a;
    }

    @I0.a
    @androidx.annotation.N
    public static AbstractC1262m d(@androidx.annotation.N Context context) {
        Looper mainLooper;
        synchronized (f28787b) {
            try {
                if (f28788c == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f28790e) {
                        mainLooper = e().getLooper();
                    } else {
                        mainLooper = context.getMainLooper();
                    }
                    f28788c = new S0(applicationContext, mainLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f28788c;
    }

    @I0.a
    @androidx.annotation.N
    public static HandlerThread e() {
        synchronized (f28787b) {
            try {
                HandlerThread handlerThread = f28789d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f28789d = handlerThread2;
                handlerThread2.start();
                return f28789d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @I0.a
    public static void f() {
        synchronized (f28787b) {
            try {
                S0 s02 = f28788c;
                if (s02 != null && !f28790e) {
                    s02.q(e().getLooper());
                }
                f28790e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @I0.a
    public boolean a(@androidx.annotation.N ComponentName componentName, @androidx.annotation.N ServiceConnection serviceConnection, @androidx.annotation.N String str) {
        return k(new N0(componentName, c()), serviceConnection, str, null);
    }

    @I0.a
    public boolean b(@androidx.annotation.N String str, @androidx.annotation.N ServiceConnection serviceConnection, @androidx.annotation.N String str2) {
        return k(new N0(str, c(), false), serviceConnection, str2, null);
    }

    @I0.a
    public void g(@androidx.annotation.N ComponentName componentName, @androidx.annotation.N ServiceConnection serviceConnection, @androidx.annotation.N String str) {
        i(new N0(componentName, c()), serviceConnection, str);
    }

    @I0.a
    public void h(@androidx.annotation.N String str, @androidx.annotation.N ServiceConnection serviceConnection, @androidx.annotation.N String str2) {
        i(new N0(str, c(), false), serviceConnection, str2);
    }

    protected abstract void i(N0 n02, ServiceConnection serviceConnection, String str);

    public final void j(@androidx.annotation.N String str, @androidx.annotation.N String str2, int i4, @androidx.annotation.N ServiceConnection serviceConnection, @androidx.annotation.N String str3, boolean z3) {
        i(new N0(str, str2, i4, z3), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean k(N0 n02, ServiceConnection serviceConnection, String str, @androidx.annotation.P Executor executor);
}
