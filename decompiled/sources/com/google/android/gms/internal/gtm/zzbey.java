package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
final class zzbey implements zzbgq {
    private static final zzbey zza = new zzbey();

    private zzbey() {
    }

    public static zzbey zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzbgq
    public final zzbgp zzb(Class cls) {
        if (zzbff.class.isAssignableFrom(cls)) {
            try {
                return (zzbgp) zzbff.zzad(cls.asSubclass(zzbff.class)).zzb(3, null, null);
            } catch (Exception e4) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.gtm.zzbgq
    public final boolean zzc(Class cls) {
        return zzbff.class.isAssignableFrom(cls);
    }
}
