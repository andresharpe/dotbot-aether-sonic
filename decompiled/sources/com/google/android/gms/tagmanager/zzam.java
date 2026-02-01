package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.D;
import java.util.Map;

@D
/* loaded from: classes2.dex */
final class zzam extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.CONTAINER_VERSION.toString();
    private final String zzb;

    public zzam(String str) {
        super(zza, new String[0]);
        this.zzb = str;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String str = this.zzb;
        if (str == null) {
            return zzfu.zzb();
        }
        return zzfu.zzc(str);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
