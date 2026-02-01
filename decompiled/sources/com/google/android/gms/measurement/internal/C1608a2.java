package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1608a2 extends FutureTask implements Comparable {

    /* renamed from: E, reason: collision with root package name */
    private final long f30535E;

    /* renamed from: F, reason: collision with root package name */
    final boolean f30536F;

    /* renamed from: G, reason: collision with root package name */
    private final String f30537G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ C1620c2 f30538H;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608a2(C1620c2 c1620c2, Runnable runnable, boolean z3, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f30538H = c1620c2;
        C1285y.l(str);
        atomicLong = C1620c2.f30558l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f30535E = andIncrement;
        this.f30537G = str;
        this.f30536F = z3;
        if (andIncrement == Long.MAX_VALUE) {
            c1620c2.f31060a.b().p().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@androidx.annotation.N Object obj) {
        C1608a2 c1608a2 = (C1608a2) obj;
        boolean z3 = this.f30536F;
        if (z3 != c1608a2.f30536F) {
            if (z3) {
                return -1;
            }
        } else {
            long j4 = this.f30535E;
            long j5 = c1608a2.f30535E;
            if (j4 < j5) {
                return -1;
            }
            if (j4 <= j5) {
                this.f30538H.f31060a.b().r().b("Two tasks share the same index. index", Long.valueOf(this.f30535E));
                return 0;
            }
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.f30538H.f31060a.b().p().b(this.f30537G, th);
        if ((th instanceof Y1) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608a2(C1620c2 c1620c2, Callable callable, boolean z3, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f30538H = c1620c2;
        C1285y.l("Task exception on worker thread");
        atomicLong = C1620c2.f30558l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f30535E = andIncrement;
        this.f30537G = "Task exception on worker thread";
        this.f30536F = z3;
        if (andIncrement == Long.MAX_VALUE) {
            c1620c2.f31060a.b().p().a("Tasks index overflow");
        }
    }
}
