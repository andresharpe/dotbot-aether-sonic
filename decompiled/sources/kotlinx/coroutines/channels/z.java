package kotlinx.coroutines.channels;

import kotlin.H0;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes2.dex */
final class z<E> extends C2252k<E> {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.c<H0> f53366H;

    public z(@l3.d kotlin.coroutines.f fVar, @l3.d InterfaceC2250i<E> interfaceC2250i, @l3.d X2.p<? super D<? super E>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        super(fVar, interfaceC2250i, false);
        kotlin.coroutines.c<H0> c4;
        c4 = IntrinsicsKt__IntrinsicsJvmKt.c(pVar, this, this);
        this.f53366H = c4;
    }

    @Override // kotlinx.coroutines.channels.C2252k, kotlinx.coroutines.channels.InterfaceC2250i
    @l3.d
    public F<E> R() {
        F<E> R3 = J1().R();
        start();
        return R3;
    }

    @Override // kotlinx.coroutines.S0
    protected void n1() {
        j3.a.e(this.f53366H, this);
    }
}
