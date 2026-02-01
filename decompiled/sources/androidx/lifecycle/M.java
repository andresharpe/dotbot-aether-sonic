package androidx.lifecycle;

import android.annotation.SuppressLint;
import kotlin.H0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.InterfaceC2328n0;

/* loaded from: classes.dex */
public final class M<T> implements L<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private C0908j<T> f15465a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.f f15466b;

    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15467I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ M<T> f15468J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ T f15469K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(M<T> m4, T t3, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f15468J = m4;
            this.f15469K = t3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f15467I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                C0908j<T> a4 = this.f15468J.a();
                this.f15467I = 1;
                if (a4.v(this) == l4) {
                    return l4;
                }
            }
            this.f15468J.a().r(this.f15469K);
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
            return new a(this.f15468J, this.f15469K, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super InterfaceC2328n0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15470I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ M<T> f15471J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ LiveData<T> f15472K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(M<T> m4, LiveData<T> liveData, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f15471J = m4;
            this.f15472K = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f15470I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                C0908j<T> a4 = this.f15471J.a();
                LiveData<T> liveData = this.f15472K;
                this.f15470I = 1;
                obj = a4.w(liveData, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super InterfaceC2328n0> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new b(this.f15471J, this.f15472K, cVar);
        }
    }

    public M(@l3.d C0908j<T> target, @l3.d kotlin.coroutines.f context) {
        kotlin.jvm.internal.F.p(target, "target");
        kotlin.jvm.internal.F.p(context, "context");
        this.f15465a = target;
        this.f15466b = context.A(C2322k0.e().o1());
    }

    @l3.d
    public final C0908j<T> a() {
        return this.f15465a;
    }

    public final void b(@l3.d C0908j<T> c0908j) {
        kotlin.jvm.internal.F.p(c0908j, "<set-?>");
        this.f15465a = c0908j;
    }

    @Override // androidx.lifecycle.L
    @l3.e
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object h4 = C2319j.h(this.f15466b, new a(this, t3, null), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (h4 == l4) {
            return h4;
        }
        return H0.f51801a;
    }

    @Override // androidx.lifecycle.L
    @l3.e
    public Object g(@l3.d LiveData<T> liveData, @l3.d kotlin.coroutines.c<? super InterfaceC2328n0> cVar) {
        return C2319j.h(this.f15466b, new b(this, liveData, null), cVar);
    }

    @Override // androidx.lifecycle.L
    @l3.e
    public T h() {
        return this.f15465a.f();
    }
}
