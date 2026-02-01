package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@kotlin.E(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.a.f5, "it", ""}, k = 3, mv = {1, 6, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class LintKt$retry$1 extends SuspendLambda implements X2.p<Throwable, kotlin.coroutines.c<? super Boolean>, Object> {

    /* renamed from: I, reason: collision with root package name */
    int f54080I;

    public LintKt$retry$1(kotlin.coroutines.c<? super LintKt$retry$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.e
    public final Object D(@l3.d Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.f54080I == 0) {
            W.n(obj);
            return kotlin.coroutines.jvm.internal.a.a(true);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // X2.p
    @l3.e
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Object c0(@l3.d Throwable th, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
        return ((LintKt$retry$1) v(th, cVar)).D(H0.f51801a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.d
    public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
        return new LintKt$retry$1(cVar);
    }
}
