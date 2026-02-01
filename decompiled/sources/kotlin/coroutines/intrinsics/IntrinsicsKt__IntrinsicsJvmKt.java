package kotlin.coroutines.intrinsics;

import X2.l;
import X2.p;
import X2.q;
import kotlin.H0;
import kotlin.W;
import kotlin.Y;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.f;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.X;
import l3.d;
import l3.e;

/* JADX INFO: Access modifiers changed from: package-private */
@U({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n204#1,4:270\n225#1:274\n204#1,4:275\n225#1:279\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n130#1:270,4\n130#1:274\n165#1:275,4\n165#1:279\n*E\n"})
/* loaded from: classes2.dex */
public class IntrinsicsKt__IntrinsicsJvmKt {
    @Y(version = "1.3")
    private static final <T> c<H0> a(final c<? super T> cVar, final l<? super c<? super T>, ? extends Object> lVar) {
        final f e4 = cVar.e();
        if (e4 == EmptyCoroutineContext.f52041E) {
            return new RestrictedContinuationImpl(cVar, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1

                /* renamed from: F, reason: collision with root package name */
                private int f52064F;

                /* renamed from: G, reason: collision with root package name */
                final /* synthetic */ l<c<? super T>, Object> f52065G;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(cVar);
                    this.f52065G = lVar;
                    F.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @e
                protected Object D(@d Object obj) {
                    int i4 = this.f52064F;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            this.f52064F = 2;
                            W.n(obj);
                            return obj;
                        }
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.f52064F = 1;
                    W.n(obj);
                    return this.f52065G.C(this);
                }
            };
        }
        return new ContinuationImpl(cVar, e4, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2

            /* renamed from: H, reason: collision with root package name */
            private int f52066H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ l<c<? super T>, Object> f52067I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(cVar, e4);
                this.f52067I = lVar;
                F.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            protected Object D(@d Object obj) {
                int i4 = this.f52066H;
                if (i4 != 0) {
                    if (i4 == 1) {
                        this.f52066H = 2;
                        W.n(obj);
                        return obj;
                    }
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f52066H = 1;
                W.n(obj);
                return this.f52067I.C(this);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d
    @Y(version = "1.3")
    public static <T> c<H0> b(@d final l<? super c<? super T>, ? extends Object> lVar, @d c<? super T> completion) {
        F.p(lVar, "<this>");
        F.p(completion, "completion");
        final c<?> a4 = kotlin.coroutines.jvm.internal.f.a(completion);
        if (lVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) lVar).y(a4);
        }
        final f e4 = a4.e();
        if (e4 == EmptyCoroutineContext.f52041E) {
            return new RestrictedContinuationImpl(a4, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1

                /* renamed from: F, reason: collision with root package name */
                private int f52054F;

                /* renamed from: G, reason: collision with root package name */
                final /* synthetic */ l f52055G;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(a4);
                    this.f52055G = lVar;
                    F.n(a4, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @e
                protected Object D(@d Object obj) {
                    int i4 = this.f52054F;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            this.f52054F = 2;
                            W.n(obj);
                            return obj;
                        }
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.f52054F = 1;
                    W.n(obj);
                    F.n(this.f52055G, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                    return ((l) X.q(this.f52055G, 1)).C(this);
                }
            };
        }
        return new ContinuationImpl(a4, e4, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2

            /* renamed from: H, reason: collision with root package name */
            private int f52056H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ l f52057I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(a4, e4);
                this.f52057I = lVar;
                F.n(a4, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            protected Object D(@d Object obj) {
                int i4 = this.f52056H;
                if (i4 != 0) {
                    if (i4 == 1) {
                        this.f52056H = 2;
                        W.n(obj);
                        return obj;
                    }
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f52056H = 1;
                W.n(obj);
                F.n(this.f52057I, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((l) X.q(this.f52057I, 1)).C(this);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d
    @Y(version = "1.3")
    public static <R, T> c<H0> c(@d final p<? super R, ? super c<? super T>, ? extends Object> pVar, final R r4, @d c<? super T> completion) {
        F.p(pVar, "<this>");
        F.p(completion, "completion");
        final c<?> a4 = kotlin.coroutines.jvm.internal.f.a(completion);
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).v(r4, a4);
        }
        final f e4 = a4.e();
        if (e4 == EmptyCoroutineContext.f52041E) {
            return new RestrictedContinuationImpl(a4, pVar, r4) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3

                /* renamed from: F, reason: collision with root package name */
                private int f52058F;

                /* renamed from: G, reason: collision with root package name */
                final /* synthetic */ p f52059G;

                /* renamed from: H, reason: collision with root package name */
                final /* synthetic */ Object f52060H;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(a4);
                    this.f52059G = pVar;
                    this.f52060H = r4;
                    F.n(a4, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @e
                protected Object D(@d Object obj) {
                    int i4 = this.f52058F;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            this.f52058F = 2;
                            W.n(obj);
                            return obj;
                        }
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.f52058F = 1;
                    W.n(obj);
                    F.n(this.f52059G, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                    return ((p) X.q(this.f52059G, 2)).c0(this.f52060H, this);
                }
            };
        }
        return new ContinuationImpl(a4, e4, pVar, r4) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4

            /* renamed from: H, reason: collision with root package name */
            private int f52061H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ p f52062I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ Object f52063J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(a4, e4);
                this.f52062I = pVar;
                this.f52063J = r4;
                F.n(a4, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            protected Object D(@d Object obj) {
                int i4 = this.f52061H;
                if (i4 != 0) {
                    if (i4 == 1) {
                        this.f52061H = 2;
                        W.n(obj);
                        return obj;
                    }
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f52061H = 1;
                W.n(obj);
                F.n(this.f52062I, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) X.q(this.f52062I, 2)).c0(this.f52063J, this);
            }
        };
    }

    private static final <T> c<T> d(final c<? super T> cVar) {
        final f e4 = cVar.e();
        if (e4 == EmptyCoroutineContext.f52041E) {
            return new RestrictedContinuationImpl(cVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(cVar);
                    F.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @e
                protected Object D(@d Object obj) {
                    W.n(obj);
                    return obj;
                }
            };
        }
        return new ContinuationImpl(cVar, e4) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVar, e4);
                F.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            protected Object D(@d Object obj) {
                W.n(obj);
                return obj;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d
    @Y(version = "1.3")
    public static <T> c<T> e(@d c<? super T> cVar) {
        ContinuationImpl continuationImpl;
        c<T> cVar2;
        F.p(cVar, "<this>");
        if (cVar instanceof ContinuationImpl) {
            continuationImpl = (ContinuationImpl) cVar;
        } else {
            continuationImpl = null;
        }
        if (continuationImpl != null && (cVar2 = (c<T>) continuationImpl.J()) != null) {
            return cVar2;
        }
        return cVar;
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object f(l<? super c<? super T>, ? extends Object> lVar, c<? super T> completion) {
        F.p(lVar, "<this>");
        F.p(completion, "completion");
        if (!(lVar instanceof BaseContinuationImpl)) {
            return i(lVar, completion);
        }
        return ((l) X.q(lVar, 1)).C(completion);
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> Object g(p<? super R, ? super c<? super T>, ? extends Object> pVar, R r4, c<? super T> completion) {
        F.p(pVar, "<this>");
        F.p(completion, "completion");
        if (!(pVar instanceof BaseContinuationImpl)) {
            return j(pVar, r4, completion);
        }
        return ((p) X.q(pVar, 2)).c0(r4, completion);
    }

    @kotlin.internal.f
    private static final <R, P, T> Object h(q<? super R, ? super P, ? super c<? super T>, ? extends Object> qVar, R r4, P p4, c<? super T> completion) {
        Object k4;
        F.p(qVar, "<this>");
        F.p(completion, "completion");
        if (!(qVar instanceof BaseContinuationImpl)) {
            k4 = k(qVar, r4, p4, completion);
            return k4;
        }
        return ((q) X.q(qVar, 3)).z(r4, p4, completion);
    }

    @e
    @kotlin.U
    public static final <T> Object i(@d l<? super c<? super T>, ? extends Object> lVar, @d c<? super T> completion) {
        F.p(lVar, "<this>");
        F.p(completion, "completion");
        return ((l) X.q(lVar, 1)).C(d(kotlin.coroutines.jvm.internal.f.a(completion)));
    }

    @e
    @kotlin.U
    public static final <R, T> Object j(@d p<? super R, ? super c<? super T>, ? extends Object> pVar, R r4, @d c<? super T> completion) {
        F.p(pVar, "<this>");
        F.p(completion, "completion");
        return ((p) X.q(pVar, 2)).c0(r4, d(kotlin.coroutines.jvm.internal.f.a(completion)));
    }

    @e
    @kotlin.U
    public static <R, P, T> Object k(@d q<? super R, ? super P, ? super c<? super T>, ? extends Object> qVar, R r4, P p4, @d c<? super T> completion) {
        F.p(qVar, "<this>");
        F.p(completion, "completion");
        return ((q) X.q(qVar, 3)).z(r4, p4, d(kotlin.coroutines.jvm.internal.f.a(completion)));
    }
}
