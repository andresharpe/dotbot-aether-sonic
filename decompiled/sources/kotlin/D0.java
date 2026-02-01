package kotlin;

import kotlin.jvm.internal.C2197u;

@K0(markerClass = {InterfaceC2218t.class})
@W2.g
@Y(version = "1.5")
/* loaded from: classes2.dex */
public final class D0 implements Comparable<D0> {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final a f51792F = new a(null);

    /* renamed from: G, reason: collision with root package name */
    public static final short f51793G = 0;

    /* renamed from: H, reason: collision with root package name */
    public static final short f51794H = -1;

    /* renamed from: I, reason: collision with root package name */
    public static final int f51795I = 2;

    /* renamed from: J, reason: collision with root package name */
    public static final int f51796J = 16;

    /* renamed from: E, reason: collision with root package name */
    private final short f51797E;

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
    private /* synthetic */ D0(short s4) {
        this.f51797E = s4;
    }

    @kotlin.internal.f
    private static final short A(short s4) {
        return l((short) (~s4));
    }

    @kotlin.internal.f
    private static final int B(short s4, byte b4) {
        return t0.l(t0.l(s4 & f51794H) - t0.l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long C(short s4, long j4) {
        return x0.l(x0.l(s4 & 65535) - j4);
    }

    @kotlin.internal.f
    private static final int D(short s4, int i4) {
        return t0.l(t0.l(s4 & f51794H) - i4);
    }

    @kotlin.internal.f
    private static final int E(short s4, short s5) {
        return t0.l(t0.l(s4 & f51794H) - t0.l(s5 & f51794H));
    }

    @kotlin.internal.f
    private static final byte F(short s4, byte b4) {
        return p0.l((byte) C2204k0.a(t0.l(s4 & f51794H), t0.l(b4 & 255)));
    }

    @kotlin.internal.f
    private static final long G(short s4, long j4) {
        return C2206l0.a(x0.l(s4 & 65535), j4);
    }

    @kotlin.internal.f
    private static final int H(short s4, int i4) {
        return C2204k0.a(t0.l(s4 & f51794H), i4);
    }

    @kotlin.internal.f
    private static final short I(short s4, short s5) {
        return l((short) C2204k0.a(t0.l(s4 & f51794H), t0.l(s5 & f51794H)));
    }

    @kotlin.internal.f
    private static final short J(short s4, short s5) {
        return l((short) (s4 | s5));
    }

    @kotlin.internal.f
    private static final int K(short s4, byte b4) {
        return t0.l(t0.l(s4 & f51794H) + t0.l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long L(short s4, long j4) {
        return x0.l(x0.l(s4 & 65535) + j4);
    }

    @kotlin.internal.f
    private static final int M(short s4, int i4) {
        return t0.l(t0.l(s4 & f51794H) + i4);
    }

    @kotlin.internal.f
    private static final int N(short s4, short s5) {
        return t0.l(t0.l(s4 & f51794H) + t0.l(s5 & f51794H));
    }

    @kotlin.internal.f
    private static final kotlin.ranges.x O(short s4, short s5) {
        return new kotlin.ranges.x(t0.l(s4 & f51794H), t0.l(s5 & f51794H), null);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final kotlin.ranges.x P(short s4, short s5) {
        return kotlin.ranges.B.V(t0.l(s4 & f51794H), t0.l(s5 & f51794H));
    }

    @kotlin.internal.f
    private static final int Q(short s4, byte b4) {
        return C2204k0.a(t0.l(s4 & f51794H), t0.l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long R(short s4, long j4) {
        return C2206l0.a(x0.l(s4 & 65535), j4);
    }

    @kotlin.internal.f
    private static final int S(short s4, int i4) {
        return C2204k0.a(t0.l(s4 & f51794H), i4);
    }

    @kotlin.internal.f
    private static final int T(short s4, short s5) {
        return C2204k0.a(t0.l(s4 & f51794H), t0.l(s5 & f51794H));
    }

    @kotlin.internal.f
    private static final int U(short s4, byte b4) {
        return t0.l(t0.l(s4 & f51794H) * t0.l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long V(short s4, long j4) {
        return x0.l(x0.l(s4 & 65535) * j4);
    }

    @kotlin.internal.f
    private static final int W(short s4, int i4) {
        return t0.l(t0.l(s4 & f51794H) * i4);
    }

    @kotlin.internal.f
    private static final int X(short s4, short s5) {
        return t0.l(t0.l(s4 & f51794H) * t0.l(s5 & f51794H));
    }

    @kotlin.internal.f
    private static final byte Y(short s4) {
        return (byte) s4;
    }

    @kotlin.internal.f
    private static final double Z(short s4) {
        return s4 & f51794H;
    }

    @kotlin.internal.f
    private static final float a0(short s4) {
        return s4 & f51794H;
    }

    @kotlin.internal.f
    private static final short b(short s4, short s5) {
        return l((short) (s4 & s5));
    }

    @kotlin.internal.f
    private static final int b0(short s4) {
        return s4 & f51794H;
    }

    @kotlin.internal.f
    private static final long c0(short s4) {
        return s4 & 65535;
    }

    @kotlin.internal.f
    private static final short d0(short s4) {
        return s4;
    }

    public static final /* synthetic */ D0 e(short s4) {
        return new D0(s4);
    }

    @l3.d
    public static String e0(short s4) {
        return String.valueOf(s4 & f51794H);
    }

    @kotlin.internal.f
    private static final int f(short s4, byte b4) {
        return kotlin.jvm.internal.F.t(s4 & f51794H, b4 & 255);
    }

    @kotlin.internal.f
    private static final byte f0(short s4) {
        return p0.l((byte) s4);
    }

    @kotlin.internal.f
    private static final int g(short s4, long j4) {
        int compare;
        compare = Long.compare(x0.l(s4 & 65535) ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final int g0(short s4) {
        return t0.l(s4 & f51794H);
    }

    @kotlin.internal.f
    private static final long h0(short s4) {
        return x0.l(s4 & 65535);
    }

    @kotlin.internal.f
    private static final int i(short s4, int i4) {
        int compare;
        compare = Integer.compare(t0.l(s4 & f51794H) ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final short i0(short s4) {
        return s4;
    }

    @kotlin.internal.f
    private int j(short s4) {
        return kotlin.jvm.internal.F.t(j0() & f51794H, s4 & f51794H);
    }

    @kotlin.internal.f
    private static int k(short s4, short s5) {
        return kotlin.jvm.internal.F.t(s4 & f51794H, s5 & f51794H);
    }

    @kotlin.internal.f
    private static final short k0(short s4, short s5) {
        return l((short) (s4 ^ s5));
    }

    @kotlin.internal.g
    @U
    public static short l(short s4) {
        return s4;
    }

    @kotlin.internal.f
    private static final short m(short s4) {
        return l((short) (s4 - 1));
    }

    @kotlin.internal.f
    private static final int n(short s4, byte b4) {
        return C2177j0.a(t0.l(s4 & f51794H), t0.l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long o(short s4, long j4) {
        return m0.a(x0.l(s4 & 65535), j4);
    }

    @kotlin.internal.f
    private static final int p(short s4, int i4) {
        return C2177j0.a(t0.l(s4 & f51794H), i4);
    }

    @kotlin.internal.f
    private static final int q(short s4, short s5) {
        return C2177j0.a(t0.l(s4 & f51794H), t0.l(s5 & f51794H));
    }

    public static boolean r(short s4, Object obj) {
        return (obj instanceof D0) && s4 == ((D0) obj).j0();
    }

    public static final boolean s(short s4, short s5) {
        return s4 == s5;
    }

    @kotlin.internal.f
    private static final int t(short s4, byte b4) {
        return C2177j0.a(t0.l(s4 & f51794H), t0.l(b4 & 255));
    }

    @kotlin.internal.f
    private static final long u(short s4, long j4) {
        return m0.a(x0.l(s4 & 65535), j4);
    }

    @kotlin.internal.f
    private static final int v(short s4, int i4) {
        return C2177j0.a(t0.l(s4 & f51794H), i4);
    }

    @kotlin.internal.f
    private static final int w(short s4, short s5) {
        return C2177j0.a(t0.l(s4 & f51794H), t0.l(s5 & f51794H));
    }

    @U
    public static /* synthetic */ void x() {
    }

    public static int y(short s4) {
        return Short.hashCode(s4);
    }

    @kotlin.internal.f
    private static final short z(short s4) {
        return l((short) (s4 + 1));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(D0 d02) {
        return kotlin.jvm.internal.F.t(j0() & f51794H, d02.j0() & f51794H);
    }

    public boolean equals(Object obj) {
        return r(this.f51797E, obj);
    }

    public int hashCode() {
        return y(this.f51797E);
    }

    public final /* synthetic */ short j0() {
        return this.f51797E;
    }

    @l3.d
    public String toString() {
        return e0(this.f51797E);
    }
}
