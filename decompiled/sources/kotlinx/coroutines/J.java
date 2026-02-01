package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: classes2.dex */
public final class J {
    @l3.d
    public static final <T> Object a(@l3.e Object obj, @l3.d kotlin.coroutines.c<? super T> cVar) {
        if (obj instanceof E) {
            Result.a aVar = Result.f51807F;
            return Result.b(kotlin.W.a(((E) obj).f52925a));
        }
        Result.a aVar2 = Result.f51807F;
        return Result.b(obj);
    }

    @l3.e
    public static final <T> Object b(@l3.d Object obj, @l3.e X2.l<? super Throwable, kotlin.H0> lVar) {
        Throwable e4 = Result.e(obj);
        if (e4 == null) {
            if (lVar != null) {
                return new F(obj, lVar);
            }
            return obj;
        }
        return new E(e4, false, 2, null);
    }

    @l3.e
    public static final <T> Object c(@l3.d Object obj, @l3.d InterfaceC2333q<?> interfaceC2333q) {
        Throwable e4 = Result.e(obj);
        if (e4 != null) {
            return new E(e4, false, 2, null);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, X2.l lVar, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
