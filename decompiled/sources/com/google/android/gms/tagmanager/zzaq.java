package com.google.android.gms.tagmanager;

import android.util.Log;
import com.google.android.gms.common.util.D;
import java.util.HashMap;
import java.util.Map;

@D
/* loaded from: classes2.dex */
final class zzaq extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.FUNCTION_CALL.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.FUNCTION_CALL_NAME.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.ADDITIONAL_PARAMS.toString();
    private final zzap zzd;

    public zzaq(zzap zzapVar) {
        super(zza, zzb);
        this.zzd = zzapVar;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String zzn = zzfu.zzn(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) map.get(zzb)));
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        if (zzamVar != null) {
            Object zzl = zzfu.zzl(zzamVar);
            if (!(zzl instanceof Map)) {
                Log.w("GoogleTagManager", "FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return zzfu.zzb();
            }
            for (Map.Entry entry : ((Map) zzl).entrySet()) {
                hashMap.put(entry.getKey().toString(), entry.getValue());
            }
        }
        try {
            return zzfu.zzc(this.zzd.zza(zzn, hashMap));
        } catch (Exception e4) {
            Log.w("GoogleTagManager", "Custom macro/tag " + zzn + " threw exception " + e4.getMessage());
            return zzfu.zzb();
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}
