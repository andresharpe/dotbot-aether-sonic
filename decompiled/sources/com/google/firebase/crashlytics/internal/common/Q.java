package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.W;
import androidx.annotation.i0;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1762c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class Q implements InterfaceC1808p {

    /* renamed from: f, reason: collision with root package name */
    private static final String f35007f = "crash";

    /* renamed from: g, reason: collision with root package name */
    private static final String f35008g = "error";

    /* renamed from: h, reason: collision with root package name */
    private static final int f35009h = 4;

    /* renamed from: i, reason: collision with root package name */
    private static final int f35010i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C1809q f35011a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f35012b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.send.c f35013c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.log.b f35014d;

    /* renamed from: e, reason: collision with root package name */
    private final T f35015e;

    Q(C1809q c1809q, com.google.firebase.crashlytics.internal.persistence.g gVar, com.google.firebase.crashlytics.internal.send.c cVar, com.google.firebase.crashlytics.internal.log.b bVar, T t3) {
        this.f35011a = c1809q;
        this.f35012b = gVar;
        this.f35013c = cVar;
        this.f35014d = bVar;
        this.f35015e = t3;
    }

    private CrashlyticsReport.f.d g(CrashlyticsReport.f.d dVar) {
        return h(dVar, this.f35014d, this.f35015e);
    }

    private CrashlyticsReport.f.d h(CrashlyticsReport.f.d dVar, com.google.firebase.crashlytics.internal.log.b bVar, T t3) {
        CrashlyticsReport.f.d.b g4 = dVar.g();
        String d4 = bVar.d();
        if (d4 != null) {
            g4.d(CrashlyticsReport.f.d.AbstractC0327d.a().b(d4).a());
        } else {
            com.google.firebase.crashlytics.internal.f.f().k("No log data to include with this event.");
        }
        List<CrashlyticsReport.d> n4 = n(t3.a());
        List<CrashlyticsReport.d> n5 = n(t3.b());
        if (!n4.isEmpty()) {
            g4.b(dVar.b().g().c(com.google.firebase.crashlytics.internal.model.A.b(n4)).e(com.google.firebase.crashlytics.internal.model.A.b(n5)).a());
        }
        return g4.a();
    }

    @W(api = 30)
    private static CrashlyticsReport.a i(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        String str;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            str = j(traceInputStream);
        } catch (IOException | NullPointerException e4) {
            com.google.firebase.crashlytics.internal.f f4 = com.google.firebase.crashlytics.internal.f.f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb.append(applicationExitInfo2);
            sb.append(" Error: ");
            sb.append(e4);
            f4.m(sb.toString());
            str = null;
        }
        CrashlyticsReport.a.AbstractC0314a a4 = CrashlyticsReport.a.a();
        importance = applicationExitInfo.getImportance();
        CrashlyticsReport.a.AbstractC0314a b4 = a4.b(importance);
        processName = applicationExitInfo.getProcessName();
        CrashlyticsReport.a.AbstractC0314a d4 = b4.d(processName);
        reason = applicationExitInfo.getReason();
        CrashlyticsReport.a.AbstractC0314a f5 = d4.f(reason);
        timestamp = applicationExitInfo.getTimestamp();
        CrashlyticsReport.a.AbstractC0314a h4 = f5.h(timestamp);
        pid = applicationExitInfo.getPid();
        CrashlyticsReport.a.AbstractC0314a c4 = h4.c(pid);
        pss = applicationExitInfo.getPss();
        CrashlyticsReport.a.AbstractC0314a e5 = c4.e(pss);
        rss = applicationExitInfo.getRss();
        return e5.g(rss).i(str).a();
    }

    @i0
    @W(api = 19)
    public static String j(@androidx.annotation.P InputStream inputStream) throws IOException, NullPointerException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(StandardCharsets.UTF_8.name())));
        while (true) {
            try {
                int read = bufferedReader.read();
                if (read != -1) {
                    sb.append((char) read);
                } else {
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    return sb2;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static Q k(Context context, x xVar, com.google.firebase.crashlytics.internal.persistence.h hVar, C1793a c1793a, com.google.firebase.crashlytics.internal.log.b bVar, T t3, r1.d dVar, com.google.firebase.crashlytics.internal.settings.d dVar2) {
        return new Q(new C1809q(context, xVar, c1793a, dVar), new com.google.firebase.crashlytics.internal.persistence.g(new File(hVar.a()), dVar2), com.google.firebase.crashlytics.internal.send.c.c(context), bVar, t3);
    }

    @androidx.annotation.N
    private static List<CrashlyticsReport.d> n(@androidx.annotation.N Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(CrashlyticsReport.d.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.P
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int p4;
                p4 = Q.p((CrashlyticsReport.d) obj, (CrashlyticsReport.d) obj2);
                return p4;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int p(CrashlyticsReport.d dVar, CrashlyticsReport.d dVar2) {
        return dVar.b().compareTo(dVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(@androidx.annotation.N AbstractC1770k<r> abstractC1770k) {
        if (abstractC1770k.v()) {
            r r4 = abstractC1770k.r();
            com.google.firebase.crashlytics.internal.f.f().b("Crashlytics report successfully enqueued to DataTransport: " + r4.c());
            this.f35012b.m(r4.c());
            return true;
        }
        com.google.firebase.crashlytics.internal.f.f().n("Crashlytics report could not be enqueued to DataTransport", abstractC1770k.q());
        return false;
    }

    private void t(@androidx.annotation.N Throwable th, @androidx.annotation.N Thread thread, @androidx.annotation.N String str, @androidx.annotation.N String str2, long j4, boolean z3) {
        this.f35012b.J(g(this.f35011a.c(th, thread, str2, j4, 4, 8, z3)), str, str2.equals("crash"));
    }

    @Override // com.google.firebase.crashlytics.internal.common.InterfaceC1808p
    public void a(String str, String str2) {
        this.f35015e.d(str, str2);
    }

    @Override // com.google.firebase.crashlytics.internal.common.InterfaceC1808p
    public void b(@androidx.annotation.N String str, long j4) {
        this.f35012b.K(this.f35011a.d(str, j4));
    }

    @Override // com.google.firebase.crashlytics.internal.common.InterfaceC1808p
    public void c(long j4, String str) {
        this.f35014d.i(j4, str);
    }

    @Override // com.google.firebase.crashlytics.internal.common.InterfaceC1808p
    public void d(String str) {
        this.f35015e.g(str);
    }

    public void l(@androidx.annotation.N String str, @androidx.annotation.N List<C> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<C> it = list.iterator();
        while (it.hasNext()) {
            CrashlyticsReport.e.b c4 = it.next().c();
            if (c4 != null) {
                arrayList.add(c4);
            }
        }
        this.f35012b.o(str, CrashlyticsReport.e.a().b(com.google.firebase.crashlytics.internal.model.A.b(arrayList)).a());
    }

    public void m(long j4, @androidx.annotation.P String str) {
        this.f35012b.n(str, j4);
    }

    public boolean o() {
        return this.f35012b.x();
    }

    @androidx.annotation.N
    public List<String> q() {
        return this.f35012b.E();
    }

    @W(api = 30)
    public void s(String str, ApplicationExitInfo applicationExitInfo, com.google.firebase.crashlytics.internal.log.b bVar, T t3) {
        long timestamp;
        int reason;
        long w3 = this.f35012b.w(str);
        timestamp = applicationExitInfo.getTimestamp();
        if (timestamp >= w3) {
            reason = applicationExitInfo.getReason();
            if (reason != 6) {
                return;
            }
            CrashlyticsReport.f.d b4 = this.f35011a.b(i(applicationExitInfo));
            com.google.firebase.crashlytics.internal.f.f().b("Persisting anr for session " + str);
            this.f35012b.J(h(b4, bVar, t3), str, true);
        }
    }

    public void u(@androidx.annotation.N Throwable th, @androidx.annotation.N Thread thread, @androidx.annotation.N String str, long j4) {
        com.google.firebase.crashlytics.internal.f.f().k("Persisting fatal event for session " + str);
        t(th, thread, str, "crash", j4, true);
    }

    public void v(@androidx.annotation.N Throwable th, @androidx.annotation.N Thread thread, @androidx.annotation.N String str, long j4) {
        com.google.firebase.crashlytics.internal.f.f().k("Persisting non-fatal event for session " + str);
        t(th, thread, str, "error", j4, false);
    }

    public void w(@androidx.annotation.N String str) {
        String c4 = this.f35015e.c();
        if (c4 == null) {
            com.google.firebase.crashlytics.internal.f.f().k("Could not persist user ID; no user ID available");
        } else {
            this.f35012b.L(c4, str);
        }
    }

    public void x() {
        this.f35012b.l();
    }

    public AbstractC1770k<Void> y(@androidx.annotation.N Executor executor) {
        List<r> F3 = this.f35012b.F();
        ArrayList arrayList = new ArrayList();
        Iterator<r> it = F3.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f35013c.g(it.next()).n(executor, new InterfaceC1762c() { // from class: com.google.firebase.crashlytics.internal.common.O
                @Override // com.google.android.gms.tasks.InterfaceC1762c
                public final Object a(AbstractC1770k abstractC1770k) {
                    boolean r4;
                    r4 = Q.this.r(abstractC1770k);
                    return Boolean.valueOf(r4);
                }
            }));
        }
        return C1773n.h(arrayList);
    }
}
