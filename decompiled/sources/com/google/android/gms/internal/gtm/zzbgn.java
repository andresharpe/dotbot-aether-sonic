package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbgn {
    public static final int zza(int i4, Object obj, Object obj2) {
        zzbgm zzbgmVar = (zzbgm) obj;
        if (!zzbgmVar.isEmpty()) {
            Iterator it = zzbgmVar.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final boolean zzb(Object obj) {
        if (!((zzbgm) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzbgm zzbgmVar = (zzbgm) obj;
        zzbgm zzbgmVar2 = (zzbgm) obj2;
        if (!zzbgmVar2.isEmpty()) {
            if (!zzbgmVar.zze()) {
                zzbgmVar = zzbgmVar.zzb();
            }
            zzbgmVar.zzd(zzbgmVar2);
        }
        return zzbgmVar;
    }
}
