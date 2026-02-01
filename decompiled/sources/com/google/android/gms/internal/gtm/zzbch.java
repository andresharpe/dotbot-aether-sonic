package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbch extends zzbce {
    private final OutputStream zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbch(OutputStream outputStream, int i4) {
        super(i4);
        this.zzf = outputStream;
    }

    private final void zzP() throws IOException {
        this.zzf.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzQ(int i4) throws IOException {
        if (this.zzb - this.zzc < i4) {
            zzP();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzR() throws IOException {
        if (this.zzc > 0) {
            zzP();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzS(byte b4) throws IOException {
        if (this.zzc == this.zzb) {
            zzP();
        }
        zzc(b4);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzT(int i4, boolean z3) throws IOException {
        zzQ(11);
        zzf(i4 << 3);
        zzc(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzU(int i4, zzbbw zzbbwVar) throws IOException {
        zzu((i4 << 3) | 2);
        zzu(zzbbwVar.zzd());
        zzbbwVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj, com.google.android.gms.internal.gtm.zzbbm
    public final void zza(byte[] bArr, int i4, int i5) throws IOException {
        zzr(bArr, i4, i5);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzh(int i4, int i5) throws IOException {
        zzQ(14);
        zzf((i4 << 3) | 5);
        zzd(i5);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzi(int i4) throws IOException {
        zzQ(4);
        zzd(i4);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzj(int i4, long j4) throws IOException {
        zzQ(18);
        zzf((i4 << 3) | 1);
        zze(j4);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzk(long j4) throws IOException {
        zzQ(8);
        zze(j4);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzl(int i4, int i5) throws IOException {
        zzQ(20);
        zzf(i4 << 3);
        if (i5 >= 0) {
            zzf(i5);
        } else {
            zzg(i5);
        }
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
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i4, int i5) throws IOException {
        int i6 = this.zzb;
        int i7 = this.zzc;
        int i8 = i6 - i7;
        if (i8 >= i5) {
            System.arraycopy(bArr, i4, this.zza, i7, i5);
            this.zzc += i5;
            this.zzd += i5;
            return;
        }
        System.arraycopy(bArr, i4, this.zza, i7, i8);
        int i9 = i4 + i8;
        int i10 = i5 - i8;
        this.zzc = this.zzb;
        this.zzd += i8;
        zzP();
        if (i10 <= this.zzb) {
            System.arraycopy(bArr, i9, this.zza, 0, i10);
            this.zzc = i10;
        } else {
            this.zzf.write(bArr, i9, i10);
        }
        this.zzd += i10;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzs(int i4, int i5) throws IOException {
        zzu((i4 << 3) | i5);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzt(int i4, int i5) throws IOException {
        zzQ(20);
        zzf(i4 << 3);
        zzf(i5);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzu(int i4) throws IOException {
        zzQ(5);
        zzf(i4);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzv(int i4, long j4) throws IOException {
        zzQ(20);
        zzf(i4 << 3);
        zzg(j4);
    }

    @Override // com.google.android.gms.internal.gtm.zzbcj
    public final void zzw(long j4) throws IOException {
        zzQ(10);
        zzg(j4);
    }

    public final void zzx(String str) throws IOException {
        int zzc;
        try {
            int length = str.length() * 3;
            int zzJ = zzbcj.zzJ(length);
            int i4 = zzJ + length;
            int i5 = this.zzb;
            if (i4 > i5) {
                byte[] bArr = new byte[length];
                int zzb = zzbio.zzb(str, bArr, 0, length);
                zzu(zzb);
                zzr(bArr, 0, zzb);
                return;
            }
            if (i4 > i5 - this.zzc) {
                zzP();
            }
            int zzJ2 = zzbcj.zzJ(str.length());
            int i6 = this.zzc;
            try {
                if (zzJ2 == zzJ) {
                    int i7 = i6 + zzJ2;
                    this.zzc = i7;
                    int zzb2 = zzbio.zzb(str, this.zza, i7, this.zzb - i7);
                    this.zzc = i6;
                    zzc = (zzb2 - i6) - zzJ2;
                    zzf(zzc);
                    this.zzc = zzb2;
                } else {
                    zzc = zzbio.zzc(str);
                    zzf(zzc);
                    this.zzc = zzbio.zzb(str, this.zza, this.zzc, zzc);
                }
                this.zzd += zzc;
            } catch (zzbin e4) {
                this.zzd -= this.zzc - i6;
                this.zzc = i6;
                throw e4;
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new zzbcg(e5);
            }
        } catch (zzbin e6) {
            zzN(str, e6);
        }
    }
}
