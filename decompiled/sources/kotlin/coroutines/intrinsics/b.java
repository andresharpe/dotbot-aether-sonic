package kotlin.coroutines.intrinsics;

import X2.l;
import kotlin.NotImplementedError;
import kotlin.Y;
import kotlin.coroutines.c;
import kotlin.internal.f;
import l3.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class b extends IntrinsicsKt__IntrinsicsJvmKt {
    @d
    public static Object l() {
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Y(version = "1.3")
    public static /* synthetic */ void m() {
    }

    @Y(version = "1.3")
    @f
    private static final <T> Object n(l<? super c<? super T>, ? extends Object> lVar, c<? super T> cVar) {
        throw new NotImplementedError("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic");
    }
}
