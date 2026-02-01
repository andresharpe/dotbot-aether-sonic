package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2280g<T> implements InterfaceC2282i<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final InterfaceC2282i<T> f54105E;

    /* renamed from: F, reason: collision with root package name */
    @W2.f
    @l3.d
    public final X2.l<T, Object> f54106F;

    /* renamed from: G, reason: collision with root package name */
    @W2.f
    @l3.d
    public final X2.p<Object, Object, Boolean> f54107G;

    /* renamed from: kotlinx.coroutines.flow.g$a */
    /* loaded from: classes2.dex */
    static final class a<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C2280g<T> f54108E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Object> f54109F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j<T> f54110G;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {com.clj.fastble.data.c.f27051B}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0488a extends ContinuationImpl {

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f54111H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ a<T> f54112I;

            /* renamed from: J, reason: collision with root package name */
            int f54113J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0488a(a<? super T> aVar, kotlin.coroutines.c<? super C0488a> cVar) {
                super(cVar);
                this.f54112I = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f54111H = obj;
                this.f54113J |= Integer.MIN_VALUE;
                return this.f54112I.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(C2280g<T> c2280g, Ref.ObjectRef<Object> objectRef, InterfaceC2283j<? super T> interfaceC2283j) {
            this.f54108E = c2280g;
            this.f54109F = objectRef;
            this.f54110G = interfaceC2283j;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r6, @l3.d kotlin.coroutines.c<? super kotlin.H0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.C2280g.a.C0488a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.g$a$a r0 = (kotlinx.coroutines.flow.C2280g.a.C0488a) r0
                int r1 = r0.f54113J
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f54113J = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.g$a$a r0 = new kotlinx.coroutines.flow.g$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f54111H
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f54113J
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.W.n(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.W.n(r7)
                kotlinx.coroutines.flow.g<T> r7 = r5.f54108E
                X2.l<T, java.lang.Object> r7 = r7.f54106F
                java.lang.Object r7 = r7.C(r6)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f54109F
                T r2 = r2.f52301E
                kotlinx.coroutines.internal.S r4 = kotlinx.coroutines.flow.internal.s.f54253a
                if (r2 == r4) goto L58
                kotlinx.coroutines.flow.g<T> r4 = r5.f54108E
                X2.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f54107G
                java.lang.Object r2 = r4.c0(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                kotlin.H0 r6 = kotlin.H0.f51801a
                return r6
            L58:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f54109F
                r2.f52301E = r7
                kotlinx.coroutines.flow.j<T> r7 = r5.f54110G
                r0.f54113J = r3
                java.lang.Object r6 = r7.f(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                kotlin.H0 r6 = kotlin.H0.f51801a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C2280g.a.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2280g(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.l<? super T, ? extends Object> lVar, @l3.d X2.p<Object, Object, Boolean> pVar) {
        this.f54105E = interfaceC2282i;
        this.f54106F = lVar;
        this.f54107G = pVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f52301E = (T) kotlinx.coroutines.flow.internal.s.f54253a;
        Object a4 = this.f54105E.a(new a(this, objectRef, interfaceC2283j), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }
}
