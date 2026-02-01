package kotlin.collections;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@kotlin.Y(version = "1.1")
/* renamed from: kotlin.collections.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2092g<K, V> extends AbstractMap<K, V> implements Map<K, V>, Y2.g {
    public abstract Set c();

    public /* bridge */ Set<Object> e() {
        return super.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return c();
    }

    public /* bridge */ int h() {
        return super.size();
    }

    public /* bridge */ Collection<Object> i() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @l3.e
    public abstract V put(K k4, V v3);

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) i();
    }
}
