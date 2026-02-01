package com.spotify.protocol.client;

import com.spotify.protocol.types.b;

/* loaded from: classes2.dex */
public class q<T> extends j<T> {

    /* renamed from: e, reason: collision with root package name */
    private volatile a<T> f48894e;

    /* renamed from: f, reason: collision with root package name */
    private volatile b f48895f;

    /* renamed from: g, reason: collision with root package name */
    private final b.a f48896g;

    /* renamed from: h, reason: collision with root package name */
    private final k f48897h;

    /* loaded from: classes2.dex */
    public interface a<T> {
        void a(T data);
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b();
    }

    public q(b.a requestId, k remoteWampClient) {
        this.f48896g = requestId;
        this.f48897h = remoteWampClient;
    }

    @Override // com.spotify.protocol.client.j, com.spotify.protocol.client.i
    public void cancel() {
        if (!c()) {
            super.cancel();
            this.f48897h.c(this);
        }
    }

    @Override // com.spotify.protocol.client.j
    protected void g() {
        if (!c() && this.f48894e != null) {
            this.f48894e.a(this.f48878b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        if (!c() && this.f48895f != null) {
            this.f48895f.b();
        }
    }

    final void i() {
        if (!c() && this.f48895f != null) {
            this.f48895f.a();
        }
    }

    public b.a j() {
        return this.f48896g;
    }

    public q<T> k(a<T> eventCallback) {
        this.f48894e = eventCallback;
        if (this.f48878b != null && this.f48878b.l()) {
            g();
        }
        return this;
    }

    public q<T> l(b lifecycleCallback) {
        this.f48895f = lifecycleCallback;
        return this;
    }
}
