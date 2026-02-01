package kotlinx.coroutines.flow.internal;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;

/* loaded from: classes2.dex */
public final class f<T> extends d<T> {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final InterfaceC2282i<InterfaceC2282i<T>> f54142H;

    /* renamed from: I, reason: collision with root package name */
    private final int f54143I;

    /* loaded from: classes2.dex */
    static final class a<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ L0 f54144E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.f f54145F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ D<T> f54146G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ u<T> f54147H;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0489a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f54148I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ InterfaceC2282i<T> f54149J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ u<T> f54150K;

            /* renamed from: L, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.f f54151L;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0489a(InterfaceC2282i<? extends T> interfaceC2282i, u<T> uVar, kotlinx.coroutines.sync.f fVar, kotlin.coroutines.c<? super C0489a> cVar) {
                super(2, cVar);
                this.f54149J = interfaceC2282i;
                this.f54150K = uVar;
                this.f54151L = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f54148I;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            W.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        W.n(obj);
                        InterfaceC2282i<T> interfaceC2282i = this.f54149J;
                        u<T> uVar = this.f54150K;
                        this.f54148I = 1;
                        if (interfaceC2282i.a(uVar, this) == l4) {
                            return l4;
                        }
                    }
                    this.f54151L.release();
                    return H0.f51801a;
                } catch (Throwable th) {
                    this.f54151L.release();
                    throw th;
                }
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((C0489a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new C0489a(this.f54149J, this.f54150K, this.f54151L, cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {66}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
        /* loaded from: classes2.dex */
        public static final class b extends ContinuationImpl {

            /* renamed from: H, reason: collision with root package name */
            Object f54152H;

            /* renamed from: I, reason: collision with root package name */
            Object f54153I;

            /* renamed from: J, reason: collision with root package name */
            /* synthetic */ Object f54154J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ a<T> f54155K;

            /* renamed from: L, reason: collision with root package name */
            int f54156L;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(a<? super T> aVar, kotlin.coroutines.c<? super b> cVar) {
                super(cVar);
                this.f54155K = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f54154J = obj;
                this.f54156L |= Integer.MIN_VALUE;
                return this.f54155K.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(L0 l02, kotlinx.coroutines.sync.f fVar, D<? super T> d4, u<T> uVar) {
            this.f54144E = l02;
            this.f54145F = fVar;
            this.f54146G = d4;
            this.f54147H = uVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r8, @l3.d kotlin.coroutines.c<? super kotlin.H0> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.f.a.b
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.f$a$b r0 = (kotlinx.coroutines.flow.internal.f.a.b) r0
                int r1 = r0.f54156L
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f54156L = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.f$a$b r0 = new kotlinx.coroutines.flow.internal.f$a$b
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f54154J
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f54156L
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.f54153I
                kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.InterfaceC2282i) r8
                java.lang.Object r0 = r0.f54152H
                kotlinx.coroutines.flow.internal.f$a r0 = (kotlinx.coroutines.flow.internal.f.a) r0
                kotlin.W.n(r9)
                goto L53
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                kotlin.W.n(r9)
                kotlinx.coroutines.L0 r9 = r7.f54144E
                if (r9 == 0) goto L43
                kotlinx.coroutines.O0.A(r9)
            L43:
                kotlinx.coroutines.sync.f r9 = r7.f54145F
                r0.f54152H = r7
                r0.f54153I = r8
                r0.f54156L = r3
                java.lang.Object r9 = r9.b(r0)
                if (r9 != r1) goto L52
                return r1
            L52:
                r0 = r7
            L53:
                kotlinx.coroutines.channels.D<T> r1 = r0.f54146G
                r2 = 0
                r3 = 0
                kotlinx.coroutines.flow.internal.f$a$a r4 = new kotlinx.coroutines.flow.internal.f$a$a
                kotlinx.coroutines.flow.internal.u<T> r9 = r0.f54147H
                kotlinx.coroutines.sync.f r0 = r0.f54145F
                r5 = 0
                r4.<init>(r8, r9, r0, r5)
                r5 = 3
                r6 = 0
                kotlinx.coroutines.C2319j.e(r1, r2, r3, r4, r5, r6)
                kotlin.H0 r8 = kotlin.H0.f51801a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.f.a.f(kotlinx.coroutines.flow.i, kotlin.coroutines.c):java.lang.Object");
        }
    }

    public /* synthetic */ f(InterfaceC2282i interfaceC2282i, int i4, kotlin.coroutines.f fVar, int i5, BufferOverflow bufferOverflow, int i6, C2197u c2197u) {
        this(interfaceC2282i, i4, (i6 & 4) != 0 ? EmptyCoroutineContext.f52041E : fVar, (i6 & 8) != 0 ? -2 : i5, (i6 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    protected String d() {
        return "concurrency=" + this.f54143I;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.e
    protected Object g(@l3.d D<? super T> d4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        kotlinx.coroutines.sync.f b4 = kotlinx.coroutines.sync.h.b(this.f54143I, 0, 2, null);
        u uVar = new u(d4);
        Object a4 = this.f54142H.a(new a((L0) cVar.e().a(L0.f52941w), b4, d4, uVar), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    protected d<T> l(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        return new f(this.f54142H, this.f54143I, fVar, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    public F<T> p(@l3.d U u3) {
        return B.c(u3, this.f54132E, this.f54133F, n());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@l3.d InterfaceC2282i<? extends InterfaceC2282i<? extends T>> interfaceC2282i, int i4, @l3.d kotlin.coroutines.f fVar, int i5, @l3.d BufferOverflow bufferOverflow) {
        super(fVar, i5, bufferOverflow);
        this.f54142H = interfaceC2282i;
        this.f54143I = i4;
    }
}
