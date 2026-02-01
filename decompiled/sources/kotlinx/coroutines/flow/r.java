package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC2350z;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.U;

/* loaded from: classes2.dex */
public final /* synthetic */ class r {

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        int f54344I;

        /* renamed from: J */
        final /* synthetic */ C f54345J;

        /* renamed from: K */
        final /* synthetic */ InterfaceC2282i<T> f54346K;

        /* renamed from: L */
        final /* synthetic */ s<T> f54347L;

        /* renamed from: M */
        final /* synthetic */ T f54348M;

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.r$a$a */
        /* loaded from: classes2.dex */
        public static final class C0502a extends SuspendLambda implements X2.p<Integer, kotlin.coroutines.c<? super Boolean>, Object> {

            /* renamed from: I */
            int f54349I;

            /* renamed from: J */
            /* synthetic */ int f54350J;

            C0502a(kotlin.coroutines.c<? super C0502a> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                boolean z3;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f54349I == 0) {
                    W.n(obj);
                    if (this.f54350J > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    return kotlin.coroutines.jvm.internal.a.a(z3);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @l3.e
            public final Object R(int i4, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
                return ((C0502a) v(Integer.valueOf(i4), cVar)).D(H0.f51801a);
            }

            @Override // X2.p
            public /* bridge */ /* synthetic */ Object c0(Integer num, kotlin.coroutines.c<? super Boolean> cVar) {
                return R(num.intValue(), cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                C0502a c0502a = new C0502a(cVar);
                c0502a.f54350J = ((Number) obj).intValue();
                return c0502a;
            }
        }

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements X2.p<SharingCommand, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I */
            int f54351I;

            /* renamed from: J */
            /* synthetic */ Object f54352J;

            /* renamed from: K */
            final /* synthetic */ InterfaceC2282i<T> f54353K;

            /* renamed from: L */
            final /* synthetic */ s<T> f54354L;

            /* renamed from: M */
            final /* synthetic */ T f54355M;

            /* renamed from: kotlinx.coroutines.flow.r$a$b$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C0503a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f54356a;

                static {
                    int[] iArr = new int[SharingCommand.values().length];
                    iArr[SharingCommand.START.ordinal()] = 1;
                    iArr[SharingCommand.STOP.ordinal()] = 2;
                    iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    f54356a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(InterfaceC2282i<? extends T> interfaceC2282i, s<T> sVar, T t3, kotlin.coroutines.c<? super b> cVar) {
                super(2, cVar);
                this.f54353K = interfaceC2282i;
                this.f54354L = sVar;
                this.f54355M = t3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f54351I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    int i5 = C0503a.f54356a[((SharingCommand) this.f54352J).ordinal()];
                    if (i5 != 1) {
                        if (i5 == 3) {
                            T t3 = this.f54355M;
                            if (t3 == z.f54389a) {
                                this.f54354L.i();
                            } else {
                                this.f54354L.j(t3);
                            }
                        }
                    } else {
                        InterfaceC2282i<T> interfaceC2282i = this.f54353K;
                        InterfaceC2283j interfaceC2283j = this.f54354L;
                        this.f54351I = 1;
                        if (interfaceC2282i.a(interfaceC2283j, this) == l4) {
                            return l4;
                        }
                    }
                }
                return H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R */
            public final Object c0(@l3.d SharingCommand sharingCommand, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((b) v(sharingCommand, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                b bVar = new b(this.f54353K, this.f54354L, this.f54355M, cVar);
                bVar.f54352J = obj;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C c4, InterfaceC2282i<? extends T> interfaceC2282i, s<T> sVar, T t3, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f54345J = c4;
            this.f54346K = interfaceC2282i;
            this.f54347L = sVar;
            this.f54348M = t3;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[RETURN] */
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
                int r1 = r7.f54344I
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.W.n(r8)
                goto L5c
            L21:
                kotlin.W.n(r8)
                goto L8d
            L25:
                kotlin.W.n(r8)
                kotlinx.coroutines.flow.C r8 = r7.f54345J
                kotlinx.coroutines.flow.C$a r1 = kotlinx.coroutines.flow.C.f53479a
                kotlinx.coroutines.flow.C r6 = r1.c()
                if (r8 != r6) goto L3f
                kotlinx.coroutines.flow.i<T> r8 = r7.f54346K
                kotlinx.coroutines.flow.s<T> r1 = r7.f54347L
                r7.f54344I = r5
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                kotlinx.coroutines.flow.C r8 = r7.f54345J
                kotlinx.coroutines.flow.C r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                kotlinx.coroutines.flow.s<T> r8 = r7.f54347L
                kotlinx.coroutines.flow.H r8 = r8.k()
                kotlinx.coroutines.flow.r$a$a r1 = new kotlinx.coroutines.flow.r$a$a
                r1.<init>(r5)
                r7.f54344I = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.C2284k.t0(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                kotlinx.coroutines.flow.i<T> r8 = r7.f54346K
                kotlinx.coroutines.flow.s<T> r1 = r7.f54347L
                r7.f54344I = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                kotlinx.coroutines.flow.C r8 = r7.f54345J
                kotlinx.coroutines.flow.s<T> r1 = r7.f54347L
                kotlinx.coroutines.flow.H r1 = r1.k()
                kotlinx.coroutines.flow.i r8 = r8.a(r1)
                kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.C2284k.g0(r8)
                kotlinx.coroutines.flow.r$a$b r1 = new kotlinx.coroutines.flow.r$a$b
                kotlinx.coroutines.flow.i<T> r3 = r7.f54346K
                kotlinx.coroutines.flow.s<T> r4 = r7.f54347L
                T r6 = r7.f54348M
                r1.<init>(r3, r4, r6, r5)
                r7.f54344I = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.C2284k.A(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                kotlin.H0 r8 = kotlin.H0.f51801a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.a.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new a(this.f54345J, this.f54346K, this.f54347L, this.f54348M, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        int f54357I;

        /* renamed from: J */
        private /* synthetic */ Object f54358J;

        /* renamed from: K */
        final /* synthetic */ InterfaceC2282i<T> f54359K;

        /* renamed from: L */
        final /* synthetic */ InterfaceC2350z<H<T>> f54360L;

        /* loaded from: classes2.dex */
        public static final class a<T> implements InterfaceC2283j {

            /* renamed from: E */
            final /* synthetic */ Ref.ObjectRef<t<T>> f54361E;

            /* renamed from: F */
            final /* synthetic */ U f54362F;

            /* renamed from: G */
            final /* synthetic */ InterfaceC2350z<H<T>> f54363G;

            a(Ref.ObjectRef<t<T>> objectRef, U u3, InterfaceC2350z<H<T>> interfaceC2350z) {
                this.f54361E = objectRef;
                this.f54362F = u3;
                this.f54363G = interfaceC2350z;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.flow.t, T, kotlinx.coroutines.flow.H] */
            @Override // kotlinx.coroutines.flow.InterfaceC2283j
            @l3.e
            public final Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
                H0 h02;
                t<T> tVar = this.f54361E.f52301E;
                if (tVar != null) {
                    tVar.setValue(t3);
                    h02 = H0.f51801a;
                } else {
                    h02 = null;
                }
                if (h02 == null) {
                    U u3 = this.f54362F;
                    Ref.ObjectRef<t<T>> objectRef = this.f54361E;
                    InterfaceC2350z<H<T>> interfaceC2350z = this.f54363G;
                    ?? r4 = (T) J.a(t3);
                    interfaceC2350z.F0(new v(r4, O0.B(u3.getCoroutineContext())));
                    objectRef.f52301E = r4;
                }
                return H0.f51801a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC2282i<? extends T> interfaceC2282i, InterfaceC2350z<H<T>> interfaceC2350z, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f54359K = interfaceC2282i;
            this.f54360L = interfaceC2350z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f54357I;
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    U u3 = (U) this.f54358J;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    InterfaceC2282i<T> interfaceC2282i = this.f54359K;
                    a aVar = new a(objectRef, u3, this.f54360L);
                    this.f54357I = 1;
                    if (interfaceC2282i.a(aVar, this) == l4) {
                        return l4;
                    }
                }
                return H0.f51801a;
            } catch (Throwable th) {
                this.f54360L.k(th);
                throw th;
            }
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            b bVar = new b(this.f54359K, this.f54360L, cVar);
            bVar.f54358J = obj;
            return bVar;
        }
    }

    @l3.d
    public static final <T> x<T> a(@l3.d s<T> sVar) {
        return new u(sVar, null);
    }

    @l3.d
    public static final <T> H<T> b(@l3.d t<T> tVar) {
        return new v(tVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r3 == 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> kotlinx.coroutines.flow.B<T> c(kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r7, int r8) {
        /*
            kotlinx.coroutines.channels.m$b r0 = kotlinx.coroutines.channels.InterfaceC2254m.f53116x
            int r0 = r0.a()
            int r0 = kotlin.ranges.s.u(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.d
            if (r1 == 0) goto L3c
            r1 = r7
            kotlinx.coroutines.flow.internal.d r1 = (kotlinx.coroutines.flow.internal.d) r1
            kotlinx.coroutines.flow.i r2 = r1.m()
            if (r2 == 0) goto L3c
            kotlinx.coroutines.flow.B r7 = new kotlinx.coroutines.flow.B
            int r3 = r1.f54133F
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f54134G
            kotlinx.coroutines.channels.BufferOverflow r5 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            kotlinx.coroutines.channels.BufferOverflow r8 = r1.f54134G
            kotlin.coroutines.f r1 = r1.f54132E
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            kotlinx.coroutines.flow.B r8 = new kotlinx.coroutines.flow.B
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f52041E
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.c(kotlinx.coroutines.flow.i, int):kotlinx.coroutines.flow.B");
    }

    private static final <T> L0 d(U u3, kotlin.coroutines.f fVar, InterfaceC2282i<? extends T> interfaceC2282i, s<T> sVar, C c4, T t3) {
        CoroutineStart coroutineStart;
        if (kotlin.jvm.internal.F.g(c4, C.f53479a.c())) {
            coroutineStart = CoroutineStart.DEFAULT;
        } else {
            coroutineStart = CoroutineStart.UNDISPATCHED;
        }
        return C2319j.d(u3, fVar, coroutineStart, new a(c4, interfaceC2282i, sVar, t3, null));
    }

    private static final <T> void e(U u3, kotlin.coroutines.f fVar, InterfaceC2282i<? extends T> interfaceC2282i, InterfaceC2350z<H<T>> interfaceC2350z) {
        C2323l.f(u3, fVar, null, new b(interfaceC2282i, interfaceC2350z, null), 2, null);
    }

    @l3.d
    public static final <T> x<T> f(@l3.d x<? extends T> xVar, @l3.d X2.p<? super InterfaceC2283j<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return new M(xVar, pVar);
    }

    @l3.d
    public static final <T> x<T> g(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d U u3, @l3.d C c4, int i4) {
        B c5 = c(interfaceC2282i, i4);
        s a4 = z.a(i4, c5.f53476b, c5.f53477c);
        return new u(a4, d(u3, c5.f53478d, c5.f53475a, a4, c4, z.f54389a));
    }

    public static /* synthetic */ x h(InterfaceC2282i interfaceC2282i, U u3, C c4, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return C2284k.F1(interfaceC2282i, u3, c4, i4);
    }

    @l3.e
    public static final <T> Object i(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d U u3, @l3.d kotlin.coroutines.c<? super H<? extends T>> cVar) {
        B c4 = c(interfaceC2282i, 1);
        InterfaceC2350z c5 = kotlinx.coroutines.B.c(null, 1, null);
        e(u3, c4.f53478d, c4.f53475a, c5);
        return c5.c0(cVar);
    }

    @l3.d
    public static final <T> H<T> j(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d U u3, @l3.d C c4, T t3) {
        B c5 = c(interfaceC2282i, 1);
        t a4 = J.a(t3);
        return new v(a4, d(u3, c5.f53478d, c5.f53475a, a4, c4, t3));
    }
}
