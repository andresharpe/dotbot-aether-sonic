package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.G0;
import kotlinx.coroutines.N;

/* loaded from: classes2.dex */
final class o extends N {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final o f54641G = new o();

    private o() {
    }

    @Override // kotlinx.coroutines.N
    public void h1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        c.f54609M.o1(runnable, n.f54640j, false);
    }

    @Override // kotlinx.coroutines.N
    @G0
    public void i1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        c.f54609M.o1(runnable, n.f54640j, true);
    }
}
