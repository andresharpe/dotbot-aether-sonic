package com.google.android.gms.tagmanager;

import android.text.TextUtils;
import com.google.android.gms.common.util.D;

@D
/* loaded from: classes2.dex */
final class zzbz {
    private final long zza;
    private final long zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbz(long j4, long j5, long j6) {
        this.zza = j4;
        this.zzb = j6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzb() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzc() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            this.zzc = str;
        }
    }
}
