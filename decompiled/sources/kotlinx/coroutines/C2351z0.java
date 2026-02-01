package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: kotlinx.coroutines.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2351z0 {
    @A0
    public static /* synthetic */ void a() {
    }

    @l3.d
    public static final Executor b(@l3.d N n4) {
        AbstractC2347x0 abstractC2347x0;
        Executor m12;
        if (n4 instanceof AbstractC2347x0) {
            abstractC2347x0 = (AbstractC2347x0) n4;
        } else {
            abstractC2347x0 = null;
        }
        if (abstractC2347x0 == null || (m12 = abstractC2347x0.m1()) == null) {
            return new ExecutorC2320j0(n4);
        }
        return m12;
    }

    @l3.d
    @W2.i(name = "from")
    public static final N c(@l3.d Executor executor) {
        ExecutorC2320j0 executorC2320j0;
        N n4;
        if (executor instanceof ExecutorC2320j0) {
            executorC2320j0 = (ExecutorC2320j0) executor;
        } else {
            executorC2320j0 = null;
        }
        if (executorC2320j0 == null || (n4 = executorC2320j0.f54529E) == null) {
            return new C2349y0(executor);
        }
        return n4;
    }

    @l3.d
    @W2.i(name = "from")
    public static final AbstractC2347x0 d(@l3.d ExecutorService executorService) {
        return new C2349y0(executorService);
    }
}
