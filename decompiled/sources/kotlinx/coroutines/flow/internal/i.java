package kotlinx.coroutines.flow.internal;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;

/* loaded from: classes2.dex */
public final class i<T, R> extends g<T, R> {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final X2.q<InterfaceC2283j<? super R>, T, kotlin.coroutines.c<? super H0>, Object> f54161I;

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f54162I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f54163J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ i<T, R> f54164K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j<R> f54165L;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kotlinx.coroutines.flow.internal.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0490a<T> implements InterfaceC2283j {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<L0> f54166E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ U f54167F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ i<T, R> f54168G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ InterfaceC2283j<R> f54169H;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.i$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0491a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

                /* renamed from: I, reason: collision with root package name */
                int f54170I;

                /* renamed from: J, reason: collision with root package name */
                final /* synthetic */ i<T, R> f54171J;

                /* renamed from: K, reason: collision with root package name */
                final /* synthetic */ InterfaceC2283j<R> f54172K;

                /* renamed from: L, reason: collision with root package name */
                final /* synthetic */ T f54173L;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0491a(i<T, R> iVar, InterfaceC2283j<? super R> interfaceC2283j, T t3, kotlin.coroutines.c<? super C0491a> cVar) {
                    super(2, cVar);
                    this.f54171J = iVar;
                    this.f54172K = interfaceC2283j;
                    this.f54173L = t3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.e
                public final Object D(@l3.d Object obj) {
                    Object l4;
                    l4 = kotlin.coroutines.intrinsics.b.l();
                    int i4 = this.f54170I;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            W.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        W.n(obj);
                        X2.q qVar = ((i) this.f54171J).f54161I;
                        InterfaceC2283j<R> interfaceC2283j = this.f54172K;
                        T t3 = this.f54173L;
                        this.f54170I = 1;
                        if (qVar.z(interfaceC2283j, t3, this) == l4) {
                            return l4;
                        }
                    }
                    return H0.f51801a;
                }

                @Override // X2.p
                @l3.e
                /* renamed from: R, reason: merged with bridge method [inline-methods] */
                public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                    return ((C0491a) v(u3, cVar)).D(H0.f51801a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.d
                public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                    return new C0491a(this.f54171J, this.f54172K, this.f54173L, cVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {30}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            /* renamed from: kotlinx.coroutines.flow.internal.i$a$a$b */
            /* loaded from: classes2.dex */
            public static final class b extends ContinuationImpl {

                /* renamed from: H, reason: collision with root package name */
                Object f54174H;

                /* renamed from: I, reason: collision with root package name */
                Object f54175I;

                /* renamed from: J, reason: collision with root package name */
                Object f54176J;

                /* renamed from: K, reason: collision with root package name */
                /* synthetic */ Object f54177K;

                /* renamed from: L, reason: collision with root package name */
                final /* synthetic */ C0490a<T> f54178L;

                /* renamed from: M, reason: collision with root package name */
                int f54179M;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C0490a<? super T> c0490a, kotlin.coroutines.c<? super b> cVar) {
                    super(cVar);
                    this.f54178L = c0490a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.e
                public final Object D(@l3.d Object obj) {
                    this.f54177K = obj;
                    this.f54179M |= Integer.MIN_VALUE;
                    return this.f54178L.f(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0490a(Ref.ObjectRef<L0> objectRef, U u3, i<T, R> iVar, InterfaceC2283j<? super R> interfaceC2283j) {
                this.f54166E = objectRef;
                this.f54167F = u3;
                this.f54168G = iVar;
                this.f54169H = interfaceC2283j;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC2283j
            @l3.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object f(T r8, @l3.d kotlin.coroutines.c<? super kotlin.H0> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.i.a.C0490a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    kotlinx.coroutines.flow.internal.i$a$a$b r0 = (kotlinx.coroutines.flow.internal.i.a.C0490a.b) r0
                    int r1 = r0.f54179M
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f54179M = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.i$a$a$b r0 = new kotlinx.coroutines.flow.internal.i$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f54177K
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                    int r2 = r0.f54179M
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f54176J
                    kotlinx.coroutines.L0 r8 = (kotlinx.coroutines.L0) r8
                    java.lang.Object r8 = r0.f54175I
                    java.lang.Object r0 = r0.f54174H
                    kotlinx.coroutines.flow.internal.i$a$a r0 = (kotlinx.coroutines.flow.internal.i.a.C0490a) r0
                    kotlin.W.n(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.W.n(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.L0> r9 = r7.f54166E
                    T r9 = r9.f52301E
                    kotlinx.coroutines.L0 r9 = (kotlinx.coroutines.L0) r9
                    if (r9 == 0) goto L5d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.f(r2)
                    r0.f54174H = r7
                    r0.f54175I = r8
                    r0.f54176J = r9
                    r0.f54179M = r3
                    java.lang.Object r9 = r9.H(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.L0> r9 = r0.f54166E
                    kotlinx.coroutines.U r1 = r0.f54167F
                    r2 = 0
                    kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                    kotlinx.coroutines.flow.internal.i$a$a$a r4 = new kotlinx.coroutines.flow.internal.i$a$a$a
                    kotlinx.coroutines.flow.internal.i<T, R> r5 = r0.f54168G
                    kotlinx.coroutines.flow.j<R> r0 = r0.f54169H
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    kotlinx.coroutines.L0 r8 = kotlinx.coroutines.C2319j.e(r1, r2, r3, r4, r5, r6)
                    r9.f52301E = r8
                    kotlin.H0 r8 = kotlin.H0.f51801a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.i.a.C0490a.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(i<T, R> iVar, InterfaceC2283j<? super R> interfaceC2283j, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f54164K = iVar;
            this.f54165L = interfaceC2283j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f54162I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                U u3 = (U) this.f54163J;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                i<T, R> iVar = this.f54164K;
                InterfaceC2282i<S> interfaceC2282i = iVar.f54157H;
                C0490a c0490a = new C0490a(objectRef, u3, iVar, this.f54165L);
                this.f54162I = 1;
                if (interfaceC2282i.a(c0490a, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(this.f54164K, this.f54165L, cVar);
            aVar.f54163J = obj;
            return aVar;
        }
    }

    public /* synthetic */ i(X2.q qVar, InterfaceC2282i interfaceC2282i, kotlin.coroutines.f fVar, int i4, BufferOverflow bufferOverflow, int i5, C2197u c2197u) {
        this(qVar, interfaceC2282i, (i5 & 4) != 0 ? EmptyCoroutineContext.f52041E : fVar, (i5 & 8) != 0 ? -2 : i4, (i5 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    protected d<R> l(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        return new i(this.f54161I, this.f54157H, fVar, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.g
    @l3.e
    protected Object u(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object g4 = V.g(new a(this, interfaceC2283j, null), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (g4 == l4) {
            return g4;
        }
        return H0.f51801a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@l3.d X2.q<? super InterfaceC2283j<? super R>, ? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, @l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        super(interfaceC2282i, fVar, i4, bufferOverflow);
        this.f54161I = qVar;
    }
}
