package androidx.lifecycle;

import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.o1;

/* loaded from: classes.dex */
public final class C {
    @l3.d
    public static final AbstractC0922y a(@l3.d Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        kotlin.jvm.internal.F.p(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, o1.c(null, 1, null).A(C2322k0.e().m1()));
        } while (!B.a(lifecycle.c(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.k();
        return lifecycleCoroutineScopeImpl;
    }
}
