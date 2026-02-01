package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzbt {
    private final Set zzs;
    private final String zzt;

    public zzbt(String str, String... strArr) {
        this.zzt = str;
        this.zzs = new HashSet(strArr.length);
        for (String str2 : strArr) {
            this.zzs.add(str2);
        }
    }

    public abstract com.google.android.gms.internal.gtm.zzam zza(Map map);

    public abstract boolean zzb();

    public final String zze() {
        return this.zzt;
    }

    public final Set zzf() {
        return this.zzs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzg(Set set) {
        return set.containsAll(this.zzs);
    }
}
