package androidx.core.util;

import androidx.annotation.W;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.Result;

@W(24)
/* renamed from: androidx.core.util.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0766g<T> extends AtomicBoolean implements Consumer<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.c<T> f13017E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0766g(@l3.d kotlin.coroutines.c<? super T> continuation) {
        super(false);
        kotlin.jvm.internal.F.p(continuation, "continuation");
        this.f13017E = continuation;
    }

    @Override // java.util.function.Consumer
    public void accept(T t3) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.c<T> cVar = this.f13017E;
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
