package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes2.dex */
final class D implements K {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f31143a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f31144b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    private InterfaceC1764e f31145c;

    public D(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1764e interfaceC1764e) {
        this.f31143a = executor;
        this.f31145c = interfaceC1764e;
    }

    @Override // com.google.android.gms.tasks.K
    public final void b(@androidx.annotation.N AbstractC1770k abstractC1770k) {
        synchronized (this.f31144b) {
            try {
                if (this.f31145c == null) {
                    return;
                }
                this.f31143a.execute(new C(this, abstractC1770k));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.K
    public final void zzc() {
        synchronized (this.f31144b) {
            this.f31145c = null;
        }
    }
}
