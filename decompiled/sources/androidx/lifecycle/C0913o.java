package androidx.lifecycle;

import kotlin.H0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.InterfaceC2328n0;

/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913o implements InterfaceC2328n0 {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final LiveData<?> f15692E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final N<?> f15693F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f15694G;

    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.o$a */
    /* loaded from: classes.dex */
    static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15695I;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15695I == 0) {
                kotlin.W.n(obj);
                C0913o.this.c();
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new a(cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.EmittedSource$disposeNow$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.o$b */
    /* loaded from: classes.dex */
    static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15697I;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15697I == 0) {
                kotlin.W.n(obj);
                C0913o.this.c();
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new b(cVar);
        }
    }

    public C0913o(@l3.d LiveData<?> source, @l3.d N<?> mediator) {
        kotlin.jvm.internal.F.p(source, "source");
        kotlin.jvm.internal.F.p(mediator, "mediator");
        this.f15692E = source;
        this.f15693F = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.K
    public final void c() {
        if (!this.f15694G) {
            this.f15693F.t(this.f15692E);
            this.f15694G = true;
        }
    }

    @l3.e
    public final Object b(@l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object h4 = C2319j.h(C2322k0.e().o1(), new b(null), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (h4 == l4) {
            return h4;
        }
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.InterfaceC2328n0
    public void f() {
        C2323l.f(kotlinx.coroutines.V.a(C2322k0.e().o1()), null, null, new a(null), 3, null);
    }
}
