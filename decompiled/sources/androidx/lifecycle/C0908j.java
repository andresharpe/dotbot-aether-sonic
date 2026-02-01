package androidx.lifecycle;

import kotlin.H0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.o1;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0908j<T> extends N<T> {

    /* renamed from: n, reason: collision with root package name */
    @l3.e
    private C0902d<T> f15643n;

    /* renamed from: o, reason: collision with root package name */
    @l3.e
    private C0913o f15644o;

    /* renamed from: androidx.lifecycle.j$a */
    /* loaded from: classes.dex */
    static final class a extends Lambda implements X2.a<H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C0908j<T> f15645F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C0908j<T> c0908j) {
            super(0);
            this.f15645F = c0908j;
        }

        public final void c() {
            ((C0908j) this.f15645F).f15643n = null;
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0}, l = {235}, m = "clearSource$lifecycle_livedata_ktx_release", n = {"this"}, s = {"L$0"})
    /* renamed from: androidx.lifecycle.j$b */
    /* loaded from: classes.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f15646H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f15647I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ C0908j<T> f15648J;

        /* renamed from: K, reason: collision with root package name */
        int f15649K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0908j<T> c0908j, kotlin.coroutines.c<? super b> cVar) {
            super(cVar);
            this.f15648J = c0908j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f15647I = obj;
            this.f15649K |= Integer.MIN_VALUE;
            return this.f15648J.v(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0, 0, 1}, l = {228, 229}, m = "emitSource$lifecycle_livedata_ktx_release", n = {"this", "source", "this"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: androidx.lifecycle.j$c */
    /* loaded from: classes.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f15650H;

        /* renamed from: I, reason: collision with root package name */
        Object f15651I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f15652J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ C0908j<T> f15653K;

        /* renamed from: L, reason: collision with root package name */
        int f15654L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C0908j<T> c0908j, kotlin.coroutines.c<? super c> cVar) {
            super(cVar);
            this.f15653K = c0908j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f15652J = obj;
            this.f15654L |= Integer.MIN_VALUE;
            return this.f15653K.w(null, this);
        }
    }

    public C0908j(@l3.d kotlin.coroutines.f context, long j4, @l3.d X2.p<? super L<T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> block) {
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(block, "block");
        this.f15643n = new C0902d<>(this, block, j4, kotlinx.coroutines.V.a(C2322k0.e().o1().A(context).A(o1.a((L0) context.a(L0.f52941w)))), new a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.N, androidx.lifecycle.LiveData
    public void m() {
        super.m();
        C0902d<T> c0902d = this.f15643n;
        if (c0902d != null) {
            c0902d.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.N, androidx.lifecycle.LiveData
    public void n() {
        super.n();
        C0902d<T> c0902d = this.f15643n;
        if (c0902d != null) {
            c0902d.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(@l3.d kotlin.coroutines.c<? super kotlin.H0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.C0908j.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.j$b r0 = (androidx.lifecycle.C0908j.b) r0
            int r1 = r0.f15649K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15649K = r1
            goto L18
        L13:
            androidx.lifecycle.j$b r0 = new androidx.lifecycle.j$b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f15647I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f15649K
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f15646H
            androidx.lifecycle.j r0 = (androidx.lifecycle.C0908j) r0
            kotlin.W.n(r5)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.W.n(r5)
            androidx.lifecycle.o r5 = r4.f15644o
            if (r5 == 0) goto L47
            r0.f15646H = r4
            r0.f15649K = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            r5 = 0
            r0.f15644o = r5
            kotlin.H0 r5 = kotlin.H0.f51801a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0908j.v(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(@l3.d androidx.lifecycle.LiveData<T> r6, @l3.d kotlin.coroutines.c<? super kotlinx.coroutines.InterfaceC2328n0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.lifecycle.C0908j.c
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.j$c r0 = (androidx.lifecycle.C0908j.c) r0
            int r1 = r0.f15654L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15654L = r1
            goto L18
        L13:
            androidx.lifecycle.j$c r0 = new androidx.lifecycle.j$c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f15652J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f15654L
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f15650H
            androidx.lifecycle.j r6 = (androidx.lifecycle.C0908j) r6
            kotlin.W.n(r7)
            goto L66
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f15651I
            androidx.lifecycle.LiveData r6 = (androidx.lifecycle.LiveData) r6
            java.lang.Object r2 = r0.f15650H
            androidx.lifecycle.j r2 = (androidx.lifecycle.C0908j) r2
            kotlin.W.n(r7)
            r7 = r6
            r6 = r2
            goto L58
        L46:
            kotlin.W.n(r7)
            r0.f15650H = r5
            r0.f15651I = r6
            r0.f15654L = r4
            java.lang.Object r7 = r5.v(r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r7 = r6
            r6 = r5
        L58:
            r0.f15650H = r6
            r2 = 0
            r0.f15651I = r2
            r0.f15654L = r3
            java.lang.Object r7 = androidx.lifecycle.C0909k.a(r6, r7, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            androidx.lifecycle.o r7 = (androidx.lifecycle.C0913o) r7
            r6.f15644o = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0908j.w(androidx.lifecycle.LiveData, kotlin.coroutines.c):java.lang.Object");
    }

    public /* synthetic */ C0908j(kotlin.coroutines.f fVar, long j4, X2.p pVar, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? EmptyCoroutineContext.f52041E : fVar, (i4 & 2) != 0 ? C0909k.f15658a : j4, pVar);
    }
}
