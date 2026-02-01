package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.K0;
import kotlin.random.Random;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.jvm.internal.U({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,522:1\n1#2:523\n26#3:524\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n484#1:524\n*E\n"})
/* loaded from: classes2.dex */
public class CollectionsKt__CollectionsKt extends C2108v {
    public static final <T, K extends Comparable<? super K>> int A(@l3.d List<? extends T> list, @l3.e K k4, int i4, int i5, @l3.d X2.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return u(list, i4, i5, new CollectionsKt__CollectionsKt$binarySearchBy$1(selector, k4));
    }

    public static /* synthetic */ int B(List list, Comparable comparable, int i4, int i5, X2.l selector, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = list.size();
        }
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        return u(list, i4, i5, new CollectionsKt__CollectionsKt$binarySearchBy$1(selector, comparable));
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.6")
    @kotlin.internal.f
    private static final <E> List<E> C(int i4, @InterfaceC2084c X2.l<? super List<E>, H0> builderAction) {
        List j4;
        List<E> a4;
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        j4 = C2108v.j(i4);
        builderAction.C(j4);
        a4 = C2108v.a(j4);
        return a4;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.6")
    @kotlin.internal.f
    private static final <E> List<E> D(@InterfaceC2084c X2.l<? super List<E>, H0> builderAction) {
        List i4;
        List<E> a4;
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        i4 = C2108v.i();
        builderAction.C(i4);
        a4 = C2108v.a(i4);
        return a4;
    }

    @l3.d
    public static final Object[] E(@l3.d Collection<?> collection) {
        kotlin.jvm.internal.F.p(collection, "collection");
        int i4 = 0;
        if (collection.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i4] = it.next();
            i4++;
        }
        return objArr;
    }

    @l3.d
    public static final <T> T[] F(@l3.d Collection<?> collection, @l3.d T[] array) {
        Object[] n4;
        Object[] n5;
        kotlin.jvm.internal.F.p(collection, "collection");
        kotlin.jvm.internal.F.p(array, "array");
        int i4 = 0;
        if (collection.isEmpty()) {
            n5 = C2108v.n(0, array);
            return (T[]) n5;
        }
        int length = array.length;
        Object[] objArr = array;
        if (length < collection.size()) {
            objArr = (T[]) C2098m.a(array, collection.size());
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i4] = it.next();
            i4++;
        }
        n4 = C2108v.n(collection.size(), objArr);
        return (T[]) n4;
    }

    @kotlin.internal.f
    private static final <T> boolean G(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        return collection.containsAll(elements);
    }

    @l3.d
    public static <T> List<T> H() {
        return EmptyList.f51827E;
    }

    @l3.d
    public static kotlin.ranges.l I(@l3.d Collection<?> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        return new kotlin.ranges.l(0, collection.size() - 1);
    }

    public static <T> int J(@l3.d List<? extends T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;LX2/a<+TR;>;)TR; */
    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final Object K(Collection collection, X2.a defaultValue) {
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (collection.isEmpty()) {
            return defaultValue.n();
        }
        return collection;
    }

    @kotlin.internal.f
    private static final <T> boolean L(Collection<? extends T> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        return !collection.isEmpty();
    }

    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final <T> boolean M(Collection<? extends T> collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    @kotlin.internal.f
    private static final <T> List<T> N() {
        List<T> H3;
        H3 = H();
        return H3;
    }

    @l3.d
    public static <T> List<T> O(@l3.d T... elements) {
        List<T> H3;
        List<T> t3;
        kotlin.jvm.internal.F.p(elements, "elements");
        if (elements.length > 0) {
            t3 = C2100o.t(elements);
            return t3;
        }
        H3 = H();
        return H3;
    }

    @l3.d
    public static final <T> List<T> P(@l3.e T t3) {
        List<T> H3;
        List<T> k4;
        if (t3 != null) {
            k4 = C2108v.k(t3);
            return k4;
        }
        H3 = H();
        return H3;
    }

    @l3.d
    public static <T> List<T> Q(@l3.d T... elements) {
        List<T> Ta;
        kotlin.jvm.internal.F.p(elements, "elements");
        Ta = C2101p.Ta(elements);
        return Ta;
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <T> List<T> R() {
        return new ArrayList();
    }

    @l3.d
    public static <T> List<T> S(@l3.d T... elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C2095j(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T> List<T> T(@l3.d List<? extends T> list) {
        List<T> H3;
        List<T> k4;
        kotlin.jvm.internal.F.p(list, "<this>");
        int size = list.size();
        if (size == 0) {
            H3 = H();
            return H3;
        }
        if (size == 1) {
            k4 = C2108v.k(list.get(0));
            return k4;
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> Collection<T> U(Collection<? extends T> collection) {
        List H3;
        if (collection == 0) {
            H3 = H();
            return H3;
        }
        return collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> List<T> V(List<? extends T> list) {
        List<T> H3;
        if (list == 0) {
            H3 = H();
            return H3;
        }
        return list;
    }

    private static final void W(int i4, int i5, int i6) {
        if (i5 <= i6) {
            if (i5 >= 0) {
                if (i6 <= i4) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i6 + ") is greater than size (" + i4 + ").");
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i5 + ") is less than zero.");
        }
        throw new IllegalArgumentException("fromIndex (" + i5 + ") is greater than toIndex (" + i6 + ").");
    }

    @l3.d
    @kotlin.Y(version = "1.3")
    public static final <T> List<T> X(@l3.d Iterable<? extends T> iterable, @l3.d Random random) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        List<T> X5 = D.X5(iterable);
        D.e5(X5, random);
        return X5;
    }

    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static void Y() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static void Z() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <T> List<T> p(int i4, X2.l<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.F.p(init, "init");
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            arrayList.add(init.C(Integer.valueOf(i5)));
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <T> List<T> q(int i4, X2.l<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.F.p(init, "init");
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            arrayList.add(init.C(Integer.valueOf(i5)));
        }
        return arrayList;
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <T> ArrayList<T> r() {
        return new ArrayList<>();
    }

    @l3.d
    public static <T> ArrayList<T> s(@l3.d T... elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new C2095j(elements, true));
    }

    @l3.d
    public static final <T> Collection<T> t(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return new C2095j(tArr, false);
    }

    public static final <T> int u(@l3.d List<? extends T> list, int i4, int i5, @l3.d X2.l<? super T, Integer> comparison) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(comparison, "comparison");
        W(list.size(), i4, i5);
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            int intValue = comparison.C(list.get(i7)).intValue();
            if (intValue < 0) {
                i4 = i7 + 1;
            } else if (intValue > 0) {
                i6 = i7 - 1;
            } else {
                return i7;
            }
        }
        return -(i4 + 1);
    }

    public static final <T extends Comparable<? super T>> int v(@l3.d List<? extends T> list, @l3.e T t3, int i4, int i5) {
        int l4;
        kotlin.jvm.internal.F.p(list, "<this>");
        W(list.size(), i4, i5);
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            l4 = kotlin.comparisons.g.l(list.get(i7), t3);
            if (l4 < 0) {
                i4 = i7 + 1;
            } else if (l4 > 0) {
                i6 = i7 - 1;
            } else {
                return i7;
            }
        }
        return -(i4 + 1);
    }

    public static final <T> int w(@l3.d List<? extends T> list, T t3, @l3.d Comparator<? super T> comparator, int i4, int i5) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        W(list.size(), i4, i5);
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            int compare = comparator.compare(list.get(i7), t3);
            if (compare < 0) {
                i4 = i7 + 1;
            } else if (compare > 0) {
                i6 = i7 - 1;
            } else {
                return i7;
            }
        }
        return -(i4 + 1);
    }

    public static /* synthetic */ int x(List list, int i4, int i5, X2.l lVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = list.size();
        }
        return u(list, i4, i5, lVar);
    }

    public static /* synthetic */ int y(List list, Comparable comparable, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = list.size();
        }
        return v(list, comparable, i4, i5);
    }

    public static /* synthetic */ int z(List list, Object obj, Comparator comparator, int i4, int i5, int i6, Object obj2) {
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = list.size();
        }
        return w(list, obj, comparator, i4, i5);
    }
}
