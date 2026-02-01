package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final D f13931a = new D();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final j f13932b = new j() { // from class: androidx.databinding.C
        @Override // androidx.databinding.j
        public final F a(ViewDataBinding viewDataBinding, int i4, ReferenceQueue referenceQueue) {
            F b4;
            b4 = D.b(viewDataBinding, i4, referenceQueue);
            return b4;
        }
    };

    /* loaded from: classes.dex */
    public static final class a implements y<InterfaceC2282i<? extends Object>> {

        /* renamed from: a, reason: collision with root package name */
        @l3.e
        private WeakReference<androidx.lifecycle.E> f13933a;

        /* renamed from: b, reason: collision with root package name */
        @l3.e
        private L0 f13934b;

        /* renamed from: c, reason: collision with root package name */
        @l3.d
        private final F<InterfaceC2282i<Object>> f13935c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1", f = "ViewDataBindingKtx.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.databinding.D$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0117a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f13936I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.E f13937J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ InterfaceC2282i<Object> f13938K;

            /* renamed from: L, reason: collision with root package name */
            final /* synthetic */ a f13939L;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.d(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1", f = "ViewDataBindingKtx.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.databinding.D$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0118a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

                /* renamed from: I, reason: collision with root package name */
                int f13940I;

                /* renamed from: J, reason: collision with root package name */
                final /* synthetic */ InterfaceC2282i<Object> f13941J;

                /* renamed from: K, reason: collision with root package name */
                final /* synthetic */ a f13942K;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: androidx.databinding.D$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0119a<T> implements InterfaceC2283j {

                    /* renamed from: E, reason: collision with root package name */
                    final /* synthetic */ a f13943E;

                    C0119a(a aVar) {
                        this.f13943E = aVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2283j
                    @l3.e
                    public final Object f(@l3.e Object obj, @l3.d kotlin.coroutines.c<? super H0> cVar) {
                        ViewDataBinding a4 = this.f13943E.f13935c.a();
                        if (a4 != null) {
                            a4.g0(this.f13943E.f13935c.f13952b, this.f13943E.f13935c.b(), 0);
                        }
                        return H0.f51801a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0118a(InterfaceC2282i<? extends Object> interfaceC2282i, a aVar, kotlin.coroutines.c<? super C0118a> cVar) {
                    super(2, cVar);
                    this.f13941J = interfaceC2282i;
                    this.f13942K = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.e
                public final Object D(@l3.d Object obj) {
                    Object l4;
                    l4 = kotlin.coroutines.intrinsics.b.l();
                    int i4 = this.f13940I;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            W.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        W.n(obj);
                        InterfaceC2282i<Object> interfaceC2282i = this.f13941J;
                        C0119a c0119a = new C0119a(this.f13942K);
                        this.f13940I = 1;
                        if (interfaceC2282i.a(c0119a, this) == l4) {
                            return l4;
                        }
                    }
                    return H0.f51801a;
                }

                @Override // X2.p
                @l3.e
                /* renamed from: R, reason: merged with bridge method [inline-methods] */
                public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                    return ((C0118a) v(u3, cVar)).D(H0.f51801a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.d
                public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                    return new C0118a(this.f13941J, this.f13942K, cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0117a(androidx.lifecycle.E e4, InterfaceC2282i<? extends Object> interfaceC2282i, a aVar, kotlin.coroutines.c<? super C0117a> cVar) {
                super(2, cVar);
                this.f13937J = e4;
                this.f13938K = interfaceC2282i;
                this.f13939L = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f13936I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    Lifecycle lifecycle = this.f13937J.getLifecycle();
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    C0118a c0118a = new C0118a(this.f13938K, this.f13939L, null);
                    this.f13936I = 1;
                    if (RepeatOnLifecycleKt.a(lifecycle, state, c0118a, this) == l4) {
                        return l4;
                    }
                }
                return H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((C0117a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new C0117a(this.f13937J, this.f13938K, this.f13939L, cVar);
            }
        }

        public a(@l3.e ViewDataBinding viewDataBinding, int i4, @l3.d ReferenceQueue<ViewDataBinding> referenceQueue) {
            kotlin.jvm.internal.F.p(referenceQueue, "referenceQueue");
            this.f13935c = new F<>(viewDataBinding, i4, this, referenceQueue);
        }

        private final void h(androidx.lifecycle.E e4, InterfaceC2282i<? extends Object> interfaceC2282i) {
            L0 f4;
            L0 l02 = this.f13934b;
            if (l02 != null) {
                L0.a.b(l02, null, 1, null);
            }
            f4 = C2323l.f(androidx.lifecycle.F.a(e4), null, null, new C0117a(e4, interfaceC2282i, this, null), 3, null);
            this.f13934b = f4;
        }

        @Override // androidx.databinding.y
        public void b(@l3.e androidx.lifecycle.E e4) {
            androidx.lifecycle.E e5;
            WeakReference<androidx.lifecycle.E> weakReference = this.f13933a;
            if (weakReference != null) {
                e5 = weakReference.get();
            } else {
                e5 = null;
            }
            if (e5 == e4) {
                return;
            }
            L0 l02 = this.f13934b;
            if (l02 != null) {
                L0.a.b(l02, null, 1, null);
            }
            if (e4 == null) {
                this.f13933a = null;
                return;
            }
            this.f13933a = new WeakReference<>(e4);
            InterfaceC2282i<? extends Object> interfaceC2282i = (InterfaceC2282i) this.f13935c.b();
            if (interfaceC2282i != null) {
                h(e4, interfaceC2282i);
            }
        }

        @Override // androidx.databinding.y
        @l3.d
        public F<InterfaceC2282i<? extends Object>> c() {
            return this.f13935c;
        }

        @Override // androidx.databinding.y
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void e(@l3.e InterfaceC2282i<? extends Object> interfaceC2282i) {
            androidx.lifecycle.E e4;
            WeakReference<androidx.lifecycle.E> weakReference = this.f13933a;
            if (weakReference != null && (e4 = weakReference.get()) != null && interfaceC2282i != null) {
                h(e4, interfaceC2282i);
            }
        }

        @Override // androidx.databinding.y
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(@l3.e InterfaceC2282i<? extends Object> interfaceC2282i) {
            L0 l02 = this.f13934b;
            if (l02 != null) {
                L0.a.b(l02, null, 1, null);
            }
            this.f13934b = null;
        }
    }

    private D() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F b(ViewDataBinding viewDataBinding, int i4, ReferenceQueue referenceQueue) {
        kotlin.jvm.internal.F.m(referenceQueue);
        return new a(viewDataBinding, i4, referenceQueue).c();
    }

    @W2.n
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean c(@l3.d ViewDataBinding viewDataBinding, int i4, @l3.e InterfaceC2282i<?> interfaceC2282i) {
        kotlin.jvm.internal.F.p(viewDataBinding, "viewDataBinding");
        viewDataBinding.f14007U = true;
        try {
            return viewDataBinding.n1(i4, interfaceC2282i, f13932b);
        } finally {
            viewDataBinding.f14007U = false;
        }
    }
}
