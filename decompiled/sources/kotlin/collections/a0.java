package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.H0;
import kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.jvm.internal.U({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n96#1,5:595\n111#1,5:600\n152#1,3:605\n143#1:608\n215#1:609\n216#1:611\n144#1:612\n215#1:613\n216#1:615\n1#2:610\n1#2:614\n1940#3,14:616\n1963#3,14:630\n2310#3,14:644\n2333#3,14:658\n1864#3,3:672\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n76#1:595,5\n89#1:600,5\n125#1:605,3\n135#1:608\n135#1:609\n135#1:611\n135#1:612\n143#1:613\n143#1:615\n135#1:610\n230#1:616,14\n241#1:630,14\n390#1:644,14\n401#1:658,14\n574#1:672,3\n*E\n"})
/* loaded from: classes2.dex */
public class a0 extends Z {
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V> Float A1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = selector.C((Object) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C((Object) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V, R> R B1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) selector.C((Object) it.next());
            while (it.hasNext()) {
                Object obj2 = (R) selector.C((Object) it.next());
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V, R> R C1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) selector.C((Object) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.C((Object) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (Object) obj2;
            }
        }
        return obj;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V> Map.Entry<K, V> D1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return (Map.Entry) D.n4(map.entrySet(), comparator);
    }

    @W2.i(name = "minWithOrThrow")
    @kotlin.Y(version = "1.7")
    @kotlin.internal.f
    private static final <K, V> Map.Entry<K, V> E1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return (Map.Entry) D.o4(map.entrySet(), comparator);
    }

    public static final <K, V> boolean F1(@l3.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return map.isEmpty();
    }

    public static final <K, V> boolean G1(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.C(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <K, V, M extends Map<? extends K, ? extends V>> M H1(@l3.d M m4, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, H0> action) {
        kotlin.jvm.internal.F.p(m4, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        Iterator<Map.Entry<K, V>> it = m4.entrySet().iterator();
        while (it.hasNext()) {
            action.C(it.next());
        }
        return m4;
    }

    @l3.d
    @kotlin.Y(version = "1.4")
    public static final <K, V, M extends Map<? extends K, ? extends V>> M I1(@l3.d M m4, @l3.d X2.p<? super Integer, ? super Map.Entry<? extends K, ? extends V>, H0> action) {
        kotlin.jvm.internal.F.p(m4, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        Iterator<T> it = m4.entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            A2.a aVar = (Object) it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Z();
            }
            action.c0(Integer.valueOf(i4), aVar);
            i4 = i5;
        }
        return m4;
    }

    @l3.d
    public static <K, V> List<Pair<K, V>> J1(@l3.d Map<? extends K, ? extends V> map) {
        List<Pair<K, V>> k4;
        List<Pair<K, V>> H3;
        List<Pair<K, V>> H4;
        kotlin.jvm.internal.F.p(map, "<this>");
        if (map.size() == 0) {
            H4 = CollectionsKt__CollectionsKt.H();
            return H4;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            k4 = C2108v.k(new Pair(next.getKey(), next.getValue()));
            return k4;
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static final <K, V> boolean P0(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!predicate.C(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean Q0(@l3.d Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return !map.isEmpty();
    }

    public static final <K, V> boolean R0(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.C(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @kotlin.internal.f
    private static final <K, V> Iterable<Map.Entry<K, V>> S0(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return map.entrySet();
    }

    @l3.d
    public static <K, V> kotlin.sequences.m<Map.Entry<K, V>> T0(@l3.d Map<? extends K, ? extends V> map) {
        kotlin.sequences.m<Map.Entry<K, V>> A12;
        kotlin.jvm.internal.F.p(map, "<this>");
        A12 = D.A1(map.entrySet());
        return A12;
    }

    @kotlin.internal.f
    private static final <K, V> int U0(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.F.p(map, "<this>");
        return map.size();
    }

    public static final <K, V> int V0(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        if (map.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.C(it.next()).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final <K, V, R> R W0(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        R r4;
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                r4 = transform.C(it.next());
                if (r4 != null) {
                    break;
                }
            } else {
                r4 = null;
                break;
            }
        }
        if (r4 != null) {
            return r4;
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final <K, V, R> R X0(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R C3 = transform.C(it.next());
            if (C3 != null) {
                return C3;
            }
        }
        return null;
    }

    @l3.d
    public static final <K, V, R> List<R> Y0(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            A.q0(arrayList, transform.C(it.next()));
        }
        return arrayList;
    }

    @l3.d
    @W2.i(name = "flatMapSequence")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    public static final <K, V, R> List<R> Z0(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            A.r0(arrayList, transform.C(it.next()));
        }
        return arrayList;
    }

    @l3.d
    @W2.i(name = "flatMapSequenceTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    public static final <K, V, R, C extends Collection<? super R>> C a1(@l3.d Map<? extends K, ? extends V> map, @l3.d C destination, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            A.r0(destination, transform.C(it.next()));
        }
        return destination;
    }

    @l3.d
    public static final <K, V, R, C extends Collection<? super R>> C b1(@l3.d Map<? extends K, ? extends V> map, @l3.d C destination, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            A.q0(destination, transform.C(it.next()));
        }
        return destination;
    }

    @kotlin.internal.e
    public static final <K, V> void c1(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, H0> action) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            action.C(it.next());
        }
    }

    @l3.d
    public static final <K, V, R> List<R> d1(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(transform.C(it.next()));
        }
        return arrayList;
    }

    @l3.d
    public static final <K, V, R> List<R> e1(@l3.d Map<? extends K, ? extends V> map, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R C3 = transform.C(it.next());
            if (C3 != null) {
                arrayList.add(C3);
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <K, V, R, C extends Collection<? super R>> C f1(@l3.d Map<? extends K, ? extends V> map, @l3.d C destination, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R C3 = transform.C(it.next());
            if (C3 != null) {
                destination.add(C3);
            }
        }
        return destination;
    }

    @l3.d
    public static final <K, V, R, C extends Collection<? super R>> C g1(@l3.d Map<? extends K, ? extends V> map, @l3.d C destination, @l3.d X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            destination.add(transform.C(it.next()));
        }
        return destination;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> h1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            entry = null;
        } else {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R C3 = selector.C(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R C4 = selector.C(entry3);
                    if (C3.compareTo(C4) < 0) {
                        entry2 = entry3;
                        C3 = C4;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        }
        return entry;
    }

    @W2.i(name = "maxByOrThrow")
    @kotlin.Y(version = "1.7")
    @kotlin.internal.f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> i1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry = (Object) it.next();
            if (it.hasNext()) {
                R C3 = selector.C(entry);
                do {
                    Map.Entry<K, V> entry2 = (Object) it.next();
                    R C4 = selector.C(entry2);
                    if (C3.compareTo(C4) < 0) {
                        entry = entry2;
                        C3 = C4;
                    }
                } while (it.hasNext());
            }
            return entry;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V> double j1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = selector.C((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C((Object) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V> float k1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = selector.C((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C((Object) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V, R extends Comparable<? super R>> R l1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R C3 = selector.C((Object) it.next());
            while (it.hasNext()) {
                R C4 = selector.C((Object) it.next());
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V, R extends Comparable<? super R>> R m1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R C3 = selector.C((Object) it.next());
        while (it.hasNext()) {
            R C4 = selector.C((Object) it.next());
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V> Double n1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = selector.C((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C((Object) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V> Float o1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = selector.C((Object) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C((Object) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V, R> R p1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) selector.C((Object) it.next());
            while (it.hasNext()) {
                Object obj2 = (R) selector.C((Object) it.next());
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V, R> R q1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) selector.C((Object) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.C((Object) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (Object) obj2;
            }
        }
        return obj;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V> Map.Entry<K, V> r1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return (Map.Entry) D.V3(map.entrySet(), comparator);
    }

    @W2.i(name = "maxWithOrThrow")
    @kotlin.Y(version = "1.7")
    @kotlin.internal.f
    private static final <K, V> Map.Entry<K, V> s1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return (Map.Entry) D.W3(map.entrySet(), comparator);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> t1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            entry = null;
        } else {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R C3 = selector.C(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R C4 = selector.C(entry3);
                    if (C3.compareTo(C4) > 0) {
                        entry2 = entry3;
                        C3 = C4;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        }
        return entry;
    }

    @W2.i(name = "minByOrThrow")
    @kotlin.Y(version = "1.7")
    @kotlin.internal.f
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> u1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry = (Object) it.next();
            if (it.hasNext()) {
                R C3 = selector.C(entry);
                do {
                    Map.Entry<K, V> entry2 = (Object) it.next();
                    R C4 = selector.C(entry2);
                    if (C3.compareTo(C4) > 0) {
                        entry = entry2;
                        C3 = C4;
                    }
                } while (it.hasNext());
            }
            return entry;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V> double v1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = selector.C((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C((Object) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V> float w1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = selector.C((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C((Object) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V, R extends Comparable<? super R>> R x1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R C3 = selector.C((Object) it.next());
            while (it.hasNext()) {
                R C4 = selector.C((Object) it.next());
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V, R extends Comparable<? super R>> R y1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R C3 = selector.C((Object) it.next());
        while (it.hasNext()) {
            R C4 = selector.C((Object) it.next());
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <K, V> Double z1(Map<? extends K, ? extends V> map, X2.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.F.p(map, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = selector.C((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C((Object) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }
}
