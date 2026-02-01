package kotlin.coroutines;

import X2.l;
import X2.p;
import kotlin.H0;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.W;
import kotlin.Y;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

/* loaded from: classes2.dex */
public final class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @U({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n*L\n1#1,161:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a<T> implements c<T> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ f f52048E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ l<Result<? extends T>, H0> f52049F;

        /* JADX WARN: Multi-variable type inference failed */
        public a(f fVar, l<? super Result<? extends T>, H0> lVar) {
            this.f52048E = fVar;
            this.f52049F = lVar;
        }

        @Override // kotlin.coroutines.c
        @l3.d
        public f e() {
            return this.f52048E;
        }

        @Override // kotlin.coroutines.c
        public void x(@l3.d Object obj) {
            this.f52049F.C(Result.a(obj));
        }
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <T> c<T> a(f context, l<? super Result<? extends T>, H0> resumeWith) {
        F.p(context, "context");
        F.p(resumeWith, "resumeWith");
        return new a(context, resumeWith);
    }

    @l3.d
    @Y(version = "1.3")
    public static final <T> c<H0> b(@l3.d l<? super c<? super T>, ? extends Object> lVar, @l3.d c<? super T> completion) {
        c b4;
        c e4;
        Object l4;
        F.p(lVar, "<this>");
        F.p(completion, "completion");
        b4 = IntrinsicsKt__IntrinsicsJvmKt.b(lVar, completion);
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(b4);
        l4 = kotlin.coroutines.intrinsics.b.l();
        return new i(e4, l4);
    }

    @l3.d
    @Y(version = "1.3")
    public static final <R, T> c<H0> c(@l3.d p<? super R, ? super c<? super T>, ? extends Object> pVar, R r4, @l3.d c<? super T> completion) {
        c c4;
        c e4;
        Object l4;
        F.p(pVar, "<this>");
        F.p(completion, "completion");
        c4 = IntrinsicsKt__IntrinsicsJvmKt.c(pVar, r4, completion);
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(c4);
        l4 = kotlin.coroutines.intrinsics.b.l();
        return new i(e4, l4);
    }

    private static final f d() {
        throw new NotImplementedError("Implemented as intrinsic");
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    public static /* synthetic */ void e() {
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <T> void f(c<? super T> cVar, T t3) {
        F.p(cVar, "<this>");
        Result.a aVar = Result.f51807F;
        cVar.x(Result.b(t3));
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <T> void g(c<? super T> cVar, Throwable exception) {
        F.p(cVar, "<this>");
        F.p(exception, "exception");
        Result.a aVar = Result.f51807F;
        cVar.x(Result.b(W.a(exception)));
    }

    @Y(version = "1.3")
    public static final <T> void h(@l3.d l<? super c<? super T>, ? extends Object> lVar, @l3.d c<? super T> completion) {
        c b4;
        c e4;
        F.p(lVar, "<this>");
        F.p(completion, "completion");
        b4 = IntrinsicsKt__IntrinsicsJvmKt.b(lVar, completion);
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(b4);
        Result.a aVar = Result.f51807F;
        e4.x(Result.b(H0.f51801a));
    }

    @Y(version = "1.3")
    public static final <R, T> void i(@l3.d p<? super R, ? super c<? super T>, ? extends Object> pVar, R r4, @l3.d c<? super T> completion) {
        c c4;
        c e4;
        F.p(pVar, "<this>");
        F.p(completion, "completion");
        c4 = IntrinsicsKt__IntrinsicsJvmKt.c(pVar, r4, completion);
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(c4);
        Result.a aVar = Result.f51807F;
        e4.x(Result.b(H0.f51801a));
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object j(l<? super c<? super T>, H0> lVar, c<? super T> cVar) {
        c e4;
        Object l4;
        C.e(0);
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        i iVar = new i(e4);
        lVar.C(iVar);
        Object a4 = iVar.a();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        C.e(1);
        return a4;
    }
}
