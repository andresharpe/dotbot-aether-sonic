package kotlinx.coroutines.flow;

import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.U;

/* loaded from: classes2.dex */
public final /* synthetic */ class FlowKt__CollectKt {

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        int f53560I;

        /* renamed from: J */
        final /* synthetic */ InterfaceC2282i<T> f53561J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC2282i<? extends T> interfaceC2282i, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f53561J = interfaceC2282i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f53560I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                InterfaceC2282i<T> interfaceC2282i = this.f53561J;
                this.f53560I = 1;
                if (C2284k.y(interfaceC2282i, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new a(this.f53561J, cVar);
        }
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object a(InterfaceC2282i<? extends T> interfaceC2282i, X2.p<? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object a4 = interfaceC2282i.a(new FlowKt__CollectKt$collect$3(pVar), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    @l3.e
    public static final Object b(@l3.d InterfaceC2282i<?> interfaceC2282i, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object a4 = interfaceC2282i.a(kotlinx.coroutines.flow.internal.r.f54252E, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    private static final /* synthetic */ <T> Object c(InterfaceC2282i<? extends T> interfaceC2282i, X2.p<? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, kotlin.coroutines.c<? super H0> cVar) {
        FlowKt__CollectKt$collect$3 flowKt__CollectKt$collect$3 = new FlowKt__CollectKt$collect$3(pVar);
        kotlin.jvm.internal.C.e(0);
        interfaceC2282i.a(flowKt__CollectKt$collect$3, cVar);
        kotlin.jvm.internal.C.e(1);
        return H0.f51801a;
    }

    @l3.e
    public static final <T> Object d(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.q<? super Integer, ? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object a4 = interfaceC2282i.a(new FlowKt__CollectKt$collectIndexed$2(qVar), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    private static final <T> Object e(InterfaceC2282i<? extends T> interfaceC2282i, X2.q<? super Integer, ? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, kotlin.coroutines.c<? super H0> cVar) {
        FlowKt__CollectKt$collectIndexed$2 flowKt__CollectKt$collectIndexed$2 = new FlowKt__CollectKt$collectIndexed$2(qVar);
        kotlin.jvm.internal.C.e(0);
        interfaceC2282i.a(flowKt__CollectKt$collectIndexed$2, cVar);
        kotlin.jvm.internal.C.e(1);
        return H0.f51801a;
    }

    @l3.e
    public static final <T> Object f(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        InterfaceC2282i d4;
        Object l4;
        d4 = C2287n.d(C2284k.W0(interfaceC2282i, pVar), 0, null, 2, null);
        Object y3 = C2284k.y(d4, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (y3 == l4) {
            return y3;
        }
        return H0.f51801a;
    }

    @l3.e
    public static final <T> Object g(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        C2284k.o0(interfaceC2283j);
        Object a4 = interfaceC2282i.a(interfaceC2283j, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    @l3.d
    public static final <T> L0 h(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d U u3) {
        L0 f4;
        f4 = C2323l.f(u3, null, null, new a(interfaceC2282i, null), 3, null);
        return f4;
    }
}
