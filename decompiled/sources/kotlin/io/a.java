package kotlin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;
import kotlin.V;
import kotlin.Y;
import kotlin.collections.AbstractC2105s;
import kotlin.jvm.internal.F;
import kotlin.text.C2222d;

@W2.i(name = "ByteStreamsKt")
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: kotlin.io.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0464a extends AbstractC2105s {

        /* renamed from: E, reason: collision with root package name */
        private int f52102E = -1;

        /* renamed from: F, reason: collision with root package name */
        private boolean f52103F;

        /* renamed from: G, reason: collision with root package name */
        private boolean f52104G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ BufferedInputStream f52105H;

        C0464a(BufferedInputStream bufferedInputStream) {
            this.f52105H = bufferedInputStream;
        }

        private final void i() {
            if (!this.f52103F && !this.f52104G) {
                int read = this.f52105H.read();
                this.f52102E = read;
                boolean z3 = true;
                this.f52103F = true;
                if (read != -1) {
                    z3 = false;
                }
                this.f52104G = z3;
            }
        }

        @Override // kotlin.collections.AbstractC2105s
        public byte c() {
            i();
            if (!this.f52104G) {
                byte b4 = (byte) this.f52102E;
                this.f52103F = false;
                return b4;
            }
            throw new NoSuchElementException("Input stream is over.");
        }

        public final boolean d() {
            return this.f52104G;
        }

        public final int e() {
            return this.f52102E;
        }

        public final boolean h() {
            return this.f52103F;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            i();
            return !this.f52104G;
        }

        public final void j(boolean z3) {
            this.f52104G = z3;
        }

        public final void k(int i4) {
            this.f52102E = i4;
        }

        public final void l(boolean z3) {
            this.f52103F = z3;
        }
    }

    @kotlin.internal.f
    private static final BufferedInputStream a(InputStream inputStream, int i4) {
        F.p(inputStream, "<this>");
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream, i4);
    }

    @kotlin.internal.f
    private static final BufferedOutputStream b(OutputStream outputStream, int i4) {
        F.p(outputStream, "<this>");
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStream;
        }
        return new BufferedOutputStream(outputStream, i4);
    }

    static /* synthetic */ BufferedInputStream c(InputStream inputStream, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 8192;
        }
        F.p(inputStream, "<this>");
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream, i4);
    }

    static /* synthetic */ BufferedOutputStream d(OutputStream outputStream, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 8192;
        }
        F.p(outputStream, "<this>");
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStream;
        }
        return new BufferedOutputStream(outputStream, i4);
    }

    @kotlin.internal.f
    private static final BufferedReader e(InputStream inputStream, Charset charset) {
        F.p(inputStream, "<this>");
        F.p(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        if (inputStreamReader instanceof BufferedReader) {
            return (BufferedReader) inputStreamReader;
        }
        return new BufferedReader(inputStreamReader, 8192);
    }

    static /* synthetic */ BufferedReader f(InputStream inputStream, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        F.p(inputStream, "<this>");
        F.p(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        if (inputStreamReader instanceof BufferedReader) {
            return (BufferedReader) inputStreamReader;
        }
        return new BufferedReader(inputStreamReader, 8192);
    }

    @kotlin.internal.f
    private static final BufferedWriter g(OutputStream outputStream, Charset charset) {
        F.p(outputStream, "<this>");
        F.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            return (BufferedWriter) outputStreamWriter;
        }
        return new BufferedWriter(outputStreamWriter, 8192);
    }

    static /* synthetic */ BufferedWriter h(OutputStream outputStream, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        F.p(outputStream, "<this>");
        F.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            return (BufferedWriter) outputStreamWriter;
        }
        return new BufferedWriter(outputStreamWriter, 8192);
    }

    @kotlin.internal.f
    private static final ByteArrayInputStream i(String str, Charset charset) {
        F.p(str, "<this>");
        F.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        F.o(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    static /* synthetic */ ByteArrayInputStream j(String str, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        F.p(str, "<this>");
        F.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        F.o(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long k(@l3.d InputStream inputStream, @l3.d OutputStream out, int i4) {
        F.p(inputStream, "<this>");
        F.p(out, "out");
        byte[] bArr = new byte[i4];
        int read = inputStream.read(bArr);
        long j4 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j4 += read;
            read = inputStream.read(bArr);
        }
        return j4;
    }

    public static /* synthetic */ long l(InputStream inputStream, OutputStream outputStream, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        return k(inputStream, outputStream, i4);
    }

    @kotlin.internal.f
    private static final ByteArrayInputStream m(byte[] bArr) {
        F.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @kotlin.internal.f
    private static final ByteArrayInputStream n(byte[] bArr, int i4, int i5) {
        F.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i4, i5);
    }

    @l3.d
    public static final AbstractC2105s o(@l3.d BufferedInputStream bufferedInputStream) {
        F.p(bufferedInputStream, "<this>");
        return new C0464a(bufferedInputStream);
    }

    @l3.d
    @Y(version = "1.3")
    public static final byte[] p(@l3.d InputStream inputStream) {
        F.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        F.o(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @l3.d
    @InterfaceC2205l(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @V(expression = "readBytes()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", warningSince = "1.3")
    public static final byte[] q(@l3.d InputStream inputStream, int i4) {
        F.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i4, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        F.o(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ byte[] r(InputStream inputStream, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 8192;
        }
        return q(inputStream, i4);
    }

    @kotlin.internal.f
    private static final InputStreamReader s(InputStream inputStream, Charset charset) {
        F.p(inputStream, "<this>");
        F.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    static /* synthetic */ InputStreamReader t(InputStream inputStream, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        F.p(inputStream, "<this>");
        F.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @kotlin.internal.f
    private static final OutputStreamWriter u(OutputStream outputStream, Charset charset) {
        F.p(outputStream, "<this>");
        F.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    static /* synthetic */ OutputStreamWriter v(OutputStream outputStream, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        F.p(outputStream, "<this>");
        F.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}
