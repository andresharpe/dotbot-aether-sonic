package androidx.lifecycle;

import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.o1;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final String f15664a = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @l3.d
    public static final kotlinx.coroutines.U a(@l3.d j0 j0Var) {
        kotlin.jvm.internal.F.p(j0Var, "<this>");
        kotlinx.coroutines.U u3 = (kotlinx.coroutines.U) j0Var.r(f15664a);
        if (u3 != null) {
            return u3;
        }
        Object t3 = j0Var.t(f15664a, new C0904f(o1.c(null, 1, null).A(C2322k0.e().o1())));
        kotlin.jvm.internal.F.o(t3, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (kotlinx.coroutines.U) t3;
    }
}
