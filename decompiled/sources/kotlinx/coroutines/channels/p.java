package kotlinx.coroutines.channels;

import kotlin.H0;
import kotlinx.coroutines.channels.q;

/* loaded from: classes2.dex */
public final class p {
    @l3.d
    public static final <E> InterfaceC2254m<E> b(int i4, @l3.d BufferOverflow bufferOverflow, @l3.e X2.l<? super E, H0> lVar) {
        int i5 = 1;
        if (i4 != -2) {
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != Integer.MAX_VALUE) {
                        if (i4 == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) {
                            return new x(lVar);
                        }
                        return new C2249h(i4, bufferOverflow, lVar);
                    }
                    return new A(lVar);
                }
                if (bufferOverflow == BufferOverflow.SUSPEND) {
                    return new H(lVar);
                }
                return new C2249h(1, bufferOverflow, lVar);
            }
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                return new x(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            i5 = InterfaceC2254m.f53116x.a();
        }
        return new C2249h(i5, bufferOverflow, lVar);
    }

    public static /* synthetic */ InterfaceC2254m c(int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return d(i4, null, null, 6, null);
    }

    public static /* synthetic */ InterfaceC2254m d(int i4, BufferOverflow bufferOverflow, X2.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        return b(i4, bufferOverflow, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T e(@l3.d Object obj, @l3.d X2.l<? super Throwable, ? extends T> lVar) {
        if (obj instanceof q.c) {
            return lVar.C(q.f(obj));
        }
        return obj;
    }

    @l3.d
    public static final <T> Object f(@l3.d Object obj, @l3.d X2.l<? super Throwable, H0> lVar) {
        if (obj instanceof q.a) {
            lVar.C(q.f(obj));
        }
        return obj;
    }

    @l3.d
    public static final <T> Object g(@l3.d Object obj, @l3.d X2.l<? super Throwable, H0> lVar) {
        if (obj instanceof q.c) {
            lVar.C(q.f(obj));
        }
        return obj;
    }

    @l3.d
    public static final <T> Object h(@l3.d Object obj, @l3.d X2.l<? super T, H0> lVar) {
        if (!(obj instanceof q.c)) {
            lVar.C(obj);
        }
        return obj;
    }
}
