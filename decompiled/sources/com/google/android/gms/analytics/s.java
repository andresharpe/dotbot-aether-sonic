package com.google.android.gms.analytics;

import android.text.TextUtils;
import androidx.annotation.P;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public abstract class s {
    private static String a(@P Object obj, int i4) {
        if (i4 > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            if (TextUtils.isEmpty((String) obj)) {
                return "";
            }
            return obj.toString();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return "";
            }
            return obj.toString();
        }
        if (obj instanceof Long) {
            if (((Long) obj).longValue() == 0) {
                return "";
            }
            return obj.toString();
        }
        if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == com.google.firebase.remoteconfig.l.f37524n) {
                return "";
            }
            return obj.toString();
        }
        if (obj instanceof Boolean) {
            if (!((Boolean) obj).booleanValue()) {
                return "";
            }
            return obj.toString();
        }
        if (obj instanceof List) {
            StringBuilder sb = new StringBuilder();
            if (i4 > 0) {
                sb.append("[");
            }
            int length = sb.length();
            for (Object obj2 : (List) obj) {
                if (sb.length() > length) {
                    sb.append(", ");
                }
                sb.append(a(obj2, i4 + 1));
            }
            if (i4 > 0) {
                sb.append("]");
            }
            return sb.toString();
        }
        if (obj instanceof Map) {
            StringBuilder sb2 = new StringBuilder();
            boolean z3 = false;
            int i5 = 0;
            for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                String a4 = a(entry.getValue(), i4 + 1);
                if (!TextUtils.isEmpty(a4)) {
                    if (i4 > 0 && !z3) {
                        sb2.append("{");
                        i5 = sb2.length();
                        z3 = true;
                    }
                    if (sb2.length() > i5) {
                        sb2.append(", ");
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append('=');
                    sb2.append(a4);
                }
            }
            if (z3) {
                sb2.append("}");
            }
            return sb2.toString();
        }
        return obj.toString();
    }

    public static String zza(@P Object obj) {
        return a(obj, 0);
    }

    public static String zzb(@P Map map) {
        return a(map, 1);
    }

    public abstract void zzc(s sVar);
}
