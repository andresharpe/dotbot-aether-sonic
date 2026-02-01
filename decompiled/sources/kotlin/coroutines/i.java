package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.U;
import kotlin.Y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@U
@Y(version = "1.3")
/* loaded from: classes2.dex */
public final class i<T> implements c<T>, kotlin.coroutines.jvm.internal.c {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private static final a f52051F = new a(null);

    /* renamed from: G, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<i<?>, Object> f52052G = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final c<T> f52053E;

    @l3.e
    private volatile Object result;

    /* loaded from: classes2.dex */
    private static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private static /* synthetic */ void a() {
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@l3.d c<? super T> delegate, @l3.e Object obj) {
        F.p(delegate, "delegate");
        this.f52053E = delegate;
        this.result = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public StackTraceElement I() {
        return null;
    }

    @l3.e
    @U
    public final Object a() {
        Object l4;
        Object l5;
        Object l6;
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater = f52052G;
            l5 = kotlin.coroutines.intrinsics.b.l();
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, coroutineSingletons, l5)) {
                l6 = kotlin.coroutines.intrinsics.b.l();
                return l6;
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            l4 = kotlin.coroutines.intrinsics.b.l();
            return l4;
        }
        if (!(obj instanceof Result.Failure)) {
            return obj;
        }
        throw ((Result.Failure) obj).f51809E;
    }

    @Override // kotlin.coroutines.c
    @l3.d
    public f e() {
        return this.f52053E.e();
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public kotlin.coroutines.jvm.internal.c q() {
        c<T> cVar = this.f52053E;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @l3.d
    public String toString() {
        return "SafeContinuation for " + this.f52053E;
    }

    @Override // kotlin.coroutines.c
    public void x(@l3.d Object obj) {
        Object l4;
        Object l5;
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 != coroutineSingletons) {
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (obj2 == l4) {
                    AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater = f52052G;
                    l5 = kotlin.coroutines.intrinsics.b.l();
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, l5, CoroutineSingletons.RESUMED)) {
                        this.f52053E.x(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            } else if (androidx.concurrent.futures.b.a(f52052G, this, coroutineSingletons, obj)) {
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @U
    public i(@l3.d c<? super T> delegate) {
        this(delegate, CoroutineSingletons.UNDECIDED);
        F.p(delegate, "delegate");
    }
}
