package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f55372a = Logger.getLogger(o.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class a implements y {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ A f55373E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ OutputStream f55374F;

        a(A a4, OutputStream outputStream) {
            this.f55373E = a4;
            this.f55374F = outputStream;
        }

        @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f55374F.close();
        }

        @Override // okio.y, java.io.Flushable
        public void flush() throws IOException {
            this.f55374F.flush();
        }

        @Override // okio.y
        public void n0(C2385c c2385c, long j4) throws IOException {
            C.b(c2385c.f55330F, 0L, j4);
            while (j4 > 0) {
                this.f55373E.h();
                v vVar = c2385c.f55329E;
                int min = (int) Math.min(j4, vVar.f55413c - vVar.f55412b);
                this.f55374F.write(vVar.f55411a, vVar.f55412b, min);
                int i4 = vVar.f55412b + min;
                vVar.f55412b = i4;
                long j5 = min;
                j4 -= j5;
                c2385c.f55330F -= j5;
                if (i4 == vVar.f55413c) {
                    c2385c.f55329E = vVar.b();
                    w.a(vVar);
                }
            }
        }

        @Override // okio.y
        public A timeout() {
            return this.f55373E;
        }

        public String toString() {
            return "sink(" + this.f55374F + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class b implements z {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ A f55375E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ InputStream f55376F;

        b(A a4, InputStream inputStream) {
            this.f55375E = a4;
            this.f55376F = inputStream;
        }

        @Override // okio.z
        public long P0(C2385c c2385c, long j4) throws IOException {
            if (j4 >= 0) {
                if (j4 == 0) {
                    return 0L;
                }
                try {
                    this.f55375E.h();
                    v a12 = c2385c.a1(1);
                    int read = this.f55376F.read(a12.f55411a, a12.f55413c, (int) Math.min(j4, 8192 - a12.f55413c));
                    if (read == -1) {
                        return -1L;
                    }
                    a12.f55413c += read;
                    long j5 = read;
                    c2385c.f55330F += j5;
                    return j5;
                } catch (AssertionError e4) {
                    if (o.e(e4)) {
                        throw new IOException(e4);
                    }
                    throw e4;
                }
            }
            throw new IllegalArgumentException("byteCount < 0: " + j4);
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f55376F.close();
        }

        @Override // okio.z
        public A timeout() {
            return this.f55375E;
        }

        public String toString() {
            return "source(" + this.f55376F + ")";
        }
    }

    /* loaded from: classes2.dex */
    final class c implements y {
        c() {
        }

        @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.y, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // okio.y
        public void n0(C2385c c2385c, long j4) throws IOException {
            c2385c.skip(j4);
        }

        @Override // okio.y
        public A timeout() {
            return A.f55303d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class d extends C2383a {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Socket f55377l;

        d(Socket socket) {
            this.f55377l = socket;
        }

        @Override // okio.C2383a
        protected IOException r(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.C2383a
        protected void w() {
            try {
                this.f55377l.close();
            } catch (AssertionError e4) {
                if (o.e(e4)) {
                    o.f55372a.log(Level.WARNING, "Failed to close timed out socket " + this.f55377l, (Throwable) e4);
                    return;
                }
                throw e4;
            } catch (Exception e5) {
                o.f55372a.log(Level.WARNING, "Failed to close timed out socket " + this.f55377l, (Throwable) e5);
            }
        }
    }

    private o() {
    }

    public static y a(File file) throws FileNotFoundException {
        if (file != null) {
            return g(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static y b() {
        return new c();
    }

    public static InterfaceC2386d c(y yVar) {
        return new t(yVar);
    }

    public static e d(z zVar) {
        return new u(zVar);
    }

    static boolean e(AssertionError assertionError) {
        if (assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains("getsockname failed")) {
            return true;
        }
        return false;
    }

    public static y f(File file) throws FileNotFoundException {
        if (file != null) {
            return g(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static y g(OutputStream outputStream) {
        return h(outputStream, new A());
    }

    private static y h(OutputStream outputStream, A a4) {
        if (outputStream != null) {
            if (a4 != null) {
                return new a(a4, outputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("out == null");
    }

    public static y i(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                C2383a p4 = p(socket);
                return p4.u(h(socket.getOutputStream(), p4));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    @IgnoreJRERequirement
    public static y j(Path path, OpenOption... openOptionArr) throws IOException {
        OutputStream newOutputStream;
        if (path != null) {
            newOutputStream = Files.newOutputStream(path, openOptionArr);
            return g(newOutputStream);
        }
        throw new IllegalArgumentException("path == null");
    }

    public static z k(File file) throws FileNotFoundException {
        if (file != null) {
            return l(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static z l(InputStream inputStream) {
        return m(inputStream, new A());
    }

    private static z m(InputStream inputStream, A a4) {
        if (inputStream != null) {
            if (a4 != null) {
                return new b(a4, inputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("in == null");
    }

    public static z n(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                C2383a p4 = p(socket);
                return p4.v(m(socket.getInputStream(), p4));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    @IgnoreJRERequirement
    public static z o(Path path, OpenOption... openOptionArr) throws IOException {
        InputStream newInputStream;
        if (path != null) {
            newInputStream = Files.newInputStream(path, openOptionArr);
            return l(newInputStream);
        }
        throw new IllegalArgumentException("path == null");
    }

    private static C2383a p(Socket socket) {
        return new d(socket);
    }
}
