package com.clj.fastble.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class BleLruHashMap<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: E, reason: collision with root package name */
    private final int f27135E;

    public BleLruHashMap(int i4) {
        super(((int) Math.ceil(i4 / 0.75d)) + 1, 0.75f, true);
        this.f27135E = i4;
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.f27135E && (entry.getValue() instanceof com.clj.fastble.bluetooth.a)) {
            ((com.clj.fastble.bluetooth.a) entry.getValue()).G();
        }
        if (size() > this.f27135E) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K, V> entry : entrySet()) {
            sb.append(String.format("%s:%s ", entry.getKey(), entry.getValue()));
        }
        return sb.toString();
    }
}
