package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.util.Pair;
import com.amazonaws.regions.f;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzfi {
    final /* synthetic */ zzfj zza;
    private final String zzb;
    private final long zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfi(zzfj zzfjVar, String str, long j4, zzfh zzfhVar) {
        boolean z3;
        this.zza = zzfjVar;
        C1285y.h(f.f23882d);
        if (j4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.a(z3);
        this.zzb = f.f23882d;
        this.zzc = j4;
    }

    private final long zzd() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zza.zza;
        return sharedPreferences.getLong(zzf(), 0L);
    }

    private final String zze() {
        return this.zzb.concat(":count");
    }

    private final String zzf() {
        return this.zzb.concat(":start");
    }

    private final void zzg() {
        SharedPreferences sharedPreferences;
        long a4 = this.zza.zzC().a();
        sharedPreferences = this.zza.zza;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(zze());
        edit.remove(zzb());
        edit.putLong(zzf(), a4);
        edit.commit();
    }

    public final Pair zza() {
        long abs;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        long zzd = zzd();
        if (zzd == 0) {
            abs = 0;
        } else {
            abs = Math.abs(zzd - this.zza.zzC().a());
        }
        long j4 = this.zzc;
        if (abs < j4) {
            return null;
        }
        if (abs > j4 + j4) {
            zzg();
            return null;
        }
        sharedPreferences = this.zza.zza;
        String string = sharedPreferences.getString(zzb(), null);
        sharedPreferences2 = this.zza.zza;
        long j5 = sharedPreferences2.getLong(zze(), 0L);
        zzg();
        if (string == null || j5 <= 0) {
            return null;
        }
        return new Pair(string, Long.valueOf(j5));
    }

    @D
    protected final String zzb() {
        return this.zzb.concat(":value");
    }

    public final void zzc(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        if (zzd() == 0) {
            zzg();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            try {
                sharedPreferences = this.zza.zza;
                long j4 = sharedPreferences.getLong(zze(), 0L);
                if (j4 <= 0) {
                    sharedPreferences3 = this.zza.zza;
                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                    edit.putString(zzb(), str);
                    edit.putLong(zze(), 1L);
                    edit.apply();
                    return;
                }
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE;
                long j5 = j4 + 1;
                long j6 = Long.MAX_VALUE / j5;
                sharedPreferences2 = this.zza.zza;
                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                if (leastSignificantBits < j6) {
                    edit2.putString(zzb(), str);
                }
                edit2.putLong(zze(), j5);
                edit2.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
