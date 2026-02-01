package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.annotation.InterfaceC0577u;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.content.pm.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0684c {

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(28)
    /* renamed from: androidx.core.content.pm.c$a */
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @androidx.annotation.P
        @InterfaceC0577u
        static Signature[] a(@androidx.annotation.N SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @InterfaceC0577u
        static long b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        @androidx.annotation.P
        @InterfaceC0577u
        static Signature[] c(@androidx.annotation.N SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        @InterfaceC0577u
        static boolean d(@androidx.annotation.N SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        @InterfaceC0577u
        static boolean e(@androidx.annotation.N PackageManager packageManager, @androidx.annotation.N String str, @androidx.annotation.N byte[] bArr, int i4) {
            return packageManager.hasSigningCertificate(str, bArr, i4);
        }
    }

    private C0684c() {
    }

    private static boolean a(@androidx.annotation.N byte[][] bArr, @androidx.annotation.N byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    private static byte[] b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e4);
        }
    }

    public static long c(@androidx.annotation.N PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(packageInfo);
        }
        return packageInfo.versionCode;
    }

    @androidx.annotation.N
    public static List<Signature> d(@androidx.annotation.N PackageManager packageManager, @androidx.annotation.N String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            if (a.d(signingInfo)) {
                signatureArr = a.a(signingInfo);
            } else {
                signatureArr = a.c(signingInfo);
            }
        } else {
            signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        }
        if (signatureArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(signatureArr);
    }

    public static boolean e(@androidx.annotation.N PackageManager packageManager, @androidx.annotation.N String str, @androidx.annotation.N @androidx.annotation.a0(min = 1) Map<byte[], Integer> map, boolean z3) throws PackageManager.NameNotFoundException {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> keySet = map.keySet();
        for (byte[] bArr2 : keySet) {
            if (bArr2 != null) {
                Integer num = map.get(bArr2);
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue != 0 && intValue != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
                    }
                } else {
                    throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
                }
            } else {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
        }
        List<Signature> d4 = d(packageManager, str);
        if (!z3 && Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr3 : keySet) {
                if (!a.e(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (d4.size() != 0 && map.size() <= d4.size() && (!z3 || map.size() == d4.size())) {
            if (map.containsValue(1)) {
                bArr = new byte[d4.size()];
                for (int i4 = 0; i4 < d4.size(); i4++) {
                    bArr[i4] = b(d4.get(i4).toByteArray());
                }
            } else {
                bArr = null;
            }
            Iterator<byte[]> it = keySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                Integer num2 = map.get(next);
                int intValue2 = num2.intValue();
                if (intValue2 != 0) {
                    if (intValue2 == 1) {
                        if (!a(bArr, next)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException("Unsupported certificate type " + num2);
                    }
                } else if (!d4.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
