package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbhd implements zzbgp {
    private final zzbgs zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbhd(zzbgs zzbgsVar, String str, Object[] objArr) {
        this.zza = zzbgsVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 13;
        int i6 = 1;
        while (true) {
            int i7 = i6 + 1;
            char charAt2 = str.charAt(i6);
            if (charAt2 >= 55296) {
                i4 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i6 = i7;
            } else {
                this.zzd = i4 | (charAt2 << i5);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbgp
    public final zzbgs zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzbgp
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.gtm.zzbgp
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}
