package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.H0;
import kotlin.collections.C2100o;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlin.ranges.u;
import kotlin.text.C2222d;

/* JADX INFO: Access modifiers changed from: package-private */
@U({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n1#2:233\n*E\n"})
/* loaded from: classes2.dex */
public class k extends j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements X2.l<String, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f52165F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList<String> arrayList) {
            super(1);
            this.f52165F = arrayList;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(String str) {
            c(str);
            return H0.f51801a;
        }

        public final void c(@l3.d String it) {
            F.p(it, "it");
            this.f52165F.add(it);
        }
    }

    @kotlin.internal.f
    private static final InputStreamReader A(File file, Charset charset) {
        F.p(file, "<this>");
        F.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    static /* synthetic */ InputStreamReader B(File file, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        F.p(file, "<this>");
        F.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T C(@l3.d File file, @l3.d Charset charset, @l3.d X2.l<? super kotlin.sequences.m<String>, ? extends T> block) {
        BufferedReader bufferedReader;
        F.p(file, "<this>");
        F.p(charset, "charset");
        F.p(block, "block");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            T C3 = block.C(r.h(bufferedReader));
            C.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                b.a(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            C.c(1);
            return C3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C.d(1);
                if (!kotlin.internal.m.a(1, 1, 0)) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                } else {
                    b.a(bufferedReader, th);
                }
                C.c(1);
                throw th2;
            }
        }
    }

    public static /* synthetic */ Object D(File file, Charset charset, X2.l block, int i4, Object obj) {
        BufferedReader bufferedReader;
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        F.p(file, "<this>");
        F.p(charset, "charset");
        F.p(block, "block");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            Object C3 = block.C(r.h(bufferedReader));
            C.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                b.a(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            C.c(1);
            return C3;
        } finally {
        }
    }

    public static final void E(@l3.d File file, @l3.d byte[] array) {
        F.p(file, "<this>");
        F.p(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            H0 h02 = H0.f51801a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void F(@l3.d File file, @l3.d String text, @l3.d Charset charset) {
        F.p(file, "<this>");
        F.p(text, "text");
        F.p(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        F.o(bytes, "getBytes(...)");
        E(file, bytes);
    }

    public static /* synthetic */ void G(File file, String str, Charset charset, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            charset = C2222d.f52792b;
        }
        F(file, str, charset);
    }

    @kotlin.internal.f
    private static final OutputStreamWriter H(File file, Charset charset) {
        F.p(file, "<this>");
        F.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    static /* synthetic */ OutputStreamWriter I(File file, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        F.p(file, "<this>");
        F.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void g(@l3.d File file, @l3.d byte[] array) {
        F.p(file, "<this>");
        F.p(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            H0 h02 = H0.f51801a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void h(@l3.d File file, @l3.d String text, @l3.d Charset charset) {
        F.p(file, "<this>");
        F.p(text, "text");
        F.p(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        F.o(bytes, "getBytes(...)");
        g(file, bytes);
    }

    public static /* synthetic */ void i(File file, String str, Charset charset, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            charset = C2222d.f52792b;
        }
        h(file, str, charset);
    }

    @kotlin.internal.f
    private static final BufferedReader j(File file, Charset charset, int i4) {
        F.p(file, "<this>");
        F.p(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        if (inputStreamReader instanceof BufferedReader) {
            return (BufferedReader) inputStreamReader;
        }
        return new BufferedReader(inputStreamReader, i4);
    }

    static /* synthetic */ BufferedReader k(File file, Charset charset, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        F.p(file, "<this>");
        F.p(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        if (inputStreamReader instanceof BufferedReader) {
            return (BufferedReader) inputStreamReader;
        }
        return new BufferedReader(inputStreamReader, i4);
    }

    @kotlin.internal.f
    private static final BufferedWriter l(File file, Charset charset, int i4) {
        F.p(file, "<this>");
        F.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            return (BufferedWriter) outputStreamWriter;
        }
        return new BufferedWriter(outputStreamWriter, i4);
    }

    static /* synthetic */ BufferedWriter m(File file, Charset charset, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        F.p(file, "<this>");
        F.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            return (BufferedWriter) outputStreamWriter;
        }
        return new BufferedWriter(outputStreamWriter, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void n(@l3.d File file, int i4, @l3.d X2.p<? super byte[], ? super Integer, H0> action) {
        int u3;
        F.p(file, "<this>");
        F.p(action, "action");
        u3 = u.u(i4, 512);
        ?? r22 = new byte[u3];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(r22);
                if (read <= 0) {
                    H0 h02 = H0.f51801a;
                    b.a(fileInputStream, null);
                    return;
                }
                action.c0(r22, Integer.valueOf(read));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.a(fileInputStream, th);
                    throw th2;
                }
            }
        }
    }

    public static final void o(@l3.d File file, @l3.d X2.p<? super byte[], ? super Integer, H0> action) {
        F.p(file, "<this>");
        F.p(action, "action");
        n(file, 4096, action);
    }

    public static final void p(@l3.d File file, @l3.d Charset charset, @l3.d X2.l<? super String, H0> action) {
        F.p(file, "<this>");
        F.p(charset, "charset");
        F.p(action, "action");
        r.g(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static /* synthetic */ void q(File file, Charset charset, X2.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        p(file, charset, lVar);
    }

    @kotlin.internal.f
    private static final FileInputStream r(File file) {
        F.p(file, "<this>");
        return new FileInputStream(file);
    }

    @kotlin.internal.f
    private static final FileOutputStream s(File file) {
        F.p(file, "<this>");
        return new FileOutputStream(file);
    }

    @kotlin.internal.f
    private static final PrintWriter t(File file, Charset charset) {
        BufferedWriter bufferedWriter;
        F.p(file, "<this>");
        F.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            bufferedWriter = (BufferedWriter) outputStreamWriter;
        } else {
            bufferedWriter = new BufferedWriter(outputStreamWriter, 8192);
        }
        return new PrintWriter(bufferedWriter);
    }

    static /* synthetic */ PrintWriter u(File file, Charset charset, int i4, Object obj) {
        BufferedWriter bufferedWriter;
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        F.p(file, "<this>");
        F.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            bufferedWriter = (BufferedWriter) outputStreamWriter;
        } else {
            bufferedWriter = new BufferedWriter(outputStreamWriter, 8192);
        }
        return new PrintWriter(bufferedWriter);
    }

    @l3.d
    public static byte[] v(@l3.d File file) {
        F.p(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i4 = (int) length;
                byte[] bArr = new byte[i4];
                int i5 = i4;
                int i6 = 0;
                while (i5 > 0) {
                    int read = fileInputStream.read(bArr, i6, i5);
                    if (read < 0) {
                        break;
                    }
                    i5 -= read;
                    i6 += read;
                }
                if (i5 > 0) {
                    bArr = Arrays.copyOf(bArr, i6);
                    F.o(bArr, "copyOf(...)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        f fVar = new f(8193);
                        fVar.write(read2);
                        kotlin.io.a.l(fileInputStream, fVar, 0, 2, null);
                        int size = fVar.size() + i4;
                        if (size >= 0) {
                            byte[] a4 = fVar.a();
                            byte[] copyOf = Arrays.copyOf(bArr, size);
                            F.o(copyOf, "copyOf(...)");
                            bArr = C2100o.v0(a4, copyOf, i4, 0, fVar.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                b.a(fileInputStream, null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    @l3.d
    public static final List<String> w(@l3.d File file, @l3.d Charset charset) {
        F.p(file, "<this>");
        F.p(charset, "charset");
        ArrayList arrayList = new ArrayList();
        p(file, charset, new a(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List x(File file, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        return w(file, charset);
    }

    @l3.d
    public static final String y(@l3.d File file, @l3.d Charset charset) {
        F.p(file, "<this>");
        F.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String k4 = r.k(inputStreamReader);
            b.a(inputStreamReader, null);
            return k4;
        } finally {
        }
    }

    public static /* synthetic */ String z(File file, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        return y(file, charset);
    }
}
