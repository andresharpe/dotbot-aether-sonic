package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.Result;
import kotlin.V;
import kotlin.W;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC2288g;
import kotlinx.coroutines.C2336s;
import kotlinx.coroutines.C2338t;
import kotlinx.coroutines.InterfaceC2328n0;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.X;
import kotlinx.coroutines.channels.InterfaceC2254m;
import kotlinx.coroutines.channels.o;
import kotlinx.coroutines.channels.q;
import kotlinx.coroutines.internal.C2296c;
import kotlinx.coroutines.internal.C2310q;
import kotlinx.coroutines.internal.C2315w;
import kotlinx.coroutines.internal.C2316x;
import kotlinx.coroutines.internal.C2317y;
import kotlinx.coroutines.internal.C2318z;
import kotlinx.coroutines.internal.Q;
import kotlinx.coroutines.internal.S;

/* renamed from: kotlinx.coroutines.channels.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2242a<E> extends AbstractC2244c<E> implements InterfaceC2254m<E> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.channels.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0477a<E> implements o<E> {

        /* renamed from: a, reason: collision with root package name */
        @W2.f
        @l3.d
        public final AbstractC2242a<E> f53056a;

        /* renamed from: b, reason: collision with root package name */
        @l3.e
        private Object f53057b = C2243b.f53080f;

        public C0477a(@l3.d AbstractC2242a<E> abstractC2242a) {
            this.f53056a = abstractC2242a;
        }

        private final boolean e(Object obj) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (vVar.f53350H == null) {
                    return false;
                }
                throw Q.p(vVar.e1());
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object f(kotlin.coroutines.c<? super Boolean> cVar) {
            kotlin.coroutines.c e4;
            Object l4;
            X2.l<Throwable, H0> lVar;
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            kotlinx.coroutines.r b4 = C2338t.b(e4);
            d dVar = new d(this, b4);
            while (true) {
                if (this.f53056a.b0(dVar)) {
                    this.f53056a.q0(b4, dVar);
                    break;
                }
                Object m02 = this.f53056a.m0();
                g(m02);
                if (m02 instanceof v) {
                    v vVar = (v) m02;
                    if (vVar.f53350H == null) {
                        Result.a aVar = Result.f51807F;
                        b4.x(Result.b(kotlin.coroutines.jvm.internal.a.a(false)));
                    } else {
                        Result.a aVar2 = Result.f51807F;
                        b4.x(Result.b(W.a(vVar.e1())));
                    }
                } else if (m02 != C2243b.f53080f) {
                    Boolean a4 = kotlin.coroutines.jvm.internal.a.a(true);
                    X2.l<E, H0> lVar2 = this.f53056a.f53084E;
                    if (lVar2 != null) {
                        lVar = kotlinx.coroutines.internal.I.a(lVar2, m02, b4.e());
                    } else {
                        lVar = null;
                    }
                    b4.M(a4, lVar);
                }
            }
            Object z3 = b4.z();
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (z3 == l4) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return z3;
        }

        @Override // kotlinx.coroutines.channels.o
        @l3.e
        public Object a(@l3.d kotlin.coroutines.c<? super Boolean> cVar) {
            Object obj = this.f53057b;
            S s4 = C2243b.f53080f;
            if (obj != s4) {
                return kotlin.coroutines.jvm.internal.a.a(e(obj));
            }
            Object m02 = this.f53056a.m0();
            this.f53057b = m02;
            if (m02 != s4) {
                return kotlin.coroutines.jvm.internal.a.a(e(m02));
            }
            return f(cVar);
        }

        @Override // kotlinx.coroutines.channels.o
        @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @W2.i(name = L1.a.f1577e0)
        public /* synthetic */ Object b(kotlin.coroutines.c cVar) {
            return o.a.a(this, cVar);
        }

        @l3.e
        public final Object d() {
            return this.f53057b;
        }

        public final void g(@l3.e Object obj) {
            this.f53057b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.channels.o
        public E next() {
            E e4 = (E) this.f53057b;
            if (!(e4 instanceof v)) {
                S s4 = C2243b.f53080f;
                if (e4 != s4) {
                    this.f53057b = s4;
                    return e4;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw Q.p(((v) e4).e1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.channels.a$b */
    /* loaded from: classes2.dex */
    public static class b<E> extends E<E> {

        /* renamed from: H, reason: collision with root package name */
        @W2.f
        @l3.d
        public final InterfaceC2333q<Object> f53058H;

        /* renamed from: I, reason: collision with root package name */
        @W2.f
        public final int f53059I;

        public b(@l3.d InterfaceC2333q<Object> interfaceC2333q, int i4) {
            this.f53058H = interfaceC2333q;
            this.f53059I = i4;
        }

        @Override // kotlinx.coroutines.channels.G
        public void X(E e4) {
            this.f53058H.t0(C2336s.f54561d);
        }

        @Override // kotlinx.coroutines.channels.E
        public void Z0(@l3.d v<?> vVar) {
            if (this.f53059I == 1) {
                InterfaceC2333q<Object> interfaceC2333q = this.f53058H;
                q b4 = q.b(q.f53131b.a(vVar.f53350H));
                Result.a aVar = Result.f51807F;
                interfaceC2333q.x(Result.b(b4));
                return;
            }
            InterfaceC2333q<Object> interfaceC2333q2 = this.f53058H;
            Result.a aVar2 = Result.f51807F;
            interfaceC2333q2.x(Result.b(W.a(vVar.e1())));
        }

        @l3.e
        public final Object a1(E e4) {
            if (this.f53059I == 1) {
                return q.b(q.f53131b.c(e4));
            }
            return e4;
        }

        @Override // kotlinx.coroutines.channels.G
        @l3.e
        public S o0(E e4, @l3.e C2317y.d dVar) {
            C2317y.a aVar;
            InterfaceC2333q<Object> interfaceC2333q = this.f53058H;
            Object a12 = a1(e4);
            if (dVar != null) {
                aVar = dVar.f54523c;
            } else {
                aVar = null;
            }
            if (interfaceC2333q.j0(a12, aVar, Y0(e4)) == null) {
                return null;
            }
            if (dVar != null) {
                dVar.d();
            }
            return C2336s.f54561d;
        }

        @Override // kotlinx.coroutines.internal.C2317y
        @l3.d
        public String toString() {
            return "ReceiveElement@" + X.b(this) + "[receiveMode=" + this.f53059I + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.channels.a$c */
    /* loaded from: classes2.dex */
    public static final class c<E> extends b<E> {

        /* renamed from: J, reason: collision with root package name */
        @W2.f
        @l3.d
        public final X2.l<E, H0> f53060J;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@l3.d InterfaceC2333q<Object> interfaceC2333q, int i4, @l3.d X2.l<? super E, H0> lVar) {
            super(interfaceC2333q, i4);
            this.f53060J = lVar;
        }

        @Override // kotlinx.coroutines.channels.E
        @l3.e
        public X2.l<Throwable, H0> Y0(E e4) {
            return kotlinx.coroutines.internal.I.a(this.f53060J, e4, this.f53058H.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.channels.a$d */
    /* loaded from: classes2.dex */
    public static class d<E> extends E<E> {

        /* renamed from: H, reason: collision with root package name */
        @W2.f
        @l3.d
        public final C0477a<E> f53061H;

        /* renamed from: I, reason: collision with root package name */
        @W2.f
        @l3.d
        public final InterfaceC2333q<Boolean> f53062I;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@l3.d C0477a<E> c0477a, @l3.d InterfaceC2333q<? super Boolean> interfaceC2333q) {
            this.f53061H = c0477a;
            this.f53062I = interfaceC2333q;
        }

        @Override // kotlinx.coroutines.channels.G
        public void X(E e4) {
            this.f53061H.g(e4);
            this.f53062I.t0(C2336s.f54561d);
        }

        @Override // kotlinx.coroutines.channels.E
        @l3.e
        public X2.l<Throwable, H0> Y0(E e4) {
            X2.l<E, H0> lVar = this.f53061H.f53056a.f53084E;
            if (lVar != null) {
                return kotlinx.coroutines.internal.I.a(lVar, e4, this.f53062I.e());
            }
            return null;
        }

        @Override // kotlinx.coroutines.channels.E
        public void Z0(@l3.d v<?> vVar) {
            Object L3;
            if (vVar.f53350H == null) {
                L3 = InterfaceC2333q.a.b(this.f53062I, Boolean.FALSE, null, 2, null);
            } else {
                L3 = this.f53062I.L(vVar.e1());
            }
            if (L3 != null) {
                this.f53061H.g(vVar);
                this.f53062I.t0(L3);
            }
        }

        @Override // kotlinx.coroutines.channels.G
        @l3.e
        public S o0(E e4, @l3.e C2317y.d dVar) {
            C2317y.a aVar;
            InterfaceC2333q<Boolean> interfaceC2333q = this.f53062I;
            Boolean bool = Boolean.TRUE;
            if (dVar != null) {
                aVar = dVar.f54523c;
            } else {
                aVar = null;
            }
            if (interfaceC2333q.j0(bool, aVar, Y0(e4)) == null) {
                return null;
            }
            if (dVar != null) {
                dVar.d();
            }
            return C2336s.f54561d;
        }

        @Override // kotlinx.coroutines.internal.C2317y
        @l3.d
        public String toString() {
            return "ReceiveHasNext@" + X.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.channels.a$e */
    /* loaded from: classes2.dex */
    public static final class e<R, E> extends E<E> implements InterfaceC2328n0 {

        /* renamed from: H, reason: collision with root package name */
        @W2.f
        @l3.d
        public final AbstractC2242a<E> f53063H;

        /* renamed from: I, reason: collision with root package name */
        @W2.f
        @l3.d
        public final kotlinx.coroutines.selects.f<R> f53064I;

        /* renamed from: J, reason: collision with root package name */
        @W2.f
        @l3.d
        public final X2.p<Object, kotlin.coroutines.c<? super R>, Object> f53065J;

        /* renamed from: K, reason: collision with root package name */
        @W2.f
        public final int f53066K;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@l3.d AbstractC2242a<E> abstractC2242a, @l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.d X2.p<Object, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, int i4) {
            this.f53063H = abstractC2242a;
            this.f53064I = fVar;
            this.f53065J = pVar;
            this.f53066K = i4;
        }

        @Override // kotlinx.coroutines.channels.G
        public void X(E e4) {
            Object obj;
            X2.p<Object, kotlin.coroutines.c<? super R>, Object> pVar = this.f53065J;
            if (this.f53066K == 1) {
                obj = q.b(q.f53131b.c(e4));
            } else {
                obj = e4;
            }
            j3.a.d(pVar, obj, this.f53064I.R(), Y0(e4));
        }

        @Override // kotlinx.coroutines.channels.E
        @l3.e
        public X2.l<Throwable, H0> Y0(E e4) {
            X2.l<E, H0> lVar = this.f53063H.f53084E;
            if (lVar != null) {
                return kotlinx.coroutines.internal.I.a(lVar, e4, this.f53064I.R().e());
            }
            return null;
        }

        @Override // kotlinx.coroutines.channels.E
        public void Z0(@l3.d v<?> vVar) {
            if (!this.f53064I.y()) {
                return;
            }
            int i4 = this.f53066K;
            if (i4 != 0) {
                if (i4 == 1) {
                    j3.a.f(this.f53065J, q.b(q.f53131b.a(vVar.f53350H)), this.f53064I.R(), null, 4, null);
                    return;
                }
                return;
            }
            this.f53064I.e0(vVar.e1());
        }

        @Override // kotlinx.coroutines.InterfaceC2328n0
        public void f() {
            if (Q0()) {
                this.f53063H.k0();
            }
        }

        @Override // kotlinx.coroutines.channels.G
        @l3.e
        public S o0(E e4, @l3.e C2317y.d dVar) {
            return (S) this.f53064I.k(dVar);
        }

        @Override // kotlinx.coroutines.internal.C2317y
        @l3.d
        public String toString() {
            return "ReceiveSelect@" + X.b(this) + '[' + this.f53064I + ",receiveMode=" + this.f53066K + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.channels.a$f */
    /* loaded from: classes2.dex */
    public final class f extends AbstractC2288g {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final E<?> f53067E;

        public f(@l3.d E<?> e4) {
            this.f53067E = e4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        @Override // kotlinx.coroutines.AbstractC2331p
        public void c(@l3.e Throwable th) {
            if (this.f53067E.Q0()) {
                AbstractC2242a.this.k0();
            }
        }

        @l3.d
        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f53067E + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: kotlinx.coroutines.channels.a$g */
    /* loaded from: classes2.dex */
    public static final class g<E> extends C2317y.e<I> {
        public g(@l3.d C2315w c2315w) {
            super(c2315w);
        }

        @Override // kotlinx.coroutines.internal.C2317y.e, kotlinx.coroutines.internal.C2317y.a
        @l3.e
        protected Object e(@l3.d C2317y c2317y) {
            if (!(c2317y instanceof v)) {
                if (!(c2317y instanceof I)) {
                    return C2243b.f53080f;
                }
                return null;
            }
            return c2317y;
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        @l3.e
        public Object j(@l3.d C2317y.d dVar) {
            S a12 = ((I) dVar.f54521a).a1(dVar);
            if (a12 == null) {
                return C2318z.f54528a;
            }
            Object obj = C2296c.f54475b;
            if (a12 == obj) {
                return obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        public void k(@l3.d C2317y c2317y) {
            ((I) c2317y).b1();
        }
    }

    /* renamed from: kotlinx.coroutines.channels.a$h */
    /* loaded from: classes2.dex */
    public static final class h extends C2317y.c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC2242a f53069d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C2317y c2317y, AbstractC2242a abstractC2242a) {
            super(c2317y);
            this.f53069d = abstractC2242a;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2297d
        @l3.e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@l3.d C2317y c2317y) {
            if (this.f53069d.g0()) {
                return null;
            }
            return C2316x.a();
        }
    }

    /* renamed from: kotlinx.coroutines.channels.a$i */
    /* loaded from: classes2.dex */
    public static final class i implements kotlinx.coroutines.selects.d<E> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ AbstractC2242a<E> f53070E;

        i(AbstractC2242a<E> abstractC2242a) {
            this.f53070E = abstractC2242a;
        }

        @Override // kotlinx.coroutines.selects.d
        public <R> void X(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.d X2.p<? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
            this.f53070E.p0(fVar, 0, pVar);
        }
    }

    /* renamed from: kotlinx.coroutines.channels.a$j */
    /* loaded from: classes2.dex */
    public static final class j implements kotlinx.coroutines.selects.d<q<? extends E>> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ AbstractC2242a<E> f53071E;

        j(AbstractC2242a<E> abstractC2242a) {
            this.f53071E = abstractC2242a;
        }

        @Override // kotlinx.coroutines.selects.d
        public <R> void X(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.d X2.p<? super q<? extends E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
            this.f53071E.p0(fVar, 1, pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", i = {}, l = {633}, m = "receiveCatching-JP2dKIU", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.channels.a$k */
    /* loaded from: classes2.dex */
    public static final class k extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f53072H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ AbstractC2242a<E> f53073I;

        /* renamed from: J, reason: collision with root package name */
        int f53074J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(AbstractC2242a<E> abstractC2242a, kotlin.coroutines.c<? super k> cVar) {
            super(cVar);
            this.f53073I = abstractC2242a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            this.f53072H = obj;
            this.f53074J |= Integer.MIN_VALUE;
            Object E3 = this.f53073I.E(this);
            l4 = kotlin.coroutines.intrinsics.b.l();
            return E3 == l4 ? E3 : q.b(E3);
        }
    }

    public AbstractC2242a(@l3.e X2.l<? super E, H0> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b0(E<? super E> e4) {
        boolean c02 = c0(e4);
        if (c02) {
            l0();
        }
        return c02;
    }

    private final <R> boolean d0(kotlinx.coroutines.selects.f<? super R> fVar, X2.p<Object, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, int i4) {
        e eVar = new e(this, fVar, pVar, i4);
        boolean b02 = b0(eVar);
        if (b02) {
            fVar.q0(eVar);
        }
        return b02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Object o0(int i4, kotlin.coroutines.c<? super R> cVar) {
        kotlin.coroutines.c e4;
        b bVar;
        Object l4;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        kotlinx.coroutines.r b4 = C2338t.b(e4);
        if (this.f53084E == null) {
            bVar = new b(b4, i4);
        } else {
            bVar = new c(b4, i4, this.f53084E);
        }
        while (true) {
            if (b0(bVar)) {
                q0(b4, bVar);
                break;
            }
            Object m02 = m0();
            if (m02 instanceof v) {
                bVar.Z0((v) m02);
                break;
            }
            if (m02 != C2243b.f53080f) {
                b4.M(bVar.a1(m02), bVar.Y0(m02));
                break;
            }
        }
        Object z3 = b4.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void p0(kotlinx.coroutines.selects.f<? super R> fVar, int i4, X2.p<Object, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        while (!fVar.J()) {
            if (h0()) {
                if (d0(fVar, pVar, i4)) {
                    return;
                }
            } else {
                Object n02 = n0(fVar);
                if (n02 == kotlinx.coroutines.selects.g.d()) {
                    return;
                }
                if (n02 != C2243b.f53080f && n02 != C2296c.f54475b) {
                    r0(pVar, fVar, i4, n02);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(InterfaceC2333q<?> interfaceC2333q, E<?> e4) {
        interfaceC2333q.u(new f(e4));
    }

    private final <R> void r0(X2.p<Object, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, kotlinx.coroutines.selects.f<? super R> fVar, int i4, Object obj) {
        Object c4;
        boolean z3 = obj instanceof v;
        if (z3) {
            if (i4 != 0) {
                if (i4 != 1 || !fVar.y()) {
                    return;
                }
                j3.b.d(pVar, q.b(q.f53131b.a(((v) obj).f53350H)), fVar.R());
                return;
            }
            throw Q.p(((v) obj).e1());
        }
        if (i4 == 1) {
            q.b bVar = q.f53131b;
            if (z3) {
                c4 = bVar.a(((v) obj).f53350H);
            } else {
                c4 = bVar.c(obj);
            }
            j3.b.d(pVar, q.b(c4), fVar.R());
            return;
        }
        j3.b.d(pVar, obj, fVar.R());
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.e
    @kotlin.internal.h
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @V(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object B(@l3.d kotlin.coroutines.c<? super E> cVar) {
        return InterfaceC2254m.a.e(this, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.channels.F
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(@l3.d kotlin.coroutines.c<? super kotlinx.coroutines.channels.q<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.AbstractC2242a.k
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.a$k r0 = (kotlinx.coroutines.channels.AbstractC2242a.k) r0
            int r1 = r0.f53074J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53074J = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.a$k r0 = new kotlinx.coroutines.channels.a$k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f53072H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53074J
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.W.n(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.W.n(r5)
            java.lang.Object r5 = r4.m0()
            kotlinx.coroutines.internal.S r2 = kotlinx.coroutines.channels.C2243b.f53080f
            if (r5 == r2) goto L52
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.v
            if (r0 == 0) goto L4b
            kotlinx.coroutines.channels.q$b r0 = kotlinx.coroutines.channels.q.f53131b
            kotlinx.coroutines.channels.v r5 = (kotlinx.coroutines.channels.v) r5
            java.lang.Throwable r5 = r5.f53350H
            java.lang.Object r5 = r0.a(r5)
            goto L51
        L4b:
            kotlinx.coroutines.channels.q$b r0 = kotlinx.coroutines.channels.q.f53131b
            java.lang.Object r5 = r0.c(r5)
        L51:
            return r5
        L52:
            r0.f53074J = r3
            java.lang.Object r5 = r4.o0(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.q) r5
            java.lang.Object r5 = r5.o()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractC2242a.E(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.F
    @l3.e
    public final Object N(@l3.d kotlin.coroutines.c<? super E> cVar) {
        Object m02 = m0();
        if (m02 != C2243b.f53080f && !(m02 instanceof v)) {
            return m02;
        }
        return o0(0, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC2244c
    @l3.e
    public G<E> O() {
        G<E> O3 = super.O();
        if (O3 != null && !(O3 instanceof v)) {
            k0();
        }
        return O3;
    }

    @Override // kotlinx.coroutines.channels.F
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final boolean d(@l3.e Throwable th) {
        boolean P3 = P(th);
        i0(P3);
        return P3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final g<E> a0() {
        return new g<>(q());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c0(@l3.d E<? super E> e4) {
        int V02;
        C2317y K02;
        if (f0()) {
            C2317y q4 = q();
            do {
                K02 = q4.K0();
                if (!(!(K02 instanceof I))) {
                    return false;
                }
            } while (!K02.B0(e4, q4));
        } else {
            C2317y q5 = q();
            h hVar = new h(e4, this);
            do {
                C2317y K03 = q5.K0();
                if (!(!(K03 instanceof I))) {
                    return false;
                }
                V02 = K03.V0(e4, q5, hVar);
                if (V02 != 1) {
                }
            } while (V02 != 2);
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.channels.F
    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        f(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e0() {
        return q().J0() instanceof G;
    }

    @Override // kotlinx.coroutines.channels.F
    public final void f(@l3.e CancellationException cancellationException) {
        if (l()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(X.a(this) + " was cancelled");
        }
        d(cancellationException);
    }

    protected abstract boolean f0();

    protected abstract boolean g0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h0() {
        if (!(q().J0() instanceof I) && g0()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i0(boolean z3) {
        v<?> p4 = p();
        if (p4 != null) {
            Object c4 = C2310q.c(null, 1, null);
            while (true) {
                C2317y K02 = p4.K0();
                if (K02 instanceof C2315w) {
                    j0(c4, p4);
                    return;
                } else if (!K02.Q0()) {
                    K02.L0();
                } else {
                    c4 = C2310q.h(c4, (I) K02);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    @Override // kotlinx.coroutines.channels.F
    public boolean isEmpty() {
        return h0();
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.d
    public final o<E> iterator() {
        return new C0477a(this);
    }

    protected void j0(@l3.d Object obj, @l3.d v<?> vVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((I) obj).Z0(vVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((I) arrayList.get(size)).Z0(vVar);
                } else {
                    return;
                }
            }
        }
    }

    protected void k0() {
    }

    @Override // kotlinx.coroutines.channels.F
    public boolean l() {
        if (o() != null && g0()) {
            return true;
        }
        return false;
    }

    protected void l0() {
    }

    @l3.e
    protected Object m0() {
        while (true) {
            I Q3 = Q();
            if (Q3 == null) {
                return C2243b.f53080f;
            }
            if (Q3.a1(null) != null) {
                Q3.X0();
                return Q3.Y0();
            }
            Q3.b1();
        }
    }

    @l3.e
    protected Object n0(@l3.d kotlinx.coroutines.selects.f<?> fVar) {
        g<E> a02 = a0();
        Object g02 = fVar.g0(a02);
        if (g02 != null) {
            return g02;
        }
        a02.o().X0();
        return a02.o().Y0();
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.e
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @V(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return (E) InterfaceC2254m.a.d(this);
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.d
    public final kotlinx.coroutines.selects.d<E> r() {
        return new i(this);
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.d
    public final kotlinx.coroutines.selects.d<q<E>> s() {
        return new j(this);
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.d
    public kotlinx.coroutines.selects.d<E> w() {
        return InterfaceC2254m.a.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.F
    @l3.d
    public final Object y() {
        Object m02 = m0();
        if (m02 == C2243b.f53080f) {
            return q.f53131b.b();
        }
        if (m02 instanceof v) {
            return q.f53131b.a(((v) m02).f53350H);
        }
        return q.f53131b.c(m02);
    }
}
