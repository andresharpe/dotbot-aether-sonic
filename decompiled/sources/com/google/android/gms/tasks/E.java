package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes2.dex */
final class E implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AbstractC1770k f31146E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ F f31147F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E(F f4, AbstractC1770k abstractC1770k) {
        this.f31147F = f4;
        this.f31146E = abstractC1770k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC1765f interfaceC1765f;
        InterfaceC1765f interfaceC1765f2;
        obj = this.f31147F.f31149b;
        synchronized (obj) {
            try {
                F f4 = this.f31147F;
                interfaceC1765f = f4.f31150c;
                if (interfaceC1765f != null) {
                    interfaceC1765f2 = f4.f31150c;
                    interfaceC1765f2.d((Exception) C1285y.l(this.f31146E.q()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
