package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.E;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.Y;
import kotlin.jvm.internal.F;

@E(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b!\u0010\"J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R!\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/c;", "", "Lkotlin/coroutines/jvm/internal/c;", "Ljava/io/Serializable;", "Lkotlin/Result;", "result", "Lkotlin/H0;", "x", "(Ljava/lang/Object;)V", "D", "(Ljava/lang/Object;)Ljava/lang/Object;", "H", "()V", "completion", "y", "(Lkotlin/coroutines/c;)Lkotlin/coroutines/c;", "value", "v", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Lkotlin/coroutines/c;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "I", "()Ljava/lang/StackTraceElement;", androidx.exifinterface.media.a.U4, "Lkotlin/coroutines/c;", androidx.exifinterface.media.a.Y4, "()Lkotlin/coroutines/c;", "q", "()Lkotlin/coroutines/jvm/internal/c;", "callerFrame", "<init>", "(Lkotlin/coroutines/c;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@Y(version = "1.3")
/* loaded from: classes2.dex */
public abstract class BaseContinuationImpl implements kotlin.coroutines.c<Object>, c, Serializable {

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private final kotlin.coroutines.c<Object> f52068E;

    public BaseContinuationImpl(@l3.e kotlin.coroutines.c<Object> cVar) {
        this.f52068E = cVar;
    }

    @l3.e
    public final kotlin.coroutines.c<Object> A() {
        return this.f52068E;
    }

    @l3.e
    protected abstract Object D(@l3.d Object obj);

    protected void H() {
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public StackTraceElement I() {
        return e.e(this);
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public c q() {
        kotlin.coroutines.c<Object> cVar = this.f52068E;
        if (cVar instanceof c) {
            return (c) cVar;
        }
        return null;
    }

    @l3.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object I3 = I();
        if (I3 == null) {
            I3 = getClass().getName();
        }
        sb.append(I3);
        return sb.toString();
    }

    @l3.d
    public kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> completion) {
        F.p(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.c
    public final void x(@l3.d Object obj) {
        Object D3;
        Object l4;
        kotlin.coroutines.c cVar = this;
        while (true) {
            f.b(cVar);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) cVar;
            kotlin.coroutines.c cVar2 = baseContinuationImpl.f52068E;
            F.m(cVar2);
            try {
                D3 = baseContinuationImpl.D(obj);
                l4 = kotlin.coroutines.intrinsics.b.l();
            } catch (Throwable th) {
                Result.a aVar = Result.f51807F;
                obj = Result.b(W.a(th));
            }
            if (D3 == l4) {
                return;
            }
            Result.a aVar2 = Result.f51807F;
            obj = Result.b(D3);
            baseContinuationImpl.H();
            if (cVar2 instanceof BaseContinuationImpl) {
                cVar = cVar2;
            } else {
                cVar2.x(obj);
                return;
            }
        }
    }

    @l3.d
    public kotlin.coroutines.c<H0> y(@l3.d kotlin.coroutines.c<?> completion) {
        F.p(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }
}
