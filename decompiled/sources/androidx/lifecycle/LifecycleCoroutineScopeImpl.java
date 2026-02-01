package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.H0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.Q0;

@kotlin.E(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/A;", "Lkotlin/H0;", "k", "()V", "Landroidx/lifecycle/E;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "f", "(Landroidx/lifecycle/E;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/Lifecycle;", androidx.exifinterface.media.a.U4, "Landroidx/lifecycle/Lifecycle;", "a", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlin/coroutines/f;", "F", "Lkotlin/coroutines/f;", "getCoroutineContext", "()Lkotlin/coroutines/f;", "coroutineContext", "<init>", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/f;)V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC0922y implements A {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Lifecycle f15440E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.f f15441F;

    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15442I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f15443J;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15442I == 0) {
                kotlin.W.n(obj);
                kotlinx.coroutines.U u3 = (kotlinx.coroutines.U) this.f15443J;
                if (LifecycleCoroutineScopeImpl.this.a().b().compareTo(Lifecycle.State.INITIALIZED) < 0) {
                    Q0.i(u3.getCoroutineContext(), null, 1, null);
                } else {
                    LifecycleCoroutineScopeImpl.this.a().a(LifecycleCoroutineScopeImpl.this);
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(cVar);
            aVar.f15443J = obj;
            return aVar;
        }
    }

    public LifecycleCoroutineScopeImpl(@l3.d Lifecycle lifecycle, @l3.d kotlin.coroutines.f coroutineContext) {
        kotlin.jvm.internal.F.p(lifecycle, "lifecycle");
        kotlin.jvm.internal.F.p(coroutineContext, "coroutineContext");
        this.f15440E = lifecycle;
        this.f15441F = coroutineContext;
        if (a().b() == Lifecycle.State.DESTROYED) {
            Q0.i(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.AbstractC0922y
    @l3.d
    public Lifecycle a() {
        return this.f15440E;
    }

    @Override // androidx.lifecycle.A
    public void f(@l3.d E source, @l3.d Lifecycle.Event event) {
        kotlin.jvm.internal.F.p(source, "source");
        kotlin.jvm.internal.F.p(event, "event");
        if (a().b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            a().d(this);
            Q0.i(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // kotlinx.coroutines.U
    @l3.d
    public kotlin.coroutines.f getCoroutineContext() {
        return this.f15441F;
    }

    public final void k() {
        C2319j.e(this, C2322k0.e().o1(), null, new a(null), 2, null);
    }
}
