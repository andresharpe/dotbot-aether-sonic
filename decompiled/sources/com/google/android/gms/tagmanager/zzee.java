package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzee extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.RESOLUTION.toString();
    private final Context zzb;

    public zzee(Context context) {
        super(zza, new String[0]);
        this.zzb = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.zzb.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return zzfu.zzc(displayMetrics.widthPixels + "x" + displayMetrics.heightPixels);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
