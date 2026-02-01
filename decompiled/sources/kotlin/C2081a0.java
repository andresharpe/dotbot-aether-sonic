package kotlin;

/* renamed from: kotlin.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2081a0 {
    @kotlin.internal.f
    private static final Void a() {
        throw new NotImplementedError(null, 1, null);
    }

    @kotlin.internal.f
    private static final Void b(String reason) {
        kotlin.jvm.internal.F.p(reason, "reason");
        throw new NotImplementedError("An operation is not implemented: " + reason);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final <T> T c(T t3, X2.l<? super T, H0> block) {
        kotlin.jvm.internal.F.p(block, "block");
        block.C(t3);
        return t3;
    }

    @kotlin.internal.f
    private static final <T> T d(T t3, X2.l<? super T, H0> block) {
        kotlin.jvm.internal.F.p(block, "block");
        block.C(t3);
        return t3;
    }

    @kotlin.internal.f
    private static final <T, R> R e(T t3, X2.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.F.p(block, "block");
        return block.C(t3);
    }

    @kotlin.internal.f
    private static final void f(int i4, X2.l<? super Integer, H0> action) {
        kotlin.jvm.internal.F.p(action, "action");
        for (int i5 = 0; i5 < i4; i5++) {
            action.C(Integer.valueOf(i5));
        }
    }

    @kotlin.internal.f
    private static final <R> R g(X2.a<? extends R> block) {
        kotlin.jvm.internal.F.p(block, "block");
        return block.n();
    }

    @kotlin.internal.f
    private static final <T, R> R h(T t3, X2.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.F.p(block, "block");
        return block.C(t3);
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final <T> T i(T t3, X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(predicate, "predicate");
        if (!predicate.C(t3).booleanValue()) {
            return null;
        }
        return t3;
    }

    @Y(version = "1.1")
    @kotlin.internal.f
    private static final <T> T j(T t3, X2.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.F.p(predicate, "predicate");
        if (predicate.C(t3).booleanValue()) {
            return null;
        }
        return t3;
    }

    @kotlin.internal.f
    private static final <T, R> R k(T t3, X2.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.F.p(block, "block");
        return block.C(t3);
    }
}
