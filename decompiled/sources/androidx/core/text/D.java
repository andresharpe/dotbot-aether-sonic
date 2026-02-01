package androidx.core.text;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class D {
    @l3.d
    public static final String a(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        String htmlEncode = TextUtils.htmlEncode(str);
        kotlin.jvm.internal.F.o(htmlEncode, "htmlEncode(this)");
        return htmlEncode;
    }
}
