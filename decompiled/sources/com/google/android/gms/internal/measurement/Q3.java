package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Q3 extends S3 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f29426d;

    /* renamed from: e, reason: collision with root package name */
    private final int f29427e;

    /* renamed from: f, reason: collision with root package name */
    private int f29428f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q3(byte[] bArr, int i4, int i5) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i5) | i5) >= 0) {
                this.f29426d = bArr;
                this.f29428f = 0;
                this.f29427e = i5;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i5)));
        }
        throw new NullPointerException("buffer");
    }

    public final void E(byte[] bArr, int i4, int i5) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f29426d, this.f29428f, i5);
            this.f29428f += i5;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29428f), Integer.valueOf(this.f29427e), Integer.valueOf(i5)), e4);
        }
    }

    public final void F(String str) throws IOException {
        int i4 = this.f29428f;
        try {
            int a4 = S3.a(str.length() * 3);
            int a5 = S3.a(str.length());
            if (a5 == a4) {
                int i5 = i4 + a5;
                this.f29428f = i5;
                int b4 = H5.b(str, this.f29426d, i5, this.f29427e - i5);
                this.f29428f = i4;
                u((b4 - i4) - a5);
                this.f29428f = b4;
                return;
            }
            u(H5.c(str));
            byte[] bArr = this.f29426d;
            int i6 = this.f29428f;
            this.f29428f = H5.b(str, bArr, i6, this.f29427e - i6);
        } catch (G5 e4) {
            this.f29428f = i4;
            e(str, e4);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzjj(e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final int g() {
        return this.f29427e - this.f29428f;
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void h(byte b4) throws IOException {
        try {
            byte[] bArr = this.f29426d;
            int i4 = this.f29428f;
            this.f29428f = i4 + 1;
            bArr[i4] = b4;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29428f), Integer.valueOf(this.f29427e), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void i(int i4, boolean z3) throws IOException {
        u(i4 << 3);
        h(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void j(int i4, zzjd zzjdVar) throws IOException {
        u((i4 << 3) | 2);
        u(zzjdVar.d());
        zzjdVar.k(this);
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void k(int i4, int i5) throws IOException {
        u((i4 << 3) | 5);
        l(i5);
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void l(int i4) throws IOException {
        try {
            byte[] bArr = this.f29426d;
            int i5 = this.f29428f;
            bArr[i5] = (byte) (i4 & 255);
            bArr[i5 + 1] = (byte) ((i4 >> 8) & 255);
            bArr[i5 + 2] = (byte) ((i4 >> 16) & 255);
            this.f29428f = i5 + 4;
            bArr[i5 + 3] = (byte) ((i4 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29428f), Integer.valueOf(this.f29427e), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void m(int i4, long j4) throws IOException {
        u((i4 << 3) | 1);
        n(j4);
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void n(long j4) throws IOException {
        try {
            byte[] bArr = this.f29426d;
            int i4 = this.f29428f;
            bArr[i4] = (byte) (((int) j4) & 255);
            bArr[i4 + 1] = (byte) (((int) (j4 >> 8)) & 255);
            bArr[i4 + 2] = (byte) (((int) (j4 >> 16)) & 255);
            bArr[i4 + 3] = (byte) (((int) (j4 >> 24)) & 255);
            bArr[i4 + 4] = (byte) (((int) (j4 >> 32)) & 255);
            bArr[i4 + 5] = (byte) (((int) (j4 >> 40)) & 255);
            bArr[i4 + 6] = (byte) (((int) (j4 >> 48)) & 255);
            this.f29428f = i4 + 8;
            bArr[i4 + 7] = (byte) (((int) (j4 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29428f), Integer.valueOf(this.f29427e), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void o(int i4, int i5) throws IOException {
        u(i4 << 3);
        p(i5);
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void p(int i4) throws IOException {
        if (i4 >= 0) {
            u(i4);
        } else {
            w(i4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void q(byte[] bArr, int i4, int i5) throws IOException {
        E(bArr, 0, i5);
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void r(int i4, String str) throws IOException {
        u((i4 << 3) | 2);
        F(str);
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void s(int i4, int i5) throws IOException {
        u((i4 << 3) | i5);
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void t(int i4, int i5) throws IOException {
        u(i4 << 3);
        u(i5);
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void u(int i4) throws IOException {
        while ((i4 & (-128)) != 0) {
            try {
                byte[] bArr = this.f29426d;
                int i5 = this.f29428f;
                this.f29428f = i5 + 1;
                bArr[i5] = (byte) ((i4 & kotlinx.coroutines.scheduling.q.f54649c) | 128);
                i4 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29428f), Integer.valueOf(this.f29427e), 1), e4);
            }
        }
        byte[] bArr2 = this.f29426d;
        int i6 = this.f29428f;
        this.f29428f = i6 + 1;
        bArr2[i6] = (byte) i4;
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void v(int i4, long j4) throws IOException {
        u(i4 << 3);
        w(j4);
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final void w(long j4) throws IOException {
        boolean z3;
        z3 = S3.f29477c;
        if (z3 && this.f29427e - this.f29428f >= 10) {
            while ((j4 & (-128)) != 0) {
                byte[] bArr = this.f29426d;
                int i4 = this.f29428f;
                this.f29428f = i4 + 1;
                B5.s(bArr, i4, (byte) ((((int) j4) & kotlinx.coroutines.scheduling.q.f54649c) | 128));
                j4 >>>= 7;
            }
            byte[] bArr2 = this.f29426d;
            int i5 = this.f29428f;
            this.f29428f = i5 + 1;
            B5.s(bArr2, i5, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f29426d;
                int i6 = this.f29428f;
                this.f29428f = i6 + 1;
                bArr3[i6] = (byte) ((((int) j4) & kotlinx.coroutines.scheduling.q.f54649c) | 128);
                j4 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29428f), Integer.valueOf(this.f29427e), 1), e4);
            }
        }
        byte[] bArr4 = this.f29426d;
        int i7 = this.f29428f;
        this.f29428f = i7 + 1;
        bArr4[i7] = (byte) j4;
    }
}
