package com.spotify.protocol.client;

import com.spotify.protocol.types.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f48898a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final Map<b.a, a<?>> f48899b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<b.a, b<?>> f48900c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<b.C0436b, b.a> f48901d = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        final b.a f48902a;

        /* renamed from: b, reason: collision with root package name */
        final c<T> f48903b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<T> f48904c;

        a(b.a id, c<T> callResult, Class<T> type) {
            this.f48904c = type;
            this.f48902a = (b.a) d.a(id);
            this.f48903b = (c) d.a(callResult);
        }

        public void a(H2.c payload) {
            try {
                this.f48903b.f(p.b(payload.b(this.f48904c)));
            } catch (Exception e4) {
                this.f48903b.e(e4);
            }
        }

        public boolean equals(Object o4) {
            if (o4 instanceof a) {
                return this.f48902a.equals(((a) o4).f48902a);
            }
            return false;
        }

        public int hashCode() {
            return this.f48902a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        final b.a f48905a;

        /* renamed from: b, reason: collision with root package name */
        final q<T> f48906b;

        /* renamed from: c, reason: collision with root package name */
        final Class<T> f48907c;

        /* renamed from: d, reason: collision with root package name */
        b.C0436b f48908d = b.C0436b.f48927b;

        b(b.a id, q<T> subscription, Class<T> eventType) {
            this.f48907c = eventType;
            this.f48905a = (b.a) d.a(id);
            this.f48906b = (q) d.a(subscription);
        }

        public void a(H2.c payload) {
            try {
                this.f48906b.f(p.b(payload.b(this.f48907c)));
            } catch (Exception e4) {
                this.f48906b.e(e4);
            }
        }

        public boolean equals(Object o4) {
            if (o4 instanceof b) {
                return this.f48905a.equals(((b) o4).f48905a);
            }
            return false;
        }

        public int hashCode() {
            return this.f48905a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a<?> a(b.a callId) {
        return this.f48899b.get(callId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public b<?> b(b.C0436b subscriptionId) {
        b.a aVar = this.f48901d.get(subscriptionId);
        if (aVar != null) {
            return c(aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b<?> c(b.a requestId) {
        return this.f48900c.get(requestId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b.a d() {
        return b.a.a(this.f48898a.getAndIncrement());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> a<T> e(Class<T> resultType) {
        b.a d4 = d();
        a<T> aVar = new a<>(d4, new c(d4), resultType);
        this.f48899b.put(aVar.f48902a, aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> b<T> f(m remoteWampClient, Class<T> eventType) {
        b.a d4 = d();
        b<T> bVar = new b<>(d4, new q(d4, remoteWampClient), eventType);
        this.f48900c.put(bVar.f48905a, bVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(b.a requestId, b.C0436b subscriptionId) {
        this.f48901d.put(subscriptionId, requestId);
        b<?> c4 = c(requestId);
        if (c4 != null) {
            c4.f48908d = subscriptionId;
            return;
        }
        String format = String.format("Cannot find a subscription record for [%s]", requestId);
        f.d(format, new Object[0]);
        f.a(false, format);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(b.a callId) {
        this.f48899b.remove(callId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(b.C0436b subscriptionId) {
        this.f48900c.remove(this.f48901d.remove(subscriptionId));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(b.a requestId) {
        this.f48900c.remove(requestId);
    }
}
