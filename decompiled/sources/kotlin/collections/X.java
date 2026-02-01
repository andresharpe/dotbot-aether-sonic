package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.H0;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.jvm.internal.U({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
/* loaded from: classes2.dex */
public class X extends W {

    /* renamed from: a, reason: collision with root package name */
    private static final int f51841a = 1073741824;

    @l3.d
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static <K, V> Map<K, V> d(@l3.d Map<K, V> builder) {
        kotlin.jvm.internal.F.p(builder, "builder");
        return ((MapBuilder) builder).p();
    }

    @kotlin.U
    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final <K, V> Map<K, V> e(int i4, X2.l<? super Map<K, V>, H0> builderAction) {
        Map h4;
        Map<K, V> d4;
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        h4 = h(i4);
        builderAction.C(h4);
        d4 = d(h4);
        return d4;
    }

    @kotlin.U
    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final <K, V> Map<K, V> f(X2.l<? super Map<K, V>, H0> builderAction) {
        Map<K, V> d4;
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        Map g4 = g();
        builderAction.C(g4);
        d4 = d(g4);
        return d4;
    }

    @l3.d
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static final <K, V> Map<K, V> g() {
        return new MapBuilder();
    }

    @l3.d
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static <K, V> Map<K, V> h(int i4) {
        return new MapBuilder(i4);
    }

    public static final <K, V> V i(@l3.d ConcurrentMap<K, V> concurrentMap, K k4, @l3.d X2.a<? extends V> defaultValue) {
        kotlin.jvm.internal.F.p(concurrentMap, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        V v3 = concurrentMap.get(k4);
        if (v3 == null) {
            V n4 = defaultValue.n();
            V putIfAbsent = concurrentMap.putIfAbsent(k4, n4);
            if (putIfAbsent == null) {
                return n4;
            }
            return putIfAbsent;
        }
        return v3;
    }

    @kotlin.U
    public static int j(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @l3.d
    public static <K, V> Map<K, V> k(@l3.d Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.F.p(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.e(), pair.f());
        kotlin.jvm.internal.F.o(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    @l3.d
    @kotlin.Y(version = "1.4")
    public static final <K, V> SortedMap<K, V> l(@l3.d Comparator<? super K> comparator, @l3.d Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(pairs, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        Y.y0(treeMap, pairs);
        return treeMap;
    }

    @l3.d
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m(@l3.d Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.F.p(pairs, "pairs");
        TreeMap treeMap = new TreeMap();
        Y.y0(treeMap, pairs);
        return treeMap;
    }

    @kotlin.internal.f
    private static final Properties n(Map<String, String> map) {
        kotlin.jvm.internal.F.p(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @l3.d
    public static final <K, V> Map<K, V> o(@l3.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.F.p(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.F.o(singletonMap, "with(...)");
        return singletonMap;
    }

    @kotlin.internal.f
    private static final <K, V> Map<K, V> p(Map<K, ? extends V> map) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return o(map);
    }

    @l3.d
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> q(@l3.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return new TreeMap(map);
    }

    @l3.d
    public static final <K, V> SortedMap<K, V> r(@l3.d Map<? extends K, ? extends V> map, @l3.d Comparator<? super K> comparator) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
