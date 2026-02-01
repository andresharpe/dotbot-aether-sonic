package com.bumptech.glide.util;

import androidx.annotation.N;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class j extends FilterInputStream {

    /* renamed from: F, reason: collision with root package name */
    private static final int f26955F = Integer.MIN_VALUE;

    /* renamed from: G, reason: collision with root package name */
    private static final int f26956G = -1;

    /* renamed from: E, reason: collision with root package name */
    private int f26957E;

    public j(@N InputStream inputStream) {
        super(inputStream);
        this.f26957E = Integer.MIN_VALUE;
    }

    private long a(long j4) {
        int i4 = this.f26957E;
        if (i4 == 0) {
            return -1L;
        }
        if (i4 != Integer.MIN_VALUE && j4 > i4) {
            return i4;
        }
        return j4;
    }

    private void b(long j4) {
        int i4 = this.f26957E;
        if (i4 != Integer.MIN_VALUE && j4 != -1) {
            this.f26957E = (int) (i4 - j4);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i4 = this.f26957E;
        if (i4 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i4, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        super.mark(i4);
        this.f26957E = i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f26957E = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long a4 = a(j4);
        if (a4 == -1) {
            return 0L;
        }
        long skip = super.skip(a4);
        b(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@N byte[] bArr, int i4, int i5) throws IOException {
        int a4 = (int) a(i5);
        if (a4 == -1) {
            return -1;
        }
        int read = super.read(bArr, i4, a4);
        b(read);
        return read;
    }
}
