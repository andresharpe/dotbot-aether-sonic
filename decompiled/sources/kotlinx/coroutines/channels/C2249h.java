package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.H0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C2100o;
import kotlinx.coroutines.internal.S;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* renamed from: kotlinx.coroutines.channels.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2249h<E> extends AbstractC2242a<E> {

    /* renamed from: H, reason: collision with root package name */
    private final int f53100H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final BufferOverflow f53101I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final ReentrantLock f53102J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private Object[] f53103K;

    /* renamed from: L, reason: collision with root package name */
    private int f53104L;

    @l3.d
    private volatile /* synthetic */ int size;

    /* renamed from: kotlinx.coroutines.channels.h$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53105a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f53105a = iArr;
        }
    }

    public C2249h(int i4, @l3.d BufferOverflow bufferOverflow, @l3.e X2.l<? super E, H0> lVar) {
        super(lVar);
        this.f53100H = i4;
        this.f53101I = bufferOverflow;
        if (i4 >= 1) {
            this.f53102J = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i4, 8)];
            C2100o.V1(objArr, C2243b.f53077c, 0, 0, 6, null);
            this.f53103K = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i4 + " was specified").toString());
    }

    private final void s0(int i4, E e4) {
        if (i4 < this.f53100H) {
            t0(i4);
            Object[] objArr = this.f53103K;
            objArr[(this.f53104L + i4) % objArr.length] = e4;
        } else {
            Object[] objArr2 = this.f53103K;
            int i5 = this.f53104L;
            objArr2[i5 % objArr2.length] = null;
            objArr2[(i4 + i5) % objArr2.length] = e4;
            this.f53104L = (i5 + 1) % objArr2.length;
        }
    }

    private final void t0(int i4) {
        Object[] objArr = this.f53103K;
        if (i4 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f53100H);
            Object[] objArr2 = new Object[min];
            for (int i5 = 0; i5 < i4; i5++) {
                Object[] objArr3 = this.f53103K;
                objArr2[i5] = objArr3[(this.f53104L + i5) % objArr3.length];
            }
            C2100o.M1(objArr2, C2243b.f53077c, i4, min);
            this.f53103K = objArr2;
            this.f53104L = 0;
        }
    }

    private final S u0(int i4) {
        if (i4 < this.f53100H) {
            this.size = i4 + 1;
            return null;
        }
        int i5 = a.f53105a[this.f53101I.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            return C2243b.f53078d;
        }
        return C2243b.f53079e;
    }

    @Override // kotlinx.coroutines.channels.AbstractC2244c
    protected final boolean C() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractC2244c
    protected final boolean D() {
        if (this.size == this.f53100H && this.f53101I == BufferOverflow.SUSPEND) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r1 == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        r2 = O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if ((r2 instanceof kotlinx.coroutines.channels.v) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        kotlin.jvm.internal.F.m(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r2.o0(r5, null) == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        r4.size = r1;
        r1 = kotlin.H0.f51801a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r0.unlock();
        r2.X(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        return r2.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0028, code lost:
    
        r4.size = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        s0(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0051, code lost:
    
        return kotlinx.coroutines.channels.C2243b.f53078d;
     */
    @Override // kotlinx.coroutines.channels.AbstractC2244c
    @l3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(E r5) {
        /*
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.f53102J
            r0.lock()
            int r1 = r4.size     // Catch: java.lang.Throwable -> L2e
            kotlinx.coroutines.channels.v r2 = r4.p()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L11
            r0.unlock()
            return r2
        L11:
            kotlinx.coroutines.internal.S r2 = r4.u0(r1)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L1b
            r0.unlock()
            return r2
        L1b:
            if (r1 != 0) goto L49
        L1d:
            kotlinx.coroutines.channels.G r2 = r4.O()     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L24
            goto L49
        L24:
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.v     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            r4.size = r1     // Catch: java.lang.Throwable -> L2e
            r0.unlock()
            return r2
        L2e:
            r5 = move-exception
            goto L52
        L30:
            kotlin.jvm.internal.F.m(r2)     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            kotlinx.coroutines.internal.S r3 = r2.o0(r5, r3)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L1d
            r4.size = r1     // Catch: java.lang.Throwable -> L2e
            kotlin.H0 r1 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L2e
            r0.unlock()
            r2.X(r5)
            java.lang.Object r5 = r2.v()
            return r5
        L49:
            r4.s0(r1, r5)     // Catch: java.lang.Throwable -> L2e
            kotlinx.coroutines.internal.S r5 = kotlinx.coroutines.channels.C2243b.f53078d     // Catch: java.lang.Throwable -> L2e
            r0.unlock()
            return r5
        L52:
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C2249h.G(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r1 == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        r2 = k(r5);
        r3 = r6.g0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r3 == kotlinx.coroutines.channels.C2243b.f53079e) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r3 == kotlinx.coroutines.internal.C2296c.f54475b) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r3 == kotlinx.coroutines.selects.g.d()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if ((r3 instanceof kotlinx.coroutines.channels.v) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        throw new java.lang.IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + r3).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r4.size = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0027, code lost:
    
        r4.size = r1;
        r6 = r2.o();
        r1 = kotlin.H0.f51801a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002f, code lost:
    
        r0.unlock();
        kotlin.jvm.internal.F.m(r6);
        r6 = r6;
        r6.X(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003e, code lost:
    
        return r6.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        if (r6.y() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        r4.size = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        return kotlinx.coroutines.selects.g.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        s0(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        return kotlinx.coroutines.channels.C2243b.f53078d;
     */
    @Override // kotlinx.coroutines.channels.AbstractC2244c
    @l3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(E r5, @l3.d kotlinx.coroutines.selects.f<?> r6) {
        /*
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.f53102J
            r0.lock()
            int r1 = r4.size     // Catch: java.lang.Throwable -> L3f
            kotlinx.coroutines.channels.v r2 = r4.p()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L11
            r0.unlock()
            return r2
        L11:
            kotlinx.coroutines.internal.S r2 = r4.u0(r1)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L1b
            r0.unlock()
            return r2
        L1b:
            if (r1 != 0) goto L75
        L1d:
            kotlinx.coroutines.channels.c$d r2 = r4.k(r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r3 = r6.g0(r2)     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L41
            r4.size = r1     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r6 = r2.o()     // Catch: java.lang.Throwable -> L3f
            kotlin.H0 r1 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L3f
            r0.unlock()
            kotlin.jvm.internal.F.m(r6)
            kotlinx.coroutines.channels.G r6 = (kotlinx.coroutines.channels.G) r6
            r6.X(r5)
            java.lang.Object r5 = r6.v()
            return r5
        L3f:
            r5 = move-exception
            goto L8e
        L41:
            kotlinx.coroutines.internal.S r2 = kotlinx.coroutines.channels.C2243b.f53079e     // Catch: java.lang.Throwable -> L3f
            if (r3 == r2) goto L75
            java.lang.Object r2 = kotlinx.coroutines.internal.C2296c.f54475b     // Catch: java.lang.Throwable -> L3f
            if (r3 == r2) goto L1d
            java.lang.Object r5 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> L3f
            if (r3 == r5) goto L6f
            boolean r5 = r3 instanceof kotlinx.coroutines.channels.v     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L54
            goto L6f
        L54:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r6.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            r6.append(r1)     // Catch: java.lang.Throwable -> L3f
            r6.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3f
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3f
            throw r5     // Catch: java.lang.Throwable -> L3f
        L6f:
            r4.size = r1     // Catch: java.lang.Throwable -> L3f
            r0.unlock()
            return r3
        L75:
            boolean r6 = r6.y()     // Catch: java.lang.Throwable -> L3f
            if (r6 != 0) goto L85
            r4.size = r1     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r5 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> L3f
            r0.unlock()
            return r5
        L85:
            r4.s0(r1, r5)     // Catch: java.lang.Throwable -> L3f
            kotlinx.coroutines.internal.S r5 = kotlinx.coroutines.channels.C2243b.f53078d     // Catch: java.lang.Throwable -> L3f
            r0.unlock()
            return r5
        L8e:
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C2249h.H(java.lang.Object, kotlinx.coroutines.selects.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC2242a
    public boolean c0(@l3.d E<? super E> e4) {
        ReentrantLock reentrantLock = this.f53102J;
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
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC2242a
    public void i0(boolean z3) {
        X2.l<E, H0> lVar = this.f53084E;
        ReentrantLock reentrantLock = this.f53102J;
        reentrantLock.lock();
        try {
            int i4 = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i5 = 0; i5 < i4; i5++) {
                Object obj = this.f53103K[this.f53104L];
                if (lVar != null && obj != C2243b.f53077c) {
                    undeliveredElementException = kotlinx.coroutines.internal.I.c(lVar, obj, undeliveredElementException);
                }
                Object[] objArr = this.f53103K;
                int i6 = this.f53104L;
                objArr[i6] = C2243b.f53077c;
                this.f53104L = (i6 + 1) % objArr.length;
            }
            this.size = 0;
            H0 h02 = H0.f51801a;
            reentrantLock.unlock();
            super.i0(z3);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC2242a, kotlinx.coroutines.channels.F
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f53102J;
        reentrantLock.lock();
        try {
            return h0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC2242a, kotlinx.coroutines.channels.F
    public boolean l() {
        ReentrantLock reentrantLock = this.f53102J;
        reentrantLock.lock();
        try {
            return super.l();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC2244c
    @l3.e
    public Object m(@l3.d I i4) {
        ReentrantLock reentrantLock = this.f53102J;
        reentrantLock.lock();
        try {
            return super.m(i4);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC2242a
    @l3.e
    protected Object m0() {
        ReentrantLock reentrantLock = this.f53102J;
        reentrantLock.lock();
        try {
            int i4 = this.size;
            if (i4 == 0) {
                Object p4 = p();
                if (p4 == null) {
                    p4 = C2243b.f53080f;
                }
                return p4;
            }
            Object[] objArr = this.f53103K;
            int i5 = this.f53104L;
            Object obj = objArr[i5];
            I i6 = null;
            objArr[i5] = null;
            this.size = i4 - 1;
            Object obj2 = C2243b.f53080f;
            boolean z3 = false;
            if (i4 == this.f53100H) {
                I i7 = null;
                while (true) {
                    I Q3 = Q();
                    if (Q3 == null) {
                        i6 = i7;
                        break;
                    }
                    kotlin.jvm.internal.F.m(Q3);
                    if (Q3.a1(null) != null) {
                        obj2 = Q3.Y0();
                        z3 = true;
                        i6 = Q3;
                        break;
                    }
                    Q3.b1();
                    i7 = Q3;
                }
            }
            if (obj2 != C2243b.f53080f && !(obj2 instanceof v)) {
                this.size = i4;
                Object[] objArr2 = this.f53103K;
                objArr2[(this.f53104L + i4) % objArr2.length] = obj2;
            }
            this.f53104L = (this.f53104L + 1) % this.f53103K.length;
            H0 h02 = H0.f51801a;
            if (z3) {
                kotlin.jvm.internal.F.m(i6);
                i6.X0();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC2244c
    @l3.d
    protected String n() {
        return "(buffer:capacity=" + this.f53100H + ",size=" + this.size + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r1 == r8.f53100H) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r3 = a0();
        r7 = r9.g0(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r7 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r7 == kotlinx.coroutines.channels.C2243b.f53080f) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r7 == kotlinx.coroutines.internal.C2296c.f54475b) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r7 != kotlinx.coroutines.selects.g.d()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r8.size = r1;
        r8.f53103K[r8.f53104L] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if ((r7 instanceof kotlinx.coroutines.channels.v) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        r3 = true;
        r2 = r7;
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (r2 == kotlinx.coroutines.channels.C2243b.f53080f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if ((r2 instanceof kotlinx.coroutines.channels.v) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        r8.size = r1;
        r9 = r8.f53103K;
        r9[(r8.f53104L + r1) % r9.length] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        r8.f53104L = (r8.f53104L + 1) % r8.f53103K.length;
        r9 = kotlin.H0.f51801a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        if (r3 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        kotlin.jvm.internal.F.m(r5);
        ((kotlinx.coroutines.channels.I) r5).X0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if (r9.y() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        r8.size = r1;
        r8.f53103K[r8.f53104L] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        return kotlinx.coroutines.selects.g.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
    
        throw new java.lang.IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + r7).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0037, code lost:
    
        r5 = r3.o();
        kotlin.jvm.internal.F.m(r5);
        r2 = ((kotlinx.coroutines.channels.I) r5).Y0();
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0084, code lost:
    
        r3 = false;
     */
    @Override // kotlinx.coroutines.channels.AbstractC2242a
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object n0(@l3.d kotlinx.coroutines.selects.f<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f53102J
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L19
            kotlinx.coroutines.channels.v r9 = r8.p()     // Catch: java.lang.Throwable -> L12
            if (r9 != 0) goto L15
            kotlinx.coroutines.internal.S r9 = kotlinx.coroutines.channels.C2243b.f53080f     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r9 = move-exception
            goto Lc8
        L15:
            r0.unlock()
            return r9
        L19:
            java.lang.Object[] r2 = r8.f53103K     // Catch: java.lang.Throwable -> L12
            int r3 = r8.f53104L     // Catch: java.lang.Throwable -> L12
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L12
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> L12
            kotlinx.coroutines.internal.S r2 = kotlinx.coroutines.channels.C2243b.f53080f     // Catch: java.lang.Throwable -> L12
            int r3 = r8.f53100H     // Catch: java.lang.Throwable -> L12
            r6 = 1
            if (r1 != r3) goto L84
        L2d:
            kotlinx.coroutines.channels.a$g r3 = r8.a0()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r7 = r9.g0(r3)     // Catch: java.lang.Throwable -> L12
            if (r7 != 0) goto L47
            java.lang.Object r5 = r3.o()     // Catch: java.lang.Throwable -> L12
            kotlin.jvm.internal.F.m(r5)     // Catch: java.lang.Throwable -> L12
            r2 = r5
            kotlinx.coroutines.channels.I r2 = (kotlinx.coroutines.channels.I) r2     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r2.Y0()     // Catch: java.lang.Throwable -> L12
            r3 = r6
            goto L85
        L47:
            kotlinx.coroutines.internal.S r3 = kotlinx.coroutines.channels.C2243b.f53080f     // Catch: java.lang.Throwable -> L12
            if (r7 == r3) goto L84
            java.lang.Object r3 = kotlinx.coroutines.internal.C2296c.f54475b     // Catch: java.lang.Throwable -> L12
            if (r7 == r3) goto L2d
            java.lang.Object r2 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> L12
            if (r7 != r2) goto L61
            r8.size = r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r9 = r8.f53103K     // Catch: java.lang.Throwable -> L12
            int r1 = r8.f53104L     // Catch: java.lang.Throwable -> L12
            r9[r1] = r4     // Catch: java.lang.Throwable -> L12
            r0.unlock()
            return r7
        L61:
            boolean r2 = r7 instanceof kotlinx.coroutines.channels.v     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L69
            r3 = r6
            r2 = r7
            r5 = r2
            goto L85
        L69:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "performAtomicTrySelect(describeTryOffer) returned "
            r1.append(r2)     // Catch: java.lang.Throwable -> L12
            r1.append(r7)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L12
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L12
            throw r9     // Catch: java.lang.Throwable -> L12
        L84:
            r3 = 0
        L85:
            kotlinx.coroutines.internal.S r7 = kotlinx.coroutines.channels.C2243b.f53080f     // Catch: java.lang.Throwable -> L12
            if (r2 == r7) goto L99
            boolean r7 = r2 instanceof kotlinx.coroutines.channels.v     // Catch: java.lang.Throwable -> L12
            if (r7 != 0) goto L99
            r8.size = r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r9 = r8.f53103K     // Catch: java.lang.Throwable -> L12
            int r7 = r8.f53104L     // Catch: java.lang.Throwable -> L12
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> L12
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> L12
            goto Laf
        L99:
            boolean r9 = r9.y()     // Catch: java.lang.Throwable -> L12
            if (r9 != 0) goto Laf
            r8.size = r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r9 = r8.f53103K     // Catch: java.lang.Throwable -> L12
            int r1 = r8.f53104L     // Catch: java.lang.Throwable -> L12
            r9[r1] = r4     // Catch: java.lang.Throwable -> L12
            java.lang.Object r9 = kotlinx.coroutines.selects.g.d()     // Catch: java.lang.Throwable -> L12
            r0.unlock()
            return r9
        Laf:
            int r9 = r8.f53104L     // Catch: java.lang.Throwable -> L12
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f53103K     // Catch: java.lang.Throwable -> L12
            int r1 = r1.length     // Catch: java.lang.Throwable -> L12
            int r9 = r9 % r1
            r8.f53104L = r9     // Catch: java.lang.Throwable -> L12
            kotlin.H0 r9 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L12
            r0.unlock()
            if (r3 == 0) goto Lc7
            kotlin.jvm.internal.F.m(r5)
            kotlinx.coroutines.channels.I r5 = (kotlinx.coroutines.channels.I) r5
            r5.X0()
        Lc7:
            return r4
        Lc8:
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C2249h.n0(kotlinx.coroutines.selects.f):java.lang.Object");
    }
}
