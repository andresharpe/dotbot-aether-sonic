package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;

/* renamed from: androidx.core.util.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0761b<T> extends AtomicBoolean implements InterfaceC0764e<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.c<T> f13012E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0761b(@l3.d kotlin.coroutines.c<? super T> continuation) {
        super(false);
        kotlin.jvm.internal.F.p(continuation, "continuation");
        this.f13012E = continuation;
    }

    @Override // androidx.core.util.InterfaceC0764e
    public void accept(T t3) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.c<T> cVar = this.f13012E;
            Result.a aVar = Result.f51807F;
            cVar.x(Result.b(t3));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @l3.d
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
