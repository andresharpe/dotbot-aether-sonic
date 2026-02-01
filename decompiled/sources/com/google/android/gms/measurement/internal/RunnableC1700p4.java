package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1700p4 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final long f30911E;

    /* renamed from: F, reason: collision with root package name */
    final long f30912F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C1706q4 f30913G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1700p4(C1706q4 c1706q4, long j4, long j5) {
        this.f30913G = c1706q4;
        this.f30911E = j4;
        this.f30912F = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30913G.f30933b.f31060a.a().x(new Runnable() { // from class: com.google.android.gms.measurement.internal.o4
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC1700p4 runnableC1700p4 = RunnableC1700p4.this;
                C1706q4 c1706q4 = runnableC1700p4.f30913G;
                long j4 = runnableC1700p4.f30911E;
                long j5 = runnableC1700p4.f30912F;
                c1706q4.f30933b.f();
                c1706q4.f30933b.f31060a.b().o().a("Application going to the background");
                c1706q4.f30933b.f31060a.D().f30263q.a(true);
                Bundle bundle = new Bundle();
                if (!c1706q4.f30933b.f31060a.x().B()) {
                    c1706q4.f30933b.f31005e.b(j5);
                    c1706q4.f30933b.f31005e.d(false, false, j5);
                }
                c1706q4.f30933b.f31060a.G().t(kotlinx.coroutines.W.f52989c, "_ab", j4, bundle);
            }
        });
    }
}
