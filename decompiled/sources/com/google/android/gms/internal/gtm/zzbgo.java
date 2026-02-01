package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
final class zzbgo {
    private static final zzbgn zza;
    private static final zzbgn zzb;

    static {
        zzbgn zzbgnVar;
        try {
            zzbgnVar = (zzbgn) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzbgnVar = null;
        }
        zza = zzbgnVar;
        zzb = new zzbgn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbgn zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbgn zzb() {
        return zzb;
    }
}
