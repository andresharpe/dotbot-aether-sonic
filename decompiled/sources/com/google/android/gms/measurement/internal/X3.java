package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class X3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC1661j1 f30483E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC1622c4 f30484F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X3(ServiceConnectionC1622c4 serviceConnectionC1622c4, InterfaceC1661j1 interfaceC1661j1) {
        this.f30484F = serviceConnectionC1622c4;
        this.f30483E = interfaceC1661j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30484F) {
            try {
                this.f30484F.f30570c = false;
                if (!this.f30484F.f30572e.x()) {
                    this.f30484F.f30572e.f31060a.b().t().a("Connected to service");
                    this.f30484F.f30572e.v(this.f30483E);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
