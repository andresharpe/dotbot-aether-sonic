package kotlin.text;

import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.NotImplementedError;
import kotlin.V;
import kotlin.Y;

/* loaded from: classes2.dex */
class w extends v {
    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use append(value: Any?) instead", replaceWith = @V(expression = "append(value = obj)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder h0(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(obj);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use appendRange instead.", replaceWith = @V(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder i0(StringBuilder sb, char[] str, int i4, int i5) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        kotlin.jvm.internal.F.p(str, "str");
        throw new NotImplementedError(null, 1, null);
    }

    @l3.d
    public static final StringBuilder j0(@l3.d StringBuilder sb, @l3.d Object... value) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        for (Object obj : value) {
            sb.append(obj);
        }
        return sb;
    }

    @l3.d
    public static final StringBuilder k0(@l3.d StringBuilder sb, @l3.d String... value) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        for (String str : value) {
            sb.append(str);
        }
        return sb;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder l0(StringBuilder sb) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder m0(StringBuilder sb, char c4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(c4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder n0(StringBuilder sb, CharSequence charSequence) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(charSequence);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder o0(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(obj);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder p0(StringBuilder sb, String str) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(str);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder q0(StringBuilder sb, boolean z3) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(z3);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder r0(StringBuilder sb, char[] value) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        sb.append(value);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final String s0(int i4, X2.l<? super StringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        StringBuilder sb = new StringBuilder(i4);
        builderAction.C(sb);
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "toString(...)");
        return sb2;
    }

    @kotlin.internal.f
    private static final String t0(X2.l<? super StringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        StringBuilder sb = new StringBuilder();
        builderAction.C(sb);
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "toString(...)");
        return sb2;
    }
}
