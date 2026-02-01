package kotlin;

import kotlin.jvm.internal.C2197u;

@K0(markerClass = {InterfaceC2218t.class})
@W2.g
@Y(version = "1.5")
/* loaded from: classes2.dex */
public final class p0 implements Comparable<p0> {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final a f52411F = new a(null);

    /* renamed from: G, reason: collision with root package name */
    public static final byte f52412G = 0;

    /* renamed from: H, reason: collision with root package name */
    public static final byte f52413H = -1;

    /* renamed from: I, reason: collision with root package name */
    public static final int f52414I = 1;

    /* renamed from: J, reason: collision with root package name */
    public static final int f52415J = 8;

    /* renamed from: E, reason: collision with root package name */
    private final byte f52416E;

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
    private /* synthetic */ p0(byte b4) {
        this.f52416E = b4;
    }

    @kotlin.internal.f
    private static final byte A(byte b4) {
        return l((byte) (~b4));
    }

    @kotlin.internal.f
    private static final int B(byte b4, byte b5) {
        return t0.l(t0.l(b4 & 255) - t0.l(b5 & 255));
    }

    @kotlin.internal.f
    private static final long C(byte b4, long j4) {
        return x0.l(x0.l(b4 & 255) - j4);
    }

    @kotlin.internal.f
    private static final int D(byte b4, int i4) {
        return t0.l(t0.l(b4 & 255) - i4);
    }

    @kotlin.internal.f
    private static final int E(byte b4, short s4) {
        return t0.l(t0.l(b4 & 255) - t0.l(s4 & D0.f51794H));
    }

    @kotlin.internal.f
    private static final byte F(byte b4, byte b5) {
        return l((byte) C2204k0.a(t0.l(b4 & 255), t0.l(b5 & 255)));
    }

    @kotlin.internal.f
    private static final long G(byte b4, long j4) {
        return C2206l0.a(x0.l(b4 & 255), j4);
    }

    @kotlin.internal.f
    private static final int H(byte b4, int i4) {
        return C2204k0.a(t0.l(b4 & 255), i4);
    }

    @kotlin.internal.f
    private static final short I(byte b4, short s4) {
        return D0.l((short) C2204k0.a(t0.l(b4 & 255), t0.l(s4 & D0.f51794H)));
    }

    @kotlin.internal.f
    private static final byte J(byte b4, byte b5) {
        return l((byte) (b4 | b5));
    }

    @kotlin.internal.f
    private static final int K(byte b4, byte b5) {
        return t0.l(t0.l(b4 & 255) + t0.l(b5 & 255));
    }

    @kotlin.internal.f
    private static final long L(byte b4, long j4) {
        return x0.l(x0.l(b4 & 255) + j4);
    }

    @kotlin.internal.f
    private static final int M(byte b4, int i4) {
        return t0.l(t0.l(b4 & 255) + i4);
    }

    @kotlin.internal.f
    private static final int N(byte b4, short s4) {
        return t0.l(t0.l(b4 & 255) + t0.l(s4 & D0.f51794H));
    }

