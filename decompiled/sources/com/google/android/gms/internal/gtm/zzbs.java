package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.A;
import com.google.android.gms.common.internal.C1285y;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzbs extends zzbu {
    private final zzcm zza;

    public zzbs(zzbx zzbxVar, zzby zzbyVar) {
        super(zzbxVar);
        C1285y.l(zzbyVar);
        this.zza = new zzcm(zzbxVar, zzbyVar);
    }

    public final long zza(zzbz zzbzVar) {
        zzV();
        C1285y.l(zzbzVar);
        A.h();
        long zzb = this.zza.zzb(zzbzVar, true);
        if (zzb == 0) {
            this.zza.zzk(zzbzVar);
            return 0L;
        }
        return zzb;
    }

    public final void zzc() {
        zzV();
        Context zzo = zzo();
        if (zzfk.zza(zzo) && zzfp.zzh(zzo)) {
            Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent.setComponent(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsService"));
            zzo.startService(intent);
            return;
        }
        zze(null);
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
        this.zza.zzW();
    }

    public final void zze(zzdb zzdbVar) {
        zzV();
        zzq().i(new zzbq(this, zzdbVar));
    }

    public final void zzf(String str, Runnable runnable) {
        C1285y.i(str, "campaign param can't be empty");
        zzq().i(new zzbm(this, str, runnable));
    }

    public final void zzg() {
        zzV();
        zzw();
        zzq().i(new zzbp(this));
    }

    public final void zzh(zzez zzezVar) {
        C1285y.l(zzezVar);
        zzV();
        zzF("Hit delivery requested", zzezVar);
        zzq().i(new zzbo(this, zzezVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi() {
        A.h();
        this.zza.zzl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj() {
        A.h();
        this.zza.zzm();
    }

    public final void zzk() {
        zzV();
        A.h();
        zzcm zzcmVar = this.zza;
        A.h();
        zzcmVar.zzV();
        zzcmVar.zzN("Service disconnected");
    }

    public final void zzl(int i4) {
        zzV();
        zzF("setLocalDispatchPeriod (sec)", Integer.valueOf(i4));
        zzq().i(new zzbn(this, i4));
    }

    public final void zzm() {
        this.zza.zzZ();
    }

    public final boolean zzn() {
        zzV();
        try {
            zzq().g(new zzbr(this)).get(4L, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e4) {
            zzR("syncDispatchLocalHits interrupted", e4);
            return false;
        } catch (ExecutionException e5) {
            zzJ("syncDispatchLocalHits failed", e5);
            return false;
        } catch (TimeoutException e6) {
            zzR("syncDispatchLocalHits timed out", e6);
            return false;
        }
    }
}
