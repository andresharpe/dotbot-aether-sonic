package kotlin.sequences;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;
import kotlin.N;
import kotlin.V;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;

/* JADX INFO: Access modifiers changed from: package-private */
@U({"SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1433#2,14:173\n1839#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"})
/* loaded from: classes2.dex */
public class t extends s {

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.l<Object, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Class<R> f52670F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class<R> cls) {
            super(1);
            this.f52670F = cls;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.e Object obj) {
            return Boolean.valueOf(this.f52670F.isInstance(obj));
        }
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object A(m mVar, Comparator comparator) {
        F.p(mVar, "<this>");
        F.p(comparator, "comparator");
        return SequencesKt___SequencesKt.I1(mVar, comparator);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable B(m mVar) {
        F.p(mVar, "<this>");
        return SequencesKt___SequencesKt.U1(mVar);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @V(expression = "this.minOrNull()", imports = {}))
    @Y(version = "1.1")
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double C(m mVar) {
        F.p(mVar, "<this>");
        return SequencesKt___SequencesKt.V1(mVar);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @V(expression = "this.minOrNull()", imports = {}))
    @Y(version = "1.1")
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float D(m mVar) {
        F.p(mVar, "<this>");
        return SequencesKt___SequencesKt.W1(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T E(m<? extends T> mVar, X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object F(m mVar, Comparator comparator) {
        F.p(mVar, "<this>");
        F.p(comparator, "comparator");
        return SequencesKt___SequencesKt.a2(mVar, comparator);
    }

    @W2.i(name = "sumOfBigDecimal")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> BigDecimal G(m<? extends T> mVar, X2.l<? super T, ? extends BigDecimal> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        F.o(valueOf, "valueOf(...)");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(selector.C(it.next()));
            F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @W2.i(name = "sumOfBigInteger")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> BigInteger H(m<? extends T> mVar, X2.l<? super T, ? extends BigInteger> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        F.o(valueOf, "valueOf(...)");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(selector.C(it.next()));
            F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @l3.d
    public static final <T extends Comparable<? super T>> SortedSet<T> I(@l3.d m<? extends T> mVar) {
        F.p(mVar, "<this>");
        return (SortedSet) SequencesKt___SequencesKt.a3(mVar, new TreeSet());
    }

    @l3.d
    public static final <T> SortedSet<T> J(@l3.d m<? extends T> mVar, @l3.d Comparator<? super T> comparator) {
        F.p(mVar, "<this>");
        F.p(comparator, "comparator");
        return (SortedSet) SequencesKt___SequencesKt.a3(mVar, new TreeSet(comparator));
    }

    @l3.d
    public static final <R> m<R> u(@l3.d m<?> mVar, @l3.d Class<R> klass) {
        m<R> p02;
        F.p(mVar, "<this>");
        F.p(klass, "klass");
        p02 = SequencesKt___SequencesKt.p0(mVar, new a(klass));
        F.n(p02, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return p02;
    }

    @l3.d
    public static final <C extends Collection<? super R>, R> C v(@l3.d m<?> mVar, @l3.d C destination, @l3.d Class<R> klass) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(klass, "klass");
        for (Object obj : mVar) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable w(m mVar) {
        F.p(mVar, "<this>");
        return SequencesKt___SequencesKt.C1(mVar);
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @V(expression = "this.maxOrNull()", imports = {}))
    @Y(version = "1.1")
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double x(m mVar) {
        F.p(mVar, "<this>");
        return SequencesKt___SequencesKt.D1(mVar);
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @V(expression = "this.maxOrNull()", imports = {}))
    @Y(version = "1.1")
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float y(m mVar) {
        F.p(mVar, "<this>");
        return SequencesKt___SequencesKt.E1(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T z(m<? extends T> mVar, X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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
}
