package com.google.android.gms.tasks;

/* loaded from: classes2.dex */
final class C implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AbstractC1770k f31141E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ D f31142F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(D d4, AbstractC1770k abstractC1770k) {
        this.f31142F = d4;
        this.f31141E = abstractC1770k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC1764e interfaceC1764e;
        InterfaceC1764e interfaceC1764e2;
        obj = this.f31142F.f31144b;
        synchronized (obj) {
            try {
                D d4 = this.f31142F;
                interfaceC1764e = d4.f31145c;
                if (interfaceC1764e != null) {
                    interfaceC1764e2 = d4.f31145c;
                    interfaceC1764e2.a(this.f31141E);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
