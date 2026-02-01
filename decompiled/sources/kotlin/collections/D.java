package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.C2122h0;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;
import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.Pair;
import kotlin.comparisons.g;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.t0;
import kotlin.x0;

@kotlin.jvm.internal.U({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3683:1\n288#1,2:3684\n518#1,7:3686\n533#1,6:3693\n857#1,2:3700\n788#1:3702\n1864#1,2:3703\n789#1,2:3705\n1866#1:3707\n791#1:3708\n1864#1,3:3709\n809#1,2:3712\n847#1,2:3714\n1253#1,4:3720\n1222#1,4:3724\n1238#1,4:3728\n1285#1,4:3732\n1446#1,5:3736\n1461#1,5:3741\n1502#1,3:3746\n1505#1,3:3756\n1520#1,3:3759\n1523#1,3:3769\n1620#1,3:3786\n1590#1,4:3789\n1579#1:3793\n1864#1,2:3794\n1866#1:3797\n1580#1:3798\n1864#1,3:3799\n1611#1:3802\n1855#1:3803\n1856#1:3805\n1612#1:3806\n1855#1,2:3807\n1864#1,3:3809\n2847#1,3:3812\n2850#1,6:3816\n2872#1,3:3822\n2875#1,7:3826\n857#1,2:3833\n819#1:3835\n847#1,2:3836\n819#1:3838\n847#1,2:3839\n819#1:3841\n847#1,2:3842\n3405#1,8:3848\n3433#1,7:3856\n3464#1,10:3863\n1#2:3699\n1#2:3796\n1#2:3804\n1#2:3815\n1#2:3825\n37#3,2:3716\n37#3,2:3718\n372#4,7:3749\n372#4,7:3762\n372#4,7:3772\n372#4,7:3779\n32#5,2:3844\n32#5,2:3846\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n167#1:3684,2\n177#1:3686,7\n187#1:3693,6\n766#1:3700,2\n777#1:3702\n777#1:3703,2\n777#1:3705,2\n777#1:3707\n777#1:3708\n788#1:3709,3\n800#1:3712,2\n819#1:3714,2\n1180#1:3720,4\n1195#1:3724,4\n1209#1:3728,4\n1272#1:3732,4\n1360#1:3736,5\n1373#1:3741,5\n1477#1:3746,3\n1477#1:3756,3\n1490#1:3759,3\n1490#1:3769,3\n1549#1:3786,3\n1559#1:3789,4\n1569#1:3793\n1569#1:3794,2\n1569#1:3797\n1569#1:3798\n1579#1:3799,3\n1603#1:3802\n1603#1:3803\n1603#1:3805\n1603#1:3806\n1611#1:3807,2\n2645#1:3809,3\n2949#1:3812,3\n2949#1:3816,6\n2967#1:3822,3\n2967#1:3826,7\n3143#1:3833,2\n3151#1:3835\n3151#1:3836,2\n3161#1:3838\n3161#1:3839,2\n3171#1:3841\n3171#1:3842,2\n3394#1:3848,8\n3422#1:3856,7\n3451#1:3863,10\n1569#1:3796\n1603#1:3804\n2949#1:3815\n2967#1:3825\n1032#1:3716,2\n1075#1:3718,2\n1477#1:3749,7\n1490#1:3762,7\n1504#1:3772,7\n1522#1:3779,7\n3339#1:3844,2\n3381#1:3846,2\n*E\n"})
/* loaded from: classes2.dex */
public class D extends C {

    @kotlin.jvm.internal.U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,680:1\n3524#2:681\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlin.sequences.m<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f51822a;

        public a(Iterable iterable) {
            this.f51822a = iterable;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<T> iterator() {
            return this.f51822a.iterator();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> extends Lambda implements X2.l<Integer, T> {

        /* renamed from: F */
        final /* synthetic */ int f51823F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4) {
            super(1);
            this.f51823F = i4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ Object C(Integer num) {
            return c(num.intValue());
        }

        public final T c(int i4) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f51823F + '.');
        }
    }

    @kotlin.jvm.internal.U({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n*L\n1#1,3683:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class c<K, T> implements I<T, K> {

        /* renamed from: a */
        final /* synthetic */ Iterable<T> f51824a;

        /* renamed from: b */
        final /* synthetic */ X2.l<T, K> f51825b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Iterable<? extends T> iterable, X2.l<? super T, ? extends K> lVar) {
            this.f51824a = iterable;
            this.f51825b = lVar;
        }

        @Override // kotlin.collections.I
        public K a(T t3) {
            return this.f51825b.C(t3);
        }

        @Override // kotlin.collections.I
        @l3.d
        public Iterator<T> b() {
            return this.f51824a.iterator();
        }
    }

    /* loaded from: classes2.dex */
    static final class d<T> extends Lambda implements X2.a<Iterator<? extends T>> {

        /* renamed from: F */
        final /* synthetic */ Iterable<T> f51826F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Iterable<? extends T> iterable) {
            super(0);
            this.f51826F = iterable;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c */
        public final Iterator<T> n() {
            return this.f51826F.iterator();
        }
    }

    @l3.d
    public static <T> kotlin.sequences.m<T> A1(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        return new a(iterable);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T A2(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (T t3 : iterable) {
            if (predicate.C(t3).booleanValue()) {
                return t3;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C A3(@l3.d Iterable<? extends T> iterable, @l3.d C destination, @l3.d X2.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int i4 = 0;
        for (T t3 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            R c02 = transform.c0(Integer.valueOf(i4), t3);
            if (c02 != null) {
                destination.add(c02);
            }
            i4 = i5;
        }
        return destination;
    }

    @l3.d
    public static final <T> List<T> A4(@l3.d Iterable<? extends T> iterable, T t3) {
        List<T> E4;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            E4 = E4((Collection) iterable, t3);
            return E4;
        }
        ArrayList arrayList = new ArrayList();
        A.q0(arrayList, iterable);
        arrayList.add(t3);
        return arrayList;
    }

    @W2.i(name = "sumOfDouble")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> double A5(Iterable<? extends T> iterable, X2.l<? super T, Double> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        while (it.hasNext()) {
            d4 += selector.C(it.next()).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final <T, K, V> Map<K, V> B1(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        int b02;
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        b02 = C2109w.b0(iterable, 10);
        j4 = X.j(b02);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> C3 = transform.C(it.next());
            linkedHashMap.put(C3.e(), C3.f());
        }
        return linkedHashMap;
    }

    public static <T> T B2(@l3.d List<? extends T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C B3(@l3.d Iterable<? extends T> iterable, @l3.d C destination, @l3.d X2.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int i4 = 0;
        for (T t3 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            destination.add(transform.c0(Integer.valueOf(i4), t3));
            i4 = i5;
        }
        return destination;
    }

    @l3.d
    public static final <T> List<T> B4(@l3.d Iterable<? extends T> iterable, @l3.d kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        ArrayList arrayList = new ArrayList();
        A.q0(arrayList, iterable);
        A.r0(arrayList, elements);
        return arrayList;
    }

    @W2.i(name = "sumOfFloat")
    public static final float B5(@l3.d Iterable<Float> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float f4 = 0.0f;
        while (it.hasNext()) {
            f4 += it.next().floatValue();
        }
        return f4;
    }

    @l3.d
    public static final <T, K> Map<K, T> C1(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends K> keySelector) {
        int b02;
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        b02 = C2109w.b0(iterable, 10);
        j4 = X.j(b02);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (T t3 : iterable) {
            linkedHashMap.put(keySelector.C(t3), t3);
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final <T, R> R C2(Iterable<? extends T> iterable, X2.l<? super T, ? extends R> transform) {
        R r4;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
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
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @l3.d
    public static final <T, R> List<R> C3(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R C3 = transform.C(it.next());
            if (C3 != null) {
                arrayList.add(C3);
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <T> List<T> C4(@l3.d Iterable<? extends T> iterable, @l3.d T[] elements) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        if (iterable instanceof Collection) {
            return G4((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        A.q0(arrayList, iterable);
        A.s0(arrayList, elements);
        return arrayList;
    }

    @W2.i(name = "sumOfInt")
    public static final int C5(@l3.d Iterable<Integer> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().intValue();
        }
        return i4;
    }

    @l3.d
    public static final <T, K, V> Map<K, V> D1(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends K> keySelector, @l3.d X2.l<? super T, ? extends V> valueTransform) {
        int b02;
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        b02 = C2109w.b0(iterable, 10);
        j4 = X.j(b02);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (T t3 : iterable) {
            linkedHashMap.put(keySelector.C(t3), valueTransform.C(t3));
        }
        return linkedHashMap;
    }

    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final <T, R> R D2(Iterable<? extends T> iterable, X2.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R C3 = transform.C(it.next());
            if (C3 != null) {
                return C3;
            }
        }
        return null;
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C D3(@l3.d Iterable<? extends T> iterable, @l3.d C destination, @l3.d X2.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R C3 = transform.C(it.next());
            if (C3 != null) {
                destination.add(C3);
            }
        }
        return destination;
    }

    @l3.d
    public static <T> List<T> D4(@l3.d Collection<? extends T> collection, @l3.d Iterable<? extends T> elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        A.q0(arrayList2, elements);
        return arrayList2;
    }

    @W2.i(name = "sumOfInt")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> int D5(Iterable<? extends T> iterable, X2.l<? super T, Integer> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += selector.C(it.next()).intValue();
        }
        return i4;
    }

    @l3.d
    public static final <T, K, M extends Map<? super K, ? super T>> M E1(@l3.d Iterable<? extends T> iterable, @l3.d M destination, @l3.d X2.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (T t3 : iterable) {
            destination.put(keySelector.C(t3), t3);
        }
        return destination;
    }

    @l3.e
    public static final <T> T E2(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C E3(@l3.d Iterable<? extends T> iterable, @l3.d C destination, @l3.d X2.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(transform.C(it.next()));
        }
        return destination;
    }

    @l3.d
    public static <T> List<T> E4(@l3.d Collection<? extends T> collection, T t3) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t3);
        return arrayList;
    }

    @W2.i(name = "sumOfLong")
    public static final long E5(@l3.d Iterable<Long> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += it.next().longValue();
        }
        return j4;
    }

    @l3.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M F1(@l3.d Iterable<? extends T> iterable, @l3.d M destination, @l3.d X2.l<? super T, ? extends K> keySelector, @l3.d X2.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (T t3 : iterable) {
            destination.put(keySelector.C(t3), valueTransform.C(t3));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @l3.e
    public static final <T> T F2(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (T t3 : iterable) {
            if (predicate.C(t3).booleanValue()) {
                return t3;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T F3(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R C3 = selector.C(next);
        do {
            T next2 = it.next();
            R C4 = selector.C(next2);
            next = next;
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @l3.d
    public static final <T> List<T> F4(@l3.d Collection<? extends T> collection, @l3.d kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        A.r0(arrayList, elements);
        return arrayList;
    }

    @W2.i(name = "sumOfLong")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> long F5(Iterable<? extends T> iterable, X2.l<? super T, Long> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += selector.C(it.next()).longValue();
        }
        return j4;
    }

    @l3.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M G1(@l3.d Iterable<? extends T> iterable, @l3.d M destination, @l3.d X2.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> C3 = transform.C(it.next());
            destination.put(C3.e(), C3.f());
        }
        return destination;
    }

    @l3.e
    public static <T> T G2(@l3.d List<? extends T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @W2.i(name = "maxByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T G3(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            R C3 = selector.C(next);
            do {
                T next2 = it.next();
                R C4 = selector.C(next2);
                next = next;
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                    next = next2;
                }
            } while (it.hasNext());
            return (T) next;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    public static final <T> List<T> G4(@l3.d Collection<? extends T> collection, @l3.d T[] elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        A.s0(arrayList, elements);
        return arrayList;
    }

    @W2.i(name = "sumOfShort")
    public static final int G5(@l3.d Iterable<Short> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().shortValue();
        }
        return i4;
    }

    @l3.d
    @kotlin.Y(version = "1.3")
    public static final <K, V> Map<K, V> H1(@l3.d Iterable<? extends K> iterable, @l3.d X2.l<? super K, ? extends V> valueSelector) {
        int b02;
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        b02 = C2109w.b0(iterable, 10);
        j4 = X.j(b02);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (K k4 : iterable) {
            linkedHashMap.put(k4, valueSelector.C(k4));
        }
        return linkedHashMap;
    }

    @l3.d
    public static final <T, R> List<R> H2(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            A.q0(arrayList, transform.C(it.next()));
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> double H3(Iterable<? extends T> iterable, X2.l<? super T, Double> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = selector.C(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.internal.f
    private static final <T> List<T> H4(Iterable<? extends T> iterable, T t3) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        return A4(iterable, t3);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final <T> int H5(Iterable<? extends T> iterable, X2.l<? super T, t0> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int l4 = t0.l(0);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            l4 = t0.l(l4 + selector.C(it.next()).l0());
        }
        return l4;
    }

    @l3.d
    @kotlin.Y(version = "1.3")
    public static final <K, V, M extends Map<? super K, ? super V>> M I1(@l3.d Iterable<? extends K> iterable, @l3.d M destination, @l3.d X2.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        for (K k4 : iterable) {
            destination.put(k4, valueSelector.C(k4));
        }
        return destination;
    }

    @W2.i(name = "flatMapIndexedIterable")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> List<R> I2(Iterable<? extends T> iterable, X2.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (T t3 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            A.q0(arrayList, transform.c0(Integer.valueOf(i4), t3));
            i4 = i5;
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> float I3(Iterable<? extends T> iterable, X2.l<? super T, Float> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = selector.C(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @kotlin.internal.f
    private static final <T> List<T> I4(Collection<? extends T> collection, T t3) {
        List<T> E4;
        kotlin.jvm.internal.F.p(collection, "<this>");
        E4 = E4(collection, t3);
        return E4;
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @kotlin.N
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final <T> long I5(Iterable<? extends T> iterable, X2.l<? super T, x0> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long l4 = x0.l(0L);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            l4 = x0.l(l4 + selector.C(it.next()).l0());
        }
        return l4;
    }

    @W2.i(name = "averageOfByte")
    public static final double J1(@l3.d Iterable<Byte> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        while (it.hasNext()) {
            d4 += it.next().byteValue();
            i4++;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Y();
            }
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    @W2.i(name = "flatMapIndexedIterableTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R, C extends Collection<? super R>> C J2(Iterable<? extends T> iterable, C destination, X2.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int i4 = 0;
        for (T t3 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            A.q0(destination, transform.c0(Integer.valueOf(i4), t3));
            i4 = i5;
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R J3(Iterable<? extends T> iterable, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R C3 = selector.C(it.next());
            while (it.hasNext()) {
                R C4 = selector.C(it.next());
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final <T> T J4(Collection<? extends T> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        return (T) K4(collection, Random.f52425E);
    }

    @l3.d
    public static <T> List<T> J5(@l3.d Iterable<? extends T> iterable, int i4) {
        List<T> k4;
        List<T> V5;
        List<T> H3;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (iterable instanceof Collection) {
                if (i4 >= ((Collection) iterable).size()) {
                    V5 = V5(iterable);
                    return V5;
                }
                if (i4 == 1) {
                    k4 = C2108v.k(z2(iterable));
                    return k4;
                }
            }
            ArrayList arrayList = new ArrayList(i4);
            Iterator<? extends T> it = iterable.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return CollectionsKt__CollectionsKt.T(arrayList);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @W2.i(name = "averageOfDouble")
    public static final double K1(@l3.d Iterable<Double> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        while (it.hasNext()) {
            d4 += it.next().doubleValue();
            i4++;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Y();
            }
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    @W2.i(name = "flatMapIndexedSequence")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> List<R> K2(Iterable<? extends T> iterable, X2.p<? super Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (T t3 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            A.r0(arrayList, transform.c0(Integer.valueOf(i4), t3));
            i4 = i5;
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R K3(Iterable<? extends T> iterable, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R C3 = selector.C(it.next());
        while (it.hasNext()) {
            R C4 = selector.C(it.next());
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @kotlin.Y(version = "1.3")
    public static final <T> T K4(@l3.d Collection<? extends T> collection, @l3.d Random random) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (!collection.isEmpty()) {
            return (T) g2(collection, random.m(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @l3.d
    public static final <T> List<T> K5(@l3.d List<? extends T> list, int i4) {
        Object p32;
        List<T> k4;
        List<T> V5;
        List<T> H3;
        kotlin.jvm.internal.F.p(list, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            int size = list.size();
            if (i4 >= size) {
                V5 = V5(list);
                return V5;
            }
            if (i4 == 1) {
                p32 = p3(list);
                k4 = C2108v.k(p32);
                return k4;
            }
            ArrayList arrayList = new ArrayList(i4);
            if (list instanceof RandomAccess) {
                for (int i5 = size - i4; i5 < size; i5++) {
                    arrayList.add(list.get(i5));
                }
            } else {
                ListIterator<? extends T> listIterator = list.listIterator(size - i4);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @W2.i(name = "averageOfFloat")
    public static final double L1(@l3.d Iterable<Float> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        while (it.hasNext()) {
            d4 += it.next().floatValue();
            i4++;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Y();
            }
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    @W2.i(name = "flatMapIndexedSequenceTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R, C extends Collection<? super R>> C L2(Iterable<? extends T> iterable, C destination, X2.p<? super Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int i4 = 0;
        for (T t3 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            A.r0(destination, transform.c0(Integer.valueOf(i4), t3));
            i4 = i5;
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> Double L3(Iterable<? extends T> iterable, X2.l<? super T, Double> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = selector.C(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> T L4(Collection<? extends T> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        return (T) M4(collection, Random.f52425E);
    }

    @l3.d
    public static final <T> List<T> L5(@l3.d List<? extends T> list, @l3.d X2.l<? super T, Boolean> predicate) {
        List<T> V5;
        List<T> H3;
        List<T> H4;
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        if (list.isEmpty()) {
            H4 = CollectionsKt__CollectionsKt.H();
            return H4;
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!predicate.C(listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    H3 = CollectionsKt__CollectionsKt.H();
                    return H3;
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        V5 = V5(list);
        return V5;
    }

    @W2.i(name = "averageOfInt")
    public static final double M1(@l3.d Iterable<Integer> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        while (it.hasNext()) {
            d4 += it.next().intValue();
            i4++;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Y();
            }
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    @l3.d
    @W2.i(name = "flatMapSequence")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    public static final <T, R> List<R> M2(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            A.r0(arrayList, transform.C(it.next()));
        }
        return arrayList;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> Float M3(Iterable<? extends T> iterable, X2.l<? super T, Float> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = selector.C(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final <T> T M4(@l3.d Collection<? extends T> collection, @l3.d Random random) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) g2(collection, random.m(collection.size()));
    }

    @l3.d
    public static final <T> List<T> M5(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t3 : iterable) {
            if (!predicate.C(t3).booleanValue()) {
                break;
            }
            arrayList.add(t3);
        }
        return arrayList;
    }

    @W2.i(name = "averageOfLong")
    public static final double N1(@l3.d Iterable<Long> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        while (it.hasNext()) {
            d4 += it.next().longValue();
            i4++;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Y();
            }
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    @l3.d
    @W2.i(name = "flatMapSequenceTo")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C N2(@l3.d Iterable<? extends T> iterable, @l3.d C destination, @l3.d X2.l<? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            A.r0(destination, transform.C(it.next()));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R N3(Iterable<? extends T> iterable, Comparator<? super R> comparator, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (R) selector.C((T) it.next());
            while (it.hasNext()) {
                Object obj2 = (R) selector.C((T) it.next());
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final <S, T extends S> S N4(@l3.d Iterable<? extends T> iterable, @l3.d X2.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            S next = it.next();
            while (it.hasNext()) {
                next = operation.c0(next, it.next());
            }
            return next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    @l3.d
    public static final boolean[] N5(@l3.d Collection<Boolean> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            zArr[i4] = it.next().booleanValue();
            i4++;
        }
        return zArr;
    }

    @W2.i(name = "averageOfShort")
    public static final double O1(@l3.d Iterable<Short> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        int i4 = 0;
        while (it.hasNext()) {
            d4 += it.next().shortValue();
            i4++;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Y();
            }
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return d4 / i4;
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C O2(@l3.d Iterable<? extends T> iterable, @l3.d C destination, @l3.d X2.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            A.q0(destination, transform.C(it.next()));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R O3(Iterable<? extends T> iterable, Comparator<? super R> comparator, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) selector.C((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.C((T) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    public static final <S, T extends S> S O4(@l3.d Iterable<? extends T> iterable, @l3.d X2.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            S next = it.next();
            int i4 = 1;
            while (it.hasNext()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    if (kotlin.internal.m.a(1, 3, 0)) {
                        CollectionsKt__CollectionsKt.Z();
                    } else {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                }
                next = operation.z(Integer.valueOf(i4), next, it.next());
                i4 = i5;
            }
            return next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    @l3.d
    public static byte[] O5(@l3.d Collection<Byte> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            bArr[i4] = it.next().byteValue();
            i4++;
        }
        return bArr;
    }

    @l3.d
    @kotlin.Y(version = "1.2")
    public static final <T> List<List<T>> P1(@l3.d Iterable<? extends T> iterable, int i4) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        return d6(iterable, i4, i4, true);
    }

    public static final <T, R> R P2(@l3.d Iterable<? extends T> iterable, R r4, @l3.d X2.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r4 = operation.c0(r4, it.next());
        }
        return r4;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static <T extends Comparable<? super T>> T P3(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <S, T extends S> S P4(@l3.d Iterable<? extends T> iterable, @l3.d X2.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i4 = 1;
        while (it.hasNext()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            next = operation.z(Integer.valueOf(i4), next, it.next());
            i4 = i5;
        }
        return next;
    }

    @l3.d
    public static final char[] P5(@l3.d Collection<Character> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            cArr[i4] = it.next().charValue();
            i4++;
        }
        return cArr;
    }

    @l3.d
    @kotlin.Y(version = "1.2")
    public static final <T, R> List<R> Q1(@l3.d Iterable<? extends T> iterable, int i4, @l3.d X2.l<? super List<? extends T>, ? extends R> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        return e6(iterable, i4, i4, true, transform);
    }

    public static final <T, R> R Q2(@l3.d Iterable<? extends T> iterable, R r4, @l3.d X2.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int i4 = 0;
        for (T t3 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            r4 = operation.z(Integer.valueOf(i4), r4, t3);
            i4 = i5;
        }
        return r4;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Double Q3(@l3.d Iterable<Double> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final <S, T extends S> S Q4(@l3.d Iterable<? extends T> iterable, @l3.d X2.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.c0(next, it.next());
        }
        return next;
    }

    @l3.d
    public static final <T, C extends Collection<? super T>> C Q5(@l3.d Iterable<? extends T> iterable, @l3.d C destination) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @kotlin.internal.f
    private static final <T> T R1(List<? extends T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        return list.get(0);
    }

    public static final <T, R> R R2(@l3.d List<? extends T> list, R r4, @l3.d X2.p<? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r4 = operation.c0(listIterator.previous(), r4);
            }
        }
        return r4;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Float R3(@l3.d Iterable<Float> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <S, T extends S> S R4(@l3.d List<? extends T> list, @l3.d X2.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (listIterator.hasPrevious()) {
            S previous = listIterator.previous();
            while (listIterator.hasPrevious()) {
                previous = operation.c0(listIterator.previous(), previous);
            }
            return previous;
        }
        throw new UnsupportedOperationException("Empty list can't be reduced.");
    }

    @l3.d
    public static final double[] R5(@l3.d Collection<Double> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            dArr[i4] = it.next().doubleValue();
            i4++;
        }
        return dArr;
    }

    @kotlin.internal.f
    private static final <T> T S1(List<? extends T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        return list.get(1);
    }

    public static final <T, R> R S2(@l3.d List<? extends T> list, R r4, @l3.d X2.q<? super Integer, ? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r4 = operation.z(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r4);
            }
        }
        return r4;
    }

    @W2.i(name = "maxOrThrow")
    @kotlin.Y(version = "1.7")
    public static final double S3(@l3.d Iterable<Double> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    public static final <S, T extends S> S S4(@l3.d List<? extends T> list, @l3.d X2.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (listIterator.hasPrevious()) {
            S previous = listIterator.previous();
            while (listIterator.hasPrevious()) {
                previous = operation.z(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), previous);
            }
            return previous;
        }
        throw new UnsupportedOperationException("Empty list can't be reduced.");
    }

    @l3.d
    public static final float[] S5(@l3.d Collection<Float> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            fArr[i4] = it.next().floatValue();
            i4++;
        }
        return fArr;
    }

    @kotlin.internal.f
    private static final <T> T T1(List<? extends T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        return list.get(2);
    }

    @kotlin.internal.e
    public static final <T> void T2(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, H0> action) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            action.C(it.next());
        }
    }

    @W2.i(name = "maxOrThrow")
    @kotlin.Y(version = "1.7")
    public static final float T3(@l3.d Iterable<Float> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <S, T extends S> S T4(@l3.d List<? extends T> list, @l3.d X2.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = operation.z(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), previous);
        }
        return previous;
    }

    @l3.d
    public static final <T> HashSet<T> T5(@l3.d Iterable<? extends T> iterable) {
        int b02;
        int j4;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        b02 = C2109w.b0(iterable, 12);
        j4 = X.j(b02);
        return (HashSet) Q5(iterable, new HashSet(j4));
    }

    @kotlin.internal.f
    private static final <T> T U1(List<? extends T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        return list.get(3);
    }

    public static final <T> void U2(@l3.d Iterable<? extends T> iterable, @l3.d X2.p<? super Integer, ? super T, H0> action) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int i4 = 0;
        for (T t3 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            action.c0(Integer.valueOf(i4), t3);
            i4 = i5;
        }
    }

    @l3.d
    @W2.i(name = "maxOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <T extends Comparable<? super T>> T U3(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final <S, T extends S> S U4(@l3.d List<? extends T> list, @l3.d X2.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = operation.c0(listIterator.previous(), previous);
        }
        return previous;
    }

    @l3.d
    public static int[] U5(@l3.d Collection<Integer> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            iArr[i4] = it.next().intValue();
            i4++;
        }
        return iArr;
    }

    @kotlin.internal.f
    private static final <T> T V1(List<? extends T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        return list.get(4);
    }

    @kotlin.internal.f
    private static final <T> T V2(List<? extends T> list, int i4, X2.l<? super Integer, ? extends T> defaultValue) {
        int J3;
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            J3 = CollectionsKt__CollectionsKt.J(list);
            if (i4 <= J3) {
                return list.get(i4);
            }
        }
        return defaultValue.C(Integer.valueOf(i4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <T> T V3(@l3.d Iterable<? extends T> iterable, @l3.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T> Iterable<T> V4(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + '.');
            }
        }
        return iterable;
    }

    @l3.d
    public static <T> List<T> V5(@l3.d Iterable<? extends T> iterable) {
        List<T> H3;
        Object next;
        List<T> k4;
        List<T> Y5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
            if (size != 1) {
                Y5 = Y5(collection);
                return Y5;
            }
            if (iterable instanceof List) {
                next = ((List) iterable).get(0);
            } else {
                next = iterable.iterator().next();
            }
            k4 = C2108v.k(next);
            return k4;
        }
        return CollectionsKt__CollectionsKt.T(X5(iterable));
    }

    public static <T> boolean W1(@l3.d Iterable<? extends T> iterable, T t3) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t3);
        }
        if (c3(iterable, t3) >= 0) {
            return true;
        }
        return false;
    }

    @l3.e
    public static <T> T W2(@l3.d List<? extends T> list, int i4) {
        int J3;
        kotlin.jvm.internal.F.p(list, "<this>");
        if (i4 >= 0) {
            J3 = CollectionsKt__CollectionsKt.J(list);
            if (i4 <= J3) {
                return list.get(i4);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @W2.i(name = "maxWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <T> T W3(@l3.d Iterable<? extends T> iterable, @l3.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                Object obj2 = (T) it.next();
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (T) obj2;
                }
            }
            return (T) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T> List<T> W4(@l3.d List<? extends T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + '.');
            }
        }
        return list;
    }

    @l3.d
    public static final long[] W5(@l3.d Collection<Long> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            jArr[i4] = it.next().longValue();
            i4++;
        }
        return jArr;
    }

    public static final <T> int X1(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            it.next();
            i4++;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Y();
            }
        }
        return i4;
    }

    @l3.d
    public static final <T, K> Map<K, List<T>> X2(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t3 : iterable) {
            K C3 = keySelector.C(t3);
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(t3);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T X3(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R C3 = selector.C(next);
        do {
            T next2 = it.next();
            R C4 = selector.C(next2);
            next = next;
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @l3.d
    public static <T> List<T> X4(@l3.d Iterable<? extends T> iterable) {
        List<T> V5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            V5 = V5(iterable);
            return V5;
        }
        List<T> X5 = X5(iterable);
        C.r1(X5);
        return X5;
    }

    @l3.d
    public static final <T> List<T> X5(@l3.d Iterable<? extends T> iterable) {
        List<T> Y5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Y5 = Y5((Collection) iterable);
            return Y5;
        }
        return (List) Q5(iterable, new ArrayList());
    }

    public static final <T> int Y1(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (predicate.C(it.next()).booleanValue() && (i4 = i4 + 1) < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Y();
                } else {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        return i4;
    }

    @l3.d
    public static final <T, K, V> Map<K, List<V>> Y2(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends K> keySelector, @l3.d X2.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t3 : iterable) {
            K C3 = keySelector.C(t3);
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(t3));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @W2.i(name = "minByOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T Y3(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            R C3 = selector.C(next);
            do {
                T next2 = it.next();
                R C4 = selector.C(next2);
                next = next;
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                    next = next2;
                }
            } while (it.hasNext());
            return (T) next;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    @kotlin.Y(version = "1.4")
    public static final <T, R> List<R> Y4(@l3.d Iterable<? extends T> iterable, R r4, @l3.d X2.p<? super R, ? super T, ? extends R> operation) {
        int b02;
        List<R> k4;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        b02 = C2109w.b0(iterable, 9);
        if (b02 == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(b02 + 1);
        arrayList.add(r4);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r4 = operation.c0(r4, it.next());
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.d
    public static <T> List<T> Y5(@l3.d Collection<? extends T> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        return new ArrayList(collection);
    }

    @kotlin.internal.f
    private static final <T> int Z1(Collection<? extends T> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        return collection.size();
    }

    @l3.d
    public static final <T, K, M extends Map<? super K, List<T>>> M Z2(@l3.d Iterable<? extends T> iterable, @l3.d M destination, @l3.d X2.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (T t3 : iterable) {
            K C3 = keySelector.C(t3);
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(t3);
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> double Z3(Iterable<? extends T> iterable, X2.l<? super T, Double> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = selector.C(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    @kotlin.Y(version = "1.4")
    public static final <T, R> List<R> Z4(@l3.d Iterable<? extends T> iterable, R r4, @l3.d X2.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        int b02;
        List<R> k4;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        b02 = C2109w.b0(iterable, 9);
        if (b02 == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(b02 + 1);
        arrayList.add(r4);
        Iterator<? extends T> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            r4 = operation.z(Integer.valueOf(i4), r4, it.next());
            arrayList.add(r4);
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final <T> Set<T> Z5(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) Q5(iterable, new LinkedHashSet());
    }

    @l3.d
    public static final <T> List<T> a2(@l3.d Iterable<? extends T> iterable) {
        List<T> V5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        V5 = V5(Z5(iterable));
        return V5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T, K, V, M extends Map<? super K, List<V>>> M a3(@l3.d Iterable<? extends T> iterable, @l3.d M destination, @l3.d X2.l<? super T, ? extends K> keySelector, @l3.d X2.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (T t3 : iterable) {
            K C3 = keySelector.C(t3);
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(t3));
        }
        return destination;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> float a4(Iterable<? extends T> iterable, X2.l<? super T, Float> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = selector.C(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final <S, T extends S> List<S> a5(@l3.d Iterable<? extends T> iterable, @l3.d X2.p<? super S, ? super T, ? extends S> operation) {
        int b02;
        List<S> H3;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        S next = it.next();
        b02 = C2109w.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        arrayList.add(next);
        while (it.hasNext()) {
            next = operation.c0(next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    @l3.d
    public static <T> Set<T> a6(@l3.d Iterable<? extends T> iterable) {
        Set<T> k4;
        Object next;
        Set<T> f4;
        int j4;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                k4 = j0.k();
                return k4;
            }
            if (size != 1) {
                j4 = X.j(collection.size());
                return (Set) Q5(iterable, new LinkedHashSet(j4));
            }
            if (iterable instanceof List) {
                next = ((List) iterable).get(0);
            } else {
                next = iterable.iterator().next();
            }
            f4 = i0.f(next);
            return f4;
        }
        return j0.r((Set) Q5(iterable, new LinkedHashSet()));
    }

    @l3.d
    public static final <T, K> List<T> b2(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t3 : iterable) {
            if (hashSet.add(selector.C(t3))) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <T, K> I<T, K> b3(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        return new c(iterable, keySelector);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R b4(Iterable<? extends T> iterable, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R C3 = selector.C(it.next());
            while (it.hasNext()) {
                R C4 = selector.C(it.next());
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    @kotlin.Y(version = "1.4")
    public static final <S, T extends S> List<S> b5(@l3.d Iterable<? extends T> iterable, @l3.d X2.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        int b02;
        List<S> H3;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        S next = it.next();
        b02 = C2109w.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        arrayList.add(next);
        int i4 = 1;
        while (it.hasNext()) {
            next = operation.z(Integer.valueOf(i4), next, it.next());
            arrayList.add(next);
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final short[] b6(@l3.d Collection<Short> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            sArr[i4] = it.next().shortValue();
            i4++;
        }
        return sArr;
    }

    @l3.d
    public static <T> List<T> c2(@l3.d Iterable<? extends T> iterable, int i4) {
        ArrayList arrayList;
        List<T> k4;
        List<T> H3;
        List<T> V5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                V5 = V5(iterable);
                return V5;
            }
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i4;
                if (size <= 0) {
                    H3 = CollectionsKt__CollectionsKt.H();
                    return H3;
                }
                if (size == 1) {
                    k4 = C2108v.k(n3(iterable));
                    return k4;
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i4 < size2) {
                            arrayList.add(((List) iterable).get(i4));
                            i4++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i4);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i5 = 0;
            for (T t3 : iterable) {
                if (i5 >= i4) {
                    arrayList.add(t3);
                } else {
                    i5++;
                }
            }
            return CollectionsKt__CollectionsKt.T(arrayList);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    public static final <T> int c3(@l3.d Iterable<? extends T> iterable, T t3) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t3);
        }
        int i4 = 0;
        for (T t4 : iterable) {
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Z();
            }
            if (kotlin.jvm.internal.F.g(t3, t4)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R c4(Iterable<? extends T> iterable, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R C3 = selector.C(it.next());
        while (it.hasNext()) {
            R C4 = selector.C(it.next());
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final <T, R> List<R> c5(@l3.d Iterable<? extends T> iterable, R r4, @l3.d X2.p<? super R, ? super T, ? extends R> operation) {
        int b02;
        List<R> k4;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        b02 = C2109w.b0(iterable, 9);
        if (b02 == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(b02 + 1);
        arrayList.add(r4);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r4 = operation.c0(r4, it.next());
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.d
    public static final <T> Set<T> c6(@l3.d Iterable<? extends T> iterable, @l3.d Iterable<? extends T> other) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<T> Z5 = Z5(iterable);
        A.q0(Z5, other);
        return Z5;
    }

    @l3.d
    public static final <T> List<T> d2(@l3.d List<? extends T> list, int i4) {
        int u3;
        List<T> J5;
        kotlin.jvm.internal.F.p(list, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(list.size() - i4, 0);
            J5 = J5(list, u3);
            return J5;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    public static final <T> int d3(@l3.d List<? extends T> list, T t3) {
        kotlin.jvm.internal.F.p(list, "<this>");
        return list.indexOf(t3);
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> Double d4(Iterable<? extends T> iterable, X2.l<? super T, Double> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = selector.C(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final <T, R> List<R> d5(@l3.d Iterable<? extends T> iterable, R r4, @l3.d X2.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        int b02;
        List<R> k4;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        b02 = C2109w.b0(iterable, 9);
        if (b02 == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(b02 + 1);
        arrayList.add(r4);
        Iterator<? extends T> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            r4 = operation.z(Integer.valueOf(i4), r4, it.next());
            arrayList.add(r4);
            i4++;
        }
        return arrayList;
    }

    @l3.d
    @kotlin.Y(version = "1.2")
    public static final <T> List<List<T>> d6(@l3.d Iterable<? extends T> iterable, int i4, int i5, boolean z3) {
        int i6;
        int B3;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        m0.a(i4, i5);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i7 = size / i5;
            if (size % i5 == 0) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            ArrayList arrayList = new ArrayList(i7 + i6);
            int i8 = 0;
            while (i8 >= 0 && i8 < size) {
                B3 = kotlin.ranges.u.B(i4, size - i8);
                if (B3 < i4 && !z3) {
                    break;
                }
                ArrayList arrayList2 = new ArrayList(B3);
                for (int i9 = 0; i9 < B3; i9++) {
                    arrayList2.add(list.get(i9 + i8));
                }
                arrayList.add(arrayList2);
                i8 += i5;
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator b4 = m0.b(iterable.iterator(), i4, i5, z3, false);
        while (b4.hasNext()) {
            arrayList3.add((List) b4.next());
        }
        return arrayList3;
    }

    @l3.d
    public static final <T> List<T> e2(@l3.d List<? extends T> list, @l3.d X2.l<? super T, Boolean> predicate) {
        List<T> H3;
        List<T> J5;
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!predicate.C(listIterator.previous()).booleanValue()) {
                    J5 = J5(list, listIterator.nextIndex() + 1);
                    return J5;
                }
            }
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    public static final <T> int e3(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        for (T t3 : iterable) {
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            if (predicate.C(t3).booleanValue()) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> Float e4(Iterable<? extends T> iterable, X2.l<? super T, Float> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = selector.C(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @kotlin.Y(version = "1.3")
    public static final <T> void e5(@l3.d List<T> list, @l3.d Random random) {
        int J3;
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        for (J3 = CollectionsKt__CollectionsKt.J(list); J3 > 0; J3--) {
            int m4 = random.m(J3 + 1);
            list.set(m4, list.set(J3, list.get(m4)));
        }
    }

    @l3.d
    @kotlin.Y(version = "1.2")
    public static final <T, R> List<R> e6(@l3.d Iterable<? extends T> iterable, int i4, int i5, boolean z3, @l3.d X2.l<? super List<? extends T>, ? extends R> transform) {
        int B3;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        m0.a(i4, i5);
        int i6 = 1;
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i7 = size / i5;
            int i8 = 0;
            if (size % i5 == 0) {
                i6 = 0;
            }
            ArrayList arrayList = new ArrayList(i7 + i6);
            b0 b0Var = new b0(list);
            while (i8 >= 0 && i8 < size) {
                B3 = kotlin.ranges.u.B(i4, size - i8);
                if (!z3 && B3 < i4) {
                    break;
                }
                b0Var.c(i8, B3 + i8);
                arrayList.add(transform.C(b0Var));
                i8 += i5;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator b4 = m0.b(iterable.iterator(), i4, i5, z3, true);
        while (b4.hasNext()) {
            arrayList2.add(transform.C((List) b4.next()));
        }
        return arrayList2;
    }

    @l3.d
    public static final <T> List<T> f2(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (T t3 : iterable) {
            if (z3) {
                arrayList.add(t3);
            } else if (!predicate.C(t3).booleanValue()) {
                arrayList.add(t3);
                z3 = true;
            }
        }
        return arrayList;
    }

    public static final <T> int f3(@l3.d List<? extends T> list, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (predicate.C(it.next()).booleanValue()) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R f4(Iterable<? extends T> iterable, Comparator<? super R> comparator, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (R) selector.C((T) it.next());
            while (it.hasNext()) {
                Object obj2 = (R) selector.C((T) it.next());
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static <T> T f5(@l3.d Iterable<? extends T> iterable) {
        Object h5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof List) {
            h5 = h5((List) iterable);
            return (T) h5;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static /* synthetic */ List f6(Iterable iterable, int i4, int i5, boolean z3, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        return d6(iterable, i4, i5, z3);
    }

    public static final <T> T g2(@l3.d Iterable<? extends T> iterable, int i4) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i4);
        }
        return (T) i2(iterable, i4, new b(i4));
    }

    public static final <T> int g3(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = -1;
        int i5 = 0;
        for (T t3 : iterable) {
            if (i5 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            if (predicate.C(t3).booleanValue()) {
                i4 = i5;
            }
            i5++;
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R g4(Iterable<? extends T> iterable, Comparator<? super R> comparator, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) selector.C((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.C((T) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T g5(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        T t3 = null;
        boolean z3 = false;
        for (T t4 : iterable) {
            if (predicate.C(t4).booleanValue()) {
                if (!z3) {
                    z3 = true;
                    t3 = t4;
                } else {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
            }
        }
        if (z3) {
            return t3;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ List g6(Iterable iterable, int i4, int i5, boolean z3, X2.l lVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        return e6(iterable, i4, i5, z3, lVar);
    }

    @kotlin.internal.f
    private static final <T> T h2(List<? extends T> list, int i4) {
        kotlin.jvm.internal.F.p(list, "<this>");
        return list.get(i4);
    }

    public static final <T> int h3(@l3.d List<? extends T> list, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (predicate.C(listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static <T extends Comparable<? super T>> T h4(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> T h5(@l3.d List<? extends T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    @l3.d
    public static final <T> Iterable<M<T>> h6(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        return new N(new d(iterable));
    }

    public static final <T> T i2(@l3.d Iterable<? extends T> iterable, int i4, @l3.d X2.l<? super Integer, ? extends T> defaultValue) {
        int J3;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i4 >= 0) {
                J3 = CollectionsKt__CollectionsKt.J(list);
                if (i4 <= J3) {
                    return (T) list.get(i4);
                }
            }
            return defaultValue.C(Integer.valueOf(i4));
        }
        if (i4 < 0) {
            return defaultValue.C(Integer.valueOf(i4));
        }
        int i5 = 0;
        for (T t3 : iterable) {
            int i6 = i5 + 1;
            if (i4 == i5) {
                return t3;
            }
            i5 = i6;
        }
        return defaultValue.C(Integer.valueOf(i4));
    }

    @l3.d
    public static <T> Set<T> i3(@l3.d Iterable<? extends T> iterable, @l3.d Iterable<? extends T> other) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<T> Z5 = Z5(iterable);
        A.R0(Z5, other);
        return Z5;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Double i4(@l3.d Iterable<Double> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.e
    public static final <T> T i5(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() != 1) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @l3.d
    public static <T, R> List<Pair<T, R>> i6(@l3.d Iterable<? extends T> iterable, @l3.d Iterable<? extends R> other) {
        int b02;
        int b03;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        b02 = C2109w.b0(iterable, 10);
        b03 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, b03));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C2122h0.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final <T> T j2(List<? extends T> list, int i4, X2.l<? super Integer, ? extends T> defaultValue) {
        int J3;
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            J3 = CollectionsKt__CollectionsKt.J(list);
            if (i4 <= J3) {
                return list.get(i4);
            }
        }
        return defaultValue.C(Integer.valueOf(i4));
    }

    @l3.d
    public static final <T, A extends Appendable> A j3(@l3.d Iterable<? extends T> iterable, @l3.d A buffer, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(buffer, "buffer");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (T t3 : iterable) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            kotlin.text.r.b(buffer, t3, lVar);
        }
        if (i4 >= 0 && i5 > i4) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @l3.e
    @kotlin.Y(version = "1.4")
    public static final Float j4(@l3.d Iterable<Float> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    @l3.e
    public static final <T> T j5(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        boolean z3 = false;
        T t3 = null;
        for (T t4 : iterable) {
            if (predicate.C(t4).booleanValue()) {
                if (z3) {
                    return null;
                }
                z3 = true;
                t3 = t4;
            }
        }
        if (!z3) {
            return null;
        }
        return t3;
    }

    @l3.d
    public static final <T, R, V> List<V> j6(@l3.d Iterable<? extends T> iterable, @l3.d Iterable<? extends R> other, @l3.d X2.p<? super T, ? super R, ? extends V> transform) {
        int b02;
        int b03;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        b02 = C2109w.b0(iterable, 10);
        b03 = C2109w.b0(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, b03));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(transform.c0(it.next(), it2.next()));
        }
        return arrayList;
    }

    @l3.e
    public static final <T> T k2(@l3.d Iterable<? extends T> iterable, int i4) {
        Object W22;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof List) {
            W22 = W2((List) iterable, i4);
            return (T) W22;
        }
        if (i4 < 0) {
            return null;
        }
        int i5 = 0;
        for (T t3 : iterable) {
            int i6 = i5 + 1;
            if (i4 == i5) {
                return t3;
            }
            i5 = i6;
        }
        return null;
    }

    public static /* synthetic */ Appendable k3(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i6;
        CharSequence charSequence7;
        X2.l lVar2;
        if ((i5 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i5 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i5 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i5 & 16) != 0) {
            i6 = -1;
        } else {
            i6 = i4;
        }
        if ((i5 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i5 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return j3(iterable, appendable, charSequence5, charSequence6, charSequence8, i6, charSequence7, lVar2);
    }

    @W2.i(name = "minOrThrow")
    @kotlin.Y(version = "1.7")
    public static final double k4(@l3.d Iterable<Double> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    public static <T> T k5(@l3.d List<? extends T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @l3.d
    public static final <T, R> List<Pair<T, R>> k6(@l3.d Iterable<? extends T> iterable, @l3.d R[] other) {
        int b02;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int length = other.length;
        b02 = C2109w.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (T t3 : iterable) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(C2122h0.a(t3, other[i4]));
            i4++;
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final <T> T l2(List<? extends T> list, int i4) {
        Object W22;
        kotlin.jvm.internal.F.p(list, "<this>");
        W22 = W2(list, i4);
        return (T) W22;
    }

    @l3.d
    public static final <T> String l3(@l3.d Iterable<? extends T> iterable, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(separator, "separator");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(postfix, "postfix");
        kotlin.jvm.internal.F.p(truncated, "truncated");
        String sb = ((StringBuilder) j3(iterable, new StringBuilder(), separator, prefix, postfix, i4, truncated, lVar)).toString();
        kotlin.jvm.internal.F.o(sb, "toString(...)");
        return sb;
    }

    @W2.i(name = "minOrThrow")
    @kotlin.Y(version = "1.7")
    public static final float l4(@l3.d Iterable<Float> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    public static final <T> List<T> l5(@l3.d List<? extends T> list, @l3.d Iterable<Integer> indices) {
        int b02;
        List<T> H3;
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T, R, V> List<V> l6(@l3.d Iterable<? extends T> iterable, @l3.d R[] other, @l3.d X2.p<? super T, ? super R, ? extends V> transform) {
        int b02;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = other.length;
        b02 = C2109w.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, length));
        int i4 = 0;
        for (T t3 : iterable) {
            if (i4 >= length) {
                break;
            }
            arrayList.add(transform.c0(t3, other[i4]));
            i4++;
        }
        return arrayList;
    }

    @l3.d
    public static final <T> List<T> m2(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t3 : iterable) {
            if (predicate.C(t3).booleanValue()) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ String m3(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i5 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i5 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return l3(iterable, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @l3.d
    @W2.i(name = "minOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <T extends Comparable<? super T>> T m4(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    public static final <T> List<T> m5(@l3.d List<? extends T> list, @l3.d kotlin.ranges.l indices) {
        List<T> V5;
        List<T> H3;
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        V5 = V5(list.subList(indices.c().intValue(), indices.k().intValue() + 1));
        return V5;
    }

    @l3.d
    @kotlin.Y(version = "1.2")
    public static final <T> List<Pair<T, T>> m6(@l3.d Iterable<? extends T> iterable) {
        List<Pair<T, T>> H3;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(C2122h0.a(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @l3.d
    public static final <T> List<T> n2(@l3.d Iterable<? extends T> iterable, @l3.d X2.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (T t3 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            if (predicate.c0(Integer.valueOf(i4), t3).booleanValue()) {
                arrayList.add(t3);
            }
            i4 = i5;
        }
        return arrayList;
    }

    public static final <T> T n3(@l3.d Iterable<? extends T> iterable) {
        Object p32;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof List) {
            p32 = p3((List) iterable);
            return (T) p32;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.e
    @kotlin.Y(version = "1.4")
    public static final <T> T n4(@l3.d Iterable<? extends T> iterable, @l3.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    public static final <T, R extends Comparable<? super R>> void n5(@l3.d List<T> list, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (list.size() > 1) {
            C2112z.p0(list, new g.a(selector));
        }
    }

    @l3.d
    @kotlin.Y(version = "1.2")
    public static final <T, R> List<R> n6(@l3.d Iterable<? extends T> iterable, @l3.d X2.p<? super T, ? super T, ? extends R> transform) {
        List<R> H3;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList();
        A2.a next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(transform.c0(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @l3.d
    public static final <T, C extends Collection<? super T>> C o2(@l3.d Iterable<? extends T> iterable, @l3.d C destination, @l3.d X2.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        for (T t3 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            if (predicate.c0(Integer.valueOf(i4), t3).booleanValue()) {
                destination.add(t3);
            }
            i4 = i5;
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T o3(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        T t3 = null;
        boolean z3 = false;
        for (T t4 : iterable) {
            if (predicate.C(t4).booleanValue()) {
                z3 = true;
                t3 = t4;
            }
        }
        if (z3) {
            return t3;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @W2.i(name = "minWithOrThrow")
    @kotlin.Y(version = "1.7")
    public static final <T> T o4(@l3.d Iterable<? extends T> iterable, @l3.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                Object obj2 = (T) it.next();
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (T) obj2;
                }
            }
            return (T) obj;
        }
        throw new NoSuchElementException();
    }

    public static final <T, R extends Comparable<? super R>> void o5(@l3.d List<T> list, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (list.size() > 1) {
            C2112z.p0(list, new g.c(selector));
        }
    }

    public static final /* synthetic */ <R> List<R> p2(Iterable<?> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            kotlin.jvm.internal.F.y(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T p3(@l3.d List<? extends T> list) {
        int J3;
        kotlin.jvm.internal.F.p(list, "<this>");
        if (!list.isEmpty()) {
            J3 = CollectionsKt__CollectionsKt.J(list);
            return list.get(J3);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @l3.d
    public static final <T> List<T> p4(@l3.d Iterable<? extends T> iterable, @l3.d Iterable<? extends T> elements) {
        Collection t02;
        List<T> V5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        t02 = A.t0(elements);
        if (t02.isEmpty()) {
            V5 = V5(iterable);
            return V5;
        }
        ArrayList arrayList = new ArrayList();
        for (T t3 : iterable) {
            if (!t02.contains(t3)) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    public static final <T extends Comparable<? super T>> void p5(@l3.d List<T> list) {
        Comparator x3;
        kotlin.jvm.internal.F.p(list, "<this>");
        x3 = kotlin.comparisons.g.x();
        C2112z.p0(list, x3);
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C q2(Iterable<?> iterable, C destination) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (Object obj : iterable) {
            kotlin.jvm.internal.F.y(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    public static final <T> T q3(@l3.d List<? extends T> list, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (predicate.C(previous).booleanValue()) {
                return previous;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @l3.d
    public static <T> List<T> q4(@l3.d Iterable<? extends T> iterable, T t3) {
        int b02;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        b02 = C2109w.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        boolean z3 = false;
        for (T t4 : iterable) {
            boolean z4 = true;
            if (!z3 && kotlin.jvm.internal.F.g(t4, t3)) {
                z3 = true;
                z4 = false;
            }
            if (z4) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <T extends Comparable<? super T>> List<T> q5(@l3.d Iterable<? extends T> iterable) {
        List<T> t3;
        List<T> V5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                V5 = V5(iterable);
                return V5;
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C2100o.U3((Comparable[]) array);
            t3 = C2100o.t(array);
            return t3;
        }
        List<T> X5 = X5(iterable);
        C2112z.m0(X5);
        return X5;
    }

    @l3.d
    public static final <T> List<T> r2(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t3 : iterable) {
            if (!predicate.C(t3).booleanValue()) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    public static final <T> int r3(@l3.d Iterable<? extends T> iterable, T t3) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t3);
        }
        int i4 = -1;
        int i5 = 0;
        for (T t4 : iterable) {
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.Z();
            }
            if (kotlin.jvm.internal.F.g(t3, t4)) {
                i4 = i5;
            }
            i5++;
        }
        return i4;
    }

    @l3.d
    public static final <T> List<T> r4(@l3.d Iterable<? extends T> iterable, @l3.d kotlin.sequences.m<? extends T> elements) {
        List c32;
        List<T> V5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        c32 = SequencesKt___SequencesKt.c3(elements);
        if (c32.isEmpty()) {
            V5 = V5(iterable);
            return V5;
        }
        ArrayList arrayList = new ArrayList();
        for (T t3 : iterable) {
            if (!c32.contains(t3)) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <T, R extends Comparable<? super R>> List<T> r5(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends R> selector) {
        List<T> u5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        u5 = u5(iterable, new g.a(selector));
        return u5;
    }

    @l3.d
    public static <T> List<T> s2(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        return (List) t2(iterable, new ArrayList());
    }

    public static final <T> int s3(@l3.d List<? extends T> list, T t3) {
        kotlin.jvm.internal.F.p(list, "<this>");
        return list.lastIndexOf(t3);
    }

    @l3.d
    public static final <T> List<T> s4(@l3.d Iterable<? extends T> iterable, @l3.d T[] elements) {
        boolean s8;
        List<T> V5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        if (elements.length == 0) {
            V5 = V5(iterable);
            return V5;
        }
        ArrayList arrayList = new ArrayList();
        for (T t3 : iterable) {
            s8 = C2101p.s8(elements, t3);
            if (!s8) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    @l3.d
    public static final <T, R extends Comparable<? super R>> List<T> s5(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends R> selector) {
        List<T> u5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        u5 = u5(iterable, new g.c(selector));
        return u5;
    }

    @l3.d
    public static final <C extends Collection<? super T>, T> C t2(@l3.d Iterable<? extends T> iterable, @l3.d C destination) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (T t3 : iterable) {
            if (t3 != null) {
                destination.add(t3);
            }
        }
        return destination;
    }

    @l3.e
    public static final <T> T t3(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @kotlin.internal.f
    private static final <T> List<T> t4(Iterable<? extends T> iterable, T t3) {
        List<T> q4;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        q4 = q4(iterable, t3);
        return q4;
    }

    @l3.d
    public static final <T extends Comparable<? super T>> List<T> t5(@l3.d Iterable<? extends T> iterable) {
        Comparator x3;
        List<T> u5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        x3 = kotlin.comparisons.g.x();
        u5 = u5(iterable, x3);
        return u5;
    }

    @l3.d
    public static final <T, C extends Collection<? super T>> C u2(@l3.d Iterable<? extends T> iterable, @l3.d C destination, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (T t3 : iterable) {
            if (!predicate.C(t3).booleanValue()) {
                destination.add(t3);
            }
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @l3.e
    public static final <T> T u3(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        T t3 = null;
        for (T t4 : iterable) {
            if (predicate.C(t4).booleanValue()) {
                t3 = t4;
            }
        }
        return t3;
    }

    public static final <T> boolean u4(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static <T> List<T> u5(@l3.d Iterable<? extends T> iterable, @l3.d Comparator<? super T> comparator) {
        List<T> t3;
        List<T> V5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                V5 = V5(iterable);
                return V5;
            }
            Object[] array = collection.toArray(new Object[0]);
            C2100o.h4(array, comparator);
            t3 = C2100o.t(array);
            return t3;
        }
        List<T> X5 = X5(iterable);
        C2112z.p0(X5, comparator);
        return X5;
    }

    @l3.d
    public static final <T, C extends Collection<? super T>> C v2(@l3.d Iterable<? extends T> iterable, @l3.d C destination, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (T t3 : iterable) {
            if (predicate.C(t3).booleanValue()) {
                destination.add(t3);
            }
        }
        return destination;
    }

    @l3.e
    public static <T> T v3(@l3.d List<? extends T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T> boolean v4(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.C(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l3.d
    public static final <T> Set<T> v5(@l3.d Iterable<? extends T> iterable, @l3.d Iterable<? extends T> other) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Set<T> Z5 = Z5(iterable);
        A.H0(Z5, other);
        return Z5;
    }

    public static final <T> boolean w1(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.C(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @kotlin.internal.f
    private static final <T> T w2(Iterable<? extends T> iterable, X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (T t3 : iterable) {
            if (predicate.C(t3).booleanValue()) {
                return t3;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @l3.e
    public static final <T> T w3(@l3.d List<? extends T> list, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (predicate.C(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <T, C extends Iterable<? extends T>> C w4(@l3.d C c4, @l3.d X2.l<? super T, H0> action) {
        kotlin.jvm.internal.F.p(c4, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        Iterator<T> it = c4.iterator();
        while (it.hasNext()) {
            action.C(it.next());
        }
        return c4;
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final <T> int w5(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Integer> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += selector.C(it.next()).intValue();
        }
        return i4;
    }

    public static final <T> boolean x1(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return !((Collection) iterable).isEmpty();
        }
        return iterable.iterator().hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @kotlin.internal.f
    private static final <T> T x2(Iterable<? extends T> iterable, X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        T t3 = null;
        for (T t4 : iterable) {
            if (predicate.C(t4).booleanValue()) {
                t3 = t4;
            }
        }
        return t3;
    }

    @l3.d
    public static final <T, R> List<R> x3(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, ? extends R> transform) {
        int b02;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        b02 = C2109w.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.C(it.next()));
        }
        return arrayList;
    }

    @l3.d
    @kotlin.Y(version = "1.4")
    public static final <T, C extends Iterable<? extends T>> C x4(@l3.d C c4, @l3.d X2.p<? super Integer, ? super T, H0> action) {
        kotlin.jvm.internal.F.p(c4, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int i4 = 0;
        for (T t3 : c4) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Z();
            }
            action.c0(Integer.valueOf(i4), t3);
            i4 = i5;
        }
        return c4;
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @kotlin.V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final <T> double x5(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Double> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        while (it.hasNext()) {
            d4 += selector.C(it.next()).doubleValue();
        }
        return d4;
    }

    public static final <T> boolean y1(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.C(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @kotlin.internal.f
    private static final <T> T y2(List<? extends T> list, X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (predicate.C(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    @l3.d
    public static final <T, R> List<R> y3(@l3.d Iterable<? extends T> iterable, @l3.d X2.p<? super Integer, ? super T, ? extends R> transform) {
        int b02;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        b02 = C2109w.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        int i4 = 0;
        for (T t3 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            arrayList.add(transform.c0(Integer.valueOf(i4), t3));
            i4 = i5;
        }
        return arrayList;
    }

    @l3.d
    public static final <T> Pair<List<T>, List<T>> y4(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t3 : iterable) {
            if (predicate.C(t3).booleanValue()) {
                arrayList.add(t3);
            } else {
                arrayList2.add(t3);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @W2.i(name = "sumOfByte")
    public static final int y5(@l3.d Iterable<Byte> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().byteValue();
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> Iterable<T> z1(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        return iterable;
    }

    public static final <T> T z2(@l3.d Iterable<? extends T> iterable) {
        Object B22;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof List) {
            B22 = B2((List) iterable);
            return (T) B22;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @l3.d
    public static final <T, R> List<R> z3(@l3.d Iterable<? extends T> iterable, @l3.d X2.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (T t3 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            R c02 = transform.c0(Integer.valueOf(i4), t3);
            if (c02 != null) {
                arrayList.add(c02);
            }
            i4 = i5;
        }
        return arrayList;
    }

    @l3.d
    public static final <T> List<T> z4(@l3.d Iterable<? extends T> iterable, @l3.d Iterable<? extends T> elements) {
        List<T> D4;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        if (iterable instanceof Collection) {
            D4 = D4((Collection) iterable, elements);
            return D4;
        }
        ArrayList arrayList = new ArrayList();
        A.q0(arrayList, iterable);
        A.q0(arrayList, elements);
        return arrayList;
    }

    @W2.i(name = "sumOfDouble")
    public static final double z5(@l3.d Iterable<Double> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        while (it.hasNext()) {
            d4 += it.next().doubleValue();
        }
        return d4;
    }
}
