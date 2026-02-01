package kotlin.text;

import java.nio.charset.Charset;

@W2.i(name = "CharsetsKt")
/* renamed from: kotlin.text.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2223e {
    @kotlin.internal.f
    private static final Charset a(String charsetName) {
        kotlin.jvm.internal.F.p(charsetName, "charsetName");
        Charset forName = Charset.forName(charsetName);
        kotlin.jvm.internal.F.o(forName, "forName(...)");
        return forName;
    }
}
