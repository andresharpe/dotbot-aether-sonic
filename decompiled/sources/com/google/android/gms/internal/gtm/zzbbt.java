package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzbbt extends zzbbs {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbt(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.gtm.zzbbw
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbbw) || zzd() != ((zzbbw) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzbbt) {
            zzbbt zzbbtVar = (zzbbt) obj;
            int zzl = zzl();
            int zzl2 = zzbbtVar.zzl();
            if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= zzbbtVar.zzd()) {
                if (zzd <= zzbbtVar.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzbbtVar.zza;
                    int zzc = zzc() + zzd;
                    int zzc2 = zzc();
                    int zzc3 = zzbbtVar.zzc();
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzbbtVar.zzd());
            }
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzbbw
    public byte zza(int i4) {
        return this.zza[i4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbbw
    public byte zzb(int i4) {
        return this.zza[i4];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzbbw
    public int zzd() {
        return this.zza.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbbw
    public void zze(byte[] bArr, int i4, int i5, int i6) {
        System.arraycopy(this.zza, 0, bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.gtm.zzbbw
    protected final int zzf(int i4, int i5, int i6) {
        return zzbfq.zzd(i4, this.zza, zzc(), i6);
    }

    @Override // com.google.android.gms.internal.gtm.zzbbw
    public final zzbbw zzg(int i4, int i5) {
        int zzk = zzbbw.zzk(0, i5, zzd());
        if (zzk == 0) {
            return zzbbw.zzb;
        }
        return new zzbbq(this.zza, zzc(), zzk);
    }

    @Override // com.google.android.gms.internal.gtm.zzbbw
    protected final String zzh(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbbw
    public final void zzi(zzbbm zzbbmVar) throws IOException {
        zzbbmVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.gtm.zzbbw
    public final boolean zzj() {
        int zzc = zzc();
        return zzbio.zzf(this.zza, zzc, zzd() + zzc);
    }
}
