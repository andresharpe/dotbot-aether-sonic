package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1<T> implements InterfaceC2282i<T> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Object[] f53550E;

    @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {114}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u2d8"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f53551H;

        /* renamed from: I, reason: collision with root package name */
        int f53552I;

        /* renamed from: K, reason: collision with root package name */
        Object f53554K;

        /* renamed from: L, reason: collision with root package name */
        Object f53555L;

        /* renamed from: M, reason: collision with root package name */
        int f53556M;

        /* renamed from: N, reason: collision with root package name */
        int f53557N;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53551H = obj;
            this.f53552I |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(Object[] objArr) {
        this.f53550E = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005d -> B:10:0x0060). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super T> r8, @l3.d kotlin.coroutines.c<? super kotlin.H0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.f53552I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53552I = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f53551H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53552I
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f53557N
            int r2 = r0.f53556M
            java.lang.Object r4 = r0.f53555L
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.InterfaceC2283j) r4
            java.lang.Object r5 = r0.f53554K
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 r5 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1) r5
            kotlin.W.n(r9)
            r9 = r4
            goto L60
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.W.n(r9)
            java.lang.Object[] r9 = r7.f53550E
            int r9 = r9.length
            r2 = 0
            r5 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L49:
            if (r2 >= r8) goto L62
            java.lang.Object[] r4 = r5.f53550E
            r4 = r4[r2]
            r0.f53554K = r5
            r0.f53555L = r9
            r0.f53556M = r2
            r0.f53557N = r8
            r0.f53552I = r3
            java.lang.Object r4 = r9.f(r4, r0)
            if (r4 != r1) goto L60
            return r1
        L60:
            int r2 = r2 + r3
            goto L49
        L62:
            kotlin.H0 r8 = kotlin.H0.f51801a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.a(kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }
}
