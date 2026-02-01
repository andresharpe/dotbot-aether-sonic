package kotlin.text;

import java.util.Set;

/* loaded from: classes2.dex */
class u extends t {
    @kotlin.internal.f
    private static final Regex t(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return new Regex(str);
    }

    @kotlin.internal.f
    private static final Regex u(String str, Set<? extends RegexOption> options) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        return new Regex(str, options);
    }

    @kotlin.internal.f
    private static final Regex v(String str, RegexOption option) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(option, "option");
        return new Regex(str, option);
    }
}
