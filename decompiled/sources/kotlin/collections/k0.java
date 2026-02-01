package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.jvm.internal.U({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n857#2,2:140\n847#2,2:142\n1#3:144\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n28#1:140,2\n52#1:142,2\n*E\n"})
/* loaded from: classes2.dex */
public class k0 extends j0 {
    @l3.d
    public static final <T> Set<T> A(@l3.d Set<? extends T> set, @l3.d T[] elements) {
        kotlin.jvm.internal.F.p(set, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        A.K0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @kotlin.internal.f
    private static final <T> Set<T> B(Set<? extends T> set, T t3) {
        Set<T> y3;
        kotlin.jvm.internal.F.p(set, "<this>");
        y3 = y(set, t3);
        return y3;
    }

    @l3.d
    public static <T> Set<T> C(@l3.d Set<? extends T> set, @l3.d Iterable<? extends T> elements) {
        int size;
        int j4;
        kotlin.jvm.internal.F.p(set, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        Integer c02 = C2109w.c0(elements);
        if (c02 != null) {
            size = set.size() + c02.intValue();
        } else {
            size = set.size() * 2;
        }
        j4 = X.j(size);
        LinkedHashSet linkedHashSet = new LinkedHashSet(j4);
        linkedHashSet.addAll(set);
        A.q0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @l3.d
    public static <T> Set<T> D(@l3.d Set<? extends T> set, T t3) {
        int j4;
        kotlin.jvm.internal.F.p(set, "<this>");
        j4 = X.j(set.size() + 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet(j4);
        linkedHashSet.addAll(set);
        linkedHashSet.add(t3);
        return linkedHashSet;
    }

    @l3.d
    public static final <T> Set<T> E(@l3.d Set<? extends T> set, @l3.d kotlin.sequences.m<? extends T> elements) {
        int j4;
        kotlin.jvm.internal.F.p(set, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        j4 = X.j(set.size() * 2);
        LinkedHashSet linkedHashSet = new LinkedHashSet(j4);
        linkedHashSet.addAll(set);
        A.r0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @l3.d
    public static final <T> Set<T> F(@l3.d Set<? extends T> set, @l3.d T[] elements) {
        int j4;
        kotlin.jvm.internal.F.p(set, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        j4 = X.j(set.size() + elements.length);
        LinkedHashSet linkedHashSet = new LinkedHashSet(j4);
        linkedHashSet.addAll(set);
        A.s0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @kotlin.internal.f
    private static final <T> Set<T> G(Set<? extends T> set, T t3) {
        Set<T> D3;
        kotlin.jvm.internal.F.p(set, "<this>");
        D3 = D(set, t3);
        return D3;
    }

    @l3.d
    public static final <T> Set<T> x(@l3.d Set<? extends T> set, @l3.d Iterable<? extends T> elements) {
        Collection<?> t02;
        Set<T> a6;
        kotlin.jvm.internal.F.p(set, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        t02 = A.t0(elements);
        if (t02.isEmpty()) {
            a6 = D.a6(set);
            return a6;
        }
        if (t02 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t3 : set) {
                if (!t02.contains(t3)) {
                    linkedHashSet.add(t3);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(t02);
        return linkedHashSet2;
    }

    @l3.d
    public static <T> Set<T> y(@l3.d Set<? extends T> set, T t3) {
        int j4;
        kotlin.jvm.internal.F.p(set, "<this>");
        j4 = X.j(set.size());
        LinkedHashSet linkedHashSet = new LinkedHashSet(j4);
        boolean z3 = false;
        for (T t4 : set) {
            boolean z4 = true;
            if (!z3 && kotlin.jvm.internal.F.g(t4, t3)) {
                z3 = true;
                z4 = false;
            }
            if (z4) {
                linkedHashSet.add(t4);
            }
        }
        return linkedHashSet;
    }

    @l3.d
    public static final <T> Set<T> z(@l3.d Set<? extends T> set, @l3.d kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.F.p(set, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        A.J0(linkedHashSet, elements);
        return linkedHashSet;
    }
}
