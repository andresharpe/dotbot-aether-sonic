package kotlinx.coroutines.channels;

import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.internal.Q;

/* loaded from: classes2.dex */
public interface J<E> {

    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ boolean a(J j4, Throwable th, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    th = null;
                }
                return j4.P(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        @A0
        public static /* synthetic */ void b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @V(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@l3.d J<? super E> j4, E e4) {
            Object S3 = j4.S(e4);
            if (q.m(S3)) {
                return true;
            }
            Throwable f4 = q.f(S3);
            if (f4 == null) {
                return false;
            }
            throw Q.p(f4);
        }
    }

    @l3.d
    kotlinx.coroutines.selects.e<E, J<E>> K();

    boolean P(@l3.e Throwable th);

    @l3.d
    Object S(E e4);

    @l3.e
    Object U(E e4, @l3.d kotlin.coroutines.c<? super H0> cVar);

    boolean W();

    @A0
    void g(@l3.d X2.l<? super Throwable, H0> lVar);

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @V(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e4);
}
