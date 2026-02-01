package kotlin.io.path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C2222d;

@kotlin.jvm.internal.U({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,326:1\n1#2:327\n1#2:329\n52#3:328\n1313#4,2:330\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n202#1:329\n202#1:328\n202#1:330,2\n*E\n"})
/* renamed from: kotlin.io.path.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2128b0 {
    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path A(Path path, kotlin.sequences.m<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        Iterable N3;
        Path write;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(lines, "lines");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(options, "options");
        N3 = SequencesKt___SequencesKt.N(lines);
        write = Files.write(path, N3, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(write, "write(...)");
        return write;
    }

    static /* synthetic */ Path B(Path path, Iterable lines, Charset charset, OpenOption[] options, int i4, Object obj) throws IOException {
        Path write;
        if ((i4 & 2) != 0) {
            charset = C2222d.f52792b;
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(lines, "lines");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(options, "options");
        write = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(write, "write(...)");
        return write;
    }

    static /* synthetic */ Path C(Path path, kotlin.sequences.m lines, Charset charset, OpenOption[] options, int i4, Object obj) throws IOException {
        Iterable N3;
        Path write;
        if ((i4 & 2) != 0) {
            charset = C2222d.f52792b;
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(lines, "lines");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(options, "options");
        N3 = SequencesKt___SequencesKt.N(lines);
        write = Files.write(path, N3, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(write, "write(...)");
        return write;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    public static final void D(@l3.d Path path, @l3.d CharSequence text, @l3.d Charset charset, @l3.d OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(text, "text");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(newOutputStream, "newOutputStream(...)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            kotlin.io.b.a(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void E(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            charset = C2222d.f52792b;
        }
        D(path, charSequence, charset, openOptionArr);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final OutputStreamWriter F(Path path, Charset charset, OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new OutputStreamWriter(newOutputStream, charset);
    }

    static /* synthetic */ OutputStreamWriter G(Path path, Charset charset, OpenOption[] options, int i4, Object obj) throws IOException {
        OutputStream newOutputStream;
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new OutputStreamWriter(newOutputStream, charset);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final void a(Path path, byte[] array) throws IOException {
        StandardOpenOption standardOpenOption;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(array, "array");
        standardOpenOption = StandardOpenOption.APPEND;
        Files.write(path, array, standardOpenOption);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path b(Path path, Iterable<? extends CharSequence> lines, Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(lines, "lines");
        kotlin.jvm.internal.F.p(charset, "charset");
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, lines, charset, standardOpenOption);
        kotlin.jvm.internal.F.o(write, "write(...)");
        return write;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path c(Path path, kotlin.sequences.m<? extends CharSequence> lines, Charset charset) throws IOException {
        Iterable N3;
        StandardOpenOption standardOpenOption;
        Path write;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(lines, "lines");
        kotlin.jvm.internal.F.p(charset, "charset");
        N3 = SequencesKt___SequencesKt.N(lines);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, N3, charset, standardOpenOption);
        kotlin.jvm.internal.F.o(write, "write(...)");
        return write;
    }

    static /* synthetic */ Path d(Path path, Iterable lines, Charset charset, int i4, Object obj) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i4 & 2) != 0) {
            charset = C2222d.f52792b;
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(lines, "lines");
        kotlin.jvm.internal.F.p(charset, "charset");
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, lines, charset, standardOpenOption);
        kotlin.jvm.internal.F.o(write, "write(...)");
        return write;
    }

    static /* synthetic */ Path e(Path path, kotlin.sequences.m lines, Charset charset, int i4, Object obj) throws IOException {
        Iterable N3;
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i4 & 2) != 0) {
            charset = C2222d.f52792b;
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(lines, "lines");
        kotlin.jvm.internal.F.p(charset, "charset");
        N3 = SequencesKt___SequencesKt.N(lines);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, N3, charset, standardOpenOption);
        kotlin.jvm.internal.F.o(write, "write(...)");
        return write;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    public static final void f(@l3.d Path path, @l3.d CharSequence text, @l3.d Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        OutputStream newOutputStream;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(text, "text");
        kotlin.jvm.internal.F.p(charset, "charset");
        standardOpenOption = StandardOpenOption.APPEND;
        newOutputStream = Files.newOutputStream(path, standardOpenOption);
        kotlin.jvm.internal.F.o(newOutputStream, "newOutputStream(...)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            kotlin.io.b.a(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void g(Path path, CharSequence charSequence, Charset charset, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            charset = C2222d.f52792b;
        }
        f(path, charSequence, charset);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final BufferedReader h(Path path, Charset charset, int i4, OpenOption... options) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new BufferedReader(new InputStreamReader(newInputStream, charset), i4);
    }

    static /* synthetic */ BufferedReader i(Path path, Charset charset, int i4, OpenOption[] options, int i5, Object obj) throws IOException {
        InputStream newInputStream;
        if ((i5 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new BufferedReader(new InputStreamReader(newInputStream, charset), i4);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final BufferedWriter j(Path path, Charset charset, int i4, OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new BufferedWriter(new OutputStreamWriter(newOutputStream, charset), i4);
    }

    static /* synthetic */ BufferedWriter k(Path path, Charset charset, int i4, OpenOption[] options, int i5, Object obj) throws IOException {
        OutputStream newOutputStream;
        if ((i5 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new BufferedWriter(new OutputStreamWriter(newOutputStream, charset), i4);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final void l(Path path, Charset charset, X2.l<? super String, kotlin.H0> action) throws IOException {
        BufferedReader newBufferedReader;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(action, "action");
        newBufferedReader = Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.F.o(newBufferedReader, "newBufferedReader(...)");
        try {
            Iterator<String> it = kotlin.io.r.h(newBufferedReader).iterator();
            while (it.hasNext()) {
                action.C(it.next());
            }
            kotlin.H0 h02 = kotlin.H0.f51801a;
            kotlin.jvm.internal.C.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newBufferedReader, null);
            } else {
                newBufferedReader.close();
            }
            kotlin.jvm.internal.C.c(1);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.C.d(1);
                if (!kotlin.internal.m.a(1, 1, 0)) {
                    try {
                        newBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                } else {
                    kotlin.io.b.a(newBufferedReader, th);
                }
                kotlin.jvm.internal.C.c(1);
                throw th2;
            }
        }
    }

    static /* synthetic */ void m(Path path, Charset charset, X2.l action, int i4, Object obj) throws IOException {
        BufferedReader newBufferedReader;
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(action, "action");
        newBufferedReader = Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.F.o(newBufferedReader, "newBufferedReader(...)");
        try {
            Iterator<String> it = kotlin.io.r.h(newBufferedReader).iterator();
            while (it.hasNext()) {
                action.C(it.next());
            }
            kotlin.H0 h02 = kotlin.H0.f51801a;
            kotlin.jvm.internal.C.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newBufferedReader, null);
            } else {
                newBufferedReader.close();
            }
            kotlin.jvm.internal.C.c(1);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.C.d(1);
                if (!kotlin.internal.m.a(1, 1, 0)) {
                    try {
                        newBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                } else {
                    kotlin.io.b.a(newBufferedReader, th);
                }
                kotlin.jvm.internal.C.c(1);
                throw th2;
            }
        }
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final InputStream n(Path path, OpenOption... options) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(newInputStream, "newInputStream(...)");
        return newInputStream;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final OutputStream o(Path path, OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(newOutputStream, "newOutputStream(...)");
        return newOutputStream;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final byte[] p(Path path) throws IOException {
        byte[] readAllBytes;
        kotlin.jvm.internal.F.p(path, "<this>");
        readAllBytes = Files.readAllBytes(path);
        kotlin.jvm.internal.F.o(readAllBytes, "readAllBytes(...)");
        return readAllBytes;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final List<String> q(Path path, Charset charset) throws IOException {
        List<String> readAllLines;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        readAllLines = Files.readAllLines(path, charset);
        kotlin.jvm.internal.F.o(readAllLines, "readAllLines(...)");
        return readAllLines;
    }

    static /* synthetic */ List r(Path path, Charset charset, int i4, Object obj) throws IOException {
        List readAllLines;
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        readAllLines = Files.readAllLines(path, charset);
        kotlin.jvm.internal.F.o(readAllLines, "readAllLines(...)");
        return readAllLines;
    }

    @l3.d
    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    public static final String s(@l3.d Path path, @l3.d Charset charset) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
        InputStreamReader inputStreamReader = new InputStreamReader(newInputStream, charset);
        try {
            String k4 = kotlin.io.r.k(inputStreamReader);
            kotlin.io.b.a(inputStreamReader, null);
            return k4;
        } finally {
        }
    }

    public static /* synthetic */ String t(Path path, Charset charset, int i4, Object obj) throws IOException {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        return s(path, charset);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final InputStreamReader u(Path path, Charset charset, OpenOption... options) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new InputStreamReader(newInputStream, charset);
    }

    static /* synthetic */ InputStreamReader v(Path path, Charset charset, OpenOption[] options, int i4, Object obj) throws IOException {
        InputStream newInputStream;
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new InputStreamReader(newInputStream, charset);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final <T> T w(Path path, Charset charset, X2.l<? super kotlin.sequences.m<String>, ? extends T> block) throws IOException {
        BufferedReader newBufferedReader;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(block, "block");
        newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            kotlin.jvm.internal.F.m(newBufferedReader);
            T C3 = block.C(kotlin.io.r.h(newBufferedReader));
            kotlin.jvm.internal.C.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newBufferedReader, null);
            } else if (newBufferedReader != null) {
                newBufferedReader.close();
            }
            kotlin.jvm.internal.C.c(1);
            return C3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.C.d(1);
                if (!kotlin.internal.m.a(1, 1, 0)) {
                    if (newBufferedReader != null) {
                        try {
                            newBufferedReader.close();
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    kotlin.io.b.a(newBufferedReader, th);
                }
                kotlin.jvm.internal.C.c(1);
                throw th2;
            }
        }
    }

    static /* synthetic */ Object x(Path path, Charset charset, X2.l block, int i4, Object obj) throws IOException {
        BufferedReader newBufferedReader;
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(block, "block");
        newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            kotlin.jvm.internal.F.m(newBufferedReader);
            Object C3 = block.C(kotlin.io.r.h(newBufferedReader));
            kotlin.jvm.internal.C.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newBufferedReader, null);
            } else if (newBufferedReader != null) {
                newBufferedReader.close();
            }
            kotlin.jvm.internal.C.c(1);
            return C3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.C.d(1);
                if (!kotlin.internal.m.a(1, 1, 0)) {
                    if (newBufferedReader != null) {
                        try {
                            newBufferedReader.close();
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    kotlin.io.b.a(newBufferedReader, th);
                }
                kotlin.jvm.internal.C.c(1);
                throw th2;
            }
        }
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final void y(Path path, byte[] array, OpenOption... options) throws IOException {
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(array, "array");
        kotlin.jvm.internal.F.p(options, "options");
        Files.write(path, array, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path z(Path path, Iterable<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        Path write;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(lines, "lines");
        kotlin.jvm.internal.F.p(charset, "charset");
        kotlin.jvm.internal.F.p(options, "options");
        write = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(write, "write(...)");
        return write;
    }
}
