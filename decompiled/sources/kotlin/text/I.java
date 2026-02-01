package kotlin.text;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class I {
    @l3.d
    public static final String a(char c4) {
        String valueOf = String.valueOf(c4);
        kotlin.jvm.internal.F.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        kotlin.jvm.internal.F.o(upperCase, "toUpperCase(...)");
        if (upperCase.length() > 1) {
            if (c4 != 329) {
                char charAt = upperCase.charAt(0);
                kotlin.jvm.internal.F.n(upperCase, "null cannot be cast to non-null type java.lang.String");
                String substring = upperCase.substring(1);
                kotlin.jvm.internal.F.o(substring, "substring(...)");
                kotlin.jvm.internal.F.n(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(locale);
                kotlin.jvm.internal.F.o(lowerCase, "toLowerCase(...)");
                return charAt + lowerCase;
            }
            return upperCase;
        }
        return String.valueOf(Character.toTitleCase(c4));
    }
}
