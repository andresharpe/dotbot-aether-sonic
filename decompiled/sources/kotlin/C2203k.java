package kotlin;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* renamed from: kotlin.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2203k<T, R> extends AbstractC2176j<T, R> implements kotlin.coroutines.c<R> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private X2.q<? super AbstractC2176j<?, ?>, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> f52394E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private Object f52395F;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private kotlin.coroutines.c<Object> f52396G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private Object f52397H;

    @kotlin.jvm.internal.U({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 DeepRecursive.kt\nkotlin/DeepRecursiveScopeImpl\n*L\n1#1,161:1\n182#2,6:162\n*E\n"})
    /* renamed from: kotlin.k$a */
    /* loaded from: classes2.dex */
    public static final class a implements kotlin.coroutines.c<Object> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.f f52398E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C2203k f52399F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ X2.q f52400G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.c f52401H;

        public a(kotlin.coroutines.f fVar, C2203k c2203k, X2.q qVar, kotlin.coroutines.c cVar) {
            this.f52398E = fVar;
            this.f52399F = c2203k;
            this.f52400G = qVar;
            this.f52401H = cVar;
        }

        @Override // kotlin.coroutines.c
        @l3.d
        public kotlin.coroutines.f e() {
            return this.f52398E;
        }

        @Override // kotlin.coroutines.c
        public void x(@l3.d Object obj) {
            this.f52399F.f52394E = this.f52400G;
            this.f52399F.f52396G = this.f52401H;
            this.f52399F.f52397H = obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2203k(@l3.d X2.q<? super AbstractC2176j<T, R>, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> block, T t3) {
        super(null);
        Object obj;
        kotlin.jvm.internal.F.p(block, "block");
        this.f52394E = block;
        this.f52395F = t3;
        kotlin.jvm.internal.F.n(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f52396G = this;
        obj = C2123i.f52090a;
        this.f52397H = obj;
    }

    private final kotlin.coroutines.c<Object> j(X2.q<? super AbstractC2176j<?, ?>, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar, kotlin.coroutines.c<Object> cVar) {
        return new a(EmptyCoroutineContext.f52041E, this, qVar, cVar);
    }

    @Override // kotlin.AbstractC2176j
    @l3.e
    public Object a(T t3, @l3.d kotlin.coroutines.c<? super R> cVar) {
        Object l4;
        Object l5;
        kotlin.jvm.internal.F.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f52396G = cVar;
        this.f52395F = t3;
        l4 = kotlin.coroutines.intrinsics.b.l();
        l5 = kotlin.coroutines.intrinsics.b.l();
        if (l4 == l5) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return l4;
    }

    @Override // kotlin.AbstractC2176j
    @l3.e
    public <U, S> Object b(@l3.d C2121h<U, S> c2121h, U u3, @l3.d kotlin.coroutines.c<? super S> cVar) {
        Object l4;
        Object l5;
        X2.q<AbstractC2176j<U, S>, U, kotlin.coroutines.c<? super S>, Object> a4 = c2121h.a();
        kotlin.jvm.internal.F.n(a4, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        X2.q<? super AbstractC2176j<?, ?>, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar = this.f52394E;
        if (a4 != qVar) {
            this.f52394E = a4;
            kotlin.jvm.internal.F.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f52396G = j(qVar, cVar);
        } else {
            kotlin.jvm.internal.F.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f52396G = cVar;
        }
        this.f52395F = u3;
        l4 = kotlin.coroutines.intrinsics.b.l();
        l5 = kotlin.coroutines.intrinsics.b.l();
        if (l4 == l5) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return l4;
    }

    @Override // kotlin.coroutines.c
    @l3.d
    public kotlin.coroutines.f e() {
        return EmptyCoroutineContext.f52041E;
    }

    public final R k() {
        Object obj;
        Object obj2;
        Object z3;
        Object l4;
        while (true) {
            R r4 = (R) this.f52397H;
            kotlin.coroutines.c<Object> cVar = this.f52396G;
            if (cVar != null) {
                obj = C2123i.f52090a;
                if (!Result.d(obj, r4)) {
                    obj2 = C2123i.f52090a;
                    this.f52397H = obj2;
                    cVar.x(r4);
                } else {
                    try {
                        X2.q<? super AbstractC2176j<?, ?>, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar = this.f52394E;
                        Object obj3 = this.f52395F;
                        if (!(qVar instanceof BaseContinuationImpl)) {
                            z3 = IntrinsicsKt__IntrinsicsJvmKt.k(qVar, this, obj3, cVar);
                        } else {
                            z3 = ((X2.q) kotlin.jvm.internal.X.q(qVar, 3)).z(this, obj3, cVar);
                        }
                        l4 = kotlin.coroutines.intrinsics.b.l();
                        if (z3 != l4) {
                            Result.a aVar = Result.f51807F;
                            cVar.x(Result.b(z3));
                        }
                    } catch (Throwable th) {
                        Result.a aVar2 = Result.f51807F;
                        cVar.x(Result.b(W.a(th)));
                    }
                }
            } else {
                W.n(r4);
                return r4;
            }
        }
    }

    @Override // kotlin.coroutines.c
    public void x(@l3.d Object obj) {
        this.f52396G = null;
        this.f52397H = obj;
    }
}
