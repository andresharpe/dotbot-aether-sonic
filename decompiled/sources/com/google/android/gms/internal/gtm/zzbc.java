package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.s;
import com.google.android.gms.common.internal.D;
import java.util.HashMap;

@D
@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public final class zzbc extends s {
    public int zza;
    public int zzb;
    private String zzc;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.zzc);
        hashMap.put("screenColors", 0);
        hashMap.put("screenWidth", Integer.valueOf(this.zza));
        hashMap.put("screenHeight", Integer.valueOf(this.zzb));
        hashMap.put("viewportWidth", 0);
        hashMap.put("viewportHeight", 0);
        return s.zza(hashMap);
    }

    @Override // com.google.android.gms.analytics.s
    public final /* bridge */ /* synthetic */ void zzc(s sVar) {
        zzbc zzbcVar = (zzbc) sVar;
        int i4 = this.zza;
        if (i4 != 0) {
            zzbcVar.zza = i4;
        }
        int i5 = this.zzb;
        if (i5 != 0) {
            zzbcVar.zzb = i5;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzbcVar.zzc = this.zzc;
        }
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(String str) {
        this.zzc = str;
    }
}
