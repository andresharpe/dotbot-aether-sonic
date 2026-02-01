package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.H0;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlin.sequences.s;
import kotlin.text.C2222d;

@W2.i(name = "TextStreamsKt")
@U({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,151:1\n52#1:152\n1#2:153\n1#2:156\n1313#3,2:154\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n33#1:152\n33#1:153\n33#1:154,2\n*E\n"})
/* loaded from: classes2.dex */
public final class r {

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.l<String, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f52252F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList<String> arrayList) {
            super(1);
            this.f52252F = arrayList;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(String str) {
            c(str);
            return H0.f51801a;
        }

        public final void c(@l3.d String it) {
            F.p(it, "it");
            this.f52252F.add(it);
        }
    }

    @kotlin.internal.f
    private static final BufferedReader a(Reader reader, int i4) {
        F.p(reader, "<this>");
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader, i4);
    }

    @kotlin.internal.f
    private static final BufferedWriter b(Writer writer, int i4) {
        F.p(writer, "<this>");
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter) writer;
        }
        return new BufferedWriter(writer, i4);
    }

    static /* synthetic */ BufferedReader c(Reader reader, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 8192;
        }
        F.p(reader, "<this>");
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader, i4);
    }

    static /* synthetic */ BufferedWriter d(Writer writer, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 8192;
        }
        F.p(writer, "<this>");
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter) writer;
        }
        return new BufferedWriter(writer, i4);
    }

    public static final long e(@l3.d Reader reader, @l3.d Writer out, int i4) {
        F.p(reader, "<this>");
        F.p(out, "out");
        char[] cArr = new char[i4];
        int read = reader.read(cArr);
        long j4 = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j4 += read;
            read = reader.read(cArr);
        }
        return j4;
    }

    public static /* synthetic */ long f(Reader reader, Writer writer, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        return e(reader, writer, i4);
    }

    public static final void g(@l3.d Reader reader, @l3.d X2.l<? super String, H0> action) {
        BufferedReader bufferedReader;
        F.p(reader, "<this>");
        F.p(action, "action");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            Iterator<String> it = h(bufferedReader).iterator();
            while (it.hasNext()) {
                action.C(it.next());
            }
            H0 h02 = H0.f51801a;
            b.a(bufferedReader, null);
        } finally {
        }
    }

    @l3.d
    public static final kotlin.sequences.m<String> h(@l3.d BufferedReader bufferedReader) {
        kotlin.sequences.m<String> f4;
        F.p(bufferedReader, "<this>");
        f4 = s.f(new o(bufferedReader));
        return f4;
    }

    @l3.d
    public static final byte[] i(@l3.d URL url) {
        F.p(url, "<this>");
        InputStream openStream = url.openStream();
        try {
            F.m(openStream);
            byte[] p4 = kotlin.io.a.p(openStream);
            b.a(openStream, null);
            return p4;
        } finally {
        }
    }

    @l3.d
    public static final List<String> j(@l3.d Reader reader) {
        F.p(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        g(reader, new a(arrayList));
        return arrayList;
    }

    @l3.d
    public static final String k(@l3.d Reader reader) {
        F.p(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        f(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        F.o(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    @kotlin.internal.f
    private static final String l(URL url, Charset charset) {
        F.p(url, "<this>");
        F.p(charset, "charset");
        return new String(i(url), charset);
    }

    static /* synthetic */ String m(URL url, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        F.p(url, "<this>");
        F.p(charset, "charset");
        return new String(i(url), charset);
    }

    @kotlin.internal.f
    private static final StringReader n(String str) {
        F.p(str, "<this>");
        return new StringReader(str);
    }

    public static final <T> T o(@l3.d Reader reader, @l3.d X2.l<? super kotlin.sequences.m<String>, ? extends T> block) {
        BufferedReader bufferedReader;
        F.p(reader, "<this>");
        F.p(block, "block");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            T C3 = block.C(h(bufferedReader));
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
}
