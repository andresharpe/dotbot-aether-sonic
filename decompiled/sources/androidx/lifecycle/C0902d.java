package androidx.lifecycle;

import kotlin.H0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.L0;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902d<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final C0908j<T> f15581a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final X2.p<L<T>, kotlin.coroutines.c<? super H0>, Object> f15582b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15583c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.U f15584d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final X2.a<H0> f15585e;

    /* renamed from: f, reason: collision with root package name */
    @l3.e
    private L0 f15586f;

    /* renamed from: g, reason: collision with root package name */
    @l3.e
    private L0 f15587g;

    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.d$a */
    /* loaded from: classes.dex */
    static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15588I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ C0902d<T> f15589J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C0902d<T> c0902d, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f15589J = c0902d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f15588I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                long j4 = ((C0902d) this.f15589J).f15583c;
                this.f15588I = 1;
                if (C2269d0.b(j4, this) == l4) {
                    return l4;
                }
            }
            if (!((C0902d) this.f15589J).f15581a.h()) {
                L0 l02 = ((C0902d) this.f15589J).f15586f;
                if (l02 != null) {
                    L0.a.b(l02, null, 1, null);
                }
                ((C0902d) this.f15589J).f15586f = null;
            }
            return H0.f51801a;
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
            return new a(this.f15589J, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", i = {}, l = {com.harman.analytics.deviceAws.a.f37830m}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.d$b */
    /* loaded from: classes.dex */
    static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15590I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f15591J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ C0902d<T> f15592K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0902d<T> c0902d, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f15592K = c0902d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f15590I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                M m4 = new M(((C0902d) this.f15592K).f15581a, ((kotlinx.coroutines.U) this.f15591J).getCoroutineContext());
                X2.p pVar = ((C0902d) this.f15592K).f15582b;
                this.f15590I = 1;
                if (pVar.c0(m4, this) == l4) {
                    return l4;
                }
            }
            ((C0902d) this.f15592K).f15585e.n();
            return H0.f51801a;
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
            b bVar = new b(this.f15592K, cVar);
            bVar.f15591J = obj;
            return bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0902d(@l3.d C0908j<T> liveData, @l3.d X2.p<? super L<T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> block, long j4, @l3.d kotlinx.coroutines.U scope, @l3.d X2.a<H0> onDone) {
        kotlin.jvm.internal.F.p(liveData, "liveData");
        kotlin.jvm.internal.F.p(block, "block");
        kotlin.jvm.internal.F.p(scope, "scope");
        kotlin.jvm.internal.F.p(onDone, "onDone");
        this.f15581a = liveData;
        this.f15582b = block;
        this.f15583c = j4;
        this.f15584d = scope;
        this.f15585e = onDone;
    }

    @androidx.annotation.K
    public final void g() {
        L0 f4;
        if (this.f15587g == null) {
            f4 = C2323l.f(this.f15584d, C2322k0.e().o1(), null, new a(this, null), 2, null);
            this.f15587g = f4;
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    @androidx.annotation.K
    public final void h() {
        L0 f4;
        L0 l02 = this.f15587g;
        if (l02 != null) {
            L0.a.b(l02, null, 1, null);
        }
        this.f15587g = null;
        if (this.f15586f == null) {
            f4 = C2323l.f(this.f15584d, null, null, new b(this, null), 3, null);
            this.f15586f = f4;
        }
    }
}
