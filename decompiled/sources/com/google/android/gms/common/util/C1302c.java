package com.google.android.gms.common.util;

import android.util.Base64;
import androidx.annotation.N;

@I0.a
/* renamed from: com.google.android.gms.common.util.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1302c {
    @I0.a
    @N
    public static byte[] a(@N String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @I0.a
    @N
    public static byte[] b(@N String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @I0.a
    @N
    public static byte[] c(@N String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @I0.a
    @N
    public static String d(@N byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @I0.a
    @N
    public static String e(@N byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @I0.a
    @N
    public static String f(@N byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
