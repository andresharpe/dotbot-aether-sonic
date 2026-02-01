package com.spotify.protocol.client;

import com.spotify.protocol.types.b;

/* loaded from: classes2.dex */
public class c<T> extends j<T> {

    /* renamed from: e, reason: collision with root package name */
    private a<T> f48845e;

    /* renamed from: f, reason: collision with root package name */
    private final b.a f48846f;

    /* loaded from: classes2.dex */
    public interface a<T> {
        void onResult(T data);
    }

    public c(b.a requestId) {
        this.f48846f = requestId;
    }

    @Override // com.spotify.protocol.client.j
    protected void g() {
        a<T> aVar;
        if (!c() && (aVar = this.f48845e) != null) {
            aVar.onResult(this.f48878b.c());
        }
    }

    public b.a h() {
        return this.f48846f;
    }

    public c<T> i(a<T> callback) {
        this.f48845e = callback;
        if (this.f48878b != null && this.f48878b.l()) {
            g();
        }
        return this;
    }
}
