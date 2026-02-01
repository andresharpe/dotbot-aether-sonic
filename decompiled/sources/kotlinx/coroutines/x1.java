package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class x1 extends N {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final x1 f54763G = new x1();

    private x1() {
    }

    @Override // kotlinx.coroutines.N
    public void h1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        A1 a12 = (A1) fVar.a(A1.f52914G);
        if (a12 != null) {
            a12.f52915F = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // kotlinx.coroutines.N
    public boolean j1(@l3.d kotlin.coroutines.f fVar) {
        return false;
    }

    @Override // kotlinx.coroutines.N
    @A0
    @l3.d
    public N k1(int i4) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.N
    @l3.d
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
