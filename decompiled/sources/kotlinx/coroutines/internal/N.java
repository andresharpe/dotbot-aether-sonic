package kotlinx.coroutines.internal;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.AbstractC2234a;
import kotlinx.coroutines.InterfaceC2344w;
import kotlinx.coroutines.L0;

/* loaded from: classes2.dex */
public class N<T> extends AbstractC2234a<T> implements kotlin.coroutines.jvm.internal.c {

    /* renamed from: G, reason: collision with root package name */
    @W2.f
    @l3.d
    public final kotlin.coroutines.c<T> f54448G;

    /* JADX WARN: Multi-variable type inference failed */
    public N(@l3.d kotlin.coroutines.f fVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        super(fVar, true, true);
        this.f54448G = cVar;
    }

    @Override // kotlinx.coroutines.AbstractC2234a
    protected void E1(@l3.e Object obj) {
        kotlin.coroutines.c<T> cVar = this.f54448G;
        cVar.x(kotlinx.coroutines.J.a(obj, cVar));
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public final StackTraceElement I() {
        return null;
    }

    @l3.e
    public final L0 J1() {
        InterfaceC2344w O02 = O0();
        if (O02 != null) {
            return O02.getParent();
        }
        return null;
    }

    @Override // kotlinx.coroutines.S0
    protected final boolean V0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.S0
    public void h0(@l3.e Object obj) {
        kotlin.coroutines.c e4;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(this.f54448G);
        C2307n.g(e4, kotlinx.coroutines.J.a(obj, this.f54448G), null, 2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public final kotlin.coroutines.jvm.internal.c q() {
        kotlin.coroutines.c<T> cVar = this.f54448G;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }
}
