package kotlinx.coroutines.flow;

import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.InterfaceC2250i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2285l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: kotlinx.coroutines.flow.l$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements InterfaceC2282i<T> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC2250i f54268E;

        public a(InterfaceC2250i interfaceC2250i) {
            this.f54268E = interfaceC2250i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2282i
        @l3.e
        public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            Object l4;
            Object l02 = C2284k.l0(interfaceC2283j, this.f54268E.R(), cVar);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (l02 == l4) {
                return l02;
            }
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    /* renamed from: kotlinx.coroutines.flow.l$b */
    /* loaded from: classes2.dex */
    public static final class b<T> extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f54269H;

        /* renamed from: I, reason: collision with root package name */
        Object f54270I;

        /* renamed from: J, reason: collision with root package name */
        boolean f54271J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f54272K;

        /* renamed from: L, reason: collision with root package name */
        int f54273L;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54272K = obj;
            this.f54273L |= Integer.MIN_VALUE;
            return C2285l.e(null, null, false, this);
        }
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> InterfaceC2282i<T> b(@l3.d InterfaceC2250i<T> interfaceC2250i) {
        return new a(interfaceC2250i);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> c(@l3.d kotlinx.coroutines.channels.F<? extends T> f4) {
        return new C2278e(f4, true, null, 0, null, 28, null);
    }

    @l3.e
    public static final <T> Object d(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlinx.coroutines.channels.F<? extends T> f4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object e4 = e(interfaceC2283j, f4, true, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (e4 == l4) {
            return e4;
        }
        return H0.f51801a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x0032, B:20:0x006f, B:22:0x0075, B:28:0x0084, B:30:0x0085, B:46:0x004d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x0032, B:20:0x006f, B:22:0x0075, B:28:0x0084, B:30:0x0085, B:46:0x004d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.j<? super T>] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlinx.coroutines.flow.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0095 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(kotlinx.coroutines.flow.InterfaceC2283j<? super T> r6, kotlinx.coroutines.channels.F<? extends T> r7, boolean r8, kotlin.coroutines.c<? super kotlin.H0> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.C2285l.b
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.l$b r0 = (kotlinx.coroutines.flow.C2285l.b) r0
            int r1 = r0.f54273L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54273L = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.l$b r0 = new kotlinx.coroutines.flow.l$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f54272K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f54273L
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            boolean r6 = r0.f54271J
            java.lang.Object r7 = r0.f54270I
            kotlinx.coroutines.channels.F r7 = (kotlinx.coroutines.channels.F) r7
            java.lang.Object r8 = r0.f54269H
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC2283j) r8
            kotlin.W.n(r9)     // Catch: java.lang.Throwable -> L39
        L35:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L5d
        L39:
            r8 = move-exception
            goto L9c
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            boolean r6 = r0.f54271J
            java.lang.Object r7 = r0.f54270I
            kotlinx.coroutines.channels.F r7 = (kotlinx.coroutines.channels.F) r7
            java.lang.Object r8 = r0.f54269H
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC2283j) r8
            kotlin.W.n(r9)     // Catch: java.lang.Throwable -> L39
            kotlinx.coroutines.channels.q r9 = (kotlinx.coroutines.channels.q) r9     // Catch: java.lang.Throwable -> L39
            java.lang.Object r9 = r9.o()     // Catch: java.lang.Throwable -> L39
            goto L6f
        L57:
            kotlin.W.n(r9)
            kotlinx.coroutines.flow.C2284k.o0(r6)
        L5d:
            r0.f54269H = r6     // Catch: java.lang.Throwable -> L98
            r0.f54270I = r7     // Catch: java.lang.Throwable -> L98
            r0.f54271J = r8     // Catch: java.lang.Throwable -> L98
            r0.f54273L = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r9 = r7.E(r0)     // Catch: java.lang.Throwable -> L98
            if (r9 != r1) goto L6c
            return r1
        L6c:
            r5 = r8
            r8 = r6
            r6 = r5
        L6f:
            boolean r2 = kotlinx.coroutines.channels.q.k(r9)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L85
            java.lang.Throwable r8 = kotlinx.coroutines.channels.q.f(r9)     // Catch: java.lang.Throwable -> L39
            if (r8 != 0) goto L84
            if (r6 == 0) goto L81
            r6 = 0
            kotlinx.coroutines.channels.r.b(r7, r6)
        L81:
            kotlin.H0 r6 = kotlin.H0.f51801a
            return r6
        L84:
            throw r8     // Catch: java.lang.Throwable -> L39
        L85:
            java.lang.Object r9 = kotlinx.coroutines.channels.q.i(r9)     // Catch: java.lang.Throwable -> L39
            r0.f54269H = r8     // Catch: java.lang.Throwable -> L39
            r0.f54270I = r7     // Catch: java.lang.Throwable -> L39
            r0.f54271J = r6     // Catch: java.lang.Throwable -> L39
            r0.f54273L = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r9 = r8.f(r9, r0)     // Catch: java.lang.Throwable -> L39
            if (r9 != r1) goto L35
            return r1
        L98:
            r6 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
        L9c:
            throw r8     // Catch: java.lang.Throwable -> L9d
        L9d:
            r9 = move-exception
            if (r6 == 0) goto La3
            kotlinx.coroutines.channels.r.b(r7, r8)
        La3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C2285l.e(kotlinx.coroutines.flow.j, kotlinx.coroutines.channels.F, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    @B0
    @l3.d
    public static final <T> kotlinx.coroutines.channels.F<T> f(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d U u3) {
        return kotlinx.coroutines.flow.internal.e.b(interfaceC2282i).p(u3);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> g(@l3.d kotlinx.coroutines.channels.F<? extends T> f4) {
        return new C2278e(f4, false, null, 0, null, 28, null);
    }
}
