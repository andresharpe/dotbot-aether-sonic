package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.amazonaws.regions.f;
import com.google.android.gms.analytics.A;

/* loaded from: classes.dex */
public final class zzfj extends zzbu {
    private SharedPreferences zza;
    private long zzb;
    private long zzc;
    private final zzfi zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfj(zzbx zzbxVar) {
        super(zzbxVar);
        this.zzc = -1L;
        zzw();
        this.zzd = new zzfi(this, f.f23882d, ((Long) zzew.zzP.zzb()).longValue(), null);
    }

    public final long zza() {
        A.h();
        zzV();
        long j4 = this.zzb;
        if (j4 == 0) {
            long j5 = this.zza.getLong("first_run", 0L);
            if (j5 != 0) {
                this.zzb = j5;
                return j5;
            }
            long a4 = zzC().a();
            SharedPreferences.Editor edit = this.zza.edit();
            edit.putLong("first_run", a4);
            if (!edit.commit()) {
                zzQ("Failed to commit first run time");
            }
            this.zzb = a4;
            return a4;
        }
        return j4;
    }

    public final long zzb() {
        A.h();
        zzV();
        long j4 = this.zzc;
        if (j4 == -1) {
            long j5 = this.zza.getLong("last_dispatch", 0L);
            this.zzc = j5;
            return j5;
        }
        return j4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
        this.zza = zzo().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final zzfi zze() {
        return this.zzd;
    }

    public final zzfq zzf() {
        return new zzfq(zzC(), zza());
    }

    public final String zzg() {
        A.h();
        zzV();
        String string = this.zza.getString("installation_campaign", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public final void zzh(String str) {
        A.h();
        zzV();
        SharedPreferences.Editor edit = this.zza.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            zzQ("Failed to commit campaign data");
        }
    }

    public final void zzi() {
        A.h();
        zzV();
        long a4 = zzC().a();
        SharedPreferences.Editor edit = this.zza.edit();
        edit.putLong("last_dispatch", a4);
        edit.apply();
        this.zzc = a4;
    }
}
