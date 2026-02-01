package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1818c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f36884a = 8192;

    /* renamed from: b, reason: collision with root package name */
    private static final int f36885b = 2147483639;

    /* renamed from: c, reason: collision with root package name */
    private static final int f36886c = 20;

    private C1818c() {
    }

    private static byte[] a(Queue<byte[]> queue, int i4) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i4) {
            return remove;
        }
        int length = i4 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i4);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i4 - length, min);
            length -= min;
        }
        return copyOf;
    }

    static byte[] b() {
        return new byte[8192];
    }

    public static InputStream c(InputStream inputStream, long j4) {
        return new a(inputStream, j4);
    }

    private static int d(long j4) {
        if (j4 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j4 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j4;
    }

    public static byte[] e(InputStream inputStream) throws IOException {
        return f(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] f(InputStream inputStream, Queue<byte[]> queue, int i4) throws IOException {
        int i5;
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i4) * 2));
        while (i4 < f36885b) {
            int min2 = Math.min(min, f36885b - i4);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i6 = 0;
            while (i6 < min2) {
                int read = inputStream.read(bArr, i6, min2 - i6);
                if (read == -1) {
                    return a(queue, i4);
                }
                i6 += read;
                i4 += read;
            }
            long j4 = min;
            if (min < 4096) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            min = d(j4 * i5);
        }
        if (inputStream.read() == -1) {
            return a(queue, f36885b);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: com.google.firebase.messaging.c$a */
    /* loaded from: classes2.dex */
    private static final class a extends FilterInputStream {

        /* renamed from: E, reason: collision with root package name */
        private long f36887E;

        /* renamed from: F, reason: collision with root package name */
        private long f36888F;

        a(InputStream inputStream, long j4) {
            super(inputStream);
            this.f36888F = -1L;
            this.f36887E = j4;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f36887E);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i4) {
            ((FilterInputStream) this).in.mark(i4);
            this.f36888F = this.f36887E;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f36887E == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f36887E--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f36888F != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f36887E = this.f36888F;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j4) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j4, this.f36887E));
            this.f36887E -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            long j4 = this.f36887E;
            if (j4 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i4, (int) Math.min(i5, j4));
            if (read != -1) {
                this.f36887E -= read;
            }
            return read;
        }
    }
}
