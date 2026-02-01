package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.D;
import com.google.android.gms.internal.gtm.zzgb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzei implements zzai {
    private final String zza;
    private final Context zzb;
    private ScheduledFuture zzd;
    private boolean zze;
    private final zzao zzf;
    private String zzg;
    private zzdf zzh;
    private final ScheduledExecutorService zzc = zzgb.zza().zzb(1, 2);
    private final zzeh zzi = new zzeh(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    @D
    public zzei(Context context, String str, zzao zzaoVar, zzeg zzegVar, zzeh zzehVar, byte[] bArr) {
        this.zzf = zzaoVar;
        this.zzb = context;
        this.zza = str;
    }

    private final synchronized void zzd() {
        if (this.zze) {
            throw new IllegalStateException("called method after closed");
        }
    }

    @Override // com.google.android.gms.common.api.n
    public final synchronized void release() {
        try {
            zzd();
            ScheduledFuture scheduledFuture = this.zzd;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zzc.shutdown();
            this.zze = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.tagmanager.zzai
    public final synchronized void zza(long j4, String str) {
        try {
            zzdg.zzb.zzd("loadAfterDelay: containerId=" + this.zza + " delay=" + j4);
            zzd();
            if (this.zzh != null) {
                ScheduledFuture scheduledFuture = this.zzd;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.zzc;
                zzeh zzehVar = this.zzi;
                zzao zzaoVar = this.zzf;
                zzei zzeiVar = zzehVar.zza;
                zzef zzefVar = new zzef(zzeiVar.zzb, zzeiVar.zza, zzaoVar);
                zzefVar.zzb(this.zzh);
                zzefVar.zza(this.zzg);
                zzefVar.zzc(str);
                this.zzd = scheduledExecutorService.schedule(zzefVar, j4, TimeUnit.MILLISECONDS);
            } else {
                throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.tagmanager.zzai
    public final synchronized void zzb(String str) {
        zzd();
        this.zzg = str;
    }

    @Override // com.google.android.gms.tagmanager.zzai
    public final synchronized void zzc(zzdf zzdfVar) {
        zzd();
        this.zzh = zzdfVar;
    }
}
