package com.spotify.android.appremote.api;

import androidx.core.app.C0;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.spotify.protocol.client.q;
import com.spotify.protocol.types.CrossfadeState;
import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.PlaybackSpeed;
import com.spotify.protocol.types.PlayerContext;
import com.spotify.protocol.types.PlayerState;

/* loaded from: classes2.dex */
public interface PlayerApi {

    /* loaded from: classes2.dex */
    public enum StreamType {
        ALARM(C0.f11617w0);


        @SerializedName("type")
        @JsonProperty("type")
        public final String name;

        StreamType(String name) {
            this.name = name;
        }
    }

    com.spotify.protocol.client.c<PlayerState> a();

    com.spotify.protocol.client.c<Empty> b();

    com.spotify.protocol.client.c<Empty> c();

    com.spotify.protocol.client.c<Empty> d(boolean enabled);

    com.spotify.protocol.client.c<Empty> e();

    q<PlayerState> f();

    com.spotify.protocol.client.c<Empty> g(String uri);

    com.spotify.protocol.client.c<Empty> h(int repeatMode);

    com.spotify.protocol.client.c<Empty> i(String uri, int index);

    com.spotify.protocol.client.c<Empty> j(PlaybackSpeed.PodcastPlaybackSpeed podcastPlaybackSpeed);

    com.spotify.protocol.client.c<Empty> k();

    q<PlayerContext> l();

    com.spotify.protocol.client.c<Empty> m(String uri);

    com.spotify.protocol.client.c<CrossfadeState> n();

    com.spotify.protocol.client.c<Empty> o(long milliseconds);

    com.spotify.protocol.client.c<Empty> p(long positionMs);

    com.spotify.protocol.client.c<Empty> q(String uri, StreamType streamType);

    com.spotify.protocol.client.c<Empty> r();

    com.spotify.protocol.client.c<Empty> s();
}
