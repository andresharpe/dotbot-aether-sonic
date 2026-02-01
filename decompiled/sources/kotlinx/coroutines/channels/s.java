package kotlinx.coroutines.channels;

import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.Result;
import kotlin.V;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2321k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.q;

/* loaded from: classes2.dex */
final /* synthetic */ class s {

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f53136I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ J<E> f53137J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ E f53138K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(J<? super E> j4, E e4, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f53137J = j4;
            this.f53138K = e4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f53136I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                J<E> j4 = this.f53137J;
                E e4 = this.f53138K;
                this.f53136I = 1;
                if (j4.U(e4, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new a(this.f53137J, this.f53138K, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class b extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super q<? extends H0>>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f53139I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f53140J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ J<E> f53141K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ E f53142L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(J<? super E> j4, E e4, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f53141K = j4;
            this.f53142L = e4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Object b4;
            Object a4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f53139I;
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    J<E> j4 = this.f53141K;
                    E e4 = this.f53142L;
                    Result.a aVar = Result.f51807F;
                    this.f53139I = 1;
                    if (j4.U(e4, this) == l4) {
                        return l4;
                    }
                }
                b4 = Result.b(H0.f51801a);
            } catch (Throwable th) {
                Result.a aVar2 = Result.f51807F;
                b4 = Result.b(W.a(th));
            }
            if (Result.j(b4)) {
                a4 = q.f53131b.c(H0.f51801a);
            } else {
                a4 = q.f53131b.a(Result.e(b4));
            }
            return q.b(a4);
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super q<H0>> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            b bVar = new b(this.f53141K, this.f53142L, cVar);
            bVar.f53140J = obj;
            return bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @V(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void a(@l3.d J<? super E> j4, E e4) {
        if (!q.m(j4.S(e4))) {
            C2321k.b(null, new a(j4, e4, null), 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <E> Object b(@l3.d J<? super E> j4, E e4) {
        Object b4;
        Object S3 = j4.S(e4);
        if (S3 instanceof q.c) {
            b4 = C2321k.b(null, new b(j4, e4, null), 1, null);
            return ((q) b4).o();
        }
        return q.f53131b.c(H0.f51801a);
    }
}
