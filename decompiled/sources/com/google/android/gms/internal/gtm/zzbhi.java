package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbhi extends zzbhs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbhi(int i4) {
        super(i4, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhs
    public final void zza() {
        if (!zzj()) {
            for (int i4 = 0; i4 < zzb(); i4++) {
                Map.Entry zzg = zzg(i4);
                if (((zzbet) zzg.getKey()).zzg()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzbet) entry.getKey()).zzg()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
