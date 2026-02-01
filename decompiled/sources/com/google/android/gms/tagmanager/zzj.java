package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzj extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.APP_NAME.toString();
    private final Context zzb;

    public zzj(Context context) {
        super(zza, new String[0]);
        this.zzb = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        try {
            PackageManager packageManager = this.zzb.getPackageManager();
            return zzfu.zzc(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.zzb.getPackageName(), 0)).toString());
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("GoogleTagManager", "App name is not found.", e4);
            return zzfu.zzb();
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
