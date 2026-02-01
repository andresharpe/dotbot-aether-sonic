package com.spotify.protocol.client;

/* loaded from: classes2.dex */
public interface k {
    <T> c<T> a(Class<T> resultType);

    <T> q<T> b(String topic, Class<T> eventType);

    <T> void c(q<T> subscription);

    <T> c<T> d(String procedureUri, Object arguments, Class<T> resultType);

    <T> c<T> e(String procedureUri, Class<T> resultType);

    void f();
}
