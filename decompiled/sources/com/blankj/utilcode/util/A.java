package com.blankj.utilcode.util;

import com.blankj.utilcode.util.H0;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.File;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24685a = System.getProperty("file.separator");

    /* renamed from: b, reason: collision with root package name */
    private static final Thread.UncaughtExceptionHandler f24686b = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24687a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f24688b;

        a(String str, c cVar) {
            this.f24687a = str;
            this.f24688b = cVar;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@androidx.annotation.N Thread thread, @androidx.annotation.N Throwable th) {
            String format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss").format(new Date());
            b bVar = new b(format, th, null);
            H0.j1(this.f24687a + format + ".txt", bVar.toString(), true);
            if (A.f24686b != null) {
                A.f24686b.uncaughtException(thread, th);
            }
            c cVar = this.f24688b;
            if (cVar != null) {
                cVar.a(bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private H0.a f24689a;

        /* renamed from: b, reason: collision with root package name */
        private Throwable f24690b;

        /* synthetic */ b(String str, Throwable th, a aVar) {
            this(str, th);
        }

        public final void a(String str, String str2) {
            this.f24689a.b(str, str2);
        }

        public final void b(Map<String, String> map) {
            this.f24689a.c(map);
        }

        public final Throwable c() {
            return this.f24690b;
        }

        public String toString() {
            return this.f24689a.toString() + H0.T(this.f24690b);
        }

        private b(String str, Throwable th) {
            this.f24690b = th;
            H0.a aVar = new H0.a("Crash");
            this.f24689a = aVar;
            aVar.a("Time Of Crash", str);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(b bVar);
    }

    private A() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static Thread.UncaughtExceptionHandler b(String str, c cVar) {
        return new a(str, cVar);
    }

    public static void c() {
        g("");
    }

    public static void d(c cVar) {
        h("", cVar);
    }

    public static void e(@androidx.annotation.N File file) {
        h(file.getAbsolutePath(), null);
    }

    public static void f(@androidx.annotation.N File file, c cVar) {
        h(file.getAbsolutePath(), cVar);
    }

    public static void g(String str) {
        h(str, null);
    }

    public static void h(String str, c cVar) {
        if (H0.D0(str)) {
            if (H0.A0() && E0.a().getExternalFilesDir(null) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(E0.a().getExternalFilesDir(null));
                String str2 = f24685a;
                sb.append(str2);
                sb.append(AppMeasurement.f30086b);
                sb.append(str2);
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(E0.a().getFilesDir());
                String str3 = f24685a;
                sb2.append(str3);
                sb2.append(AppMeasurement.f30086b);
                sb2.append(str3);
                str = sb2.toString();
            }
        } else {
            String str4 = f24685a;
            if (!str.endsWith(str4)) {
                str = str + str4;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(b(str, cVar));
    }
}
