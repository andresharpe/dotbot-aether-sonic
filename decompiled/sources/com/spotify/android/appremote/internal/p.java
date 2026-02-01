package com.spotify.android.appremote.internal;

import com.spotify.protocol.types.b;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public class p implements com.spotify.protocol.client.k {

    /* renamed from: a, reason: collision with root package name */
    private final com.spotify.protocol.client.k f48836a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f48837b = new ArrayList(0);

    /* loaded from: classes2.dex */
    public interface a {
        Throwable a();

        boolean b();
    }

    public p(com.spotify.protocol.client.k remoteClient) {
        this.f48836a = (com.spotify.protocol.client.k) com.spotify.protocol.client.d.a(remoteClient);
    }

    @Override // com.spotify.protocol.client.k
    public <T> com.spotify.protocol.client.c<T> a(Class<T> resultType) {
        return this.f48836a.a(resultType);
    }

    @Override // com.spotify.protocol.client.k
    public <T> com.spotify.protocol.client.q<T> b(String topic, Class<T> eventClass) {
        Throwable h4 = h();
        if (h4 != null) {
            com.spotify.protocol.client.q<T> qVar = new com.spotify.protocol.client.q<>(b.a.f48925b, this);
            qVar.e(h4);
            return qVar;
        }
        return this.f48836a.b(topic, eventClass);
    }

    @Override // com.spotify.protocol.client.k
    public <T> void c(com.spotify.protocol.client.q<T> subscription) {
        Throwable h4 = h();
        if (h4 != null) {
            subscription.e(h4);
        } else {
            this.f48836a.c(subscription);
        }
    }

    @Override // com.spotify.protocol.client.k
    public <T> com.spotify.protocol.client.c<T> d(String procedureUri, Object arguments, Class<T> resultType) {
        Throwable h4 = h();
        if (h4 != null) {
            com.spotify.protocol.client.c<T> cVar = new com.spotify.protocol.client.c<>(b.a.f48925b);
            cVar.e(h4);
            return cVar;
        }
        return this.f48836a.d(procedureUri, arguments, resultType);
    }

    @Override // com.spotify.protocol.client.k
    public <T> com.spotify.protocol.client.c<T> e(String procedureUri, Class<T> resultType) {
        Throwable h4 = h();
        if (h4 != null) {
            com.spotify.protocol.client.c<T> cVar = new com.spotify.protocol.client.c<>(b.a.f48925b);
            cVar.e(h4);
            return cVar;
        }
        return this.f48836a.e(procedureUri, resultType);
    }

    @Override // com.spotify.protocol.client.k
    public void f() {
        this.f48836a.f();
    }

    public void g(a rule) {
        this.f48837b.add((a) com.spotify.protocol.client.d.a(rule));
    }

    @Nullable
    Throwable h() {
        for (a aVar : this.f48837b) {
            if (!aVar.b()) {
                return aVar.a();
            }
        }
        return null;
    }
}
