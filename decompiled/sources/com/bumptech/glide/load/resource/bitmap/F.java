package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.i0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class F extends FilterInputStream {

    /* renamed from: E, reason: collision with root package name */
    private volatile byte[] f26462E;

    /* renamed from: F, reason: collision with root package name */
    private int f26463F;

    /* renamed from: G, reason: collision with root package name */
    private int f26464G;

    /* renamed from: H, reason: collision with root package name */
    private int f26465H;

    /* renamed from: I, reason: collision with root package name */
    private int f26466I;

    /* renamed from: J, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f26467J;

    /* loaded from: classes.dex */
    static class a extends IOException {

        /* renamed from: E, reason: collision with root package name */
        private static final long f26468E = -4338378848813561757L;

        a(String str) {
            super(str);
        }
    }

    public F(@androidx.annotation.N InputStream inputStream, @androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i4 = this.f26465H;
        if (i4 != -1) {
            int i5 = this.f26466I - i4;
            int i6 = this.f26464G;
            if (i5 < i6) {
                if (i4 == 0 && i6 > bArr.length && this.f26463F == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i6) {
                        i6 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f26467J.e(i6, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f26462E = bArr2;
                    this.f26467J.put(bArr);
                    bArr = bArr2;
                } else if (i4 > 0) {
                    System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                }
                int i7 = this.f26466I - this.f26465H;
                this.f26466I = i7;
                this.f26465H = 0;
                this.f26463F = 0;
                int read = inputStream.read(bArr, i7, bArr.length - i7);
                int i8 = this.f26466I;
                if (read > 0) {
                    i8 += read;
                }
                this.f26463F = i8;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f26465H = -1;
            this.f26466I = 0;
            this.f26463F = read2;
        }
        return read2;
    }

    private static IOException c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f26462E != null && inputStream != null) {
        } else {
            throw c();
        }
        return (this.f26463F - this.f26466I) + inputStream.available();
    }

    public synchronized void b() {
        this.f26464G = this.f26462E.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f26462E != null) {
            this.f26467J.put(this.f26462E);
            this.f26462E = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        this.f26464G = Math.max(this.f26464G, i4);
        this.f26465H = this.f26466I;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f26462E;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f26466I >= this.f26463F && a(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f26462E && (bArr = this.f26462E) == null) {
                throw c();
            }
            int i4 = this.f26463F;
            int i5 = this.f26466I;
            if (i4 - i5 <= 0) {
                return -1;
            }
            this.f26466I = i5 + 1;
            return bArr[i5] & 255;
        }
        throw c();
    }

    public synchronized void release() {
        if (this.f26462E != null) {
            this.f26467J.put(this.f26462E);
            this.f26462E = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f26462E != null) {
            int i4 = this.f26465H;
            if (-1 != i4) {
                this.f26466I = i4;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f26466I + " markLimit: " + this.f26464G);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j4) throws IOException {
        if (j4 < 1) {
            return 0L;
        }
        byte[] bArr = this.f26462E;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i4 = this.f26463F;
                int i5 = this.f26466I;
                if (i4 - i5 >= j4) {
                    this.f26466I = (int) (i5 + j4);
                    return j4;
                }
                long j5 = i4 - i5;
                this.f26466I = i4;
                if (this.f26465H != -1 && j4 <= this.f26464G) {
                    if (a(inputStream, bArr) == -1) {
                        return j5;
                    }
                    int i6 = this.f26463F;
                    int i7 = this.f26466I;
                    if (i6 - i7 >= j4 - j5) {
                        this.f26466I = (int) ((i7 + j4) - j5);
                        return j4;
                    }
                    long j6 = (j5 + i6) - i7;
                    this.f26466I = i6;
                    return j6;
                }
                long skip = inputStream.skip(j4 - j5);
                if (skip > 0) {
                    this.f26465H = -1;
                }
                return j5 + skip;
            }
            throw c();
        }
        throw c();
    }

    @i0
    F(@androidx.annotation.N InputStream inputStream, @androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i4) {
        super(inputStream);
        this.f26465H = -1;
        this.f26467J = bVar;
        this.f26462E = (byte[]) bVar.e(i4, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@androidx.annotation.N byte[] bArr, int i4, int i5) throws IOException {
        int i6;
        int i7;
        byte[] bArr2 = this.f26462E;
        if (bArr2 == null) {
            throw c();
        }
        if (i5 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i8 = this.f26466I;
            int i9 = this.f26463F;
            if (i8 < i9) {
                int i10 = i9 - i8 >= i5 ? i5 : i9 - i8;
                System.arraycopy(bArr2, i8, bArr, i4, i10);
                this.f26466I += i10;
                if (i10 == i5 || inputStream.available() == 0) {
                    return i10;
                }
                i4 += i10;
                i6 = i5 - i10;
            } else {
                i6 = i5;
            }
            while (true) {
                if (this.f26465H == -1 && i6 >= bArr2.length) {
                    i7 = inputStream.read(bArr, i4, i6);
                    if (i7 == -1) {
                        return i6 != i5 ? i5 - i6 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i6 != i5 ? i5 - i6 : -1;
                    }
                    if (bArr2 != this.f26462E && (bArr2 = this.f26462E) == null) {
                        throw c();
                    }
                    int i11 = this.f26463F;
                    int i12 = this.f26466I;
                    i7 = i11 - i12 >= i6 ? i6 : i11 - i12;
                    System.arraycopy(bArr2, i12, bArr, i4, i7);
                    this.f26466I += i7;
                }
                i6 -= i7;
                if (i6 == 0) {
                    return i5;
                }
                if (inputStream.available() == 0) {
                    return i5 - i6;
                }
                i4 += i7;
            }
        } else {
            throw c();
        }
    }
}
