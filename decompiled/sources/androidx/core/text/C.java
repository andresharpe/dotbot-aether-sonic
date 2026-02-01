package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;

/* loaded from: classes.dex */
public final class C {
    public static final /* synthetic */ <T> T[] a(Spanned spanned, int i4, int i5) {
        kotlin.jvm.internal.F.p(spanned, "<this>");
        kotlin.jvm.internal.F.y(4, androidx.exifinterface.media.a.f5);
        T[] tArr = (T[]) spanned.getSpans(i4, i5, Object.class);
        kotlin.jvm.internal.F.o(tArr, "getSpans(start, end, T::class.java)");
        return tArr;
    }

    public static /* synthetic */ Object[] b(Spanned spanned, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = spanned.length();
        }
        kotlin.jvm.internal.F.p(spanned, "<this>");
        kotlin.jvm.internal.F.y(4, androidx.exifinterface.media.a.f5);
        Object[] spans = spanned.getSpans(i4, i5, Object.class);
        kotlin.jvm.internal.F.o(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    @l3.d
    public static final Spanned c(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        SpannedString valueOf = SpannedString.valueOf(charSequence);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}
