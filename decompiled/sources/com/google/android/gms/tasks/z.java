package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class z<TResult, TContinuationResult> implements InterfaceC1766g<TContinuationResult>, InterfaceC1765f, InterfaceC1763d, K {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f31204a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1762c f31205b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f31206c;

    public z(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1762c interfaceC1762c, @androidx.annotation.N Q q4) {
        this.f31204a = executor;
        this.f31205b = interfaceC1762c;
        this.f31206c = q4;
    }

    @Override // com.google.android.gms.tasks.InterfaceC1763d
    public final void a() {
        this.f31206c.A();
    }

    @Override // com.google.android.gms.tasks.K
    public final void b(@androidx.annotation.N AbstractC1770k abstractC1770k) {
        this.f31204a.execute(new y(this, abstractC1770k));
    }

    @Override // com.google.android.gms.tasks.InterfaceC1766g
    public final void c(TContinuationResult tcontinuationresult) {
        this.f31206c.z(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.InterfaceC1765f
    public final void d(@androidx.annotation.N Exception exc) {
        this.f31206c.y(exc);
    }

    @Override // com.google.android.gms.tasks.K
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
