package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.jvm.internal.U({"SMAP\n_CollectionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1963#2,14:169\n2333#2,14:183\n*S KotlinDebug\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n*L\n89#1:169,14\n126#1:183,14\n*E\n"})
/* loaded from: classes2.dex */
public class C extends B {
    @l3.d
    public static final <R> List<R> f1(@l3.d Iterable<?> iterable, @l3.d Class<R> klass) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(klass, "klass");
        return (List) g1(iterable, new ArrayList(), klass);
    }

    @l3.d
    public static final <C extends Collection<? super R>, R> C g1(@l3.d Iterable<?> iterable, @l3.d C destination, @l3.d Class<R> klass) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(klass, "klass");
        for (Object obj : iterable) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable h1(Iterable iterable) {
        Comparable P3;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        P3 = D.P3(iterable);
        return P3;
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxOrNull()", imports = {}))
    @kotlin.Y(version = "1.1")
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double i1(Iterable iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        return D.Q3(iterable);
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxOrNull()", imports = {}))
    @kotlin.Y(version = "1.1")
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float j1(Iterable iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        return D.R3(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T k1(Iterable<? extends T> iterable, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
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
        }
        return next;
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object l1(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return D.V3(iterable, comparator);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @kotlin.V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable m1(Iterable iterable) {
        Comparable h4;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        h4 = D.h4(iterable);
        return h4;
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @kotlin.V(expression = "this.minOrNull()", imports = {}))
    @kotlin.Y(version = "1.1")
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double n1(Iterable iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        return D.i4(iterable);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @kotlin.V(expression = "this.minOrNull()", imports = {}))
    @kotlin.Y(version = "1.1")
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float o1(Iterable iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        return D.j4(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @kotlin.V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T p1(Iterable<? extends T> iterable, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
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
        }
        return next;
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object q1(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return D.n4(iterable, comparator);
    }

    public static <T> void r1(@l3.d List<T> list) {
        kotlin.jvm.internal.F.p(list, "<this>");
        Collections.reverse(list);
    }

    @W2.i(name = "sumOfBigDecimal")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> BigDecimal s1(Iterable<? extends T> iterable, X2.l<? super T, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(selector.C(it.next()));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @W2.i(name = "sumOfBigInteger")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> BigInteger t1(Iterable<? extends T> iterable, X2.l<? super T, ? extends BigInteger> selector) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(selector.C(it.next()));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @l3.d
    public static final <T extends Comparable<? super T>> SortedSet<T> u1(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        return (SortedSet) D.Q5(iterable, new TreeSet());
    }

    @l3.d
    public static final <T> SortedSet<T> v1(@l3.d Iterable<? extends T> iterable, @l3.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return (SortedSet) D.Q5(iterable, new TreeSet(comparator));
    }
}
