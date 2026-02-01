package com.spotify.protocol.client;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public interface i<T> {
    i<T> a(g errorCallback);

    o<T> b(long interval, TimeUnit timeUnit);

    boolean c();

    void cancel();

    o<T> d();
}
