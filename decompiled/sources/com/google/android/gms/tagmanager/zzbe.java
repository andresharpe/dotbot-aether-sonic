package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbe extends zzfs {
    private static final String zza = com.google.android.gms.internal.gtm.zza.DATA_LAYER_WRITE.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.VALUE.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.CLEAR_PERSISTENT_DATA_LAYER_PREFIX.toString();
    private final DataLayer zzd;

    public zzbe(DataLayer dataLayer) {
        super(zza, zzb);
        this.zzd = dataLayer;
    }

    @Override // com.google.android.gms.tagmanager.zzfs
    public final void zzc(Map map) {
        String zzn;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        if (zzamVar != null) {
            Object zzl = zzfu.zzl(zzamVar);
            if (zzl instanceof List) {
                for (Object obj : (List) zzl) {
                    if (obj instanceof Map) {
                        this.zzd.push((Map) obj);
                    }
                }
            }
        }
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        if (zzamVar2 != null && (zzn = zzfu.zzn(zzfu.zzl(zzamVar2))) != zzfu.zzm()) {
            this.zzd.zzd(zzn);
        }
    }
}
