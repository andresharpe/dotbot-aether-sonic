package kotlin;

/* renamed from: kotlin.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2083b0 extends C2081a0 {
    @kotlin.internal.f
    private static final <R> R l(Object lock, X2.a<? extends R> block) {
        R n4;
        kotlin.jvm.internal.F.p(lock, "lock");
        kotlin.jvm.internal.F.p(block, "block");
        synchronized (lock) {
            try {
                n4 = block.n();
                kotlin.jvm.internal.C.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.C.d(1);
                kotlin.jvm.internal.C.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.C.c(1);
        return n4;
    }
}
