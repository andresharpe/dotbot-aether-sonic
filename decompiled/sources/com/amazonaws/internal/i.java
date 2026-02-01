package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class i extends FilterInputStream implements c {
    /* JADX INFO: Access modifiers changed from: protected */
    public i(InputStream inputStream) {
        super(inputStream);
    }

    @Override // com.amazonaws.internal.c
    @Deprecated
    public boolean a() {
        if (((FilterInputStream) this).in instanceof c) {
            return ((c) ((FilterInputStream) this).in).a();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        c();
        return ((FilterInputStream) this).in.available();
    }

    protected void b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        if (!Thread.interrupted()) {
            return;
        }
        b();
        throw new AbortedException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterInputStream) this).in.close();
        c();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        c();
        ((FilterInputStream) this).in.mark(i4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        c();
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        c();
        return ((FilterInputStream) this).in.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        c();
        ((FilterInputStream) this).in.reset();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        c();
        return ((FilterInputStream) this).in.skip(j4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        c();
        return ((FilterInputStream) this).in.read(bArr, i4, i5);
    }
}
