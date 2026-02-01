package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.U;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.AbstractC2347x0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.Y;

@U
/* loaded from: classes2.dex */
public class d extends AbstractC2347x0 {

    /* renamed from: H, reason: collision with root package name */
    private final int f54610H;

    /* renamed from: I, reason: collision with root package name */
    private final int f54611I;

    /* renamed from: J, reason: collision with root package name */
    private final long f54612J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final String f54613K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private CoroutineScheduler f54614L;

    public /* synthetic */ d(int i4, int i5, long j4, String str, int i6, C2197u c2197u) {
        this(i4, i5, j4, (i6 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public static /* synthetic */ N o1(d dVar, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                i4 = 16;
            }
            return dVar.n1(i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
    }

    private final CoroutineScheduler p1() {
        return new CoroutineScheduler(this.f54610H, this.f54611I, this.f54612J, this.f54613K);
    }

    @Override // kotlinx.coroutines.AbstractC2347x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f54614L.close();
    }

    @Override // kotlinx.coroutines.N
    public void h1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        try {
            CoroutineScheduler.n(this.f54614L, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            Y.f52996L.h1(fVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.N
    public void i1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        try {
            CoroutineScheduler.n(this.f54614L, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            Y.f52996L.i1(fVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.AbstractC2347x0
    @l3.d
    public Executor m1() {
        return this.f54614L;
    }

    @l3.d
    public final N n1(int i4) {
        if (i4 > 0) {
            return new f(this, i4, null, 1);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i4).toString());
    }

    public final void q1(@l3.d Runnable runnable, @l3.d k kVar, boolean z3) {
        try {
            this.f54614L.m(runnable, kVar, z3);
        } catch (RejectedExecutionException unused) {
            Y.f52996L.F1(this.f54614L.f(runnable, kVar));
        }
    }

    @l3.d
    public final N r1(int i4) {
        if (i4 > 0) {
            if (i4 <= this.f54610H) {
                return new f(this, i4, null, 0);
            }
            throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + this.f54610H + "), but have " + i4).toString());
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i4).toString());
    }

    @Override // kotlinx.coroutines.N
    @l3.d
    public String toString() {
        return super.toString() + "[scheduler = " + this.f54614L + ']';
    }

    public d(int i4, int i5, long j4, @l3.d String str) {
        this.f54610H = i4;
        this.f54611I = i5;
        this.f54612J = j4;
        this.f54613K = str;
        this.f54614L = p1();
    }

    public /* synthetic */ d(int i4, int i5, String str, int i6, C2197u c2197u) {
        this((i6 & 1) != 0 ? n.f54633c : i4, (i6 & 2) != 0 ? n.f54634d : i5, (i6 & 4) != 0 ? n.f54631a : str);
    }

    public d(int i4, int i5, @l3.d String str) {
        this(i4, i5, n.f54635e, str);
    }

    public /* synthetic */ d(int i4, int i5, int i6, C2197u c2197u) {
        this((i6 & 1) != 0 ? n.f54633c : i4, (i6 & 2) != 0 ? n.f54634d : i5);
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ d(int i4, int i5) {
        this(i4, i5, n.f54635e, null, 8, null);
    }
}
