package com.google.android.gms.tagmanager;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbc {
    final String zza;
    final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbc(String str, byte[] bArr) {
        this.zza = str;
        this.zzb = bArr;
    }

    public final String toString() {
        return "KeyAndSerialized: key = " + this.zza + " serialized hash = " + Arrays.hashCode(this.zzb);
    }
}
