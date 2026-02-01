package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: classes2.dex */
public final class B {
    @l3.d
    public static final <T> InterfaceC2350z<T> a(T t3) {
        A a4 = new A(null);
        a4.F0(t3);
        return a4;
    }

    @l3.d
    public static final <T> InterfaceC2350z<T> b(@l3.e L0 l02) {
        return new A(l02);
    }

    public static /* synthetic */ InterfaceC2350z c(L0 l02, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            l02 = null;
        }
        return b(l02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(@l3.d InterfaceC2350z<T> interfaceC2350z, @l3.d Object obj) {
        Throwable e4 = Result.e(obj);
        if (e4 == null) {
            return interfaceC2350z.F0(obj);
        }
        return interfaceC2350z.k(e4);
    }
}
