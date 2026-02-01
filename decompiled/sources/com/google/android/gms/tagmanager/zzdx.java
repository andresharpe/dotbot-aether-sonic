package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.D;
import java.util.Iterator;
import java.util.Map;

@D
@com.google.android.gms.common.util.D
/* loaded from: classes2.dex */
public abstract class zzdx extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zzb.ARG0.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ARG1.toString();

    public zzdx(String str) {
        super(str, zza, zzb);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (((com.google.android.gms.internal.gtm.zzam) it.next()) == zzfu.zzb()) {
                return zzfu.zzc(Boolean.FALSE);
            }
        }
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zza);
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        boolean z3 = false;
        if (zzamVar != null && zzamVar2 != null) {
            z3 = zzd(zzamVar, zzamVar2, map);
        }
        return zzfu.zzc(Boolean.valueOf(z3));
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }

    protected abstract boolean zzd(com.google.android.gms.internal.gtm.zzam zzamVar, com.google.android.gms.internal.gtm.zzam zzamVar2, Map map);
}
