package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C2210p;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.C2336s;
import kotlinx.coroutines.C2338t;
import kotlinx.coroutines.InterfaceC2328n0;
import kotlinx.coroutines.X;
import kotlinx.coroutines.channels.J;
import kotlinx.coroutines.internal.C2296c;
import kotlinx.coroutines.internal.C2310q;
import kotlinx.coroutines.internal.C2315w;
import kotlinx.coroutines.internal.C2316x;
import kotlinx.coroutines.internal.C2317y;
import kotlinx.coroutines.internal.C2318z;
import kotlinx.coroutines.internal.Q;
import kotlinx.coroutines.internal.S;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* renamed from: kotlinx.coroutines.channels.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2244c<E> implements J<E> {

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f53083G = AtomicReferenceFieldUpdater.newUpdater(AbstractC2244c.class, Object.class, "onCloseHandler");

    /* renamed from: E, reason: collision with root package name */
    @W2.f
    @l3.e
    protected final X2.l<E, H0> f53084E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final C2315w f53085F = new C2315w();

    @l3.d
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* renamed from: kotlinx.coroutines.channels.c$a */
    /* loaded from: classes2.dex */
    public static final class a<E> extends I {

        /* renamed from: H, reason: collision with root package name */
        @W2.f
        public final E f53086H;

        public a(E e4) {
            this.f53086H = e4;
        }

        @Override // kotlinx.coroutines.channels.I
        public void X0() {
        }

        @Override // kotlinx.coroutines.channels.I
        @l3.e
        public Object Y0() {
            return this.f53086H;
        }

        @Override // kotlinx.coroutines.channels.I
        public void Z0(@l3.d v<?> vVar) {
        }

        @Override // kotlinx.coroutines.channels.I
        @l3.e
        public S a1(@l3.e C2317y.d dVar) {
            S s4 = C2336s.f54561d;
            if (dVar != null) {
                dVar.d();
            }
            return s4;
        }

        @Override // kotlinx.coroutines.internal.C2317y
        @l3.d
        public String toString() {
            return "SendBuffered@" + X.b(this) + '(' + this.f53086H + ')';
        }
    }

    /* renamed from: kotlinx.coroutines.channels.c$b */
    /* loaded from: classes2.dex */
    private static class b<E> extends C2317y.b<a<? extends E>> {
        public b(@l3.d C2315w c2315w, E e4) {
            super(c2315w, new a(e4));
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        @l3.e
        protected Object e(@l3.d C2317y c2317y) {
            if (!(c2317y instanceof v)) {
                if (c2317y instanceof G) {
                    return C2243b.f53079e;
                }
                return null;
            }
            return c2317y;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.channels.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0478c<E, R> extends I implements InterfaceC2328n0 {

        /* renamed from: H, reason: collision with root package name */
        private final E f53087H;

        /* renamed from: I, reason: collision with root package name */
        @W2.f
        @l3.d
        public final AbstractC2244c<E> f53088I;

        /* renamed from: J, reason: collision with root package name */
        @W2.f
        @l3.d
        public final kotlinx.coroutines.selects.f<R> f53089J;

        /* renamed from: K, reason: collision with root package name */
        @W2.f
        @l3.d
        public final X2.p<J<? super E>, kotlin.coroutines.c<? super R>, Object> f53090K;

        /* JADX WARN: Multi-variable type inference failed */
        public C0478c(E e4, @l3.d AbstractC2244c<E> abstractC2244c, @l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.d X2.p<? super J<? super E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
            this.f53087H = e4;
            this.f53088I = abstractC2244c;
            this.f53089J = fVar;
            this.f53090K = pVar;
        }

        @Override // kotlinx.coroutines.channels.I
        public void X0() {
            j3.a.f(this.f53090K, this.f53088I, this.f53089J.R(), null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.I
        public E Y0() {
            return this.f53087H;
        }

        @Override // kotlinx.coroutines.channels.I
        public void Z0(@l3.d v<?> vVar) {
            if (this.f53089J.y()) {
                this.f53089J.e0(vVar.f1());
            }
        }

        @Override // kotlinx.coroutines.channels.I
        @l3.e
        public S a1(@l3.e C2317y.d dVar) {
            return (S) this.f53089J.k(dVar);
        }

        @Override // kotlinx.coroutines.channels.I
        public void b1() {
            X2.l<E, H0> lVar = this.f53088I.f53084E;
            if (lVar != null) {
                kotlinx.coroutines.internal.I.b(lVar, Y0(), this.f53089J.R().e());
            }
        }

        @Override // kotlinx.coroutines.InterfaceC2328n0
        public void f() {
            if (!Q0()) {
                return;
            }
            b1();
        }

        @Override // kotlinx.coroutines.internal.C2317y
        @l3.d
        public String toString() {
            return "SendSelect@" + X.b(this) + '(' + Y0() + ")[" + this.f53088I + ", " + this.f53089J + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: kotlinx.coroutines.channels.c$d */
    /* loaded from: classes2.dex */
    public static final class d<E> extends C2317y.e<G<? super E>> {

        /* renamed from: e, reason: collision with root package name */
        @W2.f
        public final E f53091e;

        public d(E e4, @l3.d C2315w c2315w) {
            super(c2315w);
            this.f53091e = e4;
        }

        @Override // kotlinx.coroutines.internal.C2317y.e, kotlinx.coroutines.internal.C2317y.a
        @l3.e
        protected Object e(@l3.d C2317y c2317y) {
            if (!(c2317y instanceof v)) {
                if (!(c2317y instanceof G)) {
                    return C2243b.f53079e;
                }
                return null;
            }
            return c2317y;
        }

        @Override // kotlinx.coroutines.internal.C2317y.a
        @l3.e
        public Object j(@l3.d C2317y.d dVar) {
            S o02 = ((G) dVar.f54521a).o0(this.f53091e, dVar);
            if (o02 == null) {
                return C2318z.f54528a;
            }
            Object obj = C2296c.f54475b;
            if (o02 == obj) {
                return obj;
            }
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.channels.c$e */
    /* loaded from: classes2.dex */
    public static final class e extends C2317y.c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC2244c f53092d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C2317y c2317y, AbstractC2244c abstractC2244c) {
            super(c2317y);
            this.f53092d = abstractC2244c;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2297d
        @l3.e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@l3.d C2317y c2317y) {
            if (this.f53092d.D()) {
                return null;
            }
            return C2316x.a();
        }
    }

    /* renamed from: kotlinx.coroutines.channels.c$f */
    /* loaded from: classes2.dex */
    public static final class f implements kotlinx.coroutines.selects.e<E, J<? super E>> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ AbstractC2244c<E> f53093E;

        f(AbstractC2244c<E> abstractC2244c) {
            this.f53093E = abstractC2244c;
        }

        @Override // kotlinx.coroutines.selects.e
        public <R> void C(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, E e4, @l3.d X2.p<? super J<? super E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
            this.f53093E.J(fVar, e4, pVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2244c(@l3.e X2.l<? super E, H0> lVar) {
        this.f53084E = lVar;
    }

    private final void A(Throwable th) {
        S s4;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (s4 = C2243b.f53082h) && androidx.concurrent.futures.b.a(f53083G, this, obj, s4)) {
            ((X2.l) kotlin.jvm.internal.X.q(obj, 1)).C(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F() {
        if (!(this.f53085F.J0() instanceof G) && D()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void J(kotlinx.coroutines.selects.f<? super R> fVar, E e4, X2.p<? super J<? super E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        while (!fVar.J()) {
            if (F()) {
                C0478c c0478c = new C0478c(e4, this, fVar, pVar);
                Object m4 = m(c0478c);
                if (m4 == null) {
                    fVar.q0(c0478c);
                    return;
                }
                if (!(m4 instanceof v)) {
                    if (m4 != C2243b.f53081g && !(m4 instanceof E)) {
                        throw new IllegalStateException(("enqueueSend returned " + m4 + ' ').toString());
                    }
                } else {
                    throw Q.p(v(e4, (v) m4));
                }
            }
            Object H3 = H(e4, fVar);
            if (H3 == kotlinx.coroutines.selects.g.d()) {
                return;
            }
            if (H3 != C2243b.f53079e && H3 != C2296c.f54475b) {
                if (H3 == C2243b.f53078d) {
                    j3.b.d(pVar, this, fVar.R());
                    return;
                } else {
                    if (H3 instanceof v) {
                        throw Q.p(v(e4, (v) H3));
                    }
                    throw new IllegalStateException(("offerSelectInternal returned " + H3).toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M(E e4, kotlin.coroutines.c<? super H0> cVar) {
        kotlin.coroutines.c e5;
        Object l4;
        Object l5;
        I l6;
        e5 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        kotlinx.coroutines.r b4 = C2338t.b(e5);
        while (true) {
            if (F()) {
                if (this.f53084E == null) {
                    l6 = new K(e4, b4);
                } else {
                    l6 = new L(e4, b4, this.f53084E);
                }
                Object m4 = m(l6);
                if (m4 == null) {
                    C2338t.c(b4, l6);
                    break;
                }
                if (m4 instanceof v) {
                    z(b4, e4, (v) m4);
                    break;
                }
                if (m4 != C2243b.f53081g && !(m4 instanceof E)) {
                    throw new IllegalStateException(("enqueueSend returned " + m4).toString());
                }
            }
            Object G3 = G(e4);
            if (G3 == C2243b.f53078d) {
                Result.a aVar = Result.f51807F;
                b4.x(Result.b(H0.f51801a));
                break;
            }
            if (G3 != C2243b.f53079e) {
                if (G3 instanceof v) {
                    z(b4, e4, (v) G3);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + G3).toString());
                }
            }
        }
        Object z3 = b4.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        l5 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l5) {
            return z3;
        }
        return H0.f51801a;
    }

    private final int i() {
        C2315w c2315w = this.f53085F;
        int i4 = 0;
        for (C2317y c2317y = (C2317y) c2315w.I0(); !kotlin.jvm.internal.F.g(c2317y, c2315w); c2317y = c2317y.J0()) {
            if (c2317y instanceof C2317y) {
                i4++;
            }
        }
        return i4;
    }

    private final String t() {
        String str;
        C2317y J02 = this.f53085F.J0();
        if (J02 == this.f53085F) {
            return "EmptyQueue";
        }
        if (J02 instanceof v) {
            str = J02.toString();
        } else if (J02 instanceof E) {
            str = "ReceiveQueued";
        } else if (J02 instanceof I) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + J02;
        }
        C2317y K02 = this.f53085F.K0();
        if (K02 != J02) {
            String str2 = str + ",queueSize=" + i();
            if (K02 instanceof v) {
                return str2 + ",closedForSend=" + K02;
            }
            return str2;
        }
        return str;
    }

    private final void u(v<?> vVar) {
        E e4;
        Object c4 = C2310q.c(null, 1, null);
        while (true) {
            C2317y K02 = vVar.K0();
            if (K02 instanceof E) {
                e4 = (E) K02;
            } else {
                e4 = null;
            }
            if (e4 == null) {
                break;
            } else if (!e4.Q0()) {
                e4.L0();
            } else {
                c4 = C2310q.h(c4, e4);
            }
        }
        if (c4 != null) {
            if (!(c4 instanceof ArrayList)) {
                ((E) c4).Z0(vVar);
            } else {
                ArrayList arrayList = (ArrayList) c4;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((E) arrayList.get(size)).Z0(vVar);
                }
            }
        }
        I(vVar);
    }

    private final Throwable v(E e4, v<?> vVar) {
        UndeliveredElementException d4;
        u(vVar);
        X2.l<E, H0> lVar = this.f53084E;
        if (lVar != null && (d4 = kotlinx.coroutines.internal.I.d(lVar, e4, null, 2, null)) != null) {
            C2210p.a(d4, vVar.f1());
            throw d4;
        }
        return vVar.f1();
    }

    private final Throwable x(v<?> vVar) {
        u(vVar);
        return vVar.f1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(kotlin.coroutines.c<?> cVar, E e4, v<?> vVar) {
        UndeliveredElementException d4;
        u(vVar);
        Throwable f12 = vVar.f1();
        X2.l<E, H0> lVar = this.f53084E;
        if (lVar != null && (d4 = kotlinx.coroutines.internal.I.d(lVar, e4, null, 2, null)) != null) {
            C2210p.a(d4, f12);
            Result.a aVar = Result.f51807F;
            cVar.x(Result.b(W.a(d4)));
        } else {
            Result.a aVar2 = Result.f51807F;
            cVar.x(Result.b(W.a(f12)));
        }
    }

    protected abstract boolean C();

    protected abstract boolean D();

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public Object G(E e4) {
        G<E> O3;
        do {
            O3 = O();
            if (O3 == null) {
                return C2243b.f53079e;
            }
        } while (O3.o0(e4, null) == null);
        O3.X(e4);
        return O3.v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public Object H(E e4, @l3.d kotlinx.coroutines.selects.f<?> fVar) {
        d<E> k4 = k(e4);
        Object g02 = fVar.g0(k4);
        if (g02 != null) {
            return g02;
        }
        G<? super E> o4 = k4.o();
        o4.X(e4);
        return o4.v();
    }

    protected void I(@l3.d C2317y c2317y) {
    }

    @Override // kotlinx.coroutines.channels.J
    @l3.d
    public final kotlinx.coroutines.selects.e<E, J<E>> K() {
        return new f(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @l3.e
    public final G<?> L(E e4) {
        C2317y K02;
        C2315w c2315w = this.f53085F;
        a aVar = new a(e4);
        do {
            K02 = c2315w.K0();
            if (K02 instanceof G) {
                return (G) K02;
            }
        } while (!K02.B0(aVar, c2315w));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.y] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    @l3.e
    public G<E> O() {
        ?? r12;
        C2317y T02;
        C2315w c2315w = this.f53085F;
        while (true) {
            r12 = (C2317y) c2315w.I0();
            if (r12 != c2315w && (r12 instanceof G)) {
                if (((((G) r12) instanceof v) && !r12.N0()) || (T02 = r12.T0()) == null) {
                    break;
                }
                T02.M0();
            }
        }
        r12 = 0;
        return (G) r12;
    }

    @Override // kotlinx.coroutines.channels.J
    /* renamed from: P */
    public boolean d(@l3.e Throwable th) {
        boolean z3;
        v<?> vVar = new v<>(th);
        C2317y c2317y = this.f53085F;
        while (true) {
            C2317y K02 = c2317y.K0();
            z3 = true;
            if (!(!(K02 instanceof v))) {
                z3 = false;
                break;
            }
            if (K02.B0(vVar, c2317y)) {
                break;
            }
        }
        if (!z3) {
            vVar = (v) this.f53085F.K0();
        }
        u(vVar);
        if (z3) {
            A(th);
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.e
    public final I Q() {
        C2317y c2317y;
        C2317y T02;
        C2315w c2315w = this.f53085F;
        while (true) {
            c2317y = (C2317y) c2315w.I0();
            if (c2317y != c2315w && (c2317y instanceof I)) {
                if (((((I) c2317y) instanceof v) && !c2317y.N0()) || (T02 = c2317y.T0()) == null) {
                    break;
                }
                T02.M0();
            }
        }
        c2317y = null;
        return (I) c2317y;
    }

    @Override // kotlinx.coroutines.channels.J
    @l3.d
    public final Object S(E e4) {
        Object G3 = G(e4);
        if (G3 == C2243b.f53078d) {
            return q.f53131b.c(H0.f51801a);
        }
        if (G3 == C2243b.f53079e) {
            v<?> p4 = p();
            if (p4 == null) {
                return q.f53131b.b();
            }
            return q.f53131b.a(x(p4));
        }
        if (G3 instanceof v) {
            return q.f53131b.a(x((v) G3));
        }
        throw new IllegalStateException(("trySend returned " + G3).toString());
    }

    @Override // kotlinx.coroutines.channels.J
    @l3.e
    public final Object U(E e4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        if (G(e4) == C2243b.f53078d) {
            return H0.f51801a;
        }
        Object M3 = M(e4, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (M3 == l4) {
            return M3;
        }
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.channels.J
    public final boolean W() {
        if (p() != null) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.channels.J
    public void g(@l3.d X2.l<? super Throwable, H0> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f53083G;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, lVar)) {
            Object obj = this.onCloseHandler;
            if (obj == C2243b.f53082h) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        v<?> p4 = p();
        if (p4 != null && androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, lVar, C2243b.f53082h)) {
            lVar.C(p4.f53350H);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final C2317y.b<?> j(E e4) {
        return new b(this.f53085F, e4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final d<E> k(E e4) {
        return new d<>(e4, this.f53085F);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.e
    public Object m(@l3.d I i4) {
        int V02;
        C2317y K02;
        if (C()) {
            C2317y c2317y = this.f53085F;
            do {
                K02 = c2317y.K0();
                if (K02 instanceof G) {
                    return K02;
                }
            } while (!K02.B0(i4, c2317y));
            return null;
        }
        C2317y c2317y2 = this.f53085F;
        e eVar = new e(i4, this);
        do {
            C2317y K03 = c2317y2.K0();
            if (K03 instanceof G) {
                return K03;
            }
            V02 = K03.V0(i4, c2317y2, eVar);
            if (V02 == 1) {
                return null;
            }
        } while (V02 != 2);
        return C2243b.f53081g;
    }

    @l3.d
    protected String n() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.e
    public final v<?> o() {
        v<?> vVar;
        C2317y J02 = this.f53085F.J0();
        if (J02 instanceof v) {
            vVar = (v) J02;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            return null;
        }
        u(vVar);
        return vVar;
    }

    @Override // kotlinx.coroutines.channels.J
    public boolean offer(E e4) {
        UndeliveredElementException d4;
        try {
            return J.a.c(this, e4);
        } catch (Throwable th) {
            X2.l<E, H0> lVar = this.f53084E;
            if (lVar != null && (d4 = kotlinx.coroutines.internal.I.d(lVar, e4, null, 2, null)) != null) {
                C2210p.a(d4, th);
                throw d4;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.e
    public final v<?> p() {
        v<?> vVar;
        C2317y K02 = this.f53085F.K0();
        if (K02 instanceof v) {
            vVar = (v) K02;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            return null;
        }
        u(vVar);
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final C2315w q() {
        return this.f53085F;
    }

    @l3.d
    public String toString() {
        return X.a(this) + '@' + X.b(this) + '{' + t() + '}' + n();
    }
}
