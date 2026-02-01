package com.bumptech.glide.load.data;

import androidx.annotation.N;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: G, reason: collision with root package name */
    private static final int f25799G = 2;

    /* renamed from: H, reason: collision with root package name */
    private static final byte[] f25800H;

    /* renamed from: I, reason: collision with root package name */
    private static final int f25801I;

    /* renamed from: J, reason: collision with root package name */
    private static final int f25802J;

    /* renamed from: E, reason: collision with root package name */
    private final byte f25803E;

    /* renamed from: F, reason: collision with root package name */
    private int f25804F;

    static {
        byte[] bArr = {-1, com.harman.sdk.utils.k.f48615R1, 0, 28, 69, com.harman.sdk.utils.k.f48670h1, com.harman.sdk.utils.k.f48599M0, com.harman.sdk.utils.k.f48590J0, 0, 0, com.harman.sdk.utils.k.f48677j0, com.harman.sdk.utils.k.f48677j0, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f25800H = bArr;
        int length = bArr.length;
        f25801I = length;
        f25802J = length + 2;
    }

    public g(InputStream inputStream, int i4) {
        super(inputStream);
        if (i4 >= -1 && i4 <= 8) {
            this.f25803E = (byte) i4;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read;
        int i4;
        int i5 = this.f25804F;
        if (i5 < 2 || i5 > (i4 = f25802J)) {
            read = super.read();
        } else if (i5 == i4) {
            read = this.f25803E;
        } else {
            read = f25800H[i5 - 2] & 255;
        }
        if (read != -1) {
            this.f25804F++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long skip = super.skip(j4);
        if (skip > 0) {
            this.f25804F = (int) (this.f25804F + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@N byte[] bArr, int i4, int i5) throws IOException {
        int i6;
        int i7 = this.f25804F;
        int i8 = f25802J;
        if (i7 > i8) {
            i6 = super.read(bArr, i4, i5);
        } else if (i7 == i8) {
            bArr[i4] = this.f25803E;
            i6 = 1;
        } else if (i7 < 2) {
            i6 = super.read(bArr, i4, 2 - i7);
        } else {
            int min = Math.min(i8 - i7, i5);
            System.arraycopy(f25800H, this.f25804F - 2, bArr, i4, min);
            i6 = min;
        }
        if (i6 > 0) {
            this.f25804F += i6;
        }
        return i6;
    }
}
