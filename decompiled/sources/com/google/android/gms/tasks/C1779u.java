package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1779u<T> implements InterfaceC1778t<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f31188a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f31189b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f31190c;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("mLock")
    private int f31191d;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("mLock")
    private int f31192e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("mLock")
    private int f31193f;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("mLock")
    private Exception f31194g;

    /* renamed from: h, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f31195h;

    public C1779u(int i4, Q q4) {
        this.f31189b = i4;
        this.f31190c = q4;
    }

    @GuardedBy("mLock")
    private final void b() {
        if (this.f31191d + this.f31192e + this.f31193f == this.f31189b) {
            if (this.f31194g != null) {
                this.f31190c.y(new ExecutionException(this.f31192e + " out of " + this.f31189b + " underlying tasks failed", this.f31194g));
                return;
            }
            if (this.f31195h) {
                this.f31190c.A();
            } else {
                this.f31190c.z(null);
            }
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC1763d
    public final void a() {
        synchronized (this.f31188a) {
            this.f31193f++;
            this.f31195h = true;
            b();
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC1766g
    public final void c(T t3) {
        synchronized (this.f31188a) {
            this.f31191d++;
            b();
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC1765f
    public final void d(@androidx.annotation.N Exception exc) {
        synchronized (this.f31188a) {
            this.f31192e++;
            this.f31194g = exc;
            b();
        }
    }
}
