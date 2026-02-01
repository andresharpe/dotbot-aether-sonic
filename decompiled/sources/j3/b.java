package j3;

import X2.l;
import X2.p;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.f;
import kotlinx.coroutines.E;
import kotlinx.coroutines.T0;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.N;
import kotlinx.coroutines.internal.X;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class b {
    public static final <T> void a(@d l<? super c<? super T>, ? extends Object> lVar, @d c<? super T> cVar) {
        Object l4;
        c a4 = f.a(cVar);
        try {
            kotlin.coroutines.f e4 = cVar.e();
            Object c4 = X.c(e4, null);
            try {
                Object C3 = ((l) kotlin.jvm.internal.X.q(lVar, 1)).C(a4);
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (C3 != l4) {
                    Result.a aVar = Result.f51807F;
                    a4.x(Result.b(C3));
                }
            } finally {
                X.a(e4, c4);
            }
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            a4.x(Result.b(W.a(th)));
        }
    }

    public static final <R, T> void b(@d p<? super R, ? super c<? super T>, ? extends Object> pVar, R r4, @d c<? super T> cVar) {
        Object l4;
        c a4 = f.a(cVar);
        try {
            kotlin.coroutines.f e4 = cVar.e();
            Object c4 = X.c(e4, null);
            try {
                Object c02 = ((p) kotlin.jvm.internal.X.q(pVar, 2)).c0(r4, a4);
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (c02 != l4) {
                    Result.a aVar = Result.f51807F;
                    a4.x(Result.b(c02));
                }
            } finally {
                X.a(e4, c4);
            }
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            a4.x(Result.b(W.a(th)));
        }
    }

    public static final <T> void c(@d l<? super c<? super T>, ? extends Object> lVar, @d c<? super T> cVar) {
        Object l4;
        c a4 = f.a(cVar);
        try {
            Object C3 = ((l) kotlin.jvm.internal.X.q(lVar, 1)).C(a4);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (C3 != l4) {
                Result.a aVar = Result.f51807F;
                a4.x(Result.b(C3));
            }
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            a4.x(Result.b(W.a(th)));
        }
    }

    public static final <R, T> void d(@d p<? super R, ? super c<? super T>, ? extends Object> pVar, R r4, @d c<? super T> cVar) {
        Object l4;
        c a4 = f.a(cVar);
        try {
            Object c02 = ((p) kotlin.jvm.internal.X.q(pVar, 2)).c0(r4, a4);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (c02 != l4) {
                Result.a aVar = Result.f51807F;
                a4.x(Result.b(c02));
            }
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            a4.x(Result.b(W.a(th)));
        }
    }

    private static final <T> void e(c<? super T> cVar, l<? super c<? super T>, ? extends Object> lVar) {
        Object l4;
        c a4 = f.a(cVar);
        try {
            Object C3 = lVar.C(a4);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (C3 != l4) {
                Result.a aVar = Result.f51807F;
                a4.x(Result.b(C3));
            }
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            a4.x(Result.b(W.a(th)));
        }
    }

    @e
    public static final <T, R> Object f(@d N<? super T> n4, R r4, @d p<? super R, ? super c<? super T>, ? extends Object> pVar) {
        Object e4;
        Object l4;
        Object l5;
        Object l6;
        try {
            e4 = ((p) kotlin.jvm.internal.X.q(pVar, 2)).c0(r4, n4);
        } catch (Throwable th) {
            e4 = new E(th, false, 2, null);
        }
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (e4 == l4) {
            l6 = kotlin.coroutines.intrinsics.b.l();
            return l6;
        }
        Object d12 = n4.d1(e4);
        if (d12 == T0.f52975b) {
            l5 = kotlin.coroutines.intrinsics.b.l();
            return l5;
        }
        if (!(d12 instanceof E)) {
            return T0.o(d12);
        }
        throw ((E) d12).f52925a;
    }

    @e
    public static final <T, R> Object g(@d N<? super T> n4, R r4, @d p<? super R, ? super c<? super T>, ? extends Object> pVar) {
        Object e4;
        Object l4;
        Object l5;
        Object l6;
        try {
            e4 = ((p) kotlin.jvm.internal.X.q(pVar, 2)).c0(r4, n4);
        } catch (Throwable th) {
            e4 = new E(th, false, 2, null);
        }
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (e4 == l4) {
            l6 = kotlin.coroutines.intrinsics.b.l();
            return l6;
        }
        Object d12 = n4.d1(e4);
        if (d12 == T0.f52975b) {
            l5 = kotlin.coroutines.intrinsics.b.l();
            return l5;
        }
        if (d12 instanceof E) {
            Throwable th2 = ((E) d12).f52925a;
            if (th2 instanceof TimeoutCancellationException) {
                if (((TimeoutCancellationException) th2).f52984E == n4) {
                    if (e4 instanceof E) {
                        throw ((E) e4).f52925a;
                    }
                } else {
                    throw th2;
                }
            } else {
                throw th2;
            }
        } else {
            e4 = T0.o(d12);
        }
        return e4;
    }

    private static final <T> Object h(N<? super T> n4, l<? super Throwable, Boolean> lVar, X2.a<? extends Object> aVar) {
        Object e4;
        Object l4;
        Object l5;
        Object l6;
        try {
            e4 = aVar.n();
        } catch (Throwable th) {
            e4 = new E(th, false, 2, null);
        }
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (e4 == l4) {
            l6 = kotlin.coroutines.intrinsics.b.l();
            return l6;
        }
        Object d12 = n4.d1(e4);
        if (d12 == T0.f52975b) {
            l5 = kotlin.coroutines.intrinsics.b.l();
            return l5;
        }
        if (d12 instanceof E) {
            E e5 = (E) d12;
            if (!lVar.C(e5.f52925a).booleanValue()) {
                if (e4 instanceof E) {
                    throw ((E) e4).f52925a;
                }
                return e4;
            }
            throw e5.f52925a;
        }
        return T0.o(d12);
    }
}
