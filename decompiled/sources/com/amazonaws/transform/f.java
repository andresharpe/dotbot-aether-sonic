package com.amazonaws.transform;

import java.util.Map;

/* loaded from: classes.dex */
public class f<K, V> implements Map.Entry<K, V> {

    /* renamed from: E, reason: collision with root package name */
    private K f24216E;

    /* renamed from: F, reason: collision with root package name */
    private V f24217F;

    public K a(K k4) {
        this.f24216E = k4;
        return k4;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f24216E;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f24217F;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v3) {
        this.f24217F = v3;
        return v3;
    }
}
