package kotlin;

import kotlin.jvm.internal.C2197u;

@K0(markerClass = {InterfaceC2218t.class})
@W2.g
@Y(version = "1.5")
/* loaded from: classes2.dex */
public final class x0 implements Comparable<x0> {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final a f52904F = new a(null);

    /* renamed from: G, reason: collision with root package name */
    public static final long f52905G = 0;

    /* renamed from: H, reason: collision with root package name */
    public static final long f52906H = -1;

    /* renamed from: I, reason: collision with root package name */
    public static final int f52907I = 8;

    /* renamed from: J, reason: collision with root package name */
    public static final int f52908J = 64;

    /* renamed from: E, reason: collision with root package name */
    private final long f52909E;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @kotlin.internal.g
    @U
    private /* synthetic */ x0(long j4) {
        this.f52909E = j4;
    }

    @kotlin.internal.f
    private static final long A(long j4) {
        return l(~j4);
    }

    @kotlin.internal.f
    private static final long B(long j4, byte b4) {
        return l(j4 - l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long C(long j4, long j5) {
        return l(j4 - j5);
    }

    @kotlin.internal.f
    private static final long D(long j4, int i4) {
        return l(j4 - l(i4 & 4294967295L));
    }

    @kotlin.internal.f
    private static final long E(long j4, short s4) {
        return l(j4 - l(s4 & 65535));
    }

    @kotlin.internal.f
    private static final byte F(long j4, byte b4) {
        return p0.l((byte) C2206l0.a(j4, l(b4 & 255)));
    }

    @kotlin.internal.f
    private static final long G(long j4, long j5) {
        return C2206l0.a(j4, j5);
    }

    @kotlin.internal.f
    private static final int H(long j4, int i4) {
        return t0.l((int) C2206l0.a(j4, l(i4 & 4294967295L)));
    }

    @kotlin.internal.f
    private static final short I(long j4, short s4) {
        return D0.l((short) C2206l0.a(j4, l(s4 & 65535)));
    }

    @kotlin.internal.f
    private static final long J(long j4, long j5) {
        return l(j4 | j5);
    }

    @kotlin.internal.f
    private static final long K(long j4, byte b4) {
        return l(j4 + l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long L(long j4, long j5) {
        return l(j4 + j5);
    }

    @kotlin.internal.f
    private static final long M(long j4, int i4) {
        return l(j4 + l(i4 & 4294967295L));
    }

    @kotlin.internal.f
    private static final long N(long j4, short s4) {
        return l(j4 + l(s4 & 65535));
    }

    @kotlin.internal.f
    private static final kotlin.ranges.A O(long j4, long j5) {
        return new kotlin.ranges.A(j4, j5, null);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final kotlin.ranges.A P(long j4, long j5) {
        return kotlin.ranges.B.X(j4, j5);
    }

    @kotlin.internal.f
    private static final long Q(long j4, byte b4) {
        return C2206l0.a(j4, l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long R(long j4, long j5) {
        return J0.i(j4, j5);
    }

    @kotlin.internal.f
    private static final long S(long j4, int i4) {
        return C2206l0.a(j4, l(i4 & 4294967295L));
    }

    @kotlin.internal.f
    private static final long T(long j4, short s4) {
        return C2206l0.a(j4, l(s4 & 65535));
    }

    @kotlin.internal.f
    private static final long U(long j4, int i4) {
        return l(j4 << i4);
    }

    @kotlin.internal.f
    private static final long V(long j4, int i4) {
        return l(j4 >>> i4);
    }

    @kotlin.internal.f
    private static final long W(long j4, byte b4) {
        return l(j4 * l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long X(long j4, long j5) {
        return l(j4 * j5);
    }

    @kotlin.internal.f
    private static final long Y(long j4, int i4) {
        return l(j4 * l(i4 & 4294967295L));
    }

    @kotlin.internal.f
    private static final long Z(long j4, short s4) {
        return l(j4 * l(s4 & 65535));
    }

    @kotlin.internal.f
    private static final byte a0(long j4) {
        return (byte) j4;
    }

    @kotlin.internal.f
    private static final long b(long j4, long j5) {
        return l(j4 & j5);
    }

    @kotlin.internal.f
    private static final double b0(long j4) {
        return J0.j(j4);
    }

    @kotlin.internal.f
    private static final float c0(long j4) {
        return (float) J0.j(j4);
    }

    @kotlin.internal.f
    private static final int d0(long j4) {
        return (int) j4;
    }

    public static final /* synthetic */ x0 e(long j4) {
        return new x0(j4);
    }

    @kotlin.internal.f
    private static final long e0(long j4) {
        return j4;
    }

    @kotlin.internal.f
    private static final int f(long j4, byte b4) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, l(b4 & 255) ^ Long.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final short f0(long j4) {
        return (short) j4;
    }

    @kotlin.internal.f
    private int g(long j4) {
        return J0.g(l0(), j4);
    }

    @l3.d
    public static String g0(long j4) {
        return J0.k(j4);
    }

    @kotlin.internal.f
    private static final byte h0(long j4) {
        return p0.l((byte) j4);
    }

    @kotlin.internal.f
    private static int i(long j4, long j5) {
        return J0.g(j4, j5);
    }

    @kotlin.internal.f
    private static final int i0(long j4) {
        return t0.l((int) j4);
    }

    @kotlin.internal.f
    private static final int j(long j4, int i4) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, l(i4 & 4294967295L) ^ Long.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final long j0(long j4) {
        return j4;
    }

    @kotlin.internal.f
    private static final int k(long j4, short s4) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, l(s4 & 65535) ^ Long.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final short k0(long j4) {
        return D0.l((short) j4);
    }

    @kotlin.internal.g
    @U
    public static long l(long j4) {
        return j4;
    }

    @kotlin.internal.f
    private static final long m(long j4) {
        return l(j4 - 1);
    }

    @kotlin.internal.f
    private static final long m0(long j4, long j5) {
        return l(j4 ^ j5);
    }

    @kotlin.internal.f
    private static final long n(long j4, byte b4) {
        return m0.a(j4, l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long o(long j4, long j5) {
        return J0.h(j4, j5);
    }

    @kotlin.internal.f
    private static final long p(long j4, int i4) {
        return m0.a(j4, l(i4 & 4294967295L));
    }

    @kotlin.internal.f
    private static final long q(long j4, short s4) {
        return m0.a(j4, l(s4 & 65535));
    }

    public static boolean r(long j4, Object obj) {
        return (obj instanceof x0) && j4 == ((x0) obj).l0();
    }

    public static final boolean s(long j4, long j5) {
        return j4 == j5;
    }

    @kotlin.internal.f
    private static final long t(long j4, byte b4) {
        return m0.a(j4, l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long u(long j4, long j5) {
        return m0.a(j4, j5);
    }

    @kotlin.internal.f
    private static final long v(long j4, int i4) {
        return m0.a(j4, l(i4 & 4294967295L));
    }

    @kotlin.internal.f
    private static final long w(long j4, short s4) {
        return m0.a(j4, l(s4 & 65535));
    }

    @U
    public static /* synthetic */ void x() {
    }

    public static int y(long j4) {
        return Long.hashCode(j4);
    }

    @kotlin.internal.f
    private static final long z(long j4) {
        return l(j4 + 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(x0 x0Var) {
        return J0.g(l0(), x0Var.l0());
    }

    public boolean equals(Object obj) {
        return r(this.f52909E, obj);
    }

    public int hashCode() {
        return y(this.f52909E);
    }

    public final /* synthetic */ long l0() {
        return this.f52909E;
    }

    @l3.d
    public String toString() {
        return g0(this.f52909E);
    }
}
