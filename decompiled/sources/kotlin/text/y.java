package kotlin.text;

import kotlin.Y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class y extends x {
    @l3.d
    public static final Void U0(@l3.d String input) {
        kotlin.jvm.internal.F.p(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    @l3.e
    @Y(version = "1.1")
    public static final Byte V0(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return W0(str, 10);
    }

    @l3.e
    @Y(version = "1.1")
    public static final Byte W0(@l3.d String str, int i4) {
        Integer Y02;
        int intValue;
        kotlin.jvm.internal.F.p(str, "<this>");
        Y02 = Y0(str, i4);
        if (Y02 == null || (intValue = Y02.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    @l3.e
    @Y(version = "1.1")
    public static Integer X0(@l3.d String str) {
        Integer Y02;
        kotlin.jvm.internal.F.p(str, "<this>");
        Y02 = Y0(str, 10);
        return Y02;
    }

    @l3.e
    @Y(version = "1.1")
    public static Integer Y0(@l3.d String str, int i4) {
        boolean z3;
        int i5;
        int i6;
        kotlin.jvm.internal.F.p(str, "<this>");
        C2220b.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char charAt = str.charAt(0);
        int i8 = -2147483647;
        if (kotlin.jvm.internal.F.t(charAt, 48) < 0) {
            i5 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i8 = Integer.MIN_VALUE;
                z3 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z3 = false;
            }
        } else {
            z3 = false;
            i5 = 0;
        }
        int i9 = -59652323;
        while (i5 < length) {
            int b4 = C2220b.b(str.charAt(i5), i4);
            if (b4 < 0) {
                return null;
            }
            if ((i7 < i9 && (i9 != -59652323 || i7 < (i9 = i8 / i4))) || (i6 = i7 * i4) < i8 + b4) {
                return null;
            }
            i7 = i6 - b4;
            i5++;
        }
        if (z3) {
            return Integer.valueOf(i7);
        }
        return Integer.valueOf(-i7);
    }

    @l3.e
    @Y(version = "1.1")
    public static Long Z0(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return a1(str, 10);
    }

    @l3.e
    @Y(version = "1.1")
    public static final Long a1(@l3.d String str, int i4) {
        boolean z3;
        kotlin.jvm.internal.F.p(str, "<this>");
        C2220b.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        long j4 = -9223372036854775807L;
        if (kotlin.jvm.internal.F.t(charAt, 48) < 0) {
            z3 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j4 = Long.MIN_VALUE;
                i5 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z3 = false;
                i5 = 1;
            }
        } else {
            z3 = false;
        }
        long j5 = -256204778801521550L;
        long j6 = 0;
        long j7 = -256204778801521550L;
        while (i5 < length) {
            int b4 = C2220b.b(str.charAt(i5), i4);
            if (b4 < 0) {
                return null;
            }
            if (j6 < j7) {
                if (j7 == j5) {
                    j7 = j4 / i4;
                    if (j6 < j7) {
                    }
                }
                return null;
            }
            long j8 = j6 * i4;
            long j9 = b4;
            if (j8 < j4 + j9) {
                return null;
            }
            j6 = j8 - j9;
            i5++;
            j5 = -256204778801521550L;
        }
        if (z3) {
            return Long.valueOf(j6);
        }
        return Long.valueOf(-j6);
    }

    @l3.e
    @Y(version = "1.1")
    public static final Short b1(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return c1(str, 10);
    }

    @l3.e
    @Y(version = "1.1")
    public static final Short c1(@l3.d String str, int i4) {
        Integer Y02;
        int intValue;
        kotlin.jvm.internal.F.p(str, "<this>");
        Y02 = Y0(str, i4);
        if (Y02 == null || (intValue = Y02.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }
}
