package com.spotify.android.appremote.api;

import com.spotify.protocol.client.q;
import com.spotify.protocol.types.Capabilities;
import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.LibraryState;
import com.spotify.protocol.types.UserStatus;

/* loaded from: classes2.dex */
public interface k {
    q<UserStatus> a();

    com.spotify.protocol.client.c<LibraryState> b(String uri);

    q<Capabilities> c();

    com.spotify.protocol.client.c<Capabilities> d();

    com.spotify.protocol.client.c<Empty> e(String uri);

    com.spotify.protocol.client.c<Empty> f(String uri);
}
