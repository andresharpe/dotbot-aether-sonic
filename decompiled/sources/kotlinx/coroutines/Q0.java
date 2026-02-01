package kotlinx.coroutines;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.coroutines.f;
import kotlinx.coroutines.L0;

/* loaded from: classes2.dex */
public final /* synthetic */ class Q0 {
    public static final boolean A(@l3.d kotlin.coroutines.f fVar) {
        L0 l02 = (L0) fVar.a(L0.f52941w);
        if (l02 == null || !l02.c()) {
            return false;
        }
        return true;
    }

    private static final Throwable B(Throwable th, L0 l02) {
        if (th == null) {
            return new JobCancellationException("Job was cancelled", null, l02);
        }
        return th;
    }

    @l3.d
    public static final C a(@l3.e L0 l02) {
        return new N0(l02);
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @W2.i(name = "Job")
    public static final /* synthetic */ L0 b(L0 l02) {
        return O0.a(l02);
    }

    public static /* synthetic */ C c(L0 l02, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            l02 = null;
        }
        return O0.a(l02);
    }

    public static /* synthetic */ L0 d(L0 l02, int i4, Object obj) {
        L0 b4;
        if ((i4 & 1) != 0) {
            l02 = null;
        }
        b4 = b(l02);
        return b4;
    }

    public static final void f(@l3.d kotlin.coroutines.f fVar, @l3.e CancellationException cancellationException) {
        L0 l02 = (L0) fVar.a(L0.f52941w);
        if (l02 != null) {
            l02.f(cancellationException);
        }
    }

    public static final void g(@l3.d L0 l02, @l3.d String str, @l3.e Throwable th) {
        l02.f(C2345w0.a(str, th));
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(kotlin.coroutines.f fVar, Throwable th) {
        S0 s02;
        f.b a4 = fVar.a(L0.f52941w);
        if (a4 instanceof S0) {
            s02 = (S0) a4;
        } else {
            s02 = null;
        }
        if (s02 == null) {
            return false;
        }
        s02.n0(B(th, s02));
        return true;
    }

    public static /* synthetic */ void i(kotlin.coroutines.f fVar, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        O0.f(fVar, cancellationException);
    }

    public static /* synthetic */ void j(L0 l02, String str, Throwable th, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            th = null;
        }
        O0.g(l02, str, th);
    }

    public static /* synthetic */ boolean k(kotlin.coroutines.f fVar, Throwable th, int i4, Object obj) {
        boolean h4;
        if ((i4 & 1) != 0) {
            th = null;
        }
        h4 = h(fVar, th);
        return h4;
    }

    @l3.e
    public static final Object l(@l3.d L0 l02, @l3.d kotlin.coroutines.c<? super kotlin.H0> cVar) {
        Object l4;
        L0.a.b(l02, null, 1, null);
        Object H3 = l02.H(cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (H3 == l4) {
            return H3;
        }
        return kotlin.H0.f51801a;
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(kotlin.coroutines.f fVar, Throwable th) {
        S0 s02;
        L0 l02 = (L0) fVar.a(L0.f52941w);
        if (l02 == null) {
            return;
        }
        for (L0 l03 : l02.F()) {
            if (l03 instanceof S0) {
                s02 = (S0) l03;
            } else {
                s02 = null;
            }
            if (s02 != null) {
                s02.n0(B(th, l02));
            }
        }
    }

    public static final void o(@l3.d kotlin.coroutines.f fVar, @l3.e CancellationException cancellationException) {
        kotlin.sequences.m<L0> F3;
        L0 l02 = (L0) fVar.a(L0.f52941w);
        if (l02 != null && (F3 = l02.F()) != null) {
            Iterator<L0> it = F3.iterator();
            while (it.hasNext()) {
                it.next().f(cancellationException);
            }
        }
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(L0 l02, Throwable th) {
        S0 s02;
        for (L0 l03 : l02.F()) {
            if (l03 instanceof S0) {
                s02 = (S0) l03;
            } else {
                s02 = null;
            }
            if (s02 != null) {
                s02.n0(B(th, l02));
            }
        }
    }

    public static final void r(@l3.d L0 l02, @l3.e CancellationException cancellationException) {
        Iterator<L0> it = l02.F().iterator();
        while (it.hasNext()) {
            it.next().f(cancellationException);
        }
    }

    public static /* synthetic */ void s(kotlin.coroutines.f fVar, Throwable th, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        n(fVar, th);
    }

    public static /* synthetic */ void t(kotlin.coroutines.f fVar, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        O0.o(fVar, cancellationException);
    }

    public static /* synthetic */ void u(L0 l02, Throwable th, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        q(l02, th);
    }

    public static /* synthetic */ void v(L0 l02, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        O0.r(l02, cancellationException);
    }

    @l3.d
    public static final InterfaceC2328n0 w(@l3.d L0 l02, @l3.d InterfaceC2328n0 interfaceC2328n0) {
        return l02.V(new C2332p0(interfaceC2328n0));
    }

    public static final void x(@l3.d kotlin.coroutines.f fVar) {
        L0 l02 = (L0) fVar.a(L0.f52941w);
        if (l02 != null) {
            O0.A(l02);
        }
    }

    public static final void y(@l3.d L0 l02) {
        if (l02.c()) {
        } else {
            throw l02.a0();
        }
    }

    @l3.d
    public static final L0 z(@l3.d kotlin.coroutines.f fVar) {
        L0 l02 = (L0) fVar.a(L0.f52941w);
        if (l02 != null) {
            return l02;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + fVar).toString());
    }
}
