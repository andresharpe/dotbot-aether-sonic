package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
public final class FlowKt__TransformKt$map$$inlined$unsafeTransform$1<R> implements InterfaceC2282i<R> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i f53868E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ X2.p f53869F;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j f53873E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ X2.p f53874F;

        @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 176)
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f53875H;

            /* renamed from: I, reason: collision with root package name */
            int f53876I;

            /* renamed from: K, reason: collision with root package name */
            Object f53878K;

            public AnonymousClass1(kotlin.coroutines.c cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53875H = obj;
                this.f53876I |= Integer.MIN_VALUE;
                return AnonymousClass2.this.f(null, this);
            }
        }

        public AnonymousClass2(InterfaceC2283j interfaceC2283j, X2.p pVar) {
            this.f53873E = interfaceC2283j;
            this.f53874F = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @l3.e
        public final Object a(Object obj, @l3.d kotlin.coroutines.c cVar) {
            kotlin.jvm.internal.C.e(4);
            new AnonymousClass1(cVar);
            kotlin.jvm.internal.C.e(5);
            InterfaceC2283j interfaceC2283j = this.f53873E;
            Object c02 = this.f53874F.c0(obj, cVar);
            kotlin.jvm.internal.C.e(0);
            interfaceC2283j.f(c02, cVar);
            kotlin.jvm.internal.C.e(1);
            return H0.f51801a;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r7, @l3.d kotlin.coroutines.c<? super kotlin.H0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.f53876I
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53876I = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f53875H
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53876I
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.W.n(r8)
                goto L5d
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f53878K
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC2283j) r7
                kotlin.W.n(r8)
                goto L51
            L3c:
                kotlin.W.n(r8)
                kotlinx.coroutines.flow.j r8 = r6.f53873E
                X2.p r2 = r6.f53874F
                r0.f53878K = r8
                r0.f53876I = r4
                java.lang.Object r7 = r2.c0(r7, r0)
                if (r7 != r1) goto L4e
                return r1
            L4e:
                r5 = r8
                r8 = r7
                r7 = r5
            L51:
                r2 = 0
                r0.f53878K = r2
                r0.f53876I = r3
                java.lang.Object r7 = r7.f(r8, r0)
                if (r7 != r1) goto L5d
                return r1
            L5d:
                kotlin.H0 r7 = kotlin.H0.f51801a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    public FlowKt__TransformKt$map$$inlined$unsafeTransform$1(InterfaceC2282i interfaceC2282i, X2.p pVar) {
        this.f53868E = interfaceC2282i;
        this.f53869F = pVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
        Object l4;
        Object a4 = this.f53868E.a(new AnonymousClass2(interfaceC2283j, this.f53869F), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    @l3.e
    public Object d(@l3.d InterfaceC2283j interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.C.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.1

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f53870H;

            /* renamed from: I, reason: collision with root package name */
            int f53871I;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53870H = obj;
                this.f53871I |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$map$$inlined$unsafeTransform$1.this.a(null, this);
            }
        };
        kotlin.jvm.internal.C.e(5);
        InterfaceC2282i interfaceC2282i = this.f53868E;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC2283j, this.f53869F);
        kotlin.jvm.internal.C.e(0);
        interfaceC2282i.a(anonymousClass2, cVar);
        kotlin.jvm.internal.C.e(1);
        return H0.f51801a;
    }
}
