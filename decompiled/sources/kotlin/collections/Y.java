package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.K0;
import kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.jvm.internal.U({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,804:1\n403#1:814\n414#1:819\n511#1,6:824\n536#1,6:830\n1#2:805\n1238#3,4:806\n1238#3,4:810\n1238#3,4:815\n1238#3,4:820\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n453#1:814\n468#1:819\n526#1:824,6\n551#1:830,6\n403#1:806,4\n414#1:810,4\n453#1:815,4\n468#1:820,4\n*E\n"})
/* loaded from: classes2.dex */
public class Y extends X {
    @l3.d
    public static final <K, V> Map<K, V> A(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.C(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final <K, V> void A0(Map<K, V> map, K k4, V v3) {
        kotlin.jvm.internal.F.p(map, "<this>");
        map.put(k4, v3);
    }

    @l3.d
    public static final <K, V> Map<K, V> B(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super K, Boolean> predicate) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.C(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @l3.d
    public static <K, V> Map<K, V> B0(@l3.d Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Map<K, V> z3;
        Pair<? extends K, ? extends V> next;
        Map<K, V> k4;
        int j4;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                z3 = z();
                return z3;
            }
            if (size != 1) {
                j4 = X.j(collection.size());
                return C0(iterable, new LinkedHashMap(j4));
            }
            if (iterable instanceof List) {
                next = (Pair<? extends K, ? extends V>) ((List) iterable).get(0);
            } else {
                next = iterable.iterator().next();
            }
            k4 = X.k(next);
            return k4;
        }
        return k0(C0(iterable, new LinkedHashMap()));
    }

    @l3.d
    public static final <K, V> Map<K, V> C(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.C(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M C0(@l3.d Iterable<? extends Pair<? extends K, ? extends V>> iterable, @l3.d M destination) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        w0(destination, iterable);
        return destination;
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M D(@l3.d Map<? extends K, ? extends V> map, @l3.d M destination, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.C(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @l3.d
    @kotlin.Y(version = "1.1")
    public static <K, V> Map<K, V> D0(@l3.d Map<? extends K, ? extends V> map) {
        Map<K, V> z3;
        kotlin.jvm.internal.F.p(map, "<this>");
        int size = map.size();
        if (size == 0) {
            z3 = z();
            return z3;
        }
        if (size != 1) {
            return J0(map);
        }
        return X.o(map);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M E(@l3.d Map<? extends K, ? extends V> map, @l3.d M destination, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.C(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <K, V, M extends Map<? super K, ? super V>> M E0(@l3.d Map<? extends K, ? extends V> map, @l3.d M destination) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        destination.putAll(map);
        return destination;
    }

    @l3.d
    public static final <K, V> Map<K, V> F(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super V, Boolean> predicate) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.C(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @l3.d
    public static final <K, V> Map<K, V> F0(@l3.d kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> mVar) {
        kotlin.jvm.internal.F.p(mVar, "<this>");
        return k0(G0(mVar, new LinkedHashMap()));
    }

    @kotlin.internal.f
    private static final <K, V> V G(Map<? extends K, ? extends V> map, K k4) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return map.get(k4);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M G0(@l3.d kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> mVar, @l3.d M destination) {
        kotlin.jvm.internal.F.p(mVar, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        x0(destination, mVar);
        return destination;
    }

    @kotlin.internal.f
    private static final <K, V> V H(Map<K, ? extends V> map, K k4, X2.a<? extends V> defaultValue) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        V v3 = map.get(k4);
        if (v3 == null) {
            return defaultValue.n();
        }
        return v3;
    }

    @l3.d
    public static final <K, V> Map<K, V> H0(@l3.d Pair<? extends K, ? extends V>[] pairArr) {
        Map<K, V> z3;
        Map<K, V> k4;
        int j4;
        kotlin.jvm.internal.F.p(pairArr, "<this>");
        int length = pairArr.length;
        if (length == 0) {
            z3 = z();
            return z3;
        }
        if (length != 1) {
            j4 = X.j(pairArr.length);
            return I0(pairArr, new LinkedHashMap(j4));
        }
        k4 = X.k(pairArr[0]);
        return k4;
    }

    public static final <K, V> V I(@l3.d Map<K, ? extends V> map, K k4, @l3.d X2.a<? extends V> defaultValue) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        V v3 = map.get(k4);
        if (v3 == null && !map.containsKey(k4)) {
            return defaultValue.n();
        }
        return v3;
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M I0(@l3.d Pair<? extends K, ? extends V>[] pairArr, @l3.d M destination) {
        kotlin.jvm.internal.F.p(pairArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        y0(destination, pairArr);
        return destination;
    }

    public static final <K, V> V J(@l3.d Map<K, V> map, K k4, @l3.d X2.a<? extends V> defaultValue) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        V v3 = map.get(k4);
        if (v3 == null) {
            V n4 = defaultValue.n();
            map.put(k4, n4);
            return n4;
        }
        return v3;
    }

    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <K, V> Map<K, V> J0(@l3.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return new LinkedHashMap(map);
    }

    @kotlin.Y(version = "1.1")
    public static <K, V> V K(@l3.d Map<K, ? extends V> map, K k4) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return (V) W.a(map, k4);
    }

    @kotlin.internal.f
    private static final <K, V> Pair<K, V> K0(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.F.p(entry, "<this>");
        return new Pair<>(entry.getKey(), entry.getValue());
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> HashMap<K, V> L() {
        return new HashMap<>();
    }

    @l3.d
    public static final <K, V> HashMap<K, V> M(@l3.d Pair<? extends K, ? extends V>... pairs) {
        int j4;
        kotlin.jvm.internal.F.p(pairs, "pairs");
        j4 = X.j(pairs.length);
        HashMap<K, V> hashMap = new HashMap<>(j4);
        y0(hashMap, pairs);
        return hashMap;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;LX2/a<+TR;>;)TR; */
    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final Object N(Map map, X2.a defaultValue) {
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (map.isEmpty()) {
            return defaultValue.n();
        }
        return map;
    }

    @kotlin.internal.f
    private static final <K, V> boolean O(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return !map.isEmpty();
    }

    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final <K, V> boolean P(Map<? extends K, ? extends V> map) {
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    @kotlin.internal.f
    private static final <K, V> Iterator<Map.Entry<K, V>> Q(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> LinkedHashMap<K, V> R() {
        return new LinkedHashMap<>();
    }

    @l3.d
    public static final <K, V> LinkedHashMap<K, V> S(@l3.d Pair<? extends K, ? extends V>... pairs) {
        int j4;
        kotlin.jvm.internal.F.p(pairs, "pairs");
        j4 = X.j(pairs.length);
        return (LinkedHashMap) I0(pairs, new LinkedHashMap(j4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V, R> Map<R, V> T(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        int j4;
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        j4 = X.j(map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(transform.C(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V, R, M extends Map<? super R, ? super V>> M U(@l3.d Map<? extends K, ? extends V> map, @l3.d M destination, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(transform.C(entry), entry.getValue());
        }
        return destination;
    }

    @kotlin.internal.f
    private static final <K, V> Map<K, V> V() {
        Map<K, V> z3;
        z3 = z();
        return z3;
    }

    @l3.d
    public static <K, V> Map<K, V> W(@l3.d Pair<? extends K, ? extends V>... pairs) {
        Map<K, V> z3;
        int j4;
        kotlin.jvm.internal.F.p(pairs, "pairs");
        if (pairs.length > 0) {
            j4 = X.j(pairs.length);
            return I0(pairs, new LinkedHashMap(j4));
        }
        z3 = z();
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V, R> Map<K, R> X(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        int j4;
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        j4 = X.j(map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(entry.getKey(), transform.C(entry));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V, R, M extends Map<? super K, ? super R>> M Y(@l3.d Map<? extends K, ? extends V> map, @l3.d M destination, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(entry.getKey(), transform.C(entry));
        }
        return destination;
    }

    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <K, V> Map<K, V> Z(@l3.d Map<? extends K, ? extends V> map, @l3.d Iterable<? extends K> keys) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(keys, "keys");
        Map J02 = J0(map);
        A.H0(J02.keySet(), keys);
        return k0(J02);
    }

    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <K, V> Map<K, V> a0(@l3.d Map<? extends K, ? extends V> map, K k4) {
        kotlin.jvm.internal.F.p(map, "<this>");
        Map J02 = J0(map);
        J02.remove(k4);
        return k0(J02);
    }

    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <K, V> Map<K, V> b0(@l3.d Map<? extends K, ? extends V> map, @l3.d kotlin.sequences.m<? extends K> keys) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(keys, "keys");
        Map J02 = J0(map);
        A.J0(J02.keySet(), keys);
        return k0(J02);
    }

    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <K, V> Map<K, V> c0(@l3.d Map<? extends K, ? extends V> map, @l3.d K[] keys) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(keys, "keys");
        Map J02 = J0(map);
        A.K0(J02.keySet(), keys);
        return k0(J02);
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> void d0(Map<K, V> map, Iterable<? extends K> keys) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(keys, "keys");
        A.H0(map.keySet(), keys);
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> void e0(Map<K, V> map, K k4) {
        kotlin.jvm.internal.F.p(map, "<this>");
        map.remove(k4);
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> void f0(Map<K, V> map, kotlin.sequences.m<? extends K> keys) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(keys, "keys");
        A.J0(map.keySet(), keys);
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> void g0(Map<K, V> map, K[] keys) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(keys, "keys");
        A.K0(map.keySet(), keys);
    }

    @W2.i(name = "mutableIterator")
    @kotlin.internal.f
    private static final <K, V> Iterator<Map.Entry<K, V>> h0(Map<K, V> map) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <K, V> Map<K, V> i0() {
        return new LinkedHashMap();
    }

    @l3.d
    public static <K, V> Map<K, V> j0(@l3.d Pair<? extends K, ? extends V>... pairs) {
        int j4;
        kotlin.jvm.internal.F.p(pairs, "pairs");
        j4 = X.j(pairs.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
        y0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V> Map<K, V> k0(@l3.d Map<K, ? extends V> map) {
        Map<K, V> z3;
        kotlin.jvm.internal.F.p(map, "<this>");
        int size = map.size();
        if (size == 0) {
            z3 = z();
            return z3;
        }
        if (size == 1) {
            return X.o(map);
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <K, V> Map<K, V> l0(Map<K, ? extends V> map) {
        Map<K, V> z3;
        if (map == 0) {
            z3 = z();
            return z3;
        }
        return map;
    }

    @l3.d
    public static final <K, V> Map<K, V> m0(@l3.d Map<? extends K, ? extends V> map, @l3.d Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Map<K, V> B02;
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(pairs, "pairs");
        if (map.isEmpty()) {
            B02 = B0(pairs);
            return B02;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @l3.d
    public static final <K, V> Map<K, V> n0(@l3.d Map<? extends K, ? extends V> map, @l3.d Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @l3.d
    public static final <K, V> Map<K, V> o0(@l3.d Map<? extends K, ? extends V> map, @l3.d Pair<? extends K, ? extends V> pair) {
        Map<K, V> k4;
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(pair, "pair");
        if (map.isEmpty()) {
            k4 = X.k(pair);
            return k4;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.e(), pair.f());
        return linkedHashMap;
    }

    @l3.d
    public static final <K, V> Map<K, V> p0(@l3.d Map<? extends K, ? extends V> map, @l3.d kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        x0(linkedHashMap, pairs);
        return k0(linkedHashMap);
    }

    @l3.d
    public static final <K, V> Map<K, V> q0(@l3.d Map<? extends K, ? extends V> map, @l3.d Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(pairs, "pairs");
        if (map.isEmpty()) {
            return H0(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        y0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @kotlin.internal.f
    private static final <K, V> void r0(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(pairs, "pairs");
        w0(map, pairs);
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.6")
    @kotlin.internal.f
    private static final <K, V> Map<K, V> s(int i4, @InterfaceC2084c X2.l<? super Map<K, V>, H0> builderAction) {
        Map h4;
        Map<K, V> d4;
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        h4 = X.h(i4);
        builderAction.C(h4);
        d4 = X.d(h4);
        return d4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <K, V> void s0(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(map2, "map");
        map.putAll(map2);
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.6")
    @kotlin.internal.f
    private static final <K, V> Map<K, V> t(@InterfaceC2084c X2.l<? super Map<K, V>, H0> builderAction) {
        Map<K, V> d4;
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        Map g4 = X.g();
        builderAction.C(g4);
        d4 = X.d(g4);
        return d4;
    }

    @kotlin.internal.f
    private static final <K, V> void t0(Map<? super K, ? super V> map, Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(pair, "pair");
        map.put(pair.e(), pair.f());
    }

    @kotlin.internal.f
    private static final <K, V> K u(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.F.p(entry, "<this>");
        return entry.getKey();
    }

    @kotlin.internal.f
    private static final <K, V> void u0(Map<? super K, ? super V> map, kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(pairs, "pairs");
        x0(map, pairs);
    }

    @kotlin.internal.f
    private static final <K, V> V v(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.F.p(entry, "<this>");
        return entry.getValue();
    }

    @kotlin.internal.f
    private static final <K, V> void v0(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(pairs, "pairs");
        y0(map, pairs);
    }

    @kotlin.internal.f
    private static final <K, V> boolean w(Map<? extends K, ? extends V> map, K k4) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return map.containsKey(k4);
    }

    public static final <K, V> void w0(@l3.d Map<? super K, ? super V> map, @l3.d Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.a(), pair.b());
        }
    }

    @kotlin.internal.f
    private static final <K> boolean x(Map<? extends K, ?> map, K k4) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return map.containsKey(k4);
    }

    public static final <K, V> void x0(@l3.d Map<? super K, ? super V> map, @l3.d kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.a(), pair.b());
        }
    }

    @kotlin.internal.f
    private static final <K, V> boolean y(Map<K, ? extends V> map, V v3) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return map.containsValue(v3);
    }

    public static final <K, V> void y0(@l3.d Map<? super K, ? super V> map, @l3.d Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.a(), pair.b());
        }
    }

    @l3.d
    public static <K, V> Map<K, V> z() {
        G g4 = G.f51832E;
        kotlin.jvm.internal.F.n(g4, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return g4;
    }

    @kotlin.internal.f
    private static final <K, V> V z0(Map<? extends K, V> map, K k4) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return (V) kotlin.jvm.internal.X.k(map).remove(k4);
    }
}
