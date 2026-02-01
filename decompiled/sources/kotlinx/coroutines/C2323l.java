package kotlinx.coroutines;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;

/* renamed from: kotlinx.coroutines.l */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2323l {

    /* renamed from: a */
    private static final int f54538a = 0;

    /* renamed from: b */
    private static final int f54539b = 1;

    /* renamed from: c */
    private static final int f54540c = 2;

    @l3.d
    public static final <T> InterfaceC2235a0<T> a(@l3.d U u3, @l3.d kotlin.coroutines.f fVar, @l3.d CoroutineStart coroutineStart, @l3.d X2.p<? super U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) {
        C2238b0 c2238b0;
        kotlin.coroutines.f e4 = M.e(u3, fVar);
        if (coroutineStart.g()) {
            c2238b0 = new U0(e4, pVar);
        } else {
            c2238b0 = new C2238b0(e4, true);
        }
        ((AbstractC2234a) c2238b0).I1(coroutineStart, c2238b0, pVar);
        return (InterfaceC2235a0<T>) c2238b0;
    }

    public static /* synthetic */ InterfaceC2235a0 b(U u3, kotlin.coroutines.f fVar, CoroutineStart coroutineStart, X2.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        if ((i4 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C2319j.a(u3, fVar, coroutineStart, pVar);
    }

    @l3.e
    public static final <T> Object c(@l3.d N n4, @l3.d X2.p<? super U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return C2319j.h(n4, pVar, cVar);
    }

    private static final <T> Object d(N n4, X2.p<? super U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, kotlin.coroutines.c<? super T> cVar) {
        kotlin.jvm.internal.C.e(0);
        Object h4 = C2319j.h(n4, pVar, cVar);
        kotlin.jvm.internal.C.e(1);
        return h4;
    }

    @l3.d
    public static final L0 e(@l3.d U u3, @l3.d kotlin.coroutines.f fVar, @l3.d CoroutineStart coroutineStart, @l3.d X2.p<? super U, ? super kotlin.coroutines.c<? super kotlin.H0>, ? extends Object> pVar) {
        AbstractC2234a l1Var;
        kotlin.coroutines.f e4 = M.e(u3, fVar);
        if (coroutineStart.g()) {
            l1Var = new V0(e4, pVar);
        } else {
            l1Var = new l1(e4, true);
        }
        l1Var.I1(coroutineStart, l1Var, pVar);
        return l1Var;
    }

    public static /* synthetic */ L0 f(U u3, kotlin.coroutines.f fVar, CoroutineStart coroutineStart, X2.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        if ((i4 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C2319j.d(u3, fVar, coroutineStart, pVar);
    }

    @l3.e
    public static final <T> Object g(@l3.d kotlin.coroutines.f fVar, @l3.d X2.p<? super U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        Object K12;
        Object l4;
        kotlin.coroutines.f e4 = cVar.e();
        kotlin.coroutines.f d4 = M.d(e4, fVar);
        O0.z(d4);
        if (d4 == e4) {
            kotlinx.coroutines.internal.N n4 = new kotlinx.coroutines.internal.N(d4, cVar);
            K12 = j3.b.f(n4, n4, pVar);
        } else {
            d.b bVar = kotlin.coroutines.d.f52046u;
            if (kotlin.jvm.internal.F.g(d4.a(bVar), e4.a(bVar))) {
                y1 y1Var = new y1(d4, cVar);
                Object c4 = kotlinx.coroutines.internal.X.c(d4, null);
                try {
                    Object f4 = j3.b.f(y1Var, y1Var, pVar);
                    kotlinx.coroutines.internal.X.a(d4, c4);
                    K12 = f4;
                } catch (Throwable th) {
                    kotlinx.coroutines.internal.X.a(d4, c4);
                    throw th;
                }
            } else {
                C2289g0 c2289g0 = new C2289g0(d4, cVar);
                j3.a.f(pVar, c2289g0, c2289g0, null, 4, null);
                K12 = c2289g0.K1();
            }
        }
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (K12 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return K12;
    }
}
