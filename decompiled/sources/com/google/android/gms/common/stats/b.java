package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.T0;
import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.v;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

@I0.a
/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f28959b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile b f28960c;

    /* renamed from: a, reason: collision with root package name */
    @N
    @D
    public ConcurrentHashMap f28961a = new ConcurrentHashMap();

    private b() {
    }

    @I0.a
    @N
    public static b b() {
        if (f28960c == null) {
            synchronized (f28959b) {
                try {
                    if (f28960c == null) {
                        f28960c = new b();
                    }
                } finally {
                }
            }
        }
        b bVar = f28960c;
        C1285y.l(bVar);
        return bVar;
    }

    private static void f(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean g(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i4, boolean z3, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((com.google.android.gms.common.wrappers.e.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (h(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f28961a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean i5 = i(context, intent, serviceConnection, i4, executor);
                if (!i5) {
                    return false;
                }
                return i5;
            } finally {
                this.f28961a.remove(serviceConnection, serviceConnection);
            }
        }
        return i(context, intent, serviceConnection, i4, executor);
    }

    private static boolean h(ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof T0)) {
            return true;
        }
        return false;
    }

    private static final boolean i(Context context, Intent intent, ServiceConnection serviceConnection, int i4, @Nullable Executor executor) {
        boolean bindService;
        if (v.p() && executor != null) {
            bindService = context.bindService(intent, i4, executor, serviceConnection);
            return bindService;
        }
        return context.bindService(intent, serviceConnection, i4);
    }

    @I0.a
    public boolean a(@N Context context, @N Intent intent, @N ServiceConnection serviceConnection, int i4) {
        return g(context, context.getClass().getName(), intent, serviceConnection, i4, true, null);
    }

    @I0.a
    public void c(@N Context context, @N ServiceConnection serviceConnection) {
        if (h(serviceConnection) && this.f28961a.containsKey(serviceConnection)) {
            try {
                f(context, (ServiceConnection) this.f28961a.get(serviceConnection));
                return;
            } finally {
                this.f28961a.remove(serviceConnection);
            }
        }
        f(context, serviceConnection);
    }

    @I0.a
    public void d(@N Context context, @N ServiceConnection serviceConnection) {
        try {
            c(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean e(@N Context context, @N String str, @N Intent intent, @N ServiceConnection serviceConnection, int i4, @Nullable Executor executor) {
        return g(context, str, intent, serviceConnection, i4, true, executor);
    }
}
