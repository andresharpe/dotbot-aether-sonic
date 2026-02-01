package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final Object f31161a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    private Queue f31162b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f31163c;

    public final void a(@androidx.annotation.N K k4) {
        synchronized (this.f31161a) {
            try {
                if (this.f31162b == null) {
                    this.f31162b = new ArrayDeque();
                }
                this.f31162b.add(k4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(@androidx.annotation.N AbstractC1770k abstractC1770k) {
        K k4;
        synchronized (this.f31161a) {
            if (this.f31162b != null && !this.f31163c) {
                this.f31163c = true;
                while (true) {
                    synchronized (this.f31161a) {
                        try {
                            k4 = (K) this.f31162b.poll();
                            if (k4 == null) {
                                this.f31163c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    k4.b(abstractC1770k);
                }
            }
        }
    }
}
