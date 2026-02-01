package kotlin.io.encoding;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Y;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
class h {
    @l3.d
    @f
    @Y(version = "1.8")
    public static final InputStream a(@l3.d InputStream inputStream, @l3.d a base64) {
        F.p(inputStream, "<this>");
        F.p(base64, "base64");
        return new d(inputStream, base64);
    }

    @l3.d
    @f
    @Y(version = "1.8")
    public static final OutputStream b(@l3.d OutputStream outputStream, @l3.d a base64) {
        F.p(outputStream, "<this>");
        F.p(base64, "base64");
        return new e(outputStream, base64);
    }
}
