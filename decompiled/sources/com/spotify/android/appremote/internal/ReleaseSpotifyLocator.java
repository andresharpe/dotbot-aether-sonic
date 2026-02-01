package com.spotify.android.appremote.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.TreeMap;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public class ReleaseSpotifyLocator implements g {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f48793a;

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f48794b;

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f48795c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, String[]> f48796d;

    static {
        String[] strArr = {"64:4D:12:F2:2F:E5:AD:82:A2:BF:0B:EC:66:E9:9E:69:9E:B0:A4:16:08:91:95:07:C7:84:F6:48:00:9B:92:90", "65:05:B1:81:93:33:44:F9:38:93:D5:86:E3:99:B9:46:16:18:3F:04:34:9C:B5:72:A9:E8:1A:33:35:E2:8F:FD", "3F:6A:81:13:08:6F:25:77:9B:73:16:CA:EC:8B:09:C8:9A:7E:FA:56:44:6E:C1:B8:87:7D:3C:1C:C9:8F:F5:18"};
        f48793a = strArr;
        String[] strArr2 = {"72:97:CB:C5:20:08:25:B6:F0:EB:54:64:5E:EB:07:24:8C:E7:39:89:6C:D7:19:36:8B:4C:B4:3E:99:34:29:AD"};
        f48794b = strArr2;
        String[] strArr3 = {"F6:D3:ED:98:DF:54:AF:E0:3F:57:E1:D0:13:7A:4C:8F:D1:40:C9:63:4D:1B:A0:C6:42:61:0B:A6:AF:C9:CF:9D", "76:69:D9:83:5F:4D:E4:CB:96:E2:10:68:F0:9F:49:ED:74:C4:CB:1C:81:A3:20:FE:98:44:20:21:7C:5C:0B:DE"};
        f48795c = strArr3;
        TreeMap treeMap = new TreeMap();
        f48796d = treeMap;
        treeMap.put("com.spotify.music", strArr);
        treeMap.put("com.spotify.music.canary", strArr3);
        treeMap.put("com.spotify.music.partners", strArr2);
    }

    @Nullable
    @SuppressLint({"PackageManagerGetSignatures"})
    private static Signature b(@Nonnull Context context, @Nonnull String packageName) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length == 1) {
                return signatureArr[0];
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @Nonnull
    private static String c(@Nullable Signature signature) {
        if (signature == null) {
            return "";
        }
        try {
            byte[] byteArray = signature.toByteArray();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(byteArray);
            return String.format("%064X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static boolean d(@Nonnull Context context, @Nonnull String packageName) {
        String c4 = c(b(context, packageName));
        for (String str : (String[]) r.a(f48796d.get(packageName))) {
            if (str.replaceAll(":", "").equals(c4)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.android.appremote.internal.g
    @Nullable
    public String a(@Nonnull Context context) {
        for (String str : f48796d.keySet()) {
            if (context.getPackageManager().getLaunchIntentForPackage(str) != null && d(context, str)) {
                return str;
            }
        }
        return null;
    }
}
