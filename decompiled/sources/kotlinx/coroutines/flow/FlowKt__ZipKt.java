package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final /* synthetic */ class FlowKt__ZipKt {

    /* loaded from: classes2.dex */
    public static final class a<R> implements InterfaceC2282i<R> {

        /* renamed from: E */
        final /* synthetic */ InterfaceC2282i f54005E;

        /* renamed from: F */
        final /* synthetic */ InterfaceC2282i f54006F;

        /* renamed from: G */
        final /* synthetic */ X2.q f54007G;

        public a(InterfaceC2282i interfaceC2282i, InterfaceC2282i interfaceC2282i2, X2.q qVar) {
            this.f54005E = interfaceC2282i;
            this.f54006F = interfaceC2282i2;
            this.f54007G = qVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2282i
        @l3.e
        public Object a(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            Object l4;
            Object a4 = kotlinx.coroutines.flow.internal.k.a(interfaceC2283j, new InterfaceC2282i[]{this.f54005E, this.f54006F}, FlowKt__ZipKt.a(), new b(this.f54007G, null), cVar);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (a4 == l4) {
                return a4;
            }
            return H0.f51801a;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class b<R> extends SuspendLambda implements X2.q<InterfaceC2283j<? super R>, Object[], kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        int f54008I;

        /* renamed from: J */
        private /* synthetic */ Object f54009J;

        /* renamed from: K */
        /* synthetic */ Object f54010K;

        /* renamed from: L */
        final /* synthetic */ X2.q<T1, T2, kotlin.coroutines.c<? super R>, Object> f54011L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, kotlin.coroutines.c<? super b> cVar) {
            super(3, cVar);
            this.f54011L = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            InterfaceC2283j interfaceC2283j;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f54008I;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        W.n(obj);
                        return H0.f51801a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC2283j = (InterfaceC2283j) this.f54009J;
                W.n(obj);
            } else {
                W.n(obj);
                interfaceC2283j = (InterfaceC2283j) this.f54009J;
                Object[] objArr = (Object[]) this.f54010K;
                X2.q<T1, T2, kotlin.coroutines.c<? super R>, Object> qVar = this.f54011L;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f54009J = interfaceC2283j;
                this.f54008I = 1;
                obj = qVar.z(obj2, obj3, this);
                if (obj == l4) {
                    return l4;
                }
            }
            this.f54009J = null;
            this.f54008I = 2;
            if (interfaceC2283j.f(obj, this) == l4) {
                return l4;
            }
            return H0.f51801a;
        }

        @Override // X2.q
        @l3.e
        /* renamed from: R */
        public final Object z(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d Object[] objArr, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            b bVar = new b(this.f54011L, cVar);
            bVar.f54009J = interfaceC2283j;
            bVar.f54010K = objArr;
            return bVar.D(H0.f51801a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.a {

        /* renamed from: F */
        public static final c f54012F = new c();

        c() {
            super(0);
        }

        @Override // X2.a
        @l3.e
        /* renamed from: c */
        public final Void n() {
            return null;
        }
    }

    public static final /* synthetic */ X2.a a() {
        return r();
    }

    public static final /* synthetic */ <T, R> InterfaceC2282i<R> b(Iterable<? extends InterfaceC2282i<? extends T>> iterable, X2.p<? super T[], ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        List V5;
        V5 = kotlin.collections.D.V5(iterable);
        Object[] array = V5.toArray(new InterfaceC2282i[0]);
        if (array != null) {
            kotlin.jvm.internal.F.w();
            return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$3((InterfaceC2282i[]) array, pVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @l3.d
    public static final <T1, T2, R> InterfaceC2282i<R> c(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return C2284k.J0(interfaceC2282i, interfaceC2282i2, qVar);
    }

    @l3.d
    public static final <T1, T2, T3, R> InterfaceC2282i<R> d(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @InterfaceC2084c @l3.d final X2.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.c<? super R>, ? extends Object> rVar) {
        final InterfaceC2282i[] interfaceC2282iArr = {interfaceC2282i, interfaceC2282i2, interfaceC2282i3};
        return new InterfaceC2282i<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            @kotlin.E(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {androidx.exifinterface.media.a.f5, "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/H0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {1, 6, 0})
            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements X2.q<InterfaceC2283j<? super R>, Object[], kotlin.coroutines.c<? super H0>, Object> {

                /* renamed from: I, reason: collision with root package name */
                int f53934I;

                /* renamed from: J, reason: collision with root package name */
                private /* synthetic */ Object f53935J;

                /* renamed from: K, reason: collision with root package name */
                /* synthetic */ Object f53936K;

                /* renamed from: L, reason: collision with root package name */
                final /* synthetic */ X2.r f53937L;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.c cVar, X2.r rVar) {
                    super(3, cVar);
                    this.f53937L = rVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.e
                public final Object D(@l3.d Object obj) {
                    Object l4;
                    InterfaceC2283j interfaceC2283j;
                    l4 = kotlin.coroutines.intrinsics.b.l();
                    int i4 = this.f53934I;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                W.n(obj);
                                return H0.f51801a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC2283j = (InterfaceC2283j) this.f53935J;
                        W.n(obj);
                    } else {
                        W.n(obj);
                        interfaceC2283j = (InterfaceC2283j) this.f53935J;
                        Object[] objArr = (Object[]) this.f53936K;
                        X2.r rVar = this.f53937L;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        this.f53935J = interfaceC2283j;
                        this.f53934I = 1;
                        kotlin.jvm.internal.C.e(6);
                        obj = rVar.N(obj2, obj3, obj4, this);
                        kotlin.jvm.internal.C.e(7);
                        if (obj == l4) {
                            return l4;
                        }
                    }
                    this.f53935J = null;
                    this.f53934I = 2;
                    if (interfaceC2283j.f(obj, this) == l4) {
                        return l4;
                    }
                    return H0.f51801a;
                }

                @Override // X2.q
                @l3.e
                /* renamed from: R, reason: merged with bridge method [inline-methods] */
                public final Object z(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d Object[] objArr, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, this.f53937L);
                    anonymousClass2.f53935J = interfaceC2283j;
                    anonymousClass2.f53936K = objArr;
                    return anonymousClass2.D(H0.f51801a);
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2282i
            @l3.e
            public Object a(@l3.d InterfaceC2283j interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
                Object l4;
                Object a4 = kotlinx.coroutines.flow.internal.k.a(interfaceC2283j, interfaceC2282iArr, FlowKt__ZipKt.a(), new AnonymousClass2(null, rVar), cVar);
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (a4 == l4) {
                    return a4;
                }
                return H0.f51801a;
            }
        };
    }

    @l3.d
    public static final <T1, T2, T3, T4, R> InterfaceC2282i<R> e(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d InterfaceC2282i<? extends T4> interfaceC2282i4, @l3.d final X2.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.c<? super R>, ? extends Object> sVar) {
        final InterfaceC2282i[] interfaceC2282iArr = {interfaceC2282i, interfaceC2282i2, interfaceC2282i3, interfaceC2282i4};
        return new InterfaceC2282i<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            @kotlin.E(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {androidx.exifinterface.media.a.f5, "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/H0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {1, 6, 0})
            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements X2.q<InterfaceC2283j<? super R>, Object[], kotlin.coroutines.c<? super H0>, Object> {

                /* renamed from: I, reason: collision with root package name */
                int f53940I;

                /* renamed from: J, reason: collision with root package name */
                private /* synthetic */ Object f53941J;

                /* renamed from: K, reason: collision with root package name */
                /* synthetic */ Object f53942K;

                /* renamed from: L, reason: collision with root package name */
                final /* synthetic */ X2.s f53943L;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.c cVar, X2.s sVar) {
                    super(3, cVar);
                    this.f53943L = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.e
                public final Object D(@l3.d Object obj) {
                    Object l4;
                    InterfaceC2283j interfaceC2283j;
                    l4 = kotlin.coroutines.intrinsics.b.l();
                    int i4 = this.f53940I;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                W.n(obj);
                                return H0.f51801a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC2283j = (InterfaceC2283j) this.f53941J;
                        W.n(obj);
                    } else {
                        W.n(obj);
                        interfaceC2283j = (InterfaceC2283j) this.f53941J;
                        Object[] objArr = (Object[]) this.f53942K;
                        X2.s sVar = this.f53943L;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        this.f53941J = interfaceC2283j;
                        this.f53940I = 1;
                        kotlin.jvm.internal.C.e(6);
                        obj = sVar.f0(obj2, obj3, obj4, obj5, this);
                        kotlin.jvm.internal.C.e(7);
                        if (obj == l4) {
                            return l4;
                        }
                    }
                    this.f53941J = null;
                    this.f53940I = 2;
                    if (interfaceC2283j.f(obj, this) == l4) {
                        return l4;
                    }
                    return H0.f51801a;
                }

                @Override // X2.q
                @l3.e
                /* renamed from: R, reason: merged with bridge method [inline-methods] */
                public final Object z(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d Object[] objArr, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, this.f53943L);
                    anonymousClass2.f53941J = interfaceC2283j;
                    anonymousClass2.f53942K = objArr;
                    return anonymousClass2.D(H0.f51801a);
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2282i
            @l3.e
            public Object a(@l3.d InterfaceC2283j interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
                Object l4;
                Object a4 = kotlinx.coroutines.flow.internal.k.a(interfaceC2283j, interfaceC2282iArr, FlowKt__ZipKt.a(), new AnonymousClass2(null, sVar), cVar);
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (a4 == l4) {
                    return a4;
                }
                return H0.f51801a;
            }
        };
    }

    @l3.d
    public static final <T1, T2, T3, T4, T5, R> InterfaceC2282i<R> f(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d InterfaceC2282i<? extends T4> interfaceC2282i4, @l3.d InterfaceC2282i<? extends T5> interfaceC2282i5, @l3.d final X2.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.c<? super R>, ? extends Object> tVar) {
        final InterfaceC2282i[] interfaceC2282iArr = {interfaceC2282i, interfaceC2282i2, interfaceC2282i3, interfaceC2282i4, interfaceC2282i5};
        return new InterfaceC2282i<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3

            @kotlin.E(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {androidx.exifinterface.media.a.f5, "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/H0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {1, 6, 0})
            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements X2.q<InterfaceC2283j<? super R>, Object[], kotlin.coroutines.c<? super H0>, Object> {

                /* renamed from: I, reason: collision with root package name */
                int f53946I;

                /* renamed from: J, reason: collision with root package name */
                private /* synthetic */ Object f53947J;

                /* renamed from: K, reason: collision with root package name */
                /* synthetic */ Object f53948K;

                /* renamed from: L, reason: collision with root package name */
                final /* synthetic */ X2.t f53949L;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.c cVar, X2.t tVar) {
                    super(3, cVar);
                    this.f53949L = tVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.e
                public final Object D(@l3.d Object obj) {
                    Object l4;
                    InterfaceC2283j interfaceC2283j;
                    l4 = kotlin.coroutines.intrinsics.b.l();
                    int i4 = this.f53946I;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                W.n(obj);
                                return H0.f51801a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC2283j = (InterfaceC2283j) this.f53947J;
                        W.n(obj);
                    } else {
                        W.n(obj);
                        interfaceC2283j = (InterfaceC2283j) this.f53947J;
                        Object[] objArr = (Object[]) this.f53948K;
                        X2.t tVar = this.f53949L;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        Object obj6 = objArr[4];
                        this.f53947J = interfaceC2283j;
                        this.f53946I = 1;
                        kotlin.jvm.internal.C.e(6);
                        obj = tVar.Y(obj2, obj3, obj4, obj5, obj6, this);
                        kotlin.jvm.internal.C.e(7);
                        if (obj == l4) {
                            return l4;
                        }
                    }
                    this.f53947J = null;
                    this.f53946I = 2;
                    if (interfaceC2283j.f(obj, this) == l4) {
                        return l4;
                    }
                    return H0.f51801a;
                }

                @Override // X2.q
                @l3.e
                /* renamed from: R, reason: merged with bridge method [inline-methods] */
                public final Object z(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d Object[] objArr, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, this.f53949L);
                    anonymousClass2.f53947J = interfaceC2283j;
                    anonymousClass2.f53948K = objArr;
                    return anonymousClass2.D(H0.f51801a);
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2282i
            @l3.e
            public Object a(@l3.d InterfaceC2283j interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
                Object l4;
                Object a4 = kotlinx.coroutines.flow.internal.k.a(interfaceC2283j, interfaceC2282iArr, FlowKt__ZipKt.a(), new AnonymousClass2(null, tVar), cVar);
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (a4 == l4) {
                    return a4;
                }
                return H0.f51801a;
            }
        };
    }

    public static final /* synthetic */ <T, R> InterfaceC2282i<R> g(InterfaceC2282i<? extends T>[] interfaceC2282iArr, X2.p<? super T[], ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        kotlin.jvm.internal.F.w();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(interfaceC2282iArr, pVar);
    }

    public static final /* synthetic */ <T, R> InterfaceC2282i<R> h(Iterable<? extends InterfaceC2282i<? extends T>> iterable, @InterfaceC2084c X2.q<? super InterfaceC2283j<? super R>, ? super T[], ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        List V5;
        V5 = kotlin.collections.D.V5(iterable);
        Object[] array = V5.toArray(new InterfaceC2282i[0]);
        if (array != null) {
            kotlin.jvm.internal.F.w();
            return C2284k.I0(new FlowKt__ZipKt$combineTransform$7((InterfaceC2282i[]) array, qVar, null));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @l3.d
    public static final <T1, T2, R> InterfaceC2282i<R> i(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @InterfaceC2084c @l3.d X2.r<? super InterfaceC2283j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.c<? super H0>, ? extends Object> rVar) {
        return C2284k.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new InterfaceC2282i[]{interfaceC2282i, interfaceC2282i2}, null, rVar));
    }

    @l3.d
    public static final <T1, T2, T3, R> InterfaceC2282i<R> j(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @InterfaceC2084c @l3.d X2.s<? super InterfaceC2283j<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.c<? super H0>, ? extends Object> sVar) {
        return C2284k.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(new InterfaceC2282i[]{interfaceC2282i, interfaceC2282i2, interfaceC2282i3}, null, sVar));
    }

    @l3.d
    public static final <T1, T2, T3, T4, R> InterfaceC2282i<R> k(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d InterfaceC2282i<? extends T4> interfaceC2282i4, @InterfaceC2084c @l3.d X2.t<? super InterfaceC2283j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.c<? super H0>, ? extends Object> tVar) {
        return C2284k.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(new InterfaceC2282i[]{interfaceC2282i, interfaceC2282i2, interfaceC2282i3, interfaceC2282i4}, null, tVar));
    }

    @l3.d
    public static final <T1, T2, T3, T4, T5, R> InterfaceC2282i<R> l(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d InterfaceC2282i<? extends T4> interfaceC2282i4, @l3.d InterfaceC2282i<? extends T5> interfaceC2282i5, @InterfaceC2084c @l3.d X2.u<? super InterfaceC2283j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.c<? super H0>, ? extends Object> uVar) {
        return C2284k.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(new InterfaceC2282i[]{interfaceC2282i, interfaceC2282i2, interfaceC2282i3, interfaceC2282i4, interfaceC2282i5}, null, uVar));
    }

    public static final /* synthetic */ <T, R> InterfaceC2282i<R> m(InterfaceC2282i<? extends T>[] interfaceC2282iArr, @InterfaceC2084c X2.q<? super InterfaceC2283j<? super R>, ? super T[], ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        kotlin.jvm.internal.F.w();
        return C2284k.I0(new FlowKt__ZipKt$combineTransform$6(interfaceC2282iArr, qVar, null));
    }

    private static final /* synthetic */ <T, R> InterfaceC2282i<R> n(InterfaceC2282i<? extends T>[] interfaceC2282iArr, @InterfaceC2084c X2.q<? super InterfaceC2283j<? super R>, ? super T[], ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        kotlin.jvm.internal.F.w();
        return C2284k.I0(new FlowKt__ZipKt$combineTransformUnsafe$1(interfaceC2282iArr, qVar, null));
    }

    private static final /* synthetic */ <T, R> InterfaceC2282i<R> o(InterfaceC2282i<? extends T>[] interfaceC2282iArr, X2.p<? super T[], ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        kotlin.jvm.internal.F.w();
        return new FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1(interfaceC2282iArr, pVar);
    }

    @l3.d
    @W2.i(name = "flowCombine")
    public static final <T1, T2, R> InterfaceC2282i<R> p(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return new a(interfaceC2282i, interfaceC2282i2, qVar);
    }

    @l3.d
    @W2.i(name = "flowCombineTransform")
    public static final <T1, T2, R> InterfaceC2282i<R> q(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @InterfaceC2084c @l3.d X2.r<? super InterfaceC2283j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.c<? super H0>, ? extends Object> rVar) {
        return C2284k.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new InterfaceC2282i[]{interfaceC2282i, interfaceC2282i2}, null, rVar));
    }

    private static final <T> X2.a<T[]> r() {
        return c.f54012F;
    }

    @l3.d
    public static final <T1, T2, R> InterfaceC2282i<R> s(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return kotlinx.coroutines.flow.internal.k.b(interfaceC2282i, interfaceC2282i2, qVar);
    }
}
