package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.N;
import androidx.annotation.P;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@com.google.android.gms.common.internal.D
@I0.a
/* renamed from: com.google.android.gms.common.util.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1300a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f28987a = -1;

    @P
    @I0.a
    @Deprecated
    public static byte[] a(@N Context context, @N String str) throws PackageManager.NameNotFoundException {
        MessageDigest b4;
        PackageInfo f4 = com.google.android.gms.common.wrappers.e.a(context).f(str, 64);
        Signature[] signatureArr = f4.signatures;
        if (signatureArr != null && signatureArr.length == 1 && (b4 = b("SHA1")) != null) {
            return b4.digest(f4.signatures[0].toByteArray());
        }
        return null;
    }

    @P
    public static MessageDigest b(@N String str) {
        MessageDigest messageDigest;
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
