package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.H0;
import kotlin.W;
import kotlin.collections.C2108v;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class G implements C {

    /* renamed from: b, reason: collision with root package name */
    private final long f54053b;

    /* renamed from: c, reason: collision with root package name */
    private final long f54054c;

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    /* loaded from: classes2.dex */
    static final class a extends SuspendLambda implements X2.q<InterfaceC2283j<? super SharingCommand>, Integer, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f54055I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f54056J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ int f54057K;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(3, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x009b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r9.f54055I
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f54056J
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC2283j) r1
                kotlin.W.n(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f54056J
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC2283j) r1
                kotlin.W.n(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f54056J
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC2283j) r1
                kotlin.W.n(r10)
                goto L64
            L38:
                kotlin.W.n(r10)
                goto L9c
            L3c:
                kotlin.W.n(r10)
                java.lang.Object r10 = r9.f54056J
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC2283j) r1
                int r10 = r9.f54057K
                if (r10 <= 0) goto L53
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.START
                r9.f54055I = r6
                java.lang.Object r10 = r1.f(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                kotlinx.coroutines.flow.G r10 = kotlinx.coroutines.flow.G.this
                long r6 = kotlinx.coroutines.flow.G.c(r10)
                r9.f54056J = r1
                r9.f54055I = r5
                java.lang.Object r10 = kotlinx.coroutines.C2269d0.b(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                kotlinx.coroutines.flow.G r10 = kotlinx.coroutines.flow.G.this
                long r5 = kotlinx.coroutines.flow.G.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP
                r9.f54056J = r1
                r9.f54055I = r4
                java.lang.Object r10 = r1.f(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                kotlinx.coroutines.flow.G r10 = kotlinx.coroutines.flow.G.this
                long r4 = kotlinx.coroutines.flow.G.b(r10)
                r9.f54056J = r1
                r9.f54055I = r3
                java.lang.Object r10 = kotlinx.coroutines.C2269d0.b(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f54056J = r3
                r9.f54055I = r2
                java.lang.Object r10 = r1.f(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                kotlin.H0 r10 = kotlin.H0.f51801a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.G.a.D(java.lang.Object):java.lang.Object");
        }

        @l3.e
        public final Object R(@l3.d InterfaceC2283j<? super SharingCommand> interfaceC2283j, int i4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            a aVar = new a(cVar);
            aVar.f54056J = interfaceC2283j;
            aVar.f54057K = i4;
            return aVar.D(H0.f51801a);
        }

        @Override // X2.q
        public /* bridge */ /* synthetic */ Object z(InterfaceC2283j<? super SharingCommand> interfaceC2283j, Integer num, kotlin.coroutines.c<? super H0> cVar) {
            return R(interfaceC2283j, num.intValue(), cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class b extends SuspendLambda implements X2.p<SharingCommand, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f54059I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f54060J;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            boolean z3;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f54059I == 0) {
                W.n(obj);
                if (((SharingCommand) this.f54060J) != SharingCommand.START) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return kotlin.coroutines.jvm.internal.a.a(z3);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d SharingCommand sharingCommand, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((b) v(sharingCommand, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            b bVar = new b(cVar);
            bVar.f54060J = obj;
            return bVar;
        }
    }

    public G(long j4, long j5) {
        this.f54053b = j4;
        this.f54054c = j5;
        if (j4 >= 0) {
            if (j5 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j5 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j4 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.C
    @l3.d
    public InterfaceC2282i<SharingCommand> a(@l3.d H<Integer> h4) {
        return C2284k.g0(C2284k.k0(C2284k.b2(h4, new a(null)), new b(null)));
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof G) {
            G g4 = (G) obj;
            if (this.f54053b == g4.f54053b && this.f54054c == g4.f54054c) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f54053b) * 31) + Long.hashCode(this.f54054c);
    }

    @l3.d
    public String toString() {
        List j4;
        List a4;
        String m32;
        j4 = C2108v.j(2);
        if (this.f54053b > 0) {
            j4.add("stopTimeout=" + this.f54053b + "ms");
        }
        if (this.f54054c < Long.MAX_VALUE) {
            j4.add("replayExpiration=" + this.f54054c + "ms");
        }
        a4 = C2108v.a(j4);
        StringBuilder sb = new StringBuilder();
        sb.append("SharingStarted.WhileSubscribed(");
        m32 = kotlin.collections.D.m3(a4, null, null, null, 0, null, null, 63, null);
        sb.append(m32);
        sb.append(')');
        return sb.toString();
    }
}
