package com.harman.jbl.cd_biz_comm.utils;

import android.text.TextUtils;
import java.io.PrintStream;

/* loaded from: classes2.dex */
public class o {
    public static boolean a(int[] iArr, int[] iArr2) {
        if (iArr != null && iArr2 != null) {
            for (int i4 = 0; i4 < 3; i4++) {
                if (iArr2[i4] > iArr[i4]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] b(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        int[] iArr = new int[3];
        for (int i4 = 0; i4 < 3; i4++) {
            iArr[i4] = Integer.parseInt(split[i4]);
        }
        return iArr;
    }

    public static byte[] c(String str) {
        byte[] bArr = new byte[3];
        if (TextUtils.isEmpty(str)) {
            return bArr;
        }
        String[] split = str.split("\\.");
        if (split != null && split.length >= 3) {
            for (int i4 = 0; i4 < 3; i4++) {
                bArr[i4] = e(split[i4]);
            }
        }
        return bArr;
    }

    public static void d(String[] strArr) {
        byte[] c4 = c("0.2.8.1");
        PrintStream printStream = System.out;
        printStream.println(String.format("--0---> %x", Byte.valueOf(c4[0])));
        printStream.println(String.format("--1---> %x", Byte.valueOf(c4[1])));
        printStream.println(String.format("--2---> %x", Byte.valueOf(c4[2])));
        int[] b4 = b("0.2.8.1");
        printStream.println(String.format("--0---> %x", Integer.valueOf(b4[0])));
        printStream.println(String.format("--1---> %x", Integer.valueOf(b4[1])));
        printStream.println(String.format("--2---> %x", Integer.valueOf(b4[2])));
        printStream.println(String.format("compare---> %s", Boolean.valueOf(a(new int[]{0, 2, 8}, new int[]{0, 2, 9}))));
    }

    private static byte e(String str) {
        try {
            return (byte) Integer.parseInt(str);
        } catch (NumberFormatException e4) {
            e4.printStackTrace();
            return (byte) 0;
        }
    }
}
