package kotlin.text;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
class t extends s {
    @kotlin.internal.f
    private static final Regex s(Pattern pattern) {
        kotlin.jvm.internal.F.p(pattern, "<this>");
        return new Regex(pattern);
    }
}
