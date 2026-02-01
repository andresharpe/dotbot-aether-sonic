package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.harman.jbl.partybox.ui.effectlab.a;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.L0;

/* loaded from: classes.dex */
public final class U {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {a.c.f43511d}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a<T> extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super T>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f15517I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f15518J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ Lifecycle f15519K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ Lifecycle.State f15520L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super T>, Object> f15521M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Lifecycle lifecycle, Lifecycle.State state, X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f15519K = lifecycle;
            this.f15520L = state;
            this.f15521M = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            C0921x c0921x;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f15517I;
            if (i4 != 0) {
                if (i4 == 1) {
                    c0921x = (C0921x) this.f15518J;
                    try {
                        kotlin.W.n(obj);
                    } catch (Throwable th) {
                        th = th;
                        c0921x.b();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                L0 l02 = (L0) ((kotlinx.coroutines.U) this.f15518J).getCoroutineContext().a(L0.f52941w);
                if (l02 != null) {
                    T t3 = new T();
                    C0921x c0921x2 = new C0921x(this.f15519K, this.f15520L, t3.f15516G, l02);
                    try {
                        X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super T>, Object> pVar = this.f15521M;
                        this.f15518J = c0921x2;
                        this.f15517I = 1;
                        obj = C2319j.h(t3, pVar, this);
                        if (obj == l4) {
                            return l4;
                        }
                        c0921x = c0921x2;
                    } catch (Throwable th2) {
                        th = th2;
                        c0921x = c0921x2;
                        c0921x.b();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
            }
            c0921x.b();
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super T> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(this.f15519K, this.f15520L, this.f15521M, cVar);
            aVar.f15518J = obj;
            return aVar;
        }
    }

    @l3.e
    @InterfaceC2205l(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object a(@l3.d Lifecycle lifecycle, @l3.d X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return g(lifecycle, Lifecycle.State.CREATED, pVar, cVar);
    }

    @l3.e
    @InterfaceC2205l(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object b(@l3.d E e4, @l3.d X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return a(e4.getLifecycle(), pVar, cVar);
    }

    @l3.e
    @InterfaceC2205l(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object c(@l3.d Lifecycle lifecycle, @l3.d X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return g(lifecycle, Lifecycle.State.RESUMED, pVar, cVar);
    }

    @l3.e
    @InterfaceC2205l(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object d(@l3.d E e4, @l3.d X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return c(e4.getLifecycle(), pVar, cVar);
    }

    @l3.e
    @InterfaceC2205l(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object e(@l3.d Lifecycle lifecycle, @l3.d X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return g(lifecycle, Lifecycle.State.STARTED, pVar, cVar);
    }

    @l3.e
    @InterfaceC2205l(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object f(@l3.d E e4, @l3.d X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return e(e4.getLifecycle(), pVar, cVar);
    }

    @l3.e
    @InterfaceC2205l(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object g(@l3.d Lifecycle lifecycle, @l3.d Lifecycle.State state, @l3.d X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return C2319j.h(C2322k0.e().o1(), new a(lifecycle, state, pVar, null), cVar);
    }
}
