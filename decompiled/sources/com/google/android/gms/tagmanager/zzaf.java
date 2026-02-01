package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaf implements zzdf {
    final /* synthetic */ zzak zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaf(zzak zzakVar, zzae zzaeVar) {
        this.zza = zzakVar;
    }

    @Override // com.google.android.gms.tagmanager.zzdf
    public final void zza(int i4) {
        zzal zzalVar;
        zzz zzzVar;
        zzz zzzVar2;
        zzal zzalVar2;
        if (i4 == 4) {
            zzalVar2 = this.zza.zzi;
            zzalVar2.zzc();
        }
        synchronized (this.zza) {
            try {
                if (!this.zza.isReady()) {
                    zzzVar = this.zza.zzl;
                    if (zzzVar != null) {
                        zzak zzakVar = this.zza;
                        zzzVar2 = zzakVar.zzl;
                        zzakVar.setResult(zzzVar2);
                    } else {
                        zzak zzakVar2 = this.zza;
                        zzakVar2.setResult(zzakVar2.createFailedResult(Status.f28028N));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzalVar = this.zza.zzi;
        this.zza.zzr(zzalVar.zzb());
    }
}
