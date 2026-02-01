package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.tasks.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1777s<T> implements InterfaceC1778t<T> {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f31187a = new CountDownLatch(1);

    private C1777s() {
    }

    @Override // com.google.android.gms.tasks.InterfaceC1763d
    public final void a() {
        this.f31187a.countDown();
    }

    public final void b() throws InterruptedException {
        this.f31187a.await();
    }

    @Override // com.google.android.gms.tasks.InterfaceC1766g
    public final void c(T t3) {
        this.f31187a.countDown();
    }

    @Override // com.google.android.gms.tasks.InterfaceC1765f
    public final void d(@androidx.annotation.N Exception exc) {
        this.f31187a.countDown();
    }

    public final boolean e(long j4, TimeUnit timeUnit) throws InterruptedException {
        return this.f31187a.await(j4, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1777s(r rVar) {
    }
}
