package kotlinx.coroutines;

import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: kotlinx.coroutines.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2321k {
    public static final <T> T a(@l3.d kotlin.coroutines.f fVar, @l3.d X2.p<? super U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) throws InterruptedException {
        AbstractC2335r0 abstractC2335r0;
        AbstractC2335r0 a4;
        kotlin.coroutines.f e4;
        Thread currentThread = Thread.currentThread();
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) fVar.a(kotlin.coroutines.d.f52046u);
        if (dVar == null) {
            a4 = r1.f54556a.b();
            e4 = M.e(C0.f52916E, fVar.A(a4));
        } else {
            AbstractC2335r0 abstractC2335r02 = null;
            if (dVar instanceof AbstractC2335r0) {
                abstractC2335r0 = (AbstractC2335r0) dVar;
            } else {
                abstractC2335r0 = null;
            }
            if (abstractC2335r0 != null) {
                if (abstractC2335r0.y1()) {
                    abstractC2335r02 = abstractC2335r0;
                }
                if (abstractC2335r02 != null) {
                    a4 = abstractC2335r02;
                    e4 = M.e(C0.f52916E, fVar);
                }
            }
            a4 = r1.f54556a.a();
            e4 = M.e(C0.f52916E, fVar);
        }
        C2290h c2290h = new C2290h(e4, currentThread, a4);
        c2290h.I1(CoroutineStart.DEFAULT, c2290h, pVar);
        return (T) c2290h.J1();
    }

    public static /* synthetic */ Object b(kotlin.coroutines.f fVar, X2.p pVar, int i4, Object obj) throws InterruptedException {
        if ((i4 & 1) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        return C2319j.f(fVar, pVar);
    }
}
