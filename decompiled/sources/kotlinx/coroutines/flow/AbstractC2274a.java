package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.B0;

@B0
/* renamed from: kotlinx.coroutines.flow.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2274a<T> implements InterfaceC2282i<T>, InterfaceC2276c<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {230}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0486a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f54087H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f54088I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ AbstractC2274a<T> f54089J;

        /* renamed from: K, reason: collision with root package name */
        int f54090K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0486a(AbstractC2274a<T> abstractC2274a, kotlin.coroutines.c<? super C0486a> cVar) {
            super(cVar);
            this.f54089J = abstractC2274a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54088I = obj;
            this.f54090K |= Integer.MIN_VALUE;
            return this.f54089J.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super T> r6, @l3.d kotlin.coroutines.c<? super kotlin.H0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.AbstractC2274a.C0486a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.AbstractC2274a.C0486a) r0
            int r1 = r0.f54090K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54090K = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f54088I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f54090K
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f54087H
            kotlinx.coroutines.flow.internal.SafeCollector r6 = (kotlinx.coroutines.flow.internal.SafeCollector) r6
            kotlin.W.n(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.W.n(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r7 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.f r2 = r0.e()
            r7.<init>(r6, r2)
            r0.f54087H = r7     // Catch: java.lang.Throwable -> L55
            r0.f54090K = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.d(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.H()
            kotlin.H0 r6 = kotlin.H0.f51801a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.H()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC2274a.a(kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.e
    public abstract Object d(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar);
}
