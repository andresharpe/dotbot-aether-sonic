package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1706q4 {

    /* renamed from: a, reason: collision with root package name */
    private RunnableC1700p4 f30932a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1729u4 f30933b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1706q4(C1729u4 c1729u4) {
        this.f30933b = c1729u4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void a(long j4) {
        Handler handler;
        this.f30932a = new RunnableC1700p4(this, this.f30933b.f31060a.zzav().a(), j4);
        handler = this.f30933b.f31003c;
        handler.postDelayed(this.f30932a, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void b() {
        Handler handler;
        this.f30933b.f();
        RunnableC1700p4 runnableC1700p4 = this.f30932a;
        if (runnableC1700p4 != null) {
            handler = this.f30933b.f31003c;
            handler.removeCallbacks(runnableC1700p4);
        }
        this.f30933b.f31060a.D().f30263q.a(false);
    }
}
