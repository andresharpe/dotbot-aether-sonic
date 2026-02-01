package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.H0;
import kotlin.collections.builders.SetBuilder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i0 {
    @l3.d
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static <E> Set<E> a(@l3.d Set<E> builder) {
        kotlin.jvm.internal.F.p(builder, "builder");
        return ((SetBuilder) builder).c();
    }

    @kotlin.U
    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final <E> Set<E> b(int i4, X2.l<? super Set<E>, H0> builderAction) {
        Set e4;
        Set<E> a4;
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        e4 = e(i4);
        builderAction.C(e4);
        a4 = a(e4);
        return a4;
    }

    @kotlin.U
    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final <E> Set<E> c(X2.l<? super Set<E>, H0> builderAction) {
        Set<E> a4;
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        Set d4 = d();
        builderAction.C(d4);
        a4 = a(d4);
        return a4;
    }

    @l3.d
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static final <E> Set<E> d() {
        return new SetBuilder();
    }

    @l3.d
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static <E> Set<E> e(int i4) {
        return new SetBuilder(i4);
    }

    @l3.d
    public static <T> Set<T> f(T t3) {
        Set<T> singleton = Collections.singleton(t3);
        kotlin.jvm.internal.F.o(singleton, "singleton(...)");
        return singleton;
    }

    @l3.d
    public static final <T> TreeSet<T> g(@l3.d Comparator<? super T> comparator, @l3.d T... elements) {
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(elements, "elements");
        return (TreeSet) C2101p.oy(elements, new TreeSet(comparator));
    }

    @l3.d
    public static final <T> TreeSet<T> h(@l3.d T... elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        return (TreeSet) C2101p.oy(elements, new TreeSet());
    }
}
