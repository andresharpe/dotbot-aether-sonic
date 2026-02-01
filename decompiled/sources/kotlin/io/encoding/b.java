package kotlin.io.encoding;

import java.nio.charset.Charset;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.text.C2222d;

/* loaded from: classes2.dex */
public final class b {
    @f
    @Y(version = "1.8")
    @kotlin.internal.f
    private static final byte[] a(a aVar, CharSequence source, int i4, int i5) {
        F.p(aVar, "<this>");
        F.p(source, "source");
        if (source instanceof String) {
            aVar.g(source.length(), i4, i5);
            String substring = ((String) source).substring(i4, i5);
            F.o(substring, "substring(...)");
            Charset charset = C2222d.f52797g;
            F.n(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            F.o(bytes, "getBytes(...)");
            return bytes;
        }
        return aVar.e(source, i4, i5);
    }

    @f
    @Y(version = "1.8")
    @kotlin.internal.f
    private static final int b(a aVar, byte[] source, byte[] destination, int i4, int i5, int i6) {
        F.p(aVar, "<this>");
        F.p(source, "source");
        F.p(destination, "destination");
        return aVar.v(source, destination, i4, i5, i6);
    }

    @f
    @Y(version = "1.8")
    @kotlin.internal.f
    private static final byte[] c(a aVar, byte[] source, int i4, int i5) {
        F.p(aVar, "<this>");
        F.p(source, "source");
        return aVar.B(source, i4, i5);
    }

    @f
    @Y(version = "1.8")
    @kotlin.internal.f
    private static final String d(a aVar, byte[] source, int i4, int i5) {
        F.p(aVar, "<this>");
        F.p(source, "source");
        return new String(aVar.B(source, i4, i5), C2222d.f52797g);
    }
}
