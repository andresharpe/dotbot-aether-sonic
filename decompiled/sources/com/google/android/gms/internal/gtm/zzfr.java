package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfr extends zzbt implements zzct {
    private final zzft zza;

    public zzfr(zzbx zzbxVar) {
        super(zzbxVar);
        this.zza = new zzft();
    }

    @Override // com.google.android.gms.internal.gtm.zzct
    public final /* synthetic */ zzcs zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzct
    public final void zzb(String str, String str2) {
        this.zza.zzg.put(str, str2);
    }

    @Override // com.google.android.gms.internal.gtm.zzct
    public final void zzc(String str, boolean z3) {
        if ("ga_autoActivityTracking".equals(str)) {
            this.zza.zzd = z3 ? 1 : 0;
        } else if ("ga_anonymizeIp".equals(str)) {
            this.zza.zze = z3 ? 1 : 0;
        } else if ("ga_reportUncaughtExceptions".equals(str)) {
            this.zza.zzf = z3 ? 1 : 0;
        } else {
            zzR("bool configuration name not recognized", str);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzct
    public final void zzd(String str, int i4) {
        if ("ga_sessionTimeout".equals(str)) {
            this.zza.zzc = i4;
        } else {
            zzR("int configuration name not recognized", str);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzct
    public final void zze(String str, String str2) {
        if ("ga_trackingId".equals(str)) {
            this.zza.zza = str2;
            return;
        }
        if ("ga_sampleFrequency".equals(str)) {
            try {
                this.zza.zzb = Double.parseDouble(str2);
                return;
            } catch (NumberFormatException e4) {
                zzS("Error parsing ga_sampleFrequency value", str2, e4);
                return;
            }
        }
        zzR("string configuration name not recognized", str);
    }
}
