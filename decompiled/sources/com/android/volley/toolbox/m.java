package com.android.volley.toolbox;

import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import com.android.volley.e;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f24615a = "Content-Type";

    /* renamed from: b, reason: collision with root package name */
    private static final String f24616b = "ISO-8859-1";

    /* renamed from: c, reason: collision with root package name */
    private static final String f24617c = "EEE, dd MMM yyyy HH:mm:ss zzz";

    /* renamed from: d, reason: collision with root package name */
    private static final String f24618d = "EEE, dd MMM yyyy HH:mm:ss 'GMT'";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<com.android.volley.i> a(List<com.android.volley.i> list, e.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<com.android.volley.i> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<com.android.volley.i> list2 = aVar.f24463h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.android.volley.i iVar : aVar.f24463h) {
                    if (!treeSet.contains(iVar.a())) {
                        arrayList.add(iVar);
                    }
                }
            }
        } else if (!aVar.f24462g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f24462g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.android.volley.i(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    static String b(long j4) {
        return d(f24618d).format(new Date(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, String> c(e.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = aVar.f24457b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j4 = aVar.f24459d;
        if (j4 > 0) {
            hashMap.put("If-Modified-Since", b(j4));
        }
        return hashMap;
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    @P
    public static e.a e(com.android.volley.l lVar) {
        long j4;
        boolean z3;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = lVar.f24495c;
        if (map == null) {
            return null;
        }
        String str = map.get(com.amazonaws.http.h.f23646e);
        if (str != null) {
            j4 = h(str);
        } else {
            j4 = 0;
        }
        String str2 = map.get("Cache-Control");
        int i4 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z3 = false;
            j5 = 0;
            j6 = 0;
            while (i4 < split.length) {
                String trim = split[i4].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j5 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j6 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z3 = true;
                }
                i4++;
            }
            i4 = 1;
        } else {
            z3 = false;
            j5 = 0;
            j6 = 0;
        }
        String str3 = map.get("Expires");
        if (str3 != null) {
            j7 = h(str3);
        } else {
            j7 = 0;
        }
        String str4 = map.get("Last-Modified");
        if (str4 != null) {
            j8 = h(str4);
        } else {
            j8 = 0;
        }
        String str5 = map.get("ETag");
        if (i4 != 0) {
            j10 = currentTimeMillis + (j5 * 1000);
            if (z3) {
                j11 = j10;
            } else {
                j11 = (j6 * 1000) + j10;
            }
            j9 = j11;
        } else {
            j9 = 0;
            if (j4 > 0 && j7 >= j4) {
                j10 = currentTimeMillis + (j7 - j4);
                j9 = j10;
            } else {
                j10 = 0;
            }
        }
        e.a aVar = new e.a();
        aVar.f24456a = lVar.f24494b;
        aVar.f24457b = str5;
        aVar.f24461f = j10;
        aVar.f24460e = j9;
        aVar.f24458c = j4;
        aVar.f24459d = j8;
        aVar.f24462g = map;
        aVar.f24463h = lVar.f24496d;
        return aVar;
    }

    public static String f(@P Map<String, String> map) {
        return g(map, f24616b);
    }

    public static String g(@P Map<String, String> map, String str) {
        if (map == null) {
            return str;
        }
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";", 0);
            for (int i4 = 1; i4 < split.length; i4++) {
                String[] split2 = split[i4].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    public static long h(String str) {
        try {
            return d(f24617c).parse(str).getTime();
        } catch (ParseException e4) {
            if (!com.harman.jbl.partybox.ui.effectlab.a.f43472q.equals(str) && !"-1".equals(str)) {
                com.android.volley.s.d(e4, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            com.android.volley.s.f("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<com.android.volley.i> i(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new com.android.volley.i(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, String> j(List<com.android.volley.i> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (com.android.volley.i iVar : list) {
            treeMap.put(iVar.a(), iVar.b());
        }
        return treeMap;
    }
}
