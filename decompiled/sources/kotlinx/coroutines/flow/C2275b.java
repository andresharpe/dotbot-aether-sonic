package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2275b<T> extends C2279f<T> {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final X2.p<kotlinx.coroutines.channels.D<? super T>, kotlin.coroutines.c<? super H0>, Object> f54091I;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {336}, m = "collectTo", n = {com.spotify.sdk.android.auth.a.f48959e}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.b$a */
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f54092H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f54093I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ C2275b<T> f54094J;

        /* renamed from: K, reason: collision with root package name */
        int f54095K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2275b<T> c2275b, kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
            this.f54094J = c2275b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54093I = obj;
            this.f54095K |= Integer.MIN_VALUE;
            return this.f54094J.g(null, this);
        }
    }

    public /* synthetic */ C2275b(X2.p pVar, kotlin.coroutines.f fVar, int i4, BufferOverflow bufferOverflow, int i5, C2197u c2197u) {
        this(pVar, (i5 & 2) != 0 ? EmptyCoroutineContext.f52041E : fVar, (i5 & 4) != 0 ? -2 : i4, (i5 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.C2279f, kotlinx.coroutines.flow.internal.d
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@l3.d kotlinx.coroutines.channels.D<? super T> r5, @l3.d kotlin.coroutines.c<? super kotlin.H0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C2275b.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.b$a r0 = (kotlinx.coroutines.flow.C2275b.a) r0
            int r1 = r0.f54095K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54095K = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.b$a r0 = new kotlinx.coroutines.flow.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f54093I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f54095K
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f54092H
            kotlinx.coroutines.channels.D r5 = (kotlinx.coroutines.channels.D) r5
            kotlin.W.n(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.W.n(r6)
            r0.f54092H = r5
            r0.f54095K = r3
            java.lang.Object r6 = super.g(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.W()
            if (r5 == 0) goto L4c
            kotlin.H0 r5 = kotlin.H0.f51801a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C2275b.g(kotlinx.coroutines.channels.D, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.C2279f, kotlinx.coroutines.flow.internal.d
    @l3.d
    protected kotlinx.coroutines.flow.internal.d<T> l(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        return new C2275b(this.f54091I, fVar, i4, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2275b(@l3.d X2.p<? super kotlinx.coroutines.channels.D<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, @l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        super(pVar, fVar, i4, bufferOverflow);
        this.f54091I = pVar;
    }
}
