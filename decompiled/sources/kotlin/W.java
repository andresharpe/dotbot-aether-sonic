package kotlin;

import kotlin.Result;

@kotlin.jvm.internal.U({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
/* loaded from: classes2.dex */
public final class W {
    @l3.d
    @U
    @Y(version = "1.3")
    public static final Object a(@l3.d Throwable exception) {
        kotlin.jvm.internal.F.p(exception, "exception");
        return new Result.Failure(exception);
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> R b(Object obj, X2.l<? super T, ? extends R> onSuccess, X2.l<? super Throwable, ? extends R> onFailure) {
        kotlin.jvm.internal.F.p(onSuccess, "onSuccess");
        kotlin.jvm.internal.F.p(onFailure, "onFailure");
        Throwable e4 = Result.e(obj);
        if (e4 == null) {
            return onSuccess.C(obj);
        }
        return onFailure.C(e4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <R, T extends R> R c(Object obj, R r4) {
        if (Result.i(obj)) {
            return r4;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <R, T extends R> R d(Object obj, X2.l<? super Throwable, ? extends R> onFailure) {
        kotlin.jvm.internal.F.p(onFailure, "onFailure");
        Throwable e4 = Result.e(obj);
        if (e4 != null) {
            return onFailure.C(e4);
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <T> T e(Object obj) {
        n(obj);
        return obj;
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> Object f(Object obj, X2.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(transform, "transform");
        if (Result.j(obj)) {
            Result.a aVar = Result.f51807F;
            return Result.b(transform.C(obj));
        }
        return Result.b(obj);
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> Object g(Object obj, X2.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.F.p(transform, "transform");
        if (Result.j(obj)) {
            try {
                Result.a aVar = Result.f51807F;
                return Result.b(transform.C(obj));
            } catch (Throwable th) {
                Result.a aVar2 = Result.f51807F;
                return Result.b(a(th));
            }
        }
        return Result.b(obj);
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object h(Object obj, X2.l<? super Throwable, H0> action) {
        kotlin.jvm.internal.F.p(action, "action");
        Throwable e4 = Result.e(obj);
        if (e4 != null) {
            action.C(e4);
        }
        return obj;
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object i(Object obj, X2.l<? super T, H0> action) {
        kotlin.jvm.internal.F.p(action, "action");
        if (Result.j(obj)) {
            action.C(obj);
        }
        return obj;
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <R, T extends R> Object j(Object obj, X2.l<? super Throwable, ? extends R> transform) {
        kotlin.jvm.internal.F.p(transform, "transform");
        Throwable e4 = Result.e(obj);
        if (e4 != null) {
            Result.a aVar = Result.f51807F;
            return Result.b(transform.C(e4));
        }
        return obj;
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <R, T extends R> Object k(Object obj, X2.l<? super Throwable, ? extends R> transform) {
        kotlin.jvm.internal.F.p(transform, "transform");
        Throwable e4 = Result.e(obj);
        if (e4 != null) {
            try {
                Result.a aVar = Result.f51807F;
                return Result.b(transform.C(e4));
            } catch (Throwable th) {
                Result.a aVar2 = Result.f51807F;
                return Result.b(a(th));
            }
        }
        return obj;
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <R> Object l(X2.a<? extends R> block) {
        kotlin.jvm.internal.F.p(block, "block");
        try {
            Result.a aVar = Result.f51807F;
            return Result.b(block.n());
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            return Result.b(a(th));
        }
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <T, R> Object m(T t3, X2.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.F.p(block, "block");
        try {
            Result.a aVar = Result.f51807F;
            return Result.b(block.C(t3));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            return Result.b(a(th));
        }
    }

    @U
    @Y(version = "1.3")
    public static final void n(@l3.d Object obj) {
        if (!(obj instanceof Result.Failure)) {
        } else {
            throw ((Result.Failure) obj).f51809E;
        }
    }
}
