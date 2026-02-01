package androidx.collection;

import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends l<K, V> implements Map<K, V> {

    /* renamed from: Q, reason: collision with root package name */
    @P
    k<K, V> f6457Q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0054a extends k<K, V> {
        C0054a() {
        }

        @Override // androidx.collection.k
        protected void a() {
            a.this.clear();
        }

        @Override // androidx.collection.k
        protected Object b(int i4, int i5) {
            return a.this.f6527F[(i4 << 1) + i5];
        }

        @Override // androidx.collection.k
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // androidx.collection.k
        protected int d() {
            return a.this.f6528G;
        }

        @Override // androidx.collection.k
        protected int e(Object obj) {
            return a.this.j(obj);
        }

        @Override // androidx.collection.k
        protected int f(Object obj) {
            return a.this.l(obj);
        }

        @Override // androidx.collection.k
        protected void g(K k4, V v3) {
            a.this.put(k4, v3);
        }

        @Override // androidx.collection.k
        protected void h(int i4) {
            a.this.o(i4);
        }

        @Override // androidx.collection.k
        protected V i(int i4, V v3) {
            return a.this.p(i4, v3);
        }
    }

    public a() {
    }

    private k<K, V> s() {
        if (this.f6457Q == null) {
            this.f6457Q = new C0054a();
        }
        return this.f6457Q;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return s().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return s().m();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        e(this.f6528G + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean r(@N Collection<?> collection) {
        return k.j(this, collection);
    }

    public boolean t(@N Collection<?> collection) {
        return k.o(this, collection);
    }

    public boolean u(@N Collection<?> collection) {
        return k.p(this, collection);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return s().n();
    }

    public a(int i4) {
        super(i4);
    }

    public a(l lVar) {
        super(lVar);
    }
}
