package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.s;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.D;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@D
/* loaded from: classes.dex */
public final class zzbb extends s {
    private final Map zza = new HashMap();

    public final String toString() {
        return s.zza(this.zza);
    }

    @Override // com.google.android.gms.analytics.s
    public final /* bridge */ /* synthetic */ void zzc(s sVar) {
        zzbb zzbbVar = (zzbb) sVar;
        C1285y.l(zzbbVar);
        zzbbVar.zza.putAll(this.zza);
    }

    public final Map zzd() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final void zze(String str, String str2) {
        C1285y.h(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        C1285y.i(str, "Name can not be empty or \"&\"");
        this.zza.put(str, str2);
    }
}
