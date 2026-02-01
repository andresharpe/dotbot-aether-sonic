package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;

@Deprecated
/* loaded from: classes.dex */
public class j extends com.amazonaws.internal.i {

    /* renamed from: E, reason: collision with root package name */
    private long f24313E;

    public j(InputStream inputStream) {
        super(inputStream);
        this.f24313E = 0L;
    }

    public long d() {
        return this.f24313E;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        this.f24313E += read >= 0 ? 1L : 0L;
        return read;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int read = super.read(bArr, i4, i5);
        this.f24313E += read >= 0 ? read : 0L;
        return read;
    }
}
