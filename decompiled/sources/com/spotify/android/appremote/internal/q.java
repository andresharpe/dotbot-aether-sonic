package com.spotify.android.appremote.internal;

import G2.a;
import com.spotify.protocol.types.Capabilities;
import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.Identifier;
import com.spotify.protocol.types.LibraryState;
import com.spotify.protocol.types.UserStatus;

/* loaded from: classes2.dex */
public class q implements com.spotify.android.appremote.api.k {

    /* renamed from: a, reason: collision with root package name */
    private final com.spotify.protocol.client.k f48838a;

    public q(com.spotify.protocol.client.k remoteClient) {
        this.f48838a = remoteClient;
    }

    @Override // com.spotify.android.appremote.api.k
    public com.spotify.protocol.client.q<UserStatus> a() {
        return this.f48838a.b(a.d.f618a, UserStatus.class);
    }

    @Override // com.spotify.android.appremote.api.k
    public com.spotify.protocol.client.c<LibraryState> b(String uri) {
        return this.f48838a.d(a.C0008a.f595o, new Identifier(uri), LibraryState.class);
    }

    @Override // com.spotify.android.appremote.api.k
    public com.spotify.protocol.client.q<Capabilities> c() {
        return this.f48838a.b(a.d.f621d, Capabilities.class);
    }

    @Override // com.spotify.android.appremote.api.k
    public com.spotify.protocol.client.c<Capabilities> d() {
        return this.f48838a.e(a.C0008a.f596p, Capabilities.class);
    }

    @Override // com.spotify.android.appremote.api.k
    public com.spotify.protocol.client.c<Empty> e(String uri) {
        return this.f48838a.d(a.C0008a.f594n, new LibraryState(uri, true, false), Empty.class);
    }

    @Override // com.spotify.android.appremote.api.k
    public com.spotify.protocol.client.c<Empty> f(String uri) {
        return this.f48838a.d(a.C0008a.f594n, new LibraryState(uri, false, false), Empty.class);
    }
}
