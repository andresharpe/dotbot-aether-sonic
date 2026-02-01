package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.C2306m;
import kotlinx.coroutines.internal.C2312t;
import kotlinx.coroutines.internal.RunnableC2311s;

/* loaded from: classes2.dex */
public abstract class N extends kotlin.coroutines.a implements kotlin.coroutines.d {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final a f52948F = new a(null);

    @kotlin.r
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.b<kotlin.coroutines.d, N> {

        /* renamed from: kotlinx.coroutines.N$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0474a extends Lambda implements X2.l<f.b, N> {

            /* renamed from: F, reason: collision with root package name */
            public static final C0474a f52949F = new C0474a();

            C0474a() {
                super(1);
            }

            @Override // X2.l
            @l3.e
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final N C(@l3.d f.b bVar) {
                if (bVar instanceof N) {
                    return (N) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
            super(kotlin.coroutines.d.f52046u, C0474a.f52949F);
        }
    }

    public N() {
        super(kotlin.coroutines.d.f52046u);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.f.b, kotlin.coroutines.f
    @l3.e
    public <E extends f.b> E a(@l3.d f.c<E> cVar) {
        return (E) d.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.f.b, kotlin.coroutines.f
    @l3.d
    public kotlin.coroutines.f b(@l3.d f.c<?> cVar) {
        return d.a.c(this, cVar);
    }

    public abstract void h1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable);

    @G0
    public void i1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        h1(fVar, runnable);
    }

    public boolean j1(@l3.d kotlin.coroutines.f fVar) {
        return true;
    }

    @A0
    @l3.d
    public N k1(int i4) {
        C2312t.a(i4);
        return new RunnableC2311s(this, i4);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final N l1(@l3.d N n4) {
        return n4;
    }

    @Override // kotlin.coroutines.d
    public final void n(@l3.d kotlin.coroutines.c<?> cVar) {
        ((C2306m) cVar).v();
    }

    @l3.d
    public String toString() {
        return X.a(this) + '@' + X.b(this);
    }

    @Override // kotlin.coroutines.d
    @l3.d
    public final <T> kotlin.coroutines.c<T> v(@l3.d kotlin.coroutines.c<? super T> cVar) {
        return new C2306m(this, cVar);
    }
}
