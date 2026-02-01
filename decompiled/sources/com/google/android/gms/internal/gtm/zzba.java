package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import com.google.android.gms.analytics.s;
import com.google.android.gms.common.internal.D;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@D
/* loaded from: classes.dex */
public final class zzba extends s {
    private final Map zza = new HashMap(4);

    @SuppressLint({"UseSparseArrays"})
    public zzba() {
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.zza.entrySet()) {
            hashMap.put("metric".concat(String.valueOf(entry.getKey())), entry.getValue());
        }
        return s.zza(hashMap);
    }

    @Override // com.google.android.gms.analytics.s
    public final /* bridge */ /* synthetic */ void zzc(s sVar) {
        ((zzba) sVar).zza.putAll(this.zza);
    }

    public final Map zzd() {
        return Collections.unmodifiableMap(this.zza);
    }
}
