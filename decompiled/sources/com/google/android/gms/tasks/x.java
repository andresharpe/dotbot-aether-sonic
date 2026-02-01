package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class x implements K {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f31199a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1762c f31200b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f31201c;

    public x(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1762c interfaceC1762c, @androidx.annotation.N Q q4) {
        this.f31199a = executor;
        this.f31200b = interfaceC1762c;
        this.f31201c = q4;
    }

    @Override // com.google.android.gms.tasks.K
    public final void b(@androidx.annotation.N AbstractC1770k abstractC1770k) {
        this.f31199a.execute(new w(this, abstractC1770k));
    }

    @Override // com.google.android.gms.tasks.K
    public final void zzc() {
        throw new UnsupportedOperationException();
    }
}
