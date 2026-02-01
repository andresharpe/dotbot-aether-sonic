package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.AtomicFile;
import androidx.annotation.W;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.H0;
import kotlin.text.C2222d;

@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.util.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763d {
    @l3.d
    @W(17)
    public static final byte[] a(@l3.d AtomicFile atomicFile) {
        kotlin.jvm.internal.F.p(atomicFile, "<this>");
        byte[] readFully = atomicFile.readFully();
        kotlin.jvm.internal.F.o(readFully, "readFully()");
        return readFully;
    }

    @l3.d
    @W(17)
    public static final String b(@l3.d AtomicFile atomicFile, @l3.d Charset charset) {
        kotlin.jvm.internal.F.p(atomicFile, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        kotlin.jvm.internal.F.o(readFully, "readFully()");
        return new String(readFully, charset);
    }

    public static /* synthetic */ String c(AtomicFile atomicFile, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        return b(atomicFile, charset);
    }

    @W(17)
    public static final void d(@l3.d AtomicFile atomicFile, @l3.d X2.l<? super FileOutputStream, H0> block) {
        kotlin.jvm.internal.F.p(atomicFile, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        FileOutputStream stream = atomicFile.startWrite();
        try {
            kotlin.jvm.internal.F.o(stream, "stream");
            block.C(stream);
            kotlin.jvm.internal.C.d(1);
            atomicFile.finishWrite(stream);
            kotlin.jvm.internal.C.c(1);
        } catch (Throwable th) {
            kotlin.jvm.internal.C.d(1);
            atomicFile.failWrite(stream);
            kotlin.jvm.internal.C.c(1);
            throw th;
        }
    }

    @W(17)
    public static final void e(@l3.d AtomicFile atomicFile, @l3.d byte[] array) {
        kotlin.jvm.internal.F.p(atomicFile, "<this>");
        kotlin.jvm.internal.F.p(array, "array");
        FileOutputStream stream = atomicFile.startWrite();
        try {
            kotlin.jvm.internal.F.o(stream, "stream");
            stream.write(array);
            atomicFile.finishWrite(stream);
        } catch (Throwable th) {
            atomicFile.failWrite(stream);
            throw th;
        }
    }

    @W(17)
    public static final void f(@l3.d AtomicFile atomicFile, @l3.d String text, @l3.d Charset charset) {
        kotlin.jvm.internal.F.p(atomicFile, "<this>");
        kotlin.jvm.internal.F.p(text, "text");
        kotlin.jvm.internal.F.p(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        kotlin.jvm.internal.F.o(bytes, "this as java.lang.String).getBytes(charset)");
        e(atomicFile, bytes);
    }

    public static /* synthetic */ void g(AtomicFile atomicFile, String str, Charset charset, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            charset = C2222d.f52792b;
        }
        f(atomicFile, str, charset);
    }
}
