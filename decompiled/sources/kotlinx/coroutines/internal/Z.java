package kotlinx.coroutines.internal;

import kotlin.coroutines.f;

@kotlin.U
/* loaded from: classes2.dex */
public final class Z implements f.c<Y<?>> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final ThreadLocal<?> f54468E;

    public Z(@l3.d ThreadLocal<?> threadLocal) {
        this.f54468E = threadLocal;
    }

    private final ThreadLocal<?> a() {
        return this.f54468E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Z c(Z z3, ThreadLocal threadLocal, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            threadLocal = z3.f54468E;
        }
        return z3.b(threadLocal);
    }

    @l3.d
    public final Z b(@l3.d ThreadLocal<?> threadLocal) {
        return new Z(threadLocal);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Z) && kotlin.jvm.internal.F.g(this.f54468E, ((Z) obj).f54468E);
    }

    public int hashCode() {
        return this.f54468E.hashCode();
    }

    @l3.d
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f54468E + ')';
    }
}
