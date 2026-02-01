package kotlinx.coroutines.flow.internal;

import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class SafeCollector_commonKt$unsafeFlow$1<T> implements InterfaceC2282i<T> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ X2.p<InterfaceC2283j<? super T>, kotlin.coroutines.c<? super H0>, Object> f54123E;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector_commonKt$unsafeFlow$1(X2.p<? super InterfaceC2283j<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        this.f54123E = pVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object c02 = this.f54123E.c0(interfaceC2283j, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (c02 == l4) {
            return c02;
        }
        return H0.f51801a;
    }

    @l3.e
    public Object d(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d final kotlin.coroutines.c<? super H0> cVar) {
        C.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f54124H;

            /* renamed from: J, reason: collision with root package name */
            int f54126J;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f54124H = obj;
                this.f54126J |= Integer.MIN_VALUE;
                return SafeCollector_commonKt$unsafeFlow$1.this.a(null, this);
            }
        };
        C.e(5);
        this.f54123E.c0(interfaceC2283j, cVar);
        return H0.f51801a;
    }
}
