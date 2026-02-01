package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class t1 {
    @InterfaceC2271e0
    @l3.d
    public static final AbstractC2347x0 b(final int i4, @l3.d final String str) {
        if (i4 >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return C2351z0.d(Executors.newScheduledThreadPool(i4, new ThreadFactory() { // from class: kotlinx.coroutines.s1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread c4;
                    c4 = t1.c(i4, str, atomicInteger, runnable);
                    return c4;
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i4 + " specified").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread c(int i4, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i4 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    @InterfaceC2271e0
    @l3.d
    public static final AbstractC2347x0 d(@l3.d String str) {
        return b(1, str);
    }
}
