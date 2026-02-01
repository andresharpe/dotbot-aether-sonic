package com.google.android.gms.tagmanager;

import com.google.firebase.remoteconfig.l;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzea extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.RANDOM.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.MIN.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.MAX.toString();

    public zzea() {
        super(zza, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        double d4 = 2.147483647E9d;
        double d5 = l.f37524n;
        if (zzamVar != null && zzamVar != zzfu.zzb() && zzamVar2 != null && zzamVar2 != zzfu.zzb()) {
            zzft zze = zzfu.zze(zzfu.zzl(zzamVar));
            zzft zze2 = zzfu.zze(zzfu.zzl(zzamVar2));
            if (zze != zzfu.zzd() && zze2 != zzfu.zzd()) {
                double doubleValue = zze.doubleValue();
                double doubleValue2 = zze2.doubleValue();
                if (doubleValue <= doubleValue2) {
                    d5 = doubleValue;
                    d4 = doubleValue2;
                }
            }
        }
        return zzfu.zzc(Long.valueOf(Math.round((Math.random() * (d4 - d5)) + d5)));
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}
