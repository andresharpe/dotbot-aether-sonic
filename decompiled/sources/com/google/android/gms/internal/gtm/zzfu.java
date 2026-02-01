package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.p;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.l;
import com.harman.jbl.partybox.ui.effectlab.a;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@D
/* loaded from: classes.dex */
public final class zzfu {
    public static long zza(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static zzay zzb(zzfd zzfdVar, String str) {
        C1285y.l(zzfdVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            Map<String, String> a4 = p.a(new URI("?" + str), "UTF-8");
            zzay zzayVar = new zzay();
            zzayVar.zzp(a4.get("utm_content"));
            zzayVar.zzu(a4.get("utm_medium"));
            zzayVar.zzv(a4.get("utm_campaign"));
            zzayVar.zzw(a4.get("utm_source"));
            zzayVar.zzt(a4.get("utm_term"));
            zzayVar.zzs(a4.get("utm_id"));
            zzayVar.zzo(a4.get("anid"));
            zzayVar.zzr(a4.get("gclid"));
            zzayVar.zzq(a4.get("dclid"));
            zzayVar.zzn(a4.get(FirebaseAnalytics.b.f34770Q));
            return zzayVar;
        } catch (URISyntaxException e4) {
            zzfdVar.zzR("No valid campaign data found", e4);
            return null;
        }
    }

    public static String zzc(boolean z3) {
        return true != z3 ? a.f43472q : "1";
    }

    public static String zzd(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(locale));
        }
        return sb.toString();
    }

    public static MessageDigest zze(String str) {
        MessageDigest messageDigest;
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static Map zzf(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        for (String str3 : str.split("&")) {
            String[] split = str3.split("=", 3);
            int length = split.length;
            String str4 = null;
            if (length > 1) {
                String str5 = split[0];
                if (TextUtils.isEmpty(split[1])) {
                    str2 = null;
                } else {
                    str2 = split[1];
                }
                hashMap.put(str5, str2);
                if (length == 3 && !TextUtils.isEmpty(split[1]) && !hashMap.containsKey(split[1])) {
                    String str6 = split[1];
                    if (!TextUtils.isEmpty(split[2])) {
                        str4 = split[2];
                    }
                    hashMap.put(str6, str4);
                }
            } else if (length == 1 && split[0].length() != 0) {
                hashMap.put(split[0], null);
            }
        }
        return hashMap;
    }

    public static void zzg(Map map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    public static void zzh(Map map, String str, Map map2) {
        zzg(map, str, (String) map2.get(str));
    }

    public static boolean zzi(Context context, String str, boolean z3) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                if (z3) {
                    if (receiverInfo.exported) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean zzj(double d4, String str) {
        int i4;
        if (d4 > l.f37524n && d4 < 100.0d) {
            if (!TextUtils.isEmpty(str)) {
                i4 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    i4 = ((i4 << 6) & 268435455) + charAt + (charAt << 14);
                    int i5 = 266338304 & i4;
                    if (i5 != 0) {
                        i4 ^= i5 >> 21;
                    }
                }
            } else {
                i4 = 1;
            }
            if (i4 % com.clj.fastble.a.f26980l >= d4 * 100.0d) {
                return true;
            }
        }
        return false;
    }
}
