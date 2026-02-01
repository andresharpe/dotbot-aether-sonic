package com.google.android.gms.internal.gtm;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.x;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcv {
    private final zzbx zza;
    private volatile Boolean zzb;
    private String zzc;
    private Set zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcv(zzbx zzbxVar) {
        C1285y.l(zzbxVar);
        this.zza = zzbxVar;
    }

    public static final long zzc() {
        return ((Long) zzew.zzG.zzb()).longValue();
    }

    public static final long zzd() {
        return ((Long) zzew.zzm.zzb()).longValue();
    }

    public static final long zze() {
        return ((Long) zzew.zzj.zzb()).longValue();
    }

    public static final int zzf() {
        return ((Integer) zzew.zzy.zzb()).intValue();
    }

    public static final int zzg() {
        return ((Integer) zzew.zzp.zzb()).intValue();
    }

    public static final int zzh() {
        return ((Integer) zzew.zzo.zzb()).intValue();
    }

    @D
    public static final String zzi() {
        return (String) zzew.zzr.zzb();
    }

    public static final String zzj() {
        return (String) zzew.zzs.zzb();
    }

    @D
    public static final String zzk() {
        return (String) zzew.zzq.zzb();
    }

    public static final boolean zzl() {
        return ((Boolean) zzew.zzb.zzb()).booleanValue();
    }

    public final Set zza() {
        String str;
        String str2 = (String) zzew.zzB.zzb();
        if (this.zzd == null || (str = this.zzc) == null || !str.equals(str2)) {
            String[] split = TextUtils.split(str2, ",");
            HashSet hashSet = new HashSet();
            for (String str3 : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str3)));
                } catch (NumberFormatException unused) {
                }
            }
            this.zzc = str2;
            this.zzd = hashSet;
        }
        return this.zzd;
    }

    public final boolean zzb() {
        if (this.zzb == null) {
            synchronized (this) {
                try {
                    if (this.zzb == null) {
                        ApplicationInfo applicationInfo = this.zza.zza().getApplicationInfo();
                        String a4 = x.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z3 = false;
                            if (str != null && str.equals(a4)) {
                                z3 = true;
                            }
                            this.zzb = Boolean.valueOf(z3);
                        }
                        if ((this.zzb == null || !this.zzb.booleanValue()) && "com.google.android.gms.analytics".equals(a4)) {
                            this.zzb = Boolean.TRUE;
                        }
                        if (this.zzb == null) {
                            this.zzb = Boolean.TRUE;
                            this.zza.zzm().zzI("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzb.booleanValue();
    }
}
