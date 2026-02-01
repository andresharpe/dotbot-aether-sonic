package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.analytics.A;
import com.google.android.gms.analytics.C1157e;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.common.util.k;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class zzbx {
    private static volatile zzbx zza;
    private final Context zzb;
    private final Context zzc;
    private final InterfaceC1306g zzd;
    private final zzcv zze;
    private final zzfd zzf;
    private final A zzg;
    private final zzbs zzh;
    private final zzda zzi;
    private final zzfv zzj;
    private final zzfj zzk;
    private final C1157e zzl;
    private final zzcp zzm;
    private final zzbk zzn;
    private final zzch zzo;
    private final zzcz zzp;

    protected zzbx(zzby zzbyVar) {
        Context zza2 = zzbyVar.zza();
        C1285y.m(zza2, "Application context can't be null");
        Context zzb = zzbyVar.zzb();
        C1285y.l(zzb);
        this.zzb = zza2;
        this.zzc = zzb;
        this.zzd = k.e();
        this.zze = new zzcv(this);
        zzfd zzfdVar = new zzfd(this);
        zzfdVar.zzW();
        this.zzf = zzfdVar;
        zzm().zzL("Google Analytics " + zzbv.zza + " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzfj zzfjVar = new zzfj(this);
        zzfjVar.zzW();
        this.zzk = zzfjVar;
        zzfv zzfvVar = new zzfv(this);
        zzfvVar.zzW();
        this.zzj = zzfvVar;
        zzbs zzbsVar = new zzbs(this, zzbyVar);
        zzcp zzcpVar = new zzcp(this);
        zzbk zzbkVar = new zzbk(this);
        zzch zzchVar = new zzch(this);
        zzcz zzczVar = new zzcz(this);
        A b4 = A.b(zza2);
        b4.j(new zzbw(this));
        this.zzg = b4;
        C1157e c1157e = new C1157e(this);
        zzcpVar.zzW();
        this.zzm = zzcpVar;
        zzbkVar.zzW();
        this.zzn = zzbkVar;
        zzchVar.zzW();
        this.zzo = zzchVar;
        zzczVar.zzW();
        this.zzp = zzczVar;
        zzda zzdaVar = new zzda(this);
        zzdaVar.zzW();
        this.zzi = zzdaVar;
        zzbsVar.zzW();
        this.zzh = zzbsVar;
        c1157e.w();
        this.zzl = c1157e;
        zzbsVar.zzm();
    }

    public static zzbx zzg(Context context) {
        C1285y.l(context);
        if (zza == null) {
            synchronized (zzbx.class) {
                try {
                    if (zza == null) {
                        InterfaceC1306g e4 = k.e();
                        long c4 = e4.c();
                        zzbx zzbxVar = new zzbx(new zzby(context));
                        zza = zzbxVar;
                        C1157e.v();
                        long c5 = e4.c() - c4;
                        long longValue = ((Long) zzew.zzQ.zzb()).longValue();
                        if (c5 > longValue) {
                            zzbxVar.zzm().zzS("Slow initialization (ms)", Long.valueOf(c5), Long.valueOf(longValue));
                        }
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    private static final void zzs(zzbu zzbuVar) {
        C1285y.m(zzbuVar, "Analytics service not created/initialized");
        C1285y.b(zzbuVar.zzX(), "Analytics service not initialized");
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final C1157e zzc() {
        C1285y.l(this.zzl);
        C1285y.b(this.zzl.z(), "Analytics instance not initialized");
        return this.zzl;
    }

    public final A zzd() {
        C1285y.l(this.zzg);
        return this.zzg;
    }

    public final zzbk zze() {
        zzs(this.zzn);
        return this.zzn;
    }

    public final zzbs zzf() {
        zzs(this.zzh);
        return this.zzh;
    }

    public final zzch zzh() {
        zzs(this.zzo);
        return this.zzo;
    }

    public final zzcp zzi() {
        zzs(this.zzm);
        return this.zzm;
    }

    public final zzcv zzj() {
        return this.zze;
    }

    public final zzcz zzk() {
        return this.zzp;
    }

    public final zzda zzl() {
        zzs(this.zzi);
        return this.zzi;
    }

    public final zzfd zzm() {
        zzs(this.zzf);
        return this.zzf;
    }

    public final zzfd zzn() {
        return this.zzf;
    }

    public final zzfj zzo() {
        zzs(this.zzk);
        return this.zzk;
    }

    public final zzfj zzp() {
        zzfj zzfjVar = this.zzk;
        if (zzfjVar == null || !zzfjVar.zzX()) {
            return null;
        }
        return zzfjVar;
    }

    public final zzfv zzq() {
        zzs(this.zzj);
        return this.zzj;
    }

    public final InterfaceC1306g zzr() {
        return this.zzd;
    }
}
