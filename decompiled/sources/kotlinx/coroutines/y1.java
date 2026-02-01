package kotlinx.coroutines;

import kotlin.C2122h0;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class y1<T> extends kotlinx.coroutines.internal.N<T> {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private ThreadLocal<Pair<kotlin.coroutines.f, Object>> f54765H;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y1(@l3.d kotlin.coroutines.f r3, @l3.d kotlin.coroutines.c<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.z1 r0 = kotlinx.coroutines.z1.f54766E
            kotlin.coroutines.f$b r1 = r3.a(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.f r0 = r3.A(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f54765H = r0
            kotlin.coroutines.f r4 = r4.e()
            kotlin.coroutines.d$b r0 = kotlin.coroutines.d.f52046u
            kotlin.coroutines.f$b r4 = r4.a(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.N
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.X.c(r3, r4)
            kotlinx.coroutines.internal.X.a(r3, r4)
            r2.L1(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.y1.<init>(kotlin.coroutines.f, kotlin.coroutines.c):void");
    }

    @Override // kotlinx.coroutines.internal.N, kotlinx.coroutines.AbstractC2234a
    protected void E1(@l3.e Object obj) {
        Pair<kotlin.coroutines.f, Object> pair = this.f54765H.get();
        y1<?> y1Var = null;
        if (pair != null) {
            kotlinx.coroutines.internal.X.a(pair.a(), pair.b());
            this.f54765H.set(null);
        }
        Object a4 = J.a(obj, this.f54448G);
        kotlin.coroutines.c<T> cVar = this.f54448G;
        kotlin.coroutines.f e4 = cVar.e();
        Object c4 = kotlinx.coroutines.internal.X.c(e4, null);
        if (c4 != kotlinx.coroutines.internal.X.f54458a) {
            y1Var = M.g(cVar, e4, c4);
        }
        try {
            this.f54448G.x(a4);
            kotlin.H0 h02 = kotlin.H0.f51801a;
        } finally {
            if (y1Var == null || y1Var.K1()) {
                kotlinx.coroutines.internal.X.a(e4, c4);
            }
        }
    }

    public final boolean K1() {
        if (this.f54765H.get() == null) {
            return false;
        }
        this.f54765H.set(null);
        return true;
    }

    public final void L1(@l3.d kotlin.coroutines.f fVar, @l3.e Object obj) {
        this.f54765H.set(C2122h0.a(fVar, obj));
    }
}
