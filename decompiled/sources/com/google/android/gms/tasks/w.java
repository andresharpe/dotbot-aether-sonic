package com.google.android.gms.tasks;

/* loaded from: classes2.dex */
final class w implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AbstractC1770k f31197E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ x f31198F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(x xVar, AbstractC1770k abstractC1770k) {
        this.f31198F = xVar;
        this.f31197E = abstractC1770k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q q4;
        Q q5;
        Q q6;
        InterfaceC1762c interfaceC1762c;
        Q q7;
        Q q8;
        if (this.f31197E.t()) {
            q8 = this.f31198F.f31201c;
            q8.A();
            return;
        }
        try {
            interfaceC1762c = this.f31198F.f31200b;
            Object a4 = interfaceC1762c.a(this.f31197E);
            q7 = this.f31198F.f31201c;
            q7.z(a4);
        } catch (RuntimeExecutionException e4) {
            if (e4.getCause() instanceof Exception) {
                q6 = this.f31198F.f31201c;
                q6.y((Exception) e4.getCause());
            } else {
                q5 = this.f31198F.f31201c;
                q5.y(e4);
            }
        } catch (Exception e5) {
            q4 = this.f31198F.f31201c;
            q4.y(e5);
        }
    }
}
