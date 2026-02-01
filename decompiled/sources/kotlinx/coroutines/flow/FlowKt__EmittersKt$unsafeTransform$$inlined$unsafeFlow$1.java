package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
public final class FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1<R> implements InterfaceC2282i<R> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i f53594E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ X2.q f53595F;

    public FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(InterfaceC2282i interfaceC2282i, X2.q qVar) {
        this.f53594E = interfaceC2282i;
        this.f53595F = qVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object a4 = this.f53594E.a(new FlowKt__EmittersKt$unsafeTransform$1$1(this.f53595F, interfaceC2283j), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    @l3.e
    public Object d(@l3.d InterfaceC2283j interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.C.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.1

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f53596H;

            /* renamed from: I, reason: collision with root package name */
            int f53597I;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53596H = obj;
                this.f53597I |= Integer.MIN_VALUE;
                return FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.this.a(null, this);
            }
        };
        kotlin.jvm.internal.C.e(5);
        InterfaceC2282i interfaceC2282i = this.f53594E;
        FlowKt__EmittersKt$unsafeTransform$1$1 flowKt__EmittersKt$unsafeTransform$1$1 = new FlowKt__EmittersKt$unsafeTransform$1$1(this.f53595F, interfaceC2283j);
        kotlin.jvm.internal.C.e(0);
        interfaceC2282i.a(flowKt__EmittersKt$unsafeTransform$1$1, cVar);
        kotlin.jvm.internal.C.e(1);
        return H0.f51801a;
    }
}
