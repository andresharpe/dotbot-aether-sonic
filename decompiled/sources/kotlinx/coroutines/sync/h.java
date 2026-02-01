package kotlinx.coroutines.sync;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C;
import kotlinx.coroutines.internal.S;
import kotlinx.coroutines.internal.W;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final int f54729a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final S f54730b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final S f54731c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static final S f54732d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final S f54733e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f54734f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {85}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f54735H;

        /* renamed from: I, reason: collision with root package name */
        Object f54736I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f54737J;

        /* renamed from: K, reason: collision with root package name */
        int f54738K;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54737J = obj;
            this.f54738K |= Integer.MIN_VALUE;
            return h.q(null, null, this);
        }
    }

    static {
        int d4;
        int d5;
        d4 = W.d("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f54729a = d4;
        f54730b = new S("PERMIT");
        f54731c = new S("TAKEN");
        f54732d = new S("BROKEN");
        f54733e = new S("CANCELLED");
        d5 = W.d("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f54734f = d5;
    }

    @l3.d
    public static final f a(int i4, int i5) {
        return new g(i4, i5);
    }

    public static /* synthetic */ f b(int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return a(i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i j(long j4, i iVar) {
        return new i(j4, iVar, 0);
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    private static /* synthetic */ void o() {
    }

    private static /* synthetic */ void p() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object q(@l3.d kotlinx.coroutines.sync.f r4, @l3.d X2.a<? extends T> r5, @l3.d kotlin.coroutines.c<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.sync.h.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.sync.h$a r0 = (kotlinx.coroutines.sync.h.a) r0
            int r1 = r0.f54738K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54738K = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.h$a r0 = new kotlinx.coroutines.sync.h$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f54737J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f54738K
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f54736I
            r5 = r4
            X2.a r5 = (X2.a) r5
            java.lang.Object r4 = r0.f54735H
            kotlinx.coroutines.sync.f r4 = (kotlinx.coroutines.sync.f) r4
            kotlin.W.n(r6)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.W.n(r6)
            r0.f54735H = r4
            r0.f54736I = r5
            r0.f54738K = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Object r5 = r5.n()     // Catch: java.lang.Throwable -> L58
            kotlin.jvm.internal.C.d(r3)
            r4.release()
            kotlin.jvm.internal.C.c(r3)
            return r5
        L58:
            r5 = move-exception
            kotlin.jvm.internal.C.d(r3)
            r4.release()
            kotlin.jvm.internal.C.c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.h.q(kotlinx.coroutines.sync.f, X2.a, kotlin.coroutines.c):java.lang.Object");
    }

    private static final <T> Object r(f fVar, X2.a<? extends T> aVar, kotlin.coroutines.c<? super T> cVar) {
        C.e(0);
        fVar.b(cVar);
        C.e(1);
        try {
            return aVar.n();
        } finally {
            C.d(1);
            fVar.release();
            C.c(1);
        }
    }
}
