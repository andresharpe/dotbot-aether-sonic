package com.amazonaws.logging;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class LogFactory {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23805a = "LogFactory";

    /* renamed from: b, reason: collision with root package name */
    private static final String f23806b = "org.apache.commons.logging.LogFactory";

    /* renamed from: c, reason: collision with root package name */
    private static Level f23807c;

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, c> f23808d = new HashMap();

    /* loaded from: classes.dex */
    public enum Level {
        ALL(Integer.MIN_VALUE),
        TRACE(0),
        DEBUG(1),
        INFO(2),
        WARN(3),
        ERROR(4),
        OFF(Integer.MAX_VALUE);

        private int value;

        Level(int i4) {
            this.value = i4;
        }

        public int b() {
            return this.value;
        }
    }

    private static boolean a() {
        try {
            Class.forName(f23806b);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Exception e4) {
            Log.e(f23805a, e4.getMessage());
            return false;
        }
    }

    public static Level b() {
        return f23807c;
    }

    public static synchronized c c(Class cls) {
        c d4;
        synchronized (LogFactory.class) {
            d4 = d(e(cls.getSimpleName()));
        }
        return d4;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:12:0x0017, B:15:0x001c, B:19:0x002b, B:9:0x0035), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.amazonaws.logging.c d(java.lang.String r6) {
        /*
            java.lang.Class<com.amazonaws.logging.LogFactory> r0 = com.amazonaws.logging.LogFactory.class
            monitor-enter(r0)
            java.lang.String r6 = e(r6)     // Catch: java.lang.Throwable -> L23
            java.util.Map<java.lang.String, com.amazonaws.logging.c> r1 = com.amazonaws.logging.LogFactory.f23808d     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L23
            com.amazonaws.logging.c r1 = (com.amazonaws.logging.c) r1     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L3f
            boolean r2 = a()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L33
            com.amazonaws.logging.b r2 = new com.amazonaws.logging.b     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L27
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L27
            java.util.Map<java.lang.String, com.amazonaws.logging.c> r1 = com.amazonaws.logging.LogFactory.f23808d     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
        L21:
            r1 = r2
            goto L33
        L23:
            r6 = move-exception
            goto L41
        L25:
            r1 = move-exception
            goto L2b
        L27:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L2b:
            java.lang.String r3 = com.amazonaws.logging.LogFactory.f23805a     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "Could not create log from org.apache.commons.logging.LogFactory"
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L23
            goto L21
        L33:
            if (r1 != 0) goto L3f
            com.amazonaws.logging.a r1 = new com.amazonaws.logging.a     // Catch: java.lang.Throwable -> L23
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L23
            java.util.Map<java.lang.String, com.amazonaws.logging.c> r2 = com.amazonaws.logging.LogFactory.f23808d     // Catch: java.lang.Throwable -> L23
            r2.put(r6, r1)     // Catch: java.lang.Throwable -> L23
        L3f:
            monitor-exit(r0)
            return r1
        L41:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.logging.LogFactory.d(java.lang.String):com.amazonaws.logging.c");
    }

    private static String e(String str) {
        if (str.length() > 23) {
            if (a()) {
                new b(f23805a).m("Truncating log tag length as it exceed 23, the limit imposed by Android on certain API Levels");
            } else {
                Log.w(f23805a, "Truncating log tag length as it exceed 23, the limit imposed by Android on certain API Levels");
            }
            return str.substring(0, 23);
        }
        return str;
    }

    public static void f(Level level) {
        f23807c = level;
    }
}
