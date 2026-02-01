package kotlinx.coroutines;

import kotlinx.coroutines.internal.C2294a;
import kotlinx.coroutines.internal.C2312t;

/* renamed from: kotlinx.coroutines.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2335r0 extends N {

    /* renamed from: G, reason: collision with root package name */
    private long f54553G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f54554H;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private C2294a<AbstractC2291h0<?>> f54555I;

    public static /* synthetic */ void n1(AbstractC2335r0 abstractC2335r0, boolean z3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                z3 = false;
            }
            abstractC2335r0.m1(z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    private final long o1(boolean z3) {
        return z3 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void s1(AbstractC2335r0 abstractC2335r0, boolean z3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                z3 = false;
            }
            abstractC2335r0.r1(z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final boolean c() {
        if (this.f54553G > 0) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.N
    @l3.d
    public final N k1(int i4) {
        C2312t.a(i4);
        return this;
    }

    public final void m1(boolean z3) {
        long o12 = this.f54553G - o1(z3);
        this.f54553G = o12;
        if (o12 <= 0 && this.f54554H) {
            shutdown();
        }
    }

    public final void p1(@l3.d AbstractC2291h0<?> abstractC2291h0) {
        C2294a<AbstractC2291h0<?>> c2294a = this.f54555I;
        if (c2294a == null) {
            c2294a = new C2294a<>();
            this.f54555I = c2294a;
        }
        c2294a.a(abstractC2291h0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long q1() {
        C2294a<AbstractC2291h0<?>> c2294a = this.f54555I;
        if (c2294a == null || c2294a.d()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final void r1(boolean z3) {
        this.f54553G += o1(z3);
        if (!z3) {
            this.f54554H = true;
        }
    }

    public void shutdown() {
    }

    protected boolean t1() {
        return v1();
    }

    public final boolean u1() {
        if (this.f54553G >= o1(true)) {
            return true;
        }
        return false;
    }

    public final boolean v1() {
        C2294a<AbstractC2291h0<?>> c2294a = this.f54555I;
        if (c2294a != null) {
            return c2294a.d();
        }
        return true;
    }

    public long w1() {
        if (!x1()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean x1() {
        AbstractC2291h0<?> e4;
        C2294a<AbstractC2291h0<?>> c2294a = this.f54555I;
        if (c2294a == null || (e4 = c2294a.e()) == null) {
            return false;
        }
        e4.run();
        return true;
    }

    public boolean y1() {
        return false;
    }
}
