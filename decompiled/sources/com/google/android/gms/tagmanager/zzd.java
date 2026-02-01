package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.a;
import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.common.util.k;

@D
/* loaded from: classes2.dex */
public final class zzd {
    private static final Object zza = new Object();
    private static zzd zzb;
    private volatile a.C0259a zzf;
    private volatile long zzg;
    private volatile long zzh;
    private final Context zzi;
    private final InterfaceC1306g zzj;
    private final Thread zzk;
    private volatile long zzc = 900000;
    private volatile long zzd = 30000;
    private volatile boolean zze = false;
    private final Object zzl = new Object();
    private final zzc zzm = new zza(this);

    @D
    public zzd(Context context, zzc zzcVar, InterfaceC1306g interfaceC1306g) {
        this.zzj = interfaceC1306g;
        if (context != null) {
            this.zzi = context.getApplicationContext();
        } else {
            this.zzi = null;
        }
        this.zzg = interfaceC1306g.a();
        this.zzk = new Thread(new zzb(this));
    }

    public static zzd zzb(Context context) {
        if (zzb == null) {
            synchronized (zza) {
                try {
                    if (zzb == null) {
                        zzd zzdVar = new zzd(context, null, k.e());
                        zzb = zzdVar;
                        zzdVar.zzk.start();
                    }
                } finally {
                }
            }
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzd zzdVar) {
        Process.setThreadPriority(10);
        while (!zzdVar.zze) {
            a.C0259a zza2 = zzdVar.zzm.zza();
            if (zza2 != null) {
                zzdVar.zzf = zza2;
                zzdVar.zzh = zzdVar.zzj.a();
                zzdg.zzb.zzb("Obtained fresh AdvertisingId info from GmsCore.");
            }
            synchronized (zzdVar) {
                zzdVar.notifyAll();
            }
            try {
                synchronized (zzdVar.zzl) {
                    zzdVar.zzl.wait(zzdVar.zzc);
                }
            } catch (InterruptedException unused) {
                zzdg.zzb.zzb("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private final void zzg() {
        if (this.zzj.a() - this.zzh > 3600000) {
            this.zzf = null;
        }
    }

    private final void zzh() {
        if (this.zzj.a() - this.zzg > this.zzd) {
            synchronized (this.zzl) {
                this.zzl.notify();
            }
            this.zzg = this.zzj.a();
        }
    }

    private final void zzi() {
        synchronized (this) {
            try {
                if (!this.zze) {
                    zzh();
                    wait(500L);
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    public final String zzc() {
        if (this.zzf == null) {
            zzi();
        } else {
            zzh();
        }
        zzg();
        if (this.zzf == null) {
            return null;
        }
        return this.zzf.a();
    }

    @D
    public final void zze() {
        this.zze = true;
        this.zzk.interrupt();
    }

    public final boolean zzf() {
        if (this.zzf == null) {
            zzi();
        } else {
            zzh();
        }
        zzg();
        if (this.zzf != null && !this.zzf.b()) {
            return false;
        }
        return true;
    }
}
