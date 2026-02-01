package androidx.collection;

import androidx.annotation.P;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class k<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @P
    k<K, V>.b f6502a;

    /* renamed from: b, reason: collision with root package name */
    @P
    k<K, V>.c f6503b;

    /* renamed from: c, reason: collision with root package name */
    @P
    k<K, V>.e f6504c;

    /* loaded from: classes.dex */
    final class a<T> implements Iterator<T> {

        /* renamed from: E, reason: collision with root package name */
        final int f6505E;

        /* renamed from: F, reason: collision with root package name */
        int f6506F;

        /* renamed from: G, reason: collision with root package name */
        int f6507G;

        /* renamed from: H, reason: collision with root package name */
        boolean f6508H = false;

        a(int i4) {
            this.f6505E = i4;
            this.f6506F = k.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6507G < this.f6506F) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t3 = (T) k.this.b(this.f6507G, this.f6505E);
                this.f6507G++;
                this.f6508H = true;
                return t3;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f6508H) {
                int i4 = this.f6507G - 1;
                this.f6507G = i4;
                this.f6506F--;
                this.f6508H = false;
                k.this.h(i4);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d4 = k.this.d();
            for (Map.Entry<K, V> entry : collection) {
                k.this.g(entry.getKey(), entry.getValue());
            }
            if (d4 != k.this.d()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            k.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e4 = k.this.e(entry.getKey());
            if (e4 < 0) {
                return false;
            }
            return g.c(k.this.b(e4, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return k.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int i4 = 0;
            for (int d4 = k.this.d() - 1; d4 >= 0; d4--) {
                Object b4 = k.this.b(d4, 0);
                Object b5 = k.this.b(d4, 1);
                if (b4 == null) {
                    hashCode = 0;
                } else {
                    hashCode = b4.hashCode();
                }
                if (b5 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = b5.hashCode();
                }
                i4 += hashCode ^ hashCode2;
            }
            return i4;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            if (k.this.d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return k.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k4) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            k.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (k.this.e(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return k.j(k.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return k.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int i4 = 0;
            for (int d4 = k.this.d() - 1; d4 >= 0; d4--) {
                Object b4 = k.this.b(d4, 0);
                if (b4 == null) {
                    hashCode = 0;
                } else {
                    hashCode = b4.hashCode();
                }
                i4 += hashCode;
            }
            return i4;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            if (k.this.d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e4 = k.this.e(obj);
            if (e4 >= 0) {
                k.this.h(e4);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return k.o(k.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return k.p(k.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return k.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return k.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) k.this.r(tArr, 0);
        }
    }

    /* loaded from: classes.dex */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: E, reason: collision with root package name */
        int f6512E;

        /* renamed from: G, reason: collision with root package name */
        boolean f6514G = false;

        /* renamed from: F, reason: collision with root package name */
        int f6513F = -1;

        d() {
            this.f6512E = k.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f6513F++;
                this.f6514G = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f6514G) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!g.c(entry.getKey(), k.this.b(this.f6513F, 0)) || !g.c(entry.getValue(), k.this.b(this.f6513F, 1))) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f6514G) {
                return (K) k.this.b(this.f6513F, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f6514G) {
                return (V) k.this.b(this.f6513F, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6513F < this.f6512E) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            if (this.f6514G) {
                int i4 = 0;
                Object b4 = k.this.b(this.f6513F, 0);
                Object b5 = k.this.b(this.f6513F, 1);
                if (b4 == null) {
                    hashCode = 0;
                } else {
                    hashCode = b4.hashCode();
                }
                if (b5 != null) {
                    i4 = b5.hashCode();
                }
                return hashCode ^ i4;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f6514G) {
                k.this.h(this.f6513F);
                this.f6513F--;
                this.f6512E--;
                this.f6514G = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v3) {
            if (this.f6514G) {
                return (V) k.this.i(this.f6513F, v3);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes.dex */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v3) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            k.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            if (k.this.f(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            if (k.this.d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f4 = k.this.f(obj);
            if (f4 >= 0) {
                k.this.h(f4);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d4 = k.this.d();
            int i4 = 0;
            boolean z3 = false;
            while (i4 < d4) {
                if (collection.contains(k.this.b(i4, 1))) {
                    k.this.h(i4);
                    i4--;
                    d4--;
                    z3 = true;
                }
                i4++;
            }
            return z3;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d4 = k.this.d();
            int i4 = 0;
            boolean z3 = false;
            while (i4 < d4) {
                if (!collection.contains(k.this.b(i4, 1))) {
                    k.this.h(i4);
                    i4--;
                    d4--;
                    z3 = true;
                }
                i4++;
            }
            return z3;
        }

        @Override // java.util.Collection
        public int size() {
            return k.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return k.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) k.this.r(tArr, 1);
        }
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    protected abstract void a();

    protected abstract Object b(int i4, int i5);

    protected abstract Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(K k4, V v3);

    protected abstract void h(int i4);

    protected abstract V i(int i4, V v3);

    public Set<Map.Entry<K, V>> l() {
        if (this.f6502a == null) {
            this.f6502a = new b();
        }
        return this.f6502a;
    }

    public Set<K> m() {
        if (this.f6503b == null) {
            this.f6503b = new c();
        }
        return this.f6503b;
    }

    public Collection<V> n() {
        if (this.f6504c == null) {
            this.f6504c = new e();
        }
        return this.f6504c;
    }

    public Object[] q(int i4) {
        int d4 = d();
        Object[] objArr = new Object[d4];
        for (int i5 = 0; i5 < d4; i5++) {
            objArr[i5] = b(i5, i4);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i4) {
        int d4 = d();
        if (tArr.length < d4) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d4));
        }
        for (int i5 = 0; i5 < d4; i5++) {
            tArr[i5] = b(i5, i4);
        }
        if (tArr.length > d4) {
            tArr[d4] = null;
        }
        return tArr;
    }
}
