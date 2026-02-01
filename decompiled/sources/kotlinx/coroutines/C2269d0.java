package kotlinx.coroutines;

import kotlin.coroutines.f;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: kotlinx.coroutines.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2269d0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {com.harman.analytics.deviceAws.a.f37828k}, m = "awaitCancellation", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.d0$a */
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f53368H;

        /* renamed from: I, reason: collision with root package name */
        int f53369I;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53368H = obj;
            this.f53369I |= Integer.MIN_VALUE;
            return C2269d0.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@l3.d kotlin.coroutines.c<?> r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.C2269d0.a
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.d0$a r0 = (kotlinx.coroutines.C2269d0.a) r0
            int r1 = r0.f53369I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53369I = r1
            goto L18
        L13:
            kotlinx.coroutines.d0$a r0 = new kotlinx.coroutines.d0$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f53368H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53369I
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            kotlin.W.n(r4)
            goto L52
        L31:
            kotlin.W.n(r4)
            r0.f53369I = r3
            kotlinx.coroutines.r r4 = new kotlinx.coroutines.r
            kotlin.coroutines.c r2 = kotlin.coroutines.intrinsics.a.e(r0)
            r4.<init>(r2, r3)
            r4.T()
            java.lang.Object r4 = r4.z()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r2) goto L4f
            kotlin.coroutines.jvm.internal.f.c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C2269d0.a(kotlin.coroutines.c):java.lang.Object");
    }

    @l3.e
    public static final Object b(long j4, @l3.d kotlin.coroutines.c<? super kotlin.H0> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        Object l5;
        if (j4 > 0) {
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            r rVar = new r(e4, 1);
            rVar.T();
            if (j4 < Long.MAX_VALUE) {
                d(rVar.e()).h(j4, rVar);
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
            return kotlin.H0.f51801a;
        }
        return kotlin.H0.f51801a;
    }

    @l3.e
    public static final Object c(long j4, @l3.d kotlin.coroutines.c<? super kotlin.H0> cVar) {
        Object l4;
        Object b4 = b(e(j4), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (b4 == l4) {
            return b4;
        }
        return kotlin.H0.f51801a;
    }

    @l3.d
    public static final InterfaceC2241c0 d(@l3.d kotlin.coroutines.f fVar) {
        InterfaceC2241c0 interfaceC2241c0;
        f.b a4 = fVar.a(kotlin.coroutines.d.f52046u);
        if (a4 instanceof InterfaceC2241c0) {
            interfaceC2241c0 = (InterfaceC2241c0) a4;
        } else {
            interfaceC2241c0 = null;
        }
        if (interfaceC2241c0 == null) {
            return Z.a();
        }
        return interfaceC2241c0;
    }

    public static final long e(long j4) {
        long v3;
        if (kotlin.time.e.l(j4, kotlin.time.e.f52872F.W()) > 0) {
            v3 = kotlin.ranges.u.v(kotlin.time.e.M(j4), 1L);
            return v3;
        }
        return 0L;
    }
}
