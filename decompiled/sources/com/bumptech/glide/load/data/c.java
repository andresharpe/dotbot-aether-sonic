package com.bumptech.glide.load.data;

import androidx.annotation.N;
import androidx.annotation.i0;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final OutputStream f25792E;

    /* renamed from: F, reason: collision with root package name */
    private byte[] f25793F;

    /* renamed from: G, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.b f25794G;

    /* renamed from: H, reason: collision with root package name */
    private int f25795H;

    public c(@N OutputStream outputStream, @N com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void a() throws IOException {
        int i4 = this.f25795H;
        if (i4 > 0) {
            this.f25792E.write(this.f25793F, 0, i4);
            this.f25795H = 0;
        }
    }

    private void b() throws IOException {
        if (this.f25795H == this.f25793F.length) {
            a();
        }
    }

    private void release() {
        byte[] bArr = this.f25793F;
        if (bArr != null) {
            this.f25794G.put(bArr);
            this.f25793F = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f25792E.close();
            release();
        } catch (Throwable th) {
            this.f25792E.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f25792E.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        byte[] bArr = this.f25793F;
        int i5 = this.f25795H;
        this.f25795H = i5 + 1;
        bArr[i5] = (byte) i4;
        b();
    }

    @i0
    c(@N OutputStream outputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i4) {
        this.f25792E = outputStream;
        this.f25794G = bVar;
        this.f25793F = (byte[]) bVar.e(i4, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@N byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@N byte[] bArr, int i4, int i5) throws IOException {
        int i6 = 0;
        do {
            int i7 = i5 - i6;
            int i8 = i4 + i6;
            int i9 = this.f25795H;
            if (i9 == 0 && i7 >= this.f25793F.length) {
                this.f25792E.write(bArr, i8, i7);
                return;
            }
            int min = Math.min(i7, this.f25793F.length - i9);
            System.arraycopy(bArr, i8, this.f25793F, this.f25795H, min);
            this.f25795H += min;
            i6 += min;
            b();
        } while (i6 < i5);
    }
}
