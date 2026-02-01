package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes2.dex */
final class B implements K {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f31138a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f31139b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    private InterfaceC1763d f31140c;

    public B(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1763d interfaceC1763d) {
        this.f31138a = executor;
        this.f31140c = interfaceC1763d;
    }

    @Override // com.google.android.gms.tasks.K
    public final void b(@androidx.annotation.N AbstractC1770k abstractC1770k) {
        if (abstractC1770k.t()) {
            synchronized (this.f31139b) {
                try {
                    if (this.f31140c == null) {
                        return;
                    }
                    this.f31138a.execute(new A(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.K
    public final void zzc() {
        synchronized (this.f31139b) {
            this.f31140c = null;
        }
    }
}
