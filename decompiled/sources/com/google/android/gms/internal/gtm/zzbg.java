package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.s;
import com.google.android.gms.common.internal.D;
import com.google.firebase.messaging.C1821f;
import com.google.firebase.remoteconfig.l;
import java.util.HashMap;

@D
/* loaded from: classes.dex */
public final class zzbg extends s {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private boolean zze;
    private boolean zzf;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.zza);
        hashMap.put("clientId", this.zzb);
        hashMap.put("userId", this.zzc);
        hashMap.put("androidAdId", this.zzd);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.zze));
        hashMap.put("sessionControl", null);
        hashMap.put("nonInteraction", Boolean.valueOf(this.zzf));
        hashMap.put("sampleRate", Double.valueOf(l.f37524n));
        return s.zza(hashMap);
    }

    @Override // com.google.android.gms.analytics.s
    public final /* bridge */ /* synthetic */ void zzc(s sVar) {
        zzbg zzbgVar = (zzbg) sVar;
        if (!TextUtils.isEmpty(this.zza)) {
            zzbgVar.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzbgVar.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzbgVar.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzbgVar.zzd = this.zzd;
        }
        if (this.zze) {
            zzbgVar.zze = true;
        }
        TextUtils.isEmpty(null);
        if (this.zzf) {
            zzbgVar.zzf = true;
        }
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzc;
    }

    public final void zzh(boolean z3) {
        this.zze = z3;
    }

    public final void zzi(String str) {
        this.zzd = str;
    }

    public final void zzj(String str) {
        this.zzb = str;
    }

    public final void zzk(String str) {
        this.zza = C1821f.C0339f.a.f37006R;
    }

    public final void zzl(boolean z3) {
        this.zzf = true;
    }

    public final void zzm(String str) {
        this.zzc = str;
    }

    public final boolean zzn() {
        return this.zze;
    }

    public final boolean zzo() {
        return this.zzf;
    }
}
