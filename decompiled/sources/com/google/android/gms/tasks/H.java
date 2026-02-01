package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class H implements K {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f31153a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f31154b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    private InterfaceC1766g f31155c;

    public H(@androidx.annotation.N Executor executor, @androidx.annotation.N InterfaceC1766g interfaceC1766g) {
        this.f31153a = executor;
        this.f31155c = interfaceC1766g;
    }

    @Override // com.google.android.gms.tasks.K
    public final void b(@androidx.annotation.N AbstractC1770k abstractC1770k) {
        if (abstractC1770k.v()) {
            synchronized (this.f31154b) {
                try {
                    if (this.f31155c == null) {
                        return;
                    }
                    this.f31153a.execute(new G(this, abstractC1770k));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.K
    public final void zzc() {
        synchronized (this.f31154b) {
            this.f31155c = null;
        }
    }
}
