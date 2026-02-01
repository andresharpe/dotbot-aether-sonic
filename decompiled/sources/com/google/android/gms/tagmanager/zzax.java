package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.D;
import java.util.Map;

@D
/* loaded from: classes2.dex */
final class zzax extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.CUSTOM_VAR.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.NAME.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.DEFAULT_VALUE.toString();
    private final DataLayer zzd;

    public zzax(DataLayer dataLayer) {
        super(zza, zzb);
        this.zzd = dataLayer;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        Object obj = this.zzd.get(zzfu.zzn(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) map.get(zzb))));
        if (obj == null) {
            com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
            if (zzamVar != null) {
                return zzamVar;
            }
            return zzfu.zzb();
        }
        return zzfu.zzc(obj);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}
