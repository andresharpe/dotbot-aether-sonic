package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.firebase.crashlytics.internal.common.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1809q {

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, Integer> f35168e;

    /* renamed from: f, reason: collision with root package name */
    static final String f35169f;

    /* renamed from: g, reason: collision with root package name */
    static final int f35170g = 3;

    /* renamed from: h, reason: collision with root package name */
    static final int f35171h = 4;

    /* renamed from: i, reason: collision with root package name */
    static final int f35172i = 3;

    /* renamed from: j, reason: collision with root package name */
    static final String f35173j = "0";

    /* renamed from: a, reason: collision with root package name */
    private final Context f35174a;

    /* renamed from: b, reason: collision with root package name */
    private final x f35175b;

    /* renamed from: c, reason: collision with root package name */
    private final C1793a f35176c;

    /* renamed from: d, reason: collision with root package name */
    private final r1.d f35177d;

    static {
        HashMap hashMap = new HashMap();
        f35168e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f35169f = String.format(Locale.US, "Crashlytics Android SDK/%s", com.google.firebase.crashlytics.e.f34961f);
    }

    public C1809q(Context context, x xVar, C1793a c1793a, r1.d dVar) {
        this.f35174a = context;
        this.f35175b = xVar;
        this.f35176c = c1793a;
        this.f35177d = dVar;
    }

    private CrashlyticsReport.c a() {
        return CrashlyticsReport.b().h(com.google.firebase.crashlytics.e.f34961f).d(this.f35176c.f35028a).e(this.f35175b.a()).b(this.f35176c.f35032e).c(this.f35176c.f35033f).g(4);
    }

    private static int e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f35168e.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private CrashlyticsReport.f.d.a.b.AbstractC0318a f() {
        return CrashlyticsReport.f.d.a.b.AbstractC0318a.a().b(0L).d(0L).c(this.f35176c.f35031d).e(this.f35176c.f35029b).a();
    }

    private com.google.firebase.crashlytics.internal.model.A<CrashlyticsReport.f.d.a.b.AbstractC0318a> g() {
        return com.google.firebase.crashlytics.internal.model.A.c(f());
    }

    private CrashlyticsReport.f.d.a h(int i4, CrashlyticsReport.a aVar) {
        boolean z3;
        if (aVar.b() != 100) {
            z3 = true;
        } else {
            z3 = false;
        }
        return CrashlyticsReport.f.d.a.a().b(Boolean.valueOf(z3)).f(i4).d(m(aVar)).a();
    }

    private CrashlyticsReport.f.d.a i(int i4, r1.e eVar, Thread thread, int i5, int i6, boolean z3) {
        Boolean bool;
        boolean z4;
        ActivityManager.RunningAppProcessInfo j4 = C1799g.j(this.f35176c.f35031d, this.f35174a);
        if (j4 != null) {
            if (j4.importance != 100) {
                z4 = true;
            } else {
                z4 = false;
            }
            bool = Boolean.valueOf(z4);
        } else {
            bool = null;
        }
        return CrashlyticsReport.f.d.a.a().b(bool).f(i4).d(n(eVar, thread, i5, i6, z3)).a();
    }

    private CrashlyticsReport.f.d.c j(int i4) {
        Double d4;
        C1796d a4 = C1796d.a(this.f35174a);
        Float b4 = a4.b();
        if (b4 != null) {
            d4 = Double.valueOf(b4.doubleValue());
        } else {
            d4 = null;
        }
        int c4 = a4.c();
        boolean p4 = C1799g.p(this.f35174a);
        long u3 = C1799g.u() - C1799g.a(this.f35174a);
        return CrashlyticsReport.f.d.c.a().b(d4).c(c4).f(p4).e(i4).g(u3).d(C1799g.b(Environment.getDataDirectory().getPath())).a();
    }

    private CrashlyticsReport.f.d.a.b.c k(r1.e eVar, int i4, int i5) {
        return l(eVar, i4, i5, 0);
    }

    private CrashlyticsReport.f.d.a.b.c l(r1.e eVar, int i4, int i5, int i6) {
        String str = eVar.f57437b;
        String str2 = eVar.f57436a;
        StackTraceElement[] stackTraceElementArr = eVar.f57438c;
        int i7 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        r1.e eVar2 = eVar.f57439d;
        if (i6 >= i5) {
            r1.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f57439d;
                i7++;
            }
        }
        CrashlyticsReport.f.d.a.b.c.AbstractC0321a d4 = CrashlyticsReport.f.d.a.b.c.a().f(str).e(str2).c(com.google.firebase.crashlytics.internal.model.A.b(p(stackTraceElementArr, i4))).d(i7);
        if (eVar2 != null && i7 == 0) {
            d4.b(l(eVar2, i4, i5, i6 + 1));
        }
        return d4.a();
    }

    private CrashlyticsReport.f.d.a.b m(CrashlyticsReport.a aVar) {
        return CrashlyticsReport.f.d.a.b.a().b(aVar).e(u()).c(g()).a();
    }

    private CrashlyticsReport.f.d.a.b n(r1.e eVar, Thread thread, int i4, int i5, boolean z3) {
        return CrashlyticsReport.f.d.a.b.a().f(x(eVar, thread, i4, z3)).d(k(eVar, i4, i5)).e(u()).c(g()).a();
    }

    private CrashlyticsReport.f.d.a.b.e.AbstractC0325b o(StackTraceElement stackTraceElement, CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a abstractC0326a) {
        long j4;
        long j5 = 0;
        if (stackTraceElement.isNativeMethod()) {
            j4 = Math.max(stackTraceElement.getLineNumber(), 0L);
        } else {
            j4 = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j5 = stackTraceElement.getLineNumber();
        }
        return abstractC0326a.e(j4).f(str).b(fileName).d(j5).a();
    }

    private com.google.firebase.crashlytics.internal.model.A<CrashlyticsReport.f.d.a.b.e.AbstractC0325b> p(StackTraceElement[] stackTraceElementArr, int i4) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(o(stackTraceElement, CrashlyticsReport.f.d.a.b.e.AbstractC0325b.a().c(i4)));
        }
        return com.google.firebase.crashlytics.internal.model.A.b(arrayList);
    }

    private CrashlyticsReport.f.a q() {
        CrashlyticsReport.f.a.AbstractC0315a f4 = CrashlyticsReport.f.a.a().e(this.f35175b.f()).h(this.f35176c.f35032e).d(this.f35176c.f35033f).f(this.f35175b.a());
        String a4 = this.f35176c.f35034g.a();
        if (a4 != null) {
            f4.b(CrashlyticsReport.f35267a).c(a4);
        }
        return f4.a();
    }

    private CrashlyticsReport.f r(String str, long j4) {
        return CrashlyticsReport.f.a().l(j4).i(str).g(f35169f).b(q()).k(t()).d(s()).h(3).a();
    }

    private CrashlyticsReport.f.c s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int e4 = e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long u3 = C1799g.u();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean A3 = C1799g.A(this.f35174a);
        int m4 = C1799g.m(this.f35174a);
        return CrashlyticsReport.f.c.a().b(e4).f(Build.MODEL).c(availableProcessors).h(u3).d(blockCount).i(A3).j(m4).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private CrashlyticsReport.f.e t() {
        return CrashlyticsReport.f.e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(C1799g.C(this.f35174a)).a();
    }

    private CrashlyticsReport.f.d.a.b.AbstractC0322d u() {
        return CrashlyticsReport.f.d.a.b.AbstractC0322d.a().d("0").c("0").b(0L).a();
    }

    private CrashlyticsReport.f.d.a.b.e v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return w(thread, stackTraceElementArr, 0);
    }

    private CrashlyticsReport.f.d.a.b.e w(Thread thread, StackTraceElement[] stackTraceElementArr, int i4) {
        return CrashlyticsReport.f.d.a.b.e.a().d(thread.getName()).c(i4).b(com.google.firebase.crashlytics.internal.model.A.b(p(stackTraceElementArr, i4))).a();
    }

    private com.google.firebase.crashlytics.internal.model.A<CrashlyticsReport.f.d.a.b.e> x(r1.e eVar, Thread thread, int i4, boolean z3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(w(thread, eVar.f57438c, i4));
        if (z3) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(v(key, this.f35177d.a(entry.getValue())));
                }
            }
        }
        return com.google.firebase.crashlytics.internal.model.A.b(arrayList);
    }

    public CrashlyticsReport.f.d b(CrashlyticsReport.a aVar) {
        int i4 = this.f35174a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.f.d.a().f("anr").e(aVar.h()).b(h(i4, aVar)).c(j(i4)).a();
    }

    public CrashlyticsReport.f.d c(Throwable th, Thread thread, String str, long j4, int i4, int i5, boolean z3) {
        int i6 = this.f35174a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.f.d.a().f(str).e(j4).b(i(i6, new r1.e(th, this.f35177d), thread, i4, i5, z3)).c(j(i6)).a();
    }

    public CrashlyticsReport d(String str, long j4) {
        return a().i(r(str, j4)).a();
    }
}
