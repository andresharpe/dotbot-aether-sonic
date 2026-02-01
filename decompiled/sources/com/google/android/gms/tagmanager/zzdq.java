package com.google.android.gms.tagmanager;

import java.util.Map;

/* loaded from: classes2.dex */
abstract class zzdq extends zzdx {
    public zzdq(String str) {
        super(str);
    }

    protected abstract boolean zzc(zzft zzftVar, zzft zzftVar2, Map map);

    @Override // com.google.android.gms.tagmanager.zzdx
    protected final boolean zzd(com.google.android.gms.internal.gtm.zzam zzamVar, com.google.android.gms.internal.gtm.zzam zzamVar2, Map map) {
        zzft zze = zzfu.zze(zzfu.zzl(zzamVar));
        zzft zze2 = zzfu.zze(zzfu.zzl(zzamVar2));
        if (zze != zzfu.zzd() && zze2 != zzfu.zzd()) {
            return zzc(zze, zze2, map);
        }
        return false;
    }
}
