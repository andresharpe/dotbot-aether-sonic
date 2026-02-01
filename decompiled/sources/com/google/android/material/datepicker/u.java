package com.google.android.material.datepicker;

import androidx.annotation.P;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
class u {

    /* renamed from: c, reason: collision with root package name */
    private static final u f32267c = new u(null, null);

    /* renamed from: a, reason: collision with root package name */
    @P
    private final Long f32268a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final TimeZone f32269b;

    private u(@P Long l4, @P TimeZone timeZone) {
        this.f32268a = l4;
        this.f32269b = timeZone;
    }

    static u a(long j4) {
        return new u(Long.valueOf(j4), null);
    }

    static u b(long j4, @P TimeZone timeZone) {
        return new u(Long.valueOf(j4), timeZone);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u e() {
        return f32267c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Calendar c() {
        return d(this.f32269b);
    }

    Calendar d(@P TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l4 = this.f32268a;
        if (l4 != null) {
            calendar.setTimeInMillis(l4.longValue());
        }
        return calendar;
    }
}
