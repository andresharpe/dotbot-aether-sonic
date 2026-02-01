package com.amazonaws.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public class h extends com.amazonaws.internal.i {

    /* renamed from: E, reason: collision with root package name */
    private CRC32 f24312E;

    public h(InputStream inputStream) {
        super(inputStream);
        this.f24312E = new CRC32();
    }

    public long d() {
        return this.f24312E.getValue();
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        c();
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f24312E.update(read);
        }
        return read;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        c();
        this.f24312E.reset();
        ((FilterInputStream) this).in.reset();
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        c();
        int read = ((FilterInputStream) this).in.read(bArr, i4, i5);
        if (read != -1) {
            this.f24312E.update(bArr, i4, read);
        }
        return read;
    }
}
