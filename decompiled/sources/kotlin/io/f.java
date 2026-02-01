package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class f extends ByteArrayOutputStream {
    public f(int i4) {
        super(i4);
    }

    @l3.d
    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        F.o(buf, "buf");
        return buf;
    }
}
