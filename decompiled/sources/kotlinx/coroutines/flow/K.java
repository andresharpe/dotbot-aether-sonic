package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.H0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.internal.S;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class K extends kotlinx.coroutines.flow.internal.c<I<?>> {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f54072a = AtomicReferenceFieldUpdater.newUpdater(K.class, Object.class, "_state");

    @l3.d
    volatile /* synthetic */ Object _state = null;

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@l3.d I<?> i4) {
        S s4;
        if (this._state == null) {
            s4 = J.f54070a;
            this._state = s4;
            return true;
        }
        return false;
    }

    @l3.e
    public final Object d(@l3.d kotlin.coroutines.c<? super H0> cVar) {
        kotlin.coroutines.c e4;
        S s4;
        Object l4;
        Object l5;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(e4, 1);
        rVar.T();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54072a;
        s4 = J.f54070a;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, s4, rVar)) {
            Result.a aVar = Result.f51807F;
            rVar.x(Result.b(H0.f51801a));
        }
        Object z3 = rVar.z();
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

    @Override // kotlinx.coroutines.flow.internal.c
    @l3.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public kotlin.coroutines.c<H0>[] b(@l3.d I<?> i4) {
        this._state = null;
        return kotlinx.coroutines.flow.internal.b.f54131a;
    }

    public final void f() {
        S s4;
        S s5;
        S s6;
        S s7;
        while (true) {
            Object obj = this._state;
            if (obj != null) {
                s4 = J.f54071b;
                if (obj != s4) {
                    s5 = J.f54070a;
                    if (obj == s5) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54072a;
                        s6 = J.f54071b;
                        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, s6)) {
                            return;
                        }
                    } else {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f54072a;
                        s7 = J.f54070a;
                        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, obj, s7)) {
                            Result.a aVar = Result.f51807F;
                            ((kotlinx.coroutines.r) obj).x(Result.b(H0.f51801a));
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean g() {
        S s4;
        S s5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54072a;
        s4 = J.f54070a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, s4);
        kotlin.jvm.internal.F.m(andSet);
        s5 = J.f54071b;
        if (andSet == s5) {
            return true;
        }
        return false;
    }
}
