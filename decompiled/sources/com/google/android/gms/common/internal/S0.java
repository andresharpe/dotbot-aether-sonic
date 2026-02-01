package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0909k;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class S0 extends AbstractC1262m {

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("connectionStatus")
    private final HashMap f28651f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Context f28652g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Handler f28653h;

    /* renamed from: i, reason: collision with root package name */
    private final R0 f28654i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.common.stats.b f28655j;

    /* renamed from: k, reason: collision with root package name */
    private final long f28656k;

    /* renamed from: l, reason: collision with root package name */
    private final long f28657l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S0(Context context, Looper looper) {
        R0 r02 = new R0(this, null);
        this.f28654i = r02;
        this.f28652g = context.getApplicationContext();
        this.f28653h = new com.google.android.gms.internal.common.r(looper, r02);
        this.f28655j = com.google.android.gms.common.stats.b.b();
        this.f28656k = C0909k.f15658a;
        this.f28657l = 300000L;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1262m
    protected final void i(N0 n02, ServiceConnection serviceConnection, String str) {
        C1285y.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f28651f) {
            try {
                P0 p02 = (P0) this.f28651f.get(n02);
                if (p02 != null) {
                    if (p02.h(serviceConnection)) {
                        p02.f(serviceConnection, str);
                        if (p02.i()) {
                            this.f28653h.sendMessageDelayed(this.f28653h.obtainMessage(0, n02), this.f28656k);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + n02.toString());
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + n02.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1262m
    public final boolean k(N0 n02, ServiceConnection serviceConnection, String str, @androidx.annotation.P Executor executor) {
        boolean j4;
        C1285y.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f28651f) {
            try {
                P0 p02 = (P0) this.f28651f.get(n02);
                if (p02 == null) {
                    p02 = new P0(this, n02);
                    p02.d(serviceConnection, serviceConnection, str);
                    p02.e(str, executor);
                    this.f28651f.put(n02, p02);
                } else {
                    this.f28653h.removeMessages(0, n02);
                    if (!p02.h(serviceConnection)) {
                        p02.d(serviceConnection, serviceConnection, str);
                        int a4 = p02.a();
                        if (a4 != 1) {
                            if (a4 == 2) {
                                p02.e(str, executor);
                            }
                        } else {
                            serviceConnection.onServiceConnected(p02.b(), p02.c());
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + n02.toString());
                    }
                }
                j4 = p02.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(Looper looper) {
        synchronized (this.f28651f) {
            this.f28653h = new com.google.android.gms.internal.common.r(looper, this.f28654i);
        }
    }
}
