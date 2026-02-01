package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class o1 {
    @l3.d
    public static final C a(@l3.e L0 l02) {
        return new n1(l02);
    }

    public static /* synthetic */ C c(L0 l02, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            l02 = null;
        }
        return a(l02);
    }

    public static /* synthetic */ L0 d(L0 l02, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            l02 = null;
        }
        return a(l02);
    }

    @l3.e
    public static final <R> Object e(@l3.d X2.p<? super U, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        Object l4;
        m1 m1Var = new m1(cVar.e(), cVar);
        Object f4 = j3.b.f(m1Var, m1Var, pVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (f4 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return f4;
    }
}
