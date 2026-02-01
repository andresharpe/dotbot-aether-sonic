package kotlinx.coroutines.flow;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.p;

/* renamed from: kotlinx.coroutines.flow.n */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2287n {
    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ InterfaceC2282i a(InterfaceC2282i interfaceC2282i, int i4) {
        InterfaceC2282i d4;
        d4 = d(interfaceC2282i, i4, null, 2, null);
        return d4;
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> b(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4, @l3.d BufferOverflow bufferOverflow) {
        if (i4 < 0 && i4 != -2 && i4 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i4).toString());
        }
        if (i4 == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i4 == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i4 = 0;
        }
        int i5 = i4;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if (interfaceC2282i instanceof kotlinx.coroutines.flow.internal.p) {
            return p.a.a((kotlinx.coroutines.flow.internal.p) interfaceC2282i, null, i5, bufferOverflow2, 1, null);
        }
        return new kotlinx.coroutines.flow.internal.h(interfaceC2282i, null, i5, bufferOverflow2, 2, null);
    }

    public static /* synthetic */ InterfaceC2282i c(InterfaceC2282i interfaceC2282i, int i4, int i5, Object obj) {
        InterfaceC2282i a4;
        if ((i5 & 1) != 0) {
            i4 = -2;
        }
        a4 = a(interfaceC2282i, i4);
        return a4;
    }

    public static /* synthetic */ InterfaceC2282i d(InterfaceC2282i interfaceC2282i, int i4, BufferOverflow bufferOverflow, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = -2;
        }
        if ((i5 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return C2284k.o(interfaceC2282i, i4, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T> InterfaceC2282i<T> e(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        if (!(interfaceC2282i instanceof InterfaceC2276c)) {
            return new C2277d(interfaceC2282i);
        }
        return interfaceC2282i;
    }

    private static final void f(kotlin.coroutines.f fVar) {
        if (fVar.a(L0.f52941w) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + fVar).toString());
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> g(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        InterfaceC2282i<T> d4;
        d4 = d(interfaceC2282i, -1, null, 2, null);
        return d4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T> InterfaceC2282i<T> h(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.f fVar) {
        f(fVar);
        if (!kotlin.jvm.internal.F.g(fVar, EmptyCoroutineContext.f52041E)) {
            if (interfaceC2282i instanceof kotlinx.coroutines.flow.internal.p) {
                return p.a.a((kotlinx.coroutines.flow.internal.p) interfaceC2282i, fVar, 0, null, 6, null);
            }
            return new kotlinx.coroutines.flow.internal.h(interfaceC2282i, fVar, 0, null, 12, null);
        }
        return interfaceC2282i;
    }
}
