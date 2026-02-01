package com.bumptech.glide.util;

/* loaded from: classes.dex */
public final class b<K, V> extends androidx.collection.a<K, V> {

    /* renamed from: R, reason: collision with root package name */
    private int f26934R;

    @Override // androidx.collection.l, java.util.Map
    public void clear() {
        this.f26934R = 0;
        super.clear();
    }

    @Override // androidx.collection.l, java.util.Map
    public int hashCode() {
        if (this.f26934R == 0) {
            this.f26934R = super.hashCode();
        }
        return this.f26934R;
    }

    @Override // androidx.collection.l
    public void n(androidx.collection.l<? extends K, ? extends V> lVar) {
        this.f26934R = 0;
        super.n(lVar);
    }

    @Override // androidx.collection.l
    public V o(int i4) {
        this.f26934R = 0;
        return (V) super.o(i4);
    }

    @Override // androidx.collection.l
    public V p(int i4, V v3) {
        this.f26934R = 0;
        return (V) super.p(i4, v3);
    }

    @Override // androidx.collection.l, java.util.Map
    public V put(K k4, V v3) {
        this.f26934R = 0;
        return (V) super.put(k4, v3);
    }
}
