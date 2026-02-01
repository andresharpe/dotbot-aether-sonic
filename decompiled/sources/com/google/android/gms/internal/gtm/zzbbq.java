package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbbq extends zzbbt {
    private final int zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbq(byte[] bArr, int i4, int i5) {
        super(bArr);
        zzbbw.zzk(i4, i4 + i5, bArr.length);
        this.zzc = i4;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.gtm.zzbbt, com.google.android.gms.internal.gtm.zzbbw
    public final byte zza(int i4) {
        int i5 = this.zzd;
        if (((i5 - (i4 + 1)) | i4) < 0) {
            if (i4 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i4);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i4 + ", " + i5);
        }
        return this.zza[this.zzc + i4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbbt, com.google.android.gms.internal.gtm.zzbbw
    public final byte zzb(int i4) {
        return this.zza[this.zzc + i4];
    }

    @Override // com.google.android.gms.internal.gtm.zzbbt
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbbt, com.google.android.gms.internal.gtm.zzbbw
    public final int zzd() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbbt, com.google.android.gms.internal.gtm.zzbbw
    public final void zze(byte[] bArr, int i4, int i5, int i6) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i6);
    }
}
