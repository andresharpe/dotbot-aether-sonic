package com.bumptech.glide.util;

import androidx.annotation.N;
import androidx.annotation.P;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

@Deprecated
/* loaded from: classes.dex */
public class d extends InputStream {

    /* renamed from: G, reason: collision with root package name */
    private static final Queue<d> f26939G = n.f(0);

    /* renamed from: E, reason: collision with root package name */
    private InputStream f26940E;

    /* renamed from: F, reason: collision with root package name */
    private IOException f26941F;

    d() {
    }

    static void a() {
        while (true) {
            Queue<d> queue = f26939G;
            if (!queue.isEmpty()) {
                queue.remove();
            } else {
                return;
            }
        }
    }

    @N
    public static d c(@N InputStream inputStream) {
        d poll;
        Queue<d> queue = f26939G;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.d(inputStream);
        return poll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f26940E.available();
    }

    @P
    public IOException b() {
        return this.f26941F;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f26940E.close();
    }

    void d(@N InputStream inputStream) {
        this.f26940E = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i4) {
        this.f26940E.mark(i4);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f26940E.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f26940E.read(bArr);
        } catch (IOException e4) {
            this.f26941F = e4;
            return -1;
        }
    }

    public void release() {
        this.f26941F = null;
        this.f26940E = null;
        Queue<d> queue = f26939G;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f26940E.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j4) {
        try {
            return this.f26940E.skip(j4);
        } catch (IOException e4) {
            this.f26941F = e4;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) {
        try {
            return this.f26940E.read(bArr, i4, i5);
        } catch (IOException e4) {
            this.f26941F = e4;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f26940E.read();
        } catch (IOException e4) {
            this.f26941F = e4;
            return -1;
        }
    }
}
