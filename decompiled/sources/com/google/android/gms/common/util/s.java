package com.google.android.gms.common.util;

import androidx.annotation.N;
import java.util.HashMap;

@I0.a
/* loaded from: classes.dex */
public class s {
    @I0.a
    public static void a(@N StringBuilder sb, @N HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z3 = true;
        for (String str : hashMap.keySet()) {
            if (!z3) {
                sb.append(",");
            }
            String str2 = hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z3 = false;
        }
        sb.append("}");
    }
}
