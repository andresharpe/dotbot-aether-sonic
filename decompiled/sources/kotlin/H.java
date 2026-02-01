package kotlin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* loaded from: classes2.dex */
class H extends G {
    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger A(BigInteger bigInteger, int i4) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        BigInteger shiftRight = bigInteger.shiftRight(i4);
        kotlin.jvm.internal.F.o(shiftRight, "shiftRight(...)");
        return shiftRight;
    }

    @kotlin.internal.f
    private static final BigInteger B(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        BigInteger multiply = bigInteger.multiply(other);
        kotlin.jvm.internal.F.o(multiply, "multiply(...)");
        return multiply;
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal C(BigInteger bigInteger) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal D(BigInteger bigInteger, int i4, MathContext mathContext) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        kotlin.jvm.internal.F.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i4, mathContext);
    }

    static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i4, MathContext mathContext, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            kotlin.jvm.internal.F.o(mathContext, "UNLIMITED");
        }
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        kotlin.jvm.internal.F.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i4, mathContext);
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger F(int i4) {
        BigInteger valueOf = BigInteger.valueOf(i4);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        return valueOf;
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger G(long j4) {
        BigInteger valueOf = BigInteger.valueOf(j4);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        return valueOf;
    }

    @kotlin.internal.f
    private static final BigInteger H(BigInteger bigInteger) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        BigInteger negate = bigInteger.negate();
        kotlin.jvm.internal.F.o(negate, "negate(...)");
        return negate;
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger I(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        BigInteger xor = bigInteger.xor(other);
        kotlin.jvm.internal.F.o(xor, "xor(...)");
        return xor;
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger q(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        BigInteger and = bigInteger.and(other);
        kotlin.jvm.internal.F.o(and, "and(...)");
        return and;
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger r(BigInteger bigInteger) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        kotlin.jvm.internal.F.o(subtract, "subtract(...)");
        return subtract;
    }

    @kotlin.internal.f
    private static final BigInteger s(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        BigInteger divide = bigInteger.divide(other);
        kotlin.jvm.internal.F.o(divide, "divide(...)");
        return divide;
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger t(BigInteger bigInteger) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        BigInteger add = bigInteger.add(BigInteger.ONE);
        kotlin.jvm.internal.F.o(add, "add(...)");
        return add;
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger u(BigInteger bigInteger) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        BigInteger not = bigInteger.not();
        kotlin.jvm.internal.F.o(not, "not(...)");
        return not;
    }

    @kotlin.internal.f
    private static final BigInteger v(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        BigInteger subtract = bigInteger.subtract(other);
        kotlin.jvm.internal.F.o(subtract, "subtract(...)");
        return subtract;
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger w(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        BigInteger or = bigInteger.or(other);
        kotlin.jvm.internal.F.o(or, "or(...)");
        return or;
    }

    @kotlin.internal.f
    private static final BigInteger x(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        BigInteger add = bigInteger.add(other);
        kotlin.jvm.internal.F.o(add, "add(...)");
        return add;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final BigInteger y(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        BigInteger remainder = bigInteger.remainder(other);
        kotlin.jvm.internal.F.o(remainder, "remainder(...)");
        return remainder;
    }

    @Y(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger z(BigInteger bigInteger, int i4) {
        kotlin.jvm.internal.F.p(bigInteger, "<this>");
        BigInteger shiftLeft = bigInteger.shiftLeft(i4);
        kotlin.jvm.internal.F.o(shiftLeft, "shiftLeft(...)");
        return shiftLeft;
    }
}
