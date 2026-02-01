package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.D;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
@D
/* loaded from: classes2.dex */
public final class zzbs extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.EVENT.toString();
    private final zzet zzb;

    public zzbs(zzet zzetVar) {
        super(zza, new String[0]);
        this.zzb = zzetVar;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String zzb = this.zzb.zzb();
        if (zzb == null) {
            return zzfu.zzb();
        }
        return zzfu.zzc(zzb);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}
