package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2<R> implements InterfaceC2282i<R> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i[] f53950E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ X2.p f53951F;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(InterfaceC2282i[] interfaceC2282iArr, X2.p pVar) {
        this.f53950E = interfaceC2282iArr;
        this.f53951F = pVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        InterfaceC2282i[] interfaceC2282iArr = this.f53950E;
        kotlin.jvm.internal.F.w();
        FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new FlowKt__ZipKt$combine$5$1(this.f53950E);
        kotlin.jvm.internal.F.w();
        Object a4 = kotlinx.coroutines.flow.internal.k.a(interfaceC2283j, interfaceC2282iArr, flowKt__ZipKt$combine$5$1, new FlowKt__ZipKt$combine$5$2(this.f53951F, null), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    @l3.e
    public Object d(@l3.d InterfaceC2283j interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.C.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.1

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f53952H;

            /* renamed from: I, reason: collision with root package name */
            int f53953I;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53952H = obj;
                this.f53953I |= Integer.MIN_VALUE;
                return FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.this.a(null, this);
            }
        };
        kotlin.jvm.internal.C.e(5);
        InterfaceC2282i[] interfaceC2282iArr = this.f53950E;
        kotlin.jvm.internal.F.w();
        FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new FlowKt__ZipKt$combine$5$1(this.f53950E);
        kotlin.jvm.internal.F.w();
        FlowKt__ZipKt$combine$5$2 flowKt__ZipKt$combine$5$2 = new FlowKt__ZipKt$combine$5$2(this.f53951F, null);
        kotlin.jvm.internal.C.e(0);
        kotlinx.coroutines.flow.internal.k.a(interfaceC2283j, interfaceC2282iArr, flowKt__ZipKt$combine$5$1, flowKt__ZipKt$combine$5$2, cVar);
        kotlin.jvm.internal.C.e(1);
        return H0.f51801a;
    }
}
