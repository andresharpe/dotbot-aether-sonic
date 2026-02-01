package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class z extends ByteArrayOutputStream {

    /* renamed from: F, reason: collision with root package name */
    private static final int f24683F = 256;

    /* renamed from: E, reason: collision with root package name */
    private final h f24684E;

    public z(h hVar) {
        this(hVar, 256);
    }

    private void a(int i4) {
        int i5 = ((ByteArrayOutputStream) this).count;
        if (i5 + i4 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] a4 = this.f24684E.a((i5 + i4) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a4, 0, ((ByteArrayOutputStream) this).count);
        this.f24684E.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a4;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f24684E.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.f24684E.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i4, int i5) {
        a(i5);
        super.write(bArr, i4, i5);
    }

    public z(h hVar, int i4) {
        this.f24684E = hVar;
        ((ByteArrayOutputStream) this).buf = hVar.a(Math.max(i4, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i4) {
        a(1);
        super.write(i4);
    }
}
