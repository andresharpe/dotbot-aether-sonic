package kotlin;

/* loaded from: classes2.dex */
class K extends J {
    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int T0(byte b4) {
        return Integer.numberOfLeadingZeros(b4 & 255) - 24;
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int U0(short s4) {
        return Integer.numberOfLeadingZeros(s4 & D0.f51794H) - 16;
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int V0(byte b4) {
        return Integer.bitCount(b4 & 255);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int W0(short s4) {
        return Integer.bitCount(s4 & D0.f51794H);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int X0(byte b4) {
        return Integer.numberOfTrailingZeros(b4 | 256);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int Y0(short s4) {
        return Integer.numberOfTrailingZeros(s4 | 65536);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.6")
    public static final byte Z0(byte b4, int i4) {
        int i5 = i4 & 7;
        return (byte) (((b4 & 255) >>> (8 - i5)) | (b4 << i5));
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.6")
    public static final short a1(short s4, int i4) {
        int i5 = i4 & 15;
        return (short) (((s4 & 65535) >>> (16 - i5)) | (s4 << i5));
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.6")
    public static final byte b1(byte b4, int i4) {
        int i5 = i4 & 7;
        return (byte) (((b4 & 255) >>> i5) | (b4 << (8 - i5)));
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.6")
    public static final short c1(short s4, int i4) {
        int i5 = i4 & 15;
        return (short) (((s4 & 65535) >>> i5) | (s4 << (16 - i5)));
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final byte d1(byte b4) {
        return (byte) Integer.highestOneBit(b4 & 255);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final short e1(short s4) {
        return (short) Integer.highestOneBit(s4 & D0.f51794H);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final byte f1(byte b4) {
        return (byte) Integer.lowestOneBit(b4);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final short g1(short s4) {
        return (short) Integer.lowestOneBit(s4);
    }
}
