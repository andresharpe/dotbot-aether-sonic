package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class C5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void a(byte b4, byte b5, byte b6, byte b7, char[] cArr, int i4) {
        if (!e(b5) && (((b4 << 28) + (b5 + com.harman.sdk.utils.k.f48602N0)) >> 30) == 0 && !e(b6) && !e(b7)) {
            int i5 = ((b4 & 7) << 18) | ((b5 & 63) << 12) | ((b6 & 63) << 6) | (b7 & 63);
            cArr[i4] = (char) ((i5 >>> 10) + 55232);
            cArr[i4 + 1] = (char) ((i5 & 1023) + 56320);
            return;
        }
        throw zzko.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void b(byte b4, byte b5, byte b6, char[] cArr, int i4) {
        if (!e(b5)) {
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
            if (!e(b6)) {
                cArr[i4] = (char) (((b4 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                return;
            }
        }
        throw zzko.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(byte b4, byte b5, char[] cArr, int i4) {
        if (b4 >= -62 && !e(b5)) {
            cArr[i4] = (char) (((b4 & com.harman.sdk.utils.k.f48669h0) << 6) | (b5 & 63));
            return;
        }
        throw zzko.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean d(byte b4) {
        return b4 >= 0;
    }

    private static boolean e(byte b4) {
        return b4 > -65;
    }
}
