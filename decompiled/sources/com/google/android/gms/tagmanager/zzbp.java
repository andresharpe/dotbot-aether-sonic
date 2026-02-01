package com.google.android.gms.tagmanager;

import android.util.Base64;
import android.util.Log;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbp extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.ENCODE.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ARG0.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.NO_PADDING.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.INPUT_FORMAT.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.OUTPUT_FORMAT.toString();

    public zzbp() {
        super(zza, zzb);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String zzn;
        String zzn2;
        byte[] decode;
        String encodeToString;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        if (zzamVar != null && zzamVar != zzfu.zzb()) {
            String zzn3 = zzfu.zzn(zzfu.zzl(zzamVar));
            com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzd);
            if (zzamVar2 == null) {
                zzn = "text";
            } else {
                zzn = zzfu.zzn(zzfu.zzl(zzamVar2));
            }
            com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zze);
            if (zzamVar3 == null) {
                zzn2 = "base16";
            } else {
                zzn2 = zzfu.zzn(zzfu.zzl(zzamVar3));
            }
            com.google.android.gms.internal.gtm.zzam zzamVar4 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
            int i4 = 2;
            if (zzamVar4 != null && zzfu.zzg(zzfu.zzl(zzamVar4)).booleanValue()) {
                i4 = 3;
            }
            try {
                if ("text".equals(zzn)) {
                    decode = zzn3.getBytes();
                } else if ("base16".equals(zzn)) {
                    decode = zzp.zzb(zzn3);
                } else if ("base64".equals(zzn)) {
                    decode = Base64.decode(zzn3, i4);
                } else if ("base64url".equals(zzn)) {
                    decode = Base64.decode(zzn3, i4 | 8);
                } else {
                    Log.e("GoogleTagManager", "Encode: unknown input format: " + zzn);
                    return zzfu.zzb();
                }
                if ("base16".equals(zzn2)) {
                    encodeToString = zzp.zza(decode);
                } else if ("base64".equals(zzn2)) {
                    encodeToString = Base64.encodeToString(decode, i4);
                } else if ("base64url".equals(zzn2)) {
                    encodeToString = Base64.encodeToString(decode, i4 | 8);
                } else {
                    Log.e("GoogleTagManager", "Encode: unknown output format: ".concat(String.valueOf(zzn2)));
                    return zzfu.zzb();
                }
                return zzfu.zzc(encodeToString);
            } catch (IllegalArgumentException unused) {
                Log.e("GoogleTagManager", "Encode: invalid input:");
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
