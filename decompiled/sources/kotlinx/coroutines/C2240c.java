package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;

/* renamed from: kotlinx.coroutines.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2240c {

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private static AbstractC2237b f53025a;

    @kotlin.internal.f
    private static final long a() {
        AbstractC2237b b4 = b();
        if (b4 != null) {
            return b4.a();
        }
        return System.currentTimeMillis();
    }

    @l3.e
    public static final AbstractC2237b b() {
        return f53025a;
    }

    @kotlin.internal.f
    private static final long c() {
        AbstractC2237b b4 = b();
        if (b4 != null) {
            return b4.b();
        }
        return System.nanoTime();
    }

    @kotlin.internal.f
    private static final void d(Object obj, long j4) {
        kotlin.H0 h02;
        AbstractC2237b b4 = b();
        if (b4 != null) {
            b4.c(obj, j4);
            h02 = kotlin.H0.f51801a;
        } else {
            h02 = null;
        }
        if (h02 == null) {
            LockSupport.parkNanos(obj, j4);
        }
    }

    @kotlin.internal.f
    private static final void e() {
        AbstractC2237b b4 = b();
        if (b4 != null) {
            b4.d();
        }
    }

    public static final void f(@l3.e AbstractC2237b abstractC2237b) {
        f53025a = abstractC2237b;
    }

    @kotlin.internal.f
    private static final void g() {
        AbstractC2237b b4 = b();
        if (b4 != null) {
            b4.e();
        }
    }

    @kotlin.internal.f
    private static final void h() {
        AbstractC2237b b4 = b();
        if (b4 != null) {
            b4.f();
        }
    }

    @kotlin.internal.f
    private static final void i(Thread thread) {
        kotlin.H0 h02;
        AbstractC2237b b4 = b();
        if (b4 != null) {
            b4.g(thread);
            h02 = kotlin.H0.f51801a;
        } else {
            h02 = null;
        }
        if (h02 == null) {
            LockSupport.unpark(thread);
        }
    }

    @kotlin.internal.f
    private static final void j() {
        AbstractC2237b b4 = b();
        if (b4 != null) {
            b4.h();
        }
    }

    @kotlin.internal.f
    private static final Runnable k(Runnable runnable) {
        Runnable i4;
        AbstractC2237b b4 = b();
        if (b4 != null && (i4 = b4.i(runnable)) != null) {
            return i4;
        }
        return runnable;
    }
}
