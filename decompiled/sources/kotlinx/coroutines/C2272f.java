package kotlinx.coroutines;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: kotlinx.coroutines.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2272f {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {54}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.f$a */
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53463H;

        /* renamed from: I, reason: collision with root package name */
        int f53464I;

        /* renamed from: J, reason: collision with root package name */
        int f53465J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f53466K;

        /* renamed from: L, reason: collision with root package name */
        int f53467L;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53466K = obj;
            this.f53467L |= Integer.MIN_VALUE;
            return C2272f.d(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {66}, m = "joinAll", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.f$b */
    /* loaded from: classes2.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f53468H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f53469I;

        /* renamed from: J, reason: collision with root package name */
        int f53470J;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53469I = obj;
            this.f53470J |= Integer.MIN_VALUE;
            return C2272f.c(null, this);
        }
    }

    @l3.e
    public static final <T> Object a(@l3.d Collection<? extends InterfaceC2235a0<? extends T>> collection, @l3.d kotlin.coroutines.c<? super List<? extends T>> cVar) {
        List H3;
        if (collection.isEmpty()) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        Object[] array = collection.toArray(new InterfaceC2235a0[0]);
        if (array != null) {
            return new C2270e((InterfaceC2235a0[]) array).b(cVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @l3.e
    public static final <T> Object b(@l3.d InterfaceC2235a0<? extends T>[] interfaceC2235a0Arr, @l3.d kotlin.coroutines.c<? super List<? extends T>> cVar) {
        List H3;
        if (interfaceC2235a0Arr.length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return new C2270e(interfaceC2235a0Arr).b(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@l3.d java.util.Collection<? extends kotlinx.coroutines.L0> r4, @l3.d kotlin.coroutines.c<? super kotlin.H0> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.C2272f.b
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.f$b r0 = (kotlinx.coroutines.C2272f.b) r0
            int r1 = r0.f53470J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53470J = r1
            goto L18
        L13:
            kotlinx.coroutines.f$b r0 = new kotlinx.coroutines.f$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f53469I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53470J
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f53468H
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.W.n(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.W.n(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.L0 r5 = (kotlinx.coroutines.L0) r5
            r0.f53468H = r4
            r0.f53470J = r3
            java.lang.Object r5 = r5.H(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            kotlin.H0 r4 = kotlin.H0.f51801a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C2272f.c(java.util.Collection, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:10:0x0055). Please report as a decompilation issue!!! */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@l3.d kotlinx.coroutines.L0[] r6, @l3.d kotlin.coroutines.c<? super kotlin.H0> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.C2272f.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.f$a r0 = (kotlinx.coroutines.C2272f.a) r0
            int r1 = r0.f53467L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53467L = r1
            goto L18
        L13:
            kotlinx.coroutines.f$a r0 = new kotlinx.coroutines.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f53466K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53467L
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f53465J
            int r2 = r0.f53464I
            java.lang.Object r4 = r0.f53463H
            kotlinx.coroutines.L0[] r4 = (kotlinx.coroutines.L0[]) r4
            kotlin.W.n(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.W.n(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.f53463H = r7
            r0.f53464I = r2
            r0.f53465J = r6
            r0.f53467L = r3
            java.lang.Object r4 = r4.H(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            kotlin.H0 r6 = kotlin.H0.f51801a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C2272f.d(kotlinx.coroutines.L0[], kotlin.coroutines.c):java.lang.Object");
    }
}
