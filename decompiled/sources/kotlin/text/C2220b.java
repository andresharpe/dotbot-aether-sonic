package kotlin.text;

import java.util.Locale;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;
import kotlin.K0;
import kotlin.U;
import kotlin.V;
import kotlin.Y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.text.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2220b {
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final String A(char c4) {
        String valueOf = String.valueOf(c4);
        kotlin.jvm.internal.F.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.F.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    public static final String B(char c4, @l3.d Locale locale) {
        kotlin.jvm.internal.F.p(locale, "locale");
        String valueOf = String.valueOf(c4);
        kotlin.jvm.internal.F.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        kotlin.jvm.internal.F.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final char C(char c4) {
        return Character.toUpperCase(c4);
    }

    @U
    public static int a(int i4) {
        if (new kotlin.ranges.l(2, 36).q(i4)) {
            return i4;
        }
        throw new IllegalArgumentException("radix " + i4 + " was not in valid range " + new kotlin.ranges.l(2, 36));
    }

    public static final int b(char c4, int i4) {
        return Character.digit((int) c4, i4);
    }

    @l3.d
    public static final CharCategory c(char c4) {
        return CharCategory.Companion.a(Character.getType(c4));
    }

    @l3.d
    public static final CharDirectionality d(char c4) {
        return CharDirectionality.Companion.b(Character.getDirectionality(c4));
    }

    @kotlin.internal.f
    private static final boolean e(char c4) {
        return Character.isDefined(c4);
    }

    @kotlin.internal.f
    private static final boolean f(char c4) {
        return Character.isDigit(c4);
    }

    @kotlin.internal.f
    private static final boolean g(char c4) {
        return Character.isHighSurrogate(c4);
    }

    @kotlin.internal.f
    private static final boolean h(char c4) {
        return Character.isISOControl(c4);
    }

    @kotlin.internal.f
    private static final boolean i(char c4) {
        return Character.isIdentifierIgnorable(c4);
    }

    @kotlin.internal.f
    private static final boolean j(char c4) {
        return Character.isJavaIdentifierPart(c4);
    }

    @kotlin.internal.f
    private static final boolean k(char c4) {
        return Character.isJavaIdentifierStart(c4);
    }

    @kotlin.internal.f
    private static final boolean l(char c4) {
        return Character.isLetter(c4);
    }

    @kotlin.internal.f
    private static final boolean m(char c4) {
        return Character.isLetterOrDigit(c4);
    }

    @kotlin.internal.f
    private static final boolean n(char c4) {
        return Character.isLowSurrogate(c4);
    }

    @kotlin.internal.f
    private static final boolean o(char c4) {
        return Character.isLowerCase(c4);
    }

    @kotlin.internal.f
    private static final boolean p(char c4) {
        return Character.isTitleCase(c4);
    }

    @kotlin.internal.f
    private static final boolean q(char c4) {
        return Character.isUpperCase(c4);
    }

    public static final boolean r(char c4) {
        if (!Character.isWhitespace(c4) && !Character.isSpaceChar(c4)) {
            return false;
        }
        return true;
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final String s(char c4) {
        String valueOf = String.valueOf(c4);
        kotlin.jvm.internal.F.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.F.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    public static final String t(char c4, @l3.d Locale locale) {
        kotlin.jvm.internal.F.p(locale, "locale");
        String valueOf = String.valueOf(c4);
        kotlin.jvm.internal.F.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        kotlin.jvm.internal.F.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final char u(char c4) {
        return Character.toLowerCase(c4);
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    public static final String v(char c4, @l3.d Locale locale) {
        kotlin.jvm.internal.F.p(locale, "locale");
        String B3 = B(c4, locale);
        if (B3.length() > 1) {
            if (c4 != 329) {
                char charAt = B3.charAt(0);
                kotlin.jvm.internal.F.n(B3, "null cannot be cast to non-null type java.lang.String");
                String substring = B3.substring(1);
                kotlin.jvm.internal.F.o(substring, "substring(...)");
                kotlin.jvm.internal.F.n(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.F.o(lowerCase, "toLowerCase(...)");
                return charAt + lowerCase;
            }
            return B3;
        }
        String valueOf = String.valueOf(c4);
        kotlin.jvm.internal.F.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.F.o(upperCase, "toUpperCase(...)");
        if (!kotlin.jvm.internal.F.g(B3, upperCase)) {
            return B3;
        }
        return String.valueOf(Character.toTitleCase(c4));
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final char w(char c4) {
        return Character.toTitleCase(c4);
    }

    @InterfaceC2205l(message = "Use lowercaseChar() instead.", replaceWith = @V(expression = "lowercaseChar()", imports = {}))
    @kotlin.internal.f
    @InterfaceC2207m(warningSince = "1.5")
    private static final char x(char c4) {
        return Character.toLowerCase(c4);
    }

    @InterfaceC2205l(message = "Use titlecaseChar() instead.", replaceWith = @V(expression = "titlecaseChar()", imports = {}))
    @kotlin.internal.f
    @InterfaceC2207m(warningSince = "1.5")
    private static final char y(char c4) {
        return Character.toTitleCase(c4);
    }

    @InterfaceC2205l(message = "Use uppercaseChar() instead.", replaceWith = @V(expression = "uppercaseChar()", imports = {}))
    @kotlin.internal.f
    @InterfaceC2207m(warningSince = "1.5")
    private static final char z(char c4) {
        return Character.toUpperCase(c4);
    }
}
