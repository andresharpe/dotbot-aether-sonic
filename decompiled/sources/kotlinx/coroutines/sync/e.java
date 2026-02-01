package kotlinx.coroutines.sync;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C;
import kotlinx.coroutines.internal.S;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final S f54710a = new S("LOCK_FAIL");

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final S f54711b = new S("UNLOCK_FAIL");

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final S f54712c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static final S f54713d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final b f54714e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private static final b f54715f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {112}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes2.dex */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f54716H;

        /* renamed from: I, reason: collision with root package name */
        Object f54717I;

        /* renamed from: J, reason: collision with root package name */
        Object f54718J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f54719K;

        /* renamed from: L, reason: collision with root package name */
        int f54720L;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54719K = obj;
            this.f54720L |= Integer.MIN_VALUE;
            return e.o(null, null, null, this);
        }
    }

    static {
        S s4 = new S("LOCKED");
        f54712c = s4;
        S s5 = new S("UNLOCKED");
        f54713d = s5;
        f54714e = new b(s4);
        f54715f = new b(s5);
    }

    @l3.d
    public static final c a(boolean z3) {
        return new d(z3);
    }

    public static /* synthetic */ c b(boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        return a(z3);
    }

    private static /* synthetic */ void i() {
    }

    private static /* synthetic */ void j() {
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object o(@l3.d kotlinx.coroutines.sync.c r4, @l3.e java.lang.Object r5, @l3.d X2.a<? extends T> r6, @l3.d kotlin.coroutines.c<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.e.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.sync.e$a r0 = (kotlinx.coroutines.sync.e.a) r0
            int r1 = r0.f54720L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54720L = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.e$a r0 = new kotlinx.coroutines.sync.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f54719K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f54720L
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f54718J
            r6 = r4
            X2.a r6 = (X2.a) r6
            java.lang.Object r5 = r0.f54717I
            java.lang.Object r4 = r0.f54716H
            kotlinx.coroutines.sync.c r4 = (kotlinx.coroutines.sync.c) r4
            kotlin.W.n(r7)
            goto L4e
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.W.n(r7)
            r0.f54716H = r4
            r0.f54717I = r5
            r0.f54718J = r6
            r0.f54720L = r3
            java.lang.Object r7 = r4.c(r5, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Object r6 = r6.n()     // Catch: java.lang.Throwable -> L5c
            kotlin.jvm.internal.C.d(r3)
            r4.d(r5)
            kotlin.jvm.internal.C.c(r3)
            return r6
        L5c:
            r6 = move-exception
            kotlin.jvm.internal.C.d(r3)
            r4.d(r5)
            kotlin.jvm.internal.C.c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.e.o(kotlinx.coroutines.sync.c, java.lang.Object, X2.a, kotlin.coroutines.c):java.lang.Object");
    }

    private static final <T> Object p(c cVar, Object obj, X2.a<? extends T> aVar, kotlin.coroutines.c<? super T> cVar2) {
        C.e(0);
        cVar.c(obj, cVar2);
        C.e(1);
        try {
            return aVar.n();
        } finally {
            C.d(1);
            cVar.d(obj);
            C.c(1);
        }
    }

    public static /* synthetic */ Object q(c cVar, Object obj, X2.a aVar, kotlin.coroutines.c cVar2, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = null;
        }
        C.e(0);
        cVar.c(obj, cVar2);
        C.e(1);
        try {
            return aVar.n();
        } finally {
            C.d(1);
            cVar.d(obj);
            C.c(1);
        }
    }
}
