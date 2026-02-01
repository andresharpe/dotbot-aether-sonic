package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.InterfaceC1306g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzab {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzak zzb;
    private Long zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(zzak zzakVar, boolean z3) {
        this.zzb = zzakVar;
        this.zza = z3;
    }

    public final boolean zza(Container container) {
        InterfaceC1306g interfaceC1306g;
        zzal zzalVar;
        if (this.zza) {
            long lastRefreshTime = container.getLastRefreshTime();
            if (this.zzc == null) {
                zzalVar = this.zzb.zzi;
                this.zzc = Long.valueOf(zzalVar.zza());
            }
            long longValue = lastRefreshTime + this.zzc.longValue();
            interfaceC1306g = this.zzb.zza;
            if (longValue < interfaceC1306g.a()) {
                return false;
            }
            return true;
        }
        if (container.isDefault()) {
            return false;
        }
        return true;
    }
}
