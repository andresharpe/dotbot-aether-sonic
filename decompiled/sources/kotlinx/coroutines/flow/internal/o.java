package kotlinx.coroutines.flow.internal;

import kotlin.U;
import kotlinx.coroutines.flow.InterfaceC2283j;

/* loaded from: classes2.dex */
public final class o {
    @U
    public static final int a(int i4) {
        if (i4 >= 0) {
            return i4;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    public static final void b(@l3.d AbortFlowException abortFlowException, @l3.d InterfaceC2283j<?> interfaceC2283j) {
        if (abortFlowException.f54115E == interfaceC2283j) {
        } else {
            throw abortFlowException;
        }
    }
}
