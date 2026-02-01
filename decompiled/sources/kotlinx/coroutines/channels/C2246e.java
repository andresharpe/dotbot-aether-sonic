package kotlinx.coroutines.channels;

import kotlin.H0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC2234a;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC2239b1;
import kotlinx.coroutines.S0;
import kotlinx.coroutines.U;

/* renamed from: kotlinx.coroutines.channels.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2246e {
    @InterfaceC2239b1
    @l3.d
    public static final <E> J<E> a(@l3.d U u3, @l3.d kotlin.coroutines.f fVar, int i4, @l3.d CoroutineStart coroutineStart, @l3.e X2.l<? super Throwable, H0> lVar, @l3.d X2.p<? super InterfaceC2247f<E>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        C2245d c2245d;
        kotlin.coroutines.f e4 = kotlinx.coroutines.M.e(u3, fVar);
        InterfaceC2254m d4 = p.d(i4, null, null, 6, null);
        if (coroutineStart.g()) {
            c2245d = new y(e4, d4, pVar);
        } else {
            c2245d = new C2245d(e4, d4, true);
        }
        if (lVar != null) {
            ((S0) c2245d).V(lVar);
        }
        ((AbstractC2234a) c2245d).I1(coroutineStart, c2245d, pVar);
        return (J<E>) c2245d;
    }

    public static /* synthetic */ J b(U u3, kotlin.coroutines.f fVar, int i4, CoroutineStart coroutineStart, X2.l lVar, X2.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        kotlin.coroutines.f fVar2 = fVar;
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        int i6 = i4;
        if ((i5 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i5 & 8) != 0) {
            lVar = null;
        }
        return a(u3, fVar2, i6, coroutineStart2, lVar, pVar);
    }
}
