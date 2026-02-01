package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.S;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final S f54389a = new S("NO_VALUE");

    @l3.d
    public static final <T> s<T> a(int i4, int i5, @l3.d BufferOverflow bufferOverflow) {
        if (i4 >= 0) {
            if (i5 >= 0) {
                if (i4 <= 0 && i5 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
                    throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
                }
                int i6 = i5 + i4;
                if (i6 < 0) {
                    i6 = Integer.MAX_VALUE;
                }
                return new y(i4, i6, bufferOverflow);
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i5).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i4).toString());
    }

    public static /* synthetic */ s b(int i4, int i5, BufferOverflow bufferOverflow, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return a(i4, i5, bufferOverflow);
    }

    public static final /* synthetic */ Object c(Object[] objArr, long j4) {
        return f(objArr, j4);
    }

    public static final /* synthetic */ void d(Object[] objArr, long j4, Object obj) {
        h(objArr, j4, obj);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> e(@l3.d x<? extends T> xVar, @l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        if ((i4 == 0 || i4 == -3) && bufferOverflow == BufferOverflow.SUSPEND) {
            return xVar;
        }
        return new kotlinx.coroutines.flow.internal.h(xVar, fVar, i4, bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j4) {
        return objArr[((int) j4) & (objArr.length - 1)];
    }

    public static /* synthetic */ void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Object[] objArr, long j4, Object obj) {
        objArr[((int) j4) & (objArr.length - 1)] = obj;
    }
}
