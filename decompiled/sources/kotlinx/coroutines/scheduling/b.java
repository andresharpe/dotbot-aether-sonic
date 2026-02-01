package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.u;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.AbstractC2347x0;
import kotlinx.coroutines.C2324l0;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.internal.U;
import kotlinx.coroutines.internal.W;

/* loaded from: classes2.dex */
public final class b extends AbstractC2347x0 implements Executor {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    public static final b f54607H = new b();

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private static final N f54608I;

    static {
        int u3;
        int d4;
        o oVar = o.f54641G;
        u3 = u.u(64, U.a());
        d4 = W.d(C2324l0.f54541a, u3, 0, 0, 12, null);
        f54608I = oVar.k1(d4);
    }

    private b() {
    }

    @Override // kotlinx.coroutines.AbstractC2347x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@l3.d Runnable runnable) {
        h1(EmptyCoroutineContext.f52041E, runnable);
    }

    @Override // kotlinx.coroutines.N
    public void h1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        f54608I.h1(fVar, runnable);
    }

    @Override // kotlinx.coroutines.N
    @G0
    public void i1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        f54608I.i1(fVar, runnable);
    }

    @Override // kotlinx.coroutines.N
    @A0
    @l3.d
    public N k1(int i4) {
        return o.f54641G.k1(i4);
    }

    @Override // kotlinx.coroutines.AbstractC2347x0
    @l3.d
    public Executor m1() {
        return this;
    }

    @Override // kotlinx.coroutines.N
    @l3.d
    public String toString() {
        return "Dispatchers.IO";
    }
}
