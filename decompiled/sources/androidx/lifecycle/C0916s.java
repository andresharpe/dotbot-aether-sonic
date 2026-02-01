package androidx.lifecycle;

import androidx.lifecycle.C0916s;
import com.harman.jbl.partybox.utils.LiveEvent;
import java.time.Duration;
import kotlin.H0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C0;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.W0;
import kotlinx.coroutines.flow.C2284k;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;

@W2.i(name = "FlowLiveDataConversions")
/* renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0916s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 0}, l = {com.harman.analytics.deviceAws.a.f37826i, 114}, m = "invokeSuspend", n = {"$this$callbackFlow", "observer"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.lifecycle.s$a */
    /* loaded from: classes.dex */
    static final class a<T> extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<? super T>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f15710I;

        /* renamed from: J, reason: collision with root package name */
        int f15711J;

        /* renamed from: K, reason: collision with root package name */
        private /* synthetic */ Object f15712K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ LiveData<T> f15713L;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.lifecycle.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0143a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f15714I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ LiveData<T> f15715J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ Q<T> f15716K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0143a(LiveData<T> liveData, Q<T> q4, kotlin.coroutines.c<? super C0143a> cVar) {
                super(2, cVar);
                this.f15715J = liveData;
                this.f15716K = q4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f15714I == 0) {
                    kotlin.W.n(obj);
                    this.f15715J.l(this.f15716K);
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((C0143a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new C0143a(this.f15715J, this.f15716K, cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.lifecycle.s$a$b */
        /* loaded from: classes.dex */
        public static final class b extends Lambda implements X2.a<H0> {

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ LiveData<T> f15717F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Q<T> f15718G;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.lifecycle.s$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0144a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

                /* renamed from: I, reason: collision with root package name */
                int f15719I;

                /* renamed from: J, reason: collision with root package name */
                final /* synthetic */ LiveData<T> f15720J;

                /* renamed from: K, reason: collision with root package name */
                final /* synthetic */ Q<T> f15721K;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0144a(LiveData<T> liveData, Q<T> q4, kotlin.coroutines.c<? super C0144a> cVar) {
                    super(2, cVar);
                    this.f15720J = liveData;
                    this.f15721K = q4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.e
                public final Object D(@l3.d Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f15719I == 0) {
                        kotlin.W.n(obj);
                        this.f15720J.p(this.f15721K);
                        return H0.f51801a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // X2.p
                @l3.e
                /* renamed from: R, reason: merged with bridge method [inline-methods] */
                public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                    return ((C0144a) v(u3, cVar)).D(H0.f51801a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.d
                public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                    return new C0144a(this.f15720J, this.f15721K, cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(LiveData<T> liveData, Q<T> q4) {
                super(0);
                this.f15717F = liveData;
                this.f15718G = q4;
            }

            public final void c() {
                C2323l.f(C0.f52916E, C2322k0.e().o1(), null, new C0144a(this.f15717F, this.f15718G, null), 2, null);
            }

            @Override // X2.a
            public /* bridge */ /* synthetic */ H0 n() {
                c();
                return H0.f51801a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LiveData<T> liveData, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f15713L = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b0(kotlinx.coroutines.channels.D d4, Object obj) {
            d4.S(obj);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Q q4;
            kotlinx.coroutines.channels.D d4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f15711J;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        kotlin.W.n(obj);
                        return H0.f51801a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q4 = (Q) this.f15710I;
                d4 = (kotlinx.coroutines.channels.D) this.f15712K;
                kotlin.W.n(obj);
            } else {
                kotlin.W.n(obj);
                final kotlinx.coroutines.channels.D d5 = (kotlinx.coroutines.channels.D) this.f15712K;
                q4 = new Q() { // from class: androidx.lifecycle.r
                    @Override // androidx.lifecycle.Q
                    public final void f(Object obj2) {
                        C0916s.a.b0(kotlinx.coroutines.channels.D.this, obj2);
                    }
                };
                W0 o12 = C2322k0.e().o1();
                C0143a c0143a = new C0143a(this.f15713L, q4, null);
                this.f15712K = d5;
                this.f15710I = q4;
                this.f15711J = 1;
                if (C2319j.h(o12, c0143a, this) == l4) {
                    return l4;
                }
                d4 = d5;
            }
            b bVar = new b(this.f15713L, q4);
            this.f15712K = null;
            this.f15710I = null;
            this.f15711J = 2;
            if (kotlinx.coroutines.channels.B.a(d4, bVar, this) == l4) {
                return l4;
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<? super T> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(this.f15713L, cVar);
            aVar.f15712K = obj;
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.s$b */
    /* loaded from: classes.dex */
    public static final class b<T> extends SuspendLambda implements X2.p<L<T>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15722I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f15723J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ InterfaceC2282i<T> f15724K;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.lifecycle.s$b$a */
        /* loaded from: classes.dex */
        public static final class a<T> implements InterfaceC2283j {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ L<T> f15725E;

            a(L<T> l4) {
                this.f15725E = l4;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2283j
            @l3.e
            public final Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
                Object l4;
                Object f4 = this.f15725E.f(t3, cVar);
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (f4 == l4) {
                    return f4;
                }
                return H0.f51801a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC2282i<? extends T> interfaceC2282i, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f15724K = interfaceC2282i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f15722I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                L l5 = (L) this.f15723J;
                InterfaceC2282i<T> interfaceC2282i = this.f15724K;
                a aVar = new a(l5);
                this.f15722I = 1;
                if (interfaceC2282i.a(aVar, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d L<T> l4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(l4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            b bVar = new b(this.f15724K, cVar);
            bVar.f15723J = obj;
            return bVar;
        }
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> a(@l3.d LiveData<T> liveData) {
        kotlin.jvm.internal.F.p(liveData, "<this>");
        return C2284k.W(C2284k.s(new a(liveData, null)));
    }

    @W2.j
    @l3.d
    public static final <T> LiveData<T> b(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        kotlin.jvm.internal.F.p(interfaceC2282i, "<this>");
        return f(interfaceC2282i, null, 0L, 3, null);
    }

    @W2.j
    @l3.d
    public static final <T> LiveData<T> c(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.f context) {
        kotlin.jvm.internal.F.p(interfaceC2282i, "<this>");
        kotlin.jvm.internal.F.p(context, "context");
        return f(interfaceC2282i, context, 0L, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @W2.j
    @l3.d
    public static final <T> LiveData<T> d(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.f context, long j4) {
        kotlin.jvm.internal.F.p(interfaceC2282i, "<this>");
        kotlin.jvm.internal.F.p(context, "context");
        LiveEvent liveEvent = (LiveData<T>) C0909k.b(context, j4, new b(interfaceC2282i, null));
        if (interfaceC2282i instanceof kotlinx.coroutines.flow.H) {
            if (androidx.arch.core.executor.c.h().c()) {
                liveEvent.r(((kotlinx.coroutines.flow.H) interfaceC2282i).getValue());
            } else {
                liveEvent.o(((kotlinx.coroutines.flow.H) interfaceC2282i).getValue());
            }
        }
        return liveEvent;
    }

    @l3.d
    @androidx.annotation.W(26)
    public static final <T> LiveData<T> e(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.f context, @l3.d Duration timeout) {
        kotlin.jvm.internal.F.p(interfaceC2282i, "<this>");
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(timeout, "timeout");
        return d(interfaceC2282i, context, C0901c.f15575a.a(timeout));
    }

    public static /* synthetic */ LiveData f(InterfaceC2282i interfaceC2282i, kotlin.coroutines.f fVar, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        if ((i4 & 2) != 0) {
            j4 = C0909k.f15658a;
        }
        return d(interfaceC2282i, fVar, j4);
    }

    public static /* synthetic */ LiveData g(InterfaceC2282i interfaceC2282i, kotlin.coroutines.f fVar, Duration duration, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        return e(interfaceC2282i, fVar, duration);
    }
}
