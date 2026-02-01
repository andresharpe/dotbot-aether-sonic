package kotlin.sequences;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C2122h0;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;
import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.N;
import kotlin.Pair;
import kotlin.V;
import kotlin.W;
import kotlin.Y;
import kotlin.collections.C2100o;
import kotlin.collections.C2101p;
import kotlin.collections.C2108v;
import kotlin.collections.C2112z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.D;
import kotlin.collections.I;
import kotlin.collections.M;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.m0;
import kotlin.comparisons.g;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.U;
import kotlin.t0;
import kotlin.x0;

@U({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3112:1\n179#1,2:3113\n316#1,7:3115\n1324#1,3:3123\n739#1,4:3126\n704#1,4:3130\n722#1,4:3134\n775#1,4:3138\n1017#1,3:3142\n1020#1,3:3152\n1037#1,3:3155\n1040#1,3:3165\n1324#1,3:3182\n1313#1,2:3185\n1#2:3122\n372#3,7:3145\n372#3,7:3158\n372#3,7:3168\n372#3,7:3175\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n87#1:3113,2\n99#1:3115,7\n458#1:3123,3\n658#1:3126,4\n674#1:3130,4\n689#1:3134,4\n760#1:3138,4\n988#1:3142,3\n988#1:3152,3\n1003#1:3155,3\n1003#1:3165,3\n1106#1:3182,3\n1144#1:3185,2\n988#1:3145,7\n1003#1:3158,7\n1019#1:3168,7\n1039#1:3175,7\n*E\n"})
/* loaded from: classes2.dex */
public class SequencesKt___SequencesKt extends kotlin.sequences.t {

    @kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {2873}, m = "invokeSuspend", n = {"$this$result", "iterator", L1.a.f1577e0}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes2.dex */
    public static final class A<R> extends RestrictedSuspendLambda implements X2.p<kotlin.sequences.o<? super R>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: G */
        Object f52524G;

        /* renamed from: H */
        Object f52525H;

        /* renamed from: I */
        int f52526I;

        /* renamed from: J */
        private /* synthetic */ Object f52527J;

        /* renamed from: K */
        final /* synthetic */ kotlin.sequences.m<T> f52528K;

        /* renamed from: L */
        final /* synthetic */ X2.p<T, T, R> f52529L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        A(kotlin.sequences.m<? extends T> mVar, X2.p<? super T, ? super T, ? extends R> pVar, kotlin.coroutines.c<? super A> cVar) {
            super(2, cVar);
            this.f52528K = mVar;
            this.f52529L = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005b -> B:5:0x0018). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r6.f52526I
                r2 = 1
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r6.f52525H
                java.lang.Object r3 = r6.f52524G
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r6.f52527J
                kotlin.sequences.o r4 = (kotlin.sequences.o) r4
                kotlin.W.n(r7)
            L18:
                r7 = r1
                goto L3f
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                kotlin.W.n(r7)
                java.lang.Object r7 = r6.f52527J
                kotlin.sequences.o r7 = (kotlin.sequences.o) r7
                kotlin.sequences.m<T> r1 = r6.f52528K
                java.util.Iterator r1 = r1.iterator()
                boolean r3 = r1.hasNext()
                if (r3 != 0) goto L38
                kotlin.H0 r7 = kotlin.H0.f51801a
                return r7
            L38:
                java.lang.Object r3 = r1.next()
                r4 = r7
                r7 = r3
                r3 = r1
            L3f:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L5e
                java.lang.Object r1 = r3.next()
                X2.p<T, T, R> r5 = r6.f52529L
                java.lang.Object r7 = r5.c0(r7, r1)
                r6.f52527J = r4
                r6.f52524G = r3
                r6.f52525H = r1
                r6.f52526I = r2
                java.lang.Object r7 = r4.b(r7, r6)
                if (r7 != r0) goto L18
                return r0
            L5e:
                kotlin.H0 r7 = kotlin.H0.f51801a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt.A.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J */
        public final Object c0(@l3.d kotlin.sequences.o<? super R> oVar, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((A) v(oVar, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            A a4 = new A(this.f52528K, this.f52529L, cVar);
            a4.f52527J = obj;
            return a4;
        }
    }

    @U({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,70:1\n2921#2:71\n*E\n"})
    /* renamed from: kotlin.sequences.SequencesKt___SequencesKt$a */
    /* loaded from: classes2.dex */
    public static final class C2216a<T> implements Iterable<T>, Y2.a {

        /* renamed from: E */
        final /* synthetic */ kotlin.sequences.m f52530E;

        public C2216a(kotlin.sequences.m mVar) {
            this.f52530E = mVar;
        }

        @Override // java.lang.Iterable
        @l3.d
        public Iterator<T> iterator() {
            return this.f52530E.iterator();
        }
    }

    /* loaded from: classes2.dex */
    static final class b<T> extends Lambda implements X2.l<T, T> {

        /* renamed from: F */
        public static final b f52531F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        public final T C(T t3) {
            return t3;
        }
    }

    /* loaded from: classes2.dex */
    static final class c<T> extends Lambda implements X2.l<Integer, T> {

        /* renamed from: F */
        final /* synthetic */ int f52532F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i4) {
            super(1);
            this.f52532F = i4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ Object C(Integer num) {
            return c(num.intValue());
        }

        public final T c(int i4) {
            throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.f52532F + '.');
        }
    }

    /* loaded from: classes2.dex */
    static final class d<T> extends Lambda implements X2.l<M<? extends T>, Boolean> {

        /* renamed from: F */
        final /* synthetic */ X2.p<Integer, T, Boolean> f52533F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(X2.p<? super Integer, ? super T, Boolean> pVar) {
            super(1);
            this.f52533F = pVar;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c */
        public final Boolean C(@l3.d M<? extends T> it) {
            F.p(it, "it");
            return this.f52533F.c0(Integer.valueOf(it.e()), it.f());
        }
    }

    /* loaded from: classes2.dex */
    static final class e<T> extends Lambda implements X2.l<M<? extends T>, T> {

        /* renamed from: F */
        public static final e f52534F = new e();

        e() {
            super(1);
        }

        @Override // X2.l
        /* renamed from: c */
        public final T C(@l3.d M<? extends T> it) {
            F.p(it, "it");
            return it.f();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f<T> extends Lambda implements X2.l<T, Boolean> {

        /* renamed from: F */
        public static final f f52535F = new f();

        f() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c */
        public final Boolean C(@l3.e T t3) {
            boolean z3;
            if (t3 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            return Boolean.valueOf(z3);
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class g<R> extends FunctionReferenceImpl implements X2.l<Iterable<? extends R>, Iterator<? extends R>> {

        /* renamed from: N */
        public static final g f52537N = new g();

        g() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0 */
        public final Iterator<R> C(@l3.d Iterable<? extends R> p02) {
            F.p(p02, "p0");
            return p02.iterator();
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class h<R> extends FunctionReferenceImpl implements X2.l<kotlin.sequences.m<? extends R>, Iterator<? extends R>> {

        /* renamed from: N */
        public static final h f52538N = new h();

        h() {
            super(1, kotlin.sequences.m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0 */
        public final Iterator<R> C(@l3.d kotlin.sequences.m<? extends R> p02) {
            F.p(p02, "p0");
            return p02.iterator();
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class i<R> extends FunctionReferenceImpl implements X2.l<Iterable<? extends R>, Iterator<? extends R>> {

        /* renamed from: N */
        public static final i f52539N = new i();

        i() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0 */
        public final Iterator<R> C(@l3.d Iterable<? extends R> p02) {
            F.p(p02, "p0");
            return p02.iterator();
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class j<R> extends FunctionReferenceImpl implements X2.l<kotlin.sequences.m<? extends R>, Iterator<? extends R>> {

        /* renamed from: N */
        public static final j f52540N = new j();

        j() {
            super(1, kotlin.sequences.m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0 */
        public final Iterator<R> C(@l3.d kotlin.sequences.m<? extends R> p02) {
            F.p(p02, "p0");
            return p02.iterator();
        }
    }

    @U({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$groupingBy$1\n*L\n1#1,3112:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class k<K, T> implements I<T, K> {

        /* renamed from: a */
        final /* synthetic */ kotlin.sequences.m<T> f52541a;

        /* renamed from: b */
        final /* synthetic */ X2.l<T, K> f52542b;

        /* JADX WARN: Multi-variable type inference failed */
        public k(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, ? extends K> lVar) {
            this.f52541a = mVar;
            this.f52542b = lVar;
        }

        @Override // kotlin.collections.I
        public K a(T t3) {
            return this.f52542b.C(t3);
        }

        @Override // kotlin.collections.I
        @l3.d
        public Iterator<T> b() {
            return this.f52541a.iterator();
        }
    }

    /* loaded from: classes2.dex */
    public static final class l<T> implements kotlin.sequences.m<T> {

        /* renamed from: a */
        final /* synthetic */ kotlin.sequences.m<T> f52543a;

        /* renamed from: b */
        final /* synthetic */ T f52544b;

        /* loaded from: classes2.dex */
        static final class a extends Lambda implements X2.l<T, Boolean> {

            /* renamed from: F */
            final /* synthetic */ Ref.BooleanRef f52545F;

            /* renamed from: G */
            final /* synthetic */ T f52546G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ref.BooleanRef booleanRef, T t3) {
                super(1);
                this.f52545F = booleanRef;
                this.f52546G = t3;
            }

            @Override // X2.l
            @l3.d
            /* renamed from: c */
            public final Boolean C(T t3) {
                boolean z3 = true;
                if (!this.f52545F.f52294E && F.g(t3, this.f52546G)) {
                    this.f52545F.f52294E = true;
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        l(kotlin.sequences.m<? extends T> mVar, T t3) {
            this.f52543a = mVar;
            this.f52544b = t3;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<T> iterator() {
            kotlin.sequences.m p02;
            p02 = SequencesKt___SequencesKt.p0(this.f52543a, new a(new Ref.BooleanRef(), this.f52544b));
            return p02.iterator();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m<T> implements kotlin.sequences.m<T> {

        /* renamed from: a */
        final /* synthetic */ kotlin.sequences.m<T> f52547a;

        /* renamed from: b */
        final /* synthetic */ T[] f52548b;

        /* loaded from: classes2.dex */
        static final class a extends Lambda implements X2.l<T, Boolean> {

            /* renamed from: F */
            final /* synthetic */ T[] f52549F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(T[] tArr) {
                super(1);
                this.f52549F = tArr;
            }

            @Override // X2.l
            @l3.d
            /* renamed from: c */
            public final Boolean C(T t3) {
                boolean s8;
                s8 = C2101p.s8(this.f52549F, t3);
                return Boolean.valueOf(s8);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        m(kotlin.sequences.m<? extends T> mVar, T[] tArr) {
            this.f52547a = mVar;
            this.f52548b = tArr;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<T> iterator() {
            return SequencesKt___SequencesKt.u0(this.f52547a, new a(this.f52548b)).iterator();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n<T> implements kotlin.sequences.m<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable<T> f52550a;

        /* renamed from: b */
        final /* synthetic */ kotlin.sequences.m<T> f52551b;

        /* loaded from: classes2.dex */
        static final class a extends Lambda implements X2.l<T, Boolean> {

            /* renamed from: F */
            final /* synthetic */ Collection<T> f52552F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Collection<? extends T> collection) {
                super(1);
                this.f52552F = collection;
            }

            @Override // X2.l
            @l3.d
            /* renamed from: c */
            public final Boolean C(T t3) {
                return Boolean.valueOf(this.f52552F.contains(t3));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        n(Iterable<? extends T> iterable, kotlin.sequences.m<? extends T> mVar) {
            this.f52550a = iterable;
            this.f52551b = mVar;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<T> iterator() {
            Collection t02;
            t02 = kotlin.collections.A.t0(this.f52550a);
            if (t02.isEmpty()) {
                return this.f52551b.iterator();
            }
            return SequencesKt___SequencesKt.u0(this.f52551b, new a(t02)).iterator();
        }
    }

    /* loaded from: classes2.dex */
    public static final class o<T> implements kotlin.sequences.m<T> {

        /* renamed from: a */
        final /* synthetic */ kotlin.sequences.m<T> f52553a;

        /* renamed from: b */
        final /* synthetic */ kotlin.sequences.m<T> f52554b;

        /* loaded from: classes2.dex */
        static final class a extends Lambda implements X2.l<T, Boolean> {

            /* renamed from: F */
            final /* synthetic */ List<T> f52555F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends T> list) {
                super(1);
                this.f52555F = list;
            }

            @Override // X2.l
            @l3.d
            /* renamed from: c */
            public final Boolean C(T t3) {
                return Boolean.valueOf(this.f52555F.contains(t3));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        o(kotlin.sequences.m<? extends T> mVar, kotlin.sequences.m<? extends T> mVar2) {
            this.f52553a = mVar;
            this.f52554b = mVar2;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<T> iterator() {
            List c32;
            c32 = SequencesKt___SequencesKt.c3(this.f52553a);
            if (c32.isEmpty()) {
                return this.f52554b.iterator();
            }
            return SequencesKt___SequencesKt.u0(this.f52554b, new a(c32)).iterator();
        }
    }

    /* loaded from: classes2.dex */
    static final class p<T> extends Lambda implements X2.l<T, T> {

        /* renamed from: F */
        final /* synthetic */ X2.l<T, H0> f52556F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(X2.l<? super T, H0> lVar) {
            super(1);
            this.f52556F = lVar;
        }

        @Override // X2.l
        public final T C(T t3) {
            this.f52556F.C(t3);
            return t3;
        }
    }

    /* loaded from: classes2.dex */
    static final class q<T> extends Lambda implements X2.p<Integer, T, T> {

        /* renamed from: F */
        final /* synthetic */ X2.p<Integer, T, H0> f52557F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(X2.p<? super Integer, ? super T, H0> pVar) {
            super(2);
            this.f52557F = pVar;
        }

        public final T c(int i4, T t3) {
            this.f52557F.c0(Integer.valueOf(i4), t3);
            return t3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X2.p
        public /* bridge */ /* synthetic */ Object c0(Integer num, Object obj) {
            return c(num.intValue(), obj);
        }
    }

    /* loaded from: classes2.dex */
    static final class r<T> extends Lambda implements X2.l<T, T> {

        /* renamed from: F */
        final /* synthetic */ kotlin.sequences.m<T> f52558F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(kotlin.sequences.m<? extends T> mVar) {
            super(1);
            this.f52558F = mVar;
        }

        @Override // X2.l
        @l3.d
        public final T C(@l3.e T t3) {
            if (t3 != null) {
                return t3;
            }
            throw new IllegalArgumentException("null element found in " + this.f52558F + '.');
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1}, l = {2308, 2312}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator"}, s = {"L$0", "L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class s<R> extends RestrictedSuspendLambda implements X2.p<kotlin.sequences.o<? super R>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: G */
        Object f52559G;

        /* renamed from: H */
        Object f52560H;

        /* renamed from: I */
        int f52561I;

        /* renamed from: J */
        private /* synthetic */ Object f52562J;

        /* renamed from: K */
        final /* synthetic */ R f52563K;

        /* renamed from: L */
        final /* synthetic */ kotlin.sequences.m<T> f52564L;

        /* renamed from: M */
        final /* synthetic */ X2.p<R, T, R> f52565M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(R r4, kotlin.sequences.m<? extends T> mVar, X2.p<? super R, ? super T, ? extends R> pVar, kotlin.coroutines.c<? super s> cVar) {
            super(2, cVar);
            this.f52563K = r4;
            this.f52564L = mVar;
            this.f52565M = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0068 -> B:6:0x001b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r6.f52561I
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r6.f52560H
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r6.f52559G
                java.lang.Object r4 = r6.f52562J
                kotlin.sequences.o r4 = (kotlin.sequences.o) r4
                kotlin.W.n(r7)
            L1b:
                r7 = r3
                goto L4c
            L1d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L25:
                java.lang.Object r1 = r6.f52562J
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                kotlin.W.n(r7)
                goto L42
            L2d:
                kotlin.W.n(r7)
                java.lang.Object r7 = r6.f52562J
                r1 = r7
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                R r7 = r6.f52563K
                r6.f52562J = r1
                r6.f52561I = r3
                java.lang.Object r7 = r1.b(r7, r6)
                if (r7 != r0) goto L42
                return r0
            L42:
                R r7 = r6.f52563K
                kotlin.sequences.m<T> r3 = r6.f52564L
                java.util.Iterator r3 = r3.iterator()
                r4 = r1
                r1 = r3
            L4c:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L6b
                java.lang.Object r3 = r1.next()
                X2.p<R, T, R> r5 = r6.f52565M
                java.lang.Object r3 = r5.c0(r7, r3)
                r6.f52562J = r4
                r6.f52559G = r3
                r6.f52560H = r1
                r6.f52561I = r2
                java.lang.Object r7 = r4.b(r3, r6)
                if (r7 != r0) goto L1b
                return r0
            L6b:
                kotlin.H0 r7 = kotlin.H0.f51801a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt.s.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J */
        public final Object c0(@l3.d kotlin.sequences.o<? super R> oVar, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((s) v(oVar, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            s sVar = new s(this.f52563K, this.f52564L, this.f52565M, cVar);
            sVar.f52562J = obj;
            return sVar;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2336, 2341}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", FirebaseAnalytics.b.f34777X}, s = {"L$0", "L$0", "L$1", "I$0"})
    /* loaded from: classes2.dex */
    public static final class t<R> extends RestrictedSuspendLambda implements X2.p<kotlin.sequences.o<? super R>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: G */
        Object f52566G;

        /* renamed from: H */
        Object f52567H;

        /* renamed from: I */
        int f52568I;

        /* renamed from: J */
        int f52569J;

        /* renamed from: K */
        private /* synthetic */ Object f52570K;

        /* renamed from: L */
        final /* synthetic */ R f52571L;

        /* renamed from: M */
        final /* synthetic */ kotlin.sequences.m<T> f52572M;

        /* renamed from: N */
        final /* synthetic */ X2.q<Integer, R, T, R> f52573N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(R r4, kotlin.sequences.m<? extends T> mVar, X2.q<? super Integer, ? super R, ? super T, ? extends R> qVar, kotlin.coroutines.c<? super t> cVar) {
            super(2, cVar);
            this.f52571L = r4;
            this.f52572M = mVar;
            this.f52573N = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r8.f52569J
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r8.f52568I
                java.lang.Object r3 = r8.f52567H
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r8.f52566G
                java.lang.Object r5 = r8.f52570K
                kotlin.sequences.o r5 = (kotlin.sequences.o) r5
                kotlin.W.n(r9)
                r9 = r4
                r4 = r1
                goto L4f
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                java.lang.Object r1 = r8.f52570K
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                kotlin.W.n(r9)
                goto L45
            L30:
                kotlin.W.n(r9)
                java.lang.Object r9 = r8.f52570K
                r1 = r9
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                R r9 = r8.f52571L
                r8.f52570K = r1
                r8.f52569J = r3
                java.lang.Object r9 = r1.b(r9, r8)
                if (r9 != r0) goto L45
                return r0
            L45:
                R r9 = r8.f52571L
                kotlin.sequences.m<T> r3 = r8.f52572M
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
                r5 = r1
            L4f:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L7e
                java.lang.Object r1 = r3.next()
                X2.q<java.lang.Integer, R, T, R> r6 = r8.f52573N
                int r7 = r4 + 1
                if (r4 >= 0) goto L62
                kotlin.collections.C2107u.Z()
            L62:
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.f(r4)
                java.lang.Object r4 = r6.z(r4, r9, r1)
                r8.f52570K = r5
                r8.f52566G = r4
                r8.f52567H = r3
                r8.f52568I = r7
                r8.f52569J = r2
                java.lang.Object r9 = r5.b(r4, r8)
                if (r9 != r0) goto L7b
                return r0
            L7b:
                r9 = r4
                r4 = r7
                goto L4f
            L7e:
                kotlin.H0 r9 = kotlin.H0.f51801a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt.t.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J */
        public final Object c0(@l3.d kotlin.sequences.o<? super R> oVar, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((t) v(oVar, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            t tVar = new t(this.f52571L, this.f52572M, this.f52573N, cVar);
            tVar.f52570K = obj;
            return tVar;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2366, 2369}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* loaded from: classes2.dex */
    static final class u<S> extends RestrictedSuspendLambda implements X2.p<kotlin.sequences.o<? super S>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: G */
        Object f52574G;

        /* renamed from: H */
        Object f52575H;

        /* renamed from: I */
        int f52576I;

        /* renamed from: J */
        private /* synthetic */ Object f52577J;

        /* renamed from: K */
        final /* synthetic */ kotlin.sequences.m<T> f52578K;

        /* renamed from: L */
        final /* synthetic */ X2.p<S, T, S> f52579L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(kotlin.sequences.m<? extends T> mVar, X2.p<? super S, ? super T, ? extends S> pVar, kotlin.coroutines.c<? super u> cVar) {
            super(2, cVar);
            this.f52578K = mVar;
            this.f52579L = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            kotlin.sequences.o oVar;
            Object next;
            Iterator it;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f52576I;
            if (i4 != 0) {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                next = this.f52575H;
                it = (Iterator) this.f52574G;
                oVar = (kotlin.sequences.o) this.f52577J;
                W.n(obj);
            } else {
                W.n(obj);
                oVar = (kotlin.sequences.o) this.f52577J;
                Iterator it2 = this.f52578K.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    this.f52577J = oVar;
                    this.f52574G = it2;
                    this.f52575H = next;
                    this.f52576I = 1;
                    if (oVar.b(next, this) == l4) {
                        return l4;
                    }
                    it = it2;
                }
                return H0.f51801a;
            }
            while (it.hasNext()) {
                next = this.f52579L.c0(next, it.next());
                this.f52577J = oVar;
                this.f52574G = it;
                this.f52575H = next;
                this.f52576I = 2;
                if (oVar.b(next, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J */
        public final Object c0(@l3.d kotlin.sequences.o<? super S> oVar, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((u) v(oVar, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            u uVar = new u(this.f52578K, this.f52579L, cVar);
            uVar.f52577J = obj;
            return uVar;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2395, 2399}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", FirebaseAnalytics.b.f34777X}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
    /* loaded from: classes2.dex */
    static final class v<S> extends RestrictedSuspendLambda implements X2.p<kotlin.sequences.o<? super S>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: G */
        Object f52580G;

        /* renamed from: H */
        Object f52581H;

        /* renamed from: I */
        int f52582I;

        /* renamed from: J */
        int f52583J;

        /* renamed from: K */
        private /* synthetic */ Object f52584K;

        /* renamed from: L */
        final /* synthetic */ kotlin.sequences.m<T> f52585L;

        /* renamed from: M */
        final /* synthetic */ X2.q<Integer, S, T, S> f52586M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        v(kotlin.sequences.m<? extends T> mVar, X2.q<? super Integer, ? super S, ? super T, ? extends S> qVar, kotlin.coroutines.c<? super v> cVar) {
            super(2, cVar);
            this.f52585L = mVar;
            this.f52586M = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            kotlin.sequences.o oVar;
            Iterator it;
            Object next;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f52583J;
            int i5 = 1;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i6 = this.f52582I;
                        Object obj2 = this.f52581H;
                        it = (Iterator) this.f52580G;
                        oVar = (kotlin.sequences.o) this.f52584K;
                        W.n(obj);
                        i5 = i6;
                        next = obj2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    next = this.f52581H;
                    it = (Iterator) this.f52580G;
                    oVar = (kotlin.sequences.o) this.f52584K;
                    W.n(obj);
                }
            } else {
                W.n(obj);
                oVar = (kotlin.sequences.o) this.f52584K;
                it = this.f52585L.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    this.f52584K = oVar;
                    this.f52580G = it;
                    this.f52581H = next;
                    this.f52583J = 1;
                    if (oVar.b(next, this) == l4) {
                        return l4;
                    }
                }
                return H0.f51801a;
            }
            while (it.hasNext()) {
                X2.q<Integer, S, T, S> qVar = this.f52586M;
                int i7 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.Z();
                }
                Object z3 = qVar.z(kotlin.coroutines.jvm.internal.a.f(i5), next, it.next());
                this.f52584K = oVar;
                this.f52580G = it;
                this.f52581H = z3;
                this.f52582I = i7;
                this.f52583J = 2;
                if (oVar.b(z3, this) == l4) {
                    return l4;
                }
                next = z3;
                i5 = i7;
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J */
        public final Object c0(@l3.d kotlin.sequences.o<? super S> oVar, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((v) v(oVar, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            v vVar = new v(this.f52585L, this.f52586M, cVar);
            vVar.f52584K = obj;
            return vVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class w<T> implements kotlin.sequences.m<T> {

        /* renamed from: a */
        final /* synthetic */ kotlin.sequences.m<T> f52587a;

        /* JADX WARN: Multi-variable type inference failed */
        w(kotlin.sequences.m<? extends T> mVar) {
            this.f52587a = mVar;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<T> iterator() {
            List d32;
            d32 = SequencesKt___SequencesKt.d3(this.f52587a);
            C2112z.m0(d32);
            return d32.iterator();
        }
    }

    /* loaded from: classes2.dex */
    public static final class x<T> implements kotlin.sequences.m<T> {

        /* renamed from: a */
        final /* synthetic */ kotlin.sequences.m<T> f52588a;

        /* renamed from: b */
        final /* synthetic */ Comparator<? super T> f52589b;

        /* JADX WARN: Multi-variable type inference failed */
        x(kotlin.sequences.m<? extends T> mVar, Comparator<? super T> comparator) {
            this.f52588a = mVar;
            this.f52589b = comparator;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<T> iterator() {
            List d32;
            d32 = SequencesKt___SequencesKt.d3(this.f52588a);
            C2112z.p0(d32, this.f52589b);
            return d32.iterator();
        }
    }

    /* loaded from: classes2.dex */
    static final class y<R, T> extends Lambda implements X2.p<T, R, Pair<? extends T, ? extends R>> {

        /* renamed from: F */
        public static final y f52590F = new y();

        y() {
            super(2);
        }

        @Override // X2.p
        @l3.d
        /* renamed from: c */
        public final Pair<T, R> c0(T t3, R r4) {
            return C2122h0.a(t3, r4);
        }
    }

    /* loaded from: classes2.dex */
    static final class z<T> extends Lambda implements X2.p<T, T, Pair<? extends T, ? extends T>> {

        /* renamed from: F */
        public static final z f52591F = new z();

        z() {
            super(2);
        }

        @Override // X2.p
        @l3.d
        /* renamed from: c */
        public final Pair<T, T> c0(T t3, T t4) {
            return C2122h0.a(t3, t4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @kotlin.internal.f
    private static final <T> T A0(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        T t3 = null;
        for (T t4 : mVar) {
            if (predicate.C(t4).booleanValue()) {
                t3 = t4;
            }
        }
        return t3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R A1(kotlin.sequences.m<? extends T> mVar, Comparator<? super R> comparator, X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final <T, R> kotlin.sequences.m<R> A2(@l3.d kotlin.sequences.m<? extends T> mVar, R r4, @l3.d X2.p<? super R, ? super T, ? extends R> operation) {
        F.p(mVar, "<this>");
        F.p(operation, "operation");
        return w2(mVar, r4, operation);
    }

    public static final <T> T B0(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R B1(kotlin.sequences.m<? extends T> mVar, Comparator<? super R> comparator, X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final <T, R> kotlin.sequences.m<R> B2(@l3.d kotlin.sequences.m<? extends T> mVar, R r4, @l3.d X2.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        F.p(mVar, "<this>");
        F.p(operation, "operation");
        return x2(mVar, r4, operation);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T C0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        for (T t3 : mVar) {
            if (predicate.C(t3).booleanValue()) {
                return t3;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @l3.e
    @Y(version = "1.4")
    public static final <T extends Comparable<? super T>> T C1(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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

    public static final <T> T C2(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @Y(version = "1.5")
    @kotlin.internal.f
    private static final <T, R> R D0(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, ? extends R> transform) {
        R r4;
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
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
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    @l3.e
    @Y(version = "1.4")
    public static final Double D1(@l3.d kotlin.sequences.m<Double> mVar) {
        F.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T D2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        T t3 = null;
        boolean z3 = false;
        for (T t4 : mVar) {
            if (predicate.C(t4).booleanValue()) {
                if (!z3) {
                    z3 = true;
                    t3 = t4;
                } else {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
            }
        }
        if (z3) {
            return t3;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @Y(version = "1.5")
    @kotlin.internal.f
    private static final <T, R> R E0(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, ? extends R> transform) {
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            R C3 = transform.C(it.next());
            if (C3 != null) {
                return C3;
            }
        }
        return null;
    }

    @l3.e
    @Y(version = "1.4")
    public static final Float E1(@l3.d kotlin.sequences.m<Float> mVar) {
        F.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.e
    public static final <T> T E2(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @l3.e
    public static <T> T F0(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    @W2.i(name = "maxOrThrow")
    @Y(version = "1.7")
    public static final double F1(@l3.d kotlin.sequences.m<Double> mVar) {
        F.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    @l3.e
    public static final <T> T F2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        boolean z3 = false;
        T t3 = null;
        for (T t4 : mVar) {
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

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @l3.e
    public static final <T> T G0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        for (T t3 : mVar) {
            if (predicate.C(t3).booleanValue()) {
                return t3;
            }
        }
        return null;
    }

    @W2.i(name = "maxOrThrow")
    @Y(version = "1.7")
    public static final float G1(@l3.d kotlin.sequences.m<Float> mVar) {
        F.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    public static final <T extends Comparable<? super T>> kotlin.sequences.m<T> G2(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        return new w(mVar);
    }

    @l3.d
    public static final <T, R> kotlin.sequences.m<R> H0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        return new kotlin.sequences.i(mVar, transform, h.f52538N);
    }

    @l3.d
    @W2.i(name = "maxOrThrow")
    @Y(version = "1.7")
    public static final <T extends Comparable<? super T>> T H1(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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

    @l3.d
    public static final <T, R extends Comparable<? super R>> kotlin.sequences.m<T> H2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.sequences.m<T> K22;
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        K22 = K2(mVar, new g.a(selector));
        return K22;
    }

    @l3.d
    @W2.i(name = "flatMapIndexedIterable")
    @N
    @Y(version = "1.4")
    public static final <T, R> kotlin.sequences.m<R> I0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        return kotlin.sequences.s.h(mVar, transform, i.f52539N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.e
    @Y(version = "1.4")
    public static final <T> T I1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d Comparator<? super T> comparator) {
        F.p(mVar, "<this>");
        F.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
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

    @l3.d
    public static final <T, R extends Comparable<? super R>> kotlin.sequences.m<T> I2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends R> selector) {
        kotlin.sequences.m<T> K22;
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        K22 = K2(mVar, new g.c(selector));
        return K22;
    }

    @W2.i(name = "flatMapIndexedIterableTo")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R, C extends Collection<? super R>> C J0(kotlin.sequences.m<? extends T> mVar, C destination, X2.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int i4 = 0;
        for (T t3 : mVar) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            kotlin.collections.A.q0(destination, transform.c0(Integer.valueOf(i4), t3));
            i4 = i5;
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @W2.i(name = "maxWithOrThrow")
    @Y(version = "1.7")
    public static final <T> T J1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d Comparator<? super T> comparator) {
        F.p(mVar, "<this>");
        F.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
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

    @l3.d
    public static final <T extends Comparable<? super T>> kotlin.sequences.m<T> J2(@l3.d kotlin.sequences.m<? extends T> mVar) {
        Comparator x3;
        kotlin.sequences.m<T> K22;
        F.p(mVar, "<this>");
        x3 = kotlin.comparisons.g.x();
        K22 = K2(mVar, x3);
        return K22;
    }

    public static final <T> boolean K(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            if (!predicate.C(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l3.d
    @W2.i(name = "flatMapIndexedSequence")
    @N
    @Y(version = "1.4")
    public static final <T, R> kotlin.sequences.m<R> K0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.p<? super Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        return kotlin.sequences.s.h(mVar, transform, j.f52540N);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @l3.e
    @Y(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T K1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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
    public static <T> kotlin.sequences.m<T> K2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d Comparator<? super T> comparator) {
        F.p(mVar, "<this>");
        F.p(comparator, "comparator");
        return new x(mVar, comparator);
    }

    public static final <T> boolean L(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        return mVar.iterator().hasNext();
    }

    @W2.i(name = "flatMapIndexedSequenceTo")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R, C extends Collection<? super R>> C L0(kotlin.sequences.m<? extends T> mVar, C destination, X2.p<? super Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int i4 = 0;
        for (T t3 : mVar) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                if (kotlin.internal.m.a(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.Z();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            kotlin.collections.A.r0(destination, transform.c0(Integer.valueOf(i4), t3));
            i4 = i5;
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @W2.i(name = "minByOrThrow")
    @Y(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T L1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final <T> int L2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Integer> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += selector.C(it.next()).intValue();
        }
        return i4;
    }

    public static final <T> boolean M(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            if (predicate.C(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l3.d
    @W2.i(name = "flatMapIterable")
    @N
    @Y(version = "1.4")
    public static final <T, R> kotlin.sequences.m<R> M0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends Iterable<? extends R>> transform) {
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        return new kotlin.sequences.i(mVar, transform, g.f52537N);
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> double M1(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, Double> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = selector.C(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final <T> double M2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Double> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        while (it.hasNext()) {
            d4 += selector.C(it.next()).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static <T> Iterable<T> N(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        return new C2216a(mVar);
    }

    @l3.d
    @W2.i(name = "flatMapIterableTo")
    @N
    @Y(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C N0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d C destination, @l3.d X2.l<? super T, ? extends Iterable<? extends R>> transform) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            kotlin.collections.A.q0(destination, transform.C(it.next()));
        }
        return destination;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> float N1(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, Float> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = selector.C(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @W2.i(name = "sumOfByte")
    public static final int N2(@l3.d kotlin.sequences.m<Byte> mVar) {
        F.p(mVar, "<this>");
        Iterator<Byte> it = mVar.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().byteValue();
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> kotlin.sequences.m<T> O(kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        return mVar;
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C O0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d C destination, @l3.d X2.l<? super T, ? extends kotlin.sequences.m<? extends R>> transform) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            kotlin.collections.A.r0(destination, transform.C(it.next()));
        }
        return destination;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R O1(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @W2.i(name = "sumOfDouble")
    public static final double O2(@l3.d kotlin.sequences.m<Double> mVar) {
        F.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        while (it.hasNext()) {
            d4 += it.next().doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final <T, K, V> Map<K, V> P(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> C3 = transform.C(it.next());
            linkedHashMap.put(C3.e(), C3.f());
        }
        return linkedHashMap;
    }

    public static final <T, R> R P0(@l3.d kotlin.sequences.m<? extends T> mVar, R r4, @l3.d X2.p<? super R, ? super T, ? extends R> operation) {
        F.p(mVar, "<this>");
        F.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            r4 = operation.c0(r4, it.next());
        }
        return r4;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R P1(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @W2.i(name = "sumOfDouble")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> double P2(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, Double> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        while (it.hasNext()) {
            d4 += selector.C(it.next()).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final <T, K> Map<K, T> Q(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends K> keySelector) {
        F.p(mVar, "<this>");
        F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t3 : mVar) {
            linkedHashMap.put(keySelector.C(t3), t3);
        }
        return linkedHashMap;
    }

    public static final <T, R> R Q0(@l3.d kotlin.sequences.m<? extends T> mVar, R r4, @l3.d X2.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        F.p(mVar, "<this>");
        F.p(operation, "operation");
        int i4 = 0;
        for (T t3 : mVar) {
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

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> Double Q1(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, Double> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = selector.C(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @W2.i(name = "sumOfFloat")
    public static final float Q2(@l3.d kotlin.sequences.m<Float> mVar) {
        F.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        float f4 = 0.0f;
        while (it.hasNext()) {
            f4 += it.next().floatValue();
        }
        return f4;
    }

    @l3.d
    public static final <T, K, V> Map<K, V> R(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends K> keySelector, @l3.d X2.l<? super T, ? extends V> valueTransform) {
        F.p(mVar, "<this>");
        F.p(keySelector, "keySelector");
        F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t3 : mVar) {
            linkedHashMap.put(keySelector.C(t3), valueTransform.C(t3));
        }
        return linkedHashMap;
    }

    public static final <T> void R0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, H0> action) {
        F.p(mVar, "<this>");
        F.p(action, "action");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            action.C(it.next());
        }
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> Float R1(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, Float> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = selector.C(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @W2.i(name = "sumOfInt")
    public static final int R2(@l3.d kotlin.sequences.m<Integer> mVar) {
        F.p(mVar, "<this>");
        Iterator<Integer> it = mVar.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().intValue();
        }
        return i4;
    }

    @l3.d
    public static final <T, K, M extends Map<? super K, ? super T>> M S(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d M destination, @l3.d X2.l<? super T, ? extends K> keySelector) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(keySelector, "keySelector");
        for (T t3 : mVar) {
            destination.put(keySelector.C(t3), t3);
        }
        return destination;
    }

    public static final <T> void S0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.p<? super Integer, ? super T, H0> action) {
        F.p(mVar, "<this>");
        F.p(action, "action");
        int i4 = 0;
        for (T t3 : mVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R S1(kotlin.sequences.m<? extends T> mVar, Comparator<? super R> comparator, X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @W2.i(name = "sumOfInt")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> int S2(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, Integer> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += selector.C(it.next()).intValue();
        }
        return i4;
    }

    @l3.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M T(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d M destination, @l3.d X2.l<? super T, ? extends K> keySelector, @l3.d X2.l<? super T, ? extends V> valueTransform) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(keySelector, "keySelector");
        F.p(valueTransform, "valueTransform");
        for (T t3 : mVar) {
            destination.put(keySelector.C(t3), valueTransform.C(t3));
        }
        return destination;
    }

    @l3.d
    public static final <T, K> Map<K, List<T>> T0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends K> keySelector) {
        F.p(mVar, "<this>");
        F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t3 : mVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R T1(kotlin.sequences.m<? extends T> mVar, Comparator<? super R> comparator, X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(comparator, "comparator");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @W2.i(name = "sumOfLong")
    public static final long T2(@l3.d kotlin.sequences.m<Long> mVar) {
        F.p(mVar, "<this>");
        Iterator<Long> it = mVar.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += it.next().longValue();
        }
        return j4;
    }

    @l3.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M U(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d M destination, @l3.d X2.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> C3 = transform.C(it.next());
            destination.put(C3.e(), C3.f());
        }
        return destination;
    }

    @l3.d
    public static final <T, K, V> Map<K, List<V>> U0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends K> keySelector, @l3.d X2.l<? super T, ? extends V> valueTransform) {
        F.p(mVar, "<this>");
        F.p(keySelector, "keySelector");
        F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t3 : mVar) {
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

    @l3.e
    @Y(version = "1.4")
    public static final <T extends Comparable<? super T>> T U1(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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

    @W2.i(name = "sumOfLong")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> long U2(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, Long> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += selector.C(it.next()).longValue();
        }
        return j4;
    }

    @l3.d
    @Y(version = "1.3")
    public static final <K, V> Map<K, V> V(@l3.d kotlin.sequences.m<? extends K> mVar, @l3.d X2.l<? super K, ? extends V> valueSelector) {
        F.p(mVar, "<this>");
        F.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K k4 : mVar) {
            linkedHashMap.put(k4, valueSelector.C(k4));
        }
        return linkedHashMap;
    }

    @l3.d
    public static final <T, K, M extends Map<? super K, List<T>>> M V0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d M destination, @l3.d X2.l<? super T, ? extends K> keySelector) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(keySelector, "keySelector");
        for (T t3 : mVar) {
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

    @l3.e
    @Y(version = "1.4")
    public static final Double V1(@l3.d kotlin.sequences.m<Double> mVar) {
        F.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @W2.i(name = "sumOfShort")
    public static final int V2(@l3.d kotlin.sequences.m<Short> mVar) {
        F.p(mVar, "<this>");
        Iterator<Short> it = mVar.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().shortValue();
        }
        return i4;
    }

    @l3.d
    @Y(version = "1.3")
    public static final <K, V, M extends Map<? super K, ? super V>> M W(@l3.d kotlin.sequences.m<? extends K> mVar, @l3.d M destination, @l3.d X2.l<? super K, ? extends V> valueSelector) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(valueSelector, "valueSelector");
        for (K k4 : mVar) {
            destination.put(k4, valueSelector.C(k4));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T, K, V, M extends Map<? super K, List<V>>> M W0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d M destination, @l3.d X2.l<? super T, ? extends K> keySelector, @l3.d X2.l<? super T, ? extends V> valueTransform) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(keySelector, "keySelector");
        F.p(valueTransform, "valueTransform");
        for (T t3 : mVar) {
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

    @l3.e
    @Y(version = "1.4")
    public static final Float W1(@l3.d kotlin.sequences.m<Float> mVar) {
        F.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @N
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final <T> int W2(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, t0> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        int l4 = t0.l(0);
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            l4 = t0.l(l4 + selector.C(it.next()).l0());
        }
        return l4;
    }

    @W2.i(name = "averageOfByte")
    public static final double X(@l3.d kotlin.sequences.m<Byte> mVar) {
        F.p(mVar, "<this>");
        Iterator<Byte> it = mVar.iterator();
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

    @l3.d
    @Y(version = "1.1")
    public static final <T, K> I<T, K> X0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends K> keySelector) {
        F.p(mVar, "<this>");
        F.p(keySelector, "keySelector");
        return new k(mVar, keySelector);
    }

    @W2.i(name = "minOrThrow")
    @Y(version = "1.7")
    public static final double X1(@l3.d kotlin.sequences.m<Double> mVar) {
        F.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @N
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final <T> long X2(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, x0> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        long l4 = x0.l(0L);
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            l4 = x0.l(l4 + selector.C(it.next()).l0());
        }
        return l4;
    }

    @W2.i(name = "averageOfDouble")
    public static final double Y(@l3.d kotlin.sequences.m<Double> mVar) {
        F.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
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

    public static final <T> int Y0(@l3.d kotlin.sequences.m<? extends T> mVar, T t3) {
        F.p(mVar, "<this>");
        int i4 = 0;
        for (T t4 : mVar) {
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Z();
            }
            if (F.g(t3, t4)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @W2.i(name = "minOrThrow")
    @Y(version = "1.7")
    public static final float Y1(@l3.d kotlin.sequences.m<Float> mVar) {
        F.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
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
    public static final <T> kotlin.sequences.m<T> Y2(@l3.d kotlin.sequences.m<? extends T> mVar, int i4) {
        kotlin.sequences.m<T> g4;
        F.p(mVar, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                g4 = kotlin.sequences.s.g();
                return g4;
            }
            if (mVar instanceof kotlin.sequences.e) {
                return ((kotlin.sequences.e) mVar).a(i4);
            }
            return new kotlin.sequences.v(mVar, i4);
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @W2.i(name = "averageOfFloat")
    public static final double Z(@l3.d kotlin.sequences.m<Float> mVar) {
        F.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
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

    public static final <T> int Z0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        int i4 = 0;
        for (T t3 : mVar) {
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

    @l3.d
    @W2.i(name = "minOrThrow")
    @Y(version = "1.7")
    public static final <T extends Comparable<? super T>> T Z1(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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
    public static <T> kotlin.sequences.m<T> Z2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        return new kotlin.sequences.w(mVar, predicate);
    }

    @W2.i(name = "averageOfInt")
    public static final double a0(@l3.d kotlin.sequences.m<Integer> mVar) {
        F.p(mVar, "<this>");
        Iterator<Integer> it = mVar.iterator();
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

    public static final <T> int a1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        int i4 = -1;
        int i5 = 0;
        for (T t3 : mVar) {
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
    @l3.e
    @Y(version = "1.4")
    public static final <T> T a2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d Comparator<? super T> comparator) {
        F.p(mVar, "<this>");
        F.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
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

    @l3.d
    public static final <T, C extends Collection<? super T>> C a3(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d C destination) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @W2.i(name = "averageOfLong")
    public static final double b0(@l3.d kotlin.sequences.m<Long> mVar) {
        F.p(mVar, "<this>");
        Iterator<Long> it = mVar.iterator();
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
    public static final <T, A extends Appendable> A b1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d A buffer, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super T, ? extends CharSequence> lVar) {
        F.p(mVar, "<this>");
        F.p(buffer, "buffer");
        F.p(separator, "separator");
        F.p(prefix, "prefix");
        F.p(postfix, "postfix");
        F.p(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (T t3 : mVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @W2.i(name = "minWithOrThrow")
    @Y(version = "1.7")
    public static final <T> T b2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d Comparator<? super T> comparator) {
        F.p(mVar, "<this>");
        F.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
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

    @l3.d
    public static final <T> HashSet<T> b3(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        return (HashSet) a3(mVar, new HashSet());
    }

    @W2.i(name = "averageOfShort")
    public static final double c0(@l3.d kotlin.sequences.m<Short> mVar) {
        F.p(mVar, "<this>");
        Iterator<Short> it = mVar.iterator();
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

    public static /* synthetic */ Appendable c1(kotlin.sequences.m mVar, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
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
        return b1(mVar, appendable, charSequence5, charSequence6, charSequence8, i6, charSequence7, lVar2);
    }

    @l3.d
    public static final <T> kotlin.sequences.m<T> c2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d Iterable<? extends T> elements) {
        F.p(mVar, "<this>");
        F.p(elements, "elements");
        return new n(elements, mVar);
    }

    @l3.d
    public static <T> List<T> c3(@l3.d kotlin.sequences.m<? extends T> mVar) {
        List<T> k4;
        List<T> H3;
        F.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        T next = it.next();
        if (!it.hasNext()) {
            k4 = C2108v.k(next);
            return k4;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @l3.d
    @Y(version = "1.2")
    public static final <T> kotlin.sequences.m<List<T>> d0(@l3.d kotlin.sequences.m<? extends T> mVar, int i4) {
        F.p(mVar, "<this>");
        return g3(mVar, i4, i4, true);
    }

    @l3.d
    public static final <T> String d1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d CharSequence separator, @l3.d CharSequence prefix, @l3.d CharSequence postfix, int i4, @l3.d CharSequence truncated, @l3.e X2.l<? super T, ? extends CharSequence> lVar) {
        F.p(mVar, "<this>");
        F.p(separator, "separator");
        F.p(prefix, "prefix");
        F.p(postfix, "postfix");
        F.p(truncated, "truncated");
        String sb = ((StringBuilder) b1(mVar, new StringBuilder(), separator, prefix, postfix, i4, truncated, lVar)).toString();
        F.o(sb, "toString(...)");
        return sb;
    }

    @l3.d
    public static final <T> kotlin.sequences.m<T> d2(@l3.d kotlin.sequences.m<? extends T> mVar, T t3) {
        F.p(mVar, "<this>");
        return new l(mVar, t3);
    }

    @l3.d
    public static <T> List<T> d3(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        return (List) a3(mVar, new ArrayList());
    }

    @l3.d
    @Y(version = "1.2")
    public static final <T, R> kotlin.sequences.m<R> e0(@l3.d kotlin.sequences.m<? extends T> mVar, int i4, @l3.d X2.l<? super List<? extends T>, ? extends R> transform) {
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        return h3(mVar, i4, i4, true, transform);
    }

    public static /* synthetic */ String e1(kotlin.sequences.m mVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, X2.l lVar, int i5, Object obj) {
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
        return d1(mVar, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @l3.d
    public static final <T> kotlin.sequences.m<T> e2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d kotlin.sequences.m<? extends T> elements) {
        F.p(mVar, "<this>");
        F.p(elements, "elements");
        return new o(elements, mVar);
    }

    @l3.d
    public static final <T> Set<T> e3(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final <T> boolean f0(@l3.d kotlin.sequences.m<? extends T> mVar, T t3) {
        F.p(mVar, "<this>");
        if (Y0(mVar, t3) >= 0) {
            return true;
        }
        return false;
    }

    public static <T> T f1(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T> kotlin.sequences.m<T> f2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d T[] elements) {
        F.p(mVar, "<this>");
        F.p(elements, "elements");
        if (elements.length == 0) {
            return mVar;
        }
        return new m(mVar, elements);
    }

    @l3.d
    public static final <T> Set<T> f3(@l3.d kotlin.sequences.m<? extends T> mVar) {
        Set<T> f4;
        Set<T> k4;
        F.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            k4 = j0.k();
            return k4;
        }
        T next = it.next();
        if (!it.hasNext()) {
            f4 = i0.f(next);
            return f4;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static <T> int g0(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T g1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        T t3 = null;
        boolean z3 = false;
        for (T t4 : mVar) {
            if (predicate.C(t4).booleanValue()) {
                z3 = true;
                t3 = t4;
            }
        }
        if (z3) {
            return t3;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @kotlin.internal.f
    private static final <T> kotlin.sequences.m<T> g2(kotlin.sequences.m<? extends T> mVar, T t3) {
        F.p(mVar, "<this>");
        return d2(mVar, t3);
    }

    @l3.d
    @Y(version = "1.2")
    public static final <T> kotlin.sequences.m<List<T>> g3(@l3.d kotlin.sequences.m<? extends T> mVar, int i4, int i5, boolean z3) {
        F.p(mVar, "<this>");
        return m0.c(mVar, i4, i5, z3, false);
    }

    public static final <T> int h0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        Iterator<? extends T> it = mVar.iterator();
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

    public static final <T> int h1(@l3.d kotlin.sequences.m<? extends T> mVar, T t3) {
        F.p(mVar, "<this>");
        int i4 = -1;
        int i5 = 0;
        for (T t4 : mVar) {
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.Z();
            }
            if (F.g(t3, t4)) {
                i4 = i5;
            }
            i5++;
        }
        return i4;
    }

    public static final <T> boolean h2(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        return !mVar.iterator().hasNext();
    }

    @l3.d
    @Y(version = "1.2")
    public static final <T, R> kotlin.sequences.m<R> h3(@l3.d kotlin.sequences.m<? extends T> mVar, int i4, int i5, boolean z3, @l3.d X2.l<? super List<? extends T>, ? extends R> transform) {
        kotlin.sequences.m<R> k12;
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        k12 = k1(m0.c(mVar, i4, i5, z3, true), transform);
        return k12;
    }

    @l3.d
    public static final <T> kotlin.sequences.m<T> i0(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        return j0(mVar, b.f52531F);
    }

    @l3.e
    public static final <T> T i1(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> boolean i2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            if (predicate.C(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ kotlin.sequences.m i3(kotlin.sequences.m mVar, int i4, int i5, boolean z3, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        return g3(mVar, i4, i5, z3);
    }

    @l3.d
    public static final <T, K> kotlin.sequences.m<T> j0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends K> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        return new kotlin.sequences.c(mVar, selector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @l3.e
    public static final <T> T j1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        T t3 = null;
        for (T t4 : mVar) {
            if (predicate.C(t4).booleanValue()) {
                t3 = t4;
            }
        }
        return t3;
    }

    @l3.d
    @Y(version = "1.1")
    public static final <T> kotlin.sequences.m<T> j2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, H0> action) {
        kotlin.sequences.m<T> k12;
        F.p(mVar, "<this>");
        F.p(action, "action");
        k12 = k1(mVar, new p(action));
        return k12;
    }

    public static /* synthetic */ kotlin.sequences.m j3(kotlin.sequences.m mVar, int i4, int i5, boolean z3, X2.l lVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        return h3(mVar, i4, i5, z3, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T> kotlin.sequences.m<T> k0(@l3.d kotlin.sequences.m<? extends T> mVar, int i4) {
        F.p(mVar, "<this>");
        if (i4 >= 0) {
            if (i4 != 0) {
                if (mVar instanceof kotlin.sequences.e) {
                    return ((kotlin.sequences.e) mVar).b(i4);
                }
                return new kotlin.sequences.d(mVar, i4);
            }
            return mVar;
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static <T, R> kotlin.sequences.m<R> k1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends R> transform) {
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        return new kotlin.sequences.y(mVar, transform);
    }

    @l3.d
    @Y(version = "1.4")
    public static final <T> kotlin.sequences.m<T> k2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.p<? super Integer, ? super T, H0> action) {
        F.p(mVar, "<this>");
        F.p(action, "action");
        return l1(mVar, new q(action));
    }

    @l3.d
    public static final <T> kotlin.sequences.m<M<T>> k3(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        return new kotlin.sequences.k(mVar);
    }

    @l3.d
    public static final <T> kotlin.sequences.m<T> l0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        return new kotlin.sequences.f(mVar, predicate);
    }

    @l3.d
    public static final <T, R> kotlin.sequences.m<R> l1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.p<? super Integer, ? super T, ? extends R> transform) {
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        return new kotlin.sequences.x(mVar, transform);
    }

    @l3.d
    public static final <T> Pair<List<T>, List<T>> l2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t3 : mVar) {
            if (predicate.C(t3).booleanValue()) {
                arrayList.add(t3);
            } else {
                arrayList2.add(t3);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @l3.d
    public static final <T, R> kotlin.sequences.m<Pair<T, R>> l3(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d kotlin.sequences.m<? extends R> other) {
        F.p(mVar, "<this>");
        F.p(other, "other");
        return new kotlin.sequences.l(mVar, other, y.f52590F);
    }

    public static final <T> T m0(@l3.d kotlin.sequences.m<? extends T> mVar, int i4) {
        F.p(mVar, "<this>");
        return (T) n0(mVar, i4, new c(i4));
    }

    @l3.d
    public static final <T, R> kotlin.sequences.m<R> m1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.sequences.m<R> v02;
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        v02 = v0(new kotlin.sequences.x(mVar, transform));
        return v02;
    }

    @l3.d
    public static final <T> kotlin.sequences.m<T> m2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d Iterable<? extends T> elements) {
        kotlin.sequences.m A12;
        kotlin.sequences.m q4;
        F.p(mVar, "<this>");
        F.p(elements, "elements");
        A12 = D.A1(elements);
        q4 = kotlin.sequences.s.q(mVar, A12);
        return kotlin.sequences.s.i(q4);
    }

    @l3.d
    public static final <T, R, V> kotlin.sequences.m<V> m3(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d kotlin.sequences.m<? extends R> other, @l3.d X2.p<? super T, ? super R, ? extends V> transform) {
        F.p(mVar, "<this>");
        F.p(other, "other");
        F.p(transform, "transform");
        return new kotlin.sequences.l(mVar, other, transform);
    }

    public static final <T> T n0(@l3.d kotlin.sequences.m<? extends T> mVar, int i4, @l3.d X2.l<? super Integer, ? extends T> defaultValue) {
        F.p(mVar, "<this>");
        F.p(defaultValue, "defaultValue");
        if (i4 < 0) {
            return defaultValue.C(Integer.valueOf(i4));
        }
        int i5 = 0;
        for (T t3 : mVar) {
            int i6 = i5 + 1;
            if (i4 == i5) {
                return t3;
            }
            i5 = i6;
        }
        return defaultValue.C(Integer.valueOf(i4));
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C n1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d C destination, @l3.d X2.p<? super Integer, ? super T, ? extends R> transform) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int i4 = 0;
        for (T t3 : mVar) {
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
    public static final <T> kotlin.sequences.m<T> n2(@l3.d kotlin.sequences.m<? extends T> mVar, T t3) {
        kotlin.sequences.m q4;
        kotlin.sequences.m q5;
        F.p(mVar, "<this>");
        q4 = kotlin.sequences.s.q(t3);
        q5 = kotlin.sequences.s.q(mVar, q4);
        return kotlin.sequences.s.i(q5);
    }

    @l3.d
    @Y(version = "1.2")
    public static final <T> kotlin.sequences.m<Pair<T, T>> n3(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        return o3(mVar, z.f52591F);
    }

    @l3.e
    public static final <T> T o0(@l3.d kotlin.sequences.m<? extends T> mVar, int i4) {
        F.p(mVar, "<this>");
        if (i4 < 0) {
            return null;
        }
        int i5 = 0;
        for (T t3 : mVar) {
            int i6 = i5 + 1;
            if (i4 == i5) {
                return t3;
            }
            i5 = i6;
        }
        return null;
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C o1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d C destination, @l3.d X2.p<? super Integer, ? super T, ? extends R> transform) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(transform, "transform");
        int i4 = 0;
        for (T t3 : mVar) {
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
    public static final <T> kotlin.sequences.m<T> o2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d kotlin.sequences.m<? extends T> elements) {
        kotlin.sequences.m q4;
        F.p(mVar, "<this>");
        F.p(elements, "elements");
        q4 = kotlin.sequences.s.q(mVar, elements);
        return kotlin.sequences.s.i(q4);
    }

    @l3.d
    @Y(version = "1.2")
    public static final <T, R> kotlin.sequences.m<R> o3(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.p<? super T, ? super T, ? extends R> transform) {
        kotlin.sequences.m<R> b4;
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        b4 = kotlin.sequences.q.b(new A(mVar, transform, null));
        return b4;
    }

    @l3.d
    public static <T> kotlin.sequences.m<T> p0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        return new kotlin.sequences.h(mVar, true, predicate);
    }

    @l3.d
    public static <T, R> kotlin.sequences.m<R> p1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends R> transform) {
        kotlin.sequences.m<R> v02;
        F.p(mVar, "<this>");
        F.p(transform, "transform");
        v02 = v0(new kotlin.sequences.y(mVar, transform));
        return v02;
    }

    @l3.d
    public static final <T> kotlin.sequences.m<T> p2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d T[] elements) {
        List t3;
        F.p(mVar, "<this>");
        F.p(elements, "elements");
        t3 = C2100o.t(elements);
        return m2(mVar, t3);
    }

    @l3.d
    public static final <T> kotlin.sequences.m<T> q0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.p<? super Integer, ? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        return new kotlin.sequences.y(new kotlin.sequences.h(new kotlin.sequences.k(mVar), true, new d(predicate)), e.f52534F);
    }

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C q1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d C destination, @l3.d X2.l<? super T, ? extends R> transform) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            R C3 = transform.C(it.next());
            if (C3 != null) {
                destination.add(C3);
            }
        }
        return destination;
    }

    @kotlin.internal.f
    private static final <T> kotlin.sequences.m<T> q2(kotlin.sequences.m<? extends T> mVar, T t3) {
        F.p(mVar, "<this>");
        return n2(mVar, t3);
    }

    @l3.d
    public static final <T, C extends Collection<? super T>> C r0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d C destination, @l3.d X2.p<? super Integer, ? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        int i4 = 0;
        for (T t3 : mVar) {
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

    @l3.d
    public static final <T, R, C extends Collection<? super R>> C r1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d C destination, @l3.d X2.l<? super T, ? extends R> transform) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            destination.add(transform.C(it.next()));
        }
        return destination;
    }

    public static final <S, T extends S> S r2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.p<? super S, ? super T, ? extends S> operation) {
        F.p(mVar, "<this>");
        F.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            S next = it.next();
            while (it.hasNext()) {
                next = operation.c0(next, it.next());
            }
            return next;
        }
        throw new UnsupportedOperationException("Empty sequence can't be reduced.");
    }

    public static final /* synthetic */ <R> kotlin.sequences.m<R> s0(kotlin.sequences.m<?> mVar) {
        kotlin.sequences.m<R> p02;
        F.p(mVar, "<this>");
        F.w();
        p02 = p0(mVar, new X2.l<Object, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterIsInstance$1
            @Override // X2.l
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean C(@l3.e Object obj) {
                F.y(3, "R");
                return Boolean.valueOf(obj instanceof Object);
            }
        });
        F.n(p02, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return p02;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @l3.e
    @Y(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T s1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    public static final <S, T extends S> S s2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        F.p(mVar, "<this>");
        F.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
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
        throw new UnsupportedOperationException("Empty sequence can't be reduced.");
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C t0(kotlin.sequences.m<?> mVar, C destination) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        for (Object obj : mVar) {
            F.y(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @W2.i(name = "maxByOrThrow")
    @Y(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T t1(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @l3.e
    @Y(version = "1.4")
    public static final <S, T extends S> S t2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        F.p(mVar, "<this>");
        F.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
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
    public static final <T> kotlin.sequences.m<T> u0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        return new kotlin.sequences.h(mVar, false, predicate);
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> double u1(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, Double> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = selector.C(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final <S, T extends S> S u2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.p<? super S, ? super T, ? extends S> operation) {
        F.p(mVar, "<this>");
        F.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
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
    public static <T> kotlin.sequences.m<T> v0(@l3.d kotlin.sequences.m<? extends T> mVar) {
        F.p(mVar, "<this>");
        kotlin.sequences.m<T> u02 = u0(mVar, f.f52535F);
        F.n(u02, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return u02;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> float v1(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, Float> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = selector.C(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    public static final <T> kotlin.sequences.m<T> v2(@l3.d kotlin.sequences.m<? extends T> mVar) {
        kotlin.sequences.m<T> k12;
        F.p(mVar, "<this>");
        k12 = k1(mVar, new r(mVar));
        return k12;
    }

    @l3.d
    public static final <C extends Collection<? super T>, T> C w0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d C destination) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        for (T t3 : mVar) {
            if (t3 != null) {
                destination.add(t3);
            }
        }
        return destination;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R w1(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @l3.d
    @Y(version = "1.4")
    public static final <T, R> kotlin.sequences.m<R> w2(@l3.d kotlin.sequences.m<? extends T> mVar, R r4, @l3.d X2.p<? super R, ? super T, ? extends R> operation) {
        kotlin.sequences.m<R> b4;
        F.p(mVar, "<this>");
        F.p(operation, "operation");
        b4 = kotlin.sequences.q.b(new s(r4, mVar, operation, null));
        return b4;
    }

    @l3.d
    public static final <T, C extends Collection<? super T>> C x0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d C destination, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        for (T t3 : mVar) {
            if (!predicate.C(t3).booleanValue()) {
                destination.add(t3);
            }
        }
        return destination;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R x1(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, ? extends R> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @l3.d
    @Y(version = "1.4")
    public static final <T, R> kotlin.sequences.m<R> x2(@l3.d kotlin.sequences.m<? extends T> mVar, R r4, @l3.d X2.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.sequences.m<R> b4;
        F.p(mVar, "<this>");
        F.p(operation, "operation");
        b4 = kotlin.sequences.q.b(new t(r4, mVar, operation, null));
        return b4;
    }

    @l3.d
    public static final <T, C extends Collection<? super T>> C y0(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d C destination, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(destination, "destination");
        F.p(predicate, "predicate");
        for (T t3 : mVar) {
            if (predicate.C(t3).booleanValue()) {
                destination.add(t3);
            }
        }
        return destination;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> Double y1(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, Double> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = selector.C(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final <S, T extends S> kotlin.sequences.m<S> y2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.p<? super S, ? super T, ? extends S> operation) {
        kotlin.sequences.m<S> b4;
        F.p(mVar, "<this>");
        F.p(operation, "operation");
        b4 = kotlin.sequences.q.b(new u(mVar, operation, null));
        return b4;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @kotlin.internal.f
    private static final <T> T z0(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, Boolean> predicate) {
        F.p(mVar, "<this>");
        F.p(predicate, "predicate");
        for (T t3 : mVar) {
            if (predicate.C(t3).booleanValue()) {
                return t3;
            }
        }
        return null;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> Float z1(kotlin.sequences.m<? extends T> mVar, X2.l<? super T, Float> selector) {
        F.p(mVar, "<this>");
        F.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = selector.C(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.d
    @Y(version = "1.4")
    public static final <S, T extends S> kotlin.sequences.m<S> z2(@l3.d kotlin.sequences.m<? extends T> mVar, @l3.d X2.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.sequences.m<S> b4;
        F.p(mVar, "<this>");
        F.p(operation, "operation");
        b4 = kotlin.sequences.q.b(new v(mVar, operation, null));
        return b4;
    }
}
