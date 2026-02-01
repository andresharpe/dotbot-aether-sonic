package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.H0;
import kotlin.Result;
import kotlinx.coroutines.AbstractC2335r0;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.r1;
import kotlinx.coroutines.y1;

/* renamed from: kotlinx.coroutines.internal.n */
/* loaded from: classes2.dex */
public final class C2307n {

    /* renamed from: a */
    @l3.d
    private static final S f54497a = new S("UNDEFINED");

    /* renamed from: b */
    @W2.f
    @l3.d
    public static final S f54498b = new S("REUSABLE_CLAIMED");

    public static final /* synthetic */ S a() {
        return f54497a;
    }

    private static final boolean b(C2306m<?> c2306m, Object obj, int i4, boolean z3, X2.a<H0> aVar) {
        AbstractC2335r0 b4 = r1.f54556a.b();
        if (z3 && b4.v1()) {
            return false;
        }
        if (b4.u1()) {
            c2306m.f54495J = obj;
            c2306m.f54395G = i4;
            b4.p1(c2306m);
            return true;
        }
        b4.r1(true);
        try {
            aVar.n();
            do {
            } while (b4.x1());
            kotlin.jvm.internal.C.d(1);
        } catch (Throwable th) {
            try {
                c2306m.i(th, null);
                kotlin.jvm.internal.C.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.C.d(1);
                b4.m1(true);
                kotlin.jvm.internal.C.c(1);
                throw th2;
            }
        }
        b4.m1(true);
        kotlin.jvm.internal.C.c(1);
        return false;
    }

    static /* synthetic */ boolean c(C2306m c2306m, Object obj, int i4, boolean z3, X2.a aVar, int i5, Object obj2) {
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        AbstractC2335r0 b4 = r1.f54556a.b();
        if (z3 && b4.v1()) {
            return false;
        }
        if (b4.u1()) {
            c2306m.f54495J = obj;
            c2306m.f54395G = i4;
            b4.p1(c2306m);
            return true;
        }
        b4.r1(true);
        try {
            aVar.n();
            do {
            } while (b4.x1());
            kotlin.jvm.internal.C.d(1);
        } catch (Throwable th) {
            try {
                c2306m.i(th, null);
                kotlin.jvm.internal.C.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.C.d(1);
                b4.m1(true);
                kotlin.jvm.internal.C.c(1);
                throw th2;
            }
        }
        b4.m1(true);
        kotlin.jvm.internal.C.c(1);
        return false;
    }

    public static /* synthetic */ void d() {
    }

    private static /* synthetic */ void e() {
    }

    @G0
    public static final <T> void f(@l3.d kotlin.coroutines.c<? super T> cVar, @l3.d Object obj, @l3.e X2.l<? super Throwable, H0> lVar) {
        y1<?> y1Var;
        if (cVar instanceof C2306m) {
            C2306m c2306m = (C2306m) cVar;
            Object b4 = kotlinx.coroutines.J.b(obj, lVar);
            if (c2306m.f54493H.j1(c2306m.e())) {
                c2306m.f54495J = b4;
                c2306m.f54395G = 1;
                c2306m.f54493H.h1(c2306m.e(), c2306m);
                return;
            }
            AbstractC2335r0 b5 = r1.f54556a.b();
            if (b5.u1()) {
                c2306m.f54495J = b4;
                c2306m.f54395G = 1;
                b5.p1(c2306m);
                return;
            }
            b5.r1(true);
            try {
                L0 l02 = (L0) c2306m.e().a(L0.f52941w);
                if (l02 != null && !l02.c()) {
                    CancellationException a02 = l02.a0();
                    c2306m.b(b4, a02);
                    Result.a aVar = Result.f51807F;
                    c2306m.x(Result.b(kotlin.W.a(a02)));
                } else {
                    kotlin.coroutines.c<T> cVar2 = c2306m.f54494I;
                    Object obj2 = c2306m.f54496K;
                    kotlin.coroutines.f e4 = cVar2.e();
                    Object c4 = X.c(e4, obj2);
                    if (c4 != X.f54458a) {
                        y1Var = kotlinx.coroutines.M.g(cVar2, e4, c4);
                    } else {
                        y1Var = null;
                    }
                    try {
                        c2306m.f54494I.x(obj);
                        H0 h02 = H0.f51801a;
                    } finally {
                        if (y1Var == null || y1Var.K1()) {
                            X.a(e4, c4);
                        }
                    }
                }
                do {
                } while (b5.x1());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        cVar.x(obj);
    }

    public static /* synthetic */ void g(kotlin.coroutines.c cVar, Object obj, X2.l lVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        f(cVar, obj, lVar);
    }

    public static final boolean h(@l3.d C2306m<? super H0> c2306m) {
        H0 h02 = H0.f51801a;
        AbstractC2335r0 b4 = r1.f54556a.b();
        if (b4.v1()) {
            return false;
        }
        if (b4.u1()) {
            c2306m.f54495J = h02;
            c2306m.f54395G = 1;
            b4.p1(c2306m);
            return true;
        }
        b4.r1(true);
        try {
            c2306m.run();
            do {
            } while (b4.x1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
