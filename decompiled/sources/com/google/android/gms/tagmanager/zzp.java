package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.D;
import com.harman.jbl.partybox.ui.effectlab.a;

@D
/* loaded from: classes2.dex */
public final class zzp {
    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b4 : bArr) {
            if ((b4 & 240) == 0) {
                sb.append(a.f43472q);
            }
            sb.append(Integer.toHexString(b4 & 255));
        }
        return sb.toString().toUpperCase();
    }

    public static byte[] zzb(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            for (int i4 = 0; i4 < length; i4 += 2) {
                int digit = Character.digit(str.charAt(i4), 16);
                int digit2 = Character.digit(str.charAt(i4 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i4 / 2] = (byte) ((digit << 4) + digit2);
                } else {
                    throw new IllegalArgumentException("purported base16 string has illegal char");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("purported base16 string has odd number of characters");
    }
}
