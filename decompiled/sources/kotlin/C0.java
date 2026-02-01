package kotlin;

@W2.i(name = "UNumbersKt")
/* loaded from: classes2.dex */
public final class C0 {
    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int A(int i4) {
        return t0.l(Integer.lowestOneBit(i4));
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final short B(short s4) {
        return D0.l((short) Integer.lowestOneBit(s4 & D0.f51794H));
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int a(byte b4) {
        return Integer.numberOfLeadingZeros(b4 & 255) - 24;
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int b(long j4) {
        return Long.numberOfLeadingZeros(j4);
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int c(int i4) {
        return Integer.numberOfLeadingZeros(i4);
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int d(short s4) {
        return Integer.numberOfLeadingZeros(s4 & D0.f51794H) - 16;
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int e(byte b4) {
        return Integer.bitCount(t0.l(b4 & 255));
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int f(long j4) {
        return Long.bitCount(j4);
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int g(int i4) {
        return Integer.bitCount(i4);
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int h(short s4) {
        return Integer.bitCount(t0.l(s4 & D0.f51794H));
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int i(byte b4) {
        return Integer.numberOfTrailingZeros(b4 | 256);
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int j(long j4) {
        return Long.numberOfTrailingZeros(j4);
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int k(int i4) {
        return Integer.numberOfTrailingZeros(i4);
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int l(short s4) {
        return Integer.numberOfTrailingZeros(s4 | 65536);
    }

    @K0(markerClass = {r.class, InterfaceC2218t.class})
    @Y(version = "1.6")
    @kotlin.internal.f
    private static final long m(long j4, int i4) {
        return x0.l(Long.rotateLeft(j4, i4));
    }

    @K0(markerClass = {r.class, InterfaceC2218t.class})
    @Y(version = "1.6")
    @kotlin.internal.f
    private static final byte n(byte b4, int i4) {
        return p0.l(K.Z0(b4, i4));
    }

    @K0(markerClass = {r.class, InterfaceC2218t.class})
    @Y(version = "1.6")
    @kotlin.internal.f
    private static final int o(int i4, int i5) {
        return t0.l(Integer.rotateLeft(i4, i5));
    }

    @K0(markerClass = {r.class, InterfaceC2218t.class})
    @Y(version = "1.6")
    @kotlin.internal.f
    private static final short p(short s4, int i4) {
        return D0.l(K.a1(s4, i4));
    }

    @K0(markerClass = {r.class, InterfaceC2218t.class})
    @Y(version = "1.6")
    @kotlin.internal.f
    private static final long q(long j4, int i4) {
        return x0.l(Long.rotateRight(j4, i4));
    }

    @K0(markerClass = {r.class, InterfaceC2218t.class})
    @Y(version = "1.6")
    @kotlin.internal.f
    private static final byte r(byte b4, int i4) {
        return p0.l(K.b1(b4, i4));
    }

    @K0(markerClass = {r.class, InterfaceC2218t.class})
    @Y(version = "1.6")
    @kotlin.internal.f
    private static final int s(int i4, int i5) {
        return t0.l(Integer.rotateRight(i4, i5));
    }

    @K0(markerClass = {r.class, InterfaceC2218t.class})
    @Y(version = "1.6")
    @kotlin.internal.f
    private static final short t(short s4, int i4) {
        return D0.l(K.c1(s4, i4));
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final byte u(byte b4) {
        return p0.l((byte) Integer.highestOneBit(b4 & 255));
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long v(long j4) {
        return x0.l(Long.highestOneBit(j4));
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int w(int i4) {
        return t0.l(Integer.highestOneBit(i4));
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final short x(short s4) {
        return D0.l((short) Integer.highestOneBit(s4 & D0.f51794H));
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final byte y(byte b4) {
        return p0.l((byte) Integer.lowestOneBit(b4 & 255));
    }

    @K0(markerClass = {InterfaceC2218t.class, r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long z(long j4) {
        return x0.l(Long.lowestOneBit(j4));
    }
}
