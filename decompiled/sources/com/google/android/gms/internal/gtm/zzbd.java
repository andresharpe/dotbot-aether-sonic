package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.ecommerce.a;
import com.google.android.gms.analytics.s;
import com.google.android.gms.common.internal.D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@D
/* loaded from: classes.dex */
public final class zzbd extends s {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.zza.isEmpty()) {
            hashMap.put("products", this.zza);
        }
        if (!this.zzb.isEmpty()) {
            hashMap.put("promotions", this.zzb);
        }
        if (!this.zzc.isEmpty()) {
            hashMap.put("impressions", this.zzc);
        }
        hashMap.put("productAction", null);
        return s.zza(hashMap);
    }

    @Override // com.google.android.gms.analytics.s
    public final /* bridge */ /* synthetic */ void zzc(s sVar) {
        String str;
        zzbd zzbdVar = (zzbd) sVar;
        zzbdVar.zza.addAll(this.zza);
        zzbdVar.zzb.addAll(this.zzb);
        for (Map.Entry entry : this.zzc.entrySet()) {
            String str2 = (String) entry.getKey();
            for (a aVar : (List) entry.getValue()) {
                if (aVar != null) {
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    if (!zzbdVar.zzc.containsKey(str)) {
                        zzbdVar.zzc.put(str, new ArrayList());
                    }
                    ((List) zzbdVar.zzc.get(str)).add(aVar);
                }
            }
        }
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zza);
    }

    public final List zze() {
        return Collections.unmodifiableList(this.zzb);
    }

    public final Map zzf() {
        return this.zzc;
    }
}
