package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
final class zzbgz {
    private static final zzbgy zza;
    private static final zzbgy zzb;

    static {
        zzbgy zzbgyVar;
        try {
            zzbgyVar = (zzbgy) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzbgyVar = null;
        }
        zza = zzbgyVar;
        zzb = new zzbgy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbgy zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbgy zzb() {
        return zzb;
    }
}
