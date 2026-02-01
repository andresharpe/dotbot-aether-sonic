package com.spotify.android.appremote.api;

import com.spotify.protocol.client.q;
import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.VolumeState;
import javax.annotation.Nonnull;

/* loaded from: classes2.dex */
public interface b {
    @Nonnull
    com.spotify.protocol.client.c<Empty> a(float volume);

    @Nonnull
    com.spotify.protocol.client.c<Empty> b();

    @Nonnull
    com.spotify.protocol.client.c<Empty> c();

    @Nonnull
    q<VolumeState> d();

    @Nonnull
    com.spotify.protocol.client.c<Empty> e();
}
