package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class M<T> implements x<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final x<T> f54081E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final X2.p<InterfaceC2283j<? super T>, kotlin.coroutines.c<? super H0>, Object> f54082F;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {409}, m = "collect", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f54083H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ M<T> f54084I;

        /* renamed from: J, reason: collision with root package name */
        int f54085J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(M<T> m4, kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
            this.f54084I = m4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54083H = obj;
            this.f54085J |= Integer.MIN_VALUE;
            return this.f54084I.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public M(@l3.d x<? extends T> xVar, @l3.d X2.p<? super InterfaceC2283j<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        this.f54081E = xVar;
        this.f54082F = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.x, kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super T> r6, @l3.d kotlin.coroutines.c<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.M.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.M$a r0 = (kotlinx.coroutines.flow.M.a) r0
            int r1 = r0.f54085J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54085J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.M$a r0 = new kotlinx.coroutines.flow.M$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f54083H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f54085J
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.W.n(r7)
            goto L46
        L31:
            kotlin.W.n(r7)
            kotlinx.coroutines.flow.x<T> r7 = r5.f54081E
            kotlinx.coroutines.flow.L r2 = new kotlinx.coroutines.flow.L
            X2.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.c<? super kotlin.H0>, java.lang.Object> r4 = r5.f54082F
            r2.<init>(r6, r4)
            r0.f54085J = r3
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.M.a(kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.x
    @l3.d
    public List<T> b() {
        return this.f54081E.b();
    }
}
