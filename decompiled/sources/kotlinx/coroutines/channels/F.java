package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlin.W;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.internal.Q;

/* loaded from: classes2.dex */
public interface F<E> {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: kotlinx.coroutines.channels.F$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0475a implements kotlinx.coroutines.selects.d<E> {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ F<E> f53032E;

            /* JADX INFO: Add missing generic type declarations: [R] */
            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", f = "Channel.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.channels.F$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            static final class C0476a<R> extends SuspendLambda implements X2.p<q<? extends E>, kotlin.coroutines.c<? super R>, Object> {

                /* renamed from: I, reason: collision with root package name */
                int f53033I;

                /* renamed from: J, reason: collision with root package name */
                /* synthetic */ Object f53034J;

                /* renamed from: K, reason: collision with root package name */
                final /* synthetic */ X2.p<E, kotlin.coroutines.c<? super R>, Object> f53035K;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0476a(X2.p<? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, kotlin.coroutines.c<? super C0476a> cVar) {
                    super(2, cVar);
                    this.f53035K = pVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.e
                public final Object D(@l3.d Object obj) {
                    Object l4;
                    l4 = kotlin.coroutines.intrinsics.b.l();
                    int i4 = this.f53033I;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            W.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        W.n(obj);
                        Object o4 = ((q) this.f53034J).o();
                        Throwable f4 = q.f(o4);
                        if (f4 == null) {
                            X2.p<E, kotlin.coroutines.c<? super R>, Object> pVar = this.f53035K;
                            Object h4 = q.h(o4);
                            this.f53033I = 1;
                            obj = pVar.c0(h4, this);
                            if (obj == l4) {
                                return l4;
                            }
                        } else {
                            throw f4;
                        }
                    }
                    return obj;
                }

                @l3.e
                public final Object R(@l3.d Object obj, @l3.e kotlin.coroutines.c<? super R> cVar) {
                    return ((C0476a) v(q.b(obj), cVar)).D(H0.f51801a);
                }

                @Override // X2.p
                public /* bridge */ /* synthetic */ Object c0(Object obj, Object obj2) {
                    return R(((q) obj).o(), (kotlin.coroutines.c) obj2);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.d
                public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                    C0476a c0476a = new C0476a(this.f53035K, cVar);
                    c0476a.f53034J = obj;
                    return c0476a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0475a(F<? extends E> f4) {
                this.f53032E = f4;
            }

            @Override // kotlinx.coroutines.selects.d
            @G0
            public <R> void X(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.d X2.p<? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
                this.f53032E.s().X(fVar, new C0476a(pVar, null));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {354}, m = "receiveOrNull", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class b<E> extends ContinuationImpl {

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f53036H;

            /* renamed from: I, reason: collision with root package name */
            int f53037I;

            b(kotlin.coroutines.c<? super b> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53036H = obj;
                this.f53037I |= Integer.MIN_VALUE;
                return a.i(null, this);
            }
        }

        public static /* synthetic */ void b(F f4, CancellationException cancellationException, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    cancellationException = null;
                }
                f4.f(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ boolean c(F f4, Throwable th, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    th = null;
                }
                return f4.d(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @l3.d
        public static <E> kotlinx.coroutines.selects.d<E> d(@l3.d F<? extends E> f4) {
            return new C0475a(f4);
        }

        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @V(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
        }

        @A0
        public static /* synthetic */ void f() {
        }

        @A0
        public static /* synthetic */ void g() {
        }

        @l3.e
        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @V(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E h(@l3.d F<? extends E> f4) {
            Object y3 = f4.y();
            if (q.m(y3)) {
                return (E) q.i(y3);
            }
            Throwable f5 = q.f(y3);
            if (f5 == null) {
                return null;
            }
            throw Q.p(f5);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @l3.e
        @kotlin.internal.h
        @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.V(expression = "receiveCatching().getOrNull()", imports = {}))
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static <E> java.lang.Object i(@l3.d kotlinx.coroutines.channels.F<? extends E> r4, @l3.d kotlin.coroutines.c<? super E> r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.F.a.b
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.F$a$b r0 = (kotlinx.coroutines.channels.F.a.b) r0
                int r1 = r0.f53037I
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53037I = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.F$a$b r0 = new kotlinx.coroutines.channels.F$a$b
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f53036H
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53037I
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                kotlin.W.n(r5)
                kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.q) r5
                java.lang.Object r4 = r5.o()
                goto L43
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                kotlin.W.n(r5)
                r0.f53037I = r3
                java.lang.Object r4 = r4.E(r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                java.lang.Object r4 = kotlinx.coroutines.channels.q.h(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.F.a.i(kotlinx.coroutines.channels.F, kotlin.coroutines.c):java.lang.Object");
        }
    }

    @l3.e
    @kotlin.internal.h
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @V(expression = "receiveCatching().getOrNull()", imports = {}))
    Object B(@l3.d kotlin.coroutines.c<? super E> cVar);

    @l3.e
    Object E(@l3.d kotlin.coroutines.c<? super q<? extends E>> cVar);

    @l3.e
    Object N(@l3.d kotlin.coroutines.c<? super E> cVar);

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean d(Throwable th);

    void f(@l3.e CancellationException cancellationException);

    boolean isEmpty();

    @l3.d
    o<E> iterator();

    boolean l();

    @l3.e
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @V(expression = "tryReceive().getOrNull()", imports = {}))
    E poll();

    @l3.d
    kotlinx.coroutines.selects.d<E> r();

    @l3.d
    kotlinx.coroutines.selects.d<q<E>> s();

    @l3.d
    kotlinx.coroutines.selects.d<E> w();

    @l3.d
    Object y();
}
