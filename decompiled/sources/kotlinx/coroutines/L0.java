package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.coroutines.f;

/* loaded from: classes2.dex */
public interface L0 extends f.b {

    /* renamed from: w, reason: collision with root package name */
    @l3.d
    public static final b f52941w = b.f52942E;

    /* loaded from: classes2.dex */
    public static final class a {
        @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void a(L0 l02) {
            l02.f(null);
        }

        public static /* synthetic */ void b(L0 l02, CancellationException cancellationException, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    cancellationException = null;
                }
                l02.f(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ boolean c(L0 l02, Throwable th, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    th = null;
                }
                return l02.d(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R d(@l3.d L0 l02, R r4, @l3.d X2.p<? super R, ? super f.b, ? extends R> pVar) {
            return (R) f.b.a.a(l02, r4, pVar);
        }

        @l3.e
        public static <E extends f.b> E e(@l3.d L0 l02, @l3.d f.c<E> cVar) {
            return (E) f.b.a.b(l02, cVar);
        }

        public static /* synthetic */ InterfaceC2328n0 f(L0 l02, boolean z3, boolean z4, X2.l lVar, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    z3 = false;
                }
                if ((i4 & 2) != 0) {
                    z4 = true;
                }
                return l02.p(z3, z4, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        @l3.d
        public static kotlin.coroutines.f g(@l3.d L0 l02, @l3.d f.c<?> cVar) {
            return f.b.a.c(l02, cVar);
        }

        @l3.d
        public static kotlin.coroutines.f h(@l3.d L0 l02, @l3.d kotlin.coroutines.f fVar) {
            return f.b.a.d(l02, fVar);
        }

        @l3.d
        @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static L0 i(@l3.d L0 l02, @l3.d L0 l03) {
            return l03;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements f.c<L0> {

        /* renamed from: E, reason: collision with root package name */
        static final /* synthetic */ b f52942E = new b();

        private b() {
        }
    }

    @l3.d
    kotlinx.coroutines.selects.c E0();

    @l3.d
    kotlin.sequences.m<L0> F();

    @l3.e
    Object H(@l3.d kotlin.coroutines.c<? super kotlin.H0> cVar);

    @l3.d
    InterfaceC2328n0 V(@l3.d X2.l<? super Throwable, kotlin.H0> lVar);

    @l3.d
    @G0
    CancellationException a0();

    boolean c();

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean d(Throwable th);

    void f(@l3.e CancellationException cancellationException);

    @l3.d
    @G0
    InterfaceC2344w f1(@l3.d InterfaceC2348y interfaceC2348y);

    boolean isCancelled();

    boolean m();

    @l3.d
    @G0
    InterfaceC2328n0 p(boolean z3, boolean z4, @l3.d X2.l<? super Throwable, kotlin.H0> lVar);

    boolean start();

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    L0 u0(@l3.d L0 l02);
}
