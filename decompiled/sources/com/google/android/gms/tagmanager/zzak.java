package com.google.android.gms.tagmanager;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.internal.gtm.zzrn;
import com.google.android.gms.internal.gtm.zzro;
import com.google.android.gms.internal.gtm.zzrp;
import com.google.android.gms.internal.gtm.zzrv;

@D
/* loaded from: classes2.dex */
public final class zzak extends BasePendingResult {
    private final InterfaceC1306g zza;
    private final zzah zzb;
    private final Looper zzc;
    private final zzeb zzd;
    private final int zze;
    private final Context zzf;
    private final TagManager zzg;
    private final String zzh;
    private final zzal zzi;
    private zzaj zzj;
    private final zzrp zzk;
    private volatile zzz zzl;
    private volatile boolean zzm;
    private com.google.android.gms.internal.gtm.zzak zzn;
    private long zzo;
    private String zzp;
    private zzai zzq;
    private zzab zzr;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzak(android.content.Context r22, com.google.android.gms.tagmanager.TagManager r23, android.os.Looper r24, java.lang.String r25, int r26, com.google.android.gms.tagmanager.zzao r27) {
        /*
            r21 = this;
            r0 = r21
            r8 = r22
            r9 = r25
            com.google.android.gms.tagmanager.zzel r10 = new com.google.android.gms.tagmanager.zzel
            r10.<init>(r8, r9)
            com.google.android.gms.tagmanager.zzei r11 = new com.google.android.gms.tagmanager.zzei
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r11
            r2 = r22
            r3 = r25
            r4 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.android.gms.internal.gtm.zzrp r1 = new com.google.android.gms.internal.gtm.zzrp
            r1.<init>(r8)
            com.google.android.gms.common.util.g r2 = com.google.android.gms.common.util.k.e()
            com.google.android.gms.tagmanager.zzde r3 = new com.google.android.gms.tagmanager.zzde
            r13 = 1
            r14 = 5
            r15 = 900000(0xdbba0, double:4.44659E-318)
            r17 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r19 = "refreshing"
            com.google.android.gms.common.util.g r20 = com.google.android.gms.common.util.k.e()
            r12 = r3
            r12.<init>(r13, r14, r15, r17, r19, r20)
            com.google.android.gms.tagmanager.zzal r4 = new com.google.android.gms.tagmanager.zzal
            r4.<init>(r8, r9)
            if (r24 != 0) goto L42
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            goto L44
        L42:
            r5 = r24
        L44:
            r0.<init>(r5)
            r0.zzf = r8
            r5 = r23
            r0.zzg = r5
            if (r24 != 0) goto L54
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            goto L56
        L54:
            r5 = r24
        L56:
            r0.zzc = r5
            r0.zzh = r9
            r5 = r26
            r0.zze = r5
            r0.zzj = r10
            r0.zzq = r11
            r0.zzk = r1
            com.google.android.gms.tagmanager.zzah r1 = new com.google.android.gms.tagmanager.zzah
            r5 = 0
            r1.<init>(r0, r5)
            r0.zzb = r1
            com.google.android.gms.internal.gtm.zzak r1 = com.google.android.gms.internal.gtm.zzak.zzf()
            r0.zzn = r1
            r0.zza = r2
            r0.zzd = r3
            r0.zzi = r4
            boolean r1 = r21.zzv()
            if (r1 == 0) goto L89
            com.google.android.gms.tagmanager.zzdz r1 = com.google.android.gms.tagmanager.zzdz.zza()
            java.lang.String r1 = r1.zzb()
            r0.zzo(r1)
        L89:
            r27.zza()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzak.<init>(android.content.Context, com.google.android.gms.tagmanager.TagManager, android.os.Looper, java.lang.String, int, com.google.android.gms.tagmanager.zzao):void");
    }

    public static /* bridge */ /* synthetic */ boolean zzp(zzak zzakVar) {
        boolean z3 = zzakVar.zzm;
        return false;
    }

    public final synchronized void zzr(long j4) {
        zzai zzaiVar = this.zzq;
        if (zzaiVar == null) {
            Log.w("GoogleTagManager", "Refresh requested, but no network load scheduler.");
        } else {
            zzaiVar.zza(j4, this.zzn.zzh());
        }
    }

    private final void zzs(boolean z3) {
        this.zzj.zzd(new zzad(this, null));
        this.zzq.zzc(new zzaf(this, null));
        zzrv zza = this.zzj.zza(this.zze);
        if (zza != null) {
            TagManager tagManager = this.zzg;
            this.zzl = new zzz(tagManager, this.zzc, new Container(this.zzf, tagManager.getDataLayer(), this.zzh, 0L, zza), this.zzb);
        }
        this.zzr = new zzab(this, z3);
        if (zzv()) {
            this.zzq.zza(0L, "");
        } else {
            this.zzj.zzb();
        }
    }

    public final synchronized void zzt(com.google.android.gms.internal.gtm.zzak zzakVar) {
        if (this.zzj != null) {
            zzrn zze = zzro.zze();
            zze.zzc(0L);
            zze.zza(com.google.android.gms.internal.gtm.zzac.zzk());
            zze.zzc(this.zzo);
            zze.zza(com.google.android.gms.internal.gtm.zzac.zzk());
            zze.zzb(zzakVar);
            this.zzj.zzc((zzro) zze.zzC());
        }
    }

    public final synchronized void zzu(com.google.android.gms.internal.gtm.zzak zzakVar, long j4, boolean z3) {
        if (isReady() && this.zzl == null) {
            return;
        }
        this.zzn = zzakVar;
        this.zzo = j4;
        long zza = this.zzi.zza();
        zzr(Math.max(0L, Math.min(zza, (this.zzo + zza) - this.zza.a())));
        Container container = new Container(this.zzf, this.zzg.getDataLayer(), this.zzh, j4, zzakVar);
        if (this.zzl == null) {
            this.zzl = new zzz(this.zzg, this.zzc, container, this.zzb);
        } else {
            this.zzl.zzc(container);
        }
        if (!isReady() && this.zzr.zza(container)) {
            setResult(this.zzl);
        }
    }

    public final boolean zzv() {
        zzdz zza = zzdz.zza();
        if ((zza.zze() == 2 || zza.zze() == 3) && this.zzh.equals(zza.zzc())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: zzd */
    public final ContainerHolder createFailedResult(Status status) {
        if (this.zzl != null) {
            return this.zzl;
        }
        if (status == Status.f28028N) {
            Log.e("GoogleTagManager", "timer expired: setting result to failure");
        }
        return new zzz(status);
    }

    public final synchronized String zzh() {
        return this.zzp;
    }

    public final void zzl() {
        zzrv zza = this.zzj.zza(this.zze);
        if (zza != null) {
            setResult(new zzz(this.zzg, this.zzc, new Container(this.zzf, this.zzg.getDataLayer(), this.zzh, 0L, zza), new zzaa(this)));
        } else {
            Log.e("GoogleTagManager", "Default was requested, but no default container was found");
            setResult(createFailedResult(new Status(10, "Default was requested, but no default container was found", (PendingIntent) null)));
        }
        this.zzq = null;
        this.zzj = null;
    }

    public final void zzm() {
        zzs(true);
    }

    public final void zzn() {
        zzs(false);
    }

    @com.google.android.gms.common.util.D
    public final synchronized void zzo(String str) {
        this.zzp = str;
        zzai zzaiVar = this.zzq;
        if (zzaiVar != null) {
            zzaiVar.zzb(str);
        }
    }
}
