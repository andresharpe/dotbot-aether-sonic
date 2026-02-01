package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC2282i;

@G0
/* loaded from: classes2.dex */
public interface p<T> extends InterfaceC2282i<T> {

    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ InterfaceC2282i a(p pVar, kotlin.coroutines.f fVar, int i4, BufferOverflow bufferOverflow, int i5, Object obj) {
            if (obj == null) {
                if ((i5 & 1) != 0) {
                    fVar = EmptyCoroutineContext.f52041E;
                }
                if ((i5 & 2) != 0) {
                    i4 = -3;
                }
                if ((i5 & 4) != 0) {
                    bufferOverflow = BufferOverflow.SUSPEND;
                }
                return pVar.c(fVar, i4, bufferOverflow);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    @l3.d
    InterfaceC2282i<T> c(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow);
}
