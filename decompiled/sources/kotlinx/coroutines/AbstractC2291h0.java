package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C2210p;
import kotlin.Result;
import kotlinx.coroutines.internal.C2306m;

/* renamed from: kotlinx.coroutines.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2291h0<T> extends kotlinx.coroutines.scheduling.j {

    /* renamed from: G, reason: collision with root package name */
    @W2.f
    public int f54395G;

    public AbstractC2291h0(int i4) {
        this.f54395G = i4;
    }

    public void b(@l3.e Object obj, @l3.d Throwable th) {
    }

    @l3.d
    public abstract kotlin.coroutines.c<T> f();

    @l3.e
    public Throwable g(@l3.e Object obj) {
        E e4;
        if (obj instanceof E) {
            e4 = (E) obj;
        } else {
            e4 = null;
        }
        if (e4 == null) {
            return null;
        }
        return e4.f52925a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T h(@l3.e Object obj) {
        return obj;
    }

    public final void i(@l3.e Throwable th, @l3.e Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C2210p.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.F.m(th);
        Q.b(f().e(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @l3.e
    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object b4;
        y1<?> y1Var;
        L0 l02;
        Object b5;
        kotlinx.coroutines.scheduling.k kVar = this.f54628F;
        try {
            C2306m c2306m = (C2306m) f();
            kotlin.coroutines.c<T> cVar = c2306m.f54494I;
            Object obj = c2306m.f54496K;
            kotlin.coroutines.f e4 = cVar.e();
            Object c4 = kotlinx.coroutines.internal.X.c(e4, obj);
            if (c4 != kotlinx.coroutines.internal.X.f54458a) {
                y1Var = M.g(cVar, e4, c4);
            } else {
                y1Var = null;
            }
            try {
                kotlin.coroutines.f e5 = cVar.e();
                Object j4 = j();
                Throwable g4 = g(j4);
                if (g4 == null && C2293i0.c(this.f54395G)) {
                    l02 = (L0) e5.a(L0.f52941w);
                } else {
                    l02 = null;
                }
                if (l02 != null && !l02.c()) {
                    CancellationException a02 = l02.a0();
                    b(j4, a02);
                    Result.a aVar = Result.f51807F;
                    cVar.x(Result.b(kotlin.W.a(a02)));
                } else if (g4 != null) {
                    Result.a aVar2 = Result.f51807F;
                    cVar.x(Result.b(kotlin.W.a(g4)));
                } else {
                    Result.a aVar3 = Result.f51807F;
                    cVar.x(Result.b(h(j4)));
                }
                kotlin.H0 h02 = kotlin.H0.f51801a;
                if (y1Var == null || y1Var.K1()) {
                    kotlinx.coroutines.internal.X.a(e4, c4);
                }
                try {
                    Result.a aVar4 = Result.f51807F;
                    kVar.P();
                    b5 = Result.b(h02);
                } catch (Throwable th) {
                    Result.a aVar5 = Result.f51807F;
                    b5 = Result.b(kotlin.W.a(th));
                }
                i(null, Result.e(b5));
            } catch (Throwable th2) {
                if (y1Var == null || y1Var.K1()) {
                    kotlinx.coroutines.internal.X.a(e4, c4);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                Result.a aVar6 = Result.f51807F;
                kVar.P();
                b4 = Result.b(kotlin.H0.f51801a);
            } catch (Throwable th4) {
                Result.a aVar7 = Result.f51807F;
                b4 = Result.b(kotlin.W.a(th4));
            }
            i(th3, Result.e(b4));
        }
    }
}
