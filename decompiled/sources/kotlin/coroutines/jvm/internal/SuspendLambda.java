package kotlin.coroutines.jvm.internal;

import kotlin.E;
import kotlin.Y;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;

@E(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004B!\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0012J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/jvm/internal/SuspendLambda;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/jvm/internal/B;", "", "Lkotlin/coroutines/jvm/internal/j;", "", "toString", "()Ljava/lang/String;", "", "H", "I", "g", "()I", "arity", "Lkotlin/coroutines/c;", "completion", "<init>", "(ILkotlin/coroutines/c;)V", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@Y(version = "1.3")
/* loaded from: classes2.dex */
public abstract class SuspendLambda extends ContinuationImpl implements B<Object>, j {

    /* renamed from: H, reason: collision with root package name */
    private final int f52072H;

    public SuspendLambda(int i4, @l3.e kotlin.coroutines.c<Object> cVar) {
        super(cVar);
        this.f52072H = i4;
    }

    @Override // kotlin.jvm.internal.B
    public int g() {
        return this.f52072H;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.d
    public String toString() {
        if (A() == null) {
            String w3 = N.w(this);
            F.o(w3, "renderLambdaToString(...)");
            return w3;
        }
        return super.toString();
    }

    public SuspendLambda(int i4) {
        this(i4, null);
    }
}
