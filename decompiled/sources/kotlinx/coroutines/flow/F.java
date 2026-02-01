package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.KotlinNothingValueException;
import kotlin.W;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
final class F implements C {

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class a extends SuspendLambda implements X2.p<InterfaceC2283j<? super SharingCommand>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f53483I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f53484J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ H<Integer> f53485K;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kotlinx.coroutines.flow.F$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0483a<T> implements InterfaceC2283j {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ Ref.BooleanRef f53486E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ InterfaceC2283j<SharingCommand> f53487F;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {158}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.F$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0484a extends ContinuationImpl {

                /* renamed from: H, reason: collision with root package name */
                /* synthetic */ Object f53488H;

                /* renamed from: I, reason: collision with root package name */
                final /* synthetic */ C0483a<T> f53489I;

                /* renamed from: J, reason: collision with root package name */
                int f53490J;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0484a(C0483a<? super T> c0483a, kotlin.coroutines.c<? super C0484a> cVar) {
                    super(cVar);
                    this.f53489I = c0483a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l3.e
                public final Object D(@l3.d Object obj) {
                    this.f53488H = obj;
                    this.f53490J |= Integer.MIN_VALUE;
                    return this.f53489I.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0483a(Ref.BooleanRef booleanRef, InterfaceC2283j<? super SharingCommand> interfaceC2283j) {
                this.f53486E = booleanRef;
                this.f53487F = interfaceC2283j;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @l3.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(int r5, @l3.d kotlin.coroutines.c<? super kotlin.H0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.F.a.C0483a.C0484a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.F$a$a$a r0 = (kotlinx.coroutines.flow.F.a.C0483a.C0484a) r0
                    int r1 = r0.f53490J
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f53490J = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.F$a$a$a r0 = new kotlinx.coroutines.flow.F$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f53488H
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                    int r2 = r0.f53490J
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.W.n(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.W.n(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.Ref$BooleanRef r5 = r4.f53486E
                    boolean r6 = r5.f52294E
                    if (r6 != 0) goto L4e
                    r5.f52294E = r3
                    kotlinx.coroutines.flow.j<kotlinx.coroutines.flow.SharingCommand> r5 = r4.f53487F
                    kotlinx.coroutines.flow.SharingCommand r6 = kotlinx.coroutines.flow.SharingCommand.START
                    r0.f53490J = r3
                    java.lang.Object r5 = r5.f(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.H0 r5 = kotlin.H0.f51801a
                    return r5
                L4e:
                    kotlin.H0 r5 = kotlin.H0.f51801a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.F.a.C0483a.a(int, kotlin.coroutines.c):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2283j
            public /* bridge */ /* synthetic */ Object f(Object obj, kotlin.coroutines.c cVar) {
                return a(((Number) obj).intValue(), cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(H<Integer> h4, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f53485K = h4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f53483I;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                W.n(obj);
            } else {
                W.n(obj);
                InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f53484J;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                H<Integer> h4 = this.f53485K;
                C0483a c0483a = new C0483a(booleanRef, interfaceC2283j);
                this.f53483I = 1;
                if (h4.a(c0483a, this) == l4) {
                    return l4;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d InterfaceC2283j<? super SharingCommand> interfaceC2283j, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(interfaceC2283j, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(this.f53485K, cVar);
            aVar.f53484J = obj;
            return aVar;
        }
    }

    @Override // kotlinx.coroutines.flow.C
    @l3.d
    public InterfaceC2282i<SharingCommand> a(@l3.d H<Integer> h4) {
        return C2284k.I0(new a(h4, null));
    }

    @l3.d
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
