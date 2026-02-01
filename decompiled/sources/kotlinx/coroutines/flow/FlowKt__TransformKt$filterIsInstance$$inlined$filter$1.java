package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class FlowKt__TransformKt$filterIsInstance$$inlined$filter$1 implements InterfaceC2282i<Object> {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i f53841E;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j f53845E;

        @kotlin.E(k = 3, mv = {1, 6, 0}, xi = 176)
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f53846H;

            /* renamed from: I, reason: collision with root package name */
            int f53847I;

            /* renamed from: J, reason: collision with root package name */
            Object f53848J;

            /* renamed from: K, reason: collision with root package name */
            Object f53849K;

            public AnonymousClass1(kotlin.coroutines.c cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53846H = obj;
                this.f53847I |= Integer.MIN_VALUE;
                return AnonymousClass2.this.f(null, this);
            }
        }

        public AnonymousClass2(InterfaceC2283j interfaceC2283j) {
            this.f53845E = interfaceC2283j;
        }

        @l3.e
        public final Object a(Object obj, @l3.d kotlin.coroutines.c cVar) {
            kotlin.jvm.internal.C.e(4);
            new AnonymousClass1(cVar);
            kotlin.jvm.internal.C.e(5);
            InterfaceC2283j interfaceC2283j = this.f53845E;
            kotlin.jvm.internal.F.y(3, "R");
            if (obj instanceof Object) {
                kotlin.jvm.internal.C.e(0);
                interfaceC2283j.f(obj, cVar);
                kotlin.jvm.internal.C.e(1);
            }
            return H0.f51801a;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(java.lang.Object r6, @l3.d kotlin.coroutines.c r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.f53847I
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53847I = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f53846H
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53847I
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.W.n(r7)
                goto L49
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.W.n(r7)
                kotlinx.coroutines.flow.j r7 = r5.f53845E
                r2 = 3
                java.lang.String r4 = "R"
                kotlin.jvm.internal.F.y(r2, r4)
                boolean r2 = r6 instanceof java.lang.Object
                if (r2 == 0) goto L49
                r0.f53847I = r3
                java.lang.Object r6 = r7.f(r6, r0)
                if (r6 != r1) goto L49
                return r1
            L49:
                kotlin.H0 r6 = kotlin.H0.f51801a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    public FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(InterfaceC2282i interfaceC2282i) {
        this.f53841E = interfaceC2282i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j<? super Object> interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
        Object l4;
        InterfaceC2282i interfaceC2282i = this.f53841E;
        kotlin.jvm.internal.F.w();
        Object a4 = interfaceC2282i.a(new AnonymousClass2(interfaceC2283j), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    @l3.e
    public Object d(@l3.d InterfaceC2283j interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.C.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.1

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f53842H;

            /* renamed from: I, reason: collision with root package name */
            int f53843I;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53842H = obj;
                this.f53843I |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.this.a(null, this);
            }
        };
        kotlin.jvm.internal.C.e(5);
        InterfaceC2282i interfaceC2282i = this.f53841E;
        kotlin.jvm.internal.F.w();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC2283j);
        kotlin.jvm.internal.C.e(0);
        interfaceC2282i.a(anonymousClass2, cVar);
        kotlin.jvm.internal.C.e(1);
        return H0.f51801a;
    }
}
