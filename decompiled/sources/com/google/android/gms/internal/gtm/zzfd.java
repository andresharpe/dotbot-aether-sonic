package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfd extends zzbu {
    private static zzfd zza;

    public zzfd(zzbx zzbxVar) {
        super(zzbxVar);
    }

    public static zzfd zza() {
        return zza;
    }

    @D
    protected static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l4 = (Long) obj;
            if (Math.abs(l4.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) != '-') {
                str = "";
            }
            String valueOf = String.valueOf(Math.abs(l4.longValue()));
            return str + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return "-";
        }
        return obj.getClass().getCanonicalName();
    }

    public final void zzb(zzez zzezVar, String str) {
        String str2;
        if (zzezVar != null) {
            str2 = zzezVar.toString();
        } else {
            str2 = "no hit data";
        }
        zzR("Discarding hit. ".concat(str), str2);
    }

    public final void zzc(Map map, String str) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        zzR("Discarding hit. ".concat(str), sb.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
        synchronized (zzfd.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i4, String str, Object obj, Object obj2, Object obj3) {
        char c4;
        try {
            C1285y.l(str);
            if (zzw().zzb()) {
                zzw();
                c4 = 'C';
            } else {
                zzw();
                c4 = 'c';
            }
            String str2 = "3" + "01VDIWEA?".charAt(i4) + c4 + zzbv.zza + ":" + zzbt.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
            if (str2.length() > 1024) {
                str2 = str2.substring(0, 1024);
            }
            zzfj zzp = zzt().zzp();
            if (zzp != null) {
                zzp.zze().zzc(str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
