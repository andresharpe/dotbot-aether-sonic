package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.K0;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class A extends C2112z {
    @kotlin.internal.f
    private static final <T> void A0(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        q0(collection, elements);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> void B0(Collection<? super T> collection, T t3) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        collection.add(t3);
    }

    @kotlin.internal.f
    private static final <T> void C0(Collection<? super T> collection, kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        r0(collection, elements);
    }

    @kotlin.internal.f
    private static final <T> void D0(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        s0(collection, elements);
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @kotlin.V(expression = "removeAt(index)", imports = {}))
    @kotlin.internal.f
    private static final <T> T E0(List<T> list, int i4) {
        kotlin.jvm.internal.F.p(list, "<this>");
        return list.remove(i4);
    }

    @kotlin.internal.f
    private static final <T> boolean F0(Collection<? extends T> collection, T t3) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        return kotlin.jvm.internal.X.a(collection).remove(t3);
    }

    public static <T> boolean G0(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        return u0(iterable, predicate, true);
    }

    public static final <T> boolean H0(@l3.d Collection<? super T> collection, @l3.d Iterable<? extends T> elements) {
        Collection<?> t02;
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        t02 = t0(elements);
        return collection.removeAll(t02);
    }

    @kotlin.internal.f
    private static final <T> boolean I0(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        return kotlin.jvm.internal.X.a(collection).removeAll(elements);
    }

    public static final <T> boolean J0(@l3.d Collection<? super T> collection, @l3.d kotlin.sequences.m<? extends T> elements) {
        List c32;
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        c32 = SequencesKt___SequencesKt.c3(elements);
        if ((!c32.isEmpty()) && collection.removeAll(c32)) {
            return true;
        }
        return false;
    }

    public static final <T> boolean K0(@l3.d Collection<? super T> collection, @l3.d T[] elements) {
        boolean z3;
        List t3;
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        if (elements.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            t3 = C2100o.t(elements);
            if (!collection.removeAll(t3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static <T> boolean L0(@l3.d List<T> list, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        return v0(list, predicate, true);
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static <T> T M0(@l3.d List<T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static <T> T N0(@l3.d List<T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static <T> T O0(@l3.d List<T> list) {
        int J3;
        kotlin.jvm.internal.F.p(list, "<this>");
        if (!list.isEmpty()) {
            J3 = CollectionsKt__CollectionsKt.J(list);
            return list.remove(J3);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.4")
    public static final <T> T P0(@l3.d List<T> list) {
        int J3;
        kotlin.jvm.internal.F.p(list, "<this>");
        if (!list.isEmpty()) {
            J3 = CollectionsKt__CollectionsKt.J(list);
            return list.remove(J3);
        }
        return null;
    }

    public static <T> boolean Q0(@l3.d Iterable<? extends T> iterable, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        return u0(iterable, predicate, false);
    }

    public static final <T> boolean R0(@l3.d Collection<? super T> collection, @l3.d Iterable<? extends T> elements) {
        Collection<?> t02;
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        t02 = t0(elements);
        return collection.retainAll(t02);
    }

    @kotlin.internal.f
    private static final <T> boolean S0(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        return kotlin.jvm.internal.X.a(collection).retainAll(elements);
    }

    public static final <T> boolean T0(@l3.d Collection<? super T> collection, @l3.d kotlin.sequences.m<? extends T> elements) {
        List c32;
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        c32 = SequencesKt___SequencesKt.c3(elements);
        if (!c32.isEmpty()) {
            return collection.retainAll(c32);
        }
        return W0(collection);
    }

    public static final <T> boolean U0(@l3.d Collection<? super T> collection, @l3.d T[] elements) {
        boolean z3;
        List t3;
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        if (elements.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            t3 = C2100o.t(elements);
            return collection.retainAll(t3);
        }
        return W0(collection);
    }

    public static final <T> boolean V0(@l3.d List<T> list, @l3.d X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(list, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        return v0(list, predicate, false);
    }

    private static final boolean W0(Collection<?> collection) {
        boolean z3 = !collection.isEmpty();
        collection.clear();
        return z3;
    }

    public static <T> boolean q0(@l3.d Collection<? super T> collection, @l3.d Iterable<? extends T> elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z3 = true;
            }
        }
        return z3;
    }

    public static <T> boolean r0(@l3.d Collection<? super T> collection, @l3.d kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        Iterator<? extends T> it = elements.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z3 = true;
            }
        }
        return z3;
    }

    public static final <T> boolean s0(@l3.d Collection<? super T> collection, @l3.d T[] elements) {
        List t3;
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        t3 = C2100o.t(elements);
        return collection.addAll(t3);
    }

    @l3.d
    public static <T> Collection<T> t0(@l3.d Iterable<? extends T> iterable) {
        List V5;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            V5 = D.V5(iterable);
            return V5;
        }
        return (Collection) iterable;
    }

    private static final <T> boolean u0(Iterable<? extends T> iterable, X2.l<? super T, Boolean> lVar, boolean z3) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            if (lVar.C(it.next()).booleanValue() == z3) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    private static final <T> boolean v0(List<T> list, X2.l<? super T, Boolean> lVar, boolean z3) {
        int J3;
        int J4;
        if (list instanceof RandomAccess) {
            J3 = CollectionsKt__CollectionsKt.J(list);
            P it = new kotlin.ranges.l(0, J3).iterator();
            int i4 = 0;
            while (it.hasNext()) {
                int c4 = it.c();
                T t3 = list.get(c4);
                if (lVar.C(t3).booleanValue() != z3) {
                    if (i4 != c4) {
                        list.set(i4, t3);
                    }
                    i4++;
                }
            }
            if (i4 < list.size()) {
                J4 = CollectionsKt__CollectionsKt.J(list);
                if (i4 > J4) {
                    return true;
                }
                while (true) {
                    list.remove(J4);
                    if (J4 != i4) {
                        J4--;
                    } else {
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            kotlin.jvm.internal.F.n(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return u0(kotlin.jvm.internal.X.c(list), lVar, z3);
        }
    }

    @kotlin.internal.f
    private static final <T> void w0(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        H0(collection, elements);
    }

    @kotlin.internal.f
    private static final <T> void x0(Collection<? super T> collection, T t3) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        collection.remove(t3);
    }

    @kotlin.internal.f
    private static final <T> void y0(Collection<? super T> collection, kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        J0(collection, elements);
    }

    @kotlin.internal.f
    private static final <T> void z0(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        K0(collection, elements);
    }
}
