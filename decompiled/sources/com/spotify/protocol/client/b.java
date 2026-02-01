package com.spotify.protocol.client;

import com.spotify.protocol.error.SpotifyAppRemoteException;

/* loaded from: classes2.dex */
public interface b {

    /* loaded from: classes2.dex */
    public interface a {
        void b(byte[] data, int length);
    }

    boolean a();

    void b(a input);

    void c();

    void d(byte[] data, int length) throws SpotifyAppRemoteException;

    boolean e();

    i<Void> f();
}
