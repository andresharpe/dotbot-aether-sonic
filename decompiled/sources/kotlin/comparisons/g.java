package kotlin.comparisons;

import X2.p;
import java.util.Comparator;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class g {

    @U({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X2.l<T, Comparable<?>> f52010a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(X2.l<? super T, ? extends Comparable<?>> lVar) {
            this.f52010a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            int l4;
            X2.l<T, Comparable<?>> lVar = this.f52010a;
            l4 = g.l(lVar.C(t3), lVar.C(t4));
            return l4;
        }
    }

    @U({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f52011a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X2.l<T, K> f52012b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Comparator<? super K> comparator, X2.l<? super T, ? extends K> lVar) {
            this.f52011a = comparator;
            this.f52012b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            Comparator<? super K> comparator = this.f52011a;
            X2.l<T, K> lVar = this.f52012b;
            return comparator.compare(lVar.C(t3), lVar.C(t4));
        }
    }

    @U({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X2.l<T, Comparable<?>> f52013a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(X2.l<? super T, ? extends Comparable<?>> lVar) {
            this.f52013a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            int l4;
            X2.l<T, Comparable<?>> lVar = this.f52013a;
            l4 = g.l(lVar.C(t4), lVar.C(t3));
            return l4;
        }
    }

    @U({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class d<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f52014a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X2.l<T, K> f52015b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Comparator<? super K> comparator, X2.l<? super T, ? extends K> lVar) {
            this.f52014a = comparator;
            this.f52015b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            Comparator<? super K> comparator = this.f52014a;
            X2.l<T, K> lVar = this.f52015b;
            return comparator.compare(lVar.C(t4), lVar.C(t3));
        }
    }

    @U({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class e<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f52016a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X2.l<T, Comparable<?>> f52017b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Comparator<T> comparator, X2.l<? super T, ? extends Comparable<?>> lVar) {
            this.f52016a = comparator;
            this.f52017b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            int l4;
            int compare = this.f52016a.compare(t3, t4);
            if (compare == 0) {
                X2.l<T, Comparable<?>> lVar = this.f52017b;
                l4 = g.l(lVar.C(t3), lVar.C(t4));
                return l4;
            }
            return compare;
        }
    }

    @U({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class f<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f52018a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f52019b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X2.l<T, K> f52020c;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Comparator<T> comparator, Comparator<? super K> comparator2, X2.l<? super T, ? extends K> lVar) {
            this.f52018a = comparator;
            this.f52019b = comparator2;
            this.f52020c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            int compare = this.f52018a.compare(t3, t4);
            if (compare == 0) {
                Comparator<? super K> comparator = this.f52019b;
                X2.l<T, K> lVar = this.f52020c;
                return comparator.compare(lVar.C(t3), lVar.C(t4));
            }
            return compare;
        }
    }

    @U({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$g, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0460g<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f52021a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X2.l<T, Comparable<?>> f52022b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0460g(Comparator<T> comparator, X2.l<? super T, ? extends Comparable<?>> lVar) {
            this.f52021a = comparator;
            this.f52022b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            int l4;
            int compare = this.f52021a.compare(t3, t4);
            if (compare == 0) {
                X2.l<T, Comparable<?>> lVar = this.f52022b;
                l4 = g.l(lVar.C(t4), lVar.C(t3));
                return l4;
            }
            return compare;
        }
    }

    @U({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class h<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f52023a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f52024b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X2.l<T, K> f52025c;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Comparator<T> comparator, Comparator<? super K> comparator2, X2.l<? super T, ? extends K> lVar) {
            this.f52023a = comparator;
            this.f52024b = comparator2;
            this.f52025c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            int compare = this.f52023a.compare(t3, t4);
            if (compare == 0) {
                Comparator<? super K> comparator = this.f52024b;
                X2.l<T, K> lVar = this.f52025c;
                return comparator.compare(lVar.C(t4), lVar.C(t3));
            }
            return compare;
        }
    }

    @U({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class i<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f52026a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<T, T, Integer> f52027b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
            this.f52026a = comparator;
            this.f52027b = pVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            int compare = this.f52026a.compare(t3, t4);
            if (compare == 0) {
                return this.f52027b.c0(t3, t4).intValue();
            }
            return compare;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(Comparator this_then, Comparator comparator, Object obj, Object obj2) {
        F.p(this_then, "$this_then");
        F.p(comparator, "$comparator");
        int compare = this_then.compare(obj, obj2);
        if (compare == 0) {
            return comparator.compare(obj, obj2);
        }
        return compare;
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> B(Comparator<T> comparator, X2.l<? super T, ? extends Comparable<?>> selector) {
        F.p(comparator, "<this>");
        F.p(selector, "selector");
        return new e(comparator, selector);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> C(Comparator<T> comparator, Comparator<? super K> comparator2, X2.l<? super T, ? extends K> selector) {
        F.p(comparator, "<this>");
        F.p(comparator2, "comparator");
        F.p(selector, "selector");
        return new f(comparator, comparator2, selector);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> D(Comparator<T> comparator, X2.l<? super T, ? extends Comparable<?>> selector) {
        F.p(comparator, "<this>");
        F.p(selector, "selector");
        return new C0460g(comparator, selector);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> E(Comparator<T> comparator, Comparator<? super K> comparator2, X2.l<? super T, ? extends K> selector) {
        F.p(comparator, "<this>");
        F.p(comparator2, "comparator");
        F.p(selector, "selector");
        return new h(comparator, comparator2, selector);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> F(Comparator<T> comparator, p<? super T, ? super T, Integer> comparison) {
        F.p(comparator, "<this>");
        F.p(comparison, "comparison");
        return new i(comparator, comparison);
    }

    @l3.d
    public static final <T> Comparator<T> G(@l3.d final Comparator<T> comparator, @l3.d final Comparator<? super T> comparator2) {
        F.p(comparator, "<this>");
        F.p(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int H3;
                H3 = g.H(comparator, comparator2, obj, obj2);
                return H3;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H(Comparator this_thenDescending, Comparator comparator, Object obj, Object obj2) {
        F.p(this_thenDescending, "$this_thenDescending");
        F.p(comparator, "$comparator");
        int compare = this_thenDescending.compare(obj, obj2);
        if (compare == 0) {
            return comparator.compare(obj2, obj);
        }
        return compare;
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> f(X2.l<? super T, ? extends Comparable<?>> selector) {
        F.p(selector, "selector");
        return new a(selector);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> g(Comparator<? super K> comparator, X2.l<? super T, ? extends K> selector) {
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        return new b(comparator, selector);
    }

    @l3.d
    public static final <T> Comparator<T> h(@l3.d final X2.l<? super T, ? extends Comparable<?>>... selectors) {
        F.p(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: kotlin.comparisons.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i4;
                    i4 = g.i(selectors, obj, obj2);
                    return i4;
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(X2.l[] selectors, Object obj, Object obj2) {
        F.p(selectors, "$selectors");
        return p(obj, obj2, selectors);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> j(X2.l<? super T, ? extends Comparable<?>> selector) {
        F.p(selector, "selector");
        return new c(selector);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> k(Comparator<? super K> comparator, X2.l<? super T, ? extends K> selector) {
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        return new d(comparator, selector);
    }

    public static <T extends Comparable<?>> int l(@l3.e T t3, @l3.e T t4) {
        if (t3 == t4) {
            return 0;
        }
        if (t3 == null) {
            return -1;
        }
        if (t4 == null) {
            return 1;
        }
        return t3.compareTo(t4);
    }

    @kotlin.internal.f
    private static final <T> int m(T t3, T t4, X2.l<? super T, ? extends Comparable<?>> selector) {
        int l4;
        F.p(selector, "selector");
        l4 = l(selector.C(t3), selector.C(t4));
        return l4;
    }

    @kotlin.internal.f
    private static final <T, K> int n(T t3, T t4, Comparator<? super K> comparator, X2.l<? super T, ? extends K> selector) {
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        return comparator.compare(selector.C(t3), selector.C(t4));
    }

    public static <T> int o(T t3, T t4, @l3.d X2.l<? super T, ? extends Comparable<?>>... selectors) {
        F.p(selectors, "selectors");
        if (selectors.length > 0) {
            return p(t3, t4, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final <T> int p(T t3, T t4, X2.l<? super T, ? extends Comparable<?>>[] lVarArr) {
        int l4;
        for (X2.l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            l4 = l(lVar.C(t3), lVar.C(t4));
            if (l4 != 0) {
                return l4;
            }
        }
        return 0;
    }

    @l3.d
    public static final <T extends Comparable<? super T>> Comparator<T> q() {
        j jVar = j.f52028a;
        F.n(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return jVar;
    }

    @kotlin.internal.f
    private static final <T extends Comparable<? super T>> Comparator<T> r() {
        return s(q());
    }

    @l3.d
    public static final <T> Comparator<T> s(@l3.d final Comparator<? super T> comparator) {
        F.p(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int t3;
                t3 = g.t(comparator, obj, obj2);
                return t3;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(Comparator comparator, Object obj, Object obj2) {
        F.p(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @kotlin.internal.f
    private static final <T extends Comparable<? super T>> Comparator<T> u() {
        return v(q());
    }

    @l3.d
    public static final <T> Comparator<T> v(@l3.d final Comparator<? super T> comparator) {
        F.p(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int w3;
                w3 = g.w(comparator, obj, obj2);
                return w3;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(Comparator comparator, Object obj, Object obj2) {
        F.p(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @l3.d
    public static <T extends Comparable<? super T>> Comparator<T> x() {
        k kVar = k.f52029a;
        F.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return kVar;
    }

    @l3.d
    public static final <T> Comparator<T> y(@l3.d Comparator<T> comparator) {
        F.p(comparator, "<this>");
        if (comparator instanceof l) {
            return ((l) comparator).a();
        }
        Comparator<T> comparator2 = j.f52028a;
        if (F.g(comparator, comparator2)) {
            k kVar = k.f52029a;
            F.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return kVar;
        }
        if (F.g(comparator, k.f52029a)) {
            F.n(comparator2, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            comparator2 = new l<>(comparator);
        }
        return comparator2;
    }

    @l3.d
    public static final <T> Comparator<T> z(@l3.d final Comparator<T> comparator, @l3.d final Comparator<? super T> comparator2) {
        F.p(comparator, "<this>");
        F.p(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A3;
                A3 = g.A(comparator, comparator2, obj, obj2);
                return A3;
            }
        };
    }
}
