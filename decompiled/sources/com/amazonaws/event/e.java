package com.amazonaws.event;

import com.amazonaws.internal.i;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class e extends i {

    /* renamed from: I, reason: collision with root package name */
    private static final int f23597I = 1024;

    /* renamed from: J, reason: collision with root package name */
    private static final int f23598J = 8;

    /* renamed from: E, reason: collision with root package name */
    private int f23599E;

    /* renamed from: F, reason: collision with root package name */
    private final c f23600F;

    /* renamed from: G, reason: collision with root package name */
    private int f23601G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f23602H;

    public e(InputStream inputStream, c cVar) {
        super(inputStream);
        this.f23599E = 8192;
        this.f23600F = cVar;
    }

    private void f(int i4) {
        int i5 = this.f23601G + i4;
        this.f23601G = i5;
        if (i5 >= this.f23599E) {
            this.f23600F.f(new a(i5));
            this.f23601G = 0;
        }
    }

    private void h() {
        if (!this.f23602H) {
            return;
        }
        a aVar = new a(this.f23601G);
        aVar.d(4);
        this.f23601G = 0;
        this.f23600F.f(aVar);
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i4 = this.f23601G;
        if (i4 > 0) {
            this.f23600F.f(new a(i4));
            this.f23601G = 0;
        }
        super.close();
    }

    public boolean d() {
        return this.f23602H;
    }

    public void i(boolean z3) {
        this.f23602H = z3;
    }

    public void j(int i4) {
        this.f23599E = i4 * 1024;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        if (read == -1) {
            h();
        } else {
            f(1);
        }
        return read;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        a aVar = new a(this.f23601G);
        aVar.d(32);
        this.f23600F.f(aVar);
        this.f23601G = 0;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int read = super.read(bArr, i4, i5);
        if (read == -1) {
            h();
        }
        if (read != -1) {
            f(read);
        }
        return read;
    }
}
