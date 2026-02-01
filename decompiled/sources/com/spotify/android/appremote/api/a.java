package com.spotify.android.appremote.api;

import com.spotify.protocol.client.q;
import com.spotify.protocol.types.Item;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public interface a {
    boolean a();

    @Nonnull
    <T extends Item> q<T> b(@Nullable String uri, @Nullable Class<T> eventType);

    @Nonnull
    b c();

    @Nonnull
    PlayerApi d();

    @Nonnull
    e e();

    @Nonnull
    k f();

    @Nonnull
    d g();

    @Nonnull
    <T extends Item, S extends Item> com.spotify.protocol.client.c<T> h(@Nullable String uri, @Nullable S argument, @Nullable Class<T> resultType);
}
