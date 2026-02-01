package kotlin;

import kotlin.jvm.internal.C2197u;

@K0(markerClass = {InterfaceC2218t.class})
@W2.g
@Y(version = "1.5")
/* loaded from: classes2.dex */
public final class t0 implements Comparable<t0> {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final a f52701F = new a(null);

    /* renamed from: G, reason: collision with root package name */
    public static final int f52702G = 0;

    /* renamed from: H, reason: collision with root package name */
    public static final int f52703H = -1;

    /* renamed from: I, reason: collision with root package name */
    public static final int f52704I = 4;

    /* renamed from: J, reason: collision with root package name */
    public static final int f52705J = 32;

    /* renamed from: E, reason: collision with root package name */
    private final int f52706E;

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
    private /* synthetic */ t0(int i4) {
        this.f52706E = i4;
    }

    @kotlin.internal.f
    private static final int A(int i4) {
        return l(~i4);
    }

    @kotlin.internal.f
    private static final int B(int i4, byte b4) {
        return l(i4 - l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long C(int i4, long j4) {
        return x0.l(x0.l(i4 & 4294967295L) - j4);
    }

    @kotlin.internal.f
    private static final int D(int i4, int i5) {
        return l(i4 - i5);
    }

    @kotlin.internal.f
    private static final int E(int i4, short s4) {
        return l(i4 - l(s4 & D0.f51794H));
    }

    @kotlin.internal.f
    private static final byte F(int i4, byte b4) {
        return p0.l((byte) C2204k0.a(i4, l(b4 & 255)));
    }

    @kotlin.internal.f
    private static final long G(int i4, long j4) {
        return C2206l0.a(x0.l(i4 & 4294967295L), j4);
    }

    @kotlin.internal.f
    private static final int H(int i4, int i5) {
        return C2204k0.a(i4, i5);
    }

    @kotlin.internal.f
    private static final short I(int i4, short s4) {
        return D0.l((short) C2204k0.a(i4, l(s4 & D0.f51794H)));
    }

    @kotlin.internal.f
    private static final int J(int i4, int i5) {
        return l(i4 | i5);
    }

    @kotlin.internal.f
    private static final int K(int i4, byte b4) {
        return l(i4 + l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long L(int i4, long j4) {
        return x0.l(x0.l(i4 & 4294967295L) + j4);
    }

    @kotlin.internal.f
    private static final int M(int i4, int i5) {
        return l(i4 + i5);
    }

    @kotlin.internal.f
    private static final int N(int i4, short s4) {
        return l(i4 + l(s4 & D0.f51794H));
    }

    @kotlin.internal.f
    private static final kotlin.ranges.x O(int i4, int i5) {
        return new kotlin.ranges.x(i4, i5, null);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final kotlin.ranges.x P(int i4, int i5) {
        return kotlin.ranges.B.V(i4, i5);
    }

    @kotlin.internal.f
    private static final int Q(int i4, byte b4) {
        return C2204k0.a(i4, l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long R(int i4, long j4) {
        return C2206l0.a(x0.l(i4 & 4294967295L), j4);
    }

    @kotlin.internal.f
    private static final int S(int i4, int i5) {
        return J0.e(i4, i5);
    }

    @kotlin.internal.f
    private static final int T(int i4, short s4) {
        return C2204k0.a(i4, l(s4 & D0.f51794H));
    }

    @kotlin.internal.f
    private static final int U(int i4, int i5) {
        return l(i4 << i5);
    }

    @kotlin.internal.f
    private static final int V(int i4, int i5) {
        return l(i4 >>> i5);
    }

    @kotlin.internal.f
    private static final int W(int i4, byte b4) {
        return l(i4 * l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long X(int i4, long j4) {
        return x0.l(x0.l(i4 & 4294967295L) * j4);
    }

    @kotlin.internal.f
    private static final int Y(int i4, int i5) {
        return l(i4 * i5);
    }

    @kotlin.internal.f
    private static final int Z(int i4, short s4) {
        return l(i4 * l(s4 & D0.f51794H));
    }

    @kotlin.internal.f
    private static final byte a0(int i4) {
        return (byte) i4;
    }

    @kotlin.internal.f
    private static final int b(int i4, int i5) {
        return l(i4 & i5);
    }

    @kotlin.internal.f
    private static final double b0(int i4) {
        return J0.f(i4);
    }

    @kotlin.internal.f
    private static final float c0(int i4) {
        return (float) J0.f(i4);
    }

    @kotlin.internal.f
    private static final int d0(int i4) {
        return i4;
    }

    public static final /* synthetic */ t0 e(int i4) {
        return new t0(i4);
    }

    @kotlin.internal.f
    private static final long e0(int i4) {
        return i4 & 4294967295L;
    }

    @kotlin.internal.f
    private static final int f(int i4, byte b4) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, l(b4 & 255) ^ Integer.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final short f0(int i4) {
        return (short) i4;
    }

    @kotlin.internal.f
    private static final int g(int i4, long j4) {
        int compare;
        compare = Long.compare(x0.l(i4 & 4294967295L) ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
        return compare;
    }

    @l3.d
    public static String g0(int i4) {
        return String.valueOf(i4 & 4294967295L);
    }

    @kotlin.internal.f
    private static final byte h0(int i4) {
        return p0.l((byte) i4);
    }

    @kotlin.internal.f
    private int i(int i4) {
        return J0.c(l0(), i4);
    }

    @kotlin.internal.f
    private static final int i0(int i4) {
        return i4;
    }

    @kotlin.internal.f
    private static int j(int i4, int i5) {
        return J0.c(i4, i5);
    }

    @kotlin.internal.f
    private static final long j0(int i4) {
        return x0.l(i4 & 4294967295L);
    }

    @kotlin.internal.f
    private static final int k(int i4, short s4) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, l(s4 & D0.f51794H) ^ Integer.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final short k0(int i4) {
        return D0.l((short) i4);
    }

    @kotlin.internal.g
    @U
    public static int l(int i4) {
        return i4;
    }

    @kotlin.internal.f
    private static final int m(int i4) {
        return l(i4 - 1);
    }

    @kotlin.internal.f
    private static final int m0(int i4, int i5) {
        return l(i4 ^ i5);
    }

    @kotlin.internal.f
    private static final int n(int i4, byte b4) {
        return C2177j0.a(i4, l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long o(int i4, long j4) {
        return m0.a(x0.l(i4 & 4294967295L), j4);
    }

    @kotlin.internal.f
    private static final int p(int i4, int i5) {
        return J0.d(i4, i5);
    }

    @kotlin.internal.f
    private static final int q(int i4, short s4) {
        return C2177j0.a(i4, l(s4 & D0.f51794H));
    }

    public static boolean r(int i4, Object obj) {
        return (obj instanceof t0) && i4 == ((t0) obj).l0();
    }

    public static final boolean s(int i4, int i5) {
        return i4 == i5;
    }

    @kotlin.internal.f
    private static final int t(int i4, byte b4) {
        return C2177j0.a(i4, l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long u(int i4, long j4) {
        return m0.a(x0.l(i4 & 4294967295L), j4);
    }

    @kotlin.internal.f
    private static final int v(int i4, int i5) {
        return C2177j0.a(i4, i5);
    }

    @kotlin.internal.f
    private static final int w(int i4, short s4) {
        return C2177j0.a(i4, l(s4 & D0.f51794H));
    }

    @U
    public static /* synthetic */ void x() {
    }

    public static int y(int i4) {
        return Integer.hashCode(i4);
    }

    @kotlin.internal.f
    private static final int z(int i4) {
        return l(i4 + 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(t0 t0Var) {
        return J0.c(l0(), t0Var.l0());
    }

    public boolean equals(Object obj) {
        return r(this.f52706E, obj);
    }

    public int hashCode() {
        return y(this.f52706E);
    }

    public final /* synthetic */ int l0() {
        return this.f52706E;
    }

    @l3.d
    public String toString() {
        return g0(this.f52706E);
    }
}
