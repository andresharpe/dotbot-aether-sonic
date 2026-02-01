package androidx.core.text;

import android.text.Html;
import android.text.Spanned;

/* renamed from: androidx.core.text.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756d {
    @l3.d
    public static final Spanned a(@l3.d String str, int i4, @l3.e Html.ImageGetter imageGetter, @l3.e Html.TagHandler tagHandler) {
        kotlin.jvm.internal.F.p(str, "<this>");
        Spanned b4 = C0755c.b(str, i4, imageGetter, tagHandler);
        kotlin.jvm.internal.F.o(b4, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b4;
    }

    public static /* synthetic */ Spanned b(String str, int i4, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            imageGetter = null;
        }
        if ((i5 & 4) != 0) {
            tagHandler = null;
        }
        kotlin.jvm.internal.F.p(str, "<this>");
        Spanned b4 = C0755c.b(str, i4, imageGetter, tagHandler);
        kotlin.jvm.internal.F.o(b4, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b4;
    }

    @l3.d
    public static final String c(@l3.d Spanned spanned, int i4) {
        kotlin.jvm.internal.F.p(spanned, "<this>");
        String c4 = C0755c.c(spanned, i4);
        kotlin.jvm.internal.F.o(c4, "toHtml(this, option)");
        return c4;
    }

    public static /* synthetic */ String d(Spanned spanned, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        kotlin.jvm.internal.F.p(spanned, "<this>");
        String c4 = C0755c.c(spanned, i4);
        kotlin.jvm.internal.F.o(c4, "toHtml(this, option)");
        return c4;
    }
}
