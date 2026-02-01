package com.google.android.gms.tagmanager;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzby extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.HASH.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ARG0.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.ALGORITHM.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.INPUT_FORMAT.toString();

    public zzby() {
        super(zza, zzb);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String zzn;
        String zzn2;
        byte[] zzb2;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        if (zzamVar != null && zzamVar != zzfu.zzb()) {
            String zzn3 = zzfu.zzn(zzfu.zzl(zzamVar));
            com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
            if (zzamVar2 == null) {
                zzn = "MD5";
            } else {
                zzn = zzfu.zzn(zzfu.zzl(zzamVar2));
            }
            com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zzd);
            if (zzamVar3 == null) {
                zzn2 = "text";
            } else {
                zzn2 = zzfu.zzn(zzfu.zzl(zzamVar3));
            }
            if ("text".equals(zzn2)) {
                zzb2 = zzn3.getBytes();
            } else if ("base16".equals(zzn2)) {
                zzb2 = zzp.zzb(zzn3);
            } else {
                Log.e("GoogleTagManager", "Hash: unknown input format: ".concat(String.valueOf(zzn2)));
                return zzfu.zzb();
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(zzn);
                messageDigest.update(zzb2);
                return zzfu.zzc(zzp.zza(messageDigest.digest()));
            } catch (NoSuchAlgorithmException unused) {
                Log.e("GoogleTagManager", "Hash: unknown algorithm: ".concat(String.valueOf(zzn)));
                return zzfu.zzb();
            }
        }
        return zzfu.zzb();
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
