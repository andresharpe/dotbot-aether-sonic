package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlin.collections.C2100o;
import kotlin.collections.C2101p;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.X;
import kotlinx.coroutines.InterfaceC2239b1;
import kotlinx.coroutines.channels.InterfaceC2250i;
import kotlinx.coroutines.internal.S;

@InterfaceC2239b1
/* loaded from: classes2.dex */
public final class w<E> implements InterfaceC2250i<E> {

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f53352F;

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f53353G;

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f53354H;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    @Deprecated
    private static final S f53356J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    @Deprecated
    private static final c<Object> f53357K;

    @l3.d
    private volatile /* synthetic */ Object _state;

    @l3.d
    private volatile /* synthetic */ int _updating;

    @l3.d
    private volatile /* synthetic */ Object onCloseHandler;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private static final b f53351E = new b(null);

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    @Deprecated
    private static final a f53355I = new a(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @W2.f
        @l3.e
        public final Throwable f53358a;

        public a(@l3.e Throwable th) {
            this.f53358a = th;
        }

        @l3.d
        public final Throwable a() {
            Throwable th = this.f53358a;
            if (th == null) {
                return new ClosedSendChannelException(r.f53135a);
            }
            return th;
        }

        @l3.d
        public final Throwable b() {
            Throwable th = this.f53358a;
            if (th == null) {
                return new IllegalStateException(r.f53135a);
            }
            return th;
        }
    }

