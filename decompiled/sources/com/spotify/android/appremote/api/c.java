package com.spotify.android.appremote.api;

import android.content.Context;

/* loaded from: classes2.dex */
public interface c {

    /* loaded from: classes2.dex */
    public interface a {
        void a(j spotifyAppRemote);

        void b(Throwable error);
    }

    void a(j spotifyAppRemote);

    void b(Context context, ConnectionParams params, a connectionListener);
}
