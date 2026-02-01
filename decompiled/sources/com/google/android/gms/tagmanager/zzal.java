package com.google.android.gms.tagmanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.D;
import java.util.Random;

@D
/* loaded from: classes2.dex */
public final class zzal {
    private final Context zza;
    private final Random zzb;
    private final String zzc;

    public zzal(Context context, String str) {
        Random random = new Random();
        this.zza = (Context) C1285y.l(context);
        this.zzc = (String) C1285y.l(str);
        this.zzb = random;
    }

    private final long zze(long j4, long j5) {
        long max = Math.max(0L, zzf().getLong("FORBIDDEN_COUNT", 0L));
        return this.zzb.nextFloat() * ((float) (j4 + ((((float) max) / ((float) ((max + Math.max(0L, r0.getLong("SUCCESSFUL_COUNT", 0L))) + 1))) * ((float) (j5 - j4)))));
    }

    private final SharedPreferences zzf() {
        return this.zza.getSharedPreferences("_gtmContainerRefreshPolicy_".concat(String.valueOf(this.zzc)), 0);
    }

    public final long zza() {
        return zze(7200000L, 259200000L) + 43200000;
    }

    public final long zzb() {
        return zze(600000L, 86400000L) + 3600000;
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void zzc() {
        long min;
        SharedPreferences zzf = zzf();
        long j4 = zzf.getLong("FORBIDDEN_COUNT", 0L);
        long j5 = zzf.getLong("SUCCESSFUL_COUNT", 0L);
        SharedPreferences.Editor edit = zzf.edit();
        if (j4 == 0) {
            min = 3;
        } else {
            min = Math.min(10L, j4 + 1);
        }
        long max = Math.max(0L, Math.min(j5, 10 - min));
        edit.putLong("FORBIDDEN_COUNT", min);
        edit.putLong("SUCCESSFUL_COUNT", max);
        edit.apply();
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void zzd() {
        SharedPreferences zzf = zzf();
        long j4 = zzf.getLong("SUCCESSFUL_COUNT", 0L);
        long j5 = zzf.getLong("FORBIDDEN_COUNT", 0L);
        long min = Math.min(10L, j4 + 1);
        long max = Math.max(0L, Math.min(j5, 10 - min));
        SharedPreferences.Editor edit = zzf.edit();
        edit.putLong("SUCCESSFUL_COUNT", min);
        edit.putLong("FORBIDDEN_COUNT", max);
        edit.apply();
    }
}
