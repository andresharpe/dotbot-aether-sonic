package com.google.android.gms.tasks;

/* loaded from: classes2.dex */
final class G implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AbstractC1770k f31151E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ H f31152F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G(H h4, AbstractC1770k abstractC1770k) {
        this.f31152F = h4;
        this.f31151E = abstractC1770k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC1766g interfaceC1766g;
        InterfaceC1766g interfaceC1766g2;
        obj = this.f31152F.f31154b;
        synchronized (obj) {
            try {
                H h4 = this.f31152F;
                interfaceC1766g = h4.f31155c;
                if (interfaceC1766g != null) {
                    interfaceC1766g2 = h4.f31155c;
                    interfaceC1766g2.c(this.f31151E.r());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
