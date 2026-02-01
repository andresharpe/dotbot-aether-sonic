package kotlin.coroutines.jvm.internal;

import kotlin.E;
import kotlin.Y;
import kotlin.coroutines.EmptyCoroutineContext;

@E(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/f;", "e", "()Lkotlin/coroutines/f;", "context", "Lkotlin/coroutines/c;", "", "completion", "<init>", "(Lkotlin/coroutines/c;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@Y(version = "1.3")
/* loaded from: classes2.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(@l3.e kotlin.coroutines.c<Object> cVar) {
        super(cVar);
        if (cVar != null && cVar.e() != EmptyCoroutineContext.f52041E) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // kotlin.coroutines.c
    @l3.d
    public kotlin.coroutines.f e() {
        return EmptyCoroutineContext.f52041E;
    }
}
