package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.N;
import androidx.annotation.i0;
import androidx.core.os.O;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.firebase.components.C1792f;
import com.google.firebase.components.u;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h implements k, HeartBeatInfo {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadFactory f35966f = new ThreadFactory() { // from class: com.google.firebase.heartbeatinfo.f
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread m4;
            m4 = h.m(runnable);
            return m4;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C1.b<r> f35967a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f35968b;

    /* renamed from: c, reason: collision with root package name */
    private final C1.b<com.google.firebase.platforminfo.i> f35969c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<i> f35970d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f35971e;

    private h(final Context context, final String str, Set<i> set, C1.b<com.google.firebase.platforminfo.i> bVar) {
        this(new C1.b() { // from class: com.google.firebase.heartbeatinfo.c
            @Override // C1.b
            public final Object get() {
                r k4;
                k4 = h.k(context, str);
                return k4;
            }
        }, set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f35966f), bVar, context);
    }

    @N
    public static C1792f<h> h() {
        return C1792f.e(h.class, k.class, HeartBeatInfo.class).b(u.j(Context.class)).b(u.j(com.google.firebase.e.class)).b(u.l(i.class)).b(u.k(com.google.firebase.platforminfo.i.class)).f(new com.google.firebase.components.j() { // from class: com.google.firebase.heartbeatinfo.e
            @Override // com.google.firebase.components.j
            public final Object a(com.google.firebase.components.g gVar) {
                h i4;
                i4 = h.i(gVar);
                return i4;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h i(com.google.firebase.components.g gVar) {
        return new h((Context) gVar.a(Context.class), ((com.google.firebase.e) gVar.a(com.google.firebase.e.class)).t(), gVar.e(i.class), gVar.b(com.google.firebase.platforminfo.i.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String j() throws Exception {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                r rVar = this.f35967a.get();
                List<s> c4 = rVar.c();
                rVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i4 = 0; i4 < c4.size(); i4++) {
                    s sVar = c4.get(i4);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", sVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) sVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r k(Context context, String str) {
        return new r(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void l() throws Exception {
        synchronized (this) {
            this.f35967a.get().m(System.currentTimeMillis(), this.f35969c.get().a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread m(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // com.google.firebase.heartbeatinfo.k
    public AbstractC1770k<String> a() {
        if (!O.a(this.f35968b)) {
            return C1773n.g("");
        }
        return C1773n.d(this.f35971e, new Callable() { // from class: com.google.firebase.heartbeatinfo.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String j4;
                j4 = h.this.j();
                return j4;
            }
        });
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @N
    public synchronized HeartBeatInfo.HeartBeat b(@N String str) {
        long currentTimeMillis = System.currentTimeMillis();
        r rVar = this.f35967a.get();
        if (rVar.k(currentTimeMillis)) {
            rVar.i();
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }

    public AbstractC1770k<Void> n() {
        if (this.f35970d.size() <= 0) {
            return C1773n.g(null);
        }
        if (!O.a(this.f35968b)) {
            return C1773n.g(null);
        }
        return C1773n.d(this.f35971e, new Callable() { // from class: com.google.firebase.heartbeatinfo.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void l4;
                l4 = h.this.l();
                return l4;
            }
        });
    }

    @i0
    h(C1.b<r> bVar, Set<i> set, Executor executor, C1.b<com.google.firebase.platforminfo.i> bVar2, Context context) {
        this.f35967a = bVar;
        this.f35970d = set;
        this.f35971e = executor;
        this.f35969c = bVar2;
        this.f35968b = context;
    }
}
