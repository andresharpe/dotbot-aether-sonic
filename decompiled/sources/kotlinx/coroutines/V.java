package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.C2304k;

/* loaded from: classes2.dex */
public final class V {
    @l3.d
    public static final U a(@l3.d kotlin.coroutines.f fVar) {
        C c4;
        if (fVar.a(L0.f52941w) == null) {
            c4 = Q0.c(null, 1, null);
            fVar = fVar.A(c4);
        }
        return new C2304k(fVar);
    }

    @l3.d
    public static final U b() {
        return new C2304k(o1.c(null, 1, null).A(C2322k0.e()));
    }

    public static final void c(@l3.d U u3, @l3.d String str, @l3.e Throwable th) {
        d(u3, C2345w0.a(str, th));
    }

    public static final void d(@l3.d U u3, @l3.e CancellationException cancellationException) {
        L0 l02 = (L0) u3.getCoroutineContext().a(L0.f52941w);
        if (l02 != null) {
            l02.f(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + u3).toString());
    }

    public static /* synthetic */ void e(U u3, String str, Throwable th, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            th = null;
        }
        c(u3, str, th);
    }

    public static /* synthetic */ void f(U u3, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        d(u3, cancellationException);
    }

    @l3.e
    public static final <R> Object g(@l3.d X2.p<? super U, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        Object l4;
        kotlinx.coroutines.internal.N n4 = new kotlinx.coroutines.internal.N(cVar.e(), cVar);
        Object f4 = j3.b.f(n4, n4, pVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (f4 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return f4;
    }

    @l3.e
    public static final Object h(@l3.d kotlin.coroutines.c<? super kotlin.coroutines.f> cVar) {
        return cVar.e();
    }

    private static final Object i(kotlin.coroutines.c<? super kotlin.coroutines.f> cVar) {
        kotlin.jvm.internal.C.e(3);
        throw null;
    }

    public static final void j(@l3.d U u3) {
        O0.z(u3.getCoroutineContext());
    }

    public static final boolean k(@l3.d U u3) {
        L0 l02 = (L0) u3.getCoroutineContext().a(L0.f52941w);
        if (l02 != null) {
            return l02.c();
        }
        return true;
    }

    public static /* synthetic */ void l(U u3) {
    }

    @l3.d
    public static final U m(@l3.d U u3, @l3.d kotlin.coroutines.f fVar) {
        return new C2304k(u3.getCoroutineContext().A(fVar));
    }
}
