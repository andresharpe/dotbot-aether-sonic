package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.E(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f5, "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/H0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FlowKt__EmittersKt$transform$1<R> extends SuspendLambda implements X2.p<InterfaceC2283j<? super R>, kotlin.coroutines.c<? super H0>, Object> {

    /* renamed from: I, reason: collision with root package name */
    int f53607I;

    /* renamed from: J, reason: collision with root package name */
    private /* synthetic */ Object f53608J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i<T> f53609K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ X2.q<InterfaceC2283j<? super R>, T, kotlin.coroutines.c<? super H0>, Object> f53610L;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.q<InterfaceC2283j<? super R>, T, kotlin.coroutines.c<? super H0>, Object> f53611E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ InterfaceC2283j<R> f53612F;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(X2.q<? super InterfaceC2283j<? super R>, ? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, InterfaceC2283j<? super R> interfaceC2283j) {
            this.f53611E = qVar;
            this.f53612F = interfaceC2283j;
        }

        @l3.e
        public final Object a(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            kotlin.jvm.internal.C.e(4);
            new FlowKt__EmittersKt$transform$1$1$emit$1(this, cVar);
            kotlin.jvm.internal.C.e(5);
            this.f53611E.z(this.f53612F, t3, cVar);
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
        public final java.lang.Object f(T r5, @l3.d kotlin.coroutines.c<? super kotlin.H0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1) r0
                int r1 = r0.f53615J
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53615J = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f53613H
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53615J
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.W.n(r6)
                goto L41
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.W.n(r6)
                X2.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.c<? super kotlin.H0>, java.lang.Object> r6 = r4.f53611E
                kotlinx.coroutines.flow.j<R> r2 = r4.f53612F
                r0.f53615J = r3
                java.lang.Object r5 = r6.z(r2, r5, r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                kotlin.H0 r5 = kotlin.H0.f51801a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1.AnonymousClass1.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$transform$1(InterfaceC2282i<? extends T> interfaceC2282i, X2.q<? super InterfaceC2283j<? super R>, ? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, kotlin.coroutines.c<? super FlowKt__EmittersKt$transform$1> cVar) {
        super(2, cVar);
        this.f53609K = interfaceC2282i;
        this.f53610L = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.e
    public final Object D(@l3.d Object obj) {
        Object l4;
        l4 = kotlin.coroutines.intrinsics.b.l();
        int i4 = this.f53607I;
        if (i4 != 0) {
            if (i4 == 1) {
                W.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            W.n(obj);
            InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f53608J;
            InterfaceC2282i<T> interfaceC2282i = this.f53609K;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f53610L, interfaceC2283j);
            this.f53607I = 1;
            if (interfaceC2282i.a(anonymousClass1, this) == l4) {
                return l4;
            }
        }
        return H0.f51801a;
    }

    @Override // X2.p
    @l3.e
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Object c0(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.e kotlin.coroutines.c<? super H0> cVar) {
        return ((FlowKt__EmittersKt$transform$1) v(interfaceC2283j, cVar)).D(H0.f51801a);
    }

    @l3.e
    public final Object X(@l3.d Object obj) {
        InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f53608J;
        InterfaceC2282i<T> interfaceC2282i = this.f53609K;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f53610L, interfaceC2283j);
        kotlin.jvm.internal.C.e(0);
        interfaceC2282i.a(anonymousClass1, this);
        kotlin.jvm.internal.C.e(1);
        return H0.f51801a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.d
    public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
        FlowKt__EmittersKt$transform$1 flowKt__EmittersKt$transform$1 = new FlowKt__EmittersKt$transform$1(this.f53609K, this.f53610L, cVar);
        flowKt__EmittersKt$transform$1.f53608J = obj;
        return flowKt__EmittersKt$transform$1;
    }
}
