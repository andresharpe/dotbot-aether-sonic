package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.H0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.J;
import kotlinx.coroutines.flow.C2284k;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0915q {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
    /* renamed from: androidx.lifecycle.q$a */
    /* loaded from: classes.dex */
    public static final class a<T> extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<? super T>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15700I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f15701J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ Lifecycle f15702K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ Lifecycle.State f15703L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ InterfaceC2282i<T> f15704M;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.lifecycle.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0141a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f15705I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ InterfaceC2282i<T> f15706J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.D<T> f15707K;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.lifecycle.q$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0142a<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.D<T> f15708E;

                /* JADX WARN: Multi-variable type inference failed */
                C0142a(kotlinx.coroutines.channels.D<? super T> d4) {
                    this.f15708E = d4;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC2283j
                @l3.e
                public final Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
                    Object l4;
                    Object U3 = this.f15708E.U(t3, cVar);
                    l4 = kotlin.coroutines.intrinsics.b.l();
                    if (U3 == l4) {
                        return U3;
                    }
                    return H0.f51801a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0141a(InterfaceC2282i<? extends T> interfaceC2282i, kotlinx.coroutines.channels.D<? super T> d4, kotlin.coroutines.c<? super C0141a> cVar) {
                super(2, cVar);
                this.f15706J = interfaceC2282i;
                this.f15707K = d4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f15705I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kotlin.W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.W.n(obj);
                    InterfaceC2282i<T> interfaceC2282i = this.f15706J;
                    C0142a c0142a = new C0142a(this.f15707K);
                    this.f15705I = 1;
                    if (interfaceC2282i.a(c0142a, this) == l4) {
                        return l4;
                    }
                }
                return H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((C0141a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new C0141a(this.f15706J, this.f15707K, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Lifecycle lifecycle, Lifecycle.State state, InterfaceC2282i<? extends T> interfaceC2282i, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f15702K = lifecycle;
            this.f15703L = state;
            this.f15704M = interfaceC2282i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            kotlinx.coroutines.channels.D d4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f15700I;
            if (i4 != 0) {
                if (i4 == 1) {
                    d4 = (kotlinx.coroutines.channels.D) this.f15701J;
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                kotlinx.coroutines.channels.D d5 = (kotlinx.coroutines.channels.D) this.f15701J;
                Lifecycle lifecycle = this.f15702K;
                Lifecycle.State state = this.f15703L;
                C0141a c0141a = new C0141a(this.f15704M, d5, null);
                this.f15701J = d5;
                this.f15700I = 1;
                if (RepeatOnLifecycleKt.a(lifecycle, state, c0141a, this) == l4) {
                    return l4;
                }
                d4 = d5;
            }
            J.a.a(d4, null, 1, null);
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<? super T> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(this.f15702K, this.f15703L, this.f15704M, cVar);
            aVar.f15701J = obj;
            return aVar;
        }
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> a(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d Lifecycle lifecycle, @l3.d Lifecycle.State minActiveState) {
        kotlin.jvm.internal.F.p(interfaceC2282i, "<this>");
        kotlin.jvm.internal.F.p(lifecycle, "lifecycle");
        kotlin.jvm.internal.F.p(minActiveState, "minActiveState");
        return C2284k.s(new a(lifecycle, minActiveState, interfaceC2282i, null));
    }

    public static /* synthetic */ InterfaceC2282i b(InterfaceC2282i interfaceC2282i, Lifecycle lifecycle, Lifecycle.State state, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return a(interfaceC2282i, lifecycle, state);
    }
}
