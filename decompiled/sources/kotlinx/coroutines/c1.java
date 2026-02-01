package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.coroutines.f;
import kotlinx.coroutines.L0;

@InterfaceC2205l(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@G0
/* loaded from: classes2.dex */
public interface c1 extends L0 {

    /* loaded from: classes2.dex */
    public static final class a {
        public static <R> R b(@l3.d c1 c1Var, R r4, @l3.d X2.p<? super R, ? super f.b, ? extends R> pVar) {
            return (R) L0.a.d(c1Var, r4, pVar);
        }

        @l3.e
        public static <E extends f.b> E c(@l3.d c1 c1Var, @l3.d f.c<E> cVar) {
            return (E) L0.a.e(c1Var, cVar);
        }

        @l3.d
        public static kotlin.coroutines.f d(@l3.d c1 c1Var, @l3.d f.c<?> cVar) {
            return L0.a.g(c1Var, cVar);
        }

        @l3.d
        public static kotlin.coroutines.f e(@l3.d c1 c1Var, @l3.d kotlin.coroutines.f fVar) {
            return L0.a.h(c1Var, fVar);
        }

        @l3.d
        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static L0 f(@l3.d c1 c1Var, @l3.d L0 l02) {
            return L0.a.i(c1Var, l02);
        }
    }

    @l3.d
    @G0
    CancellationException M0();
}
