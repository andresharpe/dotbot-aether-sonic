package com.spotify.android.appremote.internal;

import com.spotify.android.appremote.api.error.SpotifyDisconnectedException;
import com.spotify.android.appremote.internal.p;

/* loaded from: classes2.dex */
public class n implements p.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.spotify.android.appremote.api.a f48835a;

    public n(com.spotify.android.appremote.api.a spotifyAppRemote) {
        this.f48835a = spotifyAppRemote;
    }

    @Override // com.spotify.android.appremote.internal.p.a
    public Throwable a() {
        return new SpotifyDisconnectedException();
    }

    @Override // com.spotify.android.appremote.internal.p.a
    public boolean b() {
        return this.f48835a.a();
    }
}
