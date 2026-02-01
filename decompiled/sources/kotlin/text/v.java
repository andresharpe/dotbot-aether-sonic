package kotlin.text;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.K0;
import kotlin.V;
import kotlin.Y;
import kotlin.jvm.internal.U;

@U({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
/* loaded from: classes2.dex */
class v extends u {
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder A(StringBuilder sb, long j4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(j4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder B(StringBuilder sb, StringBuffer stringBuffer) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(stringBuffer);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder C(StringBuilder sb, StringBuilder sb2) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append((CharSequence) sb2);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder D(StringBuilder sb, short s4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append((int) s4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder E(StringBuilder sb, CharSequence value, int i4, int i5) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        sb.append(value, i4, i5);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder F(StringBuilder sb, char[] value, int i4, int i5) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        sb.append(value, i4, i5 - i4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine()", imports = {}))
    public static final Appendable G(@l3.d Appendable appendable) {
        kotlin.jvm.internal.F.p(appendable, "<this>");
        Appendable append = appendable.append(D.f52728b);
        kotlin.jvm.internal.F.o(append, "append(...)");
        return append;
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final Appendable H(Appendable appendable, char c4) {
        kotlin.jvm.internal.F.p(appendable, "<this>");
        Appendable append = appendable.append(c4);
        kotlin.jvm.internal.F.o(append, "append(...)");
        return G(append);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final Appendable I(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.F.p(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        kotlin.jvm.internal.F.o(append, "append(...)");
        return G(append);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine()", imports = {}))
    public static final StringBuilder J(@l3.d StringBuilder sb) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(D.f52728b);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder K(StringBuilder sb, byte b4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append((int) b4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder L(StringBuilder sb, char c4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(c4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder M(StringBuilder sb, double d4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(d4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder N(StringBuilder sb, float f4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(f4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder O(StringBuilder sb, int i4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(i4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder P(StringBuilder sb, long j4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(j4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder Q(StringBuilder sb, CharSequence charSequence) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(charSequence);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder R(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(obj);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder S(StringBuilder sb, String str) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(str);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder T(StringBuilder sb, StringBuffer stringBuffer) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(stringBuffer);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder U(StringBuilder sb, StringBuilder sb2) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append((CharSequence) sb2);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder V(StringBuilder sb, short s4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append((int) s4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder W(StringBuilder sb, boolean z3) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(z3);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @V(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder X(StringBuilder sb, char[] value) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        sb.append(value);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return J(sb);
    }

    @l3.d
    @Y(version = "1.3")
    public static final StringBuilder Y(@l3.d StringBuilder sb) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder Z(StringBuilder sb, int i4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        StringBuilder deleteCharAt = sb.deleteCharAt(i4);
        kotlin.jvm.internal.F.o(deleteCharAt, "deleteCharAt(...)");
        return deleteCharAt;
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder a0(StringBuilder sb, int i4, int i5) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        StringBuilder delete = sb.delete(i4, i5);
        kotlin.jvm.internal.F.o(delete, "delete(...)");
        return delete;
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder b0(StringBuilder sb, int i4, CharSequence value, int i5, int i6) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        StringBuilder insert = sb.insert(i4, value, i5, i6);
        kotlin.jvm.internal.F.o(insert, "insert(...)");
        return insert;
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder c0(StringBuilder sb, int i4, char[] value, int i5, int i6) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        StringBuilder insert = sb.insert(i4, value, i5, i6 - i5);
        kotlin.jvm.internal.F.o(insert, "insert(...)");
        return insert;
    }

    @kotlin.internal.f
    private static final void d0(StringBuilder sb, int i4, char c4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.setCharAt(i4, c4);
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder e0(StringBuilder sb, int i4, int i5, String value) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        StringBuilder replace = sb.replace(i4, i5, value);
        kotlin.jvm.internal.F.o(replace, "replace(...)");
        return replace;
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final void f0(StringBuilder sb, char[] destination, int i4, int i5, int i6) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        sb.getChars(i5, i6, destination, i4);
    }

    static /* synthetic */ void g0(StringBuilder sb, char[] destination, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = sb.length();
        }
        kotlin.jvm.internal.F.p(sb, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        sb.getChars(i5, i6, destination, i4);
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder w(StringBuilder sb, byte b4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append((int) b4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder x(StringBuilder sb, double d4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(d4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder y(StringBuilder sb, float f4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(f4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder z(StringBuilder sb, int i4) {
        kotlin.jvm.internal.F.p(sb, "<this>");
        sb.append(i4);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        return sb;
    }
}
