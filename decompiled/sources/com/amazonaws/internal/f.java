package com.amazonaws.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public class f extends e {

    /* renamed from: K, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23748K = LogFactory.c(f.class);

    /* renamed from: G, reason: collision with root package name */
    private final File f23749G;

    /* renamed from: H, reason: collision with root package name */
    private final FileInputStream f23750H;

    /* renamed from: I, reason: collision with root package name */
    private final FileChannel f23751I;

    /* renamed from: J, reason: collision with root package name */
    private long f23752J;

    public f(File file) throws IOException {
        this(new FileInputStream(file), file);
    }

    public static f k(File file) {
        return m(file, null);
    }

    public static f m(File file, String str) {
        try {
            return new f(file);
        } catch (IOException e4) {
            if (str == null) {
                throw new AmazonClientException(e4);
            }
            throw new AmazonClientException(str, e4);
        }
    }

    public static f n(FileInputStream fileInputStream) {
        return p(fileInputStream, null);
    }

    public static f p(FileInputStream fileInputStream, String str) {
        try {
            return new f(fileInputStream);
        } catch (IOException e4) {
            throw new AmazonClientException(str, e4);
        }
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        c();
        return this.f23750H.available();
    }

    public File j() {
        return this.f23749G;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i4) {
        c();
        try {
            this.f23752J = this.f23751I.position();
            com.amazonaws.logging.c cVar = f23748K;
            if (cVar.k()) {
                cVar.o("File input stream marked at position " + this.f23752J);
            }
        } catch (IOException e4) {
            throw new AmazonClientException("Failed to mark the file position", e4);
        }
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        c();
        return this.f23750H.read();
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        c();
        this.f23751I.position(this.f23752J);
        com.amazonaws.logging.c cVar = f23748K;
        if (cVar.k()) {
            cVar.o("Reset to position " + this.f23752J);
        }
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        c();
        return this.f23750H.skip(j4);
    }

    public f(FileInputStream fileInputStream) throws IOException {
        this(fileInputStream, null);
    }

    private f(FileInputStream fileInputStream, File file) throws IOException {
        super(fileInputStream);
        this.f23749G = file;
        this.f23750H = fileInputStream;
        FileChannel channel = fileInputStream.getChannel();
        this.f23751I = channel;
        this.f23752J = channel.position();
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        c();
        return this.f23750H.read(bArr, i4, i5);
    }
}
