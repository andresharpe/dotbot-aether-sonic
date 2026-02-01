package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class I implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AbstractC1770k f31156E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ J f31157F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I(J j4, AbstractC1770k abstractC1770k) {
        this.f31157F = j4;
        this.f31156E = abstractC1770k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1769j interfaceC1769j;
        try {
            interfaceC1769j = this.f31157F.f31159b;
            AbstractC1770k a4 = interfaceC1769j.a(this.f31156E.r());
            if (a4 == null) {
                this.f31157F.d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C1772m.f31183b;
            a4.l(executor, this.f31157F);
            a4.i(executor, this.f31157F);
            a4.c(executor, this.f31157F);
        } catch (RuntimeExecutionException e4) {
            if (e4.getCause() instanceof Exception) {
                this.f31157F.d((Exception) e4.getCause());
            } else {
                this.f31157F.d(e4);
            }
        } catch (CancellationException unused) {
            this.f31157F.a();
        } catch (Exception e5) {
            this.f31157F.d(e5);
        }
    }
}
