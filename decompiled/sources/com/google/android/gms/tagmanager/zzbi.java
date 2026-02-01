package com.google.android.gms.tagmanager;

import android.os.Build;
import androidx.core.os.C0745h;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbi extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.DEVICE_NAME.toString();

    public zzbi() {
        super(zza, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (!str2.startsWith(str) && !str.equals(C0745h.f12738b)) {
            str2 = str + " " + str2;
        }
        return zzfu.zzc(str2);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
