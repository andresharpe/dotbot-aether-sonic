package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2290h<T> extends AbstractC2234a<T> {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final Thread f54393G;

    /* renamed from: H, reason: collision with root package name */
    @l3.e
    private final AbstractC2335r0 f54394H;

    public C2290h(@l3.d kotlin.coroutines.f fVar, @l3.d Thread thread, @l3.e AbstractC2335r0 abstractC2335r0) {
        super(fVar, true, true);
        this.f54393G = thread;
        this.f54394H = abstractC2335r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T J1() {
        long j4;
        kotlin.H0 h02;
        AbstractC2237b b4 = C2240c.b();
        if (b4 != null) {
            b4.d();
        }
        try {
            AbstractC2335r0 abstractC2335r0 = this.f54394H;
            E e4 = null;
            if (abstractC2335r0 != null) {
                AbstractC2335r0.s1(abstractC2335r0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC2335r0 abstractC2335r02 = this.f54394H;
                    if (abstractC2335r02 != null) {
                        j4 = abstractC2335r02.w1();
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (!m()) {
                        AbstractC2237b b5 = C2240c.b();
                        if (b5 != null) {
                            b5.c(this, j4);
                            h02 = kotlin.H0.f51801a;
                        } else {
                            h02 = null;
                        }
                        if (h02 == null) {
                            LockSupport.parkNanos(this, j4);
                        }
                    } else {
                        AbstractC2335r0 abstractC2335r03 = this.f54394H;
                        if (abstractC2335r03 != null) {
                            AbstractC2335r0.n1(abstractC2335r03, false, 1, null);
                        }
                        T t3 = (T) T0.o(P0());
                        if (t3 instanceof E) {
                            e4 = (E) t3;
                        }
                        if (e4 == null) {
                            return t3;
                        }
                        throw e4.f52925a;
                    }
                } catch (Throwable th) {
                    AbstractC2335r0 abstractC2335r04 = this.f54394H;
                    if (abstractC2335r04 != null) {
                        AbstractC2335r0.n1(abstractC2335r04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            l0(interruptedException);
            throw interruptedException;
        } finally {
            AbstractC2237b b6 = C2240c.b();
            if (b6 != null) {
                b6.h();
            }
        }
    }

    @Override // kotlinx.coroutines.S0
    protected boolean V0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.S0
    public void h0(@l3.e Object obj) {
        kotlin.H0 h02;
        if (!kotlin.jvm.internal.F.g(Thread.currentThread(), this.f54393G)) {
            Thread thread = this.f54393G;
            AbstractC2237b b4 = C2240c.b();
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
    }
}
