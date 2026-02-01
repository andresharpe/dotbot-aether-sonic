package com.spotify.android.appremote.internal;

import G2.a;
import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.VolumeLevel;
import com.spotify.protocol.types.VolumeState;
import javax.annotation.Nonnull;

/* loaded from: classes2.dex */
public class b implements com.spotify.android.appremote.api.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.spotify.protocol.client.k f48798a;

    public b(com.spotify.protocol.client.k client) {
        this.f48798a = client;
    }

    @Override // com.spotify.android.appremote.api.b
    @Nonnull
    public com.spotify.protocol.client.c<Empty> a(float volume) {
        return this.f48798a.d(a.C0008a.f604x, new VolumeLevel(volume), Empty.class);
    }

    @Override // com.spotify.android.appremote.api.b
    @Nonnull
    public com.spotify.protocol.client.c<Empty> b() {
        return this.f48798a.e(a.C0008a.f603w, Empty.class);
    }

    @Override // com.spotify.android.appremote.api.b
    @Nonnull
    public com.spotify.protocol.client.c<Empty> c() {
        return this.f48798a.e(a.C0008a.f602v, Empty.class);
    }

    @Override // com.spotify.android.appremote.api.b
    @Nonnull
    public com.spotify.protocol.client.q<VolumeState> d() {
        return this.f48798a.b(a.d.f622e, VolumeState.class);
    }

    @Override // com.spotify.android.appremote.api.b
    @Nonnull
    public com.spotify.protocol.client.c<Empty> e() {
        return this.f48798a.e(a.C0008a.f601u, Empty.class);
    }
}
