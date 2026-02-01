package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.H0;
import kotlinx.coroutines.internal.S;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes2.dex */
public class x<E> extends AbstractC2242a<E> {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final ReentrantLock f53363H;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private Object f53364I;

    public x(@l3.e X2.l<? super E, H0> lVar) {
        super(lVar);
        this.f53363H = new ReentrantLock();
        this.f53364I = C2243b.f53077c;
    }

    private final UndeliveredElementException s0(Object obj) {
        X2.l<E, H0> lVar;
        Object obj2 = this.f53364I;
        UndeliveredElementException undeliveredElementException = null;
        if (obj2 != C2243b.f53077c && (lVar = this.f53084E) != null) {
            undeliveredElementException = kotlinx.coroutines.internal.I.d(lVar, obj2, null, 2, null);
        }
        this.f53364I = obj;
        return undeliveredElementException;
    }

    @Override // kotlinx.coroutines.channels.AbstractC2244c
    protected final boolean C() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractC2244c
    protected final boolean D() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        r1 = O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if ((r1 instanceof kotlinx.coroutines.channels.v) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        kotlin.jvm.internal.F.m(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r1.o0(r4, null) == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        r2 = kotlin.H0.f51801a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        r0.unlock();
        r1.X(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        return r1.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0023, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        r4 = s0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (r4 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        return kotlinx.coroutines.channels.C2243b.f53078d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r3.f53364I == kotlinx.coroutines.channels.C2243b.f53077c) goto L9;
     */
    @Override // kotlinx.coroutines.channels.AbstractC2244c
    @l3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(E r4) {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f53363H
            r0.lock()
            kotlinx.coroutines.channels.v r1 = r3.p()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto Lf
            r0.unlock()
            return r1
        Lf:
            java.lang.Object r1 = r3.f53364I     // Catch: java.lang.Throwable -> L3b
            kotlinx.coroutines.internal.S r2 = kotlinx.coroutines.channels.C2243b.f53077c     // Catch: java.lang.Throwable -> L3b
            if (r1 != r2) goto L3d
        L15:
            kotlinx.coroutines.channels.G r1 = r3.O()     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L1c
            goto L3d
        L1c:
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.v     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L24
            r0.unlock()
            return r1
        L24:
            kotlin.jvm.internal.F.m(r1)     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            kotlinx.coroutines.internal.S r2 = r1.o0(r4, r2)     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L15
            kotlin.H0 r2 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L3b
            r0.unlock()
            r1.X(r4)
            java.lang.Object r4 = r1.v()
            return r4
        L3b:
            r4 = move-exception
            goto L4a
        L3d:
            kotlinx.coroutines.internal.UndeliveredElementException r4 = r3.s0(r4)     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L49
            kotlinx.coroutines.internal.S r4 = kotlinx.coroutines.channels.C2243b.f53078d     // Catch: java.lang.Throwable -> L3b
            r0.unlock()
            return r4
        L49:
            throw r4     // Catch: java.lang.Throwable -> L3b
        L4a:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.x.G(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        r1 = k(r4);
        r2 = r5.g0(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r2 == kotlinx.coroutines.channels.C2243b.f53079e) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r2 == kotlinx.coroutines.internal.C2296c.f54475b) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r2 == kotlinx.coroutines.selects.g.d()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if ((r2 instanceof kotlinx.coroutines.channels.v) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        throw new java.lang.IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + r2).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x001f, code lost:
    
        r5 = r1.o();
        r1 = kotlin.H0.f51801a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0025, code lost:
    
        r0.unlock();
        kotlin.jvm.internal.F.m(r5);
        r5 = r5;
        r5.X(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0034, code lost:
    
        return r5.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r5.y() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        return kotlinx.coroutines.selects.g.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        r4 = s0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r4 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        return kotlinx.coroutines.channels.C2243b.f53078d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r3.f53364I == kotlinx.coroutines.channels.C2243b.f53077c) goto L9;
     */
    @Override // kotlinx.coroutines.channels.AbstractC2244c
    @l3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(E r4, @l3.d kotlinx.coroutines.selects.f<?> r5) {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f53363H
            r0.lock()
            kotlinx.coroutines.channels.v r1 = r3.p()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto Lf
            r0.unlock()
            return r1
        Lf:
            java.lang.Object r1 = r3.f53364I     // Catch: java.lang.Throwable -> L35
            kotlinx.coroutines.internal.S r2 = kotlinx.coroutines.channels.C2243b.f53077c     // Catch: java.lang.Throwable -> L35
            if (r1 != r2) goto L69
        L15:
            kotlinx.coroutines.channels.c$d r1 = r3.k(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.g0(r1)     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto L37
            java.lang.Object r5 = r1.o()     // Catch: java.lang.Throwable -> L35
            kotlin.H0 r1 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L35
            r0.unlock()
            kotlin.jvm.internal.F.m(r5)
            kotlinx.coroutines.channels.G r5 = (kotlinx.coroutines.channels.G) r5
            r5.X(r4)
            java.lang.Object r4 = r5.v()
            return r4
        L35:
            r4 = move-exception
            goto L84
        L37:
            kotlinx.coroutines.internal.S r1 = kotlinx.coroutines.channels.C2243b.f53079e     // Catch: java.lang.Throwable -> L35
            if (r2 == r1) goto L69
            java.lang.Object r1 = kotlinx.coroutines.internal.C2296c.f54475b     // Catch: java.lang.Throwable -> L35
            if (r2 == r1) goto L15
            java.lang.Object r4 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> L35
            if (r2 == r4) goto L65
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.v     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L4a
            goto L65
        L4a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r5.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            r5.append(r1)     // Catch: java.lang.Throwable -> L35
            r5.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L35
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L35
            throw r4     // Catch: java.lang.Throwable -> L35
        L65:
            r0.unlock()
            return r2
        L69:
            boolean r5 = r5.y()     // Catch: java.lang.Throwable -> L35
            if (r5 != 0) goto L77
            java.lang.Object r4 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> L35
            r0.unlock()
            return r4
        L77:
            kotlinx.coroutines.internal.UndeliveredElementException r4 = r3.s0(r4)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L83
            kotlinx.coroutines.internal.S r4 = kotlinx.coroutines.channels.C2243b.f53078d     // Catch: java.lang.Throwable -> L35
            r0.unlock()
            return r4
        L83:
            throw r4     // Catch: java.lang.Throwable -> L35
        L84:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.x.H(java.lang.Object, kotlinx.coroutines.selects.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC2242a
    public boolean c0(@l3.d E<? super E> e4) {
        ReentrantLock reentrantLock = this.f53363H;
        reentrantLock.lock();
        try {
            return super.c0(e4);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC2242a
    protected final boolean f0() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractC2242a
    protected final boolean g0() {
        boolean z3;
        ReentrantLock reentrantLock = this.f53363H;
        reentrantLock.lock();
        try {
            if (this.f53364I == C2243b.f53077c) {
                z3 = true;
            } else {
                z3 = false;
            }
            return z3;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC2242a
    public void i0(boolean z3) {
        ReentrantLock reentrantLock = this.f53363H;
        reentrantLock.lock();
        try {
            UndeliveredElementException s02 = s0(C2243b.f53077c);
            H0 h02 = H0.f51801a;
            reentrantLock.unlock();
            super.i0(z3);
            if (s02 == null) {
            } else {
                throw s02;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC2242a, kotlinx.coroutines.channels.F
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f53363H;
        reentrantLock.lock();
        try {
            return h0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC2242a
    @l3.e
    protected Object m0() {
        ReentrantLock reentrantLock = this.f53363H;
        reentrantLock.lock();
        try {
            Object obj = this.f53364I;
            S s4 = C2243b.f53077c;
            if (obj == s4) {
                Object p4 = p();
                if (p4 == null) {
                    p4 = C2243b.f53080f;
                }
                return p4;
            }
            this.f53364I = s4;
            H0 h02 = H0.f51801a;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC2244c
    @l3.d
    protected String n() {
        ReentrantLock reentrantLock = this.f53363H;
        reentrantLock.lock();
        try {
            return "(value=" + this.f53364I + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC2242a
    @l3.e
    protected Object n0(@l3.d kotlinx.coroutines.selects.f<?> fVar) {
        ReentrantLock reentrantLock = this.f53363H;
        reentrantLock.lock();
        try {
            Object obj = this.f53364I;
            S s4 = C2243b.f53077c;
            if (obj == s4) {
                Object p4 = p();
                if (p4 == null) {
                    p4 = C2243b.f53080f;
                }
                return p4;
            }
            if (!fVar.y()) {
                return kotlinx.coroutines.selects.g.d();
            }
            Object obj2 = this.f53364I;
            this.f53364I = s4;
            H0 h02 = H0.f51801a;
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }
}
