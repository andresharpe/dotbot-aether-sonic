package kotlin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
class G {
    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal a(BigDecimal bigDecimal) {
        kotlin.jvm.internal.F.p(bigDecimal, "<this>");
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        kotlin.jvm.internal.F.o(subtract, "subtract(...)");
        return subtract;
    }

    @kotlin.internal.f
    private static final BigDecimal b(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.F.p(bigDecimal, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        BigDecimal divide = bigDecimal.divide(other, RoundingMode.HALF_EVEN);
        kotlin.jvm.internal.F.o(divide, "divide(...)");
        return divide;
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal c(BigDecimal bigDecimal) {
        kotlin.jvm.internal.F.p(bigDecimal, "<this>");
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        kotlin.jvm.internal.F.o(add, "add(...)");
        return add;
    }

    @kotlin.internal.f
    private static final BigDecimal d(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.F.p(bigDecimal, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        BigDecimal subtract = bigDecimal.subtract(other);
        kotlin.jvm.internal.F.o(subtract, "subtract(...)");
        return subtract;
    }

    @kotlin.internal.f
    private static final BigDecimal e(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.F.p(bigDecimal, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        BigDecimal add = bigDecimal.add(other);
        kotlin.jvm.internal.F.o(add, "add(...)");
        return add;
    }

    @kotlin.internal.f
    private static final BigDecimal f(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.F.p(bigDecimal, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        BigDecimal remainder = bigDecimal.remainder(other);
        kotlin.jvm.internal.F.o(remainder, "remainder(...)");
        return remainder;
    }

    @kotlin.internal.f
    private static final BigDecimal g(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.F.p(bigDecimal, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        BigDecimal multiply = bigDecimal.multiply(other);
        kotlin.jvm.internal.F.o(multiply, "multiply(...)");
        return multiply;
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal h(double d4) {
        return new BigDecimal(String.valueOf(d4));
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal i(double d4, MathContext mathContext) {
        kotlin.jvm.internal.F.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d4), mathContext);
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal j(float f4) {
        return new BigDecimal(String.valueOf(f4));
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal k(float f4, MathContext mathContext) {
        kotlin.jvm.internal.F.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f4), mathContext);
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal l(int i4) {
        BigDecimal valueOf = BigDecimal.valueOf(i4);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        return valueOf;
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal m(int i4, MathContext mathContext) {
        kotlin.jvm.internal.F.p(mathContext, "mathContext");
        return new BigDecimal(i4, mathContext);
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal n(long j4) {
        BigDecimal valueOf = BigDecimal.valueOf(j4);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        return valueOf;
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal o(long j4, MathContext mathContext) {
        kotlin.jvm.internal.F.p(mathContext, "mathContext");
        return new BigDecimal(j4, mathContext);
    }

    @kotlin.internal.f
    private static final BigDecimal p(BigDecimal bigDecimal) {
        kotlin.jvm.internal.F.p(bigDecimal, "<this>");
        BigDecimal negate = bigDecimal.negate();
        kotlin.jvm.internal.F.o(negate, "negate(...)");
        return negate;
    }
}
