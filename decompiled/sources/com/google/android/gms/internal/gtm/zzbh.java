package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.s;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.D;
import java.util.HashMap;
import java.util.UUID;

@D
@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public final class zzbh extends s {
    private int zza;

    public zzbh() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Integer.MAX_VALUE;
        }
        C1285y.n(leastSignificantBits);
        this.zza = leastSignificantBits;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", null);
        Boolean bool = Boolean.FALSE;
        hashMap.put("interstitial", bool);
        hashMap.put("automatic", bool);
        hashMap.put("screenId", Integer.valueOf(this.zza));
        hashMap.put("referrerScreenId", 0);
        hashMap.put("referrerScreenName", null);
        hashMap.put("referrerUri", null);
        return s.zza(hashMap);
    }

    @Override // com.google.android.gms.analytics.s
    public final /* bridge */ /* synthetic */ void zzc(s sVar) {
        zzbh zzbhVar = (zzbh) sVar;
        TextUtils.isEmpty(null);
        int i4 = this.zza;
        if (i4 != 0) {
            zzbhVar.zza = i4;
        }
        TextUtils.isEmpty(null);
        if (!TextUtils.isEmpty(null)) {
            TextUtils.isEmpty(null);
        }
    }

    public final int zzd() {
        return this.zza;
    }
}
