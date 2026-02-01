package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.analytics.g;
import com.google.android.gms.common.util.D;

@D
@Deprecated
/* loaded from: classes.dex */
public final class zzfc {
    private static volatile g zza = new zzcw();

    @D
    public static g zza() {
        return zza;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String str, Object obj) {
        String str2;
        zzfd zza2 = zzfd.zza();
        if (zza2 != null) {
            zza2.zzJ(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                str2 = str + ":" + ((String) obj);
            } else {
                str2 = str;
            }
            Log.e((String) zzew.zzc.zzb(), str2);
        }
        g gVar = zza;
        if (gVar != null) {
            gVar.error(str);
        }
    }

    @D
    public static void zzc(g gVar) {
        zza = gVar;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzd(String str) {
        zzfd zza2 = zzfd.zza();
        if (zza2 != null) {
            zza2.zzN(str);
        } else if (zzf(0)) {
            Log.v((String) zzew.zzc.zzb(), str);
        }
        g gVar = zza;
        if (gVar != null) {
            gVar.verbose(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zze(String str) {
        zzfd zza2 = zzfd.zza();
        if (zza2 != null) {
            zza2.zzQ(str);
        } else if (zzf(2)) {
            Log.w((String) zzew.zzc.zzb(), str);
        }
        g gVar = zza;
        if (gVar != null) {
            gVar.warn(str);
        }
    }

    public static boolean zzf(int i4) {
        if (zza == null || zza.getLogLevel() > i4) {
            return false;
        }
        return true;
    }
}
