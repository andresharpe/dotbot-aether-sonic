package kotlin;

import kotlin.jvm.internal.C2198v;
import kotlin.jvm.internal.C2201y;

/* loaded from: classes2.dex */
class J extends I {
    @Y(version = "1.2")
    @kotlin.internal.f
    private static final float A0(C2201y c2201y, int i4) {
        kotlin.jvm.internal.F.p(c2201y, "<this>");
        return Float.intBitsToFloat(i4);
    }

    @kotlin.internal.f
    private static final boolean B0(double d4) {
        if (!Double.isInfinite(d4) && !Double.isNaN(d4)) {
            return true;
        }
        return false;
    }

    @kotlin.internal.f
    private static final boolean C0(float f4) {
        if (!Float.isInfinite(f4) && !Float.isNaN(f4)) {
            return true;
        }
        return false;
    }

    @kotlin.internal.f
    private static final boolean D0(double d4) {
        return Double.isInfinite(d4);
    }

    @kotlin.internal.f
    private static final boolean E0(float f4) {
        return Float.isInfinite(f4);
    }

    @kotlin.internal.f
    private static final boolean F0(double d4) {
        return Double.isNaN(d4);
    }

    @kotlin.internal.f
    private static final boolean G0(float f4) {
        return Float.isNaN(f4);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.6")
    @kotlin.internal.f
    private static final int H0(int i4, int i5) {
        return Integer.rotateLeft(i4, i5);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.6")
    @kotlin.internal.f
    private static final long I0(long j4, int i4) {
        return Long.rotateLeft(j4, i4);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.6")
    @kotlin.internal.f
    private static final int J0(int i4, int i5) {
        return Integer.rotateRight(i4, i5);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.6")
    @kotlin.internal.f
    private static final long K0(long j4, int i4) {
        return Long.rotateRight(j4, i4);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int L0(int i4) {
        return Integer.highestOneBit(i4);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final long M0(long j4) {
        return Long.highestOneBit(j4);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int N0(int i4) {
        return Integer.lowestOneBit(i4);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final long O0(long j4) {
        return Long.lowestOneBit(j4);
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final int P0(float f4) {
        return Float.floatToIntBits(f4);
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final long Q0(double d4) {
        return Double.doubleToLongBits(d4);
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final int R0(float f4) {
        return Float.floatToRawIntBits(f4);
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final long S0(double d4) {
        return Double.doubleToRawLongBits(d4);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int t0(int i4) {
        return Integer.numberOfLeadingZeros(i4);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int u0(long j4) {
        return Long.numberOfLeadingZeros(j4);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int v0(int i4) {
        return Integer.bitCount(i4);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int w0(long j4) {
        return Long.bitCount(j4);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int x0(int i4) {
        return Integer.numberOfTrailingZeros(i4);
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int y0(long j4) {
        return Long.numberOfTrailingZeros(j4);
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final double z0(C2198v c2198v, long j4) {
        kotlin.jvm.internal.F.p(c2198v, "<this>");
        return Double.longBitsToDouble(j4);
    }
}
