package kotlinx.coroutines.flow.internal;

import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;

/* loaded from: classes2.dex */
public final class n {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes2.dex */
    public static final class a<R> implements InterfaceC2282i<R> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.q f54245E;

        public a(X2.q qVar) {
            this.f54245E = qVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2282i
        @l3.e
        public Object a(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            Object l4;
            Object a4 = n.a(new b(this.f54245E, interfaceC2283j, null), cVar);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (a4 == l4) {
                return a4;
            }
            return H0.f51801a;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class b extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f54246I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f54247J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ X2.q<U, InterfaceC2283j<? super R>, kotlin.coroutines.c<? super H0>, Object> f54248K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j<R> f54249L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(X2.q<? super U, ? super InterfaceC2283j<? super R>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, InterfaceC2283j<? super R> interfaceC2283j, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f54248K = qVar;
            this.f54249L = interfaceC2283j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f54246I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                U u3 = (U) this.f54247J;
                X2.q<U, InterfaceC2283j<? super R>, kotlin.coroutines.c<? super H0>, Object> qVar = this.f54248K;
                Object obj2 = this.f54249L;
                this.f54246I = 1;
                if (qVar.z(u3, obj2, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            b bVar = new b(this.f54248K, this.f54249L, cVar);
            bVar.f54247J = obj;
            return bVar;
        }
    }

    @l3.e
    public static final <R> Object a(@InterfaceC2084c @l3.d X2.p<? super U, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        Object l4;
        m mVar = new m(cVar.e(), cVar);
        Object f4 = j3.b.f(mVar, mVar, pVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (f4 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return f4;
    }

    @l3.d
    public static final <R> InterfaceC2282i<R> b(@InterfaceC2084c @l3.d X2.q<? super U, ? super InterfaceC2283j<? super R>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        return new a(qVar);
    }
}
