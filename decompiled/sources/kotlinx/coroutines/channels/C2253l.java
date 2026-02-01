package kotlinx.coroutines.channels;

import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.AbstractC2234a;
import kotlinx.coroutines.C0;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC2239b1;
import kotlinx.coroutines.O;
import kotlinx.coroutines.S0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V;

/* renamed from: kotlinx.coroutines.channels.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2253l {

    /* renamed from: kotlinx.coroutines.channels.l$a */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements O {
        public a(O.b bVar) {
            super(bVar);
        }

        @Override // kotlinx.coroutines.O
        public void Y0(@l3.d kotlin.coroutines.f fVar, @l3.d Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.channels.l$b */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.l<Throwable, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ F<E> f53107F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(F<? extends E> f4) {
            super(1);
            this.f53107F = f4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.e Throwable th) {
            r.b(this.f53107F, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [E] */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {53, 54}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.l$c */
    /* loaded from: classes2.dex */
    public static final class c<E> extends SuspendLambda implements X2.p<D<? super E>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f53108I;

        /* renamed from: J, reason: collision with root package name */
        int f53109J;

        /* renamed from: K, reason: collision with root package name */
        private /* synthetic */ Object f53110K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ F<E> f53111L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(F<? extends E> f4, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f53111L = f4;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0062 -> B:6:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r6.f53109J
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r6.f53108I
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r4 = r6.f53110K
                kotlinx.coroutines.channels.D r4 = (kotlinx.coroutines.channels.D) r4
                kotlin.W.n(r7)
            L19:
                r7 = r4
                goto L3c
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L23:
                java.lang.Object r1 = r6.f53108I
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r4 = r6.f53110K
                kotlinx.coroutines.channels.D r4 = (kotlinx.coroutines.channels.D) r4
                kotlin.W.n(r7)
                goto L4c
            L2f:
                kotlin.W.n(r7)
                java.lang.Object r7 = r6.f53110K
                kotlinx.coroutines.channels.D r7 = (kotlinx.coroutines.channels.D) r7
                kotlinx.coroutines.channels.F<E> r1 = r6.f53111L
                kotlinx.coroutines.channels.o r1 = r1.iterator()
            L3c:
                r6.f53110K = r7
                r6.f53108I = r1
                r6.f53109J = r3
                java.lang.Object r4 = r1.a(r6)
                if (r4 != r0) goto L49
                return r0
            L49:
                r5 = r4
                r4 = r7
                r7 = r5
            L4c:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L65
                java.lang.Object r7 = r1.next()
                r6.f53110K = r4
                r6.f53108I = r1
                r6.f53109J = r2
                java.lang.Object r7 = r4.U(r7, r6)
                if (r7 != r0) goto L19
                return r0
            L65:
                kotlin.H0 r7 = kotlin.H0.f51801a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C2253l.c.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d D<? super E> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((c) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            c cVar2 = new c(this.f53111L, cVar);
            cVar2.f53110K = obj;
            return cVar2;
        }
    }

    @InterfaceC2239b1
    @l3.d
    public static final <E> InterfaceC2250i<E> a(@l3.d U u3, @l3.d kotlin.coroutines.f fVar, int i4, @l3.d CoroutineStart coroutineStart, @l3.e X2.l<? super Throwable, H0> lVar, @InterfaceC2084c @l3.d X2.p<? super D<? super E>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        C2252k c2252k;
        kotlin.coroutines.f e4 = kotlinx.coroutines.M.e(u3, fVar);
        InterfaceC2250i a4 = C2251j.a(i4);
        if (coroutineStart.g()) {
            c2252k = new z(e4, a4, pVar);
        } else {
            c2252k = new C2252k(e4, a4, true);
        }
        if (lVar != null) {
            ((S0) c2252k).V(lVar);
        }
        ((AbstractC2234a) c2252k).I1(coroutineStart, c2252k, pVar);
        return (InterfaceC2250i<E>) c2252k;
    }

    @InterfaceC2239b1
    @l3.d
    public static final <E> InterfaceC2250i<E> b(@l3.d F<? extends E> f4, int i4, @l3.d CoroutineStart coroutineStart) {
        return c(V.m(V.m(C0.f52916E, C2322k0.g()), new a(O.f52951v)), null, i4, coroutineStart, new b(f4), new c(f4, null), 1, null);
    }

    public static /* synthetic */ InterfaceC2250i c(U u3, kotlin.coroutines.f fVar, int i4, CoroutineStart coroutineStart, X2.l lVar, X2.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            fVar = EmptyCoroutineContext.f52041E;
        }
        kotlin.coroutines.f fVar2 = fVar;
        if ((i5 & 2) != 0) {
            i4 = 1;
        }
        int i6 = i4;
        if ((i5 & 4) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i5 & 8) != 0) {
            lVar = null;
        }
        return a(u3, fVar2, i6, coroutineStart2, lVar, pVar);
    }

    public static /* synthetic */ InterfaceC2250i d(F f4, int i4, CoroutineStart coroutineStart, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 1;
        }
        if ((i5 & 2) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        return b(f4, i4, coroutineStart);
    }
}
