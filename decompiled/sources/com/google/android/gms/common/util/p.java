package com.google.android.gms.common.util;

import androidx.annotation.N;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@I0.a
/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f29021a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f29022b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f29023c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private p() {
    }

    @I0.a
    @N
    public static Map<String, String> a(@N URI uri, @N String str) {
        String str2;
        Map<String, String> emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap<>();
            com.google.android.gms.internal.common.G c4 = com.google.android.gms.internal.common.G.c(com.google.android.gms.internal.common.x.b('='));
            Iterator it = com.google.android.gms.internal.common.G.c(com.google.android.gms.internal.common.x.b(kotlin.text.F.f52748d)).b().d(rawQuery).iterator();
            while (it.hasNext()) {
                List f4 = c4.f((String) it.next());
                if (!f4.isEmpty() && f4.size() <= 2) {
                    String b4 = b((String) f4.get(0), str);
                    if (f4.size() == 2) {
                        str2 = b((String) f4.get(1), str);
                    } else {
                        str2 = null;
                    }
                    emptyMap.put(b4, str2);
                } else {
                    throw new IllegalArgumentException("bad parameter");
                }
            }
        }
        return emptyMap;
    }

    private static String b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
