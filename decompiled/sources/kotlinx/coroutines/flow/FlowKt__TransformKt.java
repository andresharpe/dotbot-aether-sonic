package kotlinx.coroutines.flow;

import com.harman.jbl.partybox.ui.effectlab.a;
import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final /* synthetic */ class FlowKt__TransformKt {

    /* loaded from: classes2.dex */
    public static final class a<T> implements InterfaceC2283j {

        /* renamed from: E */
        final /* synthetic */ Ref.ObjectRef<R> f53908E;

        /* renamed from: F */
        final /* synthetic */ X2.q<R, T, kotlin.coroutines.c<? super R>, Object> f53909F;

        /* renamed from: G */
        final /* synthetic */ InterfaceC2283j<R> f53910G;

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {a.b.f43494d, 104}, m = "emit", n = {"this"}, s = {"L$0"})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$a$a */
        /* loaded from: classes2.dex */
        public static final class C0485a extends ContinuationImpl {

            /* renamed from: H */
            Object f53911H;

            /* renamed from: I */
            Object f53912I;

            /* renamed from: J */
            /* synthetic */ Object f53913J;

            /* renamed from: K */
            final /* synthetic */ a<T> f53914K;

            /* renamed from: L */
            int f53915L;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0485a(a<? super T> aVar, kotlin.coroutines.c<? super C0485a> cVar) {
                super(cVar);
                this.f53914K = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53913J = obj;
                this.f53915L |= Integer.MIN_VALUE;
                return this.f53914K.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ref.ObjectRef<R> objectRef, X2.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, InterfaceC2283j<? super R> interfaceC2283j) {
            this.f53908E = objectRef;
            this.f53909F = qVar;
            this.f53910G = interfaceC2283j;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r8, @l3.d kotlin.coroutines.c<? super kotlin.H0> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt.a.C0485a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__TransformKt$a$a r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt.a.C0485a) r0
                int r1 = r0.f53915L
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53915L = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$a$a r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$a$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f53913J
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53915L
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.W.n(r9)
                goto L70
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.f53912I
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                java.lang.Object r2 = r0.f53911H
                kotlinx.coroutines.flow.FlowKt__TransformKt$a r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt.a) r2
                kotlin.W.n(r9)
                goto L5a
            L40:
                kotlin.W.n(r9)
                kotlin.jvm.internal.Ref$ObjectRef<R> r9 = r7.f53908E
                X2.q<R, T, kotlin.coroutines.c<? super R>, java.lang.Object> r2 = r7.f53909F
                T r5 = r9.f52301E
                r0.f53911H = r7
                r0.f53912I = r9
                r0.f53915L = r4
                java.lang.Object r8 = r2.z(r5, r8, r0)
                if (r8 != r1) goto L56
                return r1
            L56:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L5a:
                r8.f52301E = r9
                kotlinx.coroutines.flow.j<R> r8 = r2.f53910G
                kotlin.jvm.internal.Ref$ObjectRef<R> r9 = r2.f53908E
                T r9 = r9.f52301E
                r2 = 0
                r0.f53911H = r2
                r0.f53912I = r2
                r0.f53915L = r3
                java.lang.Object r8 = r8.f(r9, r0)
                if (r8 != r1) goto L70
                return r1
            L70:
                kotlin.H0 r8 = kotlin.H0.f51801a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt.a.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements InterfaceC2282i<T> {

        /* renamed from: E */
        final /* synthetic */ InterfaceC2282i f53916E;

        /* renamed from: F */
        final /* synthetic */ X2.q f53917F;

        public b(InterfaceC2282i interfaceC2282i, X2.q qVar) {
            this.f53916E = interfaceC2282i;
            this.f53917F = qVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2282i
        @l3.e
        public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            Object l4;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f52301E = (T) kotlinx.coroutines.flow.internal.s.f54253a;
            Object a4 = this.f53916E.a(new c(objectRef, this.f53917F, interfaceC2283j), cVar);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (a4 == l4) {
                return a4;
            }
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c<T> implements InterfaceC2283j {

        /* renamed from: E */
        final /* synthetic */ Ref.ObjectRef<Object> f53918E;

        /* renamed from: F */
        final /* synthetic */ X2.q<T, T, kotlin.coroutines.c<? super T>, Object> f53919F;

        /* renamed from: G */
        final /* synthetic */ InterfaceC2283j<T> f53920G;

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {125, kotlinx.coroutines.scheduling.q.f54649c}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: H */
            Object f53921H;

            /* renamed from: I */
            Object f53922I;

            /* renamed from: J */
            /* synthetic */ Object f53923J;

            /* renamed from: K */
            final /* synthetic */ c<T> f53924K;

            /* renamed from: L */
            int f53925L;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, kotlin.coroutines.c<? super a> cVar2) {
                super(cVar2);
                this.f53924K = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53923J = obj;
                this.f53925L |= Integer.MIN_VALUE;
                return this.f53924K.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(Ref.ObjectRef<Object> objectRef, X2.q<? super T, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> qVar, InterfaceC2283j<? super T> interfaceC2283j) {
            this.f53918E = objectRef;
            this.f53919F = qVar;
            this.f53920G = interfaceC2283j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r8, @l3.d kotlin.coroutines.c<? super kotlin.H0> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt.c.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__TransformKt$c$a r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt.c.a) r0
                int r1 = r0.f53925L
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53925L = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$c$a r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$c$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f53923J
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53925L
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.W.n(r9)
                goto L79
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.f53922I
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                java.lang.Object r2 = r0.f53921H
                kotlinx.coroutines.flow.FlowKt__TransformKt$c r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt.c) r2
                kotlin.W.n(r9)
                goto L60
            L40:
                kotlin.W.n(r9)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r7.f53918E
                T r2 = r9.f52301E
                kotlinx.coroutines.internal.S r5 = kotlinx.coroutines.flow.internal.s.f54253a
                if (r2 != r5) goto L4d
                r2 = r7
                goto L63
            L4d:
                X2.q<T, T, kotlin.coroutines.c<? super T>, java.lang.Object> r5 = r7.f53919F
                r0.f53921H = r7
                r0.f53922I = r9
                r0.f53925L = r4
                java.lang.Object r8 = r5.z(r2, r8, r0)
                if (r8 != r1) goto L5c
                return r1
            L5c:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L60:
                r6 = r9
                r9 = r8
                r8 = r6
            L63:
                r9.f52301E = r8
                kotlinx.coroutines.flow.j<T> r8 = r2.f53920G
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r2.f53918E
                T r9 = r9.f52301E
                r2 = 0
                r0.f53921H = r2
                r0.f53922I = r2
                r0.f53925L = r3
                java.lang.Object r8 = r8.f(r9, r0)
                if (r8 != r1) goto L79
                return r1
            L79:
                kotlin.H0 r8 = kotlin.H0.f51801a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt.c.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d<T> implements InterfaceC2282i<kotlin.collections.M<? extends T>> {

        /* renamed from: E */
        final /* synthetic */ InterfaceC2282i f53926E;

        public d(InterfaceC2282i interfaceC2282i) {
            this.f53926E = interfaceC2282i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2282i
        @l3.e
        public Object a(@l3.d InterfaceC2283j<? super kotlin.collections.M<? extends T>> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            Object l4;
            Object a4 = this.f53926E.a(new e(interfaceC2283j, new Ref.IntRef()), cVar);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (a4 == l4) {
                return a4;
            }
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e<T> implements InterfaceC2283j {

        /* renamed from: E */
        final /* synthetic */ InterfaceC2283j<kotlin.collections.M<? extends T>> f53927E;

        /* renamed from: F */
        final /* synthetic */ Ref.IntRef f53928F;

        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {65}, m = "emit", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: H */
            /* synthetic */ Object f53929H;

            /* renamed from: I */
            final /* synthetic */ e<T> f53930I;

            /* renamed from: J */
            int f53931J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(e<? super T> eVar, kotlin.coroutines.c<? super a> cVar) {
                super(cVar);
                this.f53930I = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53929H = obj;
                this.f53931J |= Integer.MIN_VALUE;
                return this.f53930I.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(InterfaceC2283j<? super kotlin.collections.M<? extends T>> interfaceC2283j, Ref.IntRef intRef) {
            this.f53927E = interfaceC2283j;
            this.f53928F = intRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
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
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt.e.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__TransformKt$e$a r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt.e.a) r0
                int r1 = r0.f53931J
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53931J = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$e$a r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$e$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f53929H
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53931J
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.W.n(r9)
                goto L4e
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                kotlin.W.n(r9)
                kotlinx.coroutines.flow.j<kotlin.collections.M<? extends T>> r9 = r7.f53927E
                kotlin.collections.M r2 = new kotlin.collections.M
                kotlin.jvm.internal.Ref$IntRef r4 = r7.f53928F
                int r5 = r4.f52299E
                int r6 = r5 + 1
                r4.f52299E = r6
                if (r5 < 0) goto L51
                r2.<init>(r5, r8)
                r0.f53931J = r3
                java.lang.Object r8 = r9.f(r2, r0)
                if (r8 != r1) goto L4e
                return r1
            L4e:
                kotlin.H0 r8 = kotlin.H0.f51801a
                return r8
            L51:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt.e.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> a(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(interfaceC2282i, pVar);
    }

    public static final /* synthetic */ <R> InterfaceC2282i<R> b(InterfaceC2282i<?> interfaceC2282i) {
        kotlin.jvm.internal.F.w();
        return new FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(interfaceC2282i);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> c(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(interfaceC2282i, pVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> d(@l3.d final InterfaceC2282i<? extends T> interfaceC2282i) {
        return new InterfaceC2282i<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1

            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ InterfaceC2283j f53864E;

                @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f53865H;

                    /* renamed from: I, reason: collision with root package name */
                    int f53866I;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f53865H = obj;
                        this.f53866I |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.f(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2283j interfaceC2283j) {
                    this.f53864E = interfaceC2283j;
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
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f53866I
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f53866I = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f53865H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f53866I
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.W.n(r6)
                        goto L41
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.W.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f53864E
                        if (r5 == 0) goto L41
                        r0.f53866I = r3
                        java.lang.Object r5 = r6.f(r5, r0)
                        if (r5 != r1) goto L41
                        return r1
                    L41:
                        kotlin.H0 r5 = kotlin.H0.f51801a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2282i
            @l3.e
            public Object a(@l3.d InterfaceC2283j interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
                Object l4;
                Object a4 = InterfaceC2282i.this.a(new AnonymousClass2(interfaceC2283j), cVar);
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (a4 == l4) {
                    return a4;
                }
                return H0.f51801a;
            }
        };
    }

    @l3.d
    public static final <T, R> InterfaceC2282i<R> e(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$map$$inlined$unsafeTransform$1(interfaceC2282i, pVar);
    }

    @l3.d
    public static final <T, R> InterfaceC2282i<R> f(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(interfaceC2282i, pVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> g(@l3.d final InterfaceC2282i<? extends T> interfaceC2282i, @l3.d final X2.p<? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return new InterfaceC2282i<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ InterfaceC2283j f53892E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ X2.p f53893F;

                @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 224}, m = "emit", n = {"value", "$this$onEach_u24lambda_u2d7"}, s = {"L$0", "L$1"})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f53894H;

                    /* renamed from: I, reason: collision with root package name */
                    int f53895I;

                    /* renamed from: K, reason: collision with root package name */
                    Object f53897K;

                    /* renamed from: L, reason: collision with root package name */
                    Object f53898L;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f53894H = obj;
                        this.f53895I |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.f(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2283j interfaceC2283j, X2.p pVar) {
                    this.f53892E = interfaceC2283j;
                    this.f53893F = pVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.InterfaceC2283j
                @l3.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(T r6, @l3.d kotlin.coroutines.c<? super kotlin.H0> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f53895I
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f53895I = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f53894H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f53895I
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3e
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.W.n(r7)
                        goto L6a
                    L2c:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L34:
                        java.lang.Object r6 = r0.f53898L
                        kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC2283j) r6
                        java.lang.Object r2 = r0.f53897K
                        kotlin.W.n(r7)
                        goto L5c
                    L3e:
                        kotlin.W.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f53892E
                        X2.p r2 = r5.f53893F
                        r0.f53897K = r6
                        r0.f53898L = r7
                        r0.f53895I = r4
                        r4 = 6
                        kotlin.jvm.internal.C.e(r4)
                        java.lang.Object r2 = r2.c0(r6, r0)
                        r4 = 7
                        kotlin.jvm.internal.C.e(r4)
                        if (r2 != r1) goto L5a
                        return r1
                    L5a:
                        r2 = r6
                        r6 = r7
                    L5c:
                        r7 = 0
                        r0.f53897K = r7
                        r0.f53898L = r7
                        r0.f53895I = r3
                        java.lang.Object r6 = r6.f(r2, r0)
                        if (r6 != r1) goto L6a
                        return r1
                    L6a:
                        kotlin.H0 r6 = kotlin.H0.f51801a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2282i
            @l3.e
            public Object a(@l3.d InterfaceC2283j interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
                Object l4;
                Object a4 = InterfaceC2282i.this.a(new AnonymousClass2(interfaceC2283j, pVar), cVar);
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (a4 == l4) {
                    return a4;
                }
                return H0.f51801a;
            }
        };
    }

    @l3.d
    public static final <T, R> InterfaceC2282i<R> h(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, R r4, @InterfaceC2084c @l3.d X2.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(r4, interfaceC2282i, qVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> i(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.q<? super T, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> qVar) {
        return new b(interfaceC2282i, qVar);
    }

    @l3.d
    public static final <T, R> InterfaceC2282i<R> j(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, R r4, @InterfaceC2084c @l3.d X2.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return C2284k.y1(interfaceC2282i, r4, qVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<kotlin.collections.M<T>> k(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        return new d(interfaceC2282i);
    }
}
