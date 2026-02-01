package kotlinx.coroutines.debug.internal;

import X2.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.H0;
import kotlin.W;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.m;
import kotlin.sequences.o;
import kotlin.sequences.q;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private final l f53432a;

    /* renamed from: b, reason: collision with root package name */
    @W2.f
    public final long f53433b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final WeakReference<kotlin.coroutines.f> f53434c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private String f53435d = g.f53448a;

    /* renamed from: e, reason: collision with root package name */
    @W2.f
    @l3.e
    public Thread f53436e;

    /* renamed from: f, reason: collision with root package name */
    @l3.e
    private WeakReference<kotlin.coroutines.jvm.internal.c> f53437f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends RestrictedSuspendLambda implements p<o<? super StackTraceElement>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: G, reason: collision with root package name */
        int f53438G;

        /* renamed from: H, reason: collision with root package name */
        private /* synthetic */ Object f53439H;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ l f53441J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f53441J = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f53438G;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                o oVar = (o) this.f53439H;
                f fVar = f.this;
                kotlin.coroutines.jvm.internal.c q4 = this.f53441J.q();
                this.f53438G = 1;
                if (fVar.k(oVar, q4, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d o<? super StackTraceElement> oVar, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(oVar, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(this.f53441J, cVar);
            aVar.f53439H = obj;
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {80}, m = "yieldFrames", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53442H;

        /* renamed from: I, reason: collision with root package name */
        Object f53443I;

        /* renamed from: J, reason: collision with root package name */
        Object f53444J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f53445K;

        /* renamed from: M, reason: collision with root package name */
        int f53447M;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53445K = obj;
            this.f53447M |= Integer.MIN_VALUE;
            return f.this.k(null, null, this);
        }
    }

    public f(@l3.e kotlin.coroutines.f fVar, @l3.e l lVar, long j4) {
        this.f53432a = lVar;
        this.f53433b = j4;
        this.f53434c = new WeakReference<>(fVar);
    }

    private final List<StackTraceElement> b() {
        m b4;
        List<StackTraceElement> c32;
        List<StackTraceElement> H3;
        l lVar = this.f53432a;
        if (lVar == null) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        b4 = q.b(new a(lVar, null));
        c32 = SequencesKt___SequencesKt.c3(b4);
        return c32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004a -> B:11:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(kotlin.sequences.o<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.c r7, kotlin.coroutines.c<? super kotlin.H0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.f.b
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.f$b r0 = (kotlinx.coroutines.debug.internal.f.b) r0
            int r1 = r0.f53447M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53447M = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.f$b r0 = new kotlinx.coroutines.debug.internal.f$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53445K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53447M
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f53444J
            kotlin.coroutines.jvm.internal.c r6 = (kotlin.coroutines.jvm.internal.c) r6
            java.lang.Object r7 = r0.f53443I
            kotlin.sequences.o r7 = (kotlin.sequences.o) r7
            java.lang.Object r2 = r0.f53442H
            kotlinx.coroutines.debug.internal.f r2 = (kotlinx.coroutines.debug.internal.f) r2
            kotlin.W.n(r8)
            goto L5e
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.W.n(r8)
            r2 = r5
        L41:
            if (r7 != 0) goto L46
            kotlin.H0 r6 = kotlin.H0.f51801a
            return r6
        L46:
            java.lang.StackTraceElement r8 = r7.I()
            if (r8 == 0) goto L61
            r0.f53442H = r2
            r0.f53443I = r6
            r0.f53444J = r7
            r0.f53447M = r3
            java.lang.Object r8 = r6.b(r8, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r4 = r7
            r7 = r6
            r6 = r4
        L5e:
            r4 = r7
            r7 = r6
            r6 = r4
        L61:
            kotlin.coroutines.jvm.internal.c r7 = r7.q()
            if (r7 == 0) goto L68
            goto L41
        L68:
            kotlin.H0 r6 = kotlin.H0.f51801a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.f.k(kotlin.sequences.o, kotlin.coroutines.jvm.internal.c, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.e
    public final kotlin.coroutines.f c() {
        return this.f53434c.get();
    }

    @l3.e
    public final l d() {
        return this.f53432a;
    }

    @l3.d
    public final List<StackTraceElement> e() {
        return b();
    }

    @l3.e
    public final kotlin.coroutines.jvm.internal.c f() {
        WeakReference<kotlin.coroutines.jvm.internal.c> weakReference = this.f53437f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @l3.d
    public final String g() {
        return this.f53435d;
    }

    @l3.d
    public final List<StackTraceElement> h() {
        List<StackTraceElement> H3;
        kotlin.coroutines.jvm.internal.c f4 = f();
        if (f4 == null) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList();
        while (f4 != null) {
            StackTraceElement I3 = f4.I();
            if (I3 != null) {
                arrayList.add(I3);
            }
            f4 = f4.q();
        }
        return arrayList;
    }

    public final void i(@l3.e kotlin.coroutines.jvm.internal.c cVar) {
        WeakReference<kotlin.coroutines.jvm.internal.c> weakReference;
        if (cVar != null) {
            weakReference = new WeakReference<>(cVar);
        } else {
            weakReference = null;
        }
        this.f53437f = weakReference;
    }

    public final void j(@l3.d String str, @l3.d kotlin.coroutines.c<?> cVar) {
        kotlin.coroutines.jvm.internal.c cVar2;
        if (F.g(this.f53435d, str) && F.g(str, g.f53450c) && f() != null) {
            return;
        }
        this.f53435d = str;
        Thread thread = null;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            cVar2 = (kotlin.coroutines.jvm.internal.c) cVar;
        } else {
            cVar2 = null;
        }
        i(cVar2);
        if (F.g(str, g.f53449b)) {
            thread = Thread.currentThread();
        }
        this.f53436e = thread;
    }

    @l3.d
    public String toString() {
        return "DebugCoroutineInfo(state=" + g() + ",context=" + c() + ')';
    }
}
