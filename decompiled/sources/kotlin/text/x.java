package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.Y;
import kotlin.jvm.internal.U;

@U({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n1#1,274:1\n265#1,7:275\n265#1,7:282\n265#1,7:289\n265#1,7:296\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n142#1:275,7\n149#1:282,7\n229#1:289,7\n240#1:296,7\n*E\n"})
/* loaded from: classes2.dex */
class x extends w {
    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger A0(String str, int i4) {
        int a4;
        kotlin.jvm.internal.F.p(str, "<this>");
        a4 = C2220b.a(i4);
        return new BigInteger(str, a4);
    }

    @l3.e
    @Y(version = "1.2")
    public static final BigInteger B0(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return C0(str, 10);
    }

    @l3.e
    @Y(version = "1.2")
    public static final BigInteger C0(@l3.d String str, int i4) {
        int a4;
        kotlin.jvm.internal.F.p(str, "<this>");
        C2220b.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        if (length != 1) {
            if (str.charAt(0) == '-') {
                i5 = 1;
            }
            while (i5 < length) {
                if (C2220b.b(str.charAt(i5), i4) < 0) {
                    return null;
                }
                i5++;
            }
        } else if (C2220b.b(str.charAt(0), i4) < 0) {
            return null;
        }
        a4 = C2220b.a(i4);
        return new BigInteger(str, a4);
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final boolean D0(String str) {
        return Boolean.parseBoolean(str);
    }

    @kotlin.internal.f
    private static final byte E0(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return Byte.parseByte(str);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final byte F0(String str, int i4) {
        int a4;
        kotlin.jvm.internal.F.p(str, "<this>");
        a4 = C2220b.a(i4);
        return Byte.parseByte(str, a4);
    }

    @kotlin.internal.f
    private static final double G0(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return Double.parseDouble(str);
    }

    @l3.e
    @Y(version = "1.1")
    public static final Double H0(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        try {
            if (!p.f52856b.k(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @kotlin.internal.f
    private static final float I0(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return Float.parseFloat(str);
    }

    @l3.e
    @Y(version = "1.1")
    public static final Float J0(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        try {
            if (!p.f52856b.k(str)) {
                return null;
            }
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @kotlin.internal.f
    private static final int K0(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return Integer.parseInt(str);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final int L0(String str, int i4) {
        int a4;
        kotlin.jvm.internal.F.p(str, "<this>");
        a4 = C2220b.a(i4);
        return Integer.parseInt(str, a4);
    }

    @kotlin.internal.f
    private static final long M0(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return Long.parseLong(str);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final long N0(String str, int i4) {
        int a4;
        kotlin.jvm.internal.F.p(str, "<this>");
        a4 = C2220b.a(i4);
        return Long.parseLong(str, a4);
    }

    @kotlin.internal.f
    private static final short O0(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return Short.parseShort(str);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final short P0(String str, int i4) {
        int a4;
        kotlin.jvm.internal.F.p(str, "<this>");
        a4 = C2220b.a(i4);
        return Short.parseShort(str, a4);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final String Q0(byte b4, int i4) {
        int a4;
        a4 = C2220b.a(i4);
        String num = Integer.toString(b4, a4);
        kotlin.jvm.internal.F.o(num, "toString(...)");
        return num;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final String R0(int i4, int i5) {
        int a4;
        a4 = C2220b.a(i5);
        String num = Integer.toString(i4, a4);
        kotlin.jvm.internal.F.o(num, "toString(...)");
        return num;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final String S0(long j4, int i4) {
        int a4;
        a4 = C2220b.a(i4);
        String l4 = Long.toString(j4, a4);
        kotlin.jvm.internal.F.o(l4, "toString(...)");
        return l4;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final String T0(short s4, int i4) {
        int a4;
        a4 = C2220b.a(i4);
        String num = Integer.toString(s4, a4);
        kotlin.jvm.internal.F.o(num, "toString(...)");
        return num;
    }

    private static final <T> T u0(String str, X2.l<? super String, ? extends T> lVar) {
        try {
            if (!p.f52856b.k(str)) {
                return null;
            }
            return lVar.C(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal v0(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return new BigDecimal(str);
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal w0(String str, MathContext mathContext) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @l3.e
    @Y(version = "1.2")
    public static final BigDecimal x0(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        try {
            if (!p.f52856b.k(str)) {
                return null;
            }
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @l3.e
    @Y(version = "1.2")
    public static final BigDecimal y0(@l3.d String str, @l3.d MathContext mathContext) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(mathContext, "mathContext");
        try {
            if (!p.f52856b.k(str)) {
                return null;
            }
            return new BigDecimal(str, mathContext);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger z0(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return new BigInteger(str);
    }
}
