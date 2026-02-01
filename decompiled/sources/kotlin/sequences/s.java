package kotlin.sequences;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C2122h0;
import kotlin.H0;
import kotlin.Pair;
import kotlin.W;
import kotlin.Y;
import kotlin.collections.C2101p;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlin.random.Random;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class s extends r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n*L\n1#1,680:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X2.a<Iterator<T>> f52647a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(X2.a<? extends Iterator<? extends T>> aVar) {
            this.f52647a = aVar;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<T> iterator() {
            return this.f52647a.n();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,680:1\n30#2:681\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f52648a;

        public b(Iterator it) {
            this.f52648a = it;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<T> iterator() {
            return this.f52648a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {332}, m = "invokeSuspend", n = {"$this$sequence", FirebaseAnalytics.b.f34777X}, s = {"L$0", "I$0"})
    /* loaded from: classes2.dex */
    public static final class c<R> extends RestrictedSuspendLambda implements X2.p<o<? super R>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: G, reason: collision with root package name */
        Object f52649G;

        /* renamed from: H, reason: collision with root package name */
        int f52650H;

        /* renamed from: I, reason: collision with root package name */
        int f52651I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f52652J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ m<T> f52653K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ X2.p<Integer, T, C> f52654L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ X2.l<C, Iterator<R>> f52655M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(m<? extends T> mVar, X2.p<? super Integer, ? super T, ? extends C> pVar, X2.l<? super C, ? extends Iterator<? extends R>> lVar, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f52653K = mVar;
            this.f52654L = pVar;
            this.f52655M = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            o oVar;
            int i4;
            Iterator it;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i5 = this.f52651I;
            if (i5 != 0) {
                if (i5 == 1) {
                    int i6 = this.f52650H;
                    it = (Iterator) this.f52649G;
                    oVar = (o) this.f52652J;
                    W.n(obj);
                    i4 = i6;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                oVar = (o) this.f52652J;
                i4 = 0;
                it = this.f52653K.iterator();
            }
            while (it.hasNext()) {
                Object next = it.next();
                X2.p<Integer, T, C> pVar = this.f52654L;
                int i7 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.Z();
                }
                Iterator<R> C3 = this.f52655M.C(pVar.c0(kotlin.coroutines.jvm.internal.a.f(i4), next));
                this.f52652J = oVar;
                this.f52649G = it;
                this.f52650H = i7;
                this.f52651I = 1;
                if (oVar.i(C3, this) == l4) {
                    return l4;
                }
                i4 = i7;
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d o<? super R> oVar, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((c) v(oVar, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            c cVar2 = new c(this.f52653K, this.f52654L, this.f52655M, cVar);
            cVar2.f52652J = obj;
            return cVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class d<T> extends Lambda implements X2.l<m<? extends T>, Iterator<? extends T>> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f52656F = new d();

        d() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> C(@l3.d m<? extends T> it) {
            F.p(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    static final class e<T> extends Lambda implements X2.l<Iterable<? extends T>, Iterator<? extends T>> {

        /* renamed from: F, reason: collision with root package name */
        public static final e f52657F = new e();

        e() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> C(@l3.d Iterable<? extends T> it) {
            F.p(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class f<T> extends Lambda implements X2.l<T, T> {

        /* renamed from: F, reason: collision with root package name */
        public static final f f52658F = new f();

        f() {
            super(1);
        }

        @Override // X2.l
        public final T C(T t3) {
            return t3;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    static final class g<T> extends Lambda implements X2.l<T, T> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ X2.a<T> f52659F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(X2.a<? extends T> aVar) {
            super(1);
            this.f52659F = aVar;
        }

        @Override // X2.l
        @l3.e
        public final T C(@l3.d T it) {
            F.p(it, "it");
            return this.f52659F.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class h<T> extends Lambda implements X2.a<T> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ T f52660F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(T t3) {
            super(0);
            this.f52660F = t3;
        }

        @Override // X2.a
        @l3.e
        public final T n() {
            return this.f52660F;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class i<T> extends RestrictedSuspendLambda implements X2.p<o<? super T>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: G, reason: collision with root package name */
        int f52661G;

        /* renamed from: H, reason: collision with root package name */
        private /* synthetic */ Object f52662H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ m<T> f52663I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ X2.a<m<T>> f52664J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(m<? extends T> mVar, X2.a<? extends m<? extends T>> aVar, kotlin.coroutines.c<? super i> cVar) {
            super(2, cVar);
            this.f52663I = mVar;
            this.f52664J = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f52661G;
            if (i4 != 0) {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                W.n(obj);
            } else {
                W.n(obj);
                o oVar = (o) this.f52662H;
                Iterator<? extends T> it = this.f52663I.iterator();
                if (it.hasNext()) {
                    this.f52661G = 1;
                    if (oVar.i(it, this) == l4) {
                        return l4;
                    }
                } else {
                    m<T> n4 = this.f52664J.n();
                    this.f52661G = 2;
                    if (oVar.j(n4, this) == l4) {
                        return l4;
                    }
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d o<? super T> oVar, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((i) v(oVar, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            i iVar = new i(this.f52663I, this.f52664J, cVar);
            iVar.f52662H = obj;
            return iVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class j<T> extends RestrictedSuspendLambda implements X2.p<o<? super T>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: G, reason: collision with root package name */
        Object f52665G;

        /* renamed from: H, reason: collision with root package name */
        int f52666H;

        /* renamed from: I, reason: collision with root package name */
        private /* synthetic */ Object f52667I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ m<T> f52668J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ Random f52669K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(m<? extends T> mVar, Random random, kotlin.coroutines.c<? super j> cVar) {
            super(2, cVar);
            this.f52668J = mVar;
            this.f52669K = random;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            List d32;
            o oVar;
            Object O02;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f52666H;
            if (i4 != 0) {
                if (i4 == 1) {
                    d32 = (List) this.f52665G;
                    o oVar2 = (o) this.f52667I;
                    W.n(obj);
                    oVar = oVar2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                o oVar3 = (o) this.f52667I;
                d32 = SequencesKt___SequencesKt.d3(this.f52668J);
                oVar = oVar3;
            }
            while (!d32.isEmpty()) {
                int m4 = this.f52669K.m(d32.size());
                O02 = kotlin.collections.A.O0(d32);
                if (m4 < d32.size()) {
                    O02 = d32.set(m4, O02);
                }
                this.f52667I = oVar;
                this.f52665G = d32;
                this.f52666H = 1;
                if (oVar.b(O02, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d o<? super T> oVar, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((j) v(oVar, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            j jVar = new j(this.f52668J, this.f52669K, cVar);
            jVar.f52667I = obj;
            return jVar;
        }
    }

    @kotlin.internal.f
    private static final <T> m<T> d(X2.a<? extends Iterator<? extends T>> iterator) {
        F.p(iterator, "iterator");
        return new a(iterator);
    }

    @l3.d
    public static <T> m<T> e(@l3.d Iterator<? extends T> it) {
        m<T> f4;
        F.p(it, "<this>");
        f4 = f(new b(it));
        return f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static <T> m<T> f(@l3.d m<? extends T> mVar) {
        F.p(mVar, "<this>");
        if (!(mVar instanceof C2217a)) {
            return new C2217a(mVar);
        }
        return mVar;
    }

    @l3.d
    public static <T> m<T> g() {
        return kotlin.sequences.g.f52608a;
    }

    @l3.d
    public static final <T, C, R> m<R> h(@l3.d m<? extends T> source, @l3.d X2.p<? super Integer, ? super T, ? extends C> transform, @l3.d X2.l<? super C, ? extends Iterator<? extends R>> iterator) {
        m<R> b4;
        F.p(source, "source");
        F.p(transform, "transform");
        F.p(iterator, "iterator");
        b4 = q.b(new c(source, transform, iterator, null));
        return b4;
    }

    @l3.d
    public static final <T> m<T> i(@l3.d m<? extends m<? extends T>> mVar) {
        F.p(mVar, "<this>");
        return j(mVar, d.f52656F);
    }

    private static final <T, R> m<R> j(m<? extends T> mVar, X2.l<? super T, ? extends Iterator<? extends R>> lVar) {
        if (mVar instanceof y) {
            return ((y) mVar).e(lVar);
        }
        return new kotlin.sequences.i(mVar, f.f52658F, lVar);
    }

    @l3.d
    @W2.i(name = "flattenSequenceOfIterable")
    public static final <T> m<T> k(@l3.d m<? extends Iterable<? extends T>> mVar) {
        F.p(mVar, "<this>");
        return j(mVar, e.f52657F);
    }

    @l3.d
    public static final <T> m<T> l(@l3.d X2.a<? extends T> nextFunction) {
        m<T> f4;
        F.p(nextFunction, "nextFunction");
        f4 = f(new kotlin.sequences.j(nextFunction, new g(nextFunction)));
        return f4;
    }

    @l3.d
    public static <T> m<T> m(@l3.d X2.a<? extends T> seedFunction, @l3.d X2.l<? super T, ? extends T> nextFunction) {
        F.p(seedFunction, "seedFunction");
        F.p(nextFunction, "nextFunction");
        return new kotlin.sequences.j(seedFunction, nextFunction);
    }

    @kotlin.internal.h
    @l3.d
    public static <T> m<T> n(@l3.e T t3, @l3.d X2.l<? super T, ? extends T> nextFunction) {
        F.p(nextFunction, "nextFunction");
        if (t3 == null) {
            return kotlin.sequences.g.f52608a;
        }
        return new kotlin.sequences.j(new h(t3), nextFunction);
    }

    @l3.d
    @Y(version = "1.3")
    public static final <T> m<T> o(@l3.d m<? extends T> mVar, @l3.d X2.a<? extends m<? extends T>> defaultValue) {
        m<T> b4;
        F.p(mVar, "<this>");
        F.p(defaultValue, "defaultValue");
        b4 = q.b(new i(mVar, defaultValue, null));
        return b4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <T> m<T> p(m<? extends T> mVar) {
        m<T> g4;
        if (mVar == 0) {
            g4 = g();
            return g4;
        }
        return mVar;
    }

    @l3.d
    public static <T> m<T> q(@l3.d T... elements) {
        m<T> K5;
        m<T> g4;
        F.p(elements, "elements");
        if (elements.length == 0) {
            g4 = g();
            return g4;
        }
        K5 = C2101p.K5(elements);
        return K5;
    }

    @l3.d
    @Y(version = "1.4")
    public static final <T> m<T> r(@l3.d m<? extends T> mVar) {
        F.p(mVar, "<this>");
        return s(mVar, Random.f52425E);
    }

    @l3.d
    @Y(version = "1.4")
    public static final <T> m<T> s(@l3.d m<? extends T> mVar, @l3.d Random random) {
        m<T> b4;
        F.p(mVar, "<this>");
        F.p(random, "random");
        b4 = q.b(new j(mVar, random, null));
        return b4;
    }

    @l3.d
    public static final <T, R> Pair<List<T>, List<R>> t(@l3.d m<? extends Pair<? extends T, ? extends R>> mVar) {
        F.p(mVar, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<? extends T, ? extends R> pair : mVar) {
            arrayList.add(pair.e());
            arrayList2.add(pair.f());
        }
        return C2122h0.a(arrayList, arrayList2);
    }
}
