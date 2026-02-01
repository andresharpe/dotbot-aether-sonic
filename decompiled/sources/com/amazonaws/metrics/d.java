package com.amazonaws.metrics;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class d extends com.amazonaws.internal.i {

    /* renamed from: E, reason: collision with root package name */
    private final a f23823E;

    public d(o oVar, InputStream inputStream) {
        super(inputStream);
        this.f23823E = new a(oVar);
    }

    @Override // com.amazonaws.internal.i, com.amazonaws.internal.c
    public final boolean a() {
        return true;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23823E.g();
        ((FilterInputStream) this).in.close();
        c();
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        c();
        long h4 = this.f23823E.h();
        int read = ((FilterInputStream) this).in.read(bArr, i4, i5);
        if (read > 0) {
            this.f23823E.e(read, h4);
        }
        return read;
    }
}
