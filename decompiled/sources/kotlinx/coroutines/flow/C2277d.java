package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2277d<T> implements InterfaceC2276c<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final InterfaceC2282i<T> f54096E;

    /* renamed from: kotlinx.coroutines.flow.d$a */
    /* loaded from: classes2.dex */
    static final class a<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j<T> f54097E;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {275}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0487a extends ContinuationImpl {

            /* renamed from: H, reason: collision with root package name */
            /* synthetic */ Object f54098H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ a<T> f54099I;

            /* renamed from: J, reason: collision with root package name */
            int f54100J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0487a(a<? super T> aVar, kotlin.coroutines.c<? super C0487a> cVar) {
                super(cVar);
                this.f54099I = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f54098H = obj;
                this.f54100J |= Integer.MIN_VALUE;
                return this.f54099I.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC2283j<? super T> interfaceC2283j) {
            this.f54097E = interfaceC2283j;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(T r5, @l3.d kotlin.coroutines.c<? super kotlin.H0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.C2277d.a.C0487a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.d$a$a r0 = (kotlinx.coroutines.flow.C2277d.a.C0487a) r0
                int r1 = r0.f54100J
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f54100J = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.d$a$a r0 = new kotlinx.coroutines.flow.d$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f54098H
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f54100J
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.W.n(r6)
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.W.n(r6)
                kotlin.coroutines.f r6 = r0.e()
                kotlinx.coroutines.O0.z(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f54097E
                r0.f54100J = r3
                java.lang.Object r5 = r6.f(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                kotlin.H0 r5 = kotlin.H0.f51801a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C2277d.a.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2277d(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        this.f54096E = interfaceC2282i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object a4 = this.f54096E.a(new a(interfaceC2283j), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }
}
