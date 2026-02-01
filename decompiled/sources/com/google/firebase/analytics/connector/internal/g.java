package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.connector.a;
import java.util.Set;

/* loaded from: classes2.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a.b f34858a;

    /* renamed from: b, reason: collision with root package name */
    private final N0.a f34859b;

    /* renamed from: c, reason: collision with root package name */
    private final f f34860c;

    public g(N0.a aVar, a.b bVar) {
        this.f34858a = bVar;
        this.f34859b = aVar;
        f fVar = new f(this);
        this.f34860c = fVar;
        aVar.s(fVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void a(Set set) {
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final a.b zza() {
        return this.f34858a;
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void zzc() {
    }
}
