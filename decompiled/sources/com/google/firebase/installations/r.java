package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    private static final String f36279c = ":";

    /* renamed from: e, reason: collision with root package name */
    private static r f36281e;

    /* renamed from: a, reason: collision with root package name */
    private final F1.a f36282a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f36278b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f36280d = Pattern.compile("\\AA[\\w-]{38}\\z");

    private r(F1.a aVar) {
        this.f36282a = aVar;
    }

    public static r c() {
        return d(F1.b.b());
    }

    public static r d(F1.a aVar) {
        if (f36281e == null) {
            f36281e = new r(aVar);
        }
        return f36281e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(@P String str) {
        return f36280d.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(@P String str) {
        return str.contains(f36279c);
    }

    public long a() {
        return this.f36282a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(@N com.google.firebase.installations.local.c cVar) {
        if (TextUtils.isEmpty(cVar.b()) || cVar.h() + cVar.c() < b() + f36278b) {
            return true;
        }
        return false;
    }
}
