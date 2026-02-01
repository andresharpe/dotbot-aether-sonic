package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbfd extends zzben {
    final zzbgs zza;
    final Object zzb;
    final zzbgs zzc;
    final zzbfc zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfd(zzbgs zzbgsVar, Object obj, zzbgs zzbgsVar2, zzbfc zzbfcVar, Class cls) {
        if (zzbgsVar != null) {
            if (zzbfcVar.zzc == zzbip.zzk && zzbgsVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.zza = zzbgsVar;
            this.zzb = obj;
            this.zzc = zzbgsVar2;
            this.zzd = zzbfcVar;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object zza(Object obj) {
        if (this.zzd.zzc.zza() == zzbiq.ENUM) {
            return this.zzd.zza.zza(((Integer) obj).intValue());
        }
        return obj;
    }
}
