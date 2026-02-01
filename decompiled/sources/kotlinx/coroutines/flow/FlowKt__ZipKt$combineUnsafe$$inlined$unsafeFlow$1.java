package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
public final class FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1<R> implements InterfaceC2282i<R> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i[] f54000E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ X2.p f54001F;

    public FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1(InterfaceC2282i[] interfaceC2282iArr, X2.p pVar) {
        this.f54000E = interfaceC2282iArr;
        this.f54001F = pVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        InterfaceC2282i[] interfaceC2282iArr = this.f54000E;
        X2.a a4 = FlowKt__ZipKt.a();
        kotlin.jvm.internal.F.w();
        Object a5 = kotlinx.coroutines.flow.internal.k.a(interfaceC2283j, interfaceC2282iArr, a4, new FlowKt__ZipKt$combineUnsafe$1$1(this.f54001F, null), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a5 == l4) {
            return a5;
        }
        return H0.f51801a;
    }

    @l3.e
    public Object d(@l3.d InterfaceC2283j interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.C.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1.1

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f54002H;

            /* renamed from: I, reason: collision with root package name */
            int f54003I;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f54002H = obj;
                this.f54003I |= Integer.MIN_VALUE;
                return FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1.this.a(null, this);
            }
        };
        kotlin.jvm.internal.C.e(5);
        InterfaceC2282i[] interfaceC2282iArr = this.f54000E;
        X2.a a4 = FlowKt__ZipKt.a();
        kotlin.jvm.internal.F.w();
        FlowKt__ZipKt$combineUnsafe$1$1 flowKt__ZipKt$combineUnsafe$1$1 = new FlowKt__ZipKt$combineUnsafe$1$1(this.f54001F, null);
        kotlin.jvm.internal.C.e(0);
        kotlinx.coroutines.flow.internal.k.a(interfaceC2283j, interfaceC2282iArr, a4, flowKt__ZipKt$combineUnsafe$1$1, cVar);
        kotlin.jvm.internal.C.e(1);
        return H0.f51801a;
    }
}
