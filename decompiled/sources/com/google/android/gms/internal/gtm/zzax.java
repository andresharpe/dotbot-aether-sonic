package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.s;
import com.google.android.gms.common.internal.D;
import com.google.firebase.remoteconfig.u;
import java.util.HashMap;

@D
@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public final class zzax extends s {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.zza);
        hashMap.put(u.b.f37785c0, this.zzb);
        hashMap.put(u.b.f37780X, this.zzc);
        hashMap.put("appInstallerId", this.zzd);
        return s.zza(hashMap);
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.analytics.s
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zzc(zzax zzaxVar) {
        if (!TextUtils.isEmpty(this.zza)) {
            zzaxVar.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzaxVar.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzaxVar.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzaxVar.zzd = this.zzd;
        }
    }

    public final void zzi(String str) {
        this.zzc = str;
    }

    public final void zzj(String str) {
        this.zzd = str;
    }

    public final void zzk(String str) {
        this.zza = str;
    }

    public final void zzl(String str) {
        this.zzb = str;
    }
}
