package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.AbstractC2337s0;

/* renamed from: kotlinx.coroutines.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2339t0 extends AbstractC2335r0 {
    /* JADX INFO: Access modifiers changed from: protected */
    public void A1(long j4, @l3.d AbstractC2337s0.c cVar) {
        Y.f52996L.J1(j4, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B1() {
        kotlin.H0 h02;
        Thread z12 = z1();
        if (Thread.currentThread() != z12) {
            AbstractC2237b b4 = C2240c.b();
            if (b4 != null) {
                b4.g(z12);
                h02 = kotlin.H0.f51801a;
            } else {
                h02 = null;
            }
            if (h02 == null) {
                LockSupport.unpark(z12);
            }
        }
    }

    @l3.d
    protected abstract Thread z1();
}