    /* loaded from: classes2.dex */
    private static final class b {
        public /* synthetic */ b(C2197u c2197u) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c<E> {

        /* renamed from: a, reason: collision with root package name */
        @W2.f
        @l3.e
        public final Object f53359a;

        /* renamed from: b, reason: collision with root package name */
        @W2.f
        @l3.e
        public final d<E>[] f53360b;

        public c(@l3.e Object obj, @l3.e d<E>[] dVarArr) {
            this.f53359a = obj;
            this.f53360b = dVarArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class d<E> extends x<E> implements F<E> {

        /* renamed from: J, reason: collision with root package name */
        @l3.d
        private final w<E> f53361J;

        public d(@l3.d w<E> wVar) {
            super(null);
            this.f53361J = wVar;
        }

        @Override // kotlinx.coroutines.channels.x, kotlinx.coroutines.channels.AbstractC2244c
        @l3.d
        public Object G(E e4) {
            return super.G(e4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.coroutines.channels.x, kotlinx.coroutines.channels.AbstractC2242a
        public void i0(boolean z3) {
            if (z3) {
                this.f53361J.e(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements kotlinx.coroutines.selects.e<E, J<? super E>> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ w<E> f53362E;

        e(w<E> wVar) {
            this.f53362E = wVar;
        }

        @Override // kotlinx.coroutines.selects.e
        public <R> void C(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, E e4, @l3.d X2.p<? super J<? super E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
            this.f53362E.n(fVar, e4, pVar);
        }
    }

    static {
        S s4 = new S("UNDEFINED");
        f53356J = s4;
        f53357K = new c<>(s4, null);
        f53352F = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_state");
        f53353G = AtomicIntegerFieldUpdater.newUpdater(w.class, "_updating");
        f53354H = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "onCloseHandler");
    }

    public w() {
        this._state = f53357K;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    private final d<E>[] c(d<E>[] dVarArr, d<E> dVar) {
        Object[] w3;
        if (dVarArr != null) {
            w3 = C2100o.w3(dVarArr, dVar);
            return (d[]) w3;
        }
        return new d[]{dVar};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(d<E> dVar) {
        Object obj;
        Object obj2;
        d<E>[] dVarArr;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                obj2 = cVar.f53359a;
                dVarArr = cVar.f53360b;
                kotlin.jvm.internal.F.m(dVarArr);
            } else {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f53352F, this, obj, new c(obj2, o(dVarArr, dVar))));
    }

    public static /* synthetic */ void j() {
    }

    private final void l(Throwable th) {
        S s4;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (s4 = C2243b.f53082h) && androidx.concurrent.futures.b.a(f53354H, this, obj, s4)) {
            ((X2.l) X.q(obj, 1)).C(th);
        }
    }

    private final a m(E e4) {
        Object obj;
        if (!f53353G.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof a) {
                    return (a) obj;
                }
                if (!(obj instanceof c)) {
                    throw new IllegalStateException(("Invalid state " + obj).toString());
                }
            } finally {
                this._updating = 0;
            }
        } while (!androidx.concurrent.futures.b.a(f53352F, this, obj, new c(e4, ((c) obj).f53360b)));
        d<E>[] dVarArr = ((c) obj).f53360b;
        if (dVarArr != null) {
            for (d<E> dVar : dVarArr) {
                dVar.G(e4);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void n(kotlinx.coroutines.selects.f<? super R> fVar, E e4, X2.p<? super J<? super E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        if (!fVar.y()) {
            return;
        }
        a m4 = m(e4);
        if (m4 != null) {
            fVar.e0(m4.a());
        } else {
            j3.b.d(pVar, this, fVar.R());
        }
    }

    private final d<E>[] o(d<E>[] dVarArr, d<E> dVar) {
        int If;
        int length = dVarArr.length;
        If = C2101p.If(dVarArr, dVar);
        if (length == 1) {
            return null;
        }
        d<E>[] dVarArr2 = new d[length - 1];
        C2100o.K0(dVarArr, dVarArr2, 0, 0, If, 6, null);
        C2100o.K0(dVarArr, dVarArr2, If, If + 1, 0, 8, null);
        return dVarArr2;
    }

    @Override // kotlinx.coroutines.channels.J
    @l3.d
    public kotlinx.coroutines.selects.e<E, J<E>> K() {
        return new e(this);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC2250i
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public boolean d(@l3.e Throwable th) {
        Object obj;
        int i4;
        a aVar;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return false;
            }
            if (obj instanceof c) {
                if (th == null) {
                    aVar = f53355I;
                } else {
                    aVar = new a(th);
                }
            } else {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f53352F, this, obj, aVar));
        d<E>[] dVarArr = ((c) obj).f53360b;
        if (dVarArr != null) {
            for (d<E> dVar : dVarArr) {
                dVar.d(th);
            }
        }
        l(th);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.InterfaceC2250i
    @l3.d
    public F<E> R() {
        Object obj;
        c cVar;
        d dVar = new d(this);
        do {
            obj = this._state;
            if (obj instanceof a) {
                dVar.d(((a) obj).f53358a);
                return dVar;
            }
            if (obj instanceof c) {
                cVar = (c) obj;
                Object obj2 = cVar.f53359a;
                if (obj2 != f53356J) {
                    dVar.G(obj2);
                }
            } else {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f53352F, this, obj, new c(cVar.f53359a, c(cVar.f53360b, dVar))));
        return dVar;
    }

    @Override // kotlinx.coroutines.channels.J
    @l3.d
    public Object S(E e4) {
        a m4 = m(e4);
        if (m4 != null) {
            return q.f53131b.a(m4.a());
        }
        return q.f53131b.c(H0.f51801a);
    }

    @Override // kotlinx.coroutines.channels.J
    @l3.e
    public Object U(E e4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        a m4 = m(e4);
        if (m4 == null) {
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (l4 == null) {
                return null;
            }
            return H0.f51801a;
        }
        throw m4.a();
    }

    @Override // kotlinx.coroutines.channels.J
    public boolean W() {
        return this._state instanceof a;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC2250i
    public void f(@l3.e CancellationException cancellationException) {
        d(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.J
    public void g(@l3.d X2.l<? super Throwable, H0> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f53354H;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, lVar)) {
            Object obj = this.onCloseHandler;
            if (obj == C2243b.f53082h) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        Object obj2 = this._state;
        if ((obj2 instanceof a) && androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, lVar, C2243b.f53082h)) {
            lVar.C(((a) obj2).f53358a);
        }
    }

    public final E i() {
        Object obj = this._state;
        if (!(obj instanceof a)) {
            if (obj instanceof c) {
                E e4 = (E) ((c) obj).f53359a;
                if (e4 != f53356J) {
                    return e4;
                }
                throw new IllegalStateException("No value");
            }
            throw new IllegalStateException(("Invalid state " + obj).toString());
        }
        throw ((a) obj).b();
    }

    @l3.e
    public final E k() {
        Object obj = this._state;
        if (obj instanceof a) {
            return null;
        }
        if (obj instanceof c) {
            S s4 = f53356J;
            E e4 = (E) ((c) obj).f53359a;
            if (e4 == s4) {
                return null;
            }
            return e4;
        }
        throw new IllegalStateException(("Invalid state " + obj).toString());
    }

    @Override // kotlinx.coroutines.channels.J
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @V(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e4) {
        return InterfaceC2250i.a.c(this, e4);
    }

    public w(E e4) {
        this();
        f53352F.lazySet(this, new c(e4, null));
    }
}
