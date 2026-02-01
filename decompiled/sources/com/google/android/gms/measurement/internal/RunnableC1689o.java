package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1689o implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ B2 f30889E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ AbstractC1695p f30890F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1689o(AbstractC1695p abstractC1695p, B2 b22) {
        this.f30890F = abstractC1695p;
        this.f30889E = b22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30889E.zzaw();
        if (C1617c.a()) {
            this.f30889E.a().x(this);
            return;
        }
        boolean e4 = this.f30890F.e();
        this.f30890F.f30902c = 0L;
        if (e4) {
            this.f30890F.c();
        }
    }
}
