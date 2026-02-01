package com.spotify.android.appremote.internal;

import G2.a;
import com.spotify.android.appremote.api.PlayerApi;
import com.spotify.protocol.types.CrossfadeState;
import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.PlaybackPosition;
import com.spotify.protocol.types.PlaybackSpeed;
import com.spotify.protocol.types.PlayerContext;
import com.spotify.protocol.types.PlayerState;
import com.spotify.protocol.types.Repeat;
import com.spotify.protocol.types.Shuffle;
import com.spotify.protocol.types.Uri;
import com.spotify.protocol.types.UriWithOptionExtras;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public class i implements PlayerApi {

    /* renamed from: b, reason: collision with root package name */
    private static final int f48803b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f48804c = 1;

    /* renamed from: a, reason: collision with root package name */
    private final com.spotify.protocol.client.k f48805a;

    public i(com.spotify.protocol.client.k client) {
        this.f48805a = client;
    }

    @Nonnull
    private static String t(@Nullable String uri) {
        if (uri == null) {
            return "";
        }
        return uri;
    }

    private com.spotify.protocol.client.c<Empty> u(PlaybackSpeed playbackSpeed) {
        return this.f48805a.d(a.C0008a.f587g, playbackSpeed, Empty.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<PlayerState> a() {
        return this.f48805a.e(a.C0008a.f583c, PlayerState.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> b() {
        return u(new PlaybackSpeed(0));
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> c() {
        return u(new PlaybackSpeed(1));
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> d(boolean enabled) {
        return this.f48805a.d(a.C0008a.f590j, new Shuffle(enabled), Empty.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> e() {
        return this.f48805a.e(a.C0008a.f593m, Empty.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.q<PlayerState> f() {
        return this.f48805a.b(a.d.f619b, PlayerState.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> g(@Nullable String uri) {
        return this.f48805a.d(a.C0008a.f585e, new Uri(t(uri)), Empty.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> h(int repeatMode) {
        return this.f48805a.d(a.C0008a.f592l, new Repeat(repeatMode), Empty.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> i(@Nullable String uri, int index) {
        return this.f48805a.d(a.C0008a.f580A, new UriWithOptionExtras(t(uri), new String[]{String.valueOf(index)}), Empty.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> j(PlaybackSpeed.PodcastPlaybackSpeed podcastPlaybackSpeed) {
        return u(new PlaybackSpeed(podcastPlaybackSpeed.b()));
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> k() {
        return this.f48805a.e(a.C0008a.f591k, Empty.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.q<PlayerContext> l() {
        return this.f48805a.b(a.d.f620c, PlayerContext.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> m(@Nullable String uri) {
        return this.f48805a.d(a.C0008a.f586f, new Uri(t(uri)), Empty.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<CrossfadeState> n() {
        return this.f48805a.e(a.C0008a.f605y, CrossfadeState.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> o(long milliseconds) {
        return this.f48805a.d(a.C0008a.f598r, new PlaybackPosition(milliseconds), Empty.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> p(long positionMs) {
        return this.f48805a.d(a.C0008a.f597q, new PlaybackPosition(positionMs), Empty.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> q(@Nullable String uri, PlayerApi.StreamType streamType) {
        r.a(streamType);
        return this.f48805a.d(a.C0008a.f606z, new UriWithOptionExtras(t(uri), new String[]{streamType.name}), Empty.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> r() {
        return this.f48805a.e(a.C0008a.f582b, Empty.class);
    }

    @Override // com.spotify.android.appremote.api.PlayerApi
    public com.spotify.protocol.client.c<Empty> s() {
        return this.f48805a.e(a.C0008a.f581a, Empty.class);
    }
}
