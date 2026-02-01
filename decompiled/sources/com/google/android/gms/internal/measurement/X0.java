package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class X0 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final long f29546E;

    /* renamed from: F, reason: collision with root package name */
    final long f29547F;

    /* renamed from: G, reason: collision with root package name */
    final boolean f29548G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29549H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X0(C1421j1 c1421j1, boolean z3) {
        this.f29549H = c1421j1;
        this.f29546E = c1421j1.f29678b.a();
        this.f29547F = c1421j1.f29678b.c();
        this.f29548G = z3;
    }

    abstract void a() throws RemoteException;

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        z3 = this.f29549H.f29683g;
        if (z3) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e4) {
            this.f29549H.s(e4, false, this.f29548G);
            b();
        }
    }
}
