package com.google.android.gms.internal.gtm;

import androidx.constraintlayout.core.motion.utils.v;
import com.google.android.gms.analytics.s;
import com.google.android.gms.common.internal.D;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@D
/* loaded from: classes.dex */
public final class zzaz extends s {
    private final Map zza = new HashMap(4);

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.zza.entrySet()) {
            hashMap.put(v.b.f7405g.concat(String.valueOf(entry.getKey())), entry.getValue());
        }
        return s.zza(hashMap);
    }

    @Override // com.google.android.gms.analytics.s
    public final /* bridge */ /* synthetic */ void zzc(s sVar) {
        ((zzaz) sVar).zza.putAll(this.zza);
    }

    public final Map zzd() {
        return Collections.unmodifiableMap(this.zza);
    }
}
