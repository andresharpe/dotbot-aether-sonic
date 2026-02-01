package com.google.android.gms.tagmanager;

import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzat {
    public final String zza;

    @P
    public final Object zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzat(String str, @P Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof zzat)) {
            return false;
        }
        zzat zzatVar = (zzat) obj;
        if (!this.zza.equals(zzatVar.zza)) {
            return false;
        }
        Object obj2 = this.zzb;
        if (obj2 == null && zzatVar.zzb == null) {
            return true;
        }
        if (obj2 == null || !obj2.equals(zzatVar.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C1285y.l(this.zzb);
        return Arrays.hashCode(new Integer[]{Integer.valueOf(this.zza.hashCode()), Integer.valueOf(this.zzb.hashCode())});
    }

    public final String toString() {
        return "Key: " + this.zza + " value: " + String.valueOf(this.zzb);
    }
}
