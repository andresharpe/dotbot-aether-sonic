package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class Z3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC1661j1 f30504E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC1622c4 f30505F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z3(ServiceConnectionC1622c4 serviceConnectionC1622c4, InterfaceC1661j1 interfaceC1661j1) {
        this.f30505F = serviceConnectionC1622c4;
        this.f30504E = interfaceC1661j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30505F) {
            try {
                this.f30505F.f30570c = false;
                if (!this.f30505F.f30572e.x()) {
                    this.f30505F.f30572e.f31060a.b().o().a("Connected to remote service");
                    this.f30505F.f30572e.v(this.f30504E);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
