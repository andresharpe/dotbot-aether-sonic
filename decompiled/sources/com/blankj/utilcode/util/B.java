package com.blankj.utilcode.util;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    private static final int f24695a = 64;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, Long> f24696b = new ConcurrentHashMap(64);

    /* renamed from: c, reason: collision with root package name */
    private static final long f24697c = 1000;

    private B() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static void a(long j4) {
        Map<String, Long> map = f24696b;
        if (map.size() < 64) {
            return;
        }
        Iterator<Map.Entry<String, Long>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (j4 >= it.next().getValue().longValue()) {
                it.remove();
            }
        }
    }

    public static boolean b(@androidx.annotation.N View view) {
        return c(view, 1000L);
    }

    public static boolean c(@androidx.annotation.N View view, long j4) {
        return d(String.valueOf(view.hashCode()), j4);
    }

    public static boolean d(@androidx.annotation.N String str, long j4) {
        if (!TextUtils.isEmpty(str)) {
            if (j4 >= 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a(elapsedRealtime);
                Map<String, Long> map = f24696b;
                Long l4 = map.get(str);
                if (l4 != null && elapsedRealtime < l4.longValue()) {
                    return false;
                }
                map.put(str, Long.valueOf(elapsedRealtime + j4));
                return true;
            }
            throw new IllegalArgumentException("The duration is less than 0.");
        }
        throw new IllegalArgumentException("The key is null.");
    }
}
