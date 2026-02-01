package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;

@kotlin.Y(version = "1.1")
@kotlin.jvm.internal.U({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1747#2,3:154\n1726#2,3:157\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
/* renamed from: kotlin.collections.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2089d<K, V> implements Map<K, V>, Y2.a {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final a f51909G = new a(null);

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private volatile Set<? extends K> f51910E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private volatile Collection<? extends V> f51911F;

    @kotlin.jvm.internal.U({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    /* renamed from: kotlin.collections.d$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public final boolean a(@l3.d Map.Entry<?, ?> e4, @l3.e Object obj) {
            kotlin.jvm.internal.F.p(e4, "e");
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!kotlin.jvm.internal.F.g(e4.getKey(), entry.getKey()) || !kotlin.jvm.internal.F.g(e4.getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }

        public final int b(@l3.d Map.Entry<?, ?> e4) {
            int i4;
            kotlin.jvm.internal.F.p(e4, "e");
            Object key = e4.getKey();
            int i5 = 0;
            if (key != null) {
                i4 = key.hashCode();
            } else {
                i4 = 0;
            }
            Object value = e4.getValue();
            if (value != null) {
                i5 = value.hashCode();
            }
            return i4 ^ i5;
        }

        @l3.d
        public final String c(@l3.d Map.Entry<?, ?> e4) {
            kotlin.jvm.internal.F.p(e4, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(e4.getKey());
            sb.append('=');
            sb.append(e4.getValue());
            return sb.toString();
        }

        private a() {
        }
    }

    /* renamed from: kotlin.collections.d$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC2094i<K> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ AbstractC2089d<K, V> f51912F;

        /* renamed from: kotlin.collections.d$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements Iterator<K>, Y2.a {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f51913E;

            /* JADX WARN: Multi-variable type inference failed */
            a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f51913E = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f51913E.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f51913E.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(AbstractC2089d<K, ? extends V> abstractC2089d) {
            this.f51912F = abstractC2089d;
        }

        @Override // kotlin.collections.AbstractC2086a
        public int b() {
            return this.f51912F.size();
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean contains(Object obj) {
            return this.f51912F.containsKey(obj);
        }

        @Override // kotlin.collections.AbstractC2094i, kotlin.collections.AbstractC2086a, java.util.Collection, java.lang.Iterable
        @l3.d
        public Iterator<K> iterator() {
            return new a(this.f51912F.entrySet().iterator());
        }
    }

    /* renamed from: kotlin.collections.d$c */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.l<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ AbstractC2089d<K, V> f51914F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(AbstractC2089d<K, ? extends V> abstractC2089d) {
            super(1);
            this.f51914F = abstractC2089d;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence C(@l3.d Map.Entry<? extends K, ? extends V> it) {
            kotlin.jvm.internal.F.p(it, "it");
            return this.f51914F.n(it);
        }
    }

    /* renamed from: kotlin.collections.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0456d extends AbstractC2086a<V> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ AbstractC2089d<K, V> f51915E;

        /* renamed from: kotlin.collections.d$d$a */
        /* loaded from: classes2.dex */
        public static final class a implements Iterator<V>, Y2.a {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f51916E;

            /* JADX WARN: Multi-variable type inference failed */
            a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f51916E = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f51916E.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f51916E.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C0456d(AbstractC2089d<K, ? extends V> abstractC2089d) {
            this.f51915E = abstractC2089d;
        }

        @Override // kotlin.collections.AbstractC2086a
        public int b() {
            return this.f51915E.size();
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean contains(Object obj) {
            return this.f51915E.containsValue(obj);
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection, java.lang.Iterable
        @l3.d
        public Iterator<V> iterator() {
            return new a(this.f51915E.entrySet().iterator());
        }
    }

    protected AbstractC2089d() {
    }

    private final Map.Entry<K, V> l(K k4) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.F.g(((Map.Entry) obj).getKey(), k4)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Map.Entry) obj;
    }

    private final String m(Object obj) {
        if (obj == this) {
            return "(this Map)";
        }
        return String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n(Map.Entry<? extends K, ? extends V> entry) {
        return m(entry.getKey()) + '=' + m(entry.getValue());
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (l(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.F.g(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(@l3.e Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        kotlin.jvm.internal.F.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v3 = get(key);
        if (!kotlin.jvm.internal.F.g(value, v3)) {
            return false;
        }
        if (v3 == null) {
            kotlin.jvm.internal.F.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
            if (!containsKey(key)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return h();
    }

    @Override // java.util.Map
    public boolean equals(@l3.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (!e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @l3.e
    public V get(Object obj) {
        Map.Entry<K, V> l4 = l(obj);
        if (l4 != null) {
            return l4.getValue();
        }
        return null;
    }

    public abstract Set h();

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @l3.d
    public Set<K> i() {
        if (this.f51910E == null) {
            this.f51910E = new b(this);
        }
        Set<? extends K> set = this.f51910E;
        kotlin.jvm.internal.F.m(set);
        return set;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public int j() {
        return entrySet().size();
    }

    @l3.d
    public Collection<V> k() {
        if (this.f51911F == null) {
            this.f51911F = new C0456d(this);
        }
        Collection<? extends V> collection = this.f51911F;
        kotlin.jvm.internal.F.m(collection);
        return collection;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return i();
    }

    @Override // java.util.Map
    public V put(K k4, V v3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return j();
    }

    @l3.d
    public String toString() {
        String m32;
        m32 = D.m3(entrySet(), ", ", "{", "}", 0, null, new c(this), 24, null);
        return m32;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return k();
    }
}
