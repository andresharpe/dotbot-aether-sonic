package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@kotlin.jvm.internal.U({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n80#1:105,6\n*E\n"})
/* loaded from: classes2.dex */
final class U<K, V> implements T<K, V> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Map<K, V> f51839E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final X2.l<K, V> f51840F;

    /* JADX WARN: Multi-variable type inference failed */
    public U(@l3.d Map<K, ? extends V> map, @l3.d X2.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.F.p(map, "map");
        kotlin.jvm.internal.F.p(lVar, "default");
        this.f51839E = map;
        this.f51840F = lVar;
    }

    @l3.d
    public Set<Map.Entry<K, V>> c() {
        return f().entrySet();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return f().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return f().containsValue(obj);
    }

    @l3.d
    public Set<K> e() {
        return f().keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return c();
    }

    @Override // java.util.Map
    public boolean equals(@l3.e Object obj) {
        return f().equals(obj);
    }

    @Override // kotlin.collections.T
    @l3.d
    public Map<K, V> f() {
        return this.f51839E;
    }

    @Override // kotlin.collections.T
    public V g(K k4) {
        Map<K, V> f4 = f();
        V v3 = f4.get(k4);
        if (v3 == null && !f4.containsKey(k4)) {
            return this.f51840F.C(k4);
        }
        return v3;
    }

    @Override // java.util.Map
    @l3.e
    public V get(Object obj) {
        return f().get(obj);
    }

    public int h() {
        return f().size();
    }

    @Override // java.util.Map
    public int hashCode() {
        return f().hashCode();
    }

    @l3.d
    public Collection<V> i() {
        return f().values();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return f().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return e();
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
        return h();
    }

    @l3.d
    public String toString() {
        return f().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return i();
    }
}
