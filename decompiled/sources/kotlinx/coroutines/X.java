package kotlinx.coroutines;

import kotlin.Result;
import kotlinx.coroutines.internal.C2306m;

/* loaded from: classes2.dex */
public final class X {
    @l3.d
    public static final String a(@l3.d Object obj) {
        return obj.getClass().getSimpleName();
    }

    @l3.d
    public static final String b(@l3.d Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @l3.d
    public static final String c(@l3.d kotlin.coroutines.c<?> cVar) {
        Object b4;
        if (cVar instanceof C2306m) {
            return cVar.toString();
        }
        try {
            Result.a aVar = Result.f51807F;
            b4 = Result.b(cVar + '@' + b(cVar));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            b4 = Result.b(kotlin.W.a(th));
        }
        if (Result.e(b4) != null) {
            b4 = cVar.getClass().getName() + '@' + b(cVar);
        }
        return (String) b4;
    }
}
