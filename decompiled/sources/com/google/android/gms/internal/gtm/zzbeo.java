package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
final class zzbeo {
    private final Object zza;
    private final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbeo(Object obj, int i4) {
        this.zza = obj;
        this.zzb = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbeo)) {
            return false;
        }
        zzbeo zzbeoVar = (zzbeo) obj;
        if (this.zza != zzbeoVar.zza || this.zzb != zzbeoVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
