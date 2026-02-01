package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C1285y;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@I0.a
/* renamed from: com.google.android.gms.common.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ServiceConnectionC1230b implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    boolean f28464c = false;

    /* renamed from: d, reason: collision with root package name */
    private final BlockingQueue f28465d = new LinkedBlockingQueue();

    @I0.a
    @androidx.annotation.N
    public IBinder a() throws InterruptedException {
        C1285y.k("BlockingServiceConnection.getService() called on main thread");
        if (!this.f28464c) {
            this.f28464c = true;
            return (IBinder) this.f28465d.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @I0.a
    @androidx.annotation.N
    public IBinder b(long j4, @androidx.annotation.N TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C1285y.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f28464c) {
            this.f28464c = true;
            IBinder iBinder = (IBinder) this.f28465d.poll(j4, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@androidx.annotation.N ComponentName componentName, @androidx.annotation.N IBinder iBinder) {
        this.f28465d.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@androidx.annotation.N ComponentName componentName) {
    }
}
