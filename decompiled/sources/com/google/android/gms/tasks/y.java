package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class y implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AbstractC1770k f31202E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ z f31203F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(z zVar, AbstractC1770k abstractC1770k) {
        this.f31203F = zVar;
        this.f31202E = abstractC1770k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q q4;
        Q q5;
        Q q6;
        InterfaceC1762c interfaceC1762c;
        try {
            interfaceC1762c = this.f31203F.f31205b;
            AbstractC1770k abstractC1770k = (AbstractC1770k) interfaceC1762c.a(this.f31202E);
            if (abstractC1770k == null) {
                this.f31203F.d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C1772m.f31183b;
            abstractC1770k.l(executor, this.f31203F);
            abstractC1770k.i(executor, this.f31203F);
            abstractC1770k.c(executor, this.f31203F);
        } catch (RuntimeExecutionException e4) {
            if (e4.getCause() instanceof Exception) {
                q6 = this.f31203F.f31206c;
                q6.y((Exception) e4.getCause());
            } else {
                q5 = this.f31203F.f31206c;
                q5.y(e4);
            }
        } catch (Exception e5) {
            q4 = this.f31203F.f31206c;
            q4.y(e5);
        }
    }
}