    @kotlin.internal.f
    private static final kotlin.ranges.x O(byte b4, byte b5) {
        return new kotlin.ranges.x(t0.l(b4 & 255), t0.l(b5 & 255), null);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final kotlin.ranges.x P(byte b4, byte b5) {
        return kotlin.ranges.B.V(t0.l(b4 & 255), t0.l(b5 & 255));
    }

    @kotlin.internal.f
    private static final int Q(byte b4, byte b5) {
        return C2204k0.a(t0.l(b4 & 255), t0.l(b5 & 255));
    }

    @kotlin.internal.f
    private static final long R(byte b4, long j4) {
        return C2206l0.a(x0.l(b4 & 255), j4);
    }

    @kotlin.internal.f
    private static final int S(byte b4, int i4) {
        return C2204k0.a(t0.l(b4 & 255), i4);
    }

    @kotlin.internal.f
    private static final int T(byte b4, short s4) {
        return C2204k0.a(t0.l(b4 & 255), t0.l(s4 & D0.f51794H));
    }

    @kotlin.internal.f
    private static final int U(byte b4, byte b5) {
        return t0.l(t0.l(b4 & 255) * t0.l(b5 & 255));
    }

    @kotlin.internal.f
    private static final long V(byte b4, long j4) {
        return x0.l(x0.l(b4 & 255) * j4);
    }

    @kotlin.internal.f
    private static final int W(byte b4, int i4) {
        return t0.l(t0.l(b4 & 255) * i4);
    }

    @kotlin.internal.f
    private static final int X(byte b4, short s4) {
        return t0.l(t0.l(b4 & 255) * t0.l(s4 & D0.f51794H));
    }

    @kotlin.internal.f
    private static final byte Y(byte b4) {
        return b4;
    }

    @kotlin.internal.f
    private static final double Z(byte b4) {
        return b4 & 255;
    }

    @kotlin.internal.f
    private static final float a0(byte b4) {
        return b4 & 255;
    }

    @kotlin.internal.f
    private static final byte b(byte b4, byte b5) {
        return l((byte) (b4 & b5));
    }

    @kotlin.internal.f
    private static final int b0(byte b4) {
        return b4 & 255;
    }

    @kotlin.internal.f
    private static final long c0(byte b4) {
        return b4 & 255;
    }

    @kotlin.internal.f
    private static final short d0(byte b4) {
        return (short) (b4 & 255);
    }

    public static final /* synthetic */ p0 e(byte b4) {
        return new p0(b4);
    }

    @l3.d
    public static String e0(byte b4) {
        return String.valueOf(b4 & 255);
    }

    @kotlin.internal.f
    private int f(byte b4) {
        return kotlin.jvm.internal.F.t(j0() & 255, b4 & 255);
    }

    @kotlin.internal.f
    private static final byte f0(byte b4) {
        return b4;
    }

    @kotlin.internal.f
    private static int g(byte b4, byte b5) {
        return kotlin.jvm.internal.F.t(b4 & 255, b5 & 255);
    }

    @kotlin.internal.f
    private static final int g0(byte b4) {
        return t0.l(b4 & 255);
    }

    @kotlin.internal.f
    private static final long h0(byte b4) {
        return x0.l(b4 & 255);
    }

    @kotlin.internal.f
    private static final int i(byte b4, long j4) {
        int compare;
        compare = Long.compare(x0.l(b4 & 255) ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final short i0(byte b4) {
        return D0.l((short) (b4 & 255));
    }

    @kotlin.internal.f
    private static final int j(byte b4, int i4) {
        int compare;
        compare = Integer.compare(t0.l(b4 & 255) ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final int k(byte b4, short s4) {
        return kotlin.jvm.internal.F.t(b4 & 255, s4 & D0.f51794H);
    }

    @kotlin.internal.f
    private static final byte k0(byte b4, byte b5) {
        return l((byte) (b4 ^ b5));
    }

    @kotlin.internal.g
    @U
    public static byte l(byte b4) {
        return b4;
    }

    @kotlin.internal.f
    private static final byte m(byte b4) {
        return l((byte) (b4 - 1));
    }

    @kotlin.internal.f
    private static final int n(byte b4, byte b5) {
        return C2177j0.a(t0.l(b4 & 255), t0.l(b5 & 255));
    }

    @kotlin.internal.f
    private static final long o(byte b4, long j4) {
        return m0.a(x0.l(b4 & 255), j4);
    }

    @kotlin.internal.f
    private static final int p(byte b4, int i4) {
        return C2177j0.a(t0.l(b4 & 255), i4);
    }

    @kotlin.internal.f
    private static final int q(byte b4, short s4) {
        return C2177j0.a(t0.l(b4 & 255), t0.l(s4 & D0.f51794H));
    }

    public static boolean r(byte b4, Object obj) {
        return (obj instanceof p0) && b4 == ((p0) obj).j0();
    }

    public static final boolean s(byte b4, byte b5) {
        return b4 == b5;
    }

    @kotlin.internal.f
    private static final int t(byte b4, byte b5) {
        return C2177j0.a(t0.l(b4 & 255), t0.l(b5 & 255));
    }

    @kotlin.internal.f
    private static final long u(byte b4, long j4) {
        return m0.a(x0.l(b4 & 255), j4);
    }

    @kotlin.internal.f
    private static final int v(byte b4, int i4) {
        return C2177j0.a(t0.l(b4 & 255), i4);
    }

    @kotlin.internal.f
    private static final int w(byte b4, short s4) {
        return C2177j0.a(t0.l(b4 & 255), t0.l(s4 & D0.f51794H));
    }

    @U
    public static /* synthetic */ void x() {
    }

    public static int y(byte b4) {
        return Byte.hashCode(b4);
    }

    @kotlin.internal.f
    private static final byte z(byte b4) {
        return l((byte) (b4 + 1));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(p0 p0Var) {
        return kotlin.jvm.internal.F.t(j0() & 255, p0Var.j0() & 255);
    }

    public boolean equals(Object obj) {
        return r(this.f52416E, obj);
    }

    public int hashCode() {
        return y(this.f52416E);
    }

    public final /* synthetic */ byte j0() {
        return this.f52416E;
    }

    @l3.d
    public String toString() {
        return e0(this.f52416E);
    }
}
