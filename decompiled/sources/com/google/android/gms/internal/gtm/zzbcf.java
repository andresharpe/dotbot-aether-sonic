package com.google.android.gms.internal.gtm;

import java.io.IOException;
import kotlinx.coroutines.scheduling.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbcf extends zzbcj {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcf(byte[] bArr, int i4, int i5) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i5) | i5) >= 0) {
                this.zza = bArr;
                this.zzc = 0;
                this.zzb = i5;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i5)));
        }
        throw new NullPointerException("buffer");
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzR() {
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzS(byte b4) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            bArr[i4] = b4;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzbcg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzT(int i4, boolean z3) throws IOException {
        zzu(i4 << 3);
        zzS(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzU(int i4, zzbbw zzbbwVar) throws IOException {
        zzu((i4 << 3) | 2);
        zzu(zzbbwVar.zzd());
        zzbbwVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj, com.google.android.gms.internal.gtm.zzbbm
    public final void zza(byte[] bArr, int i4, int i5) throws IOException {
        zze(bArr, i4, i5);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i4, int i5) throws IOException {
        try {
            System.arraycopy(bArr, i4, this.zza, this.zzc, i5);
            this.zzc += i5;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzbcg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i5)), e4);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzh(int i4, int i5) throws IOException {
        zzu((i4 << 3) | 5);
        zzi(i5);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzi(int i4) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i5 = this.zzc;
            bArr[i5] = (byte) (i4 & 255);
            bArr[i5 + 1] = (byte) ((i4 >> 8) & 255);
            bArr[i5 + 2] = (byte) ((i4 >> 16) & 255);
            this.zzc = i5 + 4;
            bArr[i5 + 3] = (byte) ((i4 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzbcg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzj(int i4, long j4) throws IOException {
        zzu((i4 << 3) | 1);
        zzk(j4);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzk(long j4) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i4 = this.zzc;
            bArr[i4] = (byte) (((int) j4) & 255);
            bArr[i4 + 1] = (byte) (((int) (j4 >> 8)) & 255);
            bArr[i4 + 2] = (byte) (((int) (j4 >> 16)) & 255);
            bArr[i4 + 3] = (byte) (((int) (j4 >> 24)) & 255);
            bArr[i4 + 4] = (byte) (((int) (j4 >> 32)) & 255);
            bArr[i4 + 5] = (byte) (((int) (j4 >> 40)) & 255);
            bArr[i4 + 6] = (byte) (((int) (j4 >> 48)) & 255);
            this.zzc = i4 + 8;
            bArr[i4 + 7] = (byte) (((int) (j4 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzbcg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzl(int i4, int i5) throws IOException {
        zzu(i4 << 3);
        zzm(i5);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzm(int i4) throws IOException {
        if (i4 >= 0) {
            zzu(i4);
        } else {
            zzw(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzn(int i4, zzbgs zzbgsVar, zzbhf zzbhfVar) throws IOException {
        zzu((i4 << 3) | 2);
        zzbay zzbayVar = (zzbay) zzbgsVar;
        int zzQ = zzbayVar.zzQ();
        if (zzQ == -1) {
            zzQ = zzbhfVar.zza(zzbayVar);
            zzbayVar.zzT(zzQ);
        }
        zzu(zzQ);
        zzbhfVar.zzn(zzbgsVar, this.zze);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzo(int i4, zzbgs zzbgsVar) throws IOException {
        zzu(11);
        zzt(2, i4);
        zzu(26);
        zzu(zzbgsVar.zzY());
        zzbgsVar.zzau(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzp(int i4, zzbbw zzbbwVar) throws IOException {
        zzu(11);
        zzt(2, i4);
        zzU(3, zzbbwVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzq(int i4, String str) throws IOException {
        zzu((i4 << 3) | 2);
        zzr(str);
    }

    public final void zzr(String str) throws IOException {
        int i4 = this.zzc;
        try {
            int zzJ = zzbcj.zzJ(str.length() * 3);
            int zzJ2 = zzbcj.zzJ(str.length());
            if (zzJ2 == zzJ) {
                int i5 = i4 + zzJ2;
                this.zzc = i5;
                int zzb = zzbio.zzb(str, this.zza, i5, this.zzb - i5);
                this.zzc = i4;
                zzu((zzb - i4) - zzJ2);
                this.zzc = zzb;
                return;
            }
            zzu(zzbio.zzc(str));
            byte[] bArr = this.zza;
            int i6 = this.zzc;
            this.zzc = zzbio.zzb(str, bArr, i6, this.zzb - i6);
        } catch (zzbin e4) {
            this.zzc = i4;
            zzN(str, e4);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzbcg(e5);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzs(int i4, int i5) throws IOException {
        zzu((i4 << 3) | i5);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzt(int i4, int i5) throws IOException {
        zzu(i4 << 3);
        zzu(i5);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzu(int i4) throws IOException {
        while ((i4 & (-128)) != 0) {
            try {
                byte[] bArr = this.zza;
                int i5 = this.zzc;
                this.zzc = i5 + 1;
                bArr[i5] = (byte) ((i4 & q.f54649c) | 128);
                i4 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzbcg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e4);
            }
        }
        byte[] bArr2 = this.zza;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        bArr2[i6] = (byte) i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzv(int i4, long j4) throws IOException {
        zzu(i4 << 3);
        zzw(j4);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzw(long j4) throws IOException {
        boolean z3;
        z3 = zzbcj.zzb;
        if (z3 && this.zzb - this.zzc >= 10) {
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
            return;
        }
        while ((j4 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zza;
                int i6 = this.zzc;
                this.zzc = i6 + 1;
                bArr3[i6] = (byte) ((((int) j4) & q.f54649c) | 128);
                j4 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzbcg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e4);
            }
        }
        byte[] bArr4 = this.zza;
        int i7 = this.zzc;
        this.zzc = i7 + 1;
        bArr4[i7] = (byte) j4;
    }
}
