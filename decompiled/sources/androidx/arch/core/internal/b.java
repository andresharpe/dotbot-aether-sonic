package androidx.arch.core.internal;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: E, reason: collision with root package name */
    c<K, V> f6378E;

    /* renamed from: F, reason: collision with root package name */
    private c<K, V> f6379F;

    /* renamed from: G, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f6380G = new WeakHashMap<>();

    /* renamed from: H, reason: collision with root package name */
    private int f6381H = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f6385H;
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f6384G;
        }
    }

    /* renamed from: androidx.arch.core.internal.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0051b<K, V> extends e<K, V> {
        C0051b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f6384G;
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f6385H;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: E, reason: collision with root package name */
        @N
        final K f6382E;

        /* renamed from: F, reason: collision with root package name */
        @N
        final V f6383F;

        /* renamed from: G, reason: collision with root package name */
        c<K, V> f6384G;

        /* renamed from: H, reason: collision with root package name */
        c<K, V> f6385H;

        c(@N K k4, @N V v3) {
            this.f6382E = k4;
            this.f6383F = v3;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f6382E.equals(cVar.f6382E) && this.f6383F.equals(cVar.f6383F)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        @N
        public K getKey() {
            return this.f6382E;
        }

        @Override // java.util.Map.Entry
        @N
        public V getValue() {
            return this.f6383F;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f6382E.hashCode() ^ this.f6383F.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v3) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f6382E + "=" + this.f6383F;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: E, reason: collision with root package name */
        private c<K, V> f6386E;

        /* renamed from: F, reason: collision with root package name */
        private boolean f6387F = true;

        d() {
        }

        @Override // androidx.arch.core.internal.b.f
        void a(@N c<K, V> cVar) {
            boolean z3;
            c<K, V> cVar2 = this.f6386E;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f6385H;
                this.f6386E = cVar3;
                if (cVar3 == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f6387F = z3;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f6387F) {
                this.f6387F = false;
                this.f6386E = b.this.f6378E;
            } else {
                c<K, V> cVar2 = this.f6386E;
                if (cVar2 != null) {
                    cVar = cVar2.f6384G;
                } else {
                    cVar = null;
                }
                this.f6386E = cVar;
            }
            return this.f6386E;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6387F) {
                if (b.this.f6378E == null) {
                    return false;
                }
                return true;
            }
            c<K, V> cVar = this.f6386E;
            if (cVar == null || cVar.f6384G == null) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: E, reason: collision with root package name */
        c<K, V> f6389E;

        /* renamed from: F, reason: collision with root package name */
        c<K, V> f6390F;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f6389E = cVar2;
            this.f6390F = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f6390F;
            c<K, V> cVar2 = this.f6389E;
            if (cVar != cVar2 && cVar2 != null) {
                return c(cVar);
            }
            return null;
        }

        @Override // androidx.arch.core.internal.b.f
        public void a(@N c<K, V> cVar) {
            if (this.f6389E == cVar && cVar == this.f6390F) {
                this.f6390F = null;
                this.f6389E = null;
            }
            c<K, V> cVar2 = this.f6389E;
            if (cVar2 == cVar) {
                this.f6389E = b(cVar2);
            }
            if (this.f6390F == cVar) {
                this.f6390F = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f6390F;
            this.f6390F = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6390F != null) {
                return true;
            }
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static abstract class f<K, V> {
        abstract void a(@N c<K, V> cVar);
    }

    @N
    public Iterator<Map.Entry<K, V>> b() {
        C0051b c0051b = new C0051b(this.f6379F, this.f6378E);
        this.f6380G.put(c0051b, Boolean.FALSE);
        return c0051b;
    }

    @P
    public Map.Entry<K, V> c() {
        return this.f6378E;
    }

    @P
    protected c<K, V> d(K k4) {
        c<K, V> cVar = this.f6378E;
        while (cVar != null && !cVar.f6382E.equals(k4)) {
            cVar = cVar.f6384G;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        return false;
    }

    @N
    public b<K, V>.d f() {
        b<K, V>.d dVar = new d();
        this.f6380G.put(dVar, Boolean.FALSE);
        return dVar;
    }

    @P
    public Map.Entry<K, V> g() {
        return this.f6379F;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().hashCode();
        }
        return i4;
    }

    @Override // java.lang.Iterable
    @N
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f6378E, this.f6379F);
        this.f6380G.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c<K, V> j(@N K k4, @N V v3) {
        c<K, V> cVar = new c<>(k4, v3);
        this.f6381H++;
        c<K, V> cVar2 = this.f6379F;
        if (cVar2 == null) {
            this.f6378E = cVar;
            this.f6379F = cVar;
            return cVar;
        }
        cVar2.f6384G = cVar;
        cVar.f6385H = cVar2;
        this.f6379F = cVar;
        return cVar;
    }

    public V k(@N K k4, @N V v3) {
        c<K, V> d4 = d(k4);
        if (d4 != null) {
            return d4.f6383F;
        }
        j(k4, v3);
        return null;
    }

    public V l(@N K k4) {
        c<K, V> d4 = d(k4);
        if (d4 == null) {
            return null;
        }
        this.f6381H--;
        if (!this.f6380G.isEmpty()) {
            Iterator<f<K, V>> it = this.f6380G.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(d4);
            }
        }
        c<K, V> cVar = d4.f6385H;
        if (cVar != null) {
            cVar.f6384G = d4.f6384G;
        } else {
            this.f6378E = d4.f6384G;
        }
        c<K, V> cVar2 = d4.f6384G;
        if (cVar2 != null) {
            cVar2.f6385H = cVar;
        } else {
            this.f6379F = cVar;
        }
        d4.f6384G = null;
        d4.f6385H = null;
        return d4.f6383F;
    }

    public int size() {
        return this.f6381H;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
