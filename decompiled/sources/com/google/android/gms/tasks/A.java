package com.google.android.gms.tasks;

/* loaded from: classes2.dex */
final class A implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ B f31137E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(B b4) {
        this.f31137E = b4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC1763d interfaceC1763d;
        InterfaceC1763d interfaceC1763d2;
        obj = this.f31137E.f31139b;
        synchronized (obj) {
            try {
                B b4 = this.f31137E;
                interfaceC1763d = b4.f31140c;
                if (interfaceC1763d != null) {
                    interfaceC1763d2 = b4.f31140c;
                    interfaceC1763d2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
