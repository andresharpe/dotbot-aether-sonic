package kotlin.coroutines.jvm.internal;

import kotlin.E;
import kotlin.Y;
import kotlin.coroutines.f;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0016J\u0015\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/c;", "", "J", "()Lkotlin/coroutines/c;", "Lkotlin/H0;", "H", "()V", "Lkotlin/coroutines/f;", "F", "Lkotlin/coroutines/f;", "_context", "G", "Lkotlin/coroutines/c;", "intercepted", "e", "()Lkotlin/coroutines/f;", "context", "completion", "<init>", "(Lkotlin/coroutines/c;Lkotlin/coroutines/f;)V", "(Lkotlin/coroutines/c;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@Y(version = "1.3")
@U({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
/* loaded from: classes2.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private final kotlin.coroutines.f f52069F;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private transient kotlin.coroutines.c<Object> f52070G;

    public ContinuationImpl(@l3.e kotlin.coroutines.c<Object> cVar, @l3.e kotlin.coroutines.f fVar) {
        super(cVar);
        this.f52069F = fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void H() {
        kotlin.coroutines.c<?> cVar = this.f52070G;
        if (cVar != null && cVar != this) {
            f.b a4 = e().a(kotlin.coroutines.d.f52046u);
            F.m(a4);
            ((kotlin.coroutines.d) a4).n(cVar);
        }
        this.f52070G = b.f52073E;
    }

    @l3.d
    public final kotlin.coroutines.c<Object> J() {
        kotlin.coroutines.c<Object> cVar = this.f52070G;
        if (cVar == null) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) e().a(kotlin.coroutines.d.f52046u);
            if (dVar == null || (cVar = dVar.v(this)) == null) {
                cVar = this;
            }
            this.f52070G = cVar;
        }
        return cVar;
    }

    @Override // kotlin.coroutines.c
    @l3.d
    public kotlin.coroutines.f e() {
        kotlin.coroutines.f fVar = this.f52069F;
        F.m(fVar);
        return fVar;
    }

    public ContinuationImpl(@l3.e kotlin.coroutines.c<Object> cVar) {
        this(cVar, cVar != null ? cVar.e() : null);
    }
}
