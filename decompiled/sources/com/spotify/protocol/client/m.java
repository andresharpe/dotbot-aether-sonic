package com.spotify.protocol.client;

import G2.b;
import com.spotify.protocol.client.error.RemoteClientException;
import com.spotify.protocol.client.r;
import com.spotify.protocol.error.SpotifyAppRemoteException;
import com.spotify.protocol.mappers.JsonMappingException;
import com.spotify.protocol.types.b;

/* loaded from: classes2.dex */
public class m implements k {

    /* renamed from: a, reason: collision with root package name */
    private volatile b.a f48881a;

    /* renamed from: b, reason: collision with root package name */
    private h f48882b;

    /* renamed from: c, reason: collision with root package name */
    private final com.spotify.protocol.client.a f48883c;

    /* renamed from: d, reason: collision with root package name */
    private final r f48884d;

    /* renamed from: e, reason: collision with root package name */
    private final b.a f48885e;

    public m(com.spotify.protocol.client.a communicator, r wampCallsOrchestrator) {
        a aVar = new a();
        this.f48885e = aVar;
        this.f48883c = communicator;
        this.f48884d = wampCallsOrchestrator;
        communicator.k(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RemoteClientException k(H2.c details, String reasonUri) {
        String format;
        try {
            format = details.a();
        } catch (JsonMappingException e4) {
            format = String.format("Could not parse error details: %s", e4.getMessage());
        }
        return new RemoteClientException(format, reasonUri);
    }

    @Override // com.spotify.protocol.client.k
    public <T> c<T> a(Class<T> resultType) {
        r.a<T> e4 = this.f48884d.e(resultType);
        this.f48881a = e4.f48902a;
        try {
            this.f48883c.e();
        } catch (SpotifyAppRemoteException e5) {
            this.f48884d.h(this.f48881a);
            e4.f48903b.e(e5);
        }
        return e4.f48903b;
    }

    @Override // com.spotify.protocol.client.k
    public <T> q<T> b(String topic, Class<T> eventType) {
        r.b<T> f4 = this.f48884d.f(this, eventType);
        try {
            this.f48883c.f(f4.f48905a.b(), null, topic);
        } catch (SpotifyAppRemoteException e4) {
            f4.f48906b.e(e4);
        }
        return f4.f48906b;
    }

    @Override // com.spotify.protocol.client.k
    public <T> void c(q<T> subscription) {
        r.b<?> c4 = this.f48884d.c(subscription.j());
        if (c4 != null) {
            try {
                if (!c4.f48908d.equals(b.C0436b.f48927b)) {
                    this.f48883c.g(this.f48884d.d().b(), c4.f48908d.b());
                    this.f48884d.i(c4.f48908d);
                }
            } catch (SpotifyAppRemoteException e4) {
                f.e(e4, "Cannot unsubscribe", new Object[0]);
                return;
            }
        }
        f.d("Cannot unsubscribe using record: %s", c4);
    }

    @Override // com.spotify.protocol.client.k
    public <T> c<T> d(String procedureUri, Object arguments, Class<T> resultType) {
        r.a<T> e4 = this.f48884d.e(resultType);
        try {
            this.f48883c.i(e4.f48902a.b(), null, procedureUri, null, arguments);
        } catch (SpotifyAppRemoteException e5) {
            e4.f48903b.e(e5);
        }
        return e4.f48903b;
    }

    @Override // com.spotify.protocol.client.k
    public <T> c<T> e(String procedureUri, Class<T> resultType) {
        r.a<T> e4 = this.f48884d.e(resultType);
        try {
            this.f48883c.a(e4.f48902a.b(), null, procedureUri);
        } catch (SpotifyAppRemoteException e5) {
            e4.f48903b.e(e5);
        }
        return e4.f48903b;
    }

    @Override // com.spotify.protocol.client.k
    public void f() {
        try {
            this.f48883c.c();
        } catch (SpotifyAppRemoteException unused) {
        }
    }

    public void l(h listener) {
        this.f48882b = listener;
    }

    /* loaded from: classes2.dex */
    class a implements b.a {
        a() {
        }

        @Override // G2.b.a
        public void a(b.a callRequestId, H2.c details, String errorUri) {
            r.a<?> a4 = m.this.f48884d.a(callRequestId);
            if (a4 != null) {
                m.this.f48884d.h(callRequestId);
                a4.f48903b.e(m.this.k(details, errorUri));
            }
        }

        @Override // G2.b.a
        public void b(H2.c details, String reasonUri) {
            if ("wamp.error.system_shutdown".equals(reasonUri) && m.this.f48882b != null) {
                m.this.f48882b.a();
            }
        }

        @Override // G2.b.a
        public void c(b.a subscribeRequestId, H2.c details, String errorUri) {
            q<?> qVar = m.this.f48884d.c(subscribeRequestId).f48906b;
            if (qVar != null) {
                m.this.f48884d.j(subscribeRequestId);
                qVar.e(m.this.k(details, errorUri));
            }
        }

        @Override // G2.b.a
        public void d(b.C0436b subscriptionId, int publicationId, H2.c details) {
            r.b<?> b4 = m.this.f48884d.b(subscriptionId);
            if (b4 != null) {
                b4.a(details);
            }
        }

        @Override // G2.b.a
        public void e(b.a requestId, H2.c details, H2.c arguments, H2.c argumentsKw) {
            r.a<?> a4 = m.this.f48884d.a(requestId);
            if (a4 != null) {
                m.this.f48884d.h(requestId);
                a4.a(arguments);
            }
        }

        @Override // G2.b.a
        public void f(int sessionId, H2.c details) {
            r.a<?> a4 = m.this.f48884d.a(m.this.f48881a);
            if (a4 != null) {
                m.this.f48884d.h(m.this.f48881a);
                a4.a(details);
            }
        }

        @Override // G2.b.a
        public void g(b.a requestId, b.C0436b subscriptionId) {
            m.this.f48884d.g(requestId, subscriptionId);
            q<T> qVar = ((r.b) d.a(m.this.f48884d.b(subscriptionId))).f48906b;
            if (qVar != 0) {
                qVar.h();
            }
        }

        @Override // G2.b.a
        public void h(b.a requestId) {
        }

        @Override // G2.b.a
        public void j(H2.c details, String reasonUri) {
            r.a<?> a4 = m.this.f48884d.a(m.this.f48881a);
            if (a4 != null) {
                m.this.f48884d.h(m.this.f48881a);
                a4.f48903b.e(m.this.k(details, reasonUri));
            }
        }

        @Override // G2.b.a
        public void i(b.a subscribeRequestId, H2.c details, String errorUri) {
        }
    }
}
