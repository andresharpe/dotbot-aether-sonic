package kotlin.text;

import kotlin.K0;
import kotlin.Y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class r {
    @l3.d
    public static final <T extends Appendable> T a(@l3.d T t3, @l3.d CharSequence... value) {
        kotlin.jvm.internal.F.p(t3, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        for (CharSequence charSequence : value) {
            t3.append(charSequence);
        }
        return t3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void b(@l3.d Appendable appendable, T t3, @l3.e X2.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.C(t3));
            return;
        }
        if (t3 == 0 || (t3 instanceof CharSequence)) {
            appendable.append((CharSequence) t3);
        } else if (t3 instanceof Character) {
            appendable.append(((Character) t3).charValue());
        } else {
            appendable.append(String.valueOf(t3));
        }
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final Appendable c(Appendable appendable) {
        kotlin.jvm.internal.F.p(appendable, "<this>");
        Appendable append = appendable.append('\n');
        kotlin.jvm.internal.F.o(append, "append(...)");
        return append;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final Appendable d(Appendable appendable, char c4) {
        kotlin.jvm.internal.F.p(appendable, "<this>");
        Appendable append = appendable.append(c4);
        kotlin.jvm.internal.F.o(append, "append(...)");
        Appendable append2 = append.append('\n');
        kotlin.jvm.internal.F.o(append2, "append(...)");
        return append2;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final Appendable e(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.F.p(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        kotlin.jvm.internal.F.o(append, "append(...)");
        Appendable append2 = append.append('\n');
        kotlin.jvm.internal.F.o(append2, "append(...)");
        return append2;
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final <T extends Appendable> T f(@l3.d T t3, @l3.d CharSequence value, int i4, int i5) {
        kotlin.jvm.internal.F.p(t3, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        T t4 = (T) t3.append(value, i4, i5);
        kotlin.jvm.internal.F.n(t4, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t4;
    }
}
