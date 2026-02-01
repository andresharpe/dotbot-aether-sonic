package com.amazonaws.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f24329a = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /* renamed from: b, reason: collision with root package name */
    public static final String f24330b = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    /* renamed from: c, reason: collision with root package name */
    public static final String f24331c = "EEE, dd MMM yyyy HH:mm:ss z";

    /* renamed from: d, reason: collision with root package name */
    public static final String f24332d = "yyyyMMdd'T'HHmmss'Z'";

    /* renamed from: e, reason: collision with root package name */
    private static final TimeZone f24333e = TimeZone.getTimeZone("GMT");

    /* renamed from: f, reason: collision with root package name */
    private static final Map<String, ThreadLocal<SimpleDateFormat>> f24334f = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends ThreadLocal<SimpleDateFormat> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24335a;

        a(String str) {
            this.f24335a = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f24335a, Locale.US);
            simpleDateFormat.setTimeZone(k.f24333e);
            simpleDateFormat.setLenient(false);
            return simpleDateFormat;
        }
    }

    public static Date b(Date date) {
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }

    public static String c(String str, Date date) {
        return f(str).get().format(date);
    }

    public static String d(Date date) {
        return c(f24329a, date);
    }

    public static String e(Date date) {
        return c(f24331c, date);
    }

    private static ThreadLocal<SimpleDateFormat> f(String str) {
        Map<String, ThreadLocal<SimpleDateFormat>> map = f24334f;
        ThreadLocal<SimpleDateFormat> threadLocal = map.get(str);
        if (threadLocal == null) {
            synchronized (map) {
                try {
                    threadLocal = map.get(str);
                    if (threadLocal == null) {
                        threadLocal = new a(str);
                        map.put(str, threadLocal);
                    }
                } finally {
                }
            }
        }
        return threadLocal;
    }

    public static long g(long j4) {
        return TimeUnit.MILLISECONDS.toDays(j4);
    }

    public static Date h(String str, String str2) {
        try {
            return f(str).get().parse(str2);
        } catch (ParseException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static Date i(String str) {
        return h(f24332d, str);
    }

    public static Date j(String str) {
        try {
            return h(f24329a, str);
        } catch (IllegalArgumentException unused) {
            return h(f24330b, str);
        }
    }

    public static Date k(String str) {
        return h(f24331c, str);
    }
}
