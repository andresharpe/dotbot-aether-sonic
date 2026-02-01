package kotlin.coroutines.jvm.internal;

import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class h implements kotlin.coroutines.c<H0> {

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private Result<H0> f52081E;

    public final void a() {
        synchronized (this) {
            while (true) {
                try {
                    Result<H0> result = this.f52081E;
                    if (result == null) {
                        F.n(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } else {
                        W.n(result.l());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @l3.e
    public final Result<H0> b() {
        return this.f52081E;
    }

    @Override // kotlin.coroutines.c
    @l3.d
    public kotlin.coroutines.f e() {
        return EmptyCoroutineContext.f52041E;
    }

    public final void f(@l3.e Result<H0> result) {
        this.f52081E = result;
    }

    @Override // kotlin.coroutines.c
    public void x(@l3.d Object obj) {
        synchronized (this) {
            this.f52081E = Result.a(obj);
            F.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            H0 h02 = H0.f51801a;
        }
    }
}
