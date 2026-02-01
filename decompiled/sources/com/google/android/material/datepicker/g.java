package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import androidx.annotation.P;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
class g {
    private g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.core.util.q<String, String> a(@P Long l4, @P Long l5) {
        return b(l4, l5, null);
    }

    static androidx.core.util.q<String, String> b(@P Long l4, @P Long l5, @P SimpleDateFormat simpleDateFormat) {
        if (l4 == null && l5 == null) {
            return androidx.core.util.q.a(null, null);
        }
        if (l4 == null) {
            return androidx.core.util.q.a(null, d(l5.longValue(), simpleDateFormat));
        }
        if (l5 == null) {
            return androidx.core.util.q.a(d(l4.longValue(), simpleDateFormat), null);
        }
        Calendar t3 = v.t();
        Calendar v3 = v.v();
        v3.setTimeInMillis(l4.longValue());
        Calendar v4 = v.v();
        v4.setTimeInMillis(l5.longValue());
        if (simpleDateFormat != null) {
            return androidx.core.util.q.a(simpleDateFormat.format(new Date(l4.longValue())), simpleDateFormat.format(new Date(l5.longValue())));
        }
        if (v3.get(1) == v4.get(1)) {
            if (v3.get(1) == t3.get(1)) {
                return androidx.core.util.q.a(f(l4.longValue(), Locale.getDefault()), f(l5.longValue(), Locale.getDefault()));
            }
            return androidx.core.util.q.a(f(l4.longValue(), Locale.getDefault()), k(l5.longValue(), Locale.getDefault()));
        }
        return androidx.core.util.q.a(k(l4.longValue(), Locale.getDefault()), k(l5.longValue(), Locale.getDefault()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(long j4) {
        return d(j4, null);
    }

    static String d(long j4, @P SimpleDateFormat simpleDateFormat) {
        Calendar t3 = v.t();
        Calendar v3 = v.v();
        v3.setTimeInMillis(j4);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j4));
        }
        if (t3.get(1) == v3.get(1)) {
            return e(j4);
        }
        return j(j4);
    }

    static String e(long j4) {
        return f(j4, Locale.getDefault());
    }

    static String f(long j4, Locale locale) {
        return v.c(locale).format(new Date(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(long j4) {
        return h(j4, Locale.getDefault());
    }

    static String h(long j4, Locale locale) {
        return v.d(locale).format(new Date(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(long j4) {
        return DateUtils.formatDateTime(null, j4, 8228);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String j(long j4) {
        return k(j4, Locale.getDefault());
    }

    static String k(long j4, Locale locale) {
        return v.x(locale).format(new Date(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String l(long j4) {
        return m(j4, Locale.getDefault());
    }

    static String m(long j4, Locale locale) {
        return v.y(locale).format(new Date(j4));
    }
}
