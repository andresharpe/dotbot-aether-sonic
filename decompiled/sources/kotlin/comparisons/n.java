package kotlin.comparisons;

import kotlin.D0;
import kotlin.E0;
import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.q0;
import kotlin.u0;
import kotlin.y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class n {
    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final short a(short s4, short s5) {
        if (F.t(s4 & D0.f51794H, 65535 & s5) < 0) {
            return s5;
        }
        return s4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static int b(int i4, int i5) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        if (compare < 0) {
            return i5;
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final byte c(byte b4, byte b5) {
        if (F.t(b4 & 255, b5 & 255) < 0) {
            return b5;
        }
        return b4;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final int d(int i4, @l3.d int... other) {
        F.p(other, "other");
        int r4 = u0.r(other);
        for (int i5 = 0; i5 < r4; i5++) {
            i4 = b(i4, u0.p(other, i5));
        }
        return i4;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final long e(long j4, @l3.d long... other) {
        F.p(other, "other");
        int r4 = y0.r(other);
        for (int i4 = 0; i4 < r4; i4++) {
            j4 = j(j4, y0.p(other, i4));
        }
        return j4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final short f(short s4, short s5, short s6) {
        return a(s4, a(s5, s6));
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int g(int i4, int i5, int i6) {
        int b4;
        int b5;
        b4 = b(i5, i6);
        b5 = b(i4, b4);
        return b5;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final byte h(byte b4, @l3.d byte... other) {
        F.p(other, "other");
        int r4 = q0.r(other);
        for (int i4 = 0; i4 < r4; i4++) {
            b4 = c(b4, q0.p(other, i4));
        }
        return b4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final byte i(byte b4, byte b5, byte b6) {
        return c(b4, c(b5, b6));
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static long j(long j4, long j5) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        if (compare < 0) {
            return j5;
        }
        return j4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long k(long j4, long j5, long j6) {
        long j7;
        long j8;
        j7 = j(j5, j6);
        j8 = j(j4, j7);
        return j8;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final short l(short s4, @l3.d short... other) {
        F.p(other, "other");
        int r4 = E0.r(other);
        for (int i4 = 0; i4 < r4; i4++) {
            s4 = a(s4, E0.p(other, i4));
        }
        return s4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final short m(short s4, short s5) {
        if (F.t(s4 & D0.f51794H, 65535 & s5) > 0) {
            return s5;
        }
        return s4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static int n(int i4, int i5) {
        int compare;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return i5;
        }
        return i4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static final byte o(byte b4, byte b5) {
        if (F.t(b4 & 255, b5 & 255) > 0) {
            return b5;
        }
        return b4;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final int p(int i4, @l3.d int... other) {
        F.p(other, "other");
        int r4 = u0.r(other);
        for (int i5 = 0; i5 < r4; i5++) {
            i4 = n(i4, u0.p(other, i5));
        }
        return i4;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final long q(long j4, @l3.d long... other) {
        F.p(other, "other");
        int r4 = y0.r(other);
        for (int i4 = 0; i4 < r4; i4++) {
            j4 = v(j4, y0.p(other, i4));
        }
        return j4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final short r(short s4, short s5, short s6) {
        return m(s4, m(s5, s6));
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int s(int i4, int i5, int i6) {
        int n4;
        int n5;
        n4 = n(i5, i6);
        n5 = n(i4, n4);
        return n5;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final byte t(byte b4, @l3.d byte... other) {
        F.p(other, "other");
        int r4 = q0.r(other);
        for (int i4 = 0; i4 < r4; i4++) {
            b4 = o(b4, q0.p(other, i4));
        }
        return b4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final byte u(byte b4, byte b5, byte b6) {
        return o(b4, o(b5, b6));
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    public static long v(long j4, long j5) {
        int compare;
        compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        if (compare > 0) {
            return j5;
        }
        return j4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long w(long j4, long j5, long j6) {
        long v3;
        long v4;
        v3 = v(j5, j6);
        v4 = v(j4, v3);
        return v4;
    }

    @InterfaceC2218t
    @Y(version = "1.4")
    public static final short x(short s4, @l3.d short... other) {
        F.p(other, "other");
        int r4 = E0.r(other);
        for (int i4 = 0; i4 < r4; i4++) {
            s4 = m(s4, E0.p(other, i4));
        }
        return s4;
    }
}
