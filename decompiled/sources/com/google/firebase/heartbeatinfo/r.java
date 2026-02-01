package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class r {

    /* renamed from: b, reason: collision with root package name */
    private static r f35972b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final String f35973c = "fire-global";

    /* renamed from: d, reason: collision with root package name */
    private static final String f35974d = "FirebaseAppHeartBeat";

    /* renamed from: e, reason: collision with root package name */
    private static final String f35975e = "FirebaseHeartBeat";

    /* renamed from: f, reason: collision with root package name */
    private static final String f35976f = "fire-count";

    /* renamed from: g, reason: collision with root package name */
    private static final String f35977g = "last-used-date";

    /* renamed from: h, reason: collision with root package name */
    private static final int f35978h = 30;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f35979a;

    public r(Context context, String str) {
        this.f35979a = context.getSharedPreferences(f35975e + str, 0);
    }

    private synchronized void a() {
        try {
            long j4 = this.f35979a.getLong(f35976f, 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f35979a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f35979a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f35979a.edit().putStringSet(str, hashSet).putLong(f35976f, j4 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized String d(long j4) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j4).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j4));
    }

    private synchronized String g(String str) {
        for (Map.Entry<String, ?> entry : this.f35979a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void j(String str) {
        try {
            String g4 = g(str);
            if (g4 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f35979a.getStringSet(g4, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f35979a.edit().remove(g4).commit();
            } else {
                this.f35979a.edit().putStringSet(g4, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f35979a.edit();
            for (Map.Entry<String, ?> entry : this.f35979a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    edit.remove(entry.getKey());
                }
            }
            edit.remove(f35976f);
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List<s> c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f35979a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    arrayList.add(s.a(entry.getKey(), new ArrayList((Set) entry.getValue())));
                }
            }
            n(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @i0
    @RestrictTo({RestrictTo.Scope.TESTS})
    int e() {
        return (int) this.f35979a.getLong(f35976f, 0L);
    }

    synchronized long f() {
        return this.f35979a.getLong(f35973c, -1L);
    }

    synchronized boolean h(long j4, long j5) {
        return d(j4).equals(d(j5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void i() {
        String d4 = d(System.currentTimeMillis());
        this.f35979a.edit().putString(f35977g, d4).commit();
        j(d4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean k(long j4) {
        return l(f35973c, j4);
    }

    synchronized boolean l(String str, long j4) {
        if (this.f35979a.contains(str)) {
            if (!h(this.f35979a.getLong(str, -1L), j4)) {
                this.f35979a.edit().putLong(str, j4).commit();
                return true;
            }
            return false;
        }
        this.f35979a.edit().putLong(str, j4).commit();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void m(long j4, String str) {
        try {
            String d4 = d(j4);
            if (this.f35979a.getString(f35977g, "").equals(d4)) {
                return;
            }
            long j5 = this.f35979a.getLong(f35976f, 0L);
            if (j5 + 1 == 30) {
                a();
                j5 = this.f35979a.getLong(f35976f, 0L);
            }
            HashSet hashSet = new HashSet(this.f35979a.getStringSet(str, new HashSet()));
            hashSet.add(d4);
            this.f35979a.edit().putStringSet(str, hashSet).putLong(f35976f, j5 + 1).putString(f35977g, d4).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void n(long j4) {
        this.f35979a.edit().putLong(f35973c, j4).commit();
    }

    @i0
    @RestrictTo({RestrictTo.Scope.TESTS})
    r(SharedPreferences sharedPreferences) {
        this.f35979a = sharedPreferences;
    }
}
