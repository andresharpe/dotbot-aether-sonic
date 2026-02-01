package androidx.lifecycle;

import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.L0;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0922y implements kotlinx.coroutines.U {

    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.y$a */
    /* loaded from: classes.dex */
    static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15736I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> f15738K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f15738K = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f15736I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                Lifecycle a4 = AbstractC0922y.this.a();
                X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> pVar = this.f15738K;
                this.f15736I = 1;
                if (U.a(a4, pVar, this) == l4) {
                    return l4;
                }
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
            return new a(this.f15738K, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.y$b */
    /* loaded from: classes.dex */
    static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15739I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> f15741K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f15741K = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f15739I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                Lifecycle a4 = AbstractC0922y.this.a();
                X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> pVar = this.f15741K;
                this.f15739I = 1;
                if (U.c(a4, pVar, this) == l4) {
                    return l4;
                }
            }
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
            return new b(this.f15741K, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", i = {}, l = {356}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.y$c */
    /* loaded from: classes.dex */
    static final class c extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15742I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> f15744K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f15744K = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f15742I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                Lifecycle a4 = AbstractC0922y.this.a();
                X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> pVar = this.f15744K;
                this.f15742I = 1;
                if (U.e(a4, pVar, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((c) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(this.f15744K, cVar);
        }
    }

    @l3.d
    public abstract Lifecycle a();

    @l3.d
    @InterfaceC2205l(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    public final L0 d(@l3.d X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super H0>, ? extends Object> block) {
        kotlin.jvm.internal.F.p(block, "block");
        return C2319j.e(this, null, null, new a(block, null), 3, null);
    }

    @l3.d
    @InterfaceC2205l(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    public final L0 e(@l3.d X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super H0>, ? extends Object> block) {
        kotlin.jvm.internal.F.p(block, "block");
        return C2319j.e(this, null, null, new b(block, null), 3, null);
    }

    @l3.d
    @InterfaceC2205l(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    public final L0 g(@l3.d X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super H0>, ? extends Object> block) {
        kotlin.jvm.internal.F.p(block, "block");
        return C2319j.e(this, null, null, new c(block, null), 3, null);
    }
}
