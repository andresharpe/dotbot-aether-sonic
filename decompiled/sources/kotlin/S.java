package kotlin;

@kotlin.jvm.internal.U({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
/* loaded from: classes2.dex */
class S extends Q {
    @kotlin.internal.f
    private static final void c(boolean z3) {
        if (z3) {
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @kotlin.internal.f
    private static final void d(boolean z3, X2.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.F.p(lazyMessage, "lazyMessage");
        if (z3) {
        } else {
            throw new IllegalStateException(lazyMessage.n().toString());
        }
    }

    @kotlin.internal.f
    private static final <T> T e(T t3) {
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @kotlin.internal.f
    private static final <T> T f(T t3, X2.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.F.p(lazyMessage, "lazyMessage");
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException(lazyMessage.n().toString());
    }

    @kotlin.internal.f
    private static final Void g(Object message) {
        kotlin.jvm.internal.F.p(message, "message");
        throw new IllegalStateException(message.toString());
    }

    @kotlin.internal.f
    private static final void h(boolean z3) {
        if (z3) {
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @kotlin.internal.f
    private static final void i(boolean z3, X2.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.F.p(lazyMessage, "lazyMessage");
        if (z3) {
        } else {
            throw new IllegalArgumentException(lazyMessage.n().toString());
        }
    }

    @kotlin.internal.f
    private static final <T> T j(T t3) {
        if (t3 != null) {
            return t3;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @kotlin.internal.f
    private static final <T> T k(T t3, X2.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.F.p(lazyMessage, "lazyMessage");
        if (t3 != null) {
            return t3;
        }
        throw new IllegalArgumentException(lazyMessage.n().toString());
    }
}
