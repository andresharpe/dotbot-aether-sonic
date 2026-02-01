package com.amazonaws.util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class o<K, V> implements Map<K, V> {

    /* renamed from: F, reason: collision with root package name */
    private static final String f24343F = "This is an immutable map.";

    /* renamed from: G, reason: collision with root package name */
    private static final String f24344G = "Duplicate keys are provided.";

    /* renamed from: E, reason: collision with root package name */
    private final Map<K, V> f24345E;

    /* loaded from: classes.dex */
    public static class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final Map<K, V> f24346a = new HashMap();

        public o<K, V> a() {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.f24346a);
            return new o<>(hashMap);
        }

        public b<K, V> b(K k4, V v3) {
            o.l(this.f24346a, k4, v3);
            return this;
        }
    }

    public static <K, V> b<K, V> c() {
        return new b<>();
    }

    public static <K, V> o<K, V> e(K k4, V v3) {
        return new o<>(Collections.singletonMap(k4, v3));
    }

    public static <K, V> o<K, V> h(K k4, V v3, K k5, V v4) {
        HashMap hashMap = new HashMap();
        l(hashMap, k4, v3);
        l(hashMap, k5, v4);
        return new o<>(hashMap);
    }

    public static <K, V> o<K, V> i(K k4, V v3, K k5, V v4, K k6, V v5) {
        HashMap hashMap = new HashMap();
        l(hashMap, k4, v3);
        l(hashMap, k5, v4);
        l(hashMap, k6, v5);
        return new o<>(hashMap);
    }

    public static <K, V> o<K, V> j(K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6) {
        HashMap hashMap = new HashMap();
        l(hashMap, k4, v3);
        l(hashMap, k5, v4);
        l(hashMap, k6, v5);
        l(hashMap, k7, v6);
        return new o<>(hashMap);
    }

    public static <K, V> o<K, V> k(K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6, K k8, V v7) {
        HashMap hashMap = new HashMap();
        l(hashMap, k4, v3);
        l(hashMap, k5, v4);
        l(hashMap, k6, v5);
        l(hashMap, k7, v6);
        l(hashMap, k8, v7);
        return new o<>(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void l(Map<K, V> map, K k4, V v3) {
        if (!map.containsKey(k4)) {
            map.put(k4, v3);
            return;
        }
        throw new IllegalArgumentException(f24344G);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException(f24343F);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f24345E.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f24345E.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.f24345E.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.f24345E.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f24345E.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.f24345E.keySet();
    }

    @Override // java.util.Map
    public V put(K k4, V v3) {
        throw new UnsupportedOperationException(f24343F);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException(f24343F);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException(f24343F);
    }

    @Override // java.util.Map
    public int size() {
        return this.f24345E.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.f24345E.values();
    }

    private o(Map<K, V> map) {
        this.f24345E = map;
    }
}
