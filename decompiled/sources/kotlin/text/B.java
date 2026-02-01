package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;
import kotlin.N;
import kotlin.V;
import kotlin.Y;
import kotlin.collections.P;
import kotlin.jvm.internal.U;

@U({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1239#2,14:109\n1521#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
/* loaded from: classes2.dex */
class B extends A {
    @kotlin.internal.f
    private static final char U5(CharSequence charSequence, int i4) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return charSequence.charAt(i4);
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character V5(CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return C.N7(charSequence);
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character W5(CharSequence charSequence, X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        g32 = A.g3(charSequence);
        if (g32 == 0) {
            return Character.valueOf(charAt);
        }
        R C3 = selector.C(Character.valueOf(charAt));
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.c());
            R C4 = selector.C(Character.valueOf(charAt2));
            if (C3.compareTo(C4) < 0) {
                charAt = charAt2;
                C3 = C4;
            }
        }
        return Character.valueOf(charAt);
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character X5(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C.P7(charSequence, comparator);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character Y5(CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return C.b8(charSequence);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character Z5(CharSequence charSequence, X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        g32 = A.g3(charSequence);
        if (g32 == 0) {
            return Character.valueOf(charAt);
        }
        R C3 = selector.C(Character.valueOf(charAt));
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.c());
            R C4 = selector.C(Character.valueOf(charAt2));
            if (C3.compareTo(C4) > 0) {
                charAt = charAt2;
                C3 = C4;
            }
        }
        return Character.valueOf(charAt);
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character a6(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C.d8(charSequence, comparator);
    }

    @W2.i(name = "sumOfBigDecimal")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final BigDecimal b6(CharSequence charSequence, X2.l<? super Character, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            valueOf = valueOf.add(selector.C(Character.valueOf(charSequence.charAt(i4))));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @W2.i(name = "sumOfBigInteger")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final BigInteger c6(CharSequence charSequence, X2.l<? super Character, ? extends BigInteger> selector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            valueOf = valueOf.add(selector.C(Character.valueOf(charSequence.charAt(i4))));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @l3.d
    public static final SortedSet<Character> d6(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return (SortedSet) C.c9(charSequence, new TreeSet());
    }
}
