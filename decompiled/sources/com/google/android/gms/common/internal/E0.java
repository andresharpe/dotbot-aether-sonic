package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public final class E0 implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    private final int f28617c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC1246e f28618d;

    public E0(AbstractC1246e abstractC1246e, int i4) {
        this.f28618d = abstractC1246e;
        this.f28617c = i4;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        InterfaceC1273s c1274s0;
        AbstractC1246e abstractC1246e = this.f28618d;
        if (iBinder != null) {
            obj = abstractC1246e.f28709p;
            synchronized (obj) {
                try {
                    AbstractC1246e abstractC1246e2 = this.f28618d;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1273s)) {
                        c1274s0 = (InterfaceC1273s) queryLocalInterface;
                    } else {
                        c1274s0 = new C1274s0(iBinder);
                    }
                    abstractC1246e2.f28710q = c1274s0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f28618d.m0(0, null, this.f28617c);
            return;
        }
        AbstractC1246e.l0(abstractC1246e, 16);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f28618d.f28709p;
        synchronized (obj) {
            this.f28618d.f28710q = null;
        }
        Handler handler = this.f28618d.f28707n;
        handler.sendMessage(handler.obtainMessage(6, this.f28617c, 1));
    }
}
