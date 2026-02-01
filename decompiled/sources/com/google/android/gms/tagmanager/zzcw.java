package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.common.internal.D;
import com.spotify.sdk.android.auth.b;
import java.util.HashMap;
import java.util.Map;

@D
@com.google.android.gms.common.util.D
/* loaded from: classes2.dex */
public final class zzcw {

    @com.google.android.gms.common.util.D
    static final Map zza = new HashMap();
    private static String zzb;

    public static String zza(String str, String str2) {
        if (str2 == null) {
            if (str.length() > 0) {
                return str;
            }
            return null;
        }
        return Uri.parse("http://hostname/?".concat(String.valueOf(str))).getQueryParameter(str2);
    }

    public static String zzb(Context context, String str) {
        if (zzb == null) {
            synchronized (zzcw.class) {
                try {
                    if (zzb == null) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                        if (sharedPreferences != null) {
                            zzb = sharedPreferences.getString(b.c.f48987b, "");
                        } else {
                            zzb = "";
                        }
                    }
                } finally {
                }
            }
        }
        return zza(zzb, str);
    }

    public static void zzc(Context context, String str) {
        String zza2 = zza(str, "conv");
        if (zza2 != null && zza2.length() > 0) {
            zza.put(zza2, str);
            zzff.zza(context, "gtm_click_referrers", zza2, str);
        }
    }

    public static void zzd(String str) {
        synchronized (zzcw.class) {
            zzb = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zze(Context context, String str) {
        zzff.zza(context, "gtm_install_referrer", b.c.f48987b, str);
        zzc(context, str);
    }
}
