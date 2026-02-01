package androidx.lifecycle;

import java.time.Duration;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.C2322k0;

/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0909k {

    /* renamed from: a, reason: collision with root package name */
    public static final long f15658a = 5000;

    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.k$a */
    /* loaded from: classes.dex */
    static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super C0913o>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15659I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ N<T> f15660J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ LiveData<T> f15661K;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [T] */
        /* renamed from: androidx.lifecycle.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0137a<T> extends Lambda implements X2.l<T, H0> {

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ N<T> f15662F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0137a(N<T> n4) {
                super(1);
                this.f15662F = n4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X2.l
            public /* bridge */ /* synthetic */ H0 C(Object obj) {
                c(obj);
                return H0.f51801a;
            }

            public final void c(T t3) {
                this.f15662F.r(t3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(N<T> n4, LiveData<T> liveData, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f15660J = n4;
            this.f15661K = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15659I == 0) {
                kotlin.W.n(obj);
                N<T> n4 = this.f15660J;
                n4.s(this.f15661K, new b(new C0137a(n4)));
                return new C0913o(this.f15661K, this.f15660J);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super C0913o> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new a(this.f15660J, this.f15661K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.k$b */
    /* loaded from: classes.dex */
    public static final class b implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f15663a;

        b(X2.l function) {
            kotlin.jvm.internal.F.p(function, "function");
            this.f15663a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f15663a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return kotlin.jvm.internal.F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f15663a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    @l3.e
    public static final <T> Object a(@l3.d N<T> n4, @l3.d LiveData<T> liveData, @l3.d kotlin.coroutines.c<? super C0913o> cVar) {
        return C2319j.h(C2322k0.e().o1(), new a(n4, liveData, null), cVar);
    }

    @l3.d
    public static final <T> LiveData<T> b(@l3.d kotlin.coroutines.f context, long j4, @l3.d X2.p<? super L<T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> block) {
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(block, "block");
        return new C0908j(context, j4, block);
    }

    @l3.d
    @androidx.annotation.W(26)
    public static final <T> LiveData<T> c(@l3.d kotlin.coroutines.f context, @l3.d Duration timeout, @l3.d X2.p<? super L<T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> block) {
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(timeout, "timeout");
        kotlin.jvm.internal.F.p(block, "block");
        return new C0908j(context, C0901c.f15575a.a(timeout), block);
    }

    public static /* synthetic */ LiveData d(kotlin.coroutines.f fVar, long j4, X2.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        if ((i4 & 2) != 0) {
            j4 = f15658a;
        }
        return b(fVar, j4, pVar);
    }

    public static /* synthetic */ LiveData e(kotlin.coroutines.f fVar, Duration duration, X2.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        return c(fVar, duration, pVar);
    }
}
