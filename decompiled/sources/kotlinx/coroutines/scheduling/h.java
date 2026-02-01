package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.AbstractC2347x0;

/* loaded from: classes2.dex */
public class h extends AbstractC2347x0 {

    /* renamed from: H, reason: collision with root package name */
    private final int f54622H;

    /* renamed from: I, reason: collision with root package name */
    private final int f54623I;

    /* renamed from: J, reason: collision with root package name */
    private final long f54624J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final String f54625K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private CoroutineScheduler f54626L;

    public h() {
        this(0, 0, 0L, null, 15, null);
    }

    private final CoroutineScheduler n1() {
        return new CoroutineScheduler(this.f54622H, this.f54623I, this.f54624J, this.f54625K);
    }

    @Override // kotlinx.coroutines.AbstractC2347x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f54626L.close();
    }

    @Override // kotlinx.coroutines.N
    public void h1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        CoroutineScheduler.n(this.f54626L, runnable, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.N
    public void i1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        CoroutineScheduler.n(this.f54626L, runnable, null, true, 2, null);
    }

    @Override // kotlinx.coroutines.AbstractC2347x0
    @l3.d
    public Executor m1() {
        return this.f54626L;
    }

    public final void o1(@l3.d Runnable runnable, @l3.d k kVar, boolean z3) {
        this.f54626L.m(runnable, kVar, z3);
    }

    public final void p1() {
        r1();
    }

    public final synchronized void q1(long j4) {
        this.f54626L.V(j4);
    }

    public final synchronized void r1() {
        this.f54626L.V(1000L);
        this.f54626L = n1();
    }

    public /* synthetic */ h(int i4, int i5, long j4, String str, int i6, C2197u c2197u) {
        this((i6 & 1) != 0 ? n.f54633c : i4, (i6 & 2) != 0 ? n.f54634d : i5, (i6 & 4) != 0 ? n.f54635e : j4, (i6 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public h(int i4, int i5, long j4, @l3.d String str) {
        this.f54622H = i4;
        this.f54623I = i5;
        this.f54624J = j4;
        this.f54625K = str;
        this.f54626L = n1();
    }
}
