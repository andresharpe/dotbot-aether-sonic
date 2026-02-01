package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54642b = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f54643c = AtomicIntegerFieldUpdater.newUpdater(p.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f54644d = AtomicIntegerFieldUpdater.newUpdater(p.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f54645e = AtomicIntegerFieldUpdater.newUpdater(p.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final AtomicReferenceArray<j> f54646a = new AtomicReferenceArray<>(128);

    @l3.d
    private volatile /* synthetic */ Object lastScheduledTask = null;

    @l3.d
    private volatile /* synthetic */ int producerIndex = 0;

    @l3.d
    private volatile /* synthetic */ int consumerIndex = 0;

    @l3.d
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ j b(p pVar, j jVar, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return pVar.a(jVar, z3);
    }

    private final j c(j jVar) {
        if (jVar.f54628F.i0() == 1) {
            f54645e.incrementAndGet(this);
        }
        if (e() == 127) {
            return jVar;
        }
        int i4 = this.producerIndex & q.f54649c;
        while (this.f54646a.get(i4) != null) {
            Thread.yield();
        }
        this.f54646a.lazySet(i4, jVar);
        f54643c.incrementAndGet(this);
        return null;
    }

    private final void d(j jVar) {
        if (jVar != null && jVar.f54628F.i0() == 1) {
            f54645e.decrementAndGet(this);
        }
    }

    private final j i() {
        j andSet;
        while (true) {
            int i4 = this.consumerIndex;
            if (i4 - this.producerIndex == 0) {
                return null;
            }
            int i5 = i4 & q.f54649c;
            if (f54644d.compareAndSet(this, i4, i4 + 1) && (andSet = this.f54646a.getAndSet(i5, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(e eVar) {
        j i4 = i();
        if (i4 == null) {
            return false;
        }
        eVar.a(i4);
        return true;
    }

    private final long m(p pVar, boolean z3) {
        j jVar;
        do {
            jVar = (j) pVar.lastScheduledTask;
            if (jVar == null) {
                return -2L;
            }
            if (z3 && jVar.f54628F.i0() != 1) {
                return -2L;
            }
            long a4 = n.f54636f.a() - jVar.f54627E;
            long j4 = n.f54632b;
            if (a4 < j4) {
                return j4 - a4;
            }
        } while (!androidx.concurrent.futures.b.a(f54642b, pVar, jVar, null));
        b(this, jVar, false, 2, null);
        return -1L;
    }

    @l3.e
    public final j a(@l3.d j jVar, boolean z3) {
        if (z3) {
            return c(jVar);
        }
        j jVar2 = (j) f54642b.getAndSet(this, jVar);
        if (jVar2 == null) {
            return null;
        }
        return c(jVar2);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        if (this.lastScheduledTask != null) {
            return e() + 1;
        }
        return e();
    }

    public final void g(@l3.d e eVar) {
        j jVar = (j) f54642b.getAndSet(this, null);
        if (jVar != null) {
            eVar.a(jVar);
        }
        do {
        } while (j(eVar));
    }

    @l3.e
    public final j h() {
        j jVar = (j) f54642b.getAndSet(this, null);
        if (jVar == null) {
            return i();
        }
        return jVar;
    }

    public final long k(@l3.d p pVar) {
        int i4 = pVar.producerIndex;
        AtomicReferenceArray<j> atomicReferenceArray = pVar.f54646a;
        for (int i5 = pVar.consumerIndex; i5 != i4; i5++) {
            int i6 = i5 & q.f54649c;
            if (pVar.blockingTasksInBuffer == 0) {
                break;
            }
            j jVar = atomicReferenceArray.get(i6);
            if (jVar != null && jVar.f54628F.i0() == 1 && kotlinx.coroutines.debug.internal.b.a(atomicReferenceArray, i6, jVar, null)) {
                f54645e.decrementAndGet(pVar);
                b(this, jVar, false, 2, null);
                return -1L;
            }
        }
        return m(pVar, true);
    }

    public final long l(@l3.d p pVar) {
        j i4 = pVar.i();
        if (i4 != null) {
            b(this, i4, false, 2, null);
            return -1L;
        }
        return m(pVar, false);
    }
}
