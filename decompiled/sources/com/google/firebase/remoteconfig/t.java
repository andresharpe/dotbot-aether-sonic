package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.B;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.google.android.gms.common.util.InterfaceC1303d;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.tasks.C1773n;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@I0.a
/* loaded from: classes2.dex */
public class t {

    /* renamed from: j, reason: collision with root package name */
    public static final String f37757j = "activate";

    /* renamed from: k, reason: collision with root package name */
    public static final String f37758k = "fetch";

    /* renamed from: l, reason: collision with root package name */
    public static final String f37759l = "defaults";

    /* renamed from: m, reason: collision with root package name */
    public static final long f37760m = 60;

    /* renamed from: n, reason: collision with root package name */
    private static final String f37761n = "frc";

    /* renamed from: o, reason: collision with root package name */
    private static final String f37762o = "settings";

    /* renamed from: p, reason: collision with root package name */
    @i0
    public static final String f37763p = "firebase";

    /* renamed from: q, reason: collision with root package name */
    private static final InterfaceC1306g f37764q = com.google.android.gms.common.util.k.e();

    /* renamed from: r, reason: collision with root package name */
    private static final Random f37765r = new Random();

    /* renamed from: a, reason: collision with root package name */
    @B("this")
    private final Map<String, l> f37766a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f37767b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f37768c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.e f37769d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.installations.j f37770e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.abt.c f37771f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private final C1.b<com.google.firebase.analytics.connector.a> f37772g;

    /* renamed from: h, reason: collision with root package name */
    private final String f37773h;

    /* renamed from: i, reason: collision with root package name */
    @B("this")
    private Map<String, String> f37774i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Context context, com.google.firebase.e eVar, com.google.firebase.installations.j jVar, com.google.firebase.abt.c cVar, C1.b<com.google.firebase.analytics.connector.a> bVar) {
        this(context, Executors.newCachedThreadPool(), eVar, jVar, cVar, bVar, true);
    }

    private com.google.firebase.remoteconfig.internal.e d(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.e.j(Executors.newCachedThreadPool(), com.google.firebase.remoteconfig.internal.o.d(this.f37767b, String.format("%s_%s_%s_%s.json", "frc", this.f37773h, str, str2)));
    }

    private com.google.firebase.remoteconfig.internal.m h(com.google.firebase.remoteconfig.internal.e eVar, com.google.firebase.remoteconfig.internal.e eVar2) {
        return new com.google.firebase.remoteconfig.internal.m(this.f37768c, eVar, eVar2);
    }

    @i0
    static com.google.firebase.remoteconfig.internal.n i(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.n(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, f37762o), 0));
    }

    @P
    private static com.google.firebase.remoteconfig.internal.s j(com.google.firebase.e eVar, String str, C1.b<com.google.firebase.analytics.connector.a> bVar) {
        if (l(eVar) && str.equals(f37763p)) {
            return new com.google.firebase.remoteconfig.internal.s(bVar);
        }
        return null;
    }

    private static boolean k(com.google.firebase.e eVar, String str) {
        if (str.equals(f37763p) && l(eVar)) {
            return true;
        }
        return false;
    }

    private static boolean l(com.google.firebase.e eVar) {
        return eVar.r().equals(com.google.firebase.e.f35884l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.firebase.analytics.connector.a m() {
        return null;
    }

    @i0
    synchronized l b(com.google.firebase.e eVar, String str, com.google.firebase.installations.j jVar, com.google.firebase.abt.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.e eVar2, com.google.firebase.remoteconfig.internal.e eVar3, com.google.firebase.remoteconfig.internal.e eVar4, com.google.firebase.remoteconfig.internal.k kVar, com.google.firebase.remoteconfig.internal.m mVar, com.google.firebase.remoteconfig.internal.n nVar) {
        com.google.firebase.abt.c cVar2;
        try {
            if (!this.f37766a.containsKey(str)) {
                Context context = this.f37767b;
                if (k(eVar, str)) {
                    cVar2 = cVar;
                } else {
                    cVar2 = null;
                }
                l lVar = new l(context, eVar, jVar, cVar2, executor, eVar2, eVar3, eVar4, kVar, mVar, nVar);
                lVar.N();
                this.f37766a.put(str, lVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37766a.get(str);
    }

    @i0
    @I0.a
    public synchronized l c(String str) {
        com.google.firebase.remoteconfig.internal.e d4;
        com.google.firebase.remoteconfig.internal.e d5;
        com.google.firebase.remoteconfig.internal.e d6;
        com.google.firebase.remoteconfig.internal.n i4;
        com.google.firebase.remoteconfig.internal.m h4;
        try {
            d4 = d(str, f37758k);
            d5 = d(str, f37757j);
            d6 = d(str, f37759l);
            i4 = i(this.f37767b, this.f37773h, str);
            h4 = h(d5, d6);
            final com.google.firebase.remoteconfig.internal.s j4 = j(this.f37769d, str, this.f37772g);
            if (j4 != null) {
                h4.b(new InterfaceC1303d() { // from class: com.google.firebase.remoteconfig.q
                    @Override // com.google.android.gms.common.util.InterfaceC1303d
                    public final void a(Object obj, Object obj2) {
                        com.google.firebase.remoteconfig.internal.s.this.a((String) obj, (com.google.firebase.remoteconfig.internal.f) obj2);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return b(this.f37769d, str, this.f37770e, this.f37771f, this.f37768c, d4, d5, d6, f(str, d4, i4), h4, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l e() {
        return c(f37763p);
    }

    @i0
    synchronized com.google.firebase.remoteconfig.internal.k f(String str, com.google.firebase.remoteconfig.internal.e eVar, com.google.firebase.remoteconfig.internal.n nVar) {
        com.google.firebase.installations.j jVar;
        C1.b<com.google.firebase.analytics.connector.a> bVar;
        try {
            jVar = this.f37770e;
            if (l(this.f37769d)) {
                bVar = this.f37772g;
            } else {
                bVar = new C1.b() { // from class: com.google.firebase.remoteconfig.r
                    @Override // C1.b
                    public final Object get() {
                        com.google.firebase.analytics.connector.a m4;
                        m4 = t.m();
                        return m4;
                    }
                };
            }
        } catch (Throwable th) {
            throw th;
        }
        return new com.google.firebase.remoteconfig.internal.k(jVar, bVar, this.f37768c, f37764q, f37765r, eVar, g(this.f37769d.s().i(), str, nVar), nVar, this.f37774i);
    }

    @i0
    ConfigFetchHttpClient g(String str, String str2, com.google.firebase.remoteconfig.internal.n nVar) {
        return new ConfigFetchHttpClient(this.f37767b, this.f37769d.s().j(), str, str2, nVar.c(), nVar.c());
    }

    @i0
    public synchronized void n(Map<String, String> map) {
        this.f37774i = map;
    }

    @i0
    protected t(Context context, ExecutorService executorService, com.google.firebase.e eVar, com.google.firebase.installations.j jVar, com.google.firebase.abt.c cVar, C1.b<com.google.firebase.analytics.connector.a> bVar, boolean z3) {
        this.f37766a = new HashMap();
        this.f37774i = new HashMap();
        this.f37767b = context;
        this.f37768c = executorService;
        this.f37769d = eVar;
        this.f37770e = jVar;
        this.f37771f = cVar;
        this.f37772g = bVar;
        this.f37773h = eVar.s().j();
        if (z3) {
            C1773n.d(executorService, new Callable() { // from class: com.google.firebase.remoteconfig.s
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return t.this.e();
                }
            });
        }
    }
}
