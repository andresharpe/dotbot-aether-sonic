package com.android.volley;

import androidx.annotation.N;
import androidx.annotation.P;
import com.android.volley.Request;
import com.android.volley.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class t implements Request.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<Request<?>>> f24534a;

    /* renamed from: b, reason: collision with root package name */
    private final q f24535b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private final n f24536c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private final f f24537d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private final BlockingQueue<Request<?>> f24538e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(@N n nVar) {
        this.f24534a = new HashMap();
        this.f24536c = nVar;
        this.f24535b = nVar.i();
        this.f24537d = null;
        this.f24538e = null;
    }

    @Override // com.android.volley.Request.c
    public synchronized void a(Request<?> request) {
        BlockingQueue<Request<?>> blockingQueue;
        try {
            String q4 = request.q();
            List<Request<?>> remove = this.f24534a.remove(q4);
            if (remove != null && !remove.isEmpty()) {
                if (s.f24525b) {
                    s.f("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), q4);
                }
                Request<?> remove2 = remove.remove(0);
                this.f24534a.put(q4, remove);
                remove2.Q(this);
                n nVar = this.f24536c;
                if (nVar != null) {
                    nVar.n(remove2);
                } else if (this.f24537d != null && (blockingQueue = this.f24538e) != null) {
                    try {
                        blockingQueue.put(remove2);
                    } catch (InterruptedException e4) {
                        s.c("Couldn't add request to queue. %s", e4.toString());
                        Thread.currentThread().interrupt();
                        this.f24537d.d();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.Request.c
    public void b(Request<?> request, p<?> pVar) {
        List<Request<?>> remove;
        e.a aVar = pVar.f24521b;
        if (aVar != null && !aVar.a()) {
            String q4 = request.q();
            synchronized (this) {
                remove = this.f24534a.remove(q4);
            }
            if (remove != null) {
                if (s.f24525b) {
                    s.f("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), q4);
                }
                Iterator<Request<?>> it = remove.iterator();
                while (it.hasNext()) {
                    this.f24535b.a(it.next(), pVar);
                }
                return;
            }
            return;
        }
        a(request);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean c(Request<?> request) {
        try {
            String q4 = request.q();
            if (this.f24534a.containsKey(q4)) {
                List<Request<?>> list = this.f24534a.get(q4);
                if (list == null) {
                    list = new ArrayList<>();
                }
                request.e("waiting-for-response");
                list.add(request);
                this.f24534a.put(q4, list);
                if (s.f24525b) {
                    s.b("Request for cacheKey=%s is in flight, putting on hold.", q4);
                }
                return true;
            }
            this.f24534a.put(q4, null);
            request.Q(this);
            if (s.f24525b) {
                s.b("new request, sending to network %s", q4);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(@N f fVar, @N BlockingQueue<Request<?>> blockingQueue, q qVar) {
        this.f24534a = new HashMap();
        this.f24536c = null;
        this.f24535b = qVar;
        this.f24537d = fVar;
        this.f24538e = blockingQueue;
    }
}
