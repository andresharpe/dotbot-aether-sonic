package com.bumptech.glide.util;

import androidx.annotation.N;
import androidx.annotation.P;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f26926a = 16384;

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<byte[]> f26927b = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f26931a;

        /* renamed from: b, reason: collision with root package name */
        final int f26932b;

        /* renamed from: c, reason: collision with root package name */
        final byte[] f26933c;

        b(@N byte[] bArr, int i4, int i5) {
            this.f26933c = bArr;
            this.f26931a = i4;
            this.f26932b = i5;
        }
    }

    private a() {
    }

    @N
    public static ByteBuffer a(@N File file) throws IOException {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        try {
                            fileChannel.close();
                        } catch (IOException unused) {
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        return load;
                    } catch (Throwable th) {
                        th = th;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                                throw th;
                            } catch (IOException unused4) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
                throw new IOException("File unsuitable for memory mapping");
            }
            throw new IOException("File too large to map into memory");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    @N
    public static ByteBuffer b(@N InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f26927b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                f26927b.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
        }
    }

    @P
    private static b c(@N ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        return null;
    }

    @N
    public static byte[] d(@N ByteBuffer byteBuffer) {
        b c4 = c(byteBuffer);
        if (c4 != null && c4.f26931a == 0 && c4.f26932b == c4.f26933c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void e(@N ByteBuffer byteBuffer, @N File file) throws IOException {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    @N
    public static InputStream f(@N ByteBuffer byteBuffer) {
        return new C0242a(byteBuffer);
    }

    public static void g(@N ByteBuffer byteBuffer, @N OutputStream outputStream) throws IOException {
        b c4 = c(byteBuffer);
        if (c4 != null) {
            byte[] bArr = c4.f26933c;
            int i4 = c4.f26931a;
            outputStream.write(bArr, i4, c4.f26932b + i4);
            return;
        }
        byte[] andSet = f26927b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (byteBuffer.remaining() > 0) {
            int min = Math.min(byteBuffer.remaining(), andSet.length);
            byteBuffer.get(andSet, 0, min);
            outputStream.write(andSet, 0, min);
        }
        f26927b.set(andSet);
    }

    /* renamed from: com.bumptech.glide.util.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0242a extends InputStream {

        /* renamed from: G, reason: collision with root package name */
        private static final int f26928G = -1;

        /* renamed from: E, reason: collision with root package name */
        @N
        private final ByteBuffer f26929E;

        /* renamed from: F, reason: collision with root package name */
        private int f26930F = -1;

        C0242a(@N ByteBuffer byteBuffer) {
            this.f26929E = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f26929E.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i4) {
            this.f26930F = this.f26929E.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f26929E.hasRemaining()) {
                return this.f26929E.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i4 = this.f26930F;
            if (i4 != -1) {
                this.f26929E.position(i4);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        @Override // java.io.InputStream
        public long skip(long j4) throws IOException {
            if (!this.f26929E.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j4, available());
            this.f26929E.position((int) (r0.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(@N byte[] bArr, int i4, int i5) throws IOException {
            if (!this.f26929E.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i5, available());
            this.f26929E.get(bArr, i4, min);
            return min;
        }
    }
}
