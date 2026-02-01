package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class F implements K {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f31148a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f31149b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    private InterfaceC1765f f31150c;

    public F(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1765f interfaceC1765f) {
        this.f31148a = executor;
        this.f31150c = interfaceC1765f;
    }

    @Override // com.google.android.gms.tasks.K
    public final void b(@androidx.annotation.N AbstractC1770k abstractC1770k) {
        if (!abstractC1770k.v() && !abstractC1770k.t()) {
            synchronized (this.f31149b) {
                try {
                    if (this.f31150c == null) {
                        return;
                    }
                    this.f31148a.execute(new E(this, abstractC1770k));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.K
    public final void zzc() {
        synchronized (this.f31149b) {
            this.f31150c = null;
        }
    }
}
