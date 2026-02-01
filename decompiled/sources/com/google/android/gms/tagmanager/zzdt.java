package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.InterfaceC1306g;

/* JADX INFO: Access modifiers changed from: package-private */
@D
/* loaded from: classes2.dex */
public final class zzdt implements zzfh {
    final /* synthetic */ zzdv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdt(zzdv zzdvVar) {
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.tagmanager.zzfh
    public final void zza(zzbz zzbzVar) {
        InterfaceC1306g interfaceC1306g;
        InterfaceC1306g interfaceC1306g2;
        long zza = zzbzVar.zza();
        if (zza == 0) {
            zzdv zzdvVar = this.zza;
            long zzb = zzbzVar.zzb();
            interfaceC1306g2 = this.zza.zzg;
            zzdv.zzi(zzdvVar, zzb, interfaceC1306g2.a());
            return;
        }
        long j4 = zza + 14400000;
        interfaceC1306g = this.zza.zzg;
        if (j4 < interfaceC1306g.a()) {
            this.zza.zzl(zzbzVar.zzb());
            zzdg.zzb.zzd("Giving up on failed hitId: " + zzbzVar.zzb());
        }
    }
}
