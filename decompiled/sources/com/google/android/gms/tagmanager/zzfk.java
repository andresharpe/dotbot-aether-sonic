package com.google.android.gms.tagmanager;

import java.util.Map;

/* loaded from: classes2.dex */
abstract class zzfk extends zzdx {
    public zzfk(String str) {
        super(str);
    }

    protected abstract boolean zzc(String str, String str2, Map map);

    @Override // com.google.android.gms.tagmanager.zzdx
    protected final boolean zzd(com.google.android.gms.internal.gtm.zzam zzamVar, com.google.android.gms.internal.gtm.zzam zzamVar2, Map map) {
        String zzn = zzfu.zzn(zzfu.zzl(zzamVar));
        String zzn2 = zzfu.zzn(zzfu.zzl(zzamVar2));
        if (zzn != zzfu.zzm() && zzn2 != zzfu.zzm()) {
            return zzc(zzn, zzn2, map);
        }
        return false;
    }
}
