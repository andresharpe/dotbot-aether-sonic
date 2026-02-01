package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.H0;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.W0;

@kotlin.jvm.internal.U({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,206:1\n154#1,8:207\n154#1,8:215\n154#1,8:223\n154#1,8:231\n43#1,5:239\n154#1,8:244\n43#1,5:252\n154#1,8:257\n154#1,8:265\n154#1,8:273\n154#1,8:281\n314#2,11:289\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:207,8\n58#1:215,8\n71#1:223,8\n84#1:231,8\n98#1:239,5\n98#1:244,8\n98#1:252,5\n98#1:257,8\n111#1:265,8\n124#1:273,8\n137#1:281,8\n177#1:289,11\n*E\n"})
/* loaded from: classes.dex */
public final class WithLifecycleStateKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Lifecycle f15536E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f15537F;

        a(Lifecycle lifecycle, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            this.f15536E = lifecycle;
            this.f15537F = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f15536E.a(this.f15537F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends Lambda implements X2.l<Throwable, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.N f15538F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Lifecycle f15539G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f15540H;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ Lifecycle f15541E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f15542F;

            a(Lifecycle lifecycle, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
                this.f15541E = lifecycle;
                this.f15542F = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f15541E.d(this.f15542F);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlinx.coroutines.N n4, Lifecycle lifecycle, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            super(1);
            this.f15538F = n4;
            this.f15539G = lifecycle;
            this.f15540H = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.e Throwable th) {
            kotlinx.coroutines.N n4 = this.f15538F;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f52041E;
            if (n4.j1(emptyCoroutineContext)) {
                this.f15538F.h1(emptyCoroutineContext, new a(this.f15539G, this.f15540H));
            } else {
                this.f15539G.d(this.f15540H);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.D, androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    @l3.e
    @kotlin.U
    public static final <R> Object a(@l3.d final Lifecycle lifecycle, @l3.d final Lifecycle.State state, boolean z3, @l3.d kotlinx.coroutines.N n4, @l3.d final X2.a<? extends R> aVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        final kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(e4, 1);
        rVar.T();
        ?? r12 = new A() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.A
            public void f(@l3.d E source, @l3.d Lifecycle.Event event) {
                Object b4;
                kotlin.jvm.internal.F.p(source, "source");
                kotlin.jvm.internal.F.p(event, "event");
                if (event == Lifecycle.Event.Companion.d(Lifecycle.State.this)) {
                    lifecycle.d(this);
                    kotlin.coroutines.c cVar2 = rVar;
                    X2.a<R> aVar2 = aVar;
                    try {
                        Result.a aVar3 = Result.f51807F;
                        b4 = Result.b(aVar2.n());
                    } catch (Throwable th) {
                        Result.a aVar4 = Result.f51807F;
                        b4 = Result.b(kotlin.W.a(th));
                    }
                    cVar2.x(b4);
                    return;
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.d(this);
                    kotlin.coroutines.c cVar3 = rVar;
                    Result.a aVar5 = Result.f51807F;
                    cVar3.x(Result.b(kotlin.W.a(new LifecycleDestroyedException())));
                }
            }
        };
        if (z3) {
            n4.h1(EmptyCoroutineContext.f52041E, new a(lifecycle, r12));
        } else {
            lifecycle.a(r12);
        }
        rVar.u(new b(n4, lifecycle, r12));
        Object z4 = rVar.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z4 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z4;
    }

    @l3.e
    public static final <R> Object b(@l3.d Lifecycle lifecycle, @l3.d X2.a<? extends R> aVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        W0 o12 = C2322k0.e().o1();
        boolean j12 = o12.j1(cVar.e());
        if (!j12) {
            if (lifecycle.b() != Lifecycle.State.DESTROYED) {
                if (lifecycle.b().compareTo(state) >= 0) {
                    return aVar.n();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return a(lifecycle, state, j12, o12, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @l3.e
    public static final <R> Object c(@l3.d E e4, @l3.d X2.a<? extends R> aVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle lifecycle = e4.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        W0 o12 = C2322k0.e().o1();
        boolean j12 = o12.j1(cVar.e());
        if (!j12) {
            if (lifecycle.b() != Lifecycle.State.DESTROYED) {
                if (lifecycle.b().compareTo(state) >= 0) {
                    return aVar.n();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return a(lifecycle, state, j12, o12, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    private static final <R> Object d(Lifecycle lifecycle, X2.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        C2322k0.e().o1();
        kotlin.jvm.internal.C.e(3);
        throw null;
    }

    private static final <R> Object e(E e4, X2.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        e4.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C2322k0.e().o1();
        kotlin.jvm.internal.C.e(3);
        throw null;
    }

    @l3.e
    public static final <R> Object f(@l3.d Lifecycle lifecycle, @l3.d X2.a<? extends R> aVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        W0 o12 = C2322k0.e().o1();
        boolean j12 = o12.j1(cVar.e());
        if (!j12) {
            if (lifecycle.b() != Lifecycle.State.DESTROYED) {
                if (lifecycle.b().compareTo(state) >= 0) {
                    return aVar.n();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return a(lifecycle, state, j12, o12, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @l3.e
    public static final <R> Object g(@l3.d E e4, @l3.d X2.a<? extends R> aVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle lifecycle = e4.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        W0 o12 = C2322k0.e().o1();
        boolean j12 = o12.j1(cVar.e());
        if (!j12) {
            if (lifecycle.b() != Lifecycle.State.DESTROYED) {
                if (lifecycle.b().compareTo(state) >= 0) {
                    return aVar.n();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return a(lifecycle, state, j12, o12, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    private static final <R> Object h(Lifecycle lifecycle, X2.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C2322k0.e().o1();
        kotlin.jvm.internal.C.e(3);
        throw null;
    }

    private static final <R> Object i(E e4, X2.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        e4.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C2322k0.e().o1();
        kotlin.jvm.internal.C.e(3);
        throw null;
    }

    @l3.e
    public static final <R> Object j(@l3.d Lifecycle lifecycle, @l3.d X2.a<? extends R> aVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        W0 o12 = C2322k0.e().o1();
        boolean j12 = o12.j1(cVar.e());
        if (!j12) {
            if (lifecycle.b() != Lifecycle.State.DESTROYED) {
                if (lifecycle.b().compareTo(state) >= 0) {
                    return aVar.n();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return a(lifecycle, state, j12, o12, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @l3.e
    public static final <R> Object k(@l3.d E e4, @l3.d X2.a<? extends R> aVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle lifecycle = e4.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        W0 o12 = C2322k0.e().o1();
        boolean j12 = o12.j1(cVar.e());
        if (!j12) {
            if (lifecycle.b() != Lifecycle.State.DESTROYED) {
                if (lifecycle.b().compareTo(state) >= 0) {
                    return aVar.n();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return a(lifecycle, state, j12, o12, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    private static final <R> Object l(Lifecycle lifecycle, X2.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        C2322k0.e().o1();
        kotlin.jvm.internal.C.e(3);
        throw null;
    }

    private static final <R> Object m(E e4, X2.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        e4.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        C2322k0.e().o1();
        kotlin.jvm.internal.C.e(3);
        throw null;
    }

    @l3.e
    public static final <R> Object n(@l3.d Lifecycle lifecycle, @l3.d Lifecycle.State state, @l3.d X2.a<? extends R> aVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            W0 o12 = C2322k0.e().o1();
            boolean j12 = o12.j1(cVar.e());
            if (!j12) {
                if (lifecycle.b() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.b().compareTo(state) >= 0) {
                        return aVar.n();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return a(lifecycle, state, j12, o12, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    @l3.e
    public static final <R> Object o(@l3.d E e4, @l3.d Lifecycle.State state, @l3.d X2.a<? extends R> aVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        Lifecycle lifecycle = e4.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            W0 o12 = C2322k0.e().o1();
            boolean j12 = o12.j1(cVar.e());
            if (!j12) {
                if (lifecycle.b() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.b().compareTo(state) >= 0) {
                        return aVar.n();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return a(lifecycle, state, j12, o12, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    private static final <R> Object p(Lifecycle lifecycle, Lifecycle.State state, X2.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C2322k0.e().o1();
            kotlin.jvm.internal.C.e(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    private static final <R> Object q(E e4, Lifecycle.State state, X2.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        e4.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C2322k0.e().o1();
            kotlin.jvm.internal.C.e(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    @l3.e
    @kotlin.U
    public static final <R> Object r(@l3.d Lifecycle lifecycle, @l3.d Lifecycle.State state, @l3.d X2.a<? extends R> aVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        W0 o12 = C2322k0.e().o1();
        boolean j12 = o12.j1(cVar.e());
        if (!j12) {
            if (lifecycle.b() != Lifecycle.State.DESTROYED) {
                if (lifecycle.b().compareTo(state) >= 0) {
                    return aVar.n();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return a(lifecycle, state, j12, o12, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @kotlin.U
    private static final <R> Object s(Lifecycle lifecycle, Lifecycle.State state, X2.a<? extends R> aVar, kotlin.coroutines.c<? super R> cVar) {
        C2322k0.e().o1();
        kotlin.jvm.internal.C.e(3);
        throw null;
    }
}
