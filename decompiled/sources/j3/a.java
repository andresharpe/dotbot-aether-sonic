package j3;

import X2.l;
import X2.p;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.internal.C2307n;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class a {
    private static final void a(c<?> cVar, Throwable th) {
        Result.a aVar = Result.f51807F;
        cVar.x(Result.b(W.a(th)));
        throw th;
    }

    private static final void b(c<?> cVar, X2.a<H0> aVar) {
        try {
            aVar.n();
        } catch (Throwable th) {
            a(cVar, th);
        }
    }

    @G0
    public static final <T> void c(@d l<? super c<? super T>, ? extends Object> lVar, @d c<? super T> cVar) {
        c b4;
        c e4;
        try {
            b4 = IntrinsicsKt__IntrinsicsJvmKt.b(lVar, cVar);
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(b4);
            Result.a aVar = Result.f51807F;
            C2307n.g(e4, Result.b(H0.f51801a), null, 2, null);
        } catch (Throwable th) {
            a(cVar, th);
        }
    }

    public static final <R, T> void d(@d p<? super R, ? super c<? super T>, ? extends Object> pVar, R r4, @d c<? super T> cVar, @e l<? super Throwable, H0> lVar) {
        c c4;
        c e4;
        try {
            c4 = IntrinsicsKt__IntrinsicsJvmKt.c(pVar, r4, cVar);
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(c4);
            Result.a aVar = Result.f51807F;
            C2307n.f(e4, Result.b(H0.f51801a), lVar);
        } catch (Throwable th) {
            a(cVar, th);
        }
    }

    public static final void e(@d c<? super H0> cVar, @d c<?> cVar2) {
        c e4;
        try {
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            Result.a aVar = Result.f51807F;
            C2307n.g(e4, Result.b(H0.f51801a), null, 2, null);
        } catch (Throwable th) {
            a(cVar2, th);
        }
    }

    public static /* synthetic */ void f(p pVar, Object obj, c cVar, l lVar, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        d(pVar, obj, cVar, lVar);
    }
}
