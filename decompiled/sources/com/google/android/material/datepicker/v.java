package com.google.android.material.datepicker;

import T0.a;
import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import androidx.annotation.N;
import androidx.annotation.P;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
class v {

    /* renamed from: a, reason: collision with root package name */
    static final String f32270a = "UTC";

    /* renamed from: b, reason: collision with root package name */
    static AtomicReference<u> f32271b = new AtomicReference<>();

    private v() {
    }

    static void A(@P u uVar) {
        f32271b.set(uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(long j4) {
        Calendar v3 = v();
        v3.setTimeInMillis(j4);
        return f(v3).getTimeInMillis();
    }

    private static int b(@N String str, @N String str2, int i4, int i5) {
        while (i5 >= 0 && i5 < str.length() && str2.indexOf(str.charAt(i5)) == -1) {
            if (str.charAt(i5) != '\'') {
                i5 += i4;
            }
            do {
                i5 += i4;
                if (i5 >= 0 && i5 < str.length()) {
                }
                i5 += i4;
            } while (str.charAt(i5) != '\'');
            i5 += i4;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    public static DateFormat c(Locale locale) {
        return e("MMMd", locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    public static DateFormat d(Locale locale) {
        return e("MMMEd", locale);
    }

    @TargetApi(24)
    private static DateFormat e(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(u());
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar f(Calendar calendar) {
        Calendar w3 = w(calendar);
        Calendar v3 = v();
        v3.set(w3.get(1), w3.get(2), w3.get(5));
        return v3;
    }

    private static java.text.DateFormat g(int i4, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i4, locale);
        dateInstance.setTimeZone(s());
        return dateInstance;
    }

    static java.text.DateFormat h() {
        return i(Locale.getDefault());
    }

    static java.text.DateFormat i(Locale locale) {
        return g(0, locale);
    }

    static java.text.DateFormat j() {
        return k(Locale.getDefault());
    }

    static java.text.DateFormat k(Locale locale) {
        return g(2, locale);
    }

    static java.text.DateFormat l() {
        return m(Locale.getDefault());
    }

    static java.text.DateFormat m(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) k(locale);
        simpleDateFormat.applyPattern(z(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    static SimpleDateFormat n(String str) {
        return o(str, Locale.getDefault());
    }

    private static SimpleDateFormat o(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(s());
        return simpleDateFormat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SimpleDateFormat p() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(s());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String q(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(a.m.f3103e1);
        String string2 = resources.getString(a.m.f3100d1);
        String string3 = resources.getString(a.m.f3097c1);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    static u r() {
        u uVar = f32271b.get();
        if (uVar == null) {
            return u.e();
        }
        return uVar;
    }

    private static TimeZone s() {
        return TimeZone.getTimeZone(f32270a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar t() {
        Calendar c4 = r().c();
        c4.set(11, 0);
        c4.set(12, 0);
        c4.set(13, 0);
        c4.set(14, 0);
        c4.setTimeZone(s());
        return c4;
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone u() {
        return android.icu.util.TimeZone.getTimeZone(f32270a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar v() {
        return w(null);
    }

    static Calendar w(@P Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(s());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    public static DateFormat x(Locale locale) {
        return e("yMMMd", locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    public static DateFormat y(Locale locale) {
        return e("yMMMEd", locale);
    }

    @N
    private static String z(@N String str) {
        int b4 = b(str, "yY", 1, 0);
        if (b4 >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int b5 = b(str, "EMd", 1, b4);
        if (b5 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(b(str, str2, -1, b4) + 1, b5), " ").trim();
    }
}
