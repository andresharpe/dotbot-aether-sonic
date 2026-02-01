package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.D;
import java.util.Map;

/* loaded from: classes2.dex */
final class zze extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.ADVERTISER_ID.toString();
    private final zzd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @D
    public zze(zzd zzdVar) {
        super(zza, new String[0]);
        this.zzb = zzdVar;
        zzdVar.zzc();
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String zzc = this.zzb.zzc();
        if (zzc == null) {
            return zzfu.zzb();
        }
        return zzfu.zzc(zzc);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}
