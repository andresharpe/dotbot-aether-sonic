package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlinx.coroutines.InterfaceC2239b1;
import kotlinx.coroutines.channels.J;

@InterfaceC2239b1
/* renamed from: kotlinx.coroutines.channels.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2250i<E> extends J<E> {

    /* renamed from: kotlinx.coroutines.channels.i$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC2250i interfaceC2250i, CancellationException cancellationException, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    cancellationException = null;
                }
                interfaceC2250i.f(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ boolean b(InterfaceC2250i interfaceC2250i, Throwable th, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    th = null;
                }
                return interfaceC2250i.d(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @V(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@l3.d InterfaceC2250i<E> interfaceC2250i, E e4) {
            return J.a.c(interfaceC2250i, e4);
        }
    }

    @l3.d
    F<E> R();

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only")
    /* synthetic */ boolean d(Throwable th);

    void f(@l3.e CancellationException cancellationException);
}
