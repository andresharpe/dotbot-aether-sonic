package com.bumptech.glide.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class c implements Closeable {

    /* renamed from: J, reason: collision with root package name */
    private static final byte f25459J = 13;

    /* renamed from: K, reason: collision with root package name */
    private static final byte f25460K = 10;

    /* renamed from: E, reason: collision with root package name */
    private final InputStream f25461E;

    /* renamed from: F, reason: collision with root package name */
    private final Charset f25462F;

    /* renamed from: G, reason: collision with root package name */
    private byte[] f25463G;

    /* renamed from: H, reason: collision with root package name */
    private int f25464H;

    /* renamed from: I, reason: collision with root package name */
    private int f25465I;

    /* loaded from: classes.dex */
    class a extends ByteArrayOutputStream {
        a(int i4) {
            super(i4);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i4 = ((ByteArrayOutputStream) this).count;
            if (i4 > 0 && ((ByteArrayOutputStream) this).buf[i4 - 1] == 13) {
                i4--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i4, c.this.f25462F.name());
            } catch (UnsupportedEncodingException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.f25461E;
        byte[] bArr = this.f25463G;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f25464H = 0;
            this.f25465I = read;
            return;
        }
        throw new EOFException();
    }

    public boolean c() {
        if (this.f25465I == -1) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f25461E) {
            try {
                if (this.f25463G != null) {
                    this.f25463G = null;
                    this.f25461E.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String d() throws IOException {
        int i4;
        byte[] bArr;
        int i5;
        synchronized (this.f25461E) {
            try {
                if (this.f25463G != null) {
                    if (this.f25464H >= this.f25465I) {
                        b();
                    }
                    for (int i6 = this.f25464H; i6 != this.f25465I; i6++) {
                        byte[] bArr2 = this.f25463G;
                        if (bArr2[i6] == 10) {
                            int i7 = this.f25464H;
                            if (i6 != i7) {
                                i5 = i6 - 1;
                                if (bArr2[i5] == 13) {
                                    String str = new String(bArr2, i7, i5 - i7, this.f25462F.name());
                                    this.f25464H = i6 + 1;
                                    return str;
                                }
                            }
                            i5 = i6;
                            String str2 = new String(bArr2, i7, i5 - i7, this.f25462F.name());
                            this.f25464H = i6 + 1;
                            return str2;
                        }
                    }
                    a aVar = new a((this.f25465I - this.f25464H) + 80);
                    loop1: while (true) {
                        byte[] bArr3 = this.f25463G;
                        int i8 = this.f25464H;
                        aVar.write(bArr3, i8, this.f25465I - i8);
                        this.f25465I = -1;
                        b();
                        i4 = this.f25464H;
                        while (i4 != this.f25465I) {
                            bArr = this.f25463G;
                            if (bArr[i4] == 10) {
                                break loop1;
                            }
                            i4++;
                        }
                    }
                    int i9 = this.f25464H;
                    if (i4 != i9) {
                        aVar.write(bArr, i9, i4 - i9);
                    }
                    this.f25464H = i4 + 1;
                    return aVar.toString();
                }
                throw new IOException("LineReader is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c(InputStream inputStream, int i4, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i4 >= 0) {
            if (charset.equals(d.f25467a)) {
                this.f25461E = inputStream;
                this.f25462F = charset;
                this.f25463G = new byte[i4];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
