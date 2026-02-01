package com.google.android.gms.internal.gtm;

import com.harman.sdk.utils.k;

/* loaded from: classes.dex */
final class zzbik {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zza(byte b4, byte b5, byte b6, byte b7, char[] cArr, int i4) {
        if (!zze(b5) && (((b4 << 28) + (b5 + k.f48602N0)) >> 30) == 0 && !zze(b6) && !zze(b7)) {
            int i5 = ((b4 & 7) << 18) | ((b5 & 63) << 12) | ((b6 & 63) << 6) | (b7 & 63);
            cArr[i4] = (char) ((i5 >>> 10) + 55232);
            cArr[i4 + 1] = (char) ((i5 & 1023) + 56320);
            return;
        }
        throw zzbfs.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(byte b4, byte b5, byte b6, char[] cArr, int i4) {
        if (!zze(b5)) {
            if (b4 == -32) {
                if (b5 >= -96) {
                    b4 = -32;
                }
            }
            if (b4 == -19) {
                if (b5 < -96) {
                    b4 = -19;
                }
            }
            if (!zze(b6)) {
                cArr[i4] = (char) (((b4 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                return;
            }
        }
        throw zzbfs.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(byte b4, byte b5, char[] cArr, int i4) {
        if (b4 >= -62 && !zze(b5)) {
            cArr[i4] = (char) (((b4 & k.f48669h0) << 6) | (b5 & 63));
            return;
        }
        throw zzbfs.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzd(byte b4) {
        return b4 >= 0;
    }

    private static boolean zze(byte b4) {
        return b4 > -65;
    }
}
