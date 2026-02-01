package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class k<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<K, V> f27411a;

    private k(int i4) {
        this.f27411a = d.d(i4);
    }

    public static <K, V> k<K, V> b(int i4) {
        return new k<>(i4);
    }

    public Map<K, V> a() {
        if (this.f27411a.size() != 0) {
            return Collections.unmodifiableMap(this.f27411a);
        }
        return Collections.emptyMap();
    }

    public k<K, V> c(K k4, V v3) {
        this.f27411a.put(k4, v3);
        return this;
    }

    public k<K, V> d(Map<K, V> map) {
        this.f27411a.putAll(map);
        return this;
    }
}
