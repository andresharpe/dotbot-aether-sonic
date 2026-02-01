package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C2210p;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.coroutines.f;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.internal.C2316x;
import kotlinx.coroutines.internal.C2317y;

@InterfaceC2205l(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
/* loaded from: classes2.dex */
public class S0 implements L0, InterfaceC2348y, c1, kotlinx.coroutines.selects.c {

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f52958E = AtomicReferenceFieldUpdater.newUpdater(S0.class, Object.class, "_state");

    @l3.d
    private volatile /* synthetic */ Object _parentHandle;

    @l3.d
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a<T> extends r<T> {

        /* renamed from: M, reason: collision with root package name */
        @l3.d
        private final S0 f52959M;

        public a(@l3.d kotlin.coroutines.c<? super T> cVar, @l3.d S0 s02) {
            super(cVar, 1);
            this.f52959M = s02;
        }

        @Override // kotlinx.coroutines.r
        @l3.d
        protected String G() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.r
        @l3.d
        public Throwable y(@l3.d L0 l02) {
            Throwable e4;
            Object P02 = this.f52959M.P0();
            if ((P02 instanceof c) && (e4 = ((c) P02).e()) != null) {
                return e4;
            }
            if (P02 instanceof E) {
                return ((E) P02).f52925a;
            }
            return l02.a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b extends R0 {

        /* renamed from: I, reason: collision with root package name */
        @l3.d
        private final S0 f52960I;

        /* renamed from: J, reason: collision with root package name */
        @l3.d
        private final c f52961J;

        /* renamed from: K, reason: collision with root package name */
        @l3.d
        private final C2346x f52962K;

        /* renamed from: L, reason: collision with root package name */
        @l3.e
        private final Object f52963L;

        public b(@l3.d S0 s02, @l3.d c cVar, @l3.d C2346x c2346x, @l3.e Object obj) {
            this.f52960I = s02;
            this.f52961J = cVar;
            this.f52962K = c2346x;
            this.f52963L = obj;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
            X0(th);
            return kotlin.H0.f51801a;
        }

        @Override // kotlinx.coroutines.G
        public void X0(@l3.e Throwable th) {
            this.f52960I.v0(this.f52961J, this.f52962K, this.f52963L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c implements E0 {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final X0 f52964E;

        @l3.d
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        @l3.d
        private volatile /* synthetic */ int _isCompleting;

        @l3.d
        private volatile /* synthetic */ Object _rootCause;

        public c(@l3.d X0 x02, boolean z3, @l3.e Throwable th) {
            this.f52964E = x02;
            this._isCompleting = z3 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return this._exceptionsHolder;
        }

        private final void k(Object obj) {
            this._exceptionsHolder = obj;
        }

        @Override // kotlinx.coroutines.E0
        @l3.d
        public X0 D() {
            return this.f52964E;
        }

        public final void a(@l3.d Throwable th) {
            Throwable e4 = e();
            if (e4 == null) {
                l(th);
                return;
            }
            if (th == e4) {
                return;
            }
            Object d4 = d();
            if (d4 == null) {
                k(th);
                return;
            }
            if (d4 instanceof Throwable) {
                if (th == d4) {
                    return;
                }
                ArrayList<Throwable> b4 = b();
                b4.add(d4);
                b4.add(th);
                k(b4);
                return;
            }
            if (d4 instanceof ArrayList) {
                ((ArrayList) d4).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + d4).toString());
        }

        @Override // kotlinx.coroutines.E0
        public boolean c() {
            if (e() == null) {
                return true;
            }
            return false;
        }

        @l3.e
        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            if (e() != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            kotlinx.coroutines.internal.S s4;
            Object d4 = d();
            s4 = T0.f52981h;
            if (d4 == s4) {
                return true;
            }
            return false;
        }

        @l3.d
        public final List<Throwable> i(@l3.e Throwable th) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.S s4;
            Object d4 = d();
            if (d4 == null) {
                arrayList = b();
            } else if (d4 instanceof Throwable) {
                ArrayList<Throwable> b4 = b();
                b4.add(d4);
                arrayList = b4;
            } else if (d4 instanceof ArrayList) {
                arrayList = (ArrayList) d4;
            } else {
                throw new IllegalStateException(("State is " + d4).toString());
            }
            Throwable e4 = e();
            if (e4 != null) {
                arrayList.add(0, e4);
            }
            if (th != null && !kotlin.jvm.internal.F.g(th, e4)) {
                arrayList.add(th);
            }
            s4 = T0.f52981h;
            k(s4);
            return arrayList;
        }

        public final void j(boolean z3) {
            this._isCompleting = z3 ? 1 : 0;
        }

        public final void l(@l3.e Throwable th) {
            this._rootCause = th;
        }

        @l3.d
        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + D() + ']';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends C2317y.c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ S0 f52965d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f52966e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C2317y c2317y, S0 s02, Object obj) {
            super(c2317y);
            this.f52965d = s02;
            this.f52966e = obj;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2297d
        @l3.e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@l3.d C2317y c2317y) {
            if (this.f52965d.P0() == this.f52966e) {
                return null;
            }
            return C2316x.a();
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {952, 954}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes2.dex */
    static final class e extends RestrictedSuspendLambda implements X2.p<kotlin.sequences.o<? super L0>, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: G, reason: collision with root package name */
        Object f52967G;

        /* renamed from: H, reason: collision with root package name */
        Object f52968H;

        /* renamed from: I, reason: collision with root package name */
        int f52969I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f52970J;

        e(kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0066 -> B:6:0x007c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0079 -> B:6:0x007c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r6.f52969I
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f52968H
                kotlinx.coroutines.internal.y r1 = (kotlinx.coroutines.internal.C2317y) r1
                java.lang.Object r3 = r6.f52967G
                kotlinx.coroutines.internal.w r3 = (kotlinx.coroutines.internal.C2315w) r3
                java.lang.Object r4 = r6.f52970J
                kotlin.sequences.o r4 = (kotlin.sequences.o) r4
                kotlin.W.n(r7)
                goto L7c
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                kotlin.W.n(r7)
                goto L81
            L2a:
                kotlin.W.n(r7)
                java.lang.Object r7 = r6.f52970J
                kotlin.sequences.o r7 = (kotlin.sequences.o) r7
                kotlinx.coroutines.S0 r1 = kotlinx.coroutines.S0.this
                java.lang.Object r1 = r1.P0()
                boolean r4 = r1 instanceof kotlinx.coroutines.C2346x
                if (r4 == 0) goto L48
                kotlinx.coroutines.x r1 = (kotlinx.coroutines.C2346x) r1
                kotlinx.coroutines.y r1 = r1.f54760I
                r6.f52969I = r3
                java.lang.Object r7 = r7.b(r1, r6)
                if (r7 != r0) goto L81
                return r0
            L48:
                boolean r3 = r1 instanceof kotlinx.coroutines.E0
                if (r3 == 0) goto L81
                kotlinx.coroutines.E0 r1 = (kotlinx.coroutines.E0) r1
                kotlinx.coroutines.X0 r1 = r1.D()
                if (r1 == 0) goto L81
                java.lang.Object r3 = r1.I0()
                kotlinx.coroutines.internal.y r3 = (kotlinx.coroutines.internal.C2317y) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L5e:
                boolean r7 = kotlin.jvm.internal.F.g(r1, r3)
                if (r7 != 0) goto L81
                boolean r7 = r1 instanceof kotlinx.coroutines.C2346x
                if (r7 == 0) goto L7c
                r7 = r1
                kotlinx.coroutines.x r7 = (kotlinx.coroutines.C2346x) r7
                kotlinx.coroutines.y r7 = r7.f54760I
                r6.f52970J = r4
                r6.f52967G = r3
                r6.f52968H = r1
                r6.f52969I = r2
                java.lang.Object r7 = r4.b(r7, r6)
                if (r7 != r0) goto L7c
                return r0
            L7c:
                kotlinx.coroutines.internal.y r1 = r1.J0()
                goto L5e
            L81:
                kotlin.H0 r7 = kotlin.H0.f51801a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.S0.e.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlin.sequences.o<? super L0> oVar, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((e) v(oVar, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            e eVar = new e(cVar);
            eVar.f52970J = obj;
            return eVar;
        }
    }

    public S0(boolean z3) {
        this._state = z3 ? T0.f52983j : T0.f52982i;
        this._parentHandle = null;
    }

    private final Object A0(c cVar, Object obj) {
        E e4;
        Throwable th;
        boolean f4;
        Throwable J02;
        if (obj instanceof E) {
            e4 = (E) obj;
        } else {
            e4 = null;
        }
        if (e4 != null) {
            th = e4.f52925a;
        } else {
            th = null;
        }
        synchronized (cVar) {
            f4 = cVar.f();
            List<Throwable> i4 = cVar.i(th);
            J02 = J0(cVar, i4);
            if (J02 != null) {
                g0(J02, i4);
            }
        }
        if (J02 != null && J02 != th) {
            obj = new E(J02, false, 2, null);
        }
        if (J02 != null && (p0(J02) || Q0(J02))) {
            if (obj != null) {
                ((E) obj).b();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
        }
        if (!f4) {
            l1(J02);
        }
        m1(obj);
        androidx.concurrent.futures.b.a(f52958E, this, cVar, T0.g(obj));
        s0(cVar, obj);
        return obj;
    }

    private final boolean A1(E0 e02, Throwable th) {
        X0 N02 = N0(e02);
        if (N02 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f52958E, this, e02, new c(N02, false, th))) {
            return false;
        }
        i1(N02, th);
        return true;
    }

    private final Object B1(Object obj, Object obj2) {
        kotlinx.coroutines.internal.S s4;
        kotlinx.coroutines.internal.S s5;
        if (!(obj instanceof E0)) {
            s5 = T0.f52974a;
            return s5;
        }
        if (((obj instanceof C2334q0) || (obj instanceof R0)) && !(obj instanceof C2346x) && !(obj2 instanceof E)) {
            if (!z1((E0) obj, obj2)) {
                s4 = T0.f52976c;
                return s4;
            }
            return obj2;
        }
        return C1((E0) obj, obj2);
    }

    private final C2346x C0(E0 e02) {
        C2346x c2346x;
        if (e02 instanceof C2346x) {
            c2346x = (C2346x) e02;
        } else {
            c2346x = null;
        }
        if (c2346x == null) {
            X0 D3 = e02.D();
            if (D3 == null) {
                return null;
            }
            return h1(D3);
        }
        return c2346x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object C1(E0 e02, Object obj) {
        c cVar;
        E e4;
        kotlinx.coroutines.internal.S s4;
        kotlinx.coroutines.internal.S s5;
        kotlinx.coroutines.internal.S s6;
        X0 N02 = N0(e02);
        if (N02 == null) {
            s6 = T0.f52976c;
            return s6;
        }
        ?? r22 = 0;
        if (e02 instanceof c) {
            cVar = (c) e02;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new c(N02, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (cVar) {
            if (cVar.g()) {
                s5 = T0.f52974a;
                return s5;
            }
            cVar.j(true);
            if (cVar != e02 && !androidx.concurrent.futures.b.a(f52958E, this, e02, cVar)) {
                s4 = T0.f52976c;
                return s4;
            }
            boolean f4 = cVar.f();
            if (obj instanceof E) {
                e4 = (E) obj;
            } else {
                e4 = null;
            }
            if (e4 != null) {
                cVar.a(e4.f52925a);
            }
            Throwable e5 = cVar.e();
            if (Boolean.valueOf(true ^ f4).booleanValue()) {
                r22 = e5;
            }
            objectRef.f52301E = r22;
            kotlin.H0 h02 = kotlin.H0.f51801a;
            if (r22 != 0) {
                i1(N02, r22);
            }
            C2346x C02 = C0(e02);
            if (C02 != null && D1(cVar, C02, obj)) {
                return T0.f52975b;
            }
            return A0(cVar, obj);
        }
    }

    private final boolean D1(c cVar, C2346x c2346x, Object obj) {
        while (L0.a.f(c2346x.f54760I, false, false, new b(this, cVar, c2346x, obj), 1, null) == Z0.f53009E) {
            c2346x = h1(c2346x);
            if (c2346x == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable I0(Object obj) {
        E e4;
        if (obj instanceof E) {
            e4 = (E) obj;
        } else {
            e4 = null;
        }
        if (e4 == null) {
            return null;
        }
        return e4.f52925a;
    }

    private final Throwable J0(c cVar, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (!cVar.f()) {
                return null;
            }
            return new JobCancellationException(q0(), null, this);
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final X0 N0(E0 e02) {
        X0 D3 = e02.D();
        if (D3 == null) {
            if (e02 instanceof C2334q0) {
                return new X0();
            }
            if (e02 instanceof R0) {
                p1((R0) e02);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + e02).toString());
        }
        return D3;
    }

    private final boolean T0(E0 e02) {
        if ((e02 instanceof c) && ((c) e02).f()) {
            return true;
        }
        return false;
    }

    private final boolean W0() {
        Object P02;
        do {
            P02 = P0();
            if (!(P02 instanceof E0)) {
                return false;
            }
        } while (u1(P02) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object X0(kotlin.coroutines.c<? super kotlin.H0> cVar) {
        r rVar = new r(kotlin.coroutines.intrinsics.a.e(cVar), 1);
        rVar.T();
        C2338t.a(rVar, V(new f1(rVar)));
        Object z3 = rVar.z();
        if (z3 == kotlin.coroutines.intrinsics.a.l()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        if (z3 == kotlin.coroutines.intrinsics.a.l()) {
            return z3;
        }
        return kotlin.H0.f51801a;
    }

    private final Void Z0(X2.l<Object, kotlin.H0> lVar) {
        while (true) {
            lVar.C(P0());
        }
    }

    private final Object b1(Object obj) {
        kotlinx.coroutines.internal.S s4;
        kotlinx.coroutines.internal.S s5;
        kotlinx.coroutines.internal.S s6;
        kotlinx.coroutines.internal.S s7;
        kotlinx.coroutines.internal.S s8;
        kotlinx.coroutines.internal.S s9;
        Throwable th = null;
        Throwable th2 = null;
        while (true) {
            Object P02 = P0();
            if (P02 instanceof c) {
                synchronized (P02) {
                    if (((c) P02).h()) {
                        s5 = T0.f52977d;
                        return s5;
                    }
                    boolean f4 = ((c) P02).f();
                    if (obj != null || !f4) {
                        if (th2 == null) {
                            th2 = w0(obj);
                        }
                        ((c) P02).a(th2);
                    }
                    Throwable e4 = ((c) P02).e();
                    if (!f4) {
                        th = e4;
                    }
                    if (th != null) {
                        i1(((c) P02).D(), th);
                    }
                    s4 = T0.f52974a;
                    return s4;
                }
            }
            if (!(P02 instanceof E0)) {
                s6 = T0.f52977d;
                return s6;
            }
            if (th2 == null) {
                th2 = w0(obj);
            }
            E0 e02 = (E0) P02;
            if (e02.c()) {
                if (A1(e02, th2)) {
                    s7 = T0.f52974a;
                    return s7;
                }
            } else {
                Object B12 = B1(P02, new E(th2, false, 2, null));
                s8 = T0.f52974a;
                if (B12 != s8) {
                    s9 = T0.f52976c;
                    if (B12 != s9) {
                        return B12;
                    }
                } else {
                    throw new IllegalStateException(("Cannot happen in " + P02).toString());
                }
            }
        }
    }

    private final R0 e1(X2.l<? super Throwable, kotlin.H0> lVar, boolean z3) {
        R0 r02 = null;
        if (z3) {
            if (lVar instanceof M0) {
                r02 = (M0) lVar;
            }
            if (r02 == null) {
                r02 = new J0(lVar);
            }
        } else {
            if (lVar instanceof R0) {
                r02 = (R0) lVar;
            }
            if (r02 == null) {
                r02 = new K0(lVar);
            }
        }
        r02.Z0(this);
        return r02;
    }

    private final boolean f0(Object obj, X0 x02, R0 r02) {
        int V02;
        d dVar = new d(r02, this, obj);
        do {
            V02 = x02.K0().V0(r02, x02, dVar);
            if (V02 == 1) {
                return true;
            }
        } while (V02 != 2);
        return false;
    }

    private final void g0(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                C2210p.a(th, th2);
            }
        }
    }

    private final C2346x h1(C2317y c2317y) {
        while (c2317y.N0()) {
            c2317y = c2317y.K0();
        }
        while (true) {
            c2317y = c2317y.J0();
            if (!c2317y.N0()) {
                if (c2317y instanceof C2346x) {
                    return (C2346x) c2317y;
                }
                if (c2317y instanceof X0) {
                    return null;
                }
            }
        }
    }

    private final void i1(X0 x02, Throwable th) {
        l1(th);
        CompletionHandlerException completionHandlerException = null;
        for (C2317y c2317y = (C2317y) x02.I0(); !kotlin.jvm.internal.F.g(c2317y, x02); c2317y = c2317y.J0()) {
            if (c2317y instanceof M0) {
                R0 r02 = (R0) c2317y;
                try {
                    r02.X0(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C2210p.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + r02 + " for " + this, th2);
                        kotlin.H0 h02 = kotlin.H0.f51801a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            R0(completionHandlerException);
        }
        p0(th);
    }

    private final void j1(X0 x02, Throwable th) {
        CompletionHandlerException completionHandlerException = null;
        for (C2317y c2317y = (C2317y) x02.I0(); !kotlin.jvm.internal.F.g(c2317y, x02); c2317y = c2317y.J0()) {
            if (c2317y instanceof R0) {
                R0 r02 = (R0) c2317y;
                try {
                    r02.X0(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C2210p.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + r02 + " for " + this, th2);
                        kotlin.H0 h02 = kotlin.H0.f51801a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            R0(completionHandlerException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k0(kotlin.coroutines.c<Object> cVar) {
        a aVar = new a(kotlin.coroutines.intrinsics.a.e(cVar), this);
        aVar.T();
        C2338t.a(aVar, V(new e1(aVar)));
        Object z3 = aVar.z();
        if (z3 == kotlin.coroutines.intrinsics.a.l()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z3;
    }

    private final /* synthetic */ <T extends R0> void k1(X0 x02, Throwable th) {
        CompletionHandlerException completionHandlerException = null;
        for (C2317y c2317y = (C2317y) x02.I0(); !kotlin.jvm.internal.F.g(c2317y, x02); c2317y = c2317y.J0()) {
            kotlin.jvm.internal.F.y(3, androidx.exifinterface.media.a.f5);
            if (c2317y instanceof C2317y) {
                R0 r02 = (R0) c2317y;
                try {
                    r02.X0(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C2210p.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + r02 + " for " + this, th2);
                        kotlin.H0 h02 = kotlin.H0.f51801a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            R0(completionHandlerException);
        }
    }

    private final Object o0(Object obj) {
        kotlinx.coroutines.internal.S s4;
        Object B12;
        kotlinx.coroutines.internal.S s5;
        do {
            Object P02 = P0();
            if (!(P02 instanceof E0) || ((P02 instanceof c) && ((c) P02).g())) {
                s4 = T0.f52974a;
                return s4;
            }
            B12 = B1(P02, new E(w0(obj), false, 2, null));
            s5 = T0.f52976c;
        } while (B12 == s5);
        return B12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.D0] */
    private final void o1(C2334q0 c2334q0) {
        X0 x02 = new X0();
        if (!c2334q0.c()) {
            x02 = new D0(x02);
        }
        androidx.concurrent.futures.b.a(f52958E, this, c2334q0, x02);
    }

    private final boolean p0(Throwable th) {
        if (V0()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        InterfaceC2344w O02 = O0();
        if (O02 != null && O02 != Z0.f53009E) {
            if (O02.A(th) || z3) {
                return true;
            }
            return false;
        }
        return z3;
    }

    private final void p1(R0 r02) {
        r02.C0(new X0());
        androidx.concurrent.futures.b.a(f52958E, this, r02, r02.J0());
    }

    private final void s0(E0 e02, Object obj) {
        E e4;
        InterfaceC2344w O02 = O0();
        if (O02 != null) {
            O02.f();
            t1(Z0.f53009E);
        }
        Throwable th = null;
        if (obj instanceof E) {
            e4 = (E) obj;
        } else {
            e4 = null;
        }
        if (e4 != null) {
            th = e4.f52925a;
        }
        if (e02 instanceof R0) {
            try {
                ((R0) e02).X0(th);
                return;
            } catch (Throwable th2) {
                R0(new CompletionHandlerException("Exception in completion handler " + e02 + " for " + this, th2));
                return;
            }
        }
        X0 D3 = e02.D();
        if (D3 != null) {
            j1(D3, th);
        }
    }

    private final int u1(Object obj) {
        C2334q0 c2334q0;
        if (obj instanceof C2334q0) {
            if (((C2334q0) obj).c()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f52958E;
            c2334q0 = T0.f52983j;
            if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, c2334q0)) {
                return -1;
            }
            n1();
            return 1;
        }
        if (!(obj instanceof D0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f52958E, this, obj, ((D0) obj).D())) {
            return -1;
        }
        n1();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(c cVar, C2346x c2346x, Object obj) {
        C2346x h12 = h1(c2346x);
        if (h12 != null && D1(cVar, h12, obj)) {
            return;
        }
        h0(A0(cVar, obj));
    }

    private final String v1(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f()) {
                return "Cancelling";
            }
            if (!cVar.g()) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof E0) {
            if (((E0) obj).c()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof E) {
            return "Cancelled";
        }
        return "Completed";
    }

    private final Throwable w0(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(q0(), null, this);
            }
            return th;
        }
        if (obj != null) {
            return ((c1) obj).M0();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    public static /* synthetic */ CancellationException x1(S0 s02, Throwable th, String str, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                str = null;
            }
            return s02.w1(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    public static /* synthetic */ JobCancellationException z0(S0 s02, String str, Throwable th, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                str = null;
            }
            if ((i4 & 2) != 0) {
                th = null;
            }
            if (str == null) {
                str = s02.q0();
            }
            return new JobCancellationException(str, th, s02);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    private final boolean z1(E0 e02, Object obj) {
        if (!androidx.concurrent.futures.b.a(f52958E, this, e02, T0.g(obj))) {
            return false;
        }
        l1(null);
        m1(obj);
        s0(e02, obj);
        return true;
    }

    @Override // kotlin.coroutines.f
    @l3.d
    public kotlin.coroutines.f A(@l3.d kotlin.coroutines.f fVar) {
        return L0.a.h(this, fVar);
    }

    @l3.e
    public final Object D0() {
        Object P02 = P0();
        if (!(P02 instanceof E0)) {
            if (!(P02 instanceof E)) {
                return T0.o(P02);
            }
            throw ((E) P02).f52925a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    public final kotlinx.coroutines.selects.c E0() {
        return this;
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    public final kotlin.sequences.m<L0> F() {
        kotlin.sequences.m<L0> b4;
        b4 = kotlin.sequences.q.b(new e(null));
        return b4;
    }

    @l3.e
    public final Throwable G() {
        Object P02 = P0();
        if (!(P02 instanceof E0)) {
            return I0(P02);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @l3.e
    protected final Throwable G0() {
        Object P02 = P0();
        if (P02 instanceof c) {
            Throwable e4 = ((c) P02).e();
            if (e4 == null) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            return e4;
        }
        if (!(P02 instanceof E0)) {
            if (P02 instanceof E) {
                return ((E) P02).f52925a;
            }
            return null;
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // kotlinx.coroutines.L0
    @l3.e
    public final Object H(@l3.d kotlin.coroutines.c<? super kotlin.H0> cVar) {
        if (!W0()) {
            O0.z(cVar.e());
            return kotlin.H0.f51801a;
        }
        Object X02 = X0(cVar);
        if (X02 == kotlin.coroutines.intrinsics.a.l()) {
            return X02;
        }
        return kotlin.H0.f51801a;
    }

    protected final boolean H0() {
        Object P02 = P0();
        if ((P02 instanceof E) && ((E) P02).a()) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.selects.c
    public final <R> void J(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.d X2.l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar) {
        Object P02;
        do {
            P02 = P0();
            if (fVar.J()) {
                return;
            }
            if (!(P02 instanceof E0)) {
                if (fVar.y()) {
                    j3.b.c(lVar, fVar.R());
                    return;
                }
                return;
            }
        } while (u1(P02) != 0);
        fVar.q0(V(new k1(fVar, lVar)));
    }

    public boolean K0() {
        return true;
    }

    public boolean L0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.c1
    @l3.d
    public CancellationException M0() {
        CancellationException cancellationException;
        Object P02 = P0();
        CancellationException cancellationException2 = null;
        if (P02 instanceof c) {
            cancellationException = ((c) P02).e();
        } else if (P02 instanceof E) {
            cancellationException = ((E) P02).f52925a;
        } else if (!(P02 instanceof E0)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + P02).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new JobCancellationException("Parent job is " + v1(P02), cancellationException, this);
        }
        return cancellationException2;
    }

    @l3.e
    public final InterfaceC2344w O0() {
        return (InterfaceC2344w) this._parentHandle;
    }

    @l3.e
    public final Object P0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.J)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.J) obj).c(this);
        }
    }

    protected boolean Q0(@l3.d Throwable th) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S0(@l3.e L0 l02) {
        if (l02 == null) {
            t1(Z0.f53009E);
            return;
        }
        l02.start();
        InterfaceC2344w f12 = l02.f1(this);
        t1(f12);
        if (m()) {
            f12.f();
            t1(Z0.f53009E);
        }
    }

    public final boolean U0() {
        return P0() instanceof E;
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    public final InterfaceC2328n0 V(@l3.d X2.l<? super Throwable, kotlin.H0> lVar) {
        return p(false, true, lVar);
    }

    protected boolean V0() {
        return false;
    }

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    @l3.e
    public <E extends f.b> E a(@l3.d f.c<E> cVar) {
        return (E) L0.a.e(this, cVar);
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    public final CancellationException a0() {
        Object P02 = P0();
        if (P02 instanceof c) {
            Throwable e4 = ((c) P02).e();
            if (e4 != null) {
                CancellationException w12 = w1(e4, X.a(this) + " is cancelling");
                if (w12 != null) {
                    return w12;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(P02 instanceof E0)) {
            if (P02 instanceof E) {
                return x1(this, ((E) P02).f52925a, null, 1, null);
            }
            return new JobCancellationException(X.a(this) + " has completed normally", null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    @l3.d
    public kotlin.coroutines.f b(@l3.d f.c<?> cVar) {
        return L0.a.g(this, cVar);
    }

    @Override // kotlinx.coroutines.L0
    public boolean c() {
        Object P02 = P0();
        if ((P02 instanceof E0) && ((E0) P02).c()) {
            return true;
        }
        return false;
    }

    public final boolean c1(@l3.e Object obj) {
        Object B12;
        kotlinx.coroutines.internal.S s4;
        kotlinx.coroutines.internal.S s5;
        do {
            B12 = B1(P0(), obj);
            s4 = T0.f52974a;
            if (B12 == s4) {
                return false;
            }
            if (B12 != T0.f52975b) {
                s5 = T0.f52976c;
            } else {
                return true;
            }
        } while (B12 == s5);
        h0(B12);
        return true;
    }

    @Override // kotlinx.coroutines.L0
    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        L0.a.a(this);
    }

    @Override // kotlinx.coroutines.L0
    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean d(Throwable th) {
        Throwable jobCancellationException;
        if (th == null || (jobCancellationException = x1(this, th, null, 1, null)) == null) {
            jobCancellationException = new JobCancellationException(q0(), null, this);
        }
        n0(jobCancellationException);
        return true;
    }

    @l3.e
    public final Object d1(@l3.e Object obj) {
        Object B12;
        kotlinx.coroutines.internal.S s4;
        kotlinx.coroutines.internal.S s5;
        do {
            B12 = B1(P0(), obj);
            s4 = T0.f52974a;
            if (B12 != s4) {
                s5 = T0.f52976c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, I0(obj));
            }
        } while (B12 == s5);
        return B12;
    }

    @Override // kotlinx.coroutines.InterfaceC2348y
    public final void e0(@l3.d c1 c1Var) {
        m0(c1Var);
    }

    @Override // kotlinx.coroutines.L0
    public void f(@l3.e CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(q0(), null, this);
        }
        n0(cancellationException);
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    public final InterfaceC2344w f1(@l3.d InterfaceC2348y interfaceC2348y) {
        return (InterfaceC2344w) L0.a.f(this, true, false, new C2346x(interfaceC2348y), 2, null);
    }

    @l3.d
    public String g1() {
        return X.a(this);
    }

    @Override // kotlin.coroutines.f.b
    @l3.d
    public final f.c<?> getKey() {
        return L0.f52941w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h0(@l3.e Object obj) {
    }

    @Override // kotlin.coroutines.f.b, kotlin.coroutines.f
    public <R> R i(R r4, @l3.d X2.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) L0.a.d(this, r4, pVar);
    }

    @l3.e
    public final Object i0(@l3.d kotlin.coroutines.c<Object> cVar) {
        Object P02;
        do {
            P02 = P0();
            if (!(P02 instanceof E0)) {
                if (!(P02 instanceof E)) {
                    return T0.o(P02);
                }
                throw ((E) P02).f52925a;
            }
        } while (u1(P02) < 0);
        return k0(cVar);
    }

    @Override // kotlinx.coroutines.L0
    public final boolean isCancelled() {
        Object P02 = P0();
        if (!(P02 instanceof E) && (!(P02 instanceof c) || !((c) P02).f())) {
            return false;
        }
        return true;
    }

    public final boolean l0(@l3.e Throwable th) {
        return m0(th);
    }

    protected void l1(@l3.e Throwable th) {
    }

    @Override // kotlinx.coroutines.L0
    public final boolean m() {
        return !(P0() instanceof E0);
    }

    public final boolean m0(@l3.e Object obj) {
        Object obj2;
        kotlinx.coroutines.internal.S s4;
        kotlinx.coroutines.internal.S s5;
        kotlinx.coroutines.internal.S s6;
        obj2 = T0.f52974a;
        if (!L0() || (obj2 = o0(obj)) != T0.f52975b) {
            s4 = T0.f52974a;
            if (obj2 == s4) {
                obj2 = b1(obj);
            }
            s5 = T0.f52974a;
            if (obj2 != s5 && obj2 != T0.f52975b) {
                s6 = T0.f52977d;
                if (obj2 == s6) {
                    return false;
                }
                h0(obj2);
                return true;
            }
            return true;
        }
        return true;
    }

    protected void m1(@l3.e Object obj) {
    }

    public void n0(@l3.d Throwable th) {
        m0(th);
    }

    protected void n1() {
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    public final InterfaceC2328n0 p(boolean z3, boolean z4, @l3.d X2.l<? super Throwable, kotlin.H0> lVar) {
        E e4;
        R0 e12 = e1(lVar, z3);
        while (true) {
            Object P02 = P0();
            if (P02 instanceof C2334q0) {
                C2334q0 c2334q0 = (C2334q0) P02;
                if (c2334q0.c()) {
                    if (androidx.concurrent.futures.b.a(f52958E, this, P02, e12)) {
                        return e12;
                    }
                } else {
                    o1(c2334q0);
                }
            } else {
                Throwable th = null;
                if (P02 instanceof E0) {
                    X0 D3 = ((E0) P02).D();
                    if (D3 == null) {
                        if (P02 != null) {
                            p1((R0) P02);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        }
                    } else {
                        InterfaceC2328n0 interfaceC2328n0 = Z0.f53009E;
                        if (z3 && (P02 instanceof c)) {
                            synchronized (P02) {
                                try {
                                    th = ((c) P02).e();
                                    if (th != null) {
                                        if ((lVar instanceof C2346x) && !((c) P02).g()) {
                                        }
                                        kotlin.H0 h02 = kotlin.H0.f51801a;
                                    }
                                    if (f0(P02, D3, e12)) {
                                        if (th == null) {
                                            return e12;
                                        }
                                        interfaceC2328n0 = e12;
                                        kotlin.H0 h022 = kotlin.H0.f51801a;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        if (th != null) {
                            if (z4) {
                                lVar.C(th);
                            }
                            return interfaceC2328n0;
                        }
                        if (f0(P02, D3, e12)) {
                            return e12;
                        }
                    }
                } else {
                    if (z4) {
                        if (P02 instanceof E) {
                            e4 = (E) P02;
                        } else {
                            e4 = null;
                        }
                        if (e4 != null) {
                            th = e4.f52925a;
                        }
                        lVar.C(th);
                    }
                    return Z0.f53009E;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public String q0() {
        return "Job was cancelled";
    }

    public final <T, R> void q1(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        Object P02;
        do {
            P02 = P0();
            if (fVar.J()) {
                return;
            }
            if (!(P02 instanceof E0)) {
                if (fVar.y()) {
                    if (P02 instanceof E) {
                        fVar.e0(((E) P02).f52925a);
                        return;
                    } else {
                        j3.b.d(pVar, T0.o(P02), fVar.R());
                        return;
                    }
                }
                return;
            }
        } while (u1(P02) != 0);
        fVar.q0(V(new j1(fVar, pVar)));
    }

    public boolean r0(@l3.d Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (m0(th) && K0()) {
            return true;
        }
        return false;
    }

    public final void r1(@l3.d R0 r02) {
        Object P02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2334q0 c2334q0;
        do {
            P02 = P0();
            if (P02 instanceof R0) {
                if (P02 != r02) {
                    return;
                }
                atomicReferenceFieldUpdater = f52958E;
                c2334q0 = T0.f52983j;
            } else {
                if ((P02 instanceof E0) && ((E0) P02).D() != null) {
                    r02.Q0();
                    return;
                }
                return;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, P02, c2334q0));
    }

    public final <T, R> void s1(@l3.d kotlinx.coroutines.selects.f<? super R> fVar, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        Object P02 = P0();
        if (P02 instanceof E) {
            fVar.e0(((E) P02).f52925a);
        } else {
            j3.a.f(pVar, T0.o(P02), fVar.R(), null, 4, null);
        }
    }

    @Override // kotlinx.coroutines.L0
    public final boolean start() {
        int u12;
        do {
            u12 = u1(P0());
            if (u12 == 0) {
                return false;
            }
        } while (u12 != 1);
        return true;
    }

    public final void t1(@l3.e InterfaceC2344w interfaceC2344w) {
        this._parentHandle = interfaceC2344w;
    }

    @l3.d
    public String toString() {
        return y1() + '@' + X.b(this);
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public L0 u0(@l3.d L0 l02) {
        return L0.a.i(this, l02);
    }

    @l3.d
    protected final CancellationException w1(@l3.d Throwable th, @l3.e String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = q0();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    @l3.d
    public final JobCancellationException x0(@l3.e String str, @l3.e Throwable th) {
        if (str == null) {
            str = q0();
        }
        return new JobCancellationException(str, th, this);
    }

    @l3.d
    @G0
    public final String y1() {
        return g1() + '{' + v1(P0()) + '}';
    }

    public void R0(@l3.d Throwable th) {
        throw th;
    }
}
