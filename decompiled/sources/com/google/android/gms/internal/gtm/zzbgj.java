package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
final class zzbgj implements zzbgq {
    private final zzbgq[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgj(zzbgq... zzbgqVarArr) {
        this.zza = zzbgqVarArr;
    }

    @Override // com.google.android.gms.internal.gtm.zzbgq
    public final zzbgp zzb(Class cls) {
        zzbgq[] zzbgqVarArr = this.zza;
        for (int i4 = 0; i4 < 2; i4++) {
            zzbgq zzbgqVar = zzbgqVarArr[i4];
            if (zzbgqVar.zzc(cls)) {
                return zzbgqVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.gtm.zzbgq
    public final boolean zzc(Class cls) {
        zzbgq[] zzbgqVarArr = this.zza;
        for (int i4 = 0; i4 < 2; i4++) {
            if (zzbgqVarArr[i4].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
