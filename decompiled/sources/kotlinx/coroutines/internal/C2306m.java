package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.H0;
import kotlin.Result;
import kotlinx.coroutines.AbstractC2291h0;
import kotlinx.coroutines.AbstractC2335r0;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.r1;
import kotlinx.coroutines.y1;

/* renamed from: kotlinx.coroutines.internal.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2306m<T> extends AbstractC2291h0<T> implements kotlin.coroutines.jvm.internal.c, kotlin.coroutines.c<T> {

    /* renamed from: L, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f54492L = AtomicReferenceFieldUpdater.newUpdater(C2306m.class, Object.class, "_reusableCancellableContinuation");

    /* renamed from: H, reason: collision with root package name */
    @W2.f
    @l3.d
    public final kotlinx.coroutines.N f54493H;

    /* renamed from: I, reason: collision with root package name */
    @W2.f
    @l3.d
    public final kotlin.coroutines.c<T> f54494I;

    /* renamed from: J, reason: collision with root package name */
    @W2.f
    @l3.e
    public Object f54495J;

    /* renamed from: K, reason: collision with root package name */
    @W2.f
    @l3.d
    public final Object f54496K;

    @l3.d
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* JADX WARN: Multi-variable type inference failed */
    public C2306m(@l3.d kotlinx.coroutines.N n4, @l3.d kotlin.coroutines.c<? super T> cVar) {
        super(-1);
        this.f54493H = n4;
        this.f54494I = cVar;
        this.f54495J = C2307n.a();
        this.f54496K = X.b(e());
        this._reusableCancellableContinuation = null;
    }

    private final kotlinx.coroutines.r<?> p() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof kotlinx.coroutines.r) {
            return (kotlinx.coroutines.r) obj;
        }
        return null;
    }

    public static /* synthetic */ void r() {
    }

    @l3.e
    public final Throwable A(@l3.d InterfaceC2333q<?> interfaceC2333q) {
        S s4;
        do {
            Object obj = this._reusableCancellableContinuation;
            s4 = C2307n.f54498b;
            if (obj != s4) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f54492L, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f54492L, this, s4, interfaceC2333q));
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public StackTraceElement I() {
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC2291h0
    public void b(@l3.e Object obj, @l3.d Throwable th) {
        if (obj instanceof kotlinx.coroutines.F) {
            ((kotlinx.coroutines.F) obj).f52927b.C(th);
        }
    }

    @Override // kotlin.coroutines.c
    @l3.d
    public kotlin.coroutines.f e() {
        return this.f54494I.e();
    }

    @Override // kotlinx.coroutines.AbstractC2291h0
    @l3.d
    public kotlin.coroutines.c<T> f() {
        return this;
    }

    @Override // kotlinx.coroutines.AbstractC2291h0
    @l3.e
    public Object j() {
        Object obj = this.f54495J;
        this.f54495J = C2307n.a();
        return obj;
    }

    public final void k() {
        do {
        } while (this._reusableCancellableContinuation == C2307n.f54498b);
    }

    @l3.e
    public final kotlinx.coroutines.r<T> l() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C2307n.f54498b;
                return null;
            }
            if (obj instanceof kotlinx.coroutines.r) {
                if (androidx.concurrent.futures.b.a(f54492L, this, obj, C2307n.f54498b)) {
                    return (kotlinx.coroutines.r) obj;
                }
            } else if (obj != C2307n.f54498b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void n(@l3.d kotlin.coroutines.f fVar, T t3) {
        this.f54495J = t3;
        this.f54395G = 1;
        this.f54493H.i1(fVar, this);
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @l3.e
    public kotlin.coroutines.jvm.internal.c q() {
        kotlin.coroutines.c<T> cVar = this.f54494I;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    public final boolean s() {
        if (this._reusableCancellableContinuation != null) {
            return true;
        }
        return false;
    }

    public final boolean t(@l3.d Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            S s4 = C2307n.f54498b;
            if (kotlin.jvm.internal.F.g(obj, s4)) {
                if (androidx.concurrent.futures.b.a(f54492L, this, s4, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f54492L, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @l3.d
    public String toString() {
        return "DispatchedContinuation[" + this.f54493H + ", " + kotlinx.coroutines.X.c(this.f54494I) + ']';
    }

    public final void v() {
        k();
        kotlinx.coroutines.r<?> p4 = p();
        if (p4 != null) {
            p4.t();
        }
    }

    public final void w(@l3.d Object obj, @l3.e X2.l<? super Throwable, H0> lVar) {
        y1<?> y1Var;
        Object b4 = kotlinx.coroutines.J.b(obj, lVar);
        if (this.f54493H.j1(e())) {
            this.f54495J = b4;
            this.f54395G = 1;
            this.f54493H.h1(e(), this);
            return;
        }
        AbstractC2335r0 b5 = r1.f54556a.b();
        if (b5.u1()) {
            this.f54495J = b4;
            this.f54395G = 1;
            b5.p1(this);
            return;
        }
        b5.r1(true);
        try {
            L0 l02 = (L0) e().a(L0.f52941w);
            if (l02 != null && !l02.c()) {
                CancellationException a02 = l02.a0();
                b(b4, a02);
                Result.a aVar = Result.f51807F;
                x(Result.b(kotlin.W.a(a02)));
            } else {
                kotlin.coroutines.c<T> cVar = this.f54494I;
                Object obj2 = this.f54496K;
                kotlin.coroutines.f e4 = cVar.e();
                Object c4 = X.c(e4, obj2);
                if (c4 != X.f54458a) {
                    y1Var = kotlinx.coroutines.M.g(cVar, e4, c4);
                } else {
                    y1Var = null;
                }
                try {
                    this.f54494I.x(obj);
                    H0 h02 = H0.f51801a;
                } finally {
                    kotlin.jvm.internal.C.d(1);
                    if (y1Var == null || y1Var.K1()) {
                        X.a(e4, c4);
                    }
                    kotlin.jvm.internal.C.c(1);
                }
            }
            do {
            } while (b5.x1());
            kotlin.jvm.internal.C.d(1);
        } catch (Throwable th) {
            try {
                i(th, null);
                kotlin.jvm.internal.C.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.C.d(1);
                b5.m1(true);
                kotlin.jvm.internal.C.c(1);
                throw th2;
            }
        }
        b5.m1(true);
        kotlin.jvm.internal.C.c(1);
    }

    @Override // kotlin.coroutines.c
    public void x(@l3.d Object obj) {
        kotlin.coroutines.f e4 = this.f54494I.e();
        Object d4 = kotlinx.coroutines.J.d(obj, null, 1, null);
        if (this.f54493H.j1(e4)) {
            this.f54495J = d4;
            this.f54395G = 0;
            this.f54493H.h1(e4, this);
            return;
        }
        AbstractC2335r0 b4 = r1.f54556a.b();
        if (b4.u1()) {
            this.f54495J = d4;
            this.f54395G = 0;
            b4.p1(this);
            return;
        }
        b4.r1(true);
        try {
            kotlin.coroutines.f e5 = e();
            Object c4 = X.c(e5, this.f54496K);
            try {
                this.f54494I.x(obj);
                H0 h02 = H0.f51801a;
                do {
                } while (b4.x1());
            } finally {
                X.a(e5, c4);
            }
        } catch (Throwable th) {
            try {
                i(th, null);
            } finally {
                b4.m1(true);
            }
        }
    }

    public final boolean y(@l3.e Object obj) {
        L0 l02 = (L0) e().a(L0.f52941w);
        if (l02 != null && !l02.c()) {
            CancellationException a02 = l02.a0();
            b(obj, a02);
            Result.a aVar = Result.f51807F;
            x(Result.b(kotlin.W.a(a02)));
            return true;
        }
        return false;
    }

    public final void z(@l3.d Object obj) {
        y1<?> y1Var;
        kotlin.coroutines.c<T> cVar = this.f54494I;
        Object obj2 = this.f54496K;
        kotlin.coroutines.f e4 = cVar.e();
        Object c4 = X.c(e4, obj2);
        if (c4 != X.f54458a) {
            y1Var = kotlinx.coroutines.M.g(cVar, e4, c4);
        } else {
            y1Var = null;
        }
        try {
            this.f54494I.x(obj);
            H0 h02 = H0.f51801a;
        } finally {
            kotlin.jvm.internal.C.d(1);
            if (y1Var == null || y1Var.K1()) {
                X.a(e4, c4);
            }
            kotlin.jvm.internal.C.c(1);
        }
    }
}
