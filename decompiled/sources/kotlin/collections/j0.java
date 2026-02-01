package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.K0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class j0 extends i0 {
    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.6")
    @kotlin.internal.f
    private static final <E> Set<E> i(int i4, @InterfaceC2084c X2.l<? super Set<E>, H0> builderAction) {
        Set e4;
        Set<E> a4;
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        e4 = i0.e(i4);
        builderAction.C(e4);
        a4 = i0.a(e4);
        return a4;
    }

    @K0(markerClass = {kotlin.r.class})
    @kotlin.Y(version = "1.6")
    @kotlin.internal.f
    private static final <E> Set<E> j(@InterfaceC2084c X2.l<? super Set<E>, H0> builderAction) {
        Set<E> a4;
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        Set d4 = i0.d();
        builderAction.C(d4);
        a4 = i0.a(d4);
        return a4;
    }

    @l3.d
    public static <T> Set<T> k() {
        return EmptySet.f51829E;
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <T> HashSet<T> l() {
        return new HashSet<>();
    }

    @l3.d
    public static final <T> HashSet<T> m(@l3.d T... elements) {
        int j4;
        kotlin.jvm.internal.F.p(elements, "elements");
        j4 = X.j(elements.length);
        return (HashSet) C2101p.oy(elements, new HashSet(j4));
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <T> LinkedHashSet<T> n() {
        return new LinkedHashSet<>();
    }

    @l3.d
    public static final <T> LinkedHashSet<T> o(@l3.d T... elements) {
        int j4;
        kotlin.jvm.internal.F.p(elements, "elements");
        j4 = X.j(elements.length);
        return (LinkedHashSet) C2101p.oy(elements, new LinkedHashSet(j4));
    }

    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <T> Set<T> p() {
        return new LinkedHashSet();
    }

    @l3.d
    public static final <T> Set<T> q(@l3.d T... elements) {
        int j4;
        kotlin.jvm.internal.F.p(elements, "elements");
        j4 = X.j(elements.length);
        return (Set) C2101p.oy(elements, new LinkedHashSet(j4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T> Set<T> r(@l3.d Set<? extends T> set) {
        Set<T> k4;
        Set<T> f4;
        kotlin.jvm.internal.F.p(set, "<this>");
        int size = set.size();
        if (size == 0) {
            k4 = k();
            return k4;
        }
        if (size == 1) {
            f4 = i0.f(set.iterator().next());
            return f4;
        }
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> Set<T> s(Set<? extends T> set) {
        Set<T> k4;
        if (set == 0) {
            k4 = k();
            return k4;
        }
        return set;
    }

    @kotlin.internal.f
    private static final <T> Set<T> t() {
        Set<T> k4;
        k4 = k();
        return k4;
    }

    @l3.d
    public static final <T> Set<T> u(@l3.d T... elements) {
        Set<T> k4;
        kotlin.jvm.internal.F.p(elements, "elements");
        if (elements.length <= 0) {
            k4 = k();
            return k4;
        }
        return C2101p.lz(elements);
    }

    @l3.d
    @kotlin.Y(version = "1.4")
    public static final <T> Set<T> v(@l3.e T t3) {
        Set<T> k4;
        Set<T> f4;
        if (t3 != null) {
            f4 = i0.f(t3);
            return f4;
        }
        k4 = k();
        return k4;
    }

    @l3.d
    @kotlin.Y(version = "1.4")
    public static final <T> Set<T> w(@l3.d T... elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        return (Set) C2101p.Ua(elements, new LinkedHashSet());
    }
}
