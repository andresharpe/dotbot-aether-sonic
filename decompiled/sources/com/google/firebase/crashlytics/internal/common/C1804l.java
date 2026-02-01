package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1769j;
import com.google.firebase.crashlytics.internal.common.C1810s;
import com.google.firebase.crashlytics.internal.log.b;
import com.google.firebase.crashlytics.internal.model.B;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import q1.C2397b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.crashlytics.internal.common.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1804l {

    /* renamed from: A, reason: collision with root package name */
    private static final String f35078A = "Crashlytics Android SDK/%s";

    /* renamed from: t, reason: collision with root package name */
    static final String f35079t = "fatal";

    /* renamed from: u, reason: collision with root package name */
    static final String f35080u = "timestamp";

    /* renamed from: v, reason: collision with root package name */
    static final String f35081v = "_ae";

    /* renamed from: w, reason: collision with root package name */
    static final String f35082w = ".ae";

    /* renamed from: x, reason: collision with root package name */
    static final FilenameFilter f35083x = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.k
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean P3;
            P3 = C1804l.P(file, str);
            return P3;
        }
    };

    /* renamed from: y, reason: collision with root package name */
    static final String f35084y = "native-sessions";

    /* renamed from: z, reason: collision with root package name */
    static final int f35085z = 1;

    /* renamed from: a, reason: collision with root package name */
    private final Context f35086a;

    /* renamed from: b, reason: collision with root package name */
    private final C1812u f35087b;

    /* renamed from: c, reason: collision with root package name */
    private final C1807o f35088c;

    /* renamed from: d, reason: collision with root package name */
    private final T f35089d;

    /* renamed from: e, reason: collision with root package name */
    private final C1800h f35090e;

    /* renamed from: f, reason: collision with root package name */
    private final x f35091f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.h f35092g;

    /* renamed from: h, reason: collision with root package name */
    private final C1793a f35093h;

    /* renamed from: i, reason: collision with root package name */
    private final b.InterfaceC0312b f35094i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.log.b f35095j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.a f35096k;

    /* renamed from: l, reason: collision with root package name */
    private final String f35097l;

    /* renamed from: m, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.analytics.a f35098m;

    /* renamed from: n, reason: collision with root package name */
    private final Q f35099n;

    /* renamed from: o, reason: collision with root package name */
    private C1810s f35100o;

    /* renamed from: p, reason: collision with root package name */
    final C1771l<Boolean> f35101p = new C1771l<>();

    /* renamed from: q, reason: collision with root package name */
    final C1771l<Boolean> f35102q = new C1771l<>();

    /* renamed from: r, reason: collision with root package name */
    final C1771l<Void> f35103r = new C1771l<>();

    /* renamed from: s, reason: collision with root package name */
    final AtomicBoolean f35104s = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.l$a */
    /* loaded from: classes2.dex */
    public class a implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f35105a;

        a(long j4) {
            this.f35105a = j4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt(C1804l.f35079t, 1);
            bundle.putLong(C1804l.f35080u, this.f35105a);
            C1804l.this.f35098m.a(C1804l.f35081v, bundle);
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.l$b */
    /* loaded from: classes2.dex */
    class b implements C1810s.a {
        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.common.C1810s.a
        public void a(@androidx.annotation.N com.google.firebase.crashlytics.internal.settings.d dVar, @androidx.annotation.N Thread thread, @androidx.annotation.N Throwable th) {
            C1804l.this.N(dVar, thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.l$c */
    /* loaded from: classes2.dex */
    public class c implements Callable<AbstractC1770k<Void>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f35108a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f35109b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f35110c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.d f35111d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.firebase.crashlytics.internal.common.l$c$a */
        /* loaded from: classes2.dex */
        public class a implements InterfaceC1769j<C2397b, Void> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Executor f35113a;

            a(Executor executor) {
                this.f35113a = executor;
            }

            @Override // com.google.android.gms.tasks.InterfaceC1769j
            @androidx.annotation.N
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC1770k<Void> a(@androidx.annotation.P C2397b c2397b) throws Exception {
                if (c2397b == null) {
                    com.google.firebase.crashlytics.internal.f.f().m("Received null app settings, cannot send reports at crash time.");
                    return C1773n.g(null);
                }
                return C1773n.i(C1804l.this.V(), C1804l.this.f35099n.y(this.f35113a));
            }
        }

        c(long j4, Throwable th, Thread thread, com.google.firebase.crashlytics.internal.settings.d dVar) {
            this.f35108a = j4;
            this.f35109b = th;
            this.f35110c = thread;
            this.f35111d = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1770k<Void> call() throws Exception {
            long L3 = C1804l.L(this.f35108a);
            String G3 = C1804l.this.G();
            if (G3 == null) {
                com.google.firebase.crashlytics.internal.f.f().d("Tried to write a fatal exception while no session was open.");
                return C1773n.g(null);
            }
            C1804l.this.f35088c.a();
            C1804l.this.f35099n.u(this.f35109b, this.f35110c, G3, L3);
            C1804l.this.z(this.f35108a);
            C1804l.this.w(this.f35111d);
            C1804l.this.y();
            if (!C1804l.this.f35087b.d()) {
                return C1773n.g(null);
            }
            Executor c4 = C1804l.this.f35090e.c();
            return this.f35111d.a().x(c4, new a(c4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.l$d */
    /* loaded from: classes2.dex */
    public class d implements InterfaceC1769j<Void, Boolean> {
        d() {
        }

        @Override // com.google.android.gms.tasks.InterfaceC1769j
        @androidx.annotation.N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC1770k<Boolean> a(@androidx.annotation.P Void r12) throws Exception {
            return C1773n.g(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.l$e */
    /* loaded from: classes2.dex */
    public class e implements InterfaceC1769j<Boolean, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1770k f35116a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.firebase.crashlytics.internal.common.l$e$a */
        /* loaded from: classes2.dex */
        public class a implements Callable<AbstractC1770k<Void>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Boolean f35118a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.google.firebase.crashlytics.internal.common.l$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class C0310a implements InterfaceC1769j<C2397b, Void> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Executor f35120a;

                C0310a(Executor executor) {
                    this.f35120a = executor;
                }

                @Override // com.google.android.gms.tasks.InterfaceC1769j
                @androidx.annotation.N
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public AbstractC1770k<Void> a(@androidx.annotation.P C2397b c2397b) throws Exception {
                    if (c2397b != null) {
                        C1804l.this.V();
                        C1804l.this.f35099n.y(this.f35120a);
                        C1804l.this.f35103r.e(null);
                        return C1773n.g(null);
                    }
                    com.google.firebase.crashlytics.internal.f.f().m("Received null app settings at app startup. Cannot send cached reports");
                    return C1773n.g(null);
                }
            }

            a(Boolean bool) {
                this.f35118a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC1770k<Void> call() throws Exception {
                if (!this.f35118a.booleanValue()) {
                    com.google.firebase.crashlytics.internal.f.f().k("Deleting cached crash reports...");
                    C1804l.t(C1804l.this.Q());
                    C1804l.this.f35099n.x();
                    C1804l.this.f35103r.e(null);
                    return C1773n.g(null);
                }
                com.google.firebase.crashlytics.internal.f.f().b("Sending cached crash reports...");
                C1804l.this.f35087b.c(this.f35118a.booleanValue());
                Executor c4 = C1804l.this.f35090e.c();
                return e.this.f35116a.x(c4, new C0310a(c4));
            }
        }

        e(AbstractC1770k abstractC1770k) {
            this.f35116a = abstractC1770k;
        }

        @Override // com.google.android.gms.tasks.InterfaceC1769j
        @androidx.annotation.N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC1770k<Void> a(@androidx.annotation.P Boolean bool) throws Exception {
            return C1804l.this.f35090e.i(new a(bool));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.l$f */
    /* loaded from: classes2.dex */
    class f implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f35122a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35123b;

        f(long j4, String str) {
            this.f35122a = j4;
            this.f35123b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            if (!C1804l.this.O()) {
                C1804l.this.f35095j.i(this.f35122a, this.f35123b);
                return null;
            }
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.l$g */
    /* loaded from: classes2.dex */
    class g implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f35125E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Throwable f35126F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Thread f35127G;

        g(long j4, Throwable th, Thread thread) {
            this.f35125E = j4;
            this.f35126F = th;
            this.f35127G = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C1804l.this.O()) {
                long L3 = C1804l.L(this.f35125E);
                String G3 = C1804l.this.G();
                if (G3 == null) {
                    com.google.firebase.crashlytics.internal.f.f().m("Tried to write a non-fatal exception while no session was open.");
                } else {
                    C1804l.this.f35099n.v(this.f35126F, this.f35127G, G3, L3);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.l$h */
    /* loaded from: classes2.dex */
    public class h implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ T f35129a;

        h(T t3) {
            this.f35129a = t3;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            String G3 = C1804l.this.G();
            if (G3 == null) {
                com.google.firebase.crashlytics.internal.f.f().b("Tried to cache user data while no session was open.");
                return null;
            }
            C1804l.this.f35099n.w(G3);
            new B(C1804l.this.I()).n(G3, this.f35129a);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.l$i */
    /* loaded from: classes2.dex */
    public class i implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f35131a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35132b;

        i(Map map, boolean z3) {
            this.f35131a = map;
            this.f35132b = z3;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            new B(C1804l.this.I()).m(C1804l.this.G(), this.f35131a, this.f35132b);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.l$j */
    /* loaded from: classes2.dex */
    public class j implements Callable<Void> {
        j() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            C1804l.this.y();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1804l(Context context, C1800h c1800h, x xVar, C1812u c1812u, com.google.firebase.crashlytics.internal.persistence.h hVar, C1807o c1807o, C1793a c1793a, T t3, com.google.firebase.crashlytics.internal.log.b bVar, b.InterfaceC0312b interfaceC0312b, Q q4, com.google.firebase.crashlytics.internal.a aVar, com.google.firebase.crashlytics.internal.analytics.a aVar2) {
        this.f35086a = context;
        this.f35090e = c1800h;
        this.f35091f = xVar;
        this.f35087b = c1812u;
        this.f35092g = hVar;
        this.f35088c = c1807o;
        this.f35093h = c1793a;
        this.f35089d = t3;
        this.f35095j = bVar;
        this.f35094i = interfaceC0312b;
        this.f35096k = aVar;
        this.f35097l = c1793a.f35034g.a();
        this.f35098m = aVar2;
        this.f35099n = q4;
    }

    private static File[] B(File[] fileArr) {
        if (fileArr == null) {
            return new File[0];
        }
        return fileArr;
    }

    private void C(String str) {
        com.google.firebase.crashlytics.internal.f.f().k("Finalizing native report for session " + str);
        com.google.firebase.crashlytics.internal.g b4 = this.f35096k.b(str);
        File e4 = b4.e();
        if (e4 != null && e4.exists()) {
            long lastModified = e4.lastModified();
            com.google.firebase.crashlytics.internal.log.b bVar = new com.google.firebase.crashlytics.internal.log.b(this.f35086a, this.f35094i, str);
            File file = new File(K(), str);
            if (!file.mkdirs()) {
                com.google.firebase.crashlytics.internal.f.f().m("Couldn't create directory to store native session files, aborting.");
                return;
            }
            z(lastModified);
            List<C> J3 = J(b4, str, I(), bVar.c());
            D.b(file, J3);
            this.f35099n.l(str, J3);
            bVar.a();
            return;
        }
        com.google.firebase.crashlytics.internal.f.f().m("No minidump data found for session " + str);
    }

    private static boolean E() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private Context F() {
        return this.f35086a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.P
    public String G() {
        List<String> q4 = this.f35099n.q();
        if (!q4.isEmpty()) {
            return q4.get(0);
        }
        return null;
    }

    private static long H() {
        return L(System.currentTimeMillis());
    }

    @androidx.annotation.N
    static List<C> J(com.google.firebase.crashlytics.internal.g gVar, String str, File file, byte[] bArr) {
        B b4 = new B(file);
        File c4 = b4.c(str);
        File b5 = b4.b(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1797e("logs_file", "logs", bArr));
        arrayList.add(new w("crash_meta_file", "metadata", gVar.g()));
        arrayList.add(new w("session_meta_file", "session", gVar.f()));
        arrayList.add(new w("app_meta_file", com.spotify.android.appremote.internal.l.f48821i, gVar.a()));
        arrayList.add(new w("device_meta_file", "device", gVar.c()));
        arrayList.add(new w("os_meta_file", "os", gVar.b()));
        arrayList.add(new w("minidump_file", "minidump", gVar.e()));
        arrayList.add(new w("user_meta_file", "user", c4));
        arrayList.add(new w("keys_file", "keys", b5));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long L(long j4) {
        return j4 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean P(File file, String str) {
        return str.startsWith(f35082w);
    }

    private static File[] R(File file, FilenameFilter filenameFilter) {
        return B(file.listFiles(filenameFilter));
    }

    private File[] S(FilenameFilter filenameFilter) {
        return R(I(), filenameFilter);
    }

    private AbstractC1770k<Void> U(long j4) {
        if (E()) {
            com.google.firebase.crashlytics.internal.f.f().m("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return C1773n.g(null);
        }
        com.google.firebase.crashlytics.internal.f.f().b("Logging app exception event to Firebase Analytics");
        return C1773n.d(new ScheduledThreadPoolExecutor(1), new a(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC1770k<Void> V() {
        ArrayList arrayList = new ArrayList();
        for (File file : Q()) {
            try {
                arrayList.add(U(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                com.google.firebase.crashlytics.internal.f.f().m("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return C1773n.h(arrayList);
    }

    private AbstractC1770k<Boolean> d0() {
        if (this.f35087b.d()) {
            com.google.firebase.crashlytics.internal.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f35101p.e(Boolean.FALSE);
            return C1773n.g(Boolean.TRUE);
        }
        com.google.firebase.crashlytics.internal.f.f().b("Automatic data collection is disabled.");
        com.google.firebase.crashlytics.internal.f.f().k("Notifying that unsent reports are available.");
        this.f35101p.e(Boolean.TRUE);
        AbstractC1770k<TContinuationResult> w3 = this.f35087b.i().w(new d());
        com.google.firebase.crashlytics.internal.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return V.e(w3, this.f35102q.a());
    }

    private void e0(String str) {
        List historicalProcessExitReasons;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            historicalProcessExitReasons = ((ActivityManager) this.f35086a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 1);
            if (historicalProcessExitReasons.size() != 0) {
                com.google.firebase.crashlytics.internal.log.b bVar = new com.google.firebase.crashlytics.internal.log.b(this.f35086a, this.f35094i, str);
                T t3 = new T();
                t3.e(new B(I()).g(str));
                this.f35099n.s(str, C1802j.a(historicalProcessExitReasons.get(0)), bVar, t3);
                return;
            }
            return;
        }
        com.google.firebase.crashlytics.internal.f.f().k("ANR feature enabled, but device is API " + i4);
    }

    private void n(Map<String, String> map, boolean z3) {
        this.f35090e.h(new i(map, z3));
    }

    private void o(T t3) {
        this.f35090e.h(new h(t3));
    }

    private static B.a q(x xVar, C1793a c1793a, String str) {
        return B.a.b(xVar.f(), c1793a.f35032e, c1793a.f35033f, xVar.a(), DeliveryMechanism.b(c1793a.f35030c).e(), str);
    }

    private static B.b r(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return B.b.c(C1799g.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C1799g.u(), statFs.getBlockCount() * statFs.getBlockSize(), C1799g.A(context), C1799g.m(context), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static B.c s(Context context) {
        return B.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C1799g.C(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(File[] fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            file.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x(boolean z3, com.google.firebase.crashlytics.internal.settings.d dVar) {
        String str;
        List<String> q4 = this.f35099n.q();
        if (q4.size() <= z3) {
            com.google.firebase.crashlytics.internal.f.f().k("No open sessions to be closed.");
            return;
        }
        String str2 = q4.get(z3 ? 1 : 0);
        if (dVar.b().a().f57348b) {
            e0(str2);
        }
        if (this.f35096k.c(str2)) {
            C(str2);
            this.f35096k.a(str2);
        }
        if (z3 != 0) {
            str = q4.get(0);
        } else {
            str = null;
        }
        this.f35099n.m(H(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        long H3 = H();
        String c1798f = new C1798f(this.f35091f).toString();
        com.google.firebase.crashlytics.internal.f.f().b("Opening a new session with ID " + c1798f);
        this.f35096k.d(c1798f, String.format(Locale.US, f35078A, C1806n.m()), H3, com.google.firebase.crashlytics.internal.model.B.b(q(this.f35091f, this.f35093h, this.f35097l), s(F()), r(F())));
        this.f35095j.g(c1798f);
        this.f35099n.b(c1798f, H3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(long j4) {
        try {
            new File(I(), f35082w + j4).createNewFile();
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.f.f().n("Could not create app exception marker file.", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.internal.settings.d dVar) {
        W();
        C1810s c1810s = new C1810s(new b(), dVar, uncaughtExceptionHandler);
        this.f35100o = c1810s;
        Thread.setDefaultUncaughtExceptionHandler(c1810s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D(com.google.firebase.crashlytics.internal.settings.d dVar) {
        this.f35090e.b();
        if (O()) {
            com.google.firebase.crashlytics.internal.f.f().m("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        com.google.firebase.crashlytics.internal.f.f().k("Finalizing previously open sessions.");
        try {
            x(true, dVar);
            com.google.firebase.crashlytics.internal.f.f().k("Closed all previously open sessions.");
            return true;
        } catch (Exception e4) {
            com.google.firebase.crashlytics.internal.f.f().e("Unable to finalize previously open sessions.", e4);
            return false;
        }
    }

    File I() {
        return this.f35092g.b();
    }

    File K() {
        return new File(I(), f35084y);
    }

    T M() {
        return this.f35089d;
    }

    synchronized void N(@androidx.annotation.N com.google.firebase.crashlytics.internal.settings.d dVar, @androidx.annotation.N Thread thread, @androidx.annotation.N Throwable th) {
        com.google.firebase.crashlytics.internal.f.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            V.b(this.f35090e.i(new c(System.currentTimeMillis(), th, thread, dVar)));
        } catch (Exception e4) {
            com.google.firebase.crashlytics.internal.f.f().e("Error handling uncaught exception", e4);
        }
    }

    boolean O() {
        C1810s c1810s = this.f35100o;
        if (c1810s != null && c1810s.a()) {
            return true;
        }
        return false;
    }

    File[] Q() {
        return S(f35083x);
    }

    File[] T() {
        return B(K().listFiles());
    }

    void W() {
        this.f35090e.h(new j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1770k<Void> X() {
        this.f35102q.e(Boolean.TRUE);
        return this.f35103r.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(String str, String str2) {
        try {
            this.f35089d.d(str, str2);
            n(this.f35089d.a(), false);
        } catch (IllegalArgumentException e4) {
            Context context = this.f35086a;
            if (context != null && C1799g.y(context)) {
                throw e4;
            }
            com.google.firebase.crashlytics.internal.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(Map<String, String> map) {
        this.f35089d.e(map);
        n(this.f35089d.a(), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0(String str, String str2) {
        try {
            this.f35089d.f(str, str2);
            n(this.f35089d.b(), true);
        } catch (IllegalArgumentException e4) {
            Context context = this.f35086a;
            if (context != null && C1799g.y(context)) {
                throw e4;
            }
            com.google.firebase.crashlytics.internal.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(String str) {
        this.f35089d.g(str);
        o(this.f35089d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1770k<Void> c0(AbstractC1770k<C2397b> abstractC1770k) {
        if (!this.f35099n.o()) {
            com.google.firebase.crashlytics.internal.f.f().k("No crash reports are available to be sent.");
            this.f35101p.e(Boolean.FALSE);
            return C1773n.g(null);
        }
        com.google.firebase.crashlytics.internal.f.f().k("Crash reports are available to be sent.");
        return d0().w(new e(abstractC1770k));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0(@androidx.annotation.N Thread thread, @androidx.annotation.N Throwable th) {
        this.f35090e.g(new g(System.currentTimeMillis(), th, thread));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0(long j4, String str) {
        this.f35090e.h(new f(j4, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public AbstractC1770k<Boolean> p() {
        if (!this.f35104s.compareAndSet(false, true)) {
            com.google.firebase.crashlytics.internal.f.f().m("checkForUnsentReports should only be called once per execution.");
            return C1773n.g(Boolean.FALSE);
        }
        return this.f35101p.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1770k<Void> u() {
        this.f35102q.e(Boolean.FALSE);
        return this.f35103r.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v() {
        if (!this.f35088c.c()) {
            String G3 = G();
            if (G3 != null && this.f35096k.c(G3)) {
                return true;
            }
            return false;
        }
        com.google.firebase.crashlytics.internal.f.f().k("Found previous crash marker.");
        this.f35088c.d();
        return true;
    }

    void w(com.google.firebase.crashlytics.internal.settings.d dVar) {
        x(false, dVar);
    }
}
