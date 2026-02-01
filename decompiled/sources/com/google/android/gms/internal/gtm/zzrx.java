package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@D
/* loaded from: classes.dex */
public final class zzrx {
    private final List zza = new ArrayList();
    private final Map zzb = new HashMap();
    private String zzc = "";
    private int zzd = 0;

    private zzrx() {
    }

    public final zzrv zza() {
        return new zzrv(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    public final zzrx zzb(zzrr zzrrVar) {
        String zzn = com.google.android.gms.tagmanager.zzfu.zzn(com.google.android.gms.tagmanager.zzfu.zzl((zzam) zzrrVar.zzc().get(zzb.INSTANCE_NAME.toString())));
        List list = (List) this.zzb.get(zzn);
        if (list == null) {
            list = new ArrayList();
            this.zzb.put(zzn, list);
        }
        list.add(zzrrVar);
        return this;
    }

    public final zzrx zzc(zzrz zzrzVar) {
        this.zza.add(zzrzVar);
        return this;
    }

    public final zzrx zzd(int i4) {
        this.zzd = i4;
        return this;
    }

    public final zzrx zze(String str) {
        this.zzc = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzrx(zzrw zzrwVar) {
    }
}
