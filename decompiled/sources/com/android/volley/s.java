package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static String f24524a = "Volley";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f24525b = Log.isLoggable("Volley", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final String f24526c = s.class.getName();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final boolean f24527c = s.f24525b;

        /* renamed from: d, reason: collision with root package name */
        private static final long f24528d = 0;

        /* renamed from: a, reason: collision with root package name */
        private final List<C0213a> f24529a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f24530b = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.android.volley.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0213a {

            /* renamed from: a, reason: collision with root package name */
            public final String f24531a;

            /* renamed from: b, reason: collision with root package name */
            public final long f24532b;

            /* renamed from: c, reason: collision with root package name */
            public final long f24533c;

            public C0213a(String str, long j4, long j5) {
                this.f24531a = str;
                this.f24532b = j4;
                this.f24533c = j5;
            }
        }

        private long c() {
            if (this.f24529a.size() == 0) {
                return 0L;
            }
            return this.f24529a.get(r2.size() - 1).f24533c - this.f24529a.get(0).f24533c;
        }

        public synchronized void a(String str, long j4) {
            if (!this.f24530b) {
                this.f24529a.add(new C0213a(str, j4, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public synchronized void b(String str) {
            this.f24530b = true;
            long c4 = c();
            if (c4 <= 0) {
                return;
            }
            long j4 = this.f24529a.get(0).f24533c;
            s.b("(%-4d ms) %s", Long.valueOf(c4), str);
            for (C0213a c0213a : this.f24529a) {
                long j5 = c0213a.f24533c;
                s.b("(+%-4d) [%2d] %s", Long.valueOf(j5 - j4), Long.valueOf(c0213a.f24532b), c0213a.f24531a);
                j4 = j5;
            }
        }

        protected void finalize() throws Throwable {
            if (!this.f24530b) {
                b("Request on the loose");
                s.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i4 = 2;
        while (true) {
            if (i4 < stackTrace.length) {
                if (!stackTrace[i4].getClassName().equals(f24526c)) {
                    String className = stackTrace[i4].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i4].getMethodName();
                    break;
                }
                i4++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f24524a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f24524a, a(str, objArr));
    }

    public static void d(Throwable th, String str, Object... objArr) {
        Log.e(f24524a, a(str, objArr), th);
    }

    public static void e(String str) {
        b("Changing log tag to %s", str);
        f24524a = str;
        f24525b = Log.isLoggable(str, 2);
    }

    public static void f(String str, Object... objArr) {
        if (f24525b) {
            Log.v(f24524a, a(str, objArr));
        }
    }

    public static void g(String str, Object... objArr) {
        Log.wtf(f24524a, a(str, objArr));
    }

    public static void h(Throwable th, String str, Object... objArr) {
        Log.wtf(f24524a, a(str, objArr), th);
    }
}
