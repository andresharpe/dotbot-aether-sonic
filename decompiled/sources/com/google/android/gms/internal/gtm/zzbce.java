package com.google.android.gms.internal.gtm;

import kotlinx.coroutines.scheduling.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzbce extends zzbcj {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbce(int i4) {
        super(null);
        if (i4 >= 0) {
            byte[] bArr = new byte[Math.max(i4, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final int zzb() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(byte b4) {
        byte[] bArr = this.zza;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        bArr[i4] = b4;
        this.zzd++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i4) {
        byte[] bArr = this.zza;
        int i5 = this.zzc;
        bArr[i5] = (byte) (i4 & 255);
        bArr[i5 + 1] = (byte) ((i4 >> 8) & 255);
        bArr[i5 + 2] = (byte) ((i4 >> 16) & 255);
        this.zzc = i5 + 4;
        bArr[i5 + 3] = (byte) ((i4 >> 24) & 255);
        this.zzd += 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(long j4) {
        byte[] bArr = this.zza;
        int i4 = this.zzc;
        bArr[i4] = (byte) (j4 & 255);
        bArr[i4 + 1] = (byte) ((j4 >> 8) & 255);
        bArr[i4 + 2] = (byte) ((j4 >> 16) & 255);
        bArr[i4 + 3] = (byte) (255 & (j4 >> 24));
        bArr[i4 + 4] = (byte) (((int) (j4 >> 32)) & 255);
        bArr[i4 + 5] = (byte) (((int) (j4 >> 40)) & 255);
        bArr[i4 + 6] = (byte) (((int) (j4 >> 48)) & 255);
        this.zzc = i4 + 8;
        bArr[i4 + 7] = (byte) (((int) (j4 >> 56)) & 255);
        this.zzd += 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(int i4) {
        boolean z3;
        z3 = zzbcj.zzb;
        if (z3) {
            long j4 = this.zzc;
            while ((i4 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i5 = this.zzc;
                this.zzc = i5 + 1;
                zzbij.zzn(bArr, i5, (byte) ((i4 & q.f54649c) | 128));
                i4 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i6 = this.zzc;
            this.zzc = i6 + 1;
            zzbij.zzn(bArr2, i6, (byte) i4);
            this.zzd += (int) (this.zzc - j4);
            return;
        }
        while ((i4 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i7 = this.zzc;
            this.zzc = i7 + 1;
            bArr3[i7] = (byte) ((i4 & q.f54649c) | 128);
            this.zzd++;
            i4 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        bArr4[i8] = (byte) i4;
        this.zzd++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(long j4) {
        boolean z3;
        z3 = zzbcj.zzb;
        if (z3) {
            long j5 = this.zzc;
            while ((j4 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i4 = this.zzc;
                this.zzc = i4 + 1;
                zzbij.zzn(bArr, i4, (byte) ((((int) j4) & q.f54649c) | 128));
                j4 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i5 = this.zzc;
            this.zzc = i5 + 1;
            zzbij.zzn(bArr2, i5, (byte) j4);
            this.zzd += (int) (this.zzc - j5);
            return;
        }
        while ((j4 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i6 = this.zzc;
            this.zzc = i6 + 1;
            bArr3[i6] = (byte) ((((int) j4) & q.f54649c) | 128);
            this.zzd++;
            j4 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i7 = this.zzc;
        this.zzc = i7 + 1;
        bArr4[i7] = (byte) j4;
        this.zzd++;
    }
}
