package kotlinx.coroutines.android;

import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.InterfaceC2241c0;
import kotlinx.coroutines.InterfaceC2328n0;
import kotlinx.coroutines.W0;

/* loaded from: classes2.dex */
public abstract class e extends W0 implements InterfaceC2241c0 {
    public /* synthetic */ e(C2197u c2197u) {
        this();
    }

    @l3.d
    public abstract e o1();

    @l3.d
    public InterfaceC2328n0 x0(long j4, @l3.d Runnable runnable, @l3.d kotlin.coroutines.f fVar) {
        return InterfaceC2241c0.a.b(this, j4, runnable, fVar);
    }

    @Override // kotlinx.coroutines.InterfaceC2241c0
    @l3.e
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object z0(long j4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return InterfaceC2241c0.a.a(this, j4, cVar);
    }

    private e() {
    }
}
