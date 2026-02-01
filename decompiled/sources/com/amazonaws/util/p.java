package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class p extends com.amazonaws.internal.i {

    /* renamed from: I, reason: collision with root package name */
    public static final boolean f24347I = true;

    /* renamed from: J, reason: collision with root package name */
    public static final boolean f24348J = false;

    /* renamed from: E, reason: collision with root package name */
    private final long f24349E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f24350F;

    /* renamed from: G, reason: collision with root package name */
    private long f24351G;

    /* renamed from: H, reason: collision with root package name */
    private long f24352H;

    public p(InputStream inputStream, long j4, boolean z3) {
        super(inputStream);
        if (j4 >= 0) {
            this.f24349E = j4;
            this.f24350F = z3;
            return;
        }
        throw new IllegalArgumentException();
    }

    private void d(boolean z3) {
        if (z3) {
            if (this.f24351G != this.f24349E) {
                throw new AmazonClientException("Data read (" + this.f24351G + ") has a different length than the expected (" + this.f24349E + ")");
            }
            return;
        }
        if (this.f24351G <= this.f24349E) {
            return;
        }
        throw new AmazonClientException("More data read (" + this.f24351G + ") than expected (" + this.f24349E + ")");
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i4) {
        super.mark(i4);
        this.f24352H = this.f24351G;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        if (read >= 0) {
            this.f24351G++;
        }
        d(read == -1);
        return read;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        if (super.markSupported()) {
            this.f24351G = this.f24352H;
        }
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long skip = super.skip(j4);
        if (this.f24350F && skip > 0) {
            this.f24351G += skip;
            d(false);
        }
        return skip;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int read = super.read(bArr, i4, i5);
        this.f24351G += read >= 0 ? read : 0L;
        d(read == -1);
        return read;
    }
}
