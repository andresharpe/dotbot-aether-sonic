package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
public final class B<E> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f54407h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final int f54408i = 30;

    /* renamed from: j, reason: collision with root package name */
    public static final int f54409j = 1073741823;

    /* renamed from: k, reason: collision with root package name */
    public static final int f54410k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final long f54411l = 1073741823;

    /* renamed from: m, reason: collision with root package name */
    public static final int f54412m = 30;

    /* renamed from: n, reason: collision with root package name */
    public static final long f54413n = 1152921503533105152L;

    /* renamed from: o, reason: collision with root package name */
    public static final int f54414o = 60;

    /* renamed from: p, reason: collision with root package name */
    public static final long f54415p = 1152921504606846976L;

    /* renamed from: q, reason: collision with root package name */
    public static final int f54416q = 61;

    /* renamed from: r, reason: collision with root package name */
    public static final long f54417r = 2305843009213693952L;

    /* renamed from: s, reason: collision with root package name */
    public static final int f54418s = 1024;

    /* renamed from: u, reason: collision with root package name */
    public static final int f54420u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f54421v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f54422w = 2;

    @l3.d
    private volatile /* synthetic */ Object _next = null;

    @l3.d
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int f54423a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f54424b;

    /* renamed from: c, reason: collision with root package name */
    private final int f54425c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private /* synthetic */ AtomicReferenceArray f54426d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    public static final a f54404e = new a(null);

    /* renamed from: t, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final S f54419t = new S("REMOVE_FROZEN");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54405f = AtomicReferenceFieldUpdater.newUpdater(B.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f54406g = AtomicLongFieldUpdater.newUpdater(B.class, "_state");

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public final int a(long j4) {
            return (j4 & B.f54417r) != 0 ? 2 : 1;
        }

        public final long b(long j4, int i4) {
            return e(j4, B.f54411l) | i4;
        }

        public final long c(long j4, int i4) {
            return e(j4, B.f54413n) | (i4 << 30);
        }

        public final <T> T d(long j4, @l3.d X2.p<? super Integer, ? super Integer, ? extends T> pVar) {
            return pVar.c0(Integer.valueOf((int) (B.f54411l & j4)), Integer.valueOf((int) ((j4 & B.f54413n) >> 30)));
        }

        public final long e(long j4, long j5) {
            return j4 & (~j5);
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @W2.f
        public final int f54427a;

        public b(int i4) {
            this.f54427a = i4;
        }
    }

    public B(int i4, boolean z3) {
        this.f54423a = i4;
        this.f54424b = z3;
        int i5 = i4 - 1;
        this.f54425c = i5;
        this.f54426d = new AtomicReferenceArray(i4);
        if (i5 <= 1073741823) {
            if ((i4 & i5) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final B<E> b(long j4) {
        B<E> b4 = new B<>(this.f54423a * 2, this.f54424b);
        int i4 = (int) (f54411l & j4);
        int i5 = (int) ((f54413n & j4) >> 30);
        while (true) {
            int i6 = this.f54425c;
            if ((i4 & i6) != (i5 & i6)) {
                Object obj = this.f54426d.get(i6 & i4);
                if (obj == null) {
                    obj = new b(i4);
                }
                b4.f54426d.set(b4.f54425c & i4, obj);
                i4++;
            } else {
                b4._state = f54404e.e(j4, f54415p);
                return b4;
            }
        }
    }

    private final B<E> c(long j4) {
        while (true) {
            B<E> b4 = (B) this._next;
            if (b4 != null) {
                return b4;
            }
            androidx.concurrent.futures.b.a(f54405f, this, null, b(j4));
        }
    }

    private final B<E> e(int i4, E e4) {
        Object obj = this.f54426d.get(this.f54425c & i4);
        if ((obj instanceof b) && ((b) obj).f54427a == i4) {
            this.f54426d.set(i4 & this.f54425c, e4);
            return this;
        }
        return null;
    }

    private final long j() {
        long j4;
        long j5;
        do {
            j4 = this._state;
            if ((j4 & f54415p) != 0) {
                return j4;
            }
            j5 = j4 | f54415p;
        } while (!f54406g.compareAndSet(this, j4, j5));
        return j5;
    }

    private final B<E> m(int i4, int i5) {
        long j4;
        int i6;
        do {
            j4 = this._state;
            i6 = (int) (f54411l & j4);
            if ((f54415p & j4) != 0) {
                return k();
            }
        } while (!f54406g.compareAndSet(this, j4, f54404e.b(j4, i5)));
        this.f54426d.set(i6 & this.f54425c, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(@l3.d E r12) {
        /*
            r11 = this;
        L0:
            long r2 = r11._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L12
            kotlinx.coroutines.internal.B$a r12 = kotlinx.coroutines.internal.B.f54404e
            int r12 = r12.a(r2)
            return r12
        L12:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            int r0 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r1 = 30
            long r4 = r4 >> r1
            int r8 = (int) r4
            int r9 = r11.f54425c
            int r1 = r8 + 2
            r1 = r1 & r9
            r4 = r0 & r9
            r5 = 1
            if (r1 != r4) goto L2c
            return r5
        L2c:
            boolean r1 = r11.f54424b
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L4b
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r11.f54426d
            r10 = r8 & r9
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L4b
            int r1 = r11.f54423a
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 < r2) goto L4a
            int r8 = r8 - r0
            r0 = r8 & r4
            int r1 = r1 >> 1
            if (r0 <= r1) goto L0
        L4a:
            return r5
        L4b:
            int r0 = r8 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.B.f54406g
            kotlinx.coroutines.internal.B$a r4 = kotlinx.coroutines.internal.B.f54404e
            long r4 = r4.c(r2, r0)
            r0 = r1
            r1 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r11.f54426d
            r1 = r8 & r9
            r0.set(r1, r12)
            r0 = r11
        L66:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L79
            kotlinx.coroutines.internal.B r0 = r0.k()
            kotlinx.coroutines.internal.B r0 = r0.e(r8, r12)
            if (r0 != 0) goto L66
        L79:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.B.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j4;
        do {
            j4 = this._state;
            if ((j4 & f54417r) != 0) {
                return true;
            }
            if ((f54415p & j4) != 0) {
                return false;
            }
        } while (!f54406g.compareAndSet(this, j4, j4 | f54417r));
        return true;
    }

    public final int f() {
        long j4 = this._state;
        return (((int) ((j4 & f54413n) >> 30)) - ((int) (f54411l & j4))) & f54409j;
    }

    public final boolean g() {
        if ((this._state & f54417r) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        long j4 = this._state;
        if (((int) (f54411l & j4)) == ((int) ((j4 & f54413n) >> 30))) {
            return true;
        }
        return false;
    }

    @l3.d
    public final <R> List<R> i(@l3.d X2.l<? super E, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(this.f54423a);
        long j4 = this._state;
        int i4 = (int) (f54411l & j4);
        int i5 = (int) ((j4 & f54413n) >> 30);
        while (true) {
            int i6 = this.f54425c;
            if ((i4 & i6) != (i5 & i6)) {
                A1.a aVar = (Object) this.f54426d.get(i6 & i4);
                if (aVar != null && !(aVar instanceof b)) {
                    arrayList.add(lVar.C(aVar));
                }
                i4++;
            } else {
                return arrayList;
            }
        }
    }

    @l3.d
    public final B<E> k() {
        return c(j());
    }

    @l3.e
    public final Object l() {
        while (true) {
            long j4 = this._state;
            if ((f54415p & j4) != 0) {
                return f54419t;
            }
            int i4 = (int) (f54411l & j4);
            int i5 = (int) ((f54413n & j4) >> 30);
            int i6 = this.f54425c;
            if ((i5 & i6) == (i4 & i6)) {
                return null;
            }
            Object obj = this.f54426d.get(i6 & i4);
            if (obj == null) {
                if (this.f54424b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i7 = (i4 + 1) & f54409j;
                if (f54406g.compareAndSet(this, j4, f54404e.b(j4, i7))) {
                    this.f54426d.set(this.f54425c & i4, null);
                    return obj;
                }
                if (this.f54424b) {
                    B<E> b4 = this;
                    do {
                        b4 = b4.m(i4, i7);
                    } while (b4 != null);
                    return obj;
                }
            }
        }
    }
}
