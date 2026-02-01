package kotlin.text;

import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.U;
import kotlin.ranges.C2214c;

/* JADX INFO: Access modifiers changed from: package-private */
@U({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
/* renamed from: kotlin.text.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2221c extends C2220b {
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    public static final char D(int i4) {
        if (new kotlin.ranges.l(0, 9).q(i4)) {
            return (char) (i4 + 48);
        }
        throw new IllegalArgumentException("Int " + i4 + " is not a decimal digit");
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    public static final char E(int i4, int i5) {
        int i6;
        if (new kotlin.ranges.l(2, 36).q(i5)) {
            if (i4 >= 0 && i4 < i5) {
                if (i4 < 10) {
                    i6 = i4 + 48;
                } else {
                    i6 = ((char) (i4 + 65)) - '\n';
                }
                return (char) i6;
            }
            throw new IllegalArgumentException("Digit " + i4 + " does not represent a valid digit in radix " + i5);
        }
        throw new IllegalArgumentException("Invalid radix: " + i5 + ". Valid radix values are in range 2..36");
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    public static final int F(char c4) {
        int b4 = C2220b.b(c4, 10);
        if (b4 >= 0) {
            return b4;
        }
        throw new IllegalArgumentException("Char " + c4 + " is not a decimal digit");
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    public static final int G(char c4, int i4) {
        Integer I3 = I(c4, i4);
        if (I3 != null) {
            return I3.intValue();
        }
        throw new IllegalArgumentException("Char " + c4 + " is not a digit in the given radix=" + i4);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    public static final Integer H(char c4) {
        Integer valueOf = Integer.valueOf(C2220b.b(c4, 10));
        if (valueOf.intValue() < 0) {
            return null;
        }
        return valueOf;
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    public static final Integer I(char c4, int i4) {
        C2220b.a(i4);
        Integer valueOf = Integer.valueOf(C2220b.b(c4, i4));
        if (valueOf.intValue() < 0) {
            return null;
        }
        return valueOf;
    }

    public static boolean J(char c4, char c5, boolean z3) {
        if (c4 == c5) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c4);
        char upperCase2 = Character.toUpperCase(c5);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean K(char c4, char c5, boolean z3, int i4, Object obj) {
        boolean J3;
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        J3 = J(c4, c5, z3);
        return J3;
    }

    public static final boolean L(char c4) {
        return new C2214c((char) 55296, (char) 57343).q(c4);
    }

    @kotlin.internal.f
    private static final String M(char c4, String other) {
        kotlin.jvm.internal.F.p(other, "other");
        return c4 + other;
    }

    @l3.d
    @Y(version = "1.5")
    public static final String N(char c4) {
        return I.a(c4);
    }
}
