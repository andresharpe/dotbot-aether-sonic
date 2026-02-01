package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.D;
import java.util.HashMap;
import java.util.Map;

@D
/* loaded from: classes.dex */
public final class zzrt {
    private final Map zza = new HashMap();
    private zzam zzb;

    private zzrt() {
    }

    public final zzrr zza() {
        return new zzrr(this.zza, this.zzb, null);
    }

    public final zzrt zzb(String str, zzam zzamVar) {
        this.zza.put(str, zzamVar);
        return this;
    }

    public final zzrt zzc(zzam zzamVar) {
        this.zzb = zzamVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzrt(zzrs zzrsVar) {
    }
}
