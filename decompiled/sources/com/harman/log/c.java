package com.harman.log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final long f47578a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private static final long f47579b = 60000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f47580c = 3600000;

    /* renamed from: d, reason: collision with root package name */
    public static final long f47581d = 86400000;

    /* renamed from: e, reason: collision with root package name */
    private static SimpleDateFormat f47582e = new SimpleDateFormat();

    public static String a(long j4) {
        return c(j4, "yyyy-MM-dd HH:mm:ss");
    }

    public static String b(long j4, float f4) {
        TimeZone simpleTimeZone;
        if (f4 > 13.0f || f4 < -12.0f) {
            f4 = 0.0f;
        }
        int i4 = (int) (f4 * 60.0f * 60.0f * 1000.0f);
        String[] availableIDs = TimeZone.getAvailableIDs(i4);
        if (availableIDs.length == 0) {
            simpleTimeZone = TimeZone.getDefault();
        } else {
            simpleTimeZone = new SimpleTimeZone(i4, availableIDs[0]);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(simpleTimeZone);
        return simpleDateFormat.format(new Date(j4));
    }

    private static String c(long j4, String str) {
        f47582e.applyPattern(str);
        return f47582e.format(new Date(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(long j4) {
        return c(j4, "yyyy-MM-dd HH:mm:ss.SSS");
    }

    public static String e(long j4) {
        f47582e.applyPattern("yyyy-MM-dd HH:mm:ss");
        return f47582e.format(new Date(j4));
    }

    public static String f(long j4) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j4);
        return (calendar.get(2) + 1) + "月" + calendar.get(5) + "日" + calendar.get(11) + "时";
    }

    public static String g(long j4) {
        f47582e.applyPattern("MM月dd日HH时");
        return f47582e.format(new Date(j4));
    }

    public static String h(Date date) {
        f47582e.applyPattern("HH:mm");
        return f47582e.format(date);
    }

    public static String i(long j4) {
        f47582e.applyPattern("MM-dd");
        return f47582e.format(new Date(j4));
    }

    public static String j(long j4) {
        f47582e.applyPattern("MM月dd日");
        return f47582e.format(new Date(j4));
    }

    public static String k(long j4) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j4);
        return (calendar.get(2) + 1) + "月" + calendar.get(5) + "日";
    }

    public static String l(long j4) {
        f47582e.applyPattern("yyyy.MM.dd");
        return f47582e.format(new Date(j4));
    }

    public static String m(Date date) {
        f47582e.applyPattern("yyyy年MM月dd日");
        return f47582e.format(date);
    }

    public static String n(long j4) {
        f47582e.applyPattern("yyyy-MM-dd_HH-mm-ss");
        return f47582e.format(new Date(j4));
    }

    public static String o(long j4) {
        f47582e.applyPattern("yyyy-MM-dd");
        return f47582e.format(new Date(j4));
    }

    public static boolean p(Date date) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        calendar2.setTime(new Date());
        if (calendar.get(5) == calendar2.get(5) && calendar.get(5) == calendar2.get(5) && calendar.get(6) == calendar2.get(6)) {
            return true;
        }
        return false;
    }

    public static boolean q(Date date) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        calendar2.setTime(new Date());
        if (calendar.get(6) == calendar2.get(6)) {
            return true;
        }
        return false;
    }
}
