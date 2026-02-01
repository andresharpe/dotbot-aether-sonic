package kotlinx.coroutines.channels;

import com.harman.jbl.partybox.ui.effectlab.a;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C0;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.InterfaceC2239b1;

/* loaded from: classes2.dex */
public final class M {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {a.b.f43497g, 108, androidx.appcompat.app.i.f4871X}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        long f53041H;

        /* renamed from: I, reason: collision with root package name */
        Object f53042I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f53043J;

        /* renamed from: K, reason: collision with root package name */
        int f53044K;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53043J = obj;
            this.f53044K |= Integer.MIN_VALUE;
            return M.c(0L, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {84, 88, 94, 96}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    /* loaded from: classes2.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        long f53045H;

        /* renamed from: I, reason: collision with root package name */
        long f53046I;

        /* renamed from: J, reason: collision with root package name */
        Object f53047J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f53048K;

        /* renamed from: L, reason: collision with root package name */
        int f53049L;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53048K = obj;
            this.f53049L |= Integer.MIN_VALUE;
            return M.d(0L, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements X2.p<D<? super H0>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f53050I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f53051J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ TickerMode f53052K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ long f53053L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ long f53054M;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f53055a;

            static {
                int[] iArr = new int[TickerMode.values().length];
                iArr[TickerMode.FIXED_PERIOD.ordinal()] = 1;
                iArr[TickerMode.FIXED_DELAY.ordinal()] = 2;
                f53055a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(TickerMode tickerMode, long j4, long j5, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f53052K = tickerMode;
            this.f53053L = j4;
            this.f53054M = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f53050I;
            if (i4 != 0) {
                if (i4 == 1 || i4 == 2) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                D d4 = (D) this.f53051J;
                int i5 = a.f53055a[this.f53052K.ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        long j4 = this.f53053L;
                        long j5 = this.f53054M;
                        J h4 = d4.h();
                        this.f53050I = 2;
                        if (M.c(j4, j5, h4, this) == l4) {
                            return l4;
                        }
                    }
                } else {
                    long j6 = this.f53053L;
                    long j7 = this.f53054M;
                    J h5 = d4.h();
                    this.f53050I = 1;
                    if (M.d(j6, j7, h5, this) == l4) {
                        return l4;
                    }
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d D<? super H0> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((c) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            c cVar2 = new c(this.f53052K, this.f53053L, this.f53054M, cVar);
            cVar2.f53051J = obj;
            return cVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007d -> B:12:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r6, long r8, kotlinx.coroutines.channels.J<? super kotlin.H0> r10, kotlin.coroutines.c<? super kotlin.H0> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.M.a
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.M$a r0 = (kotlinx.coroutines.channels.M.a) r0
            int r1 = r0.f53044K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53044K = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.M$a r0 = new kotlinx.coroutines.channels.M$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f53043J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53044K
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            long r6 = r0.f53041H
            java.lang.Object r8 = r0.f53042I
            kotlinx.coroutines.channels.J r8 = (kotlinx.coroutines.channels.J) r8
            kotlin.W.n(r11)
        L34:
            r10 = r8
            goto L63
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            long r6 = r0.f53041H
            java.lang.Object r8 = r0.f53042I
            kotlinx.coroutines.channels.J r8 = (kotlinx.coroutines.channels.J) r8
            kotlin.W.n(r11)
            goto L73
        L48:
            long r6 = r0.f53041H
            java.lang.Object r8 = r0.f53042I
            r10 = r8
            kotlinx.coroutines.channels.J r10 = (kotlinx.coroutines.channels.J) r10
            kotlin.W.n(r11)
            goto L63
        L53:
            kotlin.W.n(r11)
            r0.f53042I = r10
            r0.f53041H = r6
            r0.f53044K = r5
            java.lang.Object r8 = kotlinx.coroutines.C2269d0.b(r8, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            kotlin.H0 r8 = kotlin.H0.f51801a
            r0.f53042I = r10
            r0.f53041H = r6
            r0.f53044K = r4
            java.lang.Object r8 = r10.U(r8, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            r8 = r10
        L73:
            r0.f53042I = r8
            r0.f53041H = r6
            r0.f53044K = r3
            java.lang.Object r9 = kotlinx.coroutines.C2269d0.b(r6, r0)
            if (r9 != r1) goto L34
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.M.c(long, long, kotlinx.coroutines.channels.J, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00fc -> B:15:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0112 -> B:13:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(long r18, long r20, kotlinx.coroutines.channels.J<? super kotlin.H0> r22, kotlin.coroutines.c<? super kotlin.H0> r23) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.M.d(long, long, kotlinx.coroutines.channels.J, kotlin.coroutines.c):java.lang.Object");
    }

    @InterfaceC2239b1
    @l3.d
    public static final F<H0> e(long j4, long j5, @l3.d kotlin.coroutines.f fVar, @l3.d TickerMode tickerMode) {
        if (j4 >= 0) {
            if (j5 >= 0) {
                return B.c(C0.f52916E, C2322k0.g().A(fVar), 0, new c(tickerMode, j4, j5, null));
            }
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j5 + " ms").toString());
        }
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j4 + " ms").toString());
    }

    public static /* synthetic */ F f(long j4, long j5, kotlin.coroutines.f fVar, TickerMode tickerMode, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j5 = j4;
        }
        if ((i4 & 4) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        if ((i4 & 8) != 0) {
            tickerMode = TickerMode.FIXED_PERIOD;
        }
        return e(j4, j5, fVar, tickerMode);
    }
}
