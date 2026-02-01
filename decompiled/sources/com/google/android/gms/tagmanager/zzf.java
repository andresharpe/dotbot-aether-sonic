package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.D;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzf extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.ADVERTISING_TRACKING_ENABLED.toString();
    private final zzd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @D
    public zzf(zzd zzdVar) {
        super(zza, new String[0]);
        this.zzb = zzdVar;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        return zzfu.zzc(Boolean.valueOf(!this.zzb.zzf()));
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}
