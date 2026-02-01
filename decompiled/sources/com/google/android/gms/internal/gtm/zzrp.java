package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.common.util.k;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzrp {

    @D
    final Map zza;
    private final Context zzb;
    private final zzse zzc;
    private final InterfaceC1306g zzd;
    private final Map zze;

    public zzrp(Context context) {
        HashMap hashMap = new HashMap();
        zzse zzseVar = new zzse(context);
        InterfaceC1306g e4 = k.e();
        this.zza = new HashMap();
        this.zzb = context;
        this.zzd = e4;
        this.zzc = zzseVar;
        this.zze = hashMap;
    }
}
