package androidx.concurrent.futures;

import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import k1.InterfaceFutureC2077a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class d<V> extends a<V> {
    private d() {
    }

    public static <V> d<V> v() {
        return new d<>();
    }

    @Override // androidx.concurrent.futures.a
    public boolean q(@P V v3) {
        return super.q(v3);
    }

    @Override // androidx.concurrent.futures.a
    public boolean r(Throwable th) {
        return super.r(th);
    }

    @Override // androidx.concurrent.futures.a
    public boolean s(InterfaceFutureC2077a<? extends V> interfaceFutureC2077a) {
        return super.s(interfaceFutureC2077a);
    }
}
