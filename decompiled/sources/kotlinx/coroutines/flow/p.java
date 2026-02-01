package kotlinx.coroutines.flow;

import androidx.constraintlayout.core.motion.utils.v;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.q;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.internal.S;

/* loaded from: classes2.dex */
public final /* synthetic */ class p {

    /* loaded from: classes2.dex */
    public static final class a<T> extends Lambda implements X2.l<T, Long> {

        /* renamed from: F */
        final /* synthetic */ long f54291F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j4) {
            super(1);
            this.f54291F = j4;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c */
        public final Long C(T t3) {
            return Long.valueOf(this.f54291F);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> extends Lambda implements X2.l<T, Long> {

        /* renamed from: F */
        final /* synthetic */ X2.l<T, kotlin.time.e> f54292F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(X2.l<? super T, kotlin.time.e> lVar) {
            super(1);
            this.f54292F = lVar;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c */
        public final Long C(T t3) {
            return Long.valueOf(C2269d0.e(this.f54292F.C(t3).z0()));
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {222, 355}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue", "timeoutMillis"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes2.dex */
    public static final class c<T> extends SuspendLambda implements X2.q<U, InterfaceC2283j<? super T>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f54293I;

        /* renamed from: J */
        Object f54294J;

        /* renamed from: K */
        int f54295K;

        /* renamed from: L */
        private /* synthetic */ Object f54296L;

        /* renamed from: M */
        /* synthetic */ Object f54297M;

        /* renamed from: N */
        final /* synthetic */ X2.l<T, Long> f54298N;

        /* renamed from: O */
        final /* synthetic */ InterfaceC2282i<T> f54299O;

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements X2.l<kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I */
            int f54300I;

            /* renamed from: J */
            final /* synthetic */ InterfaceC2283j<T> f54301J;

            /* renamed from: K */
            final /* synthetic */ Ref.ObjectRef<Object> f54302K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(InterfaceC2283j<? super T> interfaceC2283j, Ref.ObjectRef<Object> objectRef, kotlin.coroutines.c<? super a> cVar) {
                super(1, cVar);
                this.f54301J = interfaceC2283j;
                this.f54302K = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f54300I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    InterfaceC2283j<T> interfaceC2283j = this.f54301J;
                    S s4 = kotlinx.coroutines.flow.internal.s.f54253a;
                    T t3 = this.f54302K.f52301E;
                    if (t3 == s4) {
                        t3 = null;
                    }
                    this.f54300I = 1;
                    if (interfaceC2283j.f(t3, this) == l4) {
                        return l4;
                    }
                }
                this.f54302K.f52301E = null;
                return H0.f51801a;
            }

            @Override // X2.l
            @l3.e
            /* renamed from: R */
            public final Object C(@l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((a) y(cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> y(@l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f54301J, this.f54302K, cVar);
            }
        }

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {243}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.q<? extends Object>, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I */
            Object f54303I;

            /* renamed from: J */
            int f54304J;

            /* renamed from: K */
            /* synthetic */ Object f54305K;

            /* renamed from: L */
            final /* synthetic */ Ref.ObjectRef<Object> f54306L;

            /* renamed from: M */
            final /* synthetic */ InterfaceC2283j<T> f54307M;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Ref.ObjectRef<Object> objectRef, InterfaceC2283j<? super T> interfaceC2283j, kotlin.coroutines.c<? super b> cVar) {
                super(2, cVar);
                this.f54306L = objectRef;
                this.f54307M = interfaceC2283j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                Ref.ObjectRef<Object> objectRef;
                Ref.ObjectRef<Object> objectRef2;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f54304J;
                if (i4 != 0) {
                    if (i4 == 1) {
                        objectRef2 = (Ref.ObjectRef) this.f54303I;
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    T t3 = (T) ((kotlinx.coroutines.channels.q) this.f54305K).o();
                    objectRef = this.f54306L;
                    boolean z3 = t3 instanceof q.c;
                    if (!z3) {
                        objectRef.f52301E = t3;
                    }
                    InterfaceC2283j<T> interfaceC2283j = this.f54307M;
                    if (z3) {
                        Throwable f4 = kotlinx.coroutines.channels.q.f(t3);
                        if (f4 == null) {
                            Object obj2 = objectRef.f52301E;
                            if (obj2 != null) {
                                if (obj2 == kotlinx.coroutines.flow.internal.s.f54253a) {
                                    obj2 = null;
                                }
                                this.f54305K = t3;
                                this.f54303I = objectRef;
                                this.f54304J = 1;
                                if (interfaceC2283j.f(obj2, this) == l4) {
                                    return l4;
                                }
                                objectRef2 = objectRef;
                            }
                            objectRef.f52301E = (T) kotlinx.coroutines.flow.internal.s.f54255c;
                        } else {
                            throw f4;
                        }
                    }
                    return H0.f51801a;
                }
                objectRef = objectRef2;
                objectRef.f52301E = (T) kotlinx.coroutines.flow.internal.s.f54255c;
                return H0.f51801a;
            }

            @l3.e
            public final Object R(@l3.d Object obj, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((b) v(kotlinx.coroutines.channels.q.b(obj), cVar)).D(H0.f51801a);
            }

            @Override // X2.p
            public /* bridge */ /* synthetic */ Object c0(kotlinx.coroutines.channels.q<? extends Object> qVar, kotlin.coroutines.c<? super H0> cVar) {
                return R(qVar.o(), cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                b bVar = new b(this.f54306L, this.f54307M, cVar);
                bVar.f54305K = obj;
                return bVar;
            }
        }

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.p$c$c */
        /* loaded from: classes2.dex */
        public static final class C0499c extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<? super Object>, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I */
            int f54308I;

            /* renamed from: J */
            private /* synthetic */ Object f54309J;

            /* renamed from: K */
            final /* synthetic */ InterfaceC2282i<T> f54310K;

            /* renamed from: kotlinx.coroutines.flow.p$c$c$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements InterfaceC2283j {

                /* renamed from: E */
                final /* synthetic */ kotlinx.coroutines.channels.D<Object> f54311E;

                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {211}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.p$c$c$a$a */
                /* loaded from: classes2.dex */
                public static final class C0500a extends ContinuationImpl {

                    /* renamed from: H */
                    /* synthetic */ Object f54312H;

                    /* renamed from: I */
                    final /* synthetic */ a<T> f54313I;

                    /* renamed from: J */
                    int f54314J;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0500a(a<? super T> aVar, kotlin.coroutines.c<? super C0500a> cVar) {
                        super(cVar);
                        this.f54313I = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f54312H = obj;
                        this.f54314J |= Integer.MIN_VALUE;
                        return this.f54313I.f(null, this);
                    }
                }

                a(kotlinx.coroutines.channels.D<Object> d4) {
                    this.f54311E = d4;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC2283j
                @l3.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(T r5, @l3.d kotlin.coroutines.c<? super kotlin.H0> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.p.c.C0499c.a.C0500a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.p$c$c$a$a r0 = (kotlinx.coroutines.flow.p.c.C0499c.a.C0500a) r0
                        int r1 = r0.f54314J
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f54314J = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.p$c$c$a$a r0 = new kotlinx.coroutines.flow.p$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f54312H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f54314J
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.W.n(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.W.n(r6)
                        kotlinx.coroutines.channels.D<java.lang.Object> r6 = r4.f54311E
                        if (r5 != 0) goto L3a
                        kotlinx.coroutines.internal.S r5 = kotlinx.coroutines.flow.internal.s.f54253a
                    L3a:
                        r0.f54314J = r3
                        java.lang.Object r5 = r6.U(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.H0 r5 = kotlin.H0.f51801a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p.c.C0499c.a.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0499c(InterfaceC2282i<? extends T> interfaceC2282i, kotlin.coroutines.c<? super C0499c> cVar) {
                super(2, cVar);
                this.f54310K = interfaceC2282i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f54308I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    kotlinx.coroutines.channels.D d4 = (kotlinx.coroutines.channels.D) this.f54309J;
                    InterfaceC2282i<T> interfaceC2282i = this.f54310K;
                    a aVar = new a(d4);
                    this.f54308I = 1;
                    if (interfaceC2282i.a(aVar, this) == l4) {
                        return l4;
                    }
                }
                return H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R */
            public final Object c0(@l3.d kotlinx.coroutines.channels.D<Object> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((C0499c) v(d4, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                C0499c c0499c = new C0499c(this.f54310K, cVar);
                c0499c.f54309J = obj;
                return c0499c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(X2.l<? super T, Long> lVar, InterfaceC2282i<? extends T> interfaceC2282i, kotlin.coroutines.c<? super c> cVar) {
            super(3, cVar);
            this.f54298N = lVar;
            this.f54299O = interfaceC2282i;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:9|(4:11|(1:13)|14|(2:26|27)(2:16|(5:18|(1:20)|21|(1:23)|25)))|28|29|30|31|(1:33)|34|35|(1:37)|(1:39)|6|7|(2:45|46)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0022, code lost:
        
            if (r15 != r0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
        
            r15 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
        
            r7.g1(r15);
         */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cc A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:31:0x00c8, B:33:0x00cc, B:34:0x00d9), top: B:30:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p.c.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.q
        @l3.e
        /* renamed from: R */
        public final Object z(@l3.d U u3, @l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            c cVar2 = new c(this.f54298N, this.f54299O, cVar);
            cVar2.f54296L = u3;
            cVar2.f54297M = interfaceC2283j;
            return cVar2.D(H0.f51801a);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", i = {0, 1, 2}, l = {314, v.a.f7389q, v.a.f7390r}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    /* loaded from: classes2.dex */
    public static final class d extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<? super H0>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        int f54315I;

        /* renamed from: J */
        private /* synthetic */ Object f54316J;

        /* renamed from: K */
        final /* synthetic */ long f54317K;

        /* renamed from: L */
        final /* synthetic */ long f54318L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j4, long j5, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f54317K = j4;
            this.f54318L = j5;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005a -> B:12:0x003f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r7.f54315I
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L22
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f54316J
                kotlinx.coroutines.channels.D r1 = (kotlinx.coroutines.channels.D) r1
                kotlin.W.n(r8)
                goto L50
            L22:
                java.lang.Object r1 = r7.f54316J
                kotlinx.coroutines.channels.D r1 = (kotlinx.coroutines.channels.D) r1
                kotlin.W.n(r8)
                goto L3f
            L2a:
                kotlin.W.n(r8)
                java.lang.Object r8 = r7.f54316J
                r1 = r8
                kotlinx.coroutines.channels.D r1 = (kotlinx.coroutines.channels.D) r1
                long r5 = r7.f54317K
                r7.f54316J = r1
                r7.f54315I = r4
                java.lang.Object r8 = kotlinx.coroutines.C2269d0.b(r5, r7)
                if (r8 != r0) goto L3f
                return r0
            L3f:
                kotlinx.coroutines.channels.J r8 = r1.h()
                kotlin.H0 r4 = kotlin.H0.f51801a
                r7.f54316J = r1
                r7.f54315I = r3
                java.lang.Object r8 = r8.U(r4, r7)
                if (r8 != r0) goto L50
                return r0
            L50:
                long r4 = r7.f54318L
                r7.f54316J = r1
                r7.f54315I = r2
                java.lang.Object r8 = kotlinx.coroutines.C2269d0.b(r4, r7)
                if (r8 != r0) goto L3f
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p.d.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<? super H0> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((d) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            d dVar = new d(this.f54317K, this.f54318L, cVar);
            dVar.f54316J = obj;
            return dVar;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {352}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes2.dex */
    public static final class e<T> extends SuspendLambda implements X2.q<U, InterfaceC2283j<? super T>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f54319I;

        /* renamed from: J */
        Object f54320J;

        /* renamed from: K */
        int f54321K;

        /* renamed from: L */
        private /* synthetic */ Object f54322L;

        /* renamed from: M */
        /* synthetic */ Object f54323M;

        /* renamed from: N */
        final /* synthetic */ long f54324N;

        /* renamed from: O */
        final /* synthetic */ InterfaceC2282i<T> f54325O;

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.q<? extends Object>, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I */
            int f54326I;

            /* renamed from: J */
            /* synthetic */ Object f54327J;

            /* renamed from: K */
            final /* synthetic */ Ref.ObjectRef<Object> f54328K;

            /* renamed from: L */
            final /* synthetic */ kotlinx.coroutines.channels.F<H0> f54329L;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ref.ObjectRef<Object> objectRef, kotlinx.coroutines.channels.F<H0> f4, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f54328K = objectRef;
                this.f54329L = f4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f54326I == 0) {
                    W.n(obj);
                    T t3 = (T) ((kotlinx.coroutines.channels.q) this.f54327J).o();
                    Ref.ObjectRef<Object> objectRef = this.f54328K;
                    boolean z3 = t3 instanceof q.c;
                    if (!z3) {
                        objectRef.f52301E = t3;
                    }
                    kotlinx.coroutines.channels.F<H0> f4 = this.f54329L;
                    if (z3) {
                        Throwable f5 = kotlinx.coroutines.channels.q.f(t3);
                        if (f5 == null) {
                            f4.f(new ChildCancelledException());
                            objectRef.f52301E = (T) kotlinx.coroutines.flow.internal.s.f54255c;
                        } else {
                            throw f5;
                        }
                    }
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @l3.e
            public final Object R(@l3.d Object obj, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((a) v(kotlinx.coroutines.channels.q.b(obj), cVar)).D(H0.f51801a);
            }

            @Override // X2.p
            public /* bridge */ /* synthetic */ Object c0(kotlinx.coroutines.channels.q<? extends Object> qVar, kotlin.coroutines.c<? super H0> cVar) {
                return R(qVar.o(), cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                a aVar = new a(this.f54328K, this.f54329L, cVar);
                aVar.f54327J = obj;
                return aVar;
            }
        }

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements X2.p<H0, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I */
            int f54330I;

            /* renamed from: J */
            final /* synthetic */ Ref.ObjectRef<Object> f54331J;

            /* renamed from: K */
            final /* synthetic */ InterfaceC2283j<T> f54332K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Ref.ObjectRef<Object> objectRef, InterfaceC2283j<? super T> interfaceC2283j, kotlin.coroutines.c<? super b> cVar) {
                super(2, cVar);
                this.f54331J = objectRef;
                this.f54332K = interfaceC2283j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f54330I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    Ref.ObjectRef<Object> objectRef = this.f54331J;
                    Object obj2 = objectRef.f52301E;
                    if (obj2 == null) {
                        return H0.f51801a;
                    }
                    objectRef.f52301E = null;
                    InterfaceC2283j<T> interfaceC2283j = this.f54332K;
                    if (obj2 == kotlinx.coroutines.flow.internal.s.f54253a) {
                        obj2 = null;
                    }
                    this.f54330I = 1;
                    if (interfaceC2283j.f(obj2, this) == l4) {
                        return l4;
                    }
                }
                return H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R */
            public final Object c0(@l3.d H0 h02, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((b) v(h02, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new b(this.f54331J, this.f54332K, cVar);
            }
        }

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {280}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class c extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<? super Object>, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I */
            int f54333I;

            /* renamed from: J */
            private /* synthetic */ Object f54334J;

            /* renamed from: K */
            final /* synthetic */ InterfaceC2282i<T> f54335K;

            /* loaded from: classes2.dex */
            public static final class a<T> implements InterfaceC2283j {

                /* renamed from: E */
                final /* synthetic */ kotlinx.coroutines.channels.D<Object> f54336E;

                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {280}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.p$e$c$a$a */
                /* loaded from: classes2.dex */
                public static final class C0501a extends ContinuationImpl {

                    /* renamed from: H */
                    /* synthetic */ Object f54337H;

                    /* renamed from: I */
                    final /* synthetic */ a<T> f54338I;

                    /* renamed from: J */
                    int f54339J;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0501a(a<? super T> aVar, kotlin.coroutines.c<? super C0501a> cVar) {
                        super(cVar);
                        this.f54338I = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f54337H = obj;
                        this.f54339J |= Integer.MIN_VALUE;
                        return this.f54338I.f(null, this);
                    }
                }

                a(kotlinx.coroutines.channels.D<Object> d4) {
                    this.f54336E = d4;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC2283j
                @l3.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(T r5, @l3.d kotlin.coroutines.c<? super kotlin.H0> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.p.e.c.a.C0501a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.p$e$c$a$a r0 = (kotlinx.coroutines.flow.p.e.c.a.C0501a) r0
                        int r1 = r0.f54339J
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f54339J = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.p$e$c$a$a r0 = new kotlinx.coroutines.flow.p$e$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f54337H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f54339J
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.W.n(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.W.n(r6)
                        kotlinx.coroutines.channels.D<java.lang.Object> r6 = r4.f54336E
                        if (r5 != 0) goto L3a
                        kotlinx.coroutines.internal.S r5 = kotlinx.coroutines.flow.internal.s.f54253a
                    L3a:
                        r0.f54339J = r3
                        java.lang.Object r5 = r6.U(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.H0 r5 = kotlin.H0.f51801a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p.e.c.a.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(InterfaceC2282i<? extends T> interfaceC2282i, kotlin.coroutines.c<? super c> cVar) {
                super(2, cVar);
                this.f54335K = interfaceC2282i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f54333I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    kotlinx.coroutines.channels.D d4 = (kotlinx.coroutines.channels.D) this.f54334J;
                    InterfaceC2282i<T> interfaceC2282i = this.f54335K;
                    a aVar = new a(d4);
                    this.f54333I = 1;
                    if (interfaceC2282i.a(aVar, this) == l4) {
                        return l4;
                    }
                }
                return H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R */
            public final Object c0(@l3.d kotlinx.coroutines.channels.D<Object> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((c) v(d4, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                c cVar2 = new c(this.f54335K, cVar);
                cVar2.f54334J = obj;
                return cVar2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(long j4, InterfaceC2282i<? extends T> interfaceC2282i, kotlin.coroutines.c<? super e> cVar) {
            super(3, cVar);
            this.f54324N = j4;
            this.f54325O = interfaceC2282i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            kotlinx.coroutines.channels.F g4;
            InterfaceC2283j interfaceC2283j;
            kotlinx.coroutines.channels.F f4;
            Ref.ObjectRef objectRef;
            kotlinx.coroutines.channels.F f5;
            Object l5;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f54321K;
            if (i4 != 0) {
                if (i4 == 1) {
                    f5 = (kotlinx.coroutines.channels.F) this.f54320J;
                    objectRef = (Ref.ObjectRef) this.f54319I;
                    f4 = (kotlinx.coroutines.channels.F) this.f54323M;
                    interfaceC2283j = (InterfaceC2283j) this.f54322L;
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                U u3 = (U) this.f54322L;
                InterfaceC2283j interfaceC2283j2 = (InterfaceC2283j) this.f54323M;
                kotlinx.coroutines.channels.F f6 = kotlinx.coroutines.channels.B.f(u3, null, -1, new c(this.f54325O, null), 1, null);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                g4 = p.g(u3, this.f54324N, 0L, 2, null);
                interfaceC2283j = interfaceC2283j2;
                f4 = f6;
                objectRef = objectRef2;
                f5 = g4;
            }
            while (objectRef.f52301E != kotlinx.coroutines.flow.internal.s.f54255c) {
                this.f54322L = interfaceC2283j;
                this.f54323M = f4;
                this.f54319I = objectRef;
                this.f54320J = f5;
                this.f54321K = 1;
                kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(this);
                try {
                    bVar.H(f4.s(), new a(objectRef, f5, null));
                    bVar.H(f5.r(), new b(objectRef, interfaceC2283j, null));
                } catch (Throwable th) {
                    bVar.g1(th);
                }
                Object f12 = bVar.f1();
                l5 = kotlin.coroutines.intrinsics.b.l();
                if (f12 == l5) {
                    kotlin.coroutines.jvm.internal.f.c(this);
                }
                if (f12 == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.q
        @l3.e
        /* renamed from: R */
        public final Object z(@l3.d U u3, @l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            e eVar = new e(this.f54324N, this.f54325O, cVar);
            eVar.f54322L = u3;
            eVar.f54323M = interfaceC2283j;
            return eVar.D(H0.f51801a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> a(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4) {
        if (j4 >= 0) {
            if (j4 == 0) {
                return interfaceC2282i;
            }
            return e(interfaceC2282i, new a(j4));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    @kotlin.N
    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> b(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.l<? super T, Long> lVar) {
        return e(interfaceC2282i, lVar);
    }

    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> c(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4) {
        return C2284k.a0(interfaceC2282i, C2269d0.e(j4));
    }

    @B0
    @l3.d
    @W2.i(name = "debounceDuration")
    @kotlin.N
    public static final <T> InterfaceC2282i<T> d(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.l<? super T, kotlin.time.e> lVar) {
        return e(interfaceC2282i, new b(lVar));
    }

    private static final <T> InterfaceC2282i<T> e(InterfaceC2282i<? extends T> interfaceC2282i, X2.l<? super T, Long> lVar) {
        return kotlinx.coroutines.flow.internal.n.b(new c(lVar, interfaceC2282i, null));
    }

    @l3.d
    public static final kotlinx.coroutines.channels.F<H0> f(@l3.d U u3, long j4, long j5) {
        if (j4 >= 0) {
            if (j5 >= 0) {
                return kotlinx.coroutines.channels.B.f(u3, null, 0, new d(j5, j4, null), 1, null);
            }
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j5 + " ms").toString());
        }
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j4 + " ms").toString());
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F g(U u3, long j4, long j5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j5 = j4;
        }
        return C2284k.x0(u3, j4, j5);
    }

    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> h(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4) {
        if (j4 > 0) {
            return kotlinx.coroutines.flow.internal.n.b(new e(j4, interfaceC2282i, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> i(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4) {
        return C2284k.A1(interfaceC2282i, C2269d0.e(j4));
    }
}
