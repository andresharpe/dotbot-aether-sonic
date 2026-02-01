package kotlinx.coroutines.sync;

import X2.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.H0;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2338t;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.internal.AbstractC2302i;
import kotlinx.coroutines.internal.C2301h;
import kotlinx.coroutines.internal.O;
import kotlinx.coroutines.internal.P;
import kotlinx.coroutines.internal.S;
import kotlinx.coroutines.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g implements f {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54721c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f54722d = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54723e = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f54724f = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ AtomicIntegerFieldUpdater f54725g = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits");

    @l3.d
    volatile /* synthetic */ int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    private final int f54726a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final l<Throwable, H0> f54727b;

    @l3.d
    private volatile /* synthetic */ long deqIdx = 0;

    @l3.d
    private volatile /* synthetic */ long enqIdx = 0;

    @l3.d
    private volatile /* synthetic */ Object head;

    @l3.d
    private volatile /* synthetic */ Object tail;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements l<Throwable, H0> {
        a() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.d Throwable th) {
            g.this.release();
        }
    }

    public g(int i4, int i5) {
        this.f54726a = i4;
        if (i4 > 0) {
            if (i5 >= 0 && i5 <= i4) {
                i iVar = new i(0L, null, 2);
                this.head = iVar;
                this.tail = iVar;
                this._availablePermits = i4 - i5;
                this.f54727b = new a();
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i4).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i4).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(kotlin.coroutines.c<? super H0> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        Object l5;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        r b4 = C2338t.b(e4);
        while (true) {
            if (h(b4)) {
                break;
            }
            if (f54725g.getAndDecrement(this) > 0) {
                b4.M(H0.f51801a, this.f54727b);
                break;
            }
        }
        Object z3 = b4.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        l5 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l5) {
            return z3;
        }
        return H0.f51801a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h(InterfaceC2333q<? super H0> interfaceC2333q) {
        int i4;
        Object b4;
        int i5;
        S s4;
        S s5;
        O o4 = (i) this.tail;
        long andIncrement = f54724f.getAndIncrement(this);
        i4 = h.f54734f;
        long j4 = andIncrement / i4;
        loop0: while (true) {
            O o5 = o4;
            while (true) {
                if (o5.o() < j4 || o5.g()) {
                    Object e4 = o5.e();
                    if (e4 == C2301h.f54488b) {
                        b4 = P.b(C2301h.f54488b);
                        break;
                    }
                    O o6 = (O) ((AbstractC2302i) e4);
                    if (o6 == null) {
                        o6 = h.j(o5.o() + 1, (i) o5);
                        if (o5.m(o6)) {
                            if (o5.g()) {
                                o5.l();
                            }
                        }
                    }
                    o5 = o6;
                } else {
                    b4 = P.b(o5);
                    break;
                }
            }
            if (!P.h(b4)) {
                O f4 = P.f(b4);
                while (true) {
                    O o7 = (O) this.tail;
                    if (o7.o() >= f4.o()) {
                        break loop0;
                    }
                    if (!f4.r()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(f54723e, this, o7, f4)) {
                        if (o7.n()) {
                            o7.l();
                        }
                    } else if (f4.n()) {
                        f4.l();
                    }
                }
            } else {
                break;
            }
        }
        i iVar = (i) P.f(b4);
        i5 = h.f54734f;
        int i6 = (int) (andIncrement % i5);
        if (!kotlinx.coroutines.debug.internal.b.a(iVar.f54739e, i6, null, interfaceC2333q)) {
            s4 = h.f54730b;
            s5 = h.f54731c;
            if (kotlinx.coroutines.debug.internal.b.a(iVar.f54739e, i6, s4, s5)) {
                interfaceC2333q.M(H0.f51801a, this.f54727b);
                return true;
            }
            return false;
        }
        interfaceC2333q.u(new kotlinx.coroutines.sync.a(iVar, i6));
        return true;
    }

    private final boolean i(InterfaceC2333q<? super H0> interfaceC2333q) {
        Object j02 = interfaceC2333q.j0(H0.f51801a, null, this.f54727b);
        if (j02 == null) {
            return false;
        }
        interfaceC2333q.t0(j02);
        return true;
    }

    private final boolean j() {
        int i4;
        Object b4;
        int i5;
        S s4;
        S s5;
        int i6;
        S s6;
        S s7;
        S s8;
        O o4 = (i) this.head;
        long andIncrement = f54722d.getAndIncrement(this);
        i4 = h.f54734f;
        long j4 = andIncrement / i4;
        loop0: while (true) {
            O o5 = o4;
            while (true) {
                if (o5.o() < j4 || o5.g()) {
                    Object e4 = o5.e();
                    if (e4 == C2301h.f54488b) {
                        b4 = P.b(C2301h.f54488b);
                        break;
                    }
                    O o6 = (O) ((AbstractC2302i) e4);
                    if (o6 == null) {
                        o6 = h.j(o5.o() + 1, (i) o5);
                        if (o5.m(o6)) {
                            if (o5.g()) {
                                o5.l();
                            }
                        }
                    }
                    o5 = o6;
                } else {
                    b4 = P.b(o5);
                    break;
                }
            }
            if (P.h(b4)) {
                break;
            }
            O f4 = P.f(b4);
            while (true) {
                O o7 = (O) this.head;
                if (o7.o() >= f4.o()) {
                    break loop0;
                }
                if (!f4.r()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(f54721c, this, o7, f4)) {
                    if (o7.n()) {
                        o7.l();
                    }
                } else if (f4.n()) {
                    f4.l();
                }
            }
        }
        i iVar = (i) P.f(b4);
        iVar.b();
        if (iVar.o() <= j4) {
            i5 = h.f54734f;
            int i7 = (int) (andIncrement % i5);
            s4 = h.f54730b;
            Object andSet = iVar.f54739e.getAndSet(i7, s4);
            if (andSet == null) {
                i6 = h.f54729a;
                for (int i8 = 0; i8 < i6; i8++) {
                    Object obj = iVar.f54739e.get(i7);
                    s8 = h.f54731c;
                    if (obj == s8) {
                        return true;
                    }
                }
                s6 = h.f54730b;
                s7 = h.f54732d;
                return !kotlinx.coroutines.debug.internal.b.a(iVar.f54739e, i7, s6, s7);
            }
            s5 = h.f54733e;
            if (andSet == s5) {
                return false;
            }
            return i((InterfaceC2333q) andSet);
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.f
    public int a() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // kotlinx.coroutines.sync.f
    @l3.e
    public Object b(@l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        if (f54725g.getAndDecrement(this) > 0) {
            return H0.f51801a;
        }
        Object g4 = g(cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (g4 == l4) {
            return g4;
        }
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.sync.f
    public boolean c() {
        int i4;
        do {
            i4 = this._availablePermits;
            if (i4 <= 0) {
                return false;
            }
        } while (!f54725g.compareAndSet(this, i4, i4 - 1));
        return true;
    }

    @Override // kotlinx.coroutines.sync.f
    public void release() {
        while (true) {
            int i4 = this._availablePermits;
            if (i4 < this.f54726a) {
                if (f54725g.compareAndSet(this, i4, i4 + 1) && (i4 >= 0 || j())) {
                    return;
                }
            } else {
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f54726a).toString());
            }
        }
    }
}
