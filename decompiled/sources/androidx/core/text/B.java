package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;

/* loaded from: classes.dex */
public final class B {
    @SuppressLint({"SyntheticAccessor"})
    public static final void a(@l3.d Spannable spannable) {
        kotlin.jvm.internal.F.p(spannable, "<this>");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        kotlin.jvm.internal.F.o(spans, "getSpans(start, end, T::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan(obj);
        }
    }

    public static final void b(@l3.d Spannable spannable, int i4, int i5, @l3.d Object span) {
        kotlin.jvm.internal.F.p(spannable, "<this>");
        kotlin.jvm.internal.F.p(span, "span");
        spannable.setSpan(span, i4, i5, 17);
    }

    public static final void c(@l3.d Spannable spannable, @l3.d kotlin.ranges.l range, @l3.d Object span) {
        kotlin.jvm.internal.F.p(spannable, "<this>");
        kotlin.jvm.internal.F.p(range, "range");
        kotlin.jvm.internal.F.p(span, "span");
        spannable.setSpan(span, range.c().intValue(), range.k().intValue(), 17);
    }

    @l3.d
    public static final Spannable d(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}
