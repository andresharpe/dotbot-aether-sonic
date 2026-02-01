package kotlinx.coroutines;

import kotlin.Result;
import kotlinx.coroutines.internal.C2306m;

/* renamed from: kotlinx.coroutines.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2293i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f54398a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f54399b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f54400c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f54401d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f54402e = -1;

    public static final <T> void a(@l3.d AbstractC2291h0<? super T> abstractC2291h0, int i4) {
        boolean z3;
        kotlin.coroutines.c<? super T> f4 = abstractC2291h0.f();
        if (i4 == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && (f4 instanceof C2306m) && c(i4) == c(abstractC2291h0.f54395G)) {
            N n4 = ((C2306m) f4).f54493H;
            kotlin.coroutines.f e4 = f4.e();
            if (n4.j1(e4)) {
                n4.h1(e4, abstractC2291h0);
                return;
            } else {
                f(abstractC2291h0);
                return;
            }
        }
        e(abstractC2291h0, f4, z3);
    }

    @kotlin.U
    public static /* synthetic */ void b() {
    }

    public static final boolean c(int i4) {
        return i4 == 1 || i4 == 2;
    }

    public static final boolean d(int i4) {
        return i4 == 2;
    }

    public static final <T> void e(@l3.d AbstractC2291h0<? super T> abstractC2291h0, @l3.d kotlin.coroutines.c<? super T> cVar, boolean z3) {
        Object h4;
        y1<?> y1Var;
        boolean K12;
        Object j4 = abstractC2291h0.j();
        Throwable g4 = abstractC2291h0.g(j4);
        if (g4 != null) {
            Result.a aVar = Result.f51807F;
            h4 = kotlin.W.a(g4);
        } else {
            Result.a aVar2 = Result.f51807F;
            h4 = abstractC2291h0.h(j4);
        }
        Object b4 = Result.b(h4);
        if (z3) {
            C2306m c2306m = (C2306m) cVar;
            kotlin.coroutines.c<T> cVar2 = c2306m.f54494I;
            Object obj = c2306m.f54496K;
            kotlin.coroutines.f e4 = cVar2.e();
            Object c4 = kotlinx.coroutines.internal.X.c(e4, obj);
            if (c4 != kotlinx.coroutines.internal.X.f54458a) {
                y1Var = M.g(cVar2, e4, c4);
            } else {
                y1Var = null;
            }
            try {
                c2306m.f54494I.x(b4);
                kotlin.H0 h02 = kotlin.H0.f51801a;
                if (y1Var != null) {
                    if (!K12) {
                        return;
                    }
                }
                return;
            } finally {
                if (y1Var == null || y1Var.K1()) {
                    kotlinx.coroutines.internal.X.a(e4, c4);
                }
            }
        }
        cVar.x(b4);
    }

    private static final void f(AbstractC2291h0<?> abstractC2291h0) {
        AbstractC2335r0 b4 = r1.f54556a.b();
        if (b4.u1()) {
            b4.p1(abstractC2291h0);
            return;
        }
        b4.r1(true);
        try {
            e(abstractC2291h0, abstractC2291h0.f(), true);
            do {
            } while (b4.x1());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void g(@l3.d kotlin.coroutines.c<?> cVar, @l3.d Throwable th) {
        Result.a aVar = Result.f51807F;
        cVar.x(Result.b(kotlin.W.a(th)));
    }

    public static final void h(@l3.d AbstractC2291h0<?> abstractC2291h0, @l3.d AbstractC2335r0 abstractC2335r0, @l3.d X2.a<kotlin.H0> aVar) {
        abstractC2335r0.r1(true);
        try {
            aVar.n();
            do {
            } while (abstractC2335r0.x1());
            kotlin.jvm.internal.C.d(1);
        } catch (Throwable th) {
            try {
                abstractC2291h0.i(th, null);
                kotlin.jvm.internal.C.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.C.d(1);
                abstractC2335r0.m1(true);
                kotlin.jvm.internal.C.c(1);
                throw th2;
            }
        }
        abstractC2335r0.m1(true);
        kotlin.jvm.internal.C.c(1);
    }
}
