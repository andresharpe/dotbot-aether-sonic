package kotlinx.coroutines.internal;

import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.InterfaceC2241c0;
import kotlinx.coroutines.InterfaceC2328n0;
import kotlinx.coroutines.InterfaceC2333q;

/* renamed from: kotlinx.coroutines.internal.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2311s extends kotlinx.coroutines.N implements Runnable, InterfaceC2241c0 {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.N f54503G;

    /* renamed from: H, reason: collision with root package name */
    private final int f54504H;

    /* renamed from: I, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2241c0 f54505I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final A<Runnable> f54506J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final Object f54507K;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC2311s(@l3.d kotlinx.coroutines.N n4, int i4) {
        InterfaceC2241c0 interfaceC2241c0;
        this.f54503G = n4;
        this.f54504H = i4;
        if (n4 instanceof InterfaceC2241c0) {
            interfaceC2241c0 = (InterfaceC2241c0) n4;
        } else {
            interfaceC2241c0 = null;
        }
        this.f54505I = interfaceC2241c0 == null ? kotlinx.coroutines.Z.a() : interfaceC2241c0;
        this.f54506J = new A<>(false);
        this.f54507K = new Object();
    }

    private final boolean m1(Runnable runnable) {
        this.f54506J.a(runnable);
        if (this.runningWorkers >= this.f54504H) {
            return true;
        }
        return false;
    }

    private final void n1(Runnable runnable, X2.a<H0> aVar) {
        if (m1(runnable) || !o1()) {
            return;
        }
        aVar.n();
    }

    private final boolean o1() {
        synchronized (this.f54507K) {
            if (this.runningWorkers >= this.f54504H) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC2241c0
    public void h(long j4, @l3.d InterfaceC2333q<? super H0> interfaceC2333q) {
        this.f54505I.h(j4, interfaceC2333q);
    }

    @Override // kotlinx.coroutines.N
    public void h1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        if (!m1(runnable) && o1()) {
            this.f54503G.h1(this, this);
        }
    }

    @Override // kotlinx.coroutines.N
    @G0
    public void i1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        if (!m1(runnable) && o1()) {
            this.f54503G.i1(this, this);
        }
    }

    @Override // kotlinx.coroutines.N
    @A0
    @l3.d
    public kotlinx.coroutines.N k1(int i4) {
        C2312t.a(i4);
        if (i4 >= this.f54504H) {
            return this;
        }
        return super.k1(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        r1 = r4.f54507K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r4.f54506J.c() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        r4.runningWorkers++;
        r2 = kotlin.H0.f51801a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003c, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kotlinx.coroutines.internal.A<java.lang.Runnable> r2 = r4.f54506J
            java.lang.Object r2 = r2.g()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.f52041E
            kotlinx.coroutines.Q.b(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kotlinx.coroutines.N r2 = r4.f54503G
            boolean r2 = r2.j1(r4)
            if (r2 == 0) goto L2
            kotlinx.coroutines.N r0 = r4.f54503G
            r0.h1(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f54507K
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.A<java.lang.Runnable> r2 = r4.f54506J     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlin.H0 r2 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.RunnableC2311s.run():void");
    }

    @Override // kotlinx.coroutines.InterfaceC2241c0
    @l3.d
    public InterfaceC2328n0 x0(long j4, @l3.d Runnable runnable, @l3.d kotlin.coroutines.f fVar) {
        return this.f54505I.x0(j4, runnable, fVar);
    }

    @Override // kotlinx.coroutines.InterfaceC2241c0
    @l3.e
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object z0(long j4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return this.f54505I.z0(j4, cVar);
    }
}
