package com.bumptech.glide.util;

import androidx.annotation.B;
import androidx.annotation.N;
import androidx.annotation.P;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes.dex */
public final class e extends InputStream {

    /* renamed from: G, reason: collision with root package name */
    @B("POOL")
    private static final Queue<e> f26942G = n.f(0);

    /* renamed from: E, reason: collision with root package name */
    private InputStream f26943E;

    /* renamed from: F, reason: collision with root package name */
    private IOException f26944F;

    e() {
    }

    static void a() {
        synchronized (f26942G) {
            while (true) {
                try {
                    Queue<e> queue = f26942G;
                    if (!queue.isEmpty()) {
                        queue.remove();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @N
    public static e c(@N InputStream inputStream) {
        e poll;
        Queue<e> queue = f26942G;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new e();
        }
        poll.d(inputStream);
        return poll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f26943E.available();
    }

    @P
    public IOException b() {
        return this.f26944F;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f26943E.close();
    }

    void d(@N InputStream inputStream) {
        this.f26943E = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i4) {
        this.f26943E.mark(i4);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f26943E.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f26943E.read();
        } catch (IOException e4) {
            this.f26944F = e4;
            throw e4;
        }
    }

    public void release() {
        this.f26944F = null;
        this.f26943E = null;
        Queue<e> queue = f26942G;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f26943E.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        try {
            return this.f26943E.skip(j4);
        } catch (IOException e4) {
            this.f26944F = e4;
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f26943E.read(bArr);
        } catch (IOException e4) {
            this.f26944F = e4;
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        try {
            return this.f26943E.read(bArr, i4, i5);
        } catch (IOException e4) {
            this.f26944F = e4;
            throw e4;
        }
    }
}
