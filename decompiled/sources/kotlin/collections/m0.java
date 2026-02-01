package kotlin.collections;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.H0;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* loaded from: classes2.dex */
public final class m0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.d(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, ConstraintLayout.b.a.f9601d0, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class a<T> extends RestrictedSuspendLambda implements X2.p<kotlin.sequences.o<? super List<? extends T>>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: G, reason: collision with root package name */
        Object f51941G;

        /* renamed from: H, reason: collision with root package name */
        Object f51942H;

        /* renamed from: I, reason: collision with root package name */
        int f51943I;

        /* renamed from: J, reason: collision with root package name */
        int f51944J;

        /* renamed from: K, reason: collision with root package name */
        private /* synthetic */ Object f51945K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f51946L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f51947M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ Iterator<T> f51948N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f51949O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ boolean f51950P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i4, int i5, Iterator<? extends T> it, boolean z3, boolean z4, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f51946L = i4;
            this.f51947M = i5;
            this.f51948N = it;
            this.f51949O = z3;
            this.f51950P = z4;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00ad  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0146 -> B:12:0x0149). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0118 -> B:30:0x011b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00a2 -> B:50:0x0055). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.m0.a.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlin.sequences.o<? super List<? extends T>> oVar, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(oVar, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(this.f51946L, this.f51947M, this.f51948N, this.f51949O, this.f51950P, cVar);
            aVar.f51945K = obj;
            return aVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.jvm.internal.U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,680:1\n19#2:681\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b<T> implements kotlin.sequences.m<List<? extends T>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.sequences.m f51951a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51952b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f51953c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f51954d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f51955e;

        public b(kotlin.sequences.m mVar, int i4, int i5, boolean z3, boolean z4) {
            this.f51951a = mVar;
            this.f51952b = i4;
            this.f51953c = i5;
            this.f51954d = z3;
            this.f51955e = z4;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<List<? extends T>> iterator() {
            return m0.b(this.f51951a.iterator(), this.f51952b, this.f51953c, this.f51954d, this.f51955e);
        }
    }

    public static final void a(int i4, int i5) {
        String str;
        if (i4 > 0 && i5 > 0) {
            return;
        }
        if (i4 != i5) {
            str = "Both size " + i4 + " and step " + i5 + " must be greater than zero.";
        } else {
            str = "size " + i4 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @l3.d
    public static final <T> Iterator<List<T>> b(@l3.d Iterator<? extends T> iterator, int i4, int i5, boolean z3, boolean z4) {
        Iterator<List<T>> a4;
        kotlin.jvm.internal.F.p(iterator, "iterator");
        if (iterator.hasNext()) {
            a4 = kotlin.sequences.q.a(new a(i4, i5, iterator, z4, z3, null));
            return a4;
        }
        return F.f51831E;
    }

    @l3.d
    public static final <T> kotlin.sequences.m<List<T>> c(@l3.d kotlin.sequences.m<? extends T> mVar, int i4, int i5, boolean z3, boolean z4) {
        kotlin.jvm.internal.F.p(mVar, "<this>");
        a(i4, i5);
        return new b(mVar, i4, i5, z3, z4);
    }
}
