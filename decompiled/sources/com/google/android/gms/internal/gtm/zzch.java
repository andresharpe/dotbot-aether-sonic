package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.D;

@D
/* loaded from: classes.dex */
public final class zzch extends zzbu {
    private final zzax zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzch(zzbx zzbxVar) {
        super(zzbxVar);
        this.zza = new zzax();
    }

    public final zzax zza() {
        zzV();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
        zzq().c().zzc(this.zza);
        zzfv zzB = zzB();
        zzB.zzV();
        String str = zzB.zzb;
        if (str != null) {
            this.zza.zzk(str);
        }
        zzB.zzV();
        String str2 = zzB.zza;
        if (str2 != null) {
            this.zza.zzl(str2);
        }
    }
}
