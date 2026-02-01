package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes2.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f52929a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f52930b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f52931c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f52932d = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a<T> extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super T>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f52933I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f52934J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ X2.a<T> f52935K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(X2.a<? extends T> aVar, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f52935K = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f52933I == 0) {
                kotlin.W.n(obj);
                return H0.d(((U) this.f52934J).getCoroutineContext(), this.f52935K);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super T> cVar) {
            return ((a) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(this.f52935K, cVar);
            aVar.f52934J = obj;
            return aVar;
        }
    }

    @l3.e
    public static final <T> Object b(@l3.d kotlin.coroutines.f fVar, @l3.d X2.a<? extends T> aVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return C2319j.h(fVar, new a(aVar, null), cVar);
    }

    public static /* synthetic */ Object c(kotlin.coroutines.f fVar, X2.a aVar, kotlin.coroutines.c cVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        return b(fVar, aVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(kotlin.coroutines.f fVar, X2.a<? extends T> aVar) {
        try {
            u1 u1Var = new u1(O0.B(fVar));
            u1Var.f();
            try {
                return aVar.n();
            } finally {
                u1Var.c();
            }
        } catch (InterruptedException e4) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e4);
        }
    }
}
