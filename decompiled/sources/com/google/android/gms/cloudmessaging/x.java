package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.google.android.gms.tasks.AbstractC1770k;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: e */
    @P
    @GuardedBy("MessengerIpcClient.class")
    private static x f27943e;

    /* renamed from: a */
    private final Context f27944a;

    /* renamed from: b */
    private final ScheduledExecutorService f27945b;

    /* renamed from: c */
    @GuardedBy("this")
    private s f27946c = new s(this, null);

    /* renamed from: d */
    @GuardedBy("this")
    private int f27947d = 1;

    @i0
    x(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f27945b = scheduledExecutorService;
        this.f27944a = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context a(x xVar) {
        return xVar.f27944a;
    }

    public static synchronized x b(Context context) {
        x xVar;
        synchronized (x.class) {
            try {
                if (f27943e == null) {
                    com.google.android.gms.internal.cloudmessaging.e.a();
                    f27943e = new x(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new com.google.android.gms.common.util.concurrent.b("MessengerIpcClient"))));
                }
                xVar = f27943e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xVar;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService e(x xVar) {
        return xVar.f27945b;
    }

    private final synchronized int f() {
        int i4;
        i4 = this.f27947d;
        this.f27947d = i4 + 1;
        return i4;
    }

    private final synchronized <T> AbstractC1770k<T> g(v<T> vVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(vVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(valueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.f27946c.g(vVar)) {
                s sVar = new s(this, null);
                this.f27946c = sVar;
                sVar.g(vVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return vVar.f27940b.a();
    }

    public final AbstractC1770k<Void> c(int i4, Bundle bundle) {
        return g(new u(f(), 2, bundle));
    }

    public final AbstractC1770k<Bundle> d(int i4, Bundle bundle) {
        return g(new w(f(), 1, bundle));
    }
}
