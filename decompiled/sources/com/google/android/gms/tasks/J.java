package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class J<TResult, TContinuationResult> implements InterfaceC1766g<TContinuationResult>, InterfaceC1765f, InterfaceC1763d, K {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f31158a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1769j f31159b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f31160c;

    public J(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1769j interfaceC1769j, @androidx.annotation.N Q q4) {
        this.f31158a = executor;
        this.f31159b = interfaceC1769j;
        this.f31160c = q4;
    }

    @Override // com.google.android.gms.tasks.InterfaceC1763d
    public final void a() {
        this.f31160c.A();
    }

    @Override // com.google.android.gms.tasks.K
    public final void b(@androidx.annotation.N AbstractC1770k abstractC1770k) {
        this.f31158a.execute(new I(this, abstractC1770k));
    }

    @Override // com.google.android.gms.tasks.InterfaceC1766g
    public final void c(TContinuationResult tcontinuationresult) {
        this.f31160c.z(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.InterfaceC1765f
    public final void d(@androidx.annotation.N Exception exc) {
        this.f31160c.y(exc);
    }

    @Override // com.google.android.gms.tasks.K
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
