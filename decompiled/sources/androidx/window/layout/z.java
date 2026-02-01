package androidx.window.layout;

import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.C;
import kotlin.H0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.channels.InterfaceC2254m;
import kotlinx.coroutines.flow.C2284k;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;

/* loaded from: classes.dex */
public final class z implements x {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    public static final a f20913d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final int f20914e = 10;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final D f20915b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final w f20916c;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {0, 0, 1, 1}, l = {54, ConstraintLayout.b.a.f9601d0}, m = "invokeSuspend", n = {"$this$flow", C.a.f28602a, "$this$flow", C.a.f28602a}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes.dex */
    static final class b extends SuspendLambda implements X2.p<InterfaceC2283j<? super B>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f20917I;

        /* renamed from: J, reason: collision with root package name */
        Object f20918J;

        /* renamed from: K, reason: collision with root package name */
        int f20919K;

        /* renamed from: L, reason: collision with root package name */
        private /* synthetic */ Object f20920L;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ Activity f20922N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f20922N = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b0(InterfaceC2254m interfaceC2254m, B info) {
            kotlin.jvm.internal.F.o(info, "info");
            interfaceC2254m.S(info);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x007e A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001a, B:9:0x0064, B:14:0x0076, B:16:0x007e, B:25:0x0036, B:27:0x0060), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0090 -> B:8:0x001d). Please report as a decompilation issue!!! */
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
                int r1 = r9.f20919K
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3a
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L22
                java.lang.Object r1 = r9.f20918J
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r4 = r9.f20917I
                androidx.core.util.e r4 = (androidx.core.util.InterfaceC0764e) r4
                java.lang.Object r5 = r9.f20920L
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC2283j) r5
                kotlin.W.n(r10)     // Catch: java.lang.Throwable -> L1f
            L1d:
                r10 = r5
                goto L64
            L1f:
                r10 = move-exception
                goto L9f
            L22:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2a:
                java.lang.Object r1 = r9.f20918J
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r4 = r9.f20917I
                androidx.core.util.e r4 = (androidx.core.util.InterfaceC0764e) r4
                java.lang.Object r5 = r9.f20920L
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC2283j) r5
                kotlin.W.n(r10)     // Catch: java.lang.Throwable -> L1f
                goto L76
            L3a:
                kotlin.W.n(r10)
                java.lang.Object r10 = r9.f20920L
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC2283j) r10
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                r4 = 4
                r5 = 10
                r6 = 0
                kotlinx.coroutines.channels.m r1 = kotlinx.coroutines.channels.p.d(r5, r1, r6, r4, r6)
                androidx.window.layout.A r4 = new androidx.window.layout.A
                r4.<init>()
                androidx.window.layout.z r5 = androidx.window.layout.z.this
                androidx.window.layout.w r5 = androidx.window.layout.z.e(r5)
                android.app.Activity r6 = r9.f20922N
                androidx.profileinstaller.g r7 = new androidx.profileinstaller.g
                r7.<init>()
                r5.b(r6, r7, r4)
                kotlinx.coroutines.channels.o r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
            L64:
                r9.f20920L = r10     // Catch: java.lang.Throwable -> L1f
                r9.f20917I = r4     // Catch: java.lang.Throwable -> L1f
                r9.f20918J = r1     // Catch: java.lang.Throwable -> L1f
                r9.f20919K = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L1f
                if (r5 != r0) goto L73
                return r0
            L73:
                r8 = r5
                r5 = r10
                r10 = r8
            L76:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L1f
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L1f
                if (r10 == 0) goto L93
                java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L1f
                androidx.window.layout.B r10 = (androidx.window.layout.B) r10     // Catch: java.lang.Throwable -> L1f
                r9.f20920L = r5     // Catch: java.lang.Throwable -> L1f
                r9.f20917I = r4     // Catch: java.lang.Throwable -> L1f
                r9.f20918J = r1     // Catch: java.lang.Throwable -> L1f
                r9.f20919K = r2     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r10 = r5.f(r10, r9)     // Catch: java.lang.Throwable -> L1f
                if (r10 != r0) goto L1d
                return r0
            L93:
                androidx.window.layout.z r10 = androidx.window.layout.z.this
                androidx.window.layout.w r10 = androidx.window.layout.z.e(r10)
                r10.a(r4)
                kotlin.H0 r10 = kotlin.H0.f51801a
                return r10
            L9f:
                androidx.window.layout.z r0 = androidx.window.layout.z.this
                androidx.window.layout.w r0 = androidx.window.layout.z.e(r0)
                r0.a(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.z.b.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d InterfaceC2283j<? super B> interfaceC2283j, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(interfaceC2283j, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            b bVar = new b(this.f20922N, cVar);
            bVar.f20920L = obj;
            return bVar;
        }
    }

    public z(@l3.d D windowMetricsCalculator, @l3.d w windowBackend) {
        kotlin.jvm.internal.F.p(windowMetricsCalculator, "windowMetricsCalculator");
        kotlin.jvm.internal.F.p(windowBackend, "windowBackend");
        this.f20915b = windowMetricsCalculator;
        this.f20916c = windowBackend;
    }

    @Override // androidx.window.layout.x
    @l3.d
    public InterfaceC2282i<B> d(@l3.d Activity activity) {
        kotlin.jvm.internal.F.p(activity, "activity");
        return C2284k.I0(new b(activity, null));
    }
}
