package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class F3 extends J3 {

    /* renamed from: J, reason: collision with root package name */
    private final int f29321J;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F3(byte[] bArr, int i4, int i5) {
        super(bArr);
        zzjd.m(0, i5, bArr.length);
        this.f29321J = i5;
    }

    @Override // com.google.android.gms.internal.measurement.J3, com.google.android.gms.internal.measurement.zzjd
    public final byte b(int i4) {
        int i5 = this.f29321J;
        if (((i5 - (i4 + 1)) | i4) < 0) {
            if (i4 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i4);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i4 + ", " + i5);
        }
        return this.f29368I[i4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.J3, com.google.android.gms.internal.measurement.zzjd
    public final byte c(int i4) {
        return this.f29368I[i4];
    }

    @Override // com.google.android.gms.internal.measurement.J3, com.google.android.gms.internal.measurement.zzjd
    public final int d() {
        return this.f29321J;
    }

    @Override // com.google.android.gms.internal.measurement.J3
    protected final int r() {
        return 0;
    }
}
