package kotlinx.coroutines.flow.internal;

import kotlin.E;
import kotlin.H0;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.f;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.flow.InterfaceC2283j;

@E(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010#\u001a\u00020\f¢\u0006\u0004\b2\u00103J'\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001a\u001a\u00020\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010#\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010&\u001a\u00020$8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0016R\u0018\u0010(\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\"R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", androidx.exifinterface.media.a.f5, "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/c;", "Lkotlin/coroutines/c;", "Lkotlin/H0;", "uCont", "value", "", "X", "(Lkotlin/coroutines/c;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/f;", "currentContext", "previousContext", "R", "(Lkotlin/coroutines/f;Lkotlin/coroutines/f;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/l;", "exception", "b0", "(Lkotlinx/coroutines/flow/internal/l;Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "I", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "D", "(Ljava/lang/Object;)Ljava/lang/Object;", "H", "()V", "f", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/coroutines/f;", "collectContext", "", "J", "collectContextSize", "K", "lastEmissionContext", "L", "Lkotlin/coroutines/c;", "completion", "q", "()Lkotlin/coroutines/jvm/internal/c;", "callerFrame", "e", "()Lkotlin/coroutines/f;", "context", "<init>", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/f;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class SafeCollector<T> extends ContinuationImpl implements InterfaceC2283j<T>, kotlin.coroutines.jvm.internal.c {

    /* renamed from: H, reason: collision with root package name */
    @W2.f
    @l3.d
    public final InterfaceC2283j<T> f54116H;

    /* renamed from: I, reason: collision with root package name */
    @W2.f
    @l3.d
    public final kotlin.coroutines.f f54117I;

    /* renamed from: J, reason: collision with root package name */
    @W2.f
    public final int f54118J;

    /* renamed from: K, reason: collision with root package name */
    @l3.e
    private kotlin.coroutines.f f54119K;

    /* renamed from: L, reason: collision with root package name */
    @l3.e
    private kotlin.coroutines.c<? super H0> f54120L;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.p<Integer, f.b, Integer> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f54121F = new a();

        a() {
            super(2);
        }

        @l3.d
        public final Integer c(int i4, @l3.d f.b bVar) {
            return Integer.valueOf(i4 + 1);
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ Integer c0(Integer num, f.b bVar) {
            return c(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.f fVar) {
        super(q.f54250E, EmptyCoroutineContext.f52041E);
        this.f54116H = interfaceC2283j;
        this.f54117I = fVar;
        this.f54118J = ((Number) fVar.i(0, a.f54121F)).intValue();
    }

    private final void R(kotlin.coroutines.f fVar, kotlin.coroutines.f fVar2, T t3) {
        if (fVar2 instanceof l) {
            b0((l) fVar2, t3);
        }
        SafeCollector_commonKt.a(this, fVar);
    }

    private final Object X(kotlin.coroutines.c<? super H0> cVar, T t3) {
        Object l4;
        kotlin.coroutines.f e4 = cVar.e();
        O0.z(e4);
        kotlin.coroutines.f fVar = this.f54119K;
        if (fVar != e4) {
            R(e4, fVar, t3);
            this.f54119K = e4;
        }
        this.f54120L = cVar;
        Object z3 = t.a().z(this.f54116H, t3, this);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (!F.g(z3, l4)) {
            this.f54120L = null;
        }
        return z3;
    }

    private final void b0(l lVar, Object obj) {
        String p4;
        p4 = kotlin.text.s.p("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + lVar.f54243E + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(p4.toString());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.d
    public Object D(@l3.d Object obj) {
        Object l4;
        Throwable e4 = Result.e(obj);
        if (e4 != null) {
            this.f54119K = new l(e4, e());
        }
        kotlin.coroutines.c<? super H0> cVar = this.f54120L;
        if (cVar != null) {
            cVar.x(obj);
        }
        l4 = kotlin.coroutines.intrinsics.b.l();
        return l4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void H() {
        super.H();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.c
    @l3.e
    public StackTraceElement I() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.c
    @l3.d
    public kotlin.coroutines.f e() {
        kotlin.coroutines.f fVar = this.f54119K;
        if (fVar == null) {
            return EmptyCoroutineContext.f52041E;
        }
        return fVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2283j
    @l3.e
    public Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object l5;
        try {
            Object X3 = X(cVar, t3);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (X3 == l4) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            l5 = kotlin.coroutines.intrinsics.b.l();
            if (X3 == l5) {
                return X3;
            }
            return H0.f51801a;
        } catch (Throwable th) {
            this.f54119K = new l(th, cVar.e());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.c
    @l3.e
    public kotlin.coroutines.jvm.internal.c q() {
        kotlin.coroutines.c<? super H0> cVar = this.f54120L;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }
}
